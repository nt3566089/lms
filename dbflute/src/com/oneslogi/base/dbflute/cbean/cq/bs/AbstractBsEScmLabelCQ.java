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
 * The abstract condition-query of e_scm_label.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEScmLabelCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEScmLabelCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "e_scm_label";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCM_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param scmLabelId The value of scmLabelId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setScmLabelId_Equal(Long scmLabelId) {
        doSetScmLabelId_Equal(scmLabelId);
    }

    protected void doSetScmLabelId_Equal(Long scmLabelId) {
        regScmLabelId(CK_EQ, scmLabelId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCM_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param scmLabelId The value of scmLabelId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScmLabelId_NotEqual(Long scmLabelId) {
        doSetScmLabelId_NotEqual(scmLabelId);
    }

    protected void doSetScmLabelId_NotEqual(Long scmLabelId) {
        regScmLabelId(CK_NES, scmLabelId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCM_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param scmLabelId The value of scmLabelId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScmLabelId_GreaterThan(Long scmLabelId) {
        regScmLabelId(CK_GT, scmLabelId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCM_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param scmLabelId The value of scmLabelId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScmLabelId_LessThan(Long scmLabelId) {
        regScmLabelId(CK_LT, scmLabelId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCM_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param scmLabelId The value of scmLabelId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScmLabelId_GreaterEqual(Long scmLabelId) {
        regScmLabelId(CK_GE, scmLabelId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCM_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param scmLabelId The value of scmLabelId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScmLabelId_LessEqual(Long scmLabelId) {
        regScmLabelId(CK_LE, scmLabelId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SCM_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of scmLabelId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of scmLabelId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setScmLabelId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueScmLabelId(), "SCM_LABEL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SCM_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param scmLabelIdList The collection of scmLabelId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScmLabelId_InScope(Collection<Long> scmLabelIdList) {
        doSetScmLabelId_InScope(scmLabelIdList);
    }

    protected void doSetScmLabelId_InScope(Collection<Long> scmLabelIdList) {
        regINS(CK_INS, cTL(scmLabelIdList), xgetCValueScmLabelId(), "SCM_LABEL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SCM_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param scmLabelIdList The collection of scmLabelId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScmLabelId_NotInScope(Collection<Long> scmLabelIdList) {
        doSetScmLabelId_NotInScope(scmLabelIdList);
    }

    protected void doSetScmLabelId_NotInScope(Collection<Long> scmLabelIdList) {
        regINS(CK_NINS, cTL(scmLabelIdList), xgetCValueScmLabelId(), "SCM_LABEL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCM_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setScmLabelId_IsNull() { regScmLabelId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCM_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setScmLabelId_IsNotNull() { regScmLabelId(CK_ISNN, DOBJ); }

    protected void regScmLabelId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScmLabelId(), "SCM_LABEL_ID"); }
    protected abstract ConditionValue xgetCValueScmLabelId();

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
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_Equal(String shippingSlipNo) {
        doSetShippingSlipNo_Equal(fRES(shippingSlipNo));
    }

    protected void doSetShippingSlipNo_Equal(String shippingSlipNo) {
        regShippingSlipNo(CK_EQ, shippingSlipNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_NotEqual(String shippingSlipNo) {
        doSetShippingSlipNo_NotEqual(fRES(shippingSlipNo));
    }

    protected void doSetShippingSlipNo_NotEqual(String shippingSlipNo) {
        regShippingSlipNo(CK_NES, shippingSlipNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_GreaterThan(String shippingSlipNo) {
        regShippingSlipNo(CK_GT, fRES(shippingSlipNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_LessThan(String shippingSlipNo) {
        regShippingSlipNo(CK_LT, fRES(shippingSlipNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_GreaterEqual(String shippingSlipNo) {
        regShippingSlipNo(CK_GE, fRES(shippingSlipNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_LessEqual(String shippingSlipNo) {
        regShippingSlipNo(CK_LE, fRES(shippingSlipNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNoList The collection of shippingSlipNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_InScope(Collection<String> shippingSlipNoList) {
        doSetShippingSlipNo_InScope(shippingSlipNoList);
    }

    protected void doSetShippingSlipNo_InScope(Collection<String> shippingSlipNoList) {
        regINS(CK_INS, cTL(shippingSlipNoList), xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNoList The collection of shippingSlipNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_NotInScope(Collection<String> shippingSlipNoList) {
        doSetShippingSlipNo_NotInScope(shippingSlipNoList);
    }

    protected void doSetShippingSlipNo_NotInScope(Collection<String> shippingSlipNoList) {
        regINS(CK_NINS, cTL(shippingSlipNoList), xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingSlipNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingSlipNo The value of shippingSlipNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingSlipNo_LikeSearch(String shippingSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingSlipNo), xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingSlipNo_NotLikeSearch(String shippingSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingSlipNo), xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_PrefixSearch(String shippingSlipNo) {
        setShippingSlipNo_LikeSearch(shippingSlipNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     */
    public void setShippingSlipNo_IsNull() { regShippingSlipNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     */
    public void setShippingSlipNo_IsNullOrEmpty() { regShippingSlipNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     */
    public void setShippingSlipNo_IsNotNull() { regShippingSlipNo(CK_ISNN, DOBJ); }

    protected void regShippingSlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO"); }
    protected abstract ConditionValue xgetCValueShippingSlipNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNo The value of packingNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNo_Equal(String packingNo) {
        doSetPackingNo_Equal(fRES(packingNo));
    }

    protected void doSetPackingNo_Equal(String packingNo) {
        regPackingNo(CK_EQ, packingNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNo The value of packingNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNo_NotEqual(String packingNo) {
        doSetPackingNo_NotEqual(fRES(packingNo));
    }

    protected void doSetPackingNo_NotEqual(String packingNo) {
        regPackingNo(CK_NES, packingNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNo The value of packingNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNo_GreaterThan(String packingNo) {
        regPackingNo(CK_GT, fRES(packingNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNo The value of packingNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNo_LessThan(String packingNo) {
        regPackingNo(CK_LT, fRES(packingNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNo The value of packingNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNo_GreaterEqual(String packingNo) {
        regPackingNo(CK_GE, fRES(packingNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNo The value of packingNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNo_LessEqual(String packingNo) {
        regPackingNo(CK_LE, fRES(packingNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNoList The collection of packingNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNo_InScope(Collection<String> packingNoList) {
        doSetPackingNo_InScope(packingNoList);
    }

    protected void doSetPackingNo_InScope(Collection<String> packingNoList) {
        regINS(CK_INS, cTL(packingNoList), xgetCValuePackingNo(), "PACKING_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNoList The collection of packingNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNo_NotInScope(Collection<String> packingNoList) {
        doSetPackingNo_NotInScope(packingNoList);
    }

    protected void doSetPackingNo_NotInScope(Collection<String> packingNoList) {
        regINS(CK_NINS, cTL(packingNoList), xgetCValuePackingNo(), "PACKING_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PACKING_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setPackingNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param packingNo The value of packingNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPackingNo_LikeSearch(String packingNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(packingNo), xgetCValuePackingNo(), "PACKING_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNo The value of packingNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPackingNo_NotLikeSearch(String packingNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(packingNo), xgetCValuePackingNo(), "PACKING_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNo The value of packingNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNo_PrefixSearch(String packingNo) {
        setPackingNo_LikeSearch(packingNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     */
    public void setPackingNo_IsNull() { regPackingNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     */
    public void setPackingNo_IsNullOrEmpty() { regPackingNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     */
    public void setPackingNo_IsNotNull() { regPackingNo(CK_ISNN, DOBJ); }

    protected void regPackingNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingNo(), "PACKING_NO"); }
    protected abstract ConditionValue xgetCValuePackingNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARTON_ID_NO: {VARCHAR(30)}
     * @param cartonIdNo The value of cartonIdNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCartonIdNo_Equal(String cartonIdNo) {
        doSetCartonIdNo_Equal(fRES(cartonIdNo));
    }

    protected void doSetCartonIdNo_Equal(String cartonIdNo) {
        regCartonIdNo(CK_EQ, cartonIdNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARTON_ID_NO: {VARCHAR(30)}
     * @param cartonIdNo The value of cartonIdNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCartonIdNo_NotEqual(String cartonIdNo) {
        doSetCartonIdNo_NotEqual(fRES(cartonIdNo));
    }

    protected void doSetCartonIdNo_NotEqual(String cartonIdNo) {
        regCartonIdNo(CK_NES, cartonIdNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARTON_ID_NO: {VARCHAR(30)}
     * @param cartonIdNo The value of cartonIdNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCartonIdNo_GreaterThan(String cartonIdNo) {
        regCartonIdNo(CK_GT, fRES(cartonIdNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARTON_ID_NO: {VARCHAR(30)}
     * @param cartonIdNo The value of cartonIdNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCartonIdNo_LessThan(String cartonIdNo) {
        regCartonIdNo(CK_LT, fRES(cartonIdNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARTON_ID_NO: {VARCHAR(30)}
     * @param cartonIdNo The value of cartonIdNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCartonIdNo_GreaterEqual(String cartonIdNo) {
        regCartonIdNo(CK_GE, fRES(cartonIdNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARTON_ID_NO: {VARCHAR(30)}
     * @param cartonIdNo The value of cartonIdNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCartonIdNo_LessEqual(String cartonIdNo) {
        regCartonIdNo(CK_LE, fRES(cartonIdNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARTON_ID_NO: {VARCHAR(30)}
     * @param cartonIdNoList The collection of cartonIdNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCartonIdNo_InScope(Collection<String> cartonIdNoList) {
        doSetCartonIdNo_InScope(cartonIdNoList);
    }

    protected void doSetCartonIdNo_InScope(Collection<String> cartonIdNoList) {
        regINS(CK_INS, cTL(cartonIdNoList), xgetCValueCartonIdNo(), "CARTON_ID_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARTON_ID_NO: {VARCHAR(30)}
     * @param cartonIdNoList The collection of cartonIdNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCartonIdNo_NotInScope(Collection<String> cartonIdNoList) {
        doSetCartonIdNo_NotInScope(cartonIdNoList);
    }

    protected void doSetCartonIdNo_NotInScope(Collection<String> cartonIdNoList) {
        regINS(CK_NINS, cTL(cartonIdNoList), xgetCValueCartonIdNo(), "CARTON_ID_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARTON_ID_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setCartonIdNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cartonIdNo The value of cartonIdNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCartonIdNo_LikeSearch(String cartonIdNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cartonIdNo), xgetCValueCartonIdNo(), "CARTON_ID_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARTON_ID_NO: {VARCHAR(30)}
     * @param cartonIdNo The value of cartonIdNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCartonIdNo_NotLikeSearch(String cartonIdNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cartonIdNo), xgetCValueCartonIdNo(), "CARTON_ID_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARTON_ID_NO: {VARCHAR(30)}
     * @param cartonIdNo The value of cartonIdNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCartonIdNo_PrefixSearch(String cartonIdNo) {
        setCartonIdNo_LikeSearch(cartonIdNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARTON_ID_NO: {VARCHAR(30)}
     */
    public void setCartonIdNo_IsNull() { regCartonIdNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARTON_ID_NO: {VARCHAR(30)}
     */
    public void setCartonIdNo_IsNullOrEmpty() { regCartonIdNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARTON_ID_NO: {VARCHAR(30)}
     */
    public void setCartonIdNo_IsNotNull() { regCartonIdNo(CK_ISNN, DOBJ); }

    protected void regCartonIdNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCartonIdNo(), "CARTON_ID_NO"); }
    protected abstract ConditionValue xgetCValueCartonIdNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SN: {VARCHAR(30)}
     * @param sn The value of sn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSn_Equal(String sn) {
        doSetSn_Equal(fRES(sn));
    }

    protected void doSetSn_Equal(String sn) {
        regSn(CK_EQ, sn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SN: {VARCHAR(30)}
     * @param sn The value of sn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSn_NotEqual(String sn) {
        doSetSn_NotEqual(fRES(sn));
    }

    protected void doSetSn_NotEqual(String sn) {
        regSn(CK_NES, sn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SN: {VARCHAR(30)}
     * @param sn The value of sn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSn_GreaterThan(String sn) {
        regSn(CK_GT, fRES(sn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SN: {VARCHAR(30)}
     * @param sn The value of sn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSn_LessThan(String sn) {
        regSn(CK_LT, fRES(sn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SN: {VARCHAR(30)}
     * @param sn The value of sn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSn_GreaterEqual(String sn) {
        regSn(CK_GE, fRES(sn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SN: {VARCHAR(30)}
     * @param sn The value of sn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSn_LessEqual(String sn) {
        regSn(CK_LE, fRES(sn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SN: {VARCHAR(30)}
     * @param snList The collection of sn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSn_InScope(Collection<String> snList) {
        doSetSn_InScope(snList);
    }

    protected void doSetSn_InScope(Collection<String> snList) {
        regINS(CK_INS, cTL(snList), xgetCValueSn(), "SN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SN: {VARCHAR(30)}
     * @param snList The collection of sn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSn_NotInScope(Collection<String> snList) {
        doSetSn_NotInScope(snList);
    }

    protected void doSetSn_NotInScope(Collection<String> snList) {
        regINS(CK_NINS, cTL(snList), xgetCValueSn(), "SN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SN: {VARCHAR(30)} <br>
     * <pre>e.g. setSn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sn The value of sn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSn_LikeSearch(String sn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sn), xgetCValueSn(), "SN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SN: {VARCHAR(30)}
     * @param sn The value of sn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSn_NotLikeSearch(String sn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sn), xgetCValueSn(), "SN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SN: {VARCHAR(30)}
     * @param sn The value of sn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSn_PrefixSearch(String sn) {
        setSn_LikeSearch(sn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SN: {VARCHAR(30)}
     */
    public void setSn_IsNull() { regSn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SN: {VARCHAR(30)}
     */
    public void setSn_IsNullOrEmpty() { regSn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SN: {VARCHAR(30)}
     */
    public void setSn_IsNotNull() { regSn(CK_ISNN, DOBJ); }

    protected void regSn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSn(), "SN"); }
    protected abstract ConditionValue xgetCValueSn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANAG_TYPE_CD: {VARCHAR(30)}
     * @param managTypeCd The value of managTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManagTypeCd_Equal(String managTypeCd) {
        doSetManagTypeCd_Equal(fRES(managTypeCd));
    }

    protected void doSetManagTypeCd_Equal(String managTypeCd) {
        regManagTypeCd(CK_EQ, managTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANAG_TYPE_CD: {VARCHAR(30)}
     * @param managTypeCd The value of managTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManagTypeCd_NotEqual(String managTypeCd) {
        doSetManagTypeCd_NotEqual(fRES(managTypeCd));
    }

    protected void doSetManagTypeCd_NotEqual(String managTypeCd) {
        regManagTypeCd(CK_NES, managTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANAG_TYPE_CD: {VARCHAR(30)}
     * @param managTypeCd The value of managTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManagTypeCd_GreaterThan(String managTypeCd) {
        regManagTypeCd(CK_GT, fRES(managTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANAG_TYPE_CD: {VARCHAR(30)}
     * @param managTypeCd The value of managTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManagTypeCd_LessThan(String managTypeCd) {
        regManagTypeCd(CK_LT, fRES(managTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANAG_TYPE_CD: {VARCHAR(30)}
     * @param managTypeCd The value of managTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManagTypeCd_GreaterEqual(String managTypeCd) {
        regManagTypeCd(CK_GE, fRES(managTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANAG_TYPE_CD: {VARCHAR(30)}
     * @param managTypeCd The value of managTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManagTypeCd_LessEqual(String managTypeCd) {
        regManagTypeCd(CK_LE, fRES(managTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANAG_TYPE_CD: {VARCHAR(30)}
     * @param managTypeCdList The collection of managTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManagTypeCd_InScope(Collection<String> managTypeCdList) {
        doSetManagTypeCd_InScope(managTypeCdList);
    }

    protected void doSetManagTypeCd_InScope(Collection<String> managTypeCdList) {
        regINS(CK_INS, cTL(managTypeCdList), xgetCValueManagTypeCd(), "MANAG_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANAG_TYPE_CD: {VARCHAR(30)}
     * @param managTypeCdList The collection of managTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManagTypeCd_NotInScope(Collection<String> managTypeCdList) {
        doSetManagTypeCd_NotInScope(managTypeCdList);
    }

    protected void doSetManagTypeCd_NotInScope(Collection<String> managTypeCdList) {
        regINS(CK_NINS, cTL(managTypeCdList), xgetCValueManagTypeCd(), "MANAG_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setManagTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param managTypeCd The value of managTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManagTypeCd_LikeSearch(String managTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(managTypeCd), xgetCValueManagTypeCd(), "MANAG_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANAG_TYPE_CD: {VARCHAR(30)}
     * @param managTypeCd The value of managTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManagTypeCd_NotLikeSearch(String managTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(managTypeCd), xgetCValueManagTypeCd(), "MANAG_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANAG_TYPE_CD: {VARCHAR(30)}
     * @param managTypeCd The value of managTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManagTypeCd_PrefixSearch(String managTypeCd) {
        setManagTypeCd_LikeSearch(managTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANAG_TYPE_CD: {VARCHAR(30)}
     */
    public void setManagTypeCd_IsNull() { regManagTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANAG_TYPE_CD: {VARCHAR(30)}
     */
    public void setManagTypeCd_IsNullOrEmpty() { regManagTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANAG_TYPE_CD: {VARCHAR(30)}
     */
    public void setManagTypeCd_IsNotNull() { regManagTypeCd(CK_ISNN, DOBJ); }

    protected void regManagTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManagTypeCd(), "MANAG_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueManagTypeCd();

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
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_Equal(String hinmokuGroup) {
        doSetHinmokuGroup_Equal(fRES(hinmokuGroup));
    }

    protected void doSetHinmokuGroup_Equal(String hinmokuGroup) {
        regHinmokuGroup(CK_EQ, hinmokuGroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_NotEqual(String hinmokuGroup) {
        doSetHinmokuGroup_NotEqual(fRES(hinmokuGroup));
    }

    protected void doSetHinmokuGroup_NotEqual(String hinmokuGroup) {
        regHinmokuGroup(CK_NES, hinmokuGroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_GreaterThan(String hinmokuGroup) {
        regHinmokuGroup(CK_GT, fRES(hinmokuGroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_LessThan(String hinmokuGroup) {
        regHinmokuGroup(CK_LT, fRES(hinmokuGroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_GreaterEqual(String hinmokuGroup) {
        regHinmokuGroup(CK_GE, fRES(hinmokuGroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_LessEqual(String hinmokuGroup) {
        regHinmokuGroup(CK_LE, fRES(hinmokuGroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroupList The collection of hinmokuGroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_InScope(Collection<String> hinmokuGroupList) {
        doSetHinmokuGroup_InScope(hinmokuGroupList);
    }

    protected void doSetHinmokuGroup_InScope(Collection<String> hinmokuGroupList) {
        regINS(CK_INS, cTL(hinmokuGroupList), xgetCValueHinmokuGroup(), "HINMOKU_GROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroupList The collection of hinmokuGroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_NotInScope(Collection<String> hinmokuGroupList) {
        doSetHinmokuGroup_NotInScope(hinmokuGroupList);
    }

    protected void doSetHinmokuGroup_NotInScope(Collection<String> hinmokuGroupList) {
        regINS(CK_NINS, cTL(hinmokuGroupList), xgetCValueHinmokuGroup(), "HINMOKU_GROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)} <br>
     * <pre>e.g. setHinmokuGroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hinmokuGroup The value of hinmokuGroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHinmokuGroup_LikeSearch(String hinmokuGroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hinmokuGroup), xgetCValueHinmokuGroup(), "HINMOKU_GROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHinmokuGroup_NotLikeSearch(String hinmokuGroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hinmokuGroup), xgetCValueHinmokuGroup(), "HINMOKU_GROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_PrefixSearch(String hinmokuGroup) {
        setHinmokuGroup_LikeSearch(hinmokuGroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     */
    public void setHinmokuGroup_IsNull() { regHinmokuGroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     */
    public void setHinmokuGroup_IsNullOrEmpty() { regHinmokuGroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     */
    public void setHinmokuGroup_IsNotNull() { regHinmokuGroup(CK_ISNN, DOBJ); }

    protected void regHinmokuGroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHinmokuGroup(), "HINMOKU_GROUP"); }
    protected abstract ConditionValue xgetCValueHinmokuGroup();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
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
     * HINMOKU_TEXT: {VARCHAR(60)}
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
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_GreaterThan(String hinmokuText) {
        regHinmokuText(CK_GT, fRES(hinmokuText));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_LessThan(String hinmokuText) {
        regHinmokuText(CK_LT, fRES(hinmokuText));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_GreaterEqual(String hinmokuText) {
        regHinmokuText(CK_GE, fRES(hinmokuText));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_LessEqual(String hinmokuText) {
        regHinmokuText(CK_LE, fRES(hinmokuText));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
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
     * HINMOKU_TEXT: {VARCHAR(60)}
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
     * HINMOKU_TEXT: {VARCHAR(60)} <br>
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
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHinmokuText_NotLikeSearch(String hinmokuText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hinmokuText), xgetCValueHinmokuText(), "HINMOKU_TEXT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_PrefixSearch(String hinmokuText) {
        setHinmokuText_LikeSearch(hinmokuText, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     */
    public void setHinmokuText_IsNull() { regHinmokuText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     */
    public void setHinmokuText_IsNullOrEmpty() { regHinmokuText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
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
     * NUM: {VARCHAR(30)}
     * @param num The value of num as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum_Equal(String num) {
        doSetNum_Equal(fRES(num));
    }

    protected void doSetNum_Equal(String num) {
        regNum(CK_EQ, num);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUM: {VARCHAR(30)}
     * @param num The value of num as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum_NotEqual(String num) {
        doSetNum_NotEqual(fRES(num));
    }

    protected void doSetNum_NotEqual(String num) {
        regNum(CK_NES, num);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUM: {VARCHAR(30)}
     * @param num The value of num as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum_GreaterThan(String num) {
        regNum(CK_GT, fRES(num));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUM: {VARCHAR(30)}
     * @param num The value of num as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum_LessThan(String num) {
        regNum(CK_LT, fRES(num));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUM: {VARCHAR(30)}
     * @param num The value of num as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum_GreaterEqual(String num) {
        regNum(CK_GE, fRES(num));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUM: {VARCHAR(30)}
     * @param num The value of num as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum_LessEqual(String num) {
        regNum(CK_LE, fRES(num));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUM: {VARCHAR(30)}
     * @param numList The collection of num as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum_InScope(Collection<String> numList) {
        doSetNum_InScope(numList);
    }

    protected void doSetNum_InScope(Collection<String> numList) {
        regINS(CK_INS, cTL(numList), xgetCValueNum(), "NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUM: {VARCHAR(30)}
     * @param numList The collection of num as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum_NotInScope(Collection<String> numList) {
        doSetNum_NotInScope(numList);
    }

    protected void doSetNum_NotInScope(Collection<String> numList) {
        regINS(CK_NINS, cTL(numList), xgetCValueNum(), "NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUM: {VARCHAR(30)} <br>
     * <pre>e.g. setNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param num The value of num as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNum_LikeSearch(String num, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(num), xgetCValueNum(), "NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUM: {VARCHAR(30)}
     * @param num The value of num as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNum_NotLikeSearch(String num, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(num), xgetCValueNum(), "NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUM: {VARCHAR(30)}
     * @param num The value of num as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum_PrefixSearch(String num) {
        setNum_LikeSearch(num, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUM: {VARCHAR(30)}
     */
    public void setNum_IsNull() { regNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NUM: {VARCHAR(30)}
     */
    public void setNum_IsNullOrEmpty() { regNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUM: {VARCHAR(30)}
     */
    public void setNum_IsNotNull() { regNum(CK_ISNN, DOBJ); }

    protected void regNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNum(), "NUM"); }
    protected abstract ConditionValue xgetCValueNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO: {VARCHAR(30)}
     * @param serialNo The value of serialNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNo_Equal(String serialNo) {
        doSetSerialNo_Equal(fRES(serialNo));
    }

    protected void doSetSerialNo_Equal(String serialNo) {
        regSerialNo(CK_EQ, serialNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO: {VARCHAR(30)}
     * @param serialNo The value of serialNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNo_NotEqual(String serialNo) {
        doSetSerialNo_NotEqual(fRES(serialNo));
    }

    protected void doSetSerialNo_NotEqual(String serialNo) {
        regSerialNo(CK_NES, serialNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO: {VARCHAR(30)}
     * @param serialNo The value of serialNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNo_GreaterThan(String serialNo) {
        regSerialNo(CK_GT, fRES(serialNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO: {VARCHAR(30)}
     * @param serialNo The value of serialNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNo_LessThan(String serialNo) {
        regSerialNo(CK_LT, fRES(serialNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO: {VARCHAR(30)}
     * @param serialNo The value of serialNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNo_GreaterEqual(String serialNo) {
        regSerialNo(CK_GE, fRES(serialNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO: {VARCHAR(30)}
     * @param serialNo The value of serialNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNo_LessEqual(String serialNo) {
        regSerialNo(CK_LE, fRES(serialNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SERIAL_NO: {VARCHAR(30)}
     * @param serialNoList The collection of serialNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNo_InScope(Collection<String> serialNoList) {
        doSetSerialNo_InScope(serialNoList);
    }

    protected void doSetSerialNo_InScope(Collection<String> serialNoList) {
        regINS(CK_INS, cTL(serialNoList), xgetCValueSerialNo(), "SERIAL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SERIAL_NO: {VARCHAR(30)}
     * @param serialNoList The collection of serialNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNo_NotInScope(Collection<String> serialNoList) {
        doSetSerialNo_NotInScope(serialNoList);
    }

    protected void doSetSerialNo_NotInScope(Collection<String> serialNoList) {
        regINS(CK_NINS, cTL(serialNoList), xgetCValueSerialNo(), "SERIAL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SERIAL_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setSerialNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param serialNo The value of serialNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSerialNo_LikeSearch(String serialNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(serialNo), xgetCValueSerialNo(), "SERIAL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SERIAL_NO: {VARCHAR(30)}
     * @param serialNo The value of serialNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSerialNo_NotLikeSearch(String serialNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(serialNo), xgetCValueSerialNo(), "SERIAL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SERIAL_NO: {VARCHAR(30)}
     * @param serialNo The value of serialNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNo_PrefixSearch(String serialNo) {
        setSerialNo_LikeSearch(serialNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SERIAL_NO: {VARCHAR(30)}
     */
    public void setSerialNo_IsNull() { regSerialNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SERIAL_NO: {VARCHAR(30)}
     */
    public void setSerialNo_IsNullOrEmpty() { regSerialNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SERIAL_NO: {VARCHAR(30)}
     */
    public void setSerialNo_IsNotNull() { regSerialNo(CK_ISNN, DOBJ); }

    protected void regSerialNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSerialNo(), "SERIAL_NO"); }
    protected abstract ConditionValue xgetCValueSerialNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_Equal(String lotManagTypeCd) {
        doSetLotManagTypeCd_Equal(fRES(lotManagTypeCd));
    }

    protected void doSetLotManagTypeCd_Equal(String lotManagTypeCd) {
        regLotManagTypeCd(CK_EQ, lotManagTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_NotEqual(String lotManagTypeCd) {
        doSetLotManagTypeCd_NotEqual(fRES(lotManagTypeCd));
    }

    protected void doSetLotManagTypeCd_NotEqual(String lotManagTypeCd) {
        regLotManagTypeCd(CK_NES, lotManagTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_GreaterThan(String lotManagTypeCd) {
        regLotManagTypeCd(CK_GT, fRES(lotManagTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_LessThan(String lotManagTypeCd) {
        regLotManagTypeCd(CK_LT, fRES(lotManagTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_GreaterEqual(String lotManagTypeCd) {
        regLotManagTypeCd(CK_GE, fRES(lotManagTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_LessEqual(String lotManagTypeCd) {
        regLotManagTypeCd(CK_LE, fRES(lotManagTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCdList The collection of lotManagTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_InScope(Collection<String> lotManagTypeCdList) {
        doSetLotManagTypeCd_InScope(lotManagTypeCdList);
    }

    protected void doSetLotManagTypeCd_InScope(Collection<String> lotManagTypeCdList) {
        regINS(CK_INS, cTL(lotManagTypeCdList), xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCdList The collection of lotManagTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_NotInScope(Collection<String> lotManagTypeCdList) {
        doSetLotManagTypeCd_NotInScope(lotManagTypeCdList);
    }

    protected void doSetLotManagTypeCd_NotInScope(Collection<String> lotManagTypeCdList) {
        regINS(CK_NINS, cTL(lotManagTypeCdList), xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setLotManagTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotManagTypeCd The value of lotManagTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotManagTypeCd_LikeSearch(String lotManagTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotManagTypeCd), xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotManagTypeCd_NotLikeSearch(String lotManagTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotManagTypeCd), xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_PrefixSearch(String lotManagTypeCd) {
        setLotManagTypeCd_LikeSearch(lotManagTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     */
    public void setLotManagTypeCd_IsNull() { regLotManagTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     */
    public void setLotManagTypeCd_IsNullOrEmpty() { regLotManagTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     */
    public void setLotManagTypeCd_IsNotNull() { regLotManagTypeCd(CK_ISNN, DOBJ); }

    protected void regLotManagTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueLotManagTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lot The value of lot as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_Equal(String lot) {
        doSetLot_Equal(fRES(lot));
    }

    protected void doSetLot_Equal(String lot) {
        regLot(CK_EQ, lot);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lot The value of lot as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_NotEqual(String lot) {
        doSetLot_NotEqual(fRES(lot));
    }

    protected void doSetLot_NotEqual(String lot) {
        regLot(CK_NES, lot);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lot The value of lot as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_GreaterThan(String lot) {
        regLot(CK_GT, fRES(lot));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lot The value of lot as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_LessThan(String lot) {
        regLot(CK_LT, fRES(lot));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lot The value of lot as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_GreaterEqual(String lot) {
        regLot(CK_GE, fRES(lot));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lot The value of lot as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_LessEqual(String lot) {
        regLot(CK_LE, fRES(lot));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lotList The collection of lot as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_InScope(Collection<String> lotList) {
        doSetLot_InScope(lotList);
    }

    protected void doSetLot_InScope(Collection<String> lotList) {
        regINS(CK_INS, cTL(lotList), xgetCValueLot(), "LOT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lotList The collection of lot as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_NotInScope(Collection<String> lotList) {
        doSetLot_NotInScope(lotList);
    }

    protected void doSetLot_NotInScope(Collection<String> lotList) {
        regINS(CK_NINS, cTL(lotList), xgetCValueLot(), "LOT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(100)} <br>
     * <pre>e.g. setLot_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot The value of lot as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot_LikeSearch(String lot, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot), xgetCValueLot(), "LOT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lot The value of lot as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot_NotLikeSearch(String lot, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot), xgetCValueLot(), "LOT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lot The value of lot as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_PrefixSearch(String lot) {
        setLot_LikeSearch(lot, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(100)}
     */
    public void setLot_IsNull() { regLot(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(100)}
     */
    public void setLot_IsNullOrEmpty() { regLot(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(100)}
     */
    public void setLot_IsNotNull() { regLot(CK_ISNN, DOBJ); }

    protected void regLot(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot(), "LOT"); }
    protected abstract ConditionValue xgetCValueLot();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(30)}
     * @param limitDt The value of limitDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_Equal(String limitDt) {
        doSetLimitDt_Equal(fRES(limitDt));
    }

    protected void doSetLimitDt_Equal(String limitDt) {
        regLimitDt(CK_EQ, limitDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(30)}
     * @param limitDt The value of limitDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_NotEqual(String limitDt) {
        doSetLimitDt_NotEqual(fRES(limitDt));
    }

    protected void doSetLimitDt_NotEqual(String limitDt) {
        regLimitDt(CK_NES, limitDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(30)}
     * @param limitDt The value of limitDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_GreaterThan(String limitDt) {
        regLimitDt(CK_GT, fRES(limitDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(30)}
     * @param limitDt The value of limitDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_LessThan(String limitDt) {
        regLimitDt(CK_LT, fRES(limitDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(30)}
     * @param limitDt The value of limitDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_GreaterEqual(String limitDt) {
        regLimitDt(CK_GE, fRES(limitDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(30)}
     * @param limitDt The value of limitDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_LessEqual(String limitDt) {
        regLimitDt(CK_LE, fRES(limitDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(30)}
     * @param limitDtList The collection of limitDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_InScope(Collection<String> limitDtList) {
        doSetLimitDt_InScope(limitDtList);
    }

    protected void doSetLimitDt_InScope(Collection<String> limitDtList) {
        regINS(CK_INS, cTL(limitDtList), xgetCValueLimitDt(), "LIMIT_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(30)}
     * @param limitDtList The collection of limitDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_NotInScope(Collection<String> limitDtList) {
        doSetLimitDt_NotInScope(limitDtList);
    }

    protected void doSetLimitDt_NotInScope(Collection<String> limitDtList) {
        regINS(CK_NINS, cTL(limitDtList), xgetCValueLimitDt(), "LIMIT_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(30)} <br>
     * <pre>e.g. setLimitDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitDt The value of limitDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitDt_LikeSearch(String limitDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitDt), xgetCValueLimitDt(), "LIMIT_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(30)}
     * @param limitDt The value of limitDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitDt_NotLikeSearch(String limitDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitDt), xgetCValueLimitDt(), "LIMIT_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(30)}
     * @param limitDt The value of limitDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_PrefixSearch(String limitDt) {
        setLimitDt_LikeSearch(limitDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(30)}
     */
    public void setLimitDt_IsNull() { regLimitDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(30)}
     */
    public void setLimitDt_IsNullOrEmpty() { regLimitDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(30)}
     */
    public void setLimitDt_IsNotNull() { regLimitDt(CK_ISNN, DOBJ); }

    protected void regLimitDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDt(), "LIMIT_DT"); }
    protected abstract ConditionValue xgetCValueLimitDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(30)}
     * @param prodDt The value of prodDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_Equal(String prodDt) {
        doSetProdDt_Equal(fRES(prodDt));
    }

    protected void doSetProdDt_Equal(String prodDt) {
        regProdDt(CK_EQ, prodDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(30)}
     * @param prodDt The value of prodDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_NotEqual(String prodDt) {
        doSetProdDt_NotEqual(fRES(prodDt));
    }

    protected void doSetProdDt_NotEqual(String prodDt) {
        regProdDt(CK_NES, prodDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(30)}
     * @param prodDt The value of prodDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_GreaterThan(String prodDt) {
        regProdDt(CK_GT, fRES(prodDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(30)}
     * @param prodDt The value of prodDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_LessThan(String prodDt) {
        regProdDt(CK_LT, fRES(prodDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(30)}
     * @param prodDt The value of prodDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_GreaterEqual(String prodDt) {
        regProdDt(CK_GE, fRES(prodDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(30)}
     * @param prodDt The value of prodDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_LessEqual(String prodDt) {
        regProdDt(CK_LE, fRES(prodDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(30)}
     * @param prodDtList The collection of prodDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_InScope(Collection<String> prodDtList) {
        doSetProdDt_InScope(prodDtList);
    }

    protected void doSetProdDt_InScope(Collection<String> prodDtList) {
        regINS(CK_INS, cTL(prodDtList), xgetCValueProdDt(), "PROD_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(30)}
     * @param prodDtList The collection of prodDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_NotInScope(Collection<String> prodDtList) {
        doSetProdDt_NotInScope(prodDtList);
    }

    protected void doSetProdDt_NotInScope(Collection<String> prodDtList) {
        regINS(CK_NINS, cTL(prodDtList), xgetCValueProdDt(), "PROD_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(30)} <br>
     * <pre>e.g. setProdDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param prodDt The value of prodDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProdDt_LikeSearch(String prodDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(prodDt), xgetCValueProdDt(), "PROD_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(30)}
     * @param prodDt The value of prodDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProdDt_NotLikeSearch(String prodDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(prodDt), xgetCValueProdDt(), "PROD_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(30)}
     * @param prodDt The value of prodDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_PrefixSearch(String prodDt) {
        setProdDt_LikeSearch(prodDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(30)}
     */
    public void setProdDt_IsNull() { regProdDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(30)}
     */
    public void setProdDt_IsNullOrEmpty() { regProdDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(30)}
     */
    public void setProdDt_IsNotNull() { regProdDt(CK_ISNN, DOBJ); }

    protected void regProdDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProdDt(), "PROD_DT"); }
    protected abstract ConditionValue xgetCValueProdDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyy The value of wmsAddYyyy as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddYyyy_Equal(String wmsAddYyyy) {
        doSetWmsAddYyyy_Equal(fRES(wmsAddYyyy));
    }

    protected void doSetWmsAddYyyy_Equal(String wmsAddYyyy) {
        regWmsAddYyyy(CK_EQ, wmsAddYyyy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyy The value of wmsAddYyyy as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddYyyy_NotEqual(String wmsAddYyyy) {
        doSetWmsAddYyyy_NotEqual(fRES(wmsAddYyyy));
    }

    protected void doSetWmsAddYyyy_NotEqual(String wmsAddYyyy) {
        regWmsAddYyyy(CK_NES, wmsAddYyyy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyy The value of wmsAddYyyy as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddYyyy_GreaterThan(String wmsAddYyyy) {
        regWmsAddYyyy(CK_GT, fRES(wmsAddYyyy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyy The value of wmsAddYyyy as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddYyyy_LessThan(String wmsAddYyyy) {
        regWmsAddYyyy(CK_LT, fRES(wmsAddYyyy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyy The value of wmsAddYyyy as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddYyyy_GreaterEqual(String wmsAddYyyy) {
        regWmsAddYyyy(CK_GE, fRES(wmsAddYyyy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyy The value of wmsAddYyyy as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddYyyy_LessEqual(String wmsAddYyyy) {
        regWmsAddYyyy(CK_LE, fRES(wmsAddYyyy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyyList The collection of wmsAddYyyy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddYyyy_InScope(Collection<String> wmsAddYyyyList) {
        doSetWmsAddYyyy_InScope(wmsAddYyyyList);
    }

    protected void doSetWmsAddYyyy_InScope(Collection<String> wmsAddYyyyList) {
        regINS(CK_INS, cTL(wmsAddYyyyList), xgetCValueWmsAddYyyy(), "WMS_ADD_YYYY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyyList The collection of wmsAddYyyy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddYyyy_NotInScope(Collection<String> wmsAddYyyyList) {
        doSetWmsAddYyyy_NotInScope(wmsAddYyyyList);
    }

    protected void doSetWmsAddYyyy_NotInScope(Collection<String> wmsAddYyyyList) {
        regINS(CK_NINS, cTL(wmsAddYyyyList), xgetCValueWmsAddYyyy(), "WMS_ADD_YYYY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsAddYyyy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsAddYyyy The value of wmsAddYyyy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsAddYyyy_LikeSearch(String wmsAddYyyy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsAddYyyy), xgetCValueWmsAddYyyy(), "WMS_ADD_YYYY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyy The value of wmsAddYyyy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsAddYyyy_NotLikeSearch(String wmsAddYyyy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsAddYyyy), xgetCValueWmsAddYyyy(), "WMS_ADD_YYYY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyy The value of wmsAddYyyy as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddYyyy_PrefixSearch(String wmsAddYyyy) {
        setWmsAddYyyy_LikeSearch(wmsAddYyyy, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     */
    public void setWmsAddYyyy_IsNull() { regWmsAddYyyy(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     */
    public void setWmsAddYyyy_IsNullOrEmpty() { regWmsAddYyyy(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     */
    public void setWmsAddYyyy_IsNotNull() { regWmsAddYyyy(CK_ISNN, DOBJ); }

    protected void regWmsAddYyyy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsAddYyyy(), "WMS_ADD_YYYY"); }
    protected abstract ConditionValue xgetCValueWmsAddYyyy();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMm The value of wmsAddMm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMm_Equal(String wmsAddMm) {
        doSetWmsAddMm_Equal(fRES(wmsAddMm));
    }

    protected void doSetWmsAddMm_Equal(String wmsAddMm) {
        regWmsAddMm(CK_EQ, wmsAddMm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMm The value of wmsAddMm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMm_NotEqual(String wmsAddMm) {
        doSetWmsAddMm_NotEqual(fRES(wmsAddMm));
    }

    protected void doSetWmsAddMm_NotEqual(String wmsAddMm) {
        regWmsAddMm(CK_NES, wmsAddMm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMm The value of wmsAddMm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMm_GreaterThan(String wmsAddMm) {
        regWmsAddMm(CK_GT, fRES(wmsAddMm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMm The value of wmsAddMm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMm_LessThan(String wmsAddMm) {
        regWmsAddMm(CK_LT, fRES(wmsAddMm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMm The value of wmsAddMm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMm_GreaterEqual(String wmsAddMm) {
        regWmsAddMm(CK_GE, fRES(wmsAddMm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMm The value of wmsAddMm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMm_LessEqual(String wmsAddMm) {
        regWmsAddMm(CK_LE, fRES(wmsAddMm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMmList The collection of wmsAddMm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMm_InScope(Collection<String> wmsAddMmList) {
        doSetWmsAddMm_InScope(wmsAddMmList);
    }

    protected void doSetWmsAddMm_InScope(Collection<String> wmsAddMmList) {
        regINS(CK_INS, cTL(wmsAddMmList), xgetCValueWmsAddMm(), "WMS_ADD_MM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMmList The collection of wmsAddMm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMm_NotInScope(Collection<String> wmsAddMmList) {
        doSetWmsAddMm_NotInScope(wmsAddMmList);
    }

    protected void doSetWmsAddMm_NotInScope(Collection<String> wmsAddMmList) {
        regINS(CK_NINS, cTL(wmsAddMmList), xgetCValueWmsAddMm(), "WMS_ADD_MM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsAddMm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsAddMm The value of wmsAddMm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsAddMm_LikeSearch(String wmsAddMm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsAddMm), xgetCValueWmsAddMm(), "WMS_ADD_MM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMm The value of wmsAddMm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsAddMm_NotLikeSearch(String wmsAddMm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsAddMm), xgetCValueWmsAddMm(), "WMS_ADD_MM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMm The value of wmsAddMm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMm_PrefixSearch(String wmsAddMm) {
        setWmsAddMm_LikeSearch(wmsAddMm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     */
    public void setWmsAddMm_IsNull() { regWmsAddMm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     */
    public void setWmsAddMm_IsNullOrEmpty() { regWmsAddMm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     */
    public void setWmsAddMm_IsNotNull() { regWmsAddMm(CK_ISNN, DOBJ); }

    protected void regWmsAddMm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsAddMm(), "WMS_ADD_MM"); }
    protected abstract ConditionValue xgetCValueWmsAddMm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDd The value of wmsAddDd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddDd_Equal(String wmsAddDd) {
        doSetWmsAddDd_Equal(fRES(wmsAddDd));
    }

    protected void doSetWmsAddDd_Equal(String wmsAddDd) {
        regWmsAddDd(CK_EQ, wmsAddDd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDd The value of wmsAddDd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddDd_NotEqual(String wmsAddDd) {
        doSetWmsAddDd_NotEqual(fRES(wmsAddDd));
    }

    protected void doSetWmsAddDd_NotEqual(String wmsAddDd) {
        regWmsAddDd(CK_NES, wmsAddDd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDd The value of wmsAddDd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddDd_GreaterThan(String wmsAddDd) {
        regWmsAddDd(CK_GT, fRES(wmsAddDd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDd The value of wmsAddDd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddDd_LessThan(String wmsAddDd) {
        regWmsAddDd(CK_LT, fRES(wmsAddDd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDd The value of wmsAddDd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddDd_GreaterEqual(String wmsAddDd) {
        regWmsAddDd(CK_GE, fRES(wmsAddDd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDd The value of wmsAddDd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddDd_LessEqual(String wmsAddDd) {
        regWmsAddDd(CK_LE, fRES(wmsAddDd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDdList The collection of wmsAddDd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddDd_InScope(Collection<String> wmsAddDdList) {
        doSetWmsAddDd_InScope(wmsAddDdList);
    }

    protected void doSetWmsAddDd_InScope(Collection<String> wmsAddDdList) {
        regINS(CK_INS, cTL(wmsAddDdList), xgetCValueWmsAddDd(), "WMS_ADD_DD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDdList The collection of wmsAddDd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddDd_NotInScope(Collection<String> wmsAddDdList) {
        doSetWmsAddDd_NotInScope(wmsAddDdList);
    }

    protected void doSetWmsAddDd_NotInScope(Collection<String> wmsAddDdList) {
        regINS(CK_NINS, cTL(wmsAddDdList), xgetCValueWmsAddDd(), "WMS_ADD_DD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsAddDd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsAddDd The value of wmsAddDd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsAddDd_LikeSearch(String wmsAddDd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsAddDd), xgetCValueWmsAddDd(), "WMS_ADD_DD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDd The value of wmsAddDd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsAddDd_NotLikeSearch(String wmsAddDd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsAddDd), xgetCValueWmsAddDd(), "WMS_ADD_DD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDd The value of wmsAddDd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddDd_PrefixSearch(String wmsAddDd) {
        setWmsAddDd_LikeSearch(wmsAddDd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     */
    public void setWmsAddDd_IsNull() { regWmsAddDd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     */
    public void setWmsAddDd_IsNullOrEmpty() { regWmsAddDd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     */
    public void setWmsAddDd_IsNotNull() { regWmsAddDd(CK_ISNN, DOBJ); }

    protected void regWmsAddDd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsAddDd(), "WMS_ADD_DD"); }
    protected abstract ConditionValue xgetCValueWmsAddDd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHh The value of wmsAddHh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddHh_Equal(String wmsAddHh) {
        doSetWmsAddHh_Equal(fRES(wmsAddHh));
    }

    protected void doSetWmsAddHh_Equal(String wmsAddHh) {
        regWmsAddHh(CK_EQ, wmsAddHh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHh The value of wmsAddHh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddHh_NotEqual(String wmsAddHh) {
        doSetWmsAddHh_NotEqual(fRES(wmsAddHh));
    }

    protected void doSetWmsAddHh_NotEqual(String wmsAddHh) {
        regWmsAddHh(CK_NES, wmsAddHh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHh The value of wmsAddHh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddHh_GreaterThan(String wmsAddHh) {
        regWmsAddHh(CK_GT, fRES(wmsAddHh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHh The value of wmsAddHh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddHh_LessThan(String wmsAddHh) {
        regWmsAddHh(CK_LT, fRES(wmsAddHh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHh The value of wmsAddHh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddHh_GreaterEqual(String wmsAddHh) {
        regWmsAddHh(CK_GE, fRES(wmsAddHh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHh The value of wmsAddHh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddHh_LessEqual(String wmsAddHh) {
        regWmsAddHh(CK_LE, fRES(wmsAddHh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHhList The collection of wmsAddHh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddHh_InScope(Collection<String> wmsAddHhList) {
        doSetWmsAddHh_InScope(wmsAddHhList);
    }

    protected void doSetWmsAddHh_InScope(Collection<String> wmsAddHhList) {
        regINS(CK_INS, cTL(wmsAddHhList), xgetCValueWmsAddHh(), "WMS_ADD_HH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHhList The collection of wmsAddHh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddHh_NotInScope(Collection<String> wmsAddHhList) {
        doSetWmsAddHh_NotInScope(wmsAddHhList);
    }

    protected void doSetWmsAddHh_NotInScope(Collection<String> wmsAddHhList) {
        regINS(CK_NINS, cTL(wmsAddHhList), xgetCValueWmsAddHh(), "WMS_ADD_HH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsAddHh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsAddHh The value of wmsAddHh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsAddHh_LikeSearch(String wmsAddHh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsAddHh), xgetCValueWmsAddHh(), "WMS_ADD_HH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHh The value of wmsAddHh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsAddHh_NotLikeSearch(String wmsAddHh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsAddHh), xgetCValueWmsAddHh(), "WMS_ADD_HH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHh The value of wmsAddHh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddHh_PrefixSearch(String wmsAddHh) {
        setWmsAddHh_LikeSearch(wmsAddHh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     */
    public void setWmsAddHh_IsNull() { regWmsAddHh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     */
    public void setWmsAddHh_IsNullOrEmpty() { regWmsAddHh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     */
    public void setWmsAddHh_IsNotNull() { regWmsAddHh(CK_ISNN, DOBJ); }

    protected void regWmsAddHh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsAddHh(), "WMS_ADD_HH"); }
    protected abstract ConditionValue xgetCValueWmsAddHh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMi The value of wmsAddMi as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMi_Equal(String wmsAddMi) {
        doSetWmsAddMi_Equal(fRES(wmsAddMi));
    }

    protected void doSetWmsAddMi_Equal(String wmsAddMi) {
        regWmsAddMi(CK_EQ, wmsAddMi);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMi The value of wmsAddMi as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMi_NotEqual(String wmsAddMi) {
        doSetWmsAddMi_NotEqual(fRES(wmsAddMi));
    }

    protected void doSetWmsAddMi_NotEqual(String wmsAddMi) {
        regWmsAddMi(CK_NES, wmsAddMi);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMi The value of wmsAddMi as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMi_GreaterThan(String wmsAddMi) {
        regWmsAddMi(CK_GT, fRES(wmsAddMi));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMi The value of wmsAddMi as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMi_LessThan(String wmsAddMi) {
        regWmsAddMi(CK_LT, fRES(wmsAddMi));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMi The value of wmsAddMi as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMi_GreaterEqual(String wmsAddMi) {
        regWmsAddMi(CK_GE, fRES(wmsAddMi));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMi The value of wmsAddMi as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMi_LessEqual(String wmsAddMi) {
        regWmsAddMi(CK_LE, fRES(wmsAddMi));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMiList The collection of wmsAddMi as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMi_InScope(Collection<String> wmsAddMiList) {
        doSetWmsAddMi_InScope(wmsAddMiList);
    }

    protected void doSetWmsAddMi_InScope(Collection<String> wmsAddMiList) {
        regINS(CK_INS, cTL(wmsAddMiList), xgetCValueWmsAddMi(), "WMS_ADD_MI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMiList The collection of wmsAddMi as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMi_NotInScope(Collection<String> wmsAddMiList) {
        doSetWmsAddMi_NotInScope(wmsAddMiList);
    }

    protected void doSetWmsAddMi_NotInScope(Collection<String> wmsAddMiList) {
        regINS(CK_NINS, cTL(wmsAddMiList), xgetCValueWmsAddMi(), "WMS_ADD_MI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsAddMi_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsAddMi The value of wmsAddMi as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsAddMi_LikeSearch(String wmsAddMi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsAddMi), xgetCValueWmsAddMi(), "WMS_ADD_MI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMi The value of wmsAddMi as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsAddMi_NotLikeSearch(String wmsAddMi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsAddMi), xgetCValueWmsAddMi(), "WMS_ADD_MI", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMi The value of wmsAddMi as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMi_PrefixSearch(String wmsAddMi) {
        setWmsAddMi_LikeSearch(wmsAddMi, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     */
    public void setWmsAddMi_IsNull() { regWmsAddMi(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     */
    public void setWmsAddMi_IsNullOrEmpty() { regWmsAddMi(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     */
    public void setWmsAddMi_IsNotNull() { regWmsAddMi(CK_ISNN, DOBJ); }

    protected void regWmsAddMi(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsAddMi(), "WMS_ADD_MI"); }
    protected abstract ConditionValue xgetCValueWmsAddMi();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSs The value of wmsAddSs as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddSs_Equal(String wmsAddSs) {
        doSetWmsAddSs_Equal(fRES(wmsAddSs));
    }

    protected void doSetWmsAddSs_Equal(String wmsAddSs) {
        regWmsAddSs(CK_EQ, wmsAddSs);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSs The value of wmsAddSs as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddSs_NotEqual(String wmsAddSs) {
        doSetWmsAddSs_NotEqual(fRES(wmsAddSs));
    }

    protected void doSetWmsAddSs_NotEqual(String wmsAddSs) {
        regWmsAddSs(CK_NES, wmsAddSs);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSs The value of wmsAddSs as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddSs_GreaterThan(String wmsAddSs) {
        regWmsAddSs(CK_GT, fRES(wmsAddSs));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSs The value of wmsAddSs as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddSs_LessThan(String wmsAddSs) {
        regWmsAddSs(CK_LT, fRES(wmsAddSs));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSs The value of wmsAddSs as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddSs_GreaterEqual(String wmsAddSs) {
        regWmsAddSs(CK_GE, fRES(wmsAddSs));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSs The value of wmsAddSs as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddSs_LessEqual(String wmsAddSs) {
        regWmsAddSs(CK_LE, fRES(wmsAddSs));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSsList The collection of wmsAddSs as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddSs_InScope(Collection<String> wmsAddSsList) {
        doSetWmsAddSs_InScope(wmsAddSsList);
    }

    protected void doSetWmsAddSs_InScope(Collection<String> wmsAddSsList) {
        regINS(CK_INS, cTL(wmsAddSsList), xgetCValueWmsAddSs(), "WMS_ADD_SS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSsList The collection of wmsAddSs as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddSs_NotInScope(Collection<String> wmsAddSsList) {
        doSetWmsAddSs_NotInScope(wmsAddSsList);
    }

    protected void doSetWmsAddSs_NotInScope(Collection<String> wmsAddSsList) {
        regINS(CK_NINS, cTL(wmsAddSsList), xgetCValueWmsAddSs(), "WMS_ADD_SS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsAddSs_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsAddSs The value of wmsAddSs as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsAddSs_LikeSearch(String wmsAddSs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsAddSs), xgetCValueWmsAddSs(), "WMS_ADD_SS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSs The value of wmsAddSs as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsAddSs_NotLikeSearch(String wmsAddSs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsAddSs), xgetCValueWmsAddSs(), "WMS_ADD_SS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSs The value of wmsAddSs as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddSs_PrefixSearch(String wmsAddSs) {
        setWmsAddSs_LikeSearch(wmsAddSs, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     */
    public void setWmsAddSs_IsNull() { regWmsAddSs(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     */
    public void setWmsAddSs_IsNullOrEmpty() { regWmsAddSs(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     */
    public void setWmsAddSs_IsNotNull() { regWmsAddSs(CK_ISNN, DOBJ); }

    protected void regWmsAddSs(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsAddSs(), "WMS_ADD_SS"); }
    protected abstract ConditionValue xgetCValueWmsAddSs();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCd The value of wmsAddUserCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserCd_Equal(String wmsAddUserCd) {
        doSetWmsAddUserCd_Equal(fRES(wmsAddUserCd));
    }

    protected void doSetWmsAddUserCd_Equal(String wmsAddUserCd) {
        regWmsAddUserCd(CK_EQ, wmsAddUserCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCd The value of wmsAddUserCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserCd_NotEqual(String wmsAddUserCd) {
        doSetWmsAddUserCd_NotEqual(fRES(wmsAddUserCd));
    }

    protected void doSetWmsAddUserCd_NotEqual(String wmsAddUserCd) {
        regWmsAddUserCd(CK_NES, wmsAddUserCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCd The value of wmsAddUserCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserCd_GreaterThan(String wmsAddUserCd) {
        regWmsAddUserCd(CK_GT, fRES(wmsAddUserCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCd The value of wmsAddUserCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserCd_LessThan(String wmsAddUserCd) {
        regWmsAddUserCd(CK_LT, fRES(wmsAddUserCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCd The value of wmsAddUserCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserCd_GreaterEqual(String wmsAddUserCd) {
        regWmsAddUserCd(CK_GE, fRES(wmsAddUserCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCd The value of wmsAddUserCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserCd_LessEqual(String wmsAddUserCd) {
        regWmsAddUserCd(CK_LE, fRES(wmsAddUserCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCdList The collection of wmsAddUserCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserCd_InScope(Collection<String> wmsAddUserCdList) {
        doSetWmsAddUserCd_InScope(wmsAddUserCdList);
    }

    protected void doSetWmsAddUserCd_InScope(Collection<String> wmsAddUserCdList) {
        regINS(CK_INS, cTL(wmsAddUserCdList), xgetCValueWmsAddUserCd(), "WMS_ADD_USER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCdList The collection of wmsAddUserCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserCd_NotInScope(Collection<String> wmsAddUserCdList) {
        doSetWmsAddUserCd_NotInScope(wmsAddUserCdList);
    }

    protected void doSetWmsAddUserCd_NotInScope(Collection<String> wmsAddUserCdList) {
        regINS(CK_NINS, cTL(wmsAddUserCdList), xgetCValueWmsAddUserCd(), "WMS_ADD_USER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsAddUserCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsAddUserCd The value of wmsAddUserCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsAddUserCd_LikeSearch(String wmsAddUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsAddUserCd), xgetCValueWmsAddUserCd(), "WMS_ADD_USER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCd The value of wmsAddUserCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsAddUserCd_NotLikeSearch(String wmsAddUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsAddUserCd), xgetCValueWmsAddUserCd(), "WMS_ADD_USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCd The value of wmsAddUserCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserCd_PrefixSearch(String wmsAddUserCd) {
        setWmsAddUserCd_LikeSearch(wmsAddUserCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     */
    public void setWmsAddUserCd_IsNull() { regWmsAddUserCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     */
    public void setWmsAddUserCd_IsNullOrEmpty() { regWmsAddUserCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     */
    public void setWmsAddUserCd_IsNotNull() { regWmsAddUserCd(CK_ISNN, DOBJ); }

    protected void regWmsAddUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsAddUserCd(), "WMS_ADD_USER_CD"); }
    protected abstract ConditionValue xgetCValueWmsAddUserCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyy The value of wmsUpdYyyy as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdYyyy_Equal(String wmsUpdYyyy) {
        doSetWmsUpdYyyy_Equal(fRES(wmsUpdYyyy));
    }

    protected void doSetWmsUpdYyyy_Equal(String wmsUpdYyyy) {
        regWmsUpdYyyy(CK_EQ, wmsUpdYyyy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyy The value of wmsUpdYyyy as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdYyyy_NotEqual(String wmsUpdYyyy) {
        doSetWmsUpdYyyy_NotEqual(fRES(wmsUpdYyyy));
    }

    protected void doSetWmsUpdYyyy_NotEqual(String wmsUpdYyyy) {
        regWmsUpdYyyy(CK_NES, wmsUpdYyyy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyy The value of wmsUpdYyyy as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdYyyy_GreaterThan(String wmsUpdYyyy) {
        regWmsUpdYyyy(CK_GT, fRES(wmsUpdYyyy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyy The value of wmsUpdYyyy as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdYyyy_LessThan(String wmsUpdYyyy) {
        regWmsUpdYyyy(CK_LT, fRES(wmsUpdYyyy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyy The value of wmsUpdYyyy as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdYyyy_GreaterEqual(String wmsUpdYyyy) {
        regWmsUpdYyyy(CK_GE, fRES(wmsUpdYyyy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyy The value of wmsUpdYyyy as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdYyyy_LessEqual(String wmsUpdYyyy) {
        regWmsUpdYyyy(CK_LE, fRES(wmsUpdYyyy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyyList The collection of wmsUpdYyyy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdYyyy_InScope(Collection<String> wmsUpdYyyyList) {
        doSetWmsUpdYyyy_InScope(wmsUpdYyyyList);
    }

    protected void doSetWmsUpdYyyy_InScope(Collection<String> wmsUpdYyyyList) {
        regINS(CK_INS, cTL(wmsUpdYyyyList), xgetCValueWmsUpdYyyy(), "WMS_UPD_YYYY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyyList The collection of wmsUpdYyyy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdYyyy_NotInScope(Collection<String> wmsUpdYyyyList) {
        doSetWmsUpdYyyy_NotInScope(wmsUpdYyyyList);
    }

    protected void doSetWmsUpdYyyy_NotInScope(Collection<String> wmsUpdYyyyList) {
        regINS(CK_NINS, cTL(wmsUpdYyyyList), xgetCValueWmsUpdYyyy(), "WMS_UPD_YYYY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsUpdYyyy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsUpdYyyy The value of wmsUpdYyyy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsUpdYyyy_LikeSearch(String wmsUpdYyyy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsUpdYyyy), xgetCValueWmsUpdYyyy(), "WMS_UPD_YYYY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyy The value of wmsUpdYyyy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsUpdYyyy_NotLikeSearch(String wmsUpdYyyy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsUpdYyyy), xgetCValueWmsUpdYyyy(), "WMS_UPD_YYYY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyy The value of wmsUpdYyyy as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdYyyy_PrefixSearch(String wmsUpdYyyy) {
        setWmsUpdYyyy_LikeSearch(wmsUpdYyyy, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     */
    public void setWmsUpdYyyy_IsNull() { regWmsUpdYyyy(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     */
    public void setWmsUpdYyyy_IsNullOrEmpty() { regWmsUpdYyyy(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     */
    public void setWmsUpdYyyy_IsNotNull() { regWmsUpdYyyy(CK_ISNN, DOBJ); }

    protected void regWmsUpdYyyy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsUpdYyyy(), "WMS_UPD_YYYY"); }
    protected abstract ConditionValue xgetCValueWmsUpdYyyy();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMm The value of wmsUpdMm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMm_Equal(String wmsUpdMm) {
        doSetWmsUpdMm_Equal(fRES(wmsUpdMm));
    }

    protected void doSetWmsUpdMm_Equal(String wmsUpdMm) {
        regWmsUpdMm(CK_EQ, wmsUpdMm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMm The value of wmsUpdMm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMm_NotEqual(String wmsUpdMm) {
        doSetWmsUpdMm_NotEqual(fRES(wmsUpdMm));
    }

    protected void doSetWmsUpdMm_NotEqual(String wmsUpdMm) {
        regWmsUpdMm(CK_NES, wmsUpdMm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMm The value of wmsUpdMm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMm_GreaterThan(String wmsUpdMm) {
        regWmsUpdMm(CK_GT, fRES(wmsUpdMm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMm The value of wmsUpdMm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMm_LessThan(String wmsUpdMm) {
        regWmsUpdMm(CK_LT, fRES(wmsUpdMm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMm The value of wmsUpdMm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMm_GreaterEqual(String wmsUpdMm) {
        regWmsUpdMm(CK_GE, fRES(wmsUpdMm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMm The value of wmsUpdMm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMm_LessEqual(String wmsUpdMm) {
        regWmsUpdMm(CK_LE, fRES(wmsUpdMm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMmList The collection of wmsUpdMm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMm_InScope(Collection<String> wmsUpdMmList) {
        doSetWmsUpdMm_InScope(wmsUpdMmList);
    }

    protected void doSetWmsUpdMm_InScope(Collection<String> wmsUpdMmList) {
        regINS(CK_INS, cTL(wmsUpdMmList), xgetCValueWmsUpdMm(), "WMS_UPD_MM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMmList The collection of wmsUpdMm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMm_NotInScope(Collection<String> wmsUpdMmList) {
        doSetWmsUpdMm_NotInScope(wmsUpdMmList);
    }

    protected void doSetWmsUpdMm_NotInScope(Collection<String> wmsUpdMmList) {
        regINS(CK_NINS, cTL(wmsUpdMmList), xgetCValueWmsUpdMm(), "WMS_UPD_MM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsUpdMm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsUpdMm The value of wmsUpdMm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsUpdMm_LikeSearch(String wmsUpdMm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsUpdMm), xgetCValueWmsUpdMm(), "WMS_UPD_MM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMm The value of wmsUpdMm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsUpdMm_NotLikeSearch(String wmsUpdMm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsUpdMm), xgetCValueWmsUpdMm(), "WMS_UPD_MM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMm The value of wmsUpdMm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMm_PrefixSearch(String wmsUpdMm) {
        setWmsUpdMm_LikeSearch(wmsUpdMm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     */
    public void setWmsUpdMm_IsNull() { regWmsUpdMm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     */
    public void setWmsUpdMm_IsNullOrEmpty() { regWmsUpdMm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     */
    public void setWmsUpdMm_IsNotNull() { regWmsUpdMm(CK_ISNN, DOBJ); }

    protected void regWmsUpdMm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsUpdMm(), "WMS_UPD_MM"); }
    protected abstract ConditionValue xgetCValueWmsUpdMm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDd The value of wmsUpdDd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdDd_Equal(String wmsUpdDd) {
        doSetWmsUpdDd_Equal(fRES(wmsUpdDd));
    }

    protected void doSetWmsUpdDd_Equal(String wmsUpdDd) {
        regWmsUpdDd(CK_EQ, wmsUpdDd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDd The value of wmsUpdDd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdDd_NotEqual(String wmsUpdDd) {
        doSetWmsUpdDd_NotEqual(fRES(wmsUpdDd));
    }

    protected void doSetWmsUpdDd_NotEqual(String wmsUpdDd) {
        regWmsUpdDd(CK_NES, wmsUpdDd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDd The value of wmsUpdDd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdDd_GreaterThan(String wmsUpdDd) {
        regWmsUpdDd(CK_GT, fRES(wmsUpdDd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDd The value of wmsUpdDd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdDd_LessThan(String wmsUpdDd) {
        regWmsUpdDd(CK_LT, fRES(wmsUpdDd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDd The value of wmsUpdDd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdDd_GreaterEqual(String wmsUpdDd) {
        regWmsUpdDd(CK_GE, fRES(wmsUpdDd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDd The value of wmsUpdDd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdDd_LessEqual(String wmsUpdDd) {
        regWmsUpdDd(CK_LE, fRES(wmsUpdDd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDdList The collection of wmsUpdDd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdDd_InScope(Collection<String> wmsUpdDdList) {
        doSetWmsUpdDd_InScope(wmsUpdDdList);
    }

    protected void doSetWmsUpdDd_InScope(Collection<String> wmsUpdDdList) {
        regINS(CK_INS, cTL(wmsUpdDdList), xgetCValueWmsUpdDd(), "WMS_UPD_DD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDdList The collection of wmsUpdDd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdDd_NotInScope(Collection<String> wmsUpdDdList) {
        doSetWmsUpdDd_NotInScope(wmsUpdDdList);
    }

    protected void doSetWmsUpdDd_NotInScope(Collection<String> wmsUpdDdList) {
        regINS(CK_NINS, cTL(wmsUpdDdList), xgetCValueWmsUpdDd(), "WMS_UPD_DD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsUpdDd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsUpdDd The value of wmsUpdDd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsUpdDd_LikeSearch(String wmsUpdDd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsUpdDd), xgetCValueWmsUpdDd(), "WMS_UPD_DD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDd The value of wmsUpdDd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsUpdDd_NotLikeSearch(String wmsUpdDd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsUpdDd), xgetCValueWmsUpdDd(), "WMS_UPD_DD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDd The value of wmsUpdDd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdDd_PrefixSearch(String wmsUpdDd) {
        setWmsUpdDd_LikeSearch(wmsUpdDd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     */
    public void setWmsUpdDd_IsNull() { regWmsUpdDd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     */
    public void setWmsUpdDd_IsNullOrEmpty() { regWmsUpdDd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     */
    public void setWmsUpdDd_IsNotNull() { regWmsUpdDd(CK_ISNN, DOBJ); }

    protected void regWmsUpdDd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsUpdDd(), "WMS_UPD_DD"); }
    protected abstract ConditionValue xgetCValueWmsUpdDd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHh The value of wmsUpdHh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdHh_Equal(String wmsUpdHh) {
        doSetWmsUpdHh_Equal(fRES(wmsUpdHh));
    }

    protected void doSetWmsUpdHh_Equal(String wmsUpdHh) {
        regWmsUpdHh(CK_EQ, wmsUpdHh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHh The value of wmsUpdHh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdHh_NotEqual(String wmsUpdHh) {
        doSetWmsUpdHh_NotEqual(fRES(wmsUpdHh));
    }

    protected void doSetWmsUpdHh_NotEqual(String wmsUpdHh) {
        regWmsUpdHh(CK_NES, wmsUpdHh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHh The value of wmsUpdHh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdHh_GreaterThan(String wmsUpdHh) {
        regWmsUpdHh(CK_GT, fRES(wmsUpdHh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHh The value of wmsUpdHh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdHh_LessThan(String wmsUpdHh) {
        regWmsUpdHh(CK_LT, fRES(wmsUpdHh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHh The value of wmsUpdHh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdHh_GreaterEqual(String wmsUpdHh) {
        regWmsUpdHh(CK_GE, fRES(wmsUpdHh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHh The value of wmsUpdHh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdHh_LessEqual(String wmsUpdHh) {
        regWmsUpdHh(CK_LE, fRES(wmsUpdHh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHhList The collection of wmsUpdHh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdHh_InScope(Collection<String> wmsUpdHhList) {
        doSetWmsUpdHh_InScope(wmsUpdHhList);
    }

    protected void doSetWmsUpdHh_InScope(Collection<String> wmsUpdHhList) {
        regINS(CK_INS, cTL(wmsUpdHhList), xgetCValueWmsUpdHh(), "WMS_UPD_HH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHhList The collection of wmsUpdHh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdHh_NotInScope(Collection<String> wmsUpdHhList) {
        doSetWmsUpdHh_NotInScope(wmsUpdHhList);
    }

    protected void doSetWmsUpdHh_NotInScope(Collection<String> wmsUpdHhList) {
        regINS(CK_NINS, cTL(wmsUpdHhList), xgetCValueWmsUpdHh(), "WMS_UPD_HH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsUpdHh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsUpdHh The value of wmsUpdHh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsUpdHh_LikeSearch(String wmsUpdHh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsUpdHh), xgetCValueWmsUpdHh(), "WMS_UPD_HH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHh The value of wmsUpdHh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsUpdHh_NotLikeSearch(String wmsUpdHh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsUpdHh), xgetCValueWmsUpdHh(), "WMS_UPD_HH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHh The value of wmsUpdHh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdHh_PrefixSearch(String wmsUpdHh) {
        setWmsUpdHh_LikeSearch(wmsUpdHh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     */
    public void setWmsUpdHh_IsNull() { regWmsUpdHh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     */
    public void setWmsUpdHh_IsNullOrEmpty() { regWmsUpdHh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     */
    public void setWmsUpdHh_IsNotNull() { regWmsUpdHh(CK_ISNN, DOBJ); }

    protected void regWmsUpdHh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsUpdHh(), "WMS_UPD_HH"); }
    protected abstract ConditionValue xgetCValueWmsUpdHh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMi The value of wmsUpdMi as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMi_Equal(String wmsUpdMi) {
        doSetWmsUpdMi_Equal(fRES(wmsUpdMi));
    }

    protected void doSetWmsUpdMi_Equal(String wmsUpdMi) {
        regWmsUpdMi(CK_EQ, wmsUpdMi);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMi The value of wmsUpdMi as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMi_NotEqual(String wmsUpdMi) {
        doSetWmsUpdMi_NotEqual(fRES(wmsUpdMi));
    }

    protected void doSetWmsUpdMi_NotEqual(String wmsUpdMi) {
        regWmsUpdMi(CK_NES, wmsUpdMi);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMi The value of wmsUpdMi as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMi_GreaterThan(String wmsUpdMi) {
        regWmsUpdMi(CK_GT, fRES(wmsUpdMi));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMi The value of wmsUpdMi as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMi_LessThan(String wmsUpdMi) {
        regWmsUpdMi(CK_LT, fRES(wmsUpdMi));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMi The value of wmsUpdMi as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMi_GreaterEqual(String wmsUpdMi) {
        regWmsUpdMi(CK_GE, fRES(wmsUpdMi));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMi The value of wmsUpdMi as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMi_LessEqual(String wmsUpdMi) {
        regWmsUpdMi(CK_LE, fRES(wmsUpdMi));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMiList The collection of wmsUpdMi as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMi_InScope(Collection<String> wmsUpdMiList) {
        doSetWmsUpdMi_InScope(wmsUpdMiList);
    }

    protected void doSetWmsUpdMi_InScope(Collection<String> wmsUpdMiList) {
        regINS(CK_INS, cTL(wmsUpdMiList), xgetCValueWmsUpdMi(), "WMS_UPD_MI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMiList The collection of wmsUpdMi as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMi_NotInScope(Collection<String> wmsUpdMiList) {
        doSetWmsUpdMi_NotInScope(wmsUpdMiList);
    }

    protected void doSetWmsUpdMi_NotInScope(Collection<String> wmsUpdMiList) {
        regINS(CK_NINS, cTL(wmsUpdMiList), xgetCValueWmsUpdMi(), "WMS_UPD_MI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsUpdMi_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsUpdMi The value of wmsUpdMi as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsUpdMi_LikeSearch(String wmsUpdMi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsUpdMi), xgetCValueWmsUpdMi(), "WMS_UPD_MI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMi The value of wmsUpdMi as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsUpdMi_NotLikeSearch(String wmsUpdMi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsUpdMi), xgetCValueWmsUpdMi(), "WMS_UPD_MI", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMi The value of wmsUpdMi as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMi_PrefixSearch(String wmsUpdMi) {
        setWmsUpdMi_LikeSearch(wmsUpdMi, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     */
    public void setWmsUpdMi_IsNull() { regWmsUpdMi(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     */
    public void setWmsUpdMi_IsNullOrEmpty() { regWmsUpdMi(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     */
    public void setWmsUpdMi_IsNotNull() { regWmsUpdMi(CK_ISNN, DOBJ); }

    protected void regWmsUpdMi(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsUpdMi(), "WMS_UPD_MI"); }
    protected abstract ConditionValue xgetCValueWmsUpdMi();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSs The value of wmsUpdSs as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdSs_Equal(String wmsUpdSs) {
        doSetWmsUpdSs_Equal(fRES(wmsUpdSs));
    }

    protected void doSetWmsUpdSs_Equal(String wmsUpdSs) {
        regWmsUpdSs(CK_EQ, wmsUpdSs);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSs The value of wmsUpdSs as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdSs_NotEqual(String wmsUpdSs) {
        doSetWmsUpdSs_NotEqual(fRES(wmsUpdSs));
    }

    protected void doSetWmsUpdSs_NotEqual(String wmsUpdSs) {
        regWmsUpdSs(CK_NES, wmsUpdSs);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSs The value of wmsUpdSs as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdSs_GreaterThan(String wmsUpdSs) {
        regWmsUpdSs(CK_GT, fRES(wmsUpdSs));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSs The value of wmsUpdSs as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdSs_LessThan(String wmsUpdSs) {
        regWmsUpdSs(CK_LT, fRES(wmsUpdSs));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSs The value of wmsUpdSs as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdSs_GreaterEqual(String wmsUpdSs) {
        regWmsUpdSs(CK_GE, fRES(wmsUpdSs));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSs The value of wmsUpdSs as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdSs_LessEqual(String wmsUpdSs) {
        regWmsUpdSs(CK_LE, fRES(wmsUpdSs));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSsList The collection of wmsUpdSs as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdSs_InScope(Collection<String> wmsUpdSsList) {
        doSetWmsUpdSs_InScope(wmsUpdSsList);
    }

    protected void doSetWmsUpdSs_InScope(Collection<String> wmsUpdSsList) {
        regINS(CK_INS, cTL(wmsUpdSsList), xgetCValueWmsUpdSs(), "WMS_UPD_SS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSsList The collection of wmsUpdSs as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdSs_NotInScope(Collection<String> wmsUpdSsList) {
        doSetWmsUpdSs_NotInScope(wmsUpdSsList);
    }

    protected void doSetWmsUpdSs_NotInScope(Collection<String> wmsUpdSsList) {
        regINS(CK_NINS, cTL(wmsUpdSsList), xgetCValueWmsUpdSs(), "WMS_UPD_SS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsUpdSs_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsUpdSs The value of wmsUpdSs as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsUpdSs_LikeSearch(String wmsUpdSs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsUpdSs), xgetCValueWmsUpdSs(), "WMS_UPD_SS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSs The value of wmsUpdSs as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsUpdSs_NotLikeSearch(String wmsUpdSs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsUpdSs), xgetCValueWmsUpdSs(), "WMS_UPD_SS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSs The value of wmsUpdSs as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdSs_PrefixSearch(String wmsUpdSs) {
        setWmsUpdSs_LikeSearch(wmsUpdSs, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     */
    public void setWmsUpdSs_IsNull() { regWmsUpdSs(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     */
    public void setWmsUpdSs_IsNullOrEmpty() { regWmsUpdSs(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     */
    public void setWmsUpdSs_IsNotNull() { regWmsUpdSs(CK_ISNN, DOBJ); }

    protected void regWmsUpdSs(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsUpdSs(), "WMS_UPD_SS"); }
    protected abstract ConditionValue xgetCValueWmsUpdSs();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCd The value of wmsUpdUserCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserCd_Equal(String wmsUpdUserCd) {
        doSetWmsUpdUserCd_Equal(fRES(wmsUpdUserCd));
    }

    protected void doSetWmsUpdUserCd_Equal(String wmsUpdUserCd) {
        regWmsUpdUserCd(CK_EQ, wmsUpdUserCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCd The value of wmsUpdUserCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserCd_NotEqual(String wmsUpdUserCd) {
        doSetWmsUpdUserCd_NotEqual(fRES(wmsUpdUserCd));
    }

    protected void doSetWmsUpdUserCd_NotEqual(String wmsUpdUserCd) {
        regWmsUpdUserCd(CK_NES, wmsUpdUserCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCd The value of wmsUpdUserCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserCd_GreaterThan(String wmsUpdUserCd) {
        regWmsUpdUserCd(CK_GT, fRES(wmsUpdUserCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCd The value of wmsUpdUserCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserCd_LessThan(String wmsUpdUserCd) {
        regWmsUpdUserCd(CK_LT, fRES(wmsUpdUserCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCd The value of wmsUpdUserCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserCd_GreaterEqual(String wmsUpdUserCd) {
        regWmsUpdUserCd(CK_GE, fRES(wmsUpdUserCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCd The value of wmsUpdUserCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserCd_LessEqual(String wmsUpdUserCd) {
        regWmsUpdUserCd(CK_LE, fRES(wmsUpdUserCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCdList The collection of wmsUpdUserCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserCd_InScope(Collection<String> wmsUpdUserCdList) {
        doSetWmsUpdUserCd_InScope(wmsUpdUserCdList);
    }

    protected void doSetWmsUpdUserCd_InScope(Collection<String> wmsUpdUserCdList) {
        regINS(CK_INS, cTL(wmsUpdUserCdList), xgetCValueWmsUpdUserCd(), "WMS_UPD_USER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCdList The collection of wmsUpdUserCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserCd_NotInScope(Collection<String> wmsUpdUserCdList) {
        doSetWmsUpdUserCd_NotInScope(wmsUpdUserCdList);
    }

    protected void doSetWmsUpdUserCd_NotInScope(Collection<String> wmsUpdUserCdList) {
        regINS(CK_NINS, cTL(wmsUpdUserCdList), xgetCValueWmsUpdUserCd(), "WMS_UPD_USER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsUpdUserCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsUpdUserCd The value of wmsUpdUserCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsUpdUserCd_LikeSearch(String wmsUpdUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsUpdUserCd), xgetCValueWmsUpdUserCd(), "WMS_UPD_USER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCd The value of wmsUpdUserCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsUpdUserCd_NotLikeSearch(String wmsUpdUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsUpdUserCd), xgetCValueWmsUpdUserCd(), "WMS_UPD_USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCd The value of wmsUpdUserCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserCd_PrefixSearch(String wmsUpdUserCd) {
        setWmsUpdUserCd_LikeSearch(wmsUpdUserCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     */
    public void setWmsUpdUserCd_IsNull() { regWmsUpdUserCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     */
    public void setWmsUpdUserCd_IsNullOrEmpty() { regWmsUpdUserCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     */
    public void setWmsUpdUserCd_IsNotNull() { regWmsUpdUserCd(CK_ISNN, DOBJ); }

    protected void regWmsUpdUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsUpdUserCd(), "WMS_UPD_USER_CD"); }
    protected abstract ConditionValue xgetCValueWmsUpdUserCd();

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
    public HpSLCFunction<EScmLabelCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EScmLabelCB.class);
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
    public HpSLCFunction<EScmLabelCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EScmLabelCB.class);
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
    public HpSLCFunction<EScmLabelCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EScmLabelCB.class);
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
    public HpSLCFunction<EScmLabelCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EScmLabelCB.class);
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
    public HpSLCFunction<EScmLabelCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EScmLabelCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EScmLabelCB&gt;() {
     *     public void query(EScmLabelCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EScmLabelCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EScmLabelCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EScmLabelCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EScmLabelCQ sq);

    protected EScmLabelCB xcreateScalarConditionCB() {
        EScmLabelCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EScmLabelCB xcreateScalarConditionPartitionByCB() {
        EScmLabelCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EScmLabelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EScmLabelCB cb = new EScmLabelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SCM_LABEL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EScmLabelCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EScmLabelCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EScmLabelCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EScmLabelCB cb = new EScmLabelCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SCM_LABEL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EScmLabelCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EScmLabelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EScmLabelCB cb = new EScmLabelCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EScmLabelCQ sq);

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
    protected EScmLabelCB newMyCB() {
        return new EScmLabelCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EScmLabelCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}