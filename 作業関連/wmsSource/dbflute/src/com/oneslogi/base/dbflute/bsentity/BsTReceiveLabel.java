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
 * The entity of t_receive_label as TABLE. <br>
 * 入荷ラベル
 * <pre>
 * [primary-key]
 *     RECEIVE_LABEL_ID
 *
 * [column]
 *     RECEIVE_LABEL_ID, STOCK_ID, RECEIVE_LABEL_NO, NUM, OWNER_CD, OWNER_ABBR, RECOMMEND_LOCATION_CD, LOCATION_CD, JANCD, PRODUCT_NM, UNIT_NM, LOT, LIMIT_DT, PROD_DT, RECEIVE_DT, DEPOSIT_FLG, REPRINT_FLG, RECEIVE_UNIT_NUM, RECEIVE_PLAN_B_ID, RCV_LBL_OUT_USER_ID, RCV_LBL_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_LABEL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_receive_plan_b, t_stock, b_user
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tReceivePlanB, tStock, bUser
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long receiveLabelId = entity.getReceiveLabelId();
 * Long stockId = entity.getStockId();
 * String receiveLabelNo = entity.getReceiveLabelNo();
 * java.math.BigDecimal num = entity.getNum();
 * String ownerCd = entity.getOwnerCd();
 * String ownerAbbr = entity.getOwnerAbbr();
 * String recommendLocationCd = entity.getRecommendLocationCd();
 * String locationCd = entity.getLocationCd();
 * String jancd = entity.getJancd();
 * String productNm = entity.getProductNm();
 * String unitNm = entity.getUnitNm();
 * String lot = entity.getLot();
 * String limitDt = entity.getLimitDt();
 * String prodDt = entity.getProdDt();
 * String receiveDt = entity.getReceiveDt();
 * String depositFlg = entity.getDepositFlg();
 * String reprintFlg = entity.getReprintFlg();
 * Long receiveUnitNum = entity.getReceiveUnitNum();
 * Long receivePlanBId = entity.getReceivePlanBId();
 * Long rcvLblOutUserId = entity.getRcvLblOutUserId();
 * java.sql.Timestamp rcvLblOutDt = entity.getRcvLblOutDt();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setReceiveLabelId(receiveLabelId);
 * entity.setStockId(stockId);
 * entity.setReceiveLabelNo(receiveLabelNo);
 * entity.setNum(num);
 * entity.setOwnerCd(ownerCd);
 * entity.setOwnerAbbr(ownerAbbr);
 * entity.setRecommendLocationCd(recommendLocationCd);
 * entity.setLocationCd(locationCd);
 * entity.setJancd(jancd);
 * entity.setProductNm(productNm);
 * entity.setUnitNm(unitNm);
 * entity.setLot(lot);
 * entity.setLimitDt(limitDt);
 * entity.setProdDt(prodDt);
 * entity.setReceiveDt(receiveDt);
 * entity.setDepositFlg(depositFlg);
 * entity.setReprintFlg(reprintFlg);
 * entity.setReceiveUnitNum(receiveUnitNum);
 * entity.setReceivePlanBId(receivePlanBId);
 * entity.setRcvLblOutUserId(rcvLblOutUserId);
 * entity.setRcvLblOutDt(rcvLblOutDt);
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
public abstract class BsTReceiveLabel extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _receiveLabelId;

    /** STOCK_ID: {IX, NotNull, BIGINT(19), FK to t_stock} */
    protected Long _stockId;

    /** RECEIVE_LABEL_NO: {IX, VARCHAR(255)} */
    protected String _receiveLabelNo;

    /** NUM: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _num;

    /** OWNER_CD: {VARCHAR(30)} */
    protected String _ownerCd;

    /** OWNER_ABBR: {VARCHAR(60)} */
    protected String _ownerAbbr;

    /** RECOMMEND_LOCATION_CD: {VARCHAR(30)} */
    protected String _recommendLocationCd;

    /** LOCATION_CD: {VARCHAR(30)} */
    protected String _locationCd;

    /** JANCD: {VARCHAR(30)} */
    protected String _jancd;

    /** PRODUCT_NM: {VARCHAR(60)} */
    protected String _productNm;

    /** UNIT_NM: {VARCHAR(60)} */
    protected String _unitNm;

    /** LOT: {VARCHAR(30)} */
    protected String _lot;

    /** LIMIT_DT: {VARCHAR(8)} */
    protected String _limitDt;

    /** PROD_DT: {VARCHAR(8)} */
    protected String _prodDt;

    /** RECEIVE_DT: {VARCHAR(8)} */
    protected String _receiveDt;

    /** DEPOSIT_FLG: {CHAR(1)} */
    protected String _depositFlg;

    /** REPRINT_FLG: {CHAR(1)} */
    protected String _reprintFlg;

    /** RECEIVE_UNIT_NUM: {BIGINT(19)} */
    protected Long _receiveUnitNum;

    /** RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b} */
    protected Long _receivePlanBId;

    /** RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    protected Long _rcvLblOutUserId;

    /** RCV_LBL_OUT_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _rcvLblOutDt;

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
        return "t_receive_label";
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
        if (_receiveLabelId == null) { return false; }
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
    /** t_receive_plan_b by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'. */
    protected TReceivePlanB _tReceivePlanB;

    /**
     * [get] t_receive_plan_b by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'. <br>
     * @return The entity of foreign property 'TReceivePlanB'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TReceivePlanB getTReceivePlanB() {
        return _tReceivePlanB;
    }

    /**
     * [set] t_receive_plan_b by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'.
     * @param tReceivePlanB The entity of foreign property 'TReceivePlanB'. (NullAllowed)
     */
    public void setTReceivePlanB(TReceivePlanB tReceivePlanB) {
        _tReceivePlanB = tReceivePlanB;
    }

    /** t_stock by my STOCK_ID, named 'TStock'. */
    protected TStock _tStock;

    /**
     * [get] t_stock by my STOCK_ID, named 'TStock'. <br>
     * @return The entity of foreign property 'TStock'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TStock getTStock() {
        return _tStock;
    }

    /**
     * [set] t_stock by my STOCK_ID, named 'TStock'.
     * @param tStock The entity of foreign property 'TStock'. (NullAllowed)
     */
    public void setTStock(TStock tStock) {
        _tStock = tStock;
    }

    /** b_user by my RCV_LBL_OUT_USER_ID, named 'BUser'. */
    protected BUser _bUser;

    /**
     * [get] b_user by my RCV_LBL_OUT_USER_ID, named 'BUser'. <br>
     * @return The entity of foreign property 'BUser'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUser() {
        return _bUser;
    }

    /**
     * [set] b_user by my RCV_LBL_OUT_USER_ID, named 'BUser'.
     * @param bUser The entity of foreign property 'BUser'. (NullAllowed)
     */
    public void setBUser(BUser bUser) {
        _bUser = bUser;
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
        if (obj instanceof BsTReceiveLabel) {
            BsTReceiveLabel other = (BsTReceiveLabel)obj;
            if (!xSV(_receiveLabelId, other._receiveLabelId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _receiveLabelId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tReceivePlanB != null)
        { sb.append(li).append(xbRDS(_tReceivePlanB, "tReceivePlanB")); }
        if (_tStock != null)
        { sb.append(li).append(xbRDS(_tStock, "tStock")); }
        if (_bUser != null)
        { sb.append(li).append(xbRDS(_bUser, "bUser")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_receiveLabelId));
        sb.append(dm).append(xfND(_stockId));
        sb.append(dm).append(xfND(_receiveLabelNo));
        sb.append(dm).append(xfND(_num));
        sb.append(dm).append(xfND(_ownerCd));
        sb.append(dm).append(xfND(_ownerAbbr));
        sb.append(dm).append(xfND(_recommendLocationCd));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_jancd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_unitNm));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_limitDt));
        sb.append(dm).append(xfND(_prodDt));
        sb.append(dm).append(xfND(_receiveDt));
        sb.append(dm).append(xfND(_depositFlg));
        sb.append(dm).append(xfND(_reprintFlg));
        sb.append(dm).append(xfND(_receiveUnitNum));
        sb.append(dm).append(xfND(_receivePlanBId));
        sb.append(dm).append(xfND(_rcvLblOutUserId));
        sb.append(dm).append(xfND(_rcvLblOutDt));
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
        if (_tReceivePlanB != null)
        { sb.append(dm).append("tReceivePlanB"); }
        if (_tStock != null)
        { sb.append(dm).append("tStock"); }
        if (_bUser != null)
        { sb.append(dm).append("bUser"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TReceiveLabel clone() {
        return (TReceiveLabel)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入荷ラベルID
     * @return The value of the column 'RECEIVE_LABEL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceiveLabelId() {
        checkSpecifiedProperty("receiveLabelId");
        return _receiveLabelId;
    }

    /**
     * [set] RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入荷ラベルID
     * @param receiveLabelId The value of the column 'RECEIVE_LABEL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveLabelId(Long receiveLabelId) {
        registerModifiedProperty("receiveLabelId");
        _receiveLabelId = receiveLabelId;
    }

    /**
     * [get] STOCK_ID: {IX, NotNull, BIGINT(19), FK to t_stock} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStockId() {
        checkSpecifiedProperty("stockId");
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {IX, NotNull, BIGINT(19), FK to t_stock} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStockId(Long stockId) {
        registerModifiedProperty("stockId");
        _stockId = stockId;
    }

    /**
     * [get] RECEIVE_LABEL_NO: {IX, VARCHAR(255)} <br>
     * 入荷ラベルNo
     * @return The value of the column 'RECEIVE_LABEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveLabelNo() {
        checkSpecifiedProperty("receiveLabelNo");
        return convertEmptyToNull(_receiveLabelNo);
    }

    /**
     * [set] RECEIVE_LABEL_NO: {IX, VARCHAR(255)} <br>
     * 入荷ラベルNo
     * @param receiveLabelNo The value of the column 'RECEIVE_LABEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveLabelNo(String receiveLabelNo) {
        registerModifiedProperty("receiveLabelNo");
        _receiveLabelNo = receiveLabelNo;
    }

    /**
     * [get] NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 数量
     * @return The value of the column 'NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNum() {
        checkSpecifiedProperty("num");
        return _num;
    }

    /**
     * [set] NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 数量
     * @param num The value of the column 'NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNum(java.math.BigDecimal num) {
        registerModifiedProperty("num");
        _num = num;
    }

    /**
     * [get] OWNER_CD: {VARCHAR(30)} <br>
     * 所有者CD
     * @return The value of the column 'OWNER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnerCd() {
        checkSpecifiedProperty("ownerCd");
        return convertEmptyToNull(_ownerCd);
    }

    /**
     * [set] OWNER_CD: {VARCHAR(30)} <br>
     * 所有者CD
     * @param ownerCd The value of the column 'OWNER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnerCd(String ownerCd) {
        registerModifiedProperty("ownerCd");
        _ownerCd = ownerCd;
    }

    /**
     * [get] OWNER_ABBR: {VARCHAR(60)} <br>
     * 所有者略称
     * @return The value of the column 'OWNER_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnerAbbr() {
        checkSpecifiedProperty("ownerAbbr");
        return convertEmptyToNull(_ownerAbbr);
    }

    /**
     * [set] OWNER_ABBR: {VARCHAR(60)} <br>
     * 所有者略称
     * @param ownerAbbr The value of the column 'OWNER_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnerAbbr(String ownerAbbr) {
        registerModifiedProperty("ownerAbbr");
        _ownerAbbr = ownerAbbr;
    }

    /**
     * [get] RECOMMEND_LOCATION_CD: {VARCHAR(30)} <br>
     * 推奨ロケCD
     * @return The value of the column 'RECOMMEND_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getRecommendLocationCd() {
        checkSpecifiedProperty("recommendLocationCd");
        return convertEmptyToNull(_recommendLocationCd);
    }

    /**
     * [set] RECOMMEND_LOCATION_CD: {VARCHAR(30)} <br>
     * 推奨ロケCD
     * @param recommendLocationCd The value of the column 'RECOMMEND_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRecommendLocationCd(String recommendLocationCd) {
        registerModifiedProperty("recommendLocationCd");
        _recommendLocationCd = recommendLocationCd;
    }

    /**
     * [get] LOCATION_CD: {VARCHAR(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {VARCHAR(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] JANCD: {VARCHAR(30)} <br>
     * JANCD
     * @return The value of the column 'JANCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJancd() {
        checkSpecifiedProperty("jancd");
        return convertEmptyToNull(_jancd);
    }

    /**
     * [set] JANCD: {VARCHAR(30)} <br>
     * JANCD
     * @param jancd The value of the column 'JANCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJancd(String jancd) {
        registerModifiedProperty("jancd");
        _jancd = jancd;
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
     * [get] UNIT_NM: {VARCHAR(60)} <br>
     * 数量単位
     * @return The value of the column 'UNIT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnitNm() {
        checkSpecifiedProperty("unitNm");
        return convertEmptyToNull(_unitNm);
    }

    /**
     * [set] UNIT_NM: {VARCHAR(60)} <br>
     * 数量単位
     * @param unitNm The value of the column 'UNIT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitNm(String unitNm) {
        registerModifiedProperty("unitNm");
        _unitNm = unitNm;
    }

    /**
     * [get] LOT: {VARCHAR(30)} <br>
     * ロット
     * @return The value of the column 'LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot() {
        checkSpecifiedProperty("lot");
        return convertEmptyToNull(_lot);
    }

    /**
     * [set] LOT: {VARCHAR(30)} <br>
     * ロット
     * @param lot The value of the column 'LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot(String lot) {
        registerModifiedProperty("lot");
        _lot = lot;
    }

    /**
     * [get] LIMIT_DT: {VARCHAR(8)} <br>
     * 期限日
     * @return The value of the column 'LIMIT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDt() {
        checkSpecifiedProperty("limitDt");
        return convertEmptyToNull(_limitDt);
    }

    /**
     * [set] LIMIT_DT: {VARCHAR(8)} <br>
     * 期限日
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDt(String limitDt) {
        registerModifiedProperty("limitDt");
        _limitDt = limitDt;
    }

    /**
     * [get] PROD_DT: {VARCHAR(8)} <br>
     * 製造日
     * @return The value of the column 'PROD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getProdDt() {
        checkSpecifiedProperty("prodDt");
        return convertEmptyToNull(_prodDt);
    }

    /**
     * [set] PROD_DT: {VARCHAR(8)} <br>
     * 製造日
     * @param prodDt The value of the column 'PROD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProdDt(String prodDt) {
        registerModifiedProperty("prodDt");
        _prodDt = prodDt;
    }

    /**
     * [get] RECEIVE_DT: {VARCHAR(8)} <br>
     * 入荷日
     * @return The value of the column 'RECEIVE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveDt() {
        checkSpecifiedProperty("receiveDt");
        return convertEmptyToNull(_receiveDt);
    }

    /**
     * [set] RECEIVE_DT: {VARCHAR(8)} <br>
     * 入荷日
     * @param receiveDt The value of the column 'RECEIVE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveDt(String receiveDt) {
        registerModifiedProperty("receiveDt");
        _receiveDt = receiveDt;
    }

    /**
     * [get] DEPOSIT_FLG: {CHAR(1)} <br>
     * 預り品フラグ
     * @return The value of the column 'DEPOSIT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositFlg() {
        checkSpecifiedProperty("depositFlg");
        return convertEmptyToNull(_depositFlg);
    }

    /**
     * [set] DEPOSIT_FLG: {CHAR(1)} <br>
     * 預り品フラグ
     * @param depositFlg The value of the column 'DEPOSIT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositFlg(String depositFlg) {
        registerModifiedProperty("depositFlg");
        _depositFlg = depositFlg;
    }

    /**
     * [get] REPRINT_FLG: {CHAR(1)} <br>
     * 再発行フラグ
     * @return The value of the column 'REPRINT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getReprintFlg() {
        checkSpecifiedProperty("reprintFlg");
        return convertEmptyToNull(_reprintFlg);
    }

    /**
     * [set] REPRINT_FLG: {CHAR(1)} <br>
     * 再発行フラグ
     * @param reprintFlg The value of the column 'REPRINT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReprintFlg(String reprintFlg) {
        registerModifiedProperty("reprintFlg");
        _reprintFlg = reprintFlg;
    }

    /**
     * [get] RECEIVE_UNIT_NUM: {BIGINT(19)} <br>
     * 入荷時入数
     * @return The value of the column 'RECEIVE_UNIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceiveUnitNum() {
        checkSpecifiedProperty("receiveUnitNum");
        return _receiveUnitNum;
    }

    /**
     * [set] RECEIVE_UNIT_NUM: {BIGINT(19)} <br>
     * 入荷時入数
     * @param receiveUnitNum The value of the column 'RECEIVE_UNIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveUnitNum(Long receiveUnitNum) {
        registerModifiedProperty("receiveUnitNum");
        _receiveUnitNum = receiveUnitNum;
    }

    /**
     * [get] RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b} <br>
     * 入荷予定ボディID
     * @return The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceivePlanBId() {
        checkSpecifiedProperty("receivePlanBId");
        return _receivePlanBId;
    }

    /**
     * [set] RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b} <br>
     * 入荷予定ボディID
     * @param receivePlanBId The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanBId(Long receivePlanBId) {
        registerModifiedProperty("receivePlanBId");
        _receivePlanBId = receivePlanBId;
    }

    /**
     * [get] RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 入荷ラベル出力者ID
     * @return The value of the column 'RCV_LBL_OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRcvLblOutUserId() {
        checkSpecifiedProperty("rcvLblOutUserId");
        return _rcvLblOutUserId;
    }

    /**
     * [set] RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 入荷ラベル出力者ID
     * @param rcvLblOutUserId The value of the column 'RCV_LBL_OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvLblOutUserId(Long rcvLblOutUserId) {
        registerModifiedProperty("rcvLblOutUserId");
        _rcvLblOutUserId = rcvLblOutUserId;
    }

    /**
     * [get] RCV_LBL_OUT_DT: {DATETIME(19)} <br>
     * 入荷ラベル出力日時
     * @return The value of the column 'RCV_LBL_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getRcvLblOutDt() {
        checkSpecifiedProperty("rcvLblOutDt");
        return _rcvLblOutDt;
    }

    /**
     * [set] RCV_LBL_OUT_DT: {DATETIME(19)} <br>
     * 入荷ラベル出力日時
     * @param rcvLblOutDt The value of the column 'RCV_LBL_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvLblOutDt(java.sql.Timestamp rcvLblOutDt) {
        registerModifiedProperty("rcvLblOutDt");
        _rcvLblOutDt = rcvLblOutDt;
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
