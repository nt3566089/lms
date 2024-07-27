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
 * The abstract condition-query of m_general.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMGeneralCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMGeneralCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "m_general";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERAL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param generalId The value of generalId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGeneralId_Equal(Long generalId) {
        doSetGeneralId_Equal(generalId);
    }

    protected void doSetGeneralId_Equal(Long generalId) {
        regGeneralId(CK_EQ, generalId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERAL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param generalId The value of generalId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGeneralId_NotEqual(Long generalId) {
        doSetGeneralId_NotEqual(generalId);
    }

    protected void doSetGeneralId_NotEqual(Long generalId) {
        regGeneralId(CK_NES, generalId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERAL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param generalId The value of generalId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGeneralId_GreaterThan(Long generalId) {
        regGeneralId(CK_GT, generalId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERAL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param generalId The value of generalId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGeneralId_LessThan(Long generalId) {
        regGeneralId(CK_LT, generalId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERAL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param generalId The value of generalId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGeneralId_GreaterEqual(Long generalId) {
        regGeneralId(CK_GE, generalId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERAL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param generalId The value of generalId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGeneralId_LessEqual(Long generalId) {
        regGeneralId(CK_LE, generalId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GENERAL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of generalId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of generalId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGeneralId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGeneralId(), "GENERAL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GENERAL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param generalIdList The collection of generalId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralId_InScope(Collection<Long> generalIdList) {
        doSetGeneralId_InScope(generalIdList);
    }

    protected void doSetGeneralId_InScope(Collection<Long> generalIdList) {
        regINS(CK_INS, cTL(generalIdList), xgetCValueGeneralId(), "GENERAL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GENERAL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param generalIdList The collection of generalId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralId_NotInScope(Collection<Long> generalIdList) {
        doSetGeneralId_NotInScope(generalIdList);
    }

    protected void doSetGeneralId_NotInScope(Collection<Long> generalIdList) {
        regINS(CK_NINS, cTL(generalIdList), xgetCValueGeneralId(), "GENERAL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GENERAL_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setGeneralId_IsNull() { regGeneralId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GENERAL_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setGeneralId_IsNotNull() { regGeneralId(CK_ISNN, DOBJ); }

    protected void regGeneralId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGeneralId(), "GENERAL_ID"); }
    protected abstract ConditionValue xgetCValueGeneralId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
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
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
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
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
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
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {VARCHAR(100)}
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
     * CENTER_CD: {VARCHAR(100)}
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
     * CENTER_CD: {VARCHAR(100)}
     * @param centerCd The value of centerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterThan(String centerCd) {
        regCenterCd(CK_GT, fRES(centerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {VARCHAR(100)}
     * @param centerCd The value of centerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessThan(String centerCd) {
        regCenterCd(CK_LT, fRES(centerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {VARCHAR(100)}
     * @param centerCd The value of centerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterEqual(String centerCd) {
        regCenterCd(CK_GE, fRES(centerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {VARCHAR(100)}
     * @param centerCd The value of centerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessEqual(String centerCd) {
        regCenterCd(CK_LE, fRES(centerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {VARCHAR(100)}
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
     * CENTER_CD: {VARCHAR(100)}
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
     * CENTER_CD: {VARCHAR(100)} <br>
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
     * CENTER_CD: {VARCHAR(100)}
     * @param centerCd The value of centerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterCd_NotLikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {VARCHAR(100)}
     * @param centerCd The value of centerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_PrefixSearch(String centerCd) {
        setCenterCd_LikeSearch(centerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {VARCHAR(100)}
     */
    public void setCenterCd_IsNull() { regCenterCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {VARCHAR(100)}
     */
    public void setCenterCd_IsNullOrEmpty() { regCenterCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {VARCHAR(100)}
     */
    public void setCenterCd_IsNotNull() { regCenterCd(CK_ISNN, DOBJ); }

    protected void regCenterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterCd(), "CENTER_CD"); }
    protected abstract ConditionValue xgetCValueCenterCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)}
     * @param generalMasterType The value of generalMasterType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralMasterType_Equal(String generalMasterType) {
        doSetGeneralMasterType_Equal(fRES(generalMasterType));
    }

    protected void doSetGeneralMasterType_Equal(String generalMasterType) {
        regGeneralMasterType(CK_EQ, generalMasterType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)}
     * @param generalMasterType The value of generalMasterType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralMasterType_NotEqual(String generalMasterType) {
        doSetGeneralMasterType_NotEqual(fRES(generalMasterType));
    }

    protected void doSetGeneralMasterType_NotEqual(String generalMasterType) {
        regGeneralMasterType(CK_NES, generalMasterType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)}
     * @param generalMasterType The value of generalMasterType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralMasterType_GreaterThan(String generalMasterType) {
        regGeneralMasterType(CK_GT, fRES(generalMasterType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)}
     * @param generalMasterType The value of generalMasterType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralMasterType_LessThan(String generalMasterType) {
        regGeneralMasterType(CK_LT, fRES(generalMasterType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)}
     * @param generalMasterType The value of generalMasterType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralMasterType_GreaterEqual(String generalMasterType) {
        regGeneralMasterType(CK_GE, fRES(generalMasterType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)}
     * @param generalMasterType The value of generalMasterType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralMasterType_LessEqual(String generalMasterType) {
        regGeneralMasterType(CK_LE, fRES(generalMasterType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)}
     * @param generalMasterTypeList The collection of generalMasterType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralMasterType_InScope(Collection<String> generalMasterTypeList) {
        doSetGeneralMasterType_InScope(generalMasterTypeList);
    }

    protected void doSetGeneralMasterType_InScope(Collection<String> generalMasterTypeList) {
        regINS(CK_INS, cTL(generalMasterTypeList), xgetCValueGeneralMasterType(), "GENERAL_MASTER_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)}
     * @param generalMasterTypeList The collection of generalMasterType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralMasterType_NotInScope(Collection<String> generalMasterTypeList) {
        doSetGeneralMasterType_NotInScope(generalMasterTypeList);
    }

    protected void doSetGeneralMasterType_NotInScope(Collection<String> generalMasterTypeList) {
        regINS(CK_NINS, cTL(generalMasterTypeList), xgetCValueGeneralMasterType(), "GENERAL_MASTER_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)} <br>
     * <pre>e.g. setGeneralMasterType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param generalMasterType The value of generalMasterType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGeneralMasterType_LikeSearch(String generalMasterType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(generalMasterType), xgetCValueGeneralMasterType(), "GENERAL_MASTER_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)}
     * @param generalMasterType The value of generalMasterType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGeneralMasterType_NotLikeSearch(String generalMasterType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(generalMasterType), xgetCValueGeneralMasterType(), "GENERAL_MASTER_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)}
     * @param generalMasterType The value of generalMasterType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralMasterType_PrefixSearch(String generalMasterType) {
        setGeneralMasterType_LikeSearch(generalMasterType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)}
     */
    public void setGeneralMasterType_IsNull() { regGeneralMasterType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)}
     */
    public void setGeneralMasterType_IsNullOrEmpty() { regGeneralMasterType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)}
     */
    public void setGeneralMasterType_IsNotNull() { regGeneralMasterType(CK_ISNN, DOBJ); }

    protected void regGeneralMasterType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGeneralMasterType(), "GENERAL_MASTER_TYPE"); }
    protected abstract ConditionValue xgetCValueGeneralMasterType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_MASTER_TYPE_NM: {VARCHAR(60)}
     * @param generalMasterTypeNm The value of generalMasterTypeNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralMasterTypeNm_Equal(String generalMasterTypeNm) {
        doSetGeneralMasterTypeNm_Equal(fRES(generalMasterTypeNm));
    }

    protected void doSetGeneralMasterTypeNm_Equal(String generalMasterTypeNm) {
        regGeneralMasterTypeNm(CK_EQ, generalMasterTypeNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_MASTER_TYPE_NM: {VARCHAR(60)}
     * @param generalMasterTypeNm The value of generalMasterTypeNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralMasterTypeNm_NotEqual(String generalMasterTypeNm) {
        doSetGeneralMasterTypeNm_NotEqual(fRES(generalMasterTypeNm));
    }

    protected void doSetGeneralMasterTypeNm_NotEqual(String generalMasterTypeNm) {
        regGeneralMasterTypeNm(CK_NES, generalMasterTypeNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_MASTER_TYPE_NM: {VARCHAR(60)}
     * @param generalMasterTypeNm The value of generalMasterTypeNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralMasterTypeNm_GreaterThan(String generalMasterTypeNm) {
        regGeneralMasterTypeNm(CK_GT, fRES(generalMasterTypeNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_MASTER_TYPE_NM: {VARCHAR(60)}
     * @param generalMasterTypeNm The value of generalMasterTypeNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralMasterTypeNm_LessThan(String generalMasterTypeNm) {
        regGeneralMasterTypeNm(CK_LT, fRES(generalMasterTypeNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_MASTER_TYPE_NM: {VARCHAR(60)}
     * @param generalMasterTypeNm The value of generalMasterTypeNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralMasterTypeNm_GreaterEqual(String generalMasterTypeNm) {
        regGeneralMasterTypeNm(CK_GE, fRES(generalMasterTypeNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_MASTER_TYPE_NM: {VARCHAR(60)}
     * @param generalMasterTypeNm The value of generalMasterTypeNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralMasterTypeNm_LessEqual(String generalMasterTypeNm) {
        regGeneralMasterTypeNm(CK_LE, fRES(generalMasterTypeNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GENERAL_MASTER_TYPE_NM: {VARCHAR(60)}
     * @param generalMasterTypeNmList The collection of generalMasterTypeNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralMasterTypeNm_InScope(Collection<String> generalMasterTypeNmList) {
        doSetGeneralMasterTypeNm_InScope(generalMasterTypeNmList);
    }

    protected void doSetGeneralMasterTypeNm_InScope(Collection<String> generalMasterTypeNmList) {
        regINS(CK_INS, cTL(generalMasterTypeNmList), xgetCValueGeneralMasterTypeNm(), "GENERAL_MASTER_TYPE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GENERAL_MASTER_TYPE_NM: {VARCHAR(60)}
     * @param generalMasterTypeNmList The collection of generalMasterTypeNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralMasterTypeNm_NotInScope(Collection<String> generalMasterTypeNmList) {
        doSetGeneralMasterTypeNm_NotInScope(generalMasterTypeNmList);
    }

    protected void doSetGeneralMasterTypeNm_NotInScope(Collection<String> generalMasterTypeNmList) {
        regINS(CK_NINS, cTL(generalMasterTypeNmList), xgetCValueGeneralMasterTypeNm(), "GENERAL_MASTER_TYPE_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERAL_MASTER_TYPE_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setGeneralMasterTypeNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param generalMasterTypeNm The value of generalMasterTypeNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGeneralMasterTypeNm_LikeSearch(String generalMasterTypeNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(generalMasterTypeNm), xgetCValueGeneralMasterTypeNm(), "GENERAL_MASTER_TYPE_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERAL_MASTER_TYPE_NM: {VARCHAR(60)}
     * @param generalMasterTypeNm The value of generalMasterTypeNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGeneralMasterTypeNm_NotLikeSearch(String generalMasterTypeNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(generalMasterTypeNm), xgetCValueGeneralMasterTypeNm(), "GENERAL_MASTER_TYPE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERAL_MASTER_TYPE_NM: {VARCHAR(60)}
     * @param generalMasterTypeNm The value of generalMasterTypeNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralMasterTypeNm_PrefixSearch(String generalMasterTypeNm) {
        setGeneralMasterTypeNm_LikeSearch(generalMasterTypeNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GENERAL_MASTER_TYPE_NM: {VARCHAR(60)}
     */
    public void setGeneralMasterTypeNm_IsNull() { regGeneralMasterTypeNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GENERAL_MASTER_TYPE_NM: {VARCHAR(60)}
     */
    public void setGeneralMasterTypeNm_IsNullOrEmpty() { regGeneralMasterTypeNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GENERAL_MASTER_TYPE_NM: {VARCHAR(60)}
     */
    public void setGeneralMasterTypeNm_IsNotNull() { regGeneralMasterTypeNm(CK_ISNN, DOBJ); }

    protected void regGeneralMasterTypeNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGeneralMasterTypeNm(), "GENERAL_MASTER_TYPE_NM"); }
    protected abstract ConditionValue xgetCValueGeneralMasterTypeNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_CD: {+UQ, VARCHAR(30)}
     * @param generalCd The value of generalCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralCd_Equal(String generalCd) {
        doSetGeneralCd_Equal(fRES(generalCd));
    }

    protected void doSetGeneralCd_Equal(String generalCd) {
        regGeneralCd(CK_EQ, generalCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_CD: {+UQ, VARCHAR(30)}
     * @param generalCd The value of generalCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralCd_NotEqual(String generalCd) {
        doSetGeneralCd_NotEqual(fRES(generalCd));
    }

    protected void doSetGeneralCd_NotEqual(String generalCd) {
        regGeneralCd(CK_NES, generalCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_CD: {+UQ, VARCHAR(30)}
     * @param generalCd The value of generalCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralCd_GreaterThan(String generalCd) {
        regGeneralCd(CK_GT, fRES(generalCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_CD: {+UQ, VARCHAR(30)}
     * @param generalCd The value of generalCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralCd_LessThan(String generalCd) {
        regGeneralCd(CK_LT, fRES(generalCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_CD: {+UQ, VARCHAR(30)}
     * @param generalCd The value of generalCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralCd_GreaterEqual(String generalCd) {
        regGeneralCd(CK_GE, fRES(generalCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_CD: {+UQ, VARCHAR(30)}
     * @param generalCd The value of generalCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralCd_LessEqual(String generalCd) {
        regGeneralCd(CK_LE, fRES(generalCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GENERAL_CD: {+UQ, VARCHAR(30)}
     * @param generalCdList The collection of generalCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralCd_InScope(Collection<String> generalCdList) {
        doSetGeneralCd_InScope(generalCdList);
    }

    protected void doSetGeneralCd_InScope(Collection<String> generalCdList) {
        regINS(CK_INS, cTL(generalCdList), xgetCValueGeneralCd(), "GENERAL_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GENERAL_CD: {+UQ, VARCHAR(30)}
     * @param generalCdList The collection of generalCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralCd_NotInScope(Collection<String> generalCdList) {
        doSetGeneralCd_NotInScope(generalCdList);
    }

    protected void doSetGeneralCd_NotInScope(Collection<String> generalCdList) {
        regINS(CK_NINS, cTL(generalCdList), xgetCValueGeneralCd(), "GENERAL_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERAL_CD: {+UQ, VARCHAR(30)} <br>
     * <pre>e.g. setGeneralCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param generalCd The value of generalCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGeneralCd_LikeSearch(String generalCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(generalCd), xgetCValueGeneralCd(), "GENERAL_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERAL_CD: {+UQ, VARCHAR(30)}
     * @param generalCd The value of generalCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGeneralCd_NotLikeSearch(String generalCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(generalCd), xgetCValueGeneralCd(), "GENERAL_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERAL_CD: {+UQ, VARCHAR(30)}
     * @param generalCd The value of generalCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralCd_PrefixSearch(String generalCd) {
        setGeneralCd_LikeSearch(generalCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GENERAL_CD: {+UQ, VARCHAR(30)}
     */
    public void setGeneralCd_IsNull() { regGeneralCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GENERAL_CD: {+UQ, VARCHAR(30)}
     */
    public void setGeneralCd_IsNullOrEmpty() { regGeneralCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GENERAL_CD: {+UQ, VARCHAR(30)}
     */
    public void setGeneralCd_IsNotNull() { regGeneralCd(CK_ISNN, DOBJ); }

    protected void regGeneralCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGeneralCd(), "GENERAL_CD"); }
    protected abstract ConditionValue xgetCValueGeneralCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_NM: {VARCHAR(60)}
     * @param generalNm The value of generalNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralNm_Equal(String generalNm) {
        doSetGeneralNm_Equal(fRES(generalNm));
    }

    protected void doSetGeneralNm_Equal(String generalNm) {
        regGeneralNm(CK_EQ, generalNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_NM: {VARCHAR(60)}
     * @param generalNm The value of generalNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralNm_NotEqual(String generalNm) {
        doSetGeneralNm_NotEqual(fRES(generalNm));
    }

    protected void doSetGeneralNm_NotEqual(String generalNm) {
        regGeneralNm(CK_NES, generalNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_NM: {VARCHAR(60)}
     * @param generalNm The value of generalNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralNm_GreaterThan(String generalNm) {
        regGeneralNm(CK_GT, fRES(generalNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_NM: {VARCHAR(60)}
     * @param generalNm The value of generalNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralNm_LessThan(String generalNm) {
        regGeneralNm(CK_LT, fRES(generalNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_NM: {VARCHAR(60)}
     * @param generalNm The value of generalNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralNm_GreaterEqual(String generalNm) {
        regGeneralNm(CK_GE, fRES(generalNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_NM: {VARCHAR(60)}
     * @param generalNm The value of generalNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralNm_LessEqual(String generalNm) {
        regGeneralNm(CK_LE, fRES(generalNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GENERAL_NM: {VARCHAR(60)}
     * @param generalNmList The collection of generalNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralNm_InScope(Collection<String> generalNmList) {
        doSetGeneralNm_InScope(generalNmList);
    }

    protected void doSetGeneralNm_InScope(Collection<String> generalNmList) {
        regINS(CK_INS, cTL(generalNmList), xgetCValueGeneralNm(), "GENERAL_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GENERAL_NM: {VARCHAR(60)}
     * @param generalNmList The collection of generalNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralNm_NotInScope(Collection<String> generalNmList) {
        doSetGeneralNm_NotInScope(generalNmList);
    }

    protected void doSetGeneralNm_NotInScope(Collection<String> generalNmList) {
        regINS(CK_NINS, cTL(generalNmList), xgetCValueGeneralNm(), "GENERAL_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERAL_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setGeneralNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param generalNm The value of generalNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGeneralNm_LikeSearch(String generalNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(generalNm), xgetCValueGeneralNm(), "GENERAL_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERAL_NM: {VARCHAR(60)}
     * @param generalNm The value of generalNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGeneralNm_NotLikeSearch(String generalNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(generalNm), xgetCValueGeneralNm(), "GENERAL_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERAL_NM: {VARCHAR(60)}
     * @param generalNm The value of generalNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralNm_PrefixSearch(String generalNm) {
        setGeneralNm_LikeSearch(generalNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GENERAL_NM: {VARCHAR(60)}
     */
    public void setGeneralNm_IsNull() { regGeneralNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GENERAL_NM: {VARCHAR(60)}
     */
    public void setGeneralNm_IsNullOrEmpty() { regGeneralNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GENERAL_NM: {VARCHAR(60)}
     */
    public void setGeneralNm_IsNotNull() { regGeneralNm(CK_ISNN, DOBJ); }

    protected void regGeneralNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGeneralNm(), "GENERAL_NM"); }
    protected abstract ConditionValue xgetCValueGeneralNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_ABBR: {VARCHAR(60)}
     * @param generalAbbr The value of generalAbbr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralAbbr_Equal(String generalAbbr) {
        doSetGeneralAbbr_Equal(fRES(generalAbbr));
    }

    protected void doSetGeneralAbbr_Equal(String generalAbbr) {
        regGeneralAbbr(CK_EQ, generalAbbr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_ABBR: {VARCHAR(60)}
     * @param generalAbbr The value of generalAbbr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralAbbr_NotEqual(String generalAbbr) {
        doSetGeneralAbbr_NotEqual(fRES(generalAbbr));
    }

    protected void doSetGeneralAbbr_NotEqual(String generalAbbr) {
        regGeneralAbbr(CK_NES, generalAbbr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_ABBR: {VARCHAR(60)}
     * @param generalAbbr The value of generalAbbr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralAbbr_GreaterThan(String generalAbbr) {
        regGeneralAbbr(CK_GT, fRES(generalAbbr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_ABBR: {VARCHAR(60)}
     * @param generalAbbr The value of generalAbbr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralAbbr_LessThan(String generalAbbr) {
        regGeneralAbbr(CK_LT, fRES(generalAbbr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_ABBR: {VARCHAR(60)}
     * @param generalAbbr The value of generalAbbr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralAbbr_GreaterEqual(String generalAbbr) {
        regGeneralAbbr(CK_GE, fRES(generalAbbr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERAL_ABBR: {VARCHAR(60)}
     * @param generalAbbr The value of generalAbbr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralAbbr_LessEqual(String generalAbbr) {
        regGeneralAbbr(CK_LE, fRES(generalAbbr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GENERAL_ABBR: {VARCHAR(60)}
     * @param generalAbbrList The collection of generalAbbr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralAbbr_InScope(Collection<String> generalAbbrList) {
        doSetGeneralAbbr_InScope(generalAbbrList);
    }

    protected void doSetGeneralAbbr_InScope(Collection<String> generalAbbrList) {
        regINS(CK_INS, cTL(generalAbbrList), xgetCValueGeneralAbbr(), "GENERAL_ABBR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GENERAL_ABBR: {VARCHAR(60)}
     * @param generalAbbrList The collection of generalAbbr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralAbbr_NotInScope(Collection<String> generalAbbrList) {
        doSetGeneralAbbr_NotInScope(generalAbbrList);
    }

    protected void doSetGeneralAbbr_NotInScope(Collection<String> generalAbbrList) {
        regINS(CK_NINS, cTL(generalAbbrList), xgetCValueGeneralAbbr(), "GENERAL_ABBR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERAL_ABBR: {VARCHAR(60)} <br>
     * <pre>e.g. setGeneralAbbr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param generalAbbr The value of generalAbbr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGeneralAbbr_LikeSearch(String generalAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(generalAbbr), xgetCValueGeneralAbbr(), "GENERAL_ABBR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERAL_ABBR: {VARCHAR(60)}
     * @param generalAbbr The value of generalAbbr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGeneralAbbr_NotLikeSearch(String generalAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(generalAbbr), xgetCValueGeneralAbbr(), "GENERAL_ABBR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERAL_ABBR: {VARCHAR(60)}
     * @param generalAbbr The value of generalAbbr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGeneralAbbr_PrefixSearch(String generalAbbr) {
        setGeneralAbbr_LikeSearch(generalAbbr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GENERAL_ABBR: {VARCHAR(60)}
     */
    public void setGeneralAbbr_IsNull() { regGeneralAbbr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GENERAL_ABBR: {VARCHAR(60)}
     */
    public void setGeneralAbbr_IsNullOrEmpty() { regGeneralAbbr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GENERAL_ABBR: {VARCHAR(60)}
     */
    public void setGeneralAbbr_IsNotNull() { regGeneralAbbr(CK_ISNN, DOBJ); }

    protected void regGeneralAbbr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGeneralAbbr(), "GENERAL_ABBR"); }
    protected abstract ConditionValue xgetCValueGeneralAbbr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER1: {VARCHAR(100)}
     * @param character1 The value of character1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter1_Equal(String character1) {
        doSetCharacter1_Equal(fRES(character1));
    }

    protected void doSetCharacter1_Equal(String character1) {
        regCharacter1(CK_EQ, character1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER1: {VARCHAR(100)}
     * @param character1 The value of character1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter1_NotEqual(String character1) {
        doSetCharacter1_NotEqual(fRES(character1));
    }

    protected void doSetCharacter1_NotEqual(String character1) {
        regCharacter1(CK_NES, character1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER1: {VARCHAR(100)}
     * @param character1 The value of character1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter1_GreaterThan(String character1) {
        regCharacter1(CK_GT, fRES(character1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER1: {VARCHAR(100)}
     * @param character1 The value of character1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter1_LessThan(String character1) {
        regCharacter1(CK_LT, fRES(character1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER1: {VARCHAR(100)}
     * @param character1 The value of character1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter1_GreaterEqual(String character1) {
        regCharacter1(CK_GE, fRES(character1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER1: {VARCHAR(100)}
     * @param character1 The value of character1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter1_LessEqual(String character1) {
        regCharacter1(CK_LE, fRES(character1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER1: {VARCHAR(100)}
     * @param character1List The collection of character1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter1_InScope(Collection<String> character1List) {
        doSetCharacter1_InScope(character1List);
    }

    protected void doSetCharacter1_InScope(Collection<String> character1List) {
        regINS(CK_INS, cTL(character1List), xgetCValueCharacter1(), "CHARACTER1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER1: {VARCHAR(100)}
     * @param character1List The collection of character1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter1_NotInScope(Collection<String> character1List) {
        doSetCharacter1_NotInScope(character1List);
    }

    protected void doSetCharacter1_NotInScope(Collection<String> character1List) {
        regINS(CK_NINS, cTL(character1List), xgetCValueCharacter1(), "CHARACTER1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER1: {VARCHAR(100)} <br>
     * <pre>e.g. setCharacter1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param character1 The value of character1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCharacter1_LikeSearch(String character1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(character1), xgetCValueCharacter1(), "CHARACTER1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER1: {VARCHAR(100)}
     * @param character1 The value of character1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCharacter1_NotLikeSearch(String character1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(character1), xgetCValueCharacter1(), "CHARACTER1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER1: {VARCHAR(100)}
     * @param character1 The value of character1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter1_PrefixSearch(String character1) {
        setCharacter1_LikeSearch(character1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHARACTER1: {VARCHAR(100)}
     */
    public void setCharacter1_IsNull() { regCharacter1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CHARACTER1: {VARCHAR(100)}
     */
    public void setCharacter1_IsNullOrEmpty() { regCharacter1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHARACTER1: {VARCHAR(100)}
     */
    public void setCharacter1_IsNotNull() { regCharacter1(CK_ISNN, DOBJ); }

    protected void regCharacter1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCharacter1(), "CHARACTER1"); }
    protected abstract ConditionValue xgetCValueCharacter1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER2: {VARCHAR(100)}
     * @param character2 The value of character2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter2_Equal(String character2) {
        doSetCharacter2_Equal(fRES(character2));
    }

    protected void doSetCharacter2_Equal(String character2) {
        regCharacter2(CK_EQ, character2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER2: {VARCHAR(100)}
     * @param character2 The value of character2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter2_NotEqual(String character2) {
        doSetCharacter2_NotEqual(fRES(character2));
    }

    protected void doSetCharacter2_NotEqual(String character2) {
        regCharacter2(CK_NES, character2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER2: {VARCHAR(100)}
     * @param character2 The value of character2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter2_GreaterThan(String character2) {
        regCharacter2(CK_GT, fRES(character2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER2: {VARCHAR(100)}
     * @param character2 The value of character2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter2_LessThan(String character2) {
        regCharacter2(CK_LT, fRES(character2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER2: {VARCHAR(100)}
     * @param character2 The value of character2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter2_GreaterEqual(String character2) {
        regCharacter2(CK_GE, fRES(character2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER2: {VARCHAR(100)}
     * @param character2 The value of character2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter2_LessEqual(String character2) {
        regCharacter2(CK_LE, fRES(character2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER2: {VARCHAR(100)}
     * @param character2List The collection of character2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter2_InScope(Collection<String> character2List) {
        doSetCharacter2_InScope(character2List);
    }

    protected void doSetCharacter2_InScope(Collection<String> character2List) {
        regINS(CK_INS, cTL(character2List), xgetCValueCharacter2(), "CHARACTER2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER2: {VARCHAR(100)}
     * @param character2List The collection of character2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter2_NotInScope(Collection<String> character2List) {
        doSetCharacter2_NotInScope(character2List);
    }

    protected void doSetCharacter2_NotInScope(Collection<String> character2List) {
        regINS(CK_NINS, cTL(character2List), xgetCValueCharacter2(), "CHARACTER2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER2: {VARCHAR(100)} <br>
     * <pre>e.g. setCharacter2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param character2 The value of character2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCharacter2_LikeSearch(String character2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(character2), xgetCValueCharacter2(), "CHARACTER2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER2: {VARCHAR(100)}
     * @param character2 The value of character2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCharacter2_NotLikeSearch(String character2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(character2), xgetCValueCharacter2(), "CHARACTER2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER2: {VARCHAR(100)}
     * @param character2 The value of character2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter2_PrefixSearch(String character2) {
        setCharacter2_LikeSearch(character2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHARACTER2: {VARCHAR(100)}
     */
    public void setCharacter2_IsNull() { regCharacter2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CHARACTER2: {VARCHAR(100)}
     */
    public void setCharacter2_IsNullOrEmpty() { regCharacter2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHARACTER2: {VARCHAR(100)}
     */
    public void setCharacter2_IsNotNull() { regCharacter2(CK_ISNN, DOBJ); }

    protected void regCharacter2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCharacter2(), "CHARACTER2"); }
    protected abstract ConditionValue xgetCValueCharacter2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER3: {VARCHAR(100)}
     * @param character3 The value of character3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter3_Equal(String character3) {
        doSetCharacter3_Equal(fRES(character3));
    }

    protected void doSetCharacter3_Equal(String character3) {
        regCharacter3(CK_EQ, character3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER3: {VARCHAR(100)}
     * @param character3 The value of character3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter3_NotEqual(String character3) {
        doSetCharacter3_NotEqual(fRES(character3));
    }

    protected void doSetCharacter3_NotEqual(String character3) {
        regCharacter3(CK_NES, character3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER3: {VARCHAR(100)}
     * @param character3 The value of character3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter3_GreaterThan(String character3) {
        regCharacter3(CK_GT, fRES(character3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER3: {VARCHAR(100)}
     * @param character3 The value of character3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter3_LessThan(String character3) {
        regCharacter3(CK_LT, fRES(character3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER3: {VARCHAR(100)}
     * @param character3 The value of character3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter3_GreaterEqual(String character3) {
        regCharacter3(CK_GE, fRES(character3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER3: {VARCHAR(100)}
     * @param character3 The value of character3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter3_LessEqual(String character3) {
        regCharacter3(CK_LE, fRES(character3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER3: {VARCHAR(100)}
     * @param character3List The collection of character3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter3_InScope(Collection<String> character3List) {
        doSetCharacter3_InScope(character3List);
    }

    protected void doSetCharacter3_InScope(Collection<String> character3List) {
        regINS(CK_INS, cTL(character3List), xgetCValueCharacter3(), "CHARACTER3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER3: {VARCHAR(100)}
     * @param character3List The collection of character3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter3_NotInScope(Collection<String> character3List) {
        doSetCharacter3_NotInScope(character3List);
    }

    protected void doSetCharacter3_NotInScope(Collection<String> character3List) {
        regINS(CK_NINS, cTL(character3List), xgetCValueCharacter3(), "CHARACTER3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER3: {VARCHAR(100)} <br>
     * <pre>e.g. setCharacter3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param character3 The value of character3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCharacter3_LikeSearch(String character3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(character3), xgetCValueCharacter3(), "CHARACTER3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER3: {VARCHAR(100)}
     * @param character3 The value of character3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCharacter3_NotLikeSearch(String character3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(character3), xgetCValueCharacter3(), "CHARACTER3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER3: {VARCHAR(100)}
     * @param character3 The value of character3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter3_PrefixSearch(String character3) {
        setCharacter3_LikeSearch(character3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHARACTER3: {VARCHAR(100)}
     */
    public void setCharacter3_IsNull() { regCharacter3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CHARACTER3: {VARCHAR(100)}
     */
    public void setCharacter3_IsNullOrEmpty() { regCharacter3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHARACTER3: {VARCHAR(100)}
     */
    public void setCharacter3_IsNotNull() { regCharacter3(CK_ISNN, DOBJ); }

    protected void regCharacter3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCharacter3(), "CHARACTER3"); }
    protected abstract ConditionValue xgetCValueCharacter3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER4: {VARCHAR(100)}
     * @param character4 The value of character4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter4_Equal(String character4) {
        doSetCharacter4_Equal(fRES(character4));
    }

    protected void doSetCharacter4_Equal(String character4) {
        regCharacter4(CK_EQ, character4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER4: {VARCHAR(100)}
     * @param character4 The value of character4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter4_NotEqual(String character4) {
        doSetCharacter4_NotEqual(fRES(character4));
    }

    protected void doSetCharacter4_NotEqual(String character4) {
        regCharacter4(CK_NES, character4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER4: {VARCHAR(100)}
     * @param character4 The value of character4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter4_GreaterThan(String character4) {
        regCharacter4(CK_GT, fRES(character4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER4: {VARCHAR(100)}
     * @param character4 The value of character4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter4_LessThan(String character4) {
        regCharacter4(CK_LT, fRES(character4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER4: {VARCHAR(100)}
     * @param character4 The value of character4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter4_GreaterEqual(String character4) {
        regCharacter4(CK_GE, fRES(character4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER4: {VARCHAR(100)}
     * @param character4 The value of character4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter4_LessEqual(String character4) {
        regCharacter4(CK_LE, fRES(character4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER4: {VARCHAR(100)}
     * @param character4List The collection of character4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter4_InScope(Collection<String> character4List) {
        doSetCharacter4_InScope(character4List);
    }

    protected void doSetCharacter4_InScope(Collection<String> character4List) {
        regINS(CK_INS, cTL(character4List), xgetCValueCharacter4(), "CHARACTER4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER4: {VARCHAR(100)}
     * @param character4List The collection of character4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter4_NotInScope(Collection<String> character4List) {
        doSetCharacter4_NotInScope(character4List);
    }

    protected void doSetCharacter4_NotInScope(Collection<String> character4List) {
        regINS(CK_NINS, cTL(character4List), xgetCValueCharacter4(), "CHARACTER4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER4: {VARCHAR(100)} <br>
     * <pre>e.g. setCharacter4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param character4 The value of character4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCharacter4_LikeSearch(String character4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(character4), xgetCValueCharacter4(), "CHARACTER4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER4: {VARCHAR(100)}
     * @param character4 The value of character4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCharacter4_NotLikeSearch(String character4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(character4), xgetCValueCharacter4(), "CHARACTER4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER4: {VARCHAR(100)}
     * @param character4 The value of character4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter4_PrefixSearch(String character4) {
        setCharacter4_LikeSearch(character4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHARACTER4: {VARCHAR(100)}
     */
    public void setCharacter4_IsNull() { regCharacter4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CHARACTER4: {VARCHAR(100)}
     */
    public void setCharacter4_IsNullOrEmpty() { regCharacter4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHARACTER4: {VARCHAR(100)}
     */
    public void setCharacter4_IsNotNull() { regCharacter4(CK_ISNN, DOBJ); }

    protected void regCharacter4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCharacter4(), "CHARACTER4"); }
    protected abstract ConditionValue xgetCValueCharacter4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER5: {VARCHAR(100)}
     * @param character5 The value of character5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter5_Equal(String character5) {
        doSetCharacter5_Equal(fRES(character5));
    }

    protected void doSetCharacter5_Equal(String character5) {
        regCharacter5(CK_EQ, character5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER5: {VARCHAR(100)}
     * @param character5 The value of character5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter5_NotEqual(String character5) {
        doSetCharacter5_NotEqual(fRES(character5));
    }

    protected void doSetCharacter5_NotEqual(String character5) {
        regCharacter5(CK_NES, character5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER5: {VARCHAR(100)}
     * @param character5 The value of character5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter5_GreaterThan(String character5) {
        regCharacter5(CK_GT, fRES(character5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER5: {VARCHAR(100)}
     * @param character5 The value of character5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter5_LessThan(String character5) {
        regCharacter5(CK_LT, fRES(character5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER5: {VARCHAR(100)}
     * @param character5 The value of character5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter5_GreaterEqual(String character5) {
        regCharacter5(CK_GE, fRES(character5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER5: {VARCHAR(100)}
     * @param character5 The value of character5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter5_LessEqual(String character5) {
        regCharacter5(CK_LE, fRES(character5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER5: {VARCHAR(100)}
     * @param character5List The collection of character5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter5_InScope(Collection<String> character5List) {
        doSetCharacter5_InScope(character5List);
    }

    protected void doSetCharacter5_InScope(Collection<String> character5List) {
        regINS(CK_INS, cTL(character5List), xgetCValueCharacter5(), "CHARACTER5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER5: {VARCHAR(100)}
     * @param character5List The collection of character5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter5_NotInScope(Collection<String> character5List) {
        doSetCharacter5_NotInScope(character5List);
    }

    protected void doSetCharacter5_NotInScope(Collection<String> character5List) {
        regINS(CK_NINS, cTL(character5List), xgetCValueCharacter5(), "CHARACTER5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER5: {VARCHAR(100)} <br>
     * <pre>e.g. setCharacter5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param character5 The value of character5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCharacter5_LikeSearch(String character5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(character5), xgetCValueCharacter5(), "CHARACTER5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER5: {VARCHAR(100)}
     * @param character5 The value of character5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCharacter5_NotLikeSearch(String character5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(character5), xgetCValueCharacter5(), "CHARACTER5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER5: {VARCHAR(100)}
     * @param character5 The value of character5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter5_PrefixSearch(String character5) {
        setCharacter5_LikeSearch(character5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHARACTER5: {VARCHAR(100)}
     */
    public void setCharacter5_IsNull() { regCharacter5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CHARACTER5: {VARCHAR(100)}
     */
    public void setCharacter5_IsNullOrEmpty() { regCharacter5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHARACTER5: {VARCHAR(100)}
     */
    public void setCharacter5_IsNotNull() { regCharacter5(CK_ISNN, DOBJ); }

    protected void regCharacter5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCharacter5(), "CHARACTER5"); }
    protected abstract ConditionValue xgetCValueCharacter5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER6: {VARCHAR(100)}
     * @param character6 The value of character6 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter6_Equal(String character6) {
        doSetCharacter6_Equal(fRES(character6));
    }

    protected void doSetCharacter6_Equal(String character6) {
        regCharacter6(CK_EQ, character6);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER6: {VARCHAR(100)}
     * @param character6 The value of character6 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter6_NotEqual(String character6) {
        doSetCharacter6_NotEqual(fRES(character6));
    }

    protected void doSetCharacter6_NotEqual(String character6) {
        regCharacter6(CK_NES, character6);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER6: {VARCHAR(100)}
     * @param character6 The value of character6 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter6_GreaterThan(String character6) {
        regCharacter6(CK_GT, fRES(character6));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER6: {VARCHAR(100)}
     * @param character6 The value of character6 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter6_LessThan(String character6) {
        regCharacter6(CK_LT, fRES(character6));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER6: {VARCHAR(100)}
     * @param character6 The value of character6 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter6_GreaterEqual(String character6) {
        regCharacter6(CK_GE, fRES(character6));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER6: {VARCHAR(100)}
     * @param character6 The value of character6 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter6_LessEqual(String character6) {
        regCharacter6(CK_LE, fRES(character6));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER6: {VARCHAR(100)}
     * @param character6List The collection of character6 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter6_InScope(Collection<String> character6List) {
        doSetCharacter6_InScope(character6List);
    }

    protected void doSetCharacter6_InScope(Collection<String> character6List) {
        regINS(CK_INS, cTL(character6List), xgetCValueCharacter6(), "CHARACTER6");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER6: {VARCHAR(100)}
     * @param character6List The collection of character6 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter6_NotInScope(Collection<String> character6List) {
        doSetCharacter6_NotInScope(character6List);
    }

    protected void doSetCharacter6_NotInScope(Collection<String> character6List) {
        regINS(CK_NINS, cTL(character6List), xgetCValueCharacter6(), "CHARACTER6");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER6: {VARCHAR(100)} <br>
     * <pre>e.g. setCharacter6_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param character6 The value of character6 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCharacter6_LikeSearch(String character6, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(character6), xgetCValueCharacter6(), "CHARACTER6", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER6: {VARCHAR(100)}
     * @param character6 The value of character6 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCharacter6_NotLikeSearch(String character6, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(character6), xgetCValueCharacter6(), "CHARACTER6", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER6: {VARCHAR(100)}
     * @param character6 The value of character6 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter6_PrefixSearch(String character6) {
        setCharacter6_LikeSearch(character6, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHARACTER6: {VARCHAR(100)}
     */
    public void setCharacter6_IsNull() { regCharacter6(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CHARACTER6: {VARCHAR(100)}
     */
    public void setCharacter6_IsNullOrEmpty() { regCharacter6(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHARACTER6: {VARCHAR(100)}
     */
    public void setCharacter6_IsNotNull() { regCharacter6(CK_ISNN, DOBJ); }

    protected void regCharacter6(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCharacter6(), "CHARACTER6"); }
    protected abstract ConditionValue xgetCValueCharacter6();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER7: {VARCHAR(100)}
     * @param character7 The value of character7 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter7_Equal(String character7) {
        doSetCharacter7_Equal(fRES(character7));
    }

    protected void doSetCharacter7_Equal(String character7) {
        regCharacter7(CK_EQ, character7);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER7: {VARCHAR(100)}
     * @param character7 The value of character7 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter7_NotEqual(String character7) {
        doSetCharacter7_NotEqual(fRES(character7));
    }

    protected void doSetCharacter7_NotEqual(String character7) {
        regCharacter7(CK_NES, character7);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER7: {VARCHAR(100)}
     * @param character7 The value of character7 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter7_GreaterThan(String character7) {
        regCharacter7(CK_GT, fRES(character7));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER7: {VARCHAR(100)}
     * @param character7 The value of character7 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter7_LessThan(String character7) {
        regCharacter7(CK_LT, fRES(character7));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER7: {VARCHAR(100)}
     * @param character7 The value of character7 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter7_GreaterEqual(String character7) {
        regCharacter7(CK_GE, fRES(character7));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER7: {VARCHAR(100)}
     * @param character7 The value of character7 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter7_LessEqual(String character7) {
        regCharacter7(CK_LE, fRES(character7));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER7: {VARCHAR(100)}
     * @param character7List The collection of character7 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter7_InScope(Collection<String> character7List) {
        doSetCharacter7_InScope(character7List);
    }

    protected void doSetCharacter7_InScope(Collection<String> character7List) {
        regINS(CK_INS, cTL(character7List), xgetCValueCharacter7(), "CHARACTER7");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER7: {VARCHAR(100)}
     * @param character7List The collection of character7 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter7_NotInScope(Collection<String> character7List) {
        doSetCharacter7_NotInScope(character7List);
    }

    protected void doSetCharacter7_NotInScope(Collection<String> character7List) {
        regINS(CK_NINS, cTL(character7List), xgetCValueCharacter7(), "CHARACTER7");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER7: {VARCHAR(100)} <br>
     * <pre>e.g. setCharacter7_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param character7 The value of character7 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCharacter7_LikeSearch(String character7, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(character7), xgetCValueCharacter7(), "CHARACTER7", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER7: {VARCHAR(100)}
     * @param character7 The value of character7 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCharacter7_NotLikeSearch(String character7, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(character7), xgetCValueCharacter7(), "CHARACTER7", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER7: {VARCHAR(100)}
     * @param character7 The value of character7 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter7_PrefixSearch(String character7) {
        setCharacter7_LikeSearch(character7, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHARACTER7: {VARCHAR(100)}
     */
    public void setCharacter7_IsNull() { regCharacter7(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CHARACTER7: {VARCHAR(100)}
     */
    public void setCharacter7_IsNullOrEmpty() { regCharacter7(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHARACTER7: {VARCHAR(100)}
     */
    public void setCharacter7_IsNotNull() { regCharacter7(CK_ISNN, DOBJ); }

    protected void regCharacter7(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCharacter7(), "CHARACTER7"); }
    protected abstract ConditionValue xgetCValueCharacter7();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER8: {VARCHAR(100)}
     * @param character8 The value of character8 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter8_Equal(String character8) {
        doSetCharacter8_Equal(fRES(character8));
    }

    protected void doSetCharacter8_Equal(String character8) {
        regCharacter8(CK_EQ, character8);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER8: {VARCHAR(100)}
     * @param character8 The value of character8 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter8_NotEqual(String character8) {
        doSetCharacter8_NotEqual(fRES(character8));
    }

    protected void doSetCharacter8_NotEqual(String character8) {
        regCharacter8(CK_NES, character8);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER8: {VARCHAR(100)}
     * @param character8 The value of character8 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter8_GreaterThan(String character8) {
        regCharacter8(CK_GT, fRES(character8));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER8: {VARCHAR(100)}
     * @param character8 The value of character8 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter8_LessThan(String character8) {
        regCharacter8(CK_LT, fRES(character8));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER8: {VARCHAR(100)}
     * @param character8 The value of character8 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter8_GreaterEqual(String character8) {
        regCharacter8(CK_GE, fRES(character8));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER8: {VARCHAR(100)}
     * @param character8 The value of character8 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter8_LessEqual(String character8) {
        regCharacter8(CK_LE, fRES(character8));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER8: {VARCHAR(100)}
     * @param character8List The collection of character8 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter8_InScope(Collection<String> character8List) {
        doSetCharacter8_InScope(character8List);
    }

    protected void doSetCharacter8_InScope(Collection<String> character8List) {
        regINS(CK_INS, cTL(character8List), xgetCValueCharacter8(), "CHARACTER8");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER8: {VARCHAR(100)}
     * @param character8List The collection of character8 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter8_NotInScope(Collection<String> character8List) {
        doSetCharacter8_NotInScope(character8List);
    }

    protected void doSetCharacter8_NotInScope(Collection<String> character8List) {
        regINS(CK_NINS, cTL(character8List), xgetCValueCharacter8(), "CHARACTER8");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER8: {VARCHAR(100)} <br>
     * <pre>e.g. setCharacter8_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param character8 The value of character8 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCharacter8_LikeSearch(String character8, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(character8), xgetCValueCharacter8(), "CHARACTER8", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER8: {VARCHAR(100)}
     * @param character8 The value of character8 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCharacter8_NotLikeSearch(String character8, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(character8), xgetCValueCharacter8(), "CHARACTER8", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER8: {VARCHAR(100)}
     * @param character8 The value of character8 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter8_PrefixSearch(String character8) {
        setCharacter8_LikeSearch(character8, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHARACTER8: {VARCHAR(100)}
     */
    public void setCharacter8_IsNull() { regCharacter8(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CHARACTER8: {VARCHAR(100)}
     */
    public void setCharacter8_IsNullOrEmpty() { regCharacter8(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHARACTER8: {VARCHAR(100)}
     */
    public void setCharacter8_IsNotNull() { regCharacter8(CK_ISNN, DOBJ); }

    protected void regCharacter8(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCharacter8(), "CHARACTER8"); }
    protected abstract ConditionValue xgetCValueCharacter8();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER9: {VARCHAR(100)}
     * @param character9 The value of character9 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter9_Equal(String character9) {
        doSetCharacter9_Equal(fRES(character9));
    }

    protected void doSetCharacter9_Equal(String character9) {
        regCharacter9(CK_EQ, character9);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER9: {VARCHAR(100)}
     * @param character9 The value of character9 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter9_NotEqual(String character9) {
        doSetCharacter9_NotEqual(fRES(character9));
    }

    protected void doSetCharacter9_NotEqual(String character9) {
        regCharacter9(CK_NES, character9);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER9: {VARCHAR(100)}
     * @param character9 The value of character9 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter9_GreaterThan(String character9) {
        regCharacter9(CK_GT, fRES(character9));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER9: {VARCHAR(100)}
     * @param character9 The value of character9 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter9_LessThan(String character9) {
        regCharacter9(CK_LT, fRES(character9));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER9: {VARCHAR(100)}
     * @param character9 The value of character9 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter9_GreaterEqual(String character9) {
        regCharacter9(CK_GE, fRES(character9));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER9: {VARCHAR(100)}
     * @param character9 The value of character9 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter9_LessEqual(String character9) {
        regCharacter9(CK_LE, fRES(character9));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER9: {VARCHAR(100)}
     * @param character9List The collection of character9 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter9_InScope(Collection<String> character9List) {
        doSetCharacter9_InScope(character9List);
    }

    protected void doSetCharacter9_InScope(Collection<String> character9List) {
        regINS(CK_INS, cTL(character9List), xgetCValueCharacter9(), "CHARACTER9");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER9: {VARCHAR(100)}
     * @param character9List The collection of character9 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter9_NotInScope(Collection<String> character9List) {
        doSetCharacter9_NotInScope(character9List);
    }

    protected void doSetCharacter9_NotInScope(Collection<String> character9List) {
        regINS(CK_NINS, cTL(character9List), xgetCValueCharacter9(), "CHARACTER9");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER9: {VARCHAR(100)} <br>
     * <pre>e.g. setCharacter9_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param character9 The value of character9 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCharacter9_LikeSearch(String character9, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(character9), xgetCValueCharacter9(), "CHARACTER9", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER9: {VARCHAR(100)}
     * @param character9 The value of character9 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCharacter9_NotLikeSearch(String character9, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(character9), xgetCValueCharacter9(), "CHARACTER9", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER9: {VARCHAR(100)}
     * @param character9 The value of character9 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter9_PrefixSearch(String character9) {
        setCharacter9_LikeSearch(character9, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHARACTER9: {VARCHAR(100)}
     */
    public void setCharacter9_IsNull() { regCharacter9(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CHARACTER9: {VARCHAR(100)}
     */
    public void setCharacter9_IsNullOrEmpty() { regCharacter9(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHARACTER9: {VARCHAR(100)}
     */
    public void setCharacter9_IsNotNull() { regCharacter9(CK_ISNN, DOBJ); }

    protected void regCharacter9(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCharacter9(), "CHARACTER9"); }
    protected abstract ConditionValue xgetCValueCharacter9();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER10: {VARCHAR(100)}
     * @param character10 The value of character10 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter10_Equal(String character10) {
        doSetCharacter10_Equal(fRES(character10));
    }

    protected void doSetCharacter10_Equal(String character10) {
        regCharacter10(CK_EQ, character10);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER10: {VARCHAR(100)}
     * @param character10 The value of character10 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter10_NotEqual(String character10) {
        doSetCharacter10_NotEqual(fRES(character10));
    }

    protected void doSetCharacter10_NotEqual(String character10) {
        regCharacter10(CK_NES, character10);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER10: {VARCHAR(100)}
     * @param character10 The value of character10 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter10_GreaterThan(String character10) {
        regCharacter10(CK_GT, fRES(character10));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER10: {VARCHAR(100)}
     * @param character10 The value of character10 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter10_LessThan(String character10) {
        regCharacter10(CK_LT, fRES(character10));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER10: {VARCHAR(100)}
     * @param character10 The value of character10 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter10_GreaterEqual(String character10) {
        regCharacter10(CK_GE, fRES(character10));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER10: {VARCHAR(100)}
     * @param character10 The value of character10 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter10_LessEqual(String character10) {
        regCharacter10(CK_LE, fRES(character10));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER10: {VARCHAR(100)}
     * @param character10List The collection of character10 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter10_InScope(Collection<String> character10List) {
        doSetCharacter10_InScope(character10List);
    }

    protected void doSetCharacter10_InScope(Collection<String> character10List) {
        regINS(CK_INS, cTL(character10List), xgetCValueCharacter10(), "CHARACTER10");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER10: {VARCHAR(100)}
     * @param character10List The collection of character10 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter10_NotInScope(Collection<String> character10List) {
        doSetCharacter10_NotInScope(character10List);
    }

    protected void doSetCharacter10_NotInScope(Collection<String> character10List) {
        regINS(CK_NINS, cTL(character10List), xgetCValueCharacter10(), "CHARACTER10");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER10: {VARCHAR(100)} <br>
     * <pre>e.g. setCharacter10_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param character10 The value of character10 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCharacter10_LikeSearch(String character10, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(character10), xgetCValueCharacter10(), "CHARACTER10", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER10: {VARCHAR(100)}
     * @param character10 The value of character10 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCharacter10_NotLikeSearch(String character10, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(character10), xgetCValueCharacter10(), "CHARACTER10", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER10: {VARCHAR(100)}
     * @param character10 The value of character10 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacter10_PrefixSearch(String character10) {
        setCharacter10_LikeSearch(character10, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHARACTER10: {VARCHAR(100)}
     */
    public void setCharacter10_IsNull() { regCharacter10(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CHARACTER10: {VARCHAR(100)}
     */
    public void setCharacter10_IsNullOrEmpty() { regCharacter10(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHARACTER10: {VARCHAR(100)}
     */
    public void setCharacter10_IsNotNull() { regCharacter10(CK_ISNN, DOBJ); }

    protected void regCharacter10(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCharacter10(), "CHARACTER10"); }
    protected abstract ConditionValue xgetCValueCharacter10();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM1: {DECIMAL(14, 4), default=[0.0000]}
     * @param num1 The value of num1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum1_Equal(java.math.BigDecimal num1) {
        doSetNum1_Equal(num1);
    }

    protected void doSetNum1_Equal(java.math.BigDecimal num1) {
        regNum1(CK_EQ, num1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM1: {DECIMAL(14, 4), default=[0.0000]}
     * @param num1 The value of num1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum1_NotEqual(java.math.BigDecimal num1) {
        doSetNum1_NotEqual(num1);
    }

    protected void doSetNum1_NotEqual(java.math.BigDecimal num1) {
        regNum1(CK_NES, num1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM1: {DECIMAL(14, 4), default=[0.0000]}
     * @param num1 The value of num1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum1_GreaterThan(java.math.BigDecimal num1) {
        regNum1(CK_GT, num1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM1: {DECIMAL(14, 4), default=[0.0000]}
     * @param num1 The value of num1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum1_LessThan(java.math.BigDecimal num1) {
        regNum1(CK_LT, num1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM1: {DECIMAL(14, 4), default=[0.0000]}
     * @param num1 The value of num1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum1_GreaterEqual(java.math.BigDecimal num1) {
        regNum1(CK_GE, num1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM1: {DECIMAL(14, 4), default=[0.0000]}
     * @param num1 The value of num1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum1_LessEqual(java.math.BigDecimal num1) {
        regNum1(CK_LE, num1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUM1: {DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of num1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of num1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNum1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNum1(), "NUM1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM1: {DECIMAL(14, 4), default=[0.0000]}
     * @param num1List The collection of num1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum1_InScope(Collection<java.math.BigDecimal> num1List) {
        doSetNum1_InScope(num1List);
    }

    protected void doSetNum1_InScope(Collection<java.math.BigDecimal> num1List) {
        regINS(CK_INS, cTL(num1List), xgetCValueNum1(), "NUM1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM1: {DECIMAL(14, 4), default=[0.0000]}
     * @param num1List The collection of num1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum1_NotInScope(Collection<java.math.BigDecimal> num1List) {
        doSetNum1_NotInScope(num1List);
    }

    protected void doSetNum1_NotInScope(Collection<java.math.BigDecimal> num1List) {
        regINS(CK_NINS, cTL(num1List), xgetCValueNum1(), "NUM1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUM1: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum1_IsNull() { regNum1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUM1: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum1_IsNotNull() { regNum1(CK_ISNN, DOBJ); }

    protected void regNum1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNum1(), "NUM1"); }
    protected abstract ConditionValue xgetCValueNum1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM2: {DECIMAL(14, 4), default=[0.0000]}
     * @param num2 The value of num2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum2_Equal(java.math.BigDecimal num2) {
        doSetNum2_Equal(num2);
    }

    protected void doSetNum2_Equal(java.math.BigDecimal num2) {
        regNum2(CK_EQ, num2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM2: {DECIMAL(14, 4), default=[0.0000]}
     * @param num2 The value of num2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum2_NotEqual(java.math.BigDecimal num2) {
        doSetNum2_NotEqual(num2);
    }

    protected void doSetNum2_NotEqual(java.math.BigDecimal num2) {
        regNum2(CK_NES, num2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM2: {DECIMAL(14, 4), default=[0.0000]}
     * @param num2 The value of num2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum2_GreaterThan(java.math.BigDecimal num2) {
        regNum2(CK_GT, num2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM2: {DECIMAL(14, 4), default=[0.0000]}
     * @param num2 The value of num2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum2_LessThan(java.math.BigDecimal num2) {
        regNum2(CK_LT, num2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM2: {DECIMAL(14, 4), default=[0.0000]}
     * @param num2 The value of num2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum2_GreaterEqual(java.math.BigDecimal num2) {
        regNum2(CK_GE, num2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM2: {DECIMAL(14, 4), default=[0.0000]}
     * @param num2 The value of num2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum2_LessEqual(java.math.BigDecimal num2) {
        regNum2(CK_LE, num2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUM2: {DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of num2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of num2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNum2_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNum2(), "NUM2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM2: {DECIMAL(14, 4), default=[0.0000]}
     * @param num2List The collection of num2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum2_InScope(Collection<java.math.BigDecimal> num2List) {
        doSetNum2_InScope(num2List);
    }

    protected void doSetNum2_InScope(Collection<java.math.BigDecimal> num2List) {
        regINS(CK_INS, cTL(num2List), xgetCValueNum2(), "NUM2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM2: {DECIMAL(14, 4), default=[0.0000]}
     * @param num2List The collection of num2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum2_NotInScope(Collection<java.math.BigDecimal> num2List) {
        doSetNum2_NotInScope(num2List);
    }

    protected void doSetNum2_NotInScope(Collection<java.math.BigDecimal> num2List) {
        regINS(CK_NINS, cTL(num2List), xgetCValueNum2(), "NUM2");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUM2: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum2_IsNull() { regNum2(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUM2: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum2_IsNotNull() { regNum2(CK_ISNN, DOBJ); }

    protected void regNum2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNum2(), "NUM2"); }
    protected abstract ConditionValue xgetCValueNum2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM3: {DECIMAL(14, 4), default=[0.0000]}
     * @param num3 The value of num3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum3_Equal(java.math.BigDecimal num3) {
        doSetNum3_Equal(num3);
    }

    protected void doSetNum3_Equal(java.math.BigDecimal num3) {
        regNum3(CK_EQ, num3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM3: {DECIMAL(14, 4), default=[0.0000]}
     * @param num3 The value of num3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum3_NotEqual(java.math.BigDecimal num3) {
        doSetNum3_NotEqual(num3);
    }

    protected void doSetNum3_NotEqual(java.math.BigDecimal num3) {
        regNum3(CK_NES, num3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM3: {DECIMAL(14, 4), default=[0.0000]}
     * @param num3 The value of num3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum3_GreaterThan(java.math.BigDecimal num3) {
        regNum3(CK_GT, num3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM3: {DECIMAL(14, 4), default=[0.0000]}
     * @param num3 The value of num3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum3_LessThan(java.math.BigDecimal num3) {
        regNum3(CK_LT, num3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM3: {DECIMAL(14, 4), default=[0.0000]}
     * @param num3 The value of num3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum3_GreaterEqual(java.math.BigDecimal num3) {
        regNum3(CK_GE, num3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM3: {DECIMAL(14, 4), default=[0.0000]}
     * @param num3 The value of num3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum3_LessEqual(java.math.BigDecimal num3) {
        regNum3(CK_LE, num3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUM3: {DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of num3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of num3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNum3_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNum3(), "NUM3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM3: {DECIMAL(14, 4), default=[0.0000]}
     * @param num3List The collection of num3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum3_InScope(Collection<java.math.BigDecimal> num3List) {
        doSetNum3_InScope(num3List);
    }

    protected void doSetNum3_InScope(Collection<java.math.BigDecimal> num3List) {
        regINS(CK_INS, cTL(num3List), xgetCValueNum3(), "NUM3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM3: {DECIMAL(14, 4), default=[0.0000]}
     * @param num3List The collection of num3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum3_NotInScope(Collection<java.math.BigDecimal> num3List) {
        doSetNum3_NotInScope(num3List);
    }

    protected void doSetNum3_NotInScope(Collection<java.math.BigDecimal> num3List) {
        regINS(CK_NINS, cTL(num3List), xgetCValueNum3(), "NUM3");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUM3: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum3_IsNull() { regNum3(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUM3: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum3_IsNotNull() { regNum3(CK_ISNN, DOBJ); }

    protected void regNum3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNum3(), "NUM3"); }
    protected abstract ConditionValue xgetCValueNum3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM4: {DECIMAL(14, 4), default=[0.0000]}
     * @param num4 The value of num4 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum4_Equal(java.math.BigDecimal num4) {
        doSetNum4_Equal(num4);
    }

    protected void doSetNum4_Equal(java.math.BigDecimal num4) {
        regNum4(CK_EQ, num4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM4: {DECIMAL(14, 4), default=[0.0000]}
     * @param num4 The value of num4 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum4_NotEqual(java.math.BigDecimal num4) {
        doSetNum4_NotEqual(num4);
    }

    protected void doSetNum4_NotEqual(java.math.BigDecimal num4) {
        regNum4(CK_NES, num4);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM4: {DECIMAL(14, 4), default=[0.0000]}
     * @param num4 The value of num4 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum4_GreaterThan(java.math.BigDecimal num4) {
        regNum4(CK_GT, num4);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM4: {DECIMAL(14, 4), default=[0.0000]}
     * @param num4 The value of num4 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum4_LessThan(java.math.BigDecimal num4) {
        regNum4(CK_LT, num4);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM4: {DECIMAL(14, 4), default=[0.0000]}
     * @param num4 The value of num4 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum4_GreaterEqual(java.math.BigDecimal num4) {
        regNum4(CK_GE, num4);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM4: {DECIMAL(14, 4), default=[0.0000]}
     * @param num4 The value of num4 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum4_LessEqual(java.math.BigDecimal num4) {
        regNum4(CK_LE, num4);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUM4: {DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of num4. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of num4. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNum4_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNum4(), "NUM4", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM4: {DECIMAL(14, 4), default=[0.0000]}
     * @param num4List The collection of num4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum4_InScope(Collection<java.math.BigDecimal> num4List) {
        doSetNum4_InScope(num4List);
    }

    protected void doSetNum4_InScope(Collection<java.math.BigDecimal> num4List) {
        regINS(CK_INS, cTL(num4List), xgetCValueNum4(), "NUM4");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM4: {DECIMAL(14, 4), default=[0.0000]}
     * @param num4List The collection of num4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum4_NotInScope(Collection<java.math.BigDecimal> num4List) {
        doSetNum4_NotInScope(num4List);
    }

    protected void doSetNum4_NotInScope(Collection<java.math.BigDecimal> num4List) {
        regINS(CK_NINS, cTL(num4List), xgetCValueNum4(), "NUM4");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUM4: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum4_IsNull() { regNum4(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUM4: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum4_IsNotNull() { regNum4(CK_ISNN, DOBJ); }

    protected void regNum4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNum4(), "NUM4"); }
    protected abstract ConditionValue xgetCValueNum4();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM5: {DECIMAL(14, 4), default=[0.0000]}
     * @param num5 The value of num5 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum5_Equal(java.math.BigDecimal num5) {
        doSetNum5_Equal(num5);
    }

    protected void doSetNum5_Equal(java.math.BigDecimal num5) {
        regNum5(CK_EQ, num5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM5: {DECIMAL(14, 4), default=[0.0000]}
     * @param num5 The value of num5 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum5_NotEqual(java.math.BigDecimal num5) {
        doSetNum5_NotEqual(num5);
    }

    protected void doSetNum5_NotEqual(java.math.BigDecimal num5) {
        regNum5(CK_NES, num5);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM5: {DECIMAL(14, 4), default=[0.0000]}
     * @param num5 The value of num5 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum5_GreaterThan(java.math.BigDecimal num5) {
        regNum5(CK_GT, num5);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM5: {DECIMAL(14, 4), default=[0.0000]}
     * @param num5 The value of num5 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum5_LessThan(java.math.BigDecimal num5) {
        regNum5(CK_LT, num5);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM5: {DECIMAL(14, 4), default=[0.0000]}
     * @param num5 The value of num5 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum5_GreaterEqual(java.math.BigDecimal num5) {
        regNum5(CK_GE, num5);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM5: {DECIMAL(14, 4), default=[0.0000]}
     * @param num5 The value of num5 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum5_LessEqual(java.math.BigDecimal num5) {
        regNum5(CK_LE, num5);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUM5: {DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of num5. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of num5. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNum5_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNum5(), "NUM5", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM5: {DECIMAL(14, 4), default=[0.0000]}
     * @param num5List The collection of num5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum5_InScope(Collection<java.math.BigDecimal> num5List) {
        doSetNum5_InScope(num5List);
    }

    protected void doSetNum5_InScope(Collection<java.math.BigDecimal> num5List) {
        regINS(CK_INS, cTL(num5List), xgetCValueNum5(), "NUM5");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM5: {DECIMAL(14, 4), default=[0.0000]}
     * @param num5List The collection of num5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum5_NotInScope(Collection<java.math.BigDecimal> num5List) {
        doSetNum5_NotInScope(num5List);
    }

    protected void doSetNum5_NotInScope(Collection<java.math.BigDecimal> num5List) {
        regINS(CK_NINS, cTL(num5List), xgetCValueNum5(), "NUM5");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUM5: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum5_IsNull() { regNum5(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUM5: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum5_IsNotNull() { regNum5(CK_ISNN, DOBJ); }

    protected void regNum5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNum5(), "NUM5"); }
    protected abstract ConditionValue xgetCValueNum5();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM6: {DECIMAL(14, 4), default=[0.0000]}
     * @param num6 The value of num6 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum6_Equal(java.math.BigDecimal num6) {
        doSetNum6_Equal(num6);
    }

    protected void doSetNum6_Equal(java.math.BigDecimal num6) {
        regNum6(CK_EQ, num6);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM6: {DECIMAL(14, 4), default=[0.0000]}
     * @param num6 The value of num6 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum6_NotEqual(java.math.BigDecimal num6) {
        doSetNum6_NotEqual(num6);
    }

    protected void doSetNum6_NotEqual(java.math.BigDecimal num6) {
        regNum6(CK_NES, num6);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM6: {DECIMAL(14, 4), default=[0.0000]}
     * @param num6 The value of num6 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum6_GreaterThan(java.math.BigDecimal num6) {
        regNum6(CK_GT, num6);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM6: {DECIMAL(14, 4), default=[0.0000]}
     * @param num6 The value of num6 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum6_LessThan(java.math.BigDecimal num6) {
        regNum6(CK_LT, num6);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM6: {DECIMAL(14, 4), default=[0.0000]}
     * @param num6 The value of num6 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum6_GreaterEqual(java.math.BigDecimal num6) {
        regNum6(CK_GE, num6);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM6: {DECIMAL(14, 4), default=[0.0000]}
     * @param num6 The value of num6 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum6_LessEqual(java.math.BigDecimal num6) {
        regNum6(CK_LE, num6);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUM6: {DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of num6. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of num6. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNum6_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNum6(), "NUM6", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM6: {DECIMAL(14, 4), default=[0.0000]}
     * @param num6List The collection of num6 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum6_InScope(Collection<java.math.BigDecimal> num6List) {
        doSetNum6_InScope(num6List);
    }

    protected void doSetNum6_InScope(Collection<java.math.BigDecimal> num6List) {
        regINS(CK_INS, cTL(num6List), xgetCValueNum6(), "NUM6");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM6: {DECIMAL(14, 4), default=[0.0000]}
     * @param num6List The collection of num6 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum6_NotInScope(Collection<java.math.BigDecimal> num6List) {
        doSetNum6_NotInScope(num6List);
    }

    protected void doSetNum6_NotInScope(Collection<java.math.BigDecimal> num6List) {
        regINS(CK_NINS, cTL(num6List), xgetCValueNum6(), "NUM6");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUM6: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum6_IsNull() { regNum6(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUM6: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum6_IsNotNull() { regNum6(CK_ISNN, DOBJ); }

    protected void regNum6(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNum6(), "NUM6"); }
    protected abstract ConditionValue xgetCValueNum6();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM7: {DECIMAL(14, 4), default=[0.0000]}
     * @param num7 The value of num7 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum7_Equal(java.math.BigDecimal num7) {
        doSetNum7_Equal(num7);
    }

    protected void doSetNum7_Equal(java.math.BigDecimal num7) {
        regNum7(CK_EQ, num7);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM7: {DECIMAL(14, 4), default=[0.0000]}
     * @param num7 The value of num7 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum7_NotEqual(java.math.BigDecimal num7) {
        doSetNum7_NotEqual(num7);
    }

    protected void doSetNum7_NotEqual(java.math.BigDecimal num7) {
        regNum7(CK_NES, num7);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM7: {DECIMAL(14, 4), default=[0.0000]}
     * @param num7 The value of num7 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum7_GreaterThan(java.math.BigDecimal num7) {
        regNum7(CK_GT, num7);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM7: {DECIMAL(14, 4), default=[0.0000]}
     * @param num7 The value of num7 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum7_LessThan(java.math.BigDecimal num7) {
        regNum7(CK_LT, num7);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM7: {DECIMAL(14, 4), default=[0.0000]}
     * @param num7 The value of num7 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum7_GreaterEqual(java.math.BigDecimal num7) {
        regNum7(CK_GE, num7);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM7: {DECIMAL(14, 4), default=[0.0000]}
     * @param num7 The value of num7 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum7_LessEqual(java.math.BigDecimal num7) {
        regNum7(CK_LE, num7);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUM7: {DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of num7. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of num7. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNum7_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNum7(), "NUM7", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM7: {DECIMAL(14, 4), default=[0.0000]}
     * @param num7List The collection of num7 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum7_InScope(Collection<java.math.BigDecimal> num7List) {
        doSetNum7_InScope(num7List);
    }

    protected void doSetNum7_InScope(Collection<java.math.BigDecimal> num7List) {
        regINS(CK_INS, cTL(num7List), xgetCValueNum7(), "NUM7");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM7: {DECIMAL(14, 4), default=[0.0000]}
     * @param num7List The collection of num7 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum7_NotInScope(Collection<java.math.BigDecimal> num7List) {
        doSetNum7_NotInScope(num7List);
    }

    protected void doSetNum7_NotInScope(Collection<java.math.BigDecimal> num7List) {
        regINS(CK_NINS, cTL(num7List), xgetCValueNum7(), "NUM7");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUM7: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum7_IsNull() { regNum7(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUM7: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum7_IsNotNull() { regNum7(CK_ISNN, DOBJ); }

    protected void regNum7(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNum7(), "NUM7"); }
    protected abstract ConditionValue xgetCValueNum7();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM8: {DECIMAL(14, 4), default=[0.0000]}
     * @param num8 The value of num8 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum8_Equal(java.math.BigDecimal num8) {
        doSetNum8_Equal(num8);
    }

    protected void doSetNum8_Equal(java.math.BigDecimal num8) {
        regNum8(CK_EQ, num8);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM8: {DECIMAL(14, 4), default=[0.0000]}
     * @param num8 The value of num8 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum8_NotEqual(java.math.BigDecimal num8) {
        doSetNum8_NotEqual(num8);
    }

    protected void doSetNum8_NotEqual(java.math.BigDecimal num8) {
        regNum8(CK_NES, num8);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM8: {DECIMAL(14, 4), default=[0.0000]}
     * @param num8 The value of num8 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum8_GreaterThan(java.math.BigDecimal num8) {
        regNum8(CK_GT, num8);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM8: {DECIMAL(14, 4), default=[0.0000]}
     * @param num8 The value of num8 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum8_LessThan(java.math.BigDecimal num8) {
        regNum8(CK_LT, num8);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM8: {DECIMAL(14, 4), default=[0.0000]}
     * @param num8 The value of num8 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum8_GreaterEqual(java.math.BigDecimal num8) {
        regNum8(CK_GE, num8);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM8: {DECIMAL(14, 4), default=[0.0000]}
     * @param num8 The value of num8 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum8_LessEqual(java.math.BigDecimal num8) {
        regNum8(CK_LE, num8);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUM8: {DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of num8. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of num8. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNum8_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNum8(), "NUM8", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM8: {DECIMAL(14, 4), default=[0.0000]}
     * @param num8List The collection of num8 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum8_InScope(Collection<java.math.BigDecimal> num8List) {
        doSetNum8_InScope(num8List);
    }

    protected void doSetNum8_InScope(Collection<java.math.BigDecimal> num8List) {
        regINS(CK_INS, cTL(num8List), xgetCValueNum8(), "NUM8");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM8: {DECIMAL(14, 4), default=[0.0000]}
     * @param num8List The collection of num8 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum8_NotInScope(Collection<java.math.BigDecimal> num8List) {
        doSetNum8_NotInScope(num8List);
    }

    protected void doSetNum8_NotInScope(Collection<java.math.BigDecimal> num8List) {
        regINS(CK_NINS, cTL(num8List), xgetCValueNum8(), "NUM8");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUM8: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum8_IsNull() { regNum8(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUM8: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum8_IsNotNull() { regNum8(CK_ISNN, DOBJ); }

    protected void regNum8(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNum8(), "NUM8"); }
    protected abstract ConditionValue xgetCValueNum8();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM9: {DECIMAL(14, 4), default=[0.0000]}
     * @param num9 The value of num9 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum9_Equal(java.math.BigDecimal num9) {
        doSetNum9_Equal(num9);
    }

    protected void doSetNum9_Equal(java.math.BigDecimal num9) {
        regNum9(CK_EQ, num9);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM9: {DECIMAL(14, 4), default=[0.0000]}
     * @param num9 The value of num9 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum9_NotEqual(java.math.BigDecimal num9) {
        doSetNum9_NotEqual(num9);
    }

    protected void doSetNum9_NotEqual(java.math.BigDecimal num9) {
        regNum9(CK_NES, num9);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM9: {DECIMAL(14, 4), default=[0.0000]}
     * @param num9 The value of num9 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum9_GreaterThan(java.math.BigDecimal num9) {
        regNum9(CK_GT, num9);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM9: {DECIMAL(14, 4), default=[0.0000]}
     * @param num9 The value of num9 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum9_LessThan(java.math.BigDecimal num9) {
        regNum9(CK_LT, num9);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM9: {DECIMAL(14, 4), default=[0.0000]}
     * @param num9 The value of num9 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum9_GreaterEqual(java.math.BigDecimal num9) {
        regNum9(CK_GE, num9);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM9: {DECIMAL(14, 4), default=[0.0000]}
     * @param num9 The value of num9 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum9_LessEqual(java.math.BigDecimal num9) {
        regNum9(CK_LE, num9);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUM9: {DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of num9. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of num9. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNum9_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNum9(), "NUM9", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM9: {DECIMAL(14, 4), default=[0.0000]}
     * @param num9List The collection of num9 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum9_InScope(Collection<java.math.BigDecimal> num9List) {
        doSetNum9_InScope(num9List);
    }

    protected void doSetNum9_InScope(Collection<java.math.BigDecimal> num9List) {
        regINS(CK_INS, cTL(num9List), xgetCValueNum9(), "NUM9");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM9: {DECIMAL(14, 4), default=[0.0000]}
     * @param num9List The collection of num9 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum9_NotInScope(Collection<java.math.BigDecimal> num9List) {
        doSetNum9_NotInScope(num9List);
    }

    protected void doSetNum9_NotInScope(Collection<java.math.BigDecimal> num9List) {
        regINS(CK_NINS, cTL(num9List), xgetCValueNum9(), "NUM9");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUM9: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum9_IsNull() { regNum9(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUM9: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum9_IsNotNull() { regNum9(CK_ISNN, DOBJ); }

    protected void regNum9(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNum9(), "NUM9"); }
    protected abstract ConditionValue xgetCValueNum9();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM10: {DECIMAL(14, 4), default=[0.0000]}
     * @param num10 The value of num10 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum10_Equal(java.math.BigDecimal num10) {
        doSetNum10_Equal(num10);
    }

    protected void doSetNum10_Equal(java.math.BigDecimal num10) {
        regNum10(CK_EQ, num10);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM10: {DECIMAL(14, 4), default=[0.0000]}
     * @param num10 The value of num10 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum10_NotEqual(java.math.BigDecimal num10) {
        doSetNum10_NotEqual(num10);
    }

    protected void doSetNum10_NotEqual(java.math.BigDecimal num10) {
        regNum10(CK_NES, num10);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM10: {DECIMAL(14, 4), default=[0.0000]}
     * @param num10 The value of num10 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum10_GreaterThan(java.math.BigDecimal num10) {
        regNum10(CK_GT, num10);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM10: {DECIMAL(14, 4), default=[0.0000]}
     * @param num10 The value of num10 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum10_LessThan(java.math.BigDecimal num10) {
        regNum10(CK_LT, num10);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM10: {DECIMAL(14, 4), default=[0.0000]}
     * @param num10 The value of num10 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum10_GreaterEqual(java.math.BigDecimal num10) {
        regNum10(CK_GE, num10);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM10: {DECIMAL(14, 4), default=[0.0000]}
     * @param num10 The value of num10 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum10_LessEqual(java.math.BigDecimal num10) {
        regNum10(CK_LE, num10);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUM10: {DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of num10. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of num10. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNum10_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNum10(), "NUM10", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM10: {DECIMAL(14, 4), default=[0.0000]}
     * @param num10List The collection of num10 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum10_InScope(Collection<java.math.BigDecimal> num10List) {
        doSetNum10_InScope(num10List);
    }

    protected void doSetNum10_InScope(Collection<java.math.BigDecimal> num10List) {
        regINS(CK_INS, cTL(num10List), xgetCValueNum10(), "NUM10");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM10: {DECIMAL(14, 4), default=[0.0000]}
     * @param num10List The collection of num10 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum10_NotInScope(Collection<java.math.BigDecimal> num10List) {
        doSetNum10_NotInScope(num10List);
    }

    protected void doSetNum10_NotInScope(Collection<java.math.BigDecimal> num10List) {
        regINS(CK_NINS, cTL(num10List), xgetCValueNum10(), "NUM10");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUM10: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum10_IsNull() { regNum10(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUM10: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum10_IsNotNull() { regNum10(CK_ISNN, DOBJ); }

    protected void regNum10(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNum10(), "NUM10"); }
    protected abstract ConditionValue xgetCValueNum10();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT1: {VARCHAR(255)}
     * @param comment1 The value of comment1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment1_Equal(String comment1) {
        doSetComment1_Equal(fRES(comment1));
    }

    protected void doSetComment1_Equal(String comment1) {
        regComment1(CK_EQ, comment1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT1: {VARCHAR(255)}
     * @param comment1 The value of comment1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment1_NotEqual(String comment1) {
        doSetComment1_NotEqual(fRES(comment1));
    }

    protected void doSetComment1_NotEqual(String comment1) {
        regComment1(CK_NES, comment1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT1: {VARCHAR(255)}
     * @param comment1 The value of comment1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment1_GreaterThan(String comment1) {
        regComment1(CK_GT, fRES(comment1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT1: {VARCHAR(255)}
     * @param comment1 The value of comment1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment1_LessThan(String comment1) {
        regComment1(CK_LT, fRES(comment1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT1: {VARCHAR(255)}
     * @param comment1 The value of comment1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment1_GreaterEqual(String comment1) {
        regComment1(CK_GE, fRES(comment1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT1: {VARCHAR(255)}
     * @param comment1 The value of comment1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment1_LessEqual(String comment1) {
        regComment1(CK_LE, fRES(comment1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMMENT1: {VARCHAR(255)}
     * @param comment1List The collection of comment1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment1_InScope(Collection<String> comment1List) {
        doSetComment1_InScope(comment1List);
    }

    protected void doSetComment1_InScope(Collection<String> comment1List) {
        regINS(CK_INS, cTL(comment1List), xgetCValueComment1(), "COMMENT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMMENT1: {VARCHAR(255)}
     * @param comment1List The collection of comment1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment1_NotInScope(Collection<String> comment1List) {
        doSetComment1_NotInScope(comment1List);
    }

    protected void doSetComment1_NotInScope(Collection<String> comment1List) {
        regINS(CK_NINS, cTL(comment1List), xgetCValueComment1(), "COMMENT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENT1: {VARCHAR(255)} <br>
     * <pre>e.g. setComment1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param comment1 The value of comment1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setComment1_LikeSearch(String comment1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(comment1), xgetCValueComment1(), "COMMENT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENT1: {VARCHAR(255)}
     * @param comment1 The value of comment1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setComment1_NotLikeSearch(String comment1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(comment1), xgetCValueComment1(), "COMMENT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENT1: {VARCHAR(255)}
     * @param comment1 The value of comment1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment1_PrefixSearch(String comment1) {
        setComment1_LikeSearch(comment1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMMENT1: {VARCHAR(255)}
     */
    public void setComment1_IsNull() { regComment1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMMENT1: {VARCHAR(255)}
     */
    public void setComment1_IsNullOrEmpty() { regComment1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMMENT1: {VARCHAR(255)}
     */
    public void setComment1_IsNotNull() { regComment1(CK_ISNN, DOBJ); }

    protected void regComment1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueComment1(), "COMMENT1"); }
    protected abstract ConditionValue xgetCValueComment1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT2: {VARCHAR(255)}
     * @param comment2 The value of comment2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment2_Equal(String comment2) {
        doSetComment2_Equal(fRES(comment2));
    }

    protected void doSetComment2_Equal(String comment2) {
        regComment2(CK_EQ, comment2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT2: {VARCHAR(255)}
     * @param comment2 The value of comment2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment2_NotEqual(String comment2) {
        doSetComment2_NotEqual(fRES(comment2));
    }

    protected void doSetComment2_NotEqual(String comment2) {
        regComment2(CK_NES, comment2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT2: {VARCHAR(255)}
     * @param comment2 The value of comment2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment2_GreaterThan(String comment2) {
        regComment2(CK_GT, fRES(comment2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT2: {VARCHAR(255)}
     * @param comment2 The value of comment2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment2_LessThan(String comment2) {
        regComment2(CK_LT, fRES(comment2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT2: {VARCHAR(255)}
     * @param comment2 The value of comment2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment2_GreaterEqual(String comment2) {
        regComment2(CK_GE, fRES(comment2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT2: {VARCHAR(255)}
     * @param comment2 The value of comment2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment2_LessEqual(String comment2) {
        regComment2(CK_LE, fRES(comment2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMMENT2: {VARCHAR(255)}
     * @param comment2List The collection of comment2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment2_InScope(Collection<String> comment2List) {
        doSetComment2_InScope(comment2List);
    }

    protected void doSetComment2_InScope(Collection<String> comment2List) {
        regINS(CK_INS, cTL(comment2List), xgetCValueComment2(), "COMMENT2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMMENT2: {VARCHAR(255)}
     * @param comment2List The collection of comment2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment2_NotInScope(Collection<String> comment2List) {
        doSetComment2_NotInScope(comment2List);
    }

    protected void doSetComment2_NotInScope(Collection<String> comment2List) {
        regINS(CK_NINS, cTL(comment2List), xgetCValueComment2(), "COMMENT2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENT2: {VARCHAR(255)} <br>
     * <pre>e.g. setComment2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param comment2 The value of comment2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setComment2_LikeSearch(String comment2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(comment2), xgetCValueComment2(), "COMMENT2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENT2: {VARCHAR(255)}
     * @param comment2 The value of comment2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setComment2_NotLikeSearch(String comment2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(comment2), xgetCValueComment2(), "COMMENT2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENT2: {VARCHAR(255)}
     * @param comment2 The value of comment2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment2_PrefixSearch(String comment2) {
        setComment2_LikeSearch(comment2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMMENT2: {VARCHAR(255)}
     */
    public void setComment2_IsNull() { regComment2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMMENT2: {VARCHAR(255)}
     */
    public void setComment2_IsNullOrEmpty() { regComment2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMMENT2: {VARCHAR(255)}
     */
    public void setComment2_IsNotNull() { regComment2(CK_ISNN, DOBJ); }

    protected void regComment2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueComment2(), "COMMENT2"); }
    protected abstract ConditionValue xgetCValueComment2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_TYPE: {VARCHAR(30)}
     * @param defaultType The value of defaultType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultType_Equal(String defaultType) {
        doSetDefaultType_Equal(fRES(defaultType));
    }

    protected void doSetDefaultType_Equal(String defaultType) {
        regDefaultType(CK_EQ, defaultType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_TYPE: {VARCHAR(30)}
     * @param defaultType The value of defaultType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultType_NotEqual(String defaultType) {
        doSetDefaultType_NotEqual(fRES(defaultType));
    }

    protected void doSetDefaultType_NotEqual(String defaultType) {
        regDefaultType(CK_NES, defaultType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_TYPE: {VARCHAR(30)}
     * @param defaultType The value of defaultType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultType_GreaterThan(String defaultType) {
        regDefaultType(CK_GT, fRES(defaultType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_TYPE: {VARCHAR(30)}
     * @param defaultType The value of defaultType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultType_LessThan(String defaultType) {
        regDefaultType(CK_LT, fRES(defaultType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_TYPE: {VARCHAR(30)}
     * @param defaultType The value of defaultType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultType_GreaterEqual(String defaultType) {
        regDefaultType(CK_GE, fRES(defaultType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_TYPE: {VARCHAR(30)}
     * @param defaultType The value of defaultType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultType_LessEqual(String defaultType) {
        regDefaultType(CK_LE, fRES(defaultType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEFAULT_TYPE: {VARCHAR(30)}
     * @param defaultTypeList The collection of defaultType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultType_InScope(Collection<String> defaultTypeList) {
        doSetDefaultType_InScope(defaultTypeList);
    }

    protected void doSetDefaultType_InScope(Collection<String> defaultTypeList) {
        regINS(CK_INS, cTL(defaultTypeList), xgetCValueDefaultType(), "DEFAULT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEFAULT_TYPE: {VARCHAR(30)}
     * @param defaultTypeList The collection of defaultType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultType_NotInScope(Collection<String> defaultTypeList) {
        doSetDefaultType_NotInScope(defaultTypeList);
    }

    protected void doSetDefaultType_NotInScope(Collection<String> defaultTypeList) {
        regINS(CK_NINS, cTL(defaultTypeList), xgetCValueDefaultType(), "DEFAULT_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_TYPE: {VARCHAR(30)} <br>
     * <pre>e.g. setDefaultType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param defaultType The value of defaultType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDefaultType_LikeSearch(String defaultType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(defaultType), xgetCValueDefaultType(), "DEFAULT_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_TYPE: {VARCHAR(30)}
     * @param defaultType The value of defaultType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDefaultType_NotLikeSearch(String defaultType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(defaultType), xgetCValueDefaultType(), "DEFAULT_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_TYPE: {VARCHAR(30)}
     * @param defaultType The value of defaultType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultType_PrefixSearch(String defaultType) {
        setDefaultType_LikeSearch(defaultType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEFAULT_TYPE: {VARCHAR(30)}
     */
    public void setDefaultType_IsNull() { regDefaultType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DEFAULT_TYPE: {VARCHAR(30)}
     */
    public void setDefaultType_IsNullOrEmpty() { regDefaultType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEFAULT_TYPE: {VARCHAR(30)}
     */
    public void setDefaultType_IsNotNull() { regDefaultType(CK_ISNN, DOBJ); }

    protected void regDefaultType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDefaultType(), "DEFAULT_TYPE"); }
    protected abstract ConditionValue xgetCValueDefaultType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {VARCHAR(30)}
     * @param systemType The value of systemType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_Equal(String systemType) {
        doSetSystemType_Equal(fRES(systemType));
    }

    protected void doSetSystemType_Equal(String systemType) {
        regSystemType(CK_EQ, systemType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {VARCHAR(30)}
     * @param systemType The value of systemType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_NotEqual(String systemType) {
        doSetSystemType_NotEqual(fRES(systemType));
    }

    protected void doSetSystemType_NotEqual(String systemType) {
        regSystemType(CK_NES, systemType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {VARCHAR(30)}
     * @param systemType The value of systemType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_GreaterThan(String systemType) {
        regSystemType(CK_GT, fRES(systemType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {VARCHAR(30)}
     * @param systemType The value of systemType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_LessThan(String systemType) {
        regSystemType(CK_LT, fRES(systemType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {VARCHAR(30)}
     * @param systemType The value of systemType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_GreaterEqual(String systemType) {
        regSystemType(CK_GE, fRES(systemType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {VARCHAR(30)}
     * @param systemType The value of systemType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_LessEqual(String systemType) {
        regSystemType(CK_LE, fRES(systemType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {VARCHAR(30)}
     * @param systemTypeList The collection of systemType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_InScope(Collection<String> systemTypeList) {
        doSetSystemType_InScope(systemTypeList);
    }

    protected void doSetSystemType_InScope(Collection<String> systemTypeList) {
        regINS(CK_INS, cTL(systemTypeList), xgetCValueSystemType(), "SYSTEM_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {VARCHAR(30)}
     * @param systemTypeList The collection of systemType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_NotInScope(Collection<String> systemTypeList) {
        doSetSystemType_NotInScope(systemTypeList);
    }

    protected void doSetSystemType_NotInScope(Collection<String> systemTypeList) {
        regINS(CK_NINS, cTL(systemTypeList), xgetCValueSystemType(), "SYSTEM_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {VARCHAR(30)} <br>
     * <pre>e.g. setSystemType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param systemType The value of systemType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSystemType_LikeSearch(String systemType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(systemType), xgetCValueSystemType(), "SYSTEM_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {VARCHAR(30)}
     * @param systemType The value of systemType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSystemType_NotLikeSearch(String systemType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(systemType), xgetCValueSystemType(), "SYSTEM_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {VARCHAR(30)}
     * @param systemType The value of systemType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_PrefixSearch(String systemType) {
        setSystemType_LikeSearch(systemType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {VARCHAR(30)}
     */
    public void setSystemType_IsNull() { regSystemType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {VARCHAR(30)}
     */
    public void setSystemType_IsNullOrEmpty() { regSystemType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {VARCHAR(30)}
     */
    public void setSystemType_IsNotNull() { regSystemType(CK_ISNN, DOBJ); }

    protected void regSystemType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSystemType(), "SYSTEM_TYPE"); }
    protected abstract ConditionValue xgetCValueSystemType();

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
    public HpSLCFunction<MGeneralCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MGeneralCB.class);
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
    public HpSLCFunction<MGeneralCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MGeneralCB.class);
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
    public HpSLCFunction<MGeneralCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MGeneralCB.class);
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
    public HpSLCFunction<MGeneralCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MGeneralCB.class);
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
    public HpSLCFunction<MGeneralCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MGeneralCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MGeneralCB&gt;() {
     *     public void query(MGeneralCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MGeneralCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MGeneralCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MGeneralCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MGeneralCQ sq);

    protected MGeneralCB xcreateScalarConditionCB() {
        MGeneralCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MGeneralCB xcreateScalarConditionPartitionByCB() {
        MGeneralCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MGeneralCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MGeneralCB cb = new MGeneralCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "GENERAL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MGeneralCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MGeneralCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MGeneralCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MGeneralCB cb = new MGeneralCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "GENERAL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MGeneralCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MGeneralCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MGeneralCB cb = new MGeneralCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MGeneralCQ sq);

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
    protected MGeneralCB newMyCB() {
        return new MGeneralCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MGeneralCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
