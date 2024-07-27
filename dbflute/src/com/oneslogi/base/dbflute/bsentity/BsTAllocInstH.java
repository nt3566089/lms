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
 * The entity of t_alloc_inst_h as TABLE. <br>
 * 引当指示ヘッダ
 * <pre>
 * [primary-key]
 *     ALLOC_INST_H_ID
 *
 * [column]
 *     ALLOC_INST_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, SHIPPING_DT, WORK_DT, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_ID, DELIV_CUSTOMER_CD, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_ADDRESS_SUPPLY, DELIV_CUSTOMER_NM, DELIV_CUSTOMER_NM1, DELIV_CUSTOMER_NM2, DELIV_TEL_NO, DELIVERY_COURSE_ID, NIZOROE_NO, DAIHYO_NIZOROE_NO, NIZOROE_NO2, DAIHYO_NIZOROE_NO2, SPECIFY_DELIVERY_DT, SPECIFY_DELIVERY_TIME, 共通管理送信済フラグ, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ALLOC_INST_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_client, m_process_type, m_center, m_delivery_course, m_customer, t_picking_h, m_center_customer(ByDelivCustomerId), b_class_dtl(ByDelivTz)
 *
 * [referrer table]
 *     t_alloc_inst_b, t_packing_h, t_picking_h, t_shipping_inst_h
 *
 * [foreign property]
 *     mClient, mProcessType, mCenter, mDeliveryCourse, mCustomerBySupplyCustomerId, mCustomerByDelivCustomerId, tPickingH, mCenterCustomerByDelivCustomerId, mCenterCustomerBySupplyCustomerId, bClassDtlByDelivTz
 *
 * [referrer property]
 *     tAllocInstBList, tPackingHList, tPickingHList, tShippingInstHList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long allocInstHId = entity.getAllocInstHId();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * Long processTypeId = entity.getProcessTypeId();
 * String shippingDt = entity.getShippingDt();
 * String workDt = entity.getWorkDt();
 * String delivPlanDt = entity.getDelivPlanDt();
 * String delivDt = entity.getDelivDt();
 * String delivTz = entity.getDelivTz();
 * Long supplyCustomerId = entity.getSupplyCustomerId();
 * String supplyCustomerCd = entity.getSupplyCustomerCd();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * Long delivCustomerId = entity.getDelivCustomerId();
 * String delivCustomerCd = entity.getDelivCustomerCd();
 * String delivZipCd = entity.getDelivZipCd();
 * String delivAddress1 = entity.getDelivAddress1();
 * String delivAddress2 = entity.getDelivAddress2();
 * String delivAddress3 = entity.getDelivAddress3();
 * String delivAddressSupply = entity.getDelivAddressSupply();
 * String delivCustomerNm = entity.getDelivCustomerNm();
 * String delivCustomerNm1 = entity.getDelivCustomerNm1();
 * String delivCustomerNm2 = entity.getDelivCustomerNm2();
 * String delivTelNo = entity.getDelivTelNo();
 * Long deliveryCourseId = entity.getDeliveryCourseId();
 * String nizoroeNo = entity.getNizoroeNo();
 * String daihyoNizoroeNo = entity.getDaihyoNizoroeNo();
 * String nizoroeNo2 = entity.getNizoroeNo2();
 * String daihyoNizoroeNo2 = entity.getDaihyoNizoroeNo2();
 * String specifyDeliveryDt = entity.getSpecifyDeliveryDt();
 * String specifyDeliveryTime = entity.getSpecifyDeliveryTime();
 * String 共通管理送信済フラグ = entity.get共通管理送信済フラグ();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setAllocInstHId(allocInstHId);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setProcessTypeId(processTypeId);
 * entity.setShippingDt(shippingDt);
 * entity.setWorkDt(workDt);
 * entity.setDelivPlanDt(delivPlanDt);
 * entity.setDelivDt(delivDt);
 * entity.setDelivTz(delivTz);
 * entity.setSupplyCustomerId(supplyCustomerId);
 * entity.setSupplyCustomerCd(supplyCustomerCd);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setDelivCustomerId(delivCustomerId);
 * entity.setDelivCustomerCd(delivCustomerCd);
 * entity.setDelivZipCd(delivZipCd);
 * entity.setDelivAddress1(delivAddress1);
 * entity.setDelivAddress2(delivAddress2);
 * entity.setDelivAddress3(delivAddress3);
 * entity.setDelivAddressSupply(delivAddressSupply);
 * entity.setDelivCustomerNm(delivCustomerNm);
 * entity.setDelivCustomerNm1(delivCustomerNm1);
 * entity.setDelivCustomerNm2(delivCustomerNm2);
 * entity.setDelivTelNo(delivTelNo);
 * entity.setDeliveryCourseId(deliveryCourseId);
 * entity.setNizoroeNo(nizoroeNo);
 * entity.setDaihyoNizoroeNo(daihyoNizoroeNo);
 * entity.setNizoroeNo2(nizoroeNo2);
 * entity.setDaihyoNizoroeNo2(daihyoNizoroeNo2);
 * entity.setSpecifyDeliveryDt(specifyDeliveryDt);
 * entity.setSpecifyDeliveryTime(specifyDeliveryTime);
 * entity.set共通管理送信済フラグ(共通管理送信済フラグ);
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
public abstract class BsTAllocInstH extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ALLOC_INST_H_ID: {PK, ID, NotNull, BIGINT(19), FK to T_PICKING_H} */
    protected Long _allocInstHId;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    protected Long _clientId;

    /** CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} */
    protected Long _centerId;

    /** PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type} */
    protected Long _processTypeId;

    /** SHIPPING_DT: {IX, VARCHAR(8)} */
    protected String _shippingDt;

    /** WORK_DT: {IX, VARCHAR(8)} */
    protected String _workDt;

    /** DELIV_PLAN_DT: {VARCHAR(8)} */
    protected String _delivPlanDt;

    /** DELIV_DT: {VARCHAR(8)} */
    protected String _delivDt;

    /** DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} */
    protected String _delivTz;

    /** SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} */
    protected Long _supplyCustomerId;

    /** SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)} */
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {VARCHAR(255)} */
    protected String _supplyCustomerNm;

    /** DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} */
    protected Long _delivCustomerId;

    /** DELIV_CUSTOMER_CD: {VARCHAR(30)} */
    protected String _delivCustomerCd;

    /** DELIV_ZIP_CD: {VARCHAR(30)} */
    protected String _delivZipCd;

    /** DELIV_ADDRESS1: {VARCHAR(255)} */
    protected String _delivAddress1;

    /** DELIV_ADDRESS2: {VARCHAR(255)} */
    protected String _delivAddress2;

    /** DELIV_ADDRESS3: {VARCHAR(255)} */
    protected String _delivAddress3;

    /** DELIV_ADDRESS_SUPPLY: {VARCHAR(60)} */
    protected String _delivAddressSupply;

    /** DELIV_CUSTOMER_NM: {VARCHAR(255)} */
    protected String _delivCustomerNm;

    /** DELIV_CUSTOMER_NM1: {VARCHAR(255)} */
    protected String _delivCustomerNm1;

    /** DELIV_CUSTOMER_NM2: {VARCHAR(255)} */
    protected String _delivCustomerNm2;

    /** DELIV_TEL_NO: {VARCHAR(255)} */
    protected String _delivTelNo;

    /** DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course} */
    protected Long _deliveryCourseId;

    /** NIZOROE_NO: {VARCHAR(30)} */
    protected String _nizoroeNo;

    /** DAIHYO_NIZOROE_NO: {VARCHAR(30)} */
    protected String _daihyoNizoroeNo;

    /** NIZOROE_NO2: {VARCHAR(30)} */
    protected String _nizoroeNo2;

    /** DAIHYO_NIZOROE_NO2: {VARCHAR(30)} */
    protected String _daihyoNizoroeNo2;

    /** SPECIFY_DELIVERY_DT: {VARCHAR(8)} */
    protected String _specifyDeliveryDt;

    /** SPECIFY_DELIVERY_TIME: {VARCHAR(30)} */
    protected String _specifyDeliveryTime;

    /** 共通管理送信済フラグ: {CHAR(1)} */
    protected String _共通管理送信済フラグ;

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
        return "t_alloc_inst_h";
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
        if (_allocInstHId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delivTz as the classification of DelivTz. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelivTz getDelivTzAsDelivTz() {
        return CDef.DelivTz.codeOf(getDelivTz());
    }

    /**
     * Set the value of delivTz as the classification of DelivTz. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelivTzAsDelivTz(CDef.DelivTz cdef) {
        setDelivTz(cdef != null ? cdef.code() : null);
    }

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
     * Set the value of delivTz as $A (A). <br>
     * $A: 午前中
     */
    public void setDelivTz_$A() {
        setDelivTzAsDelivTz(CDef.DelivTz.$A);
    }

    /**
     * Set the value of delivTz as $B (B). <br>
     * $B: 12時～14時
     */
    public void setDelivTz_$B() {
        setDelivTzAsDelivTz(CDef.DelivTz.$B);
    }

    /**
     * Set the value of delivTz as $C (C). <br>
     * $C: 14時～16時
     */
    public void setDelivTz_$C() {
        setDelivTzAsDelivTz(CDef.DelivTz.$C);
    }

    /**
     * Set the value of delivTz as $D (D). <br>
     * $D: 16時～18時
     */
    public void setDelivTz_$D() {
        setDelivTzAsDelivTz(CDef.DelivTz.$D);
    }

    /**
     * Set the value of delivTz as $E (E). <br>
     * $E: 18時～20時
     */
    public void setDelivTz_$E() {
        setDelivTzAsDelivTz(CDef.DelivTz.$E);
    }

    /**
     * Set the value of delivTz as $F (F). <br>
     * $F: 18時～21時
     */
    public void setDelivTz_$F() {
        setDelivTzAsDelivTz(CDef.DelivTz.$F);
    }

    /**
     * Set the value of delivTz as $G (G). <br>
     * $G: 19時～21時
     */
    public void setDelivTz_$G() {
        setDelivTzAsDelivTz(CDef.DelivTz.$G);
    }

    /**
     * Set the value of delivTz as $H (H). <br>
     * $H: 20時～21時
     */
    public void setDelivTz_$H() {
        setDelivTzAsDelivTz(CDef.DelivTz.$H);
    }

    /**
     * Set the value of delivTz as $I (I). <br>
     * $I: 午前10時まで
     */
    public void setDelivTz_$I() {
        setDelivTzAsDelivTz(CDef.DelivTz.$I);
    }

    /**
     * Set the value of delivTz as $J (J). <br>
     * $J: 午後5時まで
     */
    public void setDelivTz_$J() {
        setDelivTzAsDelivTz(CDef.DelivTz.$J);
    }

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
     * Is the value of delivTz $A? <br>
     * $A: 午前中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$A() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$A) : false;
    }

    /**
     * Is the value of delivTz $B? <br>
     * $B: 12時～14時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$B() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$B) : false;
    }

    /**
     * Is the value of delivTz $C? <br>
     * $C: 14時～16時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$C() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$C) : false;
    }

    /**
     * Is the value of delivTz $D? <br>
     * $D: 16時～18時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$D() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$D) : false;
    }

    /**
     * Is the value of delivTz $E? <br>
     * $E: 18時～20時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$E() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$E) : false;
    }

    /**
     * Is the value of delivTz $F? <br>
     * $F: 18時～21時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$F() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$F) : false;
    }

    /**
     * Is the value of delivTz $G? <br>
     * $G: 19時～21時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$G() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$G) : false;
    }

    /**
     * Is the value of delivTz $H? <br>
     * $H: 20時～21時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$H() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$H) : false;
    }

    /**
     * Is the value of delivTz $I? <br>
     * $I: 午前10時まで
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$I() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$I) : false;
    }

    /**
     * Is the value of delivTz $J? <br>
     * $J: 午後5時まで
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$J() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$J) : false;
    }

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
     * Get the value of the column 'delivTz' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelivTzName() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.name() : null;
    }

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

    /** m_process_type by my PROCESS_TYPE_ID, named 'MProcessType'. */
    protected MProcessType _mProcessType;

    /**
     * [get] m_process_type by my PROCESS_TYPE_ID, named 'MProcessType'. <br>
     * @return The entity of foreign property 'MProcessType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MProcessType getMProcessType() {
        return _mProcessType;
    }

    /**
     * [set] m_process_type by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @param mProcessType The entity of foreign property 'MProcessType'. (NullAllowed)
     */
    public void setMProcessType(MProcessType mProcessType) {
        _mProcessType = mProcessType;
    }

    /** m_center by my CENTER_ID, named 'MCenter'. */
    protected MCenter _mCenter;

    /**
     * [get] m_center by my CENTER_ID, named 'MCenter'. <br>
     * @return The entity of foreign property 'MCenter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenter getMCenter() {
        return _mCenter;
    }

    /**
     * [set] m_center by my CENTER_ID, named 'MCenter'.
     * @param mCenter The entity of foreign property 'MCenter'. (NullAllowed)
     */
    public void setMCenter(MCenter mCenter) {
        _mCenter = mCenter;
    }

    /** m_delivery_course by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'. */
    protected MDeliveryCourse _mDeliveryCourse;

    /**
     * [get] m_delivery_course by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'. <br>
     * @return The entity of foreign property 'MDeliveryCourse'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MDeliveryCourse getMDeliveryCourse() {
        return _mDeliveryCourse;
    }

    /**
     * [set] m_delivery_course by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @param mDeliveryCourse The entity of foreign property 'MDeliveryCourse'. (NullAllowed)
     */
    public void setMDeliveryCourse(MDeliveryCourse mDeliveryCourse) {
        _mDeliveryCourse = mDeliveryCourse;
    }

    /** m_customer by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'. */
    protected MCustomer _mCustomerBySupplyCustomerId;

    /**
     * [get] m_customer by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'. <br>
     * @return The entity of foreign property 'MCustomerBySupplyCustomerId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomerBySupplyCustomerId() {
        return _mCustomerBySupplyCustomerId;
    }

    /**
     * [set] m_customer by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'.
     * @param mCustomerBySupplyCustomerId The entity of foreign property 'MCustomerBySupplyCustomerId'. (NullAllowed)
     */
    public void setMCustomerBySupplyCustomerId(MCustomer mCustomerBySupplyCustomerId) {
        _mCustomerBySupplyCustomerId = mCustomerBySupplyCustomerId;
    }

    /** m_customer by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'. */
    protected MCustomer _mCustomerByDelivCustomerId;

    /**
     * [get] m_customer by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'. <br>
     * @return The entity of foreign property 'MCustomerByDelivCustomerId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomerByDelivCustomerId() {
        return _mCustomerByDelivCustomerId;
    }

    /**
     * [set] m_customer by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'.
     * @param mCustomerByDelivCustomerId The entity of foreign property 'MCustomerByDelivCustomerId'. (NullAllowed)
     */
    public void setMCustomerByDelivCustomerId(MCustomer mCustomerByDelivCustomerId) {
        _mCustomerByDelivCustomerId = mCustomerByDelivCustomerId;
    }

    /** t_picking_h by my ALLOC_INST_H_ID, named 'TPickingH'. */
    protected TPickingH _tPickingH;

    /**
     * [get] t_picking_h by my ALLOC_INST_H_ID, named 'TPickingH'. <br>
     * @return The entity of foreign property 'TPickingH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TPickingH getTPickingH() {
        return _tPickingH;
    }

    /**
     * [set] t_picking_h by my ALLOC_INST_H_ID, named 'TPickingH'.
     * @param tPickingH The entity of foreign property 'TPickingH'. (NullAllowed)
     */
    public void setTPickingH(TPickingH tPickingH) {
        _tPickingH = tPickingH;
    }

    /** m_center_customer by my CENTER_ID, DELIV_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'MCenterCustomerByDelivCustomerId'. */
    protected MCenterCustomer _mCenterCustomerByDelivCustomerId;

    /**
     * [get] m_center_customer by my CENTER_ID, DELIV_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'MCenterCustomerByDelivCustomerId'. <br>
     * @return The entity of foreign property 'MCenterCustomerByDelivCustomerId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterCustomer getMCenterCustomerByDelivCustomerId() {
        return _mCenterCustomerByDelivCustomerId;
    }

    /**
     * [set] m_center_customer by my CENTER_ID, DELIV_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'MCenterCustomerByDelivCustomerId'.
     * @param mCenterCustomerByDelivCustomerId The entity of foreign property 'MCenterCustomerByDelivCustomerId'. (NullAllowed)
     */
    public void setMCenterCustomerByDelivCustomerId(MCenterCustomer mCenterCustomerByDelivCustomerId) {
        _mCenterCustomerByDelivCustomerId = mCenterCustomerByDelivCustomerId;
    }

    /** m_center_customer by my CENTER_ID, SUPPLY_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'MCenterCustomerBySupplyCustomerId'. */
    protected MCenterCustomer _mCenterCustomerBySupplyCustomerId;

    /**
     * [get] m_center_customer by my CENTER_ID, SUPPLY_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'MCenterCustomerBySupplyCustomerId'. <br>
     * @return The entity of foreign property 'MCenterCustomerBySupplyCustomerId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterCustomer getMCenterCustomerBySupplyCustomerId() {
        return _mCenterCustomerBySupplyCustomerId;
    }

    /**
     * [set] m_center_customer by my CENTER_ID, SUPPLY_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'MCenterCustomerBySupplyCustomerId'.
     * @param mCenterCustomerBySupplyCustomerId The entity of foreign property 'MCenterCustomerBySupplyCustomerId'. (NullAllowed)
     */
    public void setMCenterCustomerBySupplyCustomerId(MCenterCustomer mCenterCustomerBySupplyCustomerId) {
        _mCenterCustomerBySupplyCustomerId = mCenterCustomerBySupplyCustomerId;
    }

    /** b_class_dtl by my DELIV_TZ, named 'BClassDtlByDelivTz'. */
    protected BClassDtl _bClassDtlByDelivTz;

    /**
     * [get] b_class_dtl by my DELIV_TZ, named 'BClassDtlByDelivTz'. <br>
     * @return The entity of foreign property 'BClassDtlByDelivTz'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDelivTz() {
        return _bClassDtlByDelivTz;
    }

    /**
     * [set] b_class_dtl by my DELIV_TZ, named 'BClassDtlByDelivTz'.
     * @param bClassDtlByDelivTz The entity of foreign property 'BClassDtlByDelivTz'. (NullAllowed)
     */
    public void setBClassDtlByDelivTz(BClassDtl bClassDtlByDelivTz) {
        _bClassDtlByDelivTz = bClassDtlByDelivTz;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** t_alloc_inst_b by ALLOC_INST_H_ID, named 'TAllocInstBList'. */
    protected List<TAllocInstB> _tAllocInstBList;

    /**
     * [get] t_alloc_inst_b by ALLOC_INST_H_ID, named 'TAllocInstBList'.
     * @return The entity list of referrer property 'TAllocInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocInstB> getTAllocInstBList() {
        if (_tAllocInstBList == null) { _tAllocInstBList = newReferrerList(); }
        return _tAllocInstBList;
    }

    /**
     * [set] t_alloc_inst_b by ALLOC_INST_H_ID, named 'TAllocInstBList'.
     * @param tAllocInstBList The entity list of referrer property 'TAllocInstBList'. (NullAllowed)
     */
    public void setTAllocInstBList(List<TAllocInstB> tAllocInstBList) {
        _tAllocInstBList = tAllocInstBList;
    }

    /** t_packing_h by ALLOC_INST_H_ID, named 'TPackingHList'. */
    protected List<TPackingH> _tPackingHList;

    /**
     * [get] t_packing_h by ALLOC_INST_H_ID, named 'TPackingHList'.
     * @return The entity list of referrer property 'TPackingHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPackingH> getTPackingHList() {
        if (_tPackingHList == null) { _tPackingHList = newReferrerList(); }
        return _tPackingHList;
    }

    /**
     * [set] t_packing_h by ALLOC_INST_H_ID, named 'TPackingHList'.
     * @param tPackingHList The entity list of referrer property 'TPackingHList'. (NullAllowed)
     */
    public void setTPackingHList(List<TPackingH> tPackingHList) {
        _tPackingHList = tPackingHList;
    }

    /** t_picking_h by ALLOC_INST_H_ID, named 'TPickingHList'. */
    protected List<TPickingH> _tPickingHList;

    /**
     * [get] t_picking_h by ALLOC_INST_H_ID, named 'TPickingHList'.
     * @return The entity list of referrer property 'TPickingHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPickingH> getTPickingHList() {
        if (_tPickingHList == null) { _tPickingHList = newReferrerList(); }
        return _tPickingHList;
    }

    /**
     * [set] t_picking_h by ALLOC_INST_H_ID, named 'TPickingHList'.
     * @param tPickingHList The entity list of referrer property 'TPickingHList'. (NullAllowed)
     */
    public void setTPickingHList(List<TPickingH> tPickingHList) {
        _tPickingHList = tPickingHList;
    }

    /** t_shipping_inst_h by ALLOC_INST_H_ID, named 'TShippingInstHList'. */
    protected List<TShippingInstH> _tShippingInstHList;

    /**
     * [get] t_shipping_inst_h by ALLOC_INST_H_ID, named 'TShippingInstHList'.
     * @return The entity list of referrer property 'TShippingInstHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstH> getTShippingInstHList() {
        if (_tShippingInstHList == null) { _tShippingInstHList = newReferrerList(); }
        return _tShippingInstHList;
    }

    /**
     * [set] t_shipping_inst_h by ALLOC_INST_H_ID, named 'TShippingInstHList'.
     * @param tShippingInstHList The entity list of referrer property 'TShippingInstHList'. (NullAllowed)
     */
    public void setTShippingInstHList(List<TShippingInstH> tShippingInstHList) {
        _tShippingInstHList = tShippingInstHList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTAllocInstH) {
            BsTAllocInstH other = (BsTAllocInstH)obj;
            if (!xSV(_allocInstHId, other._allocInstHId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _allocInstHId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mProcessType != null)
        { sb.append(li).append(xbRDS(_mProcessType, "mProcessType")); }
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mDeliveryCourse != null)
        { sb.append(li).append(xbRDS(_mDeliveryCourse, "mDeliveryCourse")); }
        if (_mCustomerBySupplyCustomerId != null)
        { sb.append(li).append(xbRDS(_mCustomerBySupplyCustomerId, "mCustomerBySupplyCustomerId")); }
        if (_mCustomerByDelivCustomerId != null)
        { sb.append(li).append(xbRDS(_mCustomerByDelivCustomerId, "mCustomerByDelivCustomerId")); }
        if (_tPickingH != null)
        { sb.append(li).append(xbRDS(_tPickingH, "tPickingH")); }
        if (_mCenterCustomerByDelivCustomerId != null)
        { sb.append(li).append(xbRDS(_mCenterCustomerByDelivCustomerId, "mCenterCustomerByDelivCustomerId")); }
        if (_mCenterCustomerBySupplyCustomerId != null)
        { sb.append(li).append(xbRDS(_mCenterCustomerBySupplyCustomerId, "mCenterCustomerBySupplyCustomerId")); }
        if (_bClassDtlByDelivTz != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelivTz, "bClassDtlByDelivTz")); }
        if (_tAllocInstBList != null) { for (TAllocInstB et : _tAllocInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocInstBList")); } } }
        if (_tPackingHList != null) { for (TPackingH et : _tPackingHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPackingHList")); } } }
        if (_tPickingHList != null) { for (TPickingH et : _tPickingHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPickingHList")); } } }
        if (_tShippingInstHList != null) { for (TShippingInstH et : _tShippingInstHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstHList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_allocInstHId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_processTypeId));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_delivPlanDt));
        sb.append(dm).append(xfND(_delivDt));
        sb.append(dm).append(xfND(_delivTz));
        sb.append(dm).append(xfND(_supplyCustomerId));
        sb.append(dm).append(xfND(_supplyCustomerCd));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_delivCustomerId));
        sb.append(dm).append(xfND(_delivCustomerCd));
        sb.append(dm).append(xfND(_delivZipCd));
        sb.append(dm).append(xfND(_delivAddress1));
        sb.append(dm).append(xfND(_delivAddress2));
        sb.append(dm).append(xfND(_delivAddress3));
        sb.append(dm).append(xfND(_delivAddressSupply));
        sb.append(dm).append(xfND(_delivCustomerNm));
        sb.append(dm).append(xfND(_delivCustomerNm1));
        sb.append(dm).append(xfND(_delivCustomerNm2));
        sb.append(dm).append(xfND(_delivTelNo));
        sb.append(dm).append(xfND(_deliveryCourseId));
        sb.append(dm).append(xfND(_nizoroeNo));
        sb.append(dm).append(xfND(_daihyoNizoroeNo));
        sb.append(dm).append(xfND(_nizoroeNo2));
        sb.append(dm).append(xfND(_daihyoNizoroeNo2));
        sb.append(dm).append(xfND(_specifyDeliveryDt));
        sb.append(dm).append(xfND(_specifyDeliveryTime));
        sb.append(dm).append(xfND(_共通管理送信済フラグ));
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
        if (_mProcessType != null)
        { sb.append(dm).append("mProcessType"); }
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mDeliveryCourse != null)
        { sb.append(dm).append("mDeliveryCourse"); }
        if (_mCustomerBySupplyCustomerId != null)
        { sb.append(dm).append("mCustomerBySupplyCustomerId"); }
        if (_mCustomerByDelivCustomerId != null)
        { sb.append(dm).append("mCustomerByDelivCustomerId"); }
        if (_tPickingH != null)
        { sb.append(dm).append("tPickingH"); }
        if (_mCenterCustomerByDelivCustomerId != null)
        { sb.append(dm).append("mCenterCustomerByDelivCustomerId"); }
        if (_mCenterCustomerBySupplyCustomerId != null)
        { sb.append(dm).append("mCenterCustomerBySupplyCustomerId"); }
        if (_bClassDtlByDelivTz != null)
        { sb.append(dm).append("bClassDtlByDelivTz"); }
        if (_tAllocInstBList != null && !_tAllocInstBList.isEmpty())
        { sb.append(dm).append("tAllocInstBList"); }
        if (_tPackingHList != null && !_tPackingHList.isEmpty())
        { sb.append(dm).append("tPackingHList"); }
        if (_tPickingHList != null && !_tPickingHList.isEmpty())
        { sb.append(dm).append("tPickingHList"); }
        if (_tShippingInstHList != null && !_tShippingInstHList.isEmpty())
        { sb.append(dm).append("tShippingInstHList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TAllocInstH clone() {
        return (TAllocInstH)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ALLOC_INST_H_ID: {PK, ID, NotNull, BIGINT(19), FK to T_PICKING_H} <br>
     * 引当指示ヘッダID
     * @return The value of the column 'ALLOC_INST_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getAllocInstHId() {
        checkSpecifiedProperty("allocInstHId");
        return _allocInstHId;
    }

    /**
     * [set] ALLOC_INST_H_ID: {PK, ID, NotNull, BIGINT(19), FK to T_PICKING_H} <br>
     * 引当指示ヘッダID
     * @param allocInstHId The value of the column 'ALLOC_INST_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAllocInstHId(Long allocInstHId) {
        registerModifiedProperty("allocInstHId");
        _allocInstHId = allocInstHId;
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
     * [get] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProcessTypeId() {
        checkSpecifiedProperty("processTypeId");
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProcessTypeId(Long processTypeId) {
        registerModifiedProperty("processTypeId");
        _processTypeId = processTypeId;
    }

    /**
     * [get] SHIPPING_DT: {IX, VARCHAR(8)} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingDt() {
        checkSpecifiedProperty("shippingDt");
        return convertEmptyToNull(_shippingDt);
    }

    /**
     * [set] SHIPPING_DT: {IX, VARCHAR(8)} <br>
     * 出荷日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingDt(String shippingDt) {
        registerModifiedProperty("shippingDt");
        _shippingDt = shippingDt;
    }

    /**
     * [get] WORK_DT: {IX, VARCHAR(8)} <br>
     * 作業日
     * @return The value of the column 'WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] WORK_DT: {IX, VARCHAR(8)} <br>
     * 作業日
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
    }

    /**
     * [get] DELIV_PLAN_DT: {VARCHAR(8)} <br>
     * 納品予定日
     * @return The value of the column 'DELIV_PLAN_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivPlanDt() {
        checkSpecifiedProperty("delivPlanDt");
        return convertEmptyToNull(_delivPlanDt);
    }

    /**
     * [set] DELIV_PLAN_DT: {VARCHAR(8)} <br>
     * 納品予定日
     * @param delivPlanDt The value of the column 'DELIV_PLAN_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivPlanDt(String delivPlanDt) {
        registerModifiedProperty("delivPlanDt");
        _delivPlanDt = delivPlanDt;
    }

    /**
     * [get] DELIV_DT: {VARCHAR(8)} <br>
     * 納品指定日
     * @return The value of the column 'DELIV_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivDt() {
        checkSpecifiedProperty("delivDt");
        return convertEmptyToNull(_delivDt);
    }

    /**
     * [set] DELIV_DT: {VARCHAR(8)} <br>
     * 納品指定日
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivDt(String delivDt) {
        registerModifiedProperty("delivDt");
        _delivDt = delivDt;
    }

    /**
     * [get] DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @return The value of the column 'DELIV_TZ'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTz() {
        checkSpecifiedProperty("delivTz");
        return convertEmptyToNull(_delivTz);
    }

    /**
     * [set] DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param delivTz The value of the column 'DELIV_TZ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTz(String delivTz) {
        registerModifiedProperty("delivTz");
        _delivTz = delivTz;
    }

    /**
     * [get] SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 納品先ID
     * @return The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSupplyCustomerId() {
        checkSpecifiedProperty("supplyCustomerId");
        return _supplyCustomerId;
    }

    /**
     * [set] SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 納品先ID
     * @param supplyCustomerId The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerId(Long supplyCustomerId) {
        registerModifiedProperty("supplyCustomerId");
        _supplyCustomerId = supplyCustomerId;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)} <br>
     * 納品先CD
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerCd() {
        checkSpecifiedProperty("supplyCustomerCd");
        return convertEmptyToNull(_supplyCustomerCd);
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)} <br>
     * 納品先CD
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        registerModifiedProperty("supplyCustomerCd");
        _supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {VARCHAR(255)} <br>
     * 納品先名称
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerNm() {
        checkSpecifiedProperty("supplyCustomerNm");
        return convertEmptyToNull(_supplyCustomerNm);
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {VARCHAR(255)} <br>
     * 納品先名称
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        registerModifiedProperty("supplyCustomerNm");
        _supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 届先ID
     * @return The value of the column 'DELIV_CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDelivCustomerId() {
        checkSpecifiedProperty("delivCustomerId");
        return _delivCustomerId;
    }

    /**
     * [set] DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 届先ID
     * @param delivCustomerId The value of the column 'DELIV_CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerId(Long delivCustomerId) {
        registerModifiedProperty("delivCustomerId");
        _delivCustomerId = delivCustomerId;
    }

    /**
     * [get] DELIV_CUSTOMER_CD: {VARCHAR(30)} <br>
     * 届先CD
     * @return The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerCd() {
        checkSpecifiedProperty("delivCustomerCd");
        return convertEmptyToNull(_delivCustomerCd);
    }

    /**
     * [set] DELIV_CUSTOMER_CD: {VARCHAR(30)} <br>
     * 届先CD
     * @param delivCustomerCd The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerCd(String delivCustomerCd) {
        registerModifiedProperty("delivCustomerCd");
        _delivCustomerCd = delivCustomerCd;
    }

    /**
     * [get] DELIV_ZIP_CD: {VARCHAR(30)} <br>
     * 届先郵便番号
     * @return The value of the column 'DELIV_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivZipCd() {
        checkSpecifiedProperty("delivZipCd");
        return convertEmptyToNull(_delivZipCd);
    }

    /**
     * [set] DELIV_ZIP_CD: {VARCHAR(30)} <br>
     * 届先郵便番号
     * @param delivZipCd The value of the column 'DELIV_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivZipCd(String delivZipCd) {
        registerModifiedProperty("delivZipCd");
        _delivZipCd = delivZipCd;
    }

    /**
     * [get] DELIV_ADDRESS1: {VARCHAR(255)} <br>
     * 届先住所1
     * @return The value of the column 'DELIV_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress1() {
        checkSpecifiedProperty("delivAddress1");
        return convertEmptyToNull(_delivAddress1);
    }

    /**
     * [set] DELIV_ADDRESS1: {VARCHAR(255)} <br>
     * 届先住所1
     * @param delivAddress1 The value of the column 'DELIV_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress1(String delivAddress1) {
        registerModifiedProperty("delivAddress1");
        _delivAddress1 = delivAddress1;
    }

    /**
     * [get] DELIV_ADDRESS2: {VARCHAR(255)} <br>
     * 届先住所2
     * @return The value of the column 'DELIV_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress2() {
        checkSpecifiedProperty("delivAddress2");
        return convertEmptyToNull(_delivAddress2);
    }

    /**
     * [set] DELIV_ADDRESS2: {VARCHAR(255)} <br>
     * 届先住所2
     * @param delivAddress2 The value of the column 'DELIV_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress2(String delivAddress2) {
        registerModifiedProperty("delivAddress2");
        _delivAddress2 = delivAddress2;
    }

    /**
     * [get] DELIV_ADDRESS3: {VARCHAR(255)} <br>
     * 届先住所3
     * @return The value of the column 'DELIV_ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress3() {
        checkSpecifiedProperty("delivAddress3");
        return convertEmptyToNull(_delivAddress3);
    }

    /**
     * [set] DELIV_ADDRESS3: {VARCHAR(255)} <br>
     * 届先住所3
     * @param delivAddress3 The value of the column 'DELIV_ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress3(String delivAddress3) {
        registerModifiedProperty("delivAddress3");
        _delivAddress3 = delivAddress3;
    }

    /**
     * [get] DELIV_ADDRESS_SUPPLY: {VARCHAR(60)} <br>
     * 届先住所補足
     * @return The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddressSupply() {
        checkSpecifiedProperty("delivAddressSupply");
        return convertEmptyToNull(_delivAddressSupply);
    }

    /**
     * [set] DELIV_ADDRESS_SUPPLY: {VARCHAR(60)} <br>
     * 届先住所補足
     * @param delivAddressSupply The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddressSupply(String delivAddressSupply) {
        registerModifiedProperty("delivAddressSupply");
        _delivAddressSupply = delivAddressSupply;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {VARCHAR(255)} <br>
     * 届先名称
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNm() {
        checkSpecifiedProperty("delivCustomerNm");
        return convertEmptyToNull(_delivCustomerNm);
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {VARCHAR(255)} <br>
     * 届先名称
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        registerModifiedProperty("delivCustomerNm");
        _delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] DELIV_CUSTOMER_NM1: {VARCHAR(255)} <br>
     * 届先名称1
     * @return The value of the column 'DELIV_CUSTOMER_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNm1() {
        checkSpecifiedProperty("delivCustomerNm1");
        return convertEmptyToNull(_delivCustomerNm1);
    }

    /**
     * [set] DELIV_CUSTOMER_NM1: {VARCHAR(255)} <br>
     * 届先名称1
     * @param delivCustomerNm1 The value of the column 'DELIV_CUSTOMER_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNm1(String delivCustomerNm1) {
        registerModifiedProperty("delivCustomerNm1");
        _delivCustomerNm1 = delivCustomerNm1;
    }

    /**
     * [get] DELIV_CUSTOMER_NM2: {VARCHAR(255)} <br>
     * 届先名称2
     * @return The value of the column 'DELIV_CUSTOMER_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNm2() {
        checkSpecifiedProperty("delivCustomerNm2");
        return convertEmptyToNull(_delivCustomerNm2);
    }

    /**
     * [set] DELIV_CUSTOMER_NM2: {VARCHAR(255)} <br>
     * 届先名称2
     * @param delivCustomerNm2 The value of the column 'DELIV_CUSTOMER_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNm2(String delivCustomerNm2) {
        registerModifiedProperty("delivCustomerNm2");
        _delivCustomerNm2 = delivCustomerNm2;
    }

    /**
     * [get] DELIV_TEL_NO: {VARCHAR(255)} <br>
     * 届先電話番号
     * @return The value of the column 'DELIV_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTelNo() {
        checkSpecifiedProperty("delivTelNo");
        return convertEmptyToNull(_delivTelNo);
    }

    /**
     * [set] DELIV_TEL_NO: {VARCHAR(255)} <br>
     * 届先電話番号
     * @param delivTelNo The value of the column 'DELIV_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTelNo(String delivTelNo) {
        registerModifiedProperty("delivTelNo");
        _delivTelNo = delivTelNo;
    }

    /**
     * [get] DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course} <br>
     * 配送コースID
     * @return The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDeliveryCourseId() {
        checkSpecifiedProperty("deliveryCourseId");
        return _deliveryCourseId;
    }

    /**
     * [set] DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course} <br>
     * 配送コースID
     * @param deliveryCourseId The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseId(Long deliveryCourseId) {
        registerModifiedProperty("deliveryCourseId");
        _deliveryCourseId = deliveryCourseId;
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
     * [get] NIZOROE_NO2: {VARCHAR(30)} <br>
     * 荷揃番号_ハイフンあり
     * @return The value of the column 'NIZOROE_NO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getNizoroeNo2() {
        checkSpecifiedProperty("nizoroeNo2");
        return convertEmptyToNull(_nizoroeNo2);
    }

    /**
     * [set] NIZOROE_NO2: {VARCHAR(30)} <br>
     * 荷揃番号_ハイフンあり
     * @param nizoroeNo2 The value of the column 'NIZOROE_NO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNizoroeNo2(String nizoroeNo2) {
        registerModifiedProperty("nizoroeNo2");
        _nizoroeNo2 = nizoroeNo2;
    }

    /**
     * [get] DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * 代表荷揃番号_ハイフンあり
     * @return The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDaihyoNizoroeNo2() {
        checkSpecifiedProperty("daihyoNizoroeNo2");
        return convertEmptyToNull(_daihyoNizoroeNo2);
    }

    /**
     * [set] DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * 代表荷揃番号_ハイフンあり
     * @param daihyoNizoroeNo2 The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDaihyoNizoroeNo2(String daihyoNizoroeNo2) {
        registerModifiedProperty("daihyoNizoroeNo2");
        _daihyoNizoroeNo2 = daihyoNizoroeNo2;
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
     * [get] SPECIFY_DELIVERY_TIME: {VARCHAR(30)} <br>
     * 配達指定時間
     * @return The value of the column 'SPECIFY_DELIVERY_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpecifyDeliveryTime() {
        checkSpecifiedProperty("specifyDeliveryTime");
        return convertEmptyToNull(_specifyDeliveryTime);
    }

    /**
     * [set] SPECIFY_DELIVERY_TIME: {VARCHAR(30)} <br>
     * 配達指定時間
     * @param specifyDeliveryTime The value of the column 'SPECIFY_DELIVERY_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpecifyDeliveryTime(String specifyDeliveryTime) {
        registerModifiedProperty("specifyDeliveryTime");
        _specifyDeliveryTime = specifyDeliveryTime;
    }

    /**
     * [get] 共通管理送信済フラグ: {CHAR(1)} <br>
     * 共通管理送信済フラグ
     * @return The value of the column '共通管理送信済フラグ'. (NullAllowed even if selected: for no constraint)
     */
    public String get共通管理送信済フラグ() {
        checkSpecifiedProperty("共通管理送信済フラグ");
        return convertEmptyToNull(_共通管理送信済フラグ);
    }

    /**
     * [set] 共通管理送信済フラグ: {CHAR(1)} <br>
     * 共通管理送信済フラグ
     * @param 共通管理送信済フラグ The value of the column '共通管理送信済フラグ'. (NullAllowed: null update allowed for no constraint)
     */
    public void set共通管理送信済フラグ(String 共通管理送信済フラグ) {
        registerModifiedProperty("共通管理送信済フラグ");
        _共通管理送信済フラグ = 共通管理送信済フラグ;
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
