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
 * The entity of t_bldl5130 as TABLE. <br>
 * BLDL5130
 * <pre>
 * [primary-key]
 *     BLDL5130_ID
 *
 * [column]
 *     BLDL5130_ID, YEARMONTH, BASE_NM, MONTH, CARRIER_CD, CARRIER_NM, ROW_NO, SHIPPING_DT, FW_STORE, FW_DIRECT, FW_TRANFER, SH_STORE, SH_DIRECT, SH_TRANFER, STORE_TOTAL, DIRECT_TOTAL, TRANSFER_TOTAL, KOGUCHI_DELIV, TOTAL_PACK_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5130_ID
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
 * Long bldl5130Id = entity.getBldl5130Id();
 * String yearmonth = entity.getYearmonth();
 * String baseNm = entity.getBaseNm();
 * String month = entity.getMonth();
 * String carrierCd = entity.getCarrierCd();
 * String carrierNm = entity.getCarrierNm();
 * String rowNo = entity.getRowNo();
 * String shippingDt = entity.getShippingDt();
 * Long fwStore = entity.getFwStore();
 * Long fwDirect = entity.getFwDirect();
 * Long fwTranfer = entity.getFwTranfer();
 * Long shStore = entity.getShStore();
 * Long shDirect = entity.getShDirect();
 * Long shTranfer = entity.getShTranfer();
 * Long storeTotal = entity.getStoreTotal();
 * Long directTotal = entity.getDirectTotal();
 * Long transferTotal = entity.getTransferTotal();
 * Long koguchiDeliv = entity.getKoguchiDeliv();
 * Long totalPackNum = entity.getTotalPackNum();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setBldl5130Id(bldl5130Id);
 * entity.setYearmonth(yearmonth);
 * entity.setBaseNm(baseNm);
 * entity.setMonth(month);
 * entity.setCarrierCd(carrierCd);
 * entity.setCarrierNm(carrierNm);
 * entity.setRowNo(rowNo);
 * entity.setShippingDt(shippingDt);
 * entity.setFwStore(fwStore);
 * entity.setFwDirect(fwDirect);
 * entity.setFwTranfer(fwTranfer);
 * entity.setShStore(shStore);
 * entity.setShDirect(shDirect);
 * entity.setShTranfer(shTranfer);
 * entity.setStoreTotal(storeTotal);
 * entity.setDirectTotal(directTotal);
 * entity.setTransferTotal(transferTotal);
 * entity.setKoguchiDeliv(koguchiDeliv);
 * entity.setTotalPackNum(totalPackNum);
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
public abstract class BsTBldl5130 extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BLDL5130_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _bldl5130Id;

    /** YEARMONTH: {VARCHAR(30)} */
    protected String _yearmonth;

    /** BASE_NM: {VARCHAR(60)} */
    protected String _baseNm;

    /** MONTH: {VARCHAR(60)} */
    protected String _month;

    /** CARRIER_CD: {VARCHAR(30)} */
    protected String _carrierCd;

    /** CARRIER_NM: {VARCHAR(60)} */
    protected String _carrierNm;

    /** ROW_NO: {VARCHAR(30)} */
    protected String _rowNo;

    /** SHIPPING_DT: {VARCHAR(8)} */
    protected String _shippingDt;

    /** FW_STORE: {BIGINT(19)} */
    protected Long _fwStore;

    /** FW_DIRECT: {BIGINT(19)} */
    protected Long _fwDirect;

    /** FW_TRANFER: {BIGINT(19)} */
    protected Long _fwTranfer;

    /** SH_STORE: {BIGINT(19)} */
    protected Long _shStore;

    /** SH_DIRECT: {BIGINT(19)} */
    protected Long _shDirect;

    /** SH_TRANFER: {BIGINT(19)} */
    protected Long _shTranfer;

    /** STORE_TOTAL: {BIGINT(19)} */
    protected Long _storeTotal;

    /** DIRECT_TOTAL: {BIGINT(19)} */
    protected Long _directTotal;

    /** TRANSFER_TOTAL: {BIGINT(19)} */
    protected Long _transferTotal;

    /** KOGUCHI_DELIV: {BIGINT(19)} */
    protected Long _koguchiDeliv;

    /** TOTAL_PACK_NUM: {BIGINT(19)} */
    protected Long _totalPackNum;

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
        return "t_bldl5130";
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
        if (_bldl5130Id == null) { return false; }
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
        if (obj instanceof BsTBldl5130) {
            BsTBldl5130 other = (BsTBldl5130)obj;
            if (!xSV(_bldl5130Id, other._bldl5130Id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _bldl5130Id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_bldl5130Id));
        sb.append(dm).append(xfND(_yearmonth));
        sb.append(dm).append(xfND(_baseNm));
        sb.append(dm).append(xfND(_month));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_carrierNm));
        sb.append(dm).append(xfND(_rowNo));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_fwStore));
        sb.append(dm).append(xfND(_fwDirect));
        sb.append(dm).append(xfND(_fwTranfer));
        sb.append(dm).append(xfND(_shStore));
        sb.append(dm).append(xfND(_shDirect));
        sb.append(dm).append(xfND(_shTranfer));
        sb.append(dm).append(xfND(_storeTotal));
        sb.append(dm).append(xfND(_directTotal));
        sb.append(dm).append(xfND(_transferTotal));
        sb.append(dm).append(xfND(_koguchiDeliv));
        sb.append(dm).append(xfND(_totalPackNum));
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
    public TBldl5130 clone() {
        return (TBldl5130)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BLDL5130_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5130ID
     * @return The value of the column 'BLDL5130_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBldl5130Id() {
        checkSpecifiedProperty("bldl5130Id");
        return _bldl5130Id;
    }

    /**
     * [set] BLDL5130_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5130ID
     * @param bldl5130Id The value of the column 'BLDL5130_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBldl5130Id(Long bldl5130Id) {
        registerModifiedProperty("bldl5130Id");
        _bldl5130Id = bldl5130Id;
    }

    /**
     * [get] YEARMONTH: {VARCHAR(30)} <br>
     * 年月
     * @return The value of the column 'YEARMONTH'. (NullAllowed even if selected: for no constraint)
     */
    public String getYearmonth() {
        checkSpecifiedProperty("yearmonth");
        return convertEmptyToNull(_yearmonth);
    }

    /**
     * [set] YEARMONTH: {VARCHAR(30)} <br>
     * 年月
     * @param yearmonth The value of the column 'YEARMONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setYearmonth(String yearmonth) {
        registerModifiedProperty("yearmonth");
        _yearmonth = yearmonth;
    }

    /**
     * [get] BASE_NM: {VARCHAR(60)} <br>
     * 拠点
     * @return The value of the column 'BASE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBaseNm() {
        checkSpecifiedProperty("baseNm");
        return convertEmptyToNull(_baseNm);
    }

    /**
     * [set] BASE_NM: {VARCHAR(60)} <br>
     * 拠点
     * @param baseNm The value of the column 'BASE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBaseNm(String baseNm) {
        registerModifiedProperty("baseNm");
        _baseNm = baseNm;
    }

    /**
     * [get] MONTH: {VARCHAR(60)} <br>
     * 対象月度
     * @return The value of the column 'MONTH'. (NullAllowed even if selected: for no constraint)
     */
    public String getMonth() {
        checkSpecifiedProperty("month");
        return convertEmptyToNull(_month);
    }

    /**
     * [set] MONTH: {VARCHAR(60)} <br>
     * 対象月度
     * @param month The value of the column 'MONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMonth(String month) {
        registerModifiedProperty("month");
        _month = month;
    }

    /**
     * [get] CARRIER_CD: {VARCHAR(30)} <br>
     * 運送会社CD
     * @return The value of the column 'CARRIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierCd() {
        checkSpecifiedProperty("carrierCd");
        return convertEmptyToNull(_carrierCd);
    }

    /**
     * [set] CARRIER_CD: {VARCHAR(30)} <br>
     * 運送会社CD
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierCd(String carrierCd) {
        registerModifiedProperty("carrierCd");
        _carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_NM: {VARCHAR(60)} <br>
     * 運送会社名
     * @return The value of the column 'CARRIER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierNm() {
        checkSpecifiedProperty("carrierNm");
        return convertEmptyToNull(_carrierNm);
    }

    /**
     * [set] CARRIER_NM: {VARCHAR(60)} <br>
     * 運送会社名
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierNm(String carrierNm) {
        registerModifiedProperty("carrierNm");
        _carrierNm = carrierNm;
    }

    /**
     * [get] ROW_NO: {VARCHAR(30)} <br>
     * 項番
     * @return The value of the column 'ROW_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRowNo() {
        checkSpecifiedProperty("rowNo");
        return convertEmptyToNull(_rowNo);
    }

    /**
     * [set] ROW_NO: {VARCHAR(30)} <br>
     * 項番
     * @param rowNo The value of the column 'ROW_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRowNo(String rowNo) {
        registerModifiedProperty("rowNo");
        _rowNo = rowNo;
    }

    /**
     * [get] SHIPPING_DT: {VARCHAR(8)} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingDt() {
        checkSpecifiedProperty("shippingDt");
        return convertEmptyToNull(_shippingDt);
    }

    /**
     * [set] SHIPPING_DT: {VARCHAR(8)} <br>
     * 出荷日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingDt(String shippingDt) {
        registerModifiedProperty("shippingDt");
        _shippingDt = shippingDt;
    }

    /**
     * [get] FW_STORE: {BIGINT(19)} <br>
     * FW店送り
     * @return The value of the column 'FW_STORE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFwStore() {
        checkSpecifiedProperty("fwStore");
        return _fwStore;
    }

    /**
     * [set] FW_STORE: {BIGINT(19)} <br>
     * FW店送り
     * @param fwStore The value of the column 'FW_STORE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFwStore(Long fwStore) {
        registerModifiedProperty("fwStore");
        _fwStore = fwStore;
    }

    /**
     * [get] FW_DIRECT: {BIGINT(19)} <br>
     * FW直送
     * @return The value of the column 'FW_DIRECT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFwDirect() {
        checkSpecifiedProperty("fwDirect");
        return _fwDirect;
    }

    /**
     * [set] FW_DIRECT: {BIGINT(19)} <br>
     * FW直送
     * @param fwDirect The value of the column 'FW_DIRECT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFwDirect(Long fwDirect) {
        registerModifiedProperty("fwDirect");
        _fwDirect = fwDirect;
    }

    /**
     * [get] FW_TRANFER: {BIGINT(19)} <br>
     * FW転送
     * @return The value of the column 'FW_TRANFER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFwTranfer() {
        checkSpecifiedProperty("fwTranfer");
        return _fwTranfer;
    }

    /**
     * [set] FW_TRANFER: {BIGINT(19)} <br>
     * FW転送
     * @param fwTranfer The value of the column 'FW_TRANFER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFwTranfer(Long fwTranfer) {
        registerModifiedProperty("fwTranfer");
        _fwTranfer = fwTranfer;
    }

    /**
     * [get] SH_STORE: {BIGINT(19)} <br>
     * SH店送り
     * @return The value of the column 'SH_STORE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShStore() {
        checkSpecifiedProperty("shStore");
        return _shStore;
    }

    /**
     * [set] SH_STORE: {BIGINT(19)} <br>
     * SH店送り
     * @param shStore The value of the column 'SH_STORE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShStore(Long shStore) {
        registerModifiedProperty("shStore");
        _shStore = shStore;
    }

    /**
     * [get] SH_DIRECT: {BIGINT(19)} <br>
     * SH直送
     * @return The value of the column 'SH_DIRECT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShDirect() {
        checkSpecifiedProperty("shDirect");
        return _shDirect;
    }

    /**
     * [set] SH_DIRECT: {BIGINT(19)} <br>
     * SH直送
     * @param shDirect The value of the column 'SH_DIRECT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShDirect(Long shDirect) {
        registerModifiedProperty("shDirect");
        _shDirect = shDirect;
    }

    /**
     * [get] SH_TRANFER: {BIGINT(19)} <br>
     * SH転送
     * @return The value of the column 'SH_TRANFER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShTranfer() {
        checkSpecifiedProperty("shTranfer");
        return _shTranfer;
    }

    /**
     * [set] SH_TRANFER: {BIGINT(19)} <br>
     * SH転送
     * @param shTranfer The value of the column 'SH_TRANFER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShTranfer(Long shTranfer) {
        registerModifiedProperty("shTranfer");
        _shTranfer = shTranfer;
    }

    /**
     * [get] STORE_TOTAL: {BIGINT(19)} <br>
     * 店送り合計
     * @return The value of the column 'STORE_TOTAL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStoreTotal() {
        checkSpecifiedProperty("storeTotal");
        return _storeTotal;
    }

    /**
     * [set] STORE_TOTAL: {BIGINT(19)} <br>
     * 店送り合計
     * @param storeTotal The value of the column 'STORE_TOTAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreTotal(Long storeTotal) {
        registerModifiedProperty("storeTotal");
        _storeTotal = storeTotal;
    }

    /**
     * [get] DIRECT_TOTAL: {BIGINT(19)} <br>
     * 直送合計
     * @return The value of the column 'DIRECT_TOTAL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDirectTotal() {
        checkSpecifiedProperty("directTotal");
        return _directTotal;
    }

    /**
     * [set] DIRECT_TOTAL: {BIGINT(19)} <br>
     * 直送合計
     * @param directTotal The value of the column 'DIRECT_TOTAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectTotal(Long directTotal) {
        registerModifiedProperty("directTotal");
        _directTotal = directTotal;
    }

    /**
     * [get] TRANSFER_TOTAL: {BIGINT(19)} <br>
     * 転送合計
     * @return The value of the column 'TRANSFER_TOTAL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTransferTotal() {
        checkSpecifiedProperty("transferTotal");
        return _transferTotal;
    }

    /**
     * [set] TRANSFER_TOTAL: {BIGINT(19)} <br>
     * 転送合計
     * @param transferTotal The value of the column 'TRANSFER_TOTAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransferTotal(Long transferTotal) {
        registerModifiedProperty("transferTotal");
        _transferTotal = transferTotal;
    }

    /**
     * [get] KOGUCHI_DELIV: {BIGINT(19)} <br>
     * 戸口配送
     * @return The value of the column 'KOGUCHI_DELIV'. (NullAllowed even if selected: for no constraint)
     */
    public Long getKoguchiDeliv() {
        checkSpecifiedProperty("koguchiDeliv");
        return _koguchiDeliv;
    }

    /**
     * [set] KOGUCHI_DELIV: {BIGINT(19)} <br>
     * 戸口配送
     * @param koguchiDeliv The value of the column 'KOGUCHI_DELIV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKoguchiDeliv(Long koguchiDeliv) {
        registerModifiedProperty("koguchiDeliv");
        _koguchiDeliv = koguchiDeliv;
    }

    /**
     * [get] TOTAL_PACK_NUM: {BIGINT(19)} <br>
     * 総梱包数
     * @return The value of the column 'TOTAL_PACK_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotalPackNum() {
        checkSpecifiedProperty("totalPackNum");
        return _totalPackNum;
    }

    /**
     * [set] TOTAL_PACK_NUM: {BIGINT(19)} <br>
     * 総梱包数
     * @param totalPackNum The value of the column 'TOTAL_PACK_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalPackNum(Long totalPackNum) {
        registerModifiedProperty("totalPackNum");
        _totalPackNum = totalPackNum;
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
