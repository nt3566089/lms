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
 * The entity of t_nizoroe_alarm_log as TABLE. <br>
 * 荷揃処理アラームログ
 * <pre>
 * [primary-key]
 *     NIZOROE_ALARM_LOG_ID
 *
 * [column]
 *     NIZOROE_ALARM_LOG_ID, NIZOROE_TYPE_CD, NIZOROE_PROC_UNIT, PROC_DT, PRINT_FLG, BASE_CD, BASE_NM, TYPE_CD, ALARM_TYPE_CD, NIZOROE_NO, SALES_ORDER_SLIP_NO, SHIPPING_SLIP_NO, SHIPPING_SLIP_ROW_NO, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, SALES_ORG_ID, SALES_ORG_CD, SALES_ORG_NM1, SALES_ORG_NM2, DESTINATION_NM1, DESTINATION_NM2, STOCK_OUT_NUM, OUT_USER_ID, OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     NIZOROE_ALARM_LOG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_product, b_user
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mProduct, bUser
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long nizoroeAlarmLogId = entity.getNizoroeAlarmLogId();
 * String nizoroeTypeCd = entity.getNizoroeTypeCd();
 * String nizoroeProcUnit = entity.getNizoroeProcUnit();
 * java.sql.Timestamp procDt = entity.getProcDt();
 * String printFlg = entity.getPrintFlg();
 * String baseCd = entity.getBaseCd();
 * String baseNm = entity.getBaseNm();
 * String typeCd = entity.getTypeCd();
 * String alarmTypeCd = entity.getAlarmTypeCd();
 * String nizoroeNo = entity.getNizoroeNo();
 * String salesOrderSlipNo = entity.getSalesOrderSlipNo();
 * String shippingSlipNo = entity.getShippingSlipNo();
 * String shippingSlipRowNo = entity.getShippingSlipRowNo();
 * Long productId = entity.getProductId();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * Long salesOrgId = entity.getSalesOrgId();
 * String salesOrgCd = entity.getSalesOrgCd();
 * String salesOrgNm1 = entity.getSalesOrgNm1();
 * String salesOrgNm2 = entity.getSalesOrgNm2();
 * String destinationNm1 = entity.getDestinationNm1();
 * String destinationNm2 = entity.getDestinationNm2();
 * Long stockOutNum = entity.getStockOutNum();
 * Long outUserId = entity.getOutUserId();
 * java.sql.Timestamp outDt = entity.getOutDt();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setNizoroeAlarmLogId(nizoroeAlarmLogId);
 * entity.setNizoroeTypeCd(nizoroeTypeCd);
 * entity.setNizoroeProcUnit(nizoroeProcUnit);
 * entity.setProcDt(procDt);
 * entity.setPrintFlg(printFlg);
 * entity.setBaseCd(baseCd);
 * entity.setBaseNm(baseNm);
 * entity.setTypeCd(typeCd);
 * entity.setAlarmTypeCd(alarmTypeCd);
 * entity.setNizoroeNo(nizoroeNo);
 * entity.setSalesOrderSlipNo(salesOrderSlipNo);
 * entity.setShippingSlipNo(shippingSlipNo);
 * entity.setShippingSlipRowNo(shippingSlipRowNo);
 * entity.setProductId(productId);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setSalesOrgId(salesOrgId);
 * entity.setSalesOrgCd(salesOrgCd);
 * entity.setSalesOrgNm1(salesOrgNm1);
 * entity.setSalesOrgNm2(salesOrgNm2);
 * entity.setDestinationNm1(destinationNm1);
 * entity.setDestinationNm2(destinationNm2);
 * entity.setStockOutNum(stockOutNum);
 * entity.setOutUserId(outUserId);
 * entity.setOutDt(outDt);
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
public abstract class BsTNizoroeAlarmLog extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** NIZOROE_ALARM_LOG_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _nizoroeAlarmLogId;

    /** NIZOROE_TYPE_CD: {VARCHAR(30)} */
    protected String _nizoroeTypeCd;

    /** NIZOROE_PROC_UNIT: {VARCHAR(30)} */
    protected String _nizoroeProcUnit;

    /** PROC_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _procDt;

    /** PRINT_FLG: {CHAR(1)} */
    protected String _printFlg;

    /** BASE_CD: {VARCHAR(30)} */
    protected String _baseCd;

    /** BASE_NM: {VARCHAR(60)} */
    protected String _baseNm;

    /** TYPE_CD: {VARCHAR(30)} */
    protected String _typeCd;

    /** ALARM_TYPE_CD: {VARCHAR(30)} */
    protected String _alarmTypeCd;

    /** NIZOROE_NO: {VARCHAR(30)} */
    protected String _nizoroeNo;

    /** SALES_ORDER_SLIP_NO: {VARCHAR(30)} */
    protected String _salesOrderSlipNo;

    /** SHIPPING_SLIP_NO: {VARCHAR(30)} */
    protected String _shippingSlipNo;

    /** SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} */
    protected String _shippingSlipRowNo;

    /** PRODUCT_ID: {IX, BIGINT(19), FK to m_product} */
    protected Long _productId;

    /** PRODUCT_CD: {VARCHAR(30)} */
    protected String _productCd;

    /** PRODUCT_NM: {VARCHAR(60)} */
    protected String _productNm;

    /** SALES_ORG_ID: {BIGINT(19)} */
    protected Long _salesOrgId;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    protected String _salesOrgCd;

    /** SALES_ORG_NM1: {VARCHAR(60)} */
    protected String _salesOrgNm1;

    /** SALES_ORG_NM2: {VARCHAR(60)} */
    protected String _salesOrgNm2;

    /** DESTINATION_NM1: {VARCHAR(60)} */
    protected String _destinationNm1;

    /** DESTINATION_NM2: {VARCHAR(60)} */
    protected String _destinationNm2;

    /** STOCK_OUT_NUM: {BIGINT(19)} */
    protected Long _stockOutNum;

    /** OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    protected Long _outUserId;

    /** OUT_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _outDt;

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
        return "t_nizoroe_alarm_log";
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
        if (_nizoroeAlarmLogId == null) { return false; }
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
    /** m_product by my PRODUCT_ID, named 'MProduct'. */
    protected MProduct _mProduct;

    /**
     * [get] m_product by my PRODUCT_ID, named 'MProduct'. <br>
     * @return The entity of foreign property 'MProduct'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MProduct getMProduct() {
        return _mProduct;
    }

    /**
     * [set] m_product by my PRODUCT_ID, named 'MProduct'.
     * @param mProduct The entity of foreign property 'MProduct'. (NullAllowed)
     */
    public void setMProduct(MProduct mProduct) {
        _mProduct = mProduct;
    }

    /** b_user by my OUT_USER_ID, named 'BUser'. */
    protected BUser _bUser;

    /**
     * [get] b_user by my OUT_USER_ID, named 'BUser'. <br>
     * @return The entity of foreign property 'BUser'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUser() {
        return _bUser;
    }

    /**
     * [set] b_user by my OUT_USER_ID, named 'BUser'.
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
        if (obj instanceof BsTNizoroeAlarmLog) {
            BsTNizoroeAlarmLog other = (BsTNizoroeAlarmLog)obj;
            if (!xSV(_nizoroeAlarmLogId, other._nizoroeAlarmLogId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _nizoroeAlarmLogId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mProduct != null)
        { sb.append(li).append(xbRDS(_mProduct, "mProduct")); }
        if (_bUser != null)
        { sb.append(li).append(xbRDS(_bUser, "bUser")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_nizoroeAlarmLogId));
        sb.append(dm).append(xfND(_nizoroeTypeCd));
        sb.append(dm).append(xfND(_nizoroeProcUnit));
        sb.append(dm).append(xfND(_procDt));
        sb.append(dm).append(xfND(_printFlg));
        sb.append(dm).append(xfND(_baseCd));
        sb.append(dm).append(xfND(_baseNm));
        sb.append(dm).append(xfND(_typeCd));
        sb.append(dm).append(xfND(_alarmTypeCd));
        sb.append(dm).append(xfND(_nizoroeNo));
        sb.append(dm).append(xfND(_salesOrderSlipNo));
        sb.append(dm).append(xfND(_shippingSlipNo));
        sb.append(dm).append(xfND(_shippingSlipRowNo));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_salesOrgId));
        sb.append(dm).append(xfND(_salesOrgCd));
        sb.append(dm).append(xfND(_salesOrgNm1));
        sb.append(dm).append(xfND(_salesOrgNm2));
        sb.append(dm).append(xfND(_destinationNm1));
        sb.append(dm).append(xfND(_destinationNm2));
        sb.append(dm).append(xfND(_stockOutNum));
        sb.append(dm).append(xfND(_outUserId));
        sb.append(dm).append(xfND(_outDt));
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
        if (_mProduct != null)
        { sb.append(dm).append("mProduct"); }
        if (_bUser != null)
        { sb.append(dm).append("bUser"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TNizoroeAlarmLog clone() {
        return (TNizoroeAlarmLog)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NIZOROE_ALARM_LOG_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 荷揃処理アラームログID
     * @return The value of the column 'NIZOROE_ALARM_LOG_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getNizoroeAlarmLogId() {
        checkSpecifiedProperty("nizoroeAlarmLogId");
        return _nizoroeAlarmLogId;
    }

    /**
     * [set] NIZOROE_ALARM_LOG_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 荷揃処理アラームログID
     * @param nizoroeAlarmLogId The value of the column 'NIZOROE_ALARM_LOG_ID'. (basically NotNull if update: for the constraint)
     */
    public void setNizoroeAlarmLogId(Long nizoroeAlarmLogId) {
        registerModifiedProperty("nizoroeAlarmLogId");
        _nizoroeAlarmLogId = nizoroeAlarmLogId;
    }

    /**
     * [get] NIZOROE_TYPE_CD: {VARCHAR(30)} <br>
     * 荷揃種別
     * @return The value of the column 'NIZOROE_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getNizoroeTypeCd() {
        checkSpecifiedProperty("nizoroeTypeCd");
        return convertEmptyToNull(_nizoroeTypeCd);
    }

    /**
     * [set] NIZOROE_TYPE_CD: {VARCHAR(30)} <br>
     * 荷揃種別
     * @param nizoroeTypeCd The value of the column 'NIZOROE_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNizoroeTypeCd(String nizoroeTypeCd) {
        registerModifiedProperty("nizoroeTypeCd");
        _nizoroeTypeCd = nizoroeTypeCd;
    }

    /**
     * [get] NIZOROE_PROC_UNIT: {VARCHAR(30)} <br>
     * 荷揃処理単位
     * @return The value of the column 'NIZOROE_PROC_UNIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getNizoroeProcUnit() {
        checkSpecifiedProperty("nizoroeProcUnit");
        return convertEmptyToNull(_nizoroeProcUnit);
    }

    /**
     * [set] NIZOROE_PROC_UNIT: {VARCHAR(30)} <br>
     * 荷揃処理単位
     * @param nizoroeProcUnit The value of the column 'NIZOROE_PROC_UNIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNizoroeProcUnit(String nizoroeProcUnit) {
        registerModifiedProperty("nizoroeProcUnit");
        _nizoroeProcUnit = nizoroeProcUnit;
    }

    /**
     * [get] PROC_DT: {DATETIME(19)} <br>
     * 処理日時
     * @return The value of the column 'PROC_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getProcDt() {
        checkSpecifiedProperty("procDt");
        return _procDt;
    }

    /**
     * [set] PROC_DT: {DATETIME(19)} <br>
     * 処理日時
     * @param procDt The value of the column 'PROC_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcDt(java.sql.Timestamp procDt) {
        registerModifiedProperty("procDt");
        _procDt = procDt;
    }

    /**
     * [get] PRINT_FLG: {CHAR(1)} <br>
     * 発行フラグ
     * @return The value of the column 'PRINT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrintFlg() {
        checkSpecifiedProperty("printFlg");
        return convertEmptyToNull(_printFlg);
    }

    /**
     * [set] PRINT_FLG: {CHAR(1)} <br>
     * 発行フラグ
     * @param printFlg The value of the column 'PRINT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrintFlg(String printFlg) {
        registerModifiedProperty("printFlg");
        _printFlg = printFlg;
    }

    /**
     * [get] BASE_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @return The value of the column 'BASE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBaseCd() {
        checkSpecifiedProperty("baseCd");
        return convertEmptyToNull(_baseCd);
    }

    /**
     * [set] BASE_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @param baseCd The value of the column 'BASE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBaseCd(String baseCd) {
        registerModifiedProperty("baseCd");
        _baseCd = baseCd;
    }

    /**
     * [get] BASE_NM: {VARCHAR(60)} <br>
     * 拠点名称
     * @return The value of the column 'BASE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBaseNm() {
        checkSpecifiedProperty("baseNm");
        return convertEmptyToNull(_baseNm);
    }

    /**
     * [set] BASE_NM: {VARCHAR(60)} <br>
     * 拠点名称
     * @param baseNm The value of the column 'BASE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBaseNm(String baseNm) {
        registerModifiedProperty("baseNm");
        _baseNm = baseNm;
    }

    /**
     * [get] TYPE_CD: {VARCHAR(30)} <br>
     * 種別区分
     * @return The value of the column 'TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeCd() {
        checkSpecifiedProperty("typeCd");
        return convertEmptyToNull(_typeCd);
    }

    /**
     * [set] TYPE_CD: {VARCHAR(30)} <br>
     * 種別区分
     * @param typeCd The value of the column 'TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeCd(String typeCd) {
        registerModifiedProperty("typeCd");
        _typeCd = typeCd;
    }

    /**
     * [get] ALARM_TYPE_CD: {VARCHAR(30)} <br>
     * アラーム区分
     * @return The value of the column 'ALARM_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getAlarmTypeCd() {
        checkSpecifiedProperty("alarmTypeCd");
        return convertEmptyToNull(_alarmTypeCd);
    }

    /**
     * [set] ALARM_TYPE_CD: {VARCHAR(30)} <br>
     * アラーム区分
     * @param alarmTypeCd The value of the column 'ALARM_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAlarmTypeCd(String alarmTypeCd) {
        registerModifiedProperty("alarmTypeCd");
        _alarmTypeCd = alarmTypeCd;
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
     * [get] SALES_ORDER_SLIP_NO: {VARCHAR(30)} <br>
     * 受注伝票番号
     * @return The value of the column 'SALES_ORDER_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrderSlipNo() {
        checkSpecifiedProperty("salesOrderSlipNo");
        return convertEmptyToNull(_salesOrderSlipNo);
    }

    /**
     * [set] SALES_ORDER_SLIP_NO: {VARCHAR(30)} <br>
     * 受注伝票番号
     * @param salesOrderSlipNo The value of the column 'SALES_ORDER_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrderSlipNo(String salesOrderSlipNo) {
        registerModifiedProperty("salesOrderSlipNo");
        _salesOrderSlipNo = salesOrderSlipNo;
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
     * [get] PRODUCT_ID: {IX, BIGINT(19), FK to m_product} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, BIGINT(19), FK to m_product} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] PRODUCT_CD: {VARCHAR(30)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(30)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
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
     * [get] SALES_ORG_ID: {BIGINT(19)} <br>
     * 販売組織ID
     * @return The value of the column 'SALES_ORG_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSalesOrgId() {
        checkSpecifiedProperty("salesOrgId");
        return _salesOrgId;
    }

    /**
     * [set] SALES_ORG_ID: {BIGINT(19)} <br>
     * 販売組織ID
     * @param salesOrgId The value of the column 'SALES_ORG_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgId(Long salesOrgId) {
        registerModifiedProperty("salesOrgId");
        _salesOrgId = salesOrgId;
    }

    /**
     * [get] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @return The value of the column 'SALES_ORG_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrgCd() {
        checkSpecifiedProperty("salesOrgCd");
        return convertEmptyToNull(_salesOrgCd);
    }

    /**
     * [set] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @param salesOrgCd The value of the column 'SALES_ORG_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgCd(String salesOrgCd) {
        registerModifiedProperty("salesOrgCd");
        _salesOrgCd = salesOrgCd;
    }

    /**
     * [get] SALES_ORG_NM1: {VARCHAR(60)} <br>
     * 販売組織名称1
     * @return The value of the column 'SALES_ORG_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrgNm1() {
        checkSpecifiedProperty("salesOrgNm1");
        return convertEmptyToNull(_salesOrgNm1);
    }

    /**
     * [set] SALES_ORG_NM1: {VARCHAR(60)} <br>
     * 販売組織名称1
     * @param salesOrgNm1 The value of the column 'SALES_ORG_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgNm1(String salesOrgNm1) {
        registerModifiedProperty("salesOrgNm1");
        _salesOrgNm1 = salesOrgNm1;
    }

    /**
     * [get] SALES_ORG_NM2: {VARCHAR(60)} <br>
     * 販売組織名称2
     * @return The value of the column 'SALES_ORG_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrgNm2() {
        checkSpecifiedProperty("salesOrgNm2");
        return convertEmptyToNull(_salesOrgNm2);
    }

    /**
     * [set] SALES_ORG_NM2: {VARCHAR(60)} <br>
     * 販売組織名称2
     * @param salesOrgNm2 The value of the column 'SALES_ORG_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgNm2(String salesOrgNm2) {
        registerModifiedProperty("salesOrgNm2");
        _salesOrgNm2 = salesOrgNm2;
    }

    /**
     * [get] DESTINATION_NM1: {VARCHAR(60)} <br>
     * 送り先名称1
     * @return The value of the column 'DESTINATION_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationNm1() {
        checkSpecifiedProperty("destinationNm1");
        return convertEmptyToNull(_destinationNm1);
    }

    /**
     * [set] DESTINATION_NM1: {VARCHAR(60)} <br>
     * 送り先名称1
     * @param destinationNm1 The value of the column 'DESTINATION_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationNm1(String destinationNm1) {
        registerModifiedProperty("destinationNm1");
        _destinationNm1 = destinationNm1;
    }

    /**
     * [get] DESTINATION_NM2: {VARCHAR(60)} <br>
     * 送り先名称2
     * @return The value of the column 'DESTINATION_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationNm2() {
        checkSpecifiedProperty("destinationNm2");
        return convertEmptyToNull(_destinationNm2);
    }

    /**
     * [set] DESTINATION_NM2: {VARCHAR(60)} <br>
     * 送り先名称2
     * @param destinationNm2 The value of the column 'DESTINATION_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationNm2(String destinationNm2) {
        registerModifiedProperty("destinationNm2");
        _destinationNm2 = destinationNm2;
    }

    /**
     * [get] STOCK_OUT_NUM: {BIGINT(19)} <br>
     * 欠品数
     * @return The value of the column 'STOCK_OUT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStockOutNum() {
        checkSpecifiedProperty("stockOutNum");
        return _stockOutNum;
    }

    /**
     * [set] STOCK_OUT_NUM: {BIGINT(19)} <br>
     * 欠品数
     * @param stockOutNum The value of the column 'STOCK_OUT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockOutNum(Long stockOutNum) {
        registerModifiedProperty("stockOutNum");
        _stockOutNum = stockOutNum;
    }

    /**
     * [get] OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 出力者ID
     * @return The value of the column 'OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOutUserId() {
        checkSpecifiedProperty("outUserId");
        return _outUserId;
    }

    /**
     * [set] OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 出力者ID
     * @param outUserId The value of the column 'OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOutUserId(Long outUserId) {
        registerModifiedProperty("outUserId");
        _outUserId = outUserId;
    }

    /**
     * [get] OUT_DT: {DATETIME(19)} <br>
     * 出力日時
     * @return The value of the column 'OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getOutDt() {
        checkSpecifiedProperty("outDt");
        return _outDt;
    }

    /**
     * [set] OUT_DT: {DATETIME(19)} <br>
     * 出力日時
     * @param outDt The value of the column 'OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOutDt(java.sql.Timestamp outDt) {
        registerModifiedProperty("outDt");
        _outDt = outDt;
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
