package com.oneslogi.base.dbflute.allcommon;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Method;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.exception.DBMetaNotFoundException;
import org.dbflute.helper.StringKeyMap;
import org.dbflute.util.DfAssertUtil;

/**
 * The handler of the instance of DB meta.
 * @author DBFlute(AutoGenerator)
 */
public class DBMetaInstanceHandler implements DBMetaProvider {

    // ===================================================================================
    //                                                                        Resource Map
    //                                                                        ============
    /** The map of DB meta instance by key 'table DB-name'. (NotNull, LazyLoaded) */
    protected static final Map<String, DBMeta> _tableDbNameInstanceMap = newHashMap();

    /** The map of DB meta instance by key 'entity type'. (NotNull, LazyLoaded) */
    protected static final Map<Class<?>, DBMeta> _entityTypeInstanceMap = newHashMap();

    /** The map of table DB name and DB meta class name. (NotNull) */
    protected static final Map<String, String> _tableDbNameClassNameMap;
    static {
        final Map<String, String> tmpMap = newHashMap();
        tmpMap.put("b_arg", "com.oneslogi.base.dbflute.bsentity.dbmeta.BArgDbm");
        tmpMap.put("b_arg_valid", "com.oneslogi.base.dbflute.bsentity.dbmeta.BArgValidDbm");
        tmpMap.put("b_class", "com.oneslogi.base.dbflute.bsentity.dbmeta.BClassDbm");
        tmpMap.put("b_class_dtl", "com.oneslogi.base.dbflute.bsentity.dbmeta.BClassDtlDbm");
        tmpMap.put("b_class_grp", "com.oneslogi.base.dbflute.bsentity.dbmeta.BClassGrpDbm");
        tmpMap.put("b_class_grp_dtl", "com.oneslogi.base.dbflute.bsentity.dbmeta.BClassGrpDtlDbm");
        tmpMap.put("b_col", "com.oneslogi.base.dbflute.bsentity.dbmeta.BColDbm");
        tmpMap.put("b_col_ext_base", "com.oneslogi.base.dbflute.bsentity.dbmeta.BColExtBaseDbm");
        tmpMap.put("b_col_ext_user", "com.oneslogi.base.dbflute.bsentity.dbmeta.BColExtUserDbm");
        tmpMap.put("b_col_role", "com.oneslogi.base.dbflute.bsentity.dbmeta.BColRoleDbm");
        tmpMap.put("b_col_valid", "com.oneslogi.base.dbflute.bsentity.dbmeta.BColValidDbm");
        tmpMap.put("b_culture", "com.oneslogi.base.dbflute.bsentity.dbmeta.BCultureDbm");
        tmpMap.put("b_culture_attribute", "com.oneslogi.base.dbflute.bsentity.dbmeta.BCultureAttributeDbm");
        tmpMap.put("b_dict", "com.oneslogi.base.dbflute.bsentity.dbmeta.BDictDbm");
        tmpMap.put("b_dict_culture", "com.oneslogi.base.dbflute.bsentity.dbmeta.BDictCultureDbm");
        tmpMap.put("b_dict_valid", "com.oneslogi.base.dbflute.bsentity.dbmeta.BDictValidDbm");
        tmpMap.put("b_dml_log", "com.oneslogi.base.dbflute.bsentity.dbmeta.BDmlLogDbm");
        tmpMap.put("b_func", "com.oneslogi.base.dbflute.bsentity.dbmeta.BFuncDbm");
        tmpMap.put("b_func_role", "com.oneslogi.base.dbflute.bsentity.dbmeta.BFuncRoleDbm");
        tmpMap.put("b_info", "com.oneslogi.base.dbflute.bsentity.dbmeta.BInfoDbm");
        tmpMap.put("b_item", "com.oneslogi.base.dbflute.bsentity.dbmeta.BItemDbm");
        tmpMap.put("b_item_role", "com.oneslogi.base.dbflute.bsentity.dbmeta.BItemRoleDbm");
        tmpMap.put("b_item_valid", "com.oneslogi.base.dbflute.bsentity.dbmeta.BItemValidDbm");
        tmpMap.put("b_log", "com.oneslogi.base.dbflute.bsentity.dbmeta.BLogDbm");
        tmpMap.put("b_log_dtl", "com.oneslogi.base.dbflute.bsentity.dbmeta.BLogDtlDbm");
        tmpMap.put("b_menu", "com.oneslogi.base.dbflute.bsentity.dbmeta.BMenuDbm");
        tmpMap.put("b_menu_grp", "com.oneslogi.base.dbflute.bsentity.dbmeta.BMenuGrpDbm");
        tmpMap.put("b_message", "com.oneslogi.base.dbflute.bsentity.dbmeta.BMessageDbm");
        tmpMap.put("b_numbering", "com.oneslogi.base.dbflute.bsentity.dbmeta.BNumberingDbm");
        tmpMap.put("b_password_policy", "com.oneslogi.base.dbflute.bsentity.dbmeta.BPasswordPolicyDbm");
        tmpMap.put("b_property", "com.oneslogi.base.dbflute.bsentity.dbmeta.BPropertyDbm");
        tmpMap.put("b_role", "com.oneslogi.base.dbflute.bsentity.dbmeta.BRoleDbm");
        tmpMap.put("b_role_grp", "com.oneslogi.base.dbflute.bsentity.dbmeta.BRoleGrpDbm");
        tmpMap.put("b_role_grp_dtl", "com.oneslogi.base.dbflute.bsentity.dbmeta.BRoleGrpDtlDbm");
        tmpMap.put("b_screen", "com.oneslogi.base.dbflute.bsentity.dbmeta.BScreenDbm");
        tmpMap.put("b_screen_role", "com.oneslogi.base.dbflute.bsentity.dbmeta.BScreenRoleDbm");
        tmpMap.put("b_system", "com.oneslogi.base.dbflute.bsentity.dbmeta.BSystemDbm");
        tmpMap.put("b_system_log", "com.oneslogi.base.dbflute.bsentity.dbmeta.BSystemLogDbm");
        tmpMap.put("b_terminal", "com.oneslogi.base.dbflute.bsentity.dbmeta.BTerminalDbm");
        tmpMap.put("b_time_zone", "com.oneslogi.base.dbflute.bsentity.dbmeta.BTimeZoneDbm");
        tmpMap.put("b_token", "com.oneslogi.base.dbflute.bsentity.dbmeta.BTokenDbm");
        tmpMap.put("b_user", "com.oneslogi.base.dbflute.bsentity.dbmeta.BUserDbm");
        tmpMap.put("b_user_auth", "com.oneslogi.base.dbflute.bsentity.dbmeta.BUserAuthDbm");
        tmpMap.put("e_barcode_label", "com.oneslogi.base.dbflute.bsentity.dbmeta.EBarcodeLabelDbm");
        tmpMap.put("e_customer", "com.oneslogi.base.dbflute.bsentity.dbmeta.ECustomerDbm");
        tmpMap.put("e_distribution", "com.oneslogi.base.dbflute.bsentity.dbmeta.EDistributionDbm");
        tmpMap.put("e_id_manag", "com.oneslogi.base.dbflute.bsentity.dbmeta.EIdManagDbm");
        tmpMap.put("e_inventory_inst_dtl", "com.oneslogi.base.dbflute.bsentity.dbmeta.EInventoryInstDtlDbm");
        tmpMap.put("e_inventory_record_dtl", "com.oneslogi.base.dbflute.bsentity.dbmeta.EInventoryRecordDtlDbm");
        tmpMap.put("e_inventory_record_sum", "com.oneslogi.base.dbflute.bsentity.dbmeta.EInventoryRecordSumDbm");
        tmpMap.put("e_koguchi_delivery", "com.oneslogi.base.dbflute.bsentity.dbmeta.EKoguchiDeliveryDbm");
        tmpMap.put("e_location", "com.oneslogi.base.dbflute.bsentity.dbmeta.ELocationDbm");
        tmpMap.put("e_packing_list", "com.oneslogi.base.dbflute.bsentity.dbmeta.EPackingListDbm");
        tmpMap.put("e_plant_storage_space", "com.oneslogi.base.dbflute.bsentity.dbmeta.EPlantStorageSpaceDbm");
        tmpMap.put("e_product", "com.oneslogi.base.dbflute.bsentity.dbmeta.EProductDbm");
        tmpMap.put("e_product_price", "com.oneslogi.base.dbflute.bsentity.dbmeta.EProductPriceDbm");
        tmpMap.put("e_product_shape", "com.oneslogi.base.dbflute.bsentity.dbmeta.EProductShapeDbm");
        tmpMap.put("e_receive_plan", "com.oneslogi.base.dbflute.bsentity.dbmeta.EReceivePlanDbm");
        tmpMap.put("e_sales_org", "com.oneslogi.base.dbflute.bsentity.dbmeta.ESalesOrgDbm");
        tmpMap.put("e_scm_label", "com.oneslogi.base.dbflute.bsentity.dbmeta.EScmLabelDbm");
        tmpMap.put("e_serial_input", "com.oneslogi.base.dbflute.bsentity.dbmeta.ESerialInputDbm");
        tmpMap.put("e_shipping_inst", "com.oneslogi.base.dbflute.bsentity.dbmeta.EShippingInstDbm");
        tmpMap.put("e_shipping_plan", "com.oneslogi.base.dbflute.bsentity.dbmeta.EShippingPlanDbm");
        tmpMap.put("e_shipping_record", "com.oneslogi.base.dbflute.bsentity.dbmeta.EShippingRecordDbm");
        tmpMap.put("e_store_record", "com.oneslogi.base.dbflute.bsentity.dbmeta.EStoreRecordDbm");
        tmpMap.put("e_transfer", "com.oneslogi.base.dbflute.bsentity.dbmeta.ETransferDbm");
        tmpMap.put("e_zip", "com.oneslogi.base.dbflute.bsentity.dbmeta.EZipDbm");
        tmpMap.put("er_ajis_inventory_report", "com.oneslogi.base.dbflute.bsentity.dbmeta.ErAjisInventoryReportDbm");
        tmpMap.put("er_carrier_slip_no_dtl", "com.oneslogi.base.dbflute.bsentity.dbmeta.ErCarrierSlipNoDtlDbm");
        tmpMap.put("er_distribution", "com.oneslogi.base.dbflute.bsentity.dbmeta.ErDistributionDbm");
        tmpMap.put("er_id_manag", "com.oneslogi.base.dbflute.bsentity.dbmeta.ErIdManagDbm");
        tmpMap.put("er_inventory_inst_dtl", "com.oneslogi.base.dbflute.bsentity.dbmeta.ErInventoryInstDtlDbm");
        tmpMap.put("er_inventory_inst_sum", "com.oneslogi.base.dbflute.bsentity.dbmeta.ErInventoryInstSumDbm");
        tmpMap.put("er_inventory_record_dtl", "com.oneslogi.base.dbflute.bsentity.dbmeta.ErInventoryRecordDtlDbm");
        tmpMap.put("er_inventory_report_sum", "com.oneslogi.base.dbflute.bsentity.dbmeta.ErInventoryReportSumDbm");
        tmpMap.put("er_packing_list", "com.oneslogi.base.dbflute.bsentity.dbmeta.ErPackingListDbm");
        tmpMap.put("er_receive_report", "com.oneslogi.base.dbflute.bsentity.dbmeta.ErReceiveReportDbm");
        tmpMap.put("er_sales_org", "com.oneslogi.base.dbflute.bsentity.dbmeta.ErSalesOrgDbm");
        tmpMap.put("er_scm_label", "com.oneslogi.base.dbflute.bsentity.dbmeta.ErScmLabelDbm");
        tmpMap.put("er_serial_no", "com.oneslogi.base.dbflute.bsentity.dbmeta.ErSerialNoDbm");
        tmpMap.put("er_shipping_record", "com.oneslogi.base.dbflute.bsentity.dbmeta.ErShippingRecordDbm");
        tmpMap.put("er_stock_record", "com.oneslogi.base.dbflute.bsentity.dbmeta.ErStockRecordDbm");
        tmpMap.put("er_transfer_report", "com.oneslogi.base.dbflute.bsentity.dbmeta.ErTransferReportDbm");
        tmpMap.put("es_base", "com.oneslogi.base.dbflute.bsentity.dbmeta.EsBaseDbm");
        tmpMap.put("es_inventory_inst", "com.oneslogi.base.dbflute.bsentity.dbmeta.EsInventoryInstDbm");
        tmpMap.put("es_inventory_inst_dtl", "com.oneslogi.base.dbflute.bsentity.dbmeta.EsInventoryInstDtlDbm");
        tmpMap.put("es_inventory_inst_sum", "com.oneslogi.base.dbflute.bsentity.dbmeta.EsInventoryInstSumDbm");
        tmpMap.put("es_koguchi_delivery", "com.oneslogi.base.dbflute.bsentity.dbmeta.EsKoguchiDeliveryDbm");
        tmpMap.put("es_plant_storage_space", "com.oneslogi.base.dbflute.bsentity.dbmeta.EsPlantStorageSpaceDbm");
        tmpMap.put("es_product", "com.oneslogi.base.dbflute.bsentity.dbmeta.EsProductDbm");
        tmpMap.put("es_product_price", "com.oneslogi.base.dbflute.bsentity.dbmeta.EsProductPriceDbm");
        tmpMap.put("es_receive_plan", "com.oneslogi.base.dbflute.bsentity.dbmeta.EsReceivePlanDbm");
        tmpMap.put("es_sales_org", "com.oneslogi.base.dbflute.bsentity.dbmeta.EsSalesOrgDbm");
        tmpMap.put("es_shipping_inst", "com.oneslogi.base.dbflute.bsentity.dbmeta.EsShippingInstDbm");
        tmpMap.put("es_stock_record", "com.oneslogi.base.dbflute.bsentity.dbmeta.EsStockRecordDbm");
        tmpMap.put("h_id_manag_data", "com.oneslogi.base.dbflute.bsentity.dbmeta.HIdManagDataDbm");
        tmpMap.put("h_inventory_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.HInventoryBDbm");
        tmpMap.put("h_inventory_h", "com.oneslogi.base.dbflute.bsentity.dbmeta.HInventoryHDbm");
        tmpMap.put("h_location_attribute", "com.oneslogi.base.dbflute.bsentity.dbmeta.HLocationAttributeDbm");
        tmpMap.put("h_move_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.HMoveBDbm");
        tmpMap.put("h_move_h", "com.oneslogi.base.dbflute.bsentity.dbmeta.HMoveHDbm");
        tmpMap.put("h_packing_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.HPackingBDbm");
        tmpMap.put("h_packing_h", "com.oneslogi.base.dbflute.bsentity.dbmeta.HPackingHDbm");
        tmpMap.put("h_receive_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.HReceiveBDbm");
        tmpMap.put("h_receive_h", "com.oneslogi.base.dbflute.bsentity.dbmeta.HReceiveHDbm");
        tmpMap.put("h_receive_spare", "com.oneslogi.base.dbflute.bsentity.dbmeta.HReceiveSpareDbm");
        tmpMap.put("h_shipping_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.HShippingBDbm");
        tmpMap.put("h_shipping_h", "com.oneslogi.base.dbflute.bsentity.dbmeta.HShippingHDbm");
        tmpMap.put("h_shipping_spare", "com.oneslogi.base.dbflute.bsentity.dbmeta.HShippingSpareDbm");
        tmpMap.put("h_stock", "com.oneslogi.base.dbflute.bsentity.dbmeta.HStockDbm");
        tmpMap.put("h_stock_book", "com.oneslogi.base.dbflute.bsentity.dbmeta.HStockBookDbm");
        tmpMap.put("h_stock_inout", "com.oneslogi.base.dbflute.bsentity.dbmeta.HStockInoutDbm");
        tmpMap.put("h_stock_report", "com.oneslogi.base.dbflute.bsentity.dbmeta.HStockReportDbm");
        tmpMap.put("m_base_sales_org", "com.oneslogi.base.dbflute.bsentity.dbmeta.MBaseSalesOrgDbm");
        tmpMap.put("m_box", "com.oneslogi.base.dbflute.bsentity.dbmeta.MBoxDbm");
        tmpMap.put("m_box_grp", "com.oneslogi.base.dbflute.bsentity.dbmeta.MBoxGrpDbm");
        tmpMap.put("m_box_grp_dtl", "com.oneslogi.base.dbflute.bsentity.dbmeta.MBoxGrpDtlDbm");
        tmpMap.put("m_carrier", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCarrierDbm");
        tmpMap.put("m_carrier_box", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCarrierBoxDbm");
        tmpMap.put("m_carrier_decision", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCarrierDecisionDbm");
        tmpMap.put("m_carrier_slip_ces", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCarrierSlipCesDbm");
        tmpMap.put("m_carrier_slip_sgw", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCarrierSlipSgwDbm");
        tmpMap.put("m_carrier_slip_ymt", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCarrierSlipYmtDbm");
        tmpMap.put("m_carrier_slip_yupk", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCarrierSlipYupkDbm");
        tmpMap.put("m_carrier_zip", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCarrierZipDbm");
        tmpMap.put("m_center", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterDbm");
        tmpMap.put("m_center_class", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterClassDbm");
        tmpMap.put("m_center_class_dtl", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterClassDtlDbm");
        tmpMap.put("m_center_class_grp", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterClassGrpDbm");
        tmpMap.put("m_center_class_grp_dtl", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterClassGrpDtlDbm");
        tmpMap.put("m_center_col", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterColDbm");
        tmpMap.put("m_center_customer", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterCustomerDbm");
        tmpMap.put("m_center_item", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterItemDbm");
        tmpMap.put("m_center_screen", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterScreenDbm");
        tmpMap.put("m_client", "com.oneslogi.base.dbflute.bsentity.dbmeta.MClientDbm");
        tmpMap.put("m_client_center", "com.oneslogi.base.dbflute.bsentity.dbmeta.MClientCenterDbm");
        tmpMap.put("m_client_col", "com.oneslogi.base.dbflute.bsentity.dbmeta.MClientColDbm");
        tmpMap.put("m_client_item", "com.oneslogi.base.dbflute.bsentity.dbmeta.MClientItemDbm");
        tmpMap.put("m_client_screen", "com.oneslogi.base.dbflute.bsentity.dbmeta.MClientScreenDbm");
        tmpMap.put("m_common_carrier", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCommonCarrierDbm");
        tmpMap.put("m_customer", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCustomerDbm");
        tmpMap.put("m_customer_picking", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCustomerPickingDbm");
        tmpMap.put("m_data_input_type", "com.oneslogi.base.dbflute.bsentity.dbmeta.MDataInputTypeDbm");
        tmpMap.put("m_data_input_type_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.MDataInputTypeBDbm");
        tmpMap.put("m_delivery_course", "com.oneslogi.base.dbflute.bsentity.dbmeta.MDeliveryCourseDbm");
        tmpMap.put("m_deposit_product", "com.oneslogi.base.dbflute.bsentity.dbmeta.MDepositProductDbm");
        tmpMap.put("m_edi", "com.oneslogi.base.dbflute.bsentity.dbmeta.MEdiDbm");
        tmpMap.put("m_edi_column", "com.oneslogi.base.dbflute.bsentity.dbmeta.MEdiColumnDbm");
        tmpMap.put("m_general", "com.oneslogi.base.dbflute.bsentity.dbmeta.MGeneralDbm");
        tmpMap.put("m_holiday", "com.oneslogi.base.dbflute.bsentity.dbmeta.MHolidayDbm");
        tmpMap.put("m_ht_dict", "com.oneslogi.base.dbflute.bsentity.dbmeta.MHtDictDbm");
        tmpMap.put("m_ht_dict_culture", "com.oneslogi.base.dbflute.bsentity.dbmeta.MHtDictCultureDbm");
        tmpMap.put("m_ht_message", "com.oneslogi.base.dbflute.bsentity.dbmeta.MHtMessageDbm");
        tmpMap.put("m_import_type", "com.oneslogi.base.dbflute.bsentity.dbmeta.MImportTypeDbm");
        tmpMap.put("m_import_type_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.MImportTypeBDbm");
        tmpMap.put("m_import_type_b_copy_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.MImportTypeBCopyBDbm");
        tmpMap.put("m_import_type_b_copy_h", "com.oneslogi.base.dbflute.bsentity.dbmeta.MImportTypeBCopyHDbm");
        tmpMap.put("m_koguchi_delivery", "com.oneslogi.base.dbflute.bsentity.dbmeta.MKoguchiDeliveryDbm");
        tmpMap.put("m_location", "com.oneslogi.base.dbflute.bsentity.dbmeta.MLocationDbm");
        tmpMap.put("m_location_replenish_product", "com.oneslogi.base.dbflute.bsentity.dbmeta.MLocationReplenishProductDbm");
        tmpMap.put("m_matching", "com.oneslogi.base.dbflute.bsentity.dbmeta.MMatchingDbm");
        tmpMap.put("m_nizoroe", "com.oneslogi.base.dbflute.bsentity.dbmeta.MNizoroeDbm");
        tmpMap.put("m_nizoroe_patern", "com.oneslogi.base.dbflute.bsentity.dbmeta.MNizoroePaternDbm");
        tmpMap.put("m_numbering_center", "com.oneslogi.base.dbflute.bsentity.dbmeta.MNumberingCenterDbm");
        tmpMap.put("m_param", "com.oneslogi.base.dbflute.bsentity.dbmeta.MParamDbm");
        tmpMap.put("m_plant_storage_space", "com.oneslogi.base.dbflute.bsentity.dbmeta.MPlantStorageSpaceDbm");
        tmpMap.put("m_process_type", "com.oneslogi.base.dbflute.bsentity.dbmeta.MProcessTypeDbm");
        tmpMap.put("m_product", "com.oneslogi.base.dbflute.bsentity.dbmeta.MProductDbm");
        tmpMap.put("m_product_shape", "com.oneslogi.base.dbflute.bsentity.dbmeta.MProductShapeDbm");
        tmpMap.put("m_sales_org", "com.oneslogi.base.dbflute.bsentity.dbmeta.MSalesOrgDbm");
        tmpMap.put("m_set_parent", "com.oneslogi.base.dbflute.bsentity.dbmeta.MSetParentDbm");
        tmpMap.put("m_set_structure", "com.oneslogi.base.dbflute.bsentity.dbmeta.MSetStructureDbm");
        tmpMap.put("m_shape", "com.oneslogi.base.dbflute.bsentity.dbmeta.MShapeDbm");
        tmpMap.put("m_shape_grp", "com.oneslogi.base.dbflute.bsentity.dbmeta.MShapeGrpDbm");
        tmpMap.put("m_shape_grp_dtl", "com.oneslogi.base.dbflute.bsentity.dbmeta.MShapeGrpDtlDbm");
        tmpMap.put("m_stock_type", "com.oneslogi.base.dbflute.bsentity.dbmeta.MStockTypeDbm");
        tmpMap.put("m_user_center", "com.oneslogi.base.dbflute.bsentity.dbmeta.MUserCenterDbm");
        tmpMap.put("m_user_client", "com.oneslogi.base.dbflute.bsentity.dbmeta.MUserClientDbm");
        tmpMap.put("m_user_deposit", "com.oneslogi.base.dbflute.bsentity.dbmeta.MUserDepositDbm");
        tmpMap.put("m_user_login", "com.oneslogi.base.dbflute.bsentity.dbmeta.MUserLoginDbm");
        tmpMap.put("m_warehouse", "com.oneslogi.base.dbflute.bsentity.dbmeta.MWarehouseDbm");
        tmpMap.put("m_web_ht_info", "com.oneslogi.base.dbflute.bsentity.dbmeta.MWebHtInfoDbm");
        tmpMap.put("m_zip", "com.oneslogi.base.dbflute.bsentity.dbmeta.MZipDbm");
        tmpMap.put("m_zone", "com.oneslogi.base.dbflute.bsentity.dbmeta.MZoneDbm");
        tmpMap.put("p_layout_print_setting", "com.oneslogi.base.dbflute.bsentity.dbmeta.PLayoutPrintSettingDbm");
        tmpMap.put("p_print_queue", "com.oneslogi.base.dbflute.bsentity.dbmeta.PPrintQueueDbm");
        tmpMap.put("p_print_request", "com.oneslogi.base.dbflute.bsentity.dbmeta.PPrintRequestDbm");
        tmpMap.put("p_print_request_binary", "com.oneslogi.base.dbflute.bsentity.dbmeta.PPrintRequestBinaryDbm");
        tmpMap.put("p_print_request_data", "com.oneslogi.base.dbflute.bsentity.dbmeta.PPrintRequestDataDbm");
        tmpMap.put("p_print_request_hist", "com.oneslogi.base.dbflute.bsentity.dbmeta.PPrintRequestHistDbm");
        tmpMap.put("p_print_service", "com.oneslogi.base.dbflute.bsentity.dbmeta.PPrintServiceDbm");
        tmpMap.put("p_printer", "com.oneslogi.base.dbflute.bsentity.dbmeta.PPrinterDbm");
        tmpMap.put("p_printer_attribute", "com.oneslogi.base.dbflute.bsentity.dbmeta.PPrinterAttributeDbm");
        tmpMap.put("p_printer_group", "com.oneslogi.base.dbflute.bsentity.dbmeta.PPrinterGroupDbm");
        tmpMap.put("p_report", "com.oneslogi.base.dbflute.bsentity.dbmeta.PReportDbm");
        tmpMap.put("p_report_layout", "com.oneslogi.base.dbflute.bsentity.dbmeta.PReportLayoutDbm");
        tmpMap.put("p_report_layout_item", "com.oneslogi.base.dbflute.bsentity.dbmeta.PReportLayoutItemDbm");
        tmpMap.put("p_subrep_layout", "com.oneslogi.base.dbflute.bsentity.dbmeta.PSubrepLayoutDbm");
        tmpMap.put("p_subrep_layout_item", "com.oneslogi.base.dbflute.bsentity.dbmeta.PSubrepLayoutItemDbm");
        tmpMap.put("p_terminal_auto_print_set", "com.oneslogi.base.dbflute.bsentity.dbmeta.PTerminalAutoPrintSetDbm");
        tmpMap.put("p_terminal_print_setting", "com.oneslogi.base.dbflute.bsentity.dbmeta.PTerminalPrintSettingDbm");
        tmpMap.put("p_user_auto_print_setting", "com.oneslogi.base.dbflute.bsentity.dbmeta.PUserAutoPrintSettingDbm");
        tmpMap.put("p_user_print_setting", "com.oneslogi.base.dbflute.bsentity.dbmeta.PUserPrintSettingDbm");
        tmpMap.put("t_alloc_inst_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.TAllocInstBDbm");
        tmpMap.put("t_alloc_inst_h", "com.oneslogi.base.dbflute.bsentity.dbmeta.TAllocInstHDbm");
        tmpMap.put("t_alloc_lot", "com.oneslogi.base.dbflute.bsentity.dbmeta.TAllocLotDbm");
        tmpMap.put("t_amazon_order", "com.oneslogi.base.dbflute.bsentity.dbmeta.TAmazonOrderDbm");
        tmpMap.put("t_billing_data", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBillingDataDbm");
        tmpMap.put("t_bldl3310", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl3310Dbm");
        tmpMap.put("t_bldl3330", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl3330Dbm");
        tmpMap.put("t_bldl3350", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl3350Dbm");
        tmpMap.put("t_bldl3390", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl3390Dbm");
        tmpMap.put("t_bldl350k", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl350kDbm");
        tmpMap.put("t_bldl350n", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl350nDbm");
        tmpMap.put("t_bldl5050", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5050Dbm");
        tmpMap.put("t_bldl5052", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5052Dbm");
        tmpMap.put("t_bldl5060", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5060Dbm");
        tmpMap.put("t_bldl5100", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5100Dbm");
        tmpMap.put("t_bldl5110", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5110Dbm");
        tmpMap.put("t_bldl5120", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5120Dbm");
        tmpMap.put("t_bldl5125", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5125Dbm");
        tmpMap.put("t_bldl5130", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5130Dbm");
        tmpMap.put("t_bldl5150", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5150Dbm");
        tmpMap.put("t_bldl5151", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5151Dbm");
        tmpMap.put("t_bldl5160", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5160Dbm");
        tmpMap.put("t_bldl5170", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5170Dbm");
        tmpMap.put("t_bldl5175", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5175Dbm");
        tmpMap.put("t_bldl5180", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5180Dbm");
        tmpMap.put("t_bldl5250", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5250Dbm");
        tmpMap.put("t_bldl5310", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5310Dbm");
        tmpMap.put("t_bldl5312", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5312Dbm");
        tmpMap.put("t_bldl5313", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5313Dbm");
        tmpMap.put("t_bldl5315", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5315Dbm");
        tmpMap.put("t_bldl5340", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5340Dbm");
        tmpMap.put("t_bldl5351", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5351Dbm");
        tmpMap.put("t_bldl5352", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5352Dbm");
        tmpMap.put("t_bldl5353", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5353Dbm");
        tmpMap.put("t_bldl5430", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5430Dbm");
        tmpMap.put("t_bldl5610", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5610Dbm");
        tmpMap.put("t_bldl5615", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5615Dbm");
        tmpMap.put("t_bldl5620", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5620Dbm");
        tmpMap.put("t_bldl5625", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5625Dbm");
        tmpMap.put("t_bldl5630", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5630Dbm");
        tmpMap.put("t_bldl5640", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5640Dbm");
        tmpMap.put("t_bldl5650", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5650Dbm");
        tmpMap.put("t_bldl5660", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl5660Dbm");
        tmpMap.put("t_bldl6760", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBldl6760Dbm");
        tmpMap.put("t_ec_order_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.TEcOrderBDbm");
        tmpMap.put("t_ec_order_h", "com.oneslogi.base.dbflute.bsentity.dbmeta.TEcOrderHDbm");
        tmpMap.put("t_ec_order_r", "com.oneslogi.base.dbflute.bsentity.dbmeta.TEcOrderRDbm");
        tmpMap.put("t_ht_comctl", "com.oneslogi.base.dbflute.bsentity.dbmeta.THtComctlDbm");
        tmpMap.put("t_id_manag_data", "com.oneslogi.base.dbflute.bsentity.dbmeta.TIdManagDataDbm");
        tmpMap.put("t_inventory_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.TInventoryBDbm");
        tmpMap.put("t_inventory_h", "com.oneslogi.base.dbflute.bsentity.dbmeta.TInventoryHDbm");
        tmpMap.put("t_inventory_inp_hist", "com.oneslogi.base.dbflute.bsentity.dbmeta.TInventoryInpHistDbm");
        tmpMap.put("t_inventory_inst", "com.oneslogi.base.dbflute.bsentity.dbmeta.TInventoryInstDbm");
        tmpMap.put("t_inventory_r", "com.oneslogi.base.dbflute.bsentity.dbmeta.TInventoryRDbm");
        tmpMap.put("t_inventory_receive_label", "com.oneslogi.base.dbflute.bsentity.dbmeta.TInventoryReceiveLabelDbm");
        tmpMap.put("t_invoice_tracking", "com.oneslogi.base.dbflute.bsentity.dbmeta.TInvoiceTrackingDbm");
        tmpMap.put("t_keeping_lot", "com.oneslogi.base.dbflute.bsentity.dbmeta.TKeepingLotDbm");
        tmpMap.put("t_last_lot", "com.oneslogi.base.dbflute.bsentity.dbmeta.TLastLotDbm");
        tmpMap.put("t_lot", "com.oneslogi.base.dbflute.bsentity.dbmeta.TLotDbm");
        tmpMap.put("t_move_inst_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.TMoveInstBDbm");
        tmpMap.put("t_move_inst_h", "com.oneslogi.base.dbflute.bsentity.dbmeta.TMoveInstHDbm");
        tmpMap.put("t_move_inst_r", "com.oneslogi.base.dbflute.bsentity.dbmeta.TMoveInstRDbm");
        tmpMap.put("t_move_record_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.TMoveRecordBDbm");
        tmpMap.put("t_nizoroe", "com.oneslogi.base.dbflute.bsentity.dbmeta.TNizoroeDbm");
        tmpMap.put("t_nizoroe_alarm_log", "com.oneslogi.base.dbflute.bsentity.dbmeta.TNizoroeAlarmLogDbm");
        tmpMap.put("t_operation_log", "com.oneslogi.base.dbflute.bsentity.dbmeta.TOperationLogDbm");
        tmpMap.put("t_packing_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPackingBDbm");
        tmpMap.put("t_packing_h", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPackingHDbm");
        tmpMap.put("t_packing_list", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPackingListDbm");
        tmpMap.put("t_packing_r", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPackingRDbm");
        tmpMap.put("t_pic_mthd_rcmd", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPicMthdRcmdDbm");
        tmpMap.put("t_pic_mthd_rcmd_cart", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPicMthdRcmdCartDbm");
        tmpMap.put("t_pic_mthd_rcmd_data", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPicMthdRcmdDataDbm");
        tmpMap.put("t_picking_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPickingBDbm");
        tmpMap.put("t_picking_h", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPickingHDbm");
        tmpMap.put("t_picking_r", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPickingRDbm");
        tmpMap.put("t_picking_receive_label", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPickingReceiveLabelDbm");
        tmpMap.put("t_picking_record_stock", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPickingRecordStockDbm");
        tmpMap.put("t_rakuten_order", "com.oneslogi.base.dbflute.bsentity.dbmeta.TRakutenOrderDbm");
        tmpMap.put("t_receive_label", "com.oneslogi.base.dbflute.bsentity.dbmeta.TReceiveLabelDbm");
        tmpMap.put("t_receive_plan_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.TReceivePlanBDbm");
        tmpMap.put("t_receive_plan_data_transfer", "com.oneslogi.base.dbflute.bsentity.dbmeta.TReceivePlanDataTransferDbm");
        tmpMap.put("t_receive_plan_h", "com.oneslogi.base.dbflute.bsentity.dbmeta.TReceivePlanHDbm");
        tmpMap.put("t_receive_plan_r", "com.oneslogi.base.dbflute.bsentity.dbmeta.TReceivePlanRDbm");
        tmpMap.put("t_receive_plan_spare", "com.oneslogi.base.dbflute.bsentity.dbmeta.TReceivePlanSpareDbm");
        tmpMap.put("t_scm_label", "com.oneslogi.base.dbflute.bsentity.dbmeta.TScmLabelDbm");
        tmpMap.put("t_serial_no", "com.oneslogi.base.dbflute.bsentity.dbmeta.TSerialNoDbm");
        tmpMap.put("t_shipping_inst_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.TShippingInstBDbm");
        tmpMap.put("t_shipping_inst_b_print", "com.oneslogi.base.dbflute.bsentity.dbmeta.TShippingInstBPrintDbm");
        tmpMap.put("t_shipping_inst_data_transfer", "com.oneslogi.base.dbflute.bsentity.dbmeta.TShippingInstDataTransferDbm");
        tmpMap.put("t_shipping_inst_h", "com.oneslogi.base.dbflute.bsentity.dbmeta.TShippingInstHDbm");
        tmpMap.put("t_shipping_inst_h_print", "com.oneslogi.base.dbflute.bsentity.dbmeta.TShippingInstHPrintDbm");
        tmpMap.put("t_shipping_inst_spare", "com.oneslogi.base.dbflute.bsentity.dbmeta.TShippingInstSpareDbm");
        tmpMap.put("t_shipping_plan_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.TShippingPlanBDbm");
        tmpMap.put("t_shipping_plan_h", "com.oneslogi.base.dbflute.bsentity.dbmeta.TShippingPlanHDbm");
        tmpMap.put("t_shipping_record_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.TShippingRecordBDbm");
        tmpMap.put("t_shipping_record_h", "com.oneslogi.base.dbflute.bsentity.dbmeta.TShippingRecordHDbm");
        tmpMap.put("t_stock", "com.oneslogi.base.dbflute.bsentity.dbmeta.TStockDbm");
        tmpMap.put("t_stock_book", "com.oneslogi.base.dbflute.bsentity.dbmeta.TStockBookDbm");
        tmpMap.put("t_stock_inout", "com.oneslogi.base.dbflute.bsentity.dbmeta.TStockInoutDbm");
        tmpMap.put("t_stock_record", "com.oneslogi.base.dbflute.bsentity.dbmeta.TStockRecordDbm");
        tmpMap.put("t_stock_report", "com.oneslogi.base.dbflute.bsentity.dbmeta.TStockReportDbm");
        tmpMap.put("t_store_no", "com.oneslogi.base.dbflute.bsentity.dbmeta.TStoreNoDbm");
        tmpMap.put("t_store_no_r", "com.oneslogi.base.dbflute.bsentity.dbmeta.TStoreNoRDbm");
        tmpMap.put("t_store_record_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.TStoreRecordBDbm");
        tmpMap.put("t_store_record_h", "com.oneslogi.base.dbflute.bsentity.dbmeta.TStoreRecordHDbm");
        tmpMap.put("t_store_record_r", "com.oneslogi.base.dbflute.bsentity.dbmeta.TStoreRecordRDbm");
        tmpMap.put("t_transfer", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTransferDbm");
        tmpMap.put("t_work_data", "com.oneslogi.base.dbflute.bsentity.dbmeta.TWorkDataDbm");
        tmpMap.put("t_work_log", "com.oneslogi.base.dbflute.bsentity.dbmeta.TWorkLogDbm");
        tmpMap.put("t_yahoo_order", "com.oneslogi.base.dbflute.bsentity.dbmeta.TYahooOrderDbm");
        tmpMap.put("v_dict", "com.oneslogi.base.dbflute.bsentity.dbmeta.VDictDbm");
        tmpMap.put("v_ht_dict", "com.oneslogi.base.dbflute.bsentity.dbmeta.VHtDictDbm");
        tmpMap.put("w_carrier_zip_input", "com.oneslogi.base.dbflute.bsentity.dbmeta.WCarrierZipInputDbm");
        tmpMap.put("w_customer_input", "com.oneslogi.base.dbflute.bsentity.dbmeta.WCustomerInputDbm");
        tmpMap.put("w_ht_inventory_input_prod", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtInventoryInputProdDbm");
        tmpMap.put("w_ht_loading", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtLoadingDbm");
        tmpMap.put("w_ht_picking", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtPickingDbm");
        tmpMap.put("w_ht_receive_inspection", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtReceiveInspectionDbm");
        tmpMap.put("w_ht_receive_no_plan_insp", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtReceiveNoPlanInspDbm");
        tmpMap.put("w_ht_receive_store", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtReceiveStoreDbm");
        tmpMap.put("w_ht_serial_receive_insp", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtSerialReceiveInspDbm");
        tmpMap.put("w_ht_serial_shipping_insp", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtSerialShippingInspDbm");
        tmpMap.put("w_ht_shipping", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtShippingDbm");
        tmpMap.put("w_ht_shipping_picking", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtShippingPickingDbm");
        tmpMap.put("w_ht_total_picking", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtTotalPickingDbm");
        tmpMap.put("w_location_input", "com.oneslogi.base.dbflute.bsentity.dbmeta.WLocationInputDbm");
        tmpMap.put("w_product_input", "com.oneslogi.base.dbflute.bsentity.dbmeta.WProductInputDbm");
        tmpMap.put("w_product_shape_input", "com.oneslogi.base.dbflute.bsentity.dbmeta.WProductShapeInputDbm");
        tmpMap.put("w_sgl_row_ship_insp_b", "com.oneslogi.base.dbflute.bsentity.dbmeta.WSglRowShipInspBDbm");
        tmpMap.put("w_sgl_row_ship_insp_h", "com.oneslogi.base.dbflute.bsentity.dbmeta.WSglRowShipInspHDbm");
        tmpMap.put("w_shipping_interrupt", "com.oneslogi.base.dbflute.bsentity.dbmeta.WShippingInterruptDbm");
        tmpMap.put("w_stock_input", "com.oneslogi.base.dbflute.bsentity.dbmeta.WStockInputDbm");
        tmpMap.put("w_work", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWorkDbm");
        tmpMap.put("w_zip_company_input", "com.oneslogi.base.dbflute.bsentity.dbmeta.WZipCompanyInputDbm");
        tmpMap.put("w_zip_input", "com.oneslogi.base.dbflute.bsentity.dbmeta.WZipInputDbm");
        _tableDbNameClassNameMap = Collections.unmodifiableMap(tmpMap);
    }

    /** The flexible map of table DB name for conversion in finding process. (NotNull) */
    protected static final Map<String, String> _tableDbNameFlexibleMap = StringKeyMap.createAsFlexible();
    static {
        for (String tableDbName : _tableDbNameClassNameMap.keySet()) {
            _tableDbNameFlexibleMap.put(tableDbName, tableDbName);
        }
    }

    /**
     * Get the unmodifiable map of DB meta. map:{tableDbName = DBMeta}
     * @return The unmodifiable map that contains all instances of DB meta. (NotNull, NotEmpty)
     */
    public static Map<String, DBMeta> getUnmodifiableDBMetaMap() {
        initializeDBMetaMap();
        synchronized (_tableDbNameInstanceMap) {
            return Collections.unmodifiableMap(_tableDbNameInstanceMap);
        }
    }

    /**
     * Initialize the map of DB meta.
     */
    protected static void initializeDBMetaMap() {
        if (isInitialized()) {
            return;
        }
        synchronized (_tableDbNameInstanceMap) {
            for (String tableDbName : _tableDbNameClassNameMap.keySet()) {
                findDBMeta(tableDbName); // initialize
            }
            if (!isInitialized()) {
                String msg = "Failed to initialize tableDbNameInstanceMap: " + _tableDbNameInstanceMap;
                throw new IllegalStateException(msg);
            }
        }
    }

    protected static boolean isInitialized() {
        return _tableDbNameInstanceMap.size() == _tableDbNameClassNameMap.size();
    }

    // ===================================================================================
    //                                                                  Provider Singleton
    //                                                                  ==================
    protected static final DBMetaProvider _provider = new DBMetaInstanceHandler();

    public static DBMetaProvider getProvider() {
        return _provider;
    }

    public DBMeta provideDBMeta(String tableFlexibleName) {
        return byTableFlexibleName(tableFlexibleName);
    }

    public DBMeta provideDBMeta(Class<?> entityType) {
        return byEntityType(entityType);
    }

    public DBMeta provideDBMetaChecked(String tableFlexibleName) {
        return findDBMeta(tableFlexibleName);
    }

    public DBMeta provideDBMetaChecked(Class<?> entityType) {
        return findDBMeta(entityType);
    }

    // ===================================================================================
    //                                                                         Find DBMeta
    //                                                                         ===========
    /**
     * Find DB meta by table flexible name. (accept quoted name and schema prefix)
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @throws org.dbflute.exception.DBMetaNotFoundException When the DB meta is not found.
     */
    public static DBMeta findDBMeta(String tableFlexibleName) {
        DBMeta dbmeta = byTableFlexibleName(tableFlexibleName);
        if (dbmeta == null) {
            String msg = "The DB meta was not found by the table flexible name: key=" + tableFlexibleName;
            throw new DBMetaNotFoundException(msg);
        }
        return dbmeta;
    }

    /**
     * Find DB meta by entity type.
     * @param entityType The entity type of table, which should implement the {@link Entity} interface. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @throws org.dbflute.exception.DBMetaNotFoundException When the DB meta is not found.
     */
    public static DBMeta findDBMeta(Class<?> entityType) {
        DBMeta dbmeta = byEntityType(entityType);
        if (dbmeta == null) {
            String msg = "The DB meta was not found by the entity type: key=" + entityType;
            throw new DBMetaNotFoundException(msg);
        }
        return dbmeta;
    }

    // ===================================================================================
    //                                                                       by Table Name
    //                                                                       =============
    /**
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byTableFlexibleName(String tableFlexibleName) {
        assertStringNotNullAndNotTrimmedEmpty("tableFlexibleName", tableFlexibleName);
        String tableDbName = _tableDbNameFlexibleMap.get(tableFlexibleName);
        if (tableDbName == null) {
            tableDbName = retryByNormalizedName(tableFlexibleName);
        }
        return tableDbName != null ? byTableDbName(tableDbName) : null;
    }

    protected static String retryByNormalizedName(String tableFlexibleName) {
        String tableDbName = null;
        String pureName = normalizeTableFlexibleName(tableFlexibleName);
        String schema = extractSchemaIfExists(tableFlexibleName);
        if (schema != null) { // first, find by qualified name
            tableDbName = _tableDbNameFlexibleMap.get(schema + "." + pureName);
        }
        if (tableDbName == null) { // next, find by pure name
            tableDbName = _tableDbNameFlexibleMap.get(pureName);
        }
        return tableDbName;
    }

    protected static String normalizeTableFlexibleName(String tableFlexibleName) {
        return removeQuoteIfExists(removeSchemaIfExists(tableFlexibleName));
    }

    protected static String removeQuoteIfExists(String name) {
        if (name.startsWith("\"") && name.endsWith("\"")) {
            return strip(name);
        } else if (name.startsWith("[") && name.endsWith("]")) {
            return strip(name);
        }
        return name;
    }

    protected static String removeSchemaIfExists(String name) {
        int dotLastIndex = name.lastIndexOf(".");
        return dotLastIndex >= 0 ? name.substring(dotLastIndex + ".".length()) : name;
    }

    protected static String extractSchemaIfExists(String name) {
        int dotLastIndex = name.lastIndexOf(".");
        return dotLastIndex >= 0 ? name.substring(0, dotLastIndex) : null;
    }

    protected static String strip(String name) {
        return name.substring(1, name.length() - 1);
    }

    /**
     * @param tableDbName The DB name of table. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byTableDbName(String tableDbName) {
        assertStringNotNullAndNotTrimmedEmpty("tableDbName", tableDbName);
        return getCachedDBMeta(tableDbName);
    }

    // ===================================================================================
    //                                                                      by Entity Type
    //                                                                      ==============
    /**
     * @param entityType The entity type of table, which should implement the entity interface. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byEntityType(Class<?> entityType) {
        assertObjectNotNull("entityType", entityType);
        return getCachedDBMeta(entityType);
    }

    // ===================================================================================
    //                                                                       Cached DBMeta
    //                                                                       =============
    protected static DBMeta getCachedDBMeta(String tableDbName) { // lazy-load (thank you koyak!)
        DBMeta dbmeta = _tableDbNameInstanceMap.get(tableDbName);
        if (dbmeta != null) {
            return dbmeta;
        }
        synchronized (_tableDbNameInstanceMap) {
            dbmeta = _tableDbNameInstanceMap.get(tableDbName);
            if (dbmeta != null) {
                // an other thread might have initialized
                // or reading might failed by same-time writing
                return dbmeta;
            }
            String dbmetaName = _tableDbNameClassNameMap.get(tableDbName);
            if (dbmetaName == null) {
                return null;
            }
            _tableDbNameInstanceMap.put(tableDbName, toDBMetaInstance(dbmetaName));
            return _tableDbNameInstanceMap.get(tableDbName);
        }
    }

    protected static DBMeta toDBMetaInstance(String dbmetaName) {
        try {
            Class<?> dbmetaType = Class.forName(dbmetaName);
            Method method = dbmetaType.getMethod("getInstance", (Class[])null);
            Object result = method.invoke(null, (Object[])null);
            return (DBMeta)result;
        } catch (Exception e) {
            String msg = "Failed to get the instance: " + dbmetaName;
            throw new IllegalStateException(msg, e);
        }
    }

    protected static DBMeta getCachedDBMeta(Class<?> entityType) { // lazy-load same as by-name
        DBMeta dbmeta = _entityTypeInstanceMap.get(entityType);
        if (dbmeta != null) {
            return dbmeta;
        }
        synchronized (_entityTypeInstanceMap) {
            dbmeta = _entityTypeInstanceMap.get(entityType);
            if (dbmeta != null) {
                // an other thread might have initialized
                // or reading might failed by same-time writing
                return dbmeta;
            }
            if (Entity.class.isAssignableFrom(entityType)) { // required
                Entity entity = newEntity(entityType);
                dbmeta = getCachedDBMeta(entity.asTableDbName());
            }
            if (dbmeta == null) {
                return null;
            }
            _entityTypeInstanceMap.put(entityType, dbmeta);
            return _entityTypeInstanceMap.get(entityType);
        }
    }

    protected static Entity newEntity(Class<?> entityType) {
        try {
            return (Entity)entityType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            String msg = "Failed to new the instance: " + entityType;
            throw new IllegalStateException(msg, e);
        }
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected static <KEY, VALUE> HashMap<KEY, VALUE> newHashMap() {
        return new HashMap<KEY, VALUE>();
    }

    // -----------------------------------------------------
    //                                         Assert Object
    //                                         -------------
    protected static void assertObjectNotNull(String variableName, Object value) {
        DfAssertUtil.assertObjectNotNull(variableName, value);
    }

    // -----------------------------------------------------
    //                                         Assert String
    //                                         -------------
    protected static void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        DfAssertUtil.assertStringNotNullAndNotTrimmedEmpty(variableName, value);
    }
}
