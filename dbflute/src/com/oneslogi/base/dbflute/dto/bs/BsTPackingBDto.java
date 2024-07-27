package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_packing_b as TABLE. <br>
 * 梱包ボディ
 * <pre>
 * [primary-key]
 *     PACKING_B_ID
 *
 * [column]
 *     PACKING_B_ID, PACKING_H_ID, PICKING_B_ID, ALLOC_INST_B_ID, PACKING_NUM, PICKING_FLG, INSPECTION_FLG, CASE_PICKING_NO, SHIPPING_PACKING_ROW_NO, OLD_PACKING_B_ID, RECEIVE_LABEL_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     t_packing_h, t_alloc_inst_b, t_picking_b, b_class_dtl(ByInspectionFlg)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tPackingH, tAllocInstB, tPickingB, bClassDtlByInspectionFlg, bClassDtlByPickingFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTPackingBDto implements Serializable {

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
    /** PACKING_B_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _packingBId;

    /** PACKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_packing_h} */
    @JsonKey
    protected Long _packingHId;

    /** PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b} */
    @JsonKey
    protected Long _pickingBId;

    /** ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b} */
    @JsonKey
    protected Long _allocInstBId;

    /** PACKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _packingNum;

    /** PICKING_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg} */
    @JsonKey
    protected String _pickingFlg;

    /** INSPECTION_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} */
    @JsonKey
    protected String _inspectionFlg;

    /** CASE_PICKING_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _casePickingNo;

    /** SHIPPING_PACKING_ROW_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingPackingRowNo;

    /** OLD_PACKING_B_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _oldPackingBId;

    /** RECEIVE_LABEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _receiveLabelNo;

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
    public BsTPackingBDto() {
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
    protected TPackingHDto _tPackingH;

    public TPackingHDto getTPackingH() {
        return _tPackingH;
    }

    public void setTPackingH(TPackingHDto tPackingH) {
        this._tPackingH = tPackingH;
    }

    protected TAllocInstBDto _tAllocInstB;

    public TAllocInstBDto getTAllocInstB() {
        return _tAllocInstB;
    }

    public void setTAllocInstB(TAllocInstBDto tAllocInstB) {
        this._tAllocInstB = tAllocInstB;
    }

    protected TPickingBDto _tPickingB;

    public TPickingBDto getTPickingB() {
        return _tPickingB;
    }

    public void setTPickingB(TPickingBDto tPickingB) {
        this._tPickingB = tPickingB;
    }

    protected BClassDtlDto _bClassDtlByInspectionFlg;

    public BClassDtlDto getBClassDtlByInspectionFlg() {
        return _bClassDtlByInspectionFlg;
    }

    public void setBClassDtlByInspectionFlg(BClassDtlDto bClassDtlByInspectionFlg) {
        this._bClassDtlByInspectionFlg = bClassDtlByInspectionFlg;
    }

    protected BClassDtlDto _bClassDtlByPickingFlg;

    public BClassDtlDto getBClassDtlByPickingFlg() {
        return _bClassDtlByPickingFlg;
    }

    public void setBClassDtlByPickingFlg(BClassDtlDto bClassDtlByPickingFlg) {
        this._bClassDtlByPickingFlg = bClassDtlByPickingFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTPackingBDto)) { return false; }
        final BsTPackingBDto otherEntity = (BsTPackingBDto)other;
        if (!helpComparingValue(getPackingBId(), otherEntity.getPackingBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_packing_b");
        result = xCH(result, getPackingBId());
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
        sb.append(c).append(getPackingBId());
        sb.append(c).append(getPackingHId());
        sb.append(c).append(getPickingBId());
        sb.append(c).append(getAllocInstBId());
        sb.append(c).append(getPackingNum());
        sb.append(c).append(getPickingFlg());
        sb.append(c).append(getInspectionFlg());
        sb.append(c).append(getCasePickingNo());
        sb.append(c).append(getShippingPackingRowNo());
        sb.append(c).append(getOldPackingBId());
        sb.append(c).append(getReceiveLabelNo());
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
     * [get] PACKING_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 梱包ボディID
     * @return The value of the column 'PACKING_B_ID'. (NullAllowed)
     */
    public Long getPackingBId() {
        return _packingBId;
    }

    /**
     * [set] PACKING_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 梱包ボディID
     * @param packingBId The value of the column 'PACKING_B_ID'. (NullAllowed)
     */
    public void setPackingBId(Long packingBId) {
        __modifiedProperties.add("packingBId");
        this._packingBId = packingBId;
    }

    /**
     * [get] PACKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_packing_h} <br>
     * 梱包ヘッダID
     * @return The value of the column 'PACKING_H_ID'. (NullAllowed)
     */
    public Long getPackingHId() {
        return _packingHId;
    }

    /**
     * [set] PACKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_packing_h} <br>
     * 梱包ヘッダID
     * @param packingHId The value of the column 'PACKING_H_ID'. (NullAllowed)
     */
    public void setPackingHId(Long packingHId) {
        __modifiedProperties.add("packingHId");
        this._packingHId = packingHId;
    }

    /**
     * [get] PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b} <br>
     * 出庫ボディID
     * @return The value of the column 'PICKING_B_ID'. (NullAllowed)
     */
    public Long getPickingBId() {
        return _pickingBId;
    }

    /**
     * [set] PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b} <br>
     * 出庫ボディID
     * @param pickingBId The value of the column 'PICKING_B_ID'. (NullAllowed)
     */
    public void setPickingBId(Long pickingBId) {
        __modifiedProperties.add("pickingBId");
        this._pickingBId = pickingBId;
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
     * [get] PACKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 梱包数
     * @return The value of the column 'PACKING_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum() {
        return _packingNum;
    }

    /**
     * [set] PACKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 梱包数
     * @param packingNum The value of the column 'PACKING_NUM'. (NullAllowed)
     */
    public void setPackingNum(java.math.BigDecimal packingNum) {
        __modifiedProperties.add("packingNum");
        this._packingNum = packingNum;
    }

    /**
     * [get] PICKING_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg} <br>
     * 出庫フラグ
     * @return The value of the column 'PICKING_FLG'. (NullAllowed)
     */
    public String getPickingFlg() {
        return _pickingFlg;
    }

    /**
     * [set] PICKING_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg} <br>
     * 出庫フラグ
     * @param pickingFlg The value of the column 'PICKING_FLG'. (NullAllowed)
     */
    public void setPickingFlg(String pickingFlg) {
        __modifiedProperties.add("pickingFlg");
        this._pickingFlg = pickingFlg;
    }

    /**
     * [get] INSPECTION_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} <br>
     * 検品フラグ
     * @return The value of the column 'INSPECTION_FLG'. (NullAllowed)
     */
    public String getInspectionFlg() {
        return _inspectionFlg;
    }

    /**
     * [set] INSPECTION_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} <br>
     * 検品フラグ
     * @param inspectionFlg The value of the column 'INSPECTION_FLG'. (NullAllowed)
     */
    public void setInspectionFlg(String inspectionFlg) {
        __modifiedProperties.add("inspectionFlg");
        this._inspectionFlg = inspectionFlg;
    }

    /**
     * [get] CASE_PICKING_NO: {VARCHAR(30)} <br>
     * ケースピッキングNo.
     * @return The value of the column 'CASE_PICKING_NO'. (NullAllowed)
     */
    public String getCasePickingNo() {
        return _casePickingNo;
    }

    /**
     * [set] CASE_PICKING_NO: {VARCHAR(30)} <br>
     * ケースピッキングNo.
     * @param casePickingNo The value of the column 'CASE_PICKING_NO'. (NullAllowed)
     */
    public void setCasePickingNo(String casePickingNo) {
        __modifiedProperties.add("casePickingNo");
        this._casePickingNo = casePickingNo;
    }

    /**
     * [get] SHIPPING_PACKING_ROW_NO: {VARCHAR(30)} <br>
     * 出荷梱包明細No
     * @return The value of the column 'SHIPPING_PACKING_ROW_NO'. (NullAllowed)
     */
    public String getShippingPackingRowNo() {
        return _shippingPackingRowNo;
    }

    /**
     * [set] SHIPPING_PACKING_ROW_NO: {VARCHAR(30)} <br>
     * 出荷梱包明細No
     * @param shippingPackingRowNo The value of the column 'SHIPPING_PACKING_ROW_NO'. (NullAllowed)
     */
    public void setShippingPackingRowNo(String shippingPackingRowNo) {
        __modifiedProperties.add("shippingPackingRowNo");
        this._shippingPackingRowNo = shippingPackingRowNo;
    }

    /**
     * [get] OLD_PACKING_B_ID: {BIGINT(19)} <br>
     * 元梱包ボディID
     * @return The value of the column 'OLD_PACKING_B_ID'. (NullAllowed)
     */
    public Long getOldPackingBId() {
        return _oldPackingBId;
    }

    /**
     * [set] OLD_PACKING_B_ID: {BIGINT(19)} <br>
     * 元梱包ボディID
     * @param oldPackingBId The value of the column 'OLD_PACKING_B_ID'. (NullAllowed)
     */
    public void setOldPackingBId(Long oldPackingBId) {
        __modifiedProperties.add("oldPackingBId");
        this._oldPackingBId = oldPackingBId;
    }

    /**
     * [get] RECEIVE_LABEL_NO: {VARCHAR(30)} <br>
     * 入荷ラベルNo
     * @return The value of the column 'RECEIVE_LABEL_NO'. (NullAllowed)
     */
    public String getReceiveLabelNo() {
        return _receiveLabelNo;
    }

    /**
     * [set] RECEIVE_LABEL_NO: {VARCHAR(30)} <br>
     * 入荷ラベルNo
     * @param receiveLabelNo The value of the column 'RECEIVE_LABEL_NO'. (NullAllowed)
     */
    public void setReceiveLabelNo(String receiveLabelNo) {
        __modifiedProperties.add("receiveLabelNo");
        this._receiveLabelNo = receiveLabelNo;
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