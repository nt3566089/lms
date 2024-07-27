package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlTagLabelCommon. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     DELIVERY_COURSE_NM, ARRIVAL_STORE_CD, TRACKING_NO, SLIP_CLIENT_ADDRESS, SLIP_CLIENT_NM, SLIP_CLIENT_TEL_NO, SALES_ORG_CD, SALES_ORG_TEL, WORK_DT, DELIV_ADDRESS, DELIV_CUSTOMER_NM, SHIPPING_TYPE_CD, DEPARTMENT, DELIV_TEL_NO, INVOICE_SUMMARY, TSIH_NIZOROE_NO, BOX_NO, BOX_NO_SUM, TPIH_NIZOROE_NO, DELIV_DT, DELIV_TZ, COD_FEE, TAG_OUT_FLG, LANE_CD
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
 * String deliveryCourseNm = entity.getDeliveryCourseNm();
 * String arrivalStoreCd = entity.getArrivalStoreCd();
 * String trackingNo = entity.getTrackingNo();
 * String slipClientAddress = entity.getSlipClientAddress();
 * String slipClientNm = entity.getSlipClientNm();
 * String slipClientTelNo = entity.getSlipClientTelNo();
 * String salesOrgCd = entity.getSalesOrgCd();
 * String salesOrgTel = entity.getSalesOrgTel();
 * String workDt = entity.getWorkDt();
 * String delivAddress = entity.getDelivAddress();
 * String delivCustomerNm = entity.getDelivCustomerNm();
 * String shippingTypeCd = entity.getShippingTypeCd();
 * String department = entity.getDepartment();
 * String delivTelNo = entity.getDelivTelNo();
 * String invoiceSummary = entity.getInvoiceSummary();
 * String tsihNizoroeNo = entity.getTsihNizoroeNo();
 * String boxNo = entity.getBoxNo();
 * String boxNoSum = entity.getBoxNoSum();
 * String tpihNizoroeNo = entity.getTpihNizoroeNo();
 * String delivDt = entity.getDelivDt();
 * String delivTz = entity.getDelivTz();
 * Long codFee = entity.getCodFee();
 * String tagOutFlg = entity.getTagOutFlg();
 * String laneCd = entity.getLaneCd();
 * entity.setDeliveryCourseNm(deliveryCourseNm);
 * entity.setArrivalStoreCd(arrivalStoreCd);
 * entity.setTrackingNo(trackingNo);
 * entity.setSlipClientAddress(slipClientAddress);
 * entity.setSlipClientNm(slipClientNm);
 * entity.setSlipClientTelNo(slipClientTelNo);
 * entity.setSalesOrgCd(salesOrgCd);
 * entity.setSalesOrgTel(salesOrgTel);
 * entity.setWorkDt(workDt);
 * entity.setDelivAddress(delivAddress);
 * entity.setDelivCustomerNm(delivCustomerNm);
 * entity.setShippingTypeCd(shippingTypeCd);
 * entity.setDepartment(department);
 * entity.setDelivTelNo(delivTelNo);
 * entity.setInvoiceSummary(invoiceSummary);
 * entity.setTsihNizoroeNo(tsihNizoroeNo);
 * entity.setBoxNo(boxNo);
 * entity.setBoxNoSum(boxNoSum);
 * entity.setTpihNizoroeNo(tpihNizoroeNo);
 * entity.setDelivDt(delivDt);
 * entity.setDelivTz(delivTz);
 * entity.setCodFee(codFee);
 * entity.setTagOutFlg(tagOutFlg);
 * entity.setLaneCd(laneCd);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlTagLabelCommon extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DELIVERY_COURSE_NM: {VARCHAR(60), refers to m_delivery_course.DELIVERY_COURSE_NM} */
    protected String _deliveryCourseNm;

    /** ARRIVAL_STORE_CD: {VARCHAR(30)} */
    protected String _arrivalStoreCd;

    /** TRACKING_NO: {VARCHAR(30)} */
    protected String _trackingNo;

    /** SLIP_CLIENT_ADDRESS: {VARCHAR(510)} */
    protected String _slipClientAddress;

    /** SLIP_CLIENT_NM: {VARCHAR(510)} */
    protected String _slipClientNm;

    /** SLIP_CLIENT_TEL_NO: {VARCHAR(30)} */
    protected String _slipClientTelNo;

    /** SALES_ORG_CD: {VARCHAR(120)} */
    protected String _salesOrgCd;

    /** SALES_ORG_TEL: {VARCHAR(30)} */
    protected String _salesOrgTel;

    /** WORK_DT: {VARCHAR(8)} */
    protected String _workDt;

    /** DELIV_ADDRESS: {VARCHAR(510)} */
    protected String _delivAddress;

    /** DELIV_CUSTOMER_NM: {VARCHAR(510)} */
    protected String _delivCustomerNm;

    /** SHIPPING_TYPE_CD: {VARCHAR(30)} */
    protected String _shippingTypeCd;

    /** DEPARTMENT: {VARCHAR(30)} */
    protected String _department;

    /** DELIV_TEL_NO: {VARCHAR(255)} */
    protected String _delivTelNo;

    /** INVOICE_SUMMARY: {VARCHAR(60)} */
    protected String _invoiceSummary;

    /** TSIH_NIZOROE_NO: {VARCHAR(30)} */
    protected String _tsihNizoroeNo;

    /** BOX_NO: {VARCHAR(30)} */
    protected String _boxNo;

    /** BOX_NO_SUM: {VARCHAR(30)} */
    protected String _boxNoSum;

    /** TPIH_NIZOROE_NO: {VARCHAR(30)} */
    protected String _tpihNizoroeNo;

    /** DELIV_DT: {VARCHAR(8)} */
    protected String _delivDt;

    /** DELIV_TZ: {VARCHAR(30)} */
    protected String _delivTz;

    /** COD_FEE: {BIGINT(20)} */
    protected Long _codFee;

    /** TAG_OUT_FLG: {CHAR(1)} */
    protected String _tagOutFlg;

    /** LANE_CD: {VARCHAR(30)} */
    protected String _laneCd;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlTagLabelCommonDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlTagLabelCommon";
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
        if (obj instanceof BsSqlTagLabelCommon) {
            BsSqlTagLabelCommon other = (BsSqlTagLabelCommon)obj;
            if (!xSV(_deliveryCourseNm, other._deliveryCourseNm)) { return false; }
            if (!xSV(_arrivalStoreCd, other._arrivalStoreCd)) { return false; }
            if (!xSV(_trackingNo, other._trackingNo)) { return false; }
            if (!xSV(_slipClientAddress, other._slipClientAddress)) { return false; }
            if (!xSV(_slipClientNm, other._slipClientNm)) { return false; }
            if (!xSV(_slipClientTelNo, other._slipClientTelNo)) { return false; }
            if (!xSV(_salesOrgCd, other._salesOrgCd)) { return false; }
            if (!xSV(_salesOrgTel, other._salesOrgTel)) { return false; }
            if (!xSV(_workDt, other._workDt)) { return false; }
            if (!xSV(_delivAddress, other._delivAddress)) { return false; }
            if (!xSV(_delivCustomerNm, other._delivCustomerNm)) { return false; }
            if (!xSV(_shippingTypeCd, other._shippingTypeCd)) { return false; }
            if (!xSV(_department, other._department)) { return false; }
            if (!xSV(_delivTelNo, other._delivTelNo)) { return false; }
            if (!xSV(_invoiceSummary, other._invoiceSummary)) { return false; }
            if (!xSV(_tsihNizoroeNo, other._tsihNizoroeNo)) { return false; }
            if (!xSV(_boxNo, other._boxNo)) { return false; }
            if (!xSV(_boxNoSum, other._boxNoSum)) { return false; }
            if (!xSV(_tpihNizoroeNo, other._tpihNizoroeNo)) { return false; }
            if (!xSV(_delivDt, other._delivDt)) { return false; }
            if (!xSV(_delivTz, other._delivTz)) { return false; }
            if (!xSV(_codFee, other._codFee)) { return false; }
            if (!xSV(_tagOutFlg, other._tagOutFlg)) { return false; }
            if (!xSV(_laneCd, other._laneCd)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _deliveryCourseNm);
        hs = xCH(hs, _arrivalStoreCd);
        hs = xCH(hs, _trackingNo);
        hs = xCH(hs, _slipClientAddress);
        hs = xCH(hs, _slipClientNm);
        hs = xCH(hs, _slipClientTelNo);
        hs = xCH(hs, _salesOrgCd);
        hs = xCH(hs, _salesOrgTel);
        hs = xCH(hs, _workDt);
        hs = xCH(hs, _delivAddress);
        hs = xCH(hs, _delivCustomerNm);
        hs = xCH(hs, _shippingTypeCd);
        hs = xCH(hs, _department);
        hs = xCH(hs, _delivTelNo);
        hs = xCH(hs, _invoiceSummary);
        hs = xCH(hs, _tsihNizoroeNo);
        hs = xCH(hs, _boxNo);
        hs = xCH(hs, _boxNoSum);
        hs = xCH(hs, _tpihNizoroeNo);
        hs = xCH(hs, _delivDt);
        hs = xCH(hs, _delivTz);
        hs = xCH(hs, _codFee);
        hs = xCH(hs, _tagOutFlg);
        hs = xCH(hs, _laneCd);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_deliveryCourseNm));
        sb.append(dm).append(xfND(_arrivalStoreCd));
        sb.append(dm).append(xfND(_trackingNo));
        sb.append(dm).append(xfND(_slipClientAddress));
        sb.append(dm).append(xfND(_slipClientNm));
        sb.append(dm).append(xfND(_slipClientTelNo));
        sb.append(dm).append(xfND(_salesOrgCd));
        sb.append(dm).append(xfND(_salesOrgTel));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_delivAddress));
        sb.append(dm).append(xfND(_delivCustomerNm));
        sb.append(dm).append(xfND(_shippingTypeCd));
        sb.append(dm).append(xfND(_department));
        sb.append(dm).append(xfND(_delivTelNo));
        sb.append(dm).append(xfND(_invoiceSummary));
        sb.append(dm).append(xfND(_tsihNizoroeNo));
        sb.append(dm).append(xfND(_boxNo));
        sb.append(dm).append(xfND(_boxNoSum));
        sb.append(dm).append(xfND(_tpihNizoroeNo));
        sb.append(dm).append(xfND(_delivDt));
        sb.append(dm).append(xfND(_delivTz));
        sb.append(dm).append(xfND(_codFee));
        sb.append(dm).append(xfND(_tagOutFlg));
        sb.append(dm).append(xfND(_laneCd));
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
    public SqlTagLabelCommon clone() {
        return (SqlTagLabelCommon)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DELIVERY_COURSE_NM: {VARCHAR(60), refers to m_delivery_course.DELIVERY_COURSE_NM} <br>
     * 配送コース名称
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseNm() {
        checkSpecifiedProperty("deliveryCourseNm");
        return convertEmptyToNull(_deliveryCourseNm);
    }

    /**
     * [set] DELIVERY_COURSE_NM: {VARCHAR(60), refers to m_delivery_course.DELIVERY_COURSE_NM} <br>
     * 配送コース名称
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        registerModifiedProperty("deliveryCourseNm");
        _deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] ARRIVAL_STORE_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'ARRIVAL_STORE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getArrivalStoreCd() {
        checkSpecifiedProperty("arrivalStoreCd");
        return convertEmptyToNull(_arrivalStoreCd);
    }

    /**
     * [set] ARRIVAL_STORE_CD: {VARCHAR(30)} <br>
     * @param arrivalStoreCd The value of the column 'ARRIVAL_STORE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArrivalStoreCd(String arrivalStoreCd) {
        registerModifiedProperty("arrivalStoreCd");
        _arrivalStoreCd = arrivalStoreCd;
    }

    /**
     * [get] TRACKING_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'TRACKING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTrackingNo() {
        checkSpecifiedProperty("trackingNo");
        return convertEmptyToNull(_trackingNo);
    }

    /**
     * [set] TRACKING_NO: {VARCHAR(30)} <br>
     * @param trackingNo The value of the column 'TRACKING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrackingNo(String trackingNo) {
        registerModifiedProperty("trackingNo");
        _trackingNo = trackingNo;
    }

    /**
     * [get] SLIP_CLIENT_ADDRESS: {VARCHAR(510)} <br>
     * @return The value of the column 'SLIP_CLIENT_ADDRESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientAddress() {
        checkSpecifiedProperty("slipClientAddress");
        return convertEmptyToNull(_slipClientAddress);
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS: {VARCHAR(510)} <br>
     * @param slipClientAddress The value of the column 'SLIP_CLIENT_ADDRESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientAddress(String slipClientAddress) {
        registerModifiedProperty("slipClientAddress");
        _slipClientAddress = slipClientAddress;
    }

    /**
     * [get] SLIP_CLIENT_NM: {VARCHAR(510)} <br>
     * @return The value of the column 'SLIP_CLIENT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientNm() {
        checkSpecifiedProperty("slipClientNm");
        return convertEmptyToNull(_slipClientNm);
    }

    /**
     * [set] SLIP_CLIENT_NM: {VARCHAR(510)} <br>
     * @param slipClientNm The value of the column 'SLIP_CLIENT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientNm(String slipClientNm) {
        registerModifiedProperty("slipClientNm");
        _slipClientNm = slipClientNm;
    }

    /**
     * [get] SLIP_CLIENT_TEL_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'SLIP_CLIENT_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientTelNo() {
        checkSpecifiedProperty("slipClientTelNo");
        return convertEmptyToNull(_slipClientTelNo);
    }

    /**
     * [set] SLIP_CLIENT_TEL_NO: {VARCHAR(30)} <br>
     * @param slipClientTelNo The value of the column 'SLIP_CLIENT_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientTelNo(String slipClientTelNo) {
        registerModifiedProperty("slipClientTelNo");
        _slipClientTelNo = slipClientTelNo;
    }

    /**
     * [get] SALES_ORG_CD: {VARCHAR(120)} <br>
     * @return The value of the column 'SALES_ORG_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrgCd() {
        checkSpecifiedProperty("salesOrgCd");
        return convertEmptyToNull(_salesOrgCd);
    }

    /**
     * [set] SALES_ORG_CD: {VARCHAR(120)} <br>
     * @param salesOrgCd The value of the column 'SALES_ORG_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgCd(String salesOrgCd) {
        registerModifiedProperty("salesOrgCd");
        _salesOrgCd = salesOrgCd;
    }

    /**
     * [get] SALES_ORG_TEL: {VARCHAR(30)} <br>
     * @return The value of the column 'SALES_ORG_TEL'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrgTel() {
        checkSpecifiedProperty("salesOrgTel");
        return convertEmptyToNull(_salesOrgTel);
    }

    /**
     * [set] SALES_ORG_TEL: {VARCHAR(30)} <br>
     * @param salesOrgTel The value of the column 'SALES_ORG_TEL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgTel(String salesOrgTel) {
        registerModifiedProperty("salesOrgTel");
        _salesOrgTel = salesOrgTel;
    }

    /**
     * [get] WORK_DT: {VARCHAR(8)} <br>
     * @return The value of the column 'WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] WORK_DT: {VARCHAR(8)} <br>
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
    }

    /**
     * [get] DELIV_ADDRESS: {VARCHAR(510)} <br>
     * @return The value of the column 'DELIV_ADDRESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress() {
        checkSpecifiedProperty("delivAddress");
        return convertEmptyToNull(_delivAddress);
    }

    /**
     * [set] DELIV_ADDRESS: {VARCHAR(510)} <br>
     * @param delivAddress The value of the column 'DELIV_ADDRESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress(String delivAddress) {
        registerModifiedProperty("delivAddress");
        _delivAddress = delivAddress;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {VARCHAR(510)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNm() {
        checkSpecifiedProperty("delivCustomerNm");
        return convertEmptyToNull(_delivCustomerNm);
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {VARCHAR(510)} <br>
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        registerModifiedProperty("delivCustomerNm");
        _delivCustomerNm = delivCustomerNm;
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
     * [get] DEPARTMENT: {VARCHAR(30)} <br>
     * @return The value of the column 'DEPARTMENT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepartment() {
        checkSpecifiedProperty("department");
        return convertEmptyToNull(_department);
    }

    /**
     * [set] DEPARTMENT: {VARCHAR(30)} <br>
     * @param department The value of the column 'DEPARTMENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepartment(String department) {
        registerModifiedProperty("department");
        _department = department;
    }

    /**
     * [get] DELIV_TEL_NO: {VARCHAR(255)} <br>
     * @return The value of the column 'DELIV_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTelNo() {
        checkSpecifiedProperty("delivTelNo");
        return convertEmptyToNull(_delivTelNo);
    }

    /**
     * [set] DELIV_TEL_NO: {VARCHAR(255)} <br>
     * @param delivTelNo The value of the column 'DELIV_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTelNo(String delivTelNo) {
        registerModifiedProperty("delivTelNo");
        _delivTelNo = delivTelNo;
    }

    /**
     * [get] INVOICE_SUMMARY: {VARCHAR(60)} <br>
     * @return The value of the column 'INVOICE_SUMMARY'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvoiceSummary() {
        checkSpecifiedProperty("invoiceSummary");
        return convertEmptyToNull(_invoiceSummary);
    }

    /**
     * [set] INVOICE_SUMMARY: {VARCHAR(60)} <br>
     * @param invoiceSummary The value of the column 'INVOICE_SUMMARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceSummary(String invoiceSummary) {
        registerModifiedProperty("invoiceSummary");
        _invoiceSummary = invoiceSummary;
    }

    /**
     * [get] TSIH_NIZOROE_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'TSIH_NIZOROE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTsihNizoroeNo() {
        checkSpecifiedProperty("tsihNizoroeNo");
        return convertEmptyToNull(_tsihNizoroeNo);
    }

    /**
     * [set] TSIH_NIZOROE_NO: {VARCHAR(30)} <br>
     * @param tsihNizoroeNo The value of the column 'TSIH_NIZOROE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTsihNizoroeNo(String tsihNizoroeNo) {
        registerModifiedProperty("tsihNizoroeNo");
        _tsihNizoroeNo = tsihNizoroeNo;
    }

    /**
     * [get] BOX_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'BOX_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxNo() {
        checkSpecifiedProperty("boxNo");
        return convertEmptyToNull(_boxNo);
    }

    /**
     * [set] BOX_NO: {VARCHAR(30)} <br>
     * @param boxNo The value of the column 'BOX_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxNo(String boxNo) {
        registerModifiedProperty("boxNo");
        _boxNo = boxNo;
    }

    /**
     * [get] BOX_NO_SUM: {VARCHAR(30)} <br>
     * @return The value of the column 'BOX_NO_SUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxNoSum() {
        checkSpecifiedProperty("boxNoSum");
        return convertEmptyToNull(_boxNoSum);
    }

    /**
     * [set] BOX_NO_SUM: {VARCHAR(30)} <br>
     * @param boxNoSum The value of the column 'BOX_NO_SUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxNoSum(String boxNoSum) {
        registerModifiedProperty("boxNoSum");
        _boxNoSum = boxNoSum;
    }

    /**
     * [get] TPIH_NIZOROE_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'TPIH_NIZOROE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTpihNizoroeNo() {
        checkSpecifiedProperty("tpihNizoroeNo");
        return convertEmptyToNull(_tpihNizoroeNo);
    }

    /**
     * [set] TPIH_NIZOROE_NO: {VARCHAR(30)} <br>
     * @param tpihNizoroeNo The value of the column 'TPIH_NIZOROE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTpihNizoroeNo(String tpihNizoroeNo) {
        registerModifiedProperty("tpihNizoroeNo");
        _tpihNizoroeNo = tpihNizoroeNo;
    }

    /**
     * [get] DELIV_DT: {VARCHAR(8)} <br>
     * @return The value of the column 'DELIV_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivDt() {
        checkSpecifiedProperty("delivDt");
        return convertEmptyToNull(_delivDt);
    }

    /**
     * [set] DELIV_DT: {VARCHAR(8)} <br>
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivDt(String delivDt) {
        registerModifiedProperty("delivDt");
        _delivDt = delivDt;
    }

    /**
     * [get] DELIV_TZ: {VARCHAR(30)} <br>
     * @return The value of the column 'DELIV_TZ'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTz() {
        checkSpecifiedProperty("delivTz");
        return convertEmptyToNull(_delivTz);
    }

    /**
     * [set] DELIV_TZ: {VARCHAR(30)} <br>
     * @param delivTz The value of the column 'DELIV_TZ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTz(String delivTz) {
        registerModifiedProperty("delivTz");
        _delivTz = delivTz;
    }

    /**
     * [get] COD_FEE: {BIGINT(20)} <br>
     * @return The value of the column 'COD_FEE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCodFee() {
        checkSpecifiedProperty("codFee");
        return _codFee;
    }

    /**
     * [set] COD_FEE: {BIGINT(20)} <br>
     * @param codFee The value of the column 'COD_FEE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodFee(Long codFee) {
        registerModifiedProperty("codFee");
        _codFee = codFee;
    }

    /**
     * [get] TAG_OUT_FLG: {CHAR(1)} <br>
     * @return The value of the column 'TAG_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTagOutFlg() {
        checkSpecifiedProperty("tagOutFlg");
        return convertEmptyToNull(_tagOutFlg);
    }

    /**
     * [set] TAG_OUT_FLG: {CHAR(1)} <br>
     * @param tagOutFlg The value of the column 'TAG_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagOutFlg(String tagOutFlg) {
        registerModifiedProperty("tagOutFlg");
        _tagOutFlg = tagOutFlg;
    }

    /**
     * [get] LANE_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'LANE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLaneCd() {
        checkSpecifiedProperty("laneCd");
        return convertEmptyToNull(_laneCd);
    }

    /**
     * [set] LANE_CD: {VARCHAR(30)} <br>
     * @param laneCd The value of the column 'LANE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLaneCd(String laneCd) {
        registerModifiedProperty("laneCd");
        _laneCd = laneCd;
    }
}
