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
 * The entity of t_shipping_inst_data_transfer as TABLE. <br>
 * 出荷IFデータ転送テーブル
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_DATA_TRANSFER_ID, SHIPPING_INST_B_ID
 *
 * [column]
 *     SHIPPING_INST_DATA_TRANSFER_ID, SHIPPING_INST_B_ID, DATA_TRANSFER_ONLY_STR01, DATA_TRANSFER_ONLY_STR02, DATA_TRANSFER_ONLY_STR03, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_DATA_TRANSFER_ID
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
 * Long shippingInstDataTransferId = entity.getShippingInstDataTransferId();
 * Long shippingInstBId = entity.getShippingInstBId();
 * String dataTransferOnlyStr01 = entity.getDataTransferOnlyStr01();
 * String dataTransferOnlyStr02 = entity.getDataTransferOnlyStr02();
 * String dataTransferOnlyStr03 = entity.getDataTransferOnlyStr03();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setShippingInstDataTransferId(shippingInstDataTransferId);
 * entity.setShippingInstBId(shippingInstBId);
 * entity.setDataTransferOnlyStr01(dataTransferOnlyStr01);
 * entity.setDataTransferOnlyStr02(dataTransferOnlyStr02);
 * entity.setDataTransferOnlyStr03(dataTransferOnlyStr03);
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
public abstract class BsTShippingInstDataTransfer extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHIPPING_INST_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _shippingInstDataTransferId;

    /** SHIPPING_INST_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_shipping_inst_b} */
    protected Long _shippingInstBId;

    /** DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr01;

    /** DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)} */
    protected String _dataTransferOnlyStr02;

    /** DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr03;

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
        return "t_shipping_inst_data_transfer";
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
        if (_shippingInstDataTransferId == null) { return false; }
        if (_shippingInstBId == null) { return false; }
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
        if (obj instanceof BsTShippingInstDataTransfer) {
            BsTShippingInstDataTransfer other = (BsTShippingInstDataTransfer)obj;
            if (!xSV(_shippingInstDataTransferId, other._shippingInstDataTransferId)) { return false; }
            if (!xSV(_shippingInstBId, other._shippingInstBId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shippingInstDataTransferId);
        hs = xCH(hs, _shippingInstBId);
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
        sb.append(dm).append(xfND(_shippingInstDataTransferId));
        sb.append(dm).append(xfND(_shippingInstBId));
        sb.append(dm).append(xfND(_dataTransferOnlyStr01));
        sb.append(dm).append(xfND(_dataTransferOnlyStr02));
        sb.append(dm).append(xfND(_dataTransferOnlyStr03));
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
    public TShippingInstDataTransfer clone() {
        return (TShippingInstDataTransfer)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_INST_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷IFデータ転送ID
     * @return The value of the column 'SHIPPING_INST_DATA_TRANSFER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippingInstDataTransferId() {
        checkSpecifiedProperty("shippingInstDataTransferId");
        return _shippingInstDataTransferId;
    }

    /**
     * [set] SHIPPING_INST_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷IFデータ転送ID
     * @param shippingInstDataTransferId The value of the column 'SHIPPING_INST_DATA_TRANSFER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShippingInstDataTransferId(Long shippingInstDataTransferId) {
        registerModifiedProperty("shippingInstDataTransferId");
        _shippingInstDataTransferId = shippingInstDataTransferId;
    }

    /**
     * [get] SHIPPING_INST_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_shipping_inst_b} <br>
     * 出荷指示ボディID
     * @return The value of the column 'SHIPPING_INST_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippingInstBId() {
        checkSpecifiedProperty("shippingInstBId");
        return _shippingInstBId;
    }

    /**
     * [set] SHIPPING_INST_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_shipping_inst_b} <br>
     * 出荷指示ボディID
     * @param shippingInstBId The value of the column 'SHIPPING_INST_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShippingInstBId(Long shippingInstBId) {
        registerModifiedProperty("shippingInstBId");
        _shippingInstBId = shippingInstBId;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} <br>
     * ヘルメット区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR01'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr01() {
        checkSpecifiedProperty("dataTransferOnlyStr01");
        return convertEmptyToNull(_dataTransferOnlyStr01);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} <br>
     * ヘルメット区分
     * @param dataTransferOnlyStr01 The value of the column 'DATA_TRANSFER_ONLY_STR01'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr01(String dataTransferOnlyStr01) {
        registerModifiedProperty("dataTransferOnlyStr01");
        _dataTransferOnlyStr01 = dataTransferOnlyStr01;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)} <br>
     * マーク名称
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR02'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr02() {
        checkSpecifiedProperty("dataTransferOnlyStr02");
        return convertEmptyToNull(_dataTransferOnlyStr02);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)} <br>
     * マーク名称
     * @param dataTransferOnlyStr02 The value of the column 'DATA_TRANSFER_ONLY_STR02'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr02(String dataTransferOnlyStr02) {
        registerModifiedProperty("dataTransferOnlyStr02");
        _dataTransferOnlyStr02 = dataTransferOnlyStr02;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)} <br>
     * ステータス
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR03'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr03() {
        checkSpecifiedProperty("dataTransferOnlyStr03");
        return convertEmptyToNull(_dataTransferOnlyStr03);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)} <br>
     * ステータス
     * @param dataTransferOnlyStr03 The value of the column 'DATA_TRANSFER_ONLY_STR03'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr03(String dataTransferOnlyStr03) {
        registerModifiedProperty("dataTransferOnlyStr03");
        _dataTransferOnlyStr03 = dataTransferOnlyStr03;
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
