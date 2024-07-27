package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of es_sales_org as TABLE. <br>
 * 販売組織マスタ送信テーブル
 * <pre>
 * [primary-key]
 *     SALES_ORG_ID
 *
 * [column]
 *     SALES_ORG_ID, SEND_FLG, SALES_ORG_CD, PURCHASE_ORG_CD, TENHANSHA_CD, TENHANSHA_NM1, TENHANSHA_NM2, TENHANSHA_ZIP_CD, TENHANSHA_PREFECTURE, TENHANSHA_ADDRESS1, TENHANSHA_ADDRESS2, TENHANSHA_TEL_NO, TENHANSHA_FAX_NO, PLANT_NORMAL, PLANT_DEPOSIT, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsEsSalesOrgDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** SALES_ORG_ID: {PK, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _salesOrgId;

    /** SEND_FLG: {NotNull, CHAR(1), default=[0]} */
    @JsonKey
    protected String _sendFlg;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrgCd;

    /** PURCHASE_ORG_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _purchaseOrgCd;

    /** TENHANSHA_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _tenhanshaCd;

    /** TENHANSHA_NM1: {VARCHAR(60)} */
    @JsonKey
    protected String _tenhanshaNm1;

    /** TENHANSHA_NM2: {VARCHAR(60)} */
    @JsonKey
    protected String _tenhanshaNm2;

    /** TENHANSHA_ZIP_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _tenhanshaZipCd;

    /** TENHANSHA_PREFECTURE: {VARCHAR(30)} */
    @JsonKey
    protected String _tenhanshaPrefecture;

    /** TENHANSHA_ADDRESS1: {VARCHAR(60)} */
    @JsonKey
    protected String _tenhanshaAddress1;

    /** TENHANSHA_ADDRESS2: {VARCHAR(60)} */
    @JsonKey
    protected String _tenhanshaAddress2;

    /** TENHANSHA_TEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _tenhanshaTelNo;

    /** TENHANSHA_FAX_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _tenhanshaFaxNo;

    /** PLANT_NORMAL: {VARCHAR(30)} */
    @JsonKey
    protected String _plantNormal;

    /** PLANT_DEPOSIT: {VARCHAR(30)} */
    @JsonKey
    protected String _plantDeposit;

    /** SAP_ADD_YYYY: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddYyyy;

    /** SAP_ADD_MM: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddMm;

    /** SAP_ADD_DD: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddDd;

    /** SAP_ADD_HH: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddHh;

    /** SAP_ADD_MI: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddMi;

    /** SAP_ADD_SS: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddSs;

    /** SAP_ADD_USER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddUserCd;

    /** SAP_UPD_YYYY: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdYyyy;

    /** SAP_UPD_MM: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdMm;

    /** SAP_UPD_DD: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdDd;

    /** SAP_UPD_HH: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdHh;

    /** SAP_UPD_MI: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdMi;

    /** SAP_UPD_SS: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdSs;

    /** SAP_UPD_USER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdUserCd;

    /** SPARE_STR: {VARCHAR(255)} */
    @JsonKey
    protected String _spareStr;

    /** DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, BIGINT(19), default=[0]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {IX, BIGINT(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {VARCHAR(60)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {VARCHAR(255)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {VARCHAR(60)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {VARCHAR(255)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEsSalesOrgDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsEsSalesOrgDto)) { return false; }
        final BsEsSalesOrgDto otherEntity = (BsEsSalesOrgDto)other;
        if (!helpComparingValue(getSalesOrgId(), otherEntity.getSalesOrgId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "es_sales_org");
        result = xCH(result, getSalesOrgId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getSalesOrgId());
        sb.append(c).append(getSendFlg());
        sb.append(c).append(getSalesOrgCd());
        sb.append(c).append(getPurchaseOrgCd());
        sb.append(c).append(getTenhanshaCd());
        sb.append(c).append(getTenhanshaNm1());
        sb.append(c).append(getTenhanshaNm2());
        sb.append(c).append(getTenhanshaZipCd());
        sb.append(c).append(getTenhanshaPrefecture());
        sb.append(c).append(getTenhanshaAddress1());
        sb.append(c).append(getTenhanshaAddress2());
        sb.append(c).append(getTenhanshaTelNo());
        sb.append(c).append(getTenhanshaFaxNo());
        sb.append(c).append(getPlantNormal());
        sb.append(c).append(getPlantDeposit());
        sb.append(c).append(getSapAddYyyy());
        sb.append(c).append(getSapAddMm());
        sb.append(c).append(getSapAddDd());
        sb.append(c).append(getSapAddHh());
        sb.append(c).append(getSapAddMi());
        sb.append(c).append(getSapAddSs());
        sb.append(c).append(getSapAddUserCd());
        sb.append(c).append(getSapUpdYyyy());
        sb.append(c).append(getSapUpdMm());
        sb.append(c).append(getSapUpdDd());
        sb.append(c).append(getSapUpdHh());
        sb.append(c).append(getSapUpdMi());
        sb.append(c).append(getSapUpdSs());
        sb.append(c).append(getSapUpdUserCd());
        sb.append(c).append(getSpareStr());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SALES_ORG_ID: {PK, NotNull, BIGINT(19)} <br>
     * 販売組織マスタ送信ID
     * @return The value of the column 'SALES_ORG_ID'. (NullAllowed)
     */
    public Long getSalesOrgId() {
        return _salesOrgId;
    }

    /**
     * [set] SALES_ORG_ID: {PK, NotNull, BIGINT(19)} <br>
     * 販売組織マスタ送信ID
     * @param salesOrgId The value of the column 'SALES_ORG_ID'. (NullAllowed)
     */
    public void setSalesOrgId(Long salesOrgId) {
        __modifiedProperties.add("salesOrgId");
        this._salesOrgId = salesOrgId;
    }

    /**
     * [get] SEND_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 送信済フラグ
     * @return The value of the column 'SEND_FLG'. (NullAllowed)
     */
    public String getSendFlg() {
        return _sendFlg;
    }

    /**
     * [set] SEND_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 送信済フラグ
     * @param sendFlg The value of the column 'SEND_FLG'. (NullAllowed)
     */
    public void setSendFlg(String sendFlg) {
        __modifiedProperties.add("sendFlg");
        this._sendFlg = sendFlg;
    }

    /**
     * [get] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @return The value of the column 'SALES_ORG_CD'. (NullAllowed)
     */
    public String getSalesOrgCd() {
        return _salesOrgCd;
    }

    /**
     * [set] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @param salesOrgCd The value of the column 'SALES_ORG_CD'. (NullAllowed)
     */
    public void setSalesOrgCd(String salesOrgCd) {
        __modifiedProperties.add("salesOrgCd");
        this._salesOrgCd = salesOrgCd;
    }

    /**
     * [get] PURCHASE_ORG_CD: {VARCHAR(30)} <br>
     * 購買組織CD
     * @return The value of the column 'PURCHASE_ORG_CD'. (NullAllowed)
     */
    public String getPurchaseOrgCd() {
        return _purchaseOrgCd;
    }

    /**
     * [set] PURCHASE_ORG_CD: {VARCHAR(30)} <br>
     * 購買組織CD
     * @param purchaseOrgCd The value of the column 'PURCHASE_ORG_CD'. (NullAllowed)
     */
    public void setPurchaseOrgCd(String purchaseOrgCd) {
        __modifiedProperties.add("purchaseOrgCd");
        this._purchaseOrgCd = purchaseOrgCd;
    }

    /**
     * [get] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @return The value of the column 'TENHANSHA_CD'. (NullAllowed)
     */
    public String getTenhanshaCd() {
        return _tenhanshaCd;
    }

    /**
     * [set] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @param tenhanshaCd The value of the column 'TENHANSHA_CD'. (NullAllowed)
     */
    public void setTenhanshaCd(String tenhanshaCd) {
        __modifiedProperties.add("tenhanshaCd");
        this._tenhanshaCd = tenhanshaCd;
    }

    /**
     * [get] TENHANSHA_NM1: {VARCHAR(60)} <br>
     * 店販社名称１
     * @return The value of the column 'TENHANSHA_NM1'. (NullAllowed)
     */
    public String getTenhanshaNm1() {
        return _tenhanshaNm1;
    }

    /**
     * [set] TENHANSHA_NM1: {VARCHAR(60)} <br>
     * 店販社名称１
     * @param tenhanshaNm1 The value of the column 'TENHANSHA_NM1'. (NullAllowed)
     */
    public void setTenhanshaNm1(String tenhanshaNm1) {
        __modifiedProperties.add("tenhanshaNm1");
        this._tenhanshaNm1 = tenhanshaNm1;
    }

    /**
     * [get] TENHANSHA_NM2: {VARCHAR(60)} <br>
     * 店販社名称２
     * @return The value of the column 'TENHANSHA_NM2'. (NullAllowed)
     */
    public String getTenhanshaNm2() {
        return _tenhanshaNm2;
    }

    /**
     * [set] TENHANSHA_NM2: {VARCHAR(60)} <br>
     * 店販社名称２
     * @param tenhanshaNm2 The value of the column 'TENHANSHA_NM2'. (NullAllowed)
     */
    public void setTenhanshaNm2(String tenhanshaNm2) {
        __modifiedProperties.add("tenhanshaNm2");
        this._tenhanshaNm2 = tenhanshaNm2;
    }

    /**
     * [get] TENHANSHA_ZIP_CD: {VARCHAR(30)} <br>
     * 店販社郵便番号
     * @return The value of the column 'TENHANSHA_ZIP_CD'. (NullAllowed)
     */
    public String getTenhanshaZipCd() {
        return _tenhanshaZipCd;
    }

    /**
     * [set] TENHANSHA_ZIP_CD: {VARCHAR(30)} <br>
     * 店販社郵便番号
     * @param tenhanshaZipCd The value of the column 'TENHANSHA_ZIP_CD'. (NullAllowed)
     */
    public void setTenhanshaZipCd(String tenhanshaZipCd) {
        __modifiedProperties.add("tenhanshaZipCd");
        this._tenhanshaZipCd = tenhanshaZipCd;
    }

    /**
     * [get] TENHANSHA_PREFECTURE: {VARCHAR(30)} <br>
     * 店販社都道府県
     * @return The value of the column 'TENHANSHA_PREFECTURE'. (NullAllowed)
     */
    public String getTenhanshaPrefecture() {
        return _tenhanshaPrefecture;
    }

    /**
     * [set] TENHANSHA_PREFECTURE: {VARCHAR(30)} <br>
     * 店販社都道府県
     * @param tenhanshaPrefecture The value of the column 'TENHANSHA_PREFECTURE'. (NullAllowed)
     */
    public void setTenhanshaPrefecture(String tenhanshaPrefecture) {
        __modifiedProperties.add("tenhanshaPrefecture");
        this._tenhanshaPrefecture = tenhanshaPrefecture;
    }

    /**
     * [get] TENHANSHA_ADDRESS1: {VARCHAR(60)} <br>
     * 店販社住所１
     * @return The value of the column 'TENHANSHA_ADDRESS1'. (NullAllowed)
     */
    public String getTenhanshaAddress1() {
        return _tenhanshaAddress1;
    }

    /**
     * [set] TENHANSHA_ADDRESS1: {VARCHAR(60)} <br>
     * 店販社住所１
     * @param tenhanshaAddress1 The value of the column 'TENHANSHA_ADDRESS1'. (NullAllowed)
     */
    public void setTenhanshaAddress1(String tenhanshaAddress1) {
        __modifiedProperties.add("tenhanshaAddress1");
        this._tenhanshaAddress1 = tenhanshaAddress1;
    }

    /**
     * [get] TENHANSHA_ADDRESS2: {VARCHAR(60)} <br>
     * 店販社住所２
     * @return The value of the column 'TENHANSHA_ADDRESS2'. (NullAllowed)
     */
    public String getTenhanshaAddress2() {
        return _tenhanshaAddress2;
    }

    /**
     * [set] TENHANSHA_ADDRESS2: {VARCHAR(60)} <br>
     * 店販社住所２
     * @param tenhanshaAddress2 The value of the column 'TENHANSHA_ADDRESS2'. (NullAllowed)
     */
    public void setTenhanshaAddress2(String tenhanshaAddress2) {
        __modifiedProperties.add("tenhanshaAddress2");
        this._tenhanshaAddress2 = tenhanshaAddress2;
    }

    /**
     * [get] TENHANSHA_TEL_NO: {VARCHAR(30)} <br>
     * 店販社電話番号
     * @return The value of the column 'TENHANSHA_TEL_NO'. (NullAllowed)
     */
    public String getTenhanshaTelNo() {
        return _tenhanshaTelNo;
    }

    /**
     * [set] TENHANSHA_TEL_NO: {VARCHAR(30)} <br>
     * 店販社電話番号
     * @param tenhanshaTelNo The value of the column 'TENHANSHA_TEL_NO'. (NullAllowed)
     */
    public void setTenhanshaTelNo(String tenhanshaTelNo) {
        __modifiedProperties.add("tenhanshaTelNo");
        this._tenhanshaTelNo = tenhanshaTelNo;
    }

    /**
     * [get] TENHANSHA_FAX_NO: {VARCHAR(30)} <br>
     * 店販社ＦＡＸ番号
     * @return The value of the column 'TENHANSHA_FAX_NO'. (NullAllowed)
     */
    public String getTenhanshaFaxNo() {
        return _tenhanshaFaxNo;
    }

    /**
     * [set] TENHANSHA_FAX_NO: {VARCHAR(30)} <br>
     * 店販社ＦＡＸ番号
     * @param tenhanshaFaxNo The value of the column 'TENHANSHA_FAX_NO'. (NullAllowed)
     */
    public void setTenhanshaFaxNo(String tenhanshaFaxNo) {
        __modifiedProperties.add("tenhanshaFaxNo");
        this._tenhanshaFaxNo = tenhanshaFaxNo;
    }

    /**
     * [get] PLANT_NORMAL: {VARCHAR(30)} <br>
     * プラント_通常品
     * @return The value of the column 'PLANT_NORMAL'. (NullAllowed)
     */
    public String getPlantNormal() {
        return _plantNormal;
    }

    /**
     * [set] PLANT_NORMAL: {VARCHAR(30)} <br>
     * プラント_通常品
     * @param plantNormal The value of the column 'PLANT_NORMAL'. (NullAllowed)
     */
    public void setPlantNormal(String plantNormal) {
        __modifiedProperties.add("plantNormal");
        this._plantNormal = plantNormal;
    }

    /**
     * [get] PLANT_DEPOSIT: {VARCHAR(30)} <br>
     * プラント_預かり品
     * @return The value of the column 'PLANT_DEPOSIT'. (NullAllowed)
     */
    public String getPlantDeposit() {
        return _plantDeposit;
    }

    /**
     * [set] PLANT_DEPOSIT: {VARCHAR(30)} <br>
     * プラント_預かり品
     * @param plantDeposit The value of the column 'PLANT_DEPOSIT'. (NullAllowed)
     */
    public void setPlantDeposit(String plantDeposit) {
        __modifiedProperties.add("plantDeposit");
        this._plantDeposit = plantDeposit;
    }

    /**
     * [get] SAP_ADD_YYYY: {VARCHAR(30)} <br>
     * SAP作成日_年
     * @return The value of the column 'SAP_ADD_YYYY'. (NullAllowed)
     */
    public String getSapAddYyyy() {
        return _sapAddYyyy;
    }

    /**
     * [set] SAP_ADD_YYYY: {VARCHAR(30)} <br>
     * SAP作成日_年
     * @param sapAddYyyy The value of the column 'SAP_ADD_YYYY'. (NullAllowed)
     */
    public void setSapAddYyyy(String sapAddYyyy) {
        __modifiedProperties.add("sapAddYyyy");
        this._sapAddYyyy = sapAddYyyy;
    }

    /**
     * [get] SAP_ADD_MM: {VARCHAR(30)} <br>
     * SAP作成日_月
     * @return The value of the column 'SAP_ADD_MM'. (NullAllowed)
     */
    public String getSapAddMm() {
        return _sapAddMm;
    }

    /**
     * [set] SAP_ADD_MM: {VARCHAR(30)} <br>
     * SAP作成日_月
     * @param sapAddMm The value of the column 'SAP_ADD_MM'. (NullAllowed)
     */
    public void setSapAddMm(String sapAddMm) {
        __modifiedProperties.add("sapAddMm");
        this._sapAddMm = sapAddMm;
    }

    /**
     * [get] SAP_ADD_DD: {VARCHAR(30)} <br>
     * SAP作成日_日
     * @return The value of the column 'SAP_ADD_DD'. (NullAllowed)
     */
    public String getSapAddDd() {
        return _sapAddDd;
    }

    /**
     * [set] SAP_ADD_DD: {VARCHAR(30)} <br>
     * SAP作成日_日
     * @param sapAddDd The value of the column 'SAP_ADD_DD'. (NullAllowed)
     */
    public void setSapAddDd(String sapAddDd) {
        __modifiedProperties.add("sapAddDd");
        this._sapAddDd = sapAddDd;
    }

    /**
     * [get] SAP_ADD_HH: {VARCHAR(30)} <br>
     * SAP作成時間_時
     * @return The value of the column 'SAP_ADD_HH'. (NullAllowed)
     */
    public String getSapAddHh() {
        return _sapAddHh;
    }

    /**
     * [set] SAP_ADD_HH: {VARCHAR(30)} <br>
     * SAP作成時間_時
     * @param sapAddHh The value of the column 'SAP_ADD_HH'. (NullAllowed)
     */
    public void setSapAddHh(String sapAddHh) {
        __modifiedProperties.add("sapAddHh");
        this._sapAddHh = sapAddHh;
    }

    /**
     * [get] SAP_ADD_MI: {VARCHAR(30)} <br>
     * SAP作成時間_分
     * @return The value of the column 'SAP_ADD_MI'. (NullAllowed)
     */
    public String getSapAddMi() {
        return _sapAddMi;
    }

    /**
     * [set] SAP_ADD_MI: {VARCHAR(30)} <br>
     * SAP作成時間_分
     * @param sapAddMi The value of the column 'SAP_ADD_MI'. (NullAllowed)
     */
    public void setSapAddMi(String sapAddMi) {
        __modifiedProperties.add("sapAddMi");
        this._sapAddMi = sapAddMi;
    }

    /**
     * [get] SAP_ADD_SS: {VARCHAR(30)} <br>
     * SAP作成時間_秒
     * @return The value of the column 'SAP_ADD_SS'. (NullAllowed)
     */
    public String getSapAddSs() {
        return _sapAddSs;
    }

    /**
     * [set] SAP_ADD_SS: {VARCHAR(30)} <br>
     * SAP作成時間_秒
     * @param sapAddSs The value of the column 'SAP_ADD_SS'. (NullAllowed)
     */
    public void setSapAddSs(String sapAddSs) {
        __modifiedProperties.add("sapAddSs");
        this._sapAddSs = sapAddSs;
    }

    /**
     * [get] SAP_ADD_USER_CD: {VARCHAR(30)} <br>
     * SAP作成者
     * @return The value of the column 'SAP_ADD_USER_CD'. (NullAllowed)
     */
    public String getSapAddUserCd() {
        return _sapAddUserCd;
    }

    /**
     * [set] SAP_ADD_USER_CD: {VARCHAR(30)} <br>
     * SAP作成者
     * @param sapAddUserCd The value of the column 'SAP_ADD_USER_CD'. (NullAllowed)
     */
    public void setSapAddUserCd(String sapAddUserCd) {
        __modifiedProperties.add("sapAddUserCd");
        this._sapAddUserCd = sapAddUserCd;
    }

    /**
     * [get] SAP_UPD_YYYY: {VARCHAR(30)} <br>
     * SAP更新日_年
     * @return The value of the column 'SAP_UPD_YYYY'. (NullAllowed)
     */
    public String getSapUpdYyyy() {
        return _sapUpdYyyy;
    }

    /**
     * [set] SAP_UPD_YYYY: {VARCHAR(30)} <br>
     * SAP更新日_年
     * @param sapUpdYyyy The value of the column 'SAP_UPD_YYYY'. (NullAllowed)
     */
    public void setSapUpdYyyy(String sapUpdYyyy) {
        __modifiedProperties.add("sapUpdYyyy");
        this._sapUpdYyyy = sapUpdYyyy;
    }

    /**
     * [get] SAP_UPD_MM: {VARCHAR(30)} <br>
     * SAP更新日_月
     * @return The value of the column 'SAP_UPD_MM'. (NullAllowed)
     */
    public String getSapUpdMm() {
        return _sapUpdMm;
    }

    /**
     * [set] SAP_UPD_MM: {VARCHAR(30)} <br>
     * SAP更新日_月
     * @param sapUpdMm The value of the column 'SAP_UPD_MM'. (NullAllowed)
     */
    public void setSapUpdMm(String sapUpdMm) {
        __modifiedProperties.add("sapUpdMm");
        this._sapUpdMm = sapUpdMm;
    }

    /**
     * [get] SAP_UPD_DD: {VARCHAR(30)} <br>
     * SAP更新日_日
     * @return The value of the column 'SAP_UPD_DD'. (NullAllowed)
     */
    public String getSapUpdDd() {
        return _sapUpdDd;
    }

    /**
     * [set] SAP_UPD_DD: {VARCHAR(30)} <br>
     * SAP更新日_日
     * @param sapUpdDd The value of the column 'SAP_UPD_DD'. (NullAllowed)
     */
    public void setSapUpdDd(String sapUpdDd) {
        __modifiedProperties.add("sapUpdDd");
        this._sapUpdDd = sapUpdDd;
    }

    /**
     * [get] SAP_UPD_HH: {VARCHAR(30)} <br>
     * SAP更新時間_時
     * @return The value of the column 'SAP_UPD_HH'. (NullAllowed)
     */
    public String getSapUpdHh() {
        return _sapUpdHh;
    }

    /**
     * [set] SAP_UPD_HH: {VARCHAR(30)} <br>
     * SAP更新時間_時
     * @param sapUpdHh The value of the column 'SAP_UPD_HH'. (NullAllowed)
     */
    public void setSapUpdHh(String sapUpdHh) {
        __modifiedProperties.add("sapUpdHh");
        this._sapUpdHh = sapUpdHh;
    }

    /**
     * [get] SAP_UPD_MI: {VARCHAR(30)} <br>
     * SAP更新時間_分
     * @return The value of the column 'SAP_UPD_MI'. (NullAllowed)
     */
    public String getSapUpdMi() {
        return _sapUpdMi;
    }

    /**
     * [set] SAP_UPD_MI: {VARCHAR(30)} <br>
     * SAP更新時間_分
     * @param sapUpdMi The value of the column 'SAP_UPD_MI'. (NullAllowed)
     */
    public void setSapUpdMi(String sapUpdMi) {
        __modifiedProperties.add("sapUpdMi");
        this._sapUpdMi = sapUpdMi;
    }

    /**
     * [get] SAP_UPD_SS: {VARCHAR(30)} <br>
     * SAP更新時間_秒
     * @return The value of the column 'SAP_UPD_SS'. (NullAllowed)
     */
    public String getSapUpdSs() {
        return _sapUpdSs;
    }

    /**
     * [set] SAP_UPD_SS: {VARCHAR(30)} <br>
     * SAP更新時間_秒
     * @param sapUpdSs The value of the column 'SAP_UPD_SS'. (NullAllowed)
     */
    public void setSapUpdSs(String sapUpdSs) {
        __modifiedProperties.add("sapUpdSs");
        this._sapUpdSs = sapUpdSs;
    }

    /**
     * [get] SAP_UPD_USER_CD: {VARCHAR(30)} <br>
     * SAP更新者
     * @return The value of the column 'SAP_UPD_USER_CD'. (NullAllowed)
     */
    public String getSapUpdUserCd() {
        return _sapUpdUserCd;
    }

    /**
     * [set] SAP_UPD_USER_CD: {VARCHAR(30)} <br>
     * SAP更新者
     * @param sapUpdUserCd The value of the column 'SAP_UPD_USER_CD'. (NullAllowed)
     */
    public void setSapUpdUserCd(String sapUpdUserCd) {
        __modifiedProperties.add("sapUpdUserCd");
        this._sapUpdUserCd = sapUpdUserCd;
    }

    /**
     * [get] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @return The value of the column 'SPARE_STR'. (NullAllowed)
     */
    public String getSpareStr() {
        return _spareStr;
    }

    /**
     * [set] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @param spareStr The value of the column 'SPARE_STR'. (NullAllowed)
     */
    public void setSpareStr(String spareStr) {
        __modifiedProperties.add("spareStr");
        this._spareStr = spareStr;
    }

    /**
     * [get] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
