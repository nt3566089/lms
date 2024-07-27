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
 * The DB meta of e_receive_plan. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EReceivePlanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EReceivePlanDbm _instance = new EReceivePlanDbm();
    private EReceivePlanDbm() {}
    public static EReceivePlanDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getReceivePlanId(), (et, vl) -> ((EReceivePlan)et).setReceivePlanId(ctl(vl)), "receivePlanId");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getReceiveCd(), (et, vl) -> ((EReceivePlan)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getReceiveRowId(), (et, vl) -> ((EReceivePlan)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getImportFlg(), (et, vl) -> ((EReceivePlan)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getErrorFlg(), (et, vl) -> ((EReceivePlan)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getErrorMessageCd(), (et, vl) -> ((EReceivePlan)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getStoreSlipNo(), (et, vl) -> ((EReceivePlan)et).setStoreSlipNo((String)vl), "storeSlipNo");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getStoreSlipRowNo(), (et, vl) -> ((EReceivePlan)et).setStoreSlipRowNo((String)vl), "storeSlipRowNo");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSlipTypeCd(), (et, vl) -> ((EReceivePlan)et).setSlipTypeCd((String)vl), "slipTypeCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getIfId(), (et, vl) -> ((EReceivePlan)et).setIfId((String)vl), "ifId");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getIfNo(), (et, vl) -> ((EReceivePlan)et).setIfNo((String)vl), "ifNo");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getHinmokuCd(), (et, vl) -> ((EReceivePlan)et).setHinmokuCd((String)vl), "hinmokuCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getHinmokuGroup(), (et, vl) -> ((EReceivePlan)et).setHinmokuGroup((String)vl), "hinmokuGroup");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSanshaTypeCd(), (et, vl) -> ((EReceivePlan)et).setSanshaTypeCd((String)vl), "sanshaTypeCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getReceiveReasonCd(), (et, vl) -> ((EReceivePlan)et).setReceiveReasonCd((String)vl), "receiveReasonCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getReceiveReasonNm(), (et, vl) -> ((EReceivePlan)et).setReceiveReasonNm((String)vl), "receiveReasonNm");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getCustomerCd(), (et, vl) -> ((EReceivePlan)et).setCustomerCd((String)vl), "customerCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getCustomerNm(), (et, vl) -> ((EReceivePlan)et).setCustomerNm((String)vl), "customerNm");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getOrderDate(), (et, vl) -> ((EReceivePlan)et).setOrderDate((String)vl), "orderDate");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getOrderTime(), (et, vl) -> ((EReceivePlan)et).setOrderTime((String)vl), "orderTime");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getConfirmedDeliveryDate(), (et, vl) -> ((EReceivePlan)et).setConfirmedDeliveryDate((String)vl), "confirmedDeliveryDate");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getHinmokuText(), (et, vl) -> ((EReceivePlan)et).setHinmokuText((String)vl), "hinmokuText");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getJanCd(), (et, vl) -> ((EReceivePlan)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getUnitNm(), (et, vl) -> ((EReceivePlan)et).setUnitNm((String)vl), "unitNm");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getReceivePlanNum(), (et, vl) -> ((EReceivePlan)et).setReceivePlanNum((String)vl), "receivePlanNum");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getReceiveRemainingNum(), (et, vl) -> ((EReceivePlan)et).setReceiveRemainingNum((String)vl), "receiveRemainingNum");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getStorePlantCd(), (et, vl) -> ((EReceivePlan)et).setStorePlantCd((String)vl), "storePlantCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getStoreStorageSpaceCd(), (et, vl) -> ((EReceivePlan)et).setStoreStorageSpaceCd((String)vl), "storeStorageSpaceCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getShippingPlantCd(), (et, vl) -> ((EReceivePlan)et).setShippingPlantCd((String)vl), "shippingPlantCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getShippingStorageSpaceCd(), (et, vl) -> ((EReceivePlan)et).setShippingStorageSpaceCd((String)vl), "shippingStorageSpaceCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getLotManagTypeCd(), (et, vl) -> ((EReceivePlan)et).setLotManagTypeCd((String)vl), "lotManagTypeCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getTenhanshaCd(), (et, vl) -> ((EReceivePlan)et).setTenhanshaCd((String)vl), "tenhanshaCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSalesOrgCd(), (et, vl) -> ((EReceivePlan)et).setSalesOrgCd((String)vl), "salesOrgCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getTenhanshaNm1(), (et, vl) -> ((EReceivePlan)et).setTenhanshaNm1((String)vl), "tenhanshaNm1");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getTenhanshaNm2(), (et, vl) -> ((EReceivePlan)et).setTenhanshaNm2((String)vl), "tenhanshaNm2");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSapUserCd(), (et, vl) -> ((EReceivePlan)et).setSapUserCd((String)vl), "sapUserCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSapUserNm(), (et, vl) -> ((EReceivePlan)et).setSapUserNm((String)vl), "sapUserNm");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getModTypeCd(), (et, vl) -> ((EReceivePlan)et).setModTypeCd((String)vl), "modTypeCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDepositJanCd(), (et, vl) -> ((EReceivePlan)et).setDepositJanCd((String)vl), "depositJanCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getTimesNum(), (et, vl) -> ((EReceivePlan)et).setTimesNum((String)vl), "timesNum");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getAccountOrderNo(), (et, vl) -> ((EReceivePlan)et).setAccountOrderNo((String)vl), "accountOrderNo");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSapSupplierCd(), (et, vl) -> ((EReceivePlan)et).setSapSupplierCd((String)vl), "sapSupplierCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSapVenderCd(), (et, vl) -> ((EReceivePlan)et).setSapVenderCd((String)vl), "sapVenderCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getTodayFlg(), (et, vl) -> ((EReceivePlan)et).setTodayFlg((String)vl), "todayFlg");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSanshaDeliverySlipNo1(), (et, vl) -> ((EReceivePlan)et).setSanshaDeliverySlipNo1((String)vl), "sanshaDeliverySlipNo1");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTypeCd(), (et, vl) -> ((EReceivePlan)et).setDataTypeCd((String)vl), "dataTypeCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getWmsSendFlg(), (et, vl) -> ((EReceivePlan)et).setWmsSendFlg((String)vl), "wmsSendFlg");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getLpSendFlg(), (et, vl) -> ((EReceivePlan)et).setLpSendFlg((String)vl), "lpSendFlg");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSapAddYyyy(), (et, vl) -> ((EReceivePlan)et).setSapAddYyyy((String)vl), "sapAddYyyy");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSapAddMm(), (et, vl) -> ((EReceivePlan)et).setSapAddMm((String)vl), "sapAddMm");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSapAddDd(), (et, vl) -> ((EReceivePlan)et).setSapAddDd((String)vl), "sapAddDd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSapAddHh(), (et, vl) -> ((EReceivePlan)et).setSapAddHh((String)vl), "sapAddHh");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSapAddMi(), (et, vl) -> ((EReceivePlan)et).setSapAddMi((String)vl), "sapAddMi");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSapAddSs(), (et, vl) -> ((EReceivePlan)et).setSapAddSs((String)vl), "sapAddSs");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSapAddUserCd(), (et, vl) -> ((EReceivePlan)et).setSapAddUserCd((String)vl), "sapAddUserCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSapUpdYyyy(), (et, vl) -> ((EReceivePlan)et).setSapUpdYyyy((String)vl), "sapUpdYyyy");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSapUpdMm(), (et, vl) -> ((EReceivePlan)et).setSapUpdMm((String)vl), "sapUpdMm");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSapUpdDd(), (et, vl) -> ((EReceivePlan)et).setSapUpdDd((String)vl), "sapUpdDd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSapUpdHh(), (et, vl) -> ((EReceivePlan)et).setSapUpdHh((String)vl), "sapUpdHh");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSapUpdMi(), (et, vl) -> ((EReceivePlan)et).setSapUpdMi((String)vl), "sapUpdMi");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSapUpdSs(), (et, vl) -> ((EReceivePlan)et).setSapUpdSs((String)vl), "sapUpdSs");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSapUpdUserCd(), (et, vl) -> ((EReceivePlan)et).setSapUpdUserCd((String)vl), "sapUpdUserCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr01(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr01((String)vl), "dataTransferOnlyStr01");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr02(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr02((String)vl), "dataTransferOnlyStr02");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr03(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr03((String)vl), "dataTransferOnlyStr03");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr04(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr04((String)vl), "dataTransferOnlyStr04");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr05(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr05((String)vl), "dataTransferOnlyStr05");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr06(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr06((String)vl), "dataTransferOnlyStr06");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr07(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr07((String)vl), "dataTransferOnlyStr07");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr08(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr08((String)vl), "dataTransferOnlyStr08");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr09(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr09((String)vl), "dataTransferOnlyStr09");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr10(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr10((String)vl), "dataTransferOnlyStr10");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr11(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr11((String)vl), "dataTransferOnlyStr11");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr12(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr12((String)vl), "dataTransferOnlyStr12");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr13(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr13((String)vl), "dataTransferOnlyStr13");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr14(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr14((String)vl), "dataTransferOnlyStr14");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr15(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr15((String)vl), "dataTransferOnlyStr15");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr16(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr16((String)vl), "dataTransferOnlyStr16");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr17(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr17((String)vl), "dataTransferOnlyStr17");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr18(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr18((String)vl), "dataTransferOnlyStr18");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr19(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr19((String)vl), "dataTransferOnlyStr19");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr20(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr20((String)vl), "dataTransferOnlyStr20");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr21(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr21((String)vl), "dataTransferOnlyStr21");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr22(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr22((String)vl), "dataTransferOnlyStr22");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr23(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr23((String)vl), "dataTransferOnlyStr23");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr24(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr24((String)vl), "dataTransferOnlyStr24");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr25(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr25((String)vl), "dataTransferOnlyStr25");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr26(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr26((String)vl), "dataTransferOnlyStr26");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr27(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr27((String)vl), "dataTransferOnlyStr27");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDataTransferOnlyStr28(), (et, vl) -> ((EReceivePlan)et).setDataTransferOnlyStr28((String)vl), "dataTransferOnlyStr28");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSpareStr(), (et, vl) -> ((EReceivePlan)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDelFlg(), (et, vl) -> ((EReceivePlan)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getVersionNo(), (et, vl) -> ((EReceivePlan)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getControlNo(), (et, vl) -> ((EReceivePlan)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getAddDt(), (et, vl) -> ((EReceivePlan)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getAddUser(), (et, vl) -> ((EReceivePlan)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getAddProcess(), (et, vl) -> ((EReceivePlan)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getUpdDt(), (et, vl) -> ((EReceivePlan)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getUpdUser(), (et, vl) -> ((EReceivePlan)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getUpdProcess(), (et, vl) -> ((EReceivePlan)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "e_receive_plan";
    protected final String _tableDispName = "e_receive_plan";
    protected final String _tablePropertyName = "EReceivePlan";
    protected final TableSqlName _tableSqlName = new TableSqlName("e_receive_plan", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReceivePlanId = cci("RECEIVE_PLAN_ID", "RECEIVE_PLAN_ID", null, null, Long.class, "receivePlanId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreSlipNo = cci("STORE_SLIP_NO", "STORE_SLIP_NO", null, null, String.class, "storeSlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreSlipRowNo = cci("STORE_SLIP_ROW_NO", "STORE_SLIP_ROW_NO", null, null, String.class, "storeSlipRowNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipTypeCd = cci("SLIP_TYPE_CD", "SLIP_TYPE_CD", null, null, String.class, "slipTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIfId = cci("IF_ID", "IF_ID", null, null, String.class, "ifId", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIfNo = cci("IF_NO", "IF_NO", null, null, String.class, "ifNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuCd = cci("HINMOKU_CD", "HINMOKU_CD", null, null, String.class, "hinmokuCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuGroup = cci("HINMOKU_GROUP", "HINMOKU_GROUP", null, null, String.class, "hinmokuGroup", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSanshaTypeCd = cci("SANSHA_TYPE_CD", "SANSHA_TYPE_CD", null, null, String.class, "sanshaTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveReasonCd = cci("RECEIVE_REASON_CD", "RECEIVE_REASON_CD", null, null, String.class, "receiveReasonCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveReasonNm = cci("RECEIVE_REASON_NM", "RECEIVE_REASON_NM", null, null, String.class, "receiveReasonNm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerCd = cci("CUSTOMER_CD", "CUSTOMER_CD", null, null, String.class, "customerCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerNm = cci("CUSTOMER_NM", "CUSTOMER_NM", null, null, String.class, "customerNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderDate = cci("ORDER_DATE", "ORDER_DATE", null, null, String.class, "orderDate", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderTime = cci("ORDER_TIME", "ORDER_TIME", null, null, String.class, "orderTime", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnConfirmedDeliveryDate = cci("CONFIRMED_DELIVERY_DATE", "CONFIRMED_DELIVERY_DATE", null, null, String.class, "confirmedDeliveryDate", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuText = cci("HINMOKU_TEXT", "HINMOKU_TEXT", null, null, String.class, "hinmokuText", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNm = cci("UNIT_NM", "UNIT_NM", null, null, String.class, "unitNm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanNum = cci("RECEIVE_PLAN_NUM", "RECEIVE_PLAN_NUM", null, null, String.class, "receivePlanNum", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRemainingNum = cci("RECEIVE_REMAINING_NUM", "RECEIVE_REMAINING_NUM", null, null, String.class, "receiveRemainingNum", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStorePlantCd = cci("STORE_PLANT_CD", "STORE_PLANT_CD", null, null, String.class, "storePlantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreStorageSpaceCd = cci("STORE_STORAGE_SPACE_CD", "STORE_STORAGE_SPACE_CD", null, null, String.class, "storeStorageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingPlantCd = cci("SHIPPING_PLANT_CD", "SHIPPING_PLANT_CD", null, null, String.class, "shippingPlantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStorageSpaceCd = cci("SHIPPING_STORAGE_SPACE_CD", "SHIPPING_STORAGE_SPACE_CD", null, null, String.class, "shippingStorageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotManagTypeCd = cci("LOT_MANAG_TYPE_CD", "LOT_MANAG_TYPE_CD", null, null, String.class, "lotManagTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaCd = cci("TENHANSHA_CD", "TENHANSHA_CD", null, null, String.class, "tenhanshaCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgCd = cci("SALES_ORG_CD", "SALES_ORG_CD", null, null, String.class, "salesOrgCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaNm1 = cci("TENHANSHA_NM1", "TENHANSHA_NM1", null, null, String.class, "tenhanshaNm1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaNm2 = cci("TENHANSHA_NM2", "TENHANSHA_NM2", null, null, String.class, "tenhanshaNm2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUserCd = cci("SAP_USER_CD", "SAP_USER_CD", null, null, String.class, "sapUserCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUserNm = cci("SAP_USER_NM", "SAP_USER_NM", null, null, String.class, "sapUserNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnModTypeCd = cci("MOD_TYPE_CD", "MOD_TYPE_CD", null, null, String.class, "modTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositJanCd = cci("DEPOSIT_JAN_CD", "DEPOSIT_JAN_CD", null, null, String.class, "depositJanCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTimesNum = cci("TIMES_NUM", "TIMES_NUM", null, null, String.class, "timesNum", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAccountOrderNo = cci("ACCOUNT_ORDER_NO", "ACCOUNT_ORDER_NO", null, null, String.class, "accountOrderNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapSupplierCd = cci("SAP_SUPPLIER_CD", "SAP_SUPPLIER_CD", null, null, String.class, "sapSupplierCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapVenderCd = cci("SAP_VENDER_CD", "SAP_VENDER_CD", null, null, String.class, "sapVenderCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTodayFlg = cci("TODAY_FLG", "TODAY_FLG", null, null, String.class, "todayFlg", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSanshaDeliverySlipNo1 = cci("SANSHA_DELIVERY_SLIP_NO1", "SANSHA_DELIVERY_SLIP_NO1", null, null, String.class, "sanshaDeliverySlipNo1", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTypeCd = cci("DATA_TYPE_CD", "DATA_TYPE_CD", null, null, String.class, "dataTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsSendFlg = cci("WMS_SEND_FLG", "WMS_SEND_FLG", null, null, String.class, "wmsSendFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLpSendFlg = cci("LP_SEND_FLG", "LP_SEND_FLG", null, null, String.class, "lpSendFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnDataTransferOnlyStr01 = cci("DATA_TRANSFER_ONLY_STR01", "DATA_TRANSFER_ONLY_STR01", null, null, String.class, "dataTransferOnlyStr01", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr02 = cci("DATA_TRANSFER_ONLY_STR02", "DATA_TRANSFER_ONLY_STR02", null, null, String.class, "dataTransferOnlyStr02", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr03 = cci("DATA_TRANSFER_ONLY_STR03", "DATA_TRANSFER_ONLY_STR03", null, null, String.class, "dataTransferOnlyStr03", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr04 = cci("DATA_TRANSFER_ONLY_STR04", "DATA_TRANSFER_ONLY_STR04", null, null, String.class, "dataTransferOnlyStr04", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr05 = cci("DATA_TRANSFER_ONLY_STR05", "DATA_TRANSFER_ONLY_STR05", null, null, String.class, "dataTransferOnlyStr05", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr06 = cci("DATA_TRANSFER_ONLY_STR06", "DATA_TRANSFER_ONLY_STR06", null, null, String.class, "dataTransferOnlyStr06", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr07 = cci("DATA_TRANSFER_ONLY_STR07", "DATA_TRANSFER_ONLY_STR07", null, null, String.class, "dataTransferOnlyStr07", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr08 = cci("DATA_TRANSFER_ONLY_STR08", "DATA_TRANSFER_ONLY_STR08", null, null, String.class, "dataTransferOnlyStr08", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr09 = cci("DATA_TRANSFER_ONLY_STR09", "DATA_TRANSFER_ONLY_STR09", null, null, String.class, "dataTransferOnlyStr09", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr10 = cci("DATA_TRANSFER_ONLY_STR10", "DATA_TRANSFER_ONLY_STR10", null, null, String.class, "dataTransferOnlyStr10", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr11 = cci("DATA_TRANSFER_ONLY_STR11", "DATA_TRANSFER_ONLY_STR11", null, null, String.class, "dataTransferOnlyStr11", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr12 = cci("DATA_TRANSFER_ONLY_STR12", "DATA_TRANSFER_ONLY_STR12", null, null, String.class, "dataTransferOnlyStr12", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr13 = cci("DATA_TRANSFER_ONLY_STR13", "DATA_TRANSFER_ONLY_STR13", null, null, String.class, "dataTransferOnlyStr13", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr14 = cci("DATA_TRANSFER_ONLY_STR14", "DATA_TRANSFER_ONLY_STR14", null, null, String.class, "dataTransferOnlyStr14", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr15 = cci("DATA_TRANSFER_ONLY_STR15", "DATA_TRANSFER_ONLY_STR15", null, null, String.class, "dataTransferOnlyStr15", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr16 = cci("DATA_TRANSFER_ONLY_STR16", "DATA_TRANSFER_ONLY_STR16", null, null, String.class, "dataTransferOnlyStr16", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr17 = cci("DATA_TRANSFER_ONLY_STR17", "DATA_TRANSFER_ONLY_STR17", null, null, String.class, "dataTransferOnlyStr17", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr18 = cci("DATA_TRANSFER_ONLY_STR18", "DATA_TRANSFER_ONLY_STR18", null, null, String.class, "dataTransferOnlyStr18", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr19 = cci("DATA_TRANSFER_ONLY_STR19", "DATA_TRANSFER_ONLY_STR19", null, null, String.class, "dataTransferOnlyStr19", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr20 = cci("DATA_TRANSFER_ONLY_STR20", "DATA_TRANSFER_ONLY_STR20", null, null, String.class, "dataTransferOnlyStr20", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr21 = cci("DATA_TRANSFER_ONLY_STR21", "DATA_TRANSFER_ONLY_STR21", null, null, String.class, "dataTransferOnlyStr21", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr22 = cci("DATA_TRANSFER_ONLY_STR22", "DATA_TRANSFER_ONLY_STR22", null, null, String.class, "dataTransferOnlyStr22", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr23 = cci("DATA_TRANSFER_ONLY_STR23", "DATA_TRANSFER_ONLY_STR23", null, null, String.class, "dataTransferOnlyStr23", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr24 = cci("DATA_TRANSFER_ONLY_STR24", "DATA_TRANSFER_ONLY_STR24", null, null, String.class, "dataTransferOnlyStr24", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr25 = cci("DATA_TRANSFER_ONLY_STR25", "DATA_TRANSFER_ONLY_STR25", null, null, String.class, "dataTransferOnlyStr25", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr26 = cci("DATA_TRANSFER_ONLY_STR26", "DATA_TRANSFER_ONLY_STR26", null, null, String.class, "dataTransferOnlyStr26", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr27 = cci("DATA_TRANSFER_ONLY_STR27", "DATA_TRANSFER_ONLY_STR27", null, null, String.class, "dataTransferOnlyStr27", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr28 = cci("DATA_TRANSFER_ONLY_STR28", "DATA_TRANSFER_ONLY_STR28", null, null, String.class, "dataTransferOnlyStr28", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * RECEIVE_PLAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanId() { return _columnReceivePlanId; }
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
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * STORE_SLIP_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreSlipNo() { return _columnStoreSlipNo; }
    /**
     * STORE_SLIP_ROW_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreSlipRowNo() { return _columnStoreSlipRowNo; }
    /**
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipTypeCd() { return _columnSlipTypeCd; }
    /**
     * IF_ID: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIfId() { return _columnIfId; }
    /**
     * IF_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIfNo() { return _columnIfNo; }
    /**
     * HINMOKU_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuCd() { return _columnHinmokuCd; }
    /**
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuGroup() { return _columnHinmokuGroup; }
    /**
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSanshaTypeCd() { return _columnSanshaTypeCd; }
    /**
     * RECEIVE_REASON_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveReasonCd() { return _columnReceiveReasonCd; }
    /**
     * RECEIVE_REASON_NM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveReasonNm() { return _columnReceiveReasonNm; }
    /**
     * CUSTOMER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerCd() { return _columnCustomerCd; }
    /**
     * CUSTOMER_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerNm() { return _columnCustomerNm; }
    /**
     * ORDER_DATE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderDate() { return _columnOrderDate; }
    /**
     * ORDER_TIME: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderTime() { return _columnOrderTime; }
    /**
     * CONFIRMED_DELIVERY_DATE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConfirmedDeliveryDate() { return _columnConfirmedDeliveryDate; }
    /**
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuText() { return _columnHinmokuText; }
    /**
     * JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * UNIT_NM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNm() { return _columnUnitNm; }
    /**
     * RECEIVE_PLAN_NUM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanNum() { return _columnReceivePlanNum; }
    /**
     * RECEIVE_REMAINING_NUM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRemainingNum() { return _columnReceiveRemainingNum; }
    /**
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStorePlantCd() { return _columnStorePlantCd; }
    /**
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreStorageSpaceCd() { return _columnStoreStorageSpaceCd; }
    /**
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingPlantCd() { return _columnShippingPlantCd; }
    /**
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStorageSpaceCd() { return _columnShippingStorageSpaceCd; }
    /**
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotManagTypeCd() { return _columnLotManagTypeCd; }
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
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnModTypeCd() { return _columnModTypeCd; }
    /**
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositJanCd() { return _columnDepositJanCd; }
    /**
     * TIMES_NUM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimesNum() { return _columnTimesNum; }
    /**
     * ACCOUNT_ORDER_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccountOrderNo() { return _columnAccountOrderNo; }
    /**
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapSupplierCd() { return _columnSapSupplierCd; }
    /**
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapVenderCd() { return _columnSapVenderCd; }
    /**
     * TODAY_FLG: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTodayFlg() { return _columnTodayFlg; }
    /**
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSanshaDeliverySlipNo1() { return _columnSanshaDeliverySlipNo1; }
    /**
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTypeCd() { return _columnDataTypeCd; }
    /**
     * WMS_SEND_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsSendFlg() { return _columnWmsSendFlg; }
    /**
     * LP_SEND_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLpSendFlg() { return _columnLpSendFlg; }
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
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr01() { return _columnDataTransferOnlyStr01; }
    /**
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr02() { return _columnDataTransferOnlyStr02; }
    /**
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr03() { return _columnDataTransferOnlyStr03; }
    /**
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr04() { return _columnDataTransferOnlyStr04; }
    /**
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr05() { return _columnDataTransferOnlyStr05; }
    /**
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr06() { return _columnDataTransferOnlyStr06; }
    /**
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr07() { return _columnDataTransferOnlyStr07; }
    /**
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr08() { return _columnDataTransferOnlyStr08; }
    /**
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr09() { return _columnDataTransferOnlyStr09; }
    /**
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr10() { return _columnDataTransferOnlyStr10; }
    /**
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr11() { return _columnDataTransferOnlyStr11; }
    /**
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr12() { return _columnDataTransferOnlyStr12; }
    /**
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr13() { return _columnDataTransferOnlyStr13; }
    /**
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr14() { return _columnDataTransferOnlyStr14; }
    /**
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr15() { return _columnDataTransferOnlyStr15; }
    /**
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr16() { return _columnDataTransferOnlyStr16; }
    /**
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr17() { return _columnDataTransferOnlyStr17; }
    /**
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr18() { return _columnDataTransferOnlyStr18; }
    /**
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr19() { return _columnDataTransferOnlyStr19; }
    /**
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr20() { return _columnDataTransferOnlyStr20; }
    /**
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr21() { return _columnDataTransferOnlyStr21; }
    /**
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr22() { return _columnDataTransferOnlyStr22; }
    /**
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr23() { return _columnDataTransferOnlyStr23; }
    /**
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr24() { return _columnDataTransferOnlyStr24; }
    /**
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr25() { return _columnDataTransferOnlyStr25; }
    /**
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr26() { return _columnDataTransferOnlyStr26; }
    /**
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr27() { return _columnDataTransferOnlyStr27; }
    /**
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr28() { return _columnDataTransferOnlyStr28; }
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
        ls.add(columnReceivePlanId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnStoreSlipNo());
        ls.add(columnStoreSlipRowNo());
        ls.add(columnSlipTypeCd());
        ls.add(columnIfId());
        ls.add(columnIfNo());
        ls.add(columnHinmokuCd());
        ls.add(columnHinmokuGroup());
        ls.add(columnSanshaTypeCd());
        ls.add(columnReceiveReasonCd());
        ls.add(columnReceiveReasonNm());
        ls.add(columnCustomerCd());
        ls.add(columnCustomerNm());
        ls.add(columnOrderDate());
        ls.add(columnOrderTime());
        ls.add(columnConfirmedDeliveryDate());
        ls.add(columnHinmokuText());
        ls.add(columnJanCd());
        ls.add(columnUnitNm());
        ls.add(columnReceivePlanNum());
        ls.add(columnReceiveRemainingNum());
        ls.add(columnStorePlantCd());
        ls.add(columnStoreStorageSpaceCd());
        ls.add(columnShippingPlantCd());
        ls.add(columnShippingStorageSpaceCd());
        ls.add(columnLotManagTypeCd());
        ls.add(columnTenhanshaCd());
        ls.add(columnSalesOrgCd());
        ls.add(columnTenhanshaNm1());
        ls.add(columnTenhanshaNm2());
        ls.add(columnSapUserCd());
        ls.add(columnSapUserNm());
        ls.add(columnModTypeCd());
        ls.add(columnDepositJanCd());
        ls.add(columnTimesNum());
        ls.add(columnAccountOrderNo());
        ls.add(columnSapSupplierCd());
        ls.add(columnSapVenderCd());
        ls.add(columnTodayFlg());
        ls.add(columnSanshaDeliverySlipNo1());
        ls.add(columnDataTypeCd());
        ls.add(columnWmsSendFlg());
        ls.add(columnLpSendFlg());
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
        ls.add(columnDataTransferOnlyStr01());
        ls.add(columnDataTransferOnlyStr02());
        ls.add(columnDataTransferOnlyStr03());
        ls.add(columnDataTransferOnlyStr04());
        ls.add(columnDataTransferOnlyStr05());
        ls.add(columnDataTransferOnlyStr06());
        ls.add(columnDataTransferOnlyStr07());
        ls.add(columnDataTransferOnlyStr08());
        ls.add(columnDataTransferOnlyStr09());
        ls.add(columnDataTransferOnlyStr10());
        ls.add(columnDataTransferOnlyStr11());
        ls.add(columnDataTransferOnlyStr12());
        ls.add(columnDataTransferOnlyStr13());
        ls.add(columnDataTransferOnlyStr14());
        ls.add(columnDataTransferOnlyStr15());
        ls.add(columnDataTransferOnlyStr16());
        ls.add(columnDataTransferOnlyStr17());
        ls.add(columnDataTransferOnlyStr18());
        ls.add(columnDataTransferOnlyStr19());
        ls.add(columnDataTransferOnlyStr20());
        ls.add(columnDataTransferOnlyStr21());
        ls.add(columnDataTransferOnlyStr22());
        ls.add(columnDataTransferOnlyStr23());
        ls.add(columnDataTransferOnlyStr24());
        ls.add(columnDataTransferOnlyStr25());
        ls.add(columnDataTransferOnlyStr26());
        ls.add(columnDataTransferOnlyStr27());
        ls.add(columnDataTransferOnlyStr28());
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
    protected UniqueInfo cpui() { return hpcpui(columnReceivePlanId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EReceivePlan"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EReceivePlanCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EReceivePlanBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EReceivePlan> getEntityType() { return EReceivePlan.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EReceivePlan newEntity() { return new EReceivePlan(); }
    public EReceivePlan newMyEntity() { return new EReceivePlan(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EReceivePlan)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EReceivePlan)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
