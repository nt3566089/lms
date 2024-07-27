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
 * The abstract condition-query of b_property.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBPropertyCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBPropertyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "b_property";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param propertyId The value of propertyId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPropertyId_Equal(Long propertyId) {
        doSetPropertyId_Equal(propertyId);
    }

    protected void doSetPropertyId_Equal(Long propertyId) {
        regPropertyId(CK_EQ, propertyId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param propertyId The value of propertyId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPropertyId_NotEqual(Long propertyId) {
        doSetPropertyId_NotEqual(propertyId);
    }

    protected void doSetPropertyId_NotEqual(Long propertyId) {
        regPropertyId(CK_NES, propertyId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param propertyId The value of propertyId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPropertyId_GreaterThan(Long propertyId) {
        regPropertyId(CK_GT, propertyId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param propertyId The value of propertyId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPropertyId_LessThan(Long propertyId) {
        regPropertyId(CK_LT, propertyId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param propertyId The value of propertyId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPropertyId_GreaterEqual(Long propertyId) {
        regPropertyId(CK_GE, propertyId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param propertyId The value of propertyId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPropertyId_LessEqual(Long propertyId) {
        regPropertyId(CK_LE, propertyId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of propertyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of propertyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPropertyId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePropertyId(), "PROPERTY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROPERTY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param propertyIdList The collection of propertyId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyId_InScope(Collection<Long> propertyIdList) {
        doSetPropertyId_InScope(propertyIdList);
    }

    protected void doSetPropertyId_InScope(Collection<Long> propertyIdList) {
        regINS(CK_INS, cTL(propertyIdList), xgetCValuePropertyId(), "PROPERTY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROPERTY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param propertyIdList The collection of propertyId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyId_NotInScope(Collection<Long> propertyIdList) {
        doSetPropertyId_NotInScope(propertyIdList);
    }

    protected void doSetPropertyId_NotInScope(Collection<Long> propertyIdList) {
        regINS(CK_NINS, cTL(propertyIdList), xgetCValuePropertyId(), "PROPERTY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROPERTY_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPropertyId_IsNull() { regPropertyId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROPERTY_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPropertyId_IsNotNull() { regPropertyId(CK_ISNN, DOBJ); }

    protected void regPropertyId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePropertyId(), "PROPERTY_ID"); }
    protected abstract ConditionValue xgetCValuePropertyId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_NM: {UQ, NotNull, VARCHAR(60)}
     * @param propertyNm The value of propertyNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyNm_Equal(String propertyNm) {
        doSetPropertyNm_Equal(fRES(propertyNm));
    }

    protected void doSetPropertyNm_Equal(String propertyNm) {
        regPropertyNm(CK_EQ, propertyNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_NM: {UQ, NotNull, VARCHAR(60)}
     * @param propertyNm The value of propertyNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyNm_NotEqual(String propertyNm) {
        doSetPropertyNm_NotEqual(fRES(propertyNm));
    }

    protected void doSetPropertyNm_NotEqual(String propertyNm) {
        regPropertyNm(CK_NES, propertyNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_NM: {UQ, NotNull, VARCHAR(60)}
     * @param propertyNm The value of propertyNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyNm_GreaterThan(String propertyNm) {
        regPropertyNm(CK_GT, fRES(propertyNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_NM: {UQ, NotNull, VARCHAR(60)}
     * @param propertyNm The value of propertyNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyNm_LessThan(String propertyNm) {
        regPropertyNm(CK_LT, fRES(propertyNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_NM: {UQ, NotNull, VARCHAR(60)}
     * @param propertyNm The value of propertyNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyNm_GreaterEqual(String propertyNm) {
        regPropertyNm(CK_GE, fRES(propertyNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_NM: {UQ, NotNull, VARCHAR(60)}
     * @param propertyNm The value of propertyNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyNm_LessEqual(String propertyNm) {
        regPropertyNm(CK_LE, fRES(propertyNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROPERTY_NM: {UQ, NotNull, VARCHAR(60)}
     * @param propertyNmList The collection of propertyNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyNm_InScope(Collection<String> propertyNmList) {
        doSetPropertyNm_InScope(propertyNmList);
    }

    protected void doSetPropertyNm_InScope(Collection<String> propertyNmList) {
        regINS(CK_INS, cTL(propertyNmList), xgetCValuePropertyNm(), "PROPERTY_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROPERTY_NM: {UQ, NotNull, VARCHAR(60)}
     * @param propertyNmList The collection of propertyNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyNm_NotInScope(Collection<String> propertyNmList) {
        doSetPropertyNm_NotInScope(propertyNmList);
    }

    protected void doSetPropertyNm_NotInScope(Collection<String> propertyNmList) {
        regINS(CK_NINS, cTL(propertyNmList), xgetCValuePropertyNm(), "PROPERTY_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROPERTY_NM: {UQ, NotNull, VARCHAR(60)} <br>
     * <pre>e.g. setPropertyNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param propertyNm The value of propertyNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPropertyNm_LikeSearch(String propertyNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(propertyNm), xgetCValuePropertyNm(), "PROPERTY_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROPERTY_NM: {UQ, NotNull, VARCHAR(60)}
     * @param propertyNm The value of propertyNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPropertyNm_NotLikeSearch(String propertyNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(propertyNm), xgetCValuePropertyNm(), "PROPERTY_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROPERTY_NM: {UQ, NotNull, VARCHAR(60)}
     * @param propertyNm The value of propertyNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyNm_PrefixSearch(String propertyNm) {
        setPropertyNm_LikeSearch(propertyNm, xcLSOPPre());
    }

    protected void regPropertyNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePropertyNm(), "PROPERTY_NM"); }
    protected abstract ConditionValue xgetCValuePropertyNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_VALUE: {NotNull, VARCHAR(60)}
     * @param propertyValue The value of propertyValue as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyValue_Equal(String propertyValue) {
        doSetPropertyValue_Equal(fRES(propertyValue));
    }

    protected void doSetPropertyValue_Equal(String propertyValue) {
        regPropertyValue(CK_EQ, propertyValue);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_VALUE: {NotNull, VARCHAR(60)}
     * @param propertyValue The value of propertyValue as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyValue_NotEqual(String propertyValue) {
        doSetPropertyValue_NotEqual(fRES(propertyValue));
    }

    protected void doSetPropertyValue_NotEqual(String propertyValue) {
        regPropertyValue(CK_NES, propertyValue);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_VALUE: {NotNull, VARCHAR(60)}
     * @param propertyValue The value of propertyValue as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyValue_GreaterThan(String propertyValue) {
        regPropertyValue(CK_GT, fRES(propertyValue));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_VALUE: {NotNull, VARCHAR(60)}
     * @param propertyValue The value of propertyValue as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyValue_LessThan(String propertyValue) {
        regPropertyValue(CK_LT, fRES(propertyValue));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_VALUE: {NotNull, VARCHAR(60)}
     * @param propertyValue The value of propertyValue as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyValue_GreaterEqual(String propertyValue) {
        regPropertyValue(CK_GE, fRES(propertyValue));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_VALUE: {NotNull, VARCHAR(60)}
     * @param propertyValue The value of propertyValue as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyValue_LessEqual(String propertyValue) {
        regPropertyValue(CK_LE, fRES(propertyValue));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROPERTY_VALUE: {NotNull, VARCHAR(60)}
     * @param propertyValueList The collection of propertyValue as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyValue_InScope(Collection<String> propertyValueList) {
        doSetPropertyValue_InScope(propertyValueList);
    }

    protected void doSetPropertyValue_InScope(Collection<String> propertyValueList) {
        regINS(CK_INS, cTL(propertyValueList), xgetCValuePropertyValue(), "PROPERTY_VALUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROPERTY_VALUE: {NotNull, VARCHAR(60)}
     * @param propertyValueList The collection of propertyValue as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyValue_NotInScope(Collection<String> propertyValueList) {
        doSetPropertyValue_NotInScope(propertyValueList);
    }

    protected void doSetPropertyValue_NotInScope(Collection<String> propertyValueList) {
        regINS(CK_NINS, cTL(propertyValueList), xgetCValuePropertyValue(), "PROPERTY_VALUE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROPERTY_VALUE: {NotNull, VARCHAR(60)} <br>
     * <pre>e.g. setPropertyValue_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param propertyValue The value of propertyValue as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPropertyValue_LikeSearch(String propertyValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(propertyValue), xgetCValuePropertyValue(), "PROPERTY_VALUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROPERTY_VALUE: {NotNull, VARCHAR(60)}
     * @param propertyValue The value of propertyValue as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPropertyValue_NotLikeSearch(String propertyValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(propertyValue), xgetCValuePropertyValue(), "PROPERTY_VALUE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROPERTY_VALUE: {NotNull, VARCHAR(60)}
     * @param propertyValue The value of propertyValue as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyValue_PrefixSearch(String propertyValue) {
        setPropertyValue_LikeSearch(propertyValue, xcLSOPPre());
    }

    protected void regPropertyValue(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePropertyValue(), "PROPERTY_VALUE"); }
    protected abstract ConditionValue xgetCValuePropertyValue();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_COMMENT: {VARCHAR(60)}
     * @param propertyComment The value of propertyComment as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyComment_Equal(String propertyComment) {
        doSetPropertyComment_Equal(fRES(propertyComment));
    }

    protected void doSetPropertyComment_Equal(String propertyComment) {
        regPropertyComment(CK_EQ, propertyComment);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_COMMENT: {VARCHAR(60)}
     * @param propertyComment The value of propertyComment as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyComment_NotEqual(String propertyComment) {
        doSetPropertyComment_NotEqual(fRES(propertyComment));
    }

    protected void doSetPropertyComment_NotEqual(String propertyComment) {
        regPropertyComment(CK_NES, propertyComment);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_COMMENT: {VARCHAR(60)}
     * @param propertyComment The value of propertyComment as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyComment_GreaterThan(String propertyComment) {
        regPropertyComment(CK_GT, fRES(propertyComment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_COMMENT: {VARCHAR(60)}
     * @param propertyComment The value of propertyComment as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyComment_LessThan(String propertyComment) {
        regPropertyComment(CK_LT, fRES(propertyComment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_COMMENT: {VARCHAR(60)}
     * @param propertyComment The value of propertyComment as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyComment_GreaterEqual(String propertyComment) {
        regPropertyComment(CK_GE, fRES(propertyComment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPERTY_COMMENT: {VARCHAR(60)}
     * @param propertyComment The value of propertyComment as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyComment_LessEqual(String propertyComment) {
        regPropertyComment(CK_LE, fRES(propertyComment));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROPERTY_COMMENT: {VARCHAR(60)}
     * @param propertyCommentList The collection of propertyComment as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyComment_InScope(Collection<String> propertyCommentList) {
        doSetPropertyComment_InScope(propertyCommentList);
    }

    protected void doSetPropertyComment_InScope(Collection<String> propertyCommentList) {
        regINS(CK_INS, cTL(propertyCommentList), xgetCValuePropertyComment(), "PROPERTY_COMMENT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROPERTY_COMMENT: {VARCHAR(60)}
     * @param propertyCommentList The collection of propertyComment as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyComment_NotInScope(Collection<String> propertyCommentList) {
        doSetPropertyComment_NotInScope(propertyCommentList);
    }

    protected void doSetPropertyComment_NotInScope(Collection<String> propertyCommentList) {
        regINS(CK_NINS, cTL(propertyCommentList), xgetCValuePropertyComment(), "PROPERTY_COMMENT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROPERTY_COMMENT: {VARCHAR(60)} <br>
     * <pre>e.g. setPropertyComment_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param propertyComment The value of propertyComment as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPropertyComment_LikeSearch(String propertyComment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(propertyComment), xgetCValuePropertyComment(), "PROPERTY_COMMENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROPERTY_COMMENT: {VARCHAR(60)}
     * @param propertyComment The value of propertyComment as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPropertyComment_NotLikeSearch(String propertyComment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(propertyComment), xgetCValuePropertyComment(), "PROPERTY_COMMENT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROPERTY_COMMENT: {VARCHAR(60)}
     * @param propertyComment The value of propertyComment as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyComment_PrefixSearch(String propertyComment) {
        setPropertyComment_LikeSearch(propertyComment, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROPERTY_COMMENT: {VARCHAR(60)}
     */
    public void setPropertyComment_IsNull() { regPropertyComment(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROPERTY_COMMENT: {VARCHAR(60)}
     */
    public void setPropertyComment_IsNullOrEmpty() { regPropertyComment(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROPERTY_COMMENT: {VARCHAR(60)}
     */
    public void setPropertyComment_IsNotNull() { regPropertyComment(CK_ISNN, DOBJ); }

    protected void regPropertyComment(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePropertyComment(), "PROPERTY_COMMENT"); }
    protected abstract ConditionValue xgetCValuePropertyComment();

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
    public HpSLCFunction<BPropertyCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BPropertyCB.class);
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
    public HpSLCFunction<BPropertyCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BPropertyCB.class);
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
    public HpSLCFunction<BPropertyCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BPropertyCB.class);
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
    public HpSLCFunction<BPropertyCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BPropertyCB.class);
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
    public HpSLCFunction<BPropertyCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BPropertyCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BPropertyCB&gt;() {
     *     public void query(BPropertyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BPropertyCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BPropertyCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BPropertyCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BPropertyCQ sq);

    protected BPropertyCB xcreateScalarConditionCB() {
        BPropertyCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BPropertyCB xcreateScalarConditionPartitionByCB() {
        BPropertyCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BPropertyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BPropertyCB cb = new BPropertyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PROPERTY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BPropertyCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BPropertyCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BPropertyCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BPropertyCB cb = new BPropertyCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PROPERTY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BPropertyCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BPropertyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BPropertyCB cb = new BPropertyCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BPropertyCQ sq);

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
    protected BPropertyCB newMyCB() {
        return new BPropertyCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BPropertyCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}