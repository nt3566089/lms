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
 * The DB meta of es_product_price. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EsProductPriceDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EsProductPriceDbm _instance = new EsProductPriceDbm();
    private EsProductPriceDbm() {}
    public static EsProductPriceDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getProductPriceId(), (et, vl) -> ((EsProductPrice)et).setProductPriceId(ctl(vl)), "productPriceId");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getSendFlg(), (et, vl) -> ((EsProductPrice)et).setSendFlg((String)vl), "sendFlg");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getHinmokuCd(), (et, vl) -> ((EsProductPrice)et).setHinmokuCd((String)vl), "hinmokuCd");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getHinmokuGroupCd(), (et, vl) -> ((EsProductPrice)et).setHinmokuGroupCd((String)vl), "hinmokuGroupCd");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getMovingAveragePrice(), (et, vl) -> ((EsProductPrice)et).setMovingAveragePrice(ctb(vl)), "movingAveragePrice");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getSapAddYyyy(), (et, vl) -> ((EsProductPrice)et).setSapAddYyyy((String)vl), "sapAddYyyy");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getSapAddMm(), (et, vl) -> ((EsProductPrice)et).setSapAddMm((String)vl), "sapAddMm");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getSapAddDd(), (et, vl) -> ((EsProductPrice)et).setSapAddDd((String)vl), "sapAddDd");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getSapAddHh(), (et, vl) -> ((EsProductPrice)et).setSapAddHh((String)vl), "sapAddHh");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getSapAddMi(), (et, vl) -> ((EsProductPrice)et).setSapAddMi((String)vl), "sapAddMi");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getSapAddSs(), (et, vl) -> ((EsProductPrice)et).setSapAddSs((String)vl), "sapAddSs");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getSapAddUserNm(), (et, vl) -> ((EsProductPrice)et).setSapAddUserNm((String)vl), "sapAddUserNm");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getSapUpdYyyy(), (et, vl) -> ((EsProductPrice)et).setSapUpdYyyy((String)vl), "sapUpdYyyy");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getSapUpdMm(), (et, vl) -> ((EsProductPrice)et).setSapUpdMm((String)vl), "sapUpdMm");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getSapUpdDd(), (et, vl) -> ((EsProductPrice)et).setSapUpdDd((String)vl), "sapUpdDd");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getSapUpdHh(), (et, vl) -> ((EsProductPrice)et).setSapUpdHh((String)vl), "sapUpdHh");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getSapUpdMi(), (et, vl) -> ((EsProductPrice)et).setSapUpdMi((String)vl), "sapUpdMi");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getSapUpdSs(), (et, vl) -> ((EsProductPrice)et).setSapUpdSs((String)vl), "sapUpdSs");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getSapUpdUserNm(), (et, vl) -> ((EsProductPrice)et).setSapUpdUserNm((String)vl), "sapUpdUserNm");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getSpareStr(), (et, vl) -> ((EsProductPrice)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getDelFlg(), (et, vl) -> ((EsProductPrice)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getVersionNo(), (et, vl) -> ((EsProductPrice)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getControlNo(), (et, vl) -> ((EsProductPrice)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getAddDt(), (et, vl) -> ((EsProductPrice)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getAddUser(), (et, vl) -> ((EsProductPrice)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getAddProcess(), (et, vl) -> ((EsProductPrice)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getUpdDt(), (et, vl) -> ((EsProductPrice)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getUpdUser(), (et, vl) -> ((EsProductPrice)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EsProductPrice)et).getUpdProcess(), (et, vl) -> ((EsProductPrice)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "es_product_price";
    protected final String _tableDispName = "es_product_price";
    protected final String _tablePropertyName = "esProductPrice";
    protected final TableSqlName _tableSqlName = new TableSqlName("es_product_price", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductPriceId = cci("PRODUCT_PRICE_ID", "PRODUCT_PRICE_ID", null, null, Long.class, "productPriceId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendFlg = cci("SEND_FLG", "SEND_FLG", null, null, String.class, "sendFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuCd = cci("HINMOKU_CD", "HINMOKU_CD", null, null, String.class, "hinmokuCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuGroupCd = cci("HINMOKU_GROUP_CD", "HINMOKU_GROUP_CD", null, null, String.class, "hinmokuGroupCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMovingAveragePrice = cci("MOVING_AVERAGE_PRICE", "MOVING_AVERAGE_PRICE", null, null, java.math.BigDecimal.class, "movingAveragePrice", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddYyyy = cci("SAP_ADD_YYYY", "SAP_ADD_YYYY", null, null, String.class, "sapAddYyyy", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddMm = cci("SAP_ADD_MM", "SAP_ADD_MM", null, null, String.class, "sapAddMm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddDd = cci("SAP_ADD_DD", "SAP_ADD_DD", null, null, String.class, "sapAddDd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddHh = cci("SAP_ADD_HH", "SAP_ADD_HH", null, null, String.class, "sapAddHh", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddMi = cci("SAP_ADD_MI", "SAP_ADD_MI", null, null, String.class, "sapAddMi", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddSs = cci("SAP_ADD_SS", "SAP_ADD_SS", null, null, String.class, "sapAddSs", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddUserNm = cci("SAP_ADD_USER_NM", "SAP_ADD_USER_NM", null, null, String.class, "sapAddUserNm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdYyyy = cci("SAP_UPD_YYYY", "SAP_UPD_YYYY", null, null, String.class, "sapUpdYyyy", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdMm = cci("SAP_UPD_MM", "SAP_UPD_MM", null, null, String.class, "sapUpdMm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdDd = cci("SAP_UPD_DD", "SAP_UPD_DD", null, null, String.class, "sapUpdDd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdHh = cci("SAP_UPD_HH", "SAP_UPD_HH", null, null, String.class, "sapUpdHh", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdMi = cci("SAP_UPD_MI", "SAP_UPD_MI", null, null, String.class, "sapUpdMi", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdSs = cci("SAP_UPD_SS", "SAP_UPD_SS", null, null, String.class, "sapUpdSs", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdUserNm = cci("SAP_UPD_USER_NM", "SAP_UPD_USER_NM", null, null, String.class, "sapUpdUserNm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * PRODUCT_PRICE_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductPriceId() { return _columnProductPriceId; }
    /**
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendFlg() { return _columnSendFlg; }
    /**
     * HINMOKU_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuCd() { return _columnHinmokuCd; }
    /**
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuGroupCd() { return _columnHinmokuGroupCd; }
    /**
     * MOVING_AVERAGE_PRICE: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMovingAveragePrice() { return _columnMovingAveragePrice; }
    /**
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddYyyy() { return _columnSapAddYyyy; }
    /**
     * SAP_ADD_MM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddMm() { return _columnSapAddMm; }
    /**
     * SAP_ADD_DD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddDd() { return _columnSapAddDd; }
    /**
     * SAP_ADD_HH: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddHh() { return _columnSapAddHh; }
    /**
     * SAP_ADD_MI: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddMi() { return _columnSapAddMi; }
    /**
     * SAP_ADD_SS: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddSs() { return _columnSapAddSs; }
    /**
     * SAP_ADD_USER_NM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddUserNm() { return _columnSapAddUserNm; }
    /**
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdYyyy() { return _columnSapUpdYyyy; }
    /**
     * SAP_UPD_MM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdMm() { return _columnSapUpdMm; }
    /**
     * SAP_UPD_DD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdDd() { return _columnSapUpdDd; }
    /**
     * SAP_UPD_HH: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdHh() { return _columnSapUpdHh; }
    /**
     * SAP_UPD_MI: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdMi() { return _columnSapUpdMi; }
    /**
     * SAP_UPD_SS: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdSs() { return _columnSapUpdSs; }
    /**
     * SAP_UPD_USER_NM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdUserNm() { return _columnSapUpdUserNm; }
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
        ls.add(columnProductPriceId());
        ls.add(columnSendFlg());
        ls.add(columnHinmokuCd());
        ls.add(columnHinmokuGroupCd());
        ls.add(columnMovingAveragePrice());
        ls.add(columnSapAddYyyy());
        ls.add(columnSapAddMm());
        ls.add(columnSapAddDd());
        ls.add(columnSapAddHh());
        ls.add(columnSapAddMi());
        ls.add(columnSapAddSs());
        ls.add(columnSapAddUserNm());
        ls.add(columnSapUpdYyyy());
        ls.add(columnSapUpdMm());
        ls.add(columnSapUpdDd());
        ls.add(columnSapUpdHh());
        ls.add(columnSapUpdMi());
        ls.add(columnSapUpdSs());
        ls.add(columnSapUpdUserNm());
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
    protected UniqueInfo cpui() { return hpcpui(columnProductPriceId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EsProductPrice"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EsProductPriceCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EsProductPriceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EsProductPrice> getEntityType() { return EsProductPrice.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EsProductPrice newEntity() { return new EsProductPrice(); }
    public EsProductPrice newMyEntity() { return new EsProductPrice(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EsProductPrice)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EsProductPrice)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
