package com.oneslogi.base.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The DB meta of m_plant_storage_space. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MPlantStorageSpaceDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MPlantStorageSpaceDbm _instance = new MPlantStorageSpaceDbm();
    private MPlantStorageSpaceDbm() {}
    public static MPlantStorageSpaceDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getPlantStorageSpaceId(), (et, vl) -> ((MPlantStorageSpace)et).setPlantStorageSpaceId(ctl(vl)), "plantStorageSpaceId");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getOwnerCd(), (et, vl) -> ((MPlantStorageSpace)et).setOwnerCd((String)vl), "ownerCd");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getPlantCd(), (et, vl) -> ((MPlantStorageSpace)et).setPlantCd((String)vl), "plantCd");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getStorageSpaceCd(), (et, vl) -> ((MPlantStorageSpace)et).setStorageSpaceCd((String)vl), "storageSpaceCd");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getCompanyNm(), (et, vl) -> ((MPlantStorageSpace)et).setCompanyNm((String)vl), "companyNm");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getPlantNm(), (et, vl) -> ((MPlantStorageSpace)et).setPlantNm((String)vl), "plantNm");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getStorageSpaceNm1(), (et, vl) -> ((MPlantStorageSpace)et).setStorageSpaceNm1((String)vl), "storageSpaceNm1");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getStorageSpaceNm2(), (et, vl) -> ((MPlantStorageSpace)et).setStorageSpaceNm2((String)vl), "storageSpaceNm2");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getCountryNm(), (et, vl) -> ((MPlantStorageSpace)et).setCountryNm((String)vl), "countryNm");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getAddress1(), (et, vl) -> ((MPlantStorageSpace)et).setAddress1((String)vl), "address1");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getZipCd(), (et, vl) -> ((MPlantStorageSpace)et).setZipCd((String)vl), "zipCd");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getAddress2(), (et, vl) -> ((MPlantStorageSpace)et).setAddress2((String)vl), "address2");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getAddress3(), (et, vl) -> ((MPlantStorageSpace)et).setAddress3((String)vl), "address3");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getTelNo(), (et, vl) -> ((MPlantStorageSpace)et).setTelNo((String)vl), "telNo");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getFaxNo(), (et, vl) -> ((MPlantStorageSpace)et).setFaxNo((String)vl), "faxNo");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getLangNm(), (et, vl) -> ((MPlantStorageSpace)et).setLangNm((String)vl), "langNm");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getBaseCd(), (et, vl) -> ((MPlantStorageSpace)et).setBaseCd((String)vl), "baseCd");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getBaseTypeCd(), (et, vl) -> ((MPlantStorageSpace)et).setBaseTypeCd((String)vl), "baseTypeCd");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getBaseNm(), (et, vl) -> ((MPlantStorageSpace)et).setBaseNm((String)vl), "baseNm");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getSpareStr(), (et, vl) -> ((MPlantStorageSpace)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getDelFlg(), (et, vl) -> ((MPlantStorageSpace)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getVersionNo(), (et, vl) -> ((MPlantStorageSpace)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getControlNo(), (et, vl) -> ((MPlantStorageSpace)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getAddDt(), (et, vl) -> ((MPlantStorageSpace)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getAddUser(), (et, vl) -> ((MPlantStorageSpace)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getAddProcess(), (et, vl) -> ((MPlantStorageSpace)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getUpdDt(), (et, vl) -> ((MPlantStorageSpace)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getUpdUser(), (et, vl) -> ((MPlantStorageSpace)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MPlantStorageSpace)et).getUpdProcess(), (et, vl) -> ((MPlantStorageSpace)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_plant_storage_space";
    protected final String _tableDispName = "m_plant_storage_space";
    protected final String _tablePropertyName = "MPlantStorageSpace";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_plant_storage_space", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPlantStorageSpaceId = cci("PLANT_STORAGE_SPACE_ID", "PLANT_STORAGE_SPACE_ID", null, null, Long.class, "plantStorageSpaceId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnerCd = cci("OWNER_CD", "OWNER_CD", null, null, String.class, "ownerCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlantCd = cci("PLANT_CD", "PLANT_CD", null, null, String.class, "plantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStorageSpaceCd = cci("STORAGE_SPACE_CD", "STORAGE_SPACE_CD", null, null, String.class, "storageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyNm = cci("COMPANY_NM", "COMPANY_NM", null, null, String.class, "companyNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlantNm = cci("PLANT_NM", "PLANT_NM", null, null, String.class, "plantNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStorageSpaceNm1 = cci("STORAGE_SPACE_NM1", "STORAGE_SPACE_NM1", null, null, String.class, "storageSpaceNm1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStorageSpaceNm2 = cci("STORAGE_SPACE_NM2", "STORAGE_SPACE_NM2", null, null, String.class, "storageSpaceNm2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCountryNm = cci("COUNTRY_NM", "COUNTRY_NM", null, null, String.class, "countryNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress1 = cci("ADDRESS1", "ADDRESS1", null, null, String.class, "address1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZipCd = cci("ZIP_CD", "ZIP_CD", null, null, String.class, "zipCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress2 = cci("ADDRESS2", "ADDRESS2", null, null, String.class, "address2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress3 = cci("ADDRESS3", "ADDRESS3", null, null, String.class, "address3", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTelNo = cci("TEL_NO", "TEL_NO", null, null, String.class, "telNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFaxNo = cci("FAX_NO", "FAX_NO", null, null, String.class, "faxNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLangNm = cci("LANG_NM", "LANG_NM", null, null, String.class, "langNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseCd = cci("BASE_CD", "BASE_CD", null, null, String.class, "baseCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseTypeCd = cci("BASE_TYPE_CD", "BASE_TYPE_CD", null, null, String.class, "baseTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseNm = cci("BASE_NM", "BASE_NM", null, null, String.class, "baseNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareStr = cci("SPARE_STR", "SPARE_STR", null, null, String.class, "spareStr", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "CHAR", 1, 0, null, "0", true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "BIGINT", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "DATETIME", 19, 0, 3, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "VARCHAR", 60, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "VARCHAR", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "DATETIME", 19, 0, 3, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "VARCHAR", 60, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "VARCHAR", 255, 0, null, null, true, null, null, null, null, null, false);

    /**
     * PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlantStorageSpaceId() { return _columnPlantStorageSpaceId; }
    /**
     * OWNER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnerCd() { return _columnOwnerCd; }
    /**
     * PLANT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlantCd() { return _columnPlantCd; }
    /**
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStorageSpaceCd() { return _columnStorageSpaceCd; }
    /**
     * COMPANY_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyNm() { return _columnCompanyNm; }
    /**
     * PLANT_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlantNm() { return _columnPlantNm; }
    /**
     * STORAGE_SPACE_NM1: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStorageSpaceNm1() { return _columnStorageSpaceNm1; }
    /**
     * STORAGE_SPACE_NM2: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStorageSpaceNm2() { return _columnStorageSpaceNm2; }
    /**
     * COUNTRY_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountryNm() { return _columnCountryNm; }
    /**
     * ADDRESS1: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress1() { return _columnAddress1; }
    /**
     * ZIP_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipCd() { return _columnZipCd; }
    /**
     * ADDRESS2: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress2() { return _columnAddress2; }
    /**
     * ADDRESS3: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress3() { return _columnAddress3; }
    /**
     * TEL_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTelNo() { return _columnTelNo; }
    /**
     * FAX_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFaxNo() { return _columnFaxNo; }
    /**
     * LANG_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLangNm() { return _columnLangNm; }
    /**
     * BASE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseCd() { return _columnBaseCd; }
    /**
     * BASE_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseTypeCd() { return _columnBaseTypeCd; }
    /**
     * BASE_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseNm() { return _columnBaseNm; }
    /**
     * SPARE_STR: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareStr() { return _columnSpareStr; }
    /**
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }
    /**
     * ADD_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
    /**
     * ADD_USER: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddUser() { return _columnAddUser; }
    /**
     * ADD_PROCESS: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddProcess() { return _columnAddProcess; }
    /**
     * UPD_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * UPD_USER: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdUser() { return _columnUpdUser; }
    /**
     * UPD_PROCESS: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdProcess() { return _columnUpdProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPlantStorageSpaceId());
        ls.add(columnOwnerCd());
        ls.add(columnPlantCd());
        ls.add(columnStorageSpaceCd());
        ls.add(columnCompanyNm());
        ls.add(columnPlantNm());
        ls.add(columnStorageSpaceNm1());
        ls.add(columnStorageSpaceNm2());
        ls.add(columnCountryNm());
        ls.add(columnAddress1());
        ls.add(columnZipCd());
        ls.add(columnAddress2());
        ls.add(columnAddress3());
        ls.add(columnTelNo());
        ls.add(columnFaxNo());
        ls.add(columnLangNm());
        ls.add(columnBaseCd());
        ls.add(columnBaseTypeCd());
        ls.add(columnBaseNm());
        ls.add(columnSpareStr());
        ls.add(columnDelFlg());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnAddProcess());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUpdProcess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnPlantStorageSpaceId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnDelFlg(), columnVersionNo(), columnControlNo(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnDelFlg(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdDt(), columnUpdUser(), columnUpdProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MPlantStorageSpace"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MPlantStorageSpaceCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MPlantStorageSpaceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MPlantStorageSpace> getEntityType() { return MPlantStorageSpace.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MPlantStorageSpace newEntity() { return new MPlantStorageSpace(); }
    public MPlantStorageSpace newMyEntity() { return new MPlantStorageSpace(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MPlantStorageSpace)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MPlantStorageSpace)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
