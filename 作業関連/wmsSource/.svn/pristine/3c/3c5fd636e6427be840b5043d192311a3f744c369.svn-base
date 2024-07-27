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
 * The abstract condition-query of e_koguchi_delivery.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEKoguchiDeliveryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEKoguchiDeliveryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "e_koguchi_delivery";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param koguchiDeliveryId The value of koguchiDeliveryId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryId_Equal(Long koguchiDeliveryId) {
        doSetKoguchiDeliveryId_Equal(koguchiDeliveryId);
    }

    protected void doSetKoguchiDeliveryId_Equal(Long koguchiDeliveryId) {
        regKoguchiDeliveryId(CK_EQ, koguchiDeliveryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param koguchiDeliveryId The value of koguchiDeliveryId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryId_NotEqual(Long koguchiDeliveryId) {
        doSetKoguchiDeliveryId_NotEqual(koguchiDeliveryId);
    }

    protected void doSetKoguchiDeliveryId_NotEqual(Long koguchiDeliveryId) {
        regKoguchiDeliveryId(CK_NES, koguchiDeliveryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param koguchiDeliveryId The value of koguchiDeliveryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryId_GreaterThan(Long koguchiDeliveryId) {
        regKoguchiDeliveryId(CK_GT, koguchiDeliveryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param koguchiDeliveryId The value of koguchiDeliveryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryId_LessThan(Long koguchiDeliveryId) {
        regKoguchiDeliveryId(CK_LT, koguchiDeliveryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param koguchiDeliveryId The value of koguchiDeliveryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryId_GreaterEqual(Long koguchiDeliveryId) {
        regKoguchiDeliveryId(CK_GE, koguchiDeliveryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param koguchiDeliveryId The value of koguchiDeliveryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryId_LessEqual(Long koguchiDeliveryId) {
        regKoguchiDeliveryId(CK_LE, koguchiDeliveryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of koguchiDeliveryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of koguchiDeliveryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setKoguchiDeliveryId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueKoguchiDeliveryId(), "KOGUCHI_DELIVERY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param koguchiDeliveryIdList The collection of koguchiDeliveryId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryId_InScope(Collection<Long> koguchiDeliveryIdList) {
        doSetKoguchiDeliveryId_InScope(koguchiDeliveryIdList);
    }

    protected void doSetKoguchiDeliveryId_InScope(Collection<Long> koguchiDeliveryIdList) {
        regINS(CK_INS, cTL(koguchiDeliveryIdList), xgetCValueKoguchiDeliveryId(), "KOGUCHI_DELIVERY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param koguchiDeliveryIdList The collection of koguchiDeliveryId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryId_NotInScope(Collection<Long> koguchiDeliveryIdList) {
        doSetKoguchiDeliveryId_NotInScope(koguchiDeliveryIdList);
    }

    protected void doSetKoguchiDeliveryId_NotInScope(Collection<Long> koguchiDeliveryIdList) {
        regINS(CK_NINS, cTL(koguchiDeliveryIdList), xgetCValueKoguchiDeliveryId(), "KOGUCHI_DELIVERY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setKoguchiDeliveryId_IsNull() { regKoguchiDeliveryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setKoguchiDeliveryId_IsNotNull() { regKoguchiDeliveryId(CK_ISNN, DOBJ); }

    protected void regKoguchiDeliveryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKoguchiDeliveryId(), "KOGUCHI_DELIVERY_ID"); }
    protected abstract ConditionValue xgetCValueKoguchiDeliveryId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCd The value of receiveCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_Equal(String receiveCd) {
        doSetReceiveCd_Equal(fRES(receiveCd));
    }

    protected void doSetReceiveCd_Equal(String receiveCd) {
        regReceiveCd(CK_EQ, receiveCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCd The value of receiveCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_NotEqual(String receiveCd) {
        doSetReceiveCd_NotEqual(fRES(receiveCd));
    }

    protected void doSetReceiveCd_NotEqual(String receiveCd) {
        regReceiveCd(CK_NES, receiveCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCd The value of receiveCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_GreaterThan(String receiveCd) {
        regReceiveCd(CK_GT, fRES(receiveCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCd The value of receiveCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_LessThan(String receiveCd) {
        regReceiveCd(CK_LT, fRES(receiveCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCd The value of receiveCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_GreaterEqual(String receiveCd) {
        regReceiveCd(CK_GE, fRES(receiveCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCd The value of receiveCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_LessEqual(String receiveCd) {
        regReceiveCd(CK_LE, fRES(receiveCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCdList The collection of receiveCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_InScope(Collection<String> receiveCdList) {
        doSetReceiveCd_InScope(receiveCdList);
    }

    protected void doSetReceiveCd_InScope(Collection<String> receiveCdList) {
        regINS(CK_INS, cTL(receiveCdList), xgetCValueReceiveCd(), "RECEIVE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCdList The collection of receiveCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_NotInScope(Collection<String> receiveCdList) {
        doSetReceiveCd_NotInScope(receiveCdList);
    }

    protected void doSetReceiveCd_NotInScope(Collection<String> receiveCdList) {
        regINS(CK_NINS, cTL(receiveCdList), xgetCValueReceiveCd(), "RECEIVE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setReceiveCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveCd The value of receiveCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveCd_LikeSearch(String receiveCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveCd), xgetCValueReceiveCd(), "RECEIVE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCd The value of receiveCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveCd_NotLikeSearch(String receiveCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveCd), xgetCValueReceiveCd(), "RECEIVE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCd The value of receiveCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_PrefixSearch(String receiveCd) {
        setReceiveCd_LikeSearch(receiveCd, xcLSOPPre());
    }

    protected void regReceiveCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveCd(), "RECEIVE_CD"); }
    protected abstract ConditionValue xgetCValueReceiveCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @param receiveRowId The value of receiveRowId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_Equal(Long receiveRowId) {
        doSetReceiveRowId_Equal(receiveRowId);
    }

    protected void doSetReceiveRowId_Equal(Long receiveRowId) {
        regReceiveRowId(CK_EQ, receiveRowId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @param receiveRowId The value of receiveRowId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_NotEqual(Long receiveRowId) {
        doSetReceiveRowId_NotEqual(receiveRowId);
    }

    protected void doSetReceiveRowId_NotEqual(Long receiveRowId) {
        regReceiveRowId(CK_NES, receiveRowId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @param receiveRowId The value of receiveRowId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_GreaterThan(Long receiveRowId) {
        regReceiveRowId(CK_GT, receiveRowId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @param receiveRowId The value of receiveRowId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_LessThan(Long receiveRowId) {
        regReceiveRowId(CK_LT, receiveRowId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @param receiveRowId The value of receiveRowId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_GreaterEqual(Long receiveRowId) {
        regReceiveRowId(CK_GE, receiveRowId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @param receiveRowId The value of receiveRowId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_LessEqual(Long receiveRowId) {
        regReceiveRowId(CK_LE, receiveRowId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @param minNumber The min number of receiveRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveRowId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveRowId(), "RECEIVE_ROW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @param receiveRowIdList The collection of receiveRowId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRowId_InScope(Collection<Long> receiveRowIdList) {
        doSetReceiveRowId_InScope(receiveRowIdList);
    }

    protected void doSetReceiveRowId_InScope(Collection<Long> receiveRowIdList) {
        regINS(CK_INS, cTL(receiveRowIdList), xgetCValueReceiveRowId(), "RECEIVE_ROW_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @param receiveRowIdList The collection of receiveRowId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRowId_NotInScope(Collection<Long> receiveRowIdList) {
        doSetReceiveRowId_NotInScope(receiveRowIdList);
    }

    protected void doSetReceiveRowId_NotInScope(Collection<Long> receiveRowIdList) {
        regINS(CK_NINS, cTL(receiveRowIdList), xgetCValueReceiveRowId(), "RECEIVE_ROW_ID");
    }

    protected void regReceiveRowId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveRowId(), "RECEIVE_ROW_ID"); }
    protected abstract ConditionValue xgetCValueReceiveRowId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param receiveFlg The value of receiveFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveFlg_Equal(String receiveFlg) {
        doSetReceiveFlg_Equal(fRES(receiveFlg));
    }

    protected void doSetReceiveFlg_Equal(String receiveFlg) {
        regReceiveFlg(CK_EQ, receiveFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param receiveFlg The value of receiveFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveFlg_NotEqual(String receiveFlg) {
        doSetReceiveFlg_NotEqual(fRES(receiveFlg));
    }

    protected void doSetReceiveFlg_NotEqual(String receiveFlg) {
        regReceiveFlg(CK_NES, receiveFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param receiveFlg The value of receiveFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveFlg_GreaterThan(String receiveFlg) {
        regReceiveFlg(CK_GT, fRES(receiveFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param receiveFlg The value of receiveFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveFlg_LessThan(String receiveFlg) {
        regReceiveFlg(CK_LT, fRES(receiveFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param receiveFlg The value of receiveFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveFlg_GreaterEqual(String receiveFlg) {
        regReceiveFlg(CK_GE, fRES(receiveFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param receiveFlg The value of receiveFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveFlg_LessEqual(String receiveFlg) {
        regReceiveFlg(CK_LE, fRES(receiveFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param receiveFlgList The collection of receiveFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveFlg_InScope(Collection<String> receiveFlgList) {
        doSetReceiveFlg_InScope(receiveFlgList);
    }

    protected void doSetReceiveFlg_InScope(Collection<String> receiveFlgList) {
        regINS(CK_INS, cTL(receiveFlgList), xgetCValueReceiveFlg(), "RECEIVE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param receiveFlgList The collection of receiveFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveFlg_NotInScope(Collection<String> receiveFlgList) {
        doSetReceiveFlg_NotInScope(receiveFlgList);
    }

    protected void doSetReceiveFlg_NotInScope(Collection<String> receiveFlgList) {
        regINS(CK_NINS, cTL(receiveFlgList), xgetCValueReceiveFlg(), "RECEIVE_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * <pre>e.g. setReceiveFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveFlg The value of receiveFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveFlg_LikeSearch(String receiveFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveFlg), xgetCValueReceiveFlg(), "RECEIVE_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param receiveFlg The value of receiveFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveFlg_NotLikeSearch(String receiveFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveFlg), xgetCValueReceiveFlg(), "RECEIVE_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param receiveFlg The value of receiveFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveFlg_PrefixSearch(String receiveFlg) {
        setReceiveFlg_LikeSearch(receiveFlg, xcLSOPPre());
    }

    protected void regReceiveFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveFlg(), "RECEIVE_FLG"); }
    protected abstract ConditionValue xgetCValueReceiveFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @param errorFlg The value of errorFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_Equal(String errorFlg) {
        doSetErrorFlg_Equal(fRES(errorFlg));
    }

    protected void doSetErrorFlg_Equal(String errorFlg) {
        regErrorFlg(CK_EQ, errorFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @param errorFlg The value of errorFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotEqual(String errorFlg) {
        doSetErrorFlg_NotEqual(fRES(errorFlg));
    }

    protected void doSetErrorFlg_NotEqual(String errorFlg) {
        regErrorFlg(CK_NES, errorFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @param errorFlg The value of errorFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterThan(String errorFlg) {
        regErrorFlg(CK_GT, fRES(errorFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @param errorFlg The value of errorFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessThan(String errorFlg) {
        regErrorFlg(CK_LT, fRES(errorFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @param errorFlg The value of errorFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterEqual(String errorFlg) {
        regErrorFlg(CK_GE, fRES(errorFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @param errorFlg The value of errorFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessEqual(String errorFlg) {
        regErrorFlg(CK_LE, fRES(errorFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @param errorFlgList The collection of errorFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_InScope(Collection<String> errorFlgList) {
        doSetErrorFlg_InScope(errorFlgList);
    }

    protected void doSetErrorFlg_InScope(Collection<String> errorFlgList) {
        regINS(CK_INS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @param errorFlgList The collection of errorFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope(Collection<String> errorFlgList) {
        doSetErrorFlg_NotInScope(errorFlgList);
    }

    protected void doSetErrorFlg_NotInScope(Collection<String> errorFlgList) {
        regINS(CK_NINS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * <pre>e.g. setErrorFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorFlg The value of errorFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorFlg_LikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @param errorFlg The value of errorFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorFlg_NotLikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @param errorFlg The value of errorFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_PrefixSearch(String errorFlg) {
        setErrorFlg_LikeSearch(errorFlg, xcLSOPPre());
    }

    protected void regErrorFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorFlg(), "ERROR_FLG"); }
    protected abstract ConditionValue xgetCValueErrorFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCd The value of errorMessageCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_Equal(String errorMessageCd) {
        doSetErrorMessageCd_Equal(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_Equal(String errorMessageCd) {
        regErrorMessageCd(CK_EQ, errorMessageCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCd The value of errorMessageCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotEqual(String errorMessageCd) {
        doSetErrorMessageCd_NotEqual(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_NotEqual(String errorMessageCd) {
        regErrorMessageCd(CK_NES, errorMessageCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCd The value of errorMessageCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterThan(String errorMessageCd) {
        regErrorMessageCd(CK_GT, fRES(errorMessageCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCd The value of errorMessageCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessThan(String errorMessageCd) {
        regErrorMessageCd(CK_LT, fRES(errorMessageCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCd The value of errorMessageCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterEqual(String errorMessageCd) {
        regErrorMessageCd(CK_GE, fRES(errorMessageCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCd The value of errorMessageCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessEqual(String errorMessageCd) {
        regErrorMessageCd(CK_LE, fRES(errorMessageCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCdList The collection of errorMessageCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_InScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        regINS(CK_INS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCdList The collection of errorMessageCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_NotInScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        regINS(CK_NINS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setErrorMessageCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorMessageCd The value of errorMessageCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorMessageCd_LikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCd The value of errorMessageCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorMessageCd_NotLikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCd The value of errorMessageCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_PrefixSearch(String errorMessageCd) {
        setErrorMessageCd_LikeSearch(errorMessageCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     */
    public void setErrorMessageCd_IsNull() { regErrorMessageCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     */
    public void setErrorMessageCd_IsNullOrEmpty() { regErrorMessageCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     */
    public void setErrorMessageCd_IsNotNull() { regErrorMessageCd(CK_ISNN, DOBJ); }

    protected void regErrorMessageCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD"); }
    protected abstract ConditionValue xgetCValueErrorMessageCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_Equal(String baseCd) {
        doSetBaseCd_Equal(fRES(baseCd));
    }

    protected void doSetBaseCd_Equal(String baseCd) {
        regBaseCd(CK_EQ, baseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_NotEqual(String baseCd) {
        doSetBaseCd_NotEqual(fRES(baseCd));
    }

    protected void doSetBaseCd_NotEqual(String baseCd) {
        regBaseCd(CK_NES, baseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_GreaterThan(String baseCd) {
        regBaseCd(CK_GT, fRES(baseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_LessThan(String baseCd) {
        regBaseCd(CK_LT, fRES(baseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_GreaterEqual(String baseCd) {
        regBaseCd(CK_GE, fRES(baseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_LessEqual(String baseCd) {
        regBaseCd(CK_LE, fRES(baseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCdList The collection of baseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_InScope(Collection<String> baseCdList) {
        doSetBaseCd_InScope(baseCdList);
    }

    protected void doSetBaseCd_InScope(Collection<String> baseCdList) {
        regINS(CK_INS, cTL(baseCdList), xgetCValueBaseCd(), "BASE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCdList The collection of baseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_NotInScope(Collection<String> baseCdList) {
        doSetBaseCd_NotInScope(baseCdList);
    }

    protected void doSetBaseCd_NotInScope(Collection<String> baseCdList) {
        regINS(CK_NINS, cTL(baseCdList), xgetCValueBaseCd(), "BASE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setBaseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param baseCd The value of baseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBaseCd_LikeSearch(String baseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(baseCd), xgetCValueBaseCd(), "BASE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBaseCd_NotLikeSearch(String baseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(baseCd), xgetCValueBaseCd(), "BASE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_PrefixSearch(String baseCd) {
        setBaseCd_LikeSearch(baseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     */
    public void setBaseCd_IsNull() { regBaseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     */
    public void setBaseCd_IsNullOrEmpty() { regBaseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     */
    public void setBaseCd_IsNotNull() { regBaseCd(CK_ISNN, DOBJ); }

    protected void regBaseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBaseCd(), "BASE_CD"); }
    protected abstract ConditionValue xgetCValueBaseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERV_SALES_ORG_CD: {VARCHAR(100)}
     * @param servSalesOrgCd The value of servSalesOrgCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServSalesOrgCd_Equal(String servSalesOrgCd) {
        doSetServSalesOrgCd_Equal(fRES(servSalesOrgCd));
    }

    protected void doSetServSalesOrgCd_Equal(String servSalesOrgCd) {
        regServSalesOrgCd(CK_EQ, servSalesOrgCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERV_SALES_ORG_CD: {VARCHAR(100)}
     * @param servSalesOrgCd The value of servSalesOrgCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServSalesOrgCd_NotEqual(String servSalesOrgCd) {
        doSetServSalesOrgCd_NotEqual(fRES(servSalesOrgCd));
    }

    protected void doSetServSalesOrgCd_NotEqual(String servSalesOrgCd) {
        regServSalesOrgCd(CK_NES, servSalesOrgCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERV_SALES_ORG_CD: {VARCHAR(100)}
     * @param servSalesOrgCd The value of servSalesOrgCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServSalesOrgCd_GreaterThan(String servSalesOrgCd) {
        regServSalesOrgCd(CK_GT, fRES(servSalesOrgCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERV_SALES_ORG_CD: {VARCHAR(100)}
     * @param servSalesOrgCd The value of servSalesOrgCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServSalesOrgCd_LessThan(String servSalesOrgCd) {
        regServSalesOrgCd(CK_LT, fRES(servSalesOrgCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERV_SALES_ORG_CD: {VARCHAR(100)}
     * @param servSalesOrgCd The value of servSalesOrgCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServSalesOrgCd_GreaterEqual(String servSalesOrgCd) {
        regServSalesOrgCd(CK_GE, fRES(servSalesOrgCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERV_SALES_ORG_CD: {VARCHAR(100)}
     * @param servSalesOrgCd The value of servSalesOrgCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServSalesOrgCd_LessEqual(String servSalesOrgCd) {
        regServSalesOrgCd(CK_LE, fRES(servSalesOrgCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SERV_SALES_ORG_CD: {VARCHAR(100)}
     * @param servSalesOrgCdList The collection of servSalesOrgCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServSalesOrgCd_InScope(Collection<String> servSalesOrgCdList) {
        doSetServSalesOrgCd_InScope(servSalesOrgCdList);
    }

    protected void doSetServSalesOrgCd_InScope(Collection<String> servSalesOrgCdList) {
        regINS(CK_INS, cTL(servSalesOrgCdList), xgetCValueServSalesOrgCd(), "SERV_SALES_ORG_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SERV_SALES_ORG_CD: {VARCHAR(100)}
     * @param servSalesOrgCdList The collection of servSalesOrgCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServSalesOrgCd_NotInScope(Collection<String> servSalesOrgCdList) {
        doSetServSalesOrgCd_NotInScope(servSalesOrgCdList);
    }

    protected void doSetServSalesOrgCd_NotInScope(Collection<String> servSalesOrgCdList) {
        regINS(CK_NINS, cTL(servSalesOrgCdList), xgetCValueServSalesOrgCd(), "SERV_SALES_ORG_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SERV_SALES_ORG_CD: {VARCHAR(100)} <br>
     * <pre>e.g. setServSalesOrgCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param servSalesOrgCd The value of servSalesOrgCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setServSalesOrgCd_LikeSearch(String servSalesOrgCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(servSalesOrgCd), xgetCValueServSalesOrgCd(), "SERV_SALES_ORG_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SERV_SALES_ORG_CD: {VARCHAR(100)}
     * @param servSalesOrgCd The value of servSalesOrgCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setServSalesOrgCd_NotLikeSearch(String servSalesOrgCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(servSalesOrgCd), xgetCValueServSalesOrgCd(), "SERV_SALES_ORG_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SERV_SALES_ORG_CD: {VARCHAR(100)}
     * @param servSalesOrgCd The value of servSalesOrgCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServSalesOrgCd_PrefixSearch(String servSalesOrgCd) {
        setServSalesOrgCd_LikeSearch(servSalesOrgCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SERV_SALES_ORG_CD: {VARCHAR(100)}
     */
    public void setServSalesOrgCd_IsNull() { regServSalesOrgCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SERV_SALES_ORG_CD: {VARCHAR(100)}
     */
    public void setServSalesOrgCd_IsNullOrEmpty() { regServSalesOrgCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SERV_SALES_ORG_CD: {VARCHAR(100)}
     */
    public void setServSalesOrgCd_IsNotNull() { regServSalesOrgCd(CK_ISNN, DOBJ); }

    protected void regServSalesOrgCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueServSalesOrgCd(), "SERV_SALES_ORG_CD"); }
    protected abstract ConditionValue xgetCValueServSalesOrgCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERV_SALES_ORG_NM: {VARCHAR(60)}
     * @param servSalesOrgNm The value of servSalesOrgNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServSalesOrgNm_Equal(String servSalesOrgNm) {
        doSetServSalesOrgNm_Equal(fRES(servSalesOrgNm));
    }

    protected void doSetServSalesOrgNm_Equal(String servSalesOrgNm) {
        regServSalesOrgNm(CK_EQ, servSalesOrgNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERV_SALES_ORG_NM: {VARCHAR(60)}
     * @param servSalesOrgNm The value of servSalesOrgNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServSalesOrgNm_NotEqual(String servSalesOrgNm) {
        doSetServSalesOrgNm_NotEqual(fRES(servSalesOrgNm));
    }

    protected void doSetServSalesOrgNm_NotEqual(String servSalesOrgNm) {
        regServSalesOrgNm(CK_NES, servSalesOrgNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERV_SALES_ORG_NM: {VARCHAR(60)}
     * @param servSalesOrgNm The value of servSalesOrgNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServSalesOrgNm_GreaterThan(String servSalesOrgNm) {
        regServSalesOrgNm(CK_GT, fRES(servSalesOrgNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERV_SALES_ORG_NM: {VARCHAR(60)}
     * @param servSalesOrgNm The value of servSalesOrgNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServSalesOrgNm_LessThan(String servSalesOrgNm) {
        regServSalesOrgNm(CK_LT, fRES(servSalesOrgNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERV_SALES_ORG_NM: {VARCHAR(60)}
     * @param servSalesOrgNm The value of servSalesOrgNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServSalesOrgNm_GreaterEqual(String servSalesOrgNm) {
        regServSalesOrgNm(CK_GE, fRES(servSalesOrgNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERV_SALES_ORG_NM: {VARCHAR(60)}
     * @param servSalesOrgNm The value of servSalesOrgNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServSalesOrgNm_LessEqual(String servSalesOrgNm) {
        regServSalesOrgNm(CK_LE, fRES(servSalesOrgNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SERV_SALES_ORG_NM: {VARCHAR(60)}
     * @param servSalesOrgNmList The collection of servSalesOrgNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServSalesOrgNm_InScope(Collection<String> servSalesOrgNmList) {
        doSetServSalesOrgNm_InScope(servSalesOrgNmList);
    }

    protected void doSetServSalesOrgNm_InScope(Collection<String> servSalesOrgNmList) {
        regINS(CK_INS, cTL(servSalesOrgNmList), xgetCValueServSalesOrgNm(), "SERV_SALES_ORG_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SERV_SALES_ORG_NM: {VARCHAR(60)}
     * @param servSalesOrgNmList The collection of servSalesOrgNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServSalesOrgNm_NotInScope(Collection<String> servSalesOrgNmList) {
        doSetServSalesOrgNm_NotInScope(servSalesOrgNmList);
    }

    protected void doSetServSalesOrgNm_NotInScope(Collection<String> servSalesOrgNmList) {
        regINS(CK_NINS, cTL(servSalesOrgNmList), xgetCValueServSalesOrgNm(), "SERV_SALES_ORG_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SERV_SALES_ORG_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setServSalesOrgNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param servSalesOrgNm The value of servSalesOrgNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setServSalesOrgNm_LikeSearch(String servSalesOrgNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(servSalesOrgNm), xgetCValueServSalesOrgNm(), "SERV_SALES_ORG_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SERV_SALES_ORG_NM: {VARCHAR(60)}
     * @param servSalesOrgNm The value of servSalesOrgNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setServSalesOrgNm_NotLikeSearch(String servSalesOrgNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(servSalesOrgNm), xgetCValueServSalesOrgNm(), "SERV_SALES_ORG_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SERV_SALES_ORG_NM: {VARCHAR(60)}
     * @param servSalesOrgNm The value of servSalesOrgNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServSalesOrgNm_PrefixSearch(String servSalesOrgNm) {
        setServSalesOrgNm_LikeSearch(servSalesOrgNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SERV_SALES_ORG_NM: {VARCHAR(60)}
     */
    public void setServSalesOrgNm_IsNull() { regServSalesOrgNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SERV_SALES_ORG_NM: {VARCHAR(60)}
     */
    public void setServSalesOrgNm_IsNullOrEmpty() { regServSalesOrgNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SERV_SALES_ORG_NM: {VARCHAR(60)}
     */
    public void setServSalesOrgNm_IsNotNull() { regServSalesOrgNm(CK_ISNN, DOBJ); }

    protected void regServSalesOrgNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueServSalesOrgNm(), "SERV_SALES_ORG_NM"); }
    protected abstract ConditionValue xgetCValueServSalesOrgNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_FLG: {CHAR(1)}
     * @param directFlg The value of directFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectFlg_Equal(String directFlg) {
        doSetDirectFlg_Equal(fRES(directFlg));
    }

    protected void doSetDirectFlg_Equal(String directFlg) {
        regDirectFlg(CK_EQ, directFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_FLG: {CHAR(1)}
     * @param directFlg The value of directFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectFlg_NotEqual(String directFlg) {
        doSetDirectFlg_NotEqual(fRES(directFlg));
    }

    protected void doSetDirectFlg_NotEqual(String directFlg) {
        regDirectFlg(CK_NES, directFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_FLG: {CHAR(1)}
     * @param directFlg The value of directFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectFlg_GreaterThan(String directFlg) {
        regDirectFlg(CK_GT, fRES(directFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_FLG: {CHAR(1)}
     * @param directFlg The value of directFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectFlg_LessThan(String directFlg) {
        regDirectFlg(CK_LT, fRES(directFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_FLG: {CHAR(1)}
     * @param directFlg The value of directFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectFlg_GreaterEqual(String directFlg) {
        regDirectFlg(CK_GE, fRES(directFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_FLG: {CHAR(1)}
     * @param directFlg The value of directFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectFlg_LessEqual(String directFlg) {
        regDirectFlg(CK_LE, fRES(directFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECT_FLG: {CHAR(1)}
     * @param directFlgList The collection of directFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectFlg_InScope(Collection<String> directFlgList) {
        doSetDirectFlg_InScope(directFlgList);
    }

    protected void doSetDirectFlg_InScope(Collection<String> directFlgList) {
        regINS(CK_INS, cTL(directFlgList), xgetCValueDirectFlg(), "DIRECT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECT_FLG: {CHAR(1)}
     * @param directFlgList The collection of directFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectFlg_NotInScope(Collection<String> directFlgList) {
        doSetDirectFlg_NotInScope(directFlgList);
    }

    protected void doSetDirectFlg_NotInScope(Collection<String> directFlgList) {
        regINS(CK_NINS, cTL(directFlgList), xgetCValueDirectFlg(), "DIRECT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setDirectFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directFlg The value of directFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectFlg_LikeSearch(String directFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directFlg), xgetCValueDirectFlg(), "DIRECT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECT_FLG: {CHAR(1)}
     * @param directFlg The value of directFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectFlg_NotLikeSearch(String directFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directFlg), xgetCValueDirectFlg(), "DIRECT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECT_FLG: {CHAR(1)}
     * @param directFlg The value of directFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectFlg_PrefixSearch(String directFlg) {
        setDirectFlg_LikeSearch(directFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECT_FLG: {CHAR(1)}
     */
    public void setDirectFlg_IsNull() { regDirectFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECT_FLG: {CHAR(1)}
     */
    public void setDirectFlg_IsNullOrEmpty() { regDirectFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECT_FLG: {CHAR(1)}
     */
    public void setDirectFlg_IsNotNull() { regDirectFlg(CK_ISNN, DOBJ); }

    protected void regDirectFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectFlg(), "DIRECT_FLG"); }
    protected abstract ConditionValue xgetCValueDirectFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URGENT_FLG: {CHAR(1)}
     * @param urgentFlg The value of urgentFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrgentFlg_Equal(String urgentFlg) {
        doSetUrgentFlg_Equal(fRES(urgentFlg));
    }

    protected void doSetUrgentFlg_Equal(String urgentFlg) {
        regUrgentFlg(CK_EQ, urgentFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URGENT_FLG: {CHAR(1)}
     * @param urgentFlg The value of urgentFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrgentFlg_NotEqual(String urgentFlg) {
        doSetUrgentFlg_NotEqual(fRES(urgentFlg));
    }

    protected void doSetUrgentFlg_NotEqual(String urgentFlg) {
        regUrgentFlg(CK_NES, urgentFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URGENT_FLG: {CHAR(1)}
     * @param urgentFlg The value of urgentFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrgentFlg_GreaterThan(String urgentFlg) {
        regUrgentFlg(CK_GT, fRES(urgentFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URGENT_FLG: {CHAR(1)}
     * @param urgentFlg The value of urgentFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrgentFlg_LessThan(String urgentFlg) {
        regUrgentFlg(CK_LT, fRES(urgentFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URGENT_FLG: {CHAR(1)}
     * @param urgentFlg The value of urgentFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrgentFlg_GreaterEqual(String urgentFlg) {
        regUrgentFlg(CK_GE, fRES(urgentFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URGENT_FLG: {CHAR(1)}
     * @param urgentFlg The value of urgentFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrgentFlg_LessEqual(String urgentFlg) {
        regUrgentFlg(CK_LE, fRES(urgentFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * URGENT_FLG: {CHAR(1)}
     * @param urgentFlgList The collection of urgentFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrgentFlg_InScope(Collection<String> urgentFlgList) {
        doSetUrgentFlg_InScope(urgentFlgList);
    }

    protected void doSetUrgentFlg_InScope(Collection<String> urgentFlgList) {
        regINS(CK_INS, cTL(urgentFlgList), xgetCValueUrgentFlg(), "URGENT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * URGENT_FLG: {CHAR(1)}
     * @param urgentFlgList The collection of urgentFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrgentFlg_NotInScope(Collection<String> urgentFlgList) {
        doSetUrgentFlg_NotInScope(urgentFlgList);
    }

    protected void doSetUrgentFlg_NotInScope(Collection<String> urgentFlgList) {
        regINS(CK_NINS, cTL(urgentFlgList), xgetCValueUrgentFlg(), "URGENT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * URGENT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setUrgentFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param urgentFlg The value of urgentFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUrgentFlg_LikeSearch(String urgentFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(urgentFlg), xgetCValueUrgentFlg(), "URGENT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * URGENT_FLG: {CHAR(1)}
     * @param urgentFlg The value of urgentFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUrgentFlg_NotLikeSearch(String urgentFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(urgentFlg), xgetCValueUrgentFlg(), "URGENT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * URGENT_FLG: {CHAR(1)}
     * @param urgentFlg The value of urgentFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrgentFlg_PrefixSearch(String urgentFlg) {
        setUrgentFlg_LikeSearch(urgentFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * URGENT_FLG: {CHAR(1)}
     */
    public void setUrgentFlg_IsNull() { regUrgentFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * URGENT_FLG: {CHAR(1)}
     */
    public void setUrgentFlg_IsNullOrEmpty() { regUrgentFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * URGENT_FLG: {CHAR(1)}
     */
    public void setUrgentFlg_IsNotNull() { regUrgentFlg(CK_ISNN, DOBJ); }

    protected void regUrgentFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUrgentFlg(), "URGENT_FLG"); }
    protected abstract ConditionValue xgetCValueUrgentFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {CHAR(1)}
     * @param deliveryFlg The value of deliveryFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_Equal(String deliveryFlg) {
        doSetDeliveryFlg_Equal(fRES(deliveryFlg));
    }

    protected void doSetDeliveryFlg_Equal(String deliveryFlg) {
        regDeliveryFlg(CK_EQ, deliveryFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {CHAR(1)}
     * @param deliveryFlg The value of deliveryFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_NotEqual(String deliveryFlg) {
        doSetDeliveryFlg_NotEqual(fRES(deliveryFlg));
    }

    protected void doSetDeliveryFlg_NotEqual(String deliveryFlg) {
        regDeliveryFlg(CK_NES, deliveryFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {CHAR(1)}
     * @param deliveryFlg The value of deliveryFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_GreaterThan(String deliveryFlg) {
        regDeliveryFlg(CK_GT, fRES(deliveryFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {CHAR(1)}
     * @param deliveryFlg The value of deliveryFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_LessThan(String deliveryFlg) {
        regDeliveryFlg(CK_LT, fRES(deliveryFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {CHAR(1)}
     * @param deliveryFlg The value of deliveryFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_GreaterEqual(String deliveryFlg) {
        regDeliveryFlg(CK_GE, fRES(deliveryFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {CHAR(1)}
     * @param deliveryFlg The value of deliveryFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_LessEqual(String deliveryFlg) {
        regDeliveryFlg(CK_LE, fRES(deliveryFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_FLG: {CHAR(1)}
     * @param deliveryFlgList The collection of deliveryFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_InScope(Collection<String> deliveryFlgList) {
        doSetDeliveryFlg_InScope(deliveryFlgList);
    }

    protected void doSetDeliveryFlg_InScope(Collection<String> deliveryFlgList) {
        regINS(CK_INS, cTL(deliveryFlgList), xgetCValueDeliveryFlg(), "DELIVERY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_FLG: {CHAR(1)}
     * @param deliveryFlgList The collection of deliveryFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_NotInScope(Collection<String> deliveryFlgList) {
        doSetDeliveryFlg_NotInScope(deliveryFlgList);
    }

    protected void doSetDeliveryFlg_NotInScope(Collection<String> deliveryFlgList) {
        regINS(CK_NINS, cTL(deliveryFlgList), xgetCValueDeliveryFlg(), "DELIVERY_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_FLG: {CHAR(1)} <br>
     * <pre>e.g. setDeliveryFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryFlg The value of deliveryFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryFlg_LikeSearch(String deliveryFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryFlg), xgetCValueDeliveryFlg(), "DELIVERY_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_FLG: {CHAR(1)}
     * @param deliveryFlg The value of deliveryFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryFlg_NotLikeSearch(String deliveryFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryFlg), xgetCValueDeliveryFlg(), "DELIVERY_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_FLG: {CHAR(1)}
     * @param deliveryFlg The value of deliveryFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_PrefixSearch(String deliveryFlg) {
        setDeliveryFlg_LikeSearch(deliveryFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {CHAR(1)}
     */
    public void setDeliveryFlg_IsNull() { regDeliveryFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {CHAR(1)}
     */
    public void setDeliveryFlg_IsNullOrEmpty() { regDeliveryFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {CHAR(1)}
     */
    public void setDeliveryFlg_IsNotNull() { regDeliveryFlg(CK_ISNN, DOBJ); }

    protected void regDeliveryFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryFlg(), "DELIVERY_FLG"); }
    protected abstract ConditionValue xgetCValueDeliveryFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_CD: {VARCHAR(30)}
     * @param koguchiDeliveryCd The value of koguchiDeliveryCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryCd_Equal(String koguchiDeliveryCd) {
        doSetKoguchiDeliveryCd_Equal(fRES(koguchiDeliveryCd));
    }

    protected void doSetKoguchiDeliveryCd_Equal(String koguchiDeliveryCd) {
        regKoguchiDeliveryCd(CK_EQ, koguchiDeliveryCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_CD: {VARCHAR(30)}
     * @param koguchiDeliveryCd The value of koguchiDeliveryCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryCd_NotEqual(String koguchiDeliveryCd) {
        doSetKoguchiDeliveryCd_NotEqual(fRES(koguchiDeliveryCd));
    }

    protected void doSetKoguchiDeliveryCd_NotEqual(String koguchiDeliveryCd) {
        regKoguchiDeliveryCd(CK_NES, koguchiDeliveryCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_CD: {VARCHAR(30)}
     * @param koguchiDeliveryCd The value of koguchiDeliveryCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryCd_GreaterThan(String koguchiDeliveryCd) {
        regKoguchiDeliveryCd(CK_GT, fRES(koguchiDeliveryCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_CD: {VARCHAR(30)}
     * @param koguchiDeliveryCd The value of koguchiDeliveryCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryCd_LessThan(String koguchiDeliveryCd) {
        regKoguchiDeliveryCd(CK_LT, fRES(koguchiDeliveryCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_CD: {VARCHAR(30)}
     * @param koguchiDeliveryCd The value of koguchiDeliveryCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryCd_GreaterEqual(String koguchiDeliveryCd) {
        regKoguchiDeliveryCd(CK_GE, fRES(koguchiDeliveryCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_CD: {VARCHAR(30)}
     * @param koguchiDeliveryCd The value of koguchiDeliveryCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryCd_LessEqual(String koguchiDeliveryCd) {
        regKoguchiDeliveryCd(CK_LE, fRES(koguchiDeliveryCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_CD: {VARCHAR(30)}
     * @param koguchiDeliveryCdList The collection of koguchiDeliveryCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryCd_InScope(Collection<String> koguchiDeliveryCdList) {
        doSetKoguchiDeliveryCd_InScope(koguchiDeliveryCdList);
    }

    protected void doSetKoguchiDeliveryCd_InScope(Collection<String> koguchiDeliveryCdList) {
        regINS(CK_INS, cTL(koguchiDeliveryCdList), xgetCValueKoguchiDeliveryCd(), "KOGUCHI_DELIVERY_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_CD: {VARCHAR(30)}
     * @param koguchiDeliveryCdList The collection of koguchiDeliveryCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryCd_NotInScope(Collection<String> koguchiDeliveryCdList) {
        doSetKoguchiDeliveryCd_NotInScope(koguchiDeliveryCdList);
    }

    protected void doSetKoguchiDeliveryCd_NotInScope(Collection<String> koguchiDeliveryCdList) {
        regINS(CK_NINS, cTL(koguchiDeliveryCdList), xgetCValueKoguchiDeliveryCd(), "KOGUCHI_DELIVERY_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setKoguchiDeliveryCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param koguchiDeliveryCd The value of koguchiDeliveryCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKoguchiDeliveryCd_LikeSearch(String koguchiDeliveryCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(koguchiDeliveryCd), xgetCValueKoguchiDeliveryCd(), "KOGUCHI_DELIVERY_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_CD: {VARCHAR(30)}
     * @param koguchiDeliveryCd The value of koguchiDeliveryCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKoguchiDeliveryCd_NotLikeSearch(String koguchiDeliveryCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(koguchiDeliveryCd), xgetCValueKoguchiDeliveryCd(), "KOGUCHI_DELIVERY_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_CD: {VARCHAR(30)}
     * @param koguchiDeliveryCd The value of koguchiDeliveryCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryCd_PrefixSearch(String koguchiDeliveryCd) {
        setKoguchiDeliveryCd_LikeSearch(koguchiDeliveryCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_CD: {VARCHAR(30)}
     */
    public void setKoguchiDeliveryCd_IsNull() { regKoguchiDeliveryCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_CD: {VARCHAR(30)}
     */
    public void setKoguchiDeliveryCd_IsNullOrEmpty() { regKoguchiDeliveryCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_CD: {VARCHAR(30)}
     */
    public void setKoguchiDeliveryCd_IsNotNull() { regKoguchiDeliveryCd(CK_ISNN, DOBJ); }

    protected void regKoguchiDeliveryCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKoguchiDeliveryCd(), "KOGUCHI_DELIVERY_CD"); }
    protected abstract ConditionValue xgetCValueKoguchiDeliveryCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_NM: {VARCHAR(60)}
     * @param koguchiDeliveryNm The value of koguchiDeliveryNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryNm_Equal(String koguchiDeliveryNm) {
        doSetKoguchiDeliveryNm_Equal(fRES(koguchiDeliveryNm));
    }

    protected void doSetKoguchiDeliveryNm_Equal(String koguchiDeliveryNm) {
        regKoguchiDeliveryNm(CK_EQ, koguchiDeliveryNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_NM: {VARCHAR(60)}
     * @param koguchiDeliveryNm The value of koguchiDeliveryNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryNm_NotEqual(String koguchiDeliveryNm) {
        doSetKoguchiDeliveryNm_NotEqual(fRES(koguchiDeliveryNm));
    }

    protected void doSetKoguchiDeliveryNm_NotEqual(String koguchiDeliveryNm) {
        regKoguchiDeliveryNm(CK_NES, koguchiDeliveryNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_NM: {VARCHAR(60)}
     * @param koguchiDeliveryNm The value of koguchiDeliveryNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryNm_GreaterThan(String koguchiDeliveryNm) {
        regKoguchiDeliveryNm(CK_GT, fRES(koguchiDeliveryNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_NM: {VARCHAR(60)}
     * @param koguchiDeliveryNm The value of koguchiDeliveryNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryNm_LessThan(String koguchiDeliveryNm) {
        regKoguchiDeliveryNm(CK_LT, fRES(koguchiDeliveryNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_NM: {VARCHAR(60)}
     * @param koguchiDeliveryNm The value of koguchiDeliveryNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryNm_GreaterEqual(String koguchiDeliveryNm) {
        regKoguchiDeliveryNm(CK_GE, fRES(koguchiDeliveryNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_NM: {VARCHAR(60)}
     * @param koguchiDeliveryNm The value of koguchiDeliveryNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryNm_LessEqual(String koguchiDeliveryNm) {
        regKoguchiDeliveryNm(CK_LE, fRES(koguchiDeliveryNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_NM: {VARCHAR(60)}
     * @param koguchiDeliveryNmList The collection of koguchiDeliveryNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryNm_InScope(Collection<String> koguchiDeliveryNmList) {
        doSetKoguchiDeliveryNm_InScope(koguchiDeliveryNmList);
    }

    protected void doSetKoguchiDeliveryNm_InScope(Collection<String> koguchiDeliveryNmList) {
        regINS(CK_INS, cTL(koguchiDeliveryNmList), xgetCValueKoguchiDeliveryNm(), "KOGUCHI_DELIVERY_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_NM: {VARCHAR(60)}
     * @param koguchiDeliveryNmList The collection of koguchiDeliveryNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryNm_NotInScope(Collection<String> koguchiDeliveryNmList) {
        doSetKoguchiDeliveryNm_NotInScope(koguchiDeliveryNmList);
    }

    protected void doSetKoguchiDeliveryNm_NotInScope(Collection<String> koguchiDeliveryNmList) {
        regINS(CK_NINS, cTL(koguchiDeliveryNmList), xgetCValueKoguchiDeliveryNm(), "KOGUCHI_DELIVERY_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setKoguchiDeliveryNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param koguchiDeliveryNm The value of koguchiDeliveryNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKoguchiDeliveryNm_LikeSearch(String koguchiDeliveryNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(koguchiDeliveryNm), xgetCValueKoguchiDeliveryNm(), "KOGUCHI_DELIVERY_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_NM: {VARCHAR(60)}
     * @param koguchiDeliveryNm The value of koguchiDeliveryNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKoguchiDeliveryNm_NotLikeSearch(String koguchiDeliveryNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(koguchiDeliveryNm), xgetCValueKoguchiDeliveryNm(), "KOGUCHI_DELIVERY_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_NM: {VARCHAR(60)}
     * @param koguchiDeliveryNm The value of koguchiDeliveryNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryNm_PrefixSearch(String koguchiDeliveryNm) {
        setKoguchiDeliveryNm_LikeSearch(koguchiDeliveryNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_NM: {VARCHAR(60)}
     */
    public void setKoguchiDeliveryNm_IsNull() { regKoguchiDeliveryNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_NM: {VARCHAR(60)}
     */
    public void setKoguchiDeliveryNm_IsNullOrEmpty() { regKoguchiDeliveryNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_NM: {VARCHAR(60)}
     */
    public void setKoguchiDeliveryNm_IsNotNull() { regKoguchiDeliveryNm(CK_ISNN, DOBJ); }

    protected void regKoguchiDeliveryNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKoguchiDeliveryNm(), "KOGUCHI_DELIVERY_NM"); }
    protected abstract ConditionValue xgetCValueKoguchiDeliveryNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNI_DELIVERY_CD: {VARCHAR(30)}
     * @param uniDeliveryCd The value of uniDeliveryCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniDeliveryCd_Equal(String uniDeliveryCd) {
        doSetUniDeliveryCd_Equal(fRES(uniDeliveryCd));
    }

    protected void doSetUniDeliveryCd_Equal(String uniDeliveryCd) {
        regUniDeliveryCd(CK_EQ, uniDeliveryCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNI_DELIVERY_CD: {VARCHAR(30)}
     * @param uniDeliveryCd The value of uniDeliveryCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniDeliveryCd_NotEqual(String uniDeliveryCd) {
        doSetUniDeliveryCd_NotEqual(fRES(uniDeliveryCd));
    }

    protected void doSetUniDeliveryCd_NotEqual(String uniDeliveryCd) {
        regUniDeliveryCd(CK_NES, uniDeliveryCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNI_DELIVERY_CD: {VARCHAR(30)}
     * @param uniDeliveryCd The value of uniDeliveryCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniDeliveryCd_GreaterThan(String uniDeliveryCd) {
        regUniDeliveryCd(CK_GT, fRES(uniDeliveryCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNI_DELIVERY_CD: {VARCHAR(30)}
     * @param uniDeliveryCd The value of uniDeliveryCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniDeliveryCd_LessThan(String uniDeliveryCd) {
        regUniDeliveryCd(CK_LT, fRES(uniDeliveryCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNI_DELIVERY_CD: {VARCHAR(30)}
     * @param uniDeliveryCd The value of uniDeliveryCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniDeliveryCd_GreaterEqual(String uniDeliveryCd) {
        regUniDeliveryCd(CK_GE, fRES(uniDeliveryCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNI_DELIVERY_CD: {VARCHAR(30)}
     * @param uniDeliveryCd The value of uniDeliveryCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniDeliveryCd_LessEqual(String uniDeliveryCd) {
        regUniDeliveryCd(CK_LE, fRES(uniDeliveryCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNI_DELIVERY_CD: {VARCHAR(30)}
     * @param uniDeliveryCdList The collection of uniDeliveryCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniDeliveryCd_InScope(Collection<String> uniDeliveryCdList) {
        doSetUniDeliveryCd_InScope(uniDeliveryCdList);
    }

    protected void doSetUniDeliveryCd_InScope(Collection<String> uniDeliveryCdList) {
        regINS(CK_INS, cTL(uniDeliveryCdList), xgetCValueUniDeliveryCd(), "UNI_DELIVERY_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNI_DELIVERY_CD: {VARCHAR(30)}
     * @param uniDeliveryCdList The collection of uniDeliveryCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniDeliveryCd_NotInScope(Collection<String> uniDeliveryCdList) {
        doSetUniDeliveryCd_NotInScope(uniDeliveryCdList);
    }

    protected void doSetUniDeliveryCd_NotInScope(Collection<String> uniDeliveryCdList) {
        regINS(CK_NINS, cTL(uniDeliveryCdList), xgetCValueUniDeliveryCd(), "UNI_DELIVERY_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNI_DELIVERY_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setUniDeliveryCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uniDeliveryCd The value of uniDeliveryCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUniDeliveryCd_LikeSearch(String uniDeliveryCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uniDeliveryCd), xgetCValueUniDeliveryCd(), "UNI_DELIVERY_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNI_DELIVERY_CD: {VARCHAR(30)}
     * @param uniDeliveryCd The value of uniDeliveryCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUniDeliveryCd_NotLikeSearch(String uniDeliveryCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uniDeliveryCd), xgetCValueUniDeliveryCd(), "UNI_DELIVERY_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNI_DELIVERY_CD: {VARCHAR(30)}
     * @param uniDeliveryCd The value of uniDeliveryCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniDeliveryCd_PrefixSearch(String uniDeliveryCd) {
        setUniDeliveryCd_LikeSearch(uniDeliveryCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNI_DELIVERY_CD: {VARCHAR(30)}
     */
    public void setUniDeliveryCd_IsNull() { regUniDeliveryCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNI_DELIVERY_CD: {VARCHAR(30)}
     */
    public void setUniDeliveryCd_IsNullOrEmpty() { regUniDeliveryCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNI_DELIVERY_CD: {VARCHAR(30)}
     */
    public void setUniDeliveryCd_IsNotNull() { regUniDeliveryCd(CK_ISNN, DOBJ); }

    protected void regUniDeliveryCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUniDeliveryCd(), "UNI_DELIVERY_CD"); }
    protected abstract ConditionValue xgetCValueUniDeliveryCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNI_DELIVERY_NM: {VARCHAR(60)}
     * @param uniDeliveryNm The value of uniDeliveryNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniDeliveryNm_Equal(String uniDeliveryNm) {
        doSetUniDeliveryNm_Equal(fRES(uniDeliveryNm));
    }

    protected void doSetUniDeliveryNm_Equal(String uniDeliveryNm) {
        regUniDeliveryNm(CK_EQ, uniDeliveryNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNI_DELIVERY_NM: {VARCHAR(60)}
     * @param uniDeliveryNm The value of uniDeliveryNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniDeliveryNm_NotEqual(String uniDeliveryNm) {
        doSetUniDeliveryNm_NotEqual(fRES(uniDeliveryNm));
    }

    protected void doSetUniDeliveryNm_NotEqual(String uniDeliveryNm) {
        regUniDeliveryNm(CK_NES, uniDeliveryNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNI_DELIVERY_NM: {VARCHAR(60)}
     * @param uniDeliveryNm The value of uniDeliveryNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniDeliveryNm_GreaterThan(String uniDeliveryNm) {
        regUniDeliveryNm(CK_GT, fRES(uniDeliveryNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNI_DELIVERY_NM: {VARCHAR(60)}
     * @param uniDeliveryNm The value of uniDeliveryNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniDeliveryNm_LessThan(String uniDeliveryNm) {
        regUniDeliveryNm(CK_LT, fRES(uniDeliveryNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNI_DELIVERY_NM: {VARCHAR(60)}
     * @param uniDeliveryNm The value of uniDeliveryNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniDeliveryNm_GreaterEqual(String uniDeliveryNm) {
        regUniDeliveryNm(CK_GE, fRES(uniDeliveryNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNI_DELIVERY_NM: {VARCHAR(60)}
     * @param uniDeliveryNm The value of uniDeliveryNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniDeliveryNm_LessEqual(String uniDeliveryNm) {
        regUniDeliveryNm(CK_LE, fRES(uniDeliveryNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNI_DELIVERY_NM: {VARCHAR(60)}
     * @param uniDeliveryNmList The collection of uniDeliveryNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniDeliveryNm_InScope(Collection<String> uniDeliveryNmList) {
        doSetUniDeliveryNm_InScope(uniDeliveryNmList);
    }

    protected void doSetUniDeliveryNm_InScope(Collection<String> uniDeliveryNmList) {
        regINS(CK_INS, cTL(uniDeliveryNmList), xgetCValueUniDeliveryNm(), "UNI_DELIVERY_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNI_DELIVERY_NM: {VARCHAR(60)}
     * @param uniDeliveryNmList The collection of uniDeliveryNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniDeliveryNm_NotInScope(Collection<String> uniDeliveryNmList) {
        doSetUniDeliveryNm_NotInScope(uniDeliveryNmList);
    }

    protected void doSetUniDeliveryNm_NotInScope(Collection<String> uniDeliveryNmList) {
        regINS(CK_NINS, cTL(uniDeliveryNmList), xgetCValueUniDeliveryNm(), "UNI_DELIVERY_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNI_DELIVERY_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setUniDeliveryNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uniDeliveryNm The value of uniDeliveryNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUniDeliveryNm_LikeSearch(String uniDeliveryNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uniDeliveryNm), xgetCValueUniDeliveryNm(), "UNI_DELIVERY_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNI_DELIVERY_NM: {VARCHAR(60)}
     * @param uniDeliveryNm The value of uniDeliveryNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUniDeliveryNm_NotLikeSearch(String uniDeliveryNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uniDeliveryNm), xgetCValueUniDeliveryNm(), "UNI_DELIVERY_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNI_DELIVERY_NM: {VARCHAR(60)}
     * @param uniDeliveryNm The value of uniDeliveryNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniDeliveryNm_PrefixSearch(String uniDeliveryNm) {
        setUniDeliveryNm_LikeSearch(uniDeliveryNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNI_DELIVERY_NM: {VARCHAR(60)}
     */
    public void setUniDeliveryNm_IsNull() { regUniDeliveryNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNI_DELIVERY_NM: {VARCHAR(60)}
     */
    public void setUniDeliveryNm_IsNullOrEmpty() { regUniDeliveryNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNI_DELIVERY_NM: {VARCHAR(60)}
     */
    public void setUniDeliveryNm_IsNotNull() { regUniDeliveryNm(CK_ISNN, DOBJ); }

    protected void regUniDeliveryNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUniDeliveryNm(), "UNI_DELIVERY_NM"); }
    protected abstract ConditionValue xgetCValueUniDeliveryNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FW_TYPE_CD: {VARCHAR(30)}
     * @param fwTypeCd The value of fwTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwTypeCd_Equal(String fwTypeCd) {
        doSetFwTypeCd_Equal(fRES(fwTypeCd));
    }

    protected void doSetFwTypeCd_Equal(String fwTypeCd) {
        regFwTypeCd(CK_EQ, fwTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FW_TYPE_CD: {VARCHAR(30)}
     * @param fwTypeCd The value of fwTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwTypeCd_NotEqual(String fwTypeCd) {
        doSetFwTypeCd_NotEqual(fRES(fwTypeCd));
    }

    protected void doSetFwTypeCd_NotEqual(String fwTypeCd) {
        regFwTypeCd(CK_NES, fwTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FW_TYPE_CD: {VARCHAR(30)}
     * @param fwTypeCd The value of fwTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwTypeCd_GreaterThan(String fwTypeCd) {
        regFwTypeCd(CK_GT, fRES(fwTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FW_TYPE_CD: {VARCHAR(30)}
     * @param fwTypeCd The value of fwTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwTypeCd_LessThan(String fwTypeCd) {
        regFwTypeCd(CK_LT, fRES(fwTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FW_TYPE_CD: {VARCHAR(30)}
     * @param fwTypeCd The value of fwTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwTypeCd_GreaterEqual(String fwTypeCd) {
        regFwTypeCd(CK_GE, fRES(fwTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FW_TYPE_CD: {VARCHAR(30)}
     * @param fwTypeCd The value of fwTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwTypeCd_LessEqual(String fwTypeCd) {
        regFwTypeCd(CK_LE, fRES(fwTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FW_TYPE_CD: {VARCHAR(30)}
     * @param fwTypeCdList The collection of fwTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwTypeCd_InScope(Collection<String> fwTypeCdList) {
        doSetFwTypeCd_InScope(fwTypeCdList);
    }

    protected void doSetFwTypeCd_InScope(Collection<String> fwTypeCdList) {
        regINS(CK_INS, cTL(fwTypeCdList), xgetCValueFwTypeCd(), "FW_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FW_TYPE_CD: {VARCHAR(30)}
     * @param fwTypeCdList The collection of fwTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwTypeCd_NotInScope(Collection<String> fwTypeCdList) {
        doSetFwTypeCd_NotInScope(fwTypeCdList);
    }

    protected void doSetFwTypeCd_NotInScope(Collection<String> fwTypeCdList) {
        regINS(CK_NINS, cTL(fwTypeCdList), xgetCValueFwTypeCd(), "FW_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FW_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setFwTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fwTypeCd The value of fwTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFwTypeCd_LikeSearch(String fwTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fwTypeCd), xgetCValueFwTypeCd(), "FW_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FW_TYPE_CD: {VARCHAR(30)}
     * @param fwTypeCd The value of fwTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFwTypeCd_NotLikeSearch(String fwTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fwTypeCd), xgetCValueFwTypeCd(), "FW_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FW_TYPE_CD: {VARCHAR(30)}
     * @param fwTypeCd The value of fwTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwTypeCd_PrefixSearch(String fwTypeCd) {
        setFwTypeCd_LikeSearch(fwTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FW_TYPE_CD: {VARCHAR(30)}
     */
    public void setFwTypeCd_IsNull() { regFwTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FW_TYPE_CD: {VARCHAR(30)}
     */
    public void setFwTypeCd_IsNullOrEmpty() { regFwTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FW_TYPE_CD: {VARCHAR(30)}
     */
    public void setFwTypeCd_IsNotNull() { regFwTypeCd(CK_ISNN, DOBJ); }

    protected void regFwTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwTypeCd(), "FW_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueFwTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MCA_TYPE_CD: {VARCHAR(30)}
     * @param mcaTypeCd The value of mcaTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMcaTypeCd_Equal(String mcaTypeCd) {
        doSetMcaTypeCd_Equal(fRES(mcaTypeCd));
    }

    protected void doSetMcaTypeCd_Equal(String mcaTypeCd) {
        regMcaTypeCd(CK_EQ, mcaTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MCA_TYPE_CD: {VARCHAR(30)}
     * @param mcaTypeCd The value of mcaTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMcaTypeCd_NotEqual(String mcaTypeCd) {
        doSetMcaTypeCd_NotEqual(fRES(mcaTypeCd));
    }

    protected void doSetMcaTypeCd_NotEqual(String mcaTypeCd) {
        regMcaTypeCd(CK_NES, mcaTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MCA_TYPE_CD: {VARCHAR(30)}
     * @param mcaTypeCd The value of mcaTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMcaTypeCd_GreaterThan(String mcaTypeCd) {
        regMcaTypeCd(CK_GT, fRES(mcaTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MCA_TYPE_CD: {VARCHAR(30)}
     * @param mcaTypeCd The value of mcaTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMcaTypeCd_LessThan(String mcaTypeCd) {
        regMcaTypeCd(CK_LT, fRES(mcaTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MCA_TYPE_CD: {VARCHAR(30)}
     * @param mcaTypeCd The value of mcaTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMcaTypeCd_GreaterEqual(String mcaTypeCd) {
        regMcaTypeCd(CK_GE, fRES(mcaTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MCA_TYPE_CD: {VARCHAR(30)}
     * @param mcaTypeCd The value of mcaTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMcaTypeCd_LessEqual(String mcaTypeCd) {
        regMcaTypeCd(CK_LE, fRES(mcaTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MCA_TYPE_CD: {VARCHAR(30)}
     * @param mcaTypeCdList The collection of mcaTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMcaTypeCd_InScope(Collection<String> mcaTypeCdList) {
        doSetMcaTypeCd_InScope(mcaTypeCdList);
    }

    protected void doSetMcaTypeCd_InScope(Collection<String> mcaTypeCdList) {
        regINS(CK_INS, cTL(mcaTypeCdList), xgetCValueMcaTypeCd(), "MCA_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MCA_TYPE_CD: {VARCHAR(30)}
     * @param mcaTypeCdList The collection of mcaTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMcaTypeCd_NotInScope(Collection<String> mcaTypeCdList) {
        doSetMcaTypeCd_NotInScope(mcaTypeCdList);
    }

    protected void doSetMcaTypeCd_NotInScope(Collection<String> mcaTypeCdList) {
        regINS(CK_NINS, cTL(mcaTypeCdList), xgetCValueMcaTypeCd(), "MCA_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MCA_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setMcaTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mcaTypeCd The value of mcaTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMcaTypeCd_LikeSearch(String mcaTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mcaTypeCd), xgetCValueMcaTypeCd(), "MCA_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MCA_TYPE_CD: {VARCHAR(30)}
     * @param mcaTypeCd The value of mcaTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMcaTypeCd_NotLikeSearch(String mcaTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mcaTypeCd), xgetCValueMcaTypeCd(), "MCA_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MCA_TYPE_CD: {VARCHAR(30)}
     * @param mcaTypeCd The value of mcaTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMcaTypeCd_PrefixSearch(String mcaTypeCd) {
        setMcaTypeCd_LikeSearch(mcaTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MCA_TYPE_CD: {VARCHAR(30)}
     */
    public void setMcaTypeCd_IsNull() { regMcaTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MCA_TYPE_CD: {VARCHAR(30)}
     */
    public void setMcaTypeCd_IsNullOrEmpty() { regMcaTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MCA_TYPE_CD: {VARCHAR(30)}
     */
    public void setMcaTypeCd_IsNotNull() { regMcaTypeCd(CK_ISNN, DOBJ); }

    protected void regMcaTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMcaTypeCd(), "MCA_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueMcaTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * YOUHIN_TYPE_CD: {VARCHAR(30)}
     * @param youhinTypeCd The value of youhinTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYouhinTypeCd_Equal(String youhinTypeCd) {
        doSetYouhinTypeCd_Equal(fRES(youhinTypeCd));
    }

    protected void doSetYouhinTypeCd_Equal(String youhinTypeCd) {
        regYouhinTypeCd(CK_EQ, youhinTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * YOUHIN_TYPE_CD: {VARCHAR(30)}
     * @param youhinTypeCd The value of youhinTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYouhinTypeCd_NotEqual(String youhinTypeCd) {
        doSetYouhinTypeCd_NotEqual(fRES(youhinTypeCd));
    }

    protected void doSetYouhinTypeCd_NotEqual(String youhinTypeCd) {
        regYouhinTypeCd(CK_NES, youhinTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * YOUHIN_TYPE_CD: {VARCHAR(30)}
     * @param youhinTypeCd The value of youhinTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYouhinTypeCd_GreaterThan(String youhinTypeCd) {
        regYouhinTypeCd(CK_GT, fRES(youhinTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * YOUHIN_TYPE_CD: {VARCHAR(30)}
     * @param youhinTypeCd The value of youhinTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYouhinTypeCd_LessThan(String youhinTypeCd) {
        regYouhinTypeCd(CK_LT, fRES(youhinTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * YOUHIN_TYPE_CD: {VARCHAR(30)}
     * @param youhinTypeCd The value of youhinTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYouhinTypeCd_GreaterEqual(String youhinTypeCd) {
        regYouhinTypeCd(CK_GE, fRES(youhinTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * YOUHIN_TYPE_CD: {VARCHAR(30)}
     * @param youhinTypeCd The value of youhinTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYouhinTypeCd_LessEqual(String youhinTypeCd) {
        regYouhinTypeCd(CK_LE, fRES(youhinTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * YOUHIN_TYPE_CD: {VARCHAR(30)}
     * @param youhinTypeCdList The collection of youhinTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYouhinTypeCd_InScope(Collection<String> youhinTypeCdList) {
        doSetYouhinTypeCd_InScope(youhinTypeCdList);
    }

    protected void doSetYouhinTypeCd_InScope(Collection<String> youhinTypeCdList) {
        regINS(CK_INS, cTL(youhinTypeCdList), xgetCValueYouhinTypeCd(), "YOUHIN_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * YOUHIN_TYPE_CD: {VARCHAR(30)}
     * @param youhinTypeCdList The collection of youhinTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYouhinTypeCd_NotInScope(Collection<String> youhinTypeCdList) {
        doSetYouhinTypeCd_NotInScope(youhinTypeCdList);
    }

    protected void doSetYouhinTypeCd_NotInScope(Collection<String> youhinTypeCdList) {
        regINS(CK_NINS, cTL(youhinTypeCdList), xgetCValueYouhinTypeCd(), "YOUHIN_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * YOUHIN_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setYouhinTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param youhinTypeCd The value of youhinTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setYouhinTypeCd_LikeSearch(String youhinTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(youhinTypeCd), xgetCValueYouhinTypeCd(), "YOUHIN_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * YOUHIN_TYPE_CD: {VARCHAR(30)}
     * @param youhinTypeCd The value of youhinTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setYouhinTypeCd_NotLikeSearch(String youhinTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(youhinTypeCd), xgetCValueYouhinTypeCd(), "YOUHIN_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * YOUHIN_TYPE_CD: {VARCHAR(30)}
     * @param youhinTypeCd The value of youhinTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYouhinTypeCd_PrefixSearch(String youhinTypeCd) {
        setYouhinTypeCd_LikeSearch(youhinTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * YOUHIN_TYPE_CD: {VARCHAR(30)}
     */
    public void setYouhinTypeCd_IsNull() { regYouhinTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * YOUHIN_TYPE_CD: {VARCHAR(30)}
     */
    public void setYouhinTypeCd_IsNullOrEmpty() { regYouhinTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * YOUHIN_TYPE_CD: {VARCHAR(30)}
     */
    public void setYouhinTypeCd_IsNotNull() { regYouhinTypeCd(CK_ISNN, DOBJ); }

    protected void regYouhinTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueYouhinTypeCd(), "YOUHIN_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueYouhinTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_CD: {VARCHAR(30)}
     * @param reqSalesOrgCd The value of reqSalesOrgCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgCd_Equal(String reqSalesOrgCd) {
        doSetReqSalesOrgCd_Equal(fRES(reqSalesOrgCd));
    }

    protected void doSetReqSalesOrgCd_Equal(String reqSalesOrgCd) {
        regReqSalesOrgCd(CK_EQ, reqSalesOrgCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_CD: {VARCHAR(30)}
     * @param reqSalesOrgCd The value of reqSalesOrgCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgCd_NotEqual(String reqSalesOrgCd) {
        doSetReqSalesOrgCd_NotEqual(fRES(reqSalesOrgCd));
    }

    protected void doSetReqSalesOrgCd_NotEqual(String reqSalesOrgCd) {
        regReqSalesOrgCd(CK_NES, reqSalesOrgCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_CD: {VARCHAR(30)}
     * @param reqSalesOrgCd The value of reqSalesOrgCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgCd_GreaterThan(String reqSalesOrgCd) {
        regReqSalesOrgCd(CK_GT, fRES(reqSalesOrgCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_CD: {VARCHAR(30)}
     * @param reqSalesOrgCd The value of reqSalesOrgCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgCd_LessThan(String reqSalesOrgCd) {
        regReqSalesOrgCd(CK_LT, fRES(reqSalesOrgCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_CD: {VARCHAR(30)}
     * @param reqSalesOrgCd The value of reqSalesOrgCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgCd_GreaterEqual(String reqSalesOrgCd) {
        regReqSalesOrgCd(CK_GE, fRES(reqSalesOrgCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_CD: {VARCHAR(30)}
     * @param reqSalesOrgCd The value of reqSalesOrgCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgCd_LessEqual(String reqSalesOrgCd) {
        regReqSalesOrgCd(CK_LE, fRES(reqSalesOrgCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_CD: {VARCHAR(30)}
     * @param reqSalesOrgCdList The collection of reqSalesOrgCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgCd_InScope(Collection<String> reqSalesOrgCdList) {
        doSetReqSalesOrgCd_InScope(reqSalesOrgCdList);
    }

    protected void doSetReqSalesOrgCd_InScope(Collection<String> reqSalesOrgCdList) {
        regINS(CK_INS, cTL(reqSalesOrgCdList), xgetCValueReqSalesOrgCd(), "REQ_SALES_ORG_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_CD: {VARCHAR(30)}
     * @param reqSalesOrgCdList The collection of reqSalesOrgCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgCd_NotInScope(Collection<String> reqSalesOrgCdList) {
        doSetReqSalesOrgCd_NotInScope(reqSalesOrgCdList);
    }

    protected void doSetReqSalesOrgCd_NotInScope(Collection<String> reqSalesOrgCdList) {
        regINS(CK_NINS, cTL(reqSalesOrgCdList), xgetCValueReqSalesOrgCd(), "REQ_SALES_ORG_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setReqSalesOrgCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reqSalesOrgCd The value of reqSalesOrgCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReqSalesOrgCd_LikeSearch(String reqSalesOrgCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reqSalesOrgCd), xgetCValueReqSalesOrgCd(), "REQ_SALES_ORG_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_CD: {VARCHAR(30)}
     * @param reqSalesOrgCd The value of reqSalesOrgCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReqSalesOrgCd_NotLikeSearch(String reqSalesOrgCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reqSalesOrgCd), xgetCValueReqSalesOrgCd(), "REQ_SALES_ORG_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_CD: {VARCHAR(30)}
     * @param reqSalesOrgCd The value of reqSalesOrgCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgCd_PrefixSearch(String reqSalesOrgCd) {
        setReqSalesOrgCd_LikeSearch(reqSalesOrgCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_CD: {VARCHAR(30)}
     */
    public void setReqSalesOrgCd_IsNull() { regReqSalesOrgCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_CD: {VARCHAR(30)}
     */
    public void setReqSalesOrgCd_IsNullOrEmpty() { regReqSalesOrgCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_CD: {VARCHAR(30)}
     */
    public void setReqSalesOrgCd_IsNotNull() { regReqSalesOrgCd(CK_ISNN, DOBJ); }

    protected void regReqSalesOrgCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReqSalesOrgCd(), "REQ_SALES_ORG_CD"); }
    protected abstract ConditionValue xgetCValueReqSalesOrgCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_NM: {VARCHAR(60)}
     * @param reqSalesOrgNm The value of reqSalesOrgNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgNm_Equal(String reqSalesOrgNm) {
        doSetReqSalesOrgNm_Equal(fRES(reqSalesOrgNm));
    }

    protected void doSetReqSalesOrgNm_Equal(String reqSalesOrgNm) {
        regReqSalesOrgNm(CK_EQ, reqSalesOrgNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_NM: {VARCHAR(60)}
     * @param reqSalesOrgNm The value of reqSalesOrgNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgNm_NotEqual(String reqSalesOrgNm) {
        doSetReqSalesOrgNm_NotEqual(fRES(reqSalesOrgNm));
    }

    protected void doSetReqSalesOrgNm_NotEqual(String reqSalesOrgNm) {
        regReqSalesOrgNm(CK_NES, reqSalesOrgNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_NM: {VARCHAR(60)}
     * @param reqSalesOrgNm The value of reqSalesOrgNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgNm_GreaterThan(String reqSalesOrgNm) {
        regReqSalesOrgNm(CK_GT, fRES(reqSalesOrgNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_NM: {VARCHAR(60)}
     * @param reqSalesOrgNm The value of reqSalesOrgNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgNm_LessThan(String reqSalesOrgNm) {
        regReqSalesOrgNm(CK_LT, fRES(reqSalesOrgNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_NM: {VARCHAR(60)}
     * @param reqSalesOrgNm The value of reqSalesOrgNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgNm_GreaterEqual(String reqSalesOrgNm) {
        regReqSalesOrgNm(CK_GE, fRES(reqSalesOrgNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_NM: {VARCHAR(60)}
     * @param reqSalesOrgNm The value of reqSalesOrgNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgNm_LessEqual(String reqSalesOrgNm) {
        regReqSalesOrgNm(CK_LE, fRES(reqSalesOrgNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_NM: {VARCHAR(60)}
     * @param reqSalesOrgNmList The collection of reqSalesOrgNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgNm_InScope(Collection<String> reqSalesOrgNmList) {
        doSetReqSalesOrgNm_InScope(reqSalesOrgNmList);
    }

    protected void doSetReqSalesOrgNm_InScope(Collection<String> reqSalesOrgNmList) {
        regINS(CK_INS, cTL(reqSalesOrgNmList), xgetCValueReqSalesOrgNm(), "REQ_SALES_ORG_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_NM: {VARCHAR(60)}
     * @param reqSalesOrgNmList The collection of reqSalesOrgNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgNm_NotInScope(Collection<String> reqSalesOrgNmList) {
        doSetReqSalesOrgNm_NotInScope(reqSalesOrgNmList);
    }

    protected void doSetReqSalesOrgNm_NotInScope(Collection<String> reqSalesOrgNmList) {
        regINS(CK_NINS, cTL(reqSalesOrgNmList), xgetCValueReqSalesOrgNm(), "REQ_SALES_ORG_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setReqSalesOrgNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reqSalesOrgNm The value of reqSalesOrgNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReqSalesOrgNm_LikeSearch(String reqSalesOrgNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reqSalesOrgNm), xgetCValueReqSalesOrgNm(), "REQ_SALES_ORG_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_NM: {VARCHAR(60)}
     * @param reqSalesOrgNm The value of reqSalesOrgNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReqSalesOrgNm_NotLikeSearch(String reqSalesOrgNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reqSalesOrgNm), xgetCValueReqSalesOrgNm(), "REQ_SALES_ORG_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_NM: {VARCHAR(60)}
     * @param reqSalesOrgNm The value of reqSalesOrgNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgNm_PrefixSearch(String reqSalesOrgNm) {
        setReqSalesOrgNm_LikeSearch(reqSalesOrgNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_NM: {VARCHAR(60)}
     */
    public void setReqSalesOrgNm_IsNull() { regReqSalesOrgNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_NM: {VARCHAR(60)}
     */
    public void setReqSalesOrgNm_IsNullOrEmpty() { regReqSalesOrgNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_NM: {VARCHAR(60)}
     */
    public void setReqSalesOrgNm_IsNotNull() { regReqSalesOrgNm(CK_ISNN, DOBJ); }

    protected void regReqSalesOrgNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReqSalesOrgNm(), "REQ_SALES_ORG_NM"); }
    protected abstract ConditionValue xgetCValueReqSalesOrgNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)}
     * @param reqSalesOrgBranchNm The value of reqSalesOrgBranchNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgBranchNm_Equal(String reqSalesOrgBranchNm) {
        doSetReqSalesOrgBranchNm_Equal(fRES(reqSalesOrgBranchNm));
    }

    protected void doSetReqSalesOrgBranchNm_Equal(String reqSalesOrgBranchNm) {
        regReqSalesOrgBranchNm(CK_EQ, reqSalesOrgBranchNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)}
     * @param reqSalesOrgBranchNm The value of reqSalesOrgBranchNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgBranchNm_NotEqual(String reqSalesOrgBranchNm) {
        doSetReqSalesOrgBranchNm_NotEqual(fRES(reqSalesOrgBranchNm));
    }

    protected void doSetReqSalesOrgBranchNm_NotEqual(String reqSalesOrgBranchNm) {
        regReqSalesOrgBranchNm(CK_NES, reqSalesOrgBranchNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)}
     * @param reqSalesOrgBranchNm The value of reqSalesOrgBranchNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgBranchNm_GreaterThan(String reqSalesOrgBranchNm) {
        regReqSalesOrgBranchNm(CK_GT, fRES(reqSalesOrgBranchNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)}
     * @param reqSalesOrgBranchNm The value of reqSalesOrgBranchNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgBranchNm_LessThan(String reqSalesOrgBranchNm) {
        regReqSalesOrgBranchNm(CK_LT, fRES(reqSalesOrgBranchNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)}
     * @param reqSalesOrgBranchNm The value of reqSalesOrgBranchNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgBranchNm_GreaterEqual(String reqSalesOrgBranchNm) {
        regReqSalesOrgBranchNm(CK_GE, fRES(reqSalesOrgBranchNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)}
     * @param reqSalesOrgBranchNm The value of reqSalesOrgBranchNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgBranchNm_LessEqual(String reqSalesOrgBranchNm) {
        regReqSalesOrgBranchNm(CK_LE, fRES(reqSalesOrgBranchNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)}
     * @param reqSalesOrgBranchNmList The collection of reqSalesOrgBranchNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgBranchNm_InScope(Collection<String> reqSalesOrgBranchNmList) {
        doSetReqSalesOrgBranchNm_InScope(reqSalesOrgBranchNmList);
    }

    protected void doSetReqSalesOrgBranchNm_InScope(Collection<String> reqSalesOrgBranchNmList) {
        regINS(CK_INS, cTL(reqSalesOrgBranchNmList), xgetCValueReqSalesOrgBranchNm(), "REQ_SALES_ORG_BRANCH_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)}
     * @param reqSalesOrgBranchNmList The collection of reqSalesOrgBranchNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgBranchNm_NotInScope(Collection<String> reqSalesOrgBranchNmList) {
        doSetReqSalesOrgBranchNm_NotInScope(reqSalesOrgBranchNmList);
    }

    protected void doSetReqSalesOrgBranchNm_NotInScope(Collection<String> reqSalesOrgBranchNmList) {
        regINS(CK_NINS, cTL(reqSalesOrgBranchNmList), xgetCValueReqSalesOrgBranchNm(), "REQ_SALES_ORG_BRANCH_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setReqSalesOrgBranchNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reqSalesOrgBranchNm The value of reqSalesOrgBranchNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReqSalesOrgBranchNm_LikeSearch(String reqSalesOrgBranchNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reqSalesOrgBranchNm), xgetCValueReqSalesOrgBranchNm(), "REQ_SALES_ORG_BRANCH_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)}
     * @param reqSalesOrgBranchNm The value of reqSalesOrgBranchNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReqSalesOrgBranchNm_NotLikeSearch(String reqSalesOrgBranchNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reqSalesOrgBranchNm), xgetCValueReqSalesOrgBranchNm(), "REQ_SALES_ORG_BRANCH_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)}
     * @param reqSalesOrgBranchNm The value of reqSalesOrgBranchNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgBranchNm_PrefixSearch(String reqSalesOrgBranchNm) {
        setReqSalesOrgBranchNm_LikeSearch(reqSalesOrgBranchNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)}
     */
    public void setReqSalesOrgBranchNm_IsNull() { regReqSalesOrgBranchNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)}
     */
    public void setReqSalesOrgBranchNm_IsNullOrEmpty() { regReqSalesOrgBranchNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)}
     */
    public void setReqSalesOrgBranchNm_IsNotNull() { regReqSalesOrgBranchNm(CK_ISNN, DOBJ); }

    protected void regReqSalesOrgBranchNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReqSalesOrgBranchNm(), "REQ_SALES_ORG_BRANCH_NM"); }
    protected abstract ConditionValue xgetCValueReqSalesOrgBranchNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)}
     * @param reqSalesOrgAddress1 The value of reqSalesOrgAddress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgAddress1_Equal(String reqSalesOrgAddress1) {
        doSetReqSalesOrgAddress1_Equal(fRES(reqSalesOrgAddress1));
    }

    protected void doSetReqSalesOrgAddress1_Equal(String reqSalesOrgAddress1) {
        regReqSalesOrgAddress1(CK_EQ, reqSalesOrgAddress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)}
     * @param reqSalesOrgAddress1 The value of reqSalesOrgAddress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgAddress1_NotEqual(String reqSalesOrgAddress1) {
        doSetReqSalesOrgAddress1_NotEqual(fRES(reqSalesOrgAddress1));
    }

    protected void doSetReqSalesOrgAddress1_NotEqual(String reqSalesOrgAddress1) {
        regReqSalesOrgAddress1(CK_NES, reqSalesOrgAddress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)}
     * @param reqSalesOrgAddress1 The value of reqSalesOrgAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgAddress1_GreaterThan(String reqSalesOrgAddress1) {
        regReqSalesOrgAddress1(CK_GT, fRES(reqSalesOrgAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)}
     * @param reqSalesOrgAddress1 The value of reqSalesOrgAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgAddress1_LessThan(String reqSalesOrgAddress1) {
        regReqSalesOrgAddress1(CK_LT, fRES(reqSalesOrgAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)}
     * @param reqSalesOrgAddress1 The value of reqSalesOrgAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgAddress1_GreaterEqual(String reqSalesOrgAddress1) {
        regReqSalesOrgAddress1(CK_GE, fRES(reqSalesOrgAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)}
     * @param reqSalesOrgAddress1 The value of reqSalesOrgAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgAddress1_LessEqual(String reqSalesOrgAddress1) {
        regReqSalesOrgAddress1(CK_LE, fRES(reqSalesOrgAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)}
     * @param reqSalesOrgAddress1List The collection of reqSalesOrgAddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgAddress1_InScope(Collection<String> reqSalesOrgAddress1List) {
        doSetReqSalesOrgAddress1_InScope(reqSalesOrgAddress1List);
    }

    protected void doSetReqSalesOrgAddress1_InScope(Collection<String> reqSalesOrgAddress1List) {
        regINS(CK_INS, cTL(reqSalesOrgAddress1List), xgetCValueReqSalesOrgAddress1(), "REQ_SALES_ORG_ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)}
     * @param reqSalesOrgAddress1List The collection of reqSalesOrgAddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgAddress1_NotInScope(Collection<String> reqSalesOrgAddress1List) {
        doSetReqSalesOrgAddress1_NotInScope(reqSalesOrgAddress1List);
    }

    protected void doSetReqSalesOrgAddress1_NotInScope(Collection<String> reqSalesOrgAddress1List) {
        regINS(CK_NINS, cTL(reqSalesOrgAddress1List), xgetCValueReqSalesOrgAddress1(), "REQ_SALES_ORG_ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)} <br>
     * <pre>e.g. setReqSalesOrgAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reqSalesOrgAddress1 The value of reqSalesOrgAddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReqSalesOrgAddress1_LikeSearch(String reqSalesOrgAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reqSalesOrgAddress1), xgetCValueReqSalesOrgAddress1(), "REQ_SALES_ORG_ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)}
     * @param reqSalesOrgAddress1 The value of reqSalesOrgAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReqSalesOrgAddress1_NotLikeSearch(String reqSalesOrgAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reqSalesOrgAddress1), xgetCValueReqSalesOrgAddress1(), "REQ_SALES_ORG_ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)}
     * @param reqSalesOrgAddress1 The value of reqSalesOrgAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgAddress1_PrefixSearch(String reqSalesOrgAddress1) {
        setReqSalesOrgAddress1_LikeSearch(reqSalesOrgAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)}
     */
    public void setReqSalesOrgAddress1_IsNull() { regReqSalesOrgAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)}
     */
    public void setReqSalesOrgAddress1_IsNullOrEmpty() { regReqSalesOrgAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)}
     */
    public void setReqSalesOrgAddress1_IsNotNull() { regReqSalesOrgAddress1(CK_ISNN, DOBJ); }

    protected void regReqSalesOrgAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReqSalesOrgAddress1(), "REQ_SALES_ORG_ADDRESS1"); }
    protected abstract ConditionValue xgetCValueReqSalesOrgAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)}
     * @param reqSalesOrgAddress2 The value of reqSalesOrgAddress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgAddress2_Equal(String reqSalesOrgAddress2) {
        doSetReqSalesOrgAddress2_Equal(fRES(reqSalesOrgAddress2));
    }

    protected void doSetReqSalesOrgAddress2_Equal(String reqSalesOrgAddress2) {
        regReqSalesOrgAddress2(CK_EQ, reqSalesOrgAddress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)}
     * @param reqSalesOrgAddress2 The value of reqSalesOrgAddress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgAddress2_NotEqual(String reqSalesOrgAddress2) {
        doSetReqSalesOrgAddress2_NotEqual(fRES(reqSalesOrgAddress2));
    }

    protected void doSetReqSalesOrgAddress2_NotEqual(String reqSalesOrgAddress2) {
        regReqSalesOrgAddress2(CK_NES, reqSalesOrgAddress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)}
     * @param reqSalesOrgAddress2 The value of reqSalesOrgAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgAddress2_GreaterThan(String reqSalesOrgAddress2) {
        regReqSalesOrgAddress2(CK_GT, fRES(reqSalesOrgAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)}
     * @param reqSalesOrgAddress2 The value of reqSalesOrgAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgAddress2_LessThan(String reqSalesOrgAddress2) {
        regReqSalesOrgAddress2(CK_LT, fRES(reqSalesOrgAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)}
     * @param reqSalesOrgAddress2 The value of reqSalesOrgAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgAddress2_GreaterEqual(String reqSalesOrgAddress2) {
        regReqSalesOrgAddress2(CK_GE, fRES(reqSalesOrgAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)}
     * @param reqSalesOrgAddress2 The value of reqSalesOrgAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgAddress2_LessEqual(String reqSalesOrgAddress2) {
        regReqSalesOrgAddress2(CK_LE, fRES(reqSalesOrgAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)}
     * @param reqSalesOrgAddress2List The collection of reqSalesOrgAddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgAddress2_InScope(Collection<String> reqSalesOrgAddress2List) {
        doSetReqSalesOrgAddress2_InScope(reqSalesOrgAddress2List);
    }

    protected void doSetReqSalesOrgAddress2_InScope(Collection<String> reqSalesOrgAddress2List) {
        regINS(CK_INS, cTL(reqSalesOrgAddress2List), xgetCValueReqSalesOrgAddress2(), "REQ_SALES_ORG_ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)}
     * @param reqSalesOrgAddress2List The collection of reqSalesOrgAddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgAddress2_NotInScope(Collection<String> reqSalesOrgAddress2List) {
        doSetReqSalesOrgAddress2_NotInScope(reqSalesOrgAddress2List);
    }

    protected void doSetReqSalesOrgAddress2_NotInScope(Collection<String> reqSalesOrgAddress2List) {
        regINS(CK_NINS, cTL(reqSalesOrgAddress2List), xgetCValueReqSalesOrgAddress2(), "REQ_SALES_ORG_ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)} <br>
     * <pre>e.g. setReqSalesOrgAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reqSalesOrgAddress2 The value of reqSalesOrgAddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReqSalesOrgAddress2_LikeSearch(String reqSalesOrgAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reqSalesOrgAddress2), xgetCValueReqSalesOrgAddress2(), "REQ_SALES_ORG_ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)}
     * @param reqSalesOrgAddress2 The value of reqSalesOrgAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReqSalesOrgAddress2_NotLikeSearch(String reqSalesOrgAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reqSalesOrgAddress2), xgetCValueReqSalesOrgAddress2(), "REQ_SALES_ORG_ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)}
     * @param reqSalesOrgAddress2 The value of reqSalesOrgAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgAddress2_PrefixSearch(String reqSalesOrgAddress2) {
        setReqSalesOrgAddress2_LikeSearch(reqSalesOrgAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)}
     */
    public void setReqSalesOrgAddress2_IsNull() { regReqSalesOrgAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)}
     */
    public void setReqSalesOrgAddress2_IsNullOrEmpty() { regReqSalesOrgAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)}
     */
    public void setReqSalesOrgAddress2_IsNotNull() { regReqSalesOrgAddress2(CK_ISNN, DOBJ); }

    protected void regReqSalesOrgAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReqSalesOrgAddress2(), "REQ_SALES_ORG_ADDRESS2"); }
    protected abstract ConditionValue xgetCValueReqSalesOrgAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)}
     * @param reqSalesOrgZipCd The value of reqSalesOrgZipCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgZipCd_Equal(String reqSalesOrgZipCd) {
        doSetReqSalesOrgZipCd_Equal(fRES(reqSalesOrgZipCd));
    }

    protected void doSetReqSalesOrgZipCd_Equal(String reqSalesOrgZipCd) {
        regReqSalesOrgZipCd(CK_EQ, reqSalesOrgZipCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)}
     * @param reqSalesOrgZipCd The value of reqSalesOrgZipCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgZipCd_NotEqual(String reqSalesOrgZipCd) {
        doSetReqSalesOrgZipCd_NotEqual(fRES(reqSalesOrgZipCd));
    }

    protected void doSetReqSalesOrgZipCd_NotEqual(String reqSalesOrgZipCd) {
        regReqSalesOrgZipCd(CK_NES, reqSalesOrgZipCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)}
     * @param reqSalesOrgZipCd The value of reqSalesOrgZipCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgZipCd_GreaterThan(String reqSalesOrgZipCd) {
        regReqSalesOrgZipCd(CK_GT, fRES(reqSalesOrgZipCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)}
     * @param reqSalesOrgZipCd The value of reqSalesOrgZipCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgZipCd_LessThan(String reqSalesOrgZipCd) {
        regReqSalesOrgZipCd(CK_LT, fRES(reqSalesOrgZipCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)}
     * @param reqSalesOrgZipCd The value of reqSalesOrgZipCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgZipCd_GreaterEqual(String reqSalesOrgZipCd) {
        regReqSalesOrgZipCd(CK_GE, fRES(reqSalesOrgZipCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)}
     * @param reqSalesOrgZipCd The value of reqSalesOrgZipCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgZipCd_LessEqual(String reqSalesOrgZipCd) {
        regReqSalesOrgZipCd(CK_LE, fRES(reqSalesOrgZipCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)}
     * @param reqSalesOrgZipCdList The collection of reqSalesOrgZipCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgZipCd_InScope(Collection<String> reqSalesOrgZipCdList) {
        doSetReqSalesOrgZipCd_InScope(reqSalesOrgZipCdList);
    }

    protected void doSetReqSalesOrgZipCd_InScope(Collection<String> reqSalesOrgZipCdList) {
        regINS(CK_INS, cTL(reqSalesOrgZipCdList), xgetCValueReqSalesOrgZipCd(), "REQ_SALES_ORG_ZIP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)}
     * @param reqSalesOrgZipCdList The collection of reqSalesOrgZipCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgZipCd_NotInScope(Collection<String> reqSalesOrgZipCdList) {
        doSetReqSalesOrgZipCd_NotInScope(reqSalesOrgZipCdList);
    }

    protected void doSetReqSalesOrgZipCd_NotInScope(Collection<String> reqSalesOrgZipCdList) {
        regINS(CK_NINS, cTL(reqSalesOrgZipCdList), xgetCValueReqSalesOrgZipCd(), "REQ_SALES_ORG_ZIP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setReqSalesOrgZipCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reqSalesOrgZipCd The value of reqSalesOrgZipCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReqSalesOrgZipCd_LikeSearch(String reqSalesOrgZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reqSalesOrgZipCd), xgetCValueReqSalesOrgZipCd(), "REQ_SALES_ORG_ZIP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)}
     * @param reqSalesOrgZipCd The value of reqSalesOrgZipCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReqSalesOrgZipCd_NotLikeSearch(String reqSalesOrgZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reqSalesOrgZipCd), xgetCValueReqSalesOrgZipCd(), "REQ_SALES_ORG_ZIP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)}
     * @param reqSalesOrgZipCd The value of reqSalesOrgZipCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgZipCd_PrefixSearch(String reqSalesOrgZipCd) {
        setReqSalesOrgZipCd_LikeSearch(reqSalesOrgZipCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)}
     */
    public void setReqSalesOrgZipCd_IsNull() { regReqSalesOrgZipCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)}
     */
    public void setReqSalesOrgZipCd_IsNullOrEmpty() { regReqSalesOrgZipCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)}
     */
    public void setReqSalesOrgZipCd_IsNotNull() { regReqSalesOrgZipCd(CK_ISNN, DOBJ); }

    protected void regReqSalesOrgZipCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReqSalesOrgZipCd(), "REQ_SALES_ORG_ZIP_CD"); }
    protected abstract ConditionValue xgetCValueReqSalesOrgZipCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)}
     * @param reqSalesOrgTelNo The value of reqSalesOrgTelNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgTelNo_Equal(String reqSalesOrgTelNo) {
        doSetReqSalesOrgTelNo_Equal(fRES(reqSalesOrgTelNo));
    }

    protected void doSetReqSalesOrgTelNo_Equal(String reqSalesOrgTelNo) {
        regReqSalesOrgTelNo(CK_EQ, reqSalesOrgTelNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)}
     * @param reqSalesOrgTelNo The value of reqSalesOrgTelNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgTelNo_NotEqual(String reqSalesOrgTelNo) {
        doSetReqSalesOrgTelNo_NotEqual(fRES(reqSalesOrgTelNo));
    }

    protected void doSetReqSalesOrgTelNo_NotEqual(String reqSalesOrgTelNo) {
        regReqSalesOrgTelNo(CK_NES, reqSalesOrgTelNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)}
     * @param reqSalesOrgTelNo The value of reqSalesOrgTelNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgTelNo_GreaterThan(String reqSalesOrgTelNo) {
        regReqSalesOrgTelNo(CK_GT, fRES(reqSalesOrgTelNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)}
     * @param reqSalesOrgTelNo The value of reqSalesOrgTelNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgTelNo_LessThan(String reqSalesOrgTelNo) {
        regReqSalesOrgTelNo(CK_LT, fRES(reqSalesOrgTelNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)}
     * @param reqSalesOrgTelNo The value of reqSalesOrgTelNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgTelNo_GreaterEqual(String reqSalesOrgTelNo) {
        regReqSalesOrgTelNo(CK_GE, fRES(reqSalesOrgTelNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)}
     * @param reqSalesOrgTelNo The value of reqSalesOrgTelNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgTelNo_LessEqual(String reqSalesOrgTelNo) {
        regReqSalesOrgTelNo(CK_LE, fRES(reqSalesOrgTelNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)}
     * @param reqSalesOrgTelNoList The collection of reqSalesOrgTelNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgTelNo_InScope(Collection<String> reqSalesOrgTelNoList) {
        doSetReqSalesOrgTelNo_InScope(reqSalesOrgTelNoList);
    }

    protected void doSetReqSalesOrgTelNo_InScope(Collection<String> reqSalesOrgTelNoList) {
        regINS(CK_INS, cTL(reqSalesOrgTelNoList), xgetCValueReqSalesOrgTelNo(), "REQ_SALES_ORG_TEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)}
     * @param reqSalesOrgTelNoList The collection of reqSalesOrgTelNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgTelNo_NotInScope(Collection<String> reqSalesOrgTelNoList) {
        doSetReqSalesOrgTelNo_NotInScope(reqSalesOrgTelNoList);
    }

    protected void doSetReqSalesOrgTelNo_NotInScope(Collection<String> reqSalesOrgTelNoList) {
        regINS(CK_NINS, cTL(reqSalesOrgTelNoList), xgetCValueReqSalesOrgTelNo(), "REQ_SALES_ORG_TEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setReqSalesOrgTelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reqSalesOrgTelNo The value of reqSalesOrgTelNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReqSalesOrgTelNo_LikeSearch(String reqSalesOrgTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reqSalesOrgTelNo), xgetCValueReqSalesOrgTelNo(), "REQ_SALES_ORG_TEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)}
     * @param reqSalesOrgTelNo The value of reqSalesOrgTelNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReqSalesOrgTelNo_NotLikeSearch(String reqSalesOrgTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reqSalesOrgTelNo), xgetCValueReqSalesOrgTelNo(), "REQ_SALES_ORG_TEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)}
     * @param reqSalesOrgTelNo The value of reqSalesOrgTelNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgTelNo_PrefixSearch(String reqSalesOrgTelNo) {
        setReqSalesOrgTelNo_LikeSearch(reqSalesOrgTelNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)}
     */
    public void setReqSalesOrgTelNo_IsNull() { regReqSalesOrgTelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)}
     */
    public void setReqSalesOrgTelNo_IsNullOrEmpty() { regReqSalesOrgTelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)}
     */
    public void setReqSalesOrgTelNo_IsNotNull() { regReqSalesOrgTelNo(CK_ISNN, DOBJ); }

    protected void regReqSalesOrgTelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReqSalesOrgTelNo(), "REQ_SALES_ORG_TEL_NO"); }
    protected abstract ConditionValue xgetCValueReqSalesOrgTelNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)}
     * @param reqSalesOrgFaxNo The value of reqSalesOrgFaxNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgFaxNo_Equal(String reqSalesOrgFaxNo) {
        doSetReqSalesOrgFaxNo_Equal(fRES(reqSalesOrgFaxNo));
    }

    protected void doSetReqSalesOrgFaxNo_Equal(String reqSalesOrgFaxNo) {
        regReqSalesOrgFaxNo(CK_EQ, reqSalesOrgFaxNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)}
     * @param reqSalesOrgFaxNo The value of reqSalesOrgFaxNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgFaxNo_NotEqual(String reqSalesOrgFaxNo) {
        doSetReqSalesOrgFaxNo_NotEqual(fRES(reqSalesOrgFaxNo));
    }

    protected void doSetReqSalesOrgFaxNo_NotEqual(String reqSalesOrgFaxNo) {
        regReqSalesOrgFaxNo(CK_NES, reqSalesOrgFaxNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)}
     * @param reqSalesOrgFaxNo The value of reqSalesOrgFaxNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgFaxNo_GreaterThan(String reqSalesOrgFaxNo) {
        regReqSalesOrgFaxNo(CK_GT, fRES(reqSalesOrgFaxNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)}
     * @param reqSalesOrgFaxNo The value of reqSalesOrgFaxNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgFaxNo_LessThan(String reqSalesOrgFaxNo) {
        regReqSalesOrgFaxNo(CK_LT, fRES(reqSalesOrgFaxNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)}
     * @param reqSalesOrgFaxNo The value of reqSalesOrgFaxNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgFaxNo_GreaterEqual(String reqSalesOrgFaxNo) {
        regReqSalesOrgFaxNo(CK_GE, fRES(reqSalesOrgFaxNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)}
     * @param reqSalesOrgFaxNo The value of reqSalesOrgFaxNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgFaxNo_LessEqual(String reqSalesOrgFaxNo) {
        regReqSalesOrgFaxNo(CK_LE, fRES(reqSalesOrgFaxNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)}
     * @param reqSalesOrgFaxNoList The collection of reqSalesOrgFaxNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgFaxNo_InScope(Collection<String> reqSalesOrgFaxNoList) {
        doSetReqSalesOrgFaxNo_InScope(reqSalesOrgFaxNoList);
    }

    protected void doSetReqSalesOrgFaxNo_InScope(Collection<String> reqSalesOrgFaxNoList) {
        regINS(CK_INS, cTL(reqSalesOrgFaxNoList), xgetCValueReqSalesOrgFaxNo(), "REQ_SALES_ORG_FAX_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)}
     * @param reqSalesOrgFaxNoList The collection of reqSalesOrgFaxNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgFaxNo_NotInScope(Collection<String> reqSalesOrgFaxNoList) {
        doSetReqSalesOrgFaxNo_NotInScope(reqSalesOrgFaxNoList);
    }

    protected void doSetReqSalesOrgFaxNo_NotInScope(Collection<String> reqSalesOrgFaxNoList) {
        regINS(CK_NINS, cTL(reqSalesOrgFaxNoList), xgetCValueReqSalesOrgFaxNo(), "REQ_SALES_ORG_FAX_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setReqSalesOrgFaxNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reqSalesOrgFaxNo The value of reqSalesOrgFaxNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReqSalesOrgFaxNo_LikeSearch(String reqSalesOrgFaxNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reqSalesOrgFaxNo), xgetCValueReqSalesOrgFaxNo(), "REQ_SALES_ORG_FAX_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)}
     * @param reqSalesOrgFaxNo The value of reqSalesOrgFaxNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReqSalesOrgFaxNo_NotLikeSearch(String reqSalesOrgFaxNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reqSalesOrgFaxNo), xgetCValueReqSalesOrgFaxNo(), "REQ_SALES_ORG_FAX_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)}
     * @param reqSalesOrgFaxNo The value of reqSalesOrgFaxNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReqSalesOrgFaxNo_PrefixSearch(String reqSalesOrgFaxNo) {
        setReqSalesOrgFaxNo_LikeSearch(reqSalesOrgFaxNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)}
     */
    public void setReqSalesOrgFaxNo_IsNull() { regReqSalesOrgFaxNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)}
     */
    public void setReqSalesOrgFaxNo_IsNullOrEmpty() { regReqSalesOrgFaxNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)}
     */
    public void setReqSalesOrgFaxNo_IsNotNull() { regReqSalesOrgFaxNo(CK_ISNN, DOBJ); }

    protected void regReqSalesOrgFaxNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReqSalesOrgFaxNo(), "REQ_SALES_ORG_FAX_NO"); }
    protected abstract ConditionValue xgetCValueReqSalesOrgFaxNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK1: {VARCHAR(255)}
     * @param remark1 The value of remark1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark1_Equal(String remark1) {
        doSetRemark1_Equal(fRES(remark1));
    }

    protected void doSetRemark1_Equal(String remark1) {
        regRemark1(CK_EQ, remark1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK1: {VARCHAR(255)}
     * @param remark1 The value of remark1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark1_NotEqual(String remark1) {
        doSetRemark1_NotEqual(fRES(remark1));
    }

    protected void doSetRemark1_NotEqual(String remark1) {
        regRemark1(CK_NES, remark1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK1: {VARCHAR(255)}
     * @param remark1 The value of remark1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark1_GreaterThan(String remark1) {
        regRemark1(CK_GT, fRES(remark1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK1: {VARCHAR(255)}
     * @param remark1 The value of remark1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark1_LessThan(String remark1) {
        regRemark1(CK_LT, fRES(remark1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK1: {VARCHAR(255)}
     * @param remark1 The value of remark1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark1_GreaterEqual(String remark1) {
        regRemark1(CK_GE, fRES(remark1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK1: {VARCHAR(255)}
     * @param remark1 The value of remark1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark1_LessEqual(String remark1) {
        regRemark1(CK_LE, fRES(remark1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REMARK1: {VARCHAR(255)}
     * @param remark1List The collection of remark1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark1_InScope(Collection<String> remark1List) {
        doSetRemark1_InScope(remark1List);
    }

    protected void doSetRemark1_InScope(Collection<String> remark1List) {
        regINS(CK_INS, cTL(remark1List), xgetCValueRemark1(), "REMARK1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REMARK1: {VARCHAR(255)}
     * @param remark1List The collection of remark1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark1_NotInScope(Collection<String> remark1List) {
        doSetRemark1_NotInScope(remark1List);
    }

    protected void doSetRemark1_NotInScope(Collection<String> remark1List) {
        regINS(CK_NINS, cTL(remark1List), xgetCValueRemark1(), "REMARK1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMARK1: {VARCHAR(255)} <br>
     * <pre>e.g. setRemark1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param remark1 The value of remark1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRemark1_LikeSearch(String remark1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(remark1), xgetCValueRemark1(), "REMARK1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMARK1: {VARCHAR(255)}
     * @param remark1 The value of remark1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRemark1_NotLikeSearch(String remark1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(remark1), xgetCValueRemark1(), "REMARK1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMARK1: {VARCHAR(255)}
     * @param remark1 The value of remark1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark1_PrefixSearch(String remark1) {
        setRemark1_LikeSearch(remark1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REMARK1: {VARCHAR(255)}
     */
    public void setRemark1_IsNull() { regRemark1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REMARK1: {VARCHAR(255)}
     */
    public void setRemark1_IsNullOrEmpty() { regRemark1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REMARK1: {VARCHAR(255)}
     */
    public void setRemark1_IsNotNull() { regRemark1(CK_ISNN, DOBJ); }

    protected void regRemark1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRemark1(), "REMARK1"); }
    protected abstract ConditionValue xgetCValueRemark1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK2: {VARCHAR(255)}
     * @param remark2 The value of remark2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark2_Equal(String remark2) {
        doSetRemark2_Equal(fRES(remark2));
    }

    protected void doSetRemark2_Equal(String remark2) {
        regRemark2(CK_EQ, remark2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK2: {VARCHAR(255)}
     * @param remark2 The value of remark2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark2_NotEqual(String remark2) {
        doSetRemark2_NotEqual(fRES(remark2));
    }

    protected void doSetRemark2_NotEqual(String remark2) {
        regRemark2(CK_NES, remark2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK2: {VARCHAR(255)}
     * @param remark2 The value of remark2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark2_GreaterThan(String remark2) {
        regRemark2(CK_GT, fRES(remark2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK2: {VARCHAR(255)}
     * @param remark2 The value of remark2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark2_LessThan(String remark2) {
        regRemark2(CK_LT, fRES(remark2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK2: {VARCHAR(255)}
     * @param remark2 The value of remark2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark2_GreaterEqual(String remark2) {
        regRemark2(CK_GE, fRES(remark2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK2: {VARCHAR(255)}
     * @param remark2 The value of remark2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark2_LessEqual(String remark2) {
        regRemark2(CK_LE, fRES(remark2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REMARK2: {VARCHAR(255)}
     * @param remark2List The collection of remark2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark2_InScope(Collection<String> remark2List) {
        doSetRemark2_InScope(remark2List);
    }

    protected void doSetRemark2_InScope(Collection<String> remark2List) {
        regINS(CK_INS, cTL(remark2List), xgetCValueRemark2(), "REMARK2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REMARK2: {VARCHAR(255)}
     * @param remark2List The collection of remark2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark2_NotInScope(Collection<String> remark2List) {
        doSetRemark2_NotInScope(remark2List);
    }

    protected void doSetRemark2_NotInScope(Collection<String> remark2List) {
        regINS(CK_NINS, cTL(remark2List), xgetCValueRemark2(), "REMARK2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMARK2: {VARCHAR(255)} <br>
     * <pre>e.g. setRemark2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param remark2 The value of remark2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRemark2_LikeSearch(String remark2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(remark2), xgetCValueRemark2(), "REMARK2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMARK2: {VARCHAR(255)}
     * @param remark2 The value of remark2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRemark2_NotLikeSearch(String remark2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(remark2), xgetCValueRemark2(), "REMARK2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMARK2: {VARCHAR(255)}
     * @param remark2 The value of remark2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark2_PrefixSearch(String remark2) {
        setRemark2_LikeSearch(remark2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REMARK2: {VARCHAR(255)}
     */
    public void setRemark2_IsNull() { regRemark2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REMARK2: {VARCHAR(255)}
     */
    public void setRemark2_IsNullOrEmpty() { regRemark2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REMARK2: {VARCHAR(255)}
     */
    public void setRemark2_IsNotNull() { regRemark2(CK_ISNN, DOBJ); }

    protected void regRemark2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRemark2(), "REMARK2"); }
    protected abstract ConditionValue xgetCValueRemark2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK3: {VARCHAR(255)}
     * @param remark3 The value of remark3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark3_Equal(String remark3) {
        doSetRemark3_Equal(fRES(remark3));
    }

    protected void doSetRemark3_Equal(String remark3) {
        regRemark3(CK_EQ, remark3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK3: {VARCHAR(255)}
     * @param remark3 The value of remark3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark3_NotEqual(String remark3) {
        doSetRemark3_NotEqual(fRES(remark3));
    }

    protected void doSetRemark3_NotEqual(String remark3) {
        regRemark3(CK_NES, remark3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK3: {VARCHAR(255)}
     * @param remark3 The value of remark3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark3_GreaterThan(String remark3) {
        regRemark3(CK_GT, fRES(remark3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK3: {VARCHAR(255)}
     * @param remark3 The value of remark3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark3_LessThan(String remark3) {
        regRemark3(CK_LT, fRES(remark3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK3: {VARCHAR(255)}
     * @param remark3 The value of remark3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark3_GreaterEqual(String remark3) {
        regRemark3(CK_GE, fRES(remark3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK3: {VARCHAR(255)}
     * @param remark3 The value of remark3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark3_LessEqual(String remark3) {
        regRemark3(CK_LE, fRES(remark3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REMARK3: {VARCHAR(255)}
     * @param remark3List The collection of remark3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark3_InScope(Collection<String> remark3List) {
        doSetRemark3_InScope(remark3List);
    }

    protected void doSetRemark3_InScope(Collection<String> remark3List) {
        regINS(CK_INS, cTL(remark3List), xgetCValueRemark3(), "REMARK3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REMARK3: {VARCHAR(255)}
     * @param remark3List The collection of remark3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark3_NotInScope(Collection<String> remark3List) {
        doSetRemark3_NotInScope(remark3List);
    }

    protected void doSetRemark3_NotInScope(Collection<String> remark3List) {
        regINS(CK_NINS, cTL(remark3List), xgetCValueRemark3(), "REMARK3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMARK3: {VARCHAR(255)} <br>
     * <pre>e.g. setRemark3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param remark3 The value of remark3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRemark3_LikeSearch(String remark3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(remark3), xgetCValueRemark3(), "REMARK3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMARK3: {VARCHAR(255)}
     * @param remark3 The value of remark3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRemark3_NotLikeSearch(String remark3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(remark3), xgetCValueRemark3(), "REMARK3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMARK3: {VARCHAR(255)}
     * @param remark3 The value of remark3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark3_PrefixSearch(String remark3) {
        setRemark3_LikeSearch(remark3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REMARK3: {VARCHAR(255)}
     */
    public void setRemark3_IsNull() { regRemark3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REMARK3: {VARCHAR(255)}
     */
    public void setRemark3_IsNullOrEmpty() { regRemark3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REMARK3: {VARCHAR(255)}
     */
    public void setRemark3_IsNotNull() { regRemark3(CK_ISNN, DOBJ); }

    protected void regRemark3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRemark3(), "REMARK3"); }
    protected abstract ConditionValue xgetCValueRemark3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK4: {VARCHAR(255)}
     * @param remark4 The value of remark4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark4_Equal(String remark4) {
        doSetRemark4_Equal(fRES(remark4));
    }

    protected void doSetRemark4_Equal(String remark4) {
        regRemark4(CK_EQ, remark4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK4: {VARCHAR(255)}
     * @param remark4 The value of remark4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark4_NotEqual(String remark4) {
        doSetRemark4_NotEqual(fRES(remark4));
    }

    protected void doSetRemark4_NotEqual(String remark4) {
        regRemark4(CK_NES, remark4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK4: {VARCHAR(255)}
     * @param remark4 The value of remark4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark4_GreaterThan(String remark4) {
        regRemark4(CK_GT, fRES(remark4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK4: {VARCHAR(255)}
     * @param remark4 The value of remark4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark4_LessThan(String remark4) {
        regRemark4(CK_LT, fRES(remark4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK4: {VARCHAR(255)}
     * @param remark4 The value of remark4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark4_GreaterEqual(String remark4) {
        regRemark4(CK_GE, fRES(remark4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARK4: {VARCHAR(255)}
     * @param remark4 The value of remark4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark4_LessEqual(String remark4) {
        regRemark4(CK_LE, fRES(remark4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REMARK4: {VARCHAR(255)}
     * @param remark4List The collection of remark4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark4_InScope(Collection<String> remark4List) {
        doSetRemark4_InScope(remark4List);
    }

    protected void doSetRemark4_InScope(Collection<String> remark4List) {
        regINS(CK_INS, cTL(remark4List), xgetCValueRemark4(), "REMARK4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REMARK4: {VARCHAR(255)}
     * @param remark4List The collection of remark4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark4_NotInScope(Collection<String> remark4List) {
        doSetRemark4_NotInScope(remark4List);
    }

    protected void doSetRemark4_NotInScope(Collection<String> remark4List) {
        regINS(CK_NINS, cTL(remark4List), xgetCValueRemark4(), "REMARK4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMARK4: {VARCHAR(255)} <br>
     * <pre>e.g. setRemark4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param remark4 The value of remark4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRemark4_LikeSearch(String remark4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(remark4), xgetCValueRemark4(), "REMARK4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMARK4: {VARCHAR(255)}
     * @param remark4 The value of remark4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRemark4_NotLikeSearch(String remark4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(remark4), xgetCValueRemark4(), "REMARK4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMARK4: {VARCHAR(255)}
     * @param remark4 The value of remark4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemark4_PrefixSearch(String remark4) {
        setRemark4_LikeSearch(remark4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REMARK4: {VARCHAR(255)}
     */
    public void setRemark4_IsNull() { regRemark4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REMARK4: {VARCHAR(255)}
     */
    public void setRemark4_IsNullOrEmpty() { regRemark4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REMARK4: {VARCHAR(255)}
     */
    public void setRemark4_IsNotNull() { regRemark4(CK_ISNN, DOBJ); }

    protected void regRemark4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRemark4(), "REMARK4"); }
    protected abstract ConditionValue xgetCValueRemark4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_OUT: {VARCHAR(30)}
     * @param indvOut The value of indvOut as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvOut_Equal(String indvOut) {
        doSetIndvOut_Equal(fRES(indvOut));
    }

    protected void doSetIndvOut_Equal(String indvOut) {
        regIndvOut(CK_EQ, indvOut);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_OUT: {VARCHAR(30)}
     * @param indvOut The value of indvOut as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvOut_NotEqual(String indvOut) {
        doSetIndvOut_NotEqual(fRES(indvOut));
    }

    protected void doSetIndvOut_NotEqual(String indvOut) {
        regIndvOut(CK_NES, indvOut);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_OUT: {VARCHAR(30)}
     * @param indvOut The value of indvOut as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvOut_GreaterThan(String indvOut) {
        regIndvOut(CK_GT, fRES(indvOut));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_OUT: {VARCHAR(30)}
     * @param indvOut The value of indvOut as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvOut_LessThan(String indvOut) {
        regIndvOut(CK_LT, fRES(indvOut));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_OUT: {VARCHAR(30)}
     * @param indvOut The value of indvOut as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvOut_GreaterEqual(String indvOut) {
        regIndvOut(CK_GE, fRES(indvOut));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_OUT: {VARCHAR(30)}
     * @param indvOut The value of indvOut as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvOut_LessEqual(String indvOut) {
        regIndvOut(CK_LE, fRES(indvOut));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INDV_OUT: {VARCHAR(30)}
     * @param indvOutList The collection of indvOut as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvOut_InScope(Collection<String> indvOutList) {
        doSetIndvOut_InScope(indvOutList);
    }

    protected void doSetIndvOut_InScope(Collection<String> indvOutList) {
        regINS(CK_INS, cTL(indvOutList), xgetCValueIndvOut(), "INDV_OUT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INDV_OUT: {VARCHAR(30)}
     * @param indvOutList The collection of indvOut as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvOut_NotInScope(Collection<String> indvOutList) {
        doSetIndvOut_NotInScope(indvOutList);
    }

    protected void doSetIndvOut_NotInScope(Collection<String> indvOutList) {
        regINS(CK_NINS, cTL(indvOutList), xgetCValueIndvOut(), "INDV_OUT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDV_OUT: {VARCHAR(30)} <br>
     * <pre>e.g. setIndvOut_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param indvOut The value of indvOut as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIndvOut_LikeSearch(String indvOut, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(indvOut), xgetCValueIndvOut(), "INDV_OUT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDV_OUT: {VARCHAR(30)}
     * @param indvOut The value of indvOut as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIndvOut_NotLikeSearch(String indvOut, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(indvOut), xgetCValueIndvOut(), "INDV_OUT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDV_OUT: {VARCHAR(30)}
     * @param indvOut The value of indvOut as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvOut_PrefixSearch(String indvOut) {
        setIndvOut_LikeSearch(indvOut, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INDV_OUT: {VARCHAR(30)}
     */
    public void setIndvOut_IsNull() { regIndvOut(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INDV_OUT: {VARCHAR(30)}
     */
    public void setIndvOut_IsNullOrEmpty() { regIndvOut(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INDV_OUT: {VARCHAR(30)}
     */
    public void setIndvOut_IsNotNull() { regIndvOut(CK_ISNN, DOBJ); }

    protected void regIndvOut(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIndvOut(), "INDV_OUT"); }
    protected abstract ConditionValue xgetCValueIndvOut();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(255)}
     * @param invoiceSummary The value of invoiceSummary as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_Equal(String invoiceSummary) {
        doSetInvoiceSummary_Equal(fRES(invoiceSummary));
    }

    protected void doSetInvoiceSummary_Equal(String invoiceSummary) {
        regInvoiceSummary(CK_EQ, invoiceSummary);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(255)}
     * @param invoiceSummary The value of invoiceSummary as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_NotEqual(String invoiceSummary) {
        doSetInvoiceSummary_NotEqual(fRES(invoiceSummary));
    }

    protected void doSetInvoiceSummary_NotEqual(String invoiceSummary) {
        regInvoiceSummary(CK_NES, invoiceSummary);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(255)}
     * @param invoiceSummary The value of invoiceSummary as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_GreaterThan(String invoiceSummary) {
        regInvoiceSummary(CK_GT, fRES(invoiceSummary));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(255)}
     * @param invoiceSummary The value of invoiceSummary as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_LessThan(String invoiceSummary) {
        regInvoiceSummary(CK_LT, fRES(invoiceSummary));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(255)}
     * @param invoiceSummary The value of invoiceSummary as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_GreaterEqual(String invoiceSummary) {
        regInvoiceSummary(CK_GE, fRES(invoiceSummary));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(255)}
     * @param invoiceSummary The value of invoiceSummary as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_LessEqual(String invoiceSummary) {
        regInvoiceSummary(CK_LE, fRES(invoiceSummary));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(255)}
     * @param invoiceSummaryList The collection of invoiceSummary as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_InScope(Collection<String> invoiceSummaryList) {
        doSetInvoiceSummary_InScope(invoiceSummaryList);
    }

    protected void doSetInvoiceSummary_InScope(Collection<String> invoiceSummaryList) {
        regINS(CK_INS, cTL(invoiceSummaryList), xgetCValueInvoiceSummary(), "INVOICE_SUMMARY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(255)}
     * @param invoiceSummaryList The collection of invoiceSummary as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_NotInScope(Collection<String> invoiceSummaryList) {
        doSetInvoiceSummary_NotInScope(invoiceSummaryList);
    }

    protected void doSetInvoiceSummary_NotInScope(Collection<String> invoiceSummaryList) {
        regINS(CK_NINS, cTL(invoiceSummaryList), xgetCValueInvoiceSummary(), "INVOICE_SUMMARY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(255)} <br>
     * <pre>e.g. setInvoiceSummary_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param invoiceSummary The value of invoiceSummary as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInvoiceSummary_LikeSearch(String invoiceSummary, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(invoiceSummary), xgetCValueInvoiceSummary(), "INVOICE_SUMMARY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(255)}
     * @param invoiceSummary The value of invoiceSummary as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInvoiceSummary_NotLikeSearch(String invoiceSummary, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(invoiceSummary), xgetCValueInvoiceSummary(), "INVOICE_SUMMARY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(255)}
     * @param invoiceSummary The value of invoiceSummary as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_PrefixSearch(String invoiceSummary) {
        setInvoiceSummary_LikeSearch(invoiceSummary, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(255)}
     */
    public void setInvoiceSummary_IsNull() { regInvoiceSummary(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(255)}
     */
    public void setInvoiceSummary_IsNullOrEmpty() { regInvoiceSummary(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(255)}
     */
    public void setInvoiceSummary_IsNotNull() { regInvoiceSummary(CK_ISNN, DOBJ); }

    protected void regInvoiceSummary(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvoiceSummary(), "INVOICE_SUMMARY"); }
    protected abstract ConditionValue xgetCValueInvoiceSummary();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_Equal(String psam) {
        doSetPsam_Equal(fRES(psam));
    }

    protected void doSetPsam_Equal(String psam) {
        regPsam(CK_EQ, psam);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_NotEqual(String psam) {
        doSetPsam_NotEqual(fRES(psam));
    }

    protected void doSetPsam_NotEqual(String psam) {
        regPsam(CK_NES, psam);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_GreaterThan(String psam) {
        regPsam(CK_GT, fRES(psam));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_LessThan(String psam) {
        regPsam(CK_LT, fRES(psam));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_GreaterEqual(String psam) {
        regPsam(CK_GE, fRES(psam));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_LessEqual(String psam) {
        regPsam(CK_LE, fRES(psam));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psamList The collection of psam as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_InScope(Collection<String> psamList) {
        doSetPsam_InScope(psamList);
    }

    protected void doSetPsam_InScope(Collection<String> psamList) {
        regINS(CK_INS, cTL(psamList), xgetCValuePsam(), "PSAM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psamList The collection of psam as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_NotInScope(Collection<String> psamList) {
        doSetPsam_NotInScope(psamList);
    }

    protected void doSetPsam_NotInScope(Collection<String> psamList) {
        regINS(CK_NINS, cTL(psamList), xgetCValuePsam(), "PSAM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSAM: {VARCHAR(30)} <br>
     * <pre>e.g. setPsam_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param psam The value of psam as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPsam_LikeSearch(String psam, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(psam), xgetCValuePsam(), "PSAM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPsam_NotLikeSearch(String psam, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(psam), xgetCValuePsam(), "PSAM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_PrefixSearch(String psam) {
        setPsam_LikeSearch(psam, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     */
    public void setPsam_IsNull() { regPsam(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     */
    public void setPsam_IsNullOrEmpty() { regPsam(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     */
    public void setPsam_IsNotNull() { regPsam(CK_ISNN, DOBJ); }

    protected void regPsam(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePsam(), "PSAM"); }
    protected abstract ConditionValue xgetCValuePsam();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ABOLISH_DT: {VARCHAR(8)}
     * @param abolishDt The value of abolishDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbolishDt_Equal(String abolishDt) {
        doSetAbolishDt_Equal(fRES(abolishDt));
    }

    protected void doSetAbolishDt_Equal(String abolishDt) {
        regAbolishDt(CK_EQ, abolishDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ABOLISH_DT: {VARCHAR(8)}
     * @param abolishDt The value of abolishDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbolishDt_NotEqual(String abolishDt) {
        doSetAbolishDt_NotEqual(fRES(abolishDt));
    }

    protected void doSetAbolishDt_NotEqual(String abolishDt) {
        regAbolishDt(CK_NES, abolishDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ABOLISH_DT: {VARCHAR(8)}
     * @param abolishDt The value of abolishDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbolishDt_GreaterThan(String abolishDt) {
        regAbolishDt(CK_GT, fRES(abolishDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ABOLISH_DT: {VARCHAR(8)}
     * @param abolishDt The value of abolishDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbolishDt_LessThan(String abolishDt) {
        regAbolishDt(CK_LT, fRES(abolishDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ABOLISH_DT: {VARCHAR(8)}
     * @param abolishDt The value of abolishDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbolishDt_GreaterEqual(String abolishDt) {
        regAbolishDt(CK_GE, fRES(abolishDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ABOLISH_DT: {VARCHAR(8)}
     * @param abolishDt The value of abolishDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbolishDt_LessEqual(String abolishDt) {
        regAbolishDt(CK_LE, fRES(abolishDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ABOLISH_DT: {VARCHAR(8)}
     * @param abolishDtList The collection of abolishDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbolishDt_InScope(Collection<String> abolishDtList) {
        doSetAbolishDt_InScope(abolishDtList);
    }

    protected void doSetAbolishDt_InScope(Collection<String> abolishDtList) {
        regINS(CK_INS, cTL(abolishDtList), xgetCValueAbolishDt(), "ABOLISH_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ABOLISH_DT: {VARCHAR(8)}
     * @param abolishDtList The collection of abolishDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbolishDt_NotInScope(Collection<String> abolishDtList) {
        doSetAbolishDt_NotInScope(abolishDtList);
    }

    protected void doSetAbolishDt_NotInScope(Collection<String> abolishDtList) {
        regINS(CK_NINS, cTL(abolishDtList), xgetCValueAbolishDt(), "ABOLISH_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ABOLISH_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setAbolishDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param abolishDt The value of abolishDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAbolishDt_LikeSearch(String abolishDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(abolishDt), xgetCValueAbolishDt(), "ABOLISH_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ABOLISH_DT: {VARCHAR(8)}
     * @param abolishDt The value of abolishDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAbolishDt_NotLikeSearch(String abolishDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(abolishDt), xgetCValueAbolishDt(), "ABOLISH_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ABOLISH_DT: {VARCHAR(8)}
     * @param abolishDt The value of abolishDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbolishDt_PrefixSearch(String abolishDt) {
        setAbolishDt_LikeSearch(abolishDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ABOLISH_DT: {VARCHAR(8)}
     */
    public void setAbolishDt_IsNull() { regAbolishDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ABOLISH_DT: {VARCHAR(8)}
     */
    public void setAbolishDt_IsNullOrEmpty() { regAbolishDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ABOLISH_DT: {VARCHAR(8)}
     */
    public void setAbolishDt_IsNotNull() { regAbolishDt(CK_ISNN, DOBJ); }

    protected void regAbolishDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAbolishDt(), "ABOLISH_DT"); }
    protected abstract ConditionValue xgetCValueAbolishDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_Equal(String floorCompFlg) {
        doSetFloorCompFlg_Equal(fRES(floorCompFlg));
    }

    protected void doSetFloorCompFlg_Equal(String floorCompFlg) {
        regFloorCompFlg(CK_EQ, floorCompFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_NotEqual(String floorCompFlg) {
        doSetFloorCompFlg_NotEqual(fRES(floorCompFlg));
    }

    protected void doSetFloorCompFlg_NotEqual(String floorCompFlg) {
        regFloorCompFlg(CK_NES, floorCompFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_GreaterThan(String floorCompFlg) {
        regFloorCompFlg(CK_GT, fRES(floorCompFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_LessThan(String floorCompFlg) {
        regFloorCompFlg(CK_LT, fRES(floorCompFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_GreaterEqual(String floorCompFlg) {
        regFloorCompFlg(CK_GE, fRES(floorCompFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_LessEqual(String floorCompFlg) {
        regFloorCompFlg(CK_LE, fRES(floorCompFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlgList The collection of floorCompFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_InScope(Collection<String> floorCompFlgList) {
        doSetFloorCompFlg_InScope(floorCompFlgList);
    }

    protected void doSetFloorCompFlg_InScope(Collection<String> floorCompFlgList) {
        regINS(CK_INS, cTL(floorCompFlgList), xgetCValueFloorCompFlg(), "FLOOR_COMP_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlgList The collection of floorCompFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_NotInScope(Collection<String> floorCompFlgList) {
        doSetFloorCompFlg_NotInScope(floorCompFlgList);
    }

    protected void doSetFloorCompFlg_NotInScope(Collection<String> floorCompFlgList) {
        regINS(CK_NINS, cTL(floorCompFlgList), xgetCValueFloorCompFlg(), "FLOOR_COMP_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)} <br>
     * <pre>e.g. setFloorCompFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param floorCompFlg The value of floorCompFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFloorCompFlg_LikeSearch(String floorCompFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(floorCompFlg), xgetCValueFloorCompFlg(), "FLOOR_COMP_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFloorCompFlg_NotLikeSearch(String floorCompFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(floorCompFlg), xgetCValueFloorCompFlg(), "FLOOR_COMP_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_PrefixSearch(String floorCompFlg) {
        setFloorCompFlg_LikeSearch(floorCompFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     */
    public void setFloorCompFlg_IsNull() { regFloorCompFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     */
    public void setFloorCompFlg_IsNullOrEmpty() { regFloorCompFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     */
    public void setFloorCompFlg_IsNotNull() { regFloorCompFlg(CK_ISNN, DOBJ); }

    protected void regFloorCompFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFloorCompFlg(), "FLOOR_COMP_FLG"); }
    protected abstract ConditionValue xgetCValueFloorCompFlg();

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
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCd The value of sapAddUserCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserCd_Equal(String sapAddUserCd) {
        doSetSapAddUserCd_Equal(fRES(sapAddUserCd));
    }

    protected void doSetSapAddUserCd_Equal(String sapAddUserCd) {
        regSapAddUserCd(CK_EQ, sapAddUserCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCd The value of sapAddUserCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserCd_NotEqual(String sapAddUserCd) {
        doSetSapAddUserCd_NotEqual(fRES(sapAddUserCd));
    }

    protected void doSetSapAddUserCd_NotEqual(String sapAddUserCd) {
        regSapAddUserCd(CK_NES, sapAddUserCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCd The value of sapAddUserCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserCd_GreaterThan(String sapAddUserCd) {
        regSapAddUserCd(CK_GT, fRES(sapAddUserCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCd The value of sapAddUserCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserCd_LessThan(String sapAddUserCd) {
        regSapAddUserCd(CK_LT, fRES(sapAddUserCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCd The value of sapAddUserCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserCd_GreaterEqual(String sapAddUserCd) {
        regSapAddUserCd(CK_GE, fRES(sapAddUserCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCd The value of sapAddUserCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserCd_LessEqual(String sapAddUserCd) {
        regSapAddUserCd(CK_LE, fRES(sapAddUserCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCdList The collection of sapAddUserCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserCd_InScope(Collection<String> sapAddUserCdList) {
        doSetSapAddUserCd_InScope(sapAddUserCdList);
    }

    protected void doSetSapAddUserCd_InScope(Collection<String> sapAddUserCdList) {
        regINS(CK_INS, cTL(sapAddUserCdList), xgetCValueSapAddUserCd(), "SAP_ADD_USER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCdList The collection of sapAddUserCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserCd_NotInScope(Collection<String> sapAddUserCdList) {
        doSetSapAddUserCd_NotInScope(sapAddUserCdList);
    }

    protected void doSetSapAddUserCd_NotInScope(Collection<String> sapAddUserCdList) {
        regINS(CK_NINS, cTL(sapAddUserCdList), xgetCValueSapAddUserCd(), "SAP_ADD_USER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSapAddUserCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapAddUserCd The value of sapAddUserCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapAddUserCd_LikeSearch(String sapAddUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapAddUserCd), xgetCValueSapAddUserCd(), "SAP_ADD_USER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCd The value of sapAddUserCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapAddUserCd_NotLikeSearch(String sapAddUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapAddUserCd), xgetCValueSapAddUserCd(), "SAP_ADD_USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCd The value of sapAddUserCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserCd_PrefixSearch(String sapAddUserCd) {
        setSapAddUserCd_LikeSearch(sapAddUserCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     */
    public void setSapAddUserCd_IsNull() { regSapAddUserCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     */
    public void setSapAddUserCd_IsNullOrEmpty() { regSapAddUserCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     */
    public void setSapAddUserCd_IsNotNull() { regSapAddUserCd(CK_ISNN, DOBJ); }

    protected void regSapAddUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapAddUserCd(), "SAP_ADD_USER_CD"); }
    protected abstract ConditionValue xgetCValueSapAddUserCd();

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
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCd The value of sapUpdUserCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserCd_Equal(String sapUpdUserCd) {
        doSetSapUpdUserCd_Equal(fRES(sapUpdUserCd));
    }

    protected void doSetSapUpdUserCd_Equal(String sapUpdUserCd) {
        regSapUpdUserCd(CK_EQ, sapUpdUserCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCd The value of sapUpdUserCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserCd_NotEqual(String sapUpdUserCd) {
        doSetSapUpdUserCd_NotEqual(fRES(sapUpdUserCd));
    }

    protected void doSetSapUpdUserCd_NotEqual(String sapUpdUserCd) {
        regSapUpdUserCd(CK_NES, sapUpdUserCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCd The value of sapUpdUserCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserCd_GreaterThan(String sapUpdUserCd) {
        regSapUpdUserCd(CK_GT, fRES(sapUpdUserCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCd The value of sapUpdUserCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserCd_LessThan(String sapUpdUserCd) {
        regSapUpdUserCd(CK_LT, fRES(sapUpdUserCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCd The value of sapUpdUserCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserCd_GreaterEqual(String sapUpdUserCd) {
        regSapUpdUserCd(CK_GE, fRES(sapUpdUserCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCd The value of sapUpdUserCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserCd_LessEqual(String sapUpdUserCd) {
        regSapUpdUserCd(CK_LE, fRES(sapUpdUserCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCdList The collection of sapUpdUserCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserCd_InScope(Collection<String> sapUpdUserCdList) {
        doSetSapUpdUserCd_InScope(sapUpdUserCdList);
    }

    protected void doSetSapUpdUserCd_InScope(Collection<String> sapUpdUserCdList) {
        regINS(CK_INS, cTL(sapUpdUserCdList), xgetCValueSapUpdUserCd(), "SAP_UPD_USER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCdList The collection of sapUpdUserCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserCd_NotInScope(Collection<String> sapUpdUserCdList) {
        doSetSapUpdUserCd_NotInScope(sapUpdUserCdList);
    }

    protected void doSetSapUpdUserCd_NotInScope(Collection<String> sapUpdUserCdList) {
        regINS(CK_NINS, cTL(sapUpdUserCdList), xgetCValueSapUpdUserCd(), "SAP_UPD_USER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSapUpdUserCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUpdUserCd The value of sapUpdUserCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUpdUserCd_LikeSearch(String sapUpdUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUpdUserCd), xgetCValueSapUpdUserCd(), "SAP_UPD_USER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCd The value of sapUpdUserCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUpdUserCd_NotLikeSearch(String sapUpdUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUpdUserCd), xgetCValueSapUpdUserCd(), "SAP_UPD_USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCd The value of sapUpdUserCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserCd_PrefixSearch(String sapUpdUserCd) {
        setSapUpdUserCd_LikeSearch(sapUpdUserCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     */
    public void setSapUpdUserCd_IsNull() { regSapUpdUserCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     */
    public void setSapUpdUserCd_IsNullOrEmpty() { regSapUpdUserCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     */
    public void setSapUpdUserCd_IsNotNull() { regSapUpdUserCd(CK_ISNN, DOBJ); }

    protected void regSapUpdUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUpdUserCd(), "SAP_UPD_USER_CD"); }
    protected abstract ConditionValue xgetCValueSapUpdUserCd();

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
    public HpSLCFunction<EKoguchiDeliveryCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EKoguchiDeliveryCB.class);
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
    public HpSLCFunction<EKoguchiDeliveryCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EKoguchiDeliveryCB.class);
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
    public HpSLCFunction<EKoguchiDeliveryCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EKoguchiDeliveryCB.class);
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
    public HpSLCFunction<EKoguchiDeliveryCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EKoguchiDeliveryCB.class);
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
    public HpSLCFunction<EKoguchiDeliveryCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EKoguchiDeliveryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EKoguchiDeliveryCB&gt;() {
     *     public void query(EKoguchiDeliveryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EKoguchiDeliveryCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EKoguchiDeliveryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EKoguchiDeliveryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EKoguchiDeliveryCQ sq);

    protected EKoguchiDeliveryCB xcreateScalarConditionCB() {
        EKoguchiDeliveryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EKoguchiDeliveryCB xcreateScalarConditionPartitionByCB() {
        EKoguchiDeliveryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EKoguchiDeliveryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EKoguchiDeliveryCB cb = new EKoguchiDeliveryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "KOGUCHI_DELIVERY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EKoguchiDeliveryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EKoguchiDeliveryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EKoguchiDeliveryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EKoguchiDeliveryCB cb = new EKoguchiDeliveryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "KOGUCHI_DELIVERY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EKoguchiDeliveryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EKoguchiDeliveryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EKoguchiDeliveryCB cb = new EKoguchiDeliveryCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EKoguchiDeliveryCQ sq);

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
    protected EKoguchiDeliveryCB newMyCB() {
        return new EKoguchiDeliveryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EKoguchiDeliveryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
