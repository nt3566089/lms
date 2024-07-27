package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of m_plant_storage_space as TABLE. <br>
 * プラント保管場所マスタ
 * <pre>
 * [primary-key]
 *     PLANT_STORAGE_SPACE_ID
 *
 * [column]
 *     PLANT_STORAGE_SPACE_ID, OWNER_CD, PLANT_CD, STORAGE_SPACE_CD, COMPANY_NM, PLANT_NM, STORAGE_SPACE_NM1, STORAGE_SPACE_NM2, COUNTRY_NM, ADDRESS1, ZIP_CD, ADDRESS2, ADDRESS3, TEL_NO, FAX_NO, LANG_NM, BASE_CD, BASE_TYPE_CD, BASE_NM, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PLANT_STORAGE_SPACE_ID
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
public abstract class BsMPlantStorageSpaceDto implements Serializable {

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
    /** PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _plantStorageSpaceId;

    /** OWNER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _ownerCd;

    /** PLANT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _plantCd;

    /** STORAGE_SPACE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _storageSpaceCd;

    /** COMPANY_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _companyNm;

    /** PLANT_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _plantNm;

    /** STORAGE_SPACE_NM1: {VARCHAR(60)} */
    @JsonKey
    protected String _storageSpaceNm1;

    /** STORAGE_SPACE_NM2: {VARCHAR(60)} */
    @JsonKey
    protected String _storageSpaceNm2;

    /** COUNTRY_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _countryNm;

    /** ADDRESS1: {VARCHAR(60)} */
    @JsonKey
    protected String _address1;

    /** ZIP_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _zipCd;

    /** ADDRESS2: {VARCHAR(60)} */
    @JsonKey
    protected String _address2;

    /** ADDRESS3: {VARCHAR(60)} */
    @JsonKey
    protected String _address3;

    /** TEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _telNo;

    /** FAX_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _faxNo;

    /** LANG_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _langNm;

    /** BASE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _baseCd;

    /** BASE_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _baseTypeCd;

    /** BASE_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _baseNm;

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
    public BsMPlantStorageSpaceDto() {
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
        if (other == null || !(other instanceof BsMPlantStorageSpaceDto)) { return false; }
        final BsMPlantStorageSpaceDto otherEntity = (BsMPlantStorageSpaceDto)other;
        if (!helpComparingValue(getPlantStorageSpaceId(), otherEntity.getPlantStorageSpaceId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "m_plant_storage_space");
        result = xCH(result, getPlantStorageSpaceId());
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
        sb.append(c).append(getPlantStorageSpaceId());
        sb.append(c).append(getOwnerCd());
        sb.append(c).append(getPlantCd());
        sb.append(c).append(getStorageSpaceCd());
        sb.append(c).append(getCompanyNm());
        sb.append(c).append(getPlantNm());
        sb.append(c).append(getStorageSpaceNm1());
        sb.append(c).append(getStorageSpaceNm2());
        sb.append(c).append(getCountryNm());
        sb.append(c).append(getAddress1());
        sb.append(c).append(getZipCd());
        sb.append(c).append(getAddress2());
        sb.append(c).append(getAddress3());
        sb.append(c).append(getTelNo());
        sb.append(c).append(getFaxNo());
        sb.append(c).append(getLangNm());
        sb.append(c).append(getBaseCd());
        sb.append(c).append(getBaseTypeCd());
        sb.append(c).append(getBaseNm());
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
     * [get] PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)} <br>
     * プラント保管場所ID
     * @return The value of the column 'PLANT_STORAGE_SPACE_ID'. (NullAllowed)
     */
    public Long getPlantStorageSpaceId() {
        return _plantStorageSpaceId;
    }

    /**
     * [set] PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)} <br>
     * プラント保管場所ID
     * @param plantStorageSpaceId The value of the column 'PLANT_STORAGE_SPACE_ID'. (NullAllowed)
     */
    public void setPlantStorageSpaceId(Long plantStorageSpaceId) {
        __modifiedProperties.add("plantStorageSpaceId");
        this._plantStorageSpaceId = plantStorageSpaceId;
    }

    /**
     * [get] OWNER_CD: {VARCHAR(30)} <br>
     * 所有者CD
     * @return The value of the column 'OWNER_CD'. (NullAllowed)
     */
    public String getOwnerCd() {
        return _ownerCd;
    }

    /**
     * [set] OWNER_CD: {VARCHAR(30)} <br>
     * 所有者CD
     * @param ownerCd The value of the column 'OWNER_CD'. (NullAllowed)
     */
    public void setOwnerCd(String ownerCd) {
        __modifiedProperties.add("ownerCd");
        this._ownerCd = ownerCd;
    }

