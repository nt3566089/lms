package com.oneslogi.base.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The DB meta of SqlTagLabelCommon. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlTagLabelCommonDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlTagLabelCommonDbm _instance = new SqlTagLabelCommonDbm();
    private SqlTagLabelCommonDbm() {}
    public static SqlTagLabelCommonDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getDeliveryCourseNm(), (et, vl) -> ((SqlTagLabelCommon)et).setDeliveryCourseNm((String)vl), "deliveryCourseNm");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getArrivalStoreCd(), (et, vl) -> ((SqlTagLabelCommon)et).setArrivalStoreCd((String)vl), "arrivalStoreCd");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getTrackingNo(), (et, vl) -> ((SqlTagLabelCommon)et).setTrackingNo((String)vl), "trackingNo");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getSlipClientAddress(), (et, vl) -> ((SqlTagLabelCommon)et).setSlipClientAddress((String)vl), "slipClientAddress");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getSlipClientNm(), (et, vl) -> ((SqlTagLabelCommon)et).setSlipClientNm((String)vl), "slipClientNm");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getSlipClientTelNo(), (et, vl) -> ((SqlTagLabelCommon)et).setSlipClientTelNo((String)vl), "slipClientTelNo");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getSalesOrgCd(), (et, vl) -> ((SqlTagLabelCommon)et).setSalesOrgCd((String)vl), "salesOrgCd");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getSalesOrgTel(), (et, vl) -> ((SqlTagLabelCommon)et).setSalesOrgTel((String)vl), "salesOrgTel");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getWorkDt(), (et, vl) -> ((SqlTagLabelCommon)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getDelivAddress(), (et, vl) -> ((SqlTagLabelCommon)et).setDelivAddress((String)vl), "delivAddress");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getDelivCustomerNm(), (et, vl) -> ((SqlTagLabelCommon)et).setDelivCustomerNm((String)vl), "delivCustomerNm");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getShippingTypeCd(), (et, vl) -> ((SqlTagLabelCommon)et).setShippingTypeCd((String)vl), "shippingTypeCd");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getDepartment(), (et, vl) -> ((SqlTagLabelCommon)et).setDepartment((String)vl), "department");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getDelivTelNo(), (et, vl) -> ((SqlTagLabelCommon)et).setDelivTelNo((String)vl), "delivTelNo");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getInvoiceSummary(), (et, vl) -> ((SqlTagLabelCommon)et).setInvoiceSummary((String)vl), "invoiceSummary");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getTsihNizoroeNo(), (et, vl) -> ((SqlTagLabelCommon)et).setTsihNizoroeNo((String)vl), "tsihNizoroeNo");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getBoxNo(), (et, vl) -> ((SqlTagLabelCommon)et).setBoxNo((String)vl), "boxNo");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getBoxNoSum(), (et, vl) -> ((SqlTagLabelCommon)et).setBoxNoSum((String)vl), "boxNoSum");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getTpihNizoroeNo(), (et, vl) -> ((SqlTagLabelCommon)et).setTpihNizoroeNo((String)vl), "tpihNizoroeNo");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getDelivDt(), (et, vl) -> ((SqlTagLabelCommon)et).setDelivDt((String)vl), "delivDt");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getDelivTz(), (et, vl) -> ((SqlTagLabelCommon)et).setDelivTz((String)vl), "delivTz");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getCodFee(), (et, vl) -> ((SqlTagLabelCommon)et).setCodFee(ctl(vl)), "codFee");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getTagOutFlg(), (et, vl) -> ((SqlTagLabelCommon)et).setTagOutFlg((String)vl), "tagOutFlg");
        setupEpg(_epgMap, et -> ((SqlTagLabelCommon)et).getLaneCd(), (et, vl) -> ((SqlTagLabelCommon)et).setLaneCd((String)vl), "laneCd");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlTagLabelCommon";
    protected final String _tableDispName = "SqlTagLabelCommon";
    protected final String _tablePropertyName = "sqlTagLabelCommon";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlTagLabelCommon", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDeliveryCourseNm = cci("DELIVERY_COURSE_NM", "DELIVERY_COURSE_NM", null, null, String.class, "deliveryCourseNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArrivalStoreCd = cci("ARRIVAL_STORE_CD", "ARRIVAL_STORE_CD", null, null, String.class, "arrivalStoreCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrackingNo = cci("TRACKING_NO", "TRACKING_NO", null, null, String.class, "trackingNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientAddress = cci("SLIP_CLIENT_ADDRESS", "SLIP_CLIENT_ADDRESS", null, null, String.class, "slipClientAddress", null, false, false, false, "VARCHAR", 510, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientNm = cci("SLIP_CLIENT_NM", "SLIP_CLIENT_NM", null, null, String.class, "slipClientNm", null, false, false, false, "VARCHAR", 510, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientTelNo = cci("SLIP_CLIENT_TEL_NO", "SLIP_CLIENT_TEL_NO", null, null, String.class, "slipClientTelNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgCd = cci("SALES_ORG_CD", "SALES_ORG_CD", null, null, String.class, "salesOrgCd", null, false, false, false, "VARCHAR", 120, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgTel = cci("SALES_ORG_TEL", "SALES_ORG_TEL", null, null, String.class, "salesOrgTel", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress = cci("DELIV_ADDRESS", "DELIV_ADDRESS", null, null, String.class, "delivAddress", null, false, false, false, "VARCHAR", 510, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerNm = cci("DELIV_CUSTOMER_NM", "DELIV_CUSTOMER_NM", null, null, String.class, "delivCustomerNm", null, false, false, false, "VARCHAR", 510, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingTypeCd = cci("SHIPPING_TYPE_CD", "SHIPPING_TYPE_CD", null, null, String.class, "shippingTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepartment = cci("DEPARTMENT", "DEPARTMENT", null, null, String.class, "department", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTelNo = cci("DELIV_TEL_NO", "DELIV_TEL_NO", null, null, String.class, "delivTelNo", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceSummary = cci("INVOICE_SUMMARY", "INVOICE_SUMMARY", null, null, String.class, "invoiceSummary", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTsihNizoroeNo = cci("TSIH_NIZOROE_NO", "TSIH_NIZOROE_NO", null, null, String.class, "tsihNizoroeNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxNo = cci("BOX_NO", "BOX_NO", null, null, String.class, "boxNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxNoSum = cci("BOX_NO_SUM", "BOX_NO_SUM", null, null, String.class, "boxNoSum", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTpihNizoroeNo = cci("TPIH_NIZOROE_NO", "TPIH_NIZOROE_NO", null, null, String.class, "tpihNizoroeNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivDt = cci("DELIV_DT", "DELIV_DT", null, null, String.class, "delivDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTz = cci("DELIV_TZ", "DELIV_TZ", null, null, String.class, "delivTz", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCodFee = cci("COD_FEE", "COD_FEE", null, null, Long.class, "codFee", null, false, false, false, "BIGINT", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagOutFlg = cci("TAG_OUT_FLG", "TAG_OUT_FLG", null, null, String.class, "tagOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLaneCd = cci("LANE_CD", "LANE_CD", null, null, String.class, "laneCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);

    /**
     * DELIVERY_COURSE_NM: {VARCHAR(60), refers to m_delivery_course.DELIVERY_COURSE_NM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseNm() { return _columnDeliveryCourseNm; }
    /**
     * ARRIVAL_STORE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArrivalStoreCd() { return _columnArrivalStoreCd; }
    /**
     * TRACKING_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrackingNo() { return _columnTrackingNo; }
    /**
     * SLIP_CLIENT_ADDRESS: {VARCHAR(510)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientAddress() { return _columnSlipClientAddress; }
    /**
     * SLIP_CLIENT_NM: {VARCHAR(510)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientNm() { return _columnSlipClientNm; }
    /**
     * SLIP_CLIENT_TEL_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientTelNo() { return _columnSlipClientTelNo; }
    /**
     * SALES_ORG_CD: {VARCHAR(120)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgCd() { return _columnSalesOrgCd; }
    /**
     * SALES_ORG_TEL: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgTel() { return _columnSalesOrgTel; }
    /**
     * WORK_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
    /**
     * DELIV_ADDRESS: {VARCHAR(510)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddress() { return _columnDelivAddress; }
    /**
     * DELIV_CUSTOMER_NM: {VARCHAR(510)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerNm() { return _columnDelivCustomerNm; }
    /**
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingTypeCd() { return _columnShippingTypeCd; }
    /**
     * DEPARTMENT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepartment() { return _columnDepartment; }
    /**
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTelNo() { return _columnDelivTelNo; }
    /**
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceSummary() { return _columnInvoiceSummary; }
    /**
     * TSIH_NIZOROE_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTsihNizoroeNo() { return _columnTsihNizoroeNo; }
    /**
     * BOX_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxNo() { return _columnBoxNo; }
    /**
     * BOX_NO_SUM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxNoSum() { return _columnBoxNoSum; }
    /**
     * TPIH_NIZOROE_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTpihNizoroeNo() { return _columnTpihNizoroeNo; }
    /**
     * DELIV_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivDt() { return _columnDelivDt; }
    /**
     * DELIV_TZ: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTz() { return _columnDelivTz; }
    /**
     * COD_FEE: {BIGINT(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCodFee() { return _columnCodFee; }
    /**
     * TAG_OUT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagOutFlg() { return _columnTagOutFlg; }
    /**
     * LANE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLaneCd() { return _columnLaneCd; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDeliveryCourseNm());
        ls.add(columnArrivalStoreCd());
        ls.add(columnTrackingNo());
        ls.add(columnSlipClientAddress());
        ls.add(columnSlipClientNm());
        ls.add(columnSlipClientTelNo());
        ls.add(columnSalesOrgCd());
        ls.add(columnSalesOrgTel());
        ls.add(columnWorkDt());
        ls.add(columnDelivAddress());
        ls.add(columnDelivCustomerNm());
        ls.add(columnShippingTypeCd());
        ls.add(columnDepartment());
        ls.add(columnDelivTelNo());
        ls.add(columnInvoiceSummary());
        ls.add(columnTsihNizoroeNo());
        ls.add(columnBoxNo());
        ls.add(columnBoxNoSum());
        ls.add(columnTpihNizoroeNo());
        ls.add(columnDelivDt());
        ls.add(columnDelivTz());
        ls.add(columnCodFee());
        ls.add(columnTagOutFlg());
        ls.add(columnLaneCd());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlTagLabelCommon"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlTagLabelCommon> getEntityType() { return SqlTagLabelCommon.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlTagLabelCommon newEntity() { return new SqlTagLabelCommon(); }
    public SqlTagLabelCommon newMyEntity() { return new SqlTagLabelCommon(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlTagLabelCommon)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlTagLabelCommon)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
