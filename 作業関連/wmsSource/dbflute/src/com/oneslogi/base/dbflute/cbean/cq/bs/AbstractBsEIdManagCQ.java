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
 * The abstract condition-query of e_id_manag.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEIdManagCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEIdManagCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "e_id_manag";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param idManagId The value of idManagId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIdManagId_Equal(Long idManagId) {
        doSetIdManagId_Equal(idManagId);
    }

    protected void doSetIdManagId_Equal(Long idManagId) {
        regIdManagId(CK_EQ, idManagId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param idManagId The value of idManagId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIdManagId_NotEqual(Long idManagId) {
        doSetIdManagId_NotEqual(idManagId);
    }

    protected void doSetIdManagId_NotEqual(Long idManagId) {
        regIdManagId(CK_NES, idManagId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param idManagId The value of idManagId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIdManagId_GreaterThan(Long idManagId) {
        regIdManagId(CK_GT, idManagId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param idManagId The value of idManagId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIdManagId_LessThan(Long idManagId) {
        regIdManagId(CK_LT, idManagId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param idManagId The value of idManagId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIdManagId_GreaterEqual(Long idManagId) {
        regIdManagId(CK_GE, idManagId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param idManagId The value of idManagId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIdManagId_LessEqual(Long idManagId) {
        regIdManagId(CK_LE, idManagId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of idManagId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of idManagId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setIdManagId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueIdManagId(), "ID_MANAG_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ID_MANAG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param idManagIdList The collection of idManagId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagId_InScope(Collection<Long> idManagIdList) {
        doSetIdManagId_InScope(idManagIdList);
    }

    protected void doSetIdManagId_InScope(Collection<Long> idManagIdList) {
        regINS(CK_INS, cTL(idManagIdList), xgetCValueIdManagId(), "ID_MANAG_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ID_MANAG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param idManagIdList The collection of idManagId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagId_NotInScope(Collection<Long> idManagIdList) {
        doSetIdManagId_NotInScope(idManagIdList);
    }

    protected void doSetIdManagId_NotInScope(Collection<Long> idManagIdList) {
        regINS(CK_NINS, cTL(idManagIdList), xgetCValueIdManagId(), "ID_MANAG_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ID_MANAG_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setIdManagId_IsNull() { regIdManagId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ID_MANAG_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setIdManagId_IsNotNull() { regIdManagId(CK_ISNN, DOBJ); }

    protected void regIdManagId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIdManagId(), "ID_MANAG_ID"); }
    protected abstract ConditionValue xgetCValueIdManagId();

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
     * ID_MANAG_NO: {VARCHAR(30)}
     * @param idManagNo The value of idManagNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagNo_Equal(String idManagNo) {
        doSetIdManagNo_Equal(fRES(idManagNo));
    }

    protected void doSetIdManagNo_Equal(String idManagNo) {
        regIdManagNo(CK_EQ, idManagNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_NO: {VARCHAR(30)}
     * @param idManagNo The value of idManagNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagNo_NotEqual(String idManagNo) {
        doSetIdManagNo_NotEqual(fRES(idManagNo));
    }

    protected void doSetIdManagNo_NotEqual(String idManagNo) {
        regIdManagNo(CK_NES, idManagNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_NO: {VARCHAR(30)}
     * @param idManagNo The value of idManagNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagNo_GreaterThan(String idManagNo) {
        regIdManagNo(CK_GT, fRES(idManagNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_NO: {VARCHAR(30)}
     * @param idManagNo The value of idManagNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagNo_LessThan(String idManagNo) {
        regIdManagNo(CK_LT, fRES(idManagNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_NO: {VARCHAR(30)}
     * @param idManagNo The value of idManagNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagNo_GreaterEqual(String idManagNo) {
        regIdManagNo(CK_GE, fRES(idManagNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_NO: {VARCHAR(30)}
     * @param idManagNo The value of idManagNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagNo_LessEqual(String idManagNo) {
        regIdManagNo(CK_LE, fRES(idManagNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ID_MANAG_NO: {VARCHAR(30)}
     * @param idManagNoList The collection of idManagNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagNo_InScope(Collection<String> idManagNoList) {
        doSetIdManagNo_InScope(idManagNoList);
    }

    protected void doSetIdManagNo_InScope(Collection<String> idManagNoList) {
        regINS(CK_INS, cTL(idManagNoList), xgetCValueIdManagNo(), "ID_MANAG_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ID_MANAG_NO: {VARCHAR(30)}
     * @param idManagNoList The collection of idManagNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagNo_NotInScope(Collection<String> idManagNoList) {
        doSetIdManagNo_NotInScope(idManagNoList);
    }

    protected void doSetIdManagNo_NotInScope(Collection<String> idManagNoList) {
        regINS(CK_NINS, cTL(idManagNoList), xgetCValueIdManagNo(), "ID_MANAG_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ID_MANAG_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setIdManagNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param idManagNo The value of idManagNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIdManagNo_LikeSearch(String idManagNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(idManagNo), xgetCValueIdManagNo(), "ID_MANAG_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ID_MANAG_NO: {VARCHAR(30)}
     * @param idManagNo The value of idManagNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIdManagNo_NotLikeSearch(String idManagNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(idManagNo), xgetCValueIdManagNo(), "ID_MANAG_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ID_MANAG_NO: {VARCHAR(30)}
     * @param idManagNo The value of idManagNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagNo_PrefixSearch(String idManagNo) {
        setIdManagNo_LikeSearch(idManagNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ID_MANAG_NO: {VARCHAR(30)}
     */
    public void setIdManagNo_IsNull() { regIdManagNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ID_MANAG_NO: {VARCHAR(30)}
     */
    public void setIdManagNo_IsNullOrEmpty() { regIdManagNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ID_MANAG_NO: {VARCHAR(30)}
     */
    public void setIdManagNo_IsNotNull() { regIdManagNo(CK_ISNN, DOBJ); }

    protected void regIdManagNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIdManagNo(), "ID_MANAG_NO"); }
    protected abstract ConditionValue xgetCValueIdManagNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_Equal(String tenhanshaCd) {
        doSetTenhanshaCd_Equal(fRES(tenhanshaCd));
    }

    protected void doSetTenhanshaCd_Equal(String tenhanshaCd) {
        regTenhanshaCd(CK_EQ, tenhanshaCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_NotEqual(String tenhanshaCd) {
        doSetTenhanshaCd_NotEqual(fRES(tenhanshaCd));
    }

    protected void doSetTenhanshaCd_NotEqual(String tenhanshaCd) {
        regTenhanshaCd(CK_NES, tenhanshaCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_GreaterThan(String tenhanshaCd) {
        regTenhanshaCd(CK_GT, fRES(tenhanshaCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_LessThan(String tenhanshaCd) {
        regTenhanshaCd(CK_LT, fRES(tenhanshaCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_GreaterEqual(String tenhanshaCd) {
        regTenhanshaCd(CK_GE, fRES(tenhanshaCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_LessEqual(String tenhanshaCd) {
        regTenhanshaCd(CK_LE, fRES(tenhanshaCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCdList The collection of tenhanshaCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_InScope(Collection<String> tenhanshaCdList) {
        doSetTenhanshaCd_InScope(tenhanshaCdList);
    }

    protected void doSetTenhanshaCd_InScope(Collection<String> tenhanshaCdList) {
        regINS(CK_INS, cTL(tenhanshaCdList), xgetCValueTenhanshaCd(), "TENHANSHA_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCdList The collection of tenhanshaCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_NotInScope(Collection<String> tenhanshaCdList) {
        doSetTenhanshaCd_NotInScope(tenhanshaCdList);
    }

    protected void doSetTenhanshaCd_NotInScope(Collection<String> tenhanshaCdList) {
        regINS(CK_NINS, cTL(tenhanshaCdList), xgetCValueTenhanshaCd(), "TENHANSHA_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setTenhanshaCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaCd The value of tenhanshaCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaCd_LikeSearch(String tenhanshaCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaCd), xgetCValueTenhanshaCd(), "TENHANSHA_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaCd_NotLikeSearch(String tenhanshaCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaCd), xgetCValueTenhanshaCd(), "TENHANSHA_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_PrefixSearch(String tenhanshaCd) {
        setTenhanshaCd_LikeSearch(tenhanshaCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     */
    public void setTenhanshaCd_IsNull() { regTenhanshaCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     */
    public void setTenhanshaCd_IsNullOrEmpty() { regTenhanshaCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     */
    public void setTenhanshaCd_IsNotNull() { regTenhanshaCd(CK_ISNN, DOBJ); }

    protected void regTenhanshaCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaCd(), "TENHANSHA_CD"); }
    protected abstract ConditionValue xgetCValueTenhanshaCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
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
     * SALES_ORG_CD: {VARCHAR(30)}
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
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_GreaterThan(String salesOrgCd) {
        regSalesOrgCd(CK_GT, fRES(salesOrgCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_LessThan(String salesOrgCd) {
        regSalesOrgCd(CK_LT, fRES(salesOrgCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_GreaterEqual(String salesOrgCd) {
        regSalesOrgCd(CK_GE, fRES(salesOrgCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_LessEqual(String salesOrgCd) {
        regSalesOrgCd(CK_LE, fRES(salesOrgCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
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
     * SALES_ORG_CD: {VARCHAR(30)}
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
     * SALES_ORG_CD: {VARCHAR(30)} <br>
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
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalesOrgCd_NotLikeSearch(String salesOrgCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salesOrgCd), xgetCValueSalesOrgCd(), "SALES_ORG_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_PrefixSearch(String salesOrgCd) {
        setSalesOrgCd_LikeSearch(salesOrgCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNull() { regSalesOrgCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNullOrEmpty() { regSalesOrgCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNotNull() { regSalesOrgCd(CK_ISNN, DOBJ); }

    protected void regSalesOrgCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrgCd(), "SALES_ORG_CD"); }
    protected abstract ConditionValue xgetCValueSalesOrgCd();

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
     * SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)}
     * @param sharedProductTypeCd The value of sharedProductTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSharedProductTypeCd_Equal(String sharedProductTypeCd) {
        doSetSharedProductTypeCd_Equal(fRES(sharedProductTypeCd));
    }

    protected void doSetSharedProductTypeCd_Equal(String sharedProductTypeCd) {
        regSharedProductTypeCd(CK_EQ, sharedProductTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)}
     * @param sharedProductTypeCd The value of sharedProductTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSharedProductTypeCd_NotEqual(String sharedProductTypeCd) {
        doSetSharedProductTypeCd_NotEqual(fRES(sharedProductTypeCd));
    }

    protected void doSetSharedProductTypeCd_NotEqual(String sharedProductTypeCd) {
        regSharedProductTypeCd(CK_NES, sharedProductTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)}
     * @param sharedProductTypeCd The value of sharedProductTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSharedProductTypeCd_GreaterThan(String sharedProductTypeCd) {
        regSharedProductTypeCd(CK_GT, fRES(sharedProductTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)}
     * @param sharedProductTypeCd The value of sharedProductTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSharedProductTypeCd_LessThan(String sharedProductTypeCd) {
        regSharedProductTypeCd(CK_LT, fRES(sharedProductTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)}
     * @param sharedProductTypeCd The value of sharedProductTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSharedProductTypeCd_GreaterEqual(String sharedProductTypeCd) {
        regSharedProductTypeCd(CK_GE, fRES(sharedProductTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)}
     * @param sharedProductTypeCd The value of sharedProductTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSharedProductTypeCd_LessEqual(String sharedProductTypeCd) {
        regSharedProductTypeCd(CK_LE, fRES(sharedProductTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)}
     * @param sharedProductTypeCdList The collection of sharedProductTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSharedProductTypeCd_InScope(Collection<String> sharedProductTypeCdList) {
        doSetSharedProductTypeCd_InScope(sharedProductTypeCdList);
    }

    protected void doSetSharedProductTypeCd_InScope(Collection<String> sharedProductTypeCdList) {
        regINS(CK_INS, cTL(sharedProductTypeCdList), xgetCValueSharedProductTypeCd(), "SHARED_PRODUCT_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)}
     * @param sharedProductTypeCdList The collection of sharedProductTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSharedProductTypeCd_NotInScope(Collection<String> sharedProductTypeCdList) {
        doSetSharedProductTypeCd_NotInScope(sharedProductTypeCdList);
    }

    protected void doSetSharedProductTypeCd_NotInScope(Collection<String> sharedProductTypeCdList) {
        regINS(CK_NINS, cTL(sharedProductTypeCdList), xgetCValueSharedProductTypeCd(), "SHARED_PRODUCT_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSharedProductTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sharedProductTypeCd The value of sharedProductTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSharedProductTypeCd_LikeSearch(String sharedProductTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sharedProductTypeCd), xgetCValueSharedProductTypeCd(), "SHARED_PRODUCT_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)}
     * @param sharedProductTypeCd The value of sharedProductTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSharedProductTypeCd_NotLikeSearch(String sharedProductTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sharedProductTypeCd), xgetCValueSharedProductTypeCd(), "SHARED_PRODUCT_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)}
     * @param sharedProductTypeCd The value of sharedProductTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSharedProductTypeCd_PrefixSearch(String sharedProductTypeCd) {
        setSharedProductTypeCd_LikeSearch(sharedProductTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)}
     */
    public void setSharedProductTypeCd_IsNull() { regSharedProductTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)}
     */
    public void setSharedProductTypeCd_IsNullOrEmpty() { regSharedProductTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)}
     */
    public void setSharedProductTypeCd_IsNotNull() { regSharedProductTypeCd(CK_ISNN, DOBJ); }

    protected void regSharedProductTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSharedProductTypeCd(), "SHARED_PRODUCT_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueSharedProductTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(30)}
     * @param customerOrderNo The value of customerOrderNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerOrderNo_Equal(String customerOrderNo) {
        doSetCustomerOrderNo_Equal(fRES(customerOrderNo));
    }

    protected void doSetCustomerOrderNo_Equal(String customerOrderNo) {
        regCustomerOrderNo(CK_EQ, customerOrderNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(30)}
     * @param customerOrderNo The value of customerOrderNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerOrderNo_NotEqual(String customerOrderNo) {
        doSetCustomerOrderNo_NotEqual(fRES(customerOrderNo));
    }

    protected void doSetCustomerOrderNo_NotEqual(String customerOrderNo) {
        regCustomerOrderNo(CK_NES, customerOrderNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(30)}
     * @param customerOrderNo The value of customerOrderNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerOrderNo_GreaterThan(String customerOrderNo) {
        regCustomerOrderNo(CK_GT, fRES(customerOrderNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(30)}
     * @param customerOrderNo The value of customerOrderNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerOrderNo_LessThan(String customerOrderNo) {
        regCustomerOrderNo(CK_LT, fRES(customerOrderNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(30)}
     * @param customerOrderNo The value of customerOrderNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerOrderNo_GreaterEqual(String customerOrderNo) {
        regCustomerOrderNo(CK_GE, fRES(customerOrderNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(30)}
     * @param customerOrderNo The value of customerOrderNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerOrderNo_LessEqual(String customerOrderNo) {
        regCustomerOrderNo(CK_LE, fRES(customerOrderNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(30)}
     * @param customerOrderNoList The collection of customerOrderNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerOrderNo_InScope(Collection<String> customerOrderNoList) {
        doSetCustomerOrderNo_InScope(customerOrderNoList);
    }

    protected void doSetCustomerOrderNo_InScope(Collection<String> customerOrderNoList) {
        regINS(CK_INS, cTL(customerOrderNoList), xgetCValueCustomerOrderNo(), "CUSTOMER_ORDER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(30)}
     * @param customerOrderNoList The collection of customerOrderNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerOrderNo_NotInScope(Collection<String> customerOrderNoList) {
        doSetCustomerOrderNo_NotInScope(customerOrderNoList);
    }

    protected void doSetCustomerOrderNo_NotInScope(Collection<String> customerOrderNoList) {
        regINS(CK_NINS, cTL(customerOrderNoList), xgetCValueCustomerOrderNo(), "CUSTOMER_ORDER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setCustomerOrderNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customerOrderNo The value of customerOrderNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomerOrderNo_LikeSearch(String customerOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customerOrderNo), xgetCValueCustomerOrderNo(), "CUSTOMER_ORDER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(30)}
     * @param customerOrderNo The value of customerOrderNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomerOrderNo_NotLikeSearch(String customerOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customerOrderNo), xgetCValueCustomerOrderNo(), "CUSTOMER_ORDER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(30)}
     * @param customerOrderNo The value of customerOrderNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerOrderNo_PrefixSearch(String customerOrderNo) {
        setCustomerOrderNo_LikeSearch(customerOrderNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(30)}
     */
    public void setCustomerOrderNo_IsNull() { regCustomerOrderNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(30)}
     */
    public void setCustomerOrderNo_IsNullOrEmpty() { regCustomerOrderNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(30)}
     */
    public void setCustomerOrderNo_IsNotNull() { regCustomerOrderNo(CK_ISNN, DOBJ); }

    protected void regCustomerOrderNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerOrderNo(), "CUSTOMER_ORDER_NO"); }
    protected abstract ConditionValue xgetCValueCustomerOrderNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_Equal(String delivCd) {
        doSetDelivCd_Equal(fRES(delivCd));
    }

    protected void doSetDelivCd_Equal(String delivCd) {
        regDelivCd(CK_EQ, delivCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_NotEqual(String delivCd) {
        doSetDelivCd_NotEqual(fRES(delivCd));
    }

    protected void doSetDelivCd_NotEqual(String delivCd) {
        regDelivCd(CK_NES, delivCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_GreaterThan(String delivCd) {
        regDelivCd(CK_GT, fRES(delivCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_LessThan(String delivCd) {
        regDelivCd(CK_LT, fRES(delivCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_GreaterEqual(String delivCd) {
        regDelivCd(CK_GE, fRES(delivCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_LessEqual(String delivCd) {
        regDelivCd(CK_LE, fRES(delivCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCdList The collection of delivCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_InScope(Collection<String> delivCdList) {
        doSetDelivCd_InScope(delivCdList);
    }

    protected void doSetDelivCd_InScope(Collection<String> delivCdList) {
        regINS(CK_INS, cTL(delivCdList), xgetCValueDelivCd(), "DELIV_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCdList The collection of delivCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_NotInScope(Collection<String> delivCdList) {
        doSetDelivCd_NotInScope(delivCdList);
    }

    protected void doSetDelivCd_NotInScope(Collection<String> delivCdList) {
        regINS(CK_NINS, cTL(delivCdList), xgetCValueDelivCd(), "DELIV_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDelivCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCd The value of delivCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCd_LikeSearch(String delivCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCd), xgetCValueDelivCd(), "DELIV_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCd_NotLikeSearch(String delivCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCd), xgetCValueDelivCd(), "DELIV_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_PrefixSearch(String delivCd) {
        setDelivCd_LikeSearch(delivCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     */
    public void setDelivCd_IsNull() { regDelivCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     */
    public void setDelivCd_IsNullOrEmpty() { regDelivCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     */
    public void setDelivCd_IsNotNull() { regDelivCd(CK_ISNN, DOBJ); }

    protected void regDelivCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCd(), "DELIV_CD"); }
    protected abstract ConditionValue xgetCValueDelivCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @param destinationZipCd The value of destinationZipCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_Equal(String destinationZipCd) {
        doSetDestinationZipCd_Equal(fRES(destinationZipCd));
    }

    protected void doSetDestinationZipCd_Equal(String destinationZipCd) {
        regDestinationZipCd(CK_EQ, destinationZipCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @param destinationZipCd The value of destinationZipCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_NotEqual(String destinationZipCd) {
        doSetDestinationZipCd_NotEqual(fRES(destinationZipCd));
    }

    protected void doSetDestinationZipCd_NotEqual(String destinationZipCd) {
        regDestinationZipCd(CK_NES, destinationZipCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @param destinationZipCd The value of destinationZipCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_GreaterThan(String destinationZipCd) {
        regDestinationZipCd(CK_GT, fRES(destinationZipCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @param destinationZipCd The value of destinationZipCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_LessThan(String destinationZipCd) {
        regDestinationZipCd(CK_LT, fRES(destinationZipCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @param destinationZipCd The value of destinationZipCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_GreaterEqual(String destinationZipCd) {
        regDestinationZipCd(CK_GE, fRES(destinationZipCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @param destinationZipCd The value of destinationZipCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_LessEqual(String destinationZipCd) {
        regDestinationZipCd(CK_LE, fRES(destinationZipCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @param destinationZipCdList The collection of destinationZipCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_InScope(Collection<String> destinationZipCdList) {
        doSetDestinationZipCd_InScope(destinationZipCdList);
    }

    protected void doSetDestinationZipCd_InScope(Collection<String> destinationZipCdList) {
        regINS(CK_INS, cTL(destinationZipCdList), xgetCValueDestinationZipCd(), "DESTINATION_ZIP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @param destinationZipCdList The collection of destinationZipCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_NotInScope(Collection<String> destinationZipCdList) {
        doSetDestinationZipCd_NotInScope(destinationZipCdList);
    }

    protected void doSetDestinationZipCd_NotInScope(Collection<String> destinationZipCdList) {
        regINS(CK_NINS, cTL(destinationZipCdList), xgetCValueDestinationZipCd(), "DESTINATION_ZIP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDestinationZipCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationZipCd The value of destinationZipCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationZipCd_LikeSearch(String destinationZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationZipCd), xgetCValueDestinationZipCd(), "DESTINATION_ZIP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @param destinationZipCd The value of destinationZipCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationZipCd_NotLikeSearch(String destinationZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationZipCd), xgetCValueDestinationZipCd(), "DESTINATION_ZIP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @param destinationZipCd The value of destinationZipCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_PrefixSearch(String destinationZipCd) {
        setDestinationZipCd_LikeSearch(destinationZipCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     */
    public void setDestinationZipCd_IsNull() { regDestinationZipCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     */
    public void setDestinationZipCd_IsNullOrEmpty() { regDestinationZipCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     */
    public void setDestinationZipCd_IsNotNull() { regDestinationZipCd(CK_ISNN, DOBJ); }

    protected void regDestinationZipCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationZipCd(), "DESTINATION_ZIP_CD"); }
    protected abstract ConditionValue xgetCValueDestinationZipCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1 The value of destinationAddress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_Equal(String destinationAddress1) {
        doSetDestinationAddress1_Equal(fRES(destinationAddress1));
    }

    protected void doSetDestinationAddress1_Equal(String destinationAddress1) {
        regDestinationAddress1(CK_EQ, destinationAddress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1 The value of destinationAddress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_NotEqual(String destinationAddress1) {
        doSetDestinationAddress1_NotEqual(fRES(destinationAddress1));
    }

    protected void doSetDestinationAddress1_NotEqual(String destinationAddress1) {
        regDestinationAddress1(CK_NES, destinationAddress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1 The value of destinationAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_GreaterThan(String destinationAddress1) {
        regDestinationAddress1(CK_GT, fRES(destinationAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1 The value of destinationAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_LessThan(String destinationAddress1) {
        regDestinationAddress1(CK_LT, fRES(destinationAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1 The value of destinationAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_GreaterEqual(String destinationAddress1) {
        regDestinationAddress1(CK_GE, fRES(destinationAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1 The value of destinationAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_LessEqual(String destinationAddress1) {
        regDestinationAddress1(CK_LE, fRES(destinationAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1List The collection of destinationAddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_InScope(Collection<String> destinationAddress1List) {
        doSetDestinationAddress1_InScope(destinationAddress1List);
    }

    protected void doSetDestinationAddress1_InScope(Collection<String> destinationAddress1List) {
        regINS(CK_INS, cTL(destinationAddress1List), xgetCValueDestinationAddress1(), "DESTINATION_ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1List The collection of destinationAddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_NotInScope(Collection<String> destinationAddress1List) {
        doSetDestinationAddress1_NotInScope(destinationAddress1List);
    }

    protected void doSetDestinationAddress1_NotInScope(Collection<String> destinationAddress1List) {
        regINS(CK_NINS, cTL(destinationAddress1List), xgetCValueDestinationAddress1(), "DESTINATION_ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)} <br>
     * <pre>e.g. setDestinationAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationAddress1 The value of destinationAddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationAddress1_LikeSearch(String destinationAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationAddress1), xgetCValueDestinationAddress1(), "DESTINATION_ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1 The value of destinationAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationAddress1_NotLikeSearch(String destinationAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationAddress1), xgetCValueDestinationAddress1(), "DESTINATION_ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1 The value of destinationAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_PrefixSearch(String destinationAddress1) {
        setDestinationAddress1_LikeSearch(destinationAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     */
    public void setDestinationAddress1_IsNull() { regDestinationAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     */
    public void setDestinationAddress1_IsNullOrEmpty() { regDestinationAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     */
    public void setDestinationAddress1_IsNotNull() { regDestinationAddress1(CK_ISNN, DOBJ); }

    protected void regDestinationAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationAddress1(), "DESTINATION_ADDRESS1"); }
    protected abstract ConditionValue xgetCValueDestinationAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2 The value of destinationAddress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_Equal(String destinationAddress2) {
        doSetDestinationAddress2_Equal(fRES(destinationAddress2));
    }

    protected void doSetDestinationAddress2_Equal(String destinationAddress2) {
        regDestinationAddress2(CK_EQ, destinationAddress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2 The value of destinationAddress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_NotEqual(String destinationAddress2) {
        doSetDestinationAddress2_NotEqual(fRES(destinationAddress2));
    }

    protected void doSetDestinationAddress2_NotEqual(String destinationAddress2) {
        regDestinationAddress2(CK_NES, destinationAddress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2 The value of destinationAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_GreaterThan(String destinationAddress2) {
        regDestinationAddress2(CK_GT, fRES(destinationAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2 The value of destinationAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_LessThan(String destinationAddress2) {
        regDestinationAddress2(CK_LT, fRES(destinationAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2 The value of destinationAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_GreaterEqual(String destinationAddress2) {
        regDestinationAddress2(CK_GE, fRES(destinationAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2 The value of destinationAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_LessEqual(String destinationAddress2) {
        regDestinationAddress2(CK_LE, fRES(destinationAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2List The collection of destinationAddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_InScope(Collection<String> destinationAddress2List) {
        doSetDestinationAddress2_InScope(destinationAddress2List);
    }

    protected void doSetDestinationAddress2_InScope(Collection<String> destinationAddress2List) {
        regINS(CK_INS, cTL(destinationAddress2List), xgetCValueDestinationAddress2(), "DESTINATION_ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2List The collection of destinationAddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_NotInScope(Collection<String> destinationAddress2List) {
        doSetDestinationAddress2_NotInScope(destinationAddress2List);
    }

    protected void doSetDestinationAddress2_NotInScope(Collection<String> destinationAddress2List) {
        regINS(CK_NINS, cTL(destinationAddress2List), xgetCValueDestinationAddress2(), "DESTINATION_ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)} <br>
     * <pre>e.g. setDestinationAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationAddress2 The value of destinationAddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationAddress2_LikeSearch(String destinationAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationAddress2), xgetCValueDestinationAddress2(), "DESTINATION_ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2 The value of destinationAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationAddress2_NotLikeSearch(String destinationAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationAddress2), xgetCValueDestinationAddress2(), "DESTINATION_ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2 The value of destinationAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_PrefixSearch(String destinationAddress2) {
        setDestinationAddress2_LikeSearch(destinationAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     */
    public void setDestinationAddress2_IsNull() { regDestinationAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     */
    public void setDestinationAddress2_IsNullOrEmpty() { regDestinationAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     */
    public void setDestinationAddress2_IsNotNull() { regDestinationAddress2(CK_ISNN, DOBJ); }

    protected void regDestinationAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationAddress2(), "DESTINATION_ADDRESS2"); }
    protected abstract ConditionValue xgetCValueDestinationAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_Equal(String destinationNm1) {
        doSetDestinationNm1_Equal(fRES(destinationNm1));
    }

    protected void doSetDestinationNm1_Equal(String destinationNm1) {
        regDestinationNm1(CK_EQ, destinationNm1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_NotEqual(String destinationNm1) {
        doSetDestinationNm1_NotEqual(fRES(destinationNm1));
    }

    protected void doSetDestinationNm1_NotEqual(String destinationNm1) {
        regDestinationNm1(CK_NES, destinationNm1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_GreaterThan(String destinationNm1) {
        regDestinationNm1(CK_GT, fRES(destinationNm1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_LessThan(String destinationNm1) {
        regDestinationNm1(CK_LT, fRES(destinationNm1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_GreaterEqual(String destinationNm1) {
        regDestinationNm1(CK_GE, fRES(destinationNm1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_LessEqual(String destinationNm1) {
        regDestinationNm1(CK_LE, fRES(destinationNm1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1List The collection of destinationNm1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_InScope(Collection<String> destinationNm1List) {
        doSetDestinationNm1_InScope(destinationNm1List);
    }

    protected void doSetDestinationNm1_InScope(Collection<String> destinationNm1List) {
        regINS(CK_INS, cTL(destinationNm1List), xgetCValueDestinationNm1(), "DESTINATION_NM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1List The collection of destinationNm1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_NotInScope(Collection<String> destinationNm1List) {
        doSetDestinationNm1_NotInScope(destinationNm1List);
    }

    protected void doSetDestinationNm1_NotInScope(Collection<String> destinationNm1List) {
        regINS(CK_NINS, cTL(destinationNm1List), xgetCValueDestinationNm1(), "DESTINATION_NM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)} <br>
     * <pre>e.g. setDestinationNm1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationNm1 The value of destinationNm1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationNm1_LikeSearch(String destinationNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationNm1), xgetCValueDestinationNm1(), "DESTINATION_NM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationNm1_NotLikeSearch(String destinationNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationNm1), xgetCValueDestinationNm1(), "DESTINATION_NM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_PrefixSearch(String destinationNm1) {
        setDestinationNm1_LikeSearch(destinationNm1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     */
    public void setDestinationNm1_IsNull() { regDestinationNm1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     */
    public void setDestinationNm1_IsNullOrEmpty() { regDestinationNm1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     */
    public void setDestinationNm1_IsNotNull() { regDestinationNm1(CK_ISNN, DOBJ); }

    protected void regDestinationNm1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationNm1(), "DESTINATION_NM1"); }
    protected abstract ConditionValue xgetCValueDestinationNm1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_Equal(String destinationNm2) {
        doSetDestinationNm2_Equal(fRES(destinationNm2));
    }

    protected void doSetDestinationNm2_Equal(String destinationNm2) {
        regDestinationNm2(CK_EQ, destinationNm2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_NotEqual(String destinationNm2) {
        doSetDestinationNm2_NotEqual(fRES(destinationNm2));
    }

    protected void doSetDestinationNm2_NotEqual(String destinationNm2) {
        regDestinationNm2(CK_NES, destinationNm2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_GreaterThan(String destinationNm2) {
        regDestinationNm2(CK_GT, fRES(destinationNm2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_LessThan(String destinationNm2) {
        regDestinationNm2(CK_LT, fRES(destinationNm2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_GreaterEqual(String destinationNm2) {
        regDestinationNm2(CK_GE, fRES(destinationNm2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_LessEqual(String destinationNm2) {
        regDestinationNm2(CK_LE, fRES(destinationNm2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2List The collection of destinationNm2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_InScope(Collection<String> destinationNm2List) {
        doSetDestinationNm2_InScope(destinationNm2List);
    }

    protected void doSetDestinationNm2_InScope(Collection<String> destinationNm2List) {
        regINS(CK_INS, cTL(destinationNm2List), xgetCValueDestinationNm2(), "DESTINATION_NM2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2List The collection of destinationNm2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_NotInScope(Collection<String> destinationNm2List) {
        doSetDestinationNm2_NotInScope(destinationNm2List);
    }

    protected void doSetDestinationNm2_NotInScope(Collection<String> destinationNm2List) {
        regINS(CK_NINS, cTL(destinationNm2List), xgetCValueDestinationNm2(), "DESTINATION_NM2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)} <br>
     * <pre>e.g. setDestinationNm2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationNm2 The value of destinationNm2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationNm2_LikeSearch(String destinationNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationNm2), xgetCValueDestinationNm2(), "DESTINATION_NM2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationNm2_NotLikeSearch(String destinationNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationNm2), xgetCValueDestinationNm2(), "DESTINATION_NM2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_PrefixSearch(String destinationNm2) {
        setDestinationNm2_LikeSearch(destinationNm2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     */
    public void setDestinationNm2_IsNull() { regDestinationNm2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     */
    public void setDestinationNm2_IsNullOrEmpty() { regDestinationNm2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     */
    public void setDestinationNm2_IsNotNull() { regDestinationNm2(CK_ISNN, DOBJ); }

    protected void regDestinationNm2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationNm2(), "DESTINATION_NM2"); }
    protected abstract ConditionValue xgetCValueDestinationNm2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTel The value of destinationTel as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationTel_Equal(String destinationTel) {
        doSetDestinationTel_Equal(fRES(destinationTel));
    }

    protected void doSetDestinationTel_Equal(String destinationTel) {
        regDestinationTel(CK_EQ, destinationTel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTel The value of destinationTel as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationTel_NotEqual(String destinationTel) {
        doSetDestinationTel_NotEqual(fRES(destinationTel));
    }

    protected void doSetDestinationTel_NotEqual(String destinationTel) {
        regDestinationTel(CK_NES, destinationTel);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTel The value of destinationTel as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationTel_GreaterThan(String destinationTel) {
        regDestinationTel(CK_GT, fRES(destinationTel));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTel The value of destinationTel as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationTel_LessThan(String destinationTel) {
        regDestinationTel(CK_LT, fRES(destinationTel));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTel The value of destinationTel as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationTel_GreaterEqual(String destinationTel) {
        regDestinationTel(CK_GE, fRES(destinationTel));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTel The value of destinationTel as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationTel_LessEqual(String destinationTel) {
        regDestinationTel(CK_LE, fRES(destinationTel));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTelList The collection of destinationTel as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationTel_InScope(Collection<String> destinationTelList) {
        doSetDestinationTel_InScope(destinationTelList);
    }

    protected void doSetDestinationTel_InScope(Collection<String> destinationTelList) {
        regINS(CK_INS, cTL(destinationTelList), xgetCValueDestinationTel(), "DESTINATION_TEL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTelList The collection of destinationTel as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationTel_NotInScope(Collection<String> destinationTelList) {
        doSetDestinationTel_NotInScope(destinationTelList);
    }

    protected void doSetDestinationTel_NotInScope(Collection<String> destinationTelList) {
        regINS(CK_NINS, cTL(destinationTelList), xgetCValueDestinationTel(), "DESTINATION_TEL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)} <br>
     * <pre>e.g. setDestinationTel_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationTel The value of destinationTel as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationTel_LikeSearch(String destinationTel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationTel), xgetCValueDestinationTel(), "DESTINATION_TEL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTel The value of destinationTel as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationTel_NotLikeSearch(String destinationTel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationTel), xgetCValueDestinationTel(), "DESTINATION_TEL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTel The value of destinationTel as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationTel_PrefixSearch(String destinationTel) {
        setDestinationTel_LikeSearch(destinationTel, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     */
    public void setDestinationTel_IsNull() { regDestinationTel(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     */
    public void setDestinationTel_IsNullOrEmpty() { regDestinationTel(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     */
    public void setDestinationTel_IsNotNull() { regDestinationTel(CK_ISNN, DOBJ); }

    protected void regDestinationTel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationTel(), "DESTINATION_TEL"); }
    protected abstract ConditionValue xgetCValueDestinationTel();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_Equal(String empIdCd) {
        doSetEmpIdCd_Equal(fRES(empIdCd));
    }

    protected void doSetEmpIdCd_Equal(String empIdCd) {
        regEmpIdCd(CK_EQ, empIdCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_NotEqual(String empIdCd) {
        doSetEmpIdCd_NotEqual(fRES(empIdCd));
    }

    protected void doSetEmpIdCd_NotEqual(String empIdCd) {
        regEmpIdCd(CK_NES, empIdCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_GreaterThan(String empIdCd) {
        regEmpIdCd(CK_GT, fRES(empIdCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_LessThan(String empIdCd) {
        regEmpIdCd(CK_LT, fRES(empIdCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_GreaterEqual(String empIdCd) {
        regEmpIdCd(CK_GE, fRES(empIdCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_LessEqual(String empIdCd) {
        regEmpIdCd(CK_LE, fRES(empIdCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCdList The collection of empIdCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_InScope(Collection<String> empIdCdList) {
        doSetEmpIdCd_InScope(empIdCdList);
    }

    protected void doSetEmpIdCd_InScope(Collection<String> empIdCdList) {
        regINS(CK_INS, cTL(empIdCdList), xgetCValueEmpIdCd(), "EMP_ID_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCdList The collection of empIdCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_NotInScope(Collection<String> empIdCdList) {
        doSetEmpIdCd_NotInScope(empIdCdList);
    }

    protected void doSetEmpIdCd_NotInScope(Collection<String> empIdCdList) {
        regINS(CK_NINS, cTL(empIdCdList), xgetCValueEmpIdCd(), "EMP_ID_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setEmpIdCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param empIdCd The value of empIdCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEmpIdCd_LikeSearch(String empIdCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(empIdCd), xgetCValueEmpIdCd(), "EMP_ID_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEmpIdCd_NotLikeSearch(String empIdCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(empIdCd), xgetCValueEmpIdCd(), "EMP_ID_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_PrefixSearch(String empIdCd) {
        setEmpIdCd_LikeSearch(empIdCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     */
    public void setEmpIdCd_IsNull() { regEmpIdCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     */
    public void setEmpIdCd_IsNullOrEmpty() { regEmpIdCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     */
    public void setEmpIdCd_IsNotNull() { regEmpIdCd(CK_ISNN, DOBJ); }

    protected void regEmpIdCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmpIdCd(), "EMP_ID_CD"); }
    protected abstract ConditionValue xgetCValueEmpIdCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_Equal(String empNm) {
        doSetEmpNm_Equal(fRES(empNm));
    }

    protected void doSetEmpNm_Equal(String empNm) {
        regEmpNm(CK_EQ, empNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_NotEqual(String empNm) {
        doSetEmpNm_NotEqual(fRES(empNm));
    }

    protected void doSetEmpNm_NotEqual(String empNm) {
        regEmpNm(CK_NES, empNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_GreaterThan(String empNm) {
        regEmpNm(CK_GT, fRES(empNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_LessThan(String empNm) {
        regEmpNm(CK_LT, fRES(empNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_GreaterEqual(String empNm) {
        regEmpNm(CK_GE, fRES(empNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_LessEqual(String empNm) {
        regEmpNm(CK_LE, fRES(empNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNmList The collection of empNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_InScope(Collection<String> empNmList) {
        doSetEmpNm_InScope(empNmList);
    }

    protected void doSetEmpNm_InScope(Collection<String> empNmList) {
        regINS(CK_INS, cTL(empNmList), xgetCValueEmpNm(), "EMP_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNmList The collection of empNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_NotInScope(Collection<String> empNmList) {
        doSetEmpNm_NotInScope(empNmList);
    }

    protected void doSetEmpNm_NotInScope(Collection<String> empNmList) {
        regINS(CK_NINS, cTL(empNmList), xgetCValueEmpNm(), "EMP_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMP_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setEmpNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param empNm The value of empNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEmpNm_LikeSearch(String empNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(empNm), xgetCValueEmpNm(), "EMP_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEmpNm_NotLikeSearch(String empNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(empNm), xgetCValueEmpNm(), "EMP_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_PrefixSearch(String empNm) {
        setEmpNm_LikeSearch(empNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     */
    public void setEmpNm_IsNull() { regEmpNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     */
    public void setEmpNm_IsNullOrEmpty() { regEmpNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     */
    public void setEmpNm_IsNotNull() { regEmpNm(CK_ISNN, DOBJ); }

    protected void regEmpNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmpNm(), "EMP_NM"); }
    protected abstract ConditionValue xgetCValueEmpNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(30)}
     * @param storeDt The value of storeDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_Equal(String storeDt) {
        doSetStoreDt_Equal(fRES(storeDt));
    }

    protected void doSetStoreDt_Equal(String storeDt) {
        regStoreDt(CK_EQ, storeDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(30)}
     * @param storeDt The value of storeDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_NotEqual(String storeDt) {
        doSetStoreDt_NotEqual(fRES(storeDt));
    }

    protected void doSetStoreDt_NotEqual(String storeDt) {
        regStoreDt(CK_NES, storeDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(30)}
     * @param storeDt The value of storeDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_GreaterThan(String storeDt) {
        regStoreDt(CK_GT, fRES(storeDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(30)}
     * @param storeDt The value of storeDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_LessThan(String storeDt) {
        regStoreDt(CK_LT, fRES(storeDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(30)}
     * @param storeDt The value of storeDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_GreaterEqual(String storeDt) {
        regStoreDt(CK_GE, fRES(storeDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(30)}
     * @param storeDt The value of storeDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_LessEqual(String storeDt) {
        regStoreDt(CK_LE, fRES(storeDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_DT: {VARCHAR(30)}
     * @param storeDtList The collection of storeDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_InScope(Collection<String> storeDtList) {
        doSetStoreDt_InScope(storeDtList);
    }

    protected void doSetStoreDt_InScope(Collection<String> storeDtList) {
        regINS(CK_INS, cTL(storeDtList), xgetCValueStoreDt(), "STORE_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_DT: {VARCHAR(30)}
     * @param storeDtList The collection of storeDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_NotInScope(Collection<String> storeDtList) {
        doSetStoreDt_NotInScope(storeDtList);
    }

    protected void doSetStoreDt_NotInScope(Collection<String> storeDtList) {
        regINS(CK_NINS, cTL(storeDtList), xgetCValueStoreDt(), "STORE_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_DT: {VARCHAR(30)} <br>
     * <pre>e.g. setStoreDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeDt The value of storeDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStoreDt_LikeSearch(String storeDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeDt), xgetCValueStoreDt(), "STORE_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_DT: {VARCHAR(30)}
     * @param storeDt The value of storeDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreDt_NotLikeSearch(String storeDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeDt), xgetCValueStoreDt(), "STORE_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_DT: {VARCHAR(30)}
     * @param storeDt The value of storeDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_PrefixSearch(String storeDt) {
        setStoreDt_LikeSearch(storeDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(30)}
     */
    public void setStoreDt_IsNull() { regStoreDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(30)}
     */
    public void setStoreDt_IsNullOrEmpty() { regStoreDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(30)}
     */
    public void setStoreDt_IsNotNull() { regStoreDt(CK_ISNN, DOBJ); }

    protected void regStoreDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreDt(), "STORE_DT"); }
    protected abstract ConditionValue xgetCValueStoreDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {VARCHAR(30)}
     * @param inventoryDt The value of inventoryDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_Equal(String inventoryDt) {
        doSetInventoryDt_Equal(fRES(inventoryDt));
    }

    protected void doSetInventoryDt_Equal(String inventoryDt) {
        regInventoryDt(CK_EQ, inventoryDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {VARCHAR(30)}
     * @param inventoryDt The value of inventoryDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_NotEqual(String inventoryDt) {
        doSetInventoryDt_NotEqual(fRES(inventoryDt));
    }

    protected void doSetInventoryDt_NotEqual(String inventoryDt) {
        regInventoryDt(CK_NES, inventoryDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {VARCHAR(30)}
     * @param inventoryDt The value of inventoryDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_GreaterThan(String inventoryDt) {
        regInventoryDt(CK_GT, fRES(inventoryDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {VARCHAR(30)}
     * @param inventoryDt The value of inventoryDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_LessThan(String inventoryDt) {
        regInventoryDt(CK_LT, fRES(inventoryDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {VARCHAR(30)}
     * @param inventoryDt The value of inventoryDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_GreaterEqual(String inventoryDt) {
        regInventoryDt(CK_GE, fRES(inventoryDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {VARCHAR(30)}
     * @param inventoryDt The value of inventoryDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_LessEqual(String inventoryDt) {
        regInventoryDt(CK_LE, fRES(inventoryDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_DT: {VARCHAR(30)}
     * @param inventoryDtList The collection of inventoryDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_InScope(Collection<String> inventoryDtList) {
        doSetInventoryDt_InScope(inventoryDtList);
    }

    protected void doSetInventoryDt_InScope(Collection<String> inventoryDtList) {
        regINS(CK_INS, cTL(inventoryDtList), xgetCValueInventoryDt(), "INVENTORY_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_DT: {VARCHAR(30)}
     * @param inventoryDtList The collection of inventoryDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_NotInScope(Collection<String> inventoryDtList) {
        doSetInventoryDt_NotInScope(inventoryDtList);
    }

    protected void doSetInventoryDt_NotInScope(Collection<String> inventoryDtList) {
        regINS(CK_NINS, cTL(inventoryDtList), xgetCValueInventoryDt(), "INVENTORY_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DT: {VARCHAR(30)} <br>
     * <pre>e.g. setInventoryDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventoryDt The value of inventoryDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventoryDt_LikeSearch(String inventoryDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventoryDt), xgetCValueInventoryDt(), "INVENTORY_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DT: {VARCHAR(30)}
     * @param inventoryDt The value of inventoryDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventoryDt_NotLikeSearch(String inventoryDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventoryDt), xgetCValueInventoryDt(), "INVENTORY_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DT: {VARCHAR(30)}
     * @param inventoryDt The value of inventoryDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_PrefixSearch(String inventoryDt) {
        setInventoryDt_LikeSearch(inventoryDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_DT: {VARCHAR(30)}
     */
    public void setInventoryDt_IsNull() { regInventoryDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVENTORY_DT: {VARCHAR(30)}
     */
    public void setInventoryDt_IsNullOrEmpty() { regInventoryDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_DT: {VARCHAR(30)}
     */
    public void setInventoryDt_IsNotNull() { regInventoryDt(CK_ISNN, DOBJ); }

    protected void regInventoryDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryDt(), "INVENTORY_DT"); }
    protected abstract ConditionValue xgetCValueInventoryDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_DT: {VARCHAR(30)}
     * @param pickingDt The value of pickingDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingDt_Equal(String pickingDt) {
        doSetPickingDt_Equal(fRES(pickingDt));
    }

    protected void doSetPickingDt_Equal(String pickingDt) {
        regPickingDt(CK_EQ, pickingDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_DT: {VARCHAR(30)}
     * @param pickingDt The value of pickingDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingDt_NotEqual(String pickingDt) {
        doSetPickingDt_NotEqual(fRES(pickingDt));
    }

    protected void doSetPickingDt_NotEqual(String pickingDt) {
        regPickingDt(CK_NES, pickingDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_DT: {VARCHAR(30)}
     * @param pickingDt The value of pickingDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingDt_GreaterThan(String pickingDt) {
        regPickingDt(CK_GT, fRES(pickingDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_DT: {VARCHAR(30)}
     * @param pickingDt The value of pickingDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingDt_LessThan(String pickingDt) {
        regPickingDt(CK_LT, fRES(pickingDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_DT: {VARCHAR(30)}
     * @param pickingDt The value of pickingDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingDt_GreaterEqual(String pickingDt) {
        regPickingDt(CK_GE, fRES(pickingDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_DT: {VARCHAR(30)}
     * @param pickingDt The value of pickingDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingDt_LessEqual(String pickingDt) {
        regPickingDt(CK_LE, fRES(pickingDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_DT: {VARCHAR(30)}
     * @param pickingDtList The collection of pickingDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingDt_InScope(Collection<String> pickingDtList) {
        doSetPickingDt_InScope(pickingDtList);
    }

    protected void doSetPickingDt_InScope(Collection<String> pickingDtList) {
        regINS(CK_INS, cTL(pickingDtList), xgetCValuePickingDt(), "PICKING_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_DT: {VARCHAR(30)}
     * @param pickingDtList The collection of pickingDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingDt_NotInScope(Collection<String> pickingDtList) {
        doSetPickingDt_NotInScope(pickingDtList);
    }

    protected void doSetPickingDt_NotInScope(Collection<String> pickingDtList) {
        regINS(CK_NINS, cTL(pickingDtList), xgetCValuePickingDt(), "PICKING_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_DT: {VARCHAR(30)} <br>
     * <pre>e.g. setPickingDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingDt The value of pickingDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingDt_LikeSearch(String pickingDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingDt), xgetCValuePickingDt(), "PICKING_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_DT: {VARCHAR(30)}
     * @param pickingDt The value of pickingDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingDt_NotLikeSearch(String pickingDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingDt), xgetCValuePickingDt(), "PICKING_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_DT: {VARCHAR(30)}
     * @param pickingDt The value of pickingDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingDt_PrefixSearch(String pickingDt) {
        setPickingDt_LikeSearch(pickingDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_DT: {VARCHAR(30)}
     */
    public void setPickingDt_IsNull() { regPickingDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_DT: {VARCHAR(30)}
     */
    public void setPickingDt_IsNullOrEmpty() { regPickingDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_DT: {VARCHAR(30)}
     */
    public void setPickingDt_IsNotNull() { regPickingDt(CK_ISNN, DOBJ); }

    protected void regPickingDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingDt(), "PICKING_DT"); }
    protected abstract ConditionValue xgetCValuePickingDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(30)}
     * @param productReturnDt The value of productReturnDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductReturnDt_Equal(String productReturnDt) {
        doSetProductReturnDt_Equal(fRES(productReturnDt));
    }

    protected void doSetProductReturnDt_Equal(String productReturnDt) {
        regProductReturnDt(CK_EQ, productReturnDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(30)}
     * @param productReturnDt The value of productReturnDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductReturnDt_NotEqual(String productReturnDt) {
        doSetProductReturnDt_NotEqual(fRES(productReturnDt));
    }

    protected void doSetProductReturnDt_NotEqual(String productReturnDt) {
        regProductReturnDt(CK_NES, productReturnDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(30)}
     * @param productReturnDt The value of productReturnDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductReturnDt_GreaterThan(String productReturnDt) {
        regProductReturnDt(CK_GT, fRES(productReturnDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(30)}
     * @param productReturnDt The value of productReturnDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductReturnDt_LessThan(String productReturnDt) {
        regProductReturnDt(CK_LT, fRES(productReturnDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(30)}
     * @param productReturnDt The value of productReturnDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductReturnDt_GreaterEqual(String productReturnDt) {
        regProductReturnDt(CK_GE, fRES(productReturnDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(30)}
     * @param productReturnDt The value of productReturnDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductReturnDt_LessEqual(String productReturnDt) {
        regProductReturnDt(CK_LE, fRES(productReturnDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(30)}
     * @param productReturnDtList The collection of productReturnDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductReturnDt_InScope(Collection<String> productReturnDtList) {
        doSetProductReturnDt_InScope(productReturnDtList);
    }

    protected void doSetProductReturnDt_InScope(Collection<String> productReturnDtList) {
        regINS(CK_INS, cTL(productReturnDtList), xgetCValueProductReturnDt(), "PRODUCT_RETURN_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(30)}
     * @param productReturnDtList The collection of productReturnDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductReturnDt_NotInScope(Collection<String> productReturnDtList) {
        doSetProductReturnDt_NotInScope(productReturnDtList);
    }

    protected void doSetProductReturnDt_NotInScope(Collection<String> productReturnDtList) {
        regINS(CK_NINS, cTL(productReturnDtList), xgetCValueProductReturnDt(), "PRODUCT_RETURN_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(30)} <br>
     * <pre>e.g. setProductReturnDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productReturnDt The value of productReturnDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductReturnDt_LikeSearch(String productReturnDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productReturnDt), xgetCValueProductReturnDt(), "PRODUCT_RETURN_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(30)}
     * @param productReturnDt The value of productReturnDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductReturnDt_NotLikeSearch(String productReturnDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productReturnDt), xgetCValueProductReturnDt(), "PRODUCT_RETURN_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(30)}
     * @param productReturnDt The value of productReturnDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductReturnDt_PrefixSearch(String productReturnDt) {
        setProductReturnDt_LikeSearch(productReturnDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(30)}
     */
    public void setProductReturnDt_IsNull() { regProductReturnDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(30)}
     */
    public void setProductReturnDt_IsNullOrEmpty() { regProductReturnDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(30)}
     */
    public void setProductReturnDt_IsNotNull() { regProductReturnDt(CK_ISNN, DOBJ); }

    protected void regProductReturnDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductReturnDt(), "PRODUCT_RETURN_DT"); }
    protected abstract ConditionValue xgetCValueProductReturnDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(30)}
     * @param wasteReturnDt The value of wasteReturnDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWasteReturnDt_Equal(String wasteReturnDt) {
        doSetWasteReturnDt_Equal(fRES(wasteReturnDt));
    }

    protected void doSetWasteReturnDt_Equal(String wasteReturnDt) {
        regWasteReturnDt(CK_EQ, wasteReturnDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(30)}
     * @param wasteReturnDt The value of wasteReturnDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWasteReturnDt_NotEqual(String wasteReturnDt) {
        doSetWasteReturnDt_NotEqual(fRES(wasteReturnDt));
    }

    protected void doSetWasteReturnDt_NotEqual(String wasteReturnDt) {
        regWasteReturnDt(CK_NES, wasteReturnDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(30)}
     * @param wasteReturnDt The value of wasteReturnDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWasteReturnDt_GreaterThan(String wasteReturnDt) {
        regWasteReturnDt(CK_GT, fRES(wasteReturnDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(30)}
     * @param wasteReturnDt The value of wasteReturnDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWasteReturnDt_LessThan(String wasteReturnDt) {
        regWasteReturnDt(CK_LT, fRES(wasteReturnDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(30)}
     * @param wasteReturnDt The value of wasteReturnDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWasteReturnDt_GreaterEqual(String wasteReturnDt) {
        regWasteReturnDt(CK_GE, fRES(wasteReturnDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(30)}
     * @param wasteReturnDt The value of wasteReturnDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWasteReturnDt_LessEqual(String wasteReturnDt) {
        regWasteReturnDt(CK_LE, fRES(wasteReturnDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(30)}
     * @param wasteReturnDtList The collection of wasteReturnDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWasteReturnDt_InScope(Collection<String> wasteReturnDtList) {
        doSetWasteReturnDt_InScope(wasteReturnDtList);
    }

    protected void doSetWasteReturnDt_InScope(Collection<String> wasteReturnDtList) {
        regINS(CK_INS, cTL(wasteReturnDtList), xgetCValueWasteReturnDt(), "WASTE_RETURN_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(30)}
     * @param wasteReturnDtList The collection of wasteReturnDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWasteReturnDt_NotInScope(Collection<String> wasteReturnDtList) {
        doSetWasteReturnDt_NotInScope(wasteReturnDtList);
    }

    protected void doSetWasteReturnDt_NotInScope(Collection<String> wasteReturnDtList) {
        regINS(CK_NINS, cTL(wasteReturnDtList), xgetCValueWasteReturnDt(), "WASTE_RETURN_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(30)} <br>
     * <pre>e.g. setWasteReturnDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wasteReturnDt The value of wasteReturnDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWasteReturnDt_LikeSearch(String wasteReturnDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wasteReturnDt), xgetCValueWasteReturnDt(), "WASTE_RETURN_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(30)}
     * @param wasteReturnDt The value of wasteReturnDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWasteReturnDt_NotLikeSearch(String wasteReturnDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wasteReturnDt), xgetCValueWasteReturnDt(), "WASTE_RETURN_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(30)}
     * @param wasteReturnDt The value of wasteReturnDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWasteReturnDt_PrefixSearch(String wasteReturnDt) {
        setWasteReturnDt_LikeSearch(wasteReturnDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(30)}
     */
    public void setWasteReturnDt_IsNull() { regWasteReturnDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(30)}
     */
    public void setWasteReturnDt_IsNullOrEmpty() { regWasteReturnDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(30)}
     */
    public void setWasteReturnDt_IsNotNull() { regWasteReturnDt(CK_ISNN, DOBJ); }

    protected void regWasteReturnDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWasteReturnDt(), "WASTE_RETURN_DT"); }
    protected abstract ConditionValue xgetCValueWasteReturnDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)}
     * @param idManagAbolitionTypeCd The value of idManagAbolitionTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagAbolitionTypeCd_Equal(String idManagAbolitionTypeCd) {
        doSetIdManagAbolitionTypeCd_Equal(fRES(idManagAbolitionTypeCd));
    }

    protected void doSetIdManagAbolitionTypeCd_Equal(String idManagAbolitionTypeCd) {
        regIdManagAbolitionTypeCd(CK_EQ, idManagAbolitionTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)}
     * @param idManagAbolitionTypeCd The value of idManagAbolitionTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagAbolitionTypeCd_NotEqual(String idManagAbolitionTypeCd) {
        doSetIdManagAbolitionTypeCd_NotEqual(fRES(idManagAbolitionTypeCd));
    }

    protected void doSetIdManagAbolitionTypeCd_NotEqual(String idManagAbolitionTypeCd) {
        regIdManagAbolitionTypeCd(CK_NES, idManagAbolitionTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)}
     * @param idManagAbolitionTypeCd The value of idManagAbolitionTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagAbolitionTypeCd_GreaterThan(String idManagAbolitionTypeCd) {
        regIdManagAbolitionTypeCd(CK_GT, fRES(idManagAbolitionTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)}
     * @param idManagAbolitionTypeCd The value of idManagAbolitionTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagAbolitionTypeCd_LessThan(String idManagAbolitionTypeCd) {
        regIdManagAbolitionTypeCd(CK_LT, fRES(idManagAbolitionTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)}
     * @param idManagAbolitionTypeCd The value of idManagAbolitionTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagAbolitionTypeCd_GreaterEqual(String idManagAbolitionTypeCd) {
        regIdManagAbolitionTypeCd(CK_GE, fRES(idManagAbolitionTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)}
     * @param idManagAbolitionTypeCd The value of idManagAbolitionTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagAbolitionTypeCd_LessEqual(String idManagAbolitionTypeCd) {
        regIdManagAbolitionTypeCd(CK_LE, fRES(idManagAbolitionTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)}
     * @param idManagAbolitionTypeCdList The collection of idManagAbolitionTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagAbolitionTypeCd_InScope(Collection<String> idManagAbolitionTypeCdList) {
        doSetIdManagAbolitionTypeCd_InScope(idManagAbolitionTypeCdList);
    }

    protected void doSetIdManagAbolitionTypeCd_InScope(Collection<String> idManagAbolitionTypeCdList) {
        regINS(CK_INS, cTL(idManagAbolitionTypeCdList), xgetCValueIdManagAbolitionTypeCd(), "ID_MANAG_ABOLITION_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)}
     * @param idManagAbolitionTypeCdList The collection of idManagAbolitionTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagAbolitionTypeCd_NotInScope(Collection<String> idManagAbolitionTypeCdList) {
        doSetIdManagAbolitionTypeCd_NotInScope(idManagAbolitionTypeCdList);
    }

    protected void doSetIdManagAbolitionTypeCd_NotInScope(Collection<String> idManagAbolitionTypeCdList) {
        regINS(CK_NINS, cTL(idManagAbolitionTypeCdList), xgetCValueIdManagAbolitionTypeCd(), "ID_MANAG_ABOLITION_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setIdManagAbolitionTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param idManagAbolitionTypeCd The value of idManagAbolitionTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIdManagAbolitionTypeCd_LikeSearch(String idManagAbolitionTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(idManagAbolitionTypeCd), xgetCValueIdManagAbolitionTypeCd(), "ID_MANAG_ABOLITION_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)}
     * @param idManagAbolitionTypeCd The value of idManagAbolitionTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIdManagAbolitionTypeCd_NotLikeSearch(String idManagAbolitionTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(idManagAbolitionTypeCd), xgetCValueIdManagAbolitionTypeCd(), "ID_MANAG_ABOLITION_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)}
     * @param idManagAbolitionTypeCd The value of idManagAbolitionTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagAbolitionTypeCd_PrefixSearch(String idManagAbolitionTypeCd) {
        setIdManagAbolitionTypeCd_LikeSearch(idManagAbolitionTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)}
     */
    public void setIdManagAbolitionTypeCd_IsNull() { regIdManagAbolitionTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)}
     */
    public void setIdManagAbolitionTypeCd_IsNullOrEmpty() { regIdManagAbolitionTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)}
     */
    public void setIdManagAbolitionTypeCd_IsNotNull() { regIdManagAbolitionTypeCd(CK_ISNN, DOBJ); }

    protected void regIdManagAbolitionTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIdManagAbolitionTypeCd(), "ID_MANAG_ABOLITION_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueIdManagAbolitionTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_TYPE_CD: {VARCHAR(30)}
     * @param spareTypeCd The value of spareTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareTypeCd_Equal(String spareTypeCd) {
        doSetSpareTypeCd_Equal(fRES(spareTypeCd));
    }

    protected void doSetSpareTypeCd_Equal(String spareTypeCd) {
        regSpareTypeCd(CK_EQ, spareTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_TYPE_CD: {VARCHAR(30)}
     * @param spareTypeCd The value of spareTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareTypeCd_NotEqual(String spareTypeCd) {
        doSetSpareTypeCd_NotEqual(fRES(spareTypeCd));
    }

    protected void doSetSpareTypeCd_NotEqual(String spareTypeCd) {
        regSpareTypeCd(CK_NES, spareTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_TYPE_CD: {VARCHAR(30)}
     * @param spareTypeCd The value of spareTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareTypeCd_GreaterThan(String spareTypeCd) {
        regSpareTypeCd(CK_GT, fRES(spareTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_TYPE_CD: {VARCHAR(30)}
     * @param spareTypeCd The value of spareTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareTypeCd_LessThan(String spareTypeCd) {
        regSpareTypeCd(CK_LT, fRES(spareTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_TYPE_CD: {VARCHAR(30)}
     * @param spareTypeCd The value of spareTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareTypeCd_GreaterEqual(String spareTypeCd) {
        regSpareTypeCd(CK_GE, fRES(spareTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_TYPE_CD: {VARCHAR(30)}
     * @param spareTypeCd The value of spareTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareTypeCd_LessEqual(String spareTypeCd) {
        regSpareTypeCd(CK_LE, fRES(spareTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_TYPE_CD: {VARCHAR(30)}
     * @param spareTypeCdList The collection of spareTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareTypeCd_InScope(Collection<String> spareTypeCdList) {
        doSetSpareTypeCd_InScope(spareTypeCdList);
    }

    protected void doSetSpareTypeCd_InScope(Collection<String> spareTypeCdList) {
        regINS(CK_INS, cTL(spareTypeCdList), xgetCValueSpareTypeCd(), "SPARE_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_TYPE_CD: {VARCHAR(30)}
     * @param spareTypeCdList The collection of spareTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareTypeCd_NotInScope(Collection<String> spareTypeCdList) {
        doSetSpareTypeCd_NotInScope(spareTypeCdList);
    }

    protected void doSetSpareTypeCd_NotInScope(Collection<String> spareTypeCdList) {
        regINS(CK_NINS, cTL(spareTypeCdList), xgetCValueSpareTypeCd(), "SPARE_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSpareTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spareTypeCd The value of spareTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpareTypeCd_LikeSearch(String spareTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spareTypeCd), xgetCValueSpareTypeCd(), "SPARE_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_TYPE_CD: {VARCHAR(30)}
     * @param spareTypeCd The value of spareTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpareTypeCd_NotLikeSearch(String spareTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spareTypeCd), xgetCValueSpareTypeCd(), "SPARE_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_TYPE_CD: {VARCHAR(30)}
     * @param spareTypeCd The value of spareTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareTypeCd_PrefixSearch(String spareTypeCd) {
        setSpareTypeCd_LikeSearch(spareTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPARE_TYPE_CD: {VARCHAR(30)}
     */
    public void setSpareTypeCd_IsNull() { regSpareTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPARE_TYPE_CD: {VARCHAR(30)}
     */
    public void setSpareTypeCd_IsNullOrEmpty() { regSpareTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPARE_TYPE_CD: {VARCHAR(30)}
     */
    public void setSpareTypeCd_IsNotNull() { regSpareTypeCd(CK_ISNN, DOBJ); }

    protected void regSpareTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpareTypeCd(), "SPARE_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueSpareTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_PICKING: {VARCHAR(30)}
     * @param dataExtFlgPicking The value of dataExtFlgPicking as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgPicking_Equal(String dataExtFlgPicking) {
        doSetDataExtFlgPicking_Equal(fRES(dataExtFlgPicking));
    }

    protected void doSetDataExtFlgPicking_Equal(String dataExtFlgPicking) {
        regDataExtFlgPicking(CK_EQ, dataExtFlgPicking);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_PICKING: {VARCHAR(30)}
     * @param dataExtFlgPicking The value of dataExtFlgPicking as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgPicking_NotEqual(String dataExtFlgPicking) {
        doSetDataExtFlgPicking_NotEqual(fRES(dataExtFlgPicking));
    }

    protected void doSetDataExtFlgPicking_NotEqual(String dataExtFlgPicking) {
        regDataExtFlgPicking(CK_NES, dataExtFlgPicking);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_PICKING: {VARCHAR(30)}
     * @param dataExtFlgPicking The value of dataExtFlgPicking as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgPicking_GreaterThan(String dataExtFlgPicking) {
        regDataExtFlgPicking(CK_GT, fRES(dataExtFlgPicking));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_PICKING: {VARCHAR(30)}
     * @param dataExtFlgPicking The value of dataExtFlgPicking as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgPicking_LessThan(String dataExtFlgPicking) {
        regDataExtFlgPicking(CK_LT, fRES(dataExtFlgPicking));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_PICKING: {VARCHAR(30)}
     * @param dataExtFlgPicking The value of dataExtFlgPicking as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgPicking_GreaterEqual(String dataExtFlgPicking) {
        regDataExtFlgPicking(CK_GE, fRES(dataExtFlgPicking));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_PICKING: {VARCHAR(30)}
     * @param dataExtFlgPicking The value of dataExtFlgPicking as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgPicking_LessEqual(String dataExtFlgPicking) {
        regDataExtFlgPicking(CK_LE, fRES(dataExtFlgPicking));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_PICKING: {VARCHAR(30)}
     * @param dataExtFlgPickingList The collection of dataExtFlgPicking as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgPicking_InScope(Collection<String> dataExtFlgPickingList) {
        doSetDataExtFlgPicking_InScope(dataExtFlgPickingList);
    }

    protected void doSetDataExtFlgPicking_InScope(Collection<String> dataExtFlgPickingList) {
        regINS(CK_INS, cTL(dataExtFlgPickingList), xgetCValueDataExtFlgPicking(), "DATA_EXT_FLG_PICKING");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_PICKING: {VARCHAR(30)}
     * @param dataExtFlgPickingList The collection of dataExtFlgPicking as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgPicking_NotInScope(Collection<String> dataExtFlgPickingList) {
        doSetDataExtFlgPicking_NotInScope(dataExtFlgPickingList);
    }

    protected void doSetDataExtFlgPicking_NotInScope(Collection<String> dataExtFlgPickingList) {
        regINS(CK_NINS, cTL(dataExtFlgPickingList), xgetCValueDataExtFlgPicking(), "DATA_EXT_FLG_PICKING");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_PICKING: {VARCHAR(30)} <br>
     * <pre>e.g. setDataExtFlgPicking_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataExtFlgPicking The value of dataExtFlgPicking as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataExtFlgPicking_LikeSearch(String dataExtFlgPicking, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataExtFlgPicking), xgetCValueDataExtFlgPicking(), "DATA_EXT_FLG_PICKING", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_PICKING: {VARCHAR(30)}
     * @param dataExtFlgPicking The value of dataExtFlgPicking as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataExtFlgPicking_NotLikeSearch(String dataExtFlgPicking, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataExtFlgPicking), xgetCValueDataExtFlgPicking(), "DATA_EXT_FLG_PICKING", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_PICKING: {VARCHAR(30)}
     * @param dataExtFlgPicking The value of dataExtFlgPicking as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgPicking_PrefixSearch(String dataExtFlgPicking) {
        setDataExtFlgPicking_LikeSearch(dataExtFlgPicking, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_PICKING: {VARCHAR(30)}
     */
    public void setDataExtFlgPicking_IsNull() { regDataExtFlgPicking(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_PICKING: {VARCHAR(30)}
     */
    public void setDataExtFlgPicking_IsNullOrEmpty() { regDataExtFlgPicking(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_PICKING: {VARCHAR(30)}
     */
    public void setDataExtFlgPicking_IsNotNull() { regDataExtFlgPicking(CK_ISNN, DOBJ); }

    protected void regDataExtFlgPicking(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataExtFlgPicking(), "DATA_EXT_FLG_PICKING"); }
    protected abstract ConditionValue xgetCValueDataExtFlgPicking();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(30)}
     * @param dataAddDtPicking The value of dataAddDtPicking as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtPicking_Equal(String dataAddDtPicking) {
        doSetDataAddDtPicking_Equal(fRES(dataAddDtPicking));
    }

    protected void doSetDataAddDtPicking_Equal(String dataAddDtPicking) {
        regDataAddDtPicking(CK_EQ, dataAddDtPicking);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(30)}
     * @param dataAddDtPicking The value of dataAddDtPicking as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtPicking_NotEqual(String dataAddDtPicking) {
        doSetDataAddDtPicking_NotEqual(fRES(dataAddDtPicking));
    }

    protected void doSetDataAddDtPicking_NotEqual(String dataAddDtPicking) {
        regDataAddDtPicking(CK_NES, dataAddDtPicking);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(30)}
     * @param dataAddDtPicking The value of dataAddDtPicking as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtPicking_GreaterThan(String dataAddDtPicking) {
        regDataAddDtPicking(CK_GT, fRES(dataAddDtPicking));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(30)}
     * @param dataAddDtPicking The value of dataAddDtPicking as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtPicking_LessThan(String dataAddDtPicking) {
        regDataAddDtPicking(CK_LT, fRES(dataAddDtPicking));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(30)}
     * @param dataAddDtPicking The value of dataAddDtPicking as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtPicking_GreaterEqual(String dataAddDtPicking) {
        regDataAddDtPicking(CK_GE, fRES(dataAddDtPicking));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(30)}
     * @param dataAddDtPicking The value of dataAddDtPicking as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtPicking_LessEqual(String dataAddDtPicking) {
        regDataAddDtPicking(CK_LE, fRES(dataAddDtPicking));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(30)}
     * @param dataAddDtPickingList The collection of dataAddDtPicking as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtPicking_InScope(Collection<String> dataAddDtPickingList) {
        doSetDataAddDtPicking_InScope(dataAddDtPickingList);
    }

    protected void doSetDataAddDtPicking_InScope(Collection<String> dataAddDtPickingList) {
        regINS(CK_INS, cTL(dataAddDtPickingList), xgetCValueDataAddDtPicking(), "DATA_ADD_DT_PICKING");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(30)}
     * @param dataAddDtPickingList The collection of dataAddDtPicking as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtPicking_NotInScope(Collection<String> dataAddDtPickingList) {
        doSetDataAddDtPicking_NotInScope(dataAddDtPickingList);
    }

    protected void doSetDataAddDtPicking_NotInScope(Collection<String> dataAddDtPickingList) {
        regINS(CK_NINS, cTL(dataAddDtPickingList), xgetCValueDataAddDtPicking(), "DATA_ADD_DT_PICKING");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(30)} <br>
     * <pre>e.g. setDataAddDtPicking_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataAddDtPicking The value of dataAddDtPicking as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataAddDtPicking_LikeSearch(String dataAddDtPicking, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataAddDtPicking), xgetCValueDataAddDtPicking(), "DATA_ADD_DT_PICKING", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(30)}
     * @param dataAddDtPicking The value of dataAddDtPicking as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataAddDtPicking_NotLikeSearch(String dataAddDtPicking, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataAddDtPicking), xgetCValueDataAddDtPicking(), "DATA_ADD_DT_PICKING", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(30)}
     * @param dataAddDtPicking The value of dataAddDtPicking as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtPicking_PrefixSearch(String dataAddDtPicking) {
        setDataAddDtPicking_LikeSearch(dataAddDtPicking, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(30)}
     */
    public void setDataAddDtPicking_IsNull() { regDataAddDtPicking(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(30)}
     */
    public void setDataAddDtPicking_IsNullOrEmpty() { regDataAddDtPicking(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(30)}
     */
    public void setDataAddDtPicking_IsNotNull() { regDataAddDtPicking(CK_ISNN, DOBJ); }

    protected void regDataAddDtPicking(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataAddDtPicking(), "DATA_ADD_DT_PICKING"); }
    protected abstract ConditionValue xgetCValueDataAddDtPicking();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_RETURN: {VARCHAR(30)}
     * @param dataExtFlgReturn The value of dataExtFlgReturn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgReturn_Equal(String dataExtFlgReturn) {
        doSetDataExtFlgReturn_Equal(fRES(dataExtFlgReturn));
    }

    protected void doSetDataExtFlgReturn_Equal(String dataExtFlgReturn) {
        regDataExtFlgReturn(CK_EQ, dataExtFlgReturn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_RETURN: {VARCHAR(30)}
     * @param dataExtFlgReturn The value of dataExtFlgReturn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgReturn_NotEqual(String dataExtFlgReturn) {
        doSetDataExtFlgReturn_NotEqual(fRES(dataExtFlgReturn));
    }

    protected void doSetDataExtFlgReturn_NotEqual(String dataExtFlgReturn) {
        regDataExtFlgReturn(CK_NES, dataExtFlgReturn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_RETURN: {VARCHAR(30)}
     * @param dataExtFlgReturn The value of dataExtFlgReturn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgReturn_GreaterThan(String dataExtFlgReturn) {
        regDataExtFlgReturn(CK_GT, fRES(dataExtFlgReturn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_RETURN: {VARCHAR(30)}
     * @param dataExtFlgReturn The value of dataExtFlgReturn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgReturn_LessThan(String dataExtFlgReturn) {
        regDataExtFlgReturn(CK_LT, fRES(dataExtFlgReturn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_RETURN: {VARCHAR(30)}
     * @param dataExtFlgReturn The value of dataExtFlgReturn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgReturn_GreaterEqual(String dataExtFlgReturn) {
        regDataExtFlgReturn(CK_GE, fRES(dataExtFlgReturn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_RETURN: {VARCHAR(30)}
     * @param dataExtFlgReturn The value of dataExtFlgReturn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgReturn_LessEqual(String dataExtFlgReturn) {
        regDataExtFlgReturn(CK_LE, fRES(dataExtFlgReturn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_RETURN: {VARCHAR(30)}
     * @param dataExtFlgReturnList The collection of dataExtFlgReturn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgReturn_InScope(Collection<String> dataExtFlgReturnList) {
        doSetDataExtFlgReturn_InScope(dataExtFlgReturnList);
    }

    protected void doSetDataExtFlgReturn_InScope(Collection<String> dataExtFlgReturnList) {
        regINS(CK_INS, cTL(dataExtFlgReturnList), xgetCValueDataExtFlgReturn(), "DATA_EXT_FLG_RETURN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_RETURN: {VARCHAR(30)}
     * @param dataExtFlgReturnList The collection of dataExtFlgReturn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgReturn_NotInScope(Collection<String> dataExtFlgReturnList) {
        doSetDataExtFlgReturn_NotInScope(dataExtFlgReturnList);
    }

    protected void doSetDataExtFlgReturn_NotInScope(Collection<String> dataExtFlgReturnList) {
        regINS(CK_NINS, cTL(dataExtFlgReturnList), xgetCValueDataExtFlgReturn(), "DATA_EXT_FLG_RETURN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_RETURN: {VARCHAR(30)} <br>
     * <pre>e.g. setDataExtFlgReturn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataExtFlgReturn The value of dataExtFlgReturn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataExtFlgReturn_LikeSearch(String dataExtFlgReturn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataExtFlgReturn), xgetCValueDataExtFlgReturn(), "DATA_EXT_FLG_RETURN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_RETURN: {VARCHAR(30)}
     * @param dataExtFlgReturn The value of dataExtFlgReturn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataExtFlgReturn_NotLikeSearch(String dataExtFlgReturn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataExtFlgReturn), xgetCValueDataExtFlgReturn(), "DATA_EXT_FLG_RETURN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_RETURN: {VARCHAR(30)}
     * @param dataExtFlgReturn The value of dataExtFlgReturn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgReturn_PrefixSearch(String dataExtFlgReturn) {
        setDataExtFlgReturn_LikeSearch(dataExtFlgReturn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_RETURN: {VARCHAR(30)}
     */
    public void setDataExtFlgReturn_IsNull() { regDataExtFlgReturn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_RETURN: {VARCHAR(30)}
     */
    public void setDataExtFlgReturn_IsNullOrEmpty() { regDataExtFlgReturn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_RETURN: {VARCHAR(30)}
     */
    public void setDataExtFlgReturn_IsNotNull() { regDataExtFlgReturn(CK_ISNN, DOBJ); }

    protected void regDataExtFlgReturn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataExtFlgReturn(), "DATA_EXT_FLG_RETURN"); }
    protected abstract ConditionValue xgetCValueDataExtFlgReturn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(30)}
     * @param dataAddDtReturn The value of dataAddDtReturn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtReturn_Equal(String dataAddDtReturn) {
        doSetDataAddDtReturn_Equal(fRES(dataAddDtReturn));
    }

    protected void doSetDataAddDtReturn_Equal(String dataAddDtReturn) {
        regDataAddDtReturn(CK_EQ, dataAddDtReturn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(30)}
     * @param dataAddDtReturn The value of dataAddDtReturn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtReturn_NotEqual(String dataAddDtReturn) {
        doSetDataAddDtReturn_NotEqual(fRES(dataAddDtReturn));
    }

    protected void doSetDataAddDtReturn_NotEqual(String dataAddDtReturn) {
        regDataAddDtReturn(CK_NES, dataAddDtReturn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(30)}
     * @param dataAddDtReturn The value of dataAddDtReturn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtReturn_GreaterThan(String dataAddDtReturn) {
        regDataAddDtReturn(CK_GT, fRES(dataAddDtReturn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(30)}
     * @param dataAddDtReturn The value of dataAddDtReturn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtReturn_LessThan(String dataAddDtReturn) {
        regDataAddDtReturn(CK_LT, fRES(dataAddDtReturn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(30)}
     * @param dataAddDtReturn The value of dataAddDtReturn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtReturn_GreaterEqual(String dataAddDtReturn) {
        regDataAddDtReturn(CK_GE, fRES(dataAddDtReturn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(30)}
     * @param dataAddDtReturn The value of dataAddDtReturn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtReturn_LessEqual(String dataAddDtReturn) {
        regDataAddDtReturn(CK_LE, fRES(dataAddDtReturn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(30)}
     * @param dataAddDtReturnList The collection of dataAddDtReturn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtReturn_InScope(Collection<String> dataAddDtReturnList) {
        doSetDataAddDtReturn_InScope(dataAddDtReturnList);
    }

    protected void doSetDataAddDtReturn_InScope(Collection<String> dataAddDtReturnList) {
        regINS(CK_INS, cTL(dataAddDtReturnList), xgetCValueDataAddDtReturn(), "DATA_ADD_DT_RETURN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(30)}
     * @param dataAddDtReturnList The collection of dataAddDtReturn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtReturn_NotInScope(Collection<String> dataAddDtReturnList) {
        doSetDataAddDtReturn_NotInScope(dataAddDtReturnList);
    }

    protected void doSetDataAddDtReturn_NotInScope(Collection<String> dataAddDtReturnList) {
        regINS(CK_NINS, cTL(dataAddDtReturnList), xgetCValueDataAddDtReturn(), "DATA_ADD_DT_RETURN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(30)} <br>
     * <pre>e.g. setDataAddDtReturn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataAddDtReturn The value of dataAddDtReturn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataAddDtReturn_LikeSearch(String dataAddDtReturn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataAddDtReturn), xgetCValueDataAddDtReturn(), "DATA_ADD_DT_RETURN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(30)}
     * @param dataAddDtReturn The value of dataAddDtReturn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataAddDtReturn_NotLikeSearch(String dataAddDtReturn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataAddDtReturn), xgetCValueDataAddDtReturn(), "DATA_ADD_DT_RETURN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(30)}
     * @param dataAddDtReturn The value of dataAddDtReturn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtReturn_PrefixSearch(String dataAddDtReturn) {
        setDataAddDtReturn_LikeSearch(dataAddDtReturn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(30)}
     */
    public void setDataAddDtReturn_IsNull() { regDataAddDtReturn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(30)}
     */
    public void setDataAddDtReturn_IsNullOrEmpty() { regDataAddDtReturn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(30)}
     */
    public void setDataAddDtReturn_IsNotNull() { regDataAddDtReturn(CK_ISNN, DOBJ); }

    protected void regDataAddDtReturn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataAddDtReturn(), "DATA_ADD_DT_RETURN"); }
    protected abstract ConditionValue xgetCValueDataAddDtReturn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_WASTE: {VARCHAR(30)}
     * @param dataExtFlgWaste The value of dataExtFlgWaste as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgWaste_Equal(String dataExtFlgWaste) {
        doSetDataExtFlgWaste_Equal(fRES(dataExtFlgWaste));
    }

    protected void doSetDataExtFlgWaste_Equal(String dataExtFlgWaste) {
        regDataExtFlgWaste(CK_EQ, dataExtFlgWaste);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_WASTE: {VARCHAR(30)}
     * @param dataExtFlgWaste The value of dataExtFlgWaste as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgWaste_NotEqual(String dataExtFlgWaste) {
        doSetDataExtFlgWaste_NotEqual(fRES(dataExtFlgWaste));
    }

    protected void doSetDataExtFlgWaste_NotEqual(String dataExtFlgWaste) {
        regDataExtFlgWaste(CK_NES, dataExtFlgWaste);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_WASTE: {VARCHAR(30)}
     * @param dataExtFlgWaste The value of dataExtFlgWaste as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgWaste_GreaterThan(String dataExtFlgWaste) {
        regDataExtFlgWaste(CK_GT, fRES(dataExtFlgWaste));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_WASTE: {VARCHAR(30)}
     * @param dataExtFlgWaste The value of dataExtFlgWaste as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgWaste_LessThan(String dataExtFlgWaste) {
        regDataExtFlgWaste(CK_LT, fRES(dataExtFlgWaste));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_WASTE: {VARCHAR(30)}
     * @param dataExtFlgWaste The value of dataExtFlgWaste as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgWaste_GreaterEqual(String dataExtFlgWaste) {
        regDataExtFlgWaste(CK_GE, fRES(dataExtFlgWaste));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_WASTE: {VARCHAR(30)}
     * @param dataExtFlgWaste The value of dataExtFlgWaste as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgWaste_LessEqual(String dataExtFlgWaste) {
        regDataExtFlgWaste(CK_LE, fRES(dataExtFlgWaste));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_WASTE: {VARCHAR(30)}
     * @param dataExtFlgWasteList The collection of dataExtFlgWaste as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgWaste_InScope(Collection<String> dataExtFlgWasteList) {
        doSetDataExtFlgWaste_InScope(dataExtFlgWasteList);
    }

    protected void doSetDataExtFlgWaste_InScope(Collection<String> dataExtFlgWasteList) {
        regINS(CK_INS, cTL(dataExtFlgWasteList), xgetCValueDataExtFlgWaste(), "DATA_EXT_FLG_WASTE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_WASTE: {VARCHAR(30)}
     * @param dataExtFlgWasteList The collection of dataExtFlgWaste as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgWaste_NotInScope(Collection<String> dataExtFlgWasteList) {
        doSetDataExtFlgWaste_NotInScope(dataExtFlgWasteList);
    }

    protected void doSetDataExtFlgWaste_NotInScope(Collection<String> dataExtFlgWasteList) {
        regINS(CK_NINS, cTL(dataExtFlgWasteList), xgetCValueDataExtFlgWaste(), "DATA_EXT_FLG_WASTE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_WASTE: {VARCHAR(30)} <br>
     * <pre>e.g. setDataExtFlgWaste_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataExtFlgWaste The value of dataExtFlgWaste as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataExtFlgWaste_LikeSearch(String dataExtFlgWaste, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataExtFlgWaste), xgetCValueDataExtFlgWaste(), "DATA_EXT_FLG_WASTE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_WASTE: {VARCHAR(30)}
     * @param dataExtFlgWaste The value of dataExtFlgWaste as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataExtFlgWaste_NotLikeSearch(String dataExtFlgWaste, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataExtFlgWaste), xgetCValueDataExtFlgWaste(), "DATA_EXT_FLG_WASTE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_WASTE: {VARCHAR(30)}
     * @param dataExtFlgWaste The value of dataExtFlgWaste as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgWaste_PrefixSearch(String dataExtFlgWaste) {
        setDataExtFlgWaste_LikeSearch(dataExtFlgWaste, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_WASTE: {VARCHAR(30)}
     */
    public void setDataExtFlgWaste_IsNull() { regDataExtFlgWaste(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_WASTE: {VARCHAR(30)}
     */
    public void setDataExtFlgWaste_IsNullOrEmpty() { regDataExtFlgWaste(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_WASTE: {VARCHAR(30)}
     */
    public void setDataExtFlgWaste_IsNotNull() { regDataExtFlgWaste(CK_ISNN, DOBJ); }

    protected void regDataExtFlgWaste(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataExtFlgWaste(), "DATA_EXT_FLG_WASTE"); }
    protected abstract ConditionValue xgetCValueDataExtFlgWaste();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(30)}
     * @param dataAddDtWaste The value of dataAddDtWaste as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtWaste_Equal(String dataAddDtWaste) {
        doSetDataAddDtWaste_Equal(fRES(dataAddDtWaste));
    }

    protected void doSetDataAddDtWaste_Equal(String dataAddDtWaste) {
        regDataAddDtWaste(CK_EQ, dataAddDtWaste);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(30)}
     * @param dataAddDtWaste The value of dataAddDtWaste as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtWaste_NotEqual(String dataAddDtWaste) {
        doSetDataAddDtWaste_NotEqual(fRES(dataAddDtWaste));
    }

    protected void doSetDataAddDtWaste_NotEqual(String dataAddDtWaste) {
        regDataAddDtWaste(CK_NES, dataAddDtWaste);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(30)}
     * @param dataAddDtWaste The value of dataAddDtWaste as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtWaste_GreaterThan(String dataAddDtWaste) {
        regDataAddDtWaste(CK_GT, fRES(dataAddDtWaste));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(30)}
     * @param dataAddDtWaste The value of dataAddDtWaste as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtWaste_LessThan(String dataAddDtWaste) {
        regDataAddDtWaste(CK_LT, fRES(dataAddDtWaste));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(30)}
     * @param dataAddDtWaste The value of dataAddDtWaste as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtWaste_GreaterEqual(String dataAddDtWaste) {
        regDataAddDtWaste(CK_GE, fRES(dataAddDtWaste));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(30)}
     * @param dataAddDtWaste The value of dataAddDtWaste as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtWaste_LessEqual(String dataAddDtWaste) {
        regDataAddDtWaste(CK_LE, fRES(dataAddDtWaste));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(30)}
     * @param dataAddDtWasteList The collection of dataAddDtWaste as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtWaste_InScope(Collection<String> dataAddDtWasteList) {
        doSetDataAddDtWaste_InScope(dataAddDtWasteList);
    }

    protected void doSetDataAddDtWaste_InScope(Collection<String> dataAddDtWasteList) {
        regINS(CK_INS, cTL(dataAddDtWasteList), xgetCValueDataAddDtWaste(), "DATA_ADD_DT_WASTE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(30)}
     * @param dataAddDtWasteList The collection of dataAddDtWaste as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtWaste_NotInScope(Collection<String> dataAddDtWasteList) {
        doSetDataAddDtWaste_NotInScope(dataAddDtWasteList);
    }

    protected void doSetDataAddDtWaste_NotInScope(Collection<String> dataAddDtWasteList) {
        regINS(CK_NINS, cTL(dataAddDtWasteList), xgetCValueDataAddDtWaste(), "DATA_ADD_DT_WASTE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(30)} <br>
     * <pre>e.g. setDataAddDtWaste_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataAddDtWaste The value of dataAddDtWaste as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataAddDtWaste_LikeSearch(String dataAddDtWaste, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataAddDtWaste), xgetCValueDataAddDtWaste(), "DATA_ADD_DT_WASTE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(30)}
     * @param dataAddDtWaste The value of dataAddDtWaste as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataAddDtWaste_NotLikeSearch(String dataAddDtWaste, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataAddDtWaste), xgetCValueDataAddDtWaste(), "DATA_ADD_DT_WASTE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(30)}
     * @param dataAddDtWaste The value of dataAddDtWaste as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtWaste_PrefixSearch(String dataAddDtWaste) {
        setDataAddDtWaste_LikeSearch(dataAddDtWaste, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(30)}
     */
    public void setDataAddDtWaste_IsNull() { regDataAddDtWaste(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(30)}
     */
    public void setDataAddDtWaste_IsNullOrEmpty() { regDataAddDtWaste(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(30)}
     */
    public void setDataAddDtWaste_IsNotNull() { regDataAddDtWaste(CK_ISNN, DOBJ); }

    protected void regDataAddDtWaste(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataAddDtWaste(), "DATA_ADD_DT_WASTE"); }
    protected abstract ConditionValue xgetCValueDataAddDtWaste();

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
    public HpSLCFunction<EIdManagCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EIdManagCB.class);
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
    public HpSLCFunction<EIdManagCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EIdManagCB.class);
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
    public HpSLCFunction<EIdManagCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EIdManagCB.class);
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
    public HpSLCFunction<EIdManagCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EIdManagCB.class);
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
    public HpSLCFunction<EIdManagCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EIdManagCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EIdManagCB&gt;() {
     *     public void query(EIdManagCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EIdManagCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EIdManagCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EIdManagCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EIdManagCQ sq);

    protected EIdManagCB xcreateScalarConditionCB() {
        EIdManagCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EIdManagCB xcreateScalarConditionPartitionByCB() {
        EIdManagCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EIdManagCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EIdManagCB cb = new EIdManagCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ID_MANAG_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EIdManagCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EIdManagCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EIdManagCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EIdManagCB cb = new EIdManagCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ID_MANAG_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EIdManagCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EIdManagCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EIdManagCB cb = new EIdManagCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EIdManagCQ sq);

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
    protected EIdManagCB newMyCB() {
        return new EIdManagCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EIdManagCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
