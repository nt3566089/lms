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
 * The DB meta of m_koguchi_delivery. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MKoguchiDeliveryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MKoguchiDeliveryDbm _instance = new MKoguchiDeliveryDbm();
    private MKoguchiDeliveryDbm() {}
    public static MKoguchiDeliveryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getKoguchiDeliveryId(), (et, vl) -> ((MKoguchiDelivery)et).setKoguchiDeliveryId(ctl(vl)), "koguchiDeliveryId");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getBaseCd(), (et, vl) -> ((MKoguchiDelivery)et).setBaseCd((String)vl), "baseCd");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getServSalesOrgId(), (et, vl) -> ((MKoguchiDelivery)et).setServSalesOrgId(ctl(vl)), "servSalesOrgId");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getServSalesOrgCd(), (et, vl) -> ((MKoguchiDelivery)et).setServSalesOrgCd((String)vl), "servSalesOrgCd");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getServSalesOrgNm(), (et, vl) -> ((MKoguchiDelivery)et).setServSalesOrgNm((String)vl), "servSalesOrgNm");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getDirectFlg(), (et, vl) -> ((MKoguchiDelivery)et).setDirectFlg((String)vl), "directFlg");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getUrgentFlg(), (et, vl) -> ((MKoguchiDelivery)et).setUrgentFlg((String)vl), "urgentFlg");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getDeliveryFlg(), (et, vl) -> ((MKoguchiDelivery)et).setDeliveryFlg((String)vl), "deliveryFlg");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getKoguchiDeliveryCd(), (et, vl) -> ((MKoguchiDelivery)et).setKoguchiDeliveryCd((String)vl), "koguchiDeliveryCd");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getKoguchiDeliveryNm(), (et, vl) -> ((MKoguchiDelivery)et).setKoguchiDeliveryNm((String)vl), "koguchiDeliveryNm");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getUniDeliveryCd(), (et, vl) -> ((MKoguchiDelivery)et).setUniDeliveryCd((String)vl), "uniDeliveryCd");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getUniDeliveryNm(), (et, vl) -> ((MKoguchiDelivery)et).setUniDeliveryNm((String)vl), "uniDeliveryNm");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getFwTypeCd(), (et, vl) -> ((MKoguchiDelivery)et).setFwTypeCd((String)vl), "fwTypeCd");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getMcaTypeCd(), (et, vl) -> ((MKoguchiDelivery)et).setMcaTypeCd((String)vl), "mcaTypeCd");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getYouhinTypeCd(), (et, vl) -> ((MKoguchiDelivery)et).setYouhinTypeCd((String)vl), "youhinTypeCd");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getCarrierId(), (et, vl) -> ((MKoguchiDelivery)et).setCarrierId(ctl(vl)), "carrierId");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getReqSalesOrgId(), (et, vl) -> ((MKoguchiDelivery)et).setReqSalesOrgId(ctl(vl)), "reqSalesOrgId");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getReqSalesOrgCd(), (et, vl) -> ((MKoguchiDelivery)et).setReqSalesOrgCd((String)vl), "reqSalesOrgCd");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getReqSalesOrgNm(), (et, vl) -> ((MKoguchiDelivery)et).setReqSalesOrgNm((String)vl), "reqSalesOrgNm");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getReqSalesOrgBranchNm(), (et, vl) -> ((MKoguchiDelivery)et).setReqSalesOrgBranchNm((String)vl), "reqSalesOrgBranchNm");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getReqSalesOrgAddress1(), (et, vl) -> ((MKoguchiDelivery)et).setReqSalesOrgAddress1((String)vl), "reqSalesOrgAddress1");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getReqSalesOrgAddress2(), (et, vl) -> ((MKoguchiDelivery)et).setReqSalesOrgAddress2((String)vl), "reqSalesOrgAddress2");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getReqSalesOrgZipCd(), (et, vl) -> ((MKoguchiDelivery)et).setReqSalesOrgZipCd((String)vl), "reqSalesOrgZipCd");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getReqSalesOrgTelNo(), (et, vl) -> ((MKoguchiDelivery)et).setReqSalesOrgTelNo((String)vl), "reqSalesOrgTelNo");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getReqSalesOrgFaxNo(), (et, vl) -> ((MKoguchiDelivery)et).setReqSalesOrgFaxNo((String)vl), "reqSalesOrgFaxNo");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getRemark1(), (et, vl) -> ((MKoguchiDelivery)et).setRemark1((String)vl), "remark1");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getRemark2(), (et, vl) -> ((MKoguchiDelivery)et).setRemark2((String)vl), "remark2");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getRemark3(), (et, vl) -> ((MKoguchiDelivery)et).setRemark3((String)vl), "remark3");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getRemark4(), (et, vl) -> ((MKoguchiDelivery)et).setRemark4((String)vl), "remark4");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getIndvOut(), (et, vl) -> ((MKoguchiDelivery)et).setIndvOut((String)vl), "indvOut");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getInvoiceSummary(), (et, vl) -> ((MKoguchiDelivery)et).setInvoiceSummary((String)vl), "invoiceSummary");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getPsam(), (et, vl) -> ((MKoguchiDelivery)et).setPsam((String)vl), "psam");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getAbolishDt(), (et, vl) -> ((MKoguchiDelivery)et).setAbolishDt((String)vl), "abolishDt");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getFloorCompFlg(), (et, vl) -> ((MKoguchiDelivery)et).setFloorCompFlg((String)vl), "floorCompFlg");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getDelFlg(), (et, vl) -> ((MKoguchiDelivery)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getVersionNo(), (et, vl) -> ((MKoguchiDelivery)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getControlNo(), (et, vl) -> ((MKoguchiDelivery)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getAddDt(), (et, vl) -> ((MKoguchiDelivery)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getAddUser(), (et, vl) -> ((MKoguchiDelivery)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getAddProcess(), (et, vl) -> ((MKoguchiDelivery)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getUpdDt(), (et, vl) -> ((MKoguchiDelivery)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getUpdUser(), (et, vl) -> ((MKoguchiDelivery)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MKoguchiDelivery)et).getUpdProcess(), (et, vl) -> ((MKoguchiDelivery)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MKoguchiDelivery)et).getMSalesOrg(), (et, vl) -> ((MKoguchiDelivery)et).setMSalesOrg((MSalesOrg)vl), "MSalesOrg");
        setupEfpg(_efpgMap, et -> ((MKoguchiDelivery)et).getMCarrier(), (et, vl) -> ((MKoguchiDelivery)et).setMCarrier((MCarrier)vl), "MCarrier");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_koguchi_delivery";
    protected final String _tableDispName = "m_koguchi_delivery";
    protected final String _tablePropertyName = "MKoguchiDelivery";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_koguchi_delivery", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnKoguchiDeliveryId = cci("KOGUCHI_DELIVERY_ID", "KOGUCHI_DELIVERY_ID", null, null, Long.class, "koguchiDeliveryId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseCd = cci("BASE_CD", "BASE_CD", null, null, String.class, "baseCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnServSalesOrgId = cci("SERV_SALES_ORG_ID", "SERV_SALES_ORG_ID", null, null, Long.class, "servSalesOrgId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MSalesOrg", null, null, false);
    protected final ColumnInfo _columnServSalesOrgCd = cci("SERV_SALES_ORG_CD", "SERV_SALES_ORG_CD", null, null, String.class, "servSalesOrgCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnServSalesOrgNm = cci("SERV_SALES_ORG_NM", "SERV_SALES_ORG_NM", null, null, String.class, "servSalesOrgNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectFlg = cci("DIRECT_FLG", "DIRECT_FLG", null, null, String.class, "directFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUrgentFlg = cci("URGENT_FLG", "URGENT_FLG", null, null, String.class, "urgentFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryFlg = cci("DELIVERY_FLG", "DELIVERY_FLG", null, null, String.class, "deliveryFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKoguchiDeliveryCd = cci("KOGUCHI_DELIVERY_CD", "KOGUCHI_DELIVERY_CD", null, null, String.class, "koguchiDeliveryCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKoguchiDeliveryNm = cci("KOGUCHI_DELIVERY_NM", "KOGUCHI_DELIVERY_NM", null, null, String.class, "koguchiDeliveryNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUniDeliveryCd = cci("UNI_DELIVERY_CD", "UNI_DELIVERY_CD", null, null, String.class, "uniDeliveryCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUniDeliveryNm = cci("UNI_DELIVERY_NM", "UNI_DELIVERY_NM", null, null, String.class, "uniDeliveryNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFwTypeCd = cci("FW_TYPE_CD", "FW_TYPE_CD", null, null, String.class, "fwTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMcaTypeCd = cci("MCA_TYPE_CD", "MCA_TYPE_CD", null, null, String.class, "mcaTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYouhinTypeCd = cci("YOUHIN_TYPE_CD", "YOUHIN_TYPE_CD", null, null, String.class, "youhinTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierId = cci("CARRIER_ID", "CARRIER_ID", null, null, Long.class, "carrierId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MCarrier", null, null, false);
    protected final ColumnInfo _columnReqSalesOrgId = cci("REQ_SALES_ORG_ID", "REQ_SALES_ORG_ID", null, null, Long.class, "reqSalesOrgId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReqSalesOrgCd = cci("REQ_SALES_ORG_CD", "REQ_SALES_ORG_CD", null, null, String.class, "reqSalesOrgCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReqSalesOrgNm = cci("REQ_SALES_ORG_NM", "REQ_SALES_ORG_NM", null, null, String.class, "reqSalesOrgNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReqSalesOrgBranchNm = cci("REQ_SALES_ORG_BRANCH_NM", "REQ_SALES_ORG_BRANCH_NM", null, null, String.class, "reqSalesOrgBranchNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReqSalesOrgAddress1 = cci("REQ_SALES_ORG_ADDRESS1", "REQ_SALES_ORG_ADDRESS1", null, null, String.class, "reqSalesOrgAddress1", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReqSalesOrgAddress2 = cci("REQ_SALES_ORG_ADDRESS2", "REQ_SALES_ORG_ADDRESS2", null, null, String.class, "reqSalesOrgAddress2", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReqSalesOrgZipCd = cci("REQ_SALES_ORG_ZIP_CD", "REQ_SALES_ORG_ZIP_CD", null, null, String.class, "reqSalesOrgZipCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReqSalesOrgTelNo = cci("REQ_SALES_ORG_TEL_NO", "REQ_SALES_ORG_TEL_NO", null, null, String.class, "reqSalesOrgTelNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReqSalesOrgFaxNo = cci("REQ_SALES_ORG_FAX_NO", "REQ_SALES_ORG_FAX_NO", null, null, String.class, "reqSalesOrgFaxNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRemark1 = cci("REMARK1", "REMARK1", null, null, String.class, "remark1", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRemark2 = cci("REMARK2", "REMARK2", null, null, String.class, "remark2", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRemark3 = cci("REMARK3", "REMARK3", null, null, String.class, "remark3", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRemark4 = cci("REMARK4", "REMARK4", null, null, String.class, "remark4", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndvOut = cci("INDV_OUT", "INDV_OUT", null, null, String.class, "indvOut", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceSummary = cci("INVOICE_SUMMARY", "INVOICE_SUMMARY", null, null, String.class, "invoiceSummary", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPsam = cci("PSAM", "PSAM", null, null, String.class, "psam", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAbolishDt = cci("ABOLISH_DT", "ABOLISH_DT", null, null, String.class, "abolishDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFloorCompFlg = cci("FLOOR_COMP_FLG", "FLOOR_COMP_FLG", null, null, String.class, "floorCompFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKoguchiDeliveryId() { return _columnKoguchiDeliveryId; }
    /**
     * BASE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseCd() { return _columnBaseCd; }
    /**
     * SERV_SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnServSalesOrgId() { return _columnServSalesOrgId; }
    /**
     * SERV_SALES_ORG_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnServSalesOrgCd() { return _columnServSalesOrgCd; }
    /**
     * SERV_SALES_ORG_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnServSalesOrgNm() { return _columnServSalesOrgNm; }
    /**
     * DIRECT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectFlg() { return _columnDirectFlg; }
    /**
     * URGENT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUrgentFlg() { return _columnUrgentFlg; }
    /**
     * DELIVERY_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryFlg() { return _columnDeliveryFlg; }
    /**
     * KOGUCHI_DELIVERY_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKoguchiDeliveryCd() { return _columnKoguchiDeliveryCd; }
    /**
     * KOGUCHI_DELIVERY_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKoguchiDeliveryNm() { return _columnKoguchiDeliveryNm; }
    /**
     * UNI_DELIVERY_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUniDeliveryCd() { return _columnUniDeliveryCd; }
    /**
     * UNI_DELIVERY_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUniDeliveryNm() { return _columnUniDeliveryNm; }
    /**
     * FW_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFwTypeCd() { return _columnFwTypeCd; }
    /**
     * MCA_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMcaTypeCd() { return _columnMcaTypeCd; }
    /**
     * YOUHIN_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYouhinTypeCd() { return _columnYouhinTypeCd; }
    /**
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierId() { return _columnCarrierId; }
    /**
     * REQ_SALES_ORG_ID: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReqSalesOrgId() { return _columnReqSalesOrgId; }
    /**
     * REQ_SALES_ORG_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReqSalesOrgCd() { return _columnReqSalesOrgCd; }
    /**
     * REQ_SALES_ORG_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReqSalesOrgNm() { return _columnReqSalesOrgNm; }
    /**
     * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReqSalesOrgBranchNm() { return _columnReqSalesOrgBranchNm; }
    /**
     * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReqSalesOrgAddress1() { return _columnReqSalesOrgAddress1; }
    /**
     * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReqSalesOrgAddress2() { return _columnReqSalesOrgAddress2; }
    /**
     * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReqSalesOrgZipCd() { return _columnReqSalesOrgZipCd; }
    /**
     * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReqSalesOrgTelNo() { return _columnReqSalesOrgTelNo; }
    /**
     * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReqSalesOrgFaxNo() { return _columnReqSalesOrgFaxNo; }
    /**
     * REMARK1: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRemark1() { return _columnRemark1; }
    /**
     * REMARK2: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRemark2() { return _columnRemark2; }
    /**
     * REMARK3: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRemark3() { return _columnRemark3; }
    /**
     * REMARK4: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRemark4() { return _columnRemark4; }
    /**
     * INDV_OUT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndvOut() { return _columnIndvOut; }
    /**
     * INVOICE_SUMMARY: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceSummary() { return _columnInvoiceSummary; }
    /**
     * PSAM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPsam() { return _columnPsam; }
    /**
     * ABOLISH_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAbolishDt() { return _columnAbolishDt; }
    /**
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFloorCompFlg() { return _columnFloorCompFlg; }
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
        ls.add(columnKoguchiDeliveryId());
        ls.add(columnBaseCd());
        ls.add(columnServSalesOrgId());
        ls.add(columnServSalesOrgCd());
        ls.add(columnServSalesOrgNm());
        ls.add(columnDirectFlg());
        ls.add(columnUrgentFlg());
        ls.add(columnDeliveryFlg());
        ls.add(columnKoguchiDeliveryCd());
        ls.add(columnKoguchiDeliveryNm());
        ls.add(columnUniDeliveryCd());
        ls.add(columnUniDeliveryNm());
        ls.add(columnFwTypeCd());
        ls.add(columnMcaTypeCd());
        ls.add(columnYouhinTypeCd());
        ls.add(columnCarrierId());
        ls.add(columnReqSalesOrgId());
        ls.add(columnReqSalesOrgCd());
        ls.add(columnReqSalesOrgNm());
        ls.add(columnReqSalesOrgBranchNm());
        ls.add(columnReqSalesOrgAddress1());
        ls.add(columnReqSalesOrgAddress2());
        ls.add(columnReqSalesOrgZipCd());
        ls.add(columnReqSalesOrgTelNo());
        ls.add(columnReqSalesOrgFaxNo());
        ls.add(columnRemark1());
        ls.add(columnRemark2());
        ls.add(columnRemark3());
        ls.add(columnRemark4());
        ls.add(columnIndvOut());
        ls.add(columnInvoiceSummary());
        ls.add(columnPsam());
        ls.add(columnAbolishDt());
        ls.add(columnFloorCompFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnKoguchiDeliveryId()); }
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
     * m_sales_org by my SERV_SALES_ORG_ID, named 'MSalesOrg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMSalesOrg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnServSalesOrgId(), MSalesOrgDbm.getInstance().columnSalesOrgId());
        return cfi("M_KOGUCHI_DELIVERY_FK1", "MSalesOrg", this, MSalesOrgDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MKoguchiDeliveryList", false);
    }
    /**
     * m_carrier by my CARRIER_ID, named 'MCarrier'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCarrier() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCarrierId(), MCarrierDbm.getInstance().columnCarrierId());
        return cfi("M_KOGUCHI_DELIVERY_FK2", "MCarrier", this, MCarrierDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MKoguchiDeliveryList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MKoguchiDelivery"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MKoguchiDeliveryCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MKoguchiDeliveryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MKoguchiDelivery> getEntityType() { return MKoguchiDelivery.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MKoguchiDelivery newEntity() { return new MKoguchiDelivery(); }
    public MKoguchiDelivery newMyEntity() { return new MKoguchiDelivery(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MKoguchiDelivery)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MKoguchiDelivery)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
