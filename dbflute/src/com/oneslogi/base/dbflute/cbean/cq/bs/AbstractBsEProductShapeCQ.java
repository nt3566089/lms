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
 * The abstract condition-query of e_product_shape.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEProductShapeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEProductShapeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "e_product_shape";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param productShapeId The value of productShapeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductShapeId_Equal(Long productShapeId) {
        doSetProductShapeId_Equal(productShapeId);
    }

    protected void doSetProductShapeId_Equal(Long productShapeId) {
        regProductShapeId(CK_EQ, productShapeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param productShapeId The value of productShapeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductShapeId_NotEqual(Long productShapeId) {
        doSetProductShapeId_NotEqual(productShapeId);
    }

    protected void doSetProductShapeId_NotEqual(Long productShapeId) {
        regProductShapeId(CK_NES, productShapeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param productShapeId The value of productShapeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductShapeId_GreaterThan(Long productShapeId) {
        regProductShapeId(CK_GT, productShapeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param productShapeId The value of productShapeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductShapeId_LessThan(Long productShapeId) {
        regProductShapeId(CK_LT, productShapeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param productShapeId The value of productShapeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductShapeId_GreaterEqual(Long productShapeId) {
        regProductShapeId(CK_GE, productShapeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param productShapeId The value of productShapeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductShapeId_LessEqual(Long productShapeId) {
        regProductShapeId(CK_LE, productShapeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of productShapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productShapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductShapeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductShapeId(), "PRODUCT_SHAPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param productShapeIdList The collection of productShapeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductShapeId_InScope(Collection<Long> productShapeIdList) {
        doSetProductShapeId_InScope(productShapeIdList);
    }

    protected void doSetProductShapeId_InScope(Collection<Long> productShapeIdList) {
        regINS(CK_INS, cTL(productShapeIdList), xgetCValueProductShapeId(), "PRODUCT_SHAPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param productShapeIdList The collection of productShapeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductShapeId_NotInScope(Collection<Long> productShapeIdList) {
        doSetProductShapeId_NotInScope(productShapeIdList);
    }

    protected void doSetProductShapeId_NotInScope(Collection<Long> productShapeIdList) {
        regINS(CK_NINS, cTL(productShapeIdList), xgetCValueProductShapeId(), "PRODUCT_SHAPE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setProductShapeId_IsNull() { regProductShapeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setProductShapeId_IsNotNull() { regProductShapeId(CK_ISNN, DOBJ); }

    protected void regProductShapeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductShapeId(), "PRODUCT_SHAPE_ID"); }
    protected abstract ConditionValue xgetCValueProductShapeId();

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
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlg The value of importFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_Equal(String importFlg) {
        doSetImportFlg_Equal(fRES(importFlg));
    }

    protected void doSetImportFlg_Equal(String importFlg) {
        regImportFlg(CK_EQ, importFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlg The value of importFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotEqual(String importFlg) {
        doSetImportFlg_NotEqual(fRES(importFlg));
    }

    protected void doSetImportFlg_NotEqual(String importFlg) {
        regImportFlg(CK_NES, importFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlg The value of importFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_GreaterThan(String importFlg) {
        regImportFlg(CK_GT, fRES(importFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlg The value of importFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_LessThan(String importFlg) {
        regImportFlg(CK_LT, fRES(importFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlg The value of importFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_GreaterEqual(String importFlg) {
        regImportFlg(CK_GE, fRES(importFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlg The value of importFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_LessEqual(String importFlg) {
        regImportFlg(CK_LE, fRES(importFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlgList The collection of importFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_InScope(Collection<String> importFlgList) {
        doSetImportFlg_InScope(importFlgList);
    }

    protected void doSetImportFlg_InScope(Collection<String> importFlgList) {
        regINS(CK_INS, cTL(importFlgList), xgetCValueImportFlg(), "IMPORT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlgList The collection of importFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotInScope(Collection<String> importFlgList) {
        doSetImportFlg_NotInScope(importFlgList);
    }

    protected void doSetImportFlg_NotInScope(Collection<String> importFlgList) {
        regINS(CK_NINS, cTL(importFlgList), xgetCValueImportFlg(), "IMPORT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * <pre>e.g. setImportFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param importFlg The value of importFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImportFlg_LikeSearch(String importFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(importFlg), xgetCValueImportFlg(), "IMPORT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlg The value of importFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImportFlg_NotLikeSearch(String importFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(importFlg), xgetCValueImportFlg(), "IMPORT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlg The value of importFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_PrefixSearch(String importFlg) {
        setImportFlg_LikeSearch(importFlg, xcLSOPPre());
    }

    protected void regImportFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportFlg(), "IMPORT_FLG"); }
    protected abstract ConditionValue xgetCValueImportFlg();

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
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
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
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
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
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterThan(String errorMessageCd) {
        regErrorMessageCd(CK_GT, fRES(errorMessageCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessThan(String errorMessageCd) {
        regErrorMessageCd(CK_LT, fRES(errorMessageCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterEqual(String errorMessageCd) {
        regErrorMessageCd(CK_GE, fRES(errorMessageCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessEqual(String errorMessageCd) {
        regErrorMessageCd(CK_LE, fRES(errorMessageCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
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
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
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
     * ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
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
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorMessageCd_NotLikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_PrefixSearch(String errorMessageCd) {
        setErrorMessageCd_LikeSearch(errorMessageCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     */
    public void setErrorMessageCd_IsNull() { regErrorMessageCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     */
    public void setErrorMessageCd_IsNullOrEmpty() { regErrorMessageCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     */
    public void setErrorMessageCd_IsNotNull() { regErrorMessageCd(CK_ISNN, DOBJ); }

    protected void regErrorMessageCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD"); }
    protected abstract ConditionValue xgetCValueErrorMessageCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {VARCHAR(255)}
     * @param clientCd The value of clientCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_Equal(String clientCd) {
        doSetClientCd_Equal(fRES(clientCd));
    }

    protected void doSetClientCd_Equal(String clientCd) {
        regClientCd(CK_EQ, clientCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {VARCHAR(255)}
     * @param clientCd The value of clientCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_NotEqual(String clientCd) {
        doSetClientCd_NotEqual(fRES(clientCd));
    }

    protected void doSetClientCd_NotEqual(String clientCd) {
        regClientCd(CK_NES, clientCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {VARCHAR(255)}
     * @param clientCd The value of clientCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_GreaterThan(String clientCd) {
        regClientCd(CK_GT, fRES(clientCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {VARCHAR(255)}
     * @param clientCd The value of clientCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_LessThan(String clientCd) {
        regClientCd(CK_LT, fRES(clientCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {VARCHAR(255)}
     * @param clientCd The value of clientCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_GreaterEqual(String clientCd) {
        regClientCd(CK_GE, fRES(clientCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {VARCHAR(255)}
     * @param clientCd The value of clientCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_LessEqual(String clientCd) {
        regClientCd(CK_LE, fRES(clientCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {VARCHAR(255)}
     * @param clientCdList The collection of clientCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_InScope(Collection<String> clientCdList) {
        doSetClientCd_InScope(clientCdList);
    }

    protected void doSetClientCd_InScope(Collection<String> clientCdList) {
        regINS(CK_INS, cTL(clientCdList), xgetCValueClientCd(), "CLIENT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {VARCHAR(255)}
     * @param clientCdList The collection of clientCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_NotInScope(Collection<String> clientCdList) {
        doSetClientCd_NotInScope(clientCdList);
    }

    protected void doSetClientCd_NotInScope(Collection<String> clientCdList) {
        regINS(CK_NINS, cTL(clientCdList), xgetCValueClientCd(), "CLIENT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {VARCHAR(255)} <br>
     * <pre>e.g. setClientCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clientCd The value of clientCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClientCd_LikeSearch(String clientCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clientCd), xgetCValueClientCd(), "CLIENT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {VARCHAR(255)}
     * @param clientCd The value of clientCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClientCd_NotLikeSearch(String clientCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clientCd), xgetCValueClientCd(), "CLIENT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {VARCHAR(255)}
     * @param clientCd The value of clientCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_PrefixSearch(String clientCd) {
        setClientCd_LikeSearch(clientCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_CD: {VARCHAR(255)}
     */
    public void setClientCd_IsNull() { regClientCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CLIENT_CD: {VARCHAR(255)}
     */
    public void setClientCd_IsNullOrEmpty() { regClientCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_CD: {VARCHAR(255)}
     */
    public void setClientCd_IsNotNull() { regClientCd(CK_ISNN, DOBJ); }

    protected void regClientCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientCd(), "CLIENT_CD"); }
    protected abstract ConditionValue xgetCValueClientCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(255)}
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
     * PRODUCT_CD: {VARCHAR(255)}
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
     * PRODUCT_CD: {VARCHAR(255)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(255)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(255)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(255)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {VARCHAR(255)}
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
     * PRODUCT_CD: {VARCHAR(255)}
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
     * PRODUCT_CD: {VARCHAR(255)} <br>
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
     * PRODUCT_CD: {VARCHAR(255)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {VARCHAR(255)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(255)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(255)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(255)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_CD: {VARCHAR(255)}
     * @param shapeCd The value of shapeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_Equal(String shapeCd) {
        doSetShapeCd_Equal(fRES(shapeCd));
    }

    protected void doSetShapeCd_Equal(String shapeCd) {
        regShapeCd(CK_EQ, shapeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_CD: {VARCHAR(255)}
     * @param shapeCd The value of shapeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_NotEqual(String shapeCd) {
        doSetShapeCd_NotEqual(fRES(shapeCd));
    }

    protected void doSetShapeCd_NotEqual(String shapeCd) {
        regShapeCd(CK_NES, shapeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_CD: {VARCHAR(255)}
     * @param shapeCd The value of shapeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_GreaterThan(String shapeCd) {
        regShapeCd(CK_GT, fRES(shapeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_CD: {VARCHAR(255)}
     * @param shapeCd The value of shapeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_LessThan(String shapeCd) {
        regShapeCd(CK_LT, fRES(shapeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_CD: {VARCHAR(255)}
     * @param shapeCd The value of shapeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_GreaterEqual(String shapeCd) {
        regShapeCd(CK_GE, fRES(shapeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_CD: {VARCHAR(255)}
     * @param shapeCd The value of shapeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_LessEqual(String shapeCd) {
        regShapeCd(CK_LE, fRES(shapeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHAPE_CD: {VARCHAR(255)}
     * @param shapeCdList The collection of shapeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_InScope(Collection<String> shapeCdList) {
        doSetShapeCd_InScope(shapeCdList);
    }

    protected void doSetShapeCd_InScope(Collection<String> shapeCdList) {
        regINS(CK_INS, cTL(shapeCdList), xgetCValueShapeCd(), "SHAPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHAPE_CD: {VARCHAR(255)}
     * @param shapeCdList The collection of shapeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_NotInScope(Collection<String> shapeCdList) {
        doSetShapeCd_NotInScope(shapeCdList);
    }

    protected void doSetShapeCd_NotInScope(Collection<String> shapeCdList) {
        regINS(CK_NINS, cTL(shapeCdList), xgetCValueShapeCd(), "SHAPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAPE_CD: {VARCHAR(255)} <br>
     * <pre>e.g. setShapeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shapeCd The value of shapeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShapeCd_LikeSearch(String shapeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shapeCd), xgetCValueShapeCd(), "SHAPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAPE_CD: {VARCHAR(255)}
     * @param shapeCd The value of shapeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShapeCd_NotLikeSearch(String shapeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shapeCd), xgetCValueShapeCd(), "SHAPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAPE_CD: {VARCHAR(255)}
     * @param shapeCd The value of shapeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_PrefixSearch(String shapeCd) {
        setShapeCd_LikeSearch(shapeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHAPE_CD: {VARCHAR(255)}
     */
    public void setShapeCd_IsNull() { regShapeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHAPE_CD: {VARCHAR(255)}
     */
    public void setShapeCd_IsNullOrEmpty() { regShapeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHAPE_CD: {VARCHAR(255)}
     */
    public void setShapeCd_IsNotNull() { regShapeCd(CK_ISNN, DOBJ); }

    protected void regShapeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShapeCd(), "SHAPE_CD"); }
    protected abstract ConditionValue xgetCValueShapeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {VARCHAR(255)}
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
     * UNIT_NUM: {VARCHAR(255)}
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
     * UNIT_NUM: {VARCHAR(255)}
     * @param unitNum The value of unitNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_GreaterThan(String unitNum) {
        regUnitNum(CK_GT, fRES(unitNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {VARCHAR(255)}
     * @param unitNum The value of unitNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_LessThan(String unitNum) {
        regUnitNum(CK_LT, fRES(unitNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {VARCHAR(255)}
     * @param unitNum The value of unitNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_GreaterEqual(String unitNum) {
        regUnitNum(CK_GE, fRES(unitNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {VARCHAR(255)}
     * @param unitNum The value of unitNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_LessEqual(String unitNum) {
        regUnitNum(CK_LE, fRES(unitNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT_NUM: {VARCHAR(255)}
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
     * UNIT_NUM: {VARCHAR(255)}
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
     * UNIT_NUM: {VARCHAR(255)} <br>
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
     * UNIT_NUM: {VARCHAR(255)}
     * @param unitNum The value of unitNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnitNum_NotLikeSearch(String unitNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unitNum), xgetCValueUnitNum(), "UNIT_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_NUM: {VARCHAR(255)}
     * @param unitNum The value of unitNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_PrefixSearch(String unitNum) {
        setUnitNum_LikeSearch(unitNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_NUM: {VARCHAR(255)}
     */
    public void setUnitNum_IsNull() { regUnitNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT_NUM: {VARCHAR(255)}
     */
    public void setUnitNum_IsNullOrEmpty() { regUnitNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_NUM: {VARCHAR(255)}
     */
    public void setUnitNum_IsNotNull() { regUnitNum(CK_ISNN, DOBJ); }

    protected void regUnitNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitNum(), "UNIT_NUM"); }
    protected abstract ConditionValue xgetCValueUnitNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {VARCHAR(255)}
     * @param length The value of length as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength_Equal(String length) {
        doSetLength_Equal(fRES(length));
    }

    protected void doSetLength_Equal(String length) {
        regLength(CK_EQ, length);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {VARCHAR(255)}
     * @param length The value of length as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength_NotEqual(String length) {
        doSetLength_NotEqual(fRES(length));
    }

    protected void doSetLength_NotEqual(String length) {
        regLength(CK_NES, length);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {VARCHAR(255)}
     * @param length The value of length as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength_GreaterThan(String length) {
        regLength(CK_GT, fRES(length));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {VARCHAR(255)}
     * @param length The value of length as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength_LessThan(String length) {
        regLength(CK_LT, fRES(length));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {VARCHAR(255)}
     * @param length The value of length as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength_GreaterEqual(String length) {
        regLength(CK_GE, fRES(length));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {VARCHAR(255)}
     * @param length The value of length as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength_LessEqual(String length) {
        regLength(CK_LE, fRES(length));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LENGTH: {VARCHAR(255)}
     * @param lengthList The collection of length as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength_InScope(Collection<String> lengthList) {
        doSetLength_InScope(lengthList);
    }

    protected void doSetLength_InScope(Collection<String> lengthList) {
        regINS(CK_INS, cTL(lengthList), xgetCValueLength(), "LENGTH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LENGTH: {VARCHAR(255)}
     * @param lengthList The collection of length as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength_NotInScope(Collection<String> lengthList) {
        doSetLength_NotInScope(lengthList);
    }

    protected void doSetLength_NotInScope(Collection<String> lengthList) {
        regINS(CK_NINS, cTL(lengthList), xgetCValueLength(), "LENGTH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LENGTH: {VARCHAR(255)} <br>
     * <pre>e.g. setLength_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param length The value of length as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLength_LikeSearch(String length, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(length), xgetCValueLength(), "LENGTH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LENGTH: {VARCHAR(255)}
     * @param length The value of length as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLength_NotLikeSearch(String length, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(length), xgetCValueLength(), "LENGTH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LENGTH: {VARCHAR(255)}
     * @param length The value of length as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength_PrefixSearch(String length) {
        setLength_LikeSearch(length, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LENGTH: {VARCHAR(255)}
     */
    public void setLength_IsNull() { regLength(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LENGTH: {VARCHAR(255)}
     */
    public void setLength_IsNullOrEmpty() { regLength(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LENGTH: {VARCHAR(255)}
     */
    public void setLength_IsNotNull() { regLength(CK_ISNN, DOBJ); }

    protected void regLength(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLength(), "LENGTH"); }
    protected abstract ConditionValue xgetCValueLength();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {VARCHAR(255)}
     * @param width The value of width as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth_Equal(String width) {
        doSetWidth_Equal(fRES(width));
    }

    protected void doSetWidth_Equal(String width) {
        regWidth(CK_EQ, width);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {VARCHAR(255)}
     * @param width The value of width as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth_NotEqual(String width) {
        doSetWidth_NotEqual(fRES(width));
    }

    protected void doSetWidth_NotEqual(String width) {
        regWidth(CK_NES, width);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {VARCHAR(255)}
     * @param width The value of width as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth_GreaterThan(String width) {
        regWidth(CK_GT, fRES(width));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {VARCHAR(255)}
     * @param width The value of width as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth_LessThan(String width) {
        regWidth(CK_LT, fRES(width));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {VARCHAR(255)}
     * @param width The value of width as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth_GreaterEqual(String width) {
        regWidth(CK_GE, fRES(width));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {VARCHAR(255)}
     * @param width The value of width as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth_LessEqual(String width) {
        regWidth(CK_LE, fRES(width));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WIDTH: {VARCHAR(255)}
     * @param widthList The collection of width as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth_InScope(Collection<String> widthList) {
        doSetWidth_InScope(widthList);
    }

    protected void doSetWidth_InScope(Collection<String> widthList) {
        regINS(CK_INS, cTL(widthList), xgetCValueWidth(), "WIDTH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WIDTH: {VARCHAR(255)}
     * @param widthList The collection of width as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth_NotInScope(Collection<String> widthList) {
        doSetWidth_NotInScope(widthList);
    }

    protected void doSetWidth_NotInScope(Collection<String> widthList) {
        regINS(CK_NINS, cTL(widthList), xgetCValueWidth(), "WIDTH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WIDTH: {VARCHAR(255)} <br>
     * <pre>e.g. setWidth_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param width The value of width as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWidth_LikeSearch(String width, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(width), xgetCValueWidth(), "WIDTH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WIDTH: {VARCHAR(255)}
     * @param width The value of width as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWidth_NotLikeSearch(String width, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(width), xgetCValueWidth(), "WIDTH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WIDTH: {VARCHAR(255)}
     * @param width The value of width as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth_PrefixSearch(String width) {
        setWidth_LikeSearch(width, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WIDTH: {VARCHAR(255)}
     */
    public void setWidth_IsNull() { regWidth(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WIDTH: {VARCHAR(255)}
     */
    public void setWidth_IsNullOrEmpty() { regWidth(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WIDTH: {VARCHAR(255)}
     */
    public void setWidth_IsNotNull() { regWidth(CK_ISNN, DOBJ); }

    protected void regWidth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWidth(), "WIDTH"); }
    protected abstract ConditionValue xgetCValueWidth();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {VARCHAR(255)}
     * @param height The value of height as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight_Equal(String height) {
        doSetHeight_Equal(fRES(height));
    }

    protected void doSetHeight_Equal(String height) {
        regHeight(CK_EQ, height);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {VARCHAR(255)}
     * @param height The value of height as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight_NotEqual(String height) {
        doSetHeight_NotEqual(fRES(height));
    }

    protected void doSetHeight_NotEqual(String height) {
        regHeight(CK_NES, height);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {VARCHAR(255)}
     * @param height The value of height as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight_GreaterThan(String height) {
        regHeight(CK_GT, fRES(height));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {VARCHAR(255)}
     * @param height The value of height as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight_LessThan(String height) {
        regHeight(CK_LT, fRES(height));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {VARCHAR(255)}
     * @param height The value of height as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight_GreaterEqual(String height) {
        regHeight(CK_GE, fRES(height));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {VARCHAR(255)}
     * @param height The value of height as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight_LessEqual(String height) {
        regHeight(CK_LE, fRES(height));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEIGHT: {VARCHAR(255)}
     * @param heightList The collection of height as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight_InScope(Collection<String> heightList) {
        doSetHeight_InScope(heightList);
    }

    protected void doSetHeight_InScope(Collection<String> heightList) {
        regINS(CK_INS, cTL(heightList), xgetCValueHeight(), "HEIGHT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEIGHT: {VARCHAR(255)}
     * @param heightList The collection of height as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight_NotInScope(Collection<String> heightList) {
        doSetHeight_NotInScope(heightList);
    }

    protected void doSetHeight_NotInScope(Collection<String> heightList) {
        regINS(CK_NINS, cTL(heightList), xgetCValueHeight(), "HEIGHT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEIGHT: {VARCHAR(255)} <br>
     * <pre>e.g. setHeight_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param height The value of height as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHeight_LikeSearch(String height, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(height), xgetCValueHeight(), "HEIGHT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEIGHT: {VARCHAR(255)}
     * @param height The value of height as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHeight_NotLikeSearch(String height, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(height), xgetCValueHeight(), "HEIGHT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEIGHT: {VARCHAR(255)}
     * @param height The value of height as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight_PrefixSearch(String height) {
        setHeight_LikeSearch(height, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HEIGHT: {VARCHAR(255)}
     */
    public void setHeight_IsNull() { regHeight(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HEIGHT: {VARCHAR(255)}
     */
    public void setHeight_IsNullOrEmpty() { regHeight(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HEIGHT: {VARCHAR(255)}
     */
    public void setHeight_IsNotNull() { regHeight(CK_ISNN, DOBJ); }

    protected void regHeight(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHeight(), "HEIGHT"); }
    protected abstract ConditionValue xgetCValueHeight();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {VARCHAR(255)}
     * @param volume The value of volume as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVolume_Equal(String volume) {
        doSetVolume_Equal(fRES(volume));
    }

    protected void doSetVolume_Equal(String volume) {
        regVolume(CK_EQ, volume);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {VARCHAR(255)}
     * @param volume The value of volume as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVolume_NotEqual(String volume) {
        doSetVolume_NotEqual(fRES(volume));
    }

    protected void doSetVolume_NotEqual(String volume) {
        regVolume(CK_NES, volume);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {VARCHAR(255)}
     * @param volume The value of volume as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVolume_GreaterThan(String volume) {
        regVolume(CK_GT, fRES(volume));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {VARCHAR(255)}
     * @param volume The value of volume as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVolume_LessThan(String volume) {
        regVolume(CK_LT, fRES(volume));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {VARCHAR(255)}
     * @param volume The value of volume as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVolume_GreaterEqual(String volume) {
        regVolume(CK_GE, fRES(volume));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {VARCHAR(255)}
     * @param volume The value of volume as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVolume_LessEqual(String volume) {
        regVolume(CK_LE, fRES(volume));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VOLUME: {VARCHAR(255)}
     * @param volumeList The collection of volume as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVolume_InScope(Collection<String> volumeList) {
        doSetVolume_InScope(volumeList);
    }

    protected void doSetVolume_InScope(Collection<String> volumeList) {
        regINS(CK_INS, cTL(volumeList), xgetCValueVolume(), "VOLUME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VOLUME: {VARCHAR(255)}
     * @param volumeList The collection of volume as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVolume_NotInScope(Collection<String> volumeList) {
        doSetVolume_NotInScope(volumeList);
    }

    protected void doSetVolume_NotInScope(Collection<String> volumeList) {
        regINS(CK_NINS, cTL(volumeList), xgetCValueVolume(), "VOLUME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VOLUME: {VARCHAR(255)} <br>
     * <pre>e.g. setVolume_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param volume The value of volume as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVolume_LikeSearch(String volume, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(volume), xgetCValueVolume(), "VOLUME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VOLUME: {VARCHAR(255)}
     * @param volume The value of volume as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVolume_NotLikeSearch(String volume, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(volume), xgetCValueVolume(), "VOLUME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VOLUME: {VARCHAR(255)}
     * @param volume The value of volume as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVolume_PrefixSearch(String volume) {
        setVolume_LikeSearch(volume, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VOLUME: {VARCHAR(255)}
     */
    public void setVolume_IsNull() { regVolume(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VOLUME: {VARCHAR(255)}
     */
    public void setVolume_IsNullOrEmpty() { regVolume(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VOLUME: {VARCHAR(255)}
     */
    public void setVolume_IsNotNull() { regVolume(CK_ISNN, DOBJ); }

    protected void regVolume(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVolume(), "VOLUME"); }
    protected abstract ConditionValue xgetCValueVolume();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NET_WEIGHT: {VARCHAR(255)}
     * @param netWeight The value of netWeight as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetWeight_Equal(String netWeight) {
        doSetNetWeight_Equal(fRES(netWeight));
    }

    protected void doSetNetWeight_Equal(String netWeight) {
        regNetWeight(CK_EQ, netWeight);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NET_WEIGHT: {VARCHAR(255)}
     * @param netWeight The value of netWeight as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetWeight_NotEqual(String netWeight) {
        doSetNetWeight_NotEqual(fRES(netWeight));
    }

    protected void doSetNetWeight_NotEqual(String netWeight) {
        regNetWeight(CK_NES, netWeight);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NET_WEIGHT: {VARCHAR(255)}
     * @param netWeight The value of netWeight as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetWeight_GreaterThan(String netWeight) {
        regNetWeight(CK_GT, fRES(netWeight));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NET_WEIGHT: {VARCHAR(255)}
     * @param netWeight The value of netWeight as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetWeight_LessThan(String netWeight) {
        regNetWeight(CK_LT, fRES(netWeight));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NET_WEIGHT: {VARCHAR(255)}
     * @param netWeight The value of netWeight as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetWeight_GreaterEqual(String netWeight) {
        regNetWeight(CK_GE, fRES(netWeight));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NET_WEIGHT: {VARCHAR(255)}
     * @param netWeight The value of netWeight as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetWeight_LessEqual(String netWeight) {
        regNetWeight(CK_LE, fRES(netWeight));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NET_WEIGHT: {VARCHAR(255)}
     * @param netWeightList The collection of netWeight as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetWeight_InScope(Collection<String> netWeightList) {
        doSetNetWeight_InScope(netWeightList);
    }

    protected void doSetNetWeight_InScope(Collection<String> netWeightList) {
        regINS(CK_INS, cTL(netWeightList), xgetCValueNetWeight(), "NET_WEIGHT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NET_WEIGHT: {VARCHAR(255)}
     * @param netWeightList The collection of netWeight as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetWeight_NotInScope(Collection<String> netWeightList) {
        doSetNetWeight_NotInScope(netWeightList);
    }

    protected void doSetNetWeight_NotInScope(Collection<String> netWeightList) {
        regINS(CK_NINS, cTL(netWeightList), xgetCValueNetWeight(), "NET_WEIGHT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NET_WEIGHT: {VARCHAR(255)} <br>
     * <pre>e.g. setNetWeight_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param netWeight The value of netWeight as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNetWeight_LikeSearch(String netWeight, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(netWeight), xgetCValueNetWeight(), "NET_WEIGHT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NET_WEIGHT: {VARCHAR(255)}
     * @param netWeight The value of netWeight as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNetWeight_NotLikeSearch(String netWeight, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(netWeight), xgetCValueNetWeight(), "NET_WEIGHT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NET_WEIGHT: {VARCHAR(255)}
     * @param netWeight The value of netWeight as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetWeight_PrefixSearch(String netWeight) {
        setNetWeight_LikeSearch(netWeight, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NET_WEIGHT: {VARCHAR(255)}
     */
    public void setNetWeight_IsNull() { regNetWeight(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NET_WEIGHT: {VARCHAR(255)}
     */
    public void setNetWeight_IsNullOrEmpty() { regNetWeight(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NET_WEIGHT: {VARCHAR(255)}
     */
    public void setNetWeight_IsNotNull() { regNetWeight(CK_ISNN, DOBJ); }

    protected void regNetWeight(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNetWeight(), "NET_WEIGHT"); }
    protected abstract ConditionValue xgetCValueNetWeight();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {VARCHAR(255)}
     * @param grossWeight The value of grossWeight as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossWeight_Equal(String grossWeight) {
        doSetGrossWeight_Equal(fRES(grossWeight));
    }

    protected void doSetGrossWeight_Equal(String grossWeight) {
        regGrossWeight(CK_EQ, grossWeight);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {VARCHAR(255)}
     * @param grossWeight The value of grossWeight as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossWeight_NotEqual(String grossWeight) {
        doSetGrossWeight_NotEqual(fRES(grossWeight));
    }

    protected void doSetGrossWeight_NotEqual(String grossWeight) {
        regGrossWeight(CK_NES, grossWeight);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {VARCHAR(255)}
     * @param grossWeight The value of grossWeight as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossWeight_GreaterThan(String grossWeight) {
        regGrossWeight(CK_GT, fRES(grossWeight));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {VARCHAR(255)}
     * @param grossWeight The value of grossWeight as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossWeight_LessThan(String grossWeight) {
        regGrossWeight(CK_LT, fRES(grossWeight));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {VARCHAR(255)}
     * @param grossWeight The value of grossWeight as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossWeight_GreaterEqual(String grossWeight) {
        regGrossWeight(CK_GE, fRES(grossWeight));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {VARCHAR(255)}
     * @param grossWeight The value of grossWeight as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossWeight_LessEqual(String grossWeight) {
        regGrossWeight(CK_LE, fRES(grossWeight));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GROSS_WEIGHT: {VARCHAR(255)}
     * @param grossWeightList The collection of grossWeight as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossWeight_InScope(Collection<String> grossWeightList) {
        doSetGrossWeight_InScope(grossWeightList);
    }

    protected void doSetGrossWeight_InScope(Collection<String> grossWeightList) {
        regINS(CK_INS, cTL(grossWeightList), xgetCValueGrossWeight(), "GROSS_WEIGHT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GROSS_WEIGHT: {VARCHAR(255)}
     * @param grossWeightList The collection of grossWeight as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossWeight_NotInScope(Collection<String> grossWeightList) {
        doSetGrossWeight_NotInScope(grossWeightList);
    }

    protected void doSetGrossWeight_NotInScope(Collection<String> grossWeightList) {
        regINS(CK_NINS, cTL(grossWeightList), xgetCValueGrossWeight(), "GROSS_WEIGHT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GROSS_WEIGHT: {VARCHAR(255)} <br>
     * <pre>e.g. setGrossWeight_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param grossWeight The value of grossWeight as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGrossWeight_LikeSearch(String grossWeight, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(grossWeight), xgetCValueGrossWeight(), "GROSS_WEIGHT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GROSS_WEIGHT: {VARCHAR(255)}
     * @param grossWeight The value of grossWeight as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGrossWeight_NotLikeSearch(String grossWeight, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(grossWeight), xgetCValueGrossWeight(), "GROSS_WEIGHT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GROSS_WEIGHT: {VARCHAR(255)}
     * @param grossWeight The value of grossWeight as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossWeight_PrefixSearch(String grossWeight) {
        setGrossWeight_LikeSearch(grossWeight, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {VARCHAR(255)}
     */
    public void setGrossWeight_IsNull() { regGrossWeight(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {VARCHAR(255)}
     */
    public void setGrossWeight_IsNullOrEmpty() { regGrossWeight(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {VARCHAR(255)}
     */
    public void setGrossWeight_IsNotNull() { regGrossWeight(CK_ISNN, DOBJ); }

    protected void regGrossWeight(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGrossWeight(), "GROSS_WEIGHT"); }
    protected abstract ConditionValue xgetCValueGrossWeight();

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
    public HpSLCFunction<EProductShapeCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EProductShapeCB.class);
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
    public HpSLCFunction<EProductShapeCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EProductShapeCB.class);
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
    public HpSLCFunction<EProductShapeCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EProductShapeCB.class);
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
    public HpSLCFunction<EProductShapeCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EProductShapeCB.class);
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
    public HpSLCFunction<EProductShapeCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EProductShapeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EProductShapeCB&gt;() {
     *     public void query(EProductShapeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EProductShapeCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EProductShapeCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EProductShapeCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EProductShapeCQ sq);

    protected EProductShapeCB xcreateScalarConditionCB() {
        EProductShapeCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EProductShapeCB xcreateScalarConditionPartitionByCB() {
        EProductShapeCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EProductShapeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EProductShapeCB cb = new EProductShapeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRODUCT_SHAPE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EProductShapeCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EProductShapeCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EProductShapeCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EProductShapeCB cb = new EProductShapeCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRODUCT_SHAPE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EProductShapeCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EProductShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EProductShapeCB cb = new EProductShapeCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EProductShapeCQ sq);

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
    protected EProductShapeCB newMyCB() {
        return new EProductShapeCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EProductShapeCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}