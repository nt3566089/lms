package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of h_id_manag_data as TABLE. <br>
 * 個体管理情報履歴
 * <pre>
 * [primary-key]
 *     ID_MANAG_DATA_ID
 *
 * [column]
 *     ID_MANAG_DATA_ID, ID_MANAG_NO, TENHANSHA_CD, SALES_ORG_CD, CUSTOMER_CD, PRODUCT_CD, HINMOKU_TEXT, JAN_CD, UNIT_NM, SHARED_PRODUCT_TYPE_CD, CUSTOMER_ORDER_NO, DELIV_CD, DESTINATION_ZIP_CD, DESTINATION_ADDRESS1, DESTINATION_ADDRESS2, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_TEL, EMP_ID_CD, EMP_NM, STORE_DT, INVENTORY_DT, PICKING_DT, PRODUCT_RETURN_DT, WASTE_RETURN_DT, ID_MANAG_ABOLITION_TYPE_CD, SPARE_TYPE_CD, DATA_EXT_FLG_PICKING, DATA_ADD_DT_PICKING, DATA_EXT_FLG_RETURN, DATA_ADD_DT_RETURN, DATA_EXT_FLG_WASTE, DATA_ADD_DT_WASTE, WORK_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ID_MANAG_DATA_ID
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
public abstract class BsHIdManagDataDto implements Serializable {

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
    /** ID_MANAG_DATA_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _idManagDataId;

    /** ID_MANAG_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _idManagNo;

    /** TENHANSHA_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _tenhanshaCd;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrgCd;

    /** CUSTOMER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _customerCd;

    /** PRODUCT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _productCd;

    /** HINMOKU_TEXT: {VARCHAR(60)} */
    @JsonKey
    protected String _hinmokuText;

    /** JAN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _janCd;

    /** UNIT_NM: {VARCHAR(30)} */
    @JsonKey
    protected String _unitNm;

    /** SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _sharedProductTypeCd;

    /** CUSTOMER_ORDER_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _customerOrderNo;

    /** DELIV_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _delivCd;

    /** DESTINATION_ZIP_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _destinationZipCd;

    /** DESTINATION_ADDRESS1: {VARCHAR(255)} */
    @JsonKey
    protected String _destinationAddress1;

    /** DESTINATION_ADDRESS2: {VARCHAR(255)} */
    @JsonKey
    protected String _destinationAddress2;

    /** DESTINATION_NM1: {VARCHAR(60)} */
    @JsonKey
    protected String _destinationNm1;

    /** DESTINATION_NM2: {VARCHAR(60)} */
    @JsonKey
    protected String _destinationNm2;

    /** DESTINATION_TEL: {VARCHAR(30)} */
    @JsonKey
    protected String _destinationTel;

    /** EMP_ID_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _empIdCd;

    /** EMP_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _empNm;

    /** STORE_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _storeDt;

    /** INVENTORY_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _inventoryDt;

    /** PICKING_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _pickingDt;

    /** PRODUCT_RETURN_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _productReturnDt;

    /** WASTE_RETURN_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _wasteReturnDt;

    /** ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _idManagAbolitionTypeCd;

    /** SPARE_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _spareTypeCd;

    /** DATA_EXT_FLG_PICKING: {CHAR(1)} */
    @JsonKey
    protected String _dataExtFlgPicking;

    /** DATA_ADD_DT_PICKING: {VARCHAR(8)} */
    @JsonKey
    protected String _dataAddDtPicking;

    /** DATA_EXT_FLG_RETURN: {CHAR(1)} */
    @JsonKey
    protected String _dataExtFlgReturn;

    /** DATA_ADD_DT_RETURN: {VARCHAR(8)} */
    @JsonKey
    protected String _dataAddDtReturn;

    /** DATA_EXT_FLG_WASTE: {CHAR(1)} */
    @JsonKey
    protected String _dataExtFlgWaste;

    /** DATA_ADD_DT_WASTE: {VARCHAR(8)} */
    @JsonKey
    protected String _dataAddDtWaste;