    /**
     * [get] PLANT_CD: {VARCHAR(30)} <br>
     * プラントCD
     * @return The value of the column 'PLANT_CD'. (NullAllowed)
     */
    public String getPlantCd() {
        return _plantCd;
    }

    /**
     * [set] PLANT_CD: {VARCHAR(30)} <br>
     * プラントCD
     * @param plantCd The value of the column 'PLANT_CD'. (NullAllowed)
     */
    public void setPlantCd(String plantCd) {
        __modifiedProperties.add("plantCd");
        this._plantCd = plantCd;
    }

    /**
     * [get] STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 保管場所CD
     * @return The value of the column 'STORAGE_SPACE_CD'. (NullAllowed)
     */
    public String getStorageSpaceCd() {
        return _storageSpaceCd;
    }

    /**
     * [set] STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 保管場所CD
     * @param storageSpaceCd The value of the column 'STORAGE_SPACE_CD'. (NullAllowed)
     */
    public void setStorageSpaceCd(String storageSpaceCd) {
        __modifiedProperties.add("storageSpaceCd");
        this._storageSpaceCd = storageSpaceCd;
    }

    /**
     * [get] COMPANY_NM: {VARCHAR(60)} <br>
     * 会社名
     * @return The value of the column 'COMPANY_NM'. (NullAllowed)
     */
    public String getCompanyNm() {
        return _companyNm;
    }

    /**
     * [set] COMPANY_NM: {VARCHAR(60)} <br>
     * 会社名
     * @param companyNm The value of the column 'COMPANY_NM'. (NullAllowed)
     */
    public void setCompanyNm(String companyNm) {
        __modifiedProperties.add("companyNm");
        this._companyNm = companyNm;
    }

    /**
     * [get] PLANT_NM: {VARCHAR(60)} <br>
     * プラント名
     * @return The value of the column 'PLANT_NM'. (NullAllowed)
     */
    public String getPlantNm() {
        return _plantNm;
    }

    /**
     * [set] PLANT_NM: {VARCHAR(60)} <br>
     * プラント名
     * @param plantNm The value of the column 'PLANT_NM'. (NullAllowed)
     */
    public void setPlantNm(String plantNm) {
        __modifiedProperties.add("plantNm");
        this._plantNm = plantNm;
    }

    /**
     * [get] STORAGE_SPACE_NM1: {VARCHAR(60)} <br>
     * 保管場所名1
     * @return The value of the column 'STORAGE_SPACE_NM1'. (NullAllowed)
     */
    public String getStorageSpaceNm1() {
        return _storageSpaceNm1;
    }

    /**
     * [set] STORAGE_SPACE_NM1: {VARCHAR(60)} <br>
     * 保管場所名1
     * @param storageSpaceNm1 The value of the column 'STORAGE_SPACE_NM1'. (NullAllowed)
     */
    public void setStorageSpaceNm1(String storageSpaceNm1) {
        __modifiedProperties.add("storageSpaceNm1");
        this._storageSpaceNm1 = storageSpaceNm1;
    }

    /**
     * [get] STORAGE_SPACE_NM2: {VARCHAR(60)} <br>
     * 保管場所名2
     * @return The value of the column 'STORAGE_SPACE_NM2'. (NullAllowed)
     */
    public String getStorageSpaceNm2() {
        return _storageSpaceNm2;
    }

    /**
     * [set] STORAGE_SPACE_NM2: {VARCHAR(60)} <br>
     * 保管場所名2
     * @param storageSpaceNm2 The value of the column 'STORAGE_SPACE_NM2'. (NullAllowed)
     */
    public void setStorageSpaceNm2(String storageSpaceNm2) {
        __modifiedProperties.add("storageSpaceNm2");
        this._storageSpaceNm2 = storageSpaceNm2;
    }

    /**
     * [get] COUNTRY_NM: {VARCHAR(60)} <br>
     * 国
     * @return The value of the column 'COUNTRY_NM'. (NullAllowed)
     */
    public String getCountryNm() {
        return _countryNm;
    }

    /**
     * [set] COUNTRY_NM: {VARCHAR(60)} <br>
     * 国
     * @param countryNm The value of the column 'COUNTRY_NM'. (NullAllowed)
     */
    public void setCountryNm(String countryNm) {
        __modifiedProperties.add("countryNm");
        this._countryNm = countryNm;
    }

