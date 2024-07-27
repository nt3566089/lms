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
 * The DB meta of t_shipping_inst_b_print. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TShippingInstBPrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TShippingInstBPrintDbm _instance = new TShippingInstBPrintDbm();
    private TShippingInstBPrintDbm() {}
    public static TShippingInstBPrintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getShippingInstBPrintId(), (et, vl) -> ((TShippingInstBPrint)et).setShippingInstBPrintId(ctl(vl)), "shippingInstBPrintId");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getShippingInstBId(), (et, vl) -> ((TShippingInstBPrint)et).setShippingInstBId(ctl(vl)), "shippingInstBId");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getHinmokuCd(), (et, vl) -> ((TShippingInstBPrint)et).setHinmokuCd((String)vl), "hinmokuCd");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getHinmokuGroupCd(), (et, vl) -> ((TShippingInstBPrint)et).setHinmokuGroupCd((String)vl), "hinmokuGroupCd");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getSalesOrderNum(), (et, vl) -> ((TShippingInstBPrint)et).setSalesOrderNum(ctb(vl)), "salesOrderNum");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getLogiWeightFlg(), (et, vl) -> ((TShippingInstBPrint)et).setLogiWeightFlg((String)vl), "logiWeightFlg");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getLogiAttentionTypeCd(), (et, vl) -> ((TShippingInstBPrint)et).setLogiAttentionTypeCd((String)vl), "logiAttentionTypeCd");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getLogiSpecialTypeCd(), (et, vl) -> ((TShippingInstBPrint)et).setLogiSpecialTypeCd((String)vl), "logiSpecialTypeCd");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getUnitPrice(), (et, vl) -> ((TShippingInstBPrint)et).setUnitPrice(ctl(vl)), "unitPrice");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getEcOrderBranchNo(), (et, vl) -> ((TShippingInstBPrint)et).setEcOrderBranchNo((String)vl), "ecOrderBranchNo");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getEcProductNmKanji(), (et, vl) -> ((TShippingInstBPrint)et).setEcProductNmKanji((String)vl), "ecProductNmKanji");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getDealTypeCd(), (et, vl) -> ((TShippingInstBPrint)et).setDealTypeCd((String)vl), "dealTypeCd");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getSpareStr(), (et, vl) -> ((TShippingInstBPrint)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getDelFlg(), (et, vl) -> ((TShippingInstBPrint)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getVersionNo(), (et, vl) -> ((TShippingInstBPrint)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getControlNo(), (et, vl) -> ((TShippingInstBPrint)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getAddDt(), (et, vl) -> ((TShippingInstBPrint)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getAddUser(), (et, vl) -> ((TShippingInstBPrint)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getAddProcess(), (et, vl) -> ((TShippingInstBPrint)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getUpdDt(), (et, vl) -> ((TShippingInstBPrint)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getUpdUser(), (et, vl) -> ((TShippingInstBPrint)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TShippingInstBPrint)et).getUpdProcess(), (et, vl) -> ((TShippingInstBPrint)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TShippingInstBPrint)et).getTShippingInstB(), (et, vl) -> ((TShippingInstBPrint)et).setTShippingInstB((TShippingInstB)vl), "TShippingInstB");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_shipping_inst_b_print";
    protected final String _tableDispName = "t_shipping_inst_b_print";
    protected final String _tablePropertyName = "TShippingInstBPrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_shipping_inst_b_print", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShippingInstBPrintId = cci("SHIPPING_INST_B_PRINT_ID", "SHIPPING_INST_B_PRINT_ID", null, null, Long.class, "shippingInstBPrintId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingInstBId = cci("SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", null, null, Long.class, "shippingInstBId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "TShippingInstB", null, null, false);
    protected final ColumnInfo _columnHinmokuCd = cci("HINMOKU_CD", "HINMOKU_CD", null, null, String.class, "hinmokuCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuGroupCd = cci("HINMOKU_GROUP_CD", "HINMOKU_GROUP_CD", null, null, String.class, "hinmokuGroupCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrderNum = cci("SALES_ORDER_NUM", "SALES_ORDER_NUM", null, null, java.math.BigDecimal.class, "salesOrderNum", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogiWeightFlg = cci("LOGI_WEIGHT_FLG", "LOGI_WEIGHT_FLG", null, null, String.class, "logiWeightFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogiAttentionTypeCd = cci("LOGI_ATTENTION_TYPE_CD", "LOGI_ATTENTION_TYPE_CD", null, null, String.class, "logiAttentionTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogiSpecialTypeCd = cci("LOGI_SPECIAL_TYPE_CD", "LOGI_SPECIAL_TYPE_CD", null, null, String.class, "logiSpecialTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitPrice = cci("UNIT_PRICE", "UNIT_PRICE", null, null, Long.class, "unitPrice", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEcOrderBranchNo = cci("EC_ORDER_BRANCH_NO", "EC_ORDER_BRANCH_NO", null, null, String.class, "ecOrderBranchNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEcProductNmKanji = cci("EC_PRODUCT_NM_KANJI", "EC_PRODUCT_NM_KANJI", null, null, String.class, "ecProductNmKanji", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDealTypeCd = cci("DEAL_TYPE_CD", "DEAL_TYPE_CD", null, null, String.class, "dealTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstBPrintId() { return _columnShippingInstBPrintId; }
    /**
     * SHIPPING_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstBId() { return _columnShippingInstBId; }
    /**
     * HINMOKU_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuCd() { return _columnHinmokuCd; }
    /**
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuGroupCd() { return _columnHinmokuGroupCd; }
    /**
     * SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrderNum() { return _columnSalesOrderNum; }
    /**
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogiWeightFlg() { return _columnLogiWeightFlg; }
    /**
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogiAttentionTypeCd() { return _columnLogiAttentionTypeCd; }
    /**
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogiSpecialTypeCd() { return _columnLogiSpecialTypeCd; }
    /**
     * UNIT_PRICE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitPrice() { return _columnUnitPrice; }
    /**
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEcOrderBranchNo() { return _columnEcOrderBranchNo; }
    /**
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEcProductNmKanji() { return _columnEcProductNmKanji; }
    /**
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDealTypeCd() { return _columnDealTypeCd; }
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
        ls.add(columnShippingInstBPrintId());
        ls.add(columnShippingInstBId());
        ls.add(columnHinmokuCd());
        ls.add(columnHinmokuGroupCd());
        ls.add(columnSalesOrderNum());
        ls.add(columnLogiWeightFlg());
        ls.add(columnLogiAttentionTypeCd());
        ls.add(columnLogiSpecialTypeCd());
        ls.add(columnUnitPrice());
        ls.add(columnEcOrderBranchNo());
        ls.add(columnEcProductNmKanji());
        ls.add(columnDealTypeCd());
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
    protected UniqueInfo cpui() { return hpcpui(columnShippingInstBPrintId()); }
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
     * t_shipping_inst_b by my SHIPPING_INST_B_ID, named 'TShippingInstB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTShippingInstB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingInstBId(), TShippingInstBDbm.getInstance().columnShippingInstBId());
        return cfi("T_SHIPPING_INST_B_PRINT_FK1", "TShippingInstB", this, TShippingInstBDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TShippingInstBPrintList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TShippingInstBPrint"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TShippingInstBPrintCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TShippingInstBPrintBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TShippingInstBPrint> getEntityType() { return TShippingInstBPrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TShippingInstBPrint newEntity() { return new TShippingInstBPrint(); }
    public TShippingInstBPrint newMyEntity() { return new TShippingInstBPrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TShippingInstBPrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TShippingInstBPrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
