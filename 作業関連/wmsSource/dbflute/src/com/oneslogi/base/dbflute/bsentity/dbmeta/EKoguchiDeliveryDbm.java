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
 * The DB meta of e_koguchi_delivery. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EKoguchiDeliveryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EKoguchiDeliveryDbm _instance = new EKoguchiDeliveryDbm();
    private EKoguchiDeliveryDbm() {}
    public static EKoguchiDeliveryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getKoguchiDeliveryId(), (et, vl) -> ((EKoguchiDelivery)et).setKoguchiDeliveryId(ctl(vl)), "koguchiDeliveryId");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getReceiveCd(), (et, vl) -> ((EKoguchiDelivery)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getReceiveRowId(), (et, vl) -> ((EKoguchiDelivery)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getReceiveFlg(), (et, vl) -> ((EKoguchiDelivery)et).setReceiveFlg((String)vl), "receiveFlg");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getErrorFlg(), (et, vl) -> ((EKoguchiDelivery)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getErrorMessageCd(), (et, vl) -> ((EKoguchiDelivery)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getBaseCd(), (et, vl) -> ((EKoguchiDelivery)et).setBaseCd((String)vl), "baseCd");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getServSalesOrgCd(), (et, vl) -> ((EKoguchiDelivery)et).setServSalesOrgCd((String)vl), "servSalesOrgCd");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getServSalesOrgNm(), (et, vl) -> ((EKoguchiDelivery)et).setServSalesOrgNm((String)vl), "servSalesOrgNm");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getDirectFlg(), (et, vl) -> ((EKoguchiDelivery)et).setDirectFlg((String)vl), "directFlg");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getUrgentFlg(), (et, vl) -> ((EKoguchiDelivery)et).setUrgentFlg((String)vl), "urgentFlg");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getDeliveryFlg(), (et, vl) -> ((EKoguchiDelivery)et).setDeliveryFlg((String)vl), "deliveryFlg");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getKoguchiDeliveryCd(), (et, vl) -> ((EKoguchiDelivery)et).setKoguchiDeliveryCd((String)vl), "koguchiDeliveryCd");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getKoguchiDeliveryNm(), (et, vl) -> ((EKoguchiDelivery)et).setKoguchiDeliveryNm((String)vl), "koguchiDeliveryNm");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getUniDeliveryCd(), (et, vl) -> ((EKoguchiDelivery)et).setUniDeliveryCd((String)vl), "uniDeliveryCd");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getUniDeliveryNm(), (et, vl) -> ((EKoguchiDelivery)et).setUniDeliveryNm((String)vl), "uniDeliveryNm");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getFwTypeCd(), (et, vl) -> ((EKoguchiDelivery)et).setFwTypeCd((String)vl), "fwTypeCd");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getMcaTypeCd(), (et, vl) -> ((EKoguchiDelivery)et).setMcaTypeCd((String)vl), "mcaTypeCd");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getYouhinTypeCd(), (et, vl) -> ((EKoguchiDelivery)et).setYouhinTypeCd((String)vl), "youhinTypeCd");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getReqSalesOrgCd(), (et, vl) -> ((EKoguchiDelivery)et).setReqSalesOrgCd((String)vl), "reqSalesOrgCd");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getReqSalesOrgNm(), (et, vl) -> ((EKoguchiDelivery)et).setReqSalesOrgNm((String)vl), "reqSalesOrgNm");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getReqSalesOrgBranchNm(), (et, vl) -> ((EKoguchiDelivery)et).setReqSalesOrgBranchNm((String)vl), "reqSalesOrgBranchNm");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getReqSalesOrgAddress1(), (et, vl) -> ((EKoguchiDelivery)et).setReqSalesOrgAddress1((String)vl), "reqSalesOrgAddress1");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getReqSalesOrgAddress2(), (et, vl) -> ((EKoguchiDelivery)et).setReqSalesOrgAddress2((String)vl), "reqSalesOrgAddress2");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getReqSalesOrgZipCd(), (et, vl) -> ((EKoguchiDelivery)et).setReqSalesOrgZipCd((String)vl), "reqSalesOrgZipCd");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getReqSalesOrgTelNo(), (et, vl) -> ((EKoguchiDelivery)et).setReqSalesOrgTelNo((String)vl), "reqSalesOrgTelNo");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getReqSalesOrgFaxNo(), (et, vl) -> ((EKoguchiDelivery)et).setReqSalesOrgFaxNo((String)vl), "reqSalesOrgFaxNo");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getRemark1(), (et, vl) -> ((EKoguchiDelivery)et).setRemark1((String)vl), "remark1");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getRemark2(), (et, vl) -> ((EKoguchiDelivery)et).setRemark2((String)vl), "remark2");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getRemark3(), (et, vl) -> ((EKoguchiDelivery)et).setRemark3((String)vl), "remark3");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getRemark4(), (et, vl) -> ((EKoguchiDelivery)et).setRemark4((String)vl), "remark4");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getIndvOut(), (et, vl) -> ((EKoguchiDelivery)et).setIndvOut((String)vl), "indvOut");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getInvoiceSummary(), (et, vl) -> ((EKoguchiDelivery)et).setInvoiceSummary((String)vl), "invoiceSummary");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getPsam(), (et, vl) -> ((EKoguchiDelivery)et).setPsam((String)vl), "psam");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getAbolishDt(), (et, vl) -> ((EKoguchiDelivery)et).setAbolishDt((String)vl), "abolishDt");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getFloorCompFlg(), (et, vl) -> ((EKoguchiDelivery)et).setFloorCompFlg((String)vl), "floorCompFlg");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getSapAddYyyy(), (et, vl) -> ((EKoguchiDelivery)et).setSapAddYyyy((String)vl), "sapAddYyyy");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getSapAddMm(), (et, vl) -> ((EKoguchiDelivery)et).setSapAddMm((String)vl), "sapAddMm");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getSapAddDd(), (et, vl) -> ((EKoguchiDelivery)et).setSapAddDd((String)vl), "sapAddDd");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getSapAddHh(), (et, vl) -> ((EKoguchiDelivery)et).setSapAddHh((String)vl), "sapAddHh");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getSapAddMi(), (et, vl) -> ((EKoguchiDelivery)et).setSapAddMi((String)vl), "sapAddMi");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getSapAddSs(), (et, vl) -> ((EKoguchiDelivery)et).setSapAddSs((String)vl), "sapAddSs");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getSapAddUserCd(), (et, vl) -> ((EKoguchiDelivery)et).setSapAddUserCd((String)vl), "sapAddUserCd");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getSapUpdYyyy(), (et, vl) -> ((EKoguchiDelivery)et).setSapUpdYyyy((String)vl), "sapUpdYyyy");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getSapUpdMm(), (et, vl) -> ((EKoguchiDelivery)et).setSapUpdMm((String)vl), "sapUpdMm");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getSapUpdDd(), (et, vl) -> ((EKoguchiDelivery)et).setSapUpdDd((String)vl), "sapUpdDd");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getSapUpdHh(), (et, vl) -> ((EKoguchiDelivery)et).setSapUpdHh((String)vl), "sapUpdHh");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getSapUpdMi(), (et, vl) -> ((EKoguchiDelivery)et).setSapUpdMi((String)vl), "sapUpdMi");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getSapUpdSs(), (et, vl) -> ((EKoguchiDelivery)et).setSapUpdSs((String)vl), "sapUpdSs");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getSapUpdUserCd(), (et, vl) -> ((EKoguchiDelivery)et).setSapUpdUserCd((String)vl), "sapUpdUserCd");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getSpareStr(), (et, vl) -> ((EKoguchiDelivery)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getDelFlg(), (et, vl) -> ((EKoguchiDelivery)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getVersionNo(), (et, vl) -> ((EKoguchiDelivery)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getControlNo(), (et, vl) -> ((EKoguchiDelivery)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getAddDt(), (et, vl) -> ((EKoguchiDelivery)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getAddUser(), (et, vl) -> ((EKoguchiDelivery)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getAddProcess(), (et, vl) -> ((EKoguchiDelivery)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getUpdDt(), (et, vl) -> ((EKoguchiDelivery)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getUpdUser(), (et, vl) -> ((EKoguchiDelivery)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EKoguchiDelivery)et).getUpdProcess(), (et, vl) -> ((EKoguchiDelivery)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "e_koguchi_delivery";
    protected final String _tableDispName = "e_koguchi_delivery";
    protected final String _tablePropertyName = "EKoguchiDelivery";
    protected final TableSqlName _tableSqlName = new TableSqlName("e_koguchi_delivery", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnKoguchiDeliveryId = cci("KOGUCHI_DELIVERY_ID", "KOGUCHI_DELIVERY_ID", null, null, Long.class, "koguchiDeliveryId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveFlg = cci("RECEIVE_FLG", "RECEIVE_FLG", null, null, String.class, "receiveFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseCd = cci("BASE_CD", "BASE_CD", null, null, String.class, "baseCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnSapAddYyyy = cci("SAP_ADD_YYYY", "SAP_ADD_YYYY", null, null, String.class, "sapAddYyyy", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddMm = cci("SAP_ADD_MM", "SAP_ADD_MM", null, null, String.class, "sapAddMm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddDd = cci("SAP_ADD_DD", "SAP_ADD_DD", null, null, String.class, "sapAddDd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddHh = cci("SAP_ADD_HH", "SAP_ADD_HH", null, null, String.class, "sapAddHh", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddMi = cci("SAP_ADD_MI", "SAP_ADD_MI", null, null, String.class, "sapAddMi", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddSs = cci("SAP_ADD_SS", "SAP_ADD_SS", null, null, String.class, "sapAddSs", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddUserCd = cci("SAP_ADD_USER_CD", "SAP_ADD_USER_CD", null, null, String.class, "sapAddUserCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdYyyy = cci("SAP_UPD_YYYY", "SAP_UPD_YYYY", null, null, String.class, "sapUpdYyyy", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdMm = cci("SAP_UPD_MM", "SAP_UPD_MM", null, null, String.class, "sapUpdMm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdDd = cci("SAP_UPD_DD", "SAP_UPD_DD", null, null, String.class, "sapUpdDd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdHh = cci("SAP_UPD_HH", "SAP_UPD_HH", null, null, String.class, "sapUpdHh", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdMi = cci("SAP_UPD_MI", "SAP_UPD_MI", null, null, String.class, "sapUpdMi", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdSs = cci("SAP_UPD_SS", "SAP_UPD_SS", null, null, String.class, "sapUpdSs", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdUserCd = cci("SAP_UPD_USER_CD", "SAP_UPD_USER_CD", null, null, String.class, "sapUpdUserCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKoguchiDeliveryId() { return _columnKoguchiDeliveryId; }
    /**
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * RECEIVE_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveFlg() { return _columnReceiveFlg; }
    /**
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * BASE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseCd() { return _columnBaseCd; }
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
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddUserCd() { return _columnSapAddUserCd; }
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
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdUserCd() { return _columnSapUpdUserCd; }
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
        ls.add(columnKoguchiDeliveryId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnReceiveFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnBaseCd());
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
        ls.add(columnSapAddYyyy());
        ls.add(columnSapAddMm());
        ls.add(columnSapAddDd());
        ls.add(columnSapAddHh());
        ls.add(columnSapAddMi());
        ls.add(columnSapAddSs());
        ls.add(columnSapAddUserCd());
        ls.add(columnSapUpdYyyy());
        ls.add(columnSapUpdMm());
        ls.add(columnSapUpdDd());
        ls.add(columnSapUpdHh());
        ls.add(columnSapUpdMi());
        ls.add(columnSapUpdSs());
        ls.add(columnSapUpdUserCd());
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
    protected UniqueInfo cpui() { return hpcpui(columnKoguchiDeliveryId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        return hpcui(ls);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EKoguchiDelivery"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EKoguchiDeliveryCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EKoguchiDeliveryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EKoguchiDelivery> getEntityType() { return EKoguchiDelivery.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EKoguchiDelivery newEntity() { return new EKoguchiDelivery(); }
    public EKoguchiDelivery newMyEntity() { return new EKoguchiDelivery(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EKoguchiDelivery)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EKoguchiDelivery)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
