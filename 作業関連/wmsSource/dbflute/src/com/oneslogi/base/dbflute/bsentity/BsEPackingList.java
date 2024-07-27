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
 * The entity of e_packing_list as TABLE. <br>
 * 梱包明細送信テーブル
 * <pre>
 * [primary-key]
 *     PACKING_LIST_ID
 *
 * [column]
 *     PACKING_LIST_ID, SEND_FLG, SHIPPING_SLIP_NO, PACKING_NO, PACKING_ROW_NO, SHIPPING_SLIP_ROW_NO, SHIPPING_SLIP_ROW_NO_SN, HINMOKU_CD, NUM, CARRIER_SLIP_NO, WMS_ADD_YYYY, WMS_ADD_MM, WMS_ADD_DD, WMS_ADD_HH, WMS_ADD_MI, WMS_ADD_SS, WMS_ADD_USER_CD, WMS_UPD_YYYY, WMS_UPD_MM, WMS_UPD_DD, WMS_UPD_HH, WMS_UPD_MI, WMS_UPD_SS, WMS_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_LIST_ID
 *
 * [version-no]
 *     VERSION_NO
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
 * Long packingListId = entity.getPackingListId();
 * String sendFlg = entity.getSendFlg();
 * String shippingSlipNo = entity.getShippingSlipNo();
 * String packingNo = entity.getPackingNo();
 * String packingRowNo = entity.getPackingRowNo();
 * String shippingSlipRowNo = entity.getShippingSlipRowNo();
 * String shippingSlipRowNoSn = entity.getShippingSlipRowNoSn();
 * String hinmokuCd = entity.getHinmokuCd();
 * String num = entity.getNum();
 * String carrierSlipNo = entity.getCarrierSlipNo();
 * String wmsAddYyyy = entity.getWmsAddYyyy();
 * String wmsAddMm = entity.getWmsAddMm();
 * String wmsAddDd = entity.getWmsAddDd();
 * String wmsAddHh = entity.getWmsAddHh();
 * String wmsAddMi = entity.getWmsAddMi();
 * String wmsAddSs = entity.getWmsAddSs();
 * String wmsAddUserCd = entity.getWmsAddUserCd();
 * String wmsUpdYyyy = entity.getWmsUpdYyyy();
 * String wmsUpdMm = entity.getWmsUpdMm();
 * String wmsUpdDd = entity.getWmsUpdDd();
 * String wmsUpdHh = entity.getWmsUpdHh();
 * String wmsUpdMi = entity.getWmsUpdMi();
 * String wmsUpdSs = entity.getWmsUpdSs();
 * String wmsUpdUserCd = entity.getWmsUpdUserCd();
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
 * entity.setPackingListId(packingListId);
 * entity.setSendFlg(sendFlg);
 * entity.setShippingSlipNo(shippingSlipNo);
 * entity.setPackingNo(packingNo);
 * entity.setPackingRowNo(packingRowNo);
 * entity.setShippingSlipRowNo(shippingSlipRowNo);
 * entity.setShippingSlipRowNoSn(shippingSlipRowNoSn);
 * entity.setHinmokuCd(hinmokuCd);
 * entity.setNum(num);
 * entity.setCarrierSlipNo(carrierSlipNo);
 * entity.setWmsAddYyyy(wmsAddYyyy);
 * entity.setWmsAddMm(wmsAddMm);
 * entity.setWmsAddDd(wmsAddDd);
 * entity.setWmsAddHh(wmsAddHh);
 * entity.setWmsAddMi(wmsAddMi);
 * entity.setWmsAddSs(wmsAddSs);
 * entity.setWmsAddUserCd(wmsAddUserCd);
 * entity.setWmsUpdYyyy(wmsUpdYyyy);
 * entity.setWmsUpdMm(wmsUpdMm);
 * entity.setWmsUpdDd(wmsUpdDd);
 * entity.setWmsUpdHh(wmsUpdHh);
 * entity.setWmsUpdMi(wmsUpdMi);
 * entity.setWmsUpdSs(wmsUpdSs);
 * entity.setWmsUpdUserCd(wmsUpdUserCd);
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
public abstract class BsEPackingList extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PACKING_LIST_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _packingListId;

    /** SEND_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _sendFlg;

    /** SHIPPING_SLIP_NO: {VARCHAR(30)} */
    protected String _shippingSlipNo;

    /** PACKING_NO: {VARCHAR(30)} */
    protected String _packingNo;

    /** PACKING_ROW_NO: {VARCHAR(30)} */
    protected String _packingRowNo;

    /** SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} */
    protected String _shippingSlipRowNo;

    /** SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)} */
    protected String _shippingSlipRowNoSn;

    /** HINMOKU_CD: {VARCHAR(100)} */
    protected String _hinmokuCd;

    /** NUM: {VARCHAR(30)} */
    protected String _num;

    /** CARRIER_SLIP_NO: {VARCHAR(30)} */
    protected String _carrierSlipNo;

    /** WMS_ADD_YYYY: {VARCHAR(30)} */
    protected String _wmsAddYyyy;

    /** WMS_ADD_MM: {VARCHAR(30)} */
    protected String _wmsAddMm;

    /** WMS_ADD_DD: {VARCHAR(30)} */
    protected String _wmsAddDd;

    /** WMS_ADD_HH: {VARCHAR(30)} */
    protected String _wmsAddHh;

    /** WMS_ADD_MI: {VARCHAR(30)} */
    protected String _wmsAddMi;

    /** WMS_ADD_SS: {VARCHAR(30)} */
    protected String _wmsAddSs;

    /** WMS_ADD_USER_CD: {VARCHAR(30)} */
    protected String _wmsAddUserCd;

    /** WMS_UPD_YYYY: {VARCHAR(30)} */
    protected String _wmsUpdYyyy;

    /** WMS_UPD_MM: {VARCHAR(30)} */
    protected String _wmsUpdMm;

    /** WMS_UPD_DD: {VARCHAR(30)} */
    protected String _wmsUpdDd;

    /** WMS_UPD_HH: {VARCHAR(30)} */
    protected String _wmsUpdHh;

    /** WMS_UPD_MI: {VARCHAR(30)} */
    protected String _wmsUpdMi;

    /** WMS_UPD_SS: {VARCHAR(30)} */
    protected String _wmsUpdSs;

    /** WMS_UPD_USER_CD: {VARCHAR(30)} */
    protected String _wmsUpdUserCd;

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
        return "e_packing_list";
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
        if (_packingListId == null) { return false; }
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
        if (obj instanceof BsEPackingList) {
            BsEPackingList other = (BsEPackingList)obj;
            if (!xSV(_packingListId, other._packingListId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _packingListId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_packingListId));
        sb.append(dm).append(xfND(_sendFlg));
        sb.append(dm).append(xfND(_shippingSlipNo));
        sb.append(dm).append(xfND(_packingNo));
        sb.append(dm).append(xfND(_packingRowNo));
        sb.append(dm).append(xfND(_shippingSlipRowNo));
        sb.append(dm).append(xfND(_shippingSlipRowNoSn));
        sb.append(dm).append(xfND(_hinmokuCd));
        sb.append(dm).append(xfND(_num));
        sb.append(dm).append(xfND(_carrierSlipNo));
        sb.append(dm).append(xfND(_wmsAddYyyy));
        sb.append(dm).append(xfND(_wmsAddMm));
        sb.append(dm).append(xfND(_wmsAddDd));
        sb.append(dm).append(xfND(_wmsAddHh));
        sb.append(dm).append(xfND(_wmsAddMi));
        sb.append(dm).append(xfND(_wmsAddSs));
        sb.append(dm).append(xfND(_wmsAddUserCd));
        sb.append(dm).append(xfND(_wmsUpdYyyy));
        sb.append(dm).append(xfND(_wmsUpdMm));
        sb.append(dm).append(xfND(_wmsUpdDd));
        sb.append(dm).append(xfND(_wmsUpdHh));
        sb.append(dm).append(xfND(_wmsUpdMi));
        sb.append(dm).append(xfND(_wmsUpdSs));
        sb.append(dm).append(xfND(_wmsUpdUserCd));
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
        return "";
    }

    @Override
    public EPackingList clone() {
        return (EPackingList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PACKING_LIST_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 梱包明細送信ID
     * @return The value of the column 'PACKING_LIST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPackingListId() {
        checkSpecifiedProperty("packingListId");
        return _packingListId;
    }

    /**
     * [set] PACKING_LIST_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 梱包明細送信ID
     * @param packingListId The value of the column 'PACKING_LIST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPackingListId(Long packingListId) {
        registerModifiedProperty("packingListId");
        _packingListId = packingListId;
    }

    /**
     * [get] SEND_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 送信済フラグ
     * @return The value of the column 'SEND_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getSendFlg() {
        checkSpecifiedProperty("sendFlg");
        return convertEmptyToNull(_sendFlg);
    }

    /**
     * [set] SEND_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 送信済フラグ
     * @param sendFlg The value of the column 'SEND_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setSendFlg(String sendFlg) {
        registerModifiedProperty("sendFlg");
        _sendFlg = sendFlg;
    }

    /**
     * [get] SHIPPING_SLIP_NO: {VARCHAR(30)} <br>
     * 出荷伝票番号
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingSlipNo() {
        checkSpecifiedProperty("shippingSlipNo");
        return convertEmptyToNull(_shippingSlipNo);
    }

    /**
     * [set] SHIPPING_SLIP_NO: {VARCHAR(30)} <br>
     * 出荷伝票番号
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingSlipNo(String shippingSlipNo) {
        registerModifiedProperty("shippingSlipNo");
        _shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] PACKING_NO: {VARCHAR(30)} <br>
     * 梱包番号
     * @return The value of the column 'PACKING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPackingNo() {
        checkSpecifiedProperty("packingNo");
        return convertEmptyToNull(_packingNo);
    }

    /**
     * [set] PACKING_NO: {VARCHAR(30)} <br>
     * 梱包番号
     * @param packingNo The value of the column 'PACKING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNo(String packingNo) {
        registerModifiedProperty("packingNo");
        _packingNo = packingNo;
    }

    /**
     * [get] PACKING_ROW_NO: {VARCHAR(30)} <br>
     * 梱包明細番号
     * @return The value of the column 'PACKING_ROW_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPackingRowNo() {
        checkSpecifiedProperty("packingRowNo");
        return convertEmptyToNull(_packingRowNo);
    }

    /**
     * [set] PACKING_ROW_NO: {VARCHAR(30)} <br>
     * 梱包明細番号
     * @param packingRowNo The value of the column 'PACKING_ROW_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingRowNo(String packingRowNo) {
        registerModifiedProperty("packingRowNo");
        _packingRowNo = packingRowNo;
    }

    /**
     * [get] SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 出荷伝票明細番号
     * @return The value of the column 'SHIPPING_SLIP_ROW_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingSlipRowNo() {
        checkSpecifiedProperty("shippingSlipRowNo");
        return convertEmptyToNull(_shippingSlipRowNo);
    }

    /**
     * [set] SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 出荷伝票明細番号
     * @param shippingSlipRowNo The value of the column 'SHIPPING_SLIP_ROW_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingSlipRowNo(String shippingSlipRowNo) {
        registerModifiedProperty("shippingSlipRowNo");
        _shippingSlipRowNo = shippingSlipRowNo;
    }

    /**
     * [get] SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)} <br>
     * 出荷伝票明細番号連番
     * @return The value of the column 'SHIPPING_SLIP_ROW_NO_SN'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingSlipRowNoSn() {
        checkSpecifiedProperty("shippingSlipRowNoSn");
        return convertEmptyToNull(_shippingSlipRowNoSn);
    }

    /**
     * [set] SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)} <br>
     * 出荷伝票明細番号連番
     * @param shippingSlipRowNoSn The value of the column 'SHIPPING_SLIP_ROW_NO_SN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingSlipRowNoSn(String shippingSlipRowNoSn) {
        registerModifiedProperty("shippingSlipRowNoSn");
        _shippingSlipRowNoSn = shippingSlipRowNoSn;
    }

    /**
     * [get] HINMOKU_CD: {VARCHAR(100)} <br>
     * 品目コード
     * @return The value of the column 'HINMOKU_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getHinmokuCd() {
        checkSpecifiedProperty("hinmokuCd");
        return convertEmptyToNull(_hinmokuCd);
    }

    /**
     * [set] HINMOKU_CD: {VARCHAR(100)} <br>
     * 品目コード
     * @param hinmokuCd The value of the column 'HINMOKU_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHinmokuCd(String hinmokuCd) {
        registerModifiedProperty("hinmokuCd");
        _hinmokuCd = hinmokuCd;
    }

    /**
     * [get] NUM: {VARCHAR(30)} <br>
     * 数量
     * @return The value of the column 'NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getNum() {
        checkSpecifiedProperty("num");
        return convertEmptyToNull(_num);
    }

    /**
     * [set] NUM: {VARCHAR(30)} <br>
     * 数量
     * @param num The value of the column 'NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNum(String num) {
        registerModifiedProperty("num");
        _num = num;
    }

    /**
     * [get] CARRIER_SLIP_NO: {VARCHAR(30)} <br>
     * 運送便伝票番号
     * @return The value of the column 'CARRIER_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierSlipNo() {
        checkSpecifiedProperty("carrierSlipNo");
        return convertEmptyToNull(_carrierSlipNo);
    }

    /**
     * [set] CARRIER_SLIP_NO: {VARCHAR(30)} <br>
     * 運送便伝票番号
     * @param carrierSlipNo The value of the column 'CARRIER_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierSlipNo(String carrierSlipNo) {
        registerModifiedProperty("carrierSlipNo");
        _carrierSlipNo = carrierSlipNo;
    }

    /**
     * [get] WMS_ADD_YYYY: {VARCHAR(30)} <br>
     * WMS作成日_年
     * @return The value of the column 'WMS_ADD_YYYY'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddYyyy() {
        checkSpecifiedProperty("wmsAddYyyy");
        return convertEmptyToNull(_wmsAddYyyy);
    }

    /**
     * [set] WMS_ADD_YYYY: {VARCHAR(30)} <br>
     * WMS作成日_年
     * @param wmsAddYyyy The value of the column 'WMS_ADD_YYYY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddYyyy(String wmsAddYyyy) {
        registerModifiedProperty("wmsAddYyyy");
        _wmsAddYyyy = wmsAddYyyy;
    }

    /**
     * [get] WMS_ADD_MM: {VARCHAR(30)} <br>
     * WMS作成日_月
     * @return The value of the column 'WMS_ADD_MM'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddMm() {
        checkSpecifiedProperty("wmsAddMm");
        return convertEmptyToNull(_wmsAddMm);
    }

    /**
     * [set] WMS_ADD_MM: {VARCHAR(30)} <br>
     * WMS作成日_月
     * @param wmsAddMm The value of the column 'WMS_ADD_MM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddMm(String wmsAddMm) {
        registerModifiedProperty("wmsAddMm");
        _wmsAddMm = wmsAddMm;
    }

    /**
     * [get] WMS_ADD_DD: {VARCHAR(30)} <br>
     * WMS作成日_日
     * @return The value of the column 'WMS_ADD_DD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddDd() {
        checkSpecifiedProperty("wmsAddDd");
        return convertEmptyToNull(_wmsAddDd);
    }

    /**
     * [set] WMS_ADD_DD: {VARCHAR(30)} <br>
     * WMS作成日_日
     * @param wmsAddDd The value of the column 'WMS_ADD_DD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddDd(String wmsAddDd) {
        registerModifiedProperty("wmsAddDd");
        _wmsAddDd = wmsAddDd;
    }

    /**
     * [get] WMS_ADD_HH: {VARCHAR(30)} <br>
     * WMS作成時間_時
     * @return The value of the column 'WMS_ADD_HH'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddHh() {
        checkSpecifiedProperty("wmsAddHh");
        return convertEmptyToNull(_wmsAddHh);
    }

    /**
     * [set] WMS_ADD_HH: {VARCHAR(30)} <br>
     * WMS作成時間_時
     * @param wmsAddHh The value of the column 'WMS_ADD_HH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddHh(String wmsAddHh) {
        registerModifiedProperty("wmsAddHh");
        _wmsAddHh = wmsAddHh;
    }

    /**
     * [get] WMS_ADD_MI: {VARCHAR(30)} <br>
     * WMS作成時間_分
     * @return The value of the column 'WMS_ADD_MI'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddMi() {
        checkSpecifiedProperty("wmsAddMi");
        return convertEmptyToNull(_wmsAddMi);
    }

    /**
     * [set] WMS_ADD_MI: {VARCHAR(30)} <br>
     * WMS作成時間_分
     * @param wmsAddMi The value of the column 'WMS_ADD_MI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddMi(String wmsAddMi) {
        registerModifiedProperty("wmsAddMi");
        _wmsAddMi = wmsAddMi;
    }

    /**
     * [get] WMS_ADD_SS: {VARCHAR(30)} <br>
     * WMS作成時間_秒
     * @return The value of the column 'WMS_ADD_SS'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddSs() {
        checkSpecifiedProperty("wmsAddSs");
        return convertEmptyToNull(_wmsAddSs);
    }

    /**
     * [set] WMS_ADD_SS: {VARCHAR(30)} <br>
     * WMS作成時間_秒
     * @param wmsAddSs The value of the column 'WMS_ADD_SS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddSs(String wmsAddSs) {
        registerModifiedProperty("wmsAddSs");
        _wmsAddSs = wmsAddSs;
    }

    /**
     * [get] WMS_ADD_USER_CD: {VARCHAR(30)} <br>
     * WMS作成者
     * @return The value of the column 'WMS_ADD_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddUserCd() {
        checkSpecifiedProperty("wmsAddUserCd");
        return convertEmptyToNull(_wmsAddUserCd);
    }

    /**
     * [set] WMS_ADD_USER_CD: {VARCHAR(30)} <br>
     * WMS作成者
     * @param wmsAddUserCd The value of the column 'WMS_ADD_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddUserCd(String wmsAddUserCd) {
        registerModifiedProperty("wmsAddUserCd");
        _wmsAddUserCd = wmsAddUserCd;
    }

    /**
     * [get] WMS_UPD_YYYY: {VARCHAR(30)} <br>
     * WMS更新日_年
     * @return The value of the column 'WMS_UPD_YYYY'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdYyyy() {
        checkSpecifiedProperty("wmsUpdYyyy");
        return convertEmptyToNull(_wmsUpdYyyy);
    }

    /**
     * [set] WMS_UPD_YYYY: {VARCHAR(30)} <br>
     * WMS更新日_年
     * @param wmsUpdYyyy The value of the column 'WMS_UPD_YYYY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdYyyy(String wmsUpdYyyy) {
        registerModifiedProperty("wmsUpdYyyy");
        _wmsUpdYyyy = wmsUpdYyyy;
    }

    /**
     * [get] WMS_UPD_MM: {VARCHAR(30)} <br>
     * WMS更新日_月
     * @return The value of the column 'WMS_UPD_MM'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdMm() {
        checkSpecifiedProperty("wmsUpdMm");
        return convertEmptyToNull(_wmsUpdMm);
    }

    /**
     * [set] WMS_UPD_MM: {VARCHAR(30)} <br>
     * WMS更新日_月
     * @param wmsUpdMm The value of the column 'WMS_UPD_MM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdMm(String wmsUpdMm) {
        registerModifiedProperty("wmsUpdMm");
        _wmsUpdMm = wmsUpdMm;
    }

    /**
     * [get] WMS_UPD_DD: {VARCHAR(30)} <br>
     * WMS更新日_日
     * @return The value of the column 'WMS_UPD_DD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdDd() {
        checkSpecifiedProperty("wmsUpdDd");
        return convertEmptyToNull(_wmsUpdDd);
    }

    /**
     * [set] WMS_UPD_DD: {VARCHAR(30)} <br>
     * WMS更新日_日
     * @param wmsUpdDd The value of the column 'WMS_UPD_DD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdDd(String wmsUpdDd) {
        registerModifiedProperty("wmsUpdDd");
        _wmsUpdDd = wmsUpdDd;
    }

    /**
     * [get] WMS_UPD_HH: {VARCHAR(30)} <br>
     * WMS更新時間_時
     * @return The value of the column 'WMS_UPD_HH'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdHh() {
        checkSpecifiedProperty("wmsUpdHh");
        return convertEmptyToNull(_wmsUpdHh);
    }

    /**
     * [set] WMS_UPD_HH: {VARCHAR(30)} <br>
     * WMS更新時間_時
     * @param wmsUpdHh The value of the column 'WMS_UPD_HH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdHh(String wmsUpdHh) {
        registerModifiedProperty("wmsUpdHh");
        _wmsUpdHh = wmsUpdHh;
    }

    /**
     * [get] WMS_UPD_MI: {VARCHAR(30)} <br>
     * WMS更新時間_分
     * @return The value of the column 'WMS_UPD_MI'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdMi() {
        checkSpecifiedProperty("wmsUpdMi");
        return convertEmptyToNull(_wmsUpdMi);
    }

    /**
     * [set] WMS_UPD_MI: {VARCHAR(30)} <br>
     * WMS更新時間_分
     * @param wmsUpdMi The value of the column 'WMS_UPD_MI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdMi(String wmsUpdMi) {
        registerModifiedProperty("wmsUpdMi");
        _wmsUpdMi = wmsUpdMi;
    }

    /**
     * [get] WMS_UPD_SS: {VARCHAR(30)} <br>
     * WMS更新時間_秒
     * @return The value of the column 'WMS_UPD_SS'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdSs() {
        checkSpecifiedProperty("wmsUpdSs");
        return convertEmptyToNull(_wmsUpdSs);
    }

    /**
     * [set] WMS_UPD_SS: {VARCHAR(30)} <br>
     * WMS更新時間_秒
     * @param wmsUpdSs The value of the column 'WMS_UPD_SS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdSs(String wmsUpdSs) {
        registerModifiedProperty("wmsUpdSs");
        _wmsUpdSs = wmsUpdSs;
    }

    /**
     * [get] WMS_UPD_USER_CD: {VARCHAR(30)} <br>
     * WMS更新者
     * @return The value of the column 'WMS_UPD_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdUserCd() {
        checkSpecifiedProperty("wmsUpdUserCd");
        return convertEmptyToNull(_wmsUpdUserCd);
    }

    /**
     * [set] WMS_UPD_USER_CD: {VARCHAR(30)} <br>
     * WMS更新者
     * @param wmsUpdUserCd The value of the column 'WMS_UPD_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdUserCd(String wmsUpdUserCd) {
        registerModifiedProperty("wmsUpdUserCd");
        _wmsUpdUserCd = wmsUpdUserCd;
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
