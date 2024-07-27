package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of w_product_shape_input as TABLE. <br>
 * 商品荷姿マスタ取込ワーク
 * <pre>
 * [primary-key]
 *     PRODUCT_SHAPE_INPUT_ID
 *
 * [column]
 *     PRODUCT_SHAPE_INPUT_ID, CLIENT_CD, PRODUCT_CD, SHAPE_CD, UNIT_NUM, LENGTH, WIDTH, HEIGHT, VOLUME, NET_WEIGHT, GROSS_WEIGHT, LINE_NO, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_SHAPE_INPUT_ID
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
public abstract class BsWProductShapeInputDto implements Serializable {

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
    /** PRODUCT_SHAPE_INPUT_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _productShapeInputId;

    /** CLIENT_CD: {VARCHAR(255)} */
    @JsonKey
    protected String _clientCd;

    /** PRODUCT_CD: {VARCHAR(255)} */
    @JsonKey
    protected String _productCd;

    /** SHAPE_CD: {VARCHAR(255)} */
    @JsonKey
    protected String _shapeCd;

    /** UNIT_NUM: {VARCHAR(255)} */
    @JsonKey
    protected String _unitNum;

    /** LENGTH: {VARCHAR(255)} */
    @JsonKey
    protected String _length;

    /** WIDTH: {VARCHAR(255)} */
    @JsonKey
    protected String _width;

    /** HEIGHT: {VARCHAR(255)} */
    @JsonKey
    protected String _height;

    /** VOLUME: {VARCHAR(255)} */
    @JsonKey
    protected String _volume;

    /** NET_WEIGHT: {VARCHAR(255)} */
    @JsonKey
    protected String _netWeight;

    /** GROSS_WEIGHT: {VARCHAR(255)} */
    @JsonKey
    protected String _grossWeight;

