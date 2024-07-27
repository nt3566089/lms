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
 * The entity of t_shipping_record_h as TABLE. <br>
 * 出荷実績ヘッダ
 * <pre>
 * [primary-key]
 *     SHIPPING_RECORD_H_ID
 *
 * [column]
 *     SHIPPING_RECORD_H_ID, CLIENT_ID, SHIPPING_SLIP_NO, SALES_ORDER_NO, SHIPPING_DT, SHIPPING_STORAGE_SPACE_CD, NIZOROE_NO, DAIHYO_NIZOROE_NO, CARRIER_SLIP_NO, CARRIER_CD, CARRIER_RNM, SALES_NO2, DELIVERY_SLIP_NO, D_STR, I_STR, S4_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_RECORD_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_client
 *
 * [referrer table]
 *     t_shipping_record_b
 *
 * [foreign property]
 *     mClient
 *
 * [referrer property]
 *     tShippingRecordBList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long shippingRecordHId = entity.getShippingRecordHId();
 * Long clientId = entity.getClientId();
 * String shippingSlipNo = entity.getShippingSlipNo();
 * String salesOrderNo = entity.getSalesOrderNo();
 * String shippingDt = entity.getShippingDt();
 * String shippingStorageSpaceCd = entity.getShippingStorageSpaceCd();
 * String nizoroeNo = entity.getNizoroeNo();
 * String daihyoNizoroeNo = entity.getDaihyoNizoroeNo();
 * String carrierSlipNo = entity.getCarrierSlipNo();
 * String carrierCd = entity.getCarrierCd();
 * String carrierRnm = entity.getCarrierRnm();
 * String salesNo2 = entity.getSalesNo2();
 * String deliverySlipNo = entity.getDeliverySlipNo();
 * String dStr = entity.getDStr();
 * String iStr = entity.getIStr();
 * String s4SendFlg = entity.getS4SendFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setShippingRecordHId(shippingRecordHId);
 * entity.setClientId(clientId);
 * entity.setShippingSlipNo(shippingSlipNo);
 * entity.setSalesOrderNo(salesOrderNo);
 * entity.setShippingDt(shippingDt);
 * entity.setShippingStorageSpaceCd(shippingStorageSpaceCd);
 * entity.setNizoroeNo(nizoroeNo);
 * entity.setDaihyoNizoroeNo(daihyoNizoroeNo);
 * entity.setCarrierSlipNo(carrierSlipNo);
 * entity.setCarrierCd(carrierCd);
 * entity.setCarrierRnm(carrierRnm);
 * entity.setSalesNo2(salesNo2);
 * entity.setDeliverySlipNo(deliverySlipNo);
 * entity.setDStr(dStr);
 * entity.setIStr(iStr);
 * entity.setS4SendFlg(s4SendFlg);
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
public abstract class BsTShippingRecordH extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _shippingRecordHId;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    protected Long _clientId;

    /** SHIPPING_SLIP_NO: {VARCHAR(30)} */
    protected String _shippingSlipNo;

    /** SALES_ORDER_NO: {VARCHAR(30)} */
    protected String _salesOrderNo;

    /** SHIPPING_DT: {NotNull, VARCHAR(8)} */
    protected String _shippingDt;

    /** SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} */
    protected String _shippingStorageSpaceCd;

    /** NIZOROE_NO: {VARCHAR(30)} */
    protected String _nizoroeNo;

    /** DAIHYO_NIZOROE_NO: {VARCHAR(30)} */
    protected String _daihyoNizoroeNo;

    /** CARRIER_SLIP_NO: {VARCHAR(30)} */
    protected String _carrierSlipNo;

    /** CARRIER_CD: {VARCHAR(30)} */
    protected String _carrierCd;

    /** CARRIER_RNM: {VARCHAR(60)} */
    protected String _carrierRnm;

    /** SALES_NO2: {VARCHAR(30)} */
    protected String _salesNo2;

    /** DELIVERY_SLIP_NO: {VARCHAR(30)} */
    protected String _deliverySlipNo;

    /** D_STR: {VARCHAR(60)} */
    protected String _dStr;

    /** I_STR: {VARCHAR(60)} */
    protected String _iStr;

    /** S4_SEND_FLG: {CHAR(1)} */
    protected String _s4SendFlg;

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
        return "t_shipping_record_h";
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
        if (_shippingRecordHId == null) { return false; }
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
    /** m_client by my CLIENT_ID, named 'MClient'. */
    protected MClient _mClient;

    /**
     * [get] m_client by my CLIENT_ID, named 'MClient'. <br>
     * @return The entity of foreign property 'MClient'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClient getMClient() {
        return _mClient;
    }

    /**
     * [set] m_client by my CLIENT_ID, named 'MClient'.
     * @param mClient The entity of foreign property 'MClient'. (NullAllowed)
     */
    public void setMClient(MClient mClient) {
        _mClient = mClient;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** t_shipping_record_b by SHIPPING_RECORD_H_ID, named 'TShippingRecordBList'. */
    protected List<TShippingRecordB> _tShippingRecordBList;

    /**
     * [get] t_shipping_record_b by SHIPPING_RECORD_H_ID, named 'TShippingRecordBList'.
     * @return The entity list of referrer property 'TShippingRecordBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingRecordB> getTShippingRecordBList() {
        if (_tShippingRecordBList == null) { _tShippingRecordBList = newReferrerList(); }
        return _tShippingRecordBList;
    }

    /**
     * [set] t_shipping_record_b by SHIPPING_RECORD_H_ID, named 'TShippingRecordBList'.
     * @param tShippingRecordBList The entity list of referrer property 'TShippingRecordBList'. (NullAllowed)
     */
    public void setTShippingRecordBList(List<TShippingRecordB> tShippingRecordBList) {
        _tShippingRecordBList = tShippingRecordBList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTShippingRecordH) {
            BsTShippingRecordH other = (BsTShippingRecordH)obj;
            if (!xSV(_shippingRecordHId, other._shippingRecordHId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shippingRecordHId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_tShippingRecordBList != null) { for (TShippingRecordB et : _tShippingRecordBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingRecordBList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shippingRecordHId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_shippingSlipNo));
        sb.append(dm).append(xfND(_salesOrderNo));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_shippingStorageSpaceCd));
        sb.append(dm).append(xfND(_nizoroeNo));
        sb.append(dm).append(xfND(_daihyoNizoroeNo));
        sb.append(dm).append(xfND(_carrierSlipNo));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_carrierRnm));
        sb.append(dm).append(xfND(_salesNo2));
        sb.append(dm).append(xfND(_deliverySlipNo));
        sb.append(dm).append(xfND(_dStr));
        sb.append(dm).append(xfND(_iStr));
        sb.append(dm).append(xfND(_s4SendFlg));
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
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_tShippingRecordBList != null && !_tShippingRecordBList.isEmpty())
        { sb.append(dm).append("tShippingRecordBList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TShippingRecordH clone() {
        return (TShippingRecordH)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷実績ヘッダID
     * @return The value of the column 'SHIPPING_RECORD_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippingRecordHId() {
        checkSpecifiedProperty("shippingRecordHId");
        return _shippingRecordHId;
    }

    /**
     * [set] SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷実績ヘッダID
     * @param shippingRecordHId The value of the column 'SHIPPING_RECORD_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShippingRecordHId(Long shippingRecordHId) {
        registerModifiedProperty("shippingRecordHId");
        _shippingRecordHId = shippingRecordHId;
    }

    /**
     * [get] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
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
     * [get] SALES_ORDER_NO: {VARCHAR(30)} <br>
     * 受注番号
     * @return The value of the column 'SALES_ORDER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrderNo() {
        checkSpecifiedProperty("salesOrderNo");
        return convertEmptyToNull(_salesOrderNo);
    }

    /**
     * [set] SALES_ORDER_NO: {VARCHAR(30)} <br>
     * 受注番号
     * @param salesOrderNo The value of the column 'SALES_ORDER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrderNo(String salesOrderNo) {
        registerModifiedProperty("salesOrderNo");
        _salesOrderNo = salesOrderNo;
    }

    /**
     * [get] SHIPPING_DT: {NotNull, VARCHAR(8)} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (basically NotNull if selected: for the constraint)
     */
    public String getShippingDt() {
        checkSpecifiedProperty("shippingDt");
        return convertEmptyToNull(_shippingDt);
    }

    /**
     * [set] SHIPPING_DT: {NotNull, VARCHAR(8)} <br>
     * 出荷日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (basically NotNull if update: for the constraint)
     */
    public void setShippingDt(String shippingDt) {
        registerModifiedProperty("shippingDt");
        _shippingDt = shippingDt;
    }

    /**
     * [get] SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 出庫保管場所
     * @return The value of the column 'SHIPPING_STORAGE_SPACE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStorageSpaceCd() {
        checkSpecifiedProperty("shippingStorageSpaceCd");
        return convertEmptyToNull(_shippingStorageSpaceCd);
    }

    /**
     * [set] SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 出庫保管場所
     * @param shippingStorageSpaceCd The value of the column 'SHIPPING_STORAGE_SPACE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStorageSpaceCd(String shippingStorageSpaceCd) {
        registerModifiedProperty("shippingStorageSpaceCd");
        _shippingStorageSpaceCd = shippingStorageSpaceCd;
    }

    /**
     * [get] NIZOROE_NO: {VARCHAR(30)} <br>
     * 荷揃番号
     * @return The value of the column 'NIZOROE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getNizoroeNo() {
        checkSpecifiedProperty("nizoroeNo");
        return convertEmptyToNull(_nizoroeNo);
    }

    /**
     * [set] NIZOROE_NO: {VARCHAR(30)} <br>
     * 荷揃番号
     * @param nizoroeNo The value of the column 'NIZOROE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNizoroeNo(String nizoroeNo) {
        registerModifiedProperty("nizoroeNo");
        _nizoroeNo = nizoroeNo;
    }

    /**
     * [get] DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * 代表荷揃番号
     * @return The value of the column 'DAIHYO_NIZOROE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDaihyoNizoroeNo() {
        checkSpecifiedProperty("daihyoNizoroeNo");
        return convertEmptyToNull(_daihyoNizoroeNo);
    }

    /**
     * [set] DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * 代表荷揃番号
     * @param daihyoNizoroeNo The value of the column 'DAIHYO_NIZOROE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDaihyoNizoroeNo(String daihyoNizoroeNo) {
        registerModifiedProperty("daihyoNizoroeNo");
        _daihyoNizoroeNo = daihyoNizoroeNo;
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
     * [get] CARRIER_CD: {VARCHAR(30)} <br>
     * 運送業者CD
     * @return The value of the column 'CARRIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierCd() {
        checkSpecifiedProperty("carrierCd");
        return convertEmptyToNull(_carrierCd);
    }

    /**
     * [set] CARRIER_CD: {VARCHAR(30)} <br>
     * 運送業者CD
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierCd(String carrierCd) {
        registerModifiedProperty("carrierCd");
        _carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_RNM: {VARCHAR(60)} <br>
     * 運送業者略称
     * @return The value of the column 'CARRIER_RNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierRnm() {
        checkSpecifiedProperty("carrierRnm");
        return convertEmptyToNull(_carrierRnm);
    }

    /**
     * [set] CARRIER_RNM: {VARCHAR(60)} <br>
     * 運送業者略称
     * @param carrierRnm The value of the column 'CARRIER_RNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierRnm(String carrierRnm) {
        registerModifiedProperty("carrierRnm");
        _carrierRnm = carrierRnm;
    }

    /**
     * [get] SALES_NO2: {VARCHAR(30)} <br>
     * 売上番号２
     * @return The value of the column 'SALES_NO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesNo2() {
        checkSpecifiedProperty("salesNo2");
        return convertEmptyToNull(_salesNo2);
    }

    /**
     * [set] SALES_NO2: {VARCHAR(30)} <br>
     * 売上番号２
     * @param salesNo2 The value of the column 'SALES_NO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesNo2(String salesNo2) {
        registerModifiedProperty("salesNo2");
        _salesNo2 = salesNo2;
    }

    /**
     * [get] DELIVERY_SLIP_NO: {VARCHAR(30)} <br>
     * 納品書番号
     * @return The value of the column 'DELIVERY_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliverySlipNo() {
        checkSpecifiedProperty("deliverySlipNo");
        return convertEmptyToNull(_deliverySlipNo);
    }

    /**
     * [set] DELIVERY_SLIP_NO: {VARCHAR(30)} <br>
     * 納品書番号
     * @param deliverySlipNo The value of the column 'DELIVERY_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliverySlipNo(String deliverySlipNo) {
        registerModifiedProperty("deliverySlipNo");
        _deliverySlipNo = deliverySlipNo;
    }

    /**
     * [get] D_STR: {VARCHAR(60)} <br>
     * D
     * @return The value of the column 'D_STR'. (NullAllowed even if selected: for no constraint)
     */
    public String getDStr() {
        checkSpecifiedProperty("DStr");
        return convertEmptyToNull(_dStr);
    }

    /**
     * [set] D_STR: {VARCHAR(60)} <br>
     * D
     * @param dStr The value of the column 'D_STR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDStr(String dStr) {
        registerModifiedProperty("DStr");
        _dStr = dStr;
    }

    /**
     * [get] I_STR: {VARCHAR(60)} <br>
     * I
     * @return The value of the column 'I_STR'. (NullAllowed even if selected: for no constraint)
     */
    public String getIStr() {
        checkSpecifiedProperty("IStr");
        return convertEmptyToNull(_iStr);
    }

    /**
     * [set] I_STR: {VARCHAR(60)} <br>
     * I
     * @param iStr The value of the column 'I_STR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIStr(String iStr) {
        registerModifiedProperty("IStr");
        _iStr = iStr;
    }

    /**
     * [get] S4_SEND_FLG: {CHAR(1)} <br>
     * S4送信済フラグ
     * @return The value of the column 'S4_SEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getS4SendFlg() {
        checkSpecifiedProperty("s4SendFlg");
        return convertEmptyToNull(_s4SendFlg);
    }

    /**
     * [set] S4_SEND_FLG: {CHAR(1)} <br>
     * S4送信済フラグ
     * @param s4SendFlg The value of the column 'S4_SEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setS4SendFlg(String s4SendFlg) {
        registerModifiedProperty("s4SendFlg");
        _s4SendFlg = s4SendFlg;
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