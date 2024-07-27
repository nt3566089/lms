package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlTagLabelYamato. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     ARRIVAL_STORE_CD, DELIV_TEL_NO, DELIV_ZIP_CD, DELIV_ADDRESS, DELIV_CUSTOMER_NM, SLIP_CLIENT_TEL_NO, SLIP_CLIENT_ZIP_CD, SLIP_CLIENT_ADDRESS, SLIP_CLIENT_NM, CARRIER_TRACE_NUM, WORK_DT, DELIV_DT, DELIV_TZ, SLIP_ITEM_NM, BOX_NO, BOX_NO_SUM, ARTICLE, BOX_SIZE_CD, SEND_CD, NIZOROE_NO, TRACKING_NO, DELIV_TEL_NO_H, DELIV_ZIP_CD_H, DELIV_ADDRESS_H, DELIV_CUSTOMER_NM_H, SLIP_CLIENT_TEL_NO_H, SLIP_CLIENT_ZIP_CD_H, SLIP_CLIENT_ADDRESS_H, SLIP_CLIENT_NM_H, CARRIER_TRACE_NUM_H, WORK_DT_H, DELIV_DT_H, DELIV_TZ_H, SLIP_ITEM_NM_H, ARTICLE_H, SEND_CD_H, TRACKING_NO_H, BOX_NO_H, BOX_NO_H_SUM, DELIVERY_COURSE_NM
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
 * String arrivalStoreCd = entity.getArrivalStoreCd();
 * String delivTelNo = entity.getDelivTelNo();
 * String delivZipCd = entity.getDelivZipCd();
 * String delivAddress = entity.getDelivAddress();
 * String delivCustomerNm = entity.getDelivCustomerNm();
 * String slipClientTelNo = entity.getSlipClientTelNo();
 * String slipClientZipCd = entity.getSlipClientZipCd();
 * String slipClientAddress = entity.getSlipClientAddress();
 * String slipClientNm = entity.getSlipClientNm();
 * String carrierTraceNum = entity.getCarrierTraceNum();
 * String workDt = entity.getWorkDt();
 * String delivDt = entity.getDelivDt();
 * String delivTz = entity.getDelivTz();
 * String slipItemNm = entity.getSlipItemNm();
 * String boxNo = entity.getBoxNo();
 * String boxNoSum = entity.getBoxNoSum();
 * String article = entity.getArticle();
 * String boxSizeCd = entity.getBoxSizeCd();
 * String sendCd = entity.getSendCd();
 * String nizoroeNo = entity.getNizoroeNo();
 * String trackingNo = entity.getTrackingNo();
 * String delivTelNoH = entity.getDelivTelNoH();
 * String delivZipCdH = entity.getDelivZipCdH();
 * String delivAddressH = entity.getDelivAddressH();
 * String delivCustomerNmH = entity.getDelivCustomerNmH();
 * String slipClientTelNoH = entity.getSlipClientTelNoH();
 * String slipClientZipCdH = entity.getSlipClientZipCdH();
 * String slipClientAddressH = entity.getSlipClientAddressH();
 * String slipClientNmH = entity.getSlipClientNmH();
 * String carrierTraceNumH = entity.getCarrierTraceNumH();
 * String workDtH = entity.getWorkDtH();
 * String delivDtH = entity.getDelivDtH();
 * String delivTzH = entity.getDelivTzH();
 * String slipItemNmH = entity.getSlipItemNmH();
 * String articleH = entity.getArticleH();
 * String sendCdH = entity.getSendCdH();
 * String trackingNoH = entity.getTrackingNoH();
 * String boxNoH = entity.getBoxNoH();
 * String boxNoHSum = entity.getBoxNoHSum();
 * String deliveryCourseNm = entity.getDeliveryCourseNm();
 * entity.setArrivalStoreCd(arrivalStoreCd);
 * entity.setDelivTelNo(delivTelNo);
 * entity.setDelivZipCd(delivZipCd);
 * entity.setDelivAddress(delivAddress);
 * entity.setDelivCustomerNm(delivCustomerNm);
 * entity.setSlipClientTelNo(slipClientTelNo);
 * entity.setSlipClientZipCd(slipClientZipCd);
 * entity.setSlipClientAddress(slipClientAddress);
 * entity.setSlipClientNm(slipClientNm);
 * entity.setCarrierTraceNum(carrierTraceNum);
 * entity.setWorkDt(workDt);
 * entity.setDelivDt(delivDt);
 * entity.setDelivTz(delivTz);
 * entity.setSlipItemNm(slipItemNm);
 * entity.setBoxNo(boxNo);
 * entity.setBoxNoSum(boxNoSum);
 * entity.setArticle(article);
 * entity.setBoxSizeCd(boxSizeCd);
 * entity.setSendCd(sendCd);
 * entity.setNizoroeNo(nizoroeNo);
 * entity.setTrackingNo(trackingNo);
 * entity.setDelivTelNoH(delivTelNoH);
 * entity.setDelivZipCdH(delivZipCdH);
 * entity.setDelivAddressH(delivAddressH);
 * entity.setDelivCustomerNmH(delivCustomerNmH);
 * entity.setSlipClientTelNoH(slipClientTelNoH);
 * entity.setSlipClientZipCdH(slipClientZipCdH);
 * entity.setSlipClientAddressH(slipClientAddressH);
 * entity.setSlipClientNmH(slipClientNmH);
 * entity.setCarrierTraceNumH(carrierTraceNumH);
 * entity.setWorkDtH(workDtH);
 * entity.setDelivDtH(delivDtH);
 * entity.setDelivTzH(delivTzH);
 * entity.setSlipItemNmH(slipItemNmH);
 * entity.setArticleH(articleH);
 * entity.setSendCdH(sendCdH);
 * entity.setTrackingNoH(trackingNoH);
 * entity.setBoxNoH(boxNoH);
 * entity.setBoxNoHSum(boxNoHSum);
 * entity.setDeliveryCourseNm(deliveryCourseNm);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlTagLabelYamato extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ARRIVAL_STORE_CD: {VARCHAR(30)} */
    protected String _arrivalStoreCd;

    /** DELIV_TEL_NO: {VARCHAR(255)} */
    protected String _delivTelNo;

    /** DELIV_ZIP_CD: {VARCHAR(30)} */
    protected String _delivZipCd;

    /** DELIV_ADDRESS: {VARCHAR(510)} */
    protected String _delivAddress;

    /** DELIV_CUSTOMER_NM: {VARCHAR(510)} */
    protected String _delivCustomerNm;

    /** SLIP_CLIENT_TEL_NO: {VARCHAR(30)} */
    protected String _slipClientTelNo;

    /** SLIP_CLIENT_ZIP_CD: {VARCHAR(30)} */
    protected String _slipClientZipCd;

    /** SLIP_CLIENT_ADDRESS: {VARCHAR(240)} */
    protected String _slipClientAddress;

    /** SLIP_CLIENT_NM: {VARCHAR(60)} */
    protected String _slipClientNm;

    /** CARRIER_TRACE_NUM: {VARCHAR(30)} */
    protected String _carrierTraceNum;

    /** WORK_DT: {VARCHAR(8)} */
    protected String _workDt;

    /** DELIV_DT: {VARCHAR(8)} */
    protected String _delivDt;

    /** DELIV_TZ: {VARCHAR(30)} */
    protected String _delivTz;

    /** SLIP_ITEM_NM: {VARCHAR(180)} */
    protected String _slipItemNm;

    /** BOX_NO: {VARCHAR(30)} */
    protected String _boxNo;

    /** BOX_NO_SUM: {VARCHAR(30)} */
    protected String _boxNoSum;

    /** ARTICLE: {VARCHAR(255)} */
    protected String _article;

    /** BOX_SIZE_CD: {VARCHAR(30)} */
    protected String _boxSizeCd;

    /** SEND_CD: {VARCHAR(30)} */
    protected String _sendCd;

    /** NIZOROE_NO: {VARCHAR(30)} */
    protected String _nizoroeNo;

    /** TRACKING_NO: {VARCHAR(30)} */
    protected String _trackingNo;

    /** DELIV_TEL_NO_H: {VARCHAR(255)} */
    protected String _delivTelNoH;

    /** DELIV_ZIP_CD_H: {VARCHAR(30)} */
    protected String _delivZipCdH;

    /** DELIV_ADDRESS_H: {VARCHAR(510)} */
    protected String _delivAddressH;

    /** DELIV_CUSTOMER_NM_H: {VARCHAR(510)} */
    protected String _delivCustomerNmH;

    /** SLIP_CLIENT_TEL_NO_H: {VARCHAR(30)} */
    protected String _slipClientTelNoH;

    /** SLIP_CLIENT_ZIP_CD_H: {VARCHAR(30)} */
    protected String _slipClientZipCdH;

    /** SLIP_CLIENT_ADDRESS_H: {VARCHAR(240)} */
    protected String _slipClientAddressH;

    /** SLIP_CLIENT_NM_H: {VARCHAR(60)} */
    protected String _slipClientNmH;

    /** CARRIER_TRACE_NUM_H: {VARCHAR(30)} */
    protected String _carrierTraceNumH;

    /** WORK_DT_H: {VARCHAR(8)} */
    protected String _workDtH;

    /** DELIV_DT_H: {VARCHAR(8)} */
    protected String _delivDtH;

    /** DELIV_TZ_H: {VARCHAR(30)} */
    protected String _delivTzH;

    /** SLIP_ITEM_NM_H: {VARCHAR(180)} */
    protected String _slipItemNmH;

    /** ARTICLE_H: {VARCHAR(255)} */
    protected String _articleH;

    /** SEND_CD_H: {VARCHAR(30)} */
    protected String _sendCdH;

    /** TRACKING_NO_H: {VARCHAR(30)} */
    protected String _trackingNoH;

    /** BOX_NO_H: {VARCHAR(30)} */
    protected String _boxNoH;

    /** BOX_NO_H_SUM: {VARCHAR(30)} */
    protected String _boxNoHSum;

    /** DELIVERY_COURSE_NM: {VARCHAR(60), refers to m_delivery_course.DELIVERY_COURSE_NM} */
    protected String _deliveryCourseNm;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlTagLabelYamatoDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlTagLabelYamato";
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
        if (obj instanceof BsSqlTagLabelYamato) {
            BsSqlTagLabelYamato other = (BsSqlTagLabelYamato)obj;
            if (!xSV(_arrivalStoreCd, other._arrivalStoreCd)) { return false; }
            if (!xSV(_delivTelNo, other._delivTelNo)) { return false; }
            if (!xSV(_delivZipCd, other._delivZipCd)) { return false; }
            if (!xSV(_delivAddress, other._delivAddress)) { return false; }
            if (!xSV(_delivCustomerNm, other._delivCustomerNm)) { return false; }
            if (!xSV(_slipClientTelNo, other._slipClientTelNo)) { return false; }
            if (!xSV(_slipClientZipCd, other._slipClientZipCd)) { return false; }
            if (!xSV(_slipClientAddress, other._slipClientAddress)) { return false; }
            if (!xSV(_slipClientNm, other._slipClientNm)) { return false; }
            if (!xSV(_carrierTraceNum, other._carrierTraceNum)) { return false; }
            if (!xSV(_workDt, other._workDt)) { return false; }
            if (!xSV(_delivDt, other._delivDt)) { return false; }
            if (!xSV(_delivTz, other._delivTz)) { return false; }
            if (!xSV(_slipItemNm, other._slipItemNm)) { return false; }
            if (!xSV(_boxNo, other._boxNo)) { return false; }
            if (!xSV(_boxNoSum, other._boxNoSum)) { return false; }
            if (!xSV(_article, other._article)) { return false; }
            if (!xSV(_boxSizeCd, other._boxSizeCd)) { return false; }
            if (!xSV(_sendCd, other._sendCd)) { return false; }
            if (!xSV(_nizoroeNo, other._nizoroeNo)) { return false; }
            if (!xSV(_trackingNo, other._trackingNo)) { return false; }
            if (!xSV(_delivTelNoH, other._delivTelNoH)) { return false; }
            if (!xSV(_delivZipCdH, other._delivZipCdH)) { return false; }
            if (!xSV(_delivAddressH, other._delivAddressH)) { return false; }
            if (!xSV(_delivCustomerNmH, other._delivCustomerNmH)) { return false; }
            if (!xSV(_slipClientTelNoH, other._slipClientTelNoH)) { return false; }
            if (!xSV(_slipClientZipCdH, other._slipClientZipCdH)) { return false; }
            if (!xSV(_slipClientAddressH, other._slipClientAddressH)) { return false; }
            if (!xSV(_slipClientNmH, other._slipClientNmH)) { return false; }
            if (!xSV(_carrierTraceNumH, other._carrierTraceNumH)) { return false; }
            if (!xSV(_workDtH, other._workDtH)) { return false; }
            if (!xSV(_delivDtH, other._delivDtH)) { return false; }
            if (!xSV(_delivTzH, other._delivTzH)) { return false; }
            if (!xSV(_slipItemNmH, other._slipItemNmH)) { return false; }
            if (!xSV(_articleH, other._articleH)) { return false; }
            if (!xSV(_sendCdH, other._sendCdH)) { return false; }
            if (!xSV(_trackingNoH, other._trackingNoH)) { return false; }
            if (!xSV(_boxNoH, other._boxNoH)) { return false; }
            if (!xSV(_boxNoHSum, other._boxNoHSum)) { return false; }
            if (!xSV(_deliveryCourseNm, other._deliveryCourseNm)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _arrivalStoreCd);
        hs = xCH(hs, _delivTelNo);
        hs = xCH(hs, _delivZipCd);
        hs = xCH(hs, _delivAddress);
        hs = xCH(hs, _delivCustomerNm);
        hs = xCH(hs, _slipClientTelNo);
        hs = xCH(hs, _slipClientZipCd);
        hs = xCH(hs, _slipClientAddress);
        hs = xCH(hs, _slipClientNm);
        hs = xCH(hs, _carrierTraceNum);
        hs = xCH(hs, _workDt);
        hs = xCH(hs, _delivDt);
        hs = xCH(hs, _delivTz);
        hs = xCH(hs, _slipItemNm);
        hs = xCH(hs, _boxNo);
        hs = xCH(hs, _boxNoSum);
        hs = xCH(hs, _article);
        hs = xCH(hs, _boxSizeCd);
        hs = xCH(hs, _sendCd);
        hs = xCH(hs, _nizoroeNo);
        hs = xCH(hs, _trackingNo);
        hs = xCH(hs, _delivTelNoH);
        hs = xCH(hs, _delivZipCdH);
        hs = xCH(hs, _delivAddressH);
        hs = xCH(hs, _delivCustomerNmH);
        hs = xCH(hs, _slipClientTelNoH);
        hs = xCH(hs, _slipClientZipCdH);
        hs = xCH(hs, _slipClientAddressH);
        hs = xCH(hs, _slipClientNmH);
        hs = xCH(hs, _carrierTraceNumH);
        hs = xCH(hs, _workDtH);
        hs = xCH(hs, _delivDtH);
        hs = xCH(hs, _delivTzH);
        hs = xCH(hs, _slipItemNmH);
        hs = xCH(hs, _articleH);
        hs = xCH(hs, _sendCdH);
        hs = xCH(hs, _trackingNoH);
        hs = xCH(hs, _boxNoH);
        hs = xCH(hs, _boxNoHSum);
        hs = xCH(hs, _deliveryCourseNm);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_arrivalStoreCd));
        sb.append(dm).append(xfND(_delivTelNo));
        sb.append(dm).append(xfND(_delivZipCd));
        sb.append(dm).append(xfND(_delivAddress));
        sb.append(dm).append(xfND(_delivCustomerNm));
        sb.append(dm).append(xfND(_slipClientTelNo));
        sb.append(dm).append(xfND(_slipClientZipCd));
        sb.append(dm).append(xfND(_slipClientAddress));
        sb.append(dm).append(xfND(_slipClientNm));
        sb.append(dm).append(xfND(_carrierTraceNum));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_delivDt));
        sb.append(dm).append(xfND(_delivTz));
        sb.append(dm).append(xfND(_slipItemNm));
        sb.append(dm).append(xfND(_boxNo));
        sb.append(dm).append(xfND(_boxNoSum));
        sb.append(dm).append(xfND(_article));
        sb.append(dm).append(xfND(_boxSizeCd));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_nizoroeNo));
        sb.append(dm).append(xfND(_trackingNo));
        sb.append(dm).append(xfND(_delivTelNoH));
        sb.append(dm).append(xfND(_delivZipCdH));
        sb.append(dm).append(xfND(_delivAddressH));
        sb.append(dm).append(xfND(_delivCustomerNmH));
        sb.append(dm).append(xfND(_slipClientTelNoH));
        sb.append(dm).append(xfND(_slipClientZipCdH));
        sb.append(dm).append(xfND(_slipClientAddressH));
        sb.append(dm).append(xfND(_slipClientNmH));
        sb.append(dm).append(xfND(_carrierTraceNumH));
        sb.append(dm).append(xfND(_workDtH));
        sb.append(dm).append(xfND(_delivDtH));
        sb.append(dm).append(xfND(_delivTzH));
        sb.append(dm).append(xfND(_slipItemNmH));
        sb.append(dm).append(xfND(_articleH));
        sb.append(dm).append(xfND(_sendCdH));
        sb.append(dm).append(xfND(_trackingNoH));
        sb.append(dm).append(xfND(_boxNoH));
        sb.append(dm).append(xfND(_boxNoHSum));
        sb.append(dm).append(xfND(_deliveryCourseNm));
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
    public SqlTagLabelYamato clone() {
        return (SqlTagLabelYamato)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] DELIV_ZIP_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'DELIV_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivZipCd() {
        checkSpecifiedProperty("delivZipCd");
        return convertEmptyToNull(_delivZipCd);
    }

    /**
     * [set] DELIV_ZIP_CD: {VARCHAR(30)} <br>
     * @param delivZipCd The value of the column 'DELIV_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivZipCd(String delivZipCd) {
        registerModifiedProperty("delivZipCd");
        _delivZipCd = delivZipCd;
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
     * [get] SLIP_CLIENT_ZIP_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'SLIP_CLIENT_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientZipCd() {
        checkSpecifiedProperty("slipClientZipCd");
        return convertEmptyToNull(_slipClientZipCd);
    }

    /**
     * [set] SLIP_CLIENT_ZIP_CD: {VARCHAR(30)} <br>
     * @param slipClientZipCd The value of the column 'SLIP_CLIENT_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientZipCd(String slipClientZipCd) {
        registerModifiedProperty("slipClientZipCd");
        _slipClientZipCd = slipClientZipCd;
    }

    /**
     * [get] SLIP_CLIENT_ADDRESS: {VARCHAR(240)} <br>
     * @return The value of the column 'SLIP_CLIENT_ADDRESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientAddress() {
        checkSpecifiedProperty("slipClientAddress");
        return convertEmptyToNull(_slipClientAddress);
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS: {VARCHAR(240)} <br>
     * @param slipClientAddress The value of the column 'SLIP_CLIENT_ADDRESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientAddress(String slipClientAddress) {
        registerModifiedProperty("slipClientAddress");
        _slipClientAddress = slipClientAddress;
    }

    /**
     * [get] SLIP_CLIENT_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'SLIP_CLIENT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientNm() {
        checkSpecifiedProperty("slipClientNm");
        return convertEmptyToNull(_slipClientNm);
    }

    /**
     * [set] SLIP_CLIENT_NM: {VARCHAR(60)} <br>
     * @param slipClientNm The value of the column 'SLIP_CLIENT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientNm(String slipClientNm) {
        registerModifiedProperty("slipClientNm");
        _slipClientNm = slipClientNm;
    }

    /**
     * [get] CARRIER_TRACE_NUM: {VARCHAR(30)} <br>
     * @return The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierTraceNum() {
        checkSpecifiedProperty("carrierTraceNum");
        return convertEmptyToNull(_carrierTraceNum);
    }

    /**
     * [set] CARRIER_TRACE_NUM: {VARCHAR(30)} <br>
     * @param carrierTraceNum The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierTraceNum(String carrierTraceNum) {
        registerModifiedProperty("carrierTraceNum");
        _carrierTraceNum = carrierTraceNum;
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
     * [get] SLIP_ITEM_NM: {VARCHAR(180)} <br>
     * @return The value of the column 'SLIP_ITEM_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemNm() {
        checkSpecifiedProperty("slipItemNm");
        return convertEmptyToNull(_slipItemNm);
    }

    /**
     * [set] SLIP_ITEM_NM: {VARCHAR(180)} <br>
     * @param slipItemNm The value of the column 'SLIP_ITEM_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemNm(String slipItemNm) {
        registerModifiedProperty("slipItemNm");
        _slipItemNm = slipItemNm;
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
     * [get] ARTICLE: {VARCHAR(255)} <br>
     * @return The value of the column 'ARTICLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getArticle() {
        checkSpecifiedProperty("article");
        return convertEmptyToNull(_article);
    }

    /**
     * [set] ARTICLE: {VARCHAR(255)} <br>
     * @param article The value of the column 'ARTICLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArticle(String article) {
        registerModifiedProperty("article");
        _article = article;
    }

    /**
     * [get] BOX_SIZE_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'BOX_SIZE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxSizeCd() {
        checkSpecifiedProperty("boxSizeCd");
        return convertEmptyToNull(_boxSizeCd);
    }

    /**
     * [set] BOX_SIZE_CD: {VARCHAR(30)} <br>
     * @param boxSizeCd The value of the column 'BOX_SIZE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxSizeCd(String boxSizeCd) {
        registerModifiedProperty("boxSizeCd");
        _boxSizeCd = boxSizeCd;
    }

    /**
     * [get] SEND_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'SEND_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSendCd() {
        checkSpecifiedProperty("sendCd");
        return convertEmptyToNull(_sendCd);
    }

    /**
     * [set] SEND_CD: {VARCHAR(30)} <br>
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSendCd(String sendCd) {
        registerModifiedProperty("sendCd");
        _sendCd = sendCd;
    }

    /**
     * [get] NIZOROE_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'NIZOROE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getNizoroeNo() {
        checkSpecifiedProperty("nizoroeNo");
        return convertEmptyToNull(_nizoroeNo);
    }

    /**
     * [set] NIZOROE_NO: {VARCHAR(30)} <br>
     * @param nizoroeNo The value of the column 'NIZOROE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNizoroeNo(String nizoroeNo) {
        registerModifiedProperty("nizoroeNo");
        _nizoroeNo = nizoroeNo;
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
     * [get] DELIV_TEL_NO_H: {VARCHAR(255)} <br>
     * @return The value of the column 'DELIV_TEL_NO_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTelNoH() {
        checkSpecifiedProperty("delivTelNoH");
        return convertEmptyToNull(_delivTelNoH);
    }

    /**
     * [set] DELIV_TEL_NO_H: {VARCHAR(255)} <br>
     * @param delivTelNoH The value of the column 'DELIV_TEL_NO_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTelNoH(String delivTelNoH) {
        registerModifiedProperty("delivTelNoH");
        _delivTelNoH = delivTelNoH;
    }

    /**
     * [get] DELIV_ZIP_CD_H: {VARCHAR(30)} <br>
     * @return The value of the column 'DELIV_ZIP_CD_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivZipCdH() {
        checkSpecifiedProperty("delivZipCdH");
        return convertEmptyToNull(_delivZipCdH);
    }

    /**
     * [set] DELIV_ZIP_CD_H: {VARCHAR(30)} <br>
     * @param delivZipCdH The value of the column 'DELIV_ZIP_CD_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivZipCdH(String delivZipCdH) {
        registerModifiedProperty("delivZipCdH");
        _delivZipCdH = delivZipCdH;
    }

    /**
     * [get] DELIV_ADDRESS_H: {VARCHAR(510)} <br>
     * @return The value of the column 'DELIV_ADDRESS_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddressH() {
        checkSpecifiedProperty("delivAddressH");
        return convertEmptyToNull(_delivAddressH);
    }

    /**
     * [set] DELIV_ADDRESS_H: {VARCHAR(510)} <br>
     * @param delivAddressH The value of the column 'DELIV_ADDRESS_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddressH(String delivAddressH) {
        registerModifiedProperty("delivAddressH");
        _delivAddressH = delivAddressH;
    }

    /**
     * [get] DELIV_CUSTOMER_NM_H: {VARCHAR(510)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_NM_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNmH() {
        checkSpecifiedProperty("delivCustomerNmH");
        return convertEmptyToNull(_delivCustomerNmH);
    }

    /**
     * [set] DELIV_CUSTOMER_NM_H: {VARCHAR(510)} <br>
     * @param delivCustomerNmH The value of the column 'DELIV_CUSTOMER_NM_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNmH(String delivCustomerNmH) {
        registerModifiedProperty("delivCustomerNmH");
        _delivCustomerNmH = delivCustomerNmH;
    }

    /**
     * [get] SLIP_CLIENT_TEL_NO_H: {VARCHAR(30)} <br>
     * @return The value of the column 'SLIP_CLIENT_TEL_NO_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientTelNoH() {
        checkSpecifiedProperty("slipClientTelNoH");
        return convertEmptyToNull(_slipClientTelNoH);
    }

    /**
     * [set] SLIP_CLIENT_TEL_NO_H: {VARCHAR(30)} <br>
     * @param slipClientTelNoH The value of the column 'SLIP_CLIENT_TEL_NO_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientTelNoH(String slipClientTelNoH) {
        registerModifiedProperty("slipClientTelNoH");
        _slipClientTelNoH = slipClientTelNoH;
    }

    /**
     * [get] SLIP_CLIENT_ZIP_CD_H: {VARCHAR(30)} <br>
     * @return The value of the column 'SLIP_CLIENT_ZIP_CD_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientZipCdH() {
        checkSpecifiedProperty("slipClientZipCdH");
        return convertEmptyToNull(_slipClientZipCdH);
    }

    /**
     * [set] SLIP_CLIENT_ZIP_CD_H: {VARCHAR(30)} <br>
     * @param slipClientZipCdH The value of the column 'SLIP_CLIENT_ZIP_CD_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientZipCdH(String slipClientZipCdH) {
        registerModifiedProperty("slipClientZipCdH");
        _slipClientZipCdH = slipClientZipCdH;
    }

    /**
     * [get] SLIP_CLIENT_ADDRESS_H: {VARCHAR(240)} <br>
     * @return The value of the column 'SLIP_CLIENT_ADDRESS_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientAddressH() {
        checkSpecifiedProperty("slipClientAddressH");
        return convertEmptyToNull(_slipClientAddressH);
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS_H: {VARCHAR(240)} <br>
     * @param slipClientAddressH The value of the column 'SLIP_CLIENT_ADDRESS_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientAddressH(String slipClientAddressH) {
        registerModifiedProperty("slipClientAddressH");
        _slipClientAddressH = slipClientAddressH;
    }

    /**
     * [get] SLIP_CLIENT_NM_H: {VARCHAR(60)} <br>
     * @return The value of the column 'SLIP_CLIENT_NM_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientNmH() {
        checkSpecifiedProperty("slipClientNmH");
        return convertEmptyToNull(_slipClientNmH);
    }

    /**
     * [set] SLIP_CLIENT_NM_H: {VARCHAR(60)} <br>
     * @param slipClientNmH The value of the column 'SLIP_CLIENT_NM_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientNmH(String slipClientNmH) {
        registerModifiedProperty("slipClientNmH");
        _slipClientNmH = slipClientNmH;
    }

    /**
     * [get] CARRIER_TRACE_NUM_H: {VARCHAR(30)} <br>
     * @return The value of the column 'CARRIER_TRACE_NUM_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierTraceNumH() {
        checkSpecifiedProperty("carrierTraceNumH");
        return convertEmptyToNull(_carrierTraceNumH);
    }

    /**
     * [set] CARRIER_TRACE_NUM_H: {VARCHAR(30)} <br>
     * @param carrierTraceNumH The value of the column 'CARRIER_TRACE_NUM_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierTraceNumH(String carrierTraceNumH) {
        registerModifiedProperty("carrierTraceNumH");
        _carrierTraceNumH = carrierTraceNumH;
    }

    /**
     * [get] WORK_DT_H: {VARCHAR(8)} <br>
     * @return The value of the column 'WORK_DT_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDtH() {
        checkSpecifiedProperty("workDtH");
        return convertEmptyToNull(_workDtH);
    }

    /**
     * [set] WORK_DT_H: {VARCHAR(8)} <br>
     * @param workDtH The value of the column 'WORK_DT_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDtH(String workDtH) {
        registerModifiedProperty("workDtH");
        _workDtH = workDtH;
    }

    /**
     * [get] DELIV_DT_H: {VARCHAR(8)} <br>
     * @return The value of the column 'DELIV_DT_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivDtH() {
        checkSpecifiedProperty("delivDtH");
        return convertEmptyToNull(_delivDtH);
    }

    /**
     * [set] DELIV_DT_H: {VARCHAR(8)} <br>
     * @param delivDtH The value of the column 'DELIV_DT_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivDtH(String delivDtH) {
        registerModifiedProperty("delivDtH");
        _delivDtH = delivDtH;
    }

    /**
     * [get] DELIV_TZ_H: {VARCHAR(30)} <br>
     * @return The value of the column 'DELIV_TZ_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTzH() {
        checkSpecifiedProperty("delivTzH");
        return convertEmptyToNull(_delivTzH);
    }

    /**
     * [set] DELIV_TZ_H: {VARCHAR(30)} <br>
     * @param delivTzH The value of the column 'DELIV_TZ_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTzH(String delivTzH) {
        registerModifiedProperty("delivTzH");
        _delivTzH = delivTzH;
    }

    /**
     * [get] SLIP_ITEM_NM_H: {VARCHAR(180)} <br>
     * @return The value of the column 'SLIP_ITEM_NM_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemNmH() {
        checkSpecifiedProperty("slipItemNmH");
        return convertEmptyToNull(_slipItemNmH);
    }

    /**
     * [set] SLIP_ITEM_NM_H: {VARCHAR(180)} <br>
     * @param slipItemNmH The value of the column 'SLIP_ITEM_NM_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemNmH(String slipItemNmH) {
        registerModifiedProperty("slipItemNmH");
        _slipItemNmH = slipItemNmH;
    }

    /**
     * [get] ARTICLE_H: {VARCHAR(255)} <br>
     * @return The value of the column 'ARTICLE_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getArticleH() {
        checkSpecifiedProperty("articleH");
        return convertEmptyToNull(_articleH);
    }

    /**
     * [set] ARTICLE_H: {VARCHAR(255)} <br>
     * @param articleH The value of the column 'ARTICLE_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArticleH(String articleH) {
        registerModifiedProperty("articleH");
        _articleH = articleH;
    }

    /**
     * [get] SEND_CD_H: {VARCHAR(30)} <br>
     * @return The value of the column 'SEND_CD_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getSendCdH() {
        checkSpecifiedProperty("sendCdH");
        return convertEmptyToNull(_sendCdH);
    }

    /**
     * [set] SEND_CD_H: {VARCHAR(30)} <br>
     * @param sendCdH The value of the column 'SEND_CD_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSendCdH(String sendCdH) {
        registerModifiedProperty("sendCdH");
        _sendCdH = sendCdH;
    }

    /**
     * [get] TRACKING_NO_H: {VARCHAR(30)} <br>
     * @return The value of the column 'TRACKING_NO_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getTrackingNoH() {
        checkSpecifiedProperty("trackingNoH");
        return convertEmptyToNull(_trackingNoH);
    }

    /**
     * [set] TRACKING_NO_H: {VARCHAR(30)} <br>
     * @param trackingNoH The value of the column 'TRACKING_NO_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrackingNoH(String trackingNoH) {
        registerModifiedProperty("trackingNoH");
        _trackingNoH = trackingNoH;
    }

    /**
     * [get] BOX_NO_H: {VARCHAR(30)} <br>
     * @return The value of the column 'BOX_NO_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxNoH() {
        checkSpecifiedProperty("boxNoH");
        return convertEmptyToNull(_boxNoH);
    }

    /**
     * [set] BOX_NO_H: {VARCHAR(30)} <br>
     * @param boxNoH The value of the column 'BOX_NO_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxNoH(String boxNoH) {
        registerModifiedProperty("boxNoH");
        _boxNoH = boxNoH;
    }

    /**
     * [get] BOX_NO_H_SUM: {VARCHAR(30)} <br>
     * @return The value of the column 'BOX_NO_H_SUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxNoHSum() {
        checkSpecifiedProperty("boxNoHSum");
        return convertEmptyToNull(_boxNoHSum);
    }

    /**
     * [set] BOX_NO_H_SUM: {VARCHAR(30)} <br>
     * @param boxNoHSum The value of the column 'BOX_NO_H_SUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxNoHSum(String boxNoHSum) {
        registerModifiedProperty("boxNoHSum");
        _boxNoHSum = boxNoHSum;
    }

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
}
