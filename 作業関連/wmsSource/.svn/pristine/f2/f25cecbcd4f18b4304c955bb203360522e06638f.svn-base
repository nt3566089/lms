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
 * The abstract condition-query of h_id_manag_data.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsHIdManagDataCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsHIdManagDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "h_id_manag_data";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param idManagDataId The value of idManagDataId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIdManagDataId_Equal(Long idManagDataId) {
        doSetIdManagDataId_Equal(idManagDataId);
    }

    protected void doSetIdManagDataId_Equal(Long idManagDataId) {
        regIdManagDataId(CK_EQ, idManagDataId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param idManagDataId The value of idManagDataId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIdManagDataId_NotEqual(Long idManagDataId) {
        doSetIdManagDataId_NotEqual(idManagDataId);
    }

    protected void doSetIdManagDataId_NotEqual(Long idManagDataId) {
        regIdManagDataId(CK_NES, idManagDataId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param idManagDataId The value of idManagDataId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIdManagDataId_GreaterThan(Long idManagDataId) {
        regIdManagDataId(CK_GT, idManagDataId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param idManagDataId The value of idManagDataId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIdManagDataId_LessThan(Long idManagDataId) {
        regIdManagDataId(CK_LT, idManagDataId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param idManagDataId The value of idManagDataId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIdManagDataId_GreaterEqual(Long idManagDataId) {
        regIdManagDataId(CK_GE, idManagDataId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param idManagDataId The value of idManagDataId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIdManagDataId_LessEqual(Long idManagDataId) {
        regIdManagDataId(CK_LE, idManagDataId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of idManagDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of idManagDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setIdManagDataId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueIdManagDataId(), "ID_MANAG_DATA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ID_MANAG_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param idManagDataIdList The collection of idManagDataId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagDataId_InScope(Collection<Long> idManagDataIdList) {
        doSetIdManagDataId_InScope(idManagDataIdList);
    }

    protected void doSetIdManagDataId_InScope(Collection<Long> idManagDataIdList) {
        regINS(CK_INS, cTL(idManagDataIdList), xgetCValueIdManagDataId(), "ID_MANAG_DATA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ID_MANAG_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param idManagDataIdList The collection of idManagDataId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagDataId_NotInScope(Collection<Long> idManagDataIdList) {
        doSetIdManagDataId_NotInScope(idManagDataIdList);
    }

    protected void doSetIdManagDataId_NotInScope(Collection<Long> idManagDataIdList) {
        regINS(CK_NINS, cTL(idManagDataIdList), xgetCValueIdManagDataId(), "ID_MANAG_DATA_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ID_MANAG_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setIdManagDataId_IsNull() { regIdManagDataId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ID_MANAG_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setIdManagDataId_IsNotNull() { regIdManagDataId(CK_ISNN, DOBJ); }

    protected void regIdManagDataId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIdManagDataId(), "ID_MANAG_DATA_ID"); }
    protected abstract ConditionValue xgetCValueIdManagDataId();

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
     * PRODUCT_CD: {VARCHAR(30)}
     * @param productCd The value of productCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_Equal(String productCd) {
        doSetProductCd_Equal(fRES(productCd));
    }

    protected void doSetProductCd_Equal(String productCd) {
        regProductCd(CK_EQ, productCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @param productCd The value of productCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotEqual(String productCd) {
        doSetProductCd_NotEqual(fRES(productCd));
    }

    protected void doSetProductCd_NotEqual(String productCd) {
        regProductCd(CK_NES, productCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @param productCdList The collection of productCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_InScope(Collection<String> productCdList) {
        doSetProductCd_InScope(productCdList);
    }

    protected void doSetProductCd_InScope(Collection<String> productCdList) {
        regINS(CK_INS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @param productCdList The collection of productCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotInScope(Collection<String> productCdList) {
        doSetProductCd_NotInScope(productCdList);
    }

    protected void doSetProductCd_NotInScope(Collection<String> productCdList) {
        regINS(CK_NINS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setProductCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCd The value of productCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCd_LikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

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
     * DESTINATION_ADDRESS1: {VARCHAR(255)}
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
     * DESTINATION_ADDRESS1: {VARCHAR(255)}
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
     * DESTINATION_ADDRESS1: {VARCHAR(255)}
     * @param destinationAddress1 The value of destinationAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_GreaterThan(String destinationAddress1) {
        regDestinationAddress1(CK_GT, fRES(destinationAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(255)}
     * @param destinationAddress1 The value of destinationAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_LessThan(String destinationAddress1) {
        regDestinationAddress1(CK_LT, fRES(destinationAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(255)}
     * @param destinationAddress1 The value of destinationAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_GreaterEqual(String destinationAddress1) {
        regDestinationAddress1(CK_GE, fRES(destinationAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(255)}
     * @param destinationAddress1 The value of destinationAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_LessEqual(String destinationAddress1) {
        regDestinationAddress1(CK_LE, fRES(destinationAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(255)}
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
     * DESTINATION_ADDRESS1: {VARCHAR(255)}
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
     * DESTINATION_ADDRESS1: {VARCHAR(255)} <br>
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
     * DESTINATION_ADDRESS1: {VARCHAR(255)}
     * @param destinationAddress1 The value of destinationAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationAddress1_NotLikeSearch(String destinationAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationAddress1), xgetCValueDestinationAddress1(), "DESTINATION_ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(255)}
     * @param destinationAddress1 The value of destinationAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_PrefixSearch(String destinationAddress1) {
        setDestinationAddress1_LikeSearch(destinationAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(255)}
     */
    public void setDestinationAddress1_IsNull() { regDestinationAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(255)}
     */
    public void setDestinationAddress1_IsNullOrEmpty() { regDestinationAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(255)}
     */
    public void setDestinationAddress1_IsNotNull() { regDestinationAddress1(CK_ISNN, DOBJ); }

    protected void regDestinationAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationAddress1(), "DESTINATION_ADDRESS1"); }
    protected abstract ConditionValue xgetCValueDestinationAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(255)}
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
     * DESTINATION_ADDRESS2: {VARCHAR(255)}
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
     * DESTINATION_ADDRESS2: {VARCHAR(255)}
     * @param destinationAddress2 The value of destinationAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_GreaterThan(String destinationAddress2) {
        regDestinationAddress2(CK_GT, fRES(destinationAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(255)}
     * @param destinationAddress2 The value of destinationAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_LessThan(String destinationAddress2) {
        regDestinationAddress2(CK_LT, fRES(destinationAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(255)}
     * @param destinationAddress2 The value of destinationAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_GreaterEqual(String destinationAddress2) {
        regDestinationAddress2(CK_GE, fRES(destinationAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(255)}
     * @param destinationAddress2 The value of destinationAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_LessEqual(String destinationAddress2) {
        regDestinationAddress2(CK_LE, fRES(destinationAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(255)}
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
     * DESTINATION_ADDRESS2: {VARCHAR(255)}
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
     * DESTINATION_ADDRESS2: {VARCHAR(255)} <br>
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
     * DESTINATION_ADDRESS2: {VARCHAR(255)}
     * @param destinationAddress2 The value of destinationAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationAddress2_NotLikeSearch(String destinationAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationAddress2), xgetCValueDestinationAddress2(), "DESTINATION_ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(255)}
     * @param destinationAddress2 The value of destinationAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_PrefixSearch(String destinationAddress2) {
        setDestinationAddress2_LikeSearch(destinationAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(255)}
     */
    public void setDestinationAddress2_IsNull() { regDestinationAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(255)}
     */
    public void setDestinationAddress2_IsNullOrEmpty() { regDestinationAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(255)}
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
     * STORE_DT: {VARCHAR(8)}
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
     * STORE_DT: {VARCHAR(8)}
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
     * STORE_DT: {VARCHAR(8)}
     * @param storeDt The value of storeDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_GreaterThan(String storeDt) {
        regStoreDt(CK_GT, fRES(storeDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     * @param storeDt The value of storeDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_LessThan(String storeDt) {
        regStoreDt(CK_LT, fRES(storeDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     * @param storeDt The value of storeDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_GreaterEqual(String storeDt) {
        regStoreDt(CK_GE, fRES(storeDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     * @param storeDt The value of storeDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_LessEqual(String storeDt) {
        regStoreDt(CK_LE, fRES(storeDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
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
     * STORE_DT: {VARCHAR(8)}
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
     * STORE_DT: {VARCHAR(8)} <br>
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
     * STORE_DT: {VARCHAR(8)}
     * @param storeDt The value of storeDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreDt_NotLikeSearch(String storeDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeDt), xgetCValueStoreDt(), "STORE_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     * @param storeDt The value of storeDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_PrefixSearch(String storeDt) {
        setStoreDt_LikeSearch(storeDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     */
    public void setStoreDt_IsNull() { regStoreDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     */
    public void setStoreDt_IsNullOrEmpty() { regStoreDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     */
    public void setStoreDt_IsNotNull() { regStoreDt(CK_ISNN, DOBJ); }

    protected void regStoreDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreDt(), "STORE_DT"); }
    protected abstract ConditionValue xgetCValueStoreDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {VARCHAR(8)}
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
     * INVENTORY_DT: {VARCHAR(8)}
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
     * INVENTORY_DT: {VARCHAR(8)}
     * @param inventoryDt The value of inventoryDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_GreaterThan(String inventoryDt) {
        regInventoryDt(CK_GT, fRES(inventoryDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {VARCHAR(8)}
     * @param inventoryDt The value of inventoryDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_LessThan(String inventoryDt) {
        regInventoryDt(CK_LT, fRES(inventoryDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {VARCHAR(8)}
     * @param inventoryDt The value of inventoryDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_GreaterEqual(String inventoryDt) {
        regInventoryDt(CK_GE, fRES(inventoryDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {VARCHAR(8)}
     * @param inventoryDt The value of inventoryDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_LessEqual(String inventoryDt) {
        regInventoryDt(CK_LE, fRES(inventoryDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_DT: {VARCHAR(8)}
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
     * INVENTORY_DT: {VARCHAR(8)}
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
     * INVENTORY_DT: {VARCHAR(8)} <br>
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
     * INVENTORY_DT: {VARCHAR(8)}
     * @param inventoryDt The value of inventoryDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventoryDt_NotLikeSearch(String inventoryDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventoryDt), xgetCValueInventoryDt(), "INVENTORY_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DT: {VARCHAR(8)}
     * @param inventoryDt The value of inventoryDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_PrefixSearch(String inventoryDt) {
        setInventoryDt_LikeSearch(inventoryDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_DT: {VARCHAR(8)}
     */
    public void setInventoryDt_IsNull() { regInventoryDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVENTORY_DT: {VARCHAR(8)}
     */
    public void setInventoryDt_IsNullOrEmpty() { regInventoryDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_DT: {VARCHAR(8)}
     */
    public void setInventoryDt_IsNotNull() { regInventoryDt(CK_ISNN, DOBJ); }

    protected void regInventoryDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryDt(), "INVENTORY_DT"); }
    protected abstract ConditionValue xgetCValueInventoryDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_DT: {VARCHAR(8)}
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
     * PICKING_DT: {VARCHAR(8)}
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
     * PICKING_DT: {VARCHAR(8)}
     * @param pickingDt The value of pickingDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingDt_GreaterThan(String pickingDt) {
        regPickingDt(CK_GT, fRES(pickingDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_DT: {VARCHAR(8)}
     * @param pickingDt The value of pickingDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingDt_LessThan(String pickingDt) {
        regPickingDt(CK_LT, fRES(pickingDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_DT: {VARCHAR(8)}
     * @param pickingDt The value of pickingDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingDt_GreaterEqual(String pickingDt) {
        regPickingDt(CK_GE, fRES(pickingDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_DT: {VARCHAR(8)}
     * @param pickingDt The value of pickingDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingDt_LessEqual(String pickingDt) {
        regPickingDt(CK_LE, fRES(pickingDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_DT: {VARCHAR(8)}
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
     * PICKING_DT: {VARCHAR(8)}
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
     * PICKING_DT: {VARCHAR(8)} <br>
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
     * PICKING_DT: {VARCHAR(8)}
     * @param pickingDt The value of pickingDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingDt_NotLikeSearch(String pickingDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingDt), xgetCValuePickingDt(), "PICKING_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_DT: {VARCHAR(8)}
     * @param pickingDt The value of pickingDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingDt_PrefixSearch(String pickingDt) {
        setPickingDt_LikeSearch(pickingDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_DT: {VARCHAR(8)}
     */
    public void setPickingDt_IsNull() { regPickingDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_DT: {VARCHAR(8)}
     */
    public void setPickingDt_IsNullOrEmpty() { regPickingDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_DT: {VARCHAR(8)}
     */
    public void setPickingDt_IsNotNull() { regPickingDt(CK_ISNN, DOBJ); }

    protected void regPickingDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingDt(), "PICKING_DT"); }
    protected abstract ConditionValue xgetCValuePickingDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(8)}
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
     * PRODUCT_RETURN_DT: {VARCHAR(8)}
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
     * PRODUCT_RETURN_DT: {VARCHAR(8)}
     * @param productReturnDt The value of productReturnDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductReturnDt_GreaterThan(String productReturnDt) {
        regProductReturnDt(CK_GT, fRES(productReturnDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(8)}
     * @param productReturnDt The value of productReturnDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductReturnDt_LessThan(String productReturnDt) {
        regProductReturnDt(CK_LT, fRES(productReturnDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(8)}
     * @param productReturnDt The value of productReturnDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductReturnDt_GreaterEqual(String productReturnDt) {
        regProductReturnDt(CK_GE, fRES(productReturnDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(8)}
     * @param productReturnDt The value of productReturnDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductReturnDt_LessEqual(String productReturnDt) {
        regProductReturnDt(CK_LE, fRES(productReturnDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(8)}
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
     * PRODUCT_RETURN_DT: {VARCHAR(8)}
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
     * PRODUCT_RETURN_DT: {VARCHAR(8)} <br>
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
     * PRODUCT_RETURN_DT: {VARCHAR(8)}
     * @param productReturnDt The value of productReturnDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductReturnDt_NotLikeSearch(String productReturnDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productReturnDt), xgetCValueProductReturnDt(), "PRODUCT_RETURN_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(8)}
     * @param productReturnDt The value of productReturnDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductReturnDt_PrefixSearch(String productReturnDt) {
        setProductReturnDt_LikeSearch(productReturnDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(8)}
     */
    public void setProductReturnDt_IsNull() { regProductReturnDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(8)}
     */
    public void setProductReturnDt_IsNullOrEmpty() { regProductReturnDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(8)}
     */
    public void setProductReturnDt_IsNotNull() { regProductReturnDt(CK_ISNN, DOBJ); }

    protected void regProductReturnDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductReturnDt(), "PRODUCT_RETURN_DT"); }
    protected abstract ConditionValue xgetCValueProductReturnDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(8)}
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
     * WASTE_RETURN_DT: {VARCHAR(8)}
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
     * WASTE_RETURN_DT: {VARCHAR(8)}
     * @param wasteReturnDt The value of wasteReturnDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWasteReturnDt_GreaterThan(String wasteReturnDt) {
        regWasteReturnDt(CK_GT, fRES(wasteReturnDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(8)}
     * @param wasteReturnDt The value of wasteReturnDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWasteReturnDt_LessThan(String wasteReturnDt) {
        regWasteReturnDt(CK_LT, fRES(wasteReturnDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(8)}
     * @param wasteReturnDt The value of wasteReturnDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWasteReturnDt_GreaterEqual(String wasteReturnDt) {
        regWasteReturnDt(CK_GE, fRES(wasteReturnDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(8)}
     * @param wasteReturnDt The value of wasteReturnDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWasteReturnDt_LessEqual(String wasteReturnDt) {
        regWasteReturnDt(CK_LE, fRES(wasteReturnDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(8)}
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
     * WASTE_RETURN_DT: {VARCHAR(8)}
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
     * WASTE_RETURN_DT: {VARCHAR(8)} <br>
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
     * WASTE_RETURN_DT: {VARCHAR(8)}
     * @param wasteReturnDt The value of wasteReturnDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWasteReturnDt_NotLikeSearch(String wasteReturnDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wasteReturnDt), xgetCValueWasteReturnDt(), "WASTE_RETURN_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(8)}
     * @param wasteReturnDt The value of wasteReturnDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWasteReturnDt_PrefixSearch(String wasteReturnDt) {
        setWasteReturnDt_LikeSearch(wasteReturnDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(8)}
     */
    public void setWasteReturnDt_IsNull() { regWasteReturnDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(8)}
     */
    public void setWasteReturnDt_IsNullOrEmpty() { regWasteReturnDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WASTE_RETURN_DT: {VARCHAR(8)}
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
     * DATA_EXT_FLG_PICKING: {CHAR(1)}
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
     * DATA_EXT_FLG_PICKING: {CHAR(1)}
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
     * DATA_EXT_FLG_PICKING: {CHAR(1)}
     * @param dataExtFlgPicking The value of dataExtFlgPicking as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgPicking_GreaterThan(String dataExtFlgPicking) {
        regDataExtFlgPicking(CK_GT, fRES(dataExtFlgPicking));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_PICKING: {CHAR(1)}
     * @param dataExtFlgPicking The value of dataExtFlgPicking as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgPicking_LessThan(String dataExtFlgPicking) {
        regDataExtFlgPicking(CK_LT, fRES(dataExtFlgPicking));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_PICKING: {CHAR(1)}
     * @param dataExtFlgPicking The value of dataExtFlgPicking as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgPicking_GreaterEqual(String dataExtFlgPicking) {
        regDataExtFlgPicking(CK_GE, fRES(dataExtFlgPicking));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_PICKING: {CHAR(1)}
     * @param dataExtFlgPicking The value of dataExtFlgPicking as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgPicking_LessEqual(String dataExtFlgPicking) {
        regDataExtFlgPicking(CK_LE, fRES(dataExtFlgPicking));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_PICKING: {CHAR(1)}
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
     * DATA_EXT_FLG_PICKING: {CHAR(1)}
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
     * DATA_EXT_FLG_PICKING: {CHAR(1)} <br>
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
     * DATA_EXT_FLG_PICKING: {CHAR(1)}
     * @param dataExtFlgPicking The value of dataExtFlgPicking as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataExtFlgPicking_NotLikeSearch(String dataExtFlgPicking, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataExtFlgPicking), xgetCValueDataExtFlgPicking(), "DATA_EXT_FLG_PICKING", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_PICKING: {CHAR(1)}
     * @param dataExtFlgPicking The value of dataExtFlgPicking as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgPicking_PrefixSearch(String dataExtFlgPicking) {
        setDataExtFlgPicking_LikeSearch(dataExtFlgPicking, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_PICKING: {CHAR(1)}
     */
    public void setDataExtFlgPicking_IsNull() { regDataExtFlgPicking(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_PICKING: {CHAR(1)}
     */
    public void setDataExtFlgPicking_IsNullOrEmpty() { regDataExtFlgPicking(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_PICKING: {CHAR(1)}
     */
    public void setDataExtFlgPicking_IsNotNull() { regDataExtFlgPicking(CK_ISNN, DOBJ); }

    protected void regDataExtFlgPicking(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataExtFlgPicking(), "DATA_EXT_FLG_PICKING"); }
    protected abstract ConditionValue xgetCValueDataExtFlgPicking();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(8)}
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
     * DATA_ADD_DT_PICKING: {VARCHAR(8)}
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
     * DATA_ADD_DT_PICKING: {VARCHAR(8)}
     * @param dataAddDtPicking The value of dataAddDtPicking as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtPicking_GreaterThan(String dataAddDtPicking) {
        regDataAddDtPicking(CK_GT, fRES(dataAddDtPicking));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(8)}
     * @param dataAddDtPicking The value of dataAddDtPicking as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtPicking_LessThan(String dataAddDtPicking) {
        regDataAddDtPicking(CK_LT, fRES(dataAddDtPicking));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(8)}
     * @param dataAddDtPicking The value of dataAddDtPicking as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtPicking_GreaterEqual(String dataAddDtPicking) {
        regDataAddDtPicking(CK_GE, fRES(dataAddDtPicking));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(8)}
     * @param dataAddDtPicking The value of dataAddDtPicking as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtPicking_LessEqual(String dataAddDtPicking) {
        regDataAddDtPicking(CK_LE, fRES(dataAddDtPicking));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(8)}
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
     * DATA_ADD_DT_PICKING: {VARCHAR(8)}
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
     * DATA_ADD_DT_PICKING: {VARCHAR(8)} <br>
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
     * DATA_ADD_DT_PICKING: {VARCHAR(8)}
     * @param dataAddDtPicking The value of dataAddDtPicking as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataAddDtPicking_NotLikeSearch(String dataAddDtPicking, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataAddDtPicking), xgetCValueDataAddDtPicking(), "DATA_ADD_DT_PICKING", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(8)}
     * @param dataAddDtPicking The value of dataAddDtPicking as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtPicking_PrefixSearch(String dataAddDtPicking) {
        setDataAddDtPicking_LikeSearch(dataAddDtPicking, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(8)}
     */
    public void setDataAddDtPicking_IsNull() { regDataAddDtPicking(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(8)}
     */
    public void setDataAddDtPicking_IsNullOrEmpty() { regDataAddDtPicking(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(8)}
     */
    public void setDataAddDtPicking_IsNotNull() { regDataAddDtPicking(CK_ISNN, DOBJ); }

    protected void regDataAddDtPicking(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataAddDtPicking(), "DATA_ADD_DT_PICKING"); }
    protected abstract ConditionValue xgetCValueDataAddDtPicking();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_RETURN: {CHAR(1)}
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
     * DATA_EXT_FLG_RETURN: {CHAR(1)}
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
     * DATA_EXT_FLG_RETURN: {CHAR(1)}
     * @param dataExtFlgReturn The value of dataExtFlgReturn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgReturn_GreaterThan(String dataExtFlgReturn) {
        regDataExtFlgReturn(CK_GT, fRES(dataExtFlgReturn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_RETURN: {CHAR(1)}
     * @param dataExtFlgReturn The value of dataExtFlgReturn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgReturn_LessThan(String dataExtFlgReturn) {
        regDataExtFlgReturn(CK_LT, fRES(dataExtFlgReturn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_RETURN: {CHAR(1)}
     * @param dataExtFlgReturn The value of dataExtFlgReturn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgReturn_GreaterEqual(String dataExtFlgReturn) {
        regDataExtFlgReturn(CK_GE, fRES(dataExtFlgReturn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_RETURN: {CHAR(1)}
     * @param dataExtFlgReturn The value of dataExtFlgReturn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgReturn_LessEqual(String dataExtFlgReturn) {
        regDataExtFlgReturn(CK_LE, fRES(dataExtFlgReturn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_RETURN: {CHAR(1)}
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
     * DATA_EXT_FLG_RETURN: {CHAR(1)}
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
     * DATA_EXT_FLG_RETURN: {CHAR(1)} <br>
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
     * DATA_EXT_FLG_RETURN: {CHAR(1)}
     * @param dataExtFlgReturn The value of dataExtFlgReturn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataExtFlgReturn_NotLikeSearch(String dataExtFlgReturn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataExtFlgReturn), xgetCValueDataExtFlgReturn(), "DATA_EXT_FLG_RETURN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_RETURN: {CHAR(1)}
     * @param dataExtFlgReturn The value of dataExtFlgReturn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgReturn_PrefixSearch(String dataExtFlgReturn) {
        setDataExtFlgReturn_LikeSearch(dataExtFlgReturn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_RETURN: {CHAR(1)}
     */
    public void setDataExtFlgReturn_IsNull() { regDataExtFlgReturn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_RETURN: {CHAR(1)}
     */
    public void setDataExtFlgReturn_IsNullOrEmpty() { regDataExtFlgReturn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_RETURN: {CHAR(1)}
     */
    public void setDataExtFlgReturn_IsNotNull() { regDataExtFlgReturn(CK_ISNN, DOBJ); }

    protected void regDataExtFlgReturn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataExtFlgReturn(), "DATA_EXT_FLG_RETURN"); }
    protected abstract ConditionValue xgetCValueDataExtFlgReturn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(8)}
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
     * DATA_ADD_DT_RETURN: {VARCHAR(8)}
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
     * DATA_ADD_DT_RETURN: {VARCHAR(8)}
     * @param dataAddDtReturn The value of dataAddDtReturn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtReturn_GreaterThan(String dataAddDtReturn) {
        regDataAddDtReturn(CK_GT, fRES(dataAddDtReturn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(8)}
     * @param dataAddDtReturn The value of dataAddDtReturn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtReturn_LessThan(String dataAddDtReturn) {
        regDataAddDtReturn(CK_LT, fRES(dataAddDtReturn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(8)}
     * @param dataAddDtReturn The value of dataAddDtReturn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtReturn_GreaterEqual(String dataAddDtReturn) {
        regDataAddDtReturn(CK_GE, fRES(dataAddDtReturn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(8)}
     * @param dataAddDtReturn The value of dataAddDtReturn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtReturn_LessEqual(String dataAddDtReturn) {
        regDataAddDtReturn(CK_LE, fRES(dataAddDtReturn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(8)}
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
     * DATA_ADD_DT_RETURN: {VARCHAR(8)}
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
     * DATA_ADD_DT_RETURN: {VARCHAR(8)} <br>
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
     * DATA_ADD_DT_RETURN: {VARCHAR(8)}
     * @param dataAddDtReturn The value of dataAddDtReturn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataAddDtReturn_NotLikeSearch(String dataAddDtReturn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataAddDtReturn), xgetCValueDataAddDtReturn(), "DATA_ADD_DT_RETURN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(8)}
     * @param dataAddDtReturn The value of dataAddDtReturn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtReturn_PrefixSearch(String dataAddDtReturn) {
        setDataAddDtReturn_LikeSearch(dataAddDtReturn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(8)}
     */
    public void setDataAddDtReturn_IsNull() { regDataAddDtReturn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(8)}
     */
    public void setDataAddDtReturn_IsNullOrEmpty() { regDataAddDtReturn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(8)}
     */
    public void setDataAddDtReturn_IsNotNull() { regDataAddDtReturn(CK_ISNN, DOBJ); }

    protected void regDataAddDtReturn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataAddDtReturn(), "DATA_ADD_DT_RETURN"); }
    protected abstract ConditionValue xgetCValueDataAddDtReturn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_WASTE: {CHAR(1)}
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
     * DATA_EXT_FLG_WASTE: {CHAR(1)}
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
     * DATA_EXT_FLG_WASTE: {CHAR(1)}
     * @param dataExtFlgWaste The value of dataExtFlgWaste as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgWaste_GreaterThan(String dataExtFlgWaste) {
        regDataExtFlgWaste(CK_GT, fRES(dataExtFlgWaste));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_WASTE: {CHAR(1)}
     * @param dataExtFlgWaste The value of dataExtFlgWaste as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgWaste_LessThan(String dataExtFlgWaste) {
        regDataExtFlgWaste(CK_LT, fRES(dataExtFlgWaste));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_WASTE: {CHAR(1)}
     * @param dataExtFlgWaste The value of dataExtFlgWaste as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgWaste_GreaterEqual(String dataExtFlgWaste) {
        regDataExtFlgWaste(CK_GE, fRES(dataExtFlgWaste));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_WASTE: {CHAR(1)}
     * @param dataExtFlgWaste The value of dataExtFlgWaste as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgWaste_LessEqual(String dataExtFlgWaste) {
        regDataExtFlgWaste(CK_LE, fRES(dataExtFlgWaste));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_WASTE: {CHAR(1)}
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
     * DATA_EXT_FLG_WASTE: {CHAR(1)}
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
     * DATA_EXT_FLG_WASTE: {CHAR(1)} <br>
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
     * DATA_EXT_FLG_WASTE: {CHAR(1)}
     * @param dataExtFlgWaste The value of dataExtFlgWaste as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataExtFlgWaste_NotLikeSearch(String dataExtFlgWaste, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataExtFlgWaste), xgetCValueDataExtFlgWaste(), "DATA_EXT_FLG_WASTE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_EXT_FLG_WASTE: {CHAR(1)}
     * @param dataExtFlgWaste The value of dataExtFlgWaste as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataExtFlgWaste_PrefixSearch(String dataExtFlgWaste) {
        setDataExtFlgWaste_LikeSearch(dataExtFlgWaste, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_WASTE: {CHAR(1)}
     */
    public void setDataExtFlgWaste_IsNull() { regDataExtFlgWaste(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_WASTE: {CHAR(1)}
     */
    public void setDataExtFlgWaste_IsNullOrEmpty() { regDataExtFlgWaste(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_EXT_FLG_WASTE: {CHAR(1)}
     */
    public void setDataExtFlgWaste_IsNotNull() { regDataExtFlgWaste(CK_ISNN, DOBJ); }

    protected void regDataExtFlgWaste(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataExtFlgWaste(), "DATA_EXT_FLG_WASTE"); }
    protected abstract ConditionValue xgetCValueDataExtFlgWaste();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(8)}
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
     * DATA_ADD_DT_WASTE: {VARCHAR(8)}
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
     * DATA_ADD_DT_WASTE: {VARCHAR(8)}
     * @param dataAddDtWaste The value of dataAddDtWaste as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtWaste_GreaterThan(String dataAddDtWaste) {
        regDataAddDtWaste(CK_GT, fRES(dataAddDtWaste));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(8)}
     * @param dataAddDtWaste The value of dataAddDtWaste as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtWaste_LessThan(String dataAddDtWaste) {
        regDataAddDtWaste(CK_LT, fRES(dataAddDtWaste));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(8)}
     * @param dataAddDtWaste The value of dataAddDtWaste as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtWaste_GreaterEqual(String dataAddDtWaste) {
        regDataAddDtWaste(CK_GE, fRES(dataAddDtWaste));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(8)}
     * @param dataAddDtWaste The value of dataAddDtWaste as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtWaste_LessEqual(String dataAddDtWaste) {
        regDataAddDtWaste(CK_LE, fRES(dataAddDtWaste));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(8)}
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
     * DATA_ADD_DT_WASTE: {VARCHAR(8)}
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
     * DATA_ADD_DT_WASTE: {VARCHAR(8)} <br>
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
     * DATA_ADD_DT_WASTE: {VARCHAR(8)}
     * @param dataAddDtWaste The value of dataAddDtWaste as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataAddDtWaste_NotLikeSearch(String dataAddDtWaste, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataAddDtWaste), xgetCValueDataAddDtWaste(), "DATA_ADD_DT_WASTE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(8)}
     * @param dataAddDtWaste The value of dataAddDtWaste as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataAddDtWaste_PrefixSearch(String dataAddDtWaste) {
        setDataAddDtWaste_LikeSearch(dataAddDtWaste, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(8)}
     */
    public void setDataAddDtWaste_IsNull() { regDataAddDtWaste(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(8)}
     */
    public void setDataAddDtWaste_IsNullOrEmpty() { regDataAddDtWaste(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(8)}
     */
    public void setDataAddDtWaste_IsNotNull() { regDataAddDtWaste(CK_ISNN, DOBJ); }

    protected void regDataAddDtWaste(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataAddDtWaste(), "DATA_ADD_DT_WASTE"); }
    protected abstract ConditionValue xgetCValueDataAddDtWaste();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {VARCHAR(8)}
     * @param workDt The value of workDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_Equal(String workDt) {
        doSetWorkDt_Equal(fRES(workDt));
    }

    protected void doSetWorkDt_Equal(String workDt) {
        regWorkDt(CK_EQ, workDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {VARCHAR(8)}
     * @param workDt The value of workDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_NotEqual(String workDt) {
        doSetWorkDt_NotEqual(fRES(workDt));
    }

    protected void doSetWorkDt_NotEqual(String workDt) {
        regWorkDt(CK_NES, workDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {VARCHAR(8)}
     * @param workDt The value of workDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_GreaterThan(String workDt) {
        regWorkDt(CK_GT, fRES(workDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {VARCHAR(8)}
     * @param workDt The value of workDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_LessThan(String workDt) {
        regWorkDt(CK_LT, fRES(workDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {VARCHAR(8)}
     * @param workDt The value of workDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_GreaterEqual(String workDt) {
        regWorkDt(CK_GE, fRES(workDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {VARCHAR(8)}
     * @param workDt The value of workDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_LessEqual(String workDt) {
        regWorkDt(CK_LE, fRES(workDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_DT: {VARCHAR(8)}
     * @param workDtList The collection of workDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_InScope(Collection<String> workDtList) {
        doSetWorkDt_InScope(workDtList);
    }

    protected void doSetWorkDt_InScope(Collection<String> workDtList) {
        regINS(CK_INS, cTL(workDtList), xgetCValueWorkDt(), "WORK_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_DT: {VARCHAR(8)}
     * @param workDtList The collection of workDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_NotInScope(Collection<String> workDtList) {
        doSetWorkDt_NotInScope(workDtList);
    }

    protected void doSetWorkDt_NotInScope(Collection<String> workDtList) {
        regINS(CK_NINS, cTL(workDtList), xgetCValueWorkDt(), "WORK_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setWorkDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param workDt The value of workDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkDt_LikeSearch(String workDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workDt), xgetCValueWorkDt(), "WORK_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {VARCHAR(8)}
     * @param workDt The value of workDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkDt_NotLikeSearch(String workDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workDt), xgetCValueWorkDt(), "WORK_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {VARCHAR(8)}
     * @param workDt The value of workDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_PrefixSearch(String workDt) {
        setWorkDt_LikeSearch(workDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_DT: {VARCHAR(8)}
     */
    public void setWorkDt_IsNull() { regWorkDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WORK_DT: {VARCHAR(8)}
     */
    public void setWorkDt_IsNullOrEmpty() { regWorkDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_DT: {VARCHAR(8)}
     */
    public void setWorkDt_IsNotNull() { regWorkDt(CK_ISNN, DOBJ); }

    protected void regWorkDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkDt(), "WORK_DT"); }
    protected abstract ConditionValue xgetCValueWorkDt();

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
    public HpSLCFunction<HIdManagDataCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, HIdManagDataCB.class);
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
    public HpSLCFunction<HIdManagDataCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, HIdManagDataCB.class);
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
    public HpSLCFunction<HIdManagDataCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, HIdManagDataCB.class);
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
    public HpSLCFunction<HIdManagDataCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, HIdManagDataCB.class);
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
    public HpSLCFunction<HIdManagDataCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, HIdManagDataCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;HIdManagDataCB&gt;() {
     *     public void query(HIdManagDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<HIdManagDataCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, HIdManagDataCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        HIdManagDataCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(HIdManagDataCQ sq);

    protected HIdManagDataCB xcreateScalarConditionCB() {
        HIdManagDataCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected HIdManagDataCB xcreateScalarConditionPartitionByCB() {
        HIdManagDataCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<HIdManagDataCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HIdManagDataCB cb = new HIdManagDataCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ID_MANAG_DATA_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(HIdManagDataCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<HIdManagDataCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(HIdManagDataCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HIdManagDataCB cb = new HIdManagDataCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ID_MANAG_DATA_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(HIdManagDataCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<HIdManagDataCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HIdManagDataCB cb = new HIdManagDataCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(HIdManagDataCQ sq);

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
    protected HIdManagDataCB newMyCB() {
        return new HIdManagDataCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return HIdManagDataCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
