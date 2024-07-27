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
 * The entity of t_shipping_inst_h_print as TABLE. <br>
 * 出荷指示ヘッダ印刷データ
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_H_PRINT_ID
 *
 * [column]
 *     SHIPPING_INST_H_PRINT_ID, SHIPPING_INST_H_ID, SALES_ORDER_NO, SALES_ORDER_SLIP_TYPE_CD, SALES_ORDER_SLIP_NO, SHIPPING_REASON, LOGI_ATTENTION_TYPE_CD, LOGI_SPECIAL_TYPE_CD, KOGUCHI_DELIVERY_FLG, SHIPPING_DT, SPECIFY_DELIVERY_DT, SPECIFY_DELIVERY_TIME, TENHANSHA_ID, TENHANSHA_ORDER_NO, CONTRACTOR_NM, DESTINATION_CD, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_ZIP_CD, DESTINATION_ADDRESS1, DESTINATION_ADDRESS2, DESTINATION_TEL, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, DEAL_TYPE_CD, CUSTOMER_CD, CUSTOMER_NM, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_H_PRINT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_shipping_inst_h
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tShippingInstH
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long shippingInstHPrintId = entity.getShippingInstHPrintId();
 * Long shippingInstHId = entity.getShippingInstHId();
 * String salesOrderNo = entity.getSalesOrderNo();
 * String salesOrderSlipTypeCd = entity.getSalesOrderSlipTypeCd();
 * String salesOrderSlipNo = entity.getSalesOrderSlipNo();
 * String shippingReason = entity.getShippingReason();
 * String logiAttentionTypeCd = entity.getLogiAttentionTypeCd();
 * String logiSpecialTypeCd = entity.getLogiSpecialTypeCd();
 * String koguchiDeliveryFlg = entity.getKoguchiDeliveryFlg();
 * String shippingDt = entity.getShippingDt();
 * String specifyDeliveryDt = entity.getSpecifyDeliveryDt();
 * String specifyDeliveryTime = entity.getSpecifyDeliveryTime();
 * Long tenhanshaId = entity.getTenhanshaId();
 * String tenhanshaOrderNo = entity.getTenhanshaOrderNo();
 * String contractorNm = entity.getContractorNm();
 * String destinationCd = entity.getDestinationCd();
 * String destinationNm1 = entity.getDestinationNm1();
 * String destinationNm2 = entity.getDestinationNm2();
 * String destinationZipCd = entity.getDestinationZipCd();
 * String destinationAddress1 = entity.getDestinationAddress1();
 * String destinationAddress2 = entity.getDestinationAddress2();
 * String destinationTel = entity.getDestinationTel();
 * String shippingPlantCd = entity.getShippingPlantCd();
 * String shippingStorageSpaceCd = entity.getShippingStorageSpaceCd();
 * String dealTypeCd = entity.getDealTypeCd();
 * String customerCd = entity.getCustomerCd();
 * String customerNm = entity.getCustomerNm();
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
 * entity.setShippingInstHPrintId(shippingInstHPrintId);
 * entity.setShippingInstHId(shippingInstHId);
 * entity.setSalesOrderNo(salesOrderNo);
 * entity.setSalesOrderSlipTypeCd(salesOrderSlipTypeCd);
 * entity.setSalesOrderSlipNo(salesOrderSlipNo);
 * entity.setShippingReason(shippingReason);
 * entity.setLogiAttentionTypeCd(logiAttentionTypeCd);
 * entity.setLogiSpecialTypeCd(logiSpecialTypeCd);
 * entity.setKoguchiDeliveryFlg(koguchiDeliveryFlg);
 * entity.setShippingDt(shippingDt);
 * entity.setSpecifyDeliveryDt(specifyDeliveryDt);
 * entity.setSpecifyDeliveryTime(specifyDeliveryTime);
 * entity.setTenhanshaId(tenhanshaId);
 * entity.setTenhanshaOrderNo(tenhanshaOrderNo);
 * entity.setContractorNm(contractorNm);
 * entity.setDestinationCd(destinationCd);
 * entity.setDestinationNm1(destinationNm1);
 * entity.setDestinationNm2(destinationNm2);
 * entity.setDestinationZipCd(destinationZipCd);
 * entity.setDestinationAddress1(destinationAddress1);
 * entity.setDestinationAddress2(destinationAddress2);
 * entity.setDestinationTel(destinationTel);
 * entity.setShippingPlantCd(shippingPlantCd);
 * entity.setShippingStorageSpaceCd(shippingStorageSpaceCd);
 * entity.setDealTypeCd(dealTypeCd);
 * entity.setCustomerCd(customerCd);
 * entity.setCustomerNm(customerNm);
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
public abstract class BsTShippingInstHPrint extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHIPPING_INST_H_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)} */
    protected Long _shippingInstHPrintId;

    /** SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h} */
    protected Long _shippingInstHId;

    /** SALES_ORDER_NO: {VARCHAR(30)} */
    protected String _salesOrderNo;

    /** SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} */
    protected String _salesOrderSlipTypeCd;

    /** SALES_ORDER_SLIP_NO: {VARCHAR(30)} */
    protected String _salesOrderSlipNo;

    /** SHIPPING_REASON: {VARCHAR(60)} */
    protected String _shippingReason;

    /** LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} */
    protected String _logiAttentionTypeCd;

    /** LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} */
    protected String _logiSpecialTypeCd;

    /** KOGUCHI_DELIVERY_FLG: {VARCHAR(30)} */
    protected String _koguchiDeliveryFlg;

    /** SHIPPING_DT: {VARCHAR(8)} */
    protected String _shippingDt;

    /** SPECIFY_DELIVERY_DT: {VARCHAR(8)} */
    protected String _specifyDeliveryDt;

    /** SPECIFY_DELIVERY_TIME: {VARCHAR(6)} */
    protected String _specifyDeliveryTime;

    /** TENHANSHA_ID: {BIGINT(19)} */
    protected Long _tenhanshaId;

    /** TENHANSHA_ORDER_NO: {VARCHAR(30)} */
    protected String _tenhanshaOrderNo;

    /** CONTRACTOR_NM: {VARCHAR(60)} */
    protected String _contractorNm;

    /** DESTINATION_CD: {VARCHAR(30)} */
    protected String _destinationCd;

    /** DESTINATION_NM1: {VARCHAR(60)} */
    protected String _destinationNm1;

    /** DESTINATION_NM2: {VARCHAR(60)} */
    protected String _destinationNm2;

    /** DESTINATION_ZIP_CD: {VARCHAR(60)} */
    protected String _destinationZipCd;

    /** DESTINATION_ADDRESS1: {VARCHAR(60)} */
    protected String _destinationAddress1;

    /** DESTINATION_ADDRESS2: {VARCHAR(60)} */
    protected String _destinationAddress2;

    /** DESTINATION_TEL: {VARCHAR(30)} */
    protected String _destinationTel;

    /** SHIPPING_PLANT_CD: {VARCHAR(30)} */
    protected String _shippingPlantCd;

    /** SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} */
    protected String _shippingStorageSpaceCd;

    /** DEAL_TYPE_CD: {VARCHAR(30)} */
    protected String _dealTypeCd;

    /** CUSTOMER_CD: {VARCHAR(30)} */
    protected String _customerCd;

    /** CUSTOMER_NM: {VARCHAR(60)} */
    protected String _customerNm;

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
        return "t_shipping_inst_h_print";
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
        if (_shippingInstHPrintId == null) { return false; }
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
    /** t_shipping_inst_h by my SHIPPING_INST_H_ID, named 'TShippingInstH'. */
    protected TShippingInstH _tShippingInstH;

    /**
     * [get] t_shipping_inst_h by my SHIPPING_INST_H_ID, named 'TShippingInstH'. <br>
     * @return The entity of foreign property 'TShippingInstH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TShippingInstH getTShippingInstH() {
        return _tShippingInstH;
    }

    /**
     * [set] t_shipping_inst_h by my SHIPPING_INST_H_ID, named 'TShippingInstH'.
     * @param tShippingInstH The entity of foreign property 'TShippingInstH'. (NullAllowed)
     */
    public void setTShippingInstH(TShippingInstH tShippingInstH) {
        _tShippingInstH = tShippingInstH;
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
        if (obj instanceof BsTShippingInstHPrint) {
            BsTShippingInstHPrint other = (BsTShippingInstHPrint)obj;
            if (!xSV(_shippingInstHPrintId, other._shippingInstHPrintId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shippingInstHPrintId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tShippingInstH != null)
        { sb.append(li).append(xbRDS(_tShippingInstH, "tShippingInstH")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shippingInstHPrintId));
        sb.append(dm).append(xfND(_shippingInstHId));
        sb.append(dm).append(xfND(_salesOrderNo));
        sb.append(dm).append(xfND(_salesOrderSlipTypeCd));
        sb.append(dm).append(xfND(_salesOrderSlipNo));
        sb.append(dm).append(xfND(_shippingReason));
        sb.append(dm).append(xfND(_logiAttentionTypeCd));
        sb.append(dm).append(xfND(_logiSpecialTypeCd));
        sb.append(dm).append(xfND(_koguchiDeliveryFlg));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_specifyDeliveryDt));
        sb.append(dm).append(xfND(_specifyDeliveryTime));
        sb.append(dm).append(xfND(_tenhanshaId));
        sb.append(dm).append(xfND(_tenhanshaOrderNo));
        sb.append(dm).append(xfND(_contractorNm));
        sb.append(dm).append(xfND(_destinationCd));
        sb.append(dm).append(xfND(_destinationNm1));
        sb.append(dm).append(xfND(_destinationNm2));
        sb.append(dm).append(xfND(_destinationZipCd));
        sb.append(dm).append(xfND(_destinationAddress1));
        sb.append(dm).append(xfND(_destinationAddress2));
        sb.append(dm).append(xfND(_destinationTel));
        sb.append(dm).append(xfND(_shippingPlantCd));
        sb.append(dm).append(xfND(_shippingStorageSpaceCd));
        sb.append(dm).append(xfND(_dealTypeCd));
        sb.append(dm).append(xfND(_customerCd));
        sb.append(dm).append(xfND(_customerNm));
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
        if (_tShippingInstH != null)
        { sb.append(dm).append("tShippingInstH"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TShippingInstHPrint clone() {
        return (TShippingInstHPrint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_INST_H_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)} <br>
     * 出荷指示ヘッダ帳票ID
     * @return The value of the column 'SHIPPING_INST_H_PRINT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippingInstHPrintId() {
        checkSpecifiedProperty("shippingInstHPrintId");
        return _shippingInstHPrintId;
    }

    /**
     * [set] SHIPPING_INST_H_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)} <br>
     * 出荷指示ヘッダ帳票ID
     * @param shippingInstHPrintId The value of the column 'SHIPPING_INST_H_PRINT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShippingInstHPrintId(Long shippingInstHPrintId) {
        registerModifiedProperty("shippingInstHPrintId");
        _shippingInstHPrintId = shippingInstHPrintId;
    }

    /**
     * [get] SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h} <br>
     * 出荷指示ヘッダID
     * @return The value of the column 'SHIPPING_INST_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippingInstHId() {
        checkSpecifiedProperty("shippingInstHId");
        return _shippingInstHId;
    }

    /**
     * [set] SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h} <br>
     * 出荷指示ヘッダID
     * @param shippingInstHId The value of the column 'SHIPPING_INST_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShippingInstHId(Long shippingInstHId) {
        registerModifiedProperty("shippingInstHId");
        _shippingInstHId = shippingInstHId;
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
     * [get] SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 受注伝票タイプ
     * @return The value of the column 'SALES_ORDER_SLIP_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrderSlipTypeCd() {
        checkSpecifiedProperty("salesOrderSlipTypeCd");
        return convertEmptyToNull(_salesOrderSlipTypeCd);
    }

    /**
     * [set] SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 受注伝票タイプ
     * @param salesOrderSlipTypeCd The value of the column 'SALES_ORDER_SLIP_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrderSlipTypeCd(String salesOrderSlipTypeCd) {
        registerModifiedProperty("salesOrderSlipTypeCd");
        _salesOrderSlipTypeCd = salesOrderSlipTypeCd;
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
     * [get] SHIPPING_REASON: {VARCHAR(60)} <br>
     * 出荷発生事由
     * @return The value of the column 'SHIPPING_REASON'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingReason() {
        checkSpecifiedProperty("shippingReason");
        return convertEmptyToNull(_shippingReason);
    }

    /**
     * [set] SHIPPING_REASON: {VARCHAR(60)} <br>
     * 出荷発生事由
     * @param shippingReason The value of the column 'SHIPPING_REASON'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingReason(String shippingReason) {
        registerModifiedProperty("shippingReason");
        _shippingReason = shippingReason;
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
     * [get] KOGUCHI_DELIVERY_FLG: {VARCHAR(30)} <br>
     * 戸口配送フラグ
     * @return The value of the column 'KOGUCHI_DELIVERY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getKoguchiDeliveryFlg() {
        checkSpecifiedProperty("koguchiDeliveryFlg");
        return convertEmptyToNull(_koguchiDeliveryFlg);
    }

    /**
     * [set] KOGUCHI_DELIVERY_FLG: {VARCHAR(30)} <br>
     * 戸口配送フラグ
     * @param koguchiDeliveryFlg The value of the column 'KOGUCHI_DELIVERY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKoguchiDeliveryFlg(String koguchiDeliveryFlg) {
        registerModifiedProperty("koguchiDeliveryFlg");
        _koguchiDeliveryFlg = koguchiDeliveryFlg;
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
     * [get] SPECIFY_DELIVERY_DT: {VARCHAR(8)} <br>
     * 配達指定日
     * @return The value of the column 'SPECIFY_DELIVERY_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpecifyDeliveryDt() {
        checkSpecifiedProperty("specifyDeliveryDt");
        return convertEmptyToNull(_specifyDeliveryDt);
    }

    /**
     * [set] SPECIFY_DELIVERY_DT: {VARCHAR(8)} <br>
     * 配達指定日
     * @param specifyDeliveryDt The value of the column 'SPECIFY_DELIVERY_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpecifyDeliveryDt(String specifyDeliveryDt) {
        registerModifiedProperty("specifyDeliveryDt");
        _specifyDeliveryDt = specifyDeliveryDt;
    }

    /**
     * [get] SPECIFY_DELIVERY_TIME: {VARCHAR(6)} <br>
     * 配達指定時間
     * @return The value of the column 'SPECIFY_DELIVERY_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpecifyDeliveryTime() {
        checkSpecifiedProperty("specifyDeliveryTime");
        return convertEmptyToNull(_specifyDeliveryTime);
    }

    /**
     * [set] SPECIFY_DELIVERY_TIME: {VARCHAR(6)} <br>
     * 配達指定時間
     * @param specifyDeliveryTime The value of the column 'SPECIFY_DELIVERY_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpecifyDeliveryTime(String specifyDeliveryTime) {
        registerModifiedProperty("specifyDeliveryTime");
        _specifyDeliveryTime = specifyDeliveryTime;
    }

    /**
     * [get] TENHANSHA_ID: {BIGINT(19)} <br>
     * 店販社ID
     * @return The value of the column 'TENHANSHA_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTenhanshaId() {
        checkSpecifiedProperty("tenhanshaId");
        return _tenhanshaId;
    }

    /**
     * [set] TENHANSHA_ID: {BIGINT(19)} <br>
     * 店販社ID
     * @param tenhanshaId The value of the column 'TENHANSHA_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaId(Long tenhanshaId) {
        registerModifiedProperty("tenhanshaId");
        _tenhanshaId = tenhanshaId;
    }

    /**
     * [get] TENHANSHA_ORDER_NO: {VARCHAR(30)} <br>
     * 店販社発注番号
     * @return The value of the column 'TENHANSHA_ORDER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaOrderNo() {
        checkSpecifiedProperty("tenhanshaOrderNo");
        return convertEmptyToNull(_tenhanshaOrderNo);
    }

    /**
     * [set] TENHANSHA_ORDER_NO: {VARCHAR(30)} <br>
     * 店販社発注番号
     * @param tenhanshaOrderNo The value of the column 'TENHANSHA_ORDER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaOrderNo(String tenhanshaOrderNo) {
        registerModifiedProperty("tenhanshaOrderNo");
        _tenhanshaOrderNo = tenhanshaOrderNo;
    }

    /**
     * [get] CONTRACTOR_NM: {VARCHAR(60)} <br>
     * 戸配契約先名称
     * @return The value of the column 'CONTRACTOR_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getContractorNm() {
        checkSpecifiedProperty("contractorNm");
        return convertEmptyToNull(_contractorNm);
    }

    /**
     * [set] CONTRACTOR_NM: {VARCHAR(60)} <br>
     * 戸配契約先名称
     * @param contractorNm The value of the column 'CONTRACTOR_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setContractorNm(String contractorNm) {
        registerModifiedProperty("contractorNm");
        _contractorNm = contractorNm;
    }

    /**
     * [get] DESTINATION_CD: {VARCHAR(30)} <br>
     * 送り先CD
     * @return The value of the column 'DESTINATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationCd() {
        checkSpecifiedProperty("destinationCd");
        return convertEmptyToNull(_destinationCd);
    }

    /**
     * [set] DESTINATION_CD: {VARCHAR(30)} <br>
     * 送り先CD
     * @param destinationCd The value of the column 'DESTINATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationCd(String destinationCd) {
        registerModifiedProperty("destinationCd");
        _destinationCd = destinationCd;
    }

    /**
     * [get] DESTINATION_NM1: {VARCHAR(60)} <br>
     * 送り先名称１
     * @return The value of the column 'DESTINATION_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationNm1() {
        checkSpecifiedProperty("destinationNm1");
        return convertEmptyToNull(_destinationNm1);
    }

    /**
     * [set] DESTINATION_NM1: {VARCHAR(60)} <br>
     * 送り先名称１
     * @param destinationNm1 The value of the column 'DESTINATION_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationNm1(String destinationNm1) {
        registerModifiedProperty("destinationNm1");
        _destinationNm1 = destinationNm1;
    }

    /**
     * [get] DESTINATION_NM2: {VARCHAR(60)} <br>
     * 送り先名称２
     * @return The value of the column 'DESTINATION_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationNm2() {
        checkSpecifiedProperty("destinationNm2");
        return convertEmptyToNull(_destinationNm2);
    }

    /**
     * [set] DESTINATION_NM2: {VARCHAR(60)} <br>
     * 送り先名称２
     * @param destinationNm2 The value of the column 'DESTINATION_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationNm2(String destinationNm2) {
        registerModifiedProperty("destinationNm2");
        _destinationNm2 = destinationNm2;
    }

    /**
     * [get] DESTINATION_ZIP_CD: {VARCHAR(60)} <br>
     * 送り先郵便番号
     * @return The value of the column 'DESTINATION_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationZipCd() {
        checkSpecifiedProperty("destinationZipCd");
        return convertEmptyToNull(_destinationZipCd);
    }

    /**
     * [set] DESTINATION_ZIP_CD: {VARCHAR(60)} <br>
     * 送り先郵便番号
     * @param destinationZipCd The value of the column 'DESTINATION_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationZipCd(String destinationZipCd) {
        registerModifiedProperty("destinationZipCd");
        _destinationZipCd = destinationZipCd;
    }

    /**
     * [get] DESTINATION_ADDRESS1: {VARCHAR(60)} <br>
     * 送り先住所１
     * @return The value of the column 'DESTINATION_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationAddress1() {
        checkSpecifiedProperty("destinationAddress1");
        return convertEmptyToNull(_destinationAddress1);
    }

    /**
     * [set] DESTINATION_ADDRESS1: {VARCHAR(60)} <br>
     * 送り先住所１
     * @param destinationAddress1 The value of the column 'DESTINATION_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationAddress1(String destinationAddress1) {
        registerModifiedProperty("destinationAddress1");
        _destinationAddress1 = destinationAddress1;
    }

    /**
     * [get] DESTINATION_ADDRESS2: {VARCHAR(60)} <br>
     * 送り先住所２
     * @return The value of the column 'DESTINATION_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationAddress2() {
        checkSpecifiedProperty("destinationAddress2");
        return convertEmptyToNull(_destinationAddress2);
    }

    /**
     * [set] DESTINATION_ADDRESS2: {VARCHAR(60)} <br>
     * 送り先住所２
     * @param destinationAddress2 The value of the column 'DESTINATION_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationAddress2(String destinationAddress2) {
        registerModifiedProperty("destinationAddress2");
        _destinationAddress2 = destinationAddress2;
    }

    /**
     * [get] DESTINATION_TEL: {VARCHAR(30)} <br>
     * 送り先電話番号
     * @return The value of the column 'DESTINATION_TEL'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationTel() {
        checkSpecifiedProperty("destinationTel");
        return convertEmptyToNull(_destinationTel);
    }

    /**
     * [set] DESTINATION_TEL: {VARCHAR(30)} <br>
     * 送り先電話番号
     * @param destinationTel The value of the column 'DESTINATION_TEL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationTel(String destinationTel) {
        registerModifiedProperty("destinationTel");
        _destinationTel = destinationTel;
    }

    /**
     * [get] SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * 出庫プラント
     * @return The value of the column 'SHIPPING_PLANT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingPlantCd() {
        checkSpecifiedProperty("shippingPlantCd");
        return convertEmptyToNull(_shippingPlantCd);
    }

    /**
     * [set] SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * 出庫プラント
     * @param shippingPlantCd The value of the column 'SHIPPING_PLANT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingPlantCd(String shippingPlantCd) {
        registerModifiedProperty("shippingPlantCd");
        _shippingPlantCd = shippingPlantCd;
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
     * [get] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerCd() {
        checkSpecifiedProperty("customerCd");
        return convertEmptyToNull(_customerCd);
    }

    /**
     * [set] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerCd(String customerCd) {
        registerModifiedProperty("customerCd");
        _customerCd = customerCd;
    }

    /**
     * [get] CUSTOMER_NM: {VARCHAR(60)} <br>
     * 取引先名称
     * @return The value of the column 'CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerNm() {
        checkSpecifiedProperty("customerNm");
        return convertEmptyToNull(_customerNm);
    }

    /**
     * [set] CUSTOMER_NM: {VARCHAR(60)} <br>
     * 取引先名称
     * @param customerNm The value of the column 'CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerNm(String customerNm) {
        registerModifiedProperty("customerNm");
        _customerNm = customerNm;
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
