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
 * The abstract condition-query of er_inventory_inst_dtl.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsErInventoryInstDtlCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsErInventoryInstDtlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "er_inventory_inst_dtl";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_DTL_ID: {PK, NotNull, BIGINT(19)}
     * @param inventoryInstDtlId The value of inventoryInstDtlId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryInstDtlId_Equal(Long inventoryInstDtlId) {
        doSetInventoryInstDtlId_Equal(inventoryInstDtlId);
    }

    protected void doSetInventoryInstDtlId_Equal(Long inventoryInstDtlId) {
        regInventoryInstDtlId(CK_EQ, inventoryInstDtlId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_DTL_ID: {PK, NotNull, BIGINT(19)}
     * @param inventoryInstDtlId The value of inventoryInstDtlId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryInstDtlId_NotEqual(Long inventoryInstDtlId) {
        doSetInventoryInstDtlId_NotEqual(inventoryInstDtlId);
    }

    protected void doSetInventoryInstDtlId_NotEqual(Long inventoryInstDtlId) {
        regInventoryInstDtlId(CK_NES, inventoryInstDtlId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_DTL_ID: {PK, NotNull, BIGINT(19)}
     * @param inventoryInstDtlId The value of inventoryInstDtlId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryInstDtlId_GreaterThan(Long inventoryInstDtlId) {
        regInventoryInstDtlId(CK_GT, inventoryInstDtlId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_DTL_ID: {PK, NotNull, BIGINT(19)}
     * @param inventoryInstDtlId The value of inventoryInstDtlId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryInstDtlId_LessThan(Long inventoryInstDtlId) {
        regInventoryInstDtlId(CK_LT, inventoryInstDtlId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_DTL_ID: {PK, NotNull, BIGINT(19)}
     * @param inventoryInstDtlId The value of inventoryInstDtlId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryInstDtlId_GreaterEqual(Long inventoryInstDtlId) {
        regInventoryInstDtlId(CK_GE, inventoryInstDtlId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_DTL_ID: {PK, NotNull, BIGINT(19)}
     * @param inventoryInstDtlId The value of inventoryInstDtlId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryInstDtlId_LessEqual(Long inventoryInstDtlId) {
        regInventoryInstDtlId(CK_LE, inventoryInstDtlId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_DTL_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of inventoryInstDtlId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryInstDtlId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryInstDtlId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryInstDtlId(), "INVENTORY_INST_DTL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_INST_DTL_ID: {PK, NotNull, BIGINT(19)}
     * @param inventoryInstDtlIdList The collection of inventoryInstDtlId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstDtlId_InScope(Collection<Long> inventoryInstDtlIdList) {
        doSetInventoryInstDtlId_InScope(inventoryInstDtlIdList);
    }

    protected void doSetInventoryInstDtlId_InScope(Collection<Long> inventoryInstDtlIdList) {
        regINS(CK_INS, cTL(inventoryInstDtlIdList), xgetCValueInventoryInstDtlId(), "INVENTORY_INST_DTL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_INST_DTL_ID: {PK, NotNull, BIGINT(19)}
     * @param inventoryInstDtlIdList The collection of inventoryInstDtlId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstDtlId_NotInScope(Collection<Long> inventoryInstDtlIdList) {
        doSetInventoryInstDtlId_NotInScope(inventoryInstDtlIdList);
    }

    protected void doSetInventoryInstDtlId_NotInScope(Collection<Long> inventoryInstDtlIdList) {
        regINS(CK_NINS, cTL(inventoryInstDtlIdList), xgetCValueInventoryInstDtlId(), "INVENTORY_INST_DTL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_INST_DTL_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setInventoryInstDtlId_IsNull() { regInventoryInstDtlId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_INST_DTL_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setInventoryInstDtlId_IsNotNull() { regInventoryInstDtlId(CK_ISNN, DOBJ); }

    protected void regInventoryInstDtlId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryInstDtlId(), "INVENTORY_INST_DTL_ID"); }
    protected abstract ConditionValue xgetCValueInventoryInstDtlId();

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
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     * @param inventorySlipNo The value of inventorySlipNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorySlipNo_Equal(String inventorySlipNo) {
        doSetInventorySlipNo_Equal(fRES(inventorySlipNo));
    }

    protected void doSetInventorySlipNo_Equal(String inventorySlipNo) {
        regInventorySlipNo(CK_EQ, inventorySlipNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     * @param inventorySlipNo The value of inventorySlipNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorySlipNo_NotEqual(String inventorySlipNo) {
        doSetInventorySlipNo_NotEqual(fRES(inventorySlipNo));
    }

    protected void doSetInventorySlipNo_NotEqual(String inventorySlipNo) {
        regInventorySlipNo(CK_NES, inventorySlipNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     * @param inventorySlipNo The value of inventorySlipNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorySlipNo_GreaterThan(String inventorySlipNo) {
        regInventorySlipNo(CK_GT, fRES(inventorySlipNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     * @param inventorySlipNo The value of inventorySlipNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorySlipNo_LessThan(String inventorySlipNo) {
        regInventorySlipNo(CK_LT, fRES(inventorySlipNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     * @param inventorySlipNo The value of inventorySlipNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorySlipNo_GreaterEqual(String inventorySlipNo) {
        regInventorySlipNo(CK_GE, fRES(inventorySlipNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     * @param inventorySlipNo The value of inventorySlipNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorySlipNo_LessEqual(String inventorySlipNo) {
        regInventorySlipNo(CK_LE, fRES(inventorySlipNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     * @param inventorySlipNoList The collection of inventorySlipNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorySlipNo_InScope(Collection<String> inventorySlipNoList) {
        doSetInventorySlipNo_InScope(inventorySlipNoList);
    }

    protected void doSetInventorySlipNo_InScope(Collection<String> inventorySlipNoList) {
        regINS(CK_INS, cTL(inventorySlipNoList), xgetCValueInventorySlipNo(), "INVENTORY_SLIP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     * @param inventorySlipNoList The collection of inventorySlipNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorySlipNo_NotInScope(Collection<String> inventorySlipNoList) {
        doSetInventorySlipNo_NotInScope(inventorySlipNoList);
    }

    protected void doSetInventorySlipNo_NotInScope(Collection<String> inventorySlipNoList) {
        regINS(CK_NINS, cTL(inventorySlipNoList), xgetCValueInventorySlipNo(), "INVENTORY_SLIP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_SLIP_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setInventorySlipNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventorySlipNo The value of inventorySlipNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventorySlipNo_LikeSearch(String inventorySlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventorySlipNo), xgetCValueInventorySlipNo(), "INVENTORY_SLIP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     * @param inventorySlipNo The value of inventorySlipNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventorySlipNo_NotLikeSearch(String inventorySlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventorySlipNo), xgetCValueInventorySlipNo(), "INVENTORY_SLIP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     * @param inventorySlipNo The value of inventorySlipNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorySlipNo_PrefixSearch(String inventorySlipNo) {
        setInventorySlipNo_LikeSearch(inventorySlipNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     */
    public void setInventorySlipNo_IsNull() { regInventorySlipNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     */
    public void setInventorySlipNo_IsNullOrEmpty() { regInventorySlipNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     */
    public void setInventorySlipNo_IsNotNull() { regInventorySlipNo(CK_ISNN, DOBJ); }

    protected void regInventorySlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventorySlipNo(), "INVENTORY_SLIP_NO"); }
    protected abstract ConditionValue xgetCValueInventorySlipNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     * @param fiscalYear The value of fiscalYear as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFiscalYear_Equal(String fiscalYear) {
        doSetFiscalYear_Equal(fRES(fiscalYear));
    }

    protected void doSetFiscalYear_Equal(String fiscalYear) {
        regFiscalYear(CK_EQ, fiscalYear);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     * @param fiscalYear The value of fiscalYear as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFiscalYear_NotEqual(String fiscalYear) {
        doSetFiscalYear_NotEqual(fRES(fiscalYear));
    }

    protected void doSetFiscalYear_NotEqual(String fiscalYear) {
        regFiscalYear(CK_NES, fiscalYear);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     * @param fiscalYear The value of fiscalYear as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFiscalYear_GreaterThan(String fiscalYear) {
        regFiscalYear(CK_GT, fRES(fiscalYear));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     * @param fiscalYear The value of fiscalYear as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFiscalYear_LessThan(String fiscalYear) {
        regFiscalYear(CK_LT, fRES(fiscalYear));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     * @param fiscalYear The value of fiscalYear as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFiscalYear_GreaterEqual(String fiscalYear) {
        regFiscalYear(CK_GE, fRES(fiscalYear));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     * @param fiscalYear The value of fiscalYear as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFiscalYear_LessEqual(String fiscalYear) {
        regFiscalYear(CK_LE, fRES(fiscalYear));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     * @param fiscalYearList The collection of fiscalYear as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFiscalYear_InScope(Collection<String> fiscalYearList) {
        doSetFiscalYear_InScope(fiscalYearList);
    }

    protected void doSetFiscalYear_InScope(Collection<String> fiscalYearList) {
        regINS(CK_INS, cTL(fiscalYearList), xgetCValueFiscalYear(), "FISCAL_YEAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     * @param fiscalYearList The collection of fiscalYear as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFiscalYear_NotInScope(Collection<String> fiscalYearList) {
        doSetFiscalYear_NotInScope(fiscalYearList);
    }

    protected void doSetFiscalYear_NotInScope(Collection<String> fiscalYearList) {
        regINS(CK_NINS, cTL(fiscalYearList), xgetCValueFiscalYear(), "FISCAL_YEAR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FISCAL_YEAR: {VARCHAR(30)} <br>
     * <pre>e.g. setFiscalYear_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fiscalYear The value of fiscalYear as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFiscalYear_LikeSearch(String fiscalYear, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fiscalYear), xgetCValueFiscalYear(), "FISCAL_YEAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     * @param fiscalYear The value of fiscalYear as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFiscalYear_NotLikeSearch(String fiscalYear, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fiscalYear), xgetCValueFiscalYear(), "FISCAL_YEAR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     * @param fiscalYear The value of fiscalYear as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFiscalYear_PrefixSearch(String fiscalYear) {
        setFiscalYear_LikeSearch(fiscalYear, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     */
    public void setFiscalYear_IsNull() { regFiscalYear(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     */
    public void setFiscalYear_IsNullOrEmpty() { regFiscalYear(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     */
    public void setFiscalYear_IsNotNull() { regFiscalYear(CK_ISNN, DOBJ); }

    protected void regFiscalYear(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFiscalYear(), "FISCAL_YEAR"); }
    protected abstract ConditionValue xgetCValueFiscalYear();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     * @param inventorySlipRowNo The value of inventorySlipRowNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorySlipRowNo_Equal(String inventorySlipRowNo) {
        doSetInventorySlipRowNo_Equal(fRES(inventorySlipRowNo));
    }

    protected void doSetInventorySlipRowNo_Equal(String inventorySlipRowNo) {
        regInventorySlipRowNo(CK_EQ, inventorySlipRowNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     * @param inventorySlipRowNo The value of inventorySlipRowNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorySlipRowNo_NotEqual(String inventorySlipRowNo) {
        doSetInventorySlipRowNo_NotEqual(fRES(inventorySlipRowNo));
    }

    protected void doSetInventorySlipRowNo_NotEqual(String inventorySlipRowNo) {
        regInventorySlipRowNo(CK_NES, inventorySlipRowNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     * @param inventorySlipRowNo The value of inventorySlipRowNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorySlipRowNo_GreaterThan(String inventorySlipRowNo) {
        regInventorySlipRowNo(CK_GT, fRES(inventorySlipRowNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     * @param inventorySlipRowNo The value of inventorySlipRowNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorySlipRowNo_LessThan(String inventorySlipRowNo) {
        regInventorySlipRowNo(CK_LT, fRES(inventorySlipRowNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     * @param inventorySlipRowNo The value of inventorySlipRowNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorySlipRowNo_GreaterEqual(String inventorySlipRowNo) {
        regInventorySlipRowNo(CK_GE, fRES(inventorySlipRowNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     * @param inventorySlipRowNo The value of inventorySlipRowNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorySlipRowNo_LessEqual(String inventorySlipRowNo) {
        regInventorySlipRowNo(CK_LE, fRES(inventorySlipRowNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     * @param inventorySlipRowNoList The collection of inventorySlipRowNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorySlipRowNo_InScope(Collection<String> inventorySlipRowNoList) {
        doSetInventorySlipRowNo_InScope(inventorySlipRowNoList);
    }

    protected void doSetInventorySlipRowNo_InScope(Collection<String> inventorySlipRowNoList) {
        regINS(CK_INS, cTL(inventorySlipRowNoList), xgetCValueInventorySlipRowNo(), "INVENTORY_SLIP_ROW_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     * @param inventorySlipRowNoList The collection of inventorySlipRowNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorySlipRowNo_NotInScope(Collection<String> inventorySlipRowNoList) {
        doSetInventorySlipRowNo_NotInScope(inventorySlipRowNoList);
    }

    protected void doSetInventorySlipRowNo_NotInScope(Collection<String> inventorySlipRowNoList) {
        regINS(CK_NINS, cTL(inventorySlipRowNoList), xgetCValueInventorySlipRowNo(), "INVENTORY_SLIP_ROW_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setInventorySlipRowNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventorySlipRowNo The value of inventorySlipRowNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventorySlipRowNo_LikeSearch(String inventorySlipRowNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventorySlipRowNo), xgetCValueInventorySlipRowNo(), "INVENTORY_SLIP_ROW_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     * @param inventorySlipRowNo The value of inventorySlipRowNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventorySlipRowNo_NotLikeSearch(String inventorySlipRowNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventorySlipRowNo), xgetCValueInventorySlipRowNo(), "INVENTORY_SLIP_ROW_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     * @param inventorySlipRowNo The value of inventorySlipRowNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventorySlipRowNo_PrefixSearch(String inventorySlipRowNo) {
        setInventorySlipRowNo_LikeSearch(inventorySlipRowNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     */
    public void setInventorySlipRowNo_IsNull() { regInventorySlipRowNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     */
    public void setInventorySlipRowNo_IsNullOrEmpty() { regInventorySlipRowNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     */
    public void setInventorySlipRowNo_IsNotNull() { regInventorySlipRowNo(CK_ISNN, DOBJ); }

    protected void regInventorySlipRowNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventorySlipRowNo(), "INVENTORY_SLIP_ROW_NO"); }
    protected abstract ConditionValue xgetCValueInventorySlipRowNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_Equal(String plantCd) {
        doSetPlantCd_Equal(fRES(plantCd));
    }

    protected void doSetPlantCd_Equal(String plantCd) {
        regPlantCd(CK_EQ, plantCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_NotEqual(String plantCd) {
        doSetPlantCd_NotEqual(fRES(plantCd));
    }

    protected void doSetPlantCd_NotEqual(String plantCd) {
        regPlantCd(CK_NES, plantCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_GreaterThan(String plantCd) {
        regPlantCd(CK_GT, fRES(plantCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_LessThan(String plantCd) {
        regPlantCd(CK_LT, fRES(plantCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_GreaterEqual(String plantCd) {
        regPlantCd(CK_GE, fRES(plantCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_LessEqual(String plantCd) {
        regPlantCd(CK_LE, fRES(plantCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCdList The collection of plantCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_InScope(Collection<String> plantCdList) {
        doSetPlantCd_InScope(plantCdList);
    }

    protected void doSetPlantCd_InScope(Collection<String> plantCdList) {
        regINS(CK_INS, cTL(plantCdList), xgetCValuePlantCd(), "PLANT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCdList The collection of plantCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_NotInScope(Collection<String> plantCdList) {
        doSetPlantCd_NotInScope(plantCdList);
    }

    protected void doSetPlantCd_NotInScope(Collection<String> plantCdList) {
        regINS(CK_NINS, cTL(plantCdList), xgetCValuePlantCd(), "PLANT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANT_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setPlantCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param plantCd The value of plantCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlantCd_LikeSearch(String plantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(plantCd), xgetCValuePlantCd(), "PLANT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlantCd_NotLikeSearch(String plantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(plantCd), xgetCValuePlantCd(), "PLANT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_PrefixSearch(String plantCd) {
        setPlantCd_LikeSearch(plantCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     */
    public void setPlantCd_IsNull() { regPlantCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     */
    public void setPlantCd_IsNullOrEmpty() { regPlantCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     */
    public void setPlantCd_IsNotNull() { regPlantCd(CK_ISNN, DOBJ); }

    protected void regPlantCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlantCd(), "PLANT_CD"); }
    protected abstract ConditionValue xgetCValuePlantCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_Equal(String storageSpaceCd) {
        doSetStorageSpaceCd_Equal(fRES(storageSpaceCd));
    }

    protected void doSetStorageSpaceCd_Equal(String storageSpaceCd) {
        regStorageSpaceCd(CK_EQ, storageSpaceCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_NotEqual(String storageSpaceCd) {
        doSetStorageSpaceCd_NotEqual(fRES(storageSpaceCd));
    }

    protected void doSetStorageSpaceCd_NotEqual(String storageSpaceCd) {
        regStorageSpaceCd(CK_NES, storageSpaceCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_GreaterThan(String storageSpaceCd) {
        regStorageSpaceCd(CK_GT, fRES(storageSpaceCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_LessThan(String storageSpaceCd) {
        regStorageSpaceCd(CK_LT, fRES(storageSpaceCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_GreaterEqual(String storageSpaceCd) {
        regStorageSpaceCd(CK_GE, fRES(storageSpaceCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_LessEqual(String storageSpaceCd) {
        regStorageSpaceCd(CK_LE, fRES(storageSpaceCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCdList The collection of storageSpaceCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_InScope(Collection<String> storageSpaceCdList) {
        doSetStorageSpaceCd_InScope(storageSpaceCdList);
    }

    protected void doSetStorageSpaceCd_InScope(Collection<String> storageSpaceCdList) {
        regINS(CK_INS, cTL(storageSpaceCdList), xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCdList The collection of storageSpaceCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_NotInScope(Collection<String> storageSpaceCdList) {
        doSetStorageSpaceCd_NotInScope(storageSpaceCdList);
    }

    protected void doSetStorageSpaceCd_NotInScope(Collection<String> storageSpaceCdList) {
        regINS(CK_NINS, cTL(storageSpaceCdList), xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setStorageSpaceCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storageSpaceCd The value of storageSpaceCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStorageSpaceCd_LikeSearch(String storageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storageSpaceCd), xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStorageSpaceCd_NotLikeSearch(String storageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storageSpaceCd), xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_PrefixSearch(String storageSpaceCd) {
        setStorageSpaceCd_LikeSearch(storageSpaceCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setStorageSpaceCd_IsNull() { regStorageSpaceCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setStorageSpaceCd_IsNullOrEmpty() { regStorageSpaceCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setStorageSpaceCd_IsNotNull() { regStorageSpaceCd(CK_ISNN, DOBJ); }

    protected void regStorageSpaceCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD"); }
    protected abstract ConditionValue xgetCValueStorageSpaceCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERENCE_DT: {VARCHAR(30)}
     * @param referenceDt The value of referenceDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferenceDt_Equal(String referenceDt) {
        doSetReferenceDt_Equal(fRES(referenceDt));
    }

    protected void doSetReferenceDt_Equal(String referenceDt) {
        regReferenceDt(CK_EQ, referenceDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERENCE_DT: {VARCHAR(30)}
     * @param referenceDt The value of referenceDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferenceDt_NotEqual(String referenceDt) {
        doSetReferenceDt_NotEqual(fRES(referenceDt));
    }

    protected void doSetReferenceDt_NotEqual(String referenceDt) {
        regReferenceDt(CK_NES, referenceDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERENCE_DT: {VARCHAR(30)}
     * @param referenceDt The value of referenceDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferenceDt_GreaterThan(String referenceDt) {
        regReferenceDt(CK_GT, fRES(referenceDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERENCE_DT: {VARCHAR(30)}
     * @param referenceDt The value of referenceDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferenceDt_LessThan(String referenceDt) {
        regReferenceDt(CK_LT, fRES(referenceDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERENCE_DT: {VARCHAR(30)}
     * @param referenceDt The value of referenceDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferenceDt_GreaterEqual(String referenceDt) {
        regReferenceDt(CK_GE, fRES(referenceDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERENCE_DT: {VARCHAR(30)}
     * @param referenceDt The value of referenceDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferenceDt_LessEqual(String referenceDt) {
        regReferenceDt(CK_LE, fRES(referenceDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFERENCE_DT: {VARCHAR(30)}
     * @param referenceDtList The collection of referenceDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferenceDt_InScope(Collection<String> referenceDtList) {
        doSetReferenceDt_InScope(referenceDtList);
    }

    protected void doSetReferenceDt_InScope(Collection<String> referenceDtList) {
        regINS(CK_INS, cTL(referenceDtList), xgetCValueReferenceDt(), "REFERENCE_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFERENCE_DT: {VARCHAR(30)}
     * @param referenceDtList The collection of referenceDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferenceDt_NotInScope(Collection<String> referenceDtList) {
        doSetReferenceDt_NotInScope(referenceDtList);
    }

    protected void doSetReferenceDt_NotInScope(Collection<String> referenceDtList) {
        regINS(CK_NINS, cTL(referenceDtList), xgetCValueReferenceDt(), "REFERENCE_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFERENCE_DT: {VARCHAR(30)} <br>
     * <pre>e.g. setReferenceDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param referenceDt The value of referenceDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReferenceDt_LikeSearch(String referenceDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(referenceDt), xgetCValueReferenceDt(), "REFERENCE_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFERENCE_DT: {VARCHAR(30)}
     * @param referenceDt The value of referenceDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReferenceDt_NotLikeSearch(String referenceDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(referenceDt), xgetCValueReferenceDt(), "REFERENCE_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFERENCE_DT: {VARCHAR(30)}
     * @param referenceDt The value of referenceDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferenceDt_PrefixSearch(String referenceDt) {
        setReferenceDt_LikeSearch(referenceDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REFERENCE_DT: {VARCHAR(30)}
     */
    public void setReferenceDt_IsNull() { regReferenceDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REFERENCE_DT: {VARCHAR(30)}
     */
    public void setReferenceDt_IsNullOrEmpty() { regReferenceDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REFERENCE_DT: {VARCHAR(30)}
     */
    public void setReferenceDt_IsNotNull() { regReferenceDt(CK_ISNN, DOBJ); }

    protected void regReferenceDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReferenceDt(), "REFERENCE_DT"); }
    protected abstract ConditionValue xgetCValueReferenceDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
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
     * HINMOKU_CD: {VARCHAR(30)}
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
     * HINMOKU_CD: {VARCHAR(30)}
     * @param hinmokuCd The value of hinmokuCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_GreaterThan(String hinmokuCd) {
        regHinmokuCd(CK_GT, fRES(hinmokuCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     * @param hinmokuCd The value of hinmokuCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_LessThan(String hinmokuCd) {
        regHinmokuCd(CK_LT, fRES(hinmokuCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     * @param hinmokuCd The value of hinmokuCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_GreaterEqual(String hinmokuCd) {
        regHinmokuCd(CK_GE, fRES(hinmokuCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     * @param hinmokuCd The value of hinmokuCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_LessEqual(String hinmokuCd) {
        regHinmokuCd(CK_LE, fRES(hinmokuCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
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
     * HINMOKU_CD: {VARCHAR(30)}
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
     * HINMOKU_CD: {VARCHAR(30)} <br>
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
     * HINMOKU_CD: {VARCHAR(30)}
     * @param hinmokuCd The value of hinmokuCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHinmokuCd_NotLikeSearch(String hinmokuCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hinmokuCd), xgetCValueHinmokuCd(), "HINMOKU_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     * @param hinmokuCd The value of hinmokuCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_PrefixSearch(String hinmokuCd) {
        setHinmokuCd_LikeSearch(hinmokuCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     */
    public void setHinmokuCd_IsNull() { regHinmokuCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     */
    public void setHinmokuCd_IsNullOrEmpty() { regHinmokuCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     */
    public void setHinmokuCd_IsNotNull() { regHinmokuCd(CK_ISNN, DOBJ); }

    protected void regHinmokuCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHinmokuCd(), "HINMOKU_CD"); }
    protected abstract ConditionValue xgetCValueHinmokuCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {BIGINT(19)}
     * @param stockNum The value of stockNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockNum_Equal(Long stockNum) {
        doSetStockNum_Equal(stockNum);
    }

    protected void doSetStockNum_Equal(Long stockNum) {
        regStockNum(CK_EQ, stockNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {BIGINT(19)}
     * @param stockNum The value of stockNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockNum_NotEqual(Long stockNum) {
        doSetStockNum_NotEqual(stockNum);
    }

    protected void doSetStockNum_NotEqual(Long stockNum) {
        regStockNum(CK_NES, stockNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {BIGINT(19)}
     * @param stockNum The value of stockNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockNum_GreaterThan(Long stockNum) {
        regStockNum(CK_GT, stockNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {BIGINT(19)}
     * @param stockNum The value of stockNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockNum_LessThan(Long stockNum) {
        regStockNum(CK_LT, stockNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {BIGINT(19)}
     * @param stockNum The value of stockNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockNum_GreaterEqual(Long stockNum) {
        regStockNum(CK_GE, stockNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {BIGINT(19)}
     * @param stockNum The value of stockNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockNum_LessEqual(Long stockNum) {
        regStockNum(CK_LE, stockNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {BIGINT(19)}
     * @param minNumber The min number of stockNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockNum(), "STOCK_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_NUM: {BIGINT(19)}
     * @param stockNumList The collection of stockNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockNum_InScope(Collection<Long> stockNumList) {
        doSetStockNum_InScope(stockNumList);
    }

    protected void doSetStockNum_InScope(Collection<Long> stockNumList) {
        regINS(CK_INS, cTL(stockNumList), xgetCValueStockNum(), "STOCK_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_NUM: {BIGINT(19)}
     * @param stockNumList The collection of stockNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockNum_NotInScope(Collection<Long> stockNumList) {
        doSetStockNum_NotInScope(stockNumList);
    }

    protected void doSetStockNum_NotInScope(Collection<Long> stockNumList) {
        regINS(CK_NINS, cTL(stockNumList), xgetCValueStockNum(), "STOCK_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_NUM: {BIGINT(19)}
     */
    public void setStockNum_IsNull() { regStockNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_NUM: {BIGINT(19)}
     */
    public void setStockNum_IsNotNull() { regStockNum(CK_ISNN, DOBJ); }

    protected void regStockNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockNum(), "STOCK_NUM"); }
    protected abstract ConditionValue xgetCValueStockNum();

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
     * PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param productNmKanji The value of productNmKanji as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNmKanji_Equal(String productNmKanji) {
        doSetProductNmKanji_Equal(fRES(productNmKanji));
    }

    protected void doSetProductNmKanji_Equal(String productNmKanji) {
        regProductNmKanji(CK_EQ, productNmKanji);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param productNmKanji The value of productNmKanji as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNmKanji_NotEqual(String productNmKanji) {
        doSetProductNmKanji_NotEqual(fRES(productNmKanji));
    }

    protected void doSetProductNmKanji_NotEqual(String productNmKanji) {
        regProductNmKanji(CK_NES, productNmKanji);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param productNmKanji The value of productNmKanji as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNmKanji_GreaterThan(String productNmKanji) {
        regProductNmKanji(CK_GT, fRES(productNmKanji));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param productNmKanji The value of productNmKanji as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNmKanji_LessThan(String productNmKanji) {
        regProductNmKanji(CK_LT, fRES(productNmKanji));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param productNmKanji The value of productNmKanji as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNmKanji_GreaterEqual(String productNmKanji) {
        regProductNmKanji(CK_GE, fRES(productNmKanji));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param productNmKanji The value of productNmKanji as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNmKanji_LessEqual(String productNmKanji) {
        regProductNmKanji(CK_LE, fRES(productNmKanji));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param productNmKanjiList The collection of productNmKanji as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNmKanji_InScope(Collection<String> productNmKanjiList) {
        doSetProductNmKanji_InScope(productNmKanjiList);
    }

    protected void doSetProductNmKanji_InScope(Collection<String> productNmKanjiList) {
        regINS(CK_INS, cTL(productNmKanjiList), xgetCValueProductNmKanji(), "PRODUCT_NM_KANJI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param productNmKanjiList The collection of productNmKanji as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNmKanji_NotInScope(Collection<String> productNmKanjiList) {
        doSetProductNmKanji_NotInScope(productNmKanjiList);
    }

    protected void doSetProductNmKanji_NotInScope(Collection<String> productNmKanjiList) {
        regINS(CK_NINS, cTL(productNmKanjiList), xgetCValueProductNmKanji(), "PRODUCT_NM_KANJI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * <pre>e.g. setProductNmKanji_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productNmKanji The value of productNmKanji as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductNmKanji_LikeSearch(String productNmKanji, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productNmKanji), xgetCValueProductNmKanji(), "PRODUCT_NM_KANJI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param productNmKanji The value of productNmKanji as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductNmKanji_NotLikeSearch(String productNmKanji, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productNmKanji), xgetCValueProductNmKanji(), "PRODUCT_NM_KANJI", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param productNmKanji The value of productNmKanji as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNmKanji_PrefixSearch(String productNmKanji) {
        setProductNmKanji_LikeSearch(productNmKanji, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_NM_KANJI: {VARCHAR(60)}
     */
    public void setProductNmKanji_IsNull() { regProductNmKanji(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_NM_KANJI: {VARCHAR(60)}
     */
    public void setProductNmKanji_IsNullOrEmpty() { regProductNmKanji(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_NM_KANJI: {VARCHAR(60)}
     */
    public void setProductNmKanji_IsNotNull() { regProductNmKanji(CK_ISNN, DOBJ); }

    protected void regProductNmKanji(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductNmKanji(), "PRODUCT_NM_KANJI"); }
    protected abstract ConditionValue xgetCValueProductNmKanji();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BARCODE: {VARCHAR(30)}
     * @param barcode The value of barcode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBarcode_Equal(String barcode) {
        doSetBarcode_Equal(fRES(barcode));
    }

    protected void doSetBarcode_Equal(String barcode) {
        regBarcode(CK_EQ, barcode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BARCODE: {VARCHAR(30)}
     * @param barcode The value of barcode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBarcode_NotEqual(String barcode) {
        doSetBarcode_NotEqual(fRES(barcode));
    }

    protected void doSetBarcode_NotEqual(String barcode) {
        regBarcode(CK_NES, barcode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BARCODE: {VARCHAR(30)}
     * @param barcode The value of barcode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBarcode_GreaterThan(String barcode) {
        regBarcode(CK_GT, fRES(barcode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BARCODE: {VARCHAR(30)}
     * @param barcode The value of barcode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBarcode_LessThan(String barcode) {
        regBarcode(CK_LT, fRES(barcode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BARCODE: {VARCHAR(30)}
     * @param barcode The value of barcode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBarcode_GreaterEqual(String barcode) {
        regBarcode(CK_GE, fRES(barcode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BARCODE: {VARCHAR(30)}
     * @param barcode The value of barcode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBarcode_LessEqual(String barcode) {
        regBarcode(CK_LE, fRES(barcode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BARCODE: {VARCHAR(30)}
     * @param barcodeList The collection of barcode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBarcode_InScope(Collection<String> barcodeList) {
        doSetBarcode_InScope(barcodeList);
    }

    protected void doSetBarcode_InScope(Collection<String> barcodeList) {
        regINS(CK_INS, cTL(barcodeList), xgetCValueBarcode(), "BARCODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BARCODE: {VARCHAR(30)}
     * @param barcodeList The collection of barcode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBarcode_NotInScope(Collection<String> barcodeList) {
        doSetBarcode_NotInScope(barcodeList);
    }

    protected void doSetBarcode_NotInScope(Collection<String> barcodeList) {
        regINS(CK_NINS, cTL(barcodeList), xgetCValueBarcode(), "BARCODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BARCODE: {VARCHAR(30)} <br>
     * <pre>e.g. setBarcode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param barcode The value of barcode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBarcode_LikeSearch(String barcode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(barcode), xgetCValueBarcode(), "BARCODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BARCODE: {VARCHAR(30)}
     * @param barcode The value of barcode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBarcode_NotLikeSearch(String barcode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(barcode), xgetCValueBarcode(), "BARCODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BARCODE: {VARCHAR(30)}
     * @param barcode The value of barcode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBarcode_PrefixSearch(String barcode) {
        setBarcode_LikeSearch(barcode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BARCODE: {VARCHAR(30)}
     */
    public void setBarcode_IsNull() { regBarcode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BARCODE: {VARCHAR(30)}
     */
    public void setBarcode_IsNullOrEmpty() { regBarcode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BARCODE: {VARCHAR(30)}
     */
    public void setBarcode_IsNotNull() { regBarcode(CK_ISNN, DOBJ); }

    protected void regBarcode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBarcode(), "BARCODE"); }
    protected abstract ConditionValue xgetCValueBarcode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCd The value of depositJanCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositJanCd_Equal(String depositJanCd) {
        doSetDepositJanCd_Equal(fRES(depositJanCd));
    }

    protected void doSetDepositJanCd_Equal(String depositJanCd) {
        regDepositJanCd(CK_EQ, depositJanCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCd The value of depositJanCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositJanCd_NotEqual(String depositJanCd) {
        doSetDepositJanCd_NotEqual(fRES(depositJanCd));
    }

    protected void doSetDepositJanCd_NotEqual(String depositJanCd) {
        regDepositJanCd(CK_NES, depositJanCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCd The value of depositJanCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositJanCd_GreaterThan(String depositJanCd) {
        regDepositJanCd(CK_GT, fRES(depositJanCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCd The value of depositJanCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositJanCd_LessThan(String depositJanCd) {
        regDepositJanCd(CK_LT, fRES(depositJanCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCd The value of depositJanCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositJanCd_GreaterEqual(String depositJanCd) {
        regDepositJanCd(CK_GE, fRES(depositJanCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCd The value of depositJanCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositJanCd_LessEqual(String depositJanCd) {
        regDepositJanCd(CK_LE, fRES(depositJanCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCdList The collection of depositJanCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositJanCd_InScope(Collection<String> depositJanCdList) {
        doSetDepositJanCd_InScope(depositJanCdList);
    }

    protected void doSetDepositJanCd_InScope(Collection<String> depositJanCdList) {
        regINS(CK_INS, cTL(depositJanCdList), xgetCValueDepositJanCd(), "DEPOSIT_JAN_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCdList The collection of depositJanCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositJanCd_NotInScope(Collection<String> depositJanCdList) {
        doSetDepositJanCd_NotInScope(depositJanCdList);
    }

    protected void doSetDepositJanCd_NotInScope(Collection<String> depositJanCdList) {
        regINS(CK_NINS, cTL(depositJanCdList), xgetCValueDepositJanCd(), "DEPOSIT_JAN_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDepositJanCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param depositJanCd The value of depositJanCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDepositJanCd_LikeSearch(String depositJanCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(depositJanCd), xgetCValueDepositJanCd(), "DEPOSIT_JAN_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCd The value of depositJanCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDepositJanCd_NotLikeSearch(String depositJanCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(depositJanCd), xgetCValueDepositJanCd(), "DEPOSIT_JAN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCd The value of depositJanCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositJanCd_PrefixSearch(String depositJanCd) {
        setDepositJanCd_LikeSearch(depositJanCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     */
    public void setDepositJanCd_IsNull() { regDepositJanCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     */
    public void setDepositJanCd_IsNullOrEmpty() { regDepositJanCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     */
    public void setDepositJanCd_IsNotNull() { regDepositJanCd(CK_ISNN, DOBJ); }

    protected void regDepositJanCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDepositJanCd(), "DEPOSIT_JAN_CD"); }
    protected abstract ConditionValue xgetCValueDepositJanCd();

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
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_Equal(String tenhanshaNm1) {
        doSetTenhanshaNm1_Equal(fRES(tenhanshaNm1));
    }

    protected void doSetTenhanshaNm1_Equal(String tenhanshaNm1) {
        regTenhanshaNm1(CK_EQ, tenhanshaNm1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_NotEqual(String tenhanshaNm1) {
        doSetTenhanshaNm1_NotEqual(fRES(tenhanshaNm1));
    }

    protected void doSetTenhanshaNm1_NotEqual(String tenhanshaNm1) {
        regTenhanshaNm1(CK_NES, tenhanshaNm1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_GreaterThan(String tenhanshaNm1) {
        regTenhanshaNm1(CK_GT, fRES(tenhanshaNm1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_LessThan(String tenhanshaNm1) {
        regTenhanshaNm1(CK_LT, fRES(tenhanshaNm1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_GreaterEqual(String tenhanshaNm1) {
        regTenhanshaNm1(CK_GE, fRES(tenhanshaNm1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_LessEqual(String tenhanshaNm1) {
        regTenhanshaNm1(CK_LE, fRES(tenhanshaNm1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1List The collection of tenhanshaNm1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_InScope(Collection<String> tenhanshaNm1List) {
        doSetTenhanshaNm1_InScope(tenhanshaNm1List);
    }

    protected void doSetTenhanshaNm1_InScope(Collection<String> tenhanshaNm1List) {
        regINS(CK_INS, cTL(tenhanshaNm1List), xgetCValueTenhanshaNm1(), "TENHANSHA_NM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1List The collection of tenhanshaNm1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_NotInScope(Collection<String> tenhanshaNm1List) {
        doSetTenhanshaNm1_NotInScope(tenhanshaNm1List);
    }

    protected void doSetTenhanshaNm1_NotInScope(Collection<String> tenhanshaNm1List) {
        regINS(CK_NINS, cTL(tenhanshaNm1List), xgetCValueTenhanshaNm1(), "TENHANSHA_NM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)} <br>
     * <pre>e.g. setTenhanshaNm1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaNm1 The value of tenhanshaNm1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaNm1_LikeSearch(String tenhanshaNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaNm1), xgetCValueTenhanshaNm1(), "TENHANSHA_NM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaNm1_NotLikeSearch(String tenhanshaNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaNm1), xgetCValueTenhanshaNm1(), "TENHANSHA_NM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_PrefixSearch(String tenhanshaNm1) {
        setTenhanshaNm1_LikeSearch(tenhanshaNm1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     */
    public void setTenhanshaNm1_IsNull() { regTenhanshaNm1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     */
    public void setTenhanshaNm1_IsNullOrEmpty() { regTenhanshaNm1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     */
    public void setTenhanshaNm1_IsNotNull() { regTenhanshaNm1(CK_ISNN, DOBJ); }

    protected void regTenhanshaNm1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaNm1(), "TENHANSHA_NM1"); }
    protected abstract ConditionValue xgetCValueTenhanshaNm1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_Equal(String tenhanshaNm2) {
        doSetTenhanshaNm2_Equal(fRES(tenhanshaNm2));
    }

    protected void doSetTenhanshaNm2_Equal(String tenhanshaNm2) {
        regTenhanshaNm2(CK_EQ, tenhanshaNm2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_NotEqual(String tenhanshaNm2) {
        doSetTenhanshaNm2_NotEqual(fRES(tenhanshaNm2));
    }

    protected void doSetTenhanshaNm2_NotEqual(String tenhanshaNm2) {
        regTenhanshaNm2(CK_NES, tenhanshaNm2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_GreaterThan(String tenhanshaNm2) {
        regTenhanshaNm2(CK_GT, fRES(tenhanshaNm2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_LessThan(String tenhanshaNm2) {
        regTenhanshaNm2(CK_LT, fRES(tenhanshaNm2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_GreaterEqual(String tenhanshaNm2) {
        regTenhanshaNm2(CK_GE, fRES(tenhanshaNm2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_LessEqual(String tenhanshaNm2) {
        regTenhanshaNm2(CK_LE, fRES(tenhanshaNm2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2List The collection of tenhanshaNm2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_InScope(Collection<String> tenhanshaNm2List) {
        doSetTenhanshaNm2_InScope(tenhanshaNm2List);
    }

    protected void doSetTenhanshaNm2_InScope(Collection<String> tenhanshaNm2List) {
        regINS(CK_INS, cTL(tenhanshaNm2List), xgetCValueTenhanshaNm2(), "TENHANSHA_NM2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2List The collection of tenhanshaNm2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_NotInScope(Collection<String> tenhanshaNm2List) {
        doSetTenhanshaNm2_NotInScope(tenhanshaNm2List);
    }

    protected void doSetTenhanshaNm2_NotInScope(Collection<String> tenhanshaNm2List) {
        regINS(CK_NINS, cTL(tenhanshaNm2List), xgetCValueTenhanshaNm2(), "TENHANSHA_NM2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)} <br>
     * <pre>e.g. setTenhanshaNm2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaNm2 The value of tenhanshaNm2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaNm2_LikeSearch(String tenhanshaNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaNm2), xgetCValueTenhanshaNm2(), "TENHANSHA_NM2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaNm2_NotLikeSearch(String tenhanshaNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaNm2), xgetCValueTenhanshaNm2(), "TENHANSHA_NM2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_PrefixSearch(String tenhanshaNm2) {
        setTenhanshaNm2_LikeSearch(tenhanshaNm2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     */
    public void setTenhanshaNm2_IsNull() { regTenhanshaNm2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     */
    public void setTenhanshaNm2_IsNullOrEmpty() { regTenhanshaNm2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     */
    public void setTenhanshaNm2_IsNotNull() { regTenhanshaNm2(CK_ISNN, DOBJ); }

    protected void regTenhanshaNm2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaNm2(), "TENHANSHA_NM2"); }
    protected abstract ConditionValue xgetCValueTenhanshaNm2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_Equal(String sapUserCd) {
        doSetSapUserCd_Equal(fRES(sapUserCd));
    }

    protected void doSetSapUserCd_Equal(String sapUserCd) {
        regSapUserCd(CK_EQ, sapUserCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_NotEqual(String sapUserCd) {
        doSetSapUserCd_NotEqual(fRES(sapUserCd));
    }

    protected void doSetSapUserCd_NotEqual(String sapUserCd) {
        regSapUserCd(CK_NES, sapUserCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_GreaterThan(String sapUserCd) {
        regSapUserCd(CK_GT, fRES(sapUserCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_LessThan(String sapUserCd) {
        regSapUserCd(CK_LT, fRES(sapUserCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_GreaterEqual(String sapUserCd) {
        regSapUserCd(CK_GE, fRES(sapUserCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_LessEqual(String sapUserCd) {
        regSapUserCd(CK_LE, fRES(sapUserCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCdList The collection of sapUserCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_InScope(Collection<String> sapUserCdList) {
        doSetSapUserCd_InScope(sapUserCdList);
    }

    protected void doSetSapUserCd_InScope(Collection<String> sapUserCdList) {
        regINS(CK_INS, cTL(sapUserCdList), xgetCValueSapUserCd(), "SAP_USER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCdList The collection of sapUserCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_NotInScope(Collection<String> sapUserCdList) {
        doSetSapUserCd_NotInScope(sapUserCdList);
    }

    protected void doSetSapUserCd_NotInScope(Collection<String> sapUserCdList) {
        regINS(CK_NINS, cTL(sapUserCdList), xgetCValueSapUserCd(), "SAP_USER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSapUserCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUserCd The value of sapUserCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUserCd_LikeSearch(String sapUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUserCd), xgetCValueSapUserCd(), "SAP_USER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUserCd_NotLikeSearch(String sapUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUserCd), xgetCValueSapUserCd(), "SAP_USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_PrefixSearch(String sapUserCd) {
        setSapUserCd_LikeSearch(sapUserCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     */
    public void setSapUserCd_IsNull() { regSapUserCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     */
    public void setSapUserCd_IsNullOrEmpty() { regSapUserCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     */
    public void setSapUserCd_IsNotNull() { regSapUserCd(CK_ISNN, DOBJ); }

    protected void regSapUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUserCd(), "SAP_USER_CD"); }
    protected abstract ConditionValue xgetCValueSapUserCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_Equal(String sapUserNm) {
        doSetSapUserNm_Equal(fRES(sapUserNm));
    }

    protected void doSetSapUserNm_Equal(String sapUserNm) {
        regSapUserNm(CK_EQ, sapUserNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_NotEqual(String sapUserNm) {
        doSetSapUserNm_NotEqual(fRES(sapUserNm));
    }

    protected void doSetSapUserNm_NotEqual(String sapUserNm) {
        regSapUserNm(CK_NES, sapUserNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_GreaterThan(String sapUserNm) {
        regSapUserNm(CK_GT, fRES(sapUserNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_LessThan(String sapUserNm) {
        regSapUserNm(CK_LT, fRES(sapUserNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_GreaterEqual(String sapUserNm) {
        regSapUserNm(CK_GE, fRES(sapUserNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_LessEqual(String sapUserNm) {
        regSapUserNm(CK_LE, fRES(sapUserNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNmList The collection of sapUserNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_InScope(Collection<String> sapUserNmList) {
        doSetSapUserNm_InScope(sapUserNmList);
    }

    protected void doSetSapUserNm_InScope(Collection<String> sapUserNmList) {
        regINS(CK_INS, cTL(sapUserNmList), xgetCValueSapUserNm(), "SAP_USER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNmList The collection of sapUserNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_NotInScope(Collection<String> sapUserNmList) {
        doSetSapUserNm_NotInScope(sapUserNmList);
    }

    protected void doSetSapUserNm_NotInScope(Collection<String> sapUserNmList) {
        regINS(CK_NINS, cTL(sapUserNmList), xgetCValueSapUserNm(), "SAP_USER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setSapUserNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUserNm The value of sapUserNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUserNm_LikeSearch(String sapUserNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUserNm), xgetCValueSapUserNm(), "SAP_USER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUserNm_NotLikeSearch(String sapUserNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUserNm), xgetCValueSapUserNm(), "SAP_USER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_PrefixSearch(String sapUserNm) {
        setSapUserNm_LikeSearch(sapUserNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     */
    public void setSapUserNm_IsNull() { regSapUserNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     */
    public void setSapUserNm_IsNullOrEmpty() { regSapUserNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     */
    public void setSapUserNm_IsNotNull() { regSapUserNm(CK_ISNN, DOBJ); }

    protected void regSapUserNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUserNm(), "SAP_USER_NM"); }
    protected abstract ConditionValue xgetCValueSapUserNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     * @param allocTypeCd The value of allocTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocTypeCd_Equal(String allocTypeCd) {
        doSetAllocTypeCd_Equal(fRES(allocTypeCd));
    }

    protected void doSetAllocTypeCd_Equal(String allocTypeCd) {
        regAllocTypeCd(CK_EQ, allocTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     * @param allocTypeCd The value of allocTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocTypeCd_NotEqual(String allocTypeCd) {
        doSetAllocTypeCd_NotEqual(fRES(allocTypeCd));
    }

    protected void doSetAllocTypeCd_NotEqual(String allocTypeCd) {
        regAllocTypeCd(CK_NES, allocTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     * @param allocTypeCd The value of allocTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocTypeCd_GreaterThan(String allocTypeCd) {
        regAllocTypeCd(CK_GT, fRES(allocTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     * @param allocTypeCd The value of allocTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocTypeCd_LessThan(String allocTypeCd) {
        regAllocTypeCd(CK_LT, fRES(allocTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     * @param allocTypeCd The value of allocTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocTypeCd_GreaterEqual(String allocTypeCd) {
        regAllocTypeCd(CK_GE, fRES(allocTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     * @param allocTypeCd The value of allocTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocTypeCd_LessEqual(String allocTypeCd) {
        regAllocTypeCd(CK_LE, fRES(allocTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     * @param allocTypeCdList The collection of allocTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocTypeCd_InScope(Collection<String> allocTypeCdList) {
        doSetAllocTypeCd_InScope(allocTypeCdList);
    }

    protected void doSetAllocTypeCd_InScope(Collection<String> allocTypeCdList) {
        regINS(CK_INS, cTL(allocTypeCdList), xgetCValueAllocTypeCd(), "ALLOC_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     * @param allocTypeCdList The collection of allocTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocTypeCd_NotInScope(Collection<String> allocTypeCdList) {
        doSetAllocTypeCd_NotInScope(allocTypeCdList);
    }

    protected void doSetAllocTypeCd_NotInScope(Collection<String> allocTypeCdList) {
        regINS(CK_NINS, cTL(allocTypeCdList), xgetCValueAllocTypeCd(), "ALLOC_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setAllocTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param allocTypeCd The value of allocTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAllocTypeCd_LikeSearch(String allocTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(allocTypeCd), xgetCValueAllocTypeCd(), "ALLOC_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     * @param allocTypeCd The value of allocTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAllocTypeCd_NotLikeSearch(String allocTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(allocTypeCd), xgetCValueAllocTypeCd(), "ALLOC_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     * @param allocTypeCd The value of allocTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocTypeCd_PrefixSearch(String allocTypeCd) {
        setAllocTypeCd_LikeSearch(allocTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     */
    public void setAllocTypeCd_IsNull() { regAllocTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     */
    public void setAllocTypeCd_IsNullOrEmpty() { regAllocTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     */
    public void setAllocTypeCd_IsNotNull() { regAllocTypeCd(CK_ISNN, DOBJ); }

    protected void regAllocTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocTypeCd(), "ALLOC_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueAllocTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @param lpSendFlg The value of lpSendFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_Equal(String lpSendFlg) {
        doSetLpSendFlg_Equal(fRES(lpSendFlg));
    }

    protected void doSetLpSendFlg_Equal(String lpSendFlg) {
        regLpSendFlg(CK_EQ, lpSendFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @param lpSendFlg The value of lpSendFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_NotEqual(String lpSendFlg) {
        doSetLpSendFlg_NotEqual(fRES(lpSendFlg));
    }

    protected void doSetLpSendFlg_NotEqual(String lpSendFlg) {
        regLpSendFlg(CK_NES, lpSendFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @param lpSendFlg The value of lpSendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_GreaterThan(String lpSendFlg) {
        regLpSendFlg(CK_GT, fRES(lpSendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @param lpSendFlg The value of lpSendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_LessThan(String lpSendFlg) {
        regLpSendFlg(CK_LT, fRES(lpSendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @param lpSendFlg The value of lpSendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_GreaterEqual(String lpSendFlg) {
        regLpSendFlg(CK_GE, fRES(lpSendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @param lpSendFlg The value of lpSendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_LessEqual(String lpSendFlg) {
        regLpSendFlg(CK_LE, fRES(lpSendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @param lpSendFlgList The collection of lpSendFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_InScope(Collection<String> lpSendFlgList) {
        doSetLpSendFlg_InScope(lpSendFlgList);
    }

    protected void doSetLpSendFlg_InScope(Collection<String> lpSendFlgList) {
        regINS(CK_INS, cTL(lpSendFlgList), xgetCValueLpSendFlg(), "LP_SEND_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @param lpSendFlgList The collection of lpSendFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_NotInScope(Collection<String> lpSendFlgList) {
        doSetLpSendFlg_NotInScope(lpSendFlgList);
    }

    protected void doSetLpSendFlg_NotInScope(Collection<String> lpSendFlgList) {
        regINS(CK_NINS, cTL(lpSendFlgList), xgetCValueLpSendFlg(), "LP_SEND_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)} <br>
     * <pre>e.g. setLpSendFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lpSendFlg The value of lpSendFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLpSendFlg_LikeSearch(String lpSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lpSendFlg), xgetCValueLpSendFlg(), "LP_SEND_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @param lpSendFlg The value of lpSendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLpSendFlg_NotLikeSearch(String lpSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lpSendFlg), xgetCValueLpSendFlg(), "LP_SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @param lpSendFlg The value of lpSendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_PrefixSearch(String lpSendFlg) {
        setLpSendFlg_LikeSearch(lpSendFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     */
    public void setLpSendFlg_IsNull() { regLpSendFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     */
    public void setLpSendFlg_IsNullOrEmpty() { regLpSendFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     */
    public void setLpSendFlg_IsNotNull() { regLpSendFlg(CK_ISNN, DOBJ); }

    protected void regLpSendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLpSendFlg(), "LP_SEND_FLG"); }
    protected abstract ConditionValue xgetCValueLpSendFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TYPE: {VARCHAR(30)}
     * @param productType The value of productType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductType_Equal(String productType) {
        doSetProductType_Equal(fRES(productType));
    }

    protected void doSetProductType_Equal(String productType) {
        regProductType(CK_EQ, productType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TYPE: {VARCHAR(30)}
     * @param productType The value of productType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductType_NotEqual(String productType) {
        doSetProductType_NotEqual(fRES(productType));
    }

    protected void doSetProductType_NotEqual(String productType) {
        regProductType(CK_NES, productType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TYPE: {VARCHAR(30)}
     * @param productType The value of productType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductType_GreaterThan(String productType) {
        regProductType(CK_GT, fRES(productType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TYPE: {VARCHAR(30)}
     * @param productType The value of productType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductType_LessThan(String productType) {
        regProductType(CK_LT, fRES(productType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TYPE: {VARCHAR(30)}
     * @param productType The value of productType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductType_GreaterEqual(String productType) {
        regProductType(CK_GE, fRES(productType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TYPE: {VARCHAR(30)}
     * @param productType The value of productType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductType_LessEqual(String productType) {
        regProductType(CK_LE, fRES(productType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_TYPE: {VARCHAR(30)}
     * @param productTypeList The collection of productType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductType_InScope(Collection<String> productTypeList) {
        doSetProductType_InScope(productTypeList);
    }

    protected void doSetProductType_InScope(Collection<String> productTypeList) {
        regINS(CK_INS, cTL(productTypeList), xgetCValueProductType(), "PRODUCT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_TYPE: {VARCHAR(30)}
     * @param productTypeList The collection of productType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductType_NotInScope(Collection<String> productTypeList) {
        doSetProductType_NotInScope(productTypeList);
    }

    protected void doSetProductType_NotInScope(Collection<String> productTypeList) {
        regINS(CK_NINS, cTL(productTypeList), xgetCValueProductType(), "PRODUCT_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_TYPE: {VARCHAR(30)} <br>
     * <pre>e.g. setProductType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productType The value of productType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductType_LikeSearch(String productType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productType), xgetCValueProductType(), "PRODUCT_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_TYPE: {VARCHAR(30)}
     * @param productType The value of productType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductType_NotLikeSearch(String productType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productType), xgetCValueProductType(), "PRODUCT_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_TYPE: {VARCHAR(30)}
     * @param productType The value of productType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductType_PrefixSearch(String productType) {
        setProductType_LikeSearch(productType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_TYPE: {VARCHAR(30)}
     */
    public void setProductType_IsNull() { regProductType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_TYPE: {VARCHAR(30)}
     */
    public void setProductType_IsNullOrEmpty() { regProductType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_TYPE: {VARCHAR(30)}
     */
    public void setProductType_IsNotNull() { regProductType(CK_ISNN, DOBJ); }

    protected void regProductType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductType(), "PRODUCT_TYPE"); }
    protected abstract ConditionValue xgetCValueProductType();

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
    public HpSLCFunction<ErInventoryInstDtlCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ErInventoryInstDtlCB.class);
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
    public HpSLCFunction<ErInventoryInstDtlCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ErInventoryInstDtlCB.class);
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
    public HpSLCFunction<ErInventoryInstDtlCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ErInventoryInstDtlCB.class);
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
    public HpSLCFunction<ErInventoryInstDtlCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ErInventoryInstDtlCB.class);
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
    public HpSLCFunction<ErInventoryInstDtlCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ErInventoryInstDtlCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ErInventoryInstDtlCB&gt;() {
     *     public void query(ErInventoryInstDtlCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ErInventoryInstDtlCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ErInventoryInstDtlCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ErInventoryInstDtlCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ErInventoryInstDtlCQ sq);

    protected ErInventoryInstDtlCB xcreateScalarConditionCB() {
        ErInventoryInstDtlCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ErInventoryInstDtlCB xcreateScalarConditionPartitionByCB() {
        ErInventoryInstDtlCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ErInventoryInstDtlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ErInventoryInstDtlCB cb = new ErInventoryInstDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "INVENTORY_INST_DTL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ErInventoryInstDtlCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ErInventoryInstDtlCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ErInventoryInstDtlCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ErInventoryInstDtlCB cb = new ErInventoryInstDtlCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "INVENTORY_INST_DTL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ErInventoryInstDtlCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ErInventoryInstDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ErInventoryInstDtlCB cb = new ErInventoryInstDtlCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ErInventoryInstDtlCQ sq);

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
    protected ErInventoryInstDtlCB newMyCB() {
        return new ErInventoryInstDtlCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ErInventoryInstDtlCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