    /**
     * [get] ADDRESS1: {VARCHAR(60)} <br>
     * 都道府県
     * @return The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public String getAddress1() {
        return _address1;
    }

    /**
     * [set] ADDRESS1: {VARCHAR(60)} <br>
     * 都道府県
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public void setAddress1(String address1) {
        __modifiedProperties.add("address1");
        this._address1 = address1;
    }

    /**
     * [get] ZIP_CD: {VARCHAR(30)} <br>
     * 郵便番号
     * @return The value of the column 'ZIP_CD'. (NullAllowed)
     */
    public String getZipCd() {
        return _zipCd;
    }

    /**
     * [set] ZIP_CD: {VARCHAR(30)} <br>
     * 郵便番号
     * @param zipCd The value of the column 'ZIP_CD'. (NullAllowed)
     */
    public void setZipCd(String zipCd) {
        __modifiedProperties.add("zipCd");
        this._zipCd = zipCd;
    }

    /**
     * [get] ADDRESS2: {VARCHAR(60)} <br>
     * 市区町村
     * @return The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public String getAddress2() {
        return _address2;
    }

    /**
     * [set] ADDRESS2: {VARCHAR(60)} <br>
     * 市区町村
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public void setAddress2(String address2) {
        __modifiedProperties.add("address2");
        this._address2 = address2;
    }

    /**
     * [get] ADDRESS3: {VARCHAR(60)} <br>
     * 所在地
     * @return The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public String getAddress3() {
        return _address3;
    }

    /**
     * [set] ADDRESS3: {VARCHAR(60)} <br>
     * 所在地
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public void setAddress3(String address3) {
        __modifiedProperties.add("address3");
        this._address3 = address3;
    }

    /**
     * [get] TEL_NO: {VARCHAR(30)} <br>
     * 電話番号
     * @return The value of the column 'TEL_NO'. (NullAllowed)
     */
    public String getTelNo() {
        return _telNo;
    }

    /**
     * [set] TEL_NO: {VARCHAR(30)} <br>
     * 電話番号
     * @param telNo The value of the column 'TEL_NO'. (NullAllowed)
     */
    public void setTelNo(String telNo) {
        __modifiedProperties.add("telNo");
        this._telNo = telNo;
    }

    /**
     * [get] FAX_NO: {VARCHAR(30)} <br>
     * FAX
     * @return The value of the column 'FAX_NO'. (NullAllowed)
     */
    public String getFaxNo() {
        return _faxNo;
    }

    /**
     * [set] FAX_NO: {VARCHAR(30)} <br>
     * FAX
     * @param faxNo The value of the column 'FAX_NO'. (NullAllowed)
     */
    public void setFaxNo(String faxNo) {
        __modifiedProperties.add("faxNo");
        this._faxNo = faxNo;
    }

    /**
     * [get] LANG_NM: {VARCHAR(60)} <br>
     * 言語
     * @return The value of the column 'LANG_NM'. (NullAllowed)
     */
    public String getLangNm() {
        return _langNm;
    }

    /**
     * [set] LANG_NM: {VARCHAR(60)} <br>
     * 言語
     * @param langNm The value of the column 'LANG_NM'. (NullAllowed)
     */
    public void setLangNm(String langNm) {
        __modifiedProperties.add("langNm");
        this._langNm = langNm;
    }

    /**
     * [get] BASE_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @return The value of the column 'BASE_CD'. (NullAllowed)
     */
    public String getBaseCd() {
        return _baseCd;
    }

    /**
     * [set] BASE_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @param baseCd The value of the column 'BASE_CD'. (NullAllowed)
     */
    public void setBaseCd(String baseCd) {
        __modifiedProperties.add("baseCd");
        this._baseCd = baseCd;
    }

    /**
     * [get] BASE_TYPE_CD: {VARCHAR(30)} <br>
     * 拠点区分
     * @return The value of the column 'BASE_TYPE_CD'. (NullAllowed)
     */
    public String getBaseTypeCd() {
        return _baseTypeCd;
    }

    /**
     * [set] BASE_TYPE_CD: {VARCHAR(30)} <br>
     * 拠点区分
     * @param baseTypeCd The value of the column 'BASE_TYPE_CD'. (NullAllowed)
     */
    public void setBaseTypeCd(String baseTypeCd) {
        __modifiedProperties.add("baseTypeCd");
        this._baseTypeCd = baseTypeCd;
    }

    /**
     * [get] BASE_NM: {VARCHAR(60)} <br>
     * 拠点名称
     * @return The value of the column 'BASE_NM'. (NullAllowed)
     */
    public String getBaseNm() {
        return _baseNm;
    }

    /**
     * [set] BASE_NM: {VARCHAR(60)} <br>
     * 拠点名称
     * @param baseNm The value of the column 'BASE_NM'. (NullAllowed)
     */
    public void setBaseNm(String baseNm) {
        __modifiedProperties.add("baseNm");
        this._baseNm = baseNm;
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
