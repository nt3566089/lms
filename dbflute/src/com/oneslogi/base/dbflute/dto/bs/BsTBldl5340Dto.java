package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of t_bldl5340 as TABLE. <br>
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
public abstract class BsTBldl5340Dto implements Serializable {

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
    /** BLDL5340_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _bldl5340Id;

    /** YEARMONTH: {VARCHAR(30)} */
    @JsonKey
    protected String _yearmonth;

    /** MONTH: {VARCHAR(60)} */
    @JsonKey
    protected String _month;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrgCd;

    /** SALES_ORG_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _salesOrgNm;

    /** RELATED_CATEGORY: {VARCHAR(30)} */
    @JsonKey
    protected String _relatedCategory;

    /** ROW_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _rowNo;

    /** PRODUCT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _productCd;

    /** DEPOSIT_JAN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _depositJanCd;

    /** PRODUCT_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _productNm;

    /** DEPOSIT_STOCK_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _depositStockNum;

    /** DEPOSIT_WH_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _depositWhNm;

    /** DEPOSIT_USER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _depositUserNm;

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
    public BsTBldl5340Dto() {
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
        if (other == null || !(other instanceof BsTBldl5340Dto)) { return false; }
        final BsTBldl5340Dto otherEntity = (BsTBldl5340Dto)other;
        if (!helpComparingValue(getBldl5340Id(), otherEntity.getBldl5340Id())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_bldl5340");
        result = xCH(result, getBldl5340Id());
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
        sb.append(c).append(getBldl5340Id());
        sb.append(c).append(getYearmonth());
        sb.append(c).append(getMonth());
        sb.append(c).append(getSalesOrgCd());
        sb.append(c).append(getSalesOrgNm());
        sb.append(c).append(getRelatedCategory());
        sb.append(c).append(getRowNo());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getDepositJanCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getDepositStockNum());
        sb.append(c).append(getDepositWhNm());
        sb.append(c).append(getDepositUserNm());
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
     * [get] BLDL5340_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5340ID
     * @return The value of the column 'BLDL5340_ID'. (NullAllowed)
     */
    public Long getBldl5340Id() {
        return _bldl5340Id;
    }

    /**
     * [set] BLDL5340_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5340ID
     * @param bldl5340Id The value of the column 'BLDL5340_ID'. (NullAllowed)
     */
    public void setBldl5340Id(Long bldl5340Id) {
        __modifiedProperties.add("bldl5340Id");
        this._bldl5340Id = bldl5340Id;
    }

    /**
     * [get] YEARMONTH: {VARCHAR(30)} <br>
     * 年月
     * @return The value of the column 'YEARMONTH'. (NullAllowed)
     */
    public String getYearmonth() {
        return _yearmonth;
    }

    /**
     * [set] YEARMONTH: {VARCHAR(30)} <br>
     * 年月
     * @param yearmonth The value of the column 'YEARMONTH'. (NullAllowed)
     */
    public void setYearmonth(String yearmonth) {
        __modifiedProperties.add("yearmonth");
        this._yearmonth = yearmonth;
    }

    /**
     * [get] MONTH: {VARCHAR(60)} <br>
     * 対象月度
     * @return The value of the column 'MONTH'. (NullAllowed)
     */
    public String getMonth() {
        return _month;
    }

