package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_picking_b as TABLE. <br>
 * 出庫ボディ
 * <pre>
 * [primary-key]
 *     PICKING_B_ID
 *
 * [column]
 *     PICKING_B_ID, PICKING_H_ID, SHIPPING_INST_B_ID, ALLOC_INST_B_ID, STOCK_ID, PICKING_NUM, TEMP_NO, TRANSIT_NUM, SHAPE_ID, PICKED_NUM, PICKING_PATERN_CD, INDV_LABEL_NO, OLD_PICKING_B_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_shape, t_picking_h, t_stock, t_shipping_inst_b, t_alloc_inst_b
 *
 * [referrer-table]
 *     t_packing_b, t_picking_record_stock
 *
 * [foreign-property]
 *     mShape, tPickingH, tStock, tShippingInstB, tAllocInstB
 *
 * [referrer-property]
 *     tPackingBList, tPickingRecordStockList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTPickingBDto implements Serializable {

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
    /** PICKING_B_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _pickingBId;

    /** PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h} */
    @JsonKey
    protected Long _pickingHId;

    /** SHIPPING_INST_B_ID: {IX, BIGINT(19), FK to t_shipping_inst_b} */
    @JsonKey
    protected Long _shippingInstBId;

    /** ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b} */
    @JsonKey
    protected Long _allocInstBId;

    /** STOCK_ID: {IX, BIGINT(19), FK to t_stock} */
    @JsonKey
    protected Long _stockId;

    /** PICKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _pickingNum;

    /** TEMP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _tempNo;

    /** TRANSIT_NUM: {DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _transitNum;

    /** SHAPE_ID: {IX, BIGINT(19), FK to m_shape} */
    @JsonKey
    protected Long _shapeId;

    /** PICKED_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _pickedNum;

    /** PICKING_PATERN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _pickingPaternCd;

    /** INDV_LABEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _indvLabelNo;

    /** OLD_PICKING_B_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _oldPickingBId;

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
    public BsTPickingBDto() {
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
    protected MShapeDto _mShape;

    public MShapeDto getMShape() {
        return _mShape;
    }

    public void setMShape(MShapeDto mShape) {
        this._mShape = mShape;
    }

    protected TPickingHDto _tPickingH;

    public TPickingHDto getTPickingH() {
        return _tPickingH;
    }

    public void setTPickingH(TPickingHDto tPickingH) {
        this._tPickingH = tPickingH;
    }

    protected TStockDto _tStock;

    public TStockDto getTStock() {
        return _tStock;
    }

    public void setTStock(TStockDto tStock) {
        this._tStock = tStock;
    }

    protected TShippingInstBDto _tShippingInstB;

    public TShippingInstBDto getTShippingInstB() {
        return _tShippingInstB;
    }

    public void setTShippingInstB(TShippingInstBDto tShippingInstB) {
        this._tShippingInstB = tShippingInstB;
    }

    protected TAllocInstBDto _tAllocInstB;

    public TAllocInstBDto getTAllocInstB() {
        return _tAllocInstB;
    }

    public void setTAllocInstB(TAllocInstBDto tAllocInstB) {
        this._tAllocInstB = tAllocInstB;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TPackingBDto> _tPackingBList;

    public List<TPackingBDto> getTPackingBList() {
        if (_tPackingBList == null) { _tPackingBList = new ArrayList<TPackingBDto>(); }
        return _tPackingBList;
    }

    public void setTPackingBList(List<TPackingBDto> tPackingBList) {
        this._tPackingBList = tPackingBList;
    }

    protected List<TPickingRecordStockDto> _tPickingRecordStockList;

    public List<TPickingRecordStockDto> getTPickingRecordStockList() {
        if (_tPickingRecordStockList == null) { _tPickingRecordStockList = new ArrayList<TPickingRecordStockDto>(); }
        return _tPickingRecordStockList;
    }

    public void setTPickingRecordStockList(List<TPickingRecordStockDto> tPickingRecordStockList) {
        this._tPickingRecordStockList = tPickingRecordStockList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTPickingBDto)) { return false; }
        final BsTPickingBDto otherEntity = (BsTPickingBDto)other;
        if (!helpComparingValue(getPickingBId(), otherEntity.getPickingBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_picking_b");
        result = xCH(result, getPickingBId());
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
        sb.append(c).append(getPickingBId());
        sb.append(c).append(getPickingHId());
        sb.append(c).append(getShippingInstBId());
        sb.append(c).append(getAllocInstBId());
        sb.append(c).append(getStockId());
        sb.append(c).append(getPickingNum());
        sb.append(c).append(getTempNo());
        sb.append(c).append(getTransitNum());
        sb.append(c).append(getShapeId());
        sb.append(c).append(getPickedNum());
        sb.append(c).append(getPickingPaternCd());
        sb.append(c).append(getIndvLabelNo());
        sb.append(c).append(getOldPickingBId());
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
     * [get] PICKING_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出庫ボディID
     * @return The value of the column 'PICKING_B_ID'. (NullAllowed)
     */
    public Long getPickingBId() {
        return _pickingBId;
    }

    /**
     * [set] PICKING_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出庫ボディID
     * @param pickingBId The value of the column 'PICKING_B_ID'. (NullAllowed)
     */
    public void setPickingBId(Long pickingBId) {
        __modifiedProperties.add("pickingBId");
        this._pickingBId = pickingBId;
    }

    /**
     * [get] PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h} <br>
     * 出庫ヘッダID
     * @return The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public Long getPickingHId() {
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h} <br>
     * 出庫ヘッダID
     * @param pickingHId The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public void setPickingHId(Long pickingHId) {
        __modifiedProperties.add("pickingHId");
        this._pickingHId = pickingHId;
    }

    /**
     * [get] SHIPPING_INST_B_ID: {IX, BIGINT(19), FK to t_shipping_inst_b} <br>
     * 出荷指示ボディID
     * @return The value of the column 'SHIPPING_INST_B_ID'. (NullAllowed)
     */
    public Long getShippingInstBId() {
        return _shippingInstBId;
    }

    /**
     * [set] SHIPPING_INST_B_ID: {IX, BIGINT(19), FK to t_shipping_inst_b} <br>
     * 出荷指示ボディID
     * @param shippingInstBId The value of the column 'SHIPPING_INST_B_ID'. (NullAllowed)
     */
    public void setShippingInstBId(Long shippingInstBId) {
        __modifiedProperties.add("shippingInstBId");
        this._shippingInstBId = shippingInstBId;
    }

    /**
     * [get] ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b} <br>
     * 引当指示ボディID
     * @return The value of the column 'ALLOC_INST_B_ID'. (NullAllowed)
     */
    public Long getAllocInstBId() {
        return _allocInstBId;
    }

    /**
     * [set] ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b} <br>
     * 引当指示ボディID
     * @param allocInstBId The value of the column 'ALLOC_INST_B_ID'. (NullAllowed)
     */
    public void setAllocInstBId(Long allocInstBId) {
        __modifiedProperties.add("allocInstBId");
        this._allocInstBId = allocInstBId;
    }

    /**
     * [get] STOCK_ID: {IX, BIGINT(19), FK to t_stock} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public Long getStockId() {
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {IX, BIGINT(19), FK to t_stock} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public void setStockId(Long stockId) {
        __modifiedProperties.add("stockId");
        this._stockId = stockId;
    }

    /**
     * [get] PICKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 出庫数
     * @return The value of the column 'PICKING_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getPickingNum() {
        return _pickingNum;
    }

    /**
     * [set] PICKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 出庫数
     * @param pickingNum The value of the column 'PICKING_NUM'. (NullAllowed)
     */
    public void setPickingNum(java.math.BigDecimal pickingNum) {
        __modifiedProperties.add("pickingNum");
        this._pickingNum = pickingNum;
    }

    /**
     * [get] TEMP_NO: {VARCHAR(30)} <br>
     * 仮置きNo.
     * @return The value of the column 'TEMP_NO'. (NullAllowed)
     */
    public String getTempNo() {
        return _tempNo;
    }

    /**
     * [set] TEMP_NO: {VARCHAR(30)} <br>
     * 仮置きNo.
     * @param tempNo The value of the column 'TEMP_NO'. (NullAllowed)
     */
    public void setTempNo(String tempNo) {
        __modifiedProperties.add("tempNo");
        this._tempNo = tempNo;
    }

    /**
     * [get] TRANSIT_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 積送中数
     * @return The value of the column 'TRANSIT_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getTransitNum() {
        return _transitNum;
    }

    /**
     * [set] TRANSIT_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 積送中数
     * @param transitNum The value of the column 'TRANSIT_NUM'. (NullAllowed)
     */
    public void setTransitNum(java.math.BigDecimal transitNum) {
        __modifiedProperties.add("transitNum");
        this._transitNum = transitNum;
    }

    /**
     * [get] SHAPE_ID: {IX, BIGINT(19), FK to m_shape} <br>
     * 荷姿ID
     * @return The value of the column 'SHAPE_ID'. (NullAllowed)
     */
    public Long getShapeId() {
        return _shapeId;
    }

    /**
     * [set] SHAPE_ID: {IX, BIGINT(19), FK to m_shape} <br>
     * 荷姿ID
     * @param shapeId The value of the column 'SHAPE_ID'. (NullAllowed)
     */
    public void setShapeId(Long shapeId) {
        __modifiedProperties.add("shapeId");
        this._shapeId = shapeId;
    }

    /**
     * [get] PICKED_NUM: {BIGINT(19)} <br>
     * ピッキング済数
     * @return The value of the column 'PICKED_NUM'. (NullAllowed)
     */
    public Long getPickedNum() {
        return _pickedNum;
    }

    /**
     * [set] PICKED_NUM: {BIGINT(19)} <br>
     * ピッキング済数
     * @param pickedNum The value of the column 'PICKED_NUM'. (NullAllowed)
     */
    public void setPickedNum(Long pickedNum) {
        __modifiedProperties.add("pickedNum");
        this._pickedNum = pickedNum;
    }

    /**
     * [get] PICKING_PATERN_CD: {VARCHAR(30)} <br>
     * ピッキングパターンCD
     * @return The value of the column 'PICKING_PATERN_CD'. (NullAllowed)
     */
    public String getPickingPaternCd() {
        return _pickingPaternCd;
    }

    /**
     * [set] PICKING_PATERN_CD: {VARCHAR(30)} <br>
     * ピッキングパターンCD
     * @param pickingPaternCd The value of the column 'PICKING_PATERN_CD'. (NullAllowed)
     */
    public void setPickingPaternCd(String pickingPaternCd) {
        __modifiedProperties.add("pickingPaternCd");
        this._pickingPaternCd = pickingPaternCd;
    }

    /**
     * [get] INDV_LABEL_NO: {VARCHAR(30)} <br>
     * 個別貼付ラベルNO
     * @return The value of the column 'INDV_LABEL_NO'. (NullAllowed)
     */
    public String getIndvLabelNo() {
        return _indvLabelNo;
    }

    /**
     * [set] INDV_LABEL_NO: {VARCHAR(30)} <br>
     * 個別貼付ラベルNO
     * @param indvLabelNo The value of the column 'INDV_LABEL_NO'. (NullAllowed)
     */
    public void setIndvLabelNo(String indvLabelNo) {
        __modifiedProperties.add("indvLabelNo");
        this._indvLabelNo = indvLabelNo;
    }

    /**
     * [get] OLD_PICKING_B_ID: {BIGINT(19)} <br>
     * 元出庫ボディID
     * @return The value of the column 'OLD_PICKING_B_ID'. (NullAllowed)
     */
    public Long getOldPickingBId() {
        return _oldPickingBId;
    }

    /**
     * [set] OLD_PICKING_B_ID: {BIGINT(19)} <br>
     * 元出庫ボディID
     * @param oldPickingBId The value of the column 'OLD_PICKING_B_ID'. (NullAllowed)
     */
    public void setOldPickingBId(Long oldPickingBId) {
        __modifiedProperties.add("oldPickingBId");
        this._oldPickingBId = oldPickingBId;
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
