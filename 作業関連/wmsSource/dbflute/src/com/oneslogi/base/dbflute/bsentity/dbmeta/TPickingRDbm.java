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
 * The DB meta of t_picking_r. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TPickingRDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TPickingRDbm _instance = new TPickingRDbm();
    private TPickingRDbm() {}
    public static TPickingRDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TPickingR)et).getPickingHId(), (et, vl) -> ((TPickingR)et).setPickingHId(ctl(vl)), "pickingHId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getOplOutFlg(), (et, vl) -> ((TPickingR)et).setOplOutFlg((String)vl), "oplOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getTplOutFlg(), (et, vl) -> ((TPickingR)et).setTplOutFlg((String)vl), "tplOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getMltOutFlg(), (et, vl) -> ((TPickingR)et).setMltOutFlg((String)vl), "mltOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getSplOutFlg(), (et, vl) -> ((TPickingR)et).setSplOutFlg((String)vl), "splOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPl1OutFlg(), (et, vl) -> ((TPickingR)et).setPl1OutFlg((String)vl), "pl1OutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPl1OutUserId(), (et, vl) -> ((TPickingR)et).setPl1OutUserId(ctl(vl)), "pl1OutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPl1OutDt(), (et, vl) -> ((TPickingR)et).setPl1OutDt(cttp(vl)), "pl1OutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPlOutFlg(), (et, vl) -> ((TPickingR)et).setPlOutFlg((String)vl), "plOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPlOutUserId(), (et, vl) -> ((TPickingR)et).setPlOutUserId(ctl(vl)), "plOutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPlOutDt(), (et, vl) -> ((TPickingR)et).setPlOutDt(cttp(vl)), "plOutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getSlOutFlg(), (et, vl) -> ((TPickingR)et).setSlOutFlg((String)vl), "slOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPl2OutFlg(), (et, vl) -> ((TPickingR)et).setPl2OutFlg((String)vl), "pl2OutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPl2OutUserId(), (et, vl) -> ((TPickingR)et).setPl2OutUserId(ctl(vl)), "pl2OutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPl2OutDt(), (et, vl) -> ((TPickingR)et).setPl2OutDt(cttp(vl)), "pl2OutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getCaseOutFlg(), (et, vl) -> ((TPickingR)et).setCaseOutFlg((String)vl), "caseOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getCaseOutUserId(), (et, vl) -> ((TPickingR)et).setCaseOutUserId(ctl(vl)), "caseOutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getCaseOutDt(), (et, vl) -> ((TPickingR)et).setCaseOutDt(cttp(vl)), "caseOutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPackingOutFlg(), (et, vl) -> ((TPickingR)et).setPackingOutFlg((String)vl), "packingOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPackingOutUserId(), (et, vl) -> ((TPickingR)et).setPackingOutUserId(ctl(vl)), "packingOutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPackingOutDt(), (et, vl) -> ((TPickingR)et).setPackingOutDt(cttp(vl)), "packingOutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getSlipOutFlg(), (et, vl) -> ((TPickingR)et).setSlipOutFlg((String)vl), "slipOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getSlipOutUserId(), (et, vl) -> ((TPickingR)et).setSlipOutUserId(ctl(vl)), "slipOutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getSlipOutDt(), (et, vl) -> ((TPickingR)et).setSlipOutDt(cttp(vl)), "slipOutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getInvoiceCreateFlg(), (et, vl) -> ((TPickingR)et).setInvoiceCreateFlg((String)vl), "invoiceCreateFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getInvoiceCreateDt(), (et, vl) -> ((TPickingR)et).setInvoiceCreateDt(cttp(vl)), "invoiceCreateDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getInvoiceIssueNum(), (et, vl) -> ((TPickingR)et).setInvoiceIssueNum(ctl(vl)), "invoiceIssueNum");
        setupEpg(_epgMap, et -> ((TPickingR)et).getShippingRecordOutFlg(), (et, vl) -> ((TPickingR)et).setShippingRecordOutFlg((String)vl), "shippingRecordOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getShippingRecordOutUserId(), (et, vl) -> ((TPickingR)et).setShippingRecordOutUserId(ctl(vl)), "shippingRecordOutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getShippingRecordOutDt(), (et, vl) -> ((TPickingR)et).setShippingRecordOutDt(cttp(vl)), "shippingRecordOutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getBolOutFlg(), (et, vl) -> ((TPickingR)et).setBolOutFlg((String)vl), "bolOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getBolOutUserId(), (et, vl) -> ((TPickingR)et).setBolOutUserId(ctl(vl)), "bolOutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getBolOutDt(), (et, vl) -> ((TPickingR)et).setBolOutDt(cttp(vl)), "bolOutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getTagOutFlg(), (et, vl) -> ((TPickingR)et).setTagOutFlg((String)vl), "tagOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getTagOutUserId(), (et, vl) -> ((TPickingR)et).setTagOutUserId(ctl(vl)), "tagOutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getTagOutDt(), (et, vl) -> ((TPickingR)et).setTagOutDt(cttp(vl)), "tagOutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getDelivOutFlg(), (et, vl) -> ((TPickingR)et).setDelivOutFlg((String)vl), "delivOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getDelivOutUserId(), (et, vl) -> ((TPickingR)et).setDelivOutUserId(ctl(vl)), "delivOutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getDelivOutDt(), (et, vl) -> ((TPickingR)et).setDelivOutDt(cttp(vl)), "delivOutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPllOutFlg(), (et, vl) -> ((TPickingR)et).setPllOutFlg((String)vl), "pllOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPllOutUserId(), (et, vl) -> ((TPickingR)et).setPllOutUserId(ctl(vl)), "pllOutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPllOutDt(), (et, vl) -> ((TPickingR)et).setPllOutDt(cttp(vl)), "pllOutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getNizoroeOutFlg(), (et, vl) -> ((TPickingR)et).setNizoroeOutFlg((String)vl), "nizoroeOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getNizoroeOutUserId(), (et, vl) -> ((TPickingR)et).setNizoroeOutUserId(ctl(vl)), "nizoroeOutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getNizoroeOutDt(), (et, vl) -> ((TPickingR)et).setNizoroeOutDt(cttp(vl)), "nizoroeOutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getIndvSupplyOutFlg(), (et, vl) -> ((TPickingR)et).setIndvSupplyOutFlg((String)vl), "indvSupplyOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getIndvSupplyOutUserId(), (et, vl) -> ((TPickingR)et).setIndvSupplyOutUserId(ctl(vl)), "indvSupplyOutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getIndvSupplyOutDt(), (et, vl) -> ((TPickingR)et).setIndvSupplyOutDt(cttp(vl)), "indvSupplyOutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getIndvLabelOutFlg(), (et, vl) -> ((TPickingR)et).setIndvLabelOutFlg((String)vl), "indvLabelOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getIndvLabelOutUserId(), (et, vl) -> ((TPickingR)et).setIndvLabelOutUserId(ctl(vl)), "indvLabelOutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getIndvLabelOutDt(), (et, vl) -> ((TPickingR)et).setIndvLabelOutDt(cttp(vl)), "indvLabelOutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getDelFlg(), (et, vl) -> ((TPickingR)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getVersionNo(), (et, vl) -> ((TPickingR)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TPickingR)et).getControlNo(), (et, vl) -> ((TPickingR)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TPickingR)et).getAddDt(), (et, vl) -> ((TPickingR)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getAddUser(), (et, vl) -> ((TPickingR)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TPickingR)et).getAddProcess(), (et, vl) -> ((TPickingR)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TPickingR)et).getUpdDt(), (et, vl) -> ((TPickingR)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getUpdUser(), (et, vl) -> ((TPickingR)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TPickingR)et).getUpdProcess(), (et, vl) -> ((TPickingR)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getTPickingH(), (et, vl) -> ((TPickingR)et).setTPickingH((TPickingH)vl), "TPickingH");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserByCaseOutUserId(), (et, vl) -> ((TPickingR)et).setBUserByCaseOutUserId((BUser)vl), "BUserByCaseOutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserByBolOutUserId(), (et, vl) -> ((TPickingR)et).setBUserByBolOutUserId((BUser)vl), "BUserByBolOutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserByPl1OutUserId(), (et, vl) -> ((TPickingR)et).setBUserByPl1OutUserId((BUser)vl), "BUserByPl1OutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserByTagOutUserId(), (et, vl) -> ((TPickingR)et).setBUserByTagOutUserId((BUser)vl), "BUserByTagOutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserByShippingRecordOutUserId(), (et, vl) -> ((TPickingR)et).setBUserByShippingRecordOutUserId((BUser)vl), "BUserByShippingRecordOutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserByDelivOutUserId(), (et, vl) -> ((TPickingR)et).setBUserByDelivOutUserId((BUser)vl), "BUserByDelivOutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserByIndvSupplyOutUserId(), (et, vl) -> ((TPickingR)et).setBUserByIndvSupplyOutUserId((BUser)vl), "BUserByIndvSupplyOutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserByPackingOutUserId(), (et, vl) -> ((TPickingR)et).setBUserByPackingOutUserId((BUser)vl), "BUserByPackingOutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserByPlOutUserId(), (et, vl) -> ((TPickingR)et).setBUserByPlOutUserId((BUser)vl), "BUserByPlOutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserByIndvLabelOutUserId(), (et, vl) -> ((TPickingR)et).setBUserByIndvLabelOutUserId((BUser)vl), "BUserByIndvLabelOutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserByPl2OutUserId(), (et, vl) -> ((TPickingR)et).setBUserByPl2OutUserId((BUser)vl), "BUserByPl2OutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserBySlipOutUserId(), (et, vl) -> ((TPickingR)et).setBUserBySlipOutUserId((BUser)vl), "BUserBySlipOutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserByNizoroeOutUserId(), (et, vl) -> ((TPickingR)et).setBUserByNizoroeOutUserId((BUser)vl), "BUserByNizoroeOutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserByPllOutUserId(), (et, vl) -> ((TPickingR)et).setBUserByPllOutUserId((BUser)vl), "BUserByPllOutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByInvoiceCreateFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByInvoiceCreateFlg((BClassDtl)vl), "BClassDtlByInvoiceCreateFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByOplOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByOplOutFlg((BClassDtl)vl), "BClassDtlByOplOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByTplOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByTplOutFlg((BClassDtl)vl), "BClassDtlByTplOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByCaseOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByCaseOutFlg((BClassDtl)vl), "BClassDtlByCaseOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByMltOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByMltOutFlg((BClassDtl)vl), "BClassDtlByMltOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlBySplOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlBySplOutFlg((BClassDtl)vl), "BClassDtlBySplOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByPlOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByPlOutFlg((BClassDtl)vl), "BClassDtlByPlOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlBySlOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlBySlOutFlg((BClassDtl)vl), "BClassDtlBySlOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByPl1OutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByPl1OutFlg((BClassDtl)vl), "BClassDtlByPl1OutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByPl2OutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByPl2OutFlg((BClassDtl)vl), "BClassDtlByPl2OutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByPackingOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByPackingOutFlg((BClassDtl)vl), "BClassDtlByPackingOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlBySlipOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlBySlipOutFlg((BClassDtl)vl), "BClassDtlBySlipOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByShippingRecordOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByShippingRecordOutFlg((BClassDtl)vl), "BClassDtlByShippingRecordOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByBolOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByBolOutFlg((BClassDtl)vl), "BClassDtlByBolOutFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_picking_r";
    protected final String _tableDispName = "t_picking_r";
    protected final String _tablePropertyName = "TPickingR";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_picking_r", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPickingHId = cci("PICKING_H_ID", "PICKING_H_ID", null, null, Long.class, "pickingHId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, "TPickingH", null, null, false);
    protected final ColumnInfo _columnOplOutFlg = cci("OPL_OUT_FLG", "OPL_OUT_FLG", null, null, String.class, "oplOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByOplOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnTplOutFlg = cci("TPL_OUT_FLG", "TPL_OUT_FLG", null, null, String.class, "tplOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByTplOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnMltOutFlg = cci("MLT_OUT_FLG", "MLT_OUT_FLG", null, null, String.class, "mltOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByMltOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnSplOutFlg = cci("SPL_OUT_FLG", "SPL_OUT_FLG", null, null, String.class, "splOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlBySplOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnPl1OutFlg = cci("PL1_OUT_FLG", "PL1_OUT_FLG", null, null, String.class, "pl1OutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByPl1OutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnPl1OutUserId = cci("PL1_OUT_USER_ID", "PL1_OUT_USER_ID", null, null, Long.class, "pl1OutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByPl1OutUserId", null, null, false);
    protected final ColumnInfo _columnPl1OutDt = cci("PL1_OUT_DT", "PL1_OUT_DT", null, null, java.sql.Timestamp.class, "pl1OutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlOutFlg = cci("PL_OUT_FLG", "PL_OUT_FLG", null, null, String.class, "plOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByPlOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnPlOutUserId = cci("PL_OUT_USER_ID", "PL_OUT_USER_ID", null, null, Long.class, "plOutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByPlOutUserId", null, null, false);
    protected final ColumnInfo _columnPlOutDt = cci("PL_OUT_DT", "PL_OUT_DT", null, null, java.sql.Timestamp.class, "plOutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlOutFlg = cci("SL_OUT_FLG", "SL_OUT_FLG", null, null, String.class, "slOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlBySlOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnPl2OutFlg = cci("PL2_OUT_FLG", "PL2_OUT_FLG", null, null, String.class, "pl2OutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByPl2OutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnPl2OutUserId = cci("PL2_OUT_USER_ID", "PL2_OUT_USER_ID", null, null, Long.class, "pl2OutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByPl2OutUserId", null, null, false);
    protected final ColumnInfo _columnPl2OutDt = cci("PL2_OUT_DT", "PL2_OUT_DT", null, null, java.sql.Timestamp.class, "pl2OutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseOutFlg = cci("CASE_OUT_FLG", "CASE_OUT_FLG", null, null, String.class, "caseOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByCaseOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnCaseOutUserId = cci("CASE_OUT_USER_ID", "CASE_OUT_USER_ID", null, null, Long.class, "caseOutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByCaseOutUserId", null, null, false);
    protected final ColumnInfo _columnCaseOutDt = cci("CASE_OUT_DT", "CASE_OUT_DT", null, null, java.sql.Timestamp.class, "caseOutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingOutFlg = cci("PACKING_OUT_FLG", "PACKING_OUT_FLG", null, null, String.class, "packingOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByPackingOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnPackingOutUserId = cci("PACKING_OUT_USER_ID", "PACKING_OUT_USER_ID", null, null, Long.class, "packingOutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByPackingOutUserId", null, null, false);
    protected final ColumnInfo _columnPackingOutDt = cci("PACKING_OUT_DT", "PACKING_OUT_DT", null, null, java.sql.Timestamp.class, "packingOutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipOutFlg = cci("SLIP_OUT_FLG", "SLIP_OUT_FLG", null, null, String.class, "slipOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlBySlipOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnSlipOutUserId = cci("SLIP_OUT_USER_ID", "SLIP_OUT_USER_ID", null, null, Long.class, "slipOutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserBySlipOutUserId", null, null, false);
    protected final ColumnInfo _columnSlipOutDt = cci("SLIP_OUT_DT", "SLIP_OUT_DT", null, null, java.sql.Timestamp.class, "slipOutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceCreateFlg = cci("INVOICE_CREATE_FLG", "INVOICE_CREATE_FLG", null, null, String.class, "invoiceCreateFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByInvoiceCreateFlg", null, CDef.DefMeta.InvoiceCreateFlg, false);
    protected final ColumnInfo _columnInvoiceCreateDt = cci("INVOICE_CREATE_DT", "INVOICE_CREATE_DT", null, null, java.sql.Timestamp.class, "invoiceCreateDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceIssueNum = cci("INVOICE_ISSUE_NUM", "INVOICE_ISSUE_NUM", null, null, Long.class, "invoiceIssueNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingRecordOutFlg = cci("SHIPPING_RECORD_OUT_FLG", "SHIPPING_RECORD_OUT_FLG", null, null, String.class, "shippingRecordOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByShippingRecordOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnShippingRecordOutUserId = cci("SHIPPING_RECORD_OUT_USER_ID", "SHIPPING_RECORD_OUT_USER_ID", null, null, Long.class, "shippingRecordOutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByShippingRecordOutUserId", null, null, false);
    protected final ColumnInfo _columnShippingRecordOutDt = cci("SHIPPING_RECORD_OUT_DT", "SHIPPING_RECORD_OUT_DT", null, null, java.sql.Timestamp.class, "shippingRecordOutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBolOutFlg = cci("BOL_OUT_FLG", "BOL_OUT_FLG", null, null, String.class, "bolOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByBolOutFlg", null, CDef.DefMeta.BolOutFlg, false);
    protected final ColumnInfo _columnBolOutUserId = cci("BOL_OUT_USER_ID", "BOL_OUT_USER_ID", null, null, Long.class, "bolOutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByBolOutUserId", null, null, false);
    protected final ColumnInfo _columnBolOutDt = cci("BOL_OUT_DT", "BOL_OUT_DT", null, null, java.sql.Timestamp.class, "bolOutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagOutFlg = cci("TAG_OUT_FLG", "TAG_OUT_FLG", null, null, String.class, "tagOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagOutUserId = cci("TAG_OUT_USER_ID", "TAG_OUT_USER_ID", null, null, Long.class, "tagOutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByTagOutUserId", null, null, false);
    protected final ColumnInfo _columnTagOutDt = cci("TAG_OUT_DT", "TAG_OUT_DT", null, null, java.sql.Timestamp.class, "tagOutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivOutFlg = cci("DELIV_OUT_FLG", "DELIV_OUT_FLG", null, null, String.class, "delivOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivOutUserId = cci("DELIV_OUT_USER_ID", "DELIV_OUT_USER_ID", null, null, Long.class, "delivOutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByDelivOutUserId", null, null, false);
    protected final ColumnInfo _columnDelivOutDt = cci("DELIV_OUT_DT", "DELIV_OUT_DT", null, null, java.sql.Timestamp.class, "delivOutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPllOutFlg = cci("PLL_OUT_FLG", "PLL_OUT_FLG", null, null, String.class, "pllOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPllOutUserId = cci("PLL_OUT_USER_ID", "PLL_OUT_USER_ID", null, null, Long.class, "pllOutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByPllOutUserId", null, null, false);
    protected final ColumnInfo _columnPllOutDt = cci("PLL_OUT_DT", "PLL_OUT_DT", null, null, java.sql.Timestamp.class, "pllOutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeOutFlg = cci("NIZOROE_OUT_FLG", "NIZOROE_OUT_FLG", null, null, String.class, "nizoroeOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeOutUserId = cci("NIZOROE_OUT_USER_ID", "NIZOROE_OUT_USER_ID", null, null, Long.class, "nizoroeOutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByNizoroeOutUserId", null, null, false);
    protected final ColumnInfo _columnNizoroeOutDt = cci("NIZOROE_OUT_DT", "NIZOROE_OUT_DT", null, null, java.sql.Timestamp.class, "nizoroeOutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndvSupplyOutFlg = cci("INDV_SUPPLY_OUT_FLG", "INDV_SUPPLY_OUT_FLG", null, null, String.class, "indvSupplyOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndvSupplyOutUserId = cci("INDV_SUPPLY_OUT_USER_ID", "INDV_SUPPLY_OUT_USER_ID", null, null, Long.class, "indvSupplyOutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByIndvSupplyOutUserId", null, null, false);
    protected final ColumnInfo _columnIndvSupplyOutDt = cci("INDV_SUPPLY_OUT_DT", "INDV_SUPPLY_OUT_DT", null, null, java.sql.Timestamp.class, "indvSupplyOutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndvLabelOutFlg = cci("INDV_LABEL_OUT_FLG", "INDV_LABEL_OUT_FLG", null, null, String.class, "indvLabelOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndvLabelOutUserId = cci("INDV_LABEL_OUT_USER_ID", "INDV_LABEL_OUT_USER_ID", null, null, Long.class, "indvLabelOutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByIndvLabelOutUserId", null, null, false);
    protected final ColumnInfo _columnIndvLabelOutDt = cci("INDV_LABEL_OUT_DT", "INDV_LABEL_OUT_DT", null, null, java.sql.Timestamp.class, "indvLabelOutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
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
     * PICKING_H_ID: {PK, NotNull, BIGINT(19), FK to t_picking_h}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingHId() { return _columnPickingHId; }
    /**
     * OPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOplOutFlg() { return _columnOplOutFlg; }
    /**
     * TPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTplOutFlg() { return _columnTplOutFlg; }
    /**
     * MLT_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMltOutFlg() { return _columnMltOutFlg; }
    /**
     * SPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplOutFlg() { return _columnSplOutFlg; }
    /**
     * PL1_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl1OutFlg() { return _columnPl1OutFlg; }
    /**
     * PL1_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl1OutUserId() { return _columnPl1OutUserId; }
    /**
     * PL1_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl1OutDt() { return _columnPl1OutDt; }
    /**
     * PL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlOutFlg() { return _columnPlOutFlg; }
    /**
     * PL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlOutUserId() { return _columnPlOutUserId; }
    /**
     * PL_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlOutDt() { return _columnPlOutDt; }
    /**
     * SL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlOutFlg() { return _columnSlOutFlg; }
    /**
     * PL2_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl2OutFlg() { return _columnPl2OutFlg; }
    /**
     * PL2_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl2OutUserId() { return _columnPl2OutUserId; }
    /**
     * PL2_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl2OutDt() { return _columnPl2OutDt; }
    /**
     * CASE_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseOutFlg() { return _columnCaseOutFlg; }
    /**
     * CASE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseOutUserId() { return _columnCaseOutUserId; }
    /**
     * CASE_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseOutDt() { return _columnCaseOutDt; }
    /**
     * PACKING_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingOutFlg() { return _columnPackingOutFlg; }
    /**
     * PACKING_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingOutUserId() { return _columnPackingOutUserId; }
    /**
     * PACKING_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingOutDt() { return _columnPackingOutDt; }
    /**
     * SLIP_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipOutFlg() { return _columnSlipOutFlg; }
    /**
     * SLIP_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipOutUserId() { return _columnSlipOutUserId; }
    /**
     * SLIP_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipOutDt() { return _columnSlipOutDt; }
    /**
     * INVOICE_CREATE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceCreateFlg() { return _columnInvoiceCreateFlg; }
    /**
     * INVOICE_CREATE_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceCreateDt() { return _columnInvoiceCreateDt; }
    /**
     * INVOICE_ISSUE_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceIssueNum() { return _columnInvoiceIssueNum; }
    /**
     * SHIPPING_RECORD_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingRecordOutFlg() { return _columnShippingRecordOutFlg; }
    /**
     * SHIPPING_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingRecordOutUserId() { return _columnShippingRecordOutUserId; }
    /**
     * SHIPPING_RECORD_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingRecordOutDt() { return _columnShippingRecordOutDt; }
    /**
     * BOL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=BolOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBolOutFlg() { return _columnBolOutFlg; }
    /**
     * BOL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBolOutUserId() { return _columnBolOutUserId; }
    /**
     * BOL_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBolOutDt() { return _columnBolOutDt; }
    /**
     * TAG_OUT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagOutFlg() { return _columnTagOutFlg; }
    /**
     * TAG_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagOutUserId() { return _columnTagOutUserId; }
    /**
     * TAG_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagOutDt() { return _columnTagOutDt; }
    /**
     * DELIV_OUT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivOutFlg() { return _columnDelivOutFlg; }
    /**
     * DELIV_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivOutUserId() { return _columnDelivOutUserId; }
    /**
     * DELIV_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivOutDt() { return _columnDelivOutDt; }
    /**
     * PLL_OUT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPllOutFlg() { return _columnPllOutFlg; }
    /**
     * PLL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPllOutUserId() { return _columnPllOutUserId; }
    /**
     * PLL_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPllOutDt() { return _columnPllOutDt; }
    /**
     * NIZOROE_OUT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeOutFlg() { return _columnNizoroeOutFlg; }
    /**
     * NIZOROE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeOutUserId() { return _columnNizoroeOutUserId; }
    /**
     * NIZOROE_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeOutDt() { return _columnNizoroeOutDt; }
    /**
     * INDV_SUPPLY_OUT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndvSupplyOutFlg() { return _columnIndvSupplyOutFlg; }
    /**
     * INDV_SUPPLY_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndvSupplyOutUserId() { return _columnIndvSupplyOutUserId; }
    /**
     * INDV_SUPPLY_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndvSupplyOutDt() { return _columnIndvSupplyOutDt; }
    /**
     * INDV_LABEL_OUT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndvLabelOutFlg() { return _columnIndvLabelOutFlg; }
    /**
     * INDV_LABEL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndvLabelOutUserId() { return _columnIndvLabelOutUserId; }
    /**
     * INDV_LABEL_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndvLabelOutDt() { return _columnIndvLabelOutDt; }
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
        ls.add(columnPickingHId());
        ls.add(columnOplOutFlg());
        ls.add(columnTplOutFlg());
        ls.add(columnMltOutFlg());
        ls.add(columnSplOutFlg());
        ls.add(columnPl1OutFlg());
        ls.add(columnPl1OutUserId());
        ls.add(columnPl1OutDt());
        ls.add(columnPlOutFlg());
        ls.add(columnPlOutUserId());
        ls.add(columnPlOutDt());
        ls.add(columnSlOutFlg());
        ls.add(columnPl2OutFlg());
        ls.add(columnPl2OutUserId());
        ls.add(columnPl2OutDt());
        ls.add(columnCaseOutFlg());
        ls.add(columnCaseOutUserId());
        ls.add(columnCaseOutDt());
        ls.add(columnPackingOutFlg());
        ls.add(columnPackingOutUserId());
        ls.add(columnPackingOutDt());
        ls.add(columnSlipOutFlg());
        ls.add(columnSlipOutUserId());
        ls.add(columnSlipOutDt());
        ls.add(columnInvoiceCreateFlg());
        ls.add(columnInvoiceCreateDt());
        ls.add(columnInvoiceIssueNum());
        ls.add(columnShippingRecordOutFlg());
        ls.add(columnShippingRecordOutUserId());
        ls.add(columnShippingRecordOutDt());
        ls.add(columnBolOutFlg());
        ls.add(columnBolOutUserId());
        ls.add(columnBolOutDt());
        ls.add(columnTagOutFlg());
        ls.add(columnTagOutUserId());
        ls.add(columnTagOutDt());
        ls.add(columnDelivOutFlg());
        ls.add(columnDelivOutUserId());
        ls.add(columnDelivOutDt());
        ls.add(columnPllOutFlg());
        ls.add(columnPllOutUserId());
        ls.add(columnPllOutDt());
        ls.add(columnNizoroeOutFlg());
        ls.add(columnNizoroeOutUserId());
        ls.add(columnNizoroeOutDt());
        ls.add(columnIndvSupplyOutFlg());
        ls.add(columnIndvSupplyOutUserId());
        ls.add(columnIndvSupplyOutDt());
        ls.add(columnIndvLabelOutFlg());
        ls.add(columnIndvLabelOutUserId());
        ls.add(columnIndvLabelOutDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnPickingHId()); }
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
     * t_picking_h by my PICKING_H_ID, named 'TPickingH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTPickingH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingHId(), TPickingHDbm.getInstance().columnPickingHId());
        return cfi("T_PICKING_R_FK4", "TPickingH", this, TPickingHDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "TPickingRAsOne", false);
    }
    /**
     * b_user by my CASE_OUT_USER_ID, named 'BUserByCaseOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByCaseOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCaseOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK14", "BUserByCaseOutUserId", this, BUserDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TPickingRByCaseOutUserIdList", false);
    }
    /**
     * b_user by my BOL_OUT_USER_ID, named 'BUserByBolOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByBolOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBolOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK10", "BUserByBolOutUserId", this, BUserDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TPickingRByBolOutUserIdList", false);
    }
    /**
     * b_user by my PL1_OUT_USER_ID, named 'BUserByPl1OutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByPl1OutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPl1OutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK9", "BUserByPl1OutUserId", this, BUserDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TPickingRByPl1OutUserIdList", false);
    }
    /**
     * b_user by my TAG_OUT_USER_ID, named 'BUserByTagOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByTagOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTagOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK11", "BUserByTagOutUserId", this, BUserDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "TPickingRByTagOutUserIdList", false);
    }
    /**
     * b_user by my SHIPPING_RECORD_OUT_USER_ID, named 'BUserByShippingRecordOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByShippingRecordOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingRecordOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK13", "BUserByShippingRecordOutUserId", this, BUserDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "TPickingRByShippingRecordOutUserIdList", false);
    }
    /**
     * b_user by my DELIV_OUT_USER_ID, named 'BUserByDelivOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByDelivOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelivOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK3", "BUserByDelivOutUserId", this, BUserDbm.getInstance(), mp, 6, null, false, false, false, false, null, null, false, "TPickingRByDelivOutUserIdList", false);
    }
    /**
     * b_user by my INDV_SUPPLY_OUT_USER_ID, named 'BUserByIndvSupplyOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByIndvSupplyOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnIndvSupplyOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK6", "BUserByIndvSupplyOutUserId", this, BUserDbm.getInstance(), mp, 7, null, false, false, false, false, null, null, false, "TPickingRByIndvSupplyOutUserIdList", false);
    }
    /**
     * b_user by my PACKING_OUT_USER_ID, named 'BUserByPackingOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByPackingOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK7", "BUserByPackingOutUserId", this, BUserDbm.getInstance(), mp, 8, null, false, false, false, false, null, null, false, "TPickingRByPackingOutUserIdList", false);
    }
    /**
     * b_user by my PL_OUT_USER_ID, named 'BUserByPlOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByPlOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPlOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK12", "BUserByPlOutUserId", this, BUserDbm.getInstance(), mp, 9, null, false, false, false, false, null, null, false, "TPickingRByPlOutUserIdList", false);
    }
    /**
     * b_user by my INDV_LABEL_OUT_USER_ID, named 'BUserByIndvLabelOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByIndvLabelOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnIndvLabelOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK5", "BUserByIndvLabelOutUserId", this, BUserDbm.getInstance(), mp, 10, null, false, false, false, false, null, null, false, "TPickingRByIndvLabelOutUserIdList", false);
    }
    /**
     * b_user by my PL2_OUT_USER_ID, named 'BUserByPl2OutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByPl2OutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPl2OutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK8", "BUserByPl2OutUserId", this, BUserDbm.getInstance(), mp, 11, null, false, false, false, false, null, null, false, "TPickingRByPl2OutUserIdList", false);
    }
    /**
     * b_user by my SLIP_OUT_USER_ID, named 'BUserBySlipOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserBySlipOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSlipOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK15", "BUserBySlipOutUserId", this, BUserDbm.getInstance(), mp, 12, null, false, false, false, false, null, null, false, "TPickingRBySlipOutUserIdList", false);
    }
    /**
     * b_user by my NIZOROE_OUT_USER_ID, named 'BUserByNizoroeOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByNizoroeOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNizoroeOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK1", "BUserByNizoroeOutUserId", this, BUserDbm.getInstance(), mp, 13, null, false, false, false, false, null, null, false, "TPickingRByNizoroeOutUserIdList", false);
    }
    /**
     * b_user by my PLL_OUT_USER_ID, named 'BUserByPllOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByPllOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPllOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK2", "BUserByPllOutUserId", this, BUserDbm.getInstance(), mp, 14, null, false, false, false, false, null, null, false, "TPickingRByPllOutUserIdList", false);
    }
    /**
     * b_class_dtl by my INVOICE_CREATE_FLG, named 'BClassDtlByInvoiceCreateFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInvoiceCreateFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInvoiceCreateFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_INVOICE_CREATE_FLG", "BClassDtlByInvoiceCreateFlg", this, BClassDtlDbm.getInstance(), mp, 15, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INVOICE_CREATE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my OPL_OUT_FLG, named 'BClassDtlByOplOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByOplOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOplOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_OPL_OUT_FLG", "BClassDtlByOplOutFlg", this, BClassDtlDbm.getInstance(), mp, 16, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my TPL_OUT_FLG, named 'BClassDtlByTplOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByTplOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTplOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_TPL_OUT_FLG", "BClassDtlByTplOutFlg", this, BClassDtlDbm.getInstance(), mp, 17, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my CASE_OUT_FLG, named 'BClassDtlByCaseOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCaseOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCaseOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_CASE_OUT_FLG", "BClassDtlByCaseOutFlg", this, BClassDtlDbm.getInstance(), mp, 18, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my MLT_OUT_FLG, named 'BClassDtlByMltOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByMltOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMltOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_MLT_OUT_FLG", "BClassDtlByMltOutFlg", this, BClassDtlDbm.getInstance(), mp, 19, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my SPL_OUT_FLG, named 'BClassDtlBySplOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySplOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSplOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_SPL_OUT_FLG", "BClassDtlBySplOutFlg", this, BClassDtlDbm.getInstance(), mp, 20, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my PL_OUT_FLG, named 'BClassDtlByPlOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPlOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPlOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_PL_OUT_FLG", "BClassDtlByPlOutFlg", this, BClassDtlDbm.getInstance(), mp, 21, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my SL_OUT_FLG, named 'BClassDtlBySlOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySlOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSlOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_SL_OUT_FLG", "BClassDtlBySlOutFlg", this, BClassDtlDbm.getInstance(), mp, 22, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my PL1_OUT_FLG, named 'BClassDtlByPl1OutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPl1OutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPl1OutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_PL1_OUT_FLG", "BClassDtlByPl1OutFlg", this, BClassDtlDbm.getInstance(), mp, 23, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my PL2_OUT_FLG, named 'BClassDtlByPl2OutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPl2OutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPl2OutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_PL2_OUT_FLG", "BClassDtlByPl2OutFlg", this, BClassDtlDbm.getInstance(), mp, 24, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my PACKING_OUT_FLG, named 'BClassDtlByPackingOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPackingOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_PACKING_OUT_FLG", "BClassDtlByPackingOutFlg", this, BClassDtlDbm.getInstance(), mp, 25, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my SLIP_OUT_FLG, named 'BClassDtlBySlipOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySlipOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSlipOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_SLIP_OUT_FLG", "BClassDtlBySlipOutFlg", this, BClassDtlDbm.getInstance(), mp, 26, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my SHIPPING_RECORD_OUT_FLG, named 'BClassDtlByShippingRecordOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByShippingRecordOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingRecordOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_SHIPPING_RECORD_OUT_FLG", "BClassDtlByShippingRecordOutFlg", this, BClassDtlDbm.getInstance(), mp, 27, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my BOL_OUT_FLG, named 'BClassDtlByBolOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByBolOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBolOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_BOL_OUT_FLG", "BClassDtlByBolOutFlg", this, BClassDtlDbm.getInstance(), mp, 28, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'BOL_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TPickingR"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TPickingRCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TPickingRBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TPickingR> getEntityType() { return TPickingR.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TPickingR newEntity() { return new TPickingR(); }
    public TPickingR newMyEntity() { return new TPickingR(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TPickingR)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TPickingR)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
