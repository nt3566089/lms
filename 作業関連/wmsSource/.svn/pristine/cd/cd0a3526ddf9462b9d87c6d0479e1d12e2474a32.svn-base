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
 * The abstract condition-query of t_picking_receive_label.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTPickingReceiveLabelCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTPickingReceiveLabelCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_picking_receive_label";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingReceiveLabelId The value of pickingReceiveLabelId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingReceiveLabelId_Equal(Long pickingReceiveLabelId) {
        doSetPickingReceiveLabelId_Equal(pickingReceiveLabelId);
    }

    protected void doSetPickingReceiveLabelId_Equal(Long pickingReceiveLabelId) {
        regPickingReceiveLabelId(CK_EQ, pickingReceiveLabelId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingReceiveLabelId The value of pickingReceiveLabelId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingReceiveLabelId_NotEqual(Long pickingReceiveLabelId) {
        doSetPickingReceiveLabelId_NotEqual(pickingReceiveLabelId);
    }

    protected void doSetPickingReceiveLabelId_NotEqual(Long pickingReceiveLabelId) {
        regPickingReceiveLabelId(CK_NES, pickingReceiveLabelId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingReceiveLabelId The value of pickingReceiveLabelId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingReceiveLabelId_GreaterThan(Long pickingReceiveLabelId) {
        regPickingReceiveLabelId(CK_GT, pickingReceiveLabelId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingReceiveLabelId The value of pickingReceiveLabelId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingReceiveLabelId_LessThan(Long pickingReceiveLabelId) {
        regPickingReceiveLabelId(CK_LT, pickingReceiveLabelId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingReceiveLabelId The value of pickingReceiveLabelId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingReceiveLabelId_GreaterEqual(Long pickingReceiveLabelId) {
        regPickingReceiveLabelId(CK_GE, pickingReceiveLabelId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingReceiveLabelId The value of pickingReceiveLabelId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingReceiveLabelId_LessEqual(Long pickingReceiveLabelId) {
        regPickingReceiveLabelId(CK_LE, pickingReceiveLabelId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of pickingReceiveLabelId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingReceiveLabelId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingReceiveLabelId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingReceiveLabelId(), "PICKING_RECEIVE_LABEL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingReceiveLabelIdList The collection of pickingReceiveLabelId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingReceiveLabelId_InScope(Collection<Long> pickingReceiveLabelIdList) {
        doSetPickingReceiveLabelId_InScope(pickingReceiveLabelIdList);
    }

    protected void doSetPickingReceiveLabelId_InScope(Collection<Long> pickingReceiveLabelIdList) {
        regINS(CK_INS, cTL(pickingReceiveLabelIdList), xgetCValuePickingReceiveLabelId(), "PICKING_RECEIVE_LABEL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingReceiveLabelIdList The collection of pickingReceiveLabelId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingReceiveLabelId_NotInScope(Collection<Long> pickingReceiveLabelIdList) {
        doSetPickingReceiveLabelId_NotInScope(pickingReceiveLabelIdList);
    }

    protected void doSetPickingReceiveLabelId_NotInScope(Collection<Long> pickingReceiveLabelIdList) {
        regINS(CK_NINS, cTL(pickingReceiveLabelIdList), xgetCValuePickingReceiveLabelId(), "PICKING_RECEIVE_LABEL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPickingReceiveLabelId_IsNull() { regPickingReceiveLabelId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPickingReceiveLabelId_IsNotNull() { regPickingReceiveLabelId(CK_ISNN, DOBJ); }

    protected void regPickingReceiveLabelId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingReceiveLabelId(), "PICKING_RECEIVE_LABEL_ID"); }
    protected abstract ConditionValue xgetCValuePickingReceiveLabelId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {BIGINT(19)}
     * @param pickingBId The value of pickingBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_Equal(Long pickingBId) {
        doSetPickingBId_Equal(pickingBId);
    }

    protected void doSetPickingBId_Equal(Long pickingBId) {
        regPickingBId(CK_EQ, pickingBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {BIGINT(19)}
     * @param pickingBId The value of pickingBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_NotEqual(Long pickingBId) {
        doSetPickingBId_NotEqual(pickingBId);
    }

    protected void doSetPickingBId_NotEqual(Long pickingBId) {
        regPickingBId(CK_NES, pickingBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {BIGINT(19)}
     * @param pickingBId The value of pickingBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_GreaterThan(Long pickingBId) {
        regPickingBId(CK_GT, pickingBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {BIGINT(19)}
     * @param pickingBId The value of pickingBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_LessThan(Long pickingBId) {
        regPickingBId(CK_LT, pickingBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {BIGINT(19)}
     * @param pickingBId The value of pickingBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_GreaterEqual(Long pickingBId) {
        regPickingBId(CK_GE, pickingBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {BIGINT(19)}
     * @param pickingBId The value of pickingBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_LessEqual(Long pickingBId) {
        regPickingBId(CK_LE, pickingBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {BIGINT(19)}
     * @param minNumber The min number of pickingBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingBId(), "PICKING_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_B_ID: {BIGINT(19)}
     * @param pickingBIdList The collection of pickingBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBId_InScope(Collection<Long> pickingBIdList) {
        doSetPickingBId_InScope(pickingBIdList);
    }

    protected void doSetPickingBId_InScope(Collection<Long> pickingBIdList) {
        regINS(CK_INS, cTL(pickingBIdList), xgetCValuePickingBId(), "PICKING_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_B_ID: {BIGINT(19)}
     * @param pickingBIdList The collection of pickingBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBId_NotInScope(Collection<Long> pickingBIdList) {
        doSetPickingBId_NotInScope(pickingBIdList);
    }

    protected void doSetPickingBId_NotInScope(Collection<Long> pickingBIdList) {
        regINS(CK_NINS, cTL(pickingBIdList), xgetCValuePickingBId(), "PICKING_B_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_B_ID: {BIGINT(19)}
     */
    public void setPickingBId_IsNull() { regPickingBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_B_ID: {BIGINT(19)}
     */
    public void setPickingBId_IsNotNull() { regPickingBId(CK_ISNN, DOBJ); }

    protected void regPickingBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingBId(), "PICKING_B_ID"); }
    protected abstract ConditionValue xgetCValuePickingBId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNo The value of receiveLabelNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_Equal(String receiveLabelNo) {
        doSetReceiveLabelNo_Equal(fRES(receiveLabelNo));
    }

    protected void doSetReceiveLabelNo_Equal(String receiveLabelNo) {
        regReceiveLabelNo(CK_EQ, receiveLabelNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNo The value of receiveLabelNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_NotEqual(String receiveLabelNo) {
        doSetReceiveLabelNo_NotEqual(fRES(receiveLabelNo));
    }

    protected void doSetReceiveLabelNo_NotEqual(String receiveLabelNo) {
        regReceiveLabelNo(CK_NES, receiveLabelNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNo The value of receiveLabelNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_GreaterThan(String receiveLabelNo) {
        regReceiveLabelNo(CK_GT, fRES(receiveLabelNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNo The value of receiveLabelNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_LessThan(String receiveLabelNo) {
        regReceiveLabelNo(CK_LT, fRES(receiveLabelNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNo The value of receiveLabelNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_GreaterEqual(String receiveLabelNo) {
        regReceiveLabelNo(CK_GE, fRES(receiveLabelNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNo The value of receiveLabelNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_LessEqual(String receiveLabelNo) {
        regReceiveLabelNo(CK_LE, fRES(receiveLabelNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNoList The collection of receiveLabelNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_InScope(Collection<String> receiveLabelNoList) {
        doSetReceiveLabelNo_InScope(receiveLabelNoList);
    }

    protected void doSetReceiveLabelNo_InScope(Collection<String> receiveLabelNoList) {
        regINS(CK_INS, cTL(receiveLabelNoList), xgetCValueReceiveLabelNo(), "RECEIVE_LABEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNoList The collection of receiveLabelNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_NotInScope(Collection<String> receiveLabelNoList) {
        doSetReceiveLabelNo_NotInScope(receiveLabelNoList);
    }

    protected void doSetReceiveLabelNo_NotInScope(Collection<String> receiveLabelNoList) {
        regINS(CK_NINS, cTL(receiveLabelNoList), xgetCValueReceiveLabelNo(), "RECEIVE_LABEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setReceiveLabelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveLabelNo The value of receiveLabelNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveLabelNo_LikeSearch(String receiveLabelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveLabelNo), xgetCValueReceiveLabelNo(), "RECEIVE_LABEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNo The value of receiveLabelNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveLabelNo_NotLikeSearch(String receiveLabelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveLabelNo), xgetCValueReceiveLabelNo(), "RECEIVE_LABEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNo The value of receiveLabelNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_PrefixSearch(String receiveLabelNo) {
        setReceiveLabelNo_LikeSearch(receiveLabelNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     */
    public void setReceiveLabelNo_IsNull() { regReceiveLabelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     */
    public void setReceiveLabelNo_IsNullOrEmpty() { regReceiveLabelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     */
    public void setReceiveLabelNo_IsNotNull() { regReceiveLabelNo(CK_ISNN, DOBJ); }

    protected void regReceiveLabelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveLabelNo(), "RECEIVE_LABEL_NO"); }
    protected abstract ConditionValue xgetCValueReceiveLabelNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_Equal(String receiveDt) {
        doSetReceiveDt_Equal(fRES(receiveDt));
    }

    protected void doSetReceiveDt_Equal(String receiveDt) {
        regReceiveDt(CK_EQ, receiveDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_NotEqual(String receiveDt) {
        doSetReceiveDt_NotEqual(fRES(receiveDt));
    }

    protected void doSetReceiveDt_NotEqual(String receiveDt) {
        regReceiveDt(CK_NES, receiveDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_GreaterThan(String receiveDt) {
        regReceiveDt(CK_GT, fRES(receiveDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_LessThan(String receiveDt) {
        regReceiveDt(CK_LT, fRES(receiveDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_GreaterEqual(String receiveDt) {
        regReceiveDt(CK_GE, fRES(receiveDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_LessEqual(String receiveDt) {
        regReceiveDt(CK_LE, fRES(receiveDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDtList The collection of receiveDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_InScope(Collection<String> receiveDtList) {
        doSetReceiveDt_InScope(receiveDtList);
    }

    protected void doSetReceiveDt_InScope(Collection<String> receiveDtList) {
        regINS(CK_INS, cTL(receiveDtList), xgetCValueReceiveDt(), "RECEIVE_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDtList The collection of receiveDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_NotInScope(Collection<String> receiveDtList) {
        doSetReceiveDt_NotInScope(receiveDtList);
    }

    protected void doSetReceiveDt_NotInScope(Collection<String> receiveDtList) {
        regINS(CK_NINS, cTL(receiveDtList), xgetCValueReceiveDt(), "RECEIVE_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setReceiveDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveDt The value of receiveDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveDt_LikeSearch(String receiveDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveDt), xgetCValueReceiveDt(), "RECEIVE_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveDt_NotLikeSearch(String receiveDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveDt), xgetCValueReceiveDt(), "RECEIVE_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_PrefixSearch(String receiveDt) {
        setReceiveDt_LikeSearch(receiveDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     */
    public void setReceiveDt_IsNull() { regReceiveDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     */
    public void setReceiveDt_IsNullOrEmpty() { regReceiveDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     */
    public void setReceiveDt_IsNotNull() { regReceiveDt(CK_ISNN, DOBJ); }

    protected void regReceiveDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveDt(), "RECEIVE_DT"); }
    protected abstract ConditionValue xgetCValueReceiveDt();

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
    public HpSLCFunction<TPickingReceiveLabelCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TPickingReceiveLabelCB.class);
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
    public HpSLCFunction<TPickingReceiveLabelCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TPickingReceiveLabelCB.class);
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
    public HpSLCFunction<TPickingReceiveLabelCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TPickingReceiveLabelCB.class);
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
    public HpSLCFunction<TPickingReceiveLabelCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TPickingReceiveLabelCB.class);
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
    public HpSLCFunction<TPickingReceiveLabelCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TPickingReceiveLabelCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TPickingReceiveLabelCB&gt;() {
     *     public void query(TPickingReceiveLabelCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPickingReceiveLabelCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TPickingReceiveLabelCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingReceiveLabelCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TPickingReceiveLabelCQ sq);

    protected TPickingReceiveLabelCB xcreateScalarConditionCB() {
        TPickingReceiveLabelCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TPickingReceiveLabelCB xcreateScalarConditionPartitionByCB() {
        TPickingReceiveLabelCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TPickingReceiveLabelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingReceiveLabelCB cb = new TPickingReceiveLabelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PICKING_RECEIVE_LABEL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TPickingReceiveLabelCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TPickingReceiveLabelCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TPickingReceiveLabelCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingReceiveLabelCB cb = new TPickingReceiveLabelCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PICKING_RECEIVE_LABEL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TPickingReceiveLabelCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TPickingReceiveLabelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingReceiveLabelCB cb = new TPickingReceiveLabelCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TPickingReceiveLabelCQ sq);

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
    protected TPickingReceiveLabelCB newMyCB() {
        return new TPickingReceiveLabelCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TPickingReceiveLabelCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