    /** LINE_NO: {NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _lineNo;

    /** WORK_FLG: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _workFlg;

    /** ERROR_FLG: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MSG: {LONGTEXT(2147483647)} */
    @JsonKey
    protected String _errorMsg;

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
    public BsWProductShapeInputDto() {
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
        if (other == null || !(other instanceof BsWProductShapeInputDto)) { return false; }
        final BsWProductShapeInputDto otherEntity = (BsWProductShapeInputDto)other;
        if (!helpComparingValue(getProductShapeInputId(), otherEntity.getProductShapeInputId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "w_product_shape_input");
        result = xCH(result, getProductShapeInputId());
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
        sb.append(c).append(getProductShapeInputId());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getShapeCd());
        sb.append(c).append(getUnitNum());
        sb.append(c).append(getLength());
        sb.append(c).append(getWidth());
        sb.append(c).append(getHeight());
        sb.append(c).append(getVolume());
        sb.append(c).append(getNetWeight());
        sb.append(c).append(getGrossWeight());
        sb.append(c).append(getLineNo());
        sb.append(c).append(getWorkFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMsg());
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
     * [get] PRODUCT_SHAPE_INPUT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 商品荷姿マスタ取込ワークID
     * @return The value of the column 'PRODUCT_SHAPE_INPUT_ID'. (NullAllowed)
     */
    public Long getProductShapeInputId() {
        return _productShapeInputId;
    }

    /**
     * [set] PRODUCT_SHAPE_INPUT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 商品荷姿マスタ取込ワークID
     * @param productShapeInputId The value of the column 'PRODUCT_SHAPE_INPUT_ID'. (NullAllowed)
     */
    public void setProductShapeInputId(Long productShapeInputId) {
        __modifiedProperties.add("productShapeInputId");
        this._productShapeInputId = productShapeInputId;
    }

    /**
     * [get] CLIENT_CD: {VARCHAR(255)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {VARCHAR(255)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] PRODUCT_CD: {VARCHAR(255)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(255)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] SHAPE_CD: {VARCHAR(255)} <br>
     * 荷姿CD
     * @return The value of the column 'SHAPE_CD'. (NullAllowed)
     */
    public String getShapeCd() {
        return _shapeCd;
    }

    /**
     * [set] SHAPE_CD: {VARCHAR(255)} <br>
     * 荷姿CD
     * @param shapeCd The value of the column 'SHAPE_CD'. (NullAllowed)
     */
    public void setShapeCd(String shapeCd) {
        __modifiedProperties.add("shapeCd");
        this._shapeCd = shapeCd;
    }

    /**
     * [get] UNIT_NUM: {VARCHAR(255)} <br>
     * 入数
     * @return The value of the column 'UNIT_NUM'. (NullAllowed)
     */
    public String getUnitNum() {
        return _unitNum;
    }

    /**
     * [set] UNIT_NUM: {VARCHAR(255)} <br>
     * 入数
     * @param unitNum The value of the column 'UNIT_NUM'. (NullAllowed)
     */
    public void setUnitNum(String unitNum) {
        __modifiedProperties.add("unitNum");
        this._unitNum = unitNum;
    }

    /**
     * [get] LENGTH: {VARCHAR(255)} <br>
     * 縦(mm)
     * @return The value of the column 'LENGTH'. (NullAllowed)
     */
    public String getLength() {
        return _length;
    }

    /**
     * [set] LENGTH: {VARCHAR(255)} <br>
     * 縦(mm)
     * @param length The value of the column 'LENGTH'. (NullAllowed)
     */
    public void setLength(String length) {
        __modifiedProperties.add("length");
        this._length = length;
    }

    /**
     * [get] WIDTH: {VARCHAR(255)} <br>
     * 横(mm)
     * @return The value of the column 'WIDTH'. (NullAllowed)
     */
    public String getWidth() {
        return _width;
    }

    /**
     * [set] WIDTH: {VARCHAR(255)} <br>
     * 横(mm)
     * @param width The value of the column 'WIDTH'. (NullAllowed)
     */
    public void setWidth(String width) {
        __modifiedProperties.add("width");
        this._width = width;
    }

    /**
     * [get] HEIGHT: {VARCHAR(255)} <br>
     * 高さ(mm)
     * @return The value of the column 'HEIGHT'. (NullAllowed)
     */
    public String getHeight() {
        return _height;
    }

    /**
     * [set] HEIGHT: {VARCHAR(255)} <br>
     * 高さ(mm)
     * @param height The value of the column 'HEIGHT'. (NullAllowed)
     */
    public void setHeight(String height) {
        __modifiedProperties.add("height");
        this._height = height;
    }

    /**
     * [get] VOLUME: {VARCHAR(255)} <br>
     * 容積(mm3)
     * @return The value of the column 'VOLUME'. (NullAllowed)
     */
    public String getVolume() {
        return _volume;
    }

    /**
     * [set] VOLUME: {VARCHAR(255)} <br>
     * 容積(mm3)
     * @param volume The value of the column 'VOLUME'. (NullAllowed)
     */
    public void setVolume(String volume) {
        __modifiedProperties.add("volume");
        this._volume = volume;
    }

    /**
     * [get] NET_WEIGHT: {VARCHAR(255)} <br>
     * 商品重量(g)
     * @return The value of the column 'NET_WEIGHT'. (NullAllowed)
     */
    public String getNetWeight() {
        return _netWeight;
    }

    /**
     * [set] NET_WEIGHT: {VARCHAR(255)} <br>
     * 商品重量(g)
     * @param netWeight The value of the column 'NET_WEIGHT'. (NullAllowed)
     */
    public void setNetWeight(String netWeight) {
        __modifiedProperties.add("netWeight");
        this._netWeight = netWeight;
    }

    /**
     * [get] GROSS_WEIGHT: {VARCHAR(255)} <br>
     * 総重量(g)
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public String getGrossWeight() {
        return _grossWeight;
    }

    /**
     * [set] GROSS_WEIGHT: {VARCHAR(255)} <br>
     * 総重量(g)
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public void setGrossWeight(String grossWeight) {
        __modifiedProperties.add("grossWeight");
        this._grossWeight = grossWeight;
    }

    /**
     * [get] LINE_NO: {NotNull, BIGINT(19)} <br>
     * 行NO.
     * @return The value of the column 'LINE_NO'. (NullAllowed)
     */
    public Long getLineNo() {
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {NotNull, BIGINT(19)} <br>
     * 行NO.
     * @param lineNo The value of the column 'LINE_NO'. (NullAllowed)
     */
    public void setLineNo(Long lineNo) {
        __modifiedProperties.add("lineNo");
        this._lineNo = lineNo;
    }

    /**
     * [get] WORK_FLG: {CHAR(1), default=[0]} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public String getWorkFlg() {
        return _workFlg;
    }

    /**
     * [set] WORK_FLG: {CHAR(1), default=[0]} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public void setWorkFlg(String workFlg) {
        __modifiedProperties.add("workFlg");
        this._workFlg = workFlg;
    }

    /**
     * [get] ERROR_FLG: {CHAR(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {CHAR(1), default=[0]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MSG: {LONGTEXT(2147483647)} <br>
     * エラー内容
     * @return The value of the column 'ERROR_MSG'. (NullAllowed)
     */
    public String getErrorMsg() {
        return _errorMsg;
    }

    /**
     * [set] ERROR_MSG: {LONGTEXT(2147483647)} <br>
     * エラー内容
     * @param errorMsg The value of the column 'ERROR_MSG'. (NullAllowed)
     */
    public void setErrorMsg(String errorMsg) {
        __modifiedProperties.add("errorMsg");
        this._errorMsg = errorMsg;
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