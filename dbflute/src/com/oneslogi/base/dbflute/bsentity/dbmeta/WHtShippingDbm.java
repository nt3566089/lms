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
 * The DB meta of w_ht_shipping. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WHtShippingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WHtShippingDbm _instance = new WHtShippingDbm();
    private WHtShippingDbm() {}
    public static WHtShippingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WHtShipping)et).getHtShippingId(), (et, vl) -> ((WHtShipping)et).setHtShippingId(ctl(vl)), "htShippingId");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getMacAddress(), (et, vl) -> ((WHtShipping)et).setMacAddress((String)vl), "macAddress");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getAllocInstHId(), (et, vl) -> ((WHtShipping)et).setAllocInstHId(ctl(vl)), "allocInstHId");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getClientId(), (et, vl) -> ((WHtShipping)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getCenterId(), (et, vl) -> ((WHtShipping)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getNizoroeNo(), (et, vl) -> ((WHtShipping)et).setNizoroeNo((String)vl), "nizoroeNo");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getProductId(), (et, vl) -> ((WHtShipping)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getJanCd(), (et, vl) -> ((WHtShipping)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getProductCd(), (et, vl) -> ((WHtShipping)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getProductNm(), (et, vl) -> ((WHtShipping)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getInstNum(), (et, vl) -> ((WHtShipping)et).setInstNum(ctb(vl)), "instNum");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getSpgQtyOns(), (et, vl) -> ((WHtShipping)et).setSpgQtyOns(ctb(vl)), "spgQtyOns");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getSpgQtyRemain(), (et, vl) -> ((WHtShipping)et).setSpgQtyRemain(ctb(vl)), "spgQtyRemain");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getPieceNo(), (et, vl) -> ((WHtShipping)et).setPieceNo(ctl(vl)), "pieceNo");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getSpgWorkComment(), (et, vl) -> ((WHtShipping)et).setSpgWorkComment((String)vl), "spgWorkComment");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getBoxId(), (et, vl) -> ((WHtShipping)et).setBoxId(ctl(vl)), "boxId");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getBoxCd(), (et, vl) -> ((WHtShipping)et).setBoxCd((String)vl), "boxCd");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getBoxNm(), (et, vl) -> ((WHtShipping)et).setBoxNm((String)vl), "boxNm");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getPickingWorkNo(), (et, vl) -> ((WHtShipping)et).setPickingWorkNo((String)vl), "pickingWorkNo");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getLot(), (et, vl) -> ((WHtShipping)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getConsumeDt(), (et, vl) -> ((WHtShipping)et).setConsumeDt((String)vl), "consumeDt");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getProdDt(), (et, vl) -> ((WHtShipping)et).setProdDt((String)vl), "prodDt");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getIndvLabelNo(), (et, vl) -> ((WHtShipping)et).setIndvLabelNo((String)vl), "indvLabelNo");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getExpectedShipmentNo(), (et, vl) -> ((WHtShipping)et).setExpectedShipmentNo((String)vl), "expectedShipmentNo");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getForceCopleteFlg(), (et, vl) -> ((WHtShipping)et).setForceCopleteFlg((String)vl), "forceCopleteFlg");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getSuspendFlg(), (et, vl) -> ((WHtShipping)et).setSuspendFlg((String)vl), "suspendFlg");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getReceiveLabelNo(), (et, vl) -> ((WHtShipping)et).setReceiveLabelNo((String)vl), "receiveLabelNo");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getNizoroeNo2(), (et, vl) -> ((WHtShipping)et).setNizoroeNo2((String)vl), "nizoroeNo2");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getDaihyoNizoroeNo(), (et, vl) -> ((WHtShipping)et).setDaihyoNizoroeNo((String)vl), "daihyoNizoroeNo");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getDaihyoNizoroeNo2(), (et, vl) -> ((WHtShipping)et).setDaihyoNizoroeNo2((String)vl), "daihyoNizoroeNo2");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getDelFlg(), (et, vl) -> ((WHtShipping)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getVersionNo(), (et, vl) -> ((WHtShipping)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getControlNo(), (et, vl) -> ((WHtShipping)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getAddDt(), (et, vl) -> ((WHtShipping)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getAddUser(), (et, vl) -> ((WHtShipping)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getAddProcess(), (et, vl) -> ((WHtShipping)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getUpdDt(), (et, vl) -> ((WHtShipping)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getUpdUser(), (et, vl) -> ((WHtShipping)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WHtShipping)et).getUpdProcess(), (et, vl) -> ((WHtShipping)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((WHtShipping)et).getMCenter(), (et, vl) -> ((WHtShipping)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((WHtShipping)et).getMBox(), (et, vl) -> ((WHtShipping)et).setMBox((MBox)vl), "MBox");
        setupEfpg(_efpgMap, et -> ((WHtShipping)et).getMProduct(), (et, vl) -> ((WHtShipping)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((WHtShipping)et).getMClient(), (et, vl) -> ((WHtShipping)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "w_ht_shipping";
    protected final String _tableDispName = "w_ht_shipping";
    protected final String _tablePropertyName = "WHtShipping";
    protected final TableSqlName _tableSqlName = new TableSqlName("w_ht_shipping", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnHtShippingId = cci("HT_SHIPPING_ID", "HT_SHIPPING_ID", null, null, Long.class, "htShippingId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMacAddress = cci("MAC_ADDRESS", "MAC_ADDRESS", null, null, String.class, "macAddress", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocInstHId = cci("ALLOC_INST_H_ID", "ALLOC_INST_H_ID", null, null, Long.class, "allocInstHId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnNizoroeNo = cci("NIZOROE_NO", "NIZOROE_NO", null, null, String.class, "nizoroeNo", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstNum = cci("INST_NUM", "INST_NUM", null, null, java.math.BigDecimal.class, "instNum", null, false, false, true, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpgQtyOns = cci("SPG_QTY_ONS", "SPG_QTY_ONS", null, null, java.math.BigDecimal.class, "spgQtyOns", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpgQtyRemain = cci("SPG_QTY_REMAIN", "SPG_QTY_REMAIN", null, null, java.math.BigDecimal.class, "spgQtyRemain", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPieceNo = cci("PIECE_NO", "PIECE_NO", null, null, Long.class, "pieceNo", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpgWorkComment = cci("SPG_WORK_COMMENT", "SPG_WORK_COMMENT", null, null, String.class, "spgWorkComment", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxId = cci("BOX_ID", "BOX_ID", null, null, Long.class, "boxId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MBox", null, null, false);
    protected final ColumnInfo _columnBoxCd = cci("BOX_CD", "BOX_CD", null, null, String.class, "boxCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxNm = cci("BOX_NM", "BOX_NM", null, null, String.class, "boxNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNo = cci("PICKING_WORK_NO", "PICKING_WORK_NO", null, null, String.class, "pickingWorkNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnConsumeDt = cci("CONSUME_DT", "CONSUME_DT", null, null, String.class, "consumeDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProdDt = cci("PROD_DT", "PROD_DT", null, null, String.class, "prodDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndvLabelNo = cci("INDV_LABEL_NO", "INDV_LABEL_NO", null, null, String.class, "indvLabelNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectedShipmentNo = cci("EXPECTED_SHIPMENT_NO", "EXPECTED_SHIPMENT_NO", null, null, String.class, "expectedShipmentNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForceCopleteFlg = cci("FORCE_COPLETE_FLG", "FORCE_COPLETE_FLG", null, null, String.class, "forceCopleteFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuspendFlg = cci("SUSPEND_FLG", "SUSPEND_FLG", null, null, String.class, "suspendFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveLabelNo = cci("RECEIVE_LABEL_NO", "RECEIVE_LABEL_NO", null, null, String.class, "receiveLabelNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeNo2 = cci("NIZOROE_NO2", "NIZOROE_NO2", null, null, String.class, "nizoroeNo2", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDaihyoNizoroeNo = cci("DAIHYO_NIZOROE_NO", "DAIHYO_NIZOROE_NO", null, null, String.class, "daihyoNizoroeNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDaihyoNizoroeNo2 = cci("DAIHYO_NIZOROE_NO2", "DAIHYO_NIZOROE_NO2", null, null, String.class, "daihyoNizoroeNo2", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * HT_SHIPPING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtShippingId() { return _columnHtShippingId; }
    /**
     * MAC_ADDRESS: {IX, NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMacAddress() { return _columnMacAddress; }
    /**
     * ALLOC_INST_H_ID: {NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocInstHId() { return _columnAllocInstHId; }
    /**
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * NIZOROE_NO: {NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeNo() { return _columnNizoroeNo; }
    /**
     * PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * PRODUCT_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * INST_NUM: {NotNull, DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstNum() { return _columnInstNum; }
    /**
     * SPG_QTY_ONS: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpgQtyOns() { return _columnSpgQtyOns; }
    /**
     * SPG_QTY_REMAIN: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpgQtyRemain() { return _columnSpgQtyRemain; }
    /**
     * PIECE_NO: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPieceNo() { return _columnPieceNo; }
    /**
     * SPG_WORK_COMMENT: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpgWorkComment() { return _columnSpgWorkComment; }
    /**
     * BOX_ID: {IX, BIGINT(19), FK to m_box}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxId() { return _columnBoxId; }
    /**
     * BOX_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxCd() { return _columnBoxCd; }
    /**
     * BOX_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxNm() { return _columnBoxNm; }
    /**
     * PICKING_WORK_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkNo() { return _columnPickingWorkNo; }
    /**
     * LOT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot() { return _columnLot; }
    /**
     * CONSUME_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConsumeDt() { return _columnConsumeDt; }
    /**
     * PROD_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProdDt() { return _columnProdDt; }
    /**
     * INDV_LABEL_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndvLabelNo() { return _columnIndvLabelNo; }
    /**
     * EXPECTED_SHIPMENT_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectedShipmentNo() { return _columnExpectedShipmentNo; }
    /**
     * FORCE_COPLETE_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForceCopleteFlg() { return _columnForceCopleteFlg; }
    /**
     * SUSPEND_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuspendFlg() { return _columnSuspendFlg; }
    /**
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveLabelNo() { return _columnReceiveLabelNo; }
    /**
     * NIZOROE_NO2: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeNo2() { return _columnNizoroeNo2; }
    /**
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDaihyoNizoroeNo() { return _columnDaihyoNizoroeNo; }
    /**
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDaihyoNizoroeNo2() { return _columnDaihyoNizoroeNo2; }
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
        ls.add(columnHtShippingId());
        ls.add(columnMacAddress());
        ls.add(columnAllocInstHId());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnNizoroeNo());
        ls.add(columnProductId());
        ls.add(columnJanCd());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnInstNum());
        ls.add(columnSpgQtyOns());
        ls.add(columnSpgQtyRemain());
        ls.add(columnPieceNo());
        ls.add(columnSpgWorkComment());
        ls.add(columnBoxId());
        ls.add(columnBoxCd());
        ls.add(columnBoxNm());
        ls.add(columnPickingWorkNo());
        ls.add(columnLot());
        ls.add(columnConsumeDt());
        ls.add(columnProdDt());
        ls.add(columnIndvLabelNo());
        ls.add(columnExpectedShipmentNo());
        ls.add(columnForceCopleteFlg());
        ls.add(columnSuspendFlg());
        ls.add(columnReceiveLabelNo());
        ls.add(columnNizoroeNo2());
        ls.add(columnDaihyoNizoroeNo());
        ls.add(columnDaihyoNizoroeNo2());
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
    protected UniqueInfo cpui() { return hpcpui(columnHtShippingId()); }
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
     * m_center by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("W_HT_SHIPPING_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "WHtShippingList", false);
    }
    /**
     * m_box by my BOX_ID, named 'MBox'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMBox() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBoxId(), MBoxDbm.getInstance().columnBoxId());
        return cfi("W_HT_SHIPPING_FK3", "MBox", this, MBoxDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "WHtShippingList", false);
    }
    /**
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("W_HT_SHIPPING_FK4", "MProduct", this, MProductDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "WHtShippingList", false);
    }
    /**
     * m_client by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("W_HT_SHIPPING_FK1", "MClient", this, MClientDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "WHtShippingList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WHtShipping"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WHtShippingCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WHtShippingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WHtShipping> getEntityType() { return WHtShipping.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WHtShipping newEntity() { return new WHtShipping(); }
    public WHtShipping newMyEntity() { return new WHtShipping(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WHtShipping)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WHtShipping)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
