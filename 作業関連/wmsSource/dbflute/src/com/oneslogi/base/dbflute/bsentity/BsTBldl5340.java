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
 * The entity of t_bldl5340 as TABLE. <br>
 * BLDL5340
 * <pre>
 * [primary-key]
 *     BLDL5340_ID
 *
 * [column]
 *     BLDL5340_ID, YEARMONTH, MONTH, SALES_ORG_CD, SALES_ORG_NM, RELATED_CATEGORY, ROW_NO, PRODUCT_CD, DEPOSIT_JAN_CD, PRODUCT_NM, DEPOSIT_STOCK_NUM, DEPOSIT_WH_NM, DEPOSIT_USER_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5340_ID
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
 * Long bldl5340Id = entity.getBldl5340Id();
 * String yearmonth = entity.getYearmonth();
 * String month = entity.getMonth();
 * String salesOrgCd = entity.getSalesOrgCd();
 * String salesOrgNm = entity.getSalesOrgNm();
 * String relatedCategory = entity.getRelatedCategory();
 * String rowNo = entity.getRowNo();
 * String productCd = entity.getProductCd();
 * String depositJanCd = entity.getDepositJanCd();
 * String productNm = entity.getProductNm();
 * Long depositStockNum = entity.getDepositStockNum();
 * String depositWhNm = entity.getDepositWhNm();
 * String depositUserNm = entity.getDepositUserNm();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setBldl5340Id(bldl5340Id);
 * entity.setYearmonth(yearmonth);
 * entity.setMonth(month);
 * entity.setSalesOrgCd(salesOrgCd);
 * entity.setSalesOrgNm(salesOrgNm);
 * entity.setRelatedCategory(relatedCategory);
 * entity.setRowNo(rowNo);
 * entity.setProductCd(productCd);
 * entity.setDepositJanCd(depositJanCd);
 * entity.setProductNm(productNm);
 * entity.setDepositStockNum(depositStockNum);
 * entity.setDepositWhNm(depositWhNm);
 * entity.setDepositUserNm(depositUserNm);
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
public abstract class BsTBldl5340 extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BLDL5340_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _bldl5340Id;

    /** YEARMONTH: {VARCHAR(30)} */
    protected String _yearmonth;

    /** MONTH: {VARCHAR(60)} */
    protected String _month;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    protected String _salesOrgCd;

    /** SALES_ORG_NM: {VARCHAR(60)} */
    protected String _salesOrgNm;

    /** RELATED_CATEGORY: {VARCHAR(30)} */
    protected String _relatedCategory;

    /** ROW_NO: {VARCHAR(30)} */
    protected String _rowNo;

    /** PRODUCT_CD: {VARCHAR(30)} */
    protected String _productCd;

    /** DEPOSIT_JAN_CD: {VARCHAR(30)} */
    protected String _depositJanCd;

    /** PRODUCT_NM: {VARCHAR(60)} */
    protected String _productNm;

    /** DEPOSIT_STOCK_NUM: {BIGINT(19)} */
    protected Long _depositStockNum;

    /** DEPOSIT_WH_NM: {VARCHAR(60)} */
    protected String _depositWhNm;

    /** DEPOSIT_USER_NM: {VARCHAR(60)} */
    protected String _depositUserNm;

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
        return "t_bldl5340";
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
        if (_bldl5340Id == null) { return false; }
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
        if (obj instanceof BsTBldl5340) {
            BsTBldl5340 other = (BsTBldl5340)obj;
            if (!xSV(_bldl5340Id, other._bldl5340Id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _bldl5340Id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_bldl5340Id));
        sb.append(dm).append(xfND(_yearmonth));
        sb.append(dm).append(xfND(_month));
        sb.append(dm).append(xfND(_salesOrgCd));
        sb.append(dm).append(xfND(_salesOrgNm));
        sb.append(dm).append(xfND(_relatedCategory));
        sb.append(dm).append(xfND(_rowNo));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_depositJanCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_depositStockNum));
        sb.append(dm).append(xfND(_depositWhNm));
        sb.append(dm).append(xfND(_depositUserNm));
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
    public TBldl5340 clone() {
        return (TBldl5340)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BLDL5340_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5340ID
     * @return The value of the column 'BLDL5340_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBldl5340Id() {
        checkSpecifiedProperty("bldl5340Id");
        return _bldl5340Id;
    }

    /**
     * [set] BLDL5340_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5340ID
     * @param bldl5340Id The value of the column 'BLDL5340_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBldl5340Id(Long bldl5340Id) {
        registerModifiedProperty("bldl5340Id");
        _bldl5340Id = bldl5340Id;
    }

    /**
     * [get] YEARMONTH: {VARCHAR(30)} <br>
     * 年月
     * @return The value of the column 'YEARMONTH'. (NullAllowed even if selected: for no constraint)
     */
    public String getYearmonth() {
        checkSpecifiedProperty("yearmonth");
        return convertEmptyToNull(_yearmonth);
    }

    /**
     * [set] YEARMONTH: {VARCHAR(30)} <br>
     * 年月
     * @param yearmonth The value of the column 'YEARMONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setYearmonth(String yearmonth) {
        registerModifiedProperty("yearmonth");
        _yearmonth = yearmonth;
    }

    /**
     * [get] MONTH: {VARCHAR(60)} <br>
     * 対象月度
     * @return The value of the column 'MONTH'. (NullAllowed even if selected: for no constraint)
     */
    public String getMonth() {
        checkSpecifiedProperty("month");
        return convertEmptyToNull(_month);
    }

    /**
     * [set] MONTH: {VARCHAR(60)} <br>
     * 対象月度
     * @param month The value of the column 'MONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMonth(String month) {
        registerModifiedProperty("month");
        _month = month;
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
     * [get] SALES_ORG_NM: {VARCHAR(60)} <br>
     * 販売組織名称
     * @return The value of the column 'SALES_ORG_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrgNm() {
        checkSpecifiedProperty("salesOrgNm");
        return convertEmptyToNull(_salesOrgNm);
    }

    /**
     * [set] SALES_ORG_NM: {VARCHAR(60)} <br>
     * 販売組織名称
     * @param salesOrgNm The value of the column 'SALES_ORG_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgNm(String salesOrgNm) {
        registerModifiedProperty("salesOrgNm");
        _salesOrgNm = salesOrgNm;
    }

    /**
     * [get] RELATED_CATEGORY: {VARCHAR(30)} <br>
     * 関連品種
     * @return The value of the column 'RELATED_CATEGORY'. (NullAllowed even if selected: for no constraint)
     */
    public String getRelatedCategory() {
        checkSpecifiedProperty("relatedCategory");
        return convertEmptyToNull(_relatedCategory);
    }

    /**
     * [set] RELATED_CATEGORY: {VARCHAR(30)} <br>
     * 関連品種
     * @param relatedCategory The value of the column 'RELATED_CATEGORY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRelatedCategory(String relatedCategory) {
        registerModifiedProperty("relatedCategory");
        _relatedCategory = relatedCategory;
    }

    /**
     * [get] ROW_NO: {VARCHAR(30)} <br>
     * 項番
     * @return The value of the column 'ROW_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRowNo() {
        checkSpecifiedProperty("rowNo");
        return convertEmptyToNull(_rowNo);
    }

    /**
     * [set] ROW_NO: {VARCHAR(30)} <br>
     * 項番
     * @param rowNo The value of the column 'ROW_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRowNo(String rowNo) {
        registerModifiedProperty("rowNo");
        _rowNo = rowNo;
    }

    /**
     * [get] PRODUCT_CD: {VARCHAR(30)} <br>
     * 商品コード
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(30)} <br>
     * 商品コード
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] DEPOSIT_JAN_CD: {VARCHAR(30)} <br>
     * 預りJANコード
     * @return The value of the column 'DEPOSIT_JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositJanCd() {
        checkSpecifiedProperty("depositJanCd");
        return convertEmptyToNull(_depositJanCd);
    }

    /**
     * [set] DEPOSIT_JAN_CD: {VARCHAR(30)} <br>
     * 預りJANコード
     * @param depositJanCd The value of the column 'DEPOSIT_JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositJanCd(String depositJanCd) {
        registerModifiedProperty("depositJanCd");
        _depositJanCd = depositJanCd;
    }

    /**
     * [get] PRODUCT_NM: {VARCHAR(60)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {VARCHAR(60)} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] DEPOSIT_STOCK_NUM: {BIGINT(19)} <br>
     * 預り在庫数
     * @return The value of the column 'DEPOSIT_STOCK_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDepositStockNum() {
        checkSpecifiedProperty("depositStockNum");
        return _depositStockNum;
    }

    /**
     * [set] DEPOSIT_STOCK_NUM: {BIGINT(19)} <br>
     * 預り在庫数
     * @param depositStockNum The value of the column 'DEPOSIT_STOCK_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositStockNum(Long depositStockNum) {
        registerModifiedProperty("depositStockNum");
        _depositStockNum = depositStockNum;
    }

    /**
     * [get] DEPOSIT_WH_NM: {VARCHAR(60)} <br>
     * 預り倉庫
     * @return The value of the column 'DEPOSIT_WH_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositWhNm() {
        checkSpecifiedProperty("depositWhNm");
        return convertEmptyToNull(_depositWhNm);
    }

    /**
     * [set] DEPOSIT_WH_NM: {VARCHAR(60)} <br>
     * 預り倉庫
     * @param depositWhNm The value of the column 'DEPOSIT_WH_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositWhNm(String depositWhNm) {
        registerModifiedProperty("depositWhNm");
        _depositWhNm = depositWhNm;
    }

    /**
     * [get] DEPOSIT_USER_NM: {VARCHAR(60)} <br>
     * 預りユーザー名
     * @return The value of the column 'DEPOSIT_USER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositUserNm() {
        checkSpecifiedProperty("depositUserNm");
        return convertEmptyToNull(_depositUserNm);
    }

    /**
     * [set] DEPOSIT_USER_NM: {VARCHAR(60)} <br>
     * 預りユーザー名
     * @param depositUserNm The value of the column 'DEPOSIT_USER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositUserNm(String depositUserNm) {
        registerModifiedProperty("depositUserNm");
        _depositUserNm = depositUserNm;
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
