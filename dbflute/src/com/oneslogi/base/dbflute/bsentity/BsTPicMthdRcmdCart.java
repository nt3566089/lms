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
 * The entity of t_pic_mthd_rcmd_cart as TABLE. <br>
 * ピッキング提案台車
 * <pre>
 * [primary-key]
 *     PIC_MTHD_RCMD_CART_ID
 *
 * [column]
 *     PIC_MTHD_RCMD_CART_ID, PACKING_H_ID, CART_NO, PIC_MTHD_RCMD_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PIC_MTHD_RCMD_CART_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_packing_h, t_pic_mthd_rcmd
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tPackingH, tPicMthdRcmd
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long picMthdRcmdCartId = entity.getPicMthdRcmdCartId();
 * Long packingHId = entity.getPackingHId();
 * Long cartNo = entity.getCartNo();
 * Long picMthdRcmdId = entity.getPicMthdRcmdId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPicMthdRcmdCartId(picMthdRcmdCartId);
 * entity.setPackingHId(packingHId);
 * entity.setCartNo(cartNo);
 * entity.setPicMthdRcmdId(picMthdRcmdId);
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
public abstract class BsTPicMthdRcmdCart extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _picMthdRcmdCartId;

    /** PACKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_packing_h} */
    protected Long _packingHId;

    /** CART_NO: {BIGINT(19)} */
    protected Long _cartNo;

    /** PIC_MTHD_RCMD_ID: {IX, BIGINT(19), FK to t_pic_mthd_rcmd} */
    protected Long _picMthdRcmdId;

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
        return "t_pic_mthd_rcmd_cart";
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
        if (_picMthdRcmdCartId == null) { return false; }
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
    /** t_packing_h by my PACKING_H_ID, named 'TPackingH'. */
    protected TPackingH _tPackingH;

    /**
     * [get] t_packing_h by my PACKING_H_ID, named 'TPackingH'. <br>
     * @return The entity of foreign property 'TPackingH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TPackingH getTPackingH() {
        return _tPackingH;
    }

    /**
     * [set] t_packing_h by my PACKING_H_ID, named 'TPackingH'.
     * @param tPackingH The entity of foreign property 'TPackingH'. (NullAllowed)
     */
    public void setTPackingH(TPackingH tPackingH) {
        _tPackingH = tPackingH;
    }

    /** t_pic_mthd_rcmd by my PIC_MTHD_RCMD_ID, named 'TPicMthdRcmd'. */
    protected TPicMthdRcmd _tPicMthdRcmd;

    /**
     * [get] t_pic_mthd_rcmd by my PIC_MTHD_RCMD_ID, named 'TPicMthdRcmd'. <br>
     * @return The entity of foreign property 'TPicMthdRcmd'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TPicMthdRcmd getTPicMthdRcmd() {
        return _tPicMthdRcmd;
    }

    /**
     * [set] t_pic_mthd_rcmd by my PIC_MTHD_RCMD_ID, named 'TPicMthdRcmd'.
     * @param tPicMthdRcmd The entity of foreign property 'TPicMthdRcmd'. (NullAllowed)
     */
    public void setTPicMthdRcmd(TPicMthdRcmd tPicMthdRcmd) {
        _tPicMthdRcmd = tPicMthdRcmd;
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
        if (obj instanceof BsTPicMthdRcmdCart) {
            BsTPicMthdRcmdCart other = (BsTPicMthdRcmdCart)obj;
            if (!xSV(_picMthdRcmdCartId, other._picMthdRcmdCartId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _picMthdRcmdCartId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tPackingH != null)
        { sb.append(li).append(xbRDS(_tPackingH, "tPackingH")); }
        if (_tPicMthdRcmd != null)
        { sb.append(li).append(xbRDS(_tPicMthdRcmd, "tPicMthdRcmd")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_picMthdRcmdCartId));
        sb.append(dm).append(xfND(_packingHId));
        sb.append(dm).append(xfND(_cartNo));
        sb.append(dm).append(xfND(_picMthdRcmdId));
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
        if (_tPackingH != null)
        { sb.append(dm).append("tPackingH"); }
        if (_tPicMthdRcmd != null)
        { sb.append(dm).append("tPicMthdRcmd"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TPicMthdRcmdCart clone() {
        return (TPicMthdRcmdCart)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * ピッキング提案台車ID
     * @return The value of the column 'PIC_MTHD_RCMD_CART_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPicMthdRcmdCartId() {
        checkSpecifiedProperty("picMthdRcmdCartId");
        return _picMthdRcmdCartId;
    }

    /**
     * [set] PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * ピッキング提案台車ID
     * @param picMthdRcmdCartId The value of the column 'PIC_MTHD_RCMD_CART_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPicMthdRcmdCartId(Long picMthdRcmdCartId) {
        registerModifiedProperty("picMthdRcmdCartId");
        _picMthdRcmdCartId = picMthdRcmdCartId;
    }

    /**
     * [get] PACKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_packing_h} <br>
     * 梱包ヘッダID
     * @return The value of the column 'PACKING_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPackingHId() {
        checkSpecifiedProperty("packingHId");
        return _packingHId;
    }

    /**
     * [set] PACKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_packing_h} <br>
     * 梱包ヘッダID
     * @param packingHId The value of the column 'PACKING_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPackingHId(Long packingHId) {
        registerModifiedProperty("packingHId");
        _packingHId = packingHId;
    }

    /**
     * [get] CART_NO: {BIGINT(19)} <br>
     * 台車No.
     * @return The value of the column 'CART_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCartNo() {
        checkSpecifiedProperty("cartNo");
        return _cartNo;
    }

    /**
     * [set] CART_NO: {BIGINT(19)} <br>
     * 台車No.
     * @param cartNo The value of the column 'CART_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCartNo(Long cartNo) {
        registerModifiedProperty("cartNo");
        _cartNo = cartNo;
    }

    /**
     * [get] PIC_MTHD_RCMD_ID: {IX, BIGINT(19), FK to t_pic_mthd_rcmd} <br>
     * ピッキング提案ID
     * @return The value of the column 'PIC_MTHD_RCMD_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPicMthdRcmdId() {
        checkSpecifiedProperty("picMthdRcmdId");
        return _picMthdRcmdId;
    }

    /**
     * [set] PIC_MTHD_RCMD_ID: {IX, BIGINT(19), FK to t_pic_mthd_rcmd} <br>
     * ピッキング提案ID
     * @param picMthdRcmdId The value of the column 'PIC_MTHD_RCMD_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicMthdRcmdId(Long picMthdRcmdId) {
        registerModifiedProperty("picMthdRcmdId");
        _picMthdRcmdId = picMthdRcmdId;
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