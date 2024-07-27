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
 * The abstract condition-query of t_stock_record.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTStockRecordCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTStockRecordCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_stock_record";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stockRecordId The value of stockRecordId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockRecordId_Equal(Long stockRecordId) {
        doSetStockRecordId_Equal(stockRecordId);
    }

    protected void doSetStockRecordId_Equal(Long stockRecordId) {
        regStockRecordId(CK_EQ, stockRecordId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stockRecordId The value of stockRecordId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockRecordId_NotEqual(Long stockRecordId) {
        doSetStockRecordId_NotEqual(stockRecordId);
    }

    protected void doSetStockRecordId_NotEqual(Long stockRecordId) {
        regStockRecordId(CK_NES, stockRecordId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stockRecordId The value of stockRecordId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockRecordId_GreaterThan(Long stockRecordId) {
        regStockRecordId(CK_GT, stockRecordId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stockRecordId The value of stockRecordId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockRecordId_LessThan(Long stockRecordId) {
        regStockRecordId(CK_LT, stockRecordId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stockRecordId The value of stockRecordId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockRecordId_GreaterEqual(Long stockRecordId) {
        regStockRecordId(CK_GE, stockRecordId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stockRecordId The value of stockRecordId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockRecordId_LessEqual(Long stockRecordId) {
        regStockRecordId(CK_LE, stockRecordId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of stockRecordId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockRecordId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockRecordId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockRecordId(), "STOCK_RECORD_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stockRecordIdList The collection of stockRecordId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockRecordId_InScope(Collection<Long> stockRecordIdList) {
        doSetStockRecordId_InScope(stockRecordIdList);
    }

    protected void doSetStockRecordId_InScope(Collection<Long> stockRecordIdList) {
        regINS(CK_INS, cTL(stockRecordIdList), xgetCValueStockRecordId(), "STOCK_RECORD_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stockRecordIdList The collection of stockRecordId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockRecordId_NotInScope(Collection<Long> stockRecordIdList) {
        doSetStockRecordId_NotInScope(stockRecordIdList);
    }

    protected void doSetStockRecordId_NotInScope(Collection<Long> stockRecordIdList) {
        regINS(CK_NINS, cTL(stockRecordIdList), xgetCValueStockRecordId(), "STOCK_RECORD_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setStockRecordId_IsNull() { regStockRecordId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setStockRecordId_IsNotNull() { regStockRecordId(CK_ISNN, DOBJ); }

    protected void regStockRecordId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockRecordId(), "STOCK_RECORD_ID"); }
    protected abstract ConditionValue xgetCValueStockRecordId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_Equal(Long clientId) {
        doSetClientId_Equal(clientId);
    }

    protected void doSetClientId_Equal(Long clientId) {
        regClientId(CK_EQ, clientId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_NotEqual(Long clientId) {
        doSetClientId_NotEqual(clientId);
    }

    protected void doSetClientId_NotEqual(Long clientId) {
        regClientId(CK_NES, clientId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientIdList The collection of clientId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_InScope(Collection<Long> clientIdList) {
        doSetClientId_InScope(clientIdList);
    }

    protected void doSetClientId_InScope(Collection<Long> clientIdList) {
        regINS(CK_INS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CLIENT_ID from m_client where ...)} <br />
     * m_client by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'in-scope'. (NotNull)
     */
    public void inScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_InScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", false);
    }
    public abstract String keepClientId_InScopeRelation_MClient(MClientCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CLIENT_ID from m_client where ...)} <br />
     * m_client by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'not in-scope'. (NotNull)
     */
    public void notInScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_NotInScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", true);
    }
    public abstract String keepClientId_NotInScopeRelation_MClient(MClientCQ sq);

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

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
     * REFERENCE_DT: {VARCHAR(8)}
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
     * REFERENCE_DT: {VARCHAR(8)}
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
     * REFERENCE_DT: {VARCHAR(8)}
     * @param referenceDt The value of referenceDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferenceDt_GreaterThan(String referenceDt) {
        regReferenceDt(CK_GT, fRES(referenceDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERENCE_DT: {VARCHAR(8)}
     * @param referenceDt The value of referenceDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferenceDt_LessThan(String referenceDt) {
        regReferenceDt(CK_LT, fRES(referenceDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERENCE_DT: {VARCHAR(8)}
     * @param referenceDt The value of referenceDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferenceDt_GreaterEqual(String referenceDt) {
        regReferenceDt(CK_GE, fRES(referenceDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERENCE_DT: {VARCHAR(8)}
     * @param referenceDt The value of referenceDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferenceDt_LessEqual(String referenceDt) {
        regReferenceDt(CK_LE, fRES(referenceDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFERENCE_DT: {VARCHAR(8)}
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
     * REFERENCE_DT: {VARCHAR(8)}
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
     * REFERENCE_DT: {VARCHAR(8)} <br>
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
     * REFERENCE_DT: {VARCHAR(8)}
     * @param referenceDt The value of referenceDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReferenceDt_NotLikeSearch(String referenceDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(referenceDt), xgetCValueReferenceDt(), "REFERENCE_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFERENCE_DT: {VARCHAR(8)}
     * @param referenceDt The value of referenceDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferenceDt_PrefixSearch(String referenceDt) {
        setReferenceDt_LikeSearch(referenceDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REFERENCE_DT: {VARCHAR(8)}
     */
    public void setReferenceDt_IsNull() { regReferenceDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REFERENCE_DT: {VARCHAR(8)}
     */
    public void setReferenceDt_IsNullOrEmpty() { regReferenceDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REFERENCE_DT: {VARCHAR(8)}
     */
    public void setReferenceDt_IsNotNull() { regReferenceDt(CK_ISNN, DOBJ); }

    protected void regReferenceDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReferenceDt(), "REFERENCE_DT"); }
    protected abstract ConditionValue xgetCValueReferenceDt();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param stockNum The value of stockNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockNum_Equal(java.math.BigDecimal stockNum) {
        doSetStockNum_Equal(stockNum);
    }

    protected void doSetStockNum_Equal(java.math.BigDecimal stockNum) {
        regStockNum(CK_EQ, stockNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param stockNum The value of stockNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockNum_NotEqual(java.math.BigDecimal stockNum) {
        doSetStockNum_NotEqual(stockNum);
    }

    protected void doSetStockNum_NotEqual(java.math.BigDecimal stockNum) {
        regStockNum(CK_NES, stockNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param stockNum The value of stockNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockNum_GreaterThan(java.math.BigDecimal stockNum) {
        regStockNum(CK_GT, stockNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param stockNum The value of stockNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockNum_LessThan(java.math.BigDecimal stockNum) {
        regStockNum(CK_LT, stockNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param stockNum The value of stockNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockNum_GreaterEqual(java.math.BigDecimal stockNum) {
        regStockNum(CK_GE, stockNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param stockNum The value of stockNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockNum_LessEqual(java.math.BigDecimal stockNum) {
        regStockNum(CK_LE, stockNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of stockNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockNum(), "STOCK_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param stockNumList The collection of stockNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockNum_InScope(Collection<java.math.BigDecimal> stockNumList) {
        doSetStockNum_InScope(stockNumList);
    }

    protected void doSetStockNum_InScope(Collection<java.math.BigDecimal> stockNumList) {
        regINS(CK_INS, cTL(stockNumList), xgetCValueStockNum(), "STOCK_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param stockNumList The collection of stockNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockNum_NotInScope(Collection<java.math.BigDecimal> stockNumList) {
        doSetStockNum_NotInScope(stockNumList);
    }

    protected void doSetStockNum_NotInScope(Collection<java.math.BigDecimal> stockNumList) {
        regINS(CK_NINS, cTL(stockNumList), xgetCValueStockNum(), "STOCK_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setStockNum_IsNull() { regStockNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setStockNum_IsNotNull() { regStockNum(CK_ISNN, DOBJ); }

    protected void regStockNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockNum(), "STOCK_NUM"); }
    protected abstract ConditionValue xgetCValueStockNum();

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
     * COMMENT: {VARCHAR(255)}
     * @param comment The value of comment as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment_Equal(String comment) {
        doSetComment_Equal(fRES(comment));
    }

    protected void doSetComment_Equal(String comment) {
        regComment(CK_EQ, comment);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT: {VARCHAR(255)}
     * @param comment The value of comment as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment_NotEqual(String comment) {
        doSetComment_NotEqual(fRES(comment));
    }

    protected void doSetComment_NotEqual(String comment) {
        regComment(CK_NES, comment);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT: {VARCHAR(255)}
     * @param comment The value of comment as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment_GreaterThan(String comment) {
        regComment(CK_GT, fRES(comment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT: {VARCHAR(255)}
     * @param comment The value of comment as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment_LessThan(String comment) {
        regComment(CK_LT, fRES(comment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT: {VARCHAR(255)}
     * @param comment The value of comment as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment_GreaterEqual(String comment) {
        regComment(CK_GE, fRES(comment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMENT: {VARCHAR(255)}
     * @param comment The value of comment as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment_LessEqual(String comment) {
        regComment(CK_LE, fRES(comment));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMMENT: {VARCHAR(255)}
     * @param commentList The collection of comment as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment_InScope(Collection<String> commentList) {
        doSetComment_InScope(commentList);
    }

    protected void doSetComment_InScope(Collection<String> commentList) {
        regINS(CK_INS, cTL(commentList), xgetCValueComment(), "COMMENT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMMENT: {VARCHAR(255)}
     * @param commentList The collection of comment as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment_NotInScope(Collection<String> commentList) {
        doSetComment_NotInScope(commentList);
    }

    protected void doSetComment_NotInScope(Collection<String> commentList) {
        regINS(CK_NINS, cTL(commentList), xgetCValueComment(), "COMMENT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENT: {VARCHAR(255)} <br>
     * <pre>e.g. setComment_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param comment The value of comment as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setComment_LikeSearch(String comment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(comment), xgetCValueComment(), "COMMENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENT: {VARCHAR(255)}
     * @param comment The value of comment as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setComment_NotLikeSearch(String comment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(comment), xgetCValueComment(), "COMMENT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMENT: {VARCHAR(255)}
     * @param comment The value of comment as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setComment_PrefixSearch(String comment) {
        setComment_LikeSearch(comment, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMMENT: {VARCHAR(255)}
     */
    public void setComment_IsNull() { regComment(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMMENT: {VARCHAR(255)}
     */
    public void setComment_IsNullOrEmpty() { regComment(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMMENT: {VARCHAR(255)}
     */
    public void setComment_IsNotNull() { regComment(CK_ISNN, DOBJ); }

    protected void regComment(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueComment(), "COMMENT"); }
    protected abstract ConditionValue xgetCValueComment();

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
    public HpSLCFunction<TStockRecordCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TStockRecordCB.class);
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
    public HpSLCFunction<TStockRecordCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TStockRecordCB.class);
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
    public HpSLCFunction<TStockRecordCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TStockRecordCB.class);
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
    public HpSLCFunction<TStockRecordCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TStockRecordCB.class);
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
    public HpSLCFunction<TStockRecordCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TStockRecordCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TStockRecordCB&gt;() {
     *     public void query(TStockRecordCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TStockRecordCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TStockRecordCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockRecordCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TStockRecordCQ sq);

    protected TStockRecordCB xcreateScalarConditionCB() {
        TStockRecordCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TStockRecordCB xcreateScalarConditionPartitionByCB() {
        TStockRecordCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TStockRecordCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockRecordCB cb = new TStockRecordCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "STOCK_RECORD_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TStockRecordCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TStockRecordCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TStockRecordCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockRecordCB cb = new TStockRecordCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "STOCK_RECORD_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TStockRecordCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TStockRecordCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockRecordCB cb = new TStockRecordCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TStockRecordCQ sq);

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
    protected TStockRecordCB newMyCB() {
        return new TStockRecordCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TStockRecordCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
