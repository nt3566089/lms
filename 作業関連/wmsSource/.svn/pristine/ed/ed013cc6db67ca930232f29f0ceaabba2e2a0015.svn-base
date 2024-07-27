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
 * The entity of t_shipping_inst_b_print as TABLE. <br>
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
 * [foreign table]
 *     t_shipping_inst_b
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tShippingInstB
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long shippingInstBPrintId = entity.getShippingInstBPrintId();
 * Long shippingInstBId = entity.getShippingInstBId();
 * String hinmokuCd = entity.getHinmokuCd();
 * String hinmokuGroupCd = entity.getHinmokuGroupCd();
 * java.math.BigDecimal salesOrderNum = entity.getSalesOrderNum();
 * String logiWeightFlg = entity.getLogiWeightFlg();
 * String logiAttentionTypeCd = entity.getLogiAttentionTypeCd();
 * String logiSpecialTypeCd = entity.getLogiSpecialTypeCd();
 * Long unitPrice = entity.getUnitPrice();
 * String ecOrderBranchNo = entity.getEcOrderBranchNo();
 * String ecProductNmKanji = entity.getEcProductNmKanji();
 * String dealTypeCd = entity.getDealTypeCd();
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
 * entity.setShippingInstBPrintId(shippingInstBPrintId);
 * entity.setShippingInstBId(shippingInstBId);
 * entity.setHinmokuCd(hinmokuCd);
 * entity.setHinmokuGroupCd(hinmokuGroupCd);
 * entity.setSalesOrderNum(salesOrderNum);
 * entity.setLogiWeightFlg(logiWeightFlg);
 * entity.setLogiAttentionTypeCd(logiAttentionTypeCd);
 * entity.setLogiSpecialTypeCd(logiSpecialTypeCd);
 * entity.setUnitPrice(unitPrice);
 * entity.setEcOrderBranchNo(ecOrderBranchNo);
 * entity.setEcProductNmKanji(ecProductNmKanji);
 * entity.setDealTypeCd(dealTypeCd);
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
public abstract class BsTShippingInstBPrint extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)} */
    protected Long _shippingInstBPrintId;

    /** SHIPPING_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_b} */
    protected Long _shippingInstBId;

    /** HINMOKU_CD: {VARCHAR(30)} */
    protected String _hinmokuCd;

    /** HINMOKU_GROUP_CD: {VARCHAR(30)} */
    protected String _hinmokuGroupCd;

    /** SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _salesOrderNum;

    /** LOGI_WEIGHT_FLG: {CHAR(1)} */
    protected String _logiWeightFlg;

    /** LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} */
    protected String _logiAttentionTypeCd;

    /** LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} */
    protected String _logiSpecialTypeCd;

    /** UNIT_PRICE: {BIGINT(19)} */
    protected Long _unitPrice;

    /** EC_ORDER_BRANCH_NO: {VARCHAR(30)} */
    protected String _ecOrderBranchNo;

    /** EC_PRODUCT_NM_KANJI: {VARCHAR(60)} */
    protected String _ecProductNmKanji;

    /** DEAL_TYPE_CD: {VARCHAR(30)} */
    protected String _dealTypeCd;

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
        return "t_shipping_inst_b_print";
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
        if (_shippingInstBPrintId == null) { return false; }
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
    /** t_shipping_inst_b by my SHIPPING_INST_B_ID, named 'TShippingInstB'. */
    protected TShippingInstB _tShippingInstB;

    /**
     * [get] t_shipping_inst_b by my SHIPPING_INST_B_ID, named 'TShippingInstB'. <br>
     * @return The entity of foreign property 'TShippingInstB'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TShippingInstB getTShippingInstB() {
        return _tShippingInstB;
    }

    /**
     * [set] t_shipping_inst_b by my SHIPPING_INST_B_ID, named 'TShippingInstB'.
     * @param tShippingInstB The entity of foreign property 'TShippingInstB'. (NullAllowed)
     */
    public void setTShippingInstB(TShippingInstB tShippingInstB) {
        _tShippingInstB = tShippingInstB;
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
        if (obj instanceof BsTShippingInstBPrint) {
            BsTShippingInstBPrint other = (BsTShippingInstBPrint)obj;
            if (!xSV(_shippingInstBPrintId, other._shippingInstBPrintId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shippingInstBPrintId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tShippingInstB != null)
        { sb.append(li).append(xbRDS(_tShippingInstB, "tShippingInstB")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shippingInstBPrintId));
        sb.append(dm).append(xfND(_shippingInstBId));
        sb.append(dm).append(xfND(_hinmokuCd));
        sb.append(dm).append(xfND(_hinmokuGroupCd));
        sb.append(dm).append(xfND(_salesOrderNum));
        sb.append(dm).append(xfND(_logiWeightFlg));
        sb.append(dm).append(xfND(_logiAttentionTypeCd));
        sb.append(dm).append(xfND(_logiSpecialTypeCd));
        sb.append(dm).append(xfND(_unitPrice));
        sb.append(dm).append(xfND(_ecOrderBranchNo));
        sb.append(dm).append(xfND(_ecProductNmKanji));
        sb.append(dm).append(xfND(_dealTypeCd));
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
        if (_tShippingInstB != null)
        { sb.append(dm).append("tShippingInstB"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TShippingInstBPrint clone() {
        return (TShippingInstBPrint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)} <br>
     * 出荷指示ボディ帳票ID
     * @return The value of the column 'SHIPPING_INST_B_PRINT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippingInstBPrintId() {
        checkSpecifiedProperty("shippingInstBPrintId");
        return _shippingInstBPrintId;
    }

    /**
     * [set] SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)} <br>
     * 出荷指示ボディ帳票ID
     * @param shippingInstBPrintId The value of the column 'SHIPPING_INST_B_PRINT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShippingInstBPrintId(Long shippingInstBPrintId) {
        registerModifiedProperty("shippingInstBPrintId");
        _shippingInstBPrintId = shippingInstBPrintId;
    }

    /**
     * [get] SHIPPING_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_b} <br>
     * 出荷指示ボディID
     * @return The value of the column 'SHIPPING_INST_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippingInstBId() {
        checkSpecifiedProperty("shippingInstBId");
        return _shippingInstBId;
    }

    /**
     * [set] SHIPPING_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_b} <br>
     * 出荷指示ボディID
     * @param shippingInstBId The value of the column 'SHIPPING_INST_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShippingInstBId(Long shippingInstBId) {
        registerModifiedProperty("shippingInstBId");
        _shippingInstBId = shippingInstBId;
    }

    /**
     * [get] HINMOKU_CD: {VARCHAR(30)} <br>
     * 品目CD
     * @return The value of the column 'HINMOKU_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getHinmokuCd() {
        checkSpecifiedProperty("hinmokuCd");
        return convertEmptyToNull(_hinmokuCd);
    }

    /**
     * [set] HINMOKU_CD: {VARCHAR(30)} <br>
     * 品目CD
     * @param hinmokuCd The value of the column 'HINMOKU_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHinmokuCd(String hinmokuCd) {
        registerModifiedProperty("hinmokuCd");
        _hinmokuCd = hinmokuCd;
    }

    /**
     * [get] HINMOKU_GROUP_CD: {VARCHAR(30)} <br>
     * 品目グループ
     * @return The value of the column 'HINMOKU_GROUP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getHinmokuGroupCd() {
        checkSpecifiedProperty("hinmokuGroupCd");
        return convertEmptyToNull(_hinmokuGroupCd);
    }

    /**
     * [set] HINMOKU_GROUP_CD: {VARCHAR(30)} <br>
     * 品目グループ
     * @param hinmokuGroupCd The value of the column 'HINMOKU_GROUP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHinmokuGroupCd(String hinmokuGroupCd) {
        registerModifiedProperty("hinmokuGroupCd");
        _hinmokuGroupCd = hinmokuGroupCd;
    }

    /**
     * [get] SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 受注数量
     * @return The value of the column 'SALES_ORDER_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSalesOrderNum() {
        checkSpecifiedProperty("salesOrderNum");
        return _salesOrderNum;
    }

    /**
     * [set] SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 受注数量
     * @param salesOrderNum The value of the column 'SALES_ORDER_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrderNum(java.math.BigDecimal salesOrderNum) {
        registerModifiedProperty("salesOrderNum");
        _salesOrderNum = salesOrderNum;
    }

    /**
     * [get] LOGI_WEIGHT_FLG: {CHAR(1)} <br>
     * 物流重量物フラグ
     * @return The value of the column 'LOGI_WEIGHT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogiWeightFlg() {
        checkSpecifiedProperty("logiWeightFlg");
        return convertEmptyToNull(_logiWeightFlg);
    }

    /**
     * [set] LOGI_WEIGHT_FLG: {CHAR(1)} <br>
     * 物流重量物フラグ
     * @param logiWeightFlg The value of the column 'LOGI_WEIGHT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogiWeightFlg(String logiWeightFlg) {
        registerModifiedProperty("logiWeightFlg");
        _logiWeightFlg = logiWeightFlg;
    }

    /**
     * [get] LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} <br>
     * 物流注意区分
     * @return The value of the column 'LOGI_ATTENTION_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogiAttentionTypeCd() {
        checkSpecifiedProperty("logiAttentionTypeCd");
        return convertEmptyToNull(_logiAttentionTypeCd);
    }

    /**
     * [set] LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} <br>
     * 物流注意区分
     * @param logiAttentionTypeCd The value of the column 'LOGI_ATTENTION_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogiAttentionTypeCd(String logiAttentionTypeCd) {
        registerModifiedProperty("logiAttentionTypeCd");
        _logiAttentionTypeCd = logiAttentionTypeCd;
    }

    /**
     * [get] LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} <br>
     * 物流特殊区分
     * @return The value of the column 'LOGI_SPECIAL_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogiSpecialTypeCd() {
        checkSpecifiedProperty("logiSpecialTypeCd");
        return convertEmptyToNull(_logiSpecialTypeCd);
    }

    /**
     * [set] LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} <br>
     * 物流特殊区分
     * @param logiSpecialTypeCd The value of the column 'LOGI_SPECIAL_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogiSpecialTypeCd(String logiSpecialTypeCd) {
        registerModifiedProperty("logiSpecialTypeCd");
        _logiSpecialTypeCd = logiSpecialTypeCd;
    }

    /**
     * [get] UNIT_PRICE: {BIGINT(19)} <br>
     * 商品単価
     * @return The value of the column 'UNIT_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnitPrice() {
        checkSpecifiedProperty("unitPrice");
        return _unitPrice;
    }

    /**
     * [set] UNIT_PRICE: {BIGINT(19)} <br>
     * 商品単価
     * @param unitPrice The value of the column 'UNIT_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitPrice(Long unitPrice) {
        registerModifiedProperty("unitPrice");
        _unitPrice = unitPrice;
    }

    /**
     * [get] EC_ORDER_BRANCH_NO: {VARCHAR(30)} <br>
     * ＥＣ発注番号_枝番
     * @return The value of the column 'EC_ORDER_BRANCH_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getEcOrderBranchNo() {
        checkSpecifiedProperty("ecOrderBranchNo");
        return convertEmptyToNull(_ecOrderBranchNo);
    }

    /**
     * [set] EC_ORDER_BRANCH_NO: {VARCHAR(30)} <br>
     * ＥＣ発注番号_枝番
     * @param ecOrderBranchNo The value of the column 'EC_ORDER_BRANCH_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEcOrderBranchNo(String ecOrderBranchNo) {
        registerModifiedProperty("ecOrderBranchNo");
        _ecOrderBranchNo = ecOrderBranchNo;
    }

    /**
     * [get] EC_PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * EC品名漢字
     * @return The value of the column 'EC_PRODUCT_NM_KANJI'. (NullAllowed even if selected: for no constraint)
     */
    public String getEcProductNmKanji() {
        checkSpecifiedProperty("ecProductNmKanji");
        return convertEmptyToNull(_ecProductNmKanji);
    }

    /**
     * [set] EC_PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * EC品名漢字
     * @param ecProductNmKanji The value of the column 'EC_PRODUCT_NM_KANJI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEcProductNmKanji(String ecProductNmKanji) {
        registerModifiedProperty("ecProductNmKanji");
        _ecProductNmKanji = ecProductNmKanji;
    }

    /**
     * [get] DEAL_TYPE_CD: {VARCHAR(30)} <br>
     * 取引区分
     * @return The value of the column 'DEAL_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDealTypeCd() {
        checkSpecifiedProperty("dealTypeCd");
        return convertEmptyToNull(_dealTypeCd);
    }

    /**
     * [set] DEAL_TYPE_CD: {VARCHAR(30)} <br>
     * 取引区分
     * @param dealTypeCd The value of the column 'DEAL_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDealTypeCd(String dealTypeCd) {
        registerModifiedProperty("dealTypeCd");
        _dealTypeCd = dealTypeCd;
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
