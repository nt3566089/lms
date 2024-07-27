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
 * The DB meta of t_stock_record. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TStockRecordDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TStockRecordDbm _instance = new TStockRecordDbm();
    private TStockRecordDbm() {}
    public static TStockRecordDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TStockRecord)et).getStockRecordId(), (et, vl) -> ((TStockRecord)et).setStockRecordId(ctl(vl)), "stockRecordId");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getClientId(), (et, vl) -> ((TStockRecord)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getPlantCd(), (et, vl) -> ((TStockRecord)et).setPlantCd((String)vl), "plantCd");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getStorageSpaceCd(), (et, vl) -> ((TStockRecord)et).setStorageSpaceCd((String)vl), "storageSpaceCd");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getReferenceDt(), (et, vl) -> ((TStockRecord)et).setReferenceDt((String)vl), "referenceDt");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getProductCd(), (et, vl) -> ((TStockRecord)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getStockNum(), (et, vl) -> ((TStockRecord)et).setStockNum(ctb(vl)), "stockNum");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getProductNmKanji(), (et, vl) -> ((TStockRecord)et).setProductNmKanji((String)vl), "productNmKanji");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getBarcode(), (et, vl) -> ((TStockRecord)et).setBarcode((String)vl), "barcode");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getDepositJanCd(), (et, vl) -> ((TStockRecord)et).setDepositJanCd((String)vl), "depositJanCd");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getTenhanshaCd(), (et, vl) -> ((TStockRecord)et).setTenhanshaCd((String)vl), "tenhanshaCd");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getSalesOrgCd(), (et, vl) -> ((TStockRecord)et).setSalesOrgCd((String)vl), "salesOrgCd");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getTenhanshaNm1(), (et, vl) -> ((TStockRecord)et).setTenhanshaNm1((String)vl), "tenhanshaNm1");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getTenhanshaNm2(), (et, vl) -> ((TStockRecord)et).setTenhanshaNm2((String)vl), "tenhanshaNm2");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getSapUserCd(), (et, vl) -> ((TStockRecord)et).setSapUserCd((String)vl), "sapUserCd");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getSapUserNm(), (et, vl) -> ((TStockRecord)et).setSapUserNm((String)vl), "sapUserNm");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getAllocTypeCd(), (et, vl) -> ((TStockRecord)et).setAllocTypeCd((String)vl), "allocTypeCd");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getComment(), (et, vl) -> ((TStockRecord)et).setComment((String)vl), "comment");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getSpareStr(), (et, vl) -> ((TStockRecord)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getDelFlg(), (et, vl) -> ((TStockRecord)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getVersionNo(), (et, vl) -> ((TStockRecord)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getControlNo(), (et, vl) -> ((TStockRecord)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getAddDt(), (et, vl) -> ((TStockRecord)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getAddUser(), (et, vl) -> ((TStockRecord)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getAddProcess(), (et, vl) -> ((TStockRecord)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getUpdDt(), (et, vl) -> ((TStockRecord)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getUpdUser(), (et, vl) -> ((TStockRecord)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TStockRecord)et).getUpdProcess(), (et, vl) -> ((TStockRecord)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TStockRecord)et).getMClient(), (et, vl) -> ((TStockRecord)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_stock_record";
    protected final String _tableDispName = "t_stock_record";
    protected final String _tablePropertyName = "TStockRecord";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_stock_record", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStockRecordId = cci("STOCK_RECORD_ID", "STOCK_RECORD_ID", null, null, Long.class, "stockRecordId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnPlantCd = cci("PLANT_CD", "PLANT_CD", null, null, String.class, "plantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStorageSpaceCd = cci("STORAGE_SPACE_CD", "STORAGE_SPACE_CD", null, null, String.class, "storageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReferenceDt = cci("REFERENCE_DT", "REFERENCE_DT", null, null, String.class, "referenceDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockNum = cci("STOCK_NUM", "STOCK_NUM", null, null, java.math.BigDecimal.class, "stockNum", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNmKanji = cci("PRODUCT_NM_KANJI", "PRODUCT_NM_KANJI", null, null, String.class, "productNmKanji", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBarcode = cci("BARCODE", "BARCODE", null, null, String.class, "barcode", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositJanCd = cci("DEPOSIT_JAN_CD", "DEPOSIT_JAN_CD", null, null, String.class, "depositJanCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaCd = cci("TENHANSHA_CD", "TENHANSHA_CD", null, null, String.class, "tenhanshaCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgCd = cci("SALES_ORG_CD", "SALES_ORG_CD", null, null, String.class, "salesOrgCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaNm1 = cci("TENHANSHA_NM1", "TENHANSHA_NM1", null, null, String.class, "tenhanshaNm1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaNm2 = cci("TENHANSHA_NM2", "TENHANSHA_NM2", null, null, String.class, "tenhanshaNm2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUserCd = cci("SAP_USER_CD", "SAP_USER_CD", null, null, String.class, "sapUserCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUserNm = cci("SAP_USER_NM", "SAP_USER_NM", null, null, String.class, "sapUserNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocTypeCd = cci("ALLOC_TYPE_CD", "ALLOC_TYPE_CD", null, null, String.class, "allocTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnComment = cci("COMMENT", "COMMENT", null, null, String.class, "comment", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * STOCK_RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockRecordId() { return _columnStockRecordId; }
    /**
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
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
     * REFERENCE_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReferenceDt() { return _columnReferenceDt; }
    /**
     * PRODUCT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockNum() { return _columnStockNum; }
    /**
     * PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNmKanji() { return _columnProductNmKanji; }
    /**
     * BARCODE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarcode() { return _columnBarcode; }
    /**
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositJanCd() { return _columnDepositJanCd; }
    /**
     * TENHANSHA_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaCd() { return _columnTenhanshaCd; }
    /**
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgCd() { return _columnSalesOrgCd; }
    /**
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaNm1() { return _columnTenhanshaNm1; }
    /**
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaNm2() { return _columnTenhanshaNm2; }
    /**
     * SAP_USER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUserCd() { return _columnSapUserCd; }
    /**
     * SAP_USER_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUserNm() { return _columnSapUserNm; }
    /**
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocTypeCd() { return _columnAllocTypeCd; }
    /**
     * COMMENT: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnComment() { return _columnComment; }
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
        ls.add(columnStockRecordId());
        ls.add(columnClientId());
        ls.add(columnPlantCd());
        ls.add(columnStorageSpaceCd());
        ls.add(columnReferenceDt());
        ls.add(columnProductCd());
        ls.add(columnStockNum());
        ls.add(columnProductNmKanji());
        ls.add(columnBarcode());
        ls.add(columnDepositJanCd());
        ls.add(columnTenhanshaCd());
        ls.add(columnSalesOrgCd());
        ls.add(columnTenhanshaNm1());
        ls.add(columnTenhanshaNm2());
        ls.add(columnSapUserCd());
        ls.add(columnSapUserNm());
        ls.add(columnAllocTypeCd());
        ls.add(columnComment());
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
    protected UniqueInfo cpui() { return hpcpui(columnStockRecordId()); }
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
    /**
     * m_client by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_STOCK_RECORD_FK1", "MClient", this, MClientDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TStockRecordList", false);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TStockRecord"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TStockRecordCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TStockRecordBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TStockRecord> getEntityType() { return TStockRecord.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TStockRecord newEntity() { return new TStockRecord(); }
    public TStockRecord newMyEntity() { return new TStockRecord(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TStockRecord)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TStockRecord)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
