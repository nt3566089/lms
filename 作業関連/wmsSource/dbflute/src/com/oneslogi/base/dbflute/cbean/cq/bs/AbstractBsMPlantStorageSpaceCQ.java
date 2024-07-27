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
 * The abstract condition-query of m_plant_storage_space.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMPlantStorageSpaceCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMPlantStorageSpaceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "m_plant_storage_space";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @param plantStorageSpaceId The value of plantStorageSpaceId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlantStorageSpaceId_Equal(Long plantStorageSpaceId) {
        doSetPlantStorageSpaceId_Equal(plantStorageSpaceId);
    }

    protected void doSetPlantStorageSpaceId_Equal(Long plantStorageSpaceId) {
        regPlantStorageSpaceId(CK_EQ, plantStorageSpaceId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @param plantStorageSpaceId The value of plantStorageSpaceId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlantStorageSpaceId_NotEqual(Long plantStorageSpaceId) {
        doSetPlantStorageSpaceId_NotEqual(plantStorageSpaceId);
    }

    protected void doSetPlantStorageSpaceId_NotEqual(Long plantStorageSpaceId) {
        regPlantStorageSpaceId(CK_NES, plantStorageSpaceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @param plantStorageSpaceId The value of plantStorageSpaceId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlantStorageSpaceId_GreaterThan(Long plantStorageSpaceId) {
        regPlantStorageSpaceId(CK_GT, plantStorageSpaceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @param plantStorageSpaceId The value of plantStorageSpaceId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlantStorageSpaceId_LessThan(Long plantStorageSpaceId) {
        regPlantStorageSpaceId(CK_LT, plantStorageSpaceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @param plantStorageSpaceId The value of plantStorageSpaceId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlantStorageSpaceId_GreaterEqual(Long plantStorageSpaceId) {
        regPlantStorageSpaceId(CK_GE, plantStorageSpaceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @param plantStorageSpaceId The value of plantStorageSpaceId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlantStorageSpaceId_LessEqual(Long plantStorageSpaceId) {
        regPlantStorageSpaceId(CK_LE, plantStorageSpaceId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @param minNumber The min number of plantStorageSpaceId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of plantStorageSpaceId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPlantStorageSpaceId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePlantStorageSpaceId(), "PLANT_STORAGE_SPACE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @param plantStorageSpaceIdList The collection of plantStorageSpaceId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantStorageSpaceId_InScope(Collection<Long> plantStorageSpaceIdList) {
        doSetPlantStorageSpaceId_InScope(plantStorageSpaceIdList);
    }

    protected void doSetPlantStorageSpaceId_InScope(Collection<Long> plantStorageSpaceIdList) {
        regINS(CK_INS, cTL(plantStorageSpaceIdList), xgetCValuePlantStorageSpaceId(), "PLANT_STORAGE_SPACE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @param plantStorageSpaceIdList The collection of plantStorageSpaceId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantStorageSpaceId_NotInScope(Collection<Long> plantStorageSpaceIdList) {
        doSetPlantStorageSpaceId_NotInScope(plantStorageSpaceIdList);
    }

    protected void doSetPlantStorageSpaceId_NotInScope(Collection<Long> plantStorageSpaceIdList) {
        regINS(CK_NINS, cTL(plantStorageSpaceIdList), xgetCValuePlantStorageSpaceId(), "PLANT_STORAGE_SPACE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     */
    public void setPlantStorageSpaceId_IsNull() { regPlantStorageSpaceId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     */
    public void setPlantStorageSpaceId_IsNotNull() { regPlantStorageSpaceId(CK_ISNN, DOBJ); }

    protected void regPlantStorageSpaceId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlantStorageSpaceId(), "PLANT_STORAGE_SPACE_ID"); }
    protected abstract ConditionValue xgetCValuePlantStorageSpaceId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCd The value of ownerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_Equal(String ownerCd) {
        doSetOwnerCd_Equal(fRES(ownerCd));
    }

    protected void doSetOwnerCd_Equal(String ownerCd) {
        regOwnerCd(CK_EQ, ownerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCd The value of ownerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_NotEqual(String ownerCd) {
        doSetOwnerCd_NotEqual(fRES(ownerCd));
    }

    protected void doSetOwnerCd_NotEqual(String ownerCd) {
        regOwnerCd(CK_NES, ownerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCd The value of ownerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_GreaterThan(String ownerCd) {
        regOwnerCd(CK_GT, fRES(ownerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCd The value of ownerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_LessThan(String ownerCd) {
        regOwnerCd(CK_LT, fRES(ownerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCd The value of ownerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_GreaterEqual(String ownerCd) {
        regOwnerCd(CK_GE, fRES(ownerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCd The value of ownerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_LessEqual(String ownerCd) {
        regOwnerCd(CK_LE, fRES(ownerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCdList The collection of ownerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_InScope(Collection<String> ownerCdList) {
        doSetOwnerCd_InScope(ownerCdList);
    }

    protected void doSetOwnerCd_InScope(Collection<String> ownerCdList) {
        regINS(CK_INS, cTL(ownerCdList), xgetCValueOwnerCd(), "OWNER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCdList The collection of ownerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_NotInScope(Collection<String> ownerCdList) {
        doSetOwnerCd_NotInScope(ownerCdList);
    }

    protected void doSetOwnerCd_NotInScope(Collection<String> ownerCdList) {
        regINS(CK_NINS, cTL(ownerCdList), xgetCValueOwnerCd(), "OWNER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setOwnerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownerCd The value of ownerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnerCd_LikeSearch(String ownerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownerCd), xgetCValueOwnerCd(), "OWNER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCd The value of ownerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnerCd_NotLikeSearch(String ownerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownerCd), xgetCValueOwnerCd(), "OWNER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCd The value of ownerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_PrefixSearch(String ownerCd) {
        setOwnerCd_LikeSearch(ownerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     */
    public void setOwnerCd_IsNull() { regOwnerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     */
    public void setOwnerCd_IsNullOrEmpty() { regOwnerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     */
    public void setOwnerCd_IsNotNull() { regOwnerCd(CK_ISNN, DOBJ); }

    protected void regOwnerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnerCd(), "OWNER_CD"); }
    protected abstract ConditionValue xgetCValueOwnerCd();

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
     * COMPANY_NM: {VARCHAR(60)}
     * @param companyNm The value of companyNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyNm_Equal(String companyNm) {
        doSetCompanyNm_Equal(fRES(companyNm));
    }

    protected void doSetCompanyNm_Equal(String companyNm) {
        regCompanyNm(CK_EQ, companyNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_NM: {VARCHAR(60)}
     * @param companyNm The value of companyNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyNm_NotEqual(String companyNm) {
        doSetCompanyNm_NotEqual(fRES(companyNm));
    }

    protected void doSetCompanyNm_NotEqual(String companyNm) {
        regCompanyNm(CK_NES, companyNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_NM: {VARCHAR(60)}
     * @param companyNm The value of companyNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyNm_GreaterThan(String companyNm) {
        regCompanyNm(CK_GT, fRES(companyNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_NM: {VARCHAR(60)}
     * @param companyNm The value of companyNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyNm_LessThan(String companyNm) {
        regCompanyNm(CK_LT, fRES(companyNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_NM: {VARCHAR(60)}
     * @param companyNm The value of companyNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyNm_GreaterEqual(String companyNm) {
        regCompanyNm(CK_GE, fRES(companyNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_NM: {VARCHAR(60)}
     * @param companyNm The value of companyNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyNm_LessEqual(String companyNm) {
        regCompanyNm(CK_LE, fRES(companyNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANY_NM: {VARCHAR(60)}
     * @param companyNmList The collection of companyNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyNm_InScope(Collection<String> companyNmList) {
        doSetCompanyNm_InScope(companyNmList);
    }

    protected void doSetCompanyNm_InScope(Collection<String> companyNmList) {
        regINS(CK_INS, cTL(companyNmList), xgetCValueCompanyNm(), "COMPANY_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANY_NM: {VARCHAR(60)}
     * @param companyNmList The collection of companyNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyNm_NotInScope(Collection<String> companyNmList) {
        doSetCompanyNm_NotInScope(companyNmList);
    }

    protected void doSetCompanyNm_NotInScope(Collection<String> companyNmList) {
        regINS(CK_NINS, cTL(companyNmList), xgetCValueCompanyNm(), "COMPANY_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setCompanyNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param companyNm The value of companyNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompanyNm_LikeSearch(String companyNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(companyNm), xgetCValueCompanyNm(), "COMPANY_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_NM: {VARCHAR(60)}
     * @param companyNm The value of companyNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompanyNm_NotLikeSearch(String companyNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(companyNm), xgetCValueCompanyNm(), "COMPANY_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_NM: {VARCHAR(60)}
     * @param companyNm The value of companyNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyNm_PrefixSearch(String companyNm) {
        setCompanyNm_LikeSearch(companyNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPANY_NM: {VARCHAR(60)}
     */
    public void setCompanyNm_IsNull() { regCompanyNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMPANY_NM: {VARCHAR(60)}
     */
    public void setCompanyNm_IsNullOrEmpty() { regCompanyNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPANY_NM: {VARCHAR(60)}
     */
    public void setCompanyNm_IsNotNull() { regCompanyNm(CK_ISNN, DOBJ); }

    protected void regCompanyNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompanyNm(), "COMPANY_NM"); }
    protected abstract ConditionValue xgetCValueCompanyNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_NM: {VARCHAR(60)}
     * @param plantNm The value of plantNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantNm_Equal(String plantNm) {
        doSetPlantNm_Equal(fRES(plantNm));
    }

    protected void doSetPlantNm_Equal(String plantNm) {
        regPlantNm(CK_EQ, plantNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_NM: {VARCHAR(60)}
     * @param plantNm The value of plantNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantNm_NotEqual(String plantNm) {
        doSetPlantNm_NotEqual(fRES(plantNm));
    }

    protected void doSetPlantNm_NotEqual(String plantNm) {
        regPlantNm(CK_NES, plantNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_NM: {VARCHAR(60)}
     * @param plantNm The value of plantNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantNm_GreaterThan(String plantNm) {
        regPlantNm(CK_GT, fRES(plantNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_NM: {VARCHAR(60)}
     * @param plantNm The value of plantNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantNm_LessThan(String plantNm) {
        regPlantNm(CK_LT, fRES(plantNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_NM: {VARCHAR(60)}
     * @param plantNm The value of plantNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantNm_GreaterEqual(String plantNm) {
        regPlantNm(CK_GE, fRES(plantNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_NM: {VARCHAR(60)}
     * @param plantNm The value of plantNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantNm_LessEqual(String plantNm) {
        regPlantNm(CK_LE, fRES(plantNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANT_NM: {VARCHAR(60)}
     * @param plantNmList The collection of plantNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantNm_InScope(Collection<String> plantNmList) {
        doSetPlantNm_InScope(plantNmList);
    }

    protected void doSetPlantNm_InScope(Collection<String> plantNmList) {
        regINS(CK_INS, cTL(plantNmList), xgetCValuePlantNm(), "PLANT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANT_NM: {VARCHAR(60)}
     * @param plantNmList The collection of plantNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantNm_NotInScope(Collection<String> plantNmList) {
        doSetPlantNm_NotInScope(plantNmList);
    }

    protected void doSetPlantNm_NotInScope(Collection<String> plantNmList) {
        regINS(CK_NINS, cTL(plantNmList), xgetCValuePlantNm(), "PLANT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANT_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setPlantNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param plantNm The value of plantNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlantNm_LikeSearch(String plantNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(plantNm), xgetCValuePlantNm(), "PLANT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANT_NM: {VARCHAR(60)}
     * @param plantNm The value of plantNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlantNm_NotLikeSearch(String plantNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(plantNm), xgetCValuePlantNm(), "PLANT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANT_NM: {VARCHAR(60)}
     * @param plantNm The value of plantNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantNm_PrefixSearch(String plantNm) {
        setPlantNm_LikeSearch(plantNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANT_NM: {VARCHAR(60)}
     */
    public void setPlantNm_IsNull() { regPlantNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLANT_NM: {VARCHAR(60)}
     */
    public void setPlantNm_IsNullOrEmpty() { regPlantNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANT_NM: {VARCHAR(60)}
     */
    public void setPlantNm_IsNotNull() { regPlantNm(CK_ISNN, DOBJ); }

    protected void regPlantNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlantNm(), "PLANT_NM"); }
    protected abstract ConditionValue xgetCValuePlantNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_NM1: {VARCHAR(60)}
     * @param storageSpaceNm1 The value of storageSpaceNm1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceNm1_Equal(String storageSpaceNm1) {
        doSetStorageSpaceNm1_Equal(fRES(storageSpaceNm1));
    }

    protected void doSetStorageSpaceNm1_Equal(String storageSpaceNm1) {
        regStorageSpaceNm1(CK_EQ, storageSpaceNm1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_NM1: {VARCHAR(60)}
     * @param storageSpaceNm1 The value of storageSpaceNm1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceNm1_NotEqual(String storageSpaceNm1) {
        doSetStorageSpaceNm1_NotEqual(fRES(storageSpaceNm1));
    }

    protected void doSetStorageSpaceNm1_NotEqual(String storageSpaceNm1) {
        regStorageSpaceNm1(CK_NES, storageSpaceNm1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_NM1: {VARCHAR(60)}
     * @param storageSpaceNm1 The value of storageSpaceNm1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceNm1_GreaterThan(String storageSpaceNm1) {
        regStorageSpaceNm1(CK_GT, fRES(storageSpaceNm1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_NM1: {VARCHAR(60)}
     * @param storageSpaceNm1 The value of storageSpaceNm1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceNm1_LessThan(String storageSpaceNm1) {
        regStorageSpaceNm1(CK_LT, fRES(storageSpaceNm1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_NM1: {VARCHAR(60)}
     * @param storageSpaceNm1 The value of storageSpaceNm1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceNm1_GreaterEqual(String storageSpaceNm1) {
        regStorageSpaceNm1(CK_GE, fRES(storageSpaceNm1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_NM1: {VARCHAR(60)}
     * @param storageSpaceNm1 The value of storageSpaceNm1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceNm1_LessEqual(String storageSpaceNm1) {
        regStorageSpaceNm1(CK_LE, fRES(storageSpaceNm1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_NM1: {VARCHAR(60)}
     * @param storageSpaceNm1List The collection of storageSpaceNm1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceNm1_InScope(Collection<String> storageSpaceNm1List) {
        doSetStorageSpaceNm1_InScope(storageSpaceNm1List);
    }

    protected void doSetStorageSpaceNm1_InScope(Collection<String> storageSpaceNm1List) {
        regINS(CK_INS, cTL(storageSpaceNm1List), xgetCValueStorageSpaceNm1(), "STORAGE_SPACE_NM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_NM1: {VARCHAR(60)}
     * @param storageSpaceNm1List The collection of storageSpaceNm1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceNm1_NotInScope(Collection<String> storageSpaceNm1List) {
        doSetStorageSpaceNm1_NotInScope(storageSpaceNm1List);
    }

    protected void doSetStorageSpaceNm1_NotInScope(Collection<String> storageSpaceNm1List) {
        regINS(CK_NINS, cTL(storageSpaceNm1List), xgetCValueStorageSpaceNm1(), "STORAGE_SPACE_NM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_NM1: {VARCHAR(60)} <br>
     * <pre>e.g. setStorageSpaceNm1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storageSpaceNm1 The value of storageSpaceNm1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStorageSpaceNm1_LikeSearch(String storageSpaceNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storageSpaceNm1), xgetCValueStorageSpaceNm1(), "STORAGE_SPACE_NM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_NM1: {VARCHAR(60)}
     * @param storageSpaceNm1 The value of storageSpaceNm1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStorageSpaceNm1_NotLikeSearch(String storageSpaceNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storageSpaceNm1), xgetCValueStorageSpaceNm1(), "STORAGE_SPACE_NM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_NM1: {VARCHAR(60)}
     * @param storageSpaceNm1 The value of storageSpaceNm1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceNm1_PrefixSearch(String storageSpaceNm1) {
        setStorageSpaceNm1_LikeSearch(storageSpaceNm1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORAGE_SPACE_NM1: {VARCHAR(60)}
     */
    public void setStorageSpaceNm1_IsNull() { regStorageSpaceNm1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORAGE_SPACE_NM1: {VARCHAR(60)}
     */
    public void setStorageSpaceNm1_IsNullOrEmpty() { regStorageSpaceNm1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORAGE_SPACE_NM1: {VARCHAR(60)}
     */
    public void setStorageSpaceNm1_IsNotNull() { regStorageSpaceNm1(CK_ISNN, DOBJ); }

    protected void regStorageSpaceNm1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStorageSpaceNm1(), "STORAGE_SPACE_NM1"); }
    protected abstract ConditionValue xgetCValueStorageSpaceNm1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_NM2: {VARCHAR(60)}
     * @param storageSpaceNm2 The value of storageSpaceNm2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceNm2_Equal(String storageSpaceNm2) {
        doSetStorageSpaceNm2_Equal(fRES(storageSpaceNm2));
    }

    protected void doSetStorageSpaceNm2_Equal(String storageSpaceNm2) {
        regStorageSpaceNm2(CK_EQ, storageSpaceNm2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_NM2: {VARCHAR(60)}
     * @param storageSpaceNm2 The value of storageSpaceNm2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceNm2_NotEqual(String storageSpaceNm2) {
        doSetStorageSpaceNm2_NotEqual(fRES(storageSpaceNm2));
    }

    protected void doSetStorageSpaceNm2_NotEqual(String storageSpaceNm2) {
        regStorageSpaceNm2(CK_NES, storageSpaceNm2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_NM2: {VARCHAR(60)}
     * @param storageSpaceNm2 The value of storageSpaceNm2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceNm2_GreaterThan(String storageSpaceNm2) {
        regStorageSpaceNm2(CK_GT, fRES(storageSpaceNm2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_NM2: {VARCHAR(60)}
     * @param storageSpaceNm2 The value of storageSpaceNm2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceNm2_LessThan(String storageSpaceNm2) {
        regStorageSpaceNm2(CK_LT, fRES(storageSpaceNm2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_NM2: {VARCHAR(60)}
     * @param storageSpaceNm2 The value of storageSpaceNm2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceNm2_GreaterEqual(String storageSpaceNm2) {
        regStorageSpaceNm2(CK_GE, fRES(storageSpaceNm2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_NM2: {VARCHAR(60)}
     * @param storageSpaceNm2 The value of storageSpaceNm2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceNm2_LessEqual(String storageSpaceNm2) {
        regStorageSpaceNm2(CK_LE, fRES(storageSpaceNm2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_NM2: {VARCHAR(60)}
     * @param storageSpaceNm2List The collection of storageSpaceNm2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceNm2_InScope(Collection<String> storageSpaceNm2List) {
        doSetStorageSpaceNm2_InScope(storageSpaceNm2List);
    }

    protected void doSetStorageSpaceNm2_InScope(Collection<String> storageSpaceNm2List) {
        regINS(CK_INS, cTL(storageSpaceNm2List), xgetCValueStorageSpaceNm2(), "STORAGE_SPACE_NM2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_NM2: {VARCHAR(60)}
     * @param storageSpaceNm2List The collection of storageSpaceNm2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceNm2_NotInScope(Collection<String> storageSpaceNm2List) {
        doSetStorageSpaceNm2_NotInScope(storageSpaceNm2List);
    }

    protected void doSetStorageSpaceNm2_NotInScope(Collection<String> storageSpaceNm2List) {
        regINS(CK_NINS, cTL(storageSpaceNm2List), xgetCValueStorageSpaceNm2(), "STORAGE_SPACE_NM2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_NM2: {VARCHAR(60)} <br>
     * <pre>e.g. setStorageSpaceNm2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storageSpaceNm2 The value of storageSpaceNm2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStorageSpaceNm2_LikeSearch(String storageSpaceNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storageSpaceNm2), xgetCValueStorageSpaceNm2(), "STORAGE_SPACE_NM2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_NM2: {VARCHAR(60)}
     * @param storageSpaceNm2 The value of storageSpaceNm2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStorageSpaceNm2_NotLikeSearch(String storageSpaceNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storageSpaceNm2), xgetCValueStorageSpaceNm2(), "STORAGE_SPACE_NM2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_NM2: {VARCHAR(60)}
     * @param storageSpaceNm2 The value of storageSpaceNm2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceNm2_PrefixSearch(String storageSpaceNm2) {
        setStorageSpaceNm2_LikeSearch(storageSpaceNm2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORAGE_SPACE_NM2: {VARCHAR(60)}
     */
    public void setStorageSpaceNm2_IsNull() { regStorageSpaceNm2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORAGE_SPACE_NM2: {VARCHAR(60)}
     */
    public void setStorageSpaceNm2_IsNullOrEmpty() { regStorageSpaceNm2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORAGE_SPACE_NM2: {VARCHAR(60)}
     */
    public void setStorageSpaceNm2_IsNotNull() { regStorageSpaceNm2(CK_ISNN, DOBJ); }

    protected void regStorageSpaceNm2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStorageSpaceNm2(), "STORAGE_SPACE_NM2"); }
    protected abstract ConditionValue xgetCValueStorageSpaceNm2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_NM: {VARCHAR(60)}
     * @param countryNm The value of countryNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryNm_Equal(String countryNm) {
        doSetCountryNm_Equal(fRES(countryNm));
    }

    protected void doSetCountryNm_Equal(String countryNm) {
        regCountryNm(CK_EQ, countryNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_NM: {VARCHAR(60)}
     * @param countryNm The value of countryNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryNm_NotEqual(String countryNm) {
        doSetCountryNm_NotEqual(fRES(countryNm));
    }

    protected void doSetCountryNm_NotEqual(String countryNm) {
        regCountryNm(CK_NES, countryNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_NM: {VARCHAR(60)}
     * @param countryNm The value of countryNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryNm_GreaterThan(String countryNm) {
        regCountryNm(CK_GT, fRES(countryNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_NM: {VARCHAR(60)}
     * @param countryNm The value of countryNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryNm_LessThan(String countryNm) {
        regCountryNm(CK_LT, fRES(countryNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_NM: {VARCHAR(60)}
     * @param countryNm The value of countryNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryNm_GreaterEqual(String countryNm) {
        regCountryNm(CK_GE, fRES(countryNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_NM: {VARCHAR(60)}
     * @param countryNm The value of countryNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryNm_LessEqual(String countryNm) {
        regCountryNm(CK_LE, fRES(countryNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNTRY_NM: {VARCHAR(60)}
     * @param countryNmList The collection of countryNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryNm_InScope(Collection<String> countryNmList) {
        doSetCountryNm_InScope(countryNmList);
    }

    protected void doSetCountryNm_InScope(Collection<String> countryNmList) {
        regINS(CK_INS, cTL(countryNmList), xgetCValueCountryNm(), "COUNTRY_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNTRY_NM: {VARCHAR(60)}
     * @param countryNmList The collection of countryNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryNm_NotInScope(Collection<String> countryNmList) {
        doSetCountryNm_NotInScope(countryNmList);
    }

    protected void doSetCountryNm_NotInScope(Collection<String> countryNmList) {
        regINS(CK_NINS, cTL(countryNmList), xgetCValueCountryNm(), "COUNTRY_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRY_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setCountryNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param countryNm The value of countryNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCountryNm_LikeSearch(String countryNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(countryNm), xgetCValueCountryNm(), "COUNTRY_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRY_NM: {VARCHAR(60)}
     * @param countryNm The value of countryNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCountryNm_NotLikeSearch(String countryNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(countryNm), xgetCValueCountryNm(), "COUNTRY_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRY_NM: {VARCHAR(60)}
     * @param countryNm The value of countryNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryNm_PrefixSearch(String countryNm) {
        setCountryNm_LikeSearch(countryNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COUNTRY_NM: {VARCHAR(60)}
     */
    public void setCountryNm_IsNull() { regCountryNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COUNTRY_NM: {VARCHAR(60)}
     */
    public void setCountryNm_IsNullOrEmpty() { regCountryNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COUNTRY_NM: {VARCHAR(60)}
     */
    public void setCountryNm_IsNotNull() { regCountryNm(CK_ISNN, DOBJ); }

    protected void regCountryNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCountryNm(), "COUNTRY_NM"); }
    protected abstract ConditionValue xgetCValueCountryNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1 The value of address1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_Equal(String address1) {
        doSetAddress1_Equal(fRES(address1));
    }

    protected void doSetAddress1_Equal(String address1) {
        regAddress1(CK_EQ, address1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1 The value of address1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_NotEqual(String address1) {
        doSetAddress1_NotEqual(fRES(address1));
    }

    protected void doSetAddress1_NotEqual(String address1) {
        regAddress1(CK_NES, address1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1 The value of address1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_GreaterThan(String address1) {
        regAddress1(CK_GT, fRES(address1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1 The value of address1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_LessThan(String address1) {
        regAddress1(CK_LT, fRES(address1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1 The value of address1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_GreaterEqual(String address1) {
        regAddress1(CK_GE, fRES(address1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1 The value of address1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_LessEqual(String address1) {
        regAddress1(CK_LE, fRES(address1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1List The collection of address1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_InScope(Collection<String> address1List) {
        doSetAddress1_InScope(address1List);
    }

    protected void doSetAddress1_InScope(Collection<String> address1List) {
        regINS(CK_INS, cTL(address1List), xgetCValueAddress1(), "ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1List The collection of address1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_NotInScope(Collection<String> address1List) {
        doSetAddress1_NotInScope(address1List);
    }

    protected void doSetAddress1_NotInScope(Collection<String> address1List) {
        regINS(CK_NINS, cTL(address1List), xgetCValueAddress1(), "ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {VARCHAR(60)} <br>
     * <pre>e.g. setAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address1 The value of address1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress1_LikeSearch(String address1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address1), xgetCValueAddress1(), "ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1 The value of address1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress1_NotLikeSearch(String address1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address1), xgetCValueAddress1(), "ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1 The value of address1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_PrefixSearch(String address1) {
        setAddress1_LikeSearch(address1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     */
    public void setAddress1_IsNull() { regAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     */
    public void setAddress1_IsNullOrEmpty() { regAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     */
    public void setAddress1_IsNotNull() { regAddress1(CK_ISNN, DOBJ); }

    protected void regAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress1(), "ADDRESS1"); }
    protected abstract ConditionValue xgetCValueAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCd The value of zipCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_Equal(String zipCd) {
        doSetZipCd_Equal(fRES(zipCd));
    }

    protected void doSetZipCd_Equal(String zipCd) {
        regZipCd(CK_EQ, zipCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCd The value of zipCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_NotEqual(String zipCd) {
        doSetZipCd_NotEqual(fRES(zipCd));
    }

    protected void doSetZipCd_NotEqual(String zipCd) {
        regZipCd(CK_NES, zipCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCd The value of zipCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_GreaterThan(String zipCd) {
        regZipCd(CK_GT, fRES(zipCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCd The value of zipCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_LessThan(String zipCd) {
        regZipCd(CK_LT, fRES(zipCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCd The value of zipCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_GreaterEqual(String zipCd) {
        regZipCd(CK_GE, fRES(zipCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCd The value of zipCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_LessEqual(String zipCd) {
        regZipCd(CK_LE, fRES(zipCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCdList The collection of zipCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_InScope(Collection<String> zipCdList) {
        doSetZipCd_InScope(zipCdList);
    }

    protected void doSetZipCd_InScope(Collection<String> zipCdList) {
        regINS(CK_INS, cTL(zipCdList), xgetCValueZipCd(), "ZIP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCdList The collection of zipCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_NotInScope(Collection<String> zipCdList) {
        doSetZipCd_NotInScope(zipCdList);
    }

    protected void doSetZipCd_NotInScope(Collection<String> zipCdList) {
        regINS(CK_NINS, cTL(zipCdList), xgetCValueZipCd(), "ZIP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZIP_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setZipCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zipCd The value of zipCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZipCd_LikeSearch(String zipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zipCd), xgetCValueZipCd(), "ZIP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCd The value of zipCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZipCd_NotLikeSearch(String zipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zipCd), xgetCValueZipCd(), "ZIP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCd The value of zipCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_PrefixSearch(String zipCd) {
        setZipCd_LikeSearch(zipCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     */
    public void setZipCd_IsNull() { regZipCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     */
    public void setZipCd_IsNullOrEmpty() { regZipCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     */
    public void setZipCd_IsNotNull() { regZipCd(CK_ISNN, DOBJ); }

    protected void regZipCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZipCd(), "ZIP_CD"); }
    protected abstract ConditionValue xgetCValueZipCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2 The value of address2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_Equal(String address2) {
        doSetAddress2_Equal(fRES(address2));
    }

    protected void doSetAddress2_Equal(String address2) {
        regAddress2(CK_EQ, address2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2 The value of address2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_NotEqual(String address2) {
        doSetAddress2_NotEqual(fRES(address2));
    }

    protected void doSetAddress2_NotEqual(String address2) {
        regAddress2(CK_NES, address2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2 The value of address2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterThan(String address2) {
        regAddress2(CK_GT, fRES(address2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2 The value of address2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessThan(String address2) {
        regAddress2(CK_LT, fRES(address2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2 The value of address2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterEqual(String address2) {
        regAddress2(CK_GE, fRES(address2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2 The value of address2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessEqual(String address2) {
        regAddress2(CK_LE, fRES(address2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2List The collection of address2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_InScope(Collection<String> address2List) {
        doSetAddress2_InScope(address2List);
    }

    protected void doSetAddress2_InScope(Collection<String> address2List) {
        regINS(CK_INS, cTL(address2List), xgetCValueAddress2(), "ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2List The collection of address2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_NotInScope(Collection<String> address2List) {
        doSetAddress2_NotInScope(address2List);
    }

    protected void doSetAddress2_NotInScope(Collection<String> address2List) {
        regINS(CK_NINS, cTL(address2List), xgetCValueAddress2(), "ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {VARCHAR(60)} <br>
     * <pre>e.g. setAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address2 The value of address2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress2_LikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address2), xgetCValueAddress2(), "ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2 The value of address2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress2_NotLikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address2), xgetCValueAddress2(), "ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2 The value of address2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_PrefixSearch(String address2) {
        setAddress2_LikeSearch(address2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     */
    public void setAddress2_IsNull() { regAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     */
    public void setAddress2_IsNullOrEmpty() { regAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     */
    public void setAddress2_IsNotNull() { regAddress2(CK_ISNN, DOBJ); }

    protected void regAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress2(), "ADDRESS2"); }
    protected abstract ConditionValue xgetCValueAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3 The value of address3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_Equal(String address3) {
        doSetAddress3_Equal(fRES(address3));
    }

    protected void doSetAddress3_Equal(String address3) {
        regAddress3(CK_EQ, address3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3 The value of address3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_NotEqual(String address3) {
        doSetAddress3_NotEqual(fRES(address3));
    }

    protected void doSetAddress3_NotEqual(String address3) {
        regAddress3(CK_NES, address3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3 The value of address3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_GreaterThan(String address3) {
        regAddress3(CK_GT, fRES(address3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3 The value of address3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_LessThan(String address3) {
        regAddress3(CK_LT, fRES(address3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3 The value of address3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_GreaterEqual(String address3) {
        regAddress3(CK_GE, fRES(address3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3 The value of address3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_LessEqual(String address3) {
        regAddress3(CK_LE, fRES(address3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3List The collection of address3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_InScope(Collection<String> address3List) {
        doSetAddress3_InScope(address3List);
    }

    protected void doSetAddress3_InScope(Collection<String> address3List) {
        regINS(CK_INS, cTL(address3List), xgetCValueAddress3(), "ADDRESS3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3List The collection of address3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_NotInScope(Collection<String> address3List) {
        doSetAddress3_NotInScope(address3List);
    }

    protected void doSetAddress3_NotInScope(Collection<String> address3List) {
        regINS(CK_NINS, cTL(address3List), xgetCValueAddress3(), "ADDRESS3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {VARCHAR(60)} <br>
     * <pre>e.g. setAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address3 The value of address3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress3_LikeSearch(String address3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address3), xgetCValueAddress3(), "ADDRESS3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3 The value of address3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress3_NotLikeSearch(String address3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address3), xgetCValueAddress3(), "ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3 The value of address3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_PrefixSearch(String address3) {
        setAddress3_LikeSearch(address3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     */
    public void setAddress3_IsNull() { regAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     */
    public void setAddress3_IsNullOrEmpty() { regAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     */
    public void setAddress3_IsNotNull() { regAddress3(CK_ISNN, DOBJ); }

    protected void regAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress3(), "ADDRESS3"); }
    protected abstract ConditionValue xgetCValueAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_Equal(String telNo) {
        doSetTelNo_Equal(fRES(telNo));
    }

    protected void doSetTelNo_Equal(String telNo) {
        regTelNo(CK_EQ, telNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_NotEqual(String telNo) {
        doSetTelNo_NotEqual(fRES(telNo));
    }

    protected void doSetTelNo_NotEqual(String telNo) {
        regTelNo(CK_NES, telNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_GreaterThan(String telNo) {
        regTelNo(CK_GT, fRES(telNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_LessThan(String telNo) {
        regTelNo(CK_LT, fRES(telNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_GreaterEqual(String telNo) {
        regTelNo(CK_GE, fRES(telNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_LessEqual(String telNo) {
        regTelNo(CK_LE, fRES(telNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNoList The collection of telNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_InScope(Collection<String> telNoList) {
        doSetTelNo_InScope(telNoList);
    }

    protected void doSetTelNo_InScope(Collection<String> telNoList) {
        regINS(CK_INS, cTL(telNoList), xgetCValueTelNo(), "TEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNoList The collection of telNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_NotInScope(Collection<String> telNoList) {
        doSetTelNo_NotInScope(telNoList);
    }

    protected void doSetTelNo_NotInScope(Collection<String> telNoList) {
        regINS(CK_NINS, cTL(telNoList), xgetCValueTelNo(), "TEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEL_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setTelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param telNo The value of telNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTelNo_LikeSearch(String telNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(telNo), xgetCValueTelNo(), "TEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTelNo_NotLikeSearch(String telNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(telNo), xgetCValueTelNo(), "TEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_PrefixSearch(String telNo) {
        setTelNo_LikeSearch(telNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     */
    public void setTelNo_IsNull() { regTelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     */
    public void setTelNo_IsNullOrEmpty() { regTelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     */
    public void setTelNo_IsNotNull() { regTelNo(CK_ISNN, DOBJ); }

    protected void regTelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTelNo(), "TEL_NO"); }
    protected abstract ConditionValue xgetCValueTelNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX_NO: {VARCHAR(30)}
     * @param faxNo The value of faxNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFaxNo_Equal(String faxNo) {
        doSetFaxNo_Equal(fRES(faxNo));
    }

    protected void doSetFaxNo_Equal(String faxNo) {
        regFaxNo(CK_EQ, faxNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX_NO: {VARCHAR(30)}
     * @param faxNo The value of faxNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFaxNo_NotEqual(String faxNo) {
        doSetFaxNo_NotEqual(fRES(faxNo));
    }

    protected void doSetFaxNo_NotEqual(String faxNo) {
        regFaxNo(CK_NES, faxNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX_NO: {VARCHAR(30)}
     * @param faxNo The value of faxNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFaxNo_GreaterThan(String faxNo) {
        regFaxNo(CK_GT, fRES(faxNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX_NO: {VARCHAR(30)}
     * @param faxNo The value of faxNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFaxNo_LessThan(String faxNo) {
        regFaxNo(CK_LT, fRES(faxNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX_NO: {VARCHAR(30)}
     * @param faxNo The value of faxNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFaxNo_GreaterEqual(String faxNo) {
        regFaxNo(CK_GE, fRES(faxNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX_NO: {VARCHAR(30)}
     * @param faxNo The value of faxNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFaxNo_LessEqual(String faxNo) {
        regFaxNo(CK_LE, fRES(faxNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FAX_NO: {VARCHAR(30)}
     * @param faxNoList The collection of faxNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFaxNo_InScope(Collection<String> faxNoList) {
        doSetFaxNo_InScope(faxNoList);
    }

    protected void doSetFaxNo_InScope(Collection<String> faxNoList) {
        regINS(CK_INS, cTL(faxNoList), xgetCValueFaxNo(), "FAX_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FAX_NO: {VARCHAR(30)}
     * @param faxNoList The collection of faxNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFaxNo_NotInScope(Collection<String> faxNoList) {
        doSetFaxNo_NotInScope(faxNoList);
    }

    protected void doSetFaxNo_NotInScope(Collection<String> faxNoList) {
        regINS(CK_NINS, cTL(faxNoList), xgetCValueFaxNo(), "FAX_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAX_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setFaxNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param faxNo The value of faxNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFaxNo_LikeSearch(String faxNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(faxNo), xgetCValueFaxNo(), "FAX_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAX_NO: {VARCHAR(30)}
     * @param faxNo The value of faxNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFaxNo_NotLikeSearch(String faxNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(faxNo), xgetCValueFaxNo(), "FAX_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAX_NO: {VARCHAR(30)}
     * @param faxNo The value of faxNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFaxNo_PrefixSearch(String faxNo) {
        setFaxNo_LikeSearch(faxNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FAX_NO: {VARCHAR(30)}
     */
    public void setFaxNo_IsNull() { regFaxNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FAX_NO: {VARCHAR(30)}
     */
    public void setFaxNo_IsNullOrEmpty() { regFaxNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FAX_NO: {VARCHAR(30)}
     */
    public void setFaxNo_IsNotNull() { regFaxNo(CK_ISNN, DOBJ); }

    protected void regFaxNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFaxNo(), "FAX_NO"); }
    protected abstract ConditionValue xgetCValueFaxNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LANG_NM: {VARCHAR(60)}
     * @param langNm The value of langNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLangNm_Equal(String langNm) {
        doSetLangNm_Equal(fRES(langNm));
    }

    protected void doSetLangNm_Equal(String langNm) {
        regLangNm(CK_EQ, langNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LANG_NM: {VARCHAR(60)}
     * @param langNm The value of langNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLangNm_NotEqual(String langNm) {
        doSetLangNm_NotEqual(fRES(langNm));
    }

    protected void doSetLangNm_NotEqual(String langNm) {
        regLangNm(CK_NES, langNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LANG_NM: {VARCHAR(60)}
     * @param langNm The value of langNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLangNm_GreaterThan(String langNm) {
        regLangNm(CK_GT, fRES(langNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LANG_NM: {VARCHAR(60)}
     * @param langNm The value of langNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLangNm_LessThan(String langNm) {
        regLangNm(CK_LT, fRES(langNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LANG_NM: {VARCHAR(60)}
     * @param langNm The value of langNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLangNm_GreaterEqual(String langNm) {
        regLangNm(CK_GE, fRES(langNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LANG_NM: {VARCHAR(60)}
     * @param langNm The value of langNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLangNm_LessEqual(String langNm) {
        regLangNm(CK_LE, fRES(langNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LANG_NM: {VARCHAR(60)}
     * @param langNmList The collection of langNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLangNm_InScope(Collection<String> langNmList) {
        doSetLangNm_InScope(langNmList);
    }

    protected void doSetLangNm_InScope(Collection<String> langNmList) {
        regINS(CK_INS, cTL(langNmList), xgetCValueLangNm(), "LANG_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LANG_NM: {VARCHAR(60)}
     * @param langNmList The collection of langNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLangNm_NotInScope(Collection<String> langNmList) {
        doSetLangNm_NotInScope(langNmList);
    }

    protected void doSetLangNm_NotInScope(Collection<String> langNmList) {
        regINS(CK_NINS, cTL(langNmList), xgetCValueLangNm(), "LANG_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LANG_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setLangNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param langNm The value of langNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLangNm_LikeSearch(String langNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(langNm), xgetCValueLangNm(), "LANG_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LANG_NM: {VARCHAR(60)}
     * @param langNm The value of langNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLangNm_NotLikeSearch(String langNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(langNm), xgetCValueLangNm(), "LANG_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LANG_NM: {VARCHAR(60)}
     * @param langNm The value of langNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLangNm_PrefixSearch(String langNm) {
        setLangNm_LikeSearch(langNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LANG_NM: {VARCHAR(60)}
     */
    public void setLangNm_IsNull() { regLangNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LANG_NM: {VARCHAR(60)}
     */
    public void setLangNm_IsNullOrEmpty() { regLangNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LANG_NM: {VARCHAR(60)}
     */
    public void setLangNm_IsNotNull() { regLangNm(CK_ISNN, DOBJ); }

    protected void regLangNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLangNm(), "LANG_NM"); }
    protected abstract ConditionValue xgetCValueLangNm();

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
     * BASE_TYPE_CD: {VARCHAR(30)}
     * @param baseTypeCd The value of baseTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseTypeCd_Equal(String baseTypeCd) {
        doSetBaseTypeCd_Equal(fRES(baseTypeCd));
    }

    protected void doSetBaseTypeCd_Equal(String baseTypeCd) {
        regBaseTypeCd(CK_EQ, baseTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_TYPE_CD: {VARCHAR(30)}
     * @param baseTypeCd The value of baseTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseTypeCd_NotEqual(String baseTypeCd) {
        doSetBaseTypeCd_NotEqual(fRES(baseTypeCd));
    }

    protected void doSetBaseTypeCd_NotEqual(String baseTypeCd) {
        regBaseTypeCd(CK_NES, baseTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_TYPE_CD: {VARCHAR(30)}
     * @param baseTypeCd The value of baseTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseTypeCd_GreaterThan(String baseTypeCd) {
        regBaseTypeCd(CK_GT, fRES(baseTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_TYPE_CD: {VARCHAR(30)}
     * @param baseTypeCd The value of baseTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseTypeCd_LessThan(String baseTypeCd) {
        regBaseTypeCd(CK_LT, fRES(baseTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_TYPE_CD: {VARCHAR(30)}
     * @param baseTypeCd The value of baseTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseTypeCd_GreaterEqual(String baseTypeCd) {
        regBaseTypeCd(CK_GE, fRES(baseTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_TYPE_CD: {VARCHAR(30)}
     * @param baseTypeCd The value of baseTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseTypeCd_LessEqual(String baseTypeCd) {
        regBaseTypeCd(CK_LE, fRES(baseTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BASE_TYPE_CD: {VARCHAR(30)}
     * @param baseTypeCdList The collection of baseTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseTypeCd_InScope(Collection<String> baseTypeCdList) {
        doSetBaseTypeCd_InScope(baseTypeCdList);
    }

    protected void doSetBaseTypeCd_InScope(Collection<String> baseTypeCdList) {
        regINS(CK_INS, cTL(baseTypeCdList), xgetCValueBaseTypeCd(), "BASE_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BASE_TYPE_CD: {VARCHAR(30)}
     * @param baseTypeCdList The collection of baseTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseTypeCd_NotInScope(Collection<String> baseTypeCdList) {
        doSetBaseTypeCd_NotInScope(baseTypeCdList);
    }

    protected void doSetBaseTypeCd_NotInScope(Collection<String> baseTypeCdList) {
        regINS(CK_NINS, cTL(baseTypeCdList), xgetCValueBaseTypeCd(), "BASE_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setBaseTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param baseTypeCd The value of baseTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBaseTypeCd_LikeSearch(String baseTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(baseTypeCd), xgetCValueBaseTypeCd(), "BASE_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_TYPE_CD: {VARCHAR(30)}
     * @param baseTypeCd The value of baseTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBaseTypeCd_NotLikeSearch(String baseTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(baseTypeCd), xgetCValueBaseTypeCd(), "BASE_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_TYPE_CD: {VARCHAR(30)}
     * @param baseTypeCd The value of baseTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseTypeCd_PrefixSearch(String baseTypeCd) {
        setBaseTypeCd_LikeSearch(baseTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BASE_TYPE_CD: {VARCHAR(30)}
     */
    public void setBaseTypeCd_IsNull() { regBaseTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BASE_TYPE_CD: {VARCHAR(30)}
     */
    public void setBaseTypeCd_IsNullOrEmpty() { regBaseTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BASE_TYPE_CD: {VARCHAR(30)}
     */
    public void setBaseTypeCd_IsNotNull() { regBaseTypeCd(CK_ISNN, DOBJ); }

    protected void regBaseTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBaseTypeCd(), "BASE_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueBaseTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNm The value of baseNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseNm_Equal(String baseNm) {
        doSetBaseNm_Equal(fRES(baseNm));
    }

    protected void doSetBaseNm_Equal(String baseNm) {
        regBaseNm(CK_EQ, baseNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNm The value of baseNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseNm_NotEqual(String baseNm) {
        doSetBaseNm_NotEqual(fRES(baseNm));
    }

    protected void doSetBaseNm_NotEqual(String baseNm) {
        regBaseNm(CK_NES, baseNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNm The value of baseNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseNm_GreaterThan(String baseNm) {
        regBaseNm(CK_GT, fRES(baseNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNm The value of baseNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseNm_LessThan(String baseNm) {
        regBaseNm(CK_LT, fRES(baseNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNm The value of baseNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseNm_GreaterEqual(String baseNm) {
        regBaseNm(CK_GE, fRES(baseNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNm The value of baseNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseNm_LessEqual(String baseNm) {
        regBaseNm(CK_LE, fRES(baseNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNmList The collection of baseNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseNm_InScope(Collection<String> baseNmList) {
        doSetBaseNm_InScope(baseNmList);
    }

    protected void doSetBaseNm_InScope(Collection<String> baseNmList) {
        regINS(CK_INS, cTL(baseNmList), xgetCValueBaseNm(), "BASE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNmList The collection of baseNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseNm_NotInScope(Collection<String> baseNmList) {
        doSetBaseNm_NotInScope(baseNmList);
    }

    protected void doSetBaseNm_NotInScope(Collection<String> baseNmList) {
        regINS(CK_NINS, cTL(baseNmList), xgetCValueBaseNm(), "BASE_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setBaseNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param baseNm The value of baseNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBaseNm_LikeSearch(String baseNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(baseNm), xgetCValueBaseNm(), "BASE_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNm The value of baseNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBaseNm_NotLikeSearch(String baseNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(baseNm), xgetCValueBaseNm(), "BASE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNm The value of baseNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseNm_PrefixSearch(String baseNm) {
        setBaseNm_LikeSearch(baseNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     */
    public void setBaseNm_IsNull() { regBaseNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     */
    public void setBaseNm_IsNullOrEmpty() { regBaseNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     */
    public void setBaseNm_IsNotNull() { regBaseNm(CK_ISNN, DOBJ); }

    protected void regBaseNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBaseNm(), "BASE_NM"); }
    protected abstract ConditionValue xgetCValueBaseNm();

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
    public HpSLCFunction<MPlantStorageSpaceCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MPlantStorageSpaceCB.class);
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
    public HpSLCFunction<MPlantStorageSpaceCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MPlantStorageSpaceCB.class);
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
    public HpSLCFunction<MPlantStorageSpaceCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MPlantStorageSpaceCB.class);
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
    public HpSLCFunction<MPlantStorageSpaceCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MPlantStorageSpaceCB.class);
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
    public HpSLCFunction<MPlantStorageSpaceCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MPlantStorageSpaceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MPlantStorageSpaceCB&gt;() {
     *     public void query(MPlantStorageSpaceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MPlantStorageSpaceCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MPlantStorageSpaceCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MPlantStorageSpaceCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MPlantStorageSpaceCQ sq);

    protected MPlantStorageSpaceCB xcreateScalarConditionCB() {
        MPlantStorageSpaceCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MPlantStorageSpaceCB xcreateScalarConditionPartitionByCB() {
        MPlantStorageSpaceCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MPlantStorageSpaceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MPlantStorageSpaceCB cb = new MPlantStorageSpaceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PLANT_STORAGE_SPACE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MPlantStorageSpaceCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MPlantStorageSpaceCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MPlantStorageSpaceCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MPlantStorageSpaceCB cb = new MPlantStorageSpaceCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PLANT_STORAGE_SPACE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MPlantStorageSpaceCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MPlantStorageSpaceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MPlantStorageSpaceCB cb = new MPlantStorageSpaceCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MPlantStorageSpaceCQ sq);

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
    protected MPlantStorageSpaceCB newMyCB() {
        return new MPlantStorageSpaceCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MPlantStorageSpaceCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