    /**
     * [set] MONTH: {VARCHAR(60)} <br>
     * 対象月度
     * @param month The value of the column 'MONTH'. (NullAllowed)
     */
    public void setMonth(String month) {
        __modifiedProperties.add("month");
        this._month = month;
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
     * [get] SALES_ORG_NM: {VARCHAR(60)} <br>
     * 販売組織名称
     * @return The value of the column 'SALES_ORG_NM'. (NullAllowed)
     */
    public String getSalesOrgNm() {
        return _salesOrgNm;
    }

    /**
     * [set] SALES_ORG_NM: {VARCHAR(60)} <br>
     * 販売組織名称
     * @param salesOrgNm The value of the column 'SALES_ORG_NM'. (NullAllowed)
     */
    public void setSalesOrgNm(String salesOrgNm) {
        __modifiedProperties.add("salesOrgNm");
        this._salesOrgNm = salesOrgNm;
    }

    /**
     * [get] RELATED_CATEGORY: {VARCHAR(30)} <br>
     * 関連品種
     * @return The value of the column 'RELATED_CATEGORY'. (NullAllowed)
     */
    public String getRelatedCategory() {
        return _relatedCategory;
    }

    /**
     * [set] RELATED_CATEGORY: {VARCHAR(30)} <br>
     * 関連品種
     * @param relatedCategory The value of the column 'RELATED_CATEGORY'. (NullAllowed)
     */
    public void setRelatedCategory(String relatedCategory) {
        __modifiedProperties.add("relatedCategory");
        this._relatedCategory = relatedCategory;
    }

    /**
     * [get] ROW_NO: {VARCHAR(30)} <br>
     * 項番
     * @return The value of the column 'ROW_NO'. (NullAllowed)
     */
    public String getRowNo() {
        return _rowNo;
    }

    /**
     * [set] ROW_NO: {VARCHAR(30)} <br>
     * 項番
     * @param rowNo The value of the column 'ROW_NO'. (NullAllowed)
     */
    public void setRowNo(String rowNo) {
        __modifiedProperties.add("rowNo");
        this._rowNo = rowNo;
    }

    /**
     * [get] PRODUCT_CD: {VARCHAR(30)} <br>
     * 商品コード
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(30)} <br>
     * 商品コード
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] DEPOSIT_JAN_CD: {VARCHAR(30)} <br>
     * 預りJANコード
     * @return The value of the column 'DEPOSIT_JAN_CD'. (NullAllowed)
     */
    public String getDepositJanCd() {
        return _depositJanCd;
    }

    /**
     * [set] DEPOSIT_JAN_CD: {VARCHAR(30)} <br>
     * 預りJANコード
     * @param depositJanCd The value of the column 'DEPOSIT_JAN_CD'. (NullAllowed)
     */
    public void setDepositJanCd(String depositJanCd) {
        __modifiedProperties.add("depositJanCd");
        this._depositJanCd = depositJanCd;
    }

    /**
     * [get] PRODUCT_NM: {VARCHAR(60)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {VARCHAR(60)} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] DEPOSIT_STOCK_NUM: {BIGINT(19)} <br>
     * 預り在庫数
     * @return The value of the column 'DEPOSIT_STOCK_NUM'. (NullAllowed)
     */
    public Long getDepositStockNum() {
        return _depositStockNum;
    }

    /**
     * [set] DEPOSIT_STOCK_NUM: {BIGINT(19)} <br>
     * 預り在庫数
     * @param depositStockNum The value of the column 'DEPOSIT_STOCK_NUM'. (NullAllowed)
     */
    public void setDepositStockNum(Long depositStockNum) {
        __modifiedProperties.add("depositStockNum");
        this._depositStockNum = depositStockNum;
    }

    /**
     * [get] DEPOSIT_WH_NM: {VARCHAR(60)} <br>
     * 預り倉庫
     * @return The value of the column 'DEPOSIT_WH_NM'. (NullAllowed)
     */
    public String getDepositWhNm() {
        return _depositWhNm;
    }

    /**
     * [set] DEPOSIT_WH_NM: {VARCHAR(60)} <br>
     * 預り倉庫
     * @param depositWhNm The value of the column 'DEPOSIT_WH_NM'. (NullAllowed)
     */
    public void setDepositWhNm(String depositWhNm) {
        __modifiedProperties.add("depositWhNm");
        this._depositWhNm = depositWhNm;
    }

    /**
     * [get] DEPOSIT_USER_NM: {VARCHAR(60)} <br>
     * 預りユーザー名
     * @return The value of the column 'DEPOSIT_USER_NM'. (NullAllowed)
     */
    public String getDepositUserNm() {
        return _depositUserNm;
    }

    /**
     * [set] DEPOSIT_USER_NM: {VARCHAR(60)} <br>
     * 預りユーザー名
     * @param depositUserNm The value of the column 'DEPOSIT_USER_NM'. (NullAllowed)
     */
    public void setDepositUserNm(String depositUserNm) {
        __modifiedProperties.add("depositUserNm");
        this._depositUserNm = depositUserNm;
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
