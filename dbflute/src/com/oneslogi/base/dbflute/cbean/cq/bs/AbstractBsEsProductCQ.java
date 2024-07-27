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
 * The abstract condition-query of es_product.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEsProductCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEsProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "es_product";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19)}
     * @param productId The value of productId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_Equal(Long productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Long productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19)}
     * @param productId The value of productId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_NotEqual(Long productId) {
        doSetProductId_NotEqual(productId);
    }

    protected void doSetProductId_NotEqual(Long productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19)}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19)}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19)}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19)}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19)}
     * @param productIdList The collection of productId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_InScope(Collection<Long> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Long> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19)}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setProductId_IsNull() { regProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setProductId_IsNotNull() { regProductId(CK_ISNN, DOBJ); }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlg The value of sendFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_Equal(String sendFlg) {
        doSetSendFlg_Equal(fRES(sendFlg));
    }

    protected void doSetSendFlg_Equal(String sendFlg) {
        regSendFlg(CK_EQ, sendFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlg The value of sendFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_NotEqual(String sendFlg) {
        doSetSendFlg_NotEqual(fRES(sendFlg));
    }

    protected void doSetSendFlg_NotEqual(String sendFlg) {
        regSendFlg(CK_NES, sendFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlg The value of sendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_GreaterThan(String sendFlg) {
        regSendFlg(CK_GT, fRES(sendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlg The value of sendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_LessThan(String sendFlg) {
        regSendFlg(CK_LT, fRES(sendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlg The value of sendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_GreaterEqual(String sendFlg) {
        regSendFlg(CK_GE, fRES(sendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlg The value of sendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_LessEqual(String sendFlg) {
        regSendFlg(CK_LE, fRES(sendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlgList The collection of sendFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_InScope(Collection<String> sendFlgList) {
        doSetSendFlg_InScope(sendFlgList);
    }

    protected void doSetSendFlg_InScope(Collection<String> sendFlgList) {
        regINS(CK_INS, cTL(sendFlgList), xgetCValueSendFlg(), "SEND_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlgList The collection of sendFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_NotInScope(Collection<String> sendFlgList) {
        doSetSendFlg_NotInScope(sendFlgList);
    }

    protected void doSetSendFlg_NotInScope(Collection<String> sendFlgList) {
        regINS(CK_NINS, cTL(sendFlgList), xgetCValueSendFlg(), "SEND_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * <pre>e.g. setSendFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sendFlg The value of sendFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSendFlg_LikeSearch(String sendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sendFlg), xgetCValueSendFlg(), "SEND_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlg The value of sendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSendFlg_NotLikeSearch(String sendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sendFlg), xgetCValueSendFlg(), "SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlg The value of sendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_PrefixSearch(String sendFlg) {
        setSendFlg_LikeSearch(sendFlg, xcLSOPPre());
    }

    protected void regSendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendFlg(), "SEND_FLG"); }
    protected abstract ConditionValue xgetCValueSendFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
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
     * HINMOKU_CD: {VARCHAR(100)}
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
     * HINMOKU_CD: {VARCHAR(100)}
     * @param hinmokuCd The value of hinmokuCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_GreaterThan(String hinmokuCd) {
        regHinmokuCd(CK_GT, fRES(hinmokuCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @param hinmokuCd The value of hinmokuCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_LessThan(String hinmokuCd) {
        regHinmokuCd(CK_LT, fRES(hinmokuCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @param hinmokuCd The value of hinmokuCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_GreaterEqual(String hinmokuCd) {
        regHinmokuCd(CK_GE, fRES(hinmokuCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @param hinmokuCd The value of hinmokuCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_LessEqual(String hinmokuCd) {
        regHinmokuCd(CK_LE, fRES(hinmokuCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
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
     * HINMOKU_CD: {VARCHAR(100)}
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
     * HINMOKU_CD: {VARCHAR(100)} <br>
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
     * HINMOKU_CD: {VARCHAR(100)}
     * @param hinmokuCd The value of hinmokuCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHinmokuCd_NotLikeSearch(String hinmokuCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hinmokuCd), xgetCValueHinmokuCd(), "HINMOKU_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @param hinmokuCd The value of hinmokuCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_PrefixSearch(String hinmokuCd) {
        setHinmokuCd_LikeSearch(hinmokuCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     */
    public void setHinmokuCd_IsNull() { regHinmokuCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     */
    public void setHinmokuCd_IsNullOrEmpty() { regHinmokuCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @param hinmokuText The value of hinmokuText as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_Equal(String hinmokuText) {
        doSetHinmokuText_Equal(fRES(hinmokuText));
    }

    protected void doSetHinmokuText_Equal(String hinmokuText) {
        regHinmokuText(CK_EQ, hinmokuText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @param hinmokuText The value of hinmokuText as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_NotEqual(String hinmokuText) {
        doSetHinmokuText_NotEqual(fRES(hinmokuText));
    }

    protected void doSetHinmokuText_NotEqual(String hinmokuText) {
        regHinmokuText(CK_NES, hinmokuText);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @param hinmokuText The value of hinmokuText as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_GreaterThan(String hinmokuText) {
        regHinmokuText(CK_GT, fRES(hinmokuText));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @param hinmokuText The value of hinmokuText as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_LessThan(String hinmokuText) {
        regHinmokuText(CK_LT, fRES(hinmokuText));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @param hinmokuText The value of hinmokuText as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_GreaterEqual(String hinmokuText) {
        regHinmokuText(CK_GE, fRES(hinmokuText));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @param hinmokuText The value of hinmokuText as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_LessEqual(String hinmokuText) {
        regHinmokuText(CK_LE, fRES(hinmokuText));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @param hinmokuTextList The collection of hinmokuText as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_InScope(Collection<String> hinmokuTextList) {
        doSetHinmokuText_InScope(hinmokuTextList);
    }

    protected void doSetHinmokuText_InScope(Collection<String> hinmokuTextList) {
        regINS(CK_INS, cTL(hinmokuTextList), xgetCValueHinmokuText(), "HINMOKU_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @param hinmokuTextList The collection of hinmokuText as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_NotInScope(Collection<String> hinmokuTextList) {
        doSetHinmokuText_NotInScope(hinmokuTextList);
    }

    protected void doSetHinmokuText_NotInScope(Collection<String> hinmokuTextList) {
        regINS(CK_NINS, cTL(hinmokuTextList), xgetCValueHinmokuText(), "HINMOKU_TEXT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)} <br>
     * <pre>e.g. setHinmokuText_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hinmokuText The value of hinmokuText as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHinmokuText_LikeSearch(String hinmokuText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hinmokuText), xgetCValueHinmokuText(), "HINMOKU_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @param hinmokuText The value of hinmokuText as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHinmokuText_NotLikeSearch(String hinmokuText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hinmokuText), xgetCValueHinmokuText(), "HINMOKU_TEXT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @param hinmokuText The value of hinmokuText as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_PrefixSearch(String hinmokuText) {
        setHinmokuText_LikeSearch(hinmokuText, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     */
    public void setHinmokuText_IsNull() { regHinmokuText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     */
    public void setHinmokuText_IsNullOrEmpty() { regHinmokuText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     */
    public void setHinmokuText_IsNotNull() { regHinmokuText(CK_ISNN, DOBJ); }

    protected void regHinmokuText(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHinmokuText(), "HINMOKU_TEXT"); }
    protected abstract ConditionValue xgetCValueHinmokuText();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_Equal(String janCd) {
        doSetJanCd_Equal(fRES(janCd));
    }

    protected void doSetJanCd_Equal(String janCd) {
        regJanCd(CK_EQ, janCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_NotEqual(String janCd) {
        doSetJanCd_NotEqual(fRES(janCd));
    }

    protected void doSetJanCd_NotEqual(String janCd) {
        regJanCd(CK_NES, janCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_GreaterThan(String janCd) {
        regJanCd(CK_GT, fRES(janCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_LessThan(String janCd) {
        regJanCd(CK_LT, fRES(janCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_GreaterEqual(String janCd) {
        regJanCd(CK_GE, fRES(janCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_LessEqual(String janCd) {
        regJanCd(CK_LE, fRES(janCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCdList The collection of janCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_InScope(Collection<String> janCdList) {
        doSetJanCd_InScope(janCdList);
    }

    protected void doSetJanCd_InScope(Collection<String> janCdList) {
        regINS(CK_INS, cTL(janCdList), xgetCValueJanCd(), "JAN_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCdList The collection of janCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_NotInScope(Collection<String> janCdList) {
        doSetJanCd_NotInScope(janCdList);
    }

    protected void doSetJanCd_NotInScope(Collection<String> janCdList) {
        regINS(CK_NINS, cTL(janCdList), xgetCValueJanCd(), "JAN_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setJanCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param janCd The value of janCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setJanCd_LikeSearch(String janCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(janCd), xgetCValueJanCd(), "JAN_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setJanCd_NotLikeSearch(String janCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(janCd), xgetCValueJanCd(), "JAN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_PrefixSearch(String janCd) {
        setJanCd_LikeSearch(janCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     */
    public void setJanCd_IsNull() { regJanCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     */
    public void setJanCd_IsNullOrEmpty() { regJanCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     */
    public void setJanCd_IsNotNull() { regJanCd(CK_ISNN, DOBJ); }

    protected void regJanCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJanCd(), "JAN_CD"); }
    protected abstract ConditionValue xgetCValueJanCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SIZE_NM: {VARCHAR(60)}
     * @param sizeNm The value of sizeNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSizeNm_Equal(String sizeNm) {
        doSetSizeNm_Equal(fRES(sizeNm));
    }

    protected void doSetSizeNm_Equal(String sizeNm) {
        regSizeNm(CK_EQ, sizeNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SIZE_NM: {VARCHAR(60)}
     * @param sizeNm The value of sizeNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSizeNm_NotEqual(String sizeNm) {
        doSetSizeNm_NotEqual(fRES(sizeNm));
    }

    protected void doSetSizeNm_NotEqual(String sizeNm) {
        regSizeNm(CK_NES, sizeNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SIZE_NM: {VARCHAR(60)}
     * @param sizeNm The value of sizeNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSizeNm_GreaterThan(String sizeNm) {
        regSizeNm(CK_GT, fRES(sizeNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SIZE_NM: {VARCHAR(60)}
     * @param sizeNm The value of sizeNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSizeNm_LessThan(String sizeNm) {
        regSizeNm(CK_LT, fRES(sizeNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SIZE_NM: {VARCHAR(60)}
     * @param sizeNm The value of sizeNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSizeNm_GreaterEqual(String sizeNm) {
        regSizeNm(CK_GE, fRES(sizeNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SIZE_NM: {VARCHAR(60)}
     * @param sizeNm The value of sizeNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSizeNm_LessEqual(String sizeNm) {
        regSizeNm(CK_LE, fRES(sizeNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SIZE_NM: {VARCHAR(60)}
     * @param sizeNmList The collection of sizeNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSizeNm_InScope(Collection<String> sizeNmList) {
        doSetSizeNm_InScope(sizeNmList);
    }

    protected void doSetSizeNm_InScope(Collection<String> sizeNmList) {
        regINS(CK_INS, cTL(sizeNmList), xgetCValueSizeNm(), "SIZE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SIZE_NM: {VARCHAR(60)}
     * @param sizeNmList The collection of sizeNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSizeNm_NotInScope(Collection<String> sizeNmList) {
        doSetSizeNm_NotInScope(sizeNmList);
    }

    protected void doSetSizeNm_NotInScope(Collection<String> sizeNmList) {
        regINS(CK_NINS, cTL(sizeNmList), xgetCValueSizeNm(), "SIZE_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SIZE_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setSizeNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sizeNm The value of sizeNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSizeNm_LikeSearch(String sizeNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sizeNm), xgetCValueSizeNm(), "SIZE_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SIZE_NM: {VARCHAR(60)}
     * @param sizeNm The value of sizeNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSizeNm_NotLikeSearch(String sizeNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sizeNm), xgetCValueSizeNm(), "SIZE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SIZE_NM: {VARCHAR(60)}
     * @param sizeNm The value of sizeNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSizeNm_PrefixSearch(String sizeNm) {
        setSizeNm_LikeSearch(sizeNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SIZE_NM: {VARCHAR(60)}
     */
    public void setSizeNm_IsNull() { regSizeNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SIZE_NM: {VARCHAR(60)}
     */
    public void setSizeNm_IsNullOrEmpty() { regSizeNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SIZE_NM: {VARCHAR(60)}
     */
    public void setSizeNm_IsNotNull() { regSizeNm(CK_ISNN, DOBJ); }

    protected void regSizeNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSizeNm(), "SIZE_NM"); }
    protected abstract ConditionValue xgetCValueSizeNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCd The value of caseTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseTypeCd_Equal(String caseTypeCd) {
        doSetCaseTypeCd_Equal(fRES(caseTypeCd));
    }

    protected void doSetCaseTypeCd_Equal(String caseTypeCd) {
        regCaseTypeCd(CK_EQ, caseTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCd The value of caseTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseTypeCd_NotEqual(String caseTypeCd) {
        doSetCaseTypeCd_NotEqual(fRES(caseTypeCd));
    }

    protected void doSetCaseTypeCd_NotEqual(String caseTypeCd) {
        regCaseTypeCd(CK_NES, caseTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCd The value of caseTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseTypeCd_GreaterThan(String caseTypeCd) {
        regCaseTypeCd(CK_GT, fRES(caseTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCd The value of caseTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseTypeCd_LessThan(String caseTypeCd) {
        regCaseTypeCd(CK_LT, fRES(caseTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCd The value of caseTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseTypeCd_GreaterEqual(String caseTypeCd) {
        regCaseTypeCd(CK_GE, fRES(caseTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCd The value of caseTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseTypeCd_LessEqual(String caseTypeCd) {
        regCaseTypeCd(CK_LE, fRES(caseTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCdList The collection of caseTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseTypeCd_InScope(Collection<String> caseTypeCdList) {
        doSetCaseTypeCd_InScope(caseTypeCdList);
    }

    protected void doSetCaseTypeCd_InScope(Collection<String> caseTypeCdList) {
        regINS(CK_INS, cTL(caseTypeCdList), xgetCValueCaseTypeCd(), "CASE_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCdList The collection of caseTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseTypeCd_NotInScope(Collection<String> caseTypeCdList) {
        doSetCaseTypeCd_NotInScope(caseTypeCdList);
    }

    protected void doSetCaseTypeCd_NotInScope(Collection<String> caseTypeCdList) {
        regINS(CK_NINS, cTL(caseTypeCdList), xgetCValueCaseTypeCd(), "CASE_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setCaseTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseTypeCd The value of caseTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseTypeCd_LikeSearch(String caseTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseTypeCd), xgetCValueCaseTypeCd(), "CASE_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCd The value of caseTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseTypeCd_NotLikeSearch(String caseTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseTypeCd), xgetCValueCaseTypeCd(), "CASE_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCd The value of caseTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseTypeCd_PrefixSearch(String caseTypeCd) {
        setCaseTypeCd_LikeSearch(caseTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     */
    public void setCaseTypeCd_IsNull() { regCaseTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     */
    public void setCaseTypeCd_IsNullOrEmpty() { regCaseTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     */
    public void setCaseTypeCd_IsNotNull() { regCaseTypeCd(CK_ISNN, DOBJ); }

    protected void regCaseTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseTypeCd(), "CASE_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueCaseTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {VARCHAR(30)}
     * @param unitNum The value of unitNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_Equal(String unitNum) {
        doSetUnitNum_Equal(fRES(unitNum));
    }

    protected void doSetUnitNum_Equal(String unitNum) {
        regUnitNum(CK_EQ, unitNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {VARCHAR(30)}
     * @param unitNum The value of unitNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_NotEqual(String unitNum) {
        doSetUnitNum_NotEqual(fRES(unitNum));
    }

    protected void doSetUnitNum_NotEqual(String unitNum) {
        regUnitNum(CK_NES, unitNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {VARCHAR(30)}
     * @param unitNum The value of unitNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_GreaterThan(String unitNum) {
        regUnitNum(CK_GT, fRES(unitNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {VARCHAR(30)}
     * @param unitNum The value of unitNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_LessThan(String unitNum) {
        regUnitNum(CK_LT, fRES(unitNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {VARCHAR(30)}
     * @param unitNum The value of unitNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_GreaterEqual(String unitNum) {
        regUnitNum(CK_GE, fRES(unitNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {VARCHAR(30)}
     * @param unitNum The value of unitNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_LessEqual(String unitNum) {
        regUnitNum(CK_LE, fRES(unitNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT_NUM: {VARCHAR(30)}
     * @param unitNumList The collection of unitNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_InScope(Collection<String> unitNumList) {
        doSetUnitNum_InScope(unitNumList);
    }

    protected void doSetUnitNum_InScope(Collection<String> unitNumList) {
        regINS(CK_INS, cTL(unitNumList), xgetCValueUnitNum(), "UNIT_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT_NUM: {VARCHAR(30)}
     * @param unitNumList The collection of unitNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_NotInScope(Collection<String> unitNumList) {
        doSetUnitNum_NotInScope(unitNumList);
    }

    protected void doSetUnitNum_NotInScope(Collection<String> unitNumList) {
        regINS(CK_NINS, cTL(unitNumList), xgetCValueUnitNum(), "UNIT_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_NUM: {VARCHAR(30)} <br>
     * <pre>e.g. setUnitNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param unitNum The value of unitNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUnitNum_LikeSearch(String unitNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(unitNum), xgetCValueUnitNum(), "UNIT_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_NUM: {VARCHAR(30)}
     * @param unitNum The value of unitNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnitNum_NotLikeSearch(String unitNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unitNum), xgetCValueUnitNum(), "UNIT_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_NUM: {VARCHAR(30)}
     * @param unitNum The value of unitNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_PrefixSearch(String unitNum) {
        setUnitNum_LikeSearch(unitNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_NUM: {VARCHAR(30)}
     */
    public void setUnitNum_IsNull() { regUnitNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT_NUM: {VARCHAR(30)}
     */
    public void setUnitNum_IsNullOrEmpty() { regUnitNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_NUM: {VARCHAR(30)}
     */
    public void setUnitNum_IsNotNull() { regUnitNum(CK_ISNN, DOBJ); }

    protected void regUnitNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitNum(), "UNIT_NUM"); }
    protected abstract ConditionValue xgetCValueUnitNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
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
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
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
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @param logiWeightFlg The value of logiWeightFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_GreaterThan(String logiWeightFlg) {
        regLogiWeightFlg(CK_GT, fRES(logiWeightFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @param logiWeightFlg The value of logiWeightFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_LessThan(String logiWeightFlg) {
        regLogiWeightFlg(CK_LT, fRES(logiWeightFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @param logiWeightFlg The value of logiWeightFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_GreaterEqual(String logiWeightFlg) {
        regLogiWeightFlg(CK_GE, fRES(logiWeightFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @param logiWeightFlg The value of logiWeightFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_LessEqual(String logiWeightFlg) {
        regLogiWeightFlg(CK_LE, fRES(logiWeightFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
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
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
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
     * LOGI_WEIGHT_FLG: {VARCHAR(30)} <br>
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
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @param logiWeightFlg The value of logiWeightFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogiWeightFlg_NotLikeSearch(String logiWeightFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logiWeightFlg), xgetCValueLogiWeightFlg(), "LOGI_WEIGHT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @param logiWeightFlg The value of logiWeightFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_PrefixSearch(String logiWeightFlg) {
        setLogiWeightFlg_LikeSearch(logiWeightFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     */
    public void setLogiWeightFlg_IsNull() { regLogiWeightFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     */
    public void setLogiWeightFlg_IsNullOrEmpty() { regLogiWeightFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     */
    public void setLogiWeightFlg_IsNotNull() { regLogiWeightFlg(CK_ISNN, DOBJ); }

    protected void regLogiWeightFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogiWeightFlg(), "LOGI_WEIGHT_FLG"); }
    protected abstract ConditionValue xgetCValueLogiWeightFlg();

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
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_Equal(String unitNm) {
        doSetUnitNm_Equal(fRES(unitNm));
    }

    protected void doSetUnitNm_Equal(String unitNm) {
        regUnitNm(CK_EQ, unitNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_NotEqual(String unitNm) {
        doSetUnitNm_NotEqual(fRES(unitNm));
    }

    protected void doSetUnitNm_NotEqual(String unitNm) {
        regUnitNm(CK_NES, unitNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_GreaterThan(String unitNm) {
        regUnitNm(CK_GT, fRES(unitNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_LessThan(String unitNm) {
        regUnitNm(CK_LT, fRES(unitNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_GreaterEqual(String unitNm) {
        regUnitNm(CK_GE, fRES(unitNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_LessEqual(String unitNm) {
        regUnitNm(CK_LE, fRES(unitNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNmList The collection of unitNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_InScope(Collection<String> unitNmList) {
        doSetUnitNm_InScope(unitNmList);
    }

    protected void doSetUnitNm_InScope(Collection<String> unitNmList) {
        regINS(CK_INS, cTL(unitNmList), xgetCValueUnitNm(), "UNIT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNmList The collection of unitNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_NotInScope(Collection<String> unitNmList) {
        doSetUnitNm_NotInScope(unitNmList);
    }

    protected void doSetUnitNm_NotInScope(Collection<String> unitNmList) {
        regINS(CK_NINS, cTL(unitNmList), xgetCValueUnitNm(), "UNIT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(30)} <br>
     * <pre>e.g. setUnitNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param unitNm The value of unitNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUnitNm_LikeSearch(String unitNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(unitNm), xgetCValueUnitNm(), "UNIT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnitNm_NotLikeSearch(String unitNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unitNm), xgetCValueUnitNm(), "UNIT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_PrefixSearch(String unitNm) {
        setUnitNm_LikeSearch(unitNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     */
    public void setUnitNm_IsNull() { regUnitNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     */
    public void setUnitNm_IsNullOrEmpty() { regUnitNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     */
    public void setUnitNm_IsNotNull() { regUnitNm(CK_ISNN, DOBJ); }

    protected void regUnitNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitNm(), "UNIT_NM"); }
    protected abstract ConditionValue xgetCValueUnitNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCd The value of oldJanCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldJanCd_Equal(String oldJanCd) {
        doSetOldJanCd_Equal(fRES(oldJanCd));
    }

    protected void doSetOldJanCd_Equal(String oldJanCd) {
        regOldJanCd(CK_EQ, oldJanCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCd The value of oldJanCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldJanCd_NotEqual(String oldJanCd) {
        doSetOldJanCd_NotEqual(fRES(oldJanCd));
    }

    protected void doSetOldJanCd_NotEqual(String oldJanCd) {
        regOldJanCd(CK_NES, oldJanCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCd The value of oldJanCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldJanCd_GreaterThan(String oldJanCd) {
        regOldJanCd(CK_GT, fRES(oldJanCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCd The value of oldJanCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldJanCd_LessThan(String oldJanCd) {
        regOldJanCd(CK_LT, fRES(oldJanCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCd The value of oldJanCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldJanCd_GreaterEqual(String oldJanCd) {
        regOldJanCd(CK_GE, fRES(oldJanCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCd The value of oldJanCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldJanCd_LessEqual(String oldJanCd) {
        regOldJanCd(CK_LE, fRES(oldJanCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCdList The collection of oldJanCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldJanCd_InScope(Collection<String> oldJanCdList) {
        doSetOldJanCd_InScope(oldJanCdList);
    }

    protected void doSetOldJanCd_InScope(Collection<String> oldJanCdList) {
        regINS(CK_INS, cTL(oldJanCdList), xgetCValueOldJanCd(), "OLD_JAN_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCdList The collection of oldJanCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldJanCd_NotInScope(Collection<String> oldJanCdList) {
        doSetOldJanCd_NotInScope(oldJanCdList);
    }

    protected void doSetOldJanCd_NotInScope(Collection<String> oldJanCdList) {
        regINS(CK_NINS, cTL(oldJanCdList), xgetCValueOldJanCd(), "OLD_JAN_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setOldJanCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param oldJanCd The value of oldJanCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOldJanCd_LikeSearch(String oldJanCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(oldJanCd), xgetCValueOldJanCd(), "OLD_JAN_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCd The value of oldJanCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOldJanCd_NotLikeSearch(String oldJanCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(oldJanCd), xgetCValueOldJanCd(), "OLD_JAN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCd The value of oldJanCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldJanCd_PrefixSearch(String oldJanCd) {
        setOldJanCd_LikeSearch(oldJanCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     */
    public void setOldJanCd_IsNull() { regOldJanCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     */
    public void setOldJanCd_IsNullOrEmpty() { regOldJanCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     */
    public void setOldJanCd_IsNotNull() { regOldJanCd(CK_ISNN, DOBJ); }

    protected void regOldJanCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOldJanCd(), "OLD_JAN_CD"); }
    protected abstract ConditionValue xgetCValueOldJanCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_DT: {VARCHAR(30)}
     * @param sapAddDt The value of sapAddDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDt_Equal(String sapAddDt) {
        doSetSapAddDt_Equal(fRES(sapAddDt));
    }

    protected void doSetSapAddDt_Equal(String sapAddDt) {
        regSapAddDt(CK_EQ, sapAddDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_DT: {VARCHAR(30)}
     * @param sapAddDt The value of sapAddDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDt_NotEqual(String sapAddDt) {
        doSetSapAddDt_NotEqual(fRES(sapAddDt));
    }

    protected void doSetSapAddDt_NotEqual(String sapAddDt) {
        regSapAddDt(CK_NES, sapAddDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_DT: {VARCHAR(30)}
     * @param sapAddDt The value of sapAddDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDt_GreaterThan(String sapAddDt) {
        regSapAddDt(CK_GT, fRES(sapAddDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_DT: {VARCHAR(30)}
     * @param sapAddDt The value of sapAddDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDt_LessThan(String sapAddDt) {
        regSapAddDt(CK_LT, fRES(sapAddDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_DT: {VARCHAR(30)}
     * @param sapAddDt The value of sapAddDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDt_GreaterEqual(String sapAddDt) {
        regSapAddDt(CK_GE, fRES(sapAddDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_DT: {VARCHAR(30)}
     * @param sapAddDt The value of sapAddDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDt_LessEqual(String sapAddDt) {
        regSapAddDt(CK_LE, fRES(sapAddDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_DT: {VARCHAR(30)}
     * @param sapAddDtList The collection of sapAddDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDt_InScope(Collection<String> sapAddDtList) {
        doSetSapAddDt_InScope(sapAddDtList);
    }

    protected void doSetSapAddDt_InScope(Collection<String> sapAddDtList) {
        regINS(CK_INS, cTL(sapAddDtList), xgetCValueSapAddDt(), "SAP_ADD_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_DT: {VARCHAR(30)}
     * @param sapAddDtList The collection of sapAddDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDt_NotInScope(Collection<String> sapAddDtList) {
        doSetSapAddDt_NotInScope(sapAddDtList);
    }

    protected void doSetSapAddDt_NotInScope(Collection<String> sapAddDtList) {
        regINS(CK_NINS, cTL(sapAddDtList), xgetCValueSapAddDt(), "SAP_ADD_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_DT: {VARCHAR(30)} <br>
     * <pre>e.g. setSapAddDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapAddDt The value of sapAddDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapAddDt_LikeSearch(String sapAddDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapAddDt), xgetCValueSapAddDt(), "SAP_ADD_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_DT: {VARCHAR(30)}
     * @param sapAddDt The value of sapAddDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapAddDt_NotLikeSearch(String sapAddDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapAddDt), xgetCValueSapAddDt(), "SAP_ADD_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_DT: {VARCHAR(30)}
     * @param sapAddDt The value of sapAddDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDt_PrefixSearch(String sapAddDt) {
        setSapAddDt_LikeSearch(sapAddDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_DT: {VARCHAR(30)}
     */
    public void setSapAddDt_IsNull() { regSapAddDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_ADD_DT: {VARCHAR(30)}
     */
    public void setSapAddDt_IsNullOrEmpty() { regSapAddDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_DT: {VARCHAR(30)}
     */
    public void setSapAddDt_IsNotNull() { regSapAddDt(CK_ISNN, DOBJ); }

    protected void regSapAddDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapAddDt(), "SAP_ADD_DT"); }
    protected abstract ConditionValue xgetCValueSapAddDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_TIME: {VARCHAR(30)}
     * @param sapAddTime The value of sapAddTime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddTime_Equal(String sapAddTime) {
        doSetSapAddTime_Equal(fRES(sapAddTime));
    }

    protected void doSetSapAddTime_Equal(String sapAddTime) {
        regSapAddTime(CK_EQ, sapAddTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_TIME: {VARCHAR(30)}
     * @param sapAddTime The value of sapAddTime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddTime_NotEqual(String sapAddTime) {
        doSetSapAddTime_NotEqual(fRES(sapAddTime));
    }

    protected void doSetSapAddTime_NotEqual(String sapAddTime) {
        regSapAddTime(CK_NES, sapAddTime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_TIME: {VARCHAR(30)}
     * @param sapAddTime The value of sapAddTime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddTime_GreaterThan(String sapAddTime) {
        regSapAddTime(CK_GT, fRES(sapAddTime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_TIME: {VARCHAR(30)}
     * @param sapAddTime The value of sapAddTime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddTime_LessThan(String sapAddTime) {
        regSapAddTime(CK_LT, fRES(sapAddTime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_TIME: {VARCHAR(30)}
     * @param sapAddTime The value of sapAddTime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddTime_GreaterEqual(String sapAddTime) {
        regSapAddTime(CK_GE, fRES(sapAddTime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_TIME: {VARCHAR(30)}
     * @param sapAddTime The value of sapAddTime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddTime_LessEqual(String sapAddTime) {
        regSapAddTime(CK_LE, fRES(sapAddTime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_TIME: {VARCHAR(30)}
     * @param sapAddTimeList The collection of sapAddTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddTime_InScope(Collection<String> sapAddTimeList) {
        doSetSapAddTime_InScope(sapAddTimeList);
    }

    protected void doSetSapAddTime_InScope(Collection<String> sapAddTimeList) {
        regINS(CK_INS, cTL(sapAddTimeList), xgetCValueSapAddTime(), "SAP_ADD_TIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_TIME: {VARCHAR(30)}
     * @param sapAddTimeList The collection of sapAddTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddTime_NotInScope(Collection<String> sapAddTimeList) {
        doSetSapAddTime_NotInScope(sapAddTimeList);
    }

    protected void doSetSapAddTime_NotInScope(Collection<String> sapAddTimeList) {
        regINS(CK_NINS, cTL(sapAddTimeList), xgetCValueSapAddTime(), "SAP_ADD_TIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_TIME: {VARCHAR(30)} <br>
     * <pre>e.g. setSapAddTime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapAddTime The value of sapAddTime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapAddTime_LikeSearch(String sapAddTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapAddTime), xgetCValueSapAddTime(), "SAP_ADD_TIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_TIME: {VARCHAR(30)}
     * @param sapAddTime The value of sapAddTime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapAddTime_NotLikeSearch(String sapAddTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapAddTime), xgetCValueSapAddTime(), "SAP_ADD_TIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_TIME: {VARCHAR(30)}
     * @param sapAddTime The value of sapAddTime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddTime_PrefixSearch(String sapAddTime) {
        setSapAddTime_LikeSearch(sapAddTime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_TIME: {VARCHAR(30)}
     */
    public void setSapAddTime_IsNull() { regSapAddTime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_ADD_TIME: {VARCHAR(30)}
     */
    public void setSapAddTime_IsNullOrEmpty() { regSapAddTime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_TIME: {VARCHAR(30)}
     */
    public void setSapAddTime_IsNotNull() { regSapAddTime(CK_ISNN, DOBJ); }

    protected void regSapAddTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapAddTime(), "SAP_ADD_TIME"); }
    protected abstract ConditionValue xgetCValueSapAddTime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param storageLocationTypeCd The value of storageLocationTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageLocationTypeCd_Equal(String storageLocationTypeCd) {
        doSetStorageLocationTypeCd_Equal(fRES(storageLocationTypeCd));
    }

    protected void doSetStorageLocationTypeCd_Equal(String storageLocationTypeCd) {
        regStorageLocationTypeCd(CK_EQ, storageLocationTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param storageLocationTypeCd The value of storageLocationTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageLocationTypeCd_NotEqual(String storageLocationTypeCd) {
        doSetStorageLocationTypeCd_NotEqual(fRES(storageLocationTypeCd));
    }

    protected void doSetStorageLocationTypeCd_NotEqual(String storageLocationTypeCd) {
        regStorageLocationTypeCd(CK_NES, storageLocationTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param storageLocationTypeCd The value of storageLocationTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageLocationTypeCd_GreaterThan(String storageLocationTypeCd) {
        regStorageLocationTypeCd(CK_GT, fRES(storageLocationTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param storageLocationTypeCd The value of storageLocationTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageLocationTypeCd_LessThan(String storageLocationTypeCd) {
        regStorageLocationTypeCd(CK_LT, fRES(storageLocationTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param storageLocationTypeCd The value of storageLocationTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageLocationTypeCd_GreaterEqual(String storageLocationTypeCd) {
        regStorageLocationTypeCd(CK_GE, fRES(storageLocationTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param storageLocationTypeCd The value of storageLocationTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageLocationTypeCd_LessEqual(String storageLocationTypeCd) {
        regStorageLocationTypeCd(CK_LE, fRES(storageLocationTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param storageLocationTypeCdList The collection of storageLocationTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageLocationTypeCd_InScope(Collection<String> storageLocationTypeCdList) {
        doSetStorageLocationTypeCd_InScope(storageLocationTypeCdList);
    }

    protected void doSetStorageLocationTypeCd_InScope(Collection<String> storageLocationTypeCdList) {
        regINS(CK_INS, cTL(storageLocationTypeCdList), xgetCValueStorageLocationTypeCd(), "STORAGE_LOCATION_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param storageLocationTypeCdList The collection of storageLocationTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageLocationTypeCd_NotInScope(Collection<String> storageLocationTypeCdList) {
        doSetStorageLocationTypeCd_NotInScope(storageLocationTypeCdList);
    }

    protected void doSetStorageLocationTypeCd_NotInScope(Collection<String> storageLocationTypeCdList) {
        regINS(CK_NINS, cTL(storageLocationTypeCdList), xgetCValueStorageLocationTypeCd(), "STORAGE_LOCATION_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setStorageLocationTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storageLocationTypeCd The value of storageLocationTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStorageLocationTypeCd_LikeSearch(String storageLocationTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storageLocationTypeCd), xgetCValueStorageLocationTypeCd(), "STORAGE_LOCATION_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param storageLocationTypeCd The value of storageLocationTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStorageLocationTypeCd_NotLikeSearch(String storageLocationTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storageLocationTypeCd), xgetCValueStorageLocationTypeCd(), "STORAGE_LOCATION_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param storageLocationTypeCd The value of storageLocationTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageLocationTypeCd_PrefixSearch(String storageLocationTypeCd) {
        setStorageLocationTypeCd_LikeSearch(storageLocationTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)}
     */
    public void setStorageLocationTypeCd_IsNull() { regStorageLocationTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)}
     */
    public void setStorageLocationTypeCd_IsNullOrEmpty() { regStorageLocationTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)}
     */
    public void setStorageLocationTypeCd_IsNotNull() { regStorageLocationTypeCd(CK_ISNN, DOBJ); }

    protected void regStorageLocationTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStorageLocationTypeCd(), "STORAGE_LOCATION_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueStorageLocationTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEDICAL_MANAG_FLG: {CHAR(1)}
     * @param medicalManagFlg The value of medicalManagFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMedicalManagFlg_Equal(String medicalManagFlg) {
        doSetMedicalManagFlg_Equal(fRES(medicalManagFlg));
    }

    protected void doSetMedicalManagFlg_Equal(String medicalManagFlg) {
        regMedicalManagFlg(CK_EQ, medicalManagFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEDICAL_MANAG_FLG: {CHAR(1)}
     * @param medicalManagFlg The value of medicalManagFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMedicalManagFlg_NotEqual(String medicalManagFlg) {
        doSetMedicalManagFlg_NotEqual(fRES(medicalManagFlg));
    }

    protected void doSetMedicalManagFlg_NotEqual(String medicalManagFlg) {
        regMedicalManagFlg(CK_NES, medicalManagFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEDICAL_MANAG_FLG: {CHAR(1)}
     * @param medicalManagFlg The value of medicalManagFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMedicalManagFlg_GreaterThan(String medicalManagFlg) {
        regMedicalManagFlg(CK_GT, fRES(medicalManagFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEDICAL_MANAG_FLG: {CHAR(1)}
     * @param medicalManagFlg The value of medicalManagFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMedicalManagFlg_LessThan(String medicalManagFlg) {
        regMedicalManagFlg(CK_LT, fRES(medicalManagFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEDICAL_MANAG_FLG: {CHAR(1)}
     * @param medicalManagFlg The value of medicalManagFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMedicalManagFlg_GreaterEqual(String medicalManagFlg) {
        regMedicalManagFlg(CK_GE, fRES(medicalManagFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEDICAL_MANAG_FLG: {CHAR(1)}
     * @param medicalManagFlg The value of medicalManagFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMedicalManagFlg_LessEqual(String medicalManagFlg) {
        regMedicalManagFlg(CK_LE, fRES(medicalManagFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEDICAL_MANAG_FLG: {CHAR(1)}
     * @param medicalManagFlgList The collection of medicalManagFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMedicalManagFlg_InScope(Collection<String> medicalManagFlgList) {
        doSetMedicalManagFlg_InScope(medicalManagFlgList);
    }

    protected void doSetMedicalManagFlg_InScope(Collection<String> medicalManagFlgList) {
        regINS(CK_INS, cTL(medicalManagFlgList), xgetCValueMedicalManagFlg(), "MEDICAL_MANAG_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEDICAL_MANAG_FLG: {CHAR(1)}
     * @param medicalManagFlgList The collection of medicalManagFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMedicalManagFlg_NotInScope(Collection<String> medicalManagFlgList) {
        doSetMedicalManagFlg_NotInScope(medicalManagFlgList);
    }

    protected void doSetMedicalManagFlg_NotInScope(Collection<String> medicalManagFlgList) {
        regINS(CK_NINS, cTL(medicalManagFlgList), xgetCValueMedicalManagFlg(), "MEDICAL_MANAG_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEDICAL_MANAG_FLG: {CHAR(1)} <br>
     * <pre>e.g. setMedicalManagFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param medicalManagFlg The value of medicalManagFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMedicalManagFlg_LikeSearch(String medicalManagFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(medicalManagFlg), xgetCValueMedicalManagFlg(), "MEDICAL_MANAG_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEDICAL_MANAG_FLG: {CHAR(1)}
     * @param medicalManagFlg The value of medicalManagFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMedicalManagFlg_NotLikeSearch(String medicalManagFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(medicalManagFlg), xgetCValueMedicalManagFlg(), "MEDICAL_MANAG_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEDICAL_MANAG_FLG: {CHAR(1)}
     * @param medicalManagFlg The value of medicalManagFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMedicalManagFlg_PrefixSearch(String medicalManagFlg) {
        setMedicalManagFlg_LikeSearch(medicalManagFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MEDICAL_MANAG_FLG: {CHAR(1)}
     */
    public void setMedicalManagFlg_IsNull() { regMedicalManagFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MEDICAL_MANAG_FLG: {CHAR(1)}
     */
    public void setMedicalManagFlg_IsNullOrEmpty() { regMedicalManagFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MEDICAL_MANAG_FLG: {CHAR(1)}
     */
    public void setMedicalManagFlg_IsNotNull() { regMedicalManagFlg(CK_ISNN, DOBJ); }

    protected void regMedicalManagFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMedicalManagFlg(), "MEDICAL_MANAG_FLG"); }
    protected abstract ConditionValue xgetCValueMedicalManagFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1)}
     * @param prodDtManagFlg The value of prodDtManagFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtManagFlg_Equal(String prodDtManagFlg) {
        doSetProdDtManagFlg_Equal(fRES(prodDtManagFlg));
    }

    protected void doSetProdDtManagFlg_Equal(String prodDtManagFlg) {
        regProdDtManagFlg(CK_EQ, prodDtManagFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1)}
     * @param prodDtManagFlg The value of prodDtManagFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtManagFlg_NotEqual(String prodDtManagFlg) {
        doSetProdDtManagFlg_NotEqual(fRES(prodDtManagFlg));
    }

    protected void doSetProdDtManagFlg_NotEqual(String prodDtManagFlg) {
        regProdDtManagFlg(CK_NES, prodDtManagFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1)}
     * @param prodDtManagFlg The value of prodDtManagFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtManagFlg_GreaterThan(String prodDtManagFlg) {
        regProdDtManagFlg(CK_GT, fRES(prodDtManagFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1)}
     * @param prodDtManagFlg The value of prodDtManagFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtManagFlg_LessThan(String prodDtManagFlg) {
        regProdDtManagFlg(CK_LT, fRES(prodDtManagFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1)}
     * @param prodDtManagFlg The value of prodDtManagFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtManagFlg_GreaterEqual(String prodDtManagFlg) {
        regProdDtManagFlg(CK_GE, fRES(prodDtManagFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1)}
     * @param prodDtManagFlg The value of prodDtManagFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtManagFlg_LessEqual(String prodDtManagFlg) {
        regProdDtManagFlg(CK_LE, fRES(prodDtManagFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1)}
     * @param prodDtManagFlgList The collection of prodDtManagFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtManagFlg_InScope(Collection<String> prodDtManagFlgList) {
        doSetProdDtManagFlg_InScope(prodDtManagFlgList);
    }

    protected void doSetProdDtManagFlg_InScope(Collection<String> prodDtManagFlgList) {
        regINS(CK_INS, cTL(prodDtManagFlgList), xgetCValueProdDtManagFlg(), "PROD_DT_MANAG_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1)}
     * @param prodDtManagFlgList The collection of prodDtManagFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtManagFlg_NotInScope(Collection<String> prodDtManagFlgList) {
        doSetProdDtManagFlg_NotInScope(prodDtManagFlgList);
    }

    protected void doSetProdDtManagFlg_NotInScope(Collection<String> prodDtManagFlgList) {
        regINS(CK_NINS, cTL(prodDtManagFlgList), xgetCValueProdDtManagFlg(), "PROD_DT_MANAG_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1)} <br>
     * <pre>e.g. setProdDtManagFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param prodDtManagFlg The value of prodDtManagFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProdDtManagFlg_LikeSearch(String prodDtManagFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(prodDtManagFlg), xgetCValueProdDtManagFlg(), "PROD_DT_MANAG_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1)}
     * @param prodDtManagFlg The value of prodDtManagFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProdDtManagFlg_NotLikeSearch(String prodDtManagFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(prodDtManagFlg), xgetCValueProdDtManagFlg(), "PROD_DT_MANAG_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1)}
     * @param prodDtManagFlg The value of prodDtManagFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtManagFlg_PrefixSearch(String prodDtManagFlg) {
        setProdDtManagFlg_LikeSearch(prodDtManagFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1)}
     */
    public void setProdDtManagFlg_IsNull() { regProdDtManagFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1)}
     */
    public void setProdDtManagFlg_IsNullOrEmpty() { regProdDtManagFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1)}
     */
    public void setProdDtManagFlg_IsNotNull() { regProdDtManagFlg(CK_ISNN, DOBJ); }

    protected void regProdDtManagFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProdDtManagFlg(), "PROD_DT_MANAG_FLG"); }
    protected abstract ConditionValue xgetCValueProdDtManagFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)}
     * @param prodDtLimitDaysRcv The value of prodDtLimitDaysRcv as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysRcv_Equal(String prodDtLimitDaysRcv) {
        doSetProdDtLimitDaysRcv_Equal(fRES(prodDtLimitDaysRcv));
    }

    protected void doSetProdDtLimitDaysRcv_Equal(String prodDtLimitDaysRcv) {
        regProdDtLimitDaysRcv(CK_EQ, prodDtLimitDaysRcv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)}
     * @param prodDtLimitDaysRcv The value of prodDtLimitDaysRcv as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysRcv_NotEqual(String prodDtLimitDaysRcv) {
        doSetProdDtLimitDaysRcv_NotEqual(fRES(prodDtLimitDaysRcv));
    }

    protected void doSetProdDtLimitDaysRcv_NotEqual(String prodDtLimitDaysRcv) {
        regProdDtLimitDaysRcv(CK_NES, prodDtLimitDaysRcv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)}
     * @param prodDtLimitDaysRcv The value of prodDtLimitDaysRcv as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysRcv_GreaterThan(String prodDtLimitDaysRcv) {
        regProdDtLimitDaysRcv(CK_GT, fRES(prodDtLimitDaysRcv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)}
     * @param prodDtLimitDaysRcv The value of prodDtLimitDaysRcv as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysRcv_LessThan(String prodDtLimitDaysRcv) {
        regProdDtLimitDaysRcv(CK_LT, fRES(prodDtLimitDaysRcv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)}
     * @param prodDtLimitDaysRcv The value of prodDtLimitDaysRcv as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysRcv_GreaterEqual(String prodDtLimitDaysRcv) {
        regProdDtLimitDaysRcv(CK_GE, fRES(prodDtLimitDaysRcv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)}
     * @param prodDtLimitDaysRcv The value of prodDtLimitDaysRcv as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysRcv_LessEqual(String prodDtLimitDaysRcv) {
        regProdDtLimitDaysRcv(CK_LE, fRES(prodDtLimitDaysRcv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)}
     * @param prodDtLimitDaysRcvList The collection of prodDtLimitDaysRcv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysRcv_InScope(Collection<String> prodDtLimitDaysRcvList) {
        doSetProdDtLimitDaysRcv_InScope(prodDtLimitDaysRcvList);
    }

    protected void doSetProdDtLimitDaysRcv_InScope(Collection<String> prodDtLimitDaysRcvList) {
        regINS(CK_INS, cTL(prodDtLimitDaysRcvList), xgetCValueProdDtLimitDaysRcv(), "PROD_DT_LIMIT_DAYS_RCV");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)}
     * @param prodDtLimitDaysRcvList The collection of prodDtLimitDaysRcv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysRcv_NotInScope(Collection<String> prodDtLimitDaysRcvList) {
        doSetProdDtLimitDaysRcv_NotInScope(prodDtLimitDaysRcvList);
    }

    protected void doSetProdDtLimitDaysRcv_NotInScope(Collection<String> prodDtLimitDaysRcvList) {
        regINS(CK_NINS, cTL(prodDtLimitDaysRcvList), xgetCValueProdDtLimitDaysRcv(), "PROD_DT_LIMIT_DAYS_RCV");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)} <br>
     * <pre>e.g. setProdDtLimitDaysRcv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param prodDtLimitDaysRcv The value of prodDtLimitDaysRcv as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProdDtLimitDaysRcv_LikeSearch(String prodDtLimitDaysRcv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(prodDtLimitDaysRcv), xgetCValueProdDtLimitDaysRcv(), "PROD_DT_LIMIT_DAYS_RCV", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)}
     * @param prodDtLimitDaysRcv The value of prodDtLimitDaysRcv as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProdDtLimitDaysRcv_NotLikeSearch(String prodDtLimitDaysRcv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(prodDtLimitDaysRcv), xgetCValueProdDtLimitDaysRcv(), "PROD_DT_LIMIT_DAYS_RCV", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)}
     * @param prodDtLimitDaysRcv The value of prodDtLimitDaysRcv as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysRcv_PrefixSearch(String prodDtLimitDaysRcv) {
        setProdDtLimitDaysRcv_LikeSearch(prodDtLimitDaysRcv, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)}
     */
    public void setProdDtLimitDaysRcv_IsNull() { regProdDtLimitDaysRcv(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)}
     */
    public void setProdDtLimitDaysRcv_IsNullOrEmpty() { regProdDtLimitDaysRcv(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)}
     */
    public void setProdDtLimitDaysRcv_IsNotNull() { regProdDtLimitDaysRcv(CK_ISNN, DOBJ); }

    protected void regProdDtLimitDaysRcv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProdDtLimitDaysRcv(), "PROD_DT_LIMIT_DAYS_RCV"); }
    protected abstract ConditionValue xgetCValueProdDtLimitDaysRcv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)}
     * @param prodDtLimitDaysShp The value of prodDtLimitDaysShp as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysShp_Equal(String prodDtLimitDaysShp) {
        doSetProdDtLimitDaysShp_Equal(fRES(prodDtLimitDaysShp));
    }

    protected void doSetProdDtLimitDaysShp_Equal(String prodDtLimitDaysShp) {
        regProdDtLimitDaysShp(CK_EQ, prodDtLimitDaysShp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)}
     * @param prodDtLimitDaysShp The value of prodDtLimitDaysShp as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysShp_NotEqual(String prodDtLimitDaysShp) {
        doSetProdDtLimitDaysShp_NotEqual(fRES(prodDtLimitDaysShp));
    }

    protected void doSetProdDtLimitDaysShp_NotEqual(String prodDtLimitDaysShp) {
        regProdDtLimitDaysShp(CK_NES, prodDtLimitDaysShp);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)}
     * @param prodDtLimitDaysShp The value of prodDtLimitDaysShp as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysShp_GreaterThan(String prodDtLimitDaysShp) {
        regProdDtLimitDaysShp(CK_GT, fRES(prodDtLimitDaysShp));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)}
     * @param prodDtLimitDaysShp The value of prodDtLimitDaysShp as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysShp_LessThan(String prodDtLimitDaysShp) {
        regProdDtLimitDaysShp(CK_LT, fRES(prodDtLimitDaysShp));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)}
     * @param prodDtLimitDaysShp The value of prodDtLimitDaysShp as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysShp_GreaterEqual(String prodDtLimitDaysShp) {
        regProdDtLimitDaysShp(CK_GE, fRES(prodDtLimitDaysShp));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)}
     * @param prodDtLimitDaysShp The value of prodDtLimitDaysShp as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysShp_LessEqual(String prodDtLimitDaysShp) {
        regProdDtLimitDaysShp(CK_LE, fRES(prodDtLimitDaysShp));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)}
     * @param prodDtLimitDaysShpList The collection of prodDtLimitDaysShp as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysShp_InScope(Collection<String> prodDtLimitDaysShpList) {
        doSetProdDtLimitDaysShp_InScope(prodDtLimitDaysShpList);
    }

    protected void doSetProdDtLimitDaysShp_InScope(Collection<String> prodDtLimitDaysShpList) {
        regINS(CK_INS, cTL(prodDtLimitDaysShpList), xgetCValueProdDtLimitDaysShp(), "PROD_DT_LIMIT_DAYS_SHP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)}
     * @param prodDtLimitDaysShpList The collection of prodDtLimitDaysShp as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysShp_NotInScope(Collection<String> prodDtLimitDaysShpList) {
        doSetProdDtLimitDaysShp_NotInScope(prodDtLimitDaysShpList);
    }

    protected void doSetProdDtLimitDaysShp_NotInScope(Collection<String> prodDtLimitDaysShpList) {
        regINS(CK_NINS, cTL(prodDtLimitDaysShpList), xgetCValueProdDtLimitDaysShp(), "PROD_DT_LIMIT_DAYS_SHP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)} <br>
     * <pre>e.g. setProdDtLimitDaysShp_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param prodDtLimitDaysShp The value of prodDtLimitDaysShp as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProdDtLimitDaysShp_LikeSearch(String prodDtLimitDaysShp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(prodDtLimitDaysShp), xgetCValueProdDtLimitDaysShp(), "PROD_DT_LIMIT_DAYS_SHP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)}
     * @param prodDtLimitDaysShp The value of prodDtLimitDaysShp as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProdDtLimitDaysShp_NotLikeSearch(String prodDtLimitDaysShp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(prodDtLimitDaysShp), xgetCValueProdDtLimitDaysShp(), "PROD_DT_LIMIT_DAYS_SHP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)}
     * @param prodDtLimitDaysShp The value of prodDtLimitDaysShp as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysShp_PrefixSearch(String prodDtLimitDaysShp) {
        setProdDtLimitDaysShp_LikeSearch(prodDtLimitDaysShp, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)}
     */
    public void setProdDtLimitDaysShp_IsNull() { regProdDtLimitDaysShp(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)}
     */
    public void setProdDtLimitDaysShp_IsNullOrEmpty() { regProdDtLimitDaysShp(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)}
     */
    public void setProdDtLimitDaysShp_IsNotNull() { regProdDtLimitDaysShp(CK_ISNN, DOBJ); }

    protected void regProdDtLimitDaysShp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProdDtLimitDaysShp(), "PROD_DT_LIMIT_DAYS_SHP"); }
    protected abstract ConditionValue xgetCValueProdDtLimitDaysShp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_10_NUM: {VARCHAR(30)}
     * @param nizoroe10Num The value of nizoroe10Num as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroe10Num_Equal(String nizoroe10Num) {
        doSetNizoroe10Num_Equal(fRES(nizoroe10Num));
    }

    protected void doSetNizoroe10Num_Equal(String nizoroe10Num) {
        regNizoroe10Num(CK_EQ, nizoroe10Num);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_10_NUM: {VARCHAR(30)}
     * @param nizoroe10Num The value of nizoroe10Num as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroe10Num_NotEqual(String nizoroe10Num) {
        doSetNizoroe10Num_NotEqual(fRES(nizoroe10Num));
    }

    protected void doSetNizoroe10Num_NotEqual(String nizoroe10Num) {
        regNizoroe10Num(CK_NES, nizoroe10Num);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_10_NUM: {VARCHAR(30)}
     * @param nizoroe10Num The value of nizoroe10Num as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroe10Num_GreaterThan(String nizoroe10Num) {
        regNizoroe10Num(CK_GT, fRES(nizoroe10Num));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_10_NUM: {VARCHAR(30)}
     * @param nizoroe10Num The value of nizoroe10Num as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroe10Num_LessThan(String nizoroe10Num) {
        regNizoroe10Num(CK_LT, fRES(nizoroe10Num));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_10_NUM: {VARCHAR(30)}
     * @param nizoroe10Num The value of nizoroe10Num as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroe10Num_GreaterEqual(String nizoroe10Num) {
        regNizoroe10Num(CK_GE, fRES(nizoroe10Num));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_10_NUM: {VARCHAR(30)}
     * @param nizoroe10Num The value of nizoroe10Num as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroe10Num_LessEqual(String nizoroe10Num) {
        regNizoroe10Num(CK_LE, fRES(nizoroe10Num));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_10_NUM: {VARCHAR(30)}
     * @param nizoroe10NumList The collection of nizoroe10Num as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroe10Num_InScope(Collection<String> nizoroe10NumList) {
        doSetNizoroe10Num_InScope(nizoroe10NumList);
    }

    protected void doSetNizoroe10Num_InScope(Collection<String> nizoroe10NumList) {
        regINS(CK_INS, cTL(nizoroe10NumList), xgetCValueNizoroe10Num(), "NIZOROE_10_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_10_NUM: {VARCHAR(30)}
     * @param nizoroe10NumList The collection of nizoroe10Num as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroe10Num_NotInScope(Collection<String> nizoroe10NumList) {
        doSetNizoroe10Num_NotInScope(nizoroe10NumList);
    }

    protected void doSetNizoroe10Num_NotInScope(Collection<String> nizoroe10NumList) {
        regINS(CK_NINS, cTL(nizoroe10NumList), xgetCValueNizoroe10Num(), "NIZOROE_10_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_10_NUM: {VARCHAR(30)} <br>
     * <pre>e.g. setNizoroe10Num_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nizoroe10Num The value of nizoroe10Num as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNizoroe10Num_LikeSearch(String nizoroe10Num, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nizoroe10Num), xgetCValueNizoroe10Num(), "NIZOROE_10_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_10_NUM: {VARCHAR(30)}
     * @param nizoroe10Num The value of nizoroe10Num as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNizoroe10Num_NotLikeSearch(String nizoroe10Num, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nizoroe10Num), xgetCValueNizoroe10Num(), "NIZOROE_10_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_10_NUM: {VARCHAR(30)}
     * @param nizoroe10Num The value of nizoroe10Num as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroe10Num_PrefixSearch(String nizoroe10Num) {
        setNizoroe10Num_LikeSearch(nizoroe10Num, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NIZOROE_10_NUM: {VARCHAR(30)}
     */
    public void setNizoroe10Num_IsNull() { regNizoroe10Num(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NIZOROE_10_NUM: {VARCHAR(30)}
     */
    public void setNizoroe10Num_IsNullOrEmpty() { regNizoroe10Num(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NIZOROE_10_NUM: {VARCHAR(30)}
     */
    public void setNizoroe10Num_IsNotNull() { regNizoroe10Num(CK_ISNN, DOBJ); }

    protected void regNizoroe10Num(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroe10Num(), "NIZOROE_10_NUM"); }
    protected abstract ConditionValue xgetCValueNizoroe10Num();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlg The value of serialManagFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialManagFlg_Equal(String serialManagFlg) {
        doSetSerialManagFlg_Equal(fRES(serialManagFlg));
    }

    protected void doSetSerialManagFlg_Equal(String serialManagFlg) {
        regSerialManagFlg(CK_EQ, serialManagFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlg The value of serialManagFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialManagFlg_NotEqual(String serialManagFlg) {
        doSetSerialManagFlg_NotEqual(fRES(serialManagFlg));
    }

    protected void doSetSerialManagFlg_NotEqual(String serialManagFlg) {
        regSerialManagFlg(CK_NES, serialManagFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlg The value of serialManagFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialManagFlg_GreaterThan(String serialManagFlg) {
        regSerialManagFlg(CK_GT, fRES(serialManagFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlg The value of serialManagFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialManagFlg_LessThan(String serialManagFlg) {
        regSerialManagFlg(CK_LT, fRES(serialManagFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlg The value of serialManagFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialManagFlg_GreaterEqual(String serialManagFlg) {
        regSerialManagFlg(CK_GE, fRES(serialManagFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlg The value of serialManagFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialManagFlg_LessEqual(String serialManagFlg) {
        regSerialManagFlg(CK_LE, fRES(serialManagFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlgList The collection of serialManagFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialManagFlg_InScope(Collection<String> serialManagFlgList) {
        doSetSerialManagFlg_InScope(serialManagFlgList);
    }

    protected void doSetSerialManagFlg_InScope(Collection<String> serialManagFlgList) {
        regINS(CK_INS, cTL(serialManagFlgList), xgetCValueSerialManagFlg(), "SERIAL_MANAG_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlgList The collection of serialManagFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialManagFlg_NotInScope(Collection<String> serialManagFlgList) {
        doSetSerialManagFlg_NotInScope(serialManagFlgList);
    }

    protected void doSetSerialManagFlg_NotInScope(Collection<String> serialManagFlgList) {
        regINS(CK_NINS, cTL(serialManagFlgList), xgetCValueSerialManagFlg(), "SERIAL_MANAG_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)} <br>
     * <pre>e.g. setSerialManagFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param serialManagFlg The value of serialManagFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSerialManagFlg_LikeSearch(String serialManagFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(serialManagFlg), xgetCValueSerialManagFlg(), "SERIAL_MANAG_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlg The value of serialManagFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSerialManagFlg_NotLikeSearch(String serialManagFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(serialManagFlg), xgetCValueSerialManagFlg(), "SERIAL_MANAG_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlg The value of serialManagFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialManagFlg_PrefixSearch(String serialManagFlg) {
        setSerialManagFlg_LikeSearch(serialManagFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     */
    public void setSerialManagFlg_IsNull() { regSerialManagFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     */
    public void setSerialManagFlg_IsNullOrEmpty() { regSerialManagFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     */
    public void setSerialManagFlg_IsNotNull() { regSerialManagFlg(CK_ISNN, DOBJ); }

    protected void regSerialManagFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSerialManagFlg(), "SERIAL_MANAG_FLG"); }
    protected abstract ConditionValue xgetCValueSerialManagFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30)}
     * @param ocrDateFormat The value of ocrDateFormat as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOcrDateFormat_Equal(String ocrDateFormat) {
        doSetOcrDateFormat_Equal(fRES(ocrDateFormat));
    }

    protected void doSetOcrDateFormat_Equal(String ocrDateFormat) {
        regOcrDateFormat(CK_EQ, ocrDateFormat);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30)}
     * @param ocrDateFormat The value of ocrDateFormat as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOcrDateFormat_NotEqual(String ocrDateFormat) {
        doSetOcrDateFormat_NotEqual(fRES(ocrDateFormat));
    }

    protected void doSetOcrDateFormat_NotEqual(String ocrDateFormat) {
        regOcrDateFormat(CK_NES, ocrDateFormat);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30)}
     * @param ocrDateFormat The value of ocrDateFormat as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOcrDateFormat_GreaterThan(String ocrDateFormat) {
        regOcrDateFormat(CK_GT, fRES(ocrDateFormat));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30)}
     * @param ocrDateFormat The value of ocrDateFormat as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOcrDateFormat_LessThan(String ocrDateFormat) {
        regOcrDateFormat(CK_LT, fRES(ocrDateFormat));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30)}
     * @param ocrDateFormat The value of ocrDateFormat as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOcrDateFormat_GreaterEqual(String ocrDateFormat) {
        regOcrDateFormat(CK_GE, fRES(ocrDateFormat));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30)}
     * @param ocrDateFormat The value of ocrDateFormat as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOcrDateFormat_LessEqual(String ocrDateFormat) {
        regOcrDateFormat(CK_LE, fRES(ocrDateFormat));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30)}
     * @param ocrDateFormatList The collection of ocrDateFormat as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOcrDateFormat_InScope(Collection<String> ocrDateFormatList) {
        doSetOcrDateFormat_InScope(ocrDateFormatList);
    }

    protected void doSetOcrDateFormat_InScope(Collection<String> ocrDateFormatList) {
        regINS(CK_INS, cTL(ocrDateFormatList), xgetCValueOcrDateFormat(), "OCR_DATE_FORMAT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30)}
     * @param ocrDateFormatList The collection of ocrDateFormat as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOcrDateFormat_NotInScope(Collection<String> ocrDateFormatList) {
        doSetOcrDateFormat_NotInScope(ocrDateFormatList);
    }

    protected void doSetOcrDateFormat_NotInScope(Collection<String> ocrDateFormatList) {
        regINS(CK_NINS, cTL(ocrDateFormatList), xgetCValueOcrDateFormat(), "OCR_DATE_FORMAT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30)} <br>
     * <pre>e.g. setOcrDateFormat_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ocrDateFormat The value of ocrDateFormat as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOcrDateFormat_LikeSearch(String ocrDateFormat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ocrDateFormat), xgetCValueOcrDateFormat(), "OCR_DATE_FORMAT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30)}
     * @param ocrDateFormat The value of ocrDateFormat as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOcrDateFormat_NotLikeSearch(String ocrDateFormat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ocrDateFormat), xgetCValueOcrDateFormat(), "OCR_DATE_FORMAT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30)}
     * @param ocrDateFormat The value of ocrDateFormat as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOcrDateFormat_PrefixSearch(String ocrDateFormat) {
        setOcrDateFormat_LikeSearch(ocrDateFormat, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30)}
     */
    public void setOcrDateFormat_IsNull() { regOcrDateFormat(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30)}
     */
    public void setOcrDateFormat_IsNullOrEmpty() { regOcrDateFormat(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30)}
     */
    public void setOcrDateFormat_IsNotNull() { regOcrDateFormat(CK_ISNN, DOBJ); }

    protected void regOcrDateFormat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOcrDateFormat(), "OCR_DATE_FORMAT"); }
    protected abstract ConditionValue xgetCValueOcrDateFormat();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyy The value of sapAddYyyy as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddYyyy_Equal(String sapAddYyyy) {
        doSetSapAddYyyy_Equal(fRES(sapAddYyyy));
    }

    protected void doSetSapAddYyyy_Equal(String sapAddYyyy) {
        regSapAddYyyy(CK_EQ, sapAddYyyy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyy The value of sapAddYyyy as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddYyyy_NotEqual(String sapAddYyyy) {
        doSetSapAddYyyy_NotEqual(fRES(sapAddYyyy));
    }

    protected void doSetSapAddYyyy_NotEqual(String sapAddYyyy) {
        regSapAddYyyy(CK_NES, sapAddYyyy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyy The value of sapAddYyyy as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddYyyy_GreaterThan(String sapAddYyyy) {
        regSapAddYyyy(CK_GT, fRES(sapAddYyyy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyy The value of sapAddYyyy as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddYyyy_LessThan(String sapAddYyyy) {
        regSapAddYyyy(CK_LT, fRES(sapAddYyyy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyy The value of sapAddYyyy as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddYyyy_GreaterEqual(String sapAddYyyy) {
        regSapAddYyyy(CK_GE, fRES(sapAddYyyy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyy The value of sapAddYyyy as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddYyyy_LessEqual(String sapAddYyyy) {
        regSapAddYyyy(CK_LE, fRES(sapAddYyyy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyyList The collection of sapAddYyyy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddYyyy_InScope(Collection<String> sapAddYyyyList) {
        doSetSapAddYyyy_InScope(sapAddYyyyList);
    }

    protected void doSetSapAddYyyy_InScope(Collection<String> sapAddYyyyList) {
        regINS(CK_INS, cTL(sapAddYyyyList), xgetCValueSapAddYyyy(), "SAP_ADD_YYYY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyyList The collection of sapAddYyyy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddYyyy_NotInScope(Collection<String> sapAddYyyyList) {
        doSetSapAddYyyy_NotInScope(sapAddYyyyList);
    }

    protected void doSetSapAddYyyy_NotInScope(Collection<String> sapAddYyyyList) {
        regINS(CK_NINS, cTL(sapAddYyyyList), xgetCValueSapAddYyyy(), "SAP_ADD_YYYY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)} <br>
     * <pre>e.g. setSapAddYyyy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapAddYyyy The value of sapAddYyyy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapAddYyyy_LikeSearch(String sapAddYyyy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapAddYyyy), xgetCValueSapAddYyyy(), "SAP_ADD_YYYY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyy The value of sapAddYyyy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapAddYyyy_NotLikeSearch(String sapAddYyyy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapAddYyyy), xgetCValueSapAddYyyy(), "SAP_ADD_YYYY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyy The value of sapAddYyyy as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddYyyy_PrefixSearch(String sapAddYyyy) {
        setSapAddYyyy_LikeSearch(sapAddYyyy, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     */
    public void setSapAddYyyy_IsNull() { regSapAddYyyy(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     */
    public void setSapAddYyyy_IsNullOrEmpty() { regSapAddYyyy(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     */
    public void setSapAddYyyy_IsNotNull() { regSapAddYyyy(CK_ISNN, DOBJ); }

    protected void regSapAddYyyy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapAddYyyy(), "SAP_ADD_YYYY"); }
    protected abstract ConditionValue xgetCValueSapAddYyyy();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMm The value of sapAddMm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMm_Equal(String sapAddMm) {
        doSetSapAddMm_Equal(fRES(sapAddMm));
    }

    protected void doSetSapAddMm_Equal(String sapAddMm) {
        regSapAddMm(CK_EQ, sapAddMm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMm The value of sapAddMm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMm_NotEqual(String sapAddMm) {
        doSetSapAddMm_NotEqual(fRES(sapAddMm));
    }

    protected void doSetSapAddMm_NotEqual(String sapAddMm) {
        regSapAddMm(CK_NES, sapAddMm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMm The value of sapAddMm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMm_GreaterThan(String sapAddMm) {
        regSapAddMm(CK_GT, fRES(sapAddMm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMm The value of sapAddMm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMm_LessThan(String sapAddMm) {
        regSapAddMm(CK_LT, fRES(sapAddMm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMm The value of sapAddMm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMm_GreaterEqual(String sapAddMm) {
        regSapAddMm(CK_GE, fRES(sapAddMm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMm The value of sapAddMm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMm_LessEqual(String sapAddMm) {
        regSapAddMm(CK_LE, fRES(sapAddMm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMmList The collection of sapAddMm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMm_InScope(Collection<String> sapAddMmList) {
        doSetSapAddMm_InScope(sapAddMmList);
    }

    protected void doSetSapAddMm_InScope(Collection<String> sapAddMmList) {
        regINS(CK_INS, cTL(sapAddMmList), xgetCValueSapAddMm(), "SAP_ADD_MM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMmList The collection of sapAddMm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMm_NotInScope(Collection<String> sapAddMmList) {
        doSetSapAddMm_NotInScope(sapAddMmList);
    }

    protected void doSetSapAddMm_NotInScope(Collection<String> sapAddMmList) {
        regINS(CK_NINS, cTL(sapAddMmList), xgetCValueSapAddMm(), "SAP_ADD_MM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)} <br>
     * <pre>e.g. setSapAddMm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapAddMm The value of sapAddMm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapAddMm_LikeSearch(String sapAddMm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapAddMm), xgetCValueSapAddMm(), "SAP_ADD_MM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMm The value of sapAddMm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapAddMm_NotLikeSearch(String sapAddMm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapAddMm), xgetCValueSapAddMm(), "SAP_ADD_MM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMm The value of sapAddMm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMm_PrefixSearch(String sapAddMm) {
        setSapAddMm_LikeSearch(sapAddMm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     */
    public void setSapAddMm_IsNull() { regSapAddMm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     */
    public void setSapAddMm_IsNullOrEmpty() { regSapAddMm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     */
    public void setSapAddMm_IsNotNull() { regSapAddMm(CK_ISNN, DOBJ); }

    protected void regSapAddMm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapAddMm(), "SAP_ADD_MM"); }
    protected abstract ConditionValue xgetCValueSapAddMm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDd The value of sapAddDd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDd_Equal(String sapAddDd) {
        doSetSapAddDd_Equal(fRES(sapAddDd));
    }

    protected void doSetSapAddDd_Equal(String sapAddDd) {
        regSapAddDd(CK_EQ, sapAddDd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDd The value of sapAddDd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDd_NotEqual(String sapAddDd) {
        doSetSapAddDd_NotEqual(fRES(sapAddDd));
    }

    protected void doSetSapAddDd_NotEqual(String sapAddDd) {
        regSapAddDd(CK_NES, sapAddDd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDd The value of sapAddDd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDd_GreaterThan(String sapAddDd) {
        regSapAddDd(CK_GT, fRES(sapAddDd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDd The value of sapAddDd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDd_LessThan(String sapAddDd) {
        regSapAddDd(CK_LT, fRES(sapAddDd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDd The value of sapAddDd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDd_GreaterEqual(String sapAddDd) {
        regSapAddDd(CK_GE, fRES(sapAddDd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDd The value of sapAddDd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDd_LessEqual(String sapAddDd) {
        regSapAddDd(CK_LE, fRES(sapAddDd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDdList The collection of sapAddDd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDd_InScope(Collection<String> sapAddDdList) {
        doSetSapAddDd_InScope(sapAddDdList);
    }

    protected void doSetSapAddDd_InScope(Collection<String> sapAddDdList) {
        regINS(CK_INS, cTL(sapAddDdList), xgetCValueSapAddDd(), "SAP_ADD_DD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDdList The collection of sapAddDd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDd_NotInScope(Collection<String> sapAddDdList) {
        doSetSapAddDd_NotInScope(sapAddDdList);
    }

    protected void doSetSapAddDd_NotInScope(Collection<String> sapAddDdList) {
        regINS(CK_NINS, cTL(sapAddDdList), xgetCValueSapAddDd(), "SAP_ADD_DD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)} <br>
     * <pre>e.g. setSapAddDd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapAddDd The value of sapAddDd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapAddDd_LikeSearch(String sapAddDd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapAddDd), xgetCValueSapAddDd(), "SAP_ADD_DD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDd The value of sapAddDd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapAddDd_NotLikeSearch(String sapAddDd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapAddDd), xgetCValueSapAddDd(), "SAP_ADD_DD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDd The value of sapAddDd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDd_PrefixSearch(String sapAddDd) {
        setSapAddDd_LikeSearch(sapAddDd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     */
    public void setSapAddDd_IsNull() { regSapAddDd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     */
    public void setSapAddDd_IsNullOrEmpty() { regSapAddDd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     */
    public void setSapAddDd_IsNotNull() { regSapAddDd(CK_ISNN, DOBJ); }

    protected void regSapAddDd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapAddDd(), "SAP_ADD_DD"); }
    protected abstract ConditionValue xgetCValueSapAddDd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHh The value of sapAddHh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddHh_Equal(String sapAddHh) {
        doSetSapAddHh_Equal(fRES(sapAddHh));
    }

    protected void doSetSapAddHh_Equal(String sapAddHh) {
        regSapAddHh(CK_EQ, sapAddHh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHh The value of sapAddHh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddHh_NotEqual(String sapAddHh) {
        doSetSapAddHh_NotEqual(fRES(sapAddHh));
    }

    protected void doSetSapAddHh_NotEqual(String sapAddHh) {
        regSapAddHh(CK_NES, sapAddHh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHh The value of sapAddHh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddHh_GreaterThan(String sapAddHh) {
        regSapAddHh(CK_GT, fRES(sapAddHh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHh The value of sapAddHh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddHh_LessThan(String sapAddHh) {
        regSapAddHh(CK_LT, fRES(sapAddHh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHh The value of sapAddHh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddHh_GreaterEqual(String sapAddHh) {
        regSapAddHh(CK_GE, fRES(sapAddHh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHh The value of sapAddHh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddHh_LessEqual(String sapAddHh) {
        regSapAddHh(CK_LE, fRES(sapAddHh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHhList The collection of sapAddHh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddHh_InScope(Collection<String> sapAddHhList) {
        doSetSapAddHh_InScope(sapAddHhList);
    }

    protected void doSetSapAddHh_InScope(Collection<String> sapAddHhList) {
        regINS(CK_INS, cTL(sapAddHhList), xgetCValueSapAddHh(), "SAP_ADD_HH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHhList The collection of sapAddHh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddHh_NotInScope(Collection<String> sapAddHhList) {
        doSetSapAddHh_NotInScope(sapAddHhList);
    }

    protected void doSetSapAddHh_NotInScope(Collection<String> sapAddHhList) {
        regINS(CK_NINS, cTL(sapAddHhList), xgetCValueSapAddHh(), "SAP_ADD_HH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)} <br>
     * <pre>e.g. setSapAddHh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapAddHh The value of sapAddHh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapAddHh_LikeSearch(String sapAddHh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapAddHh), xgetCValueSapAddHh(), "SAP_ADD_HH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHh The value of sapAddHh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapAddHh_NotLikeSearch(String sapAddHh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapAddHh), xgetCValueSapAddHh(), "SAP_ADD_HH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHh The value of sapAddHh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddHh_PrefixSearch(String sapAddHh) {
        setSapAddHh_LikeSearch(sapAddHh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     */
    public void setSapAddHh_IsNull() { regSapAddHh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     */
    public void setSapAddHh_IsNullOrEmpty() { regSapAddHh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     */
    public void setSapAddHh_IsNotNull() { regSapAddHh(CK_ISNN, DOBJ); }

    protected void regSapAddHh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapAddHh(), "SAP_ADD_HH"); }
    protected abstract ConditionValue xgetCValueSapAddHh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMi The value of sapAddMi as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMi_Equal(String sapAddMi) {
        doSetSapAddMi_Equal(fRES(sapAddMi));
    }

    protected void doSetSapAddMi_Equal(String sapAddMi) {
        regSapAddMi(CK_EQ, sapAddMi);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMi The value of sapAddMi as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMi_NotEqual(String sapAddMi) {
        doSetSapAddMi_NotEqual(fRES(sapAddMi));
    }

    protected void doSetSapAddMi_NotEqual(String sapAddMi) {
        regSapAddMi(CK_NES, sapAddMi);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMi The value of sapAddMi as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMi_GreaterThan(String sapAddMi) {
        regSapAddMi(CK_GT, fRES(sapAddMi));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMi The value of sapAddMi as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMi_LessThan(String sapAddMi) {
        regSapAddMi(CK_LT, fRES(sapAddMi));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMi The value of sapAddMi as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMi_GreaterEqual(String sapAddMi) {
        regSapAddMi(CK_GE, fRES(sapAddMi));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMi The value of sapAddMi as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMi_LessEqual(String sapAddMi) {
        regSapAddMi(CK_LE, fRES(sapAddMi));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMiList The collection of sapAddMi as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMi_InScope(Collection<String> sapAddMiList) {
        doSetSapAddMi_InScope(sapAddMiList);
    }

    protected void doSetSapAddMi_InScope(Collection<String> sapAddMiList) {
        regINS(CK_INS, cTL(sapAddMiList), xgetCValueSapAddMi(), "SAP_ADD_MI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMiList The collection of sapAddMi as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMi_NotInScope(Collection<String> sapAddMiList) {
        doSetSapAddMi_NotInScope(sapAddMiList);
    }

    protected void doSetSapAddMi_NotInScope(Collection<String> sapAddMiList) {
        regINS(CK_NINS, cTL(sapAddMiList), xgetCValueSapAddMi(), "SAP_ADD_MI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)} <br>
     * <pre>e.g. setSapAddMi_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapAddMi The value of sapAddMi as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapAddMi_LikeSearch(String sapAddMi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapAddMi), xgetCValueSapAddMi(), "SAP_ADD_MI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMi The value of sapAddMi as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapAddMi_NotLikeSearch(String sapAddMi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapAddMi), xgetCValueSapAddMi(), "SAP_ADD_MI", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMi The value of sapAddMi as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMi_PrefixSearch(String sapAddMi) {
        setSapAddMi_LikeSearch(sapAddMi, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     */
    public void setSapAddMi_IsNull() { regSapAddMi(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     */
    public void setSapAddMi_IsNullOrEmpty() { regSapAddMi(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     */
    public void setSapAddMi_IsNotNull() { regSapAddMi(CK_ISNN, DOBJ); }

    protected void regSapAddMi(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapAddMi(), "SAP_ADD_MI"); }
    protected abstract ConditionValue xgetCValueSapAddMi();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSs The value of sapAddSs as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddSs_Equal(String sapAddSs) {
        doSetSapAddSs_Equal(fRES(sapAddSs));
    }

    protected void doSetSapAddSs_Equal(String sapAddSs) {
        regSapAddSs(CK_EQ, sapAddSs);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSs The value of sapAddSs as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddSs_NotEqual(String sapAddSs) {
        doSetSapAddSs_NotEqual(fRES(sapAddSs));
    }

    protected void doSetSapAddSs_NotEqual(String sapAddSs) {
        regSapAddSs(CK_NES, sapAddSs);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSs The value of sapAddSs as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddSs_GreaterThan(String sapAddSs) {
        regSapAddSs(CK_GT, fRES(sapAddSs));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSs The value of sapAddSs as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddSs_LessThan(String sapAddSs) {
        regSapAddSs(CK_LT, fRES(sapAddSs));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSs The value of sapAddSs as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddSs_GreaterEqual(String sapAddSs) {
        regSapAddSs(CK_GE, fRES(sapAddSs));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSs The value of sapAddSs as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddSs_LessEqual(String sapAddSs) {
        regSapAddSs(CK_LE, fRES(sapAddSs));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSsList The collection of sapAddSs as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddSs_InScope(Collection<String> sapAddSsList) {
        doSetSapAddSs_InScope(sapAddSsList);
    }

    protected void doSetSapAddSs_InScope(Collection<String> sapAddSsList) {
        regINS(CK_INS, cTL(sapAddSsList), xgetCValueSapAddSs(), "SAP_ADD_SS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSsList The collection of sapAddSs as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddSs_NotInScope(Collection<String> sapAddSsList) {
        doSetSapAddSs_NotInScope(sapAddSsList);
    }

    protected void doSetSapAddSs_NotInScope(Collection<String> sapAddSsList) {
        regINS(CK_NINS, cTL(sapAddSsList), xgetCValueSapAddSs(), "SAP_ADD_SS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)} <br>
     * <pre>e.g. setSapAddSs_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapAddSs The value of sapAddSs as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapAddSs_LikeSearch(String sapAddSs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapAddSs), xgetCValueSapAddSs(), "SAP_ADD_SS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSs The value of sapAddSs as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapAddSs_NotLikeSearch(String sapAddSs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapAddSs), xgetCValueSapAddSs(), "SAP_ADD_SS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSs The value of sapAddSs as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddSs_PrefixSearch(String sapAddSs) {
        setSapAddSs_LikeSearch(sapAddSs, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     */
    public void setSapAddSs_IsNull() { regSapAddSs(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     */
    public void setSapAddSs_IsNullOrEmpty() { regSapAddSs(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     */
    public void setSapAddSs_IsNotNull() { regSapAddSs(CK_ISNN, DOBJ); }

    protected void regSapAddSs(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapAddSs(), "SAP_ADD_SS"); }
    protected abstract ConditionValue xgetCValueSapAddSs();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_USER_NM: {VARCHAR(30)}
     * @param sapAddUserNm The value of sapAddUserNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserNm_Equal(String sapAddUserNm) {
        doSetSapAddUserNm_Equal(fRES(sapAddUserNm));
    }

    protected void doSetSapAddUserNm_Equal(String sapAddUserNm) {
        regSapAddUserNm(CK_EQ, sapAddUserNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_USER_NM: {VARCHAR(30)}
     * @param sapAddUserNm The value of sapAddUserNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserNm_NotEqual(String sapAddUserNm) {
        doSetSapAddUserNm_NotEqual(fRES(sapAddUserNm));
    }

    protected void doSetSapAddUserNm_NotEqual(String sapAddUserNm) {
        regSapAddUserNm(CK_NES, sapAddUserNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_USER_NM: {VARCHAR(30)}
     * @param sapAddUserNm The value of sapAddUserNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserNm_GreaterThan(String sapAddUserNm) {
        regSapAddUserNm(CK_GT, fRES(sapAddUserNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_USER_NM: {VARCHAR(30)}
     * @param sapAddUserNm The value of sapAddUserNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserNm_LessThan(String sapAddUserNm) {
        regSapAddUserNm(CK_LT, fRES(sapAddUserNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_USER_NM: {VARCHAR(30)}
     * @param sapAddUserNm The value of sapAddUserNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserNm_GreaterEqual(String sapAddUserNm) {
        regSapAddUserNm(CK_GE, fRES(sapAddUserNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_USER_NM: {VARCHAR(30)}
     * @param sapAddUserNm The value of sapAddUserNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserNm_LessEqual(String sapAddUserNm) {
        regSapAddUserNm(CK_LE, fRES(sapAddUserNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_USER_NM: {VARCHAR(30)}
     * @param sapAddUserNmList The collection of sapAddUserNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserNm_InScope(Collection<String> sapAddUserNmList) {
        doSetSapAddUserNm_InScope(sapAddUserNmList);
    }

    protected void doSetSapAddUserNm_InScope(Collection<String> sapAddUserNmList) {
        regINS(CK_INS, cTL(sapAddUserNmList), xgetCValueSapAddUserNm(), "SAP_ADD_USER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_USER_NM: {VARCHAR(30)}
     * @param sapAddUserNmList The collection of sapAddUserNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserNm_NotInScope(Collection<String> sapAddUserNmList) {
        doSetSapAddUserNm_NotInScope(sapAddUserNmList);
    }

    protected void doSetSapAddUserNm_NotInScope(Collection<String> sapAddUserNmList) {
        regINS(CK_NINS, cTL(sapAddUserNmList), xgetCValueSapAddUserNm(), "SAP_ADD_USER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_USER_NM: {VARCHAR(30)} <br>
     * <pre>e.g. setSapAddUserNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapAddUserNm The value of sapAddUserNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapAddUserNm_LikeSearch(String sapAddUserNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapAddUserNm), xgetCValueSapAddUserNm(), "SAP_ADD_USER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_USER_NM: {VARCHAR(30)}
     * @param sapAddUserNm The value of sapAddUserNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapAddUserNm_NotLikeSearch(String sapAddUserNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapAddUserNm), xgetCValueSapAddUserNm(), "SAP_ADD_USER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_USER_NM: {VARCHAR(30)}
     * @param sapAddUserNm The value of sapAddUserNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserNm_PrefixSearch(String sapAddUserNm) {
        setSapAddUserNm_LikeSearch(sapAddUserNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_USER_NM: {VARCHAR(30)}
     */
    public void setSapAddUserNm_IsNull() { regSapAddUserNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_ADD_USER_NM: {VARCHAR(30)}
     */
    public void setSapAddUserNm_IsNullOrEmpty() { regSapAddUserNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_USER_NM: {VARCHAR(30)}
     */
    public void setSapAddUserNm_IsNotNull() { regSapAddUserNm(CK_ISNN, DOBJ); }

    protected void regSapAddUserNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapAddUserNm(), "SAP_ADD_USER_NM"); }
    protected abstract ConditionValue xgetCValueSapAddUserNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyy The value of sapUpdYyyy as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdYyyy_Equal(String sapUpdYyyy) {
        doSetSapUpdYyyy_Equal(fRES(sapUpdYyyy));
    }

    protected void doSetSapUpdYyyy_Equal(String sapUpdYyyy) {
        regSapUpdYyyy(CK_EQ, sapUpdYyyy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyy The value of sapUpdYyyy as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdYyyy_NotEqual(String sapUpdYyyy) {
        doSetSapUpdYyyy_NotEqual(fRES(sapUpdYyyy));
    }

    protected void doSetSapUpdYyyy_NotEqual(String sapUpdYyyy) {
        regSapUpdYyyy(CK_NES, sapUpdYyyy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyy The value of sapUpdYyyy as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdYyyy_GreaterThan(String sapUpdYyyy) {
        regSapUpdYyyy(CK_GT, fRES(sapUpdYyyy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyy The value of sapUpdYyyy as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdYyyy_LessThan(String sapUpdYyyy) {
        regSapUpdYyyy(CK_LT, fRES(sapUpdYyyy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyy The value of sapUpdYyyy as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdYyyy_GreaterEqual(String sapUpdYyyy) {
        regSapUpdYyyy(CK_GE, fRES(sapUpdYyyy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyy The value of sapUpdYyyy as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdYyyy_LessEqual(String sapUpdYyyy) {
        regSapUpdYyyy(CK_LE, fRES(sapUpdYyyy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyyList The collection of sapUpdYyyy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdYyyy_InScope(Collection<String> sapUpdYyyyList) {
        doSetSapUpdYyyy_InScope(sapUpdYyyyList);
    }

    protected void doSetSapUpdYyyy_InScope(Collection<String> sapUpdYyyyList) {
        regINS(CK_INS, cTL(sapUpdYyyyList), xgetCValueSapUpdYyyy(), "SAP_UPD_YYYY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyyList The collection of sapUpdYyyy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdYyyy_NotInScope(Collection<String> sapUpdYyyyList) {
        doSetSapUpdYyyy_NotInScope(sapUpdYyyyList);
    }

    protected void doSetSapUpdYyyy_NotInScope(Collection<String> sapUpdYyyyList) {
        regINS(CK_NINS, cTL(sapUpdYyyyList), xgetCValueSapUpdYyyy(), "SAP_UPD_YYYY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)} <br>
     * <pre>e.g. setSapUpdYyyy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUpdYyyy The value of sapUpdYyyy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUpdYyyy_LikeSearch(String sapUpdYyyy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUpdYyyy), xgetCValueSapUpdYyyy(), "SAP_UPD_YYYY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyy The value of sapUpdYyyy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUpdYyyy_NotLikeSearch(String sapUpdYyyy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUpdYyyy), xgetCValueSapUpdYyyy(), "SAP_UPD_YYYY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyy The value of sapUpdYyyy as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdYyyy_PrefixSearch(String sapUpdYyyy) {
        setSapUpdYyyy_LikeSearch(sapUpdYyyy, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     */
    public void setSapUpdYyyy_IsNull() { regSapUpdYyyy(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     */
    public void setSapUpdYyyy_IsNullOrEmpty() { regSapUpdYyyy(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     */
    public void setSapUpdYyyy_IsNotNull() { regSapUpdYyyy(CK_ISNN, DOBJ); }

    protected void regSapUpdYyyy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUpdYyyy(), "SAP_UPD_YYYY"); }
    protected abstract ConditionValue xgetCValueSapUpdYyyy();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMm The value of sapUpdMm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMm_Equal(String sapUpdMm) {
        doSetSapUpdMm_Equal(fRES(sapUpdMm));
    }

    protected void doSetSapUpdMm_Equal(String sapUpdMm) {
        regSapUpdMm(CK_EQ, sapUpdMm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMm The value of sapUpdMm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMm_NotEqual(String sapUpdMm) {
        doSetSapUpdMm_NotEqual(fRES(sapUpdMm));
    }

    protected void doSetSapUpdMm_NotEqual(String sapUpdMm) {
        regSapUpdMm(CK_NES, sapUpdMm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMm The value of sapUpdMm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMm_GreaterThan(String sapUpdMm) {
        regSapUpdMm(CK_GT, fRES(sapUpdMm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMm The value of sapUpdMm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMm_LessThan(String sapUpdMm) {
        regSapUpdMm(CK_LT, fRES(sapUpdMm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMm The value of sapUpdMm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMm_GreaterEqual(String sapUpdMm) {
        regSapUpdMm(CK_GE, fRES(sapUpdMm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMm The value of sapUpdMm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMm_LessEqual(String sapUpdMm) {
        regSapUpdMm(CK_LE, fRES(sapUpdMm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMmList The collection of sapUpdMm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMm_InScope(Collection<String> sapUpdMmList) {
        doSetSapUpdMm_InScope(sapUpdMmList);
    }

    protected void doSetSapUpdMm_InScope(Collection<String> sapUpdMmList) {
        regINS(CK_INS, cTL(sapUpdMmList), xgetCValueSapUpdMm(), "SAP_UPD_MM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMmList The collection of sapUpdMm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMm_NotInScope(Collection<String> sapUpdMmList) {
        doSetSapUpdMm_NotInScope(sapUpdMmList);
    }

    protected void doSetSapUpdMm_NotInScope(Collection<String> sapUpdMmList) {
        regINS(CK_NINS, cTL(sapUpdMmList), xgetCValueSapUpdMm(), "SAP_UPD_MM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)} <br>
     * <pre>e.g. setSapUpdMm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUpdMm The value of sapUpdMm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUpdMm_LikeSearch(String sapUpdMm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUpdMm), xgetCValueSapUpdMm(), "SAP_UPD_MM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMm The value of sapUpdMm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUpdMm_NotLikeSearch(String sapUpdMm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUpdMm), xgetCValueSapUpdMm(), "SAP_UPD_MM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMm The value of sapUpdMm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMm_PrefixSearch(String sapUpdMm) {
        setSapUpdMm_LikeSearch(sapUpdMm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     */
    public void setSapUpdMm_IsNull() { regSapUpdMm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     */
    public void setSapUpdMm_IsNullOrEmpty() { regSapUpdMm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     */
    public void setSapUpdMm_IsNotNull() { regSapUpdMm(CK_ISNN, DOBJ); }

    protected void regSapUpdMm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUpdMm(), "SAP_UPD_MM"); }
    protected abstract ConditionValue xgetCValueSapUpdMm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDd The value of sapUpdDd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdDd_Equal(String sapUpdDd) {
        doSetSapUpdDd_Equal(fRES(sapUpdDd));
    }

    protected void doSetSapUpdDd_Equal(String sapUpdDd) {
        regSapUpdDd(CK_EQ, sapUpdDd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDd The value of sapUpdDd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdDd_NotEqual(String sapUpdDd) {
        doSetSapUpdDd_NotEqual(fRES(sapUpdDd));
    }

    protected void doSetSapUpdDd_NotEqual(String sapUpdDd) {
        regSapUpdDd(CK_NES, sapUpdDd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDd The value of sapUpdDd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdDd_GreaterThan(String sapUpdDd) {
        regSapUpdDd(CK_GT, fRES(sapUpdDd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDd The value of sapUpdDd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdDd_LessThan(String sapUpdDd) {
        regSapUpdDd(CK_LT, fRES(sapUpdDd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDd The value of sapUpdDd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdDd_GreaterEqual(String sapUpdDd) {
        regSapUpdDd(CK_GE, fRES(sapUpdDd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDd The value of sapUpdDd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdDd_LessEqual(String sapUpdDd) {
        regSapUpdDd(CK_LE, fRES(sapUpdDd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDdList The collection of sapUpdDd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdDd_InScope(Collection<String> sapUpdDdList) {
        doSetSapUpdDd_InScope(sapUpdDdList);
    }

    protected void doSetSapUpdDd_InScope(Collection<String> sapUpdDdList) {
        regINS(CK_INS, cTL(sapUpdDdList), xgetCValueSapUpdDd(), "SAP_UPD_DD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDdList The collection of sapUpdDd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdDd_NotInScope(Collection<String> sapUpdDdList) {
        doSetSapUpdDd_NotInScope(sapUpdDdList);
    }

    protected void doSetSapUpdDd_NotInScope(Collection<String> sapUpdDdList) {
        regINS(CK_NINS, cTL(sapUpdDdList), xgetCValueSapUpdDd(), "SAP_UPD_DD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)} <br>
     * <pre>e.g. setSapUpdDd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUpdDd The value of sapUpdDd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUpdDd_LikeSearch(String sapUpdDd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUpdDd), xgetCValueSapUpdDd(), "SAP_UPD_DD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDd The value of sapUpdDd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUpdDd_NotLikeSearch(String sapUpdDd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUpdDd), xgetCValueSapUpdDd(), "SAP_UPD_DD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDd The value of sapUpdDd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdDd_PrefixSearch(String sapUpdDd) {
        setSapUpdDd_LikeSearch(sapUpdDd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     */
    public void setSapUpdDd_IsNull() { regSapUpdDd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     */
    public void setSapUpdDd_IsNullOrEmpty() { regSapUpdDd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     */
    public void setSapUpdDd_IsNotNull() { regSapUpdDd(CK_ISNN, DOBJ); }

    protected void regSapUpdDd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUpdDd(), "SAP_UPD_DD"); }
    protected abstract ConditionValue xgetCValueSapUpdDd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHh The value of sapUpdHh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdHh_Equal(String sapUpdHh) {
        doSetSapUpdHh_Equal(fRES(sapUpdHh));
    }

    protected void doSetSapUpdHh_Equal(String sapUpdHh) {
        regSapUpdHh(CK_EQ, sapUpdHh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHh The value of sapUpdHh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdHh_NotEqual(String sapUpdHh) {
        doSetSapUpdHh_NotEqual(fRES(sapUpdHh));
    }

    protected void doSetSapUpdHh_NotEqual(String sapUpdHh) {
        regSapUpdHh(CK_NES, sapUpdHh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHh The value of sapUpdHh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdHh_GreaterThan(String sapUpdHh) {
        regSapUpdHh(CK_GT, fRES(sapUpdHh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHh The value of sapUpdHh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdHh_LessThan(String sapUpdHh) {
        regSapUpdHh(CK_LT, fRES(sapUpdHh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHh The value of sapUpdHh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdHh_GreaterEqual(String sapUpdHh) {
        regSapUpdHh(CK_GE, fRES(sapUpdHh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHh The value of sapUpdHh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdHh_LessEqual(String sapUpdHh) {
        regSapUpdHh(CK_LE, fRES(sapUpdHh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHhList The collection of sapUpdHh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdHh_InScope(Collection<String> sapUpdHhList) {
        doSetSapUpdHh_InScope(sapUpdHhList);
    }

    protected void doSetSapUpdHh_InScope(Collection<String> sapUpdHhList) {
        regINS(CK_INS, cTL(sapUpdHhList), xgetCValueSapUpdHh(), "SAP_UPD_HH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHhList The collection of sapUpdHh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdHh_NotInScope(Collection<String> sapUpdHhList) {
        doSetSapUpdHh_NotInScope(sapUpdHhList);
    }

    protected void doSetSapUpdHh_NotInScope(Collection<String> sapUpdHhList) {
        regINS(CK_NINS, cTL(sapUpdHhList), xgetCValueSapUpdHh(), "SAP_UPD_HH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)} <br>
     * <pre>e.g. setSapUpdHh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUpdHh The value of sapUpdHh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUpdHh_LikeSearch(String sapUpdHh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUpdHh), xgetCValueSapUpdHh(), "SAP_UPD_HH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHh The value of sapUpdHh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUpdHh_NotLikeSearch(String sapUpdHh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUpdHh), xgetCValueSapUpdHh(), "SAP_UPD_HH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHh The value of sapUpdHh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdHh_PrefixSearch(String sapUpdHh) {
        setSapUpdHh_LikeSearch(sapUpdHh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     */
    public void setSapUpdHh_IsNull() { regSapUpdHh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     */
    public void setSapUpdHh_IsNullOrEmpty() { regSapUpdHh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     */
    public void setSapUpdHh_IsNotNull() { regSapUpdHh(CK_ISNN, DOBJ); }

    protected void regSapUpdHh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUpdHh(), "SAP_UPD_HH"); }
    protected abstract ConditionValue xgetCValueSapUpdHh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMi The value of sapUpdMi as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMi_Equal(String sapUpdMi) {
        doSetSapUpdMi_Equal(fRES(sapUpdMi));
    }

    protected void doSetSapUpdMi_Equal(String sapUpdMi) {
        regSapUpdMi(CK_EQ, sapUpdMi);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMi The value of sapUpdMi as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMi_NotEqual(String sapUpdMi) {
        doSetSapUpdMi_NotEqual(fRES(sapUpdMi));
    }

    protected void doSetSapUpdMi_NotEqual(String sapUpdMi) {
        regSapUpdMi(CK_NES, sapUpdMi);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMi The value of sapUpdMi as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMi_GreaterThan(String sapUpdMi) {
        regSapUpdMi(CK_GT, fRES(sapUpdMi));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMi The value of sapUpdMi as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMi_LessThan(String sapUpdMi) {
        regSapUpdMi(CK_LT, fRES(sapUpdMi));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMi The value of sapUpdMi as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMi_GreaterEqual(String sapUpdMi) {
        regSapUpdMi(CK_GE, fRES(sapUpdMi));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMi The value of sapUpdMi as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMi_LessEqual(String sapUpdMi) {
        regSapUpdMi(CK_LE, fRES(sapUpdMi));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMiList The collection of sapUpdMi as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMi_InScope(Collection<String> sapUpdMiList) {
        doSetSapUpdMi_InScope(sapUpdMiList);
    }

    protected void doSetSapUpdMi_InScope(Collection<String> sapUpdMiList) {
        regINS(CK_INS, cTL(sapUpdMiList), xgetCValueSapUpdMi(), "SAP_UPD_MI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMiList The collection of sapUpdMi as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMi_NotInScope(Collection<String> sapUpdMiList) {
        doSetSapUpdMi_NotInScope(sapUpdMiList);
    }

    protected void doSetSapUpdMi_NotInScope(Collection<String> sapUpdMiList) {
        regINS(CK_NINS, cTL(sapUpdMiList), xgetCValueSapUpdMi(), "SAP_UPD_MI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)} <br>
     * <pre>e.g. setSapUpdMi_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUpdMi The value of sapUpdMi as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUpdMi_LikeSearch(String sapUpdMi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUpdMi), xgetCValueSapUpdMi(), "SAP_UPD_MI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMi The value of sapUpdMi as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUpdMi_NotLikeSearch(String sapUpdMi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUpdMi), xgetCValueSapUpdMi(), "SAP_UPD_MI", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMi The value of sapUpdMi as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMi_PrefixSearch(String sapUpdMi) {
        setSapUpdMi_LikeSearch(sapUpdMi, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     */
    public void setSapUpdMi_IsNull() { regSapUpdMi(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     */
    public void setSapUpdMi_IsNullOrEmpty() { regSapUpdMi(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     */
    public void setSapUpdMi_IsNotNull() { regSapUpdMi(CK_ISNN, DOBJ); }

    protected void regSapUpdMi(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUpdMi(), "SAP_UPD_MI"); }
    protected abstract ConditionValue xgetCValueSapUpdMi();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSs The value of sapUpdSs as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdSs_Equal(String sapUpdSs) {
        doSetSapUpdSs_Equal(fRES(sapUpdSs));
    }

    protected void doSetSapUpdSs_Equal(String sapUpdSs) {
        regSapUpdSs(CK_EQ, sapUpdSs);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSs The value of sapUpdSs as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdSs_NotEqual(String sapUpdSs) {
        doSetSapUpdSs_NotEqual(fRES(sapUpdSs));
    }

    protected void doSetSapUpdSs_NotEqual(String sapUpdSs) {
        regSapUpdSs(CK_NES, sapUpdSs);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSs The value of sapUpdSs as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdSs_GreaterThan(String sapUpdSs) {
        regSapUpdSs(CK_GT, fRES(sapUpdSs));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSs The value of sapUpdSs as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdSs_LessThan(String sapUpdSs) {
        regSapUpdSs(CK_LT, fRES(sapUpdSs));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSs The value of sapUpdSs as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdSs_GreaterEqual(String sapUpdSs) {
        regSapUpdSs(CK_GE, fRES(sapUpdSs));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSs The value of sapUpdSs as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdSs_LessEqual(String sapUpdSs) {
        regSapUpdSs(CK_LE, fRES(sapUpdSs));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSsList The collection of sapUpdSs as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdSs_InScope(Collection<String> sapUpdSsList) {
        doSetSapUpdSs_InScope(sapUpdSsList);
    }

    protected void doSetSapUpdSs_InScope(Collection<String> sapUpdSsList) {
        regINS(CK_INS, cTL(sapUpdSsList), xgetCValueSapUpdSs(), "SAP_UPD_SS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSsList The collection of sapUpdSs as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdSs_NotInScope(Collection<String> sapUpdSsList) {
        doSetSapUpdSs_NotInScope(sapUpdSsList);
    }

    protected void doSetSapUpdSs_NotInScope(Collection<String> sapUpdSsList) {
        regINS(CK_NINS, cTL(sapUpdSsList), xgetCValueSapUpdSs(), "SAP_UPD_SS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)} <br>
     * <pre>e.g. setSapUpdSs_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUpdSs The value of sapUpdSs as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUpdSs_LikeSearch(String sapUpdSs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUpdSs), xgetCValueSapUpdSs(), "SAP_UPD_SS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSs The value of sapUpdSs as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUpdSs_NotLikeSearch(String sapUpdSs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUpdSs), xgetCValueSapUpdSs(), "SAP_UPD_SS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSs The value of sapUpdSs as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdSs_PrefixSearch(String sapUpdSs) {
        setSapUpdSs_LikeSearch(sapUpdSs, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     */
    public void setSapUpdSs_IsNull() { regSapUpdSs(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     */
    public void setSapUpdSs_IsNullOrEmpty() { regSapUpdSs(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     */
    public void setSapUpdSs_IsNotNull() { regSapUpdSs(CK_ISNN, DOBJ); }

    protected void regSapUpdSs(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUpdSs(), "SAP_UPD_SS"); }
    protected abstract ConditionValue xgetCValueSapUpdSs();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_USER_NM: {VARCHAR(30)}
     * @param sapUpdUserNm The value of sapUpdUserNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserNm_Equal(String sapUpdUserNm) {
        doSetSapUpdUserNm_Equal(fRES(sapUpdUserNm));
    }

    protected void doSetSapUpdUserNm_Equal(String sapUpdUserNm) {
        regSapUpdUserNm(CK_EQ, sapUpdUserNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_USER_NM: {VARCHAR(30)}
     * @param sapUpdUserNm The value of sapUpdUserNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserNm_NotEqual(String sapUpdUserNm) {
        doSetSapUpdUserNm_NotEqual(fRES(sapUpdUserNm));
    }

    protected void doSetSapUpdUserNm_NotEqual(String sapUpdUserNm) {
        regSapUpdUserNm(CK_NES, sapUpdUserNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_USER_NM: {VARCHAR(30)}
     * @param sapUpdUserNm The value of sapUpdUserNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserNm_GreaterThan(String sapUpdUserNm) {
        regSapUpdUserNm(CK_GT, fRES(sapUpdUserNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_USER_NM: {VARCHAR(30)}
     * @param sapUpdUserNm The value of sapUpdUserNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserNm_LessThan(String sapUpdUserNm) {
        regSapUpdUserNm(CK_LT, fRES(sapUpdUserNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_USER_NM: {VARCHAR(30)}
     * @param sapUpdUserNm The value of sapUpdUserNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserNm_GreaterEqual(String sapUpdUserNm) {
        regSapUpdUserNm(CK_GE, fRES(sapUpdUserNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_USER_NM: {VARCHAR(30)}
     * @param sapUpdUserNm The value of sapUpdUserNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserNm_LessEqual(String sapUpdUserNm) {
        regSapUpdUserNm(CK_LE, fRES(sapUpdUserNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_USER_NM: {VARCHAR(30)}
     * @param sapUpdUserNmList The collection of sapUpdUserNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserNm_InScope(Collection<String> sapUpdUserNmList) {
        doSetSapUpdUserNm_InScope(sapUpdUserNmList);
    }

    protected void doSetSapUpdUserNm_InScope(Collection<String> sapUpdUserNmList) {
        regINS(CK_INS, cTL(sapUpdUserNmList), xgetCValueSapUpdUserNm(), "SAP_UPD_USER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_USER_NM: {VARCHAR(30)}
     * @param sapUpdUserNmList The collection of sapUpdUserNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserNm_NotInScope(Collection<String> sapUpdUserNmList) {
        doSetSapUpdUserNm_NotInScope(sapUpdUserNmList);
    }

    protected void doSetSapUpdUserNm_NotInScope(Collection<String> sapUpdUserNmList) {
        regINS(CK_NINS, cTL(sapUpdUserNmList), xgetCValueSapUpdUserNm(), "SAP_UPD_USER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_USER_NM: {VARCHAR(30)} <br>
     * <pre>e.g. setSapUpdUserNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUpdUserNm The value of sapUpdUserNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUpdUserNm_LikeSearch(String sapUpdUserNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUpdUserNm), xgetCValueSapUpdUserNm(), "SAP_UPD_USER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_USER_NM: {VARCHAR(30)}
     * @param sapUpdUserNm The value of sapUpdUserNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUpdUserNm_NotLikeSearch(String sapUpdUserNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUpdUserNm), xgetCValueSapUpdUserNm(), "SAP_UPD_USER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_USER_NM: {VARCHAR(30)}
     * @param sapUpdUserNm The value of sapUpdUserNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserNm_PrefixSearch(String sapUpdUserNm) {
        setSapUpdUserNm_LikeSearch(sapUpdUserNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_USER_NM: {VARCHAR(30)}
     */
    public void setSapUpdUserNm_IsNull() { regSapUpdUserNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_UPD_USER_NM: {VARCHAR(30)}
     */
    public void setSapUpdUserNm_IsNullOrEmpty() { regSapUpdUserNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_USER_NM: {VARCHAR(30)}
     */
    public void setSapUpdUserNm_IsNotNull() { regSapUpdUserNm(CK_ISNN, DOBJ); }

    protected void regSapUpdUserNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUpdUserNm(), "SAP_UPD_USER_NM"); }
    protected abstract ConditionValue xgetCValueSapUpdUserNm();

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
    public HpSLCFunction<EsProductCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EsProductCB.class);
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
    public HpSLCFunction<EsProductCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EsProductCB.class);
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
    public HpSLCFunction<EsProductCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EsProductCB.class);
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
    public HpSLCFunction<EsProductCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EsProductCB.class);
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
    public HpSLCFunction<EsProductCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EsProductCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EsProductCB&gt;() {
     *     public void query(EsProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EsProductCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EsProductCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EsProductCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EsProductCQ sq);

    protected EsProductCB xcreateScalarConditionCB() {
        EsProductCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EsProductCB xcreateScalarConditionPartitionByCB() {
        EsProductCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EsProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EsProductCB cb = new EsProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRODUCT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EsProductCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EsProductCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EsProductCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EsProductCB cb = new EsProductCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRODUCT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EsProductCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EsProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EsProductCB cb = new EsProductCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EsProductCQ sq);

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
    protected EsProductCB newMyCB() {
        return new EsProductCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EsProductCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