    /** WORK_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _workDt;

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
    public BsHIdManagDataDto() {
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
        if (other == null || !(other instanceof BsHIdManagDataDto)) { return false; }
        final BsHIdManagDataDto otherEntity = (BsHIdManagDataDto)other;
        if (!helpComparingValue(getIdManagDataId(), otherEntity.getIdManagDataId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "h_id_manag_data");
        result = xCH(result, getIdManagDataId());
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
        sb.append(c).append(getIdManagDataId());
        sb.append(c).append(getIdManagNo());
        sb.append(c).append(getTenhanshaCd());
        sb.append(c).append(getSalesOrgCd());
        sb.append(c).append(getCustomerCd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getHinmokuText());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getUnitNm());
        sb.append(c).append(getSharedProductTypeCd());
        sb.append(c).append(getCustomerOrderNo());
        sb.append(c).append(getDelivCd());
        sb.append(c).append(getDestinationZipCd());
        sb.append(c).append(getDestinationAddress1());
        sb.append(c).append(getDestinationAddress2());
        sb.append(c).append(getDestinationNm1());
        sb.append(c).append(getDestinationNm2());
        sb.append(c).append(getDestinationTel());
        sb.append(c).append(getEmpIdCd());
        sb.append(c).append(getEmpNm());
        sb.append(c).append(getStoreDt());
        sb.append(c).append(getInventoryDt());
        sb.append(c).append(getPickingDt());
        sb.append(c).append(getProductReturnDt());
        sb.append(c).append(getWasteReturnDt());
        sb.append(c).append(getIdManagAbolitionTypeCd());
        sb.append(c).append(getSpareTypeCd());
        sb.append(c).append(getDataExtFlgPicking());
        sb.append(c).append(getDataAddDtPicking());
        sb.append(c).append(getDataExtFlgReturn());
        sb.append(c).append(getDataAddDtReturn());
        sb.append(c).append(getDataExtFlgWaste());
        sb.append(c).append(getDataAddDtWaste());
        sb.append(c).append(getWorkDt());
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
     * [get] ID_MANAG_DATA_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 個体管理情報ID
     * @return The value of the column 'ID_MANAG_DATA_ID'. (NullAllowed)
     */
    public Long getIdManagDataId() {
        return _idManagDataId;
    }

    /**
     * [set] ID_MANAG_DATA_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 個体管理情報ID
     * @param idManagDataId The value of the column 'ID_MANAG_DATA_ID'. (NullAllowed)
     */
    public void setIdManagDataId(Long idManagDataId) {
        __modifiedProperties.add("idManagDataId");
        this._idManagDataId = idManagDataId;
    }

    /**
     * [get] ID_MANAG_NO: {VARCHAR(30)} <br>
     * 個体管理番号
     * @return The value of the column 'ID_MANAG_NO'. (NullAllowed)
     */
    public String getIdManagNo() {
        return _idManagNo;
    }

