package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.cq.ciq.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The base condition-query of m_plant_storage_space.
 * @author DBFlute(AutoGenerator)
 */
public class BsMPlantStorageSpaceCQ extends AbstractBsMPlantStorageSpaceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MPlantStorageSpaceCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMPlantStorageSpaceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_plant_storage_space) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MPlantStorageSpaceCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MPlantStorageSpaceCIQ xcreateCIQ() {
        MPlantStorageSpaceCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MPlantStorageSpaceCIQ xnewCIQ() {
        return new MPlantStorageSpaceCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_plant_storage_space on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MPlantStorageSpaceCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MPlantStorageSpaceCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _plantStorageSpaceId;
    public ConditionValue xdfgetPlantStorageSpaceId()
    { if (_plantStorageSpaceId == null) { _plantStorageSpaceId = nCV(); }
      return _plantStorageSpaceId; }
    protected ConditionValue xgetCValuePlantStorageSpaceId() { return xdfgetPlantStorageSpaceId(); }

    /**
     * Add order-by as ascend. <br>
     * PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_PlantStorageSpaceId_Asc() { regOBA("PLANT_STORAGE_SPACE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_PlantStorageSpaceId_Desc() { regOBD("PLANT_STORAGE_SPACE_ID"); return this; }

    protected ConditionValue _ownerCd;
    public ConditionValue xdfgetOwnerCd()
    { if (_ownerCd == null) { _ownerCd = nCV(); }
      return _ownerCd; }
    protected ConditionValue xgetCValueOwnerCd() { return xdfgetOwnerCd(); }

    /**
     * Add order-by as ascend. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_OwnerCd_Asc() { regOBA("OWNER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_OwnerCd_Desc() { regOBD("OWNER_CD"); return this; }

    protected ConditionValue _plantCd;
    public ConditionValue xdfgetPlantCd()
    { if (_plantCd == null) { _plantCd = nCV(); }
      return _plantCd; }
    protected ConditionValue xgetCValuePlantCd() { return xdfgetPlantCd(); }

    /**
     * Add order-by as ascend. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_PlantCd_Asc() { regOBA("PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_PlantCd_Desc() { regOBD("PLANT_CD"); return this; }

    protected ConditionValue _storageSpaceCd;
    public ConditionValue xdfgetStorageSpaceCd()
    { if (_storageSpaceCd == null) { _storageSpaceCd = nCV(); }
      return _storageSpaceCd; }
    protected ConditionValue xgetCValueStorageSpaceCd() { return xdfgetStorageSpaceCd(); }

    /**
     * Add order-by as ascend. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_StorageSpaceCd_Asc() { regOBA("STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_StorageSpaceCd_Desc() { regOBD("STORAGE_SPACE_CD"); return this; }

    protected ConditionValue _companyNm;
    public ConditionValue xdfgetCompanyNm()
    { if (_companyNm == null) { _companyNm = nCV(); }
      return _companyNm; }
    protected ConditionValue xgetCValueCompanyNm() { return xdfgetCompanyNm(); }

    /**
     * Add order-by as ascend. <br>
     * COMPANY_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_CompanyNm_Asc() { regOBA("COMPANY_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANY_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_CompanyNm_Desc() { regOBD("COMPANY_NM"); return this; }

    protected ConditionValue _plantNm;
    public ConditionValue xdfgetPlantNm()
    { if (_plantNm == null) { _plantNm = nCV(); }
      return _plantNm; }
    protected ConditionValue xgetCValuePlantNm() { return xdfgetPlantNm(); }

    /**
     * Add order-by as ascend. <br>
     * PLANT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_PlantNm_Asc() { regOBA("PLANT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_PlantNm_Desc() { regOBD("PLANT_NM"); return this; }

    protected ConditionValue _storageSpaceNm1;
    public ConditionValue xdfgetStorageSpaceNm1()
    { if (_storageSpaceNm1 == null) { _storageSpaceNm1 = nCV(); }
      return _storageSpaceNm1; }
    protected ConditionValue xgetCValueStorageSpaceNm1() { return xdfgetStorageSpaceNm1(); }

    /**
     * Add order-by as ascend. <br>
     * STORAGE_SPACE_NM1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_StorageSpaceNm1_Asc() { regOBA("STORAGE_SPACE_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORAGE_SPACE_NM1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_StorageSpaceNm1_Desc() { regOBD("STORAGE_SPACE_NM1"); return this; }

    protected ConditionValue _storageSpaceNm2;
    public ConditionValue xdfgetStorageSpaceNm2()
    { if (_storageSpaceNm2 == null) { _storageSpaceNm2 = nCV(); }
      return _storageSpaceNm2; }
    protected ConditionValue xgetCValueStorageSpaceNm2() { return xdfgetStorageSpaceNm2(); }

    /**
     * Add order-by as ascend. <br>
     * STORAGE_SPACE_NM2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_StorageSpaceNm2_Asc() { regOBA("STORAGE_SPACE_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORAGE_SPACE_NM2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_StorageSpaceNm2_Desc() { regOBD("STORAGE_SPACE_NM2"); return this; }

    protected ConditionValue _countryNm;
    public ConditionValue xdfgetCountryNm()
    { if (_countryNm == null) { _countryNm = nCV(); }
      return _countryNm; }
    protected ConditionValue xgetCValueCountryNm() { return xdfgetCountryNm(); }

    /**
     * Add order-by as ascend. <br>
     * COUNTRY_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_CountryNm_Asc() { regOBA("COUNTRY_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNTRY_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_CountryNm_Desc() { regOBD("COUNTRY_NM"); return this; }

    protected ConditionValue _address1;
    public ConditionValue xdfgetAddress1()
    { if (_address1 == null) { _address1 = nCV(); }
      return _address1; }
    protected ConditionValue xgetCValueAddress1() { return xdfgetAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_Address1_Asc() { regOBA("ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_Address1_Desc() { regOBD("ADDRESS1"); return this; }

    protected ConditionValue _zipCd;
    public ConditionValue xdfgetZipCd()
    { if (_zipCd == null) { _zipCd = nCV(); }
      return _zipCd; }
    protected ConditionValue xgetCValueZipCd() { return xdfgetZipCd(); }

    /**
     * Add order-by as ascend. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_ZipCd_Asc() { regOBA("ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_ZipCd_Desc() { regOBD("ZIP_CD"); return this; }

    protected ConditionValue _address2;
    public ConditionValue xdfgetAddress2()
    { if (_address2 == null) { _address2 = nCV(); }
      return _address2; }
    protected ConditionValue xgetCValueAddress2() { return xdfgetAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_Address2_Asc() { regOBA("ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_Address2_Desc() { regOBD("ADDRESS2"); return this; }

    protected ConditionValue _address3;
    public ConditionValue xdfgetAddress3()
    { if (_address3 == null) { _address3 = nCV(); }
      return _address3; }
    protected ConditionValue xgetCValueAddress3() { return xdfgetAddress3(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_Address3_Asc() { regOBA("ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_Address3_Desc() { regOBD("ADDRESS3"); return this; }

    protected ConditionValue _telNo;
    public ConditionValue xdfgetTelNo()
    { if (_telNo == null) { _telNo = nCV(); }
      return _telNo; }
    protected ConditionValue xgetCValueTelNo() { return xdfgetTelNo(); }

    /**
     * Add order-by as ascend. <br>
     * TEL_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_TelNo_Asc() { regOBA("TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TEL_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_TelNo_Desc() { regOBD("TEL_NO"); return this; }

    protected ConditionValue _faxNo;
    public ConditionValue xdfgetFaxNo()
    { if (_faxNo == null) { _faxNo = nCV(); }
      return _faxNo; }
    protected ConditionValue xgetCValueFaxNo() { return xdfgetFaxNo(); }

    /**
     * Add order-by as ascend. <br>
     * FAX_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_FaxNo_Asc() { regOBA("FAX_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FAX_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_FaxNo_Desc() { regOBD("FAX_NO"); return this; }

    protected ConditionValue _langNm;
    public ConditionValue xdfgetLangNm()
    { if (_langNm == null) { _langNm = nCV(); }
      return _langNm; }
    protected ConditionValue xgetCValueLangNm() { return xdfgetLangNm(); }

    /**
     * Add order-by as ascend. <br>
     * LANG_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_LangNm_Asc() { regOBA("LANG_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * LANG_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_LangNm_Desc() { regOBD("LANG_NM"); return this; }

    protected ConditionValue _baseCd;
    public ConditionValue xdfgetBaseCd()
    { if (_baseCd == null) { _baseCd = nCV(); }
      return _baseCd; }
    protected ConditionValue xgetCValueBaseCd() { return xdfgetBaseCd(); }

    /**
     * Add order-by as ascend. <br>
     * BASE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_BaseCd_Asc() { regOBA("BASE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_BaseCd_Desc() { regOBD("BASE_CD"); return this; }

    protected ConditionValue _baseTypeCd;
    public ConditionValue xdfgetBaseTypeCd()
    { if (_baseTypeCd == null) { _baseTypeCd = nCV(); }
      return _baseTypeCd; }
    protected ConditionValue xgetCValueBaseTypeCd() { return xdfgetBaseTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * BASE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_BaseTypeCd_Asc() { regOBA("BASE_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_BaseTypeCd_Desc() { regOBD("BASE_TYPE_CD"); return this; }

    protected ConditionValue _baseNm;
    public ConditionValue xdfgetBaseNm()
    { if (_baseNm == null) { _baseNm = nCV(); }
      return _baseNm; }
    protected ConditionValue xgetCValueBaseNm() { return xdfgetBaseNm(); }

    /**
     * Add order-by as ascend. <br>
     * BASE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_BaseNm_Asc() { regOBA("BASE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_BaseNm_Desc() { regOBD("BASE_NM"); return this; }

    protected ConditionValue _spareStr;
    public ConditionValue xdfgetSpareStr()
    { if (_spareStr == null) { _spareStr = nCV(); }
      return _spareStr; }
    protected ConditionValue xgetCValueSpareStr() { return xdfgetSpareStr(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_SpareStr_Asc() { regOBA("SPARE_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_SpareStr_Desc() { regOBD("SPARE_STR"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    protected ConditionValue _controlNo;
    public ConditionValue xdfgetControlNo()
    { if (_controlNo == null) { _controlNo = nCV(); }
      return _controlNo; }
    protected ConditionValue xgetCValueControlNo() { return xdfgetControlNo(); }

    /**
     * Add order-by as ascend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

    protected ConditionValue _addDt;
    public ConditionValue xdfgetAddDt()
    { if (_addDt == null) { _addDt = nCV(); }
      return _addDt; }
    protected ConditionValue xgetCValueAddDt() { return xdfgetAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

    protected ConditionValue _addUser;
    public ConditionValue xdfgetAddUser()
    { if (_addUser == null) { _addUser = nCV(); }
      return _addUser; }
    protected ConditionValue xgetCValueAddUser() { return xdfgetAddUser(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

    protected ConditionValue _addProcess;
    public ConditionValue xdfgetAddProcess()
    { if (_addProcess == null) { _addProcess = nCV(); }
      return _addProcess; }
    protected ConditionValue xgetCValueAddProcess() { return xdfgetAddProcess(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

    protected ConditionValue _updDt;
    public ConditionValue xdfgetUpdDt()
    { if (_updDt == null) { _updDt = nCV(); }
      return _updDt; }
    protected ConditionValue xgetCValueUpdDt() { return xdfgetUpdDt(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

    protected ConditionValue _updUser;
    public ConditionValue xdfgetUpdUser()
    { if (_updUser == null) { _updUser = nCV(); }
      return _updUser; }
    protected ConditionValue xgetCValueUpdUser() { return xdfgetUpdUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

    protected ConditionValue _updProcess;
    public ConditionValue xdfgetUpdProcess()
    { if (_updProcess == null) { _updProcess = nCV(); }
      return _updProcess; }
    protected ConditionValue xgetCValueUpdProcess() { return xdfgetUpdProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMPlantStorageSpaceCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MPlantStorageSpaceCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MPlantStorageSpaceCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MPlantStorageSpaceCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MPlantStorageSpaceCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MPlantStorageSpaceCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MPlantStorageSpaceCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MPlantStorageSpaceCQ> _myselfExistsMap;
    public Map<String, MPlantStorageSpaceCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MPlantStorageSpaceCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MPlantStorageSpaceCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MPlantStorageSpaceCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MPlantStorageSpaceCB.class.getName(); }
    protected String xCQ() { return MPlantStorageSpaceCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
