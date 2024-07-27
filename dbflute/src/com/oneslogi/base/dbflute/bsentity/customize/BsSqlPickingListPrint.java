package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlPickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     NIZOROE_NO2, DAIHYO_NIZOROE_NO2, SUPPLY_CUSTOMER_NM, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, KOHAI_CONTRACTOR_CD, KOHAI_CONTRACTOR_NM, SHIPPING_DT, WORK_DT, SHIPPING_FIXED_DT, CLIENT_SHIPPING_NO, PROCESS_TYPE_CD, PROCESS_TYPE_NM, SHIPPING_TYPE_CD, SHIPPING_TYPE_NM, SLIP_CNT, LINE_CNT, ITEM_CNT, INST_NUM, PACKING_NUM, NIZOROE_OUT_FLG, NIZOROE_OUT_NM, NIZOROE_OUT_DT, TAG_OUT_FLG, TAG_OUT_NM, TAG_OUT_DT, DELIV_OUT_FLG, DELIV_OUT_NM, DELIV_OUT_DT, PLL_OUT_FLG, PLL_OUT_NM, PLL_OUT_DT, INDV_SUPPLY_OUT_FLG, INDV_SUPPLY_OUT_NM, INDV_SUPPLY_OUT_DT, INDV_LABEL_OUT_FLG, INDV_LABEL_OUT_NM, INDV_LABEL_OUT_DT, CENTER_CD, CENTER_NM, EMERGENCY_FLG, PICKING_STATUS_CD, ID_MANAG_PRINT_TYPE_CD
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String nizoroeNo2 = entity.getNizoroeNo2();
 * String daihyoNizoroeNo2 = entity.getDaihyoNizoroeNo2();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * String deliveryCourseCd = entity.getDeliveryCourseCd();
 * String deliveryCourseNm = entity.getDeliveryCourseNm();
 * String carrierCd = entity.getCarrierCd();
 * String carrierNm = entity.getCarrierNm();
 * String kohaiContractorCd = entity.getKohaiContractorCd();
 * String kohaiContractorNm = entity.getKohaiContractorNm();
 * String shippingDt = entity.getShippingDt();
 * String workDt = entity.getWorkDt();
 * String shippingFixedDt = entity.getShippingFixedDt();
 * String clientShippingNo = entity.getClientShippingNo();
 * String processTypeCd = entity.getProcessTypeCd();
 * String processTypeNm = entity.getProcessTypeNm();
 * String shippingTypeCd = entity.getShippingTypeCd();
 * String shippingTypeNm = entity.getShippingTypeNm();
 * Long slipCnt = entity.getSlipCnt();
 * Long lineCnt = entity.getLineCnt();
 * Long itemCnt = entity.getItemCnt();
 * java.math.BigDecimal instNum = entity.getInstNum();
 * java.math.BigDecimal packingNum = entity.getPackingNum();
 * String nizoroeOutFlg = entity.getNizoroeOutFlg();
 * String nizoroeOutNm = entity.getNizoroeOutNm();
 * java.sql.Timestamp nizoroeOutDt = entity.getNizoroeOutDt();
 * String tagOutFlg = entity.getTagOutFlg();
 * String tagOutNm = entity.getTagOutNm();
 * java.sql.Timestamp tagOutDt = entity.getTagOutDt();
 * String delivOutFlg = entity.getDelivOutFlg();
 * String delivOutNm = entity.getDelivOutNm();
 * java.sql.Timestamp delivOutDt = entity.getDelivOutDt();
 * String pllOutFlg = entity.getPllOutFlg();
 * String pllOutNm = entity.getPllOutNm();
 * java.sql.Timestamp pllOutDt = entity.getPllOutDt();
 * String indvSupplyOutFlg = entity.getIndvSupplyOutFlg();
 * String indvSupplyOutNm = entity.getIndvSupplyOutNm();
 * java.sql.Timestamp indvSupplyOutDt = entity.getIndvSupplyOutDt();
 * String indvLabelOutFlg = entity.getIndvLabelOutFlg();
 * String indvLabelOutNm = entity.getIndvLabelOutNm();
 * java.sql.Timestamp indvLabelOutDt = entity.getIndvLabelOutDt();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String emergencyFlg = entity.getEmergencyFlg();
 * String pickingStatusCd = entity.getPickingStatusCd();
 * String idManagPrintTypeCd = entity.getIdManagPrintTypeCd();
 * entity.setNizoroeNo2(nizoroeNo2);
 * entity.setDaihyoNizoroeNo2(daihyoNizoroeNo2);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setDeliveryCourseCd(deliveryCourseCd);
 * entity.setDeliveryCourseNm(deliveryCourseNm);
 * entity.setCarrierCd(carrierCd);
 * entity.setCarrierNm(carrierNm);
 * entity.setKohaiContractorCd(kohaiContractorCd);
 * entity.setKohaiContractorNm(kohaiContractorNm);
 * entity.setShippingDt(shippingDt);
 * entity.setWorkDt(workDt);
 * entity.setShippingFixedDt(shippingFixedDt);
 * entity.setClientShippingNo(clientShippingNo);
 * entity.setProcessTypeCd(processTypeCd);
 * entity.setProcessTypeNm(processTypeNm);
 * entity.setShippingTypeCd(shippingTypeCd);
 * entity.setShippingTypeNm(shippingTypeNm);
 * entity.setSlipCnt(slipCnt);
 * entity.setLineCnt(lineCnt);
 * entity.setItemCnt(itemCnt);
 * entity.setInstNum(instNum);
 * entity.setPackingNum(packingNum);
 * entity.setNizoroeOutFlg(nizoroeOutFlg);
 * entity.setNizoroeOutNm(nizoroeOutNm);
 * entity.setNizoroeOutDt(nizoroeOutDt);
 * entity.setTagOutFlg(tagOutFlg);
 * entity.setTagOutNm(tagOutNm);
 * entity.setTagOutDt(tagOutDt);
 * entity.setDelivOutFlg(delivOutFlg);
 * entity.setDelivOutNm(delivOutNm);
 * entity.setDelivOutDt(delivOutDt);
 * entity.setPllOutFlg(pllOutFlg);
 * entity.setPllOutNm(pllOutNm);
 * entity.setPllOutDt(pllOutDt);
 * entity.setIndvSupplyOutFlg(indvSupplyOutFlg);
 * entity.setIndvSupplyOutNm(indvSupplyOutNm);
 * entity.setIndvSupplyOutDt(indvSupplyOutDt);
 * entity.setIndvLabelOutFlg(indvLabelOutFlg);
 * entity.setIndvLabelOutNm(indvLabelOutNm);
 * entity.setIndvLabelOutDt(indvLabelOutDt);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setEmergencyFlg(emergencyFlg);
 * entity.setPickingStatusCd(pickingStatusCd);
 * entity.setIdManagPrintTypeCd(idManagPrintTypeCd);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlPickingListPrint extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** NIZOROE_NO2: {VARCHAR(30), refers to t_alloc_inst_h.NIZOROE_NO2} */
    protected String _nizoroeNo2;

    /** DAIHYO_NIZOROE_NO2: {VARCHAR(30), refers to t_alloc_inst_h.DAIHYO_NIZOROE_NO2} */
    protected String _daihyoNizoroeNo2;

    /** SUPPLY_CUSTOMER_NM: {VARCHAR(60)} */
    protected String _supplyCustomerNm;

    /** DELIVERY_COURSE_CD: {VARCHAR(30), refers to m_delivery_course.DELIVERY_COURSE_CD} */
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {VARCHAR(60)} */
    protected String _deliveryCourseNm;

    /** CARRIER_CD: {VARCHAR(30), refers to m_carrier.CARRIER_CD} */
    protected String _carrierCd;

    /** CARRIER_NM: {VARCHAR(60)} */
    protected String _carrierNm;

    /** KOHAI_CONTRACTOR_CD: {VARCHAR(30)} */
    protected String _kohaiContractorCd;

    /** KOHAI_CONTRACTOR_NM: {VARCHAR(60)} */
    protected String _kohaiContractorNm;

    /** SHIPPING_DT: {VARCHAR(8)} */
    protected String _shippingDt;

    /** WORK_DT: {VARCHAR(8), refers to t_shipping_inst_h.WORK_DT} */
    protected String _workDt;

    /** SHIPPING_FIXED_DT: {VARCHAR(8), refers to t_picking_h.SHIPPING_FIXED_DT} */
    protected String _shippingFixedDt;

    /** CLIENT_SHIPPING_NO: {VARCHAR(30)} */
    protected String _clientShippingNo;

    /** PROCESS_TYPE_CD: {VARCHAR(30)} */
    protected String _processTypeCd;

    /** PROCESS_TYPE_NM: {VARCHAR(100)} */
    protected String _processTypeNm;

    /** SHIPPING_TYPE_CD: {VARCHAR(30)} */
    protected String _shippingTypeCd;

    /** SHIPPING_TYPE_NM: {NULL} */
    protected String _shippingTypeNm;

    /** SLIP_CNT: {BIGINT(21)} */
    protected Long _slipCnt;

    /** LINE_CNT: {BIGINT(21)} */
    protected Long _lineCnt;

    /** ITEM_CNT: {BIGINT(21)} */
    protected Long _itemCnt;

    /** INST_NUM: {DECIMAL(36, 4)} */
    protected java.math.BigDecimal _instNum;

    /** PACKING_NUM: {DECIMAL(36, 4)} */
    protected java.math.BigDecimal _packingNum;

    /** NIZOROE_OUT_FLG: {VARCHAR(1)} */
    protected String _nizoroeOutFlg;

    /** NIZOROE_OUT_NM: {NULL} */
    protected String _nizoroeOutNm;

    /** NIZOROE_OUT_DT: {DATETIME(23)} */
    protected java.sql.Timestamp _nizoroeOutDt;

    /** TAG_OUT_FLG: {VARCHAR(1)} */
    protected String _tagOutFlg;

    /** TAG_OUT_NM: {NULL} */
    protected String _tagOutNm;

    /** TAG_OUT_DT: {DATETIME(23)} */
    protected java.sql.Timestamp _tagOutDt;

    /** DELIV_OUT_FLG: {VARCHAR(1)} */
    protected String _delivOutFlg;

    /** DELIV_OUT_NM: {NULL} */
    protected String _delivOutNm;

    /** DELIV_OUT_DT: {DATETIME(23)} */
    protected java.sql.Timestamp _delivOutDt;

    /** PLL_OUT_FLG: {VARCHAR(1)} */
    protected String _pllOutFlg;

    /** PLL_OUT_NM: {NULL} */
    protected String _pllOutNm;

    /** PLL_OUT_DT: {DATETIME(23)} */
    protected java.sql.Timestamp _pllOutDt;

    /** INDV_SUPPLY_OUT_FLG: {VARCHAR(1)} */
    protected String _indvSupplyOutFlg;

    /** INDV_SUPPLY_OUT_NM: {NULL} */
    protected String _indvSupplyOutNm;

    /** INDV_SUPPLY_OUT_DT: {DATETIME(23)} */
    protected java.sql.Timestamp _indvSupplyOutDt;

    /** INDV_LABEL_OUT_FLG: {VARCHAR(1)} */
    protected String _indvLabelOutFlg;

    /** INDV_LABEL_OUT_NM: {NULL} */
    protected String _indvLabelOutNm;

    /** INDV_LABEL_OUT_DT: {DATETIME(23)} */
    protected java.sql.Timestamp _indvLabelOutDt;

    /** CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} */
    protected String _centerCd;

    /** CENTER_NM: {VARCHAR(60)} */
    protected String _centerNm;

    /** EMERGENCY_FLG: {CHAR(1)} */
    protected String _emergencyFlg;

    /** PICKING_STATUS_CD: {VARCHAR(30)} */
    protected String _pickingStatusCd;

    /** ID_MANAG_PRINT_TYPE_CD: {VARCHAR(30)} */
    protected String _idManagPrintTypeCd;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlPickingListPrintDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlPickingListPrint";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSqlPickingListPrint) {
            BsSqlPickingListPrint other = (BsSqlPickingListPrint)obj;
            if (!xSV(_nizoroeNo2, other._nizoroeNo2)) { return false; }
            if (!xSV(_daihyoNizoroeNo2, other._daihyoNizoroeNo2)) { return false; }
            if (!xSV(_supplyCustomerNm, other._supplyCustomerNm)) { return false; }
            if (!xSV(_deliveryCourseCd, other._deliveryCourseCd)) { return false; }
            if (!xSV(_deliveryCourseNm, other._deliveryCourseNm)) { return false; }
            if (!xSV(_carrierCd, other._carrierCd)) { return false; }
            if (!xSV(_carrierNm, other._carrierNm)) { return false; }
            if (!xSV(_kohaiContractorCd, other._kohaiContractorCd)) { return false; }
            if (!xSV(_kohaiContractorNm, other._kohaiContractorNm)) { return false; }
            if (!xSV(_shippingDt, other._shippingDt)) { return false; }
            if (!xSV(_workDt, other._workDt)) { return false; }
            if (!xSV(_shippingFixedDt, other._shippingFixedDt)) { return false; }
            if (!xSV(_clientShippingNo, other._clientShippingNo)) { return false; }
            if (!xSV(_processTypeCd, other._processTypeCd)) { return false; }
            if (!xSV(_processTypeNm, other._processTypeNm)) { return false; }
            if (!xSV(_shippingTypeCd, other._shippingTypeCd)) { return false; }
            if (!xSV(_shippingTypeNm, other._shippingTypeNm)) { return false; }
            if (!xSV(_slipCnt, other._slipCnt)) { return false; }
            if (!xSV(_lineCnt, other._lineCnt)) { return false; }
            if (!xSV(_itemCnt, other._itemCnt)) { return false; }
            if (!xSV(_instNum, other._instNum)) { return false; }
            if (!xSV(_packingNum, other._packingNum)) { return false; }
            if (!xSV(_nizoroeOutFlg, other._nizoroeOutFlg)) { return false; }
            if (!xSV(_nizoroeOutNm, other._nizoroeOutNm)) { return false; }
            if (!xSV(_nizoroeOutDt, other._nizoroeOutDt)) { return false; }
            if (!xSV(_tagOutFlg, other._tagOutFlg)) { return false; }
            if (!xSV(_tagOutNm, other._tagOutNm)) { return false; }
            if (!xSV(_tagOutDt, other._tagOutDt)) { return false; }
            if (!xSV(_delivOutFlg, other._delivOutFlg)) { return false; }
            if (!xSV(_delivOutNm, other._delivOutNm)) { return false; }
            if (!xSV(_delivOutDt, other._delivOutDt)) { return false; }
            if (!xSV(_pllOutFlg, other._pllOutFlg)) { return false; }
            if (!xSV(_pllOutNm, other._pllOutNm)) { return false; }
            if (!xSV(_pllOutDt, other._pllOutDt)) { return false; }
            if (!xSV(_indvSupplyOutFlg, other._indvSupplyOutFlg)) { return false; }
            if (!xSV(_indvSupplyOutNm, other._indvSupplyOutNm)) { return false; }
            if (!xSV(_indvSupplyOutDt, other._indvSupplyOutDt)) { return false; }
            if (!xSV(_indvLabelOutFlg, other._indvLabelOutFlg)) { return false; }
            if (!xSV(_indvLabelOutNm, other._indvLabelOutNm)) { return false; }
            if (!xSV(_indvLabelOutDt, other._indvLabelOutDt)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_emergencyFlg, other._emergencyFlg)) { return false; }
            if (!xSV(_pickingStatusCd, other._pickingStatusCd)) { return false; }
            if (!xSV(_idManagPrintTypeCd, other._idManagPrintTypeCd)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _nizoroeNo2);
        hs = xCH(hs, _daihyoNizoroeNo2);
        hs = xCH(hs, _supplyCustomerNm);
        hs = xCH(hs, _deliveryCourseCd);
        hs = xCH(hs, _deliveryCourseNm);
        hs = xCH(hs, _carrierCd);
        hs = xCH(hs, _carrierNm);
        hs = xCH(hs, _kohaiContractorCd);
        hs = xCH(hs, _kohaiContractorNm);
        hs = xCH(hs, _shippingDt);
        hs = xCH(hs, _workDt);
        hs = xCH(hs, _shippingFixedDt);
        hs = xCH(hs, _clientShippingNo);
        hs = xCH(hs, _processTypeCd);
        hs = xCH(hs, _processTypeNm);
        hs = xCH(hs, _shippingTypeCd);
        hs = xCH(hs, _shippingTypeNm);
        hs = xCH(hs, _slipCnt);
        hs = xCH(hs, _lineCnt);
        hs = xCH(hs, _itemCnt);
        hs = xCH(hs, _instNum);
        hs = xCH(hs, _packingNum);
        hs = xCH(hs, _nizoroeOutFlg);
        hs = xCH(hs, _nizoroeOutNm);
        hs = xCH(hs, _nizoroeOutDt);
        hs = xCH(hs, _tagOutFlg);
        hs = xCH(hs, _tagOutNm);
        hs = xCH(hs, _tagOutDt);
        hs = xCH(hs, _delivOutFlg);
        hs = xCH(hs, _delivOutNm);
        hs = xCH(hs, _delivOutDt);
        hs = xCH(hs, _pllOutFlg);
        hs = xCH(hs, _pllOutNm);
        hs = xCH(hs, _pllOutDt);
        hs = xCH(hs, _indvSupplyOutFlg);
        hs = xCH(hs, _indvSupplyOutNm);
        hs = xCH(hs, _indvSupplyOutDt);
        hs = xCH(hs, _indvLabelOutFlg);
        hs = xCH(hs, _indvLabelOutNm);
        hs = xCH(hs, _indvLabelOutDt);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _emergencyFlg);
        hs = xCH(hs, _pickingStatusCd);
        hs = xCH(hs, _idManagPrintTypeCd);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_nizoroeNo2));
        sb.append(dm).append(xfND(_daihyoNizoroeNo2));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_deliveryCourseCd));
        sb.append(dm).append(xfND(_deliveryCourseNm));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_carrierNm));
        sb.append(dm).append(xfND(_kohaiContractorCd));
        sb.append(dm).append(xfND(_kohaiContractorNm));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_shippingFixedDt));
        sb.append(dm).append(xfND(_clientShippingNo));
        sb.append(dm).append(xfND(_processTypeCd));
        sb.append(dm).append(xfND(_processTypeNm));
        sb.append(dm).append(xfND(_shippingTypeCd));
        sb.append(dm).append(xfND(_shippingTypeNm));
        sb.append(dm).append(xfND(_slipCnt));
        sb.append(dm).append(xfND(_lineCnt));
        sb.append(dm).append(xfND(_itemCnt));
        sb.append(dm).append(xfND(_instNum));
        sb.append(dm).append(xfND(_packingNum));
        sb.append(dm).append(xfND(_nizoroeOutFlg));
        sb.append(dm).append(xfND(_nizoroeOutNm));
        sb.append(dm).append(xfND(_nizoroeOutDt));
        sb.append(dm).append(xfND(_tagOutFlg));
        sb.append(dm).append(xfND(_tagOutNm));
        sb.append(dm).append(xfND(_tagOutDt));
        sb.append(dm).append(xfND(_delivOutFlg));
        sb.append(dm).append(xfND(_delivOutNm));
        sb.append(dm).append(xfND(_delivOutDt));
        sb.append(dm).append(xfND(_pllOutFlg));
        sb.append(dm).append(xfND(_pllOutNm));
        sb.append(dm).append(xfND(_pllOutDt));
        sb.append(dm).append(xfND(_indvSupplyOutFlg));
        sb.append(dm).append(xfND(_indvSupplyOutNm));
        sb.append(dm).append(xfND(_indvSupplyOutDt));
        sb.append(dm).append(xfND(_indvLabelOutFlg));
        sb.append(dm).append(xfND(_indvLabelOutNm));
        sb.append(dm).append(xfND(_indvLabelOutDt));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_emergencyFlg));
        sb.append(dm).append(xfND(_pickingStatusCd));
        sb.append(dm).append(xfND(_idManagPrintTypeCd));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SqlPickingListPrint clone() {
        return (SqlPickingListPrint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NIZOROE_NO2: {VARCHAR(30), refers to t_alloc_inst_h.NIZOROE_NO2} <br>
     * 荷揃番号_ハイフンあり
     * @return The value of the column 'NIZOROE_NO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getNizoroeNo2() {
        checkSpecifiedProperty("nizoroeNo2");
        return convertEmptyToNull(_nizoroeNo2);
    }

    /**
     * [set] NIZOROE_NO2: {VARCHAR(30), refers to t_alloc_inst_h.NIZOROE_NO2} <br>
     * 荷揃番号_ハイフンあり
     * @param nizoroeNo2 The value of the column 'NIZOROE_NO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNizoroeNo2(String nizoroeNo2) {
        registerModifiedProperty("nizoroeNo2");
        _nizoroeNo2 = nizoroeNo2;
    }

    /**
     * [get] DAIHYO_NIZOROE_NO2: {VARCHAR(30), refers to t_alloc_inst_h.DAIHYO_NIZOROE_NO2} <br>
     * 代表荷揃番号_ハイフンあり
     * @return The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDaihyoNizoroeNo2() {
        checkSpecifiedProperty("daihyoNizoroeNo2");
        return convertEmptyToNull(_daihyoNizoroeNo2);
    }

    /**
     * [set] DAIHYO_NIZOROE_NO2: {VARCHAR(30), refers to t_alloc_inst_h.DAIHYO_NIZOROE_NO2} <br>
     * 代表荷揃番号_ハイフンあり
     * @param daihyoNizoroeNo2 The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDaihyoNizoroeNo2(String daihyoNizoroeNo2) {
        registerModifiedProperty("daihyoNizoroeNo2");
        _daihyoNizoroeNo2 = daihyoNizoroeNo2;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerNm() {
        checkSpecifiedProperty("supplyCustomerNm");
        return convertEmptyToNull(_supplyCustomerNm);
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {VARCHAR(60)} <br>
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        registerModifiedProperty("supplyCustomerNm");
        _supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {VARCHAR(30), refers to m_delivery_course.DELIVERY_COURSE_CD} <br>
     * 配送コースCD
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseCd() {
        checkSpecifiedProperty("deliveryCourseCd");
        return convertEmptyToNull(_deliveryCourseCd);
    }

    /**
     * [set] DELIVERY_COURSE_CD: {VARCHAR(30), refers to m_delivery_course.DELIVERY_COURSE_CD} <br>
     * 配送コースCD
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        registerModifiedProperty("deliveryCourseCd");
        _deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseNm() {
        checkSpecifiedProperty("deliveryCourseNm");
        return convertEmptyToNull(_deliveryCourseNm);
    }

    /**
     * [set] DELIVERY_COURSE_NM: {VARCHAR(60)} <br>
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        registerModifiedProperty("deliveryCourseNm");
        _deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] CARRIER_CD: {VARCHAR(30), refers to m_carrier.CARRIER_CD} <br>
     * 運送業者CD
     * @return The value of the column 'CARRIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierCd() {
        checkSpecifiedProperty("carrierCd");
        return convertEmptyToNull(_carrierCd);
    }

    /**
     * [set] CARRIER_CD: {VARCHAR(30), refers to m_carrier.CARRIER_CD} <br>
     * 運送業者CD
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierCd(String carrierCd) {
        registerModifiedProperty("carrierCd");
        _carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'CARRIER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierNm() {
        checkSpecifiedProperty("carrierNm");
        return convertEmptyToNull(_carrierNm);
    }

    /**
     * [set] CARRIER_NM: {VARCHAR(60)} <br>
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierNm(String carrierNm) {
        registerModifiedProperty("carrierNm");
        _carrierNm = carrierNm;
    }

    /**
     * [get] KOHAI_CONTRACTOR_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'KOHAI_CONTRACTOR_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getKohaiContractorCd() {
        checkSpecifiedProperty("kohaiContractorCd");
        return convertEmptyToNull(_kohaiContractorCd);
    }

    /**
     * [set] KOHAI_CONTRACTOR_CD: {VARCHAR(30)} <br>
     * @param kohaiContractorCd The value of the column 'KOHAI_CONTRACTOR_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKohaiContractorCd(String kohaiContractorCd) {
        registerModifiedProperty("kohaiContractorCd");
        _kohaiContractorCd = kohaiContractorCd;
    }

    /**
     * [get] KOHAI_CONTRACTOR_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'KOHAI_CONTRACTOR_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getKohaiContractorNm() {
        checkSpecifiedProperty("kohaiContractorNm");
        return convertEmptyToNull(_kohaiContractorNm);
    }

    /**
     * [set] KOHAI_CONTRACTOR_NM: {VARCHAR(60)} <br>
     * @param kohaiContractorNm The value of the column 'KOHAI_CONTRACTOR_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKohaiContractorNm(String kohaiContractorNm) {
        registerModifiedProperty("kohaiContractorNm");
        _kohaiContractorNm = kohaiContractorNm;
    }

    /**
     * [get] SHIPPING_DT: {VARCHAR(8)} <br>
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingDt() {
        checkSpecifiedProperty("shippingDt");
        return convertEmptyToNull(_shippingDt);
    }

    /**
     * [set] SHIPPING_DT: {VARCHAR(8)} <br>
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingDt(String shippingDt) {
        registerModifiedProperty("shippingDt");
        _shippingDt = shippingDt;
    }

    /**
     * [get] WORK_DT: {VARCHAR(8), refers to t_shipping_inst_h.WORK_DT} <br>
     * 作業日
     * @return The value of the column 'WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] WORK_DT: {VARCHAR(8), refers to t_shipping_inst_h.WORK_DT} <br>
     * 作業日
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
    }

    /**
     * [get] SHIPPING_FIXED_DT: {VARCHAR(8), refers to t_picking_h.SHIPPING_FIXED_DT} <br>
     * 出荷確定日
     * @return The value of the column 'SHIPPING_FIXED_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingFixedDt() {
        checkSpecifiedProperty("shippingFixedDt");
        return convertEmptyToNull(_shippingFixedDt);
    }

    /**
     * [set] SHIPPING_FIXED_DT: {VARCHAR(8), refers to t_picking_h.SHIPPING_FIXED_DT} <br>
     * 出荷確定日
     * @param shippingFixedDt The value of the column 'SHIPPING_FIXED_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingFixedDt(String shippingFixedDt) {
        registerModifiedProperty("shippingFixedDt");
        _shippingFixedDt = shippingFixedDt;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientShippingNo() {
        checkSpecifiedProperty("clientShippingNo");
        return convertEmptyToNull(_clientShippingNo);
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {VARCHAR(30)} <br>
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientShippingNo(String clientShippingNo) {
        registerModifiedProperty("clientShippingNo");
        _clientShippingNo = clientShippingNo;
    }

    /**
     * [get] PROCESS_TYPE_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'PROCESS_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProcessTypeCd() {
        checkSpecifiedProperty("processTypeCd");
        return convertEmptyToNull(_processTypeCd);
    }

    /**
     * [set] PROCESS_TYPE_CD: {VARCHAR(30)} <br>
     * @param processTypeCd The value of the column 'PROCESS_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessTypeCd(String processTypeCd) {
        registerModifiedProperty("processTypeCd");
        _processTypeCd = processTypeCd;
    }

    /**
     * [get] PROCESS_TYPE_NM: {VARCHAR(100)} <br>
     * @return The value of the column 'PROCESS_TYPE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProcessTypeNm() {
        checkSpecifiedProperty("processTypeNm");
        return convertEmptyToNull(_processTypeNm);
    }

    /**
     * [set] PROCESS_TYPE_NM: {VARCHAR(100)} <br>
     * @param processTypeNm The value of the column 'PROCESS_TYPE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessTypeNm(String processTypeNm) {
        registerModifiedProperty("processTypeNm");
        _processTypeNm = processTypeNm;
    }

    /**
     * [get] SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'SHIPPING_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingTypeCd() {
        checkSpecifiedProperty("shippingTypeCd");
        return convertEmptyToNull(_shippingTypeCd);
    }

    /**
     * [set] SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * @param shippingTypeCd The value of the column 'SHIPPING_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingTypeCd(String shippingTypeCd) {
        registerModifiedProperty("shippingTypeCd");
        _shippingTypeCd = shippingTypeCd;
    }

    /**
     * [get] SHIPPING_TYPE_NM: {NULL} <br>
     * @return The value of the column 'SHIPPING_TYPE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingTypeNm() {
        checkSpecifiedProperty("shippingTypeNm");
        return convertEmptyToNull(_shippingTypeNm);
    }

    /**
     * [set] SHIPPING_TYPE_NM: {NULL} <br>
     * @param shippingTypeNm The value of the column 'SHIPPING_TYPE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingTypeNm(String shippingTypeNm) {
        registerModifiedProperty("shippingTypeNm");
        _shippingTypeNm = shippingTypeNm;
    }

    /**
     * [get] SLIP_CNT: {BIGINT(21)} <br>
     * @return The value of the column 'SLIP_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSlipCnt() {
        checkSpecifiedProperty("slipCnt");
        return _slipCnt;
    }

    /**
     * [set] SLIP_CNT: {BIGINT(21)} <br>
     * @param slipCnt The value of the column 'SLIP_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipCnt(Long slipCnt) {
        registerModifiedProperty("slipCnt");
        _slipCnt = slipCnt;
    }

    /**
     * [get] LINE_CNT: {BIGINT(21)} <br>
     * @return The value of the column 'LINE_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLineCnt() {
        checkSpecifiedProperty("lineCnt");
        return _lineCnt;
    }

    /**
     * [set] LINE_CNT: {BIGINT(21)} <br>
     * @param lineCnt The value of the column 'LINE_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineCnt(Long lineCnt) {
        registerModifiedProperty("lineCnt");
        _lineCnt = lineCnt;
    }

    /**
     * [get] ITEM_CNT: {BIGINT(21)} <br>
     * @return The value of the column 'ITEM_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getItemCnt() {
        checkSpecifiedProperty("itemCnt");
        return _itemCnt;
    }

    /**
     * [set] ITEM_CNT: {BIGINT(21)} <br>
     * @param itemCnt The value of the column 'ITEM_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemCnt(Long itemCnt) {
        registerModifiedProperty("itemCnt");
        _itemCnt = itemCnt;
    }

    /**
     * [get] INST_NUM: {DECIMAL(36, 4)} <br>
     * @return The value of the column 'INST_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInstNum() {
        checkSpecifiedProperty("instNum");
        return _instNum;
    }

    /**
     * [set] INST_NUM: {DECIMAL(36, 4)} <br>
     * @param instNum The value of the column 'INST_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInstNum(java.math.BigDecimal instNum) {
        registerModifiedProperty("instNum");
        _instNum = instNum;
    }

    /**
     * [get] PACKING_NUM: {DECIMAL(36, 4)} <br>
     * @return The value of the column 'PACKING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum() {
        checkSpecifiedProperty("packingNum");
        return _packingNum;
    }

    /**
     * [set] PACKING_NUM: {DECIMAL(36, 4)} <br>
     * @param packingNum The value of the column 'PACKING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum(java.math.BigDecimal packingNum) {
        registerModifiedProperty("packingNum");
        _packingNum = packingNum;
    }

    /**
     * [get] NIZOROE_OUT_FLG: {VARCHAR(1)} <br>
     * @return The value of the column 'NIZOROE_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getNizoroeOutFlg() {
        checkSpecifiedProperty("nizoroeOutFlg");
        return convertEmptyToNull(_nizoroeOutFlg);
    }

    /**
     * [set] NIZOROE_OUT_FLG: {VARCHAR(1)} <br>
     * @param nizoroeOutFlg The value of the column 'NIZOROE_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNizoroeOutFlg(String nizoroeOutFlg) {
        registerModifiedProperty("nizoroeOutFlg");
        _nizoroeOutFlg = nizoroeOutFlg;
    }

    /**
     * [get] NIZOROE_OUT_NM: {NULL} <br>
     * @return The value of the column 'NIZOROE_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getNizoroeOutNm() {
        checkSpecifiedProperty("nizoroeOutNm");
        return convertEmptyToNull(_nizoroeOutNm);
    }

    /**
     * [set] NIZOROE_OUT_NM: {NULL} <br>
     * @param nizoroeOutNm The value of the column 'NIZOROE_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNizoroeOutNm(String nizoroeOutNm) {
        registerModifiedProperty("nizoroeOutNm");
        _nizoroeOutNm = nizoroeOutNm;
    }

    /**
     * [get] NIZOROE_OUT_DT: {DATETIME(23)} <br>
     * @return The value of the column 'NIZOROE_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getNizoroeOutDt() {
        checkSpecifiedProperty("nizoroeOutDt");
        return _nizoroeOutDt;
    }

    /**
     * [set] NIZOROE_OUT_DT: {DATETIME(23)} <br>
     * @param nizoroeOutDt The value of the column 'NIZOROE_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNizoroeOutDt(java.sql.Timestamp nizoroeOutDt) {
        registerModifiedProperty("nizoroeOutDt");
        _nizoroeOutDt = nizoroeOutDt;
    }

    /**
     * [get] TAG_OUT_FLG: {VARCHAR(1)} <br>
     * @return The value of the column 'TAG_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTagOutFlg() {
        checkSpecifiedProperty("tagOutFlg");
        return convertEmptyToNull(_tagOutFlg);
    }

    /**
     * [set] TAG_OUT_FLG: {VARCHAR(1)} <br>
     * @param tagOutFlg The value of the column 'TAG_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagOutFlg(String tagOutFlg) {
        registerModifiedProperty("tagOutFlg");
        _tagOutFlg = tagOutFlg;
    }

    /**
     * [get] TAG_OUT_NM: {NULL} <br>
     * @return The value of the column 'TAG_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getTagOutNm() {
        checkSpecifiedProperty("tagOutNm");
        return convertEmptyToNull(_tagOutNm);
    }

    /**
     * [set] TAG_OUT_NM: {NULL} <br>
     * @param tagOutNm The value of the column 'TAG_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagOutNm(String tagOutNm) {
        registerModifiedProperty("tagOutNm");
        _tagOutNm = tagOutNm;
    }

    /**
     * [get] TAG_OUT_DT: {DATETIME(23)} <br>
     * @return The value of the column 'TAG_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTagOutDt() {
        checkSpecifiedProperty("tagOutDt");
        return _tagOutDt;
    }

    /**
     * [set] TAG_OUT_DT: {DATETIME(23)} <br>
     * @param tagOutDt The value of the column 'TAG_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagOutDt(java.sql.Timestamp tagOutDt) {
        registerModifiedProperty("tagOutDt");
        _tagOutDt = tagOutDt;
    }

    /**
     * [get] DELIV_OUT_FLG: {VARCHAR(1)} <br>
     * @return The value of the column 'DELIV_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivOutFlg() {
        checkSpecifiedProperty("delivOutFlg");
        return convertEmptyToNull(_delivOutFlg);
    }

    /**
     * [set] DELIV_OUT_FLG: {VARCHAR(1)} <br>
     * @param delivOutFlg The value of the column 'DELIV_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivOutFlg(String delivOutFlg) {
        registerModifiedProperty("delivOutFlg");
        _delivOutFlg = delivOutFlg;
    }

    /**
     * [get] DELIV_OUT_NM: {NULL} <br>
     * @return The value of the column 'DELIV_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivOutNm() {
        checkSpecifiedProperty("delivOutNm");
        return convertEmptyToNull(_delivOutNm);
    }

    /**
     * [set] DELIV_OUT_NM: {NULL} <br>
     * @param delivOutNm The value of the column 'DELIV_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivOutNm(String delivOutNm) {
        registerModifiedProperty("delivOutNm");
        _delivOutNm = delivOutNm;
    }

    /**
     * [get] DELIV_OUT_DT: {DATETIME(23)} <br>
     * @return The value of the column 'DELIV_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getDelivOutDt() {
        checkSpecifiedProperty("delivOutDt");
        return _delivOutDt;
    }

    /**
     * [set] DELIV_OUT_DT: {DATETIME(23)} <br>
     * @param delivOutDt The value of the column 'DELIV_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivOutDt(java.sql.Timestamp delivOutDt) {
        registerModifiedProperty("delivOutDt");
        _delivOutDt = delivOutDt;
    }

    /**
     * [get] PLL_OUT_FLG: {VARCHAR(1)} <br>
     * @return The value of the column 'PLL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPllOutFlg() {
        checkSpecifiedProperty("pllOutFlg");
        return convertEmptyToNull(_pllOutFlg);
    }

    /**
     * [set] PLL_OUT_FLG: {VARCHAR(1)} <br>
     * @param pllOutFlg The value of the column 'PLL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPllOutFlg(String pllOutFlg) {
        registerModifiedProperty("pllOutFlg");
        _pllOutFlg = pllOutFlg;
    }

    /**
     * [get] PLL_OUT_NM: {NULL} <br>
     * @return The value of the column 'PLL_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPllOutNm() {
        checkSpecifiedProperty("pllOutNm");
        return convertEmptyToNull(_pllOutNm);
    }

    /**
     * [set] PLL_OUT_NM: {NULL} <br>
     * @param pllOutNm The value of the column 'PLL_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPllOutNm(String pllOutNm) {
        registerModifiedProperty("pllOutNm");
        _pllOutNm = pllOutNm;
    }

    /**
     * [get] PLL_OUT_DT: {DATETIME(23)} <br>
     * @return The value of the column 'PLL_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getPllOutDt() {
        checkSpecifiedProperty("pllOutDt");
        return _pllOutDt;
    }

    /**
     * [set] PLL_OUT_DT: {DATETIME(23)} <br>
     * @param pllOutDt The value of the column 'PLL_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPllOutDt(java.sql.Timestamp pllOutDt) {
        registerModifiedProperty("pllOutDt");
        _pllOutDt = pllOutDt;
    }

    /**
     * [get] INDV_SUPPLY_OUT_FLG: {VARCHAR(1)} <br>
     * @return The value of the column 'INDV_SUPPLY_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getIndvSupplyOutFlg() {
        checkSpecifiedProperty("indvSupplyOutFlg");
        return convertEmptyToNull(_indvSupplyOutFlg);
    }

    /**
     * [set] INDV_SUPPLY_OUT_FLG: {VARCHAR(1)} <br>
     * @param indvSupplyOutFlg The value of the column 'INDV_SUPPLY_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIndvSupplyOutFlg(String indvSupplyOutFlg) {
        registerModifiedProperty("indvSupplyOutFlg");
        _indvSupplyOutFlg = indvSupplyOutFlg;
    }

    /**
     * [get] INDV_SUPPLY_OUT_NM: {NULL} <br>
     * @return The value of the column 'INDV_SUPPLY_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getIndvSupplyOutNm() {
        checkSpecifiedProperty("indvSupplyOutNm");
        return convertEmptyToNull(_indvSupplyOutNm);
    }

    /**
     * [set] INDV_SUPPLY_OUT_NM: {NULL} <br>
     * @param indvSupplyOutNm The value of the column 'INDV_SUPPLY_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIndvSupplyOutNm(String indvSupplyOutNm) {
        registerModifiedProperty("indvSupplyOutNm");
        _indvSupplyOutNm = indvSupplyOutNm;
    }

    /**
     * [get] INDV_SUPPLY_OUT_DT: {DATETIME(23)} <br>
     * @return The value of the column 'INDV_SUPPLY_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getIndvSupplyOutDt() {
        checkSpecifiedProperty("indvSupplyOutDt");
        return _indvSupplyOutDt;
    }

    /**
     * [set] INDV_SUPPLY_OUT_DT: {DATETIME(23)} <br>
     * @param indvSupplyOutDt The value of the column 'INDV_SUPPLY_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIndvSupplyOutDt(java.sql.Timestamp indvSupplyOutDt) {
        registerModifiedProperty("indvSupplyOutDt");
        _indvSupplyOutDt = indvSupplyOutDt;
    }

    /**
     * [get] INDV_LABEL_OUT_FLG: {VARCHAR(1)} <br>
     * @return The value of the column 'INDV_LABEL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getIndvLabelOutFlg() {
        checkSpecifiedProperty("indvLabelOutFlg");
        return convertEmptyToNull(_indvLabelOutFlg);
    }

    /**
     * [set] INDV_LABEL_OUT_FLG: {VARCHAR(1)} <br>
     * @param indvLabelOutFlg The value of the column 'INDV_LABEL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIndvLabelOutFlg(String indvLabelOutFlg) {
        registerModifiedProperty("indvLabelOutFlg");
        _indvLabelOutFlg = indvLabelOutFlg;
    }

    /**
     * [get] INDV_LABEL_OUT_NM: {NULL} <br>
     * @return The value of the column 'INDV_LABEL_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getIndvLabelOutNm() {
        checkSpecifiedProperty("indvLabelOutNm");
        return convertEmptyToNull(_indvLabelOutNm);
    }

    /**
     * [set] INDV_LABEL_OUT_NM: {NULL} <br>
     * @param indvLabelOutNm The value of the column 'INDV_LABEL_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIndvLabelOutNm(String indvLabelOutNm) {
        registerModifiedProperty("indvLabelOutNm");
        _indvLabelOutNm = indvLabelOutNm;
    }

    /**
     * [get] INDV_LABEL_OUT_DT: {DATETIME(23)} <br>
     * @return The value of the column 'INDV_LABEL_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getIndvLabelOutDt() {
        checkSpecifiedProperty("indvLabelOutDt");
        return _indvLabelOutDt;
    }

    /**
     * [set] INDV_LABEL_OUT_DT: {DATETIME(23)} <br>
     * @param indvLabelOutDt The value of the column 'INDV_LABEL_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIndvLabelOutDt(java.sql.Timestamp indvLabelOutDt) {
        registerModifiedProperty("indvLabelOutDt");
        _indvLabelOutDt = indvLabelOutDt;
    }

    /**
     * [get] CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} <br>
     * センタCD
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} <br>
     * センタCD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterNm() {
        checkSpecifiedProperty("centerNm");
        return convertEmptyToNull(_centerNm);
    }

    /**
     * [set] CENTER_NM: {VARCHAR(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterNm(String centerNm) {
        registerModifiedProperty("centerNm");
        _centerNm = centerNm;
    }

    /**
     * [get] EMERGENCY_FLG: {CHAR(1)} <br>
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmergencyFlg() {
        checkSpecifiedProperty("emergencyFlg");
        return convertEmptyToNull(_emergencyFlg);
    }

    /**
     * [set] EMERGENCY_FLG: {CHAR(1)} <br>
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        registerModifiedProperty("emergencyFlg");
        _emergencyFlg = emergencyFlg;
    }

    /**
     * [get] PICKING_STATUS_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'PICKING_STATUS_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingStatusCd() {
        checkSpecifiedProperty("pickingStatusCd");
        return convertEmptyToNull(_pickingStatusCd);
    }

    /**
     * [set] PICKING_STATUS_CD: {VARCHAR(30)} <br>
     * @param pickingStatusCd The value of the column 'PICKING_STATUS_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingStatusCd(String pickingStatusCd) {
        registerModifiedProperty("pickingStatusCd");
        _pickingStatusCd = pickingStatusCd;
    }

    /**
     * [get] ID_MANAG_PRINT_TYPE_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'ID_MANAG_PRINT_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getIdManagPrintTypeCd() {
        checkSpecifiedProperty("idManagPrintTypeCd");
        return convertEmptyToNull(_idManagPrintTypeCd);
    }

    /**
     * [set] ID_MANAG_PRINT_TYPE_CD: {VARCHAR(30)} <br>
     * @param idManagPrintTypeCd The value of the column 'ID_MANAG_PRINT_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIdManagPrintTypeCd(String idManagPrintTypeCd) {
        registerModifiedProperty("idManagPrintTypeCd");
        _idManagPrintTypeCd = idManagPrintTypeCd;
    }
}
