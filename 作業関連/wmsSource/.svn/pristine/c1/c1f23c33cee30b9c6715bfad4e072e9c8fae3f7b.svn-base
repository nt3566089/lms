package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_shipping_inst_b_print as TABLE. <br>
 * 出荷指示ボディ印刷データ
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_B_PRINT_ID
 *
 * [column]
 *     SHIPPING_INST_B_PRINT_ID, SHIPPING_INST_B_ID, HINMOKU_CD, HINMOKU_GROUP_CD, SALES_ORDER_NUM, LOGI_WEIGHT_FLG, LOGI_ATTENTION_TYPE_CD, LOGI_SPECIAL_TYPE_CD, UNIT_PRICE, EC_ORDER_BRANCH_NO, EC_PRODUCT_NM_KANJI, DEAL_TYPE_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_B_PRINT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     t_shipping_inst_b
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tShippingInstB
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTShippingInstBPrintDto implements Serializable {

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
    /** SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _shippingInstBPrintId;

    /** SHIPPING_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_b} */
    @JsonKey
    protected Long _shippingInstBId;

    /** HINMOKU_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _hinmokuCd;

    /** HINMOKU_GROUP_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _hinmokuGroupCd;

    /** SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _salesOrderNum;

    /** LOGI_WEIGHT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _logiWeightFlg;

    /** LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _logiAttentionTypeCd;

    /** LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _logiSpecialTypeCd;

    /** UNIT_PRICE: {BIGINT(19)} */
    @JsonKey
    protected Long _unitPrice;

    /** EC_ORDER_BRANCH_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _ecOrderBranchNo;

    /** EC_PRODUCT_NM_KANJI: {VARCHAR(60)} */
    @JsonKey
    protected String _ecProductNmKanji;

    /** DEAL_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _dealTypeCd;

    /** SPARE_STR: {VARCHAR(255)} */
    @JsonKey
    protected String _spareStr;

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
    public BsTShippingInstBPrintDto() {
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
    protected TShippingInstBDto _tShippingInstB;

    public TShippingInstBDto getTShippingInstB() {
        return _tShippingInstB;
    }

    public void setTShippingInstB(TShippingInstBDto tShippingInstB) {
        this._tShippingInstB = tShippingInstB;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTShippingInstBPrintDto)) { return false; }
        final BsTShippingInstBPrintDto otherEntity = (BsTShippingInstBPrintDto)other;
        if (!helpComparingValue(getShippingInstBPrintId(), otherEntity.getShippingInstBPrintId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_shipping_inst_b_print");
        result = xCH(result, getShippingInstBPrintId());
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
        sb.append(c).append(getShippingInstBPrintId());
        sb.append(c).append(getShippingInstBId());
        sb.append(c).append(getHinmokuCd());
        sb.append(c).append(getHinmokuGroupCd());
        sb.append(c).append(getSalesOrderNum());
        sb.append(c).append(getLogiWeightFlg());
        sb.append(c).append(getLogiAttentionTypeCd());
        sb.append(c).append(getLogiSpecialTypeCd());
        sb.append(c).append(getUnitPrice());
        sb.append(c).append(getEcOrderBranchNo());
        sb.append(c).append(getEcProductNmKanji());
        sb.append(c).append(getDealTypeCd());
        sb.append(c).append(getSpareStr());
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
     * [get] SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)} <br>
     * 出荷指示ボディ帳票ID
     * @return The value of the column 'SHIPPING_INST_B_PRINT_ID'. (NullAllowed)
     */
    public Long getShippingInstBPrintId() {
        return _shippingInstBPrintId;
    }

    /**
     * [set] SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)} <br>
     * 出荷指示ボディ帳票ID
     * @param shippingInstBPrintId The value of the column 'SHIPPING_INST_B_PRINT_ID'. (NullAllowed)
     */
    public void setShippingInstBPrintId(Long shippingInstBPrintId) {
        __modifiedProperties.add("shippingInstBPrintId");
        this._shippingInstBPrintId = shippingInstBPrintId;
    }

    /**
     * [get] SHIPPING_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_b} <br>
     * 出荷指示ボディID
     * @return The value of the column 'SHIPPING_INST_B_ID'. (NullAllowed)
     */
    public Long getShippingInstBId() {
        return _shippingInstBId;
    }

    /**
     * [set] SHIPPING_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_b} <br>
     * 出荷指示ボディID
     * @param shippingInstBId The value of the column 'SHIPPING_INST_B_ID'. (NullAllowed)
     */
    public void setShippingInstBId(Long shippingInstBId) {
        __modifiedProperties.add("shippingInstBId");
        this._shippingInstBId = shippingInstBId;
    }

    /**
     * [get] HINMOKU_CD: {VARCHAR(30)} <br>
     * 品目CD
     * @return The value of the column 'HINMOKU_CD'. (NullAllowed)
     */
    public String getHinmokuCd() {
        return _hinmokuCd;
    }

    /**
     * [set] HINMOKU_CD: {VARCHAR(30)} <br>
     * 品目CD
     * @param hinmokuCd The value of the column 'HINMOKU_CD'. (NullAllowed)
     */
    public void setHinmokuCd(String hinmokuCd) {
        __modifiedProperties.add("hinmokuCd");
        this._hinmokuCd = hinmokuCd;
    }

    /**
     * [get] HINMOKU_GROUP_CD: {VARCHAR(30)} <br>
     * 品目グループ
     * @return The value of the column 'HINMOKU_GROUP_CD'. (NullAllowed)
     */
    public String getHinmokuGroupCd() {
        return _hinmokuGroupCd;
    }

    /**
     * [set] HINMOKU_GROUP_CD: {VARCHAR(30)} <br>
     * 品目グループ
     * @param hinmokuGroupCd The value of the column 'HINMOKU_GROUP_CD'. (NullAllowed)
     */
    public void setHinmokuGroupCd(String hinmokuGroupCd) {
        __modifiedProperties.add("hinmokuGroupCd");
        this._hinmokuGroupCd = hinmokuGroupCd;
    }

    /**
     * [get] SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 受注数量
     * @return The value of the column 'SALES_ORDER_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getSalesOrderNum() {
        return _salesOrderNum;
    }

    /**
     * [set] SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 受注数量
     * @param salesOrderNum The value of the column 'SALES_ORDER_NUM'. (NullAllowed)
     */
    public void setSalesOrderNum(java.math.BigDecimal salesOrderNum) {
        __modifiedProperties.add("salesOrderNum");
        this._salesOrderNum = salesOrderNum;
    }

    /**
     * [get] LOGI_WEIGHT_FLG: {CHAR(1)} <br>
     * 物流重量物フラグ
     * @return The value of the column 'LOGI_WEIGHT_FLG'. (NullAllowed)
     */
    public String getLogiWeightFlg() {
        return _logiWeightFlg;
    }

    /**
     * [set] LOGI_WEIGHT_FLG: {CHAR(1)} <br>
     * 物流重量物フラグ
     * @param logiWeightFlg The value of the column 'LOGI_WEIGHT_FLG'. (NullAllowed)
     */
    public void setLogiWeightFlg(String logiWeightFlg) {
        __modifiedProperties.add("logiWeightFlg");
        this._logiWeightFlg = logiWeightFlg;
    }

    /**
     * [get] LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} <br>
     * 物流注意区分
     * @return The value of the column 'LOGI_ATTENTION_TYPE_CD'. (NullAllowed)
     */
    public String getLogiAttentionTypeCd() {
        return _logiAttentionTypeCd;
    }

    /**
     * [set] LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} <br>
     * 物流注意区分
     * @param logiAttentionTypeCd The value of the column 'LOGI_ATTENTION_TYPE_CD'. (NullAllowed)
     */
    public void setLogiAttentionTypeCd(String logiAttentionTypeCd) {
        __modifiedProperties.add("logiAttentionTypeCd");
        this._logiAttentionTypeCd = logiAttentionTypeCd;
    }

    /**
     * [get] LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} <br>
     * 物流特殊区分
     * @return The value of the column 'LOGI_SPECIAL_TYPE_CD'. (NullAllowed)
     */
    public String getLogiSpecialTypeCd() {
        return _logiSpecialTypeCd;
    }

    /**
     * [set] LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} <br>
     * 物流特殊区分
     * @param logiSpecialTypeCd The value of the column 'LOGI_SPECIAL_TYPE_CD'. (NullAllowed)
     */
    public void setLogiSpecialTypeCd(String logiSpecialTypeCd) {
        __modifiedProperties.add("logiSpecialTypeCd");
        this._logiSpecialTypeCd = logiSpecialTypeCd;
    }

    /**
     * [get] UNIT_PRICE: {BIGINT(19)} <br>
     * 商品単価
     * @return The value of the column 'UNIT_PRICE'. (NullAllowed)
     */
    public Long getUnitPrice() {
        return _unitPrice;
    }

    /**
     * [set] UNIT_PRICE: {BIGINT(19)} <br>
     * 商品単価
     * @param unitPrice The value of the column 'UNIT_PRICE'. (NullAllowed)
     */
    public void setUnitPrice(Long unitPrice) {
        __modifiedProperties.add("unitPrice");
        this._unitPrice = unitPrice;
    }

    /**
     * [get] EC_ORDER_BRANCH_NO: {VARCHAR(30)} <br>
     * ＥＣ発注番号_枝番
     * @return The value of the column 'EC_ORDER_BRANCH_NO'. (NullAllowed)
     */
    public String getEcOrderBranchNo() {
        return _ecOrderBranchNo;
    }

    /**
     * [set] EC_ORDER_BRANCH_NO: {VARCHAR(30)} <br>
     * ＥＣ発注番号_枝番
     * @param ecOrderBranchNo The value of the column 'EC_ORDER_BRANCH_NO'. (NullAllowed)
     */
    public void setEcOrderBranchNo(String ecOrderBranchNo) {
        __modifiedProperties.add("ecOrderBranchNo");
        this._ecOrderBranchNo = ecOrderBranchNo;
    }

    /**
     * [get] EC_PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * EC品名漢字
     * @return The value of the column 'EC_PRODUCT_NM_KANJI'. (NullAllowed)
     */
    public String getEcProductNmKanji() {
        return _ecProductNmKanji;
    }

    /**
     * [set] EC_PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * EC品名漢字
     * @param ecProductNmKanji The value of the column 'EC_PRODUCT_NM_KANJI'. (NullAllowed)
     */
    public void setEcProductNmKanji(String ecProductNmKanji) {
        __modifiedProperties.add("ecProductNmKanji");
        this._ecProductNmKanji = ecProductNmKanji;
    }

    /**
     * [get] DEAL_TYPE_CD: {VARCHAR(30)} <br>
     * 取引区分
     * @return The value of the column 'DEAL_TYPE_CD'. (NullAllowed)
     */
    public String getDealTypeCd() {
        return _dealTypeCd;
    }

    /**
     * [set] DEAL_TYPE_CD: {VARCHAR(30)} <br>
     * 取引区分
     * @param dealTypeCd The value of the column 'DEAL_TYPE_CD'. (NullAllowed)
     */
    public void setDealTypeCd(String dealTypeCd) {
        __modifiedProperties.add("dealTypeCd");
        this._dealTypeCd = dealTypeCd;
    }

    /**
     * [get] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @return The value of the column 'SPARE_STR'. (NullAllowed)
     */
    public String getSpareStr() {
        return _spareStr;
    }

    /**
     * [set] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @param spareStr The value of the column 'SPARE_STR'. (NullAllowed)
     */
    public void setSpareStr(String spareStr) {
        __modifiedProperties.add("spareStr");
        this._spareStr = spareStr;
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
