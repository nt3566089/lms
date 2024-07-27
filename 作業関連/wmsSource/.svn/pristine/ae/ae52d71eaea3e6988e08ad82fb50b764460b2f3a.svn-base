package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of m_deposit_product as TABLE. <br>
 * 預り商品マスタ
 * <pre>
 * [primary-key]
 *     DEPOSIT_PRODUCT_ID
 *
 * [column]
 *     DEPOSIT_PRODUCT_ID, SALES_ORG_ID, ACCOUNT_ID, ACCOUNT_CD, PRODUCT_ID, DEPOSIT_JAN_CD, ID_MANAG_TYPE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DEPOSIT_PRODUCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_sales_org, m_customer, m_product
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mSalesOrg, mCustomer, mProduct
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMDepositProductDto implements Serializable {

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
    /** DEPOSIT_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _depositProductId;

    /** SALES_ORG_ID: {IX, NotNull, BIGINT(19), FK to m_sales_org} */
    @JsonKey
    protected Long _salesOrgId;

    /** ACCOUNT_ID: {IX, BIGINT(19), FK to m_customer} */
    @JsonKey
    protected Long _accountId;

    /** ACCOUNT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _accountCd;

    /** PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} */
    @JsonKey
    protected Long _productId;

    /** DEPOSIT_JAN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _depositJanCd;

    /** ID_MANAG_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _idManagTypeCd;

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
    public BsMDepositProductDto() {
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
    protected MSalesOrgDto _mSalesOrg;

    public MSalesOrgDto getMSalesOrg() {
        return _mSalesOrg;
    }

    public void setMSalesOrg(MSalesOrgDto mSalesOrg) {
        this._mSalesOrg = mSalesOrg;
    }

    protected MCustomerDto _mCustomer;

    public MCustomerDto getMCustomer() {
        return _mCustomer;
    }

    public void setMCustomer(MCustomerDto mCustomer) {
        this._mCustomer = mCustomer;
    }

    protected MProductDto _mProduct;

    public MProductDto getMProduct() {
        return _mProduct;
    }

    public void setMProduct(MProductDto mProduct) {
        this._mProduct = mProduct;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMDepositProductDto)) { return false; }
        final BsMDepositProductDto otherEntity = (BsMDepositProductDto)other;
        if (!helpComparingValue(getDepositProductId(), otherEntity.getDepositProductId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "m_deposit_product");
        result = xCH(result, getDepositProductId());
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
        sb.append(c).append(getDepositProductId());
        sb.append(c).append(getSalesOrgId());
        sb.append(c).append(getAccountId());
        sb.append(c).append(getAccountCd());
        sb.append(c).append(getProductId());
        sb.append(c).append(getDepositJanCd());
        sb.append(c).append(getIdManagTypeCd());
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
     * [get] DEPOSIT_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 預り商品ID
     * @return The value of the column 'DEPOSIT_PRODUCT_ID'. (NullAllowed)
     */
    public Long getDepositProductId() {
        return _depositProductId;
    }

    /**
     * [set] DEPOSIT_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 預り商品ID
     * @param depositProductId The value of the column 'DEPOSIT_PRODUCT_ID'. (NullAllowed)
     */
    public void setDepositProductId(Long depositProductId) {
        __modifiedProperties.add("depositProductId");
        this._depositProductId = depositProductId;
    }

    /**
     * [get] SALES_ORG_ID: {IX, NotNull, BIGINT(19), FK to m_sales_org} <br>
     * 販売組織ID
     * @return The value of the column 'SALES_ORG_ID'. (NullAllowed)
     */
    public Long getSalesOrgId() {
        return _salesOrgId;
    }

    /**
     * [set] SALES_ORG_ID: {IX, NotNull, BIGINT(19), FK to m_sales_org} <br>
     * 販売組織ID
     * @param salesOrgId The value of the column 'SALES_ORG_ID'. (NullAllowed)
     */
    public void setSalesOrgId(Long salesOrgId) {
        __modifiedProperties.add("salesOrgId");
        this._salesOrgId = salesOrgId;
    }

    /**
     * [get] ACCOUNT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 得意先ID
     * @return The value of the column 'ACCOUNT_ID'. (NullAllowed)
     */
    public Long getAccountId() {
        return _accountId;
    }

    /**
     * [set] ACCOUNT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 得意先ID
     * @param accountId The value of the column 'ACCOUNT_ID'. (NullAllowed)
     */
    public void setAccountId(Long accountId) {
        __modifiedProperties.add("accountId");
        this._accountId = accountId;
    }

    /**
     * [get] ACCOUNT_CD: {VARCHAR(30)} <br>
     * 得意先CD
     * @return The value of the column 'ACCOUNT_CD'. (NullAllowed)
     */
    public String getAccountCd() {
        return _accountCd;
    }

    /**
     * [set] ACCOUNT_CD: {VARCHAR(30)} <br>
     * 得意先CD
     * @param accountCd The value of the column 'ACCOUNT_CD'. (NullAllowed)
     */
    public void setAccountCd(String accountCd) {
        __modifiedProperties.add("accountCd");
        this._accountCd = accountCd;
    }

    /**
     * [get] PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] DEPOSIT_JAN_CD: {VARCHAR(30)} <br>
     * 預りJANCD
     * @return The value of the column 'DEPOSIT_JAN_CD'. (NullAllowed)
     */
    public String getDepositJanCd() {
        return _depositJanCd;
    }

    /**
     * [set] DEPOSIT_JAN_CD: {VARCHAR(30)} <br>
     * 預りJANCD
     * @param depositJanCd The value of the column 'DEPOSIT_JAN_CD'. (NullAllowed)
     */
    public void setDepositJanCd(String depositJanCd) {
        __modifiedProperties.add("depositJanCd");
        this._depositJanCd = depositJanCd;
    }

    /**
     * [get] ID_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * 個体管理区分
     * @return The value of the column 'ID_MANAG_TYPE_CD'. (NullAllowed)
     */
    public String getIdManagTypeCd() {
        return _idManagTypeCd;
    }

    /**
     * [set] ID_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * 個体管理区分
     * @param idManagTypeCd The value of the column 'ID_MANAG_TYPE_CD'. (NullAllowed)
     */
    public void setIdManagTypeCd(String idManagTypeCd) {
        __modifiedProperties.add("idManagTypeCd");
        this._idManagTypeCd = idManagTypeCd;
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
