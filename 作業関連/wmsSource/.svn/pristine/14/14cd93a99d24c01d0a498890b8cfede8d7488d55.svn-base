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
 * The DB meta of m_client. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MClientDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MClientDbm _instance = new MClientDbm();
    private MClientDbm() {}
    public static MClientDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MClient)et).getClientId(), (et, vl) -> ((MClient)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((MClient)et).getClientCd(), (et, vl) -> ((MClient)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((MClient)et).getClientNm(), (et, vl) -> ((MClient)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((MClient)et).getClientAbbr(), (et, vl) -> ((MClient)et).setClientAbbr((String)vl), "clientAbbr");
        setupEpg(_epgMap, et -> ((MClient)et).getCustomerId(), (et, vl) -> ((MClient)et).setCustomerId(ctl(vl)), "customerId");
        setupEpg(_epgMap, et -> ((MClient)et).getShapeGrpId(), (et, vl) -> ((MClient)et).setShapeGrpId(ctl(vl)), "shapeGrpId");
        setupEpg(_epgMap, et -> ((MClient)et).getDelFlg(), (et, vl) -> ((MClient)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MClient)et).getVersionNo(), (et, vl) -> ((MClient)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MClient)et).getControlNo(), (et, vl) -> ((MClient)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MClient)et).getAddDt(), (et, vl) -> ((MClient)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MClient)et).getAddUser(), (et, vl) -> ((MClient)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MClient)et).getAddProcess(), (et, vl) -> ((MClient)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MClient)et).getUpdDt(), (et, vl) -> ((MClient)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MClient)et).getUpdUser(), (et, vl) -> ((MClient)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MClient)et).getUpdProcess(), (et, vl) -> ((MClient)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MClient)et).getMShapeGrp(), (et, vl) -> ((MClient)et).setMShapeGrp((MShapeGrp)vl), "MShapeGrp");
        setupEfpg(_efpgMap, et -> ((MClient)et).getMCustomer(), (et, vl) -> ((MClient)et).setMCustomer((MCustomer)vl), "MCustomer");
        setupEfpg(_efpgMap, et -> ((MClient)et).getBClassDtlByDelFlg(), (et, vl) -> ((MClient)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_client";
    protected final String _tableDispName = "m_client";
    protected final String _tablePropertyName = "MClient";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_client", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "MClientCenterList,MClientColList,MClientItemList,MClientScreenList,MCustomerList,MImportTypeList,MProductList,MShapeGrpList,MUserClientList,MUserLoginList,MWebHtInfoList,TAllocInstHList,TEcOrderHList,TInventoryHList,TMoveInstHList,TPackingHList,TPackingListList,TPicMthdRcmdList,TPickingHList,TReceivePlanHList,TSerialNoList,TShippingInstHList,TShippingRecordHList,TStockList,TStockRecordList,TStoreRecordHList,TTransferList,WHtInventoryInputProdList,WHtLoadingList,WHtPickingList,WHtReceiveInspectionList,WHtReceiveNoPlanInspList,WHtReceiveStoreList,WHtSerialReceiveInspList,WHtSerialShippingInspList,WHtShippingList,WHtShippingPickingList,WHtTotalPickingList,WSglRowShipInspHList,WShippingInterruptList", null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, true, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientAbbr = cci("CLIENT_ABBR", "CLIENT_ABBR", null, null, String.class, "clientAbbr", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerId = cci("CUSTOMER_ID", "CUSTOMER_ID", null, null, Long.class, "customerId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MCustomer", null, null, false);
    protected final ColumnInfo _columnShapeGrpId = cci("SHAPE_GRP_ID", "SHAPE_GRP_ID", null, null, Long.class, "shapeGrpId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MShapeGrp", null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "CHAR", 1, 0, null, "0", true, null, null, "BClassDtlByDelFlg", null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "BIGINT", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "DATETIME", 19, 0, 3, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "VARCHAR", 60, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "VARCHAR", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "DATETIME", 19, 0, 3, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "VARCHAR", 60, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "VARCHAR", 255, 0, null, null, true, null, null, null, null, null, false);

    /**
     * CLIENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CLIENT_CD: {UQ, NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CLIENT_NM: {NotNull, VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }
    /**
     * CLIENT_ABBR: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientAbbr() { return _columnClientAbbr; }
    /**
     * CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerId() { return _columnCustomerId; }
    /**
     * SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeGrpId() { return _columnShapeGrpId; }
    /**
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
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
        ls.add(columnClientId());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnClientAbbr());
        ls.add(columnCustomerId());
        ls.add(columnShapeGrpId());
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
    protected UniqueInfo cpui() { return hpcpui(columnClientId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnClientCd()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * m_shape_grp by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShapeGrp() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeGrpId(), MShapeGrpDbm.getInstance().columnShapeGrpId());
        return cfi("M_CLIENT_FK1", "MShapeGrp", this, MShapeGrpDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MClientList", false);
    }
    /**
     * m_customer by my CUSTOMER_ID, named 'MCustomer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("M_CLIENT_FK2", "MCustomer", this, MCustomerDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MClientList", false);
    }
    /**
     * b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CLIENT_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * m_client_center by CLIENT_ID, named 'MClientCenterList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientCenterList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientCenterDbm.getInstance().columnClientId());
        return cri("M_CLIENT_CENTER_FK1", "MClientCenterList", this, MClientCenterDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * m_client_col by CLIENT_ID, named 'MClientColList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientColList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientColDbm.getInstance().columnClientId());
        return cri("M_CLIENT_COL_FK3", "MClientColList", this, MClientColDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * m_client_item by CLIENT_ID, named 'MClientItemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientItemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientItemDbm.getInstance().columnClientId());
        return cri("M_CLIENT_ITEM_FK3", "MClientItemList", this, MClientItemDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * m_client_screen by CLIENT_ID, named 'MClientScreenList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientScreenList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientScreenDbm.getInstance().columnClientId());
        return cri("M_CLIENT_SCREEN_FK3", "MClientScreenList", this, MClientScreenDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * m_customer by CLIENT_ID, named 'MCustomerList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCustomerList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MCustomerDbm.getInstance().columnClientId());
        return cri("M_CUSTOMER_FK1", "MCustomerList", this, MCustomerDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * m_import_type by CLIENT_ID, named 'MImportTypeList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMImportTypeList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MImportTypeDbm.getInstance().columnClientId());
        return cri("M_IMPORT_TYPE_FK1", "MImportTypeList", this, MImportTypeDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * m_product by CLIENT_ID, named 'MProductList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMProductList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MProductDbm.getInstance().columnClientId());
        return cri("M_PRODUCT_FK1", "MProductList", this, MProductDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * m_shape_grp by CLIENT_ID, named 'MShapeGrpList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMShapeGrpList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MShapeGrpDbm.getInstance().columnClientId());
        return cri("M_SHAPE_GRP_FK1", "MShapeGrpList", this, MShapeGrpDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * m_user_client by CLIENT_ID, named 'MUserClientList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMUserClientList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MUserClientDbm.getInstance().columnClientId());
        return cri("M_USER_CLIENT_FK2", "MUserClientList", this, MUserClientDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * m_user_login by CLIENT_ID, named 'MUserLoginList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMUserLoginList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MUserLoginDbm.getInstance().columnClientId());
        return cri("M_USER_LOGIN_FK1", "MUserLoginList", this, MUserLoginDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * m_web_ht_info by CLIENT_ID, named 'MWebHtInfoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMWebHtInfoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MWebHtInfoDbm.getInstance().columnClientId());
        return cri("M_WEB_HT_INFO_FK3", "MWebHtInfoList", this, MWebHtInfoDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * t_alloc_inst_h by CLIENT_ID, named 'TAllocInstHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TAllocInstHDbm.getInstance().columnClientId());
        return cri("T_ALLOC_INST_H_FK4", "TAllocInstHList", this, TAllocInstHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * t_ec_order_h by CLIENT_ID, named 'TEcOrderHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTEcOrderHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TEcOrderHDbm.getInstance().columnClientId());
        return cri("T_EC_ORDER_H_FK2", "TEcOrderHList", this, TEcOrderHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * t_inventory_h by CLIENT_ID, named 'TInventoryHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TInventoryHDbm.getInstance().columnClientId());
        return cri("T_INVENTORY_H_FK2", "TInventoryHList", this, TInventoryHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * t_move_inst_h by CLIENT_ID, named 'TMoveInstHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveInstHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TMoveInstHDbm.getInstance().columnClientId());
        return cri("T_MOVE_INST_H_FK2", "TMoveInstHList", this, TMoveInstHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * t_packing_h by CLIENT_ID, named 'TPackingHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPackingHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TPackingHDbm.getInstance().columnClientId());
        return cri("T_PACKING_H_FK2", "TPackingHList", this, TPackingHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * t_packing_list by CLIENT_ID, named 'TPackingListList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPackingListList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TPackingListDbm.getInstance().columnClientId());
        return cri("T_PACKING_LIST_FK1", "TPackingListList", this, TPackingListDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * t_pic_mthd_rcmd by CLIENT_ID, named 'TPicMthdRcmdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPicMthdRcmdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TPicMthdRcmdDbm.getInstance().columnClientId());
        return cri("T_PIC_MTHD_RCMD_FK1", "TPicMthdRcmdList", this, TPicMthdRcmdDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * t_picking_h by CLIENT_ID, named 'TPickingHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TPickingHDbm.getInstance().columnClientId());
        return cri("T_PICKING_H_FK4", "TPickingHList", this, TPickingHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * t_receive_plan_h by CLIENT_ID, named 'TReceivePlanHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceivePlanHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TReceivePlanHDbm.getInstance().columnClientId());
        return cri("T_RECEIVE_PLAN_H_FK6", "TReceivePlanHList", this, TReceivePlanHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * t_serial_no by CLIENT_ID, named 'TSerialNoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTSerialNoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TSerialNoDbm.getInstance().columnClientId());
        return cri("T_SERIAL_NO_FK2", "TSerialNoList", this, TSerialNoDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * t_shipping_inst_h by CLIENT_ID, named 'TShippingInstHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TShippingInstHDbm.getInstance().columnClientId());
        return cri("T_SHIPPING_INST_H_FK5", "TShippingInstHList", this, TShippingInstHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * t_shipping_record_h by CLIENT_ID, named 'TShippingRecordHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingRecordHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TShippingRecordHDbm.getInstance().columnClientId());
        return cri("T_SHIPPING_RECORD_H_FK1", "TShippingRecordHList", this, TShippingRecordHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * t_stock by CLIENT_ID, named 'TStockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TStockDbm.getInstance().columnClientId());
        return cri("T_STOCK_FK7", "TStockList", this, TStockDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * t_stock_record by CLIENT_ID, named 'TStockRecordList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockRecordList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TStockRecordDbm.getInstance().columnClientId());
        return cri("T_STOCK_RECORD_FK1", "TStockRecordList", this, TStockRecordDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * t_store_record_h by CLIENT_ID, named 'TStoreRecordHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStoreRecordHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TStoreRecordHDbm.getInstance().columnClientId());
        return cri("T_STORE_RECORD_H_FK1", "TStoreRecordHList", this, TStoreRecordHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * t_transfer by CLIENT_ID, named 'TTransferList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTransferList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTransferDbm.getInstance().columnClientId());
        return cri("T_TRANSFER_FK1", "TTransferList", this, TTransferDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * w_ht_inventory_input_prod by CLIENT_ID, named 'WHtInventoryInputProdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtInventoryInputProdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtInventoryInputProdDbm.getInstance().columnClientId());
        return cri("W_HT_INVENTORY_INPUT_PROD_FK4", "WHtInventoryInputProdList", this, WHtInventoryInputProdDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * w_ht_loading by CLIENT_ID, named 'WHtLoadingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtLoadingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtLoadingDbm.getInstance().columnClientId());
        return cri("W_HT_LOADING_FK2", "WHtLoadingList", this, WHtLoadingDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * w_ht_picking by CLIENT_ID, named 'WHtPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtPickingDbm.getInstance().columnClientId());
        return cri("W_HT_PICKING_FK2", "WHtPickingList", this, WHtPickingDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * w_ht_receive_inspection by CLIENT_ID, named 'WHtReceiveInspectionList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveInspectionList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtReceiveInspectionDbm.getInstance().columnClientId());
        return cri("W_HT_RECEIVE_INSPECTION_FK7", "WHtReceiveInspectionList", this, WHtReceiveInspectionDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * w_ht_receive_no_plan_insp by CLIENT_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveNoPlanInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtReceiveNoPlanInspDbm.getInstance().columnClientId());
        return cri("W_HT_RECEIVE_NO_PLAN_INSP_FK5", "WHtReceiveNoPlanInspList", this, WHtReceiveNoPlanInspDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * w_ht_receive_store by CLIENT_ID, named 'WHtReceiveStoreList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveStoreList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtReceiveStoreDbm.getInstance().columnClientId());
        return cri("W_HT_RECEIVE_STORE_FK6", "WHtReceiveStoreList", this, WHtReceiveStoreDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * w_ht_serial_receive_insp by CLIENT_ID, named 'WHtSerialReceiveInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtSerialReceiveInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtSerialReceiveInspDbm.getInstance().columnClientId());
        return cri("W_HT_SERIAL_RECEIVE_INSP_FK1", "WHtSerialReceiveInspList", this, WHtSerialReceiveInspDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * w_ht_serial_shipping_insp by CLIENT_ID, named 'WHtSerialShippingInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtSerialShippingInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtSerialShippingInspDbm.getInstance().columnClientId());
        return cri("W_HT_SERIAL_SHIPPING_INSP_FK3", "WHtSerialShippingInspList", this, WHtSerialShippingInspDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * w_ht_shipping by CLIENT_ID, named 'WHtShippingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtShippingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtShippingDbm.getInstance().columnClientId());
        return cri("W_HT_SHIPPING_FK1", "WHtShippingList", this, WHtShippingDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * w_ht_shipping_picking by CLIENT_ID, named 'WHtShippingPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtShippingPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtShippingPickingDbm.getInstance().columnClientId());
        return cri("W_HT_SHIPPING_PICKING_FK1", "WHtShippingPickingList", this, WHtShippingPickingDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * w_ht_total_picking by CLIENT_ID, named 'WHtTotalPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtTotalPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtTotalPickingDbm.getInstance().columnClientId());
        return cri("W_HT_TOTAL_PICKING_FK2", "WHtTotalPickingList", this, WHtTotalPickingDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * w_sgl_row_ship_insp_h by CLIENT_ID, named 'WSglRowShipInspHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWSglRowShipInspHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WSglRowShipInspHDbm.getInstance().columnClientId());
        return cri("W_SGL_ROW_SHIP_INSP_H_FK4", "WSglRowShipInspHList", this, WSglRowShipInspHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * w_shipping_interrupt by CLIENT_ID, named 'WShippingInterruptList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWShippingInterruptList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WShippingInterruptDbm.getInstance().columnClientId());
        return cri("W_SHIPPING_INTERRUPT_FK3", "WShippingInterruptList", this, WShippingInterruptDbm.getInstance(), mp, false, "MClient");
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MClient"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MClientCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MClientBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MClient> getEntityType() { return MClient.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MClient newEntity() { return new MClient(); }
    public MClient newMyEntity() { return new MClient(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MClient)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MClient)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