    /**
     * [set] ID_MANAG_NO: {VARCHAR(30)} <br>
     * 個体管理番号
     * @param idManagNo The value of the column 'ID_MANAG_NO'. (NullAllowed)
     */
    public void setIdManagNo(String idManagNo) {
        __modifiedProperties.add("idManagNo");
        this._idManagNo = idManagNo;
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
     * [get] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public String getCustomerCd() {
        return _customerCd;
    }

    /**
     * [set] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public void setCustomerCd(String customerCd) {
        __modifiedProperties.add("customerCd");
        this._customerCd = customerCd;
    }

    /**
     * [get] PRODUCT_CD: {VARCHAR(30)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(30)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] HINMOKU_TEXT: {VARCHAR(60)} <br>
     * 品目テキスト
     * @return The value of the column 'HINMOKU_TEXT'. (NullAllowed)
     */
    public String getHinmokuText() {
        return _hinmokuText;
    }

    /**
     * [set] HINMOKU_TEXT: {VARCHAR(60)} <br>
     * 品目テキスト
     * @param hinmokuText The value of the column 'HINMOKU_TEXT'. (NullAllowed)
     */
    public void setHinmokuText(String hinmokuText) {
        __modifiedProperties.add("hinmokuText");
        this._hinmokuText = hinmokuText;
    }

    /**
     * [get] JAN_CD: {VARCHAR(30)} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
    }

    /**
     * [get] UNIT_NM: {VARCHAR(30)} <br>
     * 単位名称
     * @return The value of the column 'UNIT_NM'. (NullAllowed)
     */
    public String getUnitNm() {
        return _unitNm;
    }

    /**
     * [set] UNIT_NM: {VARCHAR(30)} <br>
     * 単位名称
     * @param unitNm The value of the column 'UNIT_NM'. (NullAllowed)
     */
    public void setUnitNm(String unitNm) {
        __modifiedProperties.add("unitNm");
        this._unitNm = unitNm;
    }

    /**
     * [get] SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)} <br>
     * 共有商品区分
     * @return The value of the column 'SHARED_PRODUCT_TYPE_CD'. (NullAllowed)
     */
    public String getSharedProductTypeCd() {
        return _sharedProductTypeCd;
    }

    /**
     * [set] SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)} <br>
     * 共有商品区分
     * @param sharedProductTypeCd The value of the column 'SHARED_PRODUCT_TYPE_CD'. (NullAllowed)
     */
    public void setSharedProductTypeCd(String sharedProductTypeCd) {
        __modifiedProperties.add("sharedProductTypeCd");
        this._sharedProductTypeCd = sharedProductTypeCd;
    }

    /**
     * [get] CUSTOMER_ORDER_NO: {VARCHAR(30)} <br>
     * 取引先注文番号
     * @return The value of the column 'CUSTOMER_ORDER_NO'. (NullAllowed)
     */
    public String getCustomerOrderNo() {
        return _customerOrderNo;
    }

    /**
     * [set] CUSTOMER_ORDER_NO: {VARCHAR(30)} <br>
     * 取引先注文番号
     * @param customerOrderNo The value of the column 'CUSTOMER_ORDER_NO'. (NullAllowed)
     */
    public void setCustomerOrderNo(String customerOrderNo) {
        __modifiedProperties.add("customerOrderNo");
        this._customerOrderNo = customerOrderNo;
    }

    /**
     * [get] DELIV_CD: {VARCHAR(30)} <br>
     * 納入先CD
     * @return The value of the column 'DELIV_CD'. (NullAllowed)
     */
    public String getDelivCd() {
        return _delivCd;
    }

    /**
     * [set] DELIV_CD: {VARCHAR(30)} <br>
     * 納入先CD
     * @param delivCd The value of the column 'DELIV_CD'. (NullAllowed)
     */
    public void setDelivCd(String delivCd) {
        __modifiedProperties.add("delivCd");
        this._delivCd = delivCd;
    }

    /**
     * [get] DESTINATION_ZIP_CD: {VARCHAR(30)} <br>
     * 送り先郵便番号
     * @return The value of the column 'DESTINATION_ZIP_CD'. (NullAllowed)
     */
    public String getDestinationZipCd() {
        return _destinationZipCd;
    }

    /**
     * [set] DESTINATION_ZIP_CD: {VARCHAR(30)} <br>
     * 送り先郵便番号
     * @param destinationZipCd The value of the column 'DESTINATION_ZIP_CD'. (NullAllowed)
     */
    public void setDestinationZipCd(String destinationZipCd) {
        __modifiedProperties.add("destinationZipCd");
        this._destinationZipCd = destinationZipCd;
    }

    /**
     * [get] DESTINATION_ADDRESS1: {VARCHAR(255)} <br>
     * 送り先住所１
     * @return The value of the column 'DESTINATION_ADDRESS1'. (NullAllowed)
     */
    public String getDestinationAddress1() {
        return _destinationAddress1;
    }

    /**
     * [set] DESTINATION_ADDRESS1: {VARCHAR(255)} <br>
     * 送り先住所１
     * @param destinationAddress1 The value of the column 'DESTINATION_ADDRESS1'. (NullAllowed)
     */
    public void setDestinationAddress1(String destinationAddress1) {
        __modifiedProperties.add("destinationAddress1");
        this._destinationAddress1 = destinationAddress1;
    }

    /**
     * [get] DESTINATION_ADDRESS2: {VARCHAR(255)} <br>
     * 送り先住所２
     * @return The value of the column 'DESTINATION_ADDRESS2'. (NullAllowed)
     */
    public String getDestinationAddress2() {
        return _destinationAddress2;
    }

    /**
     * [set] DESTINATION_ADDRESS2: {VARCHAR(255)} <br>
     * 送り先住所２
     * @param destinationAddress2 The value of the column 'DESTINATION_ADDRESS2'. (NullAllowed)
     */
    public void setDestinationAddress2(String destinationAddress2) {
        __modifiedProperties.add("destinationAddress2");
        this._destinationAddress2 = destinationAddress2;
    }

    /**
     * [get] DESTINATION_NM1: {VARCHAR(60)} <br>
     * 送り先名称１
     * @return The value of the column 'DESTINATION_NM1'. (NullAllowed)
     */
    public String getDestinationNm1() {
        return _destinationNm1;
    }

    /**
     * [set] DESTINATION_NM1: {VARCHAR(60)} <br>
     * 送り先名称１
     * @param destinationNm1 The value of the column 'DESTINATION_NM1'. (NullAllowed)
     */
    public void setDestinationNm1(String destinationNm1) {
        __modifiedProperties.add("destinationNm1");
        this._destinationNm1 = destinationNm1;
    }

    /**
     * [get] DESTINATION_NM2: {VARCHAR(60)} <br>
     * 送り先名称２
     * @return The value of the column 'DESTINATION_NM2'. (NullAllowed)
     */
    public String getDestinationNm2() {
        return _destinationNm2;
    }

    /**
     * [set] DESTINATION_NM2: {VARCHAR(60)} <br>
     * 送り先名称２
     * @param destinationNm2 The value of the column 'DESTINATION_NM2'. (NullAllowed)
     */
    public void setDestinationNm2(String destinationNm2) {
        __modifiedProperties.add("destinationNm2");
        this._destinationNm2 = destinationNm2;
    }

    /**
     * [get] DESTINATION_TEL: {VARCHAR(30)} <br>
     * 送り先電話番号
     * @return The value of the column 'DESTINATION_TEL'. (NullAllowed)
     */
    public String getDestinationTel() {
        return _destinationTel;
    }

    /**
     * [set] DESTINATION_TEL: {VARCHAR(30)} <br>
     * 送り先電話番号
     * @param destinationTel The value of the column 'DESTINATION_TEL'. (NullAllowed)
     */
    public void setDestinationTel(String destinationTel) {
        __modifiedProperties.add("destinationTel");
        this._destinationTel = destinationTel;
    }

    /**
     * [get] EMP_ID_CD: {VARCHAR(30)} <br>
     * 社員識別コード
     * @return The value of the column 'EMP_ID_CD'. (NullAllowed)
     */
    public String getEmpIdCd() {
        return _empIdCd;
    }

    /**
     * [set] EMP_ID_CD: {VARCHAR(30)} <br>
     * 社員識別コード
     * @param empIdCd The value of the column 'EMP_ID_CD'. (NullAllowed)
     */
    public void setEmpIdCd(String empIdCd) {
        __modifiedProperties.add("empIdCd");
        this._empIdCd = empIdCd;
    }

    /**
     * [get] EMP_NM: {VARCHAR(60)} <br>
     * 氏名
     * @return The value of the column 'EMP_NM'. (NullAllowed)
     */
    public String getEmpNm() {
        return _empNm;
    }

    /**
     * [set] EMP_NM: {VARCHAR(60)} <br>
     * 氏名
     * @param empNm The value of the column 'EMP_NM'. (NullAllowed)
     */
    public void setEmpNm(String empNm) {
        __modifiedProperties.add("empNm");
        this._empNm = empNm;
    }

    /**
     * [get] STORE_DT: {VARCHAR(8)} <br>
     * 入庫日
     * @return The value of the column 'STORE_DT'. (NullAllowed)
     */
    public String getStoreDt() {
        return _storeDt;
    }

    /**
     * [set] STORE_DT: {VARCHAR(8)} <br>
     * 入庫日
     * @param storeDt The value of the column 'STORE_DT'. (NullAllowed)
     */
    public void setStoreDt(String storeDt) {
        __modifiedProperties.add("storeDt");
        this._storeDt = storeDt;
    }

    /**
     * [get] INVENTORY_DT: {VARCHAR(8)} <br>
     * 棚卸日
     * @return The value of the column 'INVENTORY_DT'. (NullAllowed)
     */
    public String getInventoryDt() {
        return _inventoryDt;
    }

    /**
     * [set] INVENTORY_DT: {VARCHAR(8)} <br>
     * 棚卸日
     * @param inventoryDt The value of the column 'INVENTORY_DT'. (NullAllowed)
     */
    public void setInventoryDt(String inventoryDt) {
        __modifiedProperties.add("inventoryDt");
        this._inventoryDt = inventoryDt;
    }

    /**
     * [get] PICKING_DT: {VARCHAR(8)} <br>
     * 出庫日
     * @return The value of the column 'PICKING_DT'. (NullAllowed)
     */
    public String getPickingDt() {
        return _pickingDt;
    }

    /**
     * [set] PICKING_DT: {VARCHAR(8)} <br>
     * 出庫日
     * @param pickingDt The value of the column 'PICKING_DT'. (NullAllowed)
     */
    public void setPickingDt(String pickingDt) {
        __modifiedProperties.add("pickingDt");
        this._pickingDt = pickingDt;
    }

    /**
     * [get] PRODUCT_RETURN_DT: {VARCHAR(8)} <br>
     * 良品返却日
     * @return The value of the column 'PRODUCT_RETURN_DT'. (NullAllowed)
     */
    public String getProductReturnDt() {
        return _productReturnDt;
    }

    /**
     * [set] PRODUCT_RETURN_DT: {VARCHAR(8)} <br>
     * 良品返却日
     * @param productReturnDt The value of the column 'PRODUCT_RETURN_DT'. (NullAllowed)
     */
    public void setProductReturnDt(String productReturnDt) {
        __modifiedProperties.add("productReturnDt");
        this._productReturnDt = productReturnDt;
    }

    /**
     * [get] WASTE_RETURN_DT: {VARCHAR(8)} <br>
     * 廃棄返却日
     * @return The value of the column 'WASTE_RETURN_DT'. (NullAllowed)
     */
    public String getWasteReturnDt() {
        return _wasteReturnDt;
    }

    /**
     * [set] WASTE_RETURN_DT: {VARCHAR(8)} <br>
     * 廃棄返却日
     * @param wasteReturnDt The value of the column 'WASTE_RETURN_DT'. (NullAllowed)
     */
    public void setWasteReturnDt(String wasteReturnDt) {
        __modifiedProperties.add("wasteReturnDt");
        this._wasteReturnDt = wasteReturnDt;
    }

    /**
     * [get] ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)} <br>
     * 個体管理廃止区分
     * @return The value of the column 'ID_MANAG_ABOLITION_TYPE_CD'. (NullAllowed)
     */
    public String getIdManagAbolitionTypeCd() {
        return _idManagAbolitionTypeCd;
    }

    /**
     * [set] ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)} <br>
     * 個体管理廃止区分
     * @param idManagAbolitionTypeCd The value of the column 'ID_MANAG_ABOLITION_TYPE_CD'. (NullAllowed)
     */
    public void setIdManagAbolitionTypeCd(String idManagAbolitionTypeCd) {
        __modifiedProperties.add("idManagAbolitionTypeCd");
        this._idManagAbolitionTypeCd = idManagAbolitionTypeCd;
    }

    /**
     * [get] SPARE_TYPE_CD: {VARCHAR(30)} <br>
     * 予備区分
     * @return The value of the column 'SPARE_TYPE_CD'. (NullAllowed)
     */
    public String getSpareTypeCd() {
        return _spareTypeCd;
    }

    /**
     * [set] SPARE_TYPE_CD: {VARCHAR(30)} <br>
     * 予備区分
     * @param spareTypeCd The value of the column 'SPARE_TYPE_CD'. (NullAllowed)
     */
    public void setSpareTypeCd(String spareTypeCd) {
        __modifiedProperties.add("spareTypeCd");
        this._spareTypeCd = spareTypeCd;
    }

    /**
     * [get] DATA_EXT_FLG_PICKING: {CHAR(1)} <br>
     * 提供データ抽出済_出庫
     * @return The value of the column 'DATA_EXT_FLG_PICKING'. (NullAllowed)
     */
    public String getDataExtFlgPicking() {
        return _dataExtFlgPicking;
    }

    /**
     * [set] DATA_EXT_FLG_PICKING: {CHAR(1)} <br>
     * 提供データ抽出済_出庫
     * @param dataExtFlgPicking The value of the column 'DATA_EXT_FLG_PICKING'. (NullAllowed)
     */
    public void setDataExtFlgPicking(String dataExtFlgPicking) {
        __modifiedProperties.add("dataExtFlgPicking");
        this._dataExtFlgPicking = dataExtFlgPicking;
    }

    /**
     * [get] DATA_ADD_DT_PICKING: {VARCHAR(8)} <br>
     * 提供データ作成日_出庫
     * @return The value of the column 'DATA_ADD_DT_PICKING'. (NullAllowed)
     */
    public String getDataAddDtPicking() {
        return _dataAddDtPicking;
    }

    /**
     * [set] DATA_ADD_DT_PICKING: {VARCHAR(8)} <br>
     * 提供データ作成日_出庫
     * @param dataAddDtPicking The value of the column 'DATA_ADD_DT_PICKING'. (NullAllowed)
     */
    public void setDataAddDtPicking(String dataAddDtPicking) {
        __modifiedProperties.add("dataAddDtPicking");
        this._dataAddDtPicking = dataAddDtPicking;
    }

    /**
     * [get] DATA_EXT_FLG_RETURN: {CHAR(1)} <br>
     * 提供データ抽出済_良返
     * @return The value of the column 'DATA_EXT_FLG_RETURN'. (NullAllowed)
     */
    public String getDataExtFlgReturn() {
        return _dataExtFlgReturn;
    }

    /**
     * [set] DATA_EXT_FLG_RETURN: {CHAR(1)} <br>
     * 提供データ抽出済_良返
     * @param dataExtFlgReturn The value of the column 'DATA_EXT_FLG_RETURN'. (NullAllowed)
     */
    public void setDataExtFlgReturn(String dataExtFlgReturn) {
        __modifiedProperties.add("dataExtFlgReturn");
        this._dataExtFlgReturn = dataExtFlgReturn;
    }

    /**
     * [get] DATA_ADD_DT_RETURN: {VARCHAR(8)} <br>
     * 提供データ作成日_良返
     * @return The value of the column 'DATA_ADD_DT_RETURN'. (NullAllowed)
     */
    public String getDataAddDtReturn() {
        return _dataAddDtReturn;
    }

    /**
     * [set] DATA_ADD_DT_RETURN: {VARCHAR(8)} <br>
     * 提供データ作成日_良返
     * @param dataAddDtReturn The value of the column 'DATA_ADD_DT_RETURN'. (NullAllowed)
     */
    public void setDataAddDtReturn(String dataAddDtReturn) {
        __modifiedProperties.add("dataAddDtReturn");
        this._dataAddDtReturn = dataAddDtReturn;
    }

    /**
     * [get] DATA_EXT_FLG_WASTE: {CHAR(1)} <br>
     * 提供データ抽出済_廃棄
     * @return The value of the column 'DATA_EXT_FLG_WASTE'. (NullAllowed)
     */
    public String getDataExtFlgWaste() {
        return _dataExtFlgWaste;
    }

    /**
     * [set] DATA_EXT_FLG_WASTE: {CHAR(1)} <br>
     * 提供データ抽出済_廃棄
     * @param dataExtFlgWaste The value of the column 'DATA_EXT_FLG_WASTE'. (NullAllowed)
     */
    public void setDataExtFlgWaste(String dataExtFlgWaste) {
        __modifiedProperties.add("dataExtFlgWaste");
        this._dataExtFlgWaste = dataExtFlgWaste;
    }

    /**
     * [get] DATA_ADD_DT_WASTE: {VARCHAR(8)} <br>
     * 提供データ作成日_廃棄
     * @return The value of the column 'DATA_ADD_DT_WASTE'. (NullAllowed)
     */
    public String getDataAddDtWaste() {
        return _dataAddDtWaste;
    }

    /**
     * [set] DATA_ADD_DT_WASTE: {VARCHAR(8)} <br>
     * 提供データ作成日_廃棄
     * @param dataAddDtWaste The value of the column 'DATA_ADD_DT_WASTE'. (NullAllowed)
     */
    public void setDataAddDtWaste(String dataAddDtWaste) {
        __modifiedProperties.add("dataAddDtWaste");
        this._dataAddDtWaste = dataAddDtWaste;
    }

    /**
     * [get] WORK_DT: {VARCHAR(8)} <br>
     * 作業日
     * @return The value of the column 'WORK_DT'. (NullAllowed)
     */
    public String getWorkDt() {
        return _workDt;
    }

    /**
     * [set] WORK_DT: {VARCHAR(8)} <br>
     * 作業日
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        __modifiedProperties.add("workDt");
        this._workDt = workDt;
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
