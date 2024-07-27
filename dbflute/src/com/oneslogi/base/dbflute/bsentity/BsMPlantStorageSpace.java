package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of m_plant_storage_space as TABLE. <br>
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
 * Long plantStorageSpaceId = entity.getPlantStorageSpaceId();
 * String ownerCd = entity.getOwnerCd();
 * String plantCd = entity.getPlantCd();
 * String storageSpaceCd = entity.getStorageSpaceCd();
 * String companyNm = entity.getCompanyNm();
 * String plantNm = entity.getPlantNm();
 * String storageSpaceNm1 = entity.getStorageSpaceNm1();
 * String storageSpaceNm2 = entity.getStorageSpaceNm2();
 * String countryNm = entity.getCountryNm();
 * String address1 = entity.getAddress1();
 * String zipCd = entity.getZipCd();
 * String address2 = entity.getAddress2();
 * String address3 = entity.getAddress3();
 * String telNo = entity.getTelNo();
 * String faxNo = entity.getFaxNo();
 * String langNm = entity.getLangNm();
 * String baseCd = entity.getBaseCd();
 * String baseTypeCd = entity.getBaseTypeCd();
 * String baseNm = entity.getBaseNm();
 * String spareStr = entity.getSpareStr();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPlantStorageSpaceId(plantStorageSpaceId);
 * entity.setOwnerCd(ownerCd);
 * entity.setPlantCd(plantCd);
 * entity.setStorageSpaceCd(storageSpaceCd);
 * entity.setCompanyNm(companyNm);
 * entity.setPlantNm(plantNm);
 * entity.setStorageSpaceNm1(storageSpaceNm1);
 * entity.setStorageSpaceNm2(storageSpaceNm2);
 * entity.setCountryNm(countryNm);
 * entity.setAddress1(address1);
 * entity.setZipCd(zipCd);
 * entity.setAddress2(address2);
 * entity.setAddress3(address3);
 * entity.setTelNo(telNo);
 * entity.setFaxNo(faxNo);
 * entity.setLangNm(langNm);
 * entity.setBaseCd(baseCd);
 * entity.setBaseTypeCd(baseTypeCd);
 * entity.setBaseNm(baseNm);
 * entity.setSpareStr(spareStr);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMPlantStorageSpace extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)} */
    protected Long _plantStorageSpaceId;

    /** OWNER_CD: {VARCHAR(30)} */
    protected String _ownerCd;

    /** PLANT_CD: {VARCHAR(30)} */
    protected String _plantCd;

    /** STORAGE_SPACE_CD: {VARCHAR(30)} */
    protected String _storageSpaceCd;

    /** COMPANY_NM: {VARCHAR(60)} */
    protected String _companyNm;

    /** PLANT_NM: {VARCHAR(60)} */
    protected String _plantNm;

    /** STORAGE_SPACE_NM1: {VARCHAR(60)} */
    protected String _storageSpaceNm1;

    /** STORAGE_SPACE_NM2: {VARCHAR(60)} */
    protected String _storageSpaceNm2;

    /** COUNTRY_NM: {VARCHAR(60)} */
    protected String _countryNm;

    /** ADDRESS1: {VARCHAR(60)} */
    protected String _address1;

    /** ZIP_CD: {VARCHAR(30)} */
    protected String _zipCd;

    /** ADDRESS2: {VARCHAR(60)} */
    protected String _address2;

    /** ADDRESS3: {VARCHAR(60)} */
    protected String _address3;

    /** TEL_NO: {VARCHAR(30)} */
    protected String _telNo;

    /** FAX_NO: {VARCHAR(30)} */
    protected String _faxNo;

    /** LANG_NM: {VARCHAR(60)} */
    protected String _langNm;

    /** BASE_CD: {VARCHAR(30)} */
    protected String _baseCd;

    /** BASE_TYPE_CD: {VARCHAR(30)} */
    protected String _baseTypeCd;

    /** BASE_NM: {VARCHAR(60)} */
    protected String _baseNm;

    /** SPARE_STR: {VARCHAR(255)} */
    protected String _spareStr;

    /** DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, BIGINT(19), default=[0]} */
    protected Long _versionNo;

    /** CONTROL_NO: {IX, BIGINT(19)} */
    protected Long _controlNo;

    /** ADD_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {VARCHAR(60)} */
    protected String _addUser;

    /** ADD_PROCESS: {VARCHAR(255)} */
    protected String _addProcess;

    /** UPD_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {VARCHAR(60)} */
    protected String _updUser;

    /** UPD_PROCESS: {VARCHAR(255)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "m_plant_storage_space";
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
        if (_plantStorageSpaceId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
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
        if (obj instanceof BsMPlantStorageSpace) {
            BsMPlantStorageSpace other = (BsMPlantStorageSpace)obj;
            if (!xSV(_plantStorageSpaceId, other._plantStorageSpaceId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _plantStorageSpaceId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_plantStorageSpaceId));
        sb.append(dm).append(xfND(_ownerCd));
        sb.append(dm).append(xfND(_plantCd));
        sb.append(dm).append(xfND(_storageSpaceCd));
        sb.append(dm).append(xfND(_companyNm));
        sb.append(dm).append(xfND(_plantNm));
        sb.append(dm).append(xfND(_storageSpaceNm1));
        sb.append(dm).append(xfND(_storageSpaceNm2));
        sb.append(dm).append(xfND(_countryNm));
        sb.append(dm).append(xfND(_address1));
        sb.append(dm).append(xfND(_zipCd));
        sb.append(dm).append(xfND(_address2));
        sb.append(dm).append(xfND(_address3));
        sb.append(dm).append(xfND(_telNo));
        sb.append(dm).append(xfND(_faxNo));
        sb.append(dm).append(xfND(_langNm));
        sb.append(dm).append(xfND(_baseCd));
        sb.append(dm).append(xfND(_baseTypeCd));
        sb.append(dm).append(xfND(_baseNm));
        sb.append(dm).append(xfND(_spareStr));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
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
    public MPlantStorageSpace clone() {
        return (MPlantStorageSpace)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)} <br>
     * プラント保管場所ID
     * @return The value of the column 'PLANT_STORAGE_SPACE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPlantStorageSpaceId() {
        checkSpecifiedProperty("plantStorageSpaceId");
        return _plantStorageSpaceId;
    }

    /**
     * [set] PLANT_STORAGE_SPACE_ID: {PK, ID, IX, NotNull, BIGINT(19)} <br>
     * プラント保管場所ID
     * @param plantStorageSpaceId The value of the column 'PLANT_STORAGE_SPACE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPlantStorageSpaceId(Long plantStorageSpaceId) {
        registerModifiedProperty("plantStorageSpaceId");
        _plantStorageSpaceId = plantStorageSpaceId;
    }

    /**
     * [get] OWNER_CD: {VARCHAR(30)} <br>
     * 所有者CD
     * @return The value of the column 'OWNER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnerCd() {
        checkSpecifiedProperty("ownerCd");
        return convertEmptyToNull(_ownerCd);
    }

    /**
     * [set] OWNER_CD: {VARCHAR(30)} <br>
     * 所有者CD
     * @param ownerCd The value of the column 'OWNER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnerCd(String ownerCd) {
        registerModifiedProperty("ownerCd");
        _ownerCd = ownerCd;
    }

    /**
     * [get] PLANT_CD: {VARCHAR(30)} <br>
     * プラントCD
     * @return The value of the column 'PLANT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlantCd() {
        checkSpecifiedProperty("plantCd");
        return convertEmptyToNull(_plantCd);
    }

    /**
     * [set] PLANT_CD: {VARCHAR(30)} <br>
     * プラントCD
     * @param plantCd The value of the column 'PLANT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlantCd(String plantCd) {
        registerModifiedProperty("plantCd");
        _plantCd = plantCd;
    }

    /**
     * [get] STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 保管場所CD
     * @return The value of the column 'STORAGE_SPACE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStorageSpaceCd() {
        checkSpecifiedProperty("storageSpaceCd");
        return convertEmptyToNull(_storageSpaceCd);
    }

    /**
     * [set] STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 保管場所CD
     * @param storageSpaceCd The value of the column 'STORAGE_SPACE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStorageSpaceCd(String storageSpaceCd) {
        registerModifiedProperty("storageSpaceCd");
        _storageSpaceCd = storageSpaceCd;
    }

    /**
     * [get] COMPANY_NM: {VARCHAR(60)} <br>
     * 会社名
     * @return The value of the column 'COMPANY_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompanyNm() {
        checkSpecifiedProperty("companyNm");
        return convertEmptyToNull(_companyNm);
    }

    /**
     * [set] COMPANY_NM: {VARCHAR(60)} <br>
     * 会社名
     * @param companyNm The value of the column 'COMPANY_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompanyNm(String companyNm) {
        registerModifiedProperty("companyNm");
        _companyNm = companyNm;
    }

    /**
     * [get] PLANT_NM: {VARCHAR(60)} <br>
     * プラント名
     * @return The value of the column 'PLANT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlantNm() {
        checkSpecifiedProperty("plantNm");
        return convertEmptyToNull(_plantNm);
    }

    /**
     * [set] PLANT_NM: {VARCHAR(60)} <br>
     * プラント名
     * @param plantNm The value of the column 'PLANT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlantNm(String plantNm) {
        registerModifiedProperty("plantNm");
        _plantNm = plantNm;
    }

    /**
     * [get] STORAGE_SPACE_NM1: {VARCHAR(60)} <br>
     * 保管場所名1
     * @return The value of the column 'STORAGE_SPACE_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getStorageSpaceNm1() {
        checkSpecifiedProperty("storageSpaceNm1");
        return convertEmptyToNull(_storageSpaceNm1);
    }

    /**
     * [set] STORAGE_SPACE_NM1: {VARCHAR(60)} <br>
     * 保管場所名1
     * @param storageSpaceNm1 The value of the column 'STORAGE_SPACE_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStorageSpaceNm1(String storageSpaceNm1) {
        registerModifiedProperty("storageSpaceNm1");
        _storageSpaceNm1 = storageSpaceNm1;
    }

    /**
     * [get] STORAGE_SPACE_NM2: {VARCHAR(60)} <br>
     * 保管場所名2
     * @return The value of the column 'STORAGE_SPACE_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getStorageSpaceNm2() {
        checkSpecifiedProperty("storageSpaceNm2");
        return convertEmptyToNull(_storageSpaceNm2);
    }

    /**
     * [set] STORAGE_SPACE_NM2: {VARCHAR(60)} <br>
     * 保管場所名2
     * @param storageSpaceNm2 The value of the column 'STORAGE_SPACE_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStorageSpaceNm2(String storageSpaceNm2) {
        registerModifiedProperty("storageSpaceNm2");
        _storageSpaceNm2 = storageSpaceNm2;
    }

    /**
     * [get] COUNTRY_NM: {VARCHAR(60)} <br>
     * 国
     * @return The value of the column 'COUNTRY_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCountryNm() {
        checkSpecifiedProperty("countryNm");
        return convertEmptyToNull(_countryNm);
    }

    /**
     * [set] COUNTRY_NM: {VARCHAR(60)} <br>
     * 国
     * @param countryNm The value of the column 'COUNTRY_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCountryNm(String countryNm) {
        registerModifiedProperty("countryNm");
        _countryNm = countryNm;
    }

    /**
     * [get] ADDRESS1: {VARCHAR(60)} <br>
     * 都道府県
     * @return The value of the column 'ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress1() {
        checkSpecifiedProperty("address1");
        return convertEmptyToNull(_address1);
    }

    /**
     * [set] ADDRESS1: {VARCHAR(60)} <br>
     * 都道府県
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress1(String address1) {
        registerModifiedProperty("address1");
        _address1 = address1;
    }

    /**
     * [get] ZIP_CD: {VARCHAR(30)} <br>
     * 郵便番号
     * @return The value of the column 'ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZipCd() {
        checkSpecifiedProperty("zipCd");
        return convertEmptyToNull(_zipCd);
    }

    /**
     * [set] ZIP_CD: {VARCHAR(30)} <br>
     * 郵便番号
     * @param zipCd The value of the column 'ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZipCd(String zipCd) {
        registerModifiedProperty("zipCd");
        _zipCd = zipCd;
    }

    /**
     * [get] ADDRESS2: {VARCHAR(60)} <br>
     * 市区町村
     * @return The value of the column 'ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress2() {
        checkSpecifiedProperty("address2");
        return convertEmptyToNull(_address2);
    }

    /**
     * [set] ADDRESS2: {VARCHAR(60)} <br>
     * 市区町村
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress2(String address2) {
        registerModifiedProperty("address2");
        _address2 = address2;
    }

    /**
     * [get] ADDRESS3: {VARCHAR(60)} <br>
     * 所在地
     * @return The value of the column 'ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress3() {
        checkSpecifiedProperty("address3");
        return convertEmptyToNull(_address3);
    }

    /**
     * [set] ADDRESS3: {VARCHAR(60)} <br>
     * 所在地
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress3(String address3) {
        registerModifiedProperty("address3");
        _address3 = address3;
    }

    /**
     * [get] TEL_NO: {VARCHAR(30)} <br>
     * 電話番号
     * @return The value of the column 'TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTelNo() {
        checkSpecifiedProperty("telNo");
        return convertEmptyToNull(_telNo);
    }

    /**
     * [set] TEL_NO: {VARCHAR(30)} <br>
     * 電話番号
     * @param telNo The value of the column 'TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTelNo(String telNo) {
        registerModifiedProperty("telNo");
        _telNo = telNo;
    }

    /**
     * [get] FAX_NO: {VARCHAR(30)} <br>
     * FAX
     * @return The value of the column 'FAX_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getFaxNo() {
        checkSpecifiedProperty("faxNo");
        return convertEmptyToNull(_faxNo);
    }

    /**
     * [set] FAX_NO: {VARCHAR(30)} <br>
     * FAX
     * @param faxNo The value of the column 'FAX_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFaxNo(String faxNo) {
        registerModifiedProperty("faxNo");
        _faxNo = faxNo;
    }

    /**
     * [get] LANG_NM: {VARCHAR(60)} <br>
     * 言語
     * @return The value of the column 'LANG_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getLangNm() {
        checkSpecifiedProperty("langNm");
        return convertEmptyToNull(_langNm);
    }

    /**
     * [set] LANG_NM: {VARCHAR(60)} <br>
     * 言語
     * @param langNm The value of the column 'LANG_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLangNm(String langNm) {
        registerModifiedProperty("langNm");
        _langNm = langNm;
    }

    /**
     * [get] BASE_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @return The value of the column 'BASE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBaseCd() {
        checkSpecifiedProperty("baseCd");
        return convertEmptyToNull(_baseCd);
    }

    /**
     * [set] BASE_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @param baseCd The value of the column 'BASE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBaseCd(String baseCd) {
        registerModifiedProperty("baseCd");
        _baseCd = baseCd;
    }

    /**
     * [get] BASE_TYPE_CD: {VARCHAR(30)} <br>
     * 拠点区分
     * @return The value of the column 'BASE_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBaseTypeCd() {
        checkSpecifiedProperty("baseTypeCd");
        return convertEmptyToNull(_baseTypeCd);
    }

    /**
     * [set] BASE_TYPE_CD: {VARCHAR(30)} <br>
     * 拠点区分
     * @param baseTypeCd The value of the column 'BASE_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBaseTypeCd(String baseTypeCd) {
        registerModifiedProperty("baseTypeCd");
        _baseTypeCd = baseTypeCd;
    }

    /**
     * [get] BASE_NM: {VARCHAR(60)} <br>
     * 拠点名称
     * @return The value of the column 'BASE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBaseNm() {
        checkSpecifiedProperty("baseNm");
        return convertEmptyToNull(_baseNm);
    }

    /**
     * [set] BASE_NM: {VARCHAR(60)} <br>
     * 拠点名称
     * @param baseNm The value of the column 'BASE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBaseNm(String baseNm) {
        registerModifiedProperty("baseNm");
        _baseNm = baseNm;
    }

    /**
     * [get] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @return The value of the column 'SPARE_STR'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr() {
        checkSpecifiedProperty("spareStr");
        return convertEmptyToNull(_spareStr);
    }

    /**
     * [set] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @param spareStr The value of the column 'SPARE_STR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr(String spareStr) {
        registerModifiedProperty("spareStr");
        _spareStr = spareStr;
    }

    /**
     * [get] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
