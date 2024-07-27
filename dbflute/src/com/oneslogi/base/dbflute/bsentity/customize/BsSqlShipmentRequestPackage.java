package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlShipmentRequestPackage. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CENTER_ID, CENTER_CD, WAREHOUSE_ID, COMP_ID, COMP_CD, PRODUCT_ABBR, GROSS_WEIGHT, LENGTH, WIDTH, HEIGHT, NMFC_CODE, FREIGHT_CLS, SHIPPING_PACKING_NO, CLIENT_SHIPPING_NO
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
 * Long clientId = entity.getClientId();
 * String clientCd = entity.getClientCd();
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * String warehouseId = entity.getWarehouseId();
 * Long compId = entity.getCompId();
 * String compCd = entity.getCompCd();
 * String productAbbr = entity.getProductAbbr();
 * java.math.BigDecimal grossWeight = entity.getGrossWeight();
 * java.math.BigDecimal length = entity.getLength();
 * java.math.BigDecimal width = entity.getWidth();
 * java.math.BigDecimal height = entity.getHeight();
 * String nmfcCode = entity.getNmfcCode();
 * String freightCls = entity.getFreightCls();
 * String shippingPackingNo = entity.getShippingPackingNo();
 * String clientShippingNo = entity.getClientShippingNo();
 * entity.setClientId(clientId);
 * entity.setClientCd(clientCd);
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setWarehouseId(warehouseId);
 * entity.setCompId(compId);
 * entity.setCompCd(compCd);
 * entity.setProductAbbr(productAbbr);
 * entity.setGrossWeight(grossWeight);
 * entity.setLength(length);
 * entity.setWidth(width);
 * entity.setHeight(height);
 * entity.setNmfcCode(nmfcCode);
 * entity.setFreightCls(freightCls);
 * entity.setShippingPackingNo(shippingPackingNo);
 * entity.setClientShippingNo(clientShippingNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlShipmentRequestPackage extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CLIENT_ID: {BIGINT(20), refers to t_packing_h.CLIENT_ID} */
    protected Long _clientId;

    /** CLIENT_CD: {VARCHAR(30)} */
    protected String _clientCd;

    /** CENTER_ID: {BIGINT(20), refers to t_packing_h.CENTER_ID} */
    protected Long _centerId;

    /** CENTER_CD: {VARCHAR(30)} */
    protected String _centerCd;

    /** WAREHOUSE_ID: {VARCHAR(30)} */
    protected String _warehouseId;

    /** COMP_ID: {BIGINT(20)} */
    protected Long _compId;

    /** COMP_CD: {VARCHAR(30)} */
    protected String _compCd;

    /** PRODUCT_ABBR: {VARCHAR(60)} */
    protected String _productAbbr;

    /** GROSS_WEIGHT: {DECIMAL(36, 4)} */
    protected java.math.BigDecimal _grossWeight;

    /** LENGTH: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _length;

    /** WIDTH: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _width;

    /** HEIGHT: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _height;

    /** NMFC_CODE: {VARCHAR(30)} */
    protected String _nmfcCode;

    /** FREIGHT_CLS: {VARCHAR(100)} */
    protected String _freightCls;

    /** SHIPPING_PACKING_NO: {VARCHAR(30), refers to t_packing_h.SHIPPING_PACKING_NO} */
    protected String _shippingPackingNo;

    /** CLIENT_SHIPPING_NO: {VARCHAR(30)} */
    protected String _clientShippingNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlShipmentRequestPackageDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlShipmentRequestPackage";
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
        if (obj instanceof BsSqlShipmentRequestPackage) {
            BsSqlShipmentRequestPackage other = (BsSqlShipmentRequestPackage)obj;
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_warehouseId, other._warehouseId)) { return false; }
            if (!xSV(_compId, other._compId)) { return false; }
            if (!xSV(_compCd, other._compCd)) { return false; }
            if (!xSV(_productAbbr, other._productAbbr)) { return false; }
            if (!xSV(_grossWeight, other._grossWeight)) { return false; }
            if (!xSV(_length, other._length)) { return false; }
            if (!xSV(_width, other._width)) { return false; }
            if (!xSV(_height, other._height)) { return false; }
            if (!xSV(_nmfcCode, other._nmfcCode)) { return false; }
            if (!xSV(_freightCls, other._freightCls)) { return false; }
            if (!xSV(_shippingPackingNo, other._shippingPackingNo)) { return false; }
            if (!xSV(_clientShippingNo, other._clientShippingNo)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _warehouseId);
        hs = xCH(hs, _compId);
        hs = xCH(hs, _compCd);
        hs = xCH(hs, _productAbbr);
        hs = xCH(hs, _grossWeight);
        hs = xCH(hs, _length);
        hs = xCH(hs, _width);
        hs = xCH(hs, _height);
        hs = xCH(hs, _nmfcCode);
        hs = xCH(hs, _freightCls);
        hs = xCH(hs, _shippingPackingNo);
        hs = xCH(hs, _clientShippingNo);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_warehouseId));
        sb.append(dm).append(xfND(_compId));
        sb.append(dm).append(xfND(_compCd));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_grossWeight));
        sb.append(dm).append(xfND(_length));
        sb.append(dm).append(xfND(_width));
        sb.append(dm).append(xfND(_height));
        sb.append(dm).append(xfND(_nmfcCode));
        sb.append(dm).append(xfND(_freightCls));
        sb.append(dm).append(xfND(_shippingPackingNo));
        sb.append(dm).append(xfND(_clientShippingNo));
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
    public SqlShipmentRequestPackage clone() {
        return (SqlShipmentRequestPackage)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_ID: {BIGINT(20), refers to t_packing_h.CLIENT_ID} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {BIGINT(20), refers to t_packing_h.CLIENT_ID} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CLIENT_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {VARCHAR(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CENTER_ID: {BIGINT(20), refers to t_packing_h.CENTER_ID} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {BIGINT(20), refers to t_packing_h.CENTER_ID} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {VARCHAR(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] WAREHOUSE_ID: {VARCHAR(30)} <br>
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseId() {
        checkSpecifiedProperty("warehouseId");
        return convertEmptyToNull(_warehouseId);
    }

    /**
     * [set] WAREHOUSE_ID: {VARCHAR(30)} <br>
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseId(String warehouseId) {
        registerModifiedProperty("warehouseId");
        _warehouseId = warehouseId;
    }

    /**
     * [get] COMP_ID: {BIGINT(20)} <br>
     * @return The value of the column 'COMP_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCompId() {
        checkSpecifiedProperty("compId");
        return _compId;
    }

    /**
     * [set] COMP_ID: {BIGINT(20)} <br>
     * @param compId The value of the column 'COMP_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompId(Long compId) {
        registerModifiedProperty("compId");
        _compId = compId;
    }

    /**
     * [get] COMP_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'COMP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompCd() {
        checkSpecifiedProperty("compCd");
        return convertEmptyToNull(_compCd);
    }

    /**
     * [set] COMP_CD: {VARCHAR(30)} <br>
     * @param compCd The value of the column 'COMP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompCd(String compCd) {
        registerModifiedProperty("compCd");
        _compCd = compCd;
    }

    /**
     * [get] PRODUCT_ABBR: {VARCHAR(60)} <br>
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductAbbr() {
        checkSpecifiedProperty("productAbbr");
        return convertEmptyToNull(_productAbbr);
    }

    /**
     * [set] PRODUCT_ABBR: {VARCHAR(60)} <br>
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductAbbr(String productAbbr) {
        registerModifiedProperty("productAbbr");
        _productAbbr = productAbbr;
    }

    /**
     * [get] GROSS_WEIGHT: {DECIMAL(36, 4)} <br>
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getGrossWeight() {
        checkSpecifiedProperty("grossWeight");
        return _grossWeight;
    }

    /**
     * [set] GROSS_WEIGHT: {DECIMAL(36, 4)} <br>
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGrossWeight(java.math.BigDecimal grossWeight) {
        registerModifiedProperty("grossWeight");
        _grossWeight = grossWeight;
    }

    /**
     * [get] LENGTH: {DECIMAL(14, 4)} <br>
     * @return The value of the column 'LENGTH'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getLength() {
        checkSpecifiedProperty("length");
        return _length;
    }

    /**
     * [set] LENGTH: {DECIMAL(14, 4)} <br>
     * @param length The value of the column 'LENGTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLength(java.math.BigDecimal length) {
        registerModifiedProperty("length");
        _length = length;
    }

    /**
     * [get] WIDTH: {DECIMAL(14, 4)} <br>
     * @return The value of the column 'WIDTH'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getWidth() {
        checkSpecifiedProperty("width");
        return _width;
    }

    /**
     * [set] WIDTH: {DECIMAL(14, 4)} <br>
     * @param width The value of the column 'WIDTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWidth(java.math.BigDecimal width) {
        registerModifiedProperty("width");
        _width = width;
    }

    /**
     * [get] HEIGHT: {DECIMAL(14, 4)} <br>
     * @return The value of the column 'HEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getHeight() {
        checkSpecifiedProperty("height");
        return _height;
    }

    /**
     * [set] HEIGHT: {DECIMAL(14, 4)} <br>
     * @param height The value of the column 'HEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHeight(java.math.BigDecimal height) {
        registerModifiedProperty("height");
        _height = height;
    }

    /**
     * [get] NMFC_CODE: {VARCHAR(30)} <br>
     * @return The value of the column 'NMFC_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getNmfcCode() {
        checkSpecifiedProperty("nmfcCode");
        return convertEmptyToNull(_nmfcCode);
    }

    /**
     * [set] NMFC_CODE: {VARCHAR(30)} <br>
     * @param nmfcCode The value of the column 'NMFC_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNmfcCode(String nmfcCode) {
        registerModifiedProperty("nmfcCode");
        _nmfcCode = nmfcCode;
    }

    /**
     * [get] FREIGHT_CLS: {VARCHAR(100)} <br>
     * @return The value of the column 'FREIGHT_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getFreightCls() {
        checkSpecifiedProperty("freightCls");
        return convertEmptyToNull(_freightCls);
    }

    /**
     * [set] FREIGHT_CLS: {VARCHAR(100)} <br>
     * @param freightCls The value of the column 'FREIGHT_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFreightCls(String freightCls) {
        registerModifiedProperty("freightCls");
        _freightCls = freightCls;
    }

    /**
     * [get] SHIPPING_PACKING_NO: {VARCHAR(30), refers to t_packing_h.SHIPPING_PACKING_NO} <br>
     * 出荷梱包No.
     * @return The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingPackingNo() {
        checkSpecifiedProperty("shippingPackingNo");
        return convertEmptyToNull(_shippingPackingNo);
    }

    /**
     * [set] SHIPPING_PACKING_NO: {VARCHAR(30), refers to t_packing_h.SHIPPING_PACKING_NO} <br>
     * 出荷梱包No.
     * @param shippingPackingNo The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingPackingNo(String shippingPackingNo) {
        registerModifiedProperty("shippingPackingNo");
        _shippingPackingNo = shippingPackingNo;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientShippingNo() {
        checkSpecifiedProperty("clientShippingNo");
        return convertEmptyToNull(_clientShippingNo);
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {VARCHAR(30)} <br>
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientShippingNo(String clientShippingNo) {
        registerModifiedProperty("clientShippingNo");
        _clientShippingNo = clientShippingNo;
    }
}
