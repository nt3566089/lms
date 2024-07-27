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
 * The entity of t_receive_plan_data_transfer as TABLE. <br>
 * 入庫IFデータ転送テーブル
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_DATA_TRANSFER_ID, RECEIVE_PLAN_B_ID
 *
 * [column]
 *     RECEIVE_PLAN_DATA_TRANSFER_ID, RECEIVE_PLAN_B_ID, DATA_TRANSFER_ONLY_STR01, DATA_TRANSFER_ONLY_STR02, DATA_TRANSFER_ONLY_STR03, DATA_TRANSFER_ONLY_STR04, DATA_TRANSFER_ONLY_STR05, DATA_TRANSFER_ONLY_STR06, DATA_TRANSFER_ONLY_STR07, DATA_TRANSFER_ONLY_STR08, DATA_TRANSFER_ONLY_STR09, DATA_TRANSFER_ONLY_STR10, DATA_TRANSFER_ONLY_STR11, DATA_TRANSFER_ONLY_STR12, DATA_TRANSFER_ONLY_STR13, DATA_TRANSFER_ONLY_STR14, DATA_TRANSFER_ONLY_STR15, DATA_TRANSFER_ONLY_STR16, DATA_TRANSFER_ONLY_STR17, DATA_TRANSFER_ONLY_STR18, DATA_TRANSFER_ONLY_STR19, DATA_TRANSFER_ONLY_STR20, DATA_TRANSFER_ONLY_STR21, DATA_TRANSFER_ONLY_STR22, DATA_TRANSFER_ONLY_STR23, DATA_TRANSFER_ONLY_STR24, DATA_TRANSFER_ONLY_STR25, DATA_TRANSFER_ONLY_STR26, DATA_TRANSFER_ONLY_STR27, DATA_TRANSFER_ONLY_STR28, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_DATA_TRANSFER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_receive_plan_b
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tReceivePlanB
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long receivePlanDataTransferId = entity.getReceivePlanDataTransferId();
 * Long receivePlanBId = entity.getReceivePlanBId();
 * String dataTransferOnlyStr01 = entity.getDataTransferOnlyStr01();
 * String dataTransferOnlyStr02 = entity.getDataTransferOnlyStr02();
 * String dataTransferOnlyStr03 = entity.getDataTransferOnlyStr03();
 * String dataTransferOnlyStr04 = entity.getDataTransferOnlyStr04();
 * String dataTransferOnlyStr05 = entity.getDataTransferOnlyStr05();
 * String dataTransferOnlyStr06 = entity.getDataTransferOnlyStr06();
 * String dataTransferOnlyStr07 = entity.getDataTransferOnlyStr07();
 * String dataTransferOnlyStr08 = entity.getDataTransferOnlyStr08();
 * String dataTransferOnlyStr09 = entity.getDataTransferOnlyStr09();
 * String dataTransferOnlyStr10 = entity.getDataTransferOnlyStr10();
 * String dataTransferOnlyStr11 = entity.getDataTransferOnlyStr11();
 * String dataTransferOnlyStr12 = entity.getDataTransferOnlyStr12();
 * String dataTransferOnlyStr13 = entity.getDataTransferOnlyStr13();
 * String dataTransferOnlyStr14 = entity.getDataTransferOnlyStr14();
 * String dataTransferOnlyStr15 = entity.getDataTransferOnlyStr15();
 * String dataTransferOnlyStr16 = entity.getDataTransferOnlyStr16();
 * String dataTransferOnlyStr17 = entity.getDataTransferOnlyStr17();
 * String dataTransferOnlyStr18 = entity.getDataTransferOnlyStr18();
 * String dataTransferOnlyStr19 = entity.getDataTransferOnlyStr19();
 * String dataTransferOnlyStr20 = entity.getDataTransferOnlyStr20();
 * String dataTransferOnlyStr21 = entity.getDataTransferOnlyStr21();
 * String dataTransferOnlyStr22 = entity.getDataTransferOnlyStr22();
 * String dataTransferOnlyStr23 = entity.getDataTransferOnlyStr23();
 * String dataTransferOnlyStr24 = entity.getDataTransferOnlyStr24();
 * String dataTransferOnlyStr25 = entity.getDataTransferOnlyStr25();
 * String dataTransferOnlyStr26 = entity.getDataTransferOnlyStr26();
 * String dataTransferOnlyStr27 = entity.getDataTransferOnlyStr27();
 * String dataTransferOnlyStr28 = entity.getDataTransferOnlyStr28();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setReceivePlanDataTransferId(receivePlanDataTransferId);
 * entity.setReceivePlanBId(receivePlanBId);
 * entity.setDataTransferOnlyStr01(dataTransferOnlyStr01);
 * entity.setDataTransferOnlyStr02(dataTransferOnlyStr02);
 * entity.setDataTransferOnlyStr03(dataTransferOnlyStr03);
 * entity.setDataTransferOnlyStr04(dataTransferOnlyStr04);
 * entity.setDataTransferOnlyStr05(dataTransferOnlyStr05);
 * entity.setDataTransferOnlyStr06(dataTransferOnlyStr06);
 * entity.setDataTransferOnlyStr07(dataTransferOnlyStr07);
 * entity.setDataTransferOnlyStr08(dataTransferOnlyStr08);
 * entity.setDataTransferOnlyStr09(dataTransferOnlyStr09);
 * entity.setDataTransferOnlyStr10(dataTransferOnlyStr10);
 * entity.setDataTransferOnlyStr11(dataTransferOnlyStr11);
 * entity.setDataTransferOnlyStr12(dataTransferOnlyStr12);
 * entity.setDataTransferOnlyStr13(dataTransferOnlyStr13);
 * entity.setDataTransferOnlyStr14(dataTransferOnlyStr14);
 * entity.setDataTransferOnlyStr15(dataTransferOnlyStr15);
 * entity.setDataTransferOnlyStr16(dataTransferOnlyStr16);
 * entity.setDataTransferOnlyStr17(dataTransferOnlyStr17);
 * entity.setDataTransferOnlyStr18(dataTransferOnlyStr18);
 * entity.setDataTransferOnlyStr19(dataTransferOnlyStr19);
 * entity.setDataTransferOnlyStr20(dataTransferOnlyStr20);
 * entity.setDataTransferOnlyStr21(dataTransferOnlyStr21);
 * entity.setDataTransferOnlyStr22(dataTransferOnlyStr22);
 * entity.setDataTransferOnlyStr23(dataTransferOnlyStr23);
 * entity.setDataTransferOnlyStr24(dataTransferOnlyStr24);
 * entity.setDataTransferOnlyStr25(dataTransferOnlyStr25);
 * entity.setDataTransferOnlyStr26(dataTransferOnlyStr26);
 * entity.setDataTransferOnlyStr27(dataTransferOnlyStr27);
 * entity.setDataTransferOnlyStr28(dataTransferOnlyStr28);
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
public abstract class BsTReceivePlanDataTransfer extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _receivePlanDataTransferId;

    /** RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b} */
    protected Long _receivePlanBId;

    /** DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr01;

    /** DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr02;

    /** DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)} */
    protected String _dataTransferOnlyStr03;

    /** DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)} */
    protected String _dataTransferOnlyStr04;

    /** DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)} */
    protected String _dataTransferOnlyStr05;

    /** DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr06;

    /** DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr07;

    /** DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr08;

    /** DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr09;

    /** DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr10;

    /** DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr11;

    /** DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr12;

    /** DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr13;

    /** DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr14;

    /** DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr15;

    /** DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr16;

    /** DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr17;

    /** DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr18;

    /** DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr19;

    /** DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr20;

    /** DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr21;

    /** DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr22;

    /** DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr23;

    /** DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr24;

    /** DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr25;

    /** DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)} */
    protected String _dataTransferOnlyStr26;

    /** DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr27;

    /** DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr28;

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
        return "t_receive_plan_data_transfer";
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
        if (_receivePlanDataTransferId == null) { return false; }
        if (_receivePlanBId == null) { return false; }
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
        if (obj instanceof BsTReceivePlanDataTransfer) {
            BsTReceivePlanDataTransfer other = (BsTReceivePlanDataTransfer)obj;
            if (!xSV(_receivePlanDataTransferId, other._receivePlanDataTransferId)) { return false; }
            if (!xSV(_receivePlanBId, other._receivePlanBId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _receivePlanDataTransferId);
        hs = xCH(hs, _receivePlanBId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tReceivePlanB != null)
        { sb.append(li).append(xbRDS(_tReceivePlanB, "tReceivePlanB")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_receivePlanDataTransferId));
        sb.append(dm).append(xfND(_receivePlanBId));
        sb.append(dm).append(xfND(_dataTransferOnlyStr01));
        sb.append(dm).append(xfND(_dataTransferOnlyStr02));
        sb.append(dm).append(xfND(_dataTransferOnlyStr03));
        sb.append(dm).append(xfND(_dataTransferOnlyStr04));
        sb.append(dm).append(xfND(_dataTransferOnlyStr05));
        sb.append(dm).append(xfND(_dataTransferOnlyStr06));
        sb.append(dm).append(xfND(_dataTransferOnlyStr07));
        sb.append(dm).append(xfND(_dataTransferOnlyStr08));
        sb.append(dm).append(xfND(_dataTransferOnlyStr09));
        sb.append(dm).append(xfND(_dataTransferOnlyStr10));
        sb.append(dm).append(xfND(_dataTransferOnlyStr11));
        sb.append(dm).append(xfND(_dataTransferOnlyStr12));
        sb.append(dm).append(xfND(_dataTransferOnlyStr13));
        sb.append(dm).append(xfND(_dataTransferOnlyStr14));
        sb.append(dm).append(xfND(_dataTransferOnlyStr15));
        sb.append(dm).append(xfND(_dataTransferOnlyStr16));
        sb.append(dm).append(xfND(_dataTransferOnlyStr17));
        sb.append(dm).append(xfND(_dataTransferOnlyStr18));
        sb.append(dm).append(xfND(_dataTransferOnlyStr19));
        sb.append(dm).append(xfND(_dataTransferOnlyStr20));
        sb.append(dm).append(xfND(_dataTransferOnlyStr21));
        sb.append(dm).append(xfND(_dataTransferOnlyStr22));
        sb.append(dm).append(xfND(_dataTransferOnlyStr23));
        sb.append(dm).append(xfND(_dataTransferOnlyStr24));
        sb.append(dm).append(xfND(_dataTransferOnlyStr25));
        sb.append(dm).append(xfND(_dataTransferOnlyStr26));
        sb.append(dm).append(xfND(_dataTransferOnlyStr27));
        sb.append(dm).append(xfND(_dataTransferOnlyStr28));
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
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TReceivePlanDataTransfer clone() {
        return (TReceivePlanDataTransfer)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入庫IFデータ転送ID
     * @return The value of the column 'RECEIVE_PLAN_DATA_TRANSFER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceivePlanDataTransferId() {
        checkSpecifiedProperty("receivePlanDataTransferId");
        return _receivePlanDataTransferId;
    }

    /**
     * [set] RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入庫IFデータ転送ID
     * @param receivePlanDataTransferId The value of the column 'RECEIVE_PLAN_DATA_TRANSFER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceivePlanDataTransferId(Long receivePlanDataTransferId) {
        registerModifiedProperty("receivePlanDataTransferId");
        _receivePlanDataTransferId = receivePlanDataTransferId;
    }

    /**
     * [get] RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b} <br>
     * 入荷予定ボディID
     * @return The value of the column 'RECEIVE_PLAN_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceivePlanBId() {
        checkSpecifiedProperty("receivePlanBId");
        return _receivePlanBId;
    }

    /**
     * [set] RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b} <br>
     * 入荷予定ボディID
     * @param receivePlanBId The value of the column 'RECEIVE_PLAN_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceivePlanBId(Long receivePlanBId) {
        registerModifiedProperty("receivePlanBId");
        _receivePlanBId = receivePlanBId;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} <br>
     * 赤黒区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR01'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr01() {
        checkSpecifiedProperty("dataTransferOnlyStr01");
        return convertEmptyToNull(_dataTransferOnlyStr01);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} <br>
     * 赤黒区分
     * @param dataTransferOnlyStr01 The value of the column 'DATA_TRANSFER_ONLY_STR01'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr01(String dataTransferOnlyStr01) {
        registerModifiedProperty("dataTransferOnlyStr01");
        _dataTransferOnlyStr01 = dataTransferOnlyStr01;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)} <br>
     * 代表ロケーション
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR02'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr02() {
        checkSpecifiedProperty("dataTransferOnlyStr02");
        return convertEmptyToNull(_dataTransferOnlyStr02);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)} <br>
     * 代表ロケーション
     * @param dataTransferOnlyStr02 The value of the column 'DATA_TRANSFER_ONLY_STR02'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr02(String dataTransferOnlyStr02) {
        registerModifiedProperty("dataTransferOnlyStr02");
        _dataTransferOnlyStr02 = dataTransferOnlyStr02;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)} <br>
     * 品名カナ1
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR03'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr03() {
        checkSpecifiedProperty("dataTransferOnlyStr03");
        return convertEmptyToNull(_dataTransferOnlyStr03);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)} <br>
     * 品名カナ1
     * @param dataTransferOnlyStr03 The value of the column 'DATA_TRANSFER_ONLY_STR03'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr03(String dataTransferOnlyStr03) {
        registerModifiedProperty("dataTransferOnlyStr03");
        _dataTransferOnlyStr03 = dataTransferOnlyStr03;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)} <br>
     * 品名カナ2
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR04'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr04() {
        checkSpecifiedProperty("dataTransferOnlyStr04");
        return convertEmptyToNull(_dataTransferOnlyStr04);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)} <br>
     * 品名カナ2
     * @param dataTransferOnlyStr04 The value of the column 'DATA_TRANSFER_ONLY_STR04'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr04(String dataTransferOnlyStr04) {
        registerModifiedProperty("dataTransferOnlyStr04");
        _dataTransferOnlyStr04 = dataTransferOnlyStr04;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)} <br>
     * 摘要
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR05'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr05() {
        checkSpecifiedProperty("dataTransferOnlyStr05");
        return convertEmptyToNull(_dataTransferOnlyStr05);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)} <br>
     * 摘要
     * @param dataTransferOnlyStr05 The value of the column 'DATA_TRANSFER_ONLY_STR05'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr05(String dataTransferOnlyStr05) {
        registerModifiedProperty("dataTransferOnlyStr05");
        _dataTransferOnlyStr05 = dataTransferOnlyStr05;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)} <br>
     * 端末番号
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR06'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr06() {
        checkSpecifiedProperty("dataTransferOnlyStr06");
        return convertEmptyToNull(_dataTransferOnlyStr06);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)} <br>
     * 端末番号
     * @param dataTransferOnlyStr06 The value of the column 'DATA_TRANSFER_ONLY_STR06'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr06(String dataTransferOnlyStr06) {
        registerModifiedProperty("dataTransferOnlyStr06");
        _dataTransferOnlyStr06 = dataTransferOnlyStr06;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)} <br>
     * サーバー送信フラグ
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR07'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr07() {
        checkSpecifiedProperty("dataTransferOnlyStr07");
        return convertEmptyToNull(_dataTransferOnlyStr07);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)} <br>
     * サーバー送信フラグ
     * @param dataTransferOnlyStr07 The value of the column 'DATA_TRANSFER_ONLY_STR07'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr07(String dataTransferOnlyStr07) {
        registerModifiedProperty("dataTransferOnlyStr07");
        _dataTransferOnlyStr07 = dataTransferOnlyStr07;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)} <br>
     * サーバー宛送信時刻
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR08'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr08() {
        checkSpecifiedProperty("dataTransferOnlyStr08");
        return convertEmptyToNull(_dataTransferOnlyStr08);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)} <br>
     * サーバー宛送信時刻
     * @param dataTransferOnlyStr08 The value of the column 'DATA_TRANSFER_ONLY_STR08'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr08(String dataTransferOnlyStr08) {
        registerModifiedProperty("dataTransferOnlyStr08");
        _dataTransferOnlyStr08 = dataTransferOnlyStr08;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)} <br>
     * 3社納品書番号2
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR09'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr09() {
        checkSpecifiedProperty("dataTransferOnlyStr09");
        return convertEmptyToNull(_dataTransferOnlyStr09);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)} <br>
     * 3社納品書番号2
     * @param dataTransferOnlyStr09 The value of the column 'DATA_TRANSFER_ONLY_STR09'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr09(String dataTransferOnlyStr09) {
        registerModifiedProperty("dataTransferOnlyStr09");
        _dataTransferOnlyStr09 = dataTransferOnlyStr09;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)} <br>
     * 加工品区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR10'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr10() {
        checkSpecifiedProperty("dataTransferOnlyStr10");
        return convertEmptyToNull(_dataTransferOnlyStr10);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)} <br>
     * 加工品区分
     * @param dataTransferOnlyStr10 The value of the column 'DATA_TRANSFER_ONLY_STR10'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr10(String dataTransferOnlyStr10) {
        registerModifiedProperty("dataTransferOnlyStr10");
        _dataTransferOnlyStr10 = dataTransferOnlyStr10;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)} <br>
     * 管理区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR11'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr11() {
        checkSpecifiedProperty("dataTransferOnlyStr11");
        return convertEmptyToNull(_dataTransferOnlyStr11);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)} <br>
     * 管理区分
     * @param dataTransferOnlyStr11 The value of the column 'DATA_TRANSFER_ONLY_STR11'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr11(String dataTransferOnlyStr11) {
        registerModifiedProperty("dataTransferOnlyStr11");
        _dataTransferOnlyStr11 = dataTransferOnlyStr11;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)} <br>
     * 3社売上日
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR12'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr12() {
        checkSpecifiedProperty("dataTransferOnlyStr12");
        return convertEmptyToNull(_dataTransferOnlyStr12);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)} <br>
     * 3社売上日
     * @param dataTransferOnlyStr12 The value of the column 'DATA_TRANSFER_ONLY_STR12'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr12(String dataTransferOnlyStr12) {
        registerModifiedProperty("dataTransferOnlyStr12");
        _dataTransferOnlyStr12 = dataTransferOnlyStr12;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)} <br>
     * 仕入単価
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR13'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr13() {
        checkSpecifiedProperty("dataTransferOnlyStr13");
        return convertEmptyToNull(_dataTransferOnlyStr13);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)} <br>
     * 仕入単価
     * @param dataTransferOnlyStr13 The value of the column 'DATA_TRANSFER_ONLY_STR13'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr13(String dataTransferOnlyStr13) {
        registerModifiedProperty("dataTransferOnlyStr13");
        _dataTransferOnlyStr13 = dataTransferOnlyStr13;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)} <br>
     * 作成日_発注
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR14'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr14() {
        checkSpecifiedProperty("dataTransferOnlyStr14");
        return convertEmptyToNull(_dataTransferOnlyStr14);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)} <br>
     * 作成日_発注
     * @param dataTransferOnlyStr14 The value of the column 'DATA_TRANSFER_ONLY_STR14'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr14(String dataTransferOnlyStr14) {
        registerModifiedProperty("dataTransferOnlyStr14");
        _dataTransferOnlyStr14 = dataTransferOnlyStr14;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)} <br>
     * 作成時間_発注
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR15'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr15() {
        checkSpecifiedProperty("dataTransferOnlyStr15");
        return convertEmptyToNull(_dataTransferOnlyStr15);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)} <br>
     * 作成時間_発注
     * @param dataTransferOnlyStr15 The value of the column 'DATA_TRANSFER_ONLY_STR15'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr15(String dataTransferOnlyStr15) {
        registerModifiedProperty("dataTransferOnlyStr15");
        _dataTransferOnlyStr15 = dataTransferOnlyStr15;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)} <br>
     * データ種別
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR16'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr16() {
        checkSpecifiedProperty("dataTransferOnlyStr16");
        return convertEmptyToNull(_dataTransferOnlyStr16);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)} <br>
     * データ種別
     * @param dataTransferOnlyStr16 The value of the column 'DATA_TRANSFER_ONLY_STR16'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr16(String dataTransferOnlyStr16) {
        registerModifiedProperty("dataTransferOnlyStr16");
        _dataTransferOnlyStr16 = dataTransferOnlyStr16;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)} <br>
     * 管理番号
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR17'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr17() {
        checkSpecifiedProperty("dataTransferOnlyStr17");
        return convertEmptyToNull(_dataTransferOnlyStr17);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)} <br>
     * 管理番号
     * @param dataTransferOnlyStr17 The value of the column 'DATA_TRANSFER_ONLY_STR17'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr17(String dataTransferOnlyStr17) {
        registerModifiedProperty("dataTransferOnlyStr17");
        _dataTransferOnlyStr17 = dataTransferOnlyStr17;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)} <br>
     * 入力順
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR18'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr18() {
        checkSpecifiedProperty("dataTransferOnlyStr18");
        return convertEmptyToNull(_dataTransferOnlyStr18);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)} <br>
     * 入力順
     * @param dataTransferOnlyStr18 The value of the column 'DATA_TRANSFER_ONLY_STR18'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr18(String dataTransferOnlyStr18) {
        registerModifiedProperty("dataTransferOnlyStr18");
        _dataTransferOnlyStr18 = dataTransferOnlyStr18;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)} <br>
     * 検品残数量
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR19'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr19() {
        checkSpecifiedProperty("dataTransferOnlyStr19");
        return convertEmptyToNull(_dataTransferOnlyStr19);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)} <br>
     * 検品残数量
     * @param dataTransferOnlyStr19 The value of the column 'DATA_TRANSFER_ONLY_STR19'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr19(String dataTransferOnlyStr19) {
        registerModifiedProperty("dataTransferOnlyStr19");
        _dataTransferOnlyStr19 = dataTransferOnlyStr19;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)} <br>
     * 検品数量
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR20'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr20() {
        checkSpecifiedProperty("dataTransferOnlyStr20");
        return convertEmptyToNull(_dataTransferOnlyStr20);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)} <br>
     * 検品数量
     * @param dataTransferOnlyStr20 The value of the column 'DATA_TRANSFER_ONLY_STR20'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr20(String dataTransferOnlyStr20) {
        registerModifiedProperty("dataTransferOnlyStr20");
        _dataTransferOnlyStr20 = dataTransferOnlyStr20;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)} <br>
     * 検品確定区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR21'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr21() {
        checkSpecifiedProperty("dataTransferOnlyStr21");
        return convertEmptyToNull(_dataTransferOnlyStr21);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)} <br>
     * 検品確定区分
     * @param dataTransferOnlyStr21 The value of the column 'DATA_TRANSFER_ONLY_STR21'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr21(String dataTransferOnlyStr21) {
        registerModifiedProperty("dataTransferOnlyStr21");
        _dataTransferOnlyStr21 = dataTransferOnlyStr21;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)} <br>
     * 倉庫コード
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR22'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr22() {
        checkSpecifiedProperty("dataTransferOnlyStr22");
        return convertEmptyToNull(_dataTransferOnlyStr22);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)} <br>
     * 倉庫コード
     * @param dataTransferOnlyStr22 The value of the column 'DATA_TRANSFER_ONLY_STR22'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr22(String dataTransferOnlyStr22) {
        registerModifiedProperty("dataTransferOnlyStr22");
        _dataTransferOnlyStr22 = dataTransferOnlyStr22;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)} <br>
     * 完了区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR23'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr23() {
        checkSpecifiedProperty("dataTransferOnlyStr23");
        return convertEmptyToNull(_dataTransferOnlyStr23);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)} <br>
     * 完了区分
     * @param dataTransferOnlyStr23 The value of the column 'DATA_TRANSFER_ONLY_STR23'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr23(String dataTransferOnlyStr23) {
        registerModifiedProperty("dataTransferOnlyStr23");
        _dataTransferOnlyStr23 = dataTransferOnlyStr23;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)} <br>
     * プログラムID
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR24'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr24() {
        checkSpecifiedProperty("dataTransferOnlyStr24");
        return convertEmptyToNull(_dataTransferOnlyStr24);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)} <br>
     * プログラムID
     * @param dataTransferOnlyStr24 The value of the column 'DATA_TRANSFER_ONLY_STR24'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr24(String dataTransferOnlyStr24) {
        registerModifiedProperty("dataTransferOnlyStr24");
        _dataTransferOnlyStr24 = dataTransferOnlyStr24;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)} <br>
     * JANコード区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR25'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr25() {
        checkSpecifiedProperty("dataTransferOnlyStr25");
        return convertEmptyToNull(_dataTransferOnlyStr25);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)} <br>
     * JANコード区分
     * @param dataTransferOnlyStr25 The value of the column 'DATA_TRANSFER_ONLY_STR25'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr25(String dataTransferOnlyStr25) {
        registerModifiedProperty("dataTransferOnlyStr25");
        _dataTransferOnlyStr25 = dataTransferOnlyStr25;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)} <br>
     * ダミー
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR26'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr26() {
        checkSpecifiedProperty("dataTransferOnlyStr26");
        return convertEmptyToNull(_dataTransferOnlyStr26);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)} <br>
     * ダミー
     * @param dataTransferOnlyStr26 The value of the column 'DATA_TRANSFER_ONLY_STR26'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr26(String dataTransferOnlyStr26) {
        registerModifiedProperty("dataTransferOnlyStr26");
        _dataTransferOnlyStr26 = dataTransferOnlyStr26;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)} <br>
     * SAP更新担当者コード
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR27'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr27() {
        checkSpecifiedProperty("dataTransferOnlyStr27");
        return convertEmptyToNull(_dataTransferOnlyStr27);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)} <br>
     * SAP更新担当者コード
     * @param dataTransferOnlyStr27 The value of the column 'DATA_TRANSFER_ONLY_STR27'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr27(String dataTransferOnlyStr27) {
        registerModifiedProperty("dataTransferOnlyStr27");
        _dataTransferOnlyStr27 = dataTransferOnlyStr27;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)} <br>
     * 削除フラグ
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR28'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr28() {
        checkSpecifiedProperty("dataTransferOnlyStr28");
        return convertEmptyToNull(_dataTransferOnlyStr28);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)} <br>
     * 削除フラグ
     * @param dataTransferOnlyStr28 The value of the column 'DATA_TRANSFER_ONLY_STR28'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr28(String dataTransferOnlyStr28) {
        registerModifiedProperty("dataTransferOnlyStr28");
        _dataTransferOnlyStr28 = dataTransferOnlyStr28;
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
