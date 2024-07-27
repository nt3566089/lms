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
 * The entity of t_stock_record as TABLE. <br>
 * 在庫実績情報
 * <pre>
 * [primary-key]
 *     STOCK_RECORD_ID
 *
 * [column]
 *     STOCK_RECORD_ID, CLIENT_ID, PLANT_CD, STORAGE_SPACE_CD, REFERENCE_DT, PRODUCT_CD, STOCK_NUM, PRODUCT_NM_KANJI, BARCODE, DEPOSIT_JAN_CD, TENHANSHA_CD, SALES_ORG_CD, TENHANSHA_NM1, TENHANSHA_NM2, SAP_USER_CD, SAP_USER_NM, ALLOC_TYPE_CD, COMMENT, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_RECORD_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_client
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClient
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long stockRecordId = entity.getStockRecordId();
 * Long clientId = entity.getClientId();
 * String plantCd = entity.getPlantCd();
 * String storageSpaceCd = entity.getStorageSpaceCd();
 * String referenceDt = entity.getReferenceDt();
 * String productCd = entity.getProductCd();
 * java.math.BigDecimal stockNum = entity.getStockNum();
 * String productNmKanji = entity.getProductNmKanji();
 * String barcode = entity.getBarcode();
 * String depositJanCd = entity.getDepositJanCd();
 * String tenhanshaCd = entity.getTenhanshaCd();
 * String salesOrgCd = entity.getSalesOrgCd();
 * String tenhanshaNm1 = entity.getTenhanshaNm1();
 * String tenhanshaNm2 = entity.getTenhanshaNm2();
 * String sapUserCd = entity.getSapUserCd();
 * String sapUserNm = entity.getSapUserNm();
 * String allocTypeCd = entity.getAllocTypeCd();
 * String comment = entity.getComment();
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
 * entity.setStockRecordId(stockRecordId);
 * entity.setClientId(clientId);
 * entity.setPlantCd(plantCd);
 * entity.setStorageSpaceCd(storageSpaceCd);
 * entity.setReferenceDt(referenceDt);
 * entity.setProductCd(productCd);
 * entity.setStockNum(stockNum);
 * entity.setProductNmKanji(productNmKanji);
 * entity.setBarcode(barcode);
 * entity.setDepositJanCd(depositJanCd);
 * entity.setTenhanshaCd(tenhanshaCd);
 * entity.setSalesOrgCd(salesOrgCd);
 * entity.setTenhanshaNm1(tenhanshaNm1);
 * entity.setTenhanshaNm2(tenhanshaNm2);
 * entity.setSapUserCd(sapUserCd);
 * entity.setSapUserNm(sapUserNm);
 * entity.setAllocTypeCd(allocTypeCd);
 * entity.setComment(comment);
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
public abstract class BsTStockRecord extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** STOCK_RECORD_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _stockRecordId;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    protected Long _clientId;

    /** PLANT_CD: {VARCHAR(30)} */
    protected String _plantCd;

    /** STORAGE_SPACE_CD: {VARCHAR(30)} */
    protected String _storageSpaceCd;

    /** REFERENCE_DT: {VARCHAR(8)} */
    protected String _referenceDt;

    /** PRODUCT_CD: {VARCHAR(30)} */
    protected String _productCd;

    /** STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _stockNum;

    /** PRODUCT_NM_KANJI: {VARCHAR(60)} */
    protected String _productNmKanji;

    /** BARCODE: {VARCHAR(30)} */
    protected String _barcode;

    /** DEPOSIT_JAN_CD: {VARCHAR(30)} */
    protected String _depositJanCd;

    /** TENHANSHA_CD: {VARCHAR(30)} */
    protected String _tenhanshaCd;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    protected String _salesOrgCd;

    /** TENHANSHA_NM1: {VARCHAR(60)} */
    protected String _tenhanshaNm1;

    /** TENHANSHA_NM2: {VARCHAR(60)} */
    protected String _tenhanshaNm2;

    /** SAP_USER_CD: {VARCHAR(30)} */
    protected String _sapUserCd;

    /** SAP_USER_NM: {VARCHAR(60)} */
    protected String _sapUserNm;

    /** ALLOC_TYPE_CD: {VARCHAR(30)} */
    protected String _allocTypeCd;

    /** COMMENT: {VARCHAR(255)} */
    protected String _comment;

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
        return "t_stock_record";
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
        if (_stockRecordId == null) { return false; }
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
    /** m_client by my CLIENT_ID, named 'MClient'. */
    protected MClient _mClient;

    /**
     * [get] m_client by my CLIENT_ID, named 'MClient'. <br>
     * @return The entity of foreign property 'MClient'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClient getMClient() {
        return _mClient;
    }

    /**
     * [set] m_client by my CLIENT_ID, named 'MClient'.
     * @param mClient The entity of foreign property 'MClient'. (NullAllowed)
     */
    public void setMClient(MClient mClient) {
        _mClient = mClient;
    }

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
        if (obj instanceof BsTStockRecord) {
            BsTStockRecord other = (BsTStockRecord)obj;
            if (!xSV(_stockRecordId, other._stockRecordId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _stockRecordId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_stockRecordId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_plantCd));
        sb.append(dm).append(xfND(_storageSpaceCd));
        sb.append(dm).append(xfND(_referenceDt));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_stockNum));
        sb.append(dm).append(xfND(_productNmKanji));
        sb.append(dm).append(xfND(_barcode));
        sb.append(dm).append(xfND(_depositJanCd));
        sb.append(dm).append(xfND(_tenhanshaCd));
        sb.append(dm).append(xfND(_salesOrgCd));
        sb.append(dm).append(xfND(_tenhanshaNm1));
        sb.append(dm).append(xfND(_tenhanshaNm2));
        sb.append(dm).append(xfND(_sapUserCd));
        sb.append(dm).append(xfND(_sapUserNm));
        sb.append(dm).append(xfND(_allocTypeCd));
        sb.append(dm).append(xfND(_comment));
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
        StringBuilder sb = new StringBuilder();
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TStockRecord clone() {
        return (TStockRecord)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STOCK_RECORD_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 在庫実績ID
     * @return The value of the column 'STOCK_RECORD_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStockRecordId() {
        checkSpecifiedProperty("stockRecordId");
        return _stockRecordId;
    }

    /**
     * [set] STOCK_RECORD_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 在庫実績ID
     * @param stockRecordId The value of the column 'STOCK_RECORD_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStockRecordId(Long stockRecordId) {
        registerModifiedProperty("stockRecordId");
        _stockRecordId = stockRecordId;
    }

    /**
     * [get] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
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
     * 保管場所
     * @return The value of the column 'STORAGE_SPACE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStorageSpaceCd() {
        checkSpecifiedProperty("storageSpaceCd");
        return convertEmptyToNull(_storageSpaceCd);
    }

    /**
     * [set] STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 保管場所
     * @param storageSpaceCd The value of the column 'STORAGE_SPACE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStorageSpaceCd(String storageSpaceCd) {
        registerModifiedProperty("storageSpaceCd");
        _storageSpaceCd = storageSpaceCd;
    }

    /**
     * [get] REFERENCE_DT: {VARCHAR(8)} <br>
     * 基準日
     * @return The value of the column 'REFERENCE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getReferenceDt() {
        checkSpecifiedProperty("referenceDt");
        return convertEmptyToNull(_referenceDt);
    }

    /**
     * [set] REFERENCE_DT: {VARCHAR(8)} <br>
     * 基準日
     * @param referenceDt The value of the column 'REFERENCE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReferenceDt(String referenceDt) {
        registerModifiedProperty("referenceDt");
        _referenceDt = referenceDt;
    }

    /**
     * [get] PRODUCT_CD: {VARCHAR(30)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(30)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 在庫数量
     * @return The value of the column 'STOCK_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getStockNum() {
        checkSpecifiedProperty("stockNum");
        return _stockNum;
    }

    /**
     * [set] STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 在庫数量
     * @param stockNum The value of the column 'STOCK_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockNum(java.math.BigDecimal stockNum) {
        registerModifiedProperty("stockNum");
        _stockNum = stockNum;
    }

    /**
     * [get] PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * 品名漢字
     * @return The value of the column 'PRODUCT_NM_KANJI'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNmKanji() {
        checkSpecifiedProperty("productNmKanji");
        return convertEmptyToNull(_productNmKanji);
    }

    /**
     * [set] PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * 品名漢字
     * @param productNmKanji The value of the column 'PRODUCT_NM_KANJI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNmKanji(String productNmKanji) {
        registerModifiedProperty("productNmKanji");
        _productNmKanji = productNmKanji;
    }

    /**
     * [get] BARCODE: {VARCHAR(30)} <br>
     * バーコード
     * @return The value of the column 'BARCODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getBarcode() {
        checkSpecifiedProperty("barcode");
        return convertEmptyToNull(_barcode);
    }

    /**
     * [set] BARCODE: {VARCHAR(30)} <br>
     * バーコード
     * @param barcode The value of the column 'BARCODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarcode(String barcode) {
        registerModifiedProperty("barcode");
        _barcode = barcode;
    }

    /**
     * [get] DEPOSIT_JAN_CD: {VARCHAR(30)} <br>
     * 預かりJANCD
     * @return The value of the column 'DEPOSIT_JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositJanCd() {
        checkSpecifiedProperty("depositJanCd");
        return convertEmptyToNull(_depositJanCd);
    }

    /**
     * [set] DEPOSIT_JAN_CD: {VARCHAR(30)} <br>
     * 預かりJANCD
     * @param depositJanCd The value of the column 'DEPOSIT_JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositJanCd(String depositJanCd) {
        registerModifiedProperty("depositJanCd");
        _depositJanCd = depositJanCd;
    }

    /**
     * [get] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @return The value of the column 'TENHANSHA_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaCd() {
        checkSpecifiedProperty("tenhanshaCd");
        return convertEmptyToNull(_tenhanshaCd);
    }

    /**
     * [set] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @param tenhanshaCd The value of the column 'TENHANSHA_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaCd(String tenhanshaCd) {
        registerModifiedProperty("tenhanshaCd");
        _tenhanshaCd = tenhanshaCd;
    }

    /**
     * [get] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @return The value of the column 'SALES_ORG_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrgCd() {
        checkSpecifiedProperty("salesOrgCd");
        return convertEmptyToNull(_salesOrgCd);
    }

    /**
     * [set] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @param salesOrgCd The value of the column 'SALES_ORG_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgCd(String salesOrgCd) {
        registerModifiedProperty("salesOrgCd");
        _salesOrgCd = salesOrgCd;
    }

    /**
     * [get] TENHANSHA_NM1: {VARCHAR(60)} <br>
     * 店販社名1
     * @return The value of the column 'TENHANSHA_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaNm1() {
        checkSpecifiedProperty("tenhanshaNm1");
        return convertEmptyToNull(_tenhanshaNm1);
    }

    /**
     * [set] TENHANSHA_NM1: {VARCHAR(60)} <br>
     * 店販社名1
     * @param tenhanshaNm1 The value of the column 'TENHANSHA_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaNm1(String tenhanshaNm1) {
        registerModifiedProperty("tenhanshaNm1");
        _tenhanshaNm1 = tenhanshaNm1;
    }

    /**
     * [get] TENHANSHA_NM2: {VARCHAR(60)} <br>
     * 店販社名2
     * @return The value of the column 'TENHANSHA_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaNm2() {
        checkSpecifiedProperty("tenhanshaNm2");
        return convertEmptyToNull(_tenhanshaNm2);
    }

    /**
     * [set] TENHANSHA_NM2: {VARCHAR(60)} <br>
     * 店販社名2
     * @param tenhanshaNm2 The value of the column 'TENHANSHA_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaNm2(String tenhanshaNm2) {
        registerModifiedProperty("tenhanshaNm2");
        _tenhanshaNm2 = tenhanshaNm2;
    }

    /**
     * [get] SAP_USER_CD: {VARCHAR(30)} <br>
     * SAPユーザCD
     * @return The value of the column 'SAP_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUserCd() {
        checkSpecifiedProperty("sapUserCd");
        return convertEmptyToNull(_sapUserCd);
    }

    /**
     * [set] SAP_USER_CD: {VARCHAR(30)} <br>
     * SAPユーザCD
     * @param sapUserCd The value of the column 'SAP_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUserCd(String sapUserCd) {
        registerModifiedProperty("sapUserCd");
        _sapUserCd = sapUserCd;
    }

    /**
     * [get] SAP_USER_NM: {VARCHAR(60)} <br>
     * SAPユーザ名称
     * @return The value of the column 'SAP_USER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUserNm() {
        checkSpecifiedProperty("sapUserNm");
        return convertEmptyToNull(_sapUserNm);
    }

    /**
     * [set] SAP_USER_NM: {VARCHAR(60)} <br>
     * SAPユーザ名称
     * @param sapUserNm The value of the column 'SAP_USER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUserNm(String sapUserNm) {
        registerModifiedProperty("sapUserNm");
        _sapUserNm = sapUserNm;
    }

    /**
     * [get] ALLOC_TYPE_CD: {VARCHAR(30)} <br>
     * 引当区分
     * @return The value of the column 'ALLOC_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getAllocTypeCd() {
        checkSpecifiedProperty("allocTypeCd");
        return convertEmptyToNull(_allocTypeCd);
    }

    /**
     * [set] ALLOC_TYPE_CD: {VARCHAR(30)} <br>
     * 引当区分
     * @param allocTypeCd The value of the column 'ALLOC_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocTypeCd(String allocTypeCd) {
        registerModifiedProperty("allocTypeCd");
        _allocTypeCd = allocTypeCd;
    }

    /**
     * [get] COMMENT: {VARCHAR(255)} <br>
     * 備考
     * @return The value of the column 'COMMENT'. (NullAllowed even if selected: for no constraint)
     */
    public String getComment() {
        checkSpecifiedProperty("comment");
        return convertEmptyToNull(_comment);
    }

    /**
     * [set] COMMENT: {VARCHAR(255)} <br>
     * 備考
     * @param comment The value of the column 'COMMENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setComment(String comment) {
        registerModifiedProperty("comment");
        _comment = comment;
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
