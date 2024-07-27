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
 * The entity of t_move_record_b as TABLE. <br>
 * 在庫移動実績ボディ
 * <pre>
 * [primary-key]
 *     MOVE_RECORD_B_ID
 *
 * [column]
 *     MOVE_RECORD_B_ID, MOVE_INST_H_ID, MOVE_INST_B_ID, PROCESS_NO, LOCATION_ID, MOVE_DT, MOVE_NUM, STORE_NO_MERGE_FLG, ALL_SHIPPING_FLG, USER_ID, CM_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MOVE_RECORD_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     b_user, m_location, t_move_inst_b, t_move_inst_h, b_class_dtl(ByAllShippingFlg)
 *
 * [referrer table]
 *     t_stock_inout
 *
 * [foreign property]
 *     bUser, mLocation, tMoveInstB, tMoveInstH, bClassDtlByAllShippingFlg, bClassDtlByStoreNoMergeFlg
 *
 * [referrer property]
 *     tStockInoutList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long moveRecordBId = entity.getMoveRecordBId();
 * Long moveInstHId = entity.getMoveInstHId();
 * Long moveInstBId = entity.getMoveInstBId();
 * String processNo = entity.getProcessNo();
 * Long locationId = entity.getLocationId();
 * String moveDt = entity.getMoveDt();
 * java.math.BigDecimal moveNum = entity.getMoveNum();
 * String storeNoMergeFlg = entity.getStoreNoMergeFlg();
 * String allShippingFlg = entity.getAllShippingFlg();
 * Long userId = entity.getUserId();
 * String cmSendFlg = entity.getCmSendFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setMoveRecordBId(moveRecordBId);
 * entity.setMoveInstHId(moveInstHId);
 * entity.setMoveInstBId(moveInstBId);
 * entity.setProcessNo(processNo);
 * entity.setLocationId(locationId);
 * entity.setMoveDt(moveDt);
 * entity.setMoveNum(moveNum);
 * entity.setStoreNoMergeFlg(storeNoMergeFlg);
 * entity.setAllShippingFlg(allShippingFlg);
 * entity.setUserId(userId);
 * entity.setCmSendFlg(cmSendFlg);
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
public abstract class BsTMoveRecordB extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MOVE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _moveRecordBId;

    /** MOVE_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_move_inst_h} */
    protected Long _moveInstHId;

    /** MOVE_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_move_inst_b} */
    protected Long _moveInstBId;

    /** PROCESS_NO: {NotNull, VARCHAR(30)} */
    protected String _processNo;

    /** LOCATION_ID: {IX, BIGINT(19), FK to m_location} */
    protected Long _locationId;

    /** MOVE_DT: {NotNull, VARCHAR(8)} */
    protected String _moveDt;

    /** MOVE_NUM: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _moveNum;

    /** STORE_NO_MERGE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg} */
    protected String _storeNoMergeFlg;

    /** ALL_SHIPPING_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=AllShippingFlg} */
    protected String _allShippingFlg;

    /** USER_ID: {IX, BIGINT(19), FK to b_user} */
    protected Long _userId;

    /** CM_SEND_FLG: {CHAR(1), default=[0]} */
    protected String _cmSendFlg;

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
        return "t_move_record_b";
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
        if (_moveRecordBId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of storeNoMergeFlg as the classification of StoreNoMergeFlg. <br>
     * STORE_NO_MERGE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg} <br>
     * 入庫No.マージフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.StoreNoMergeFlg getStoreNoMergeFlgAsStoreNoMergeFlg() {
        return CDef.StoreNoMergeFlg.codeOf(getStoreNoMergeFlg());
    }

    /**
     * Set the value of storeNoMergeFlg as the classification of StoreNoMergeFlg. <br>
     * STORE_NO_MERGE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg} <br>
     * 入庫No.マージフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStoreNoMergeFlgAsStoreNoMergeFlg(CDef.StoreNoMergeFlg cdef) {
        setStoreNoMergeFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of allShippingFlg as the classification of AllShippingFlg. <br>
     * ALL_SHIPPING_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=AllShippingFlg} <br>
     * 全数出庫フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.AllShippingFlg getAllShippingFlgAsAllShippingFlg() {
        return CDef.AllShippingFlg.codeOf(getAllShippingFlg());
    }

    /**
     * Set the value of allShippingFlg as the classification of AllShippingFlg. <br>
     * ALL_SHIPPING_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=AllShippingFlg} <br>
     * 全数出庫フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setAllShippingFlgAsAllShippingFlg(CDef.AllShippingFlg cdef) {
        setAllShippingFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of storeNoMergeFlg as $0 (0). <br>
     * $0: マージしない
     */
    public void setStoreNoMergeFlg_$0() {
        setStoreNoMergeFlgAsStoreNoMergeFlg(CDef.StoreNoMergeFlg.$0);
    }

    /**
     * Set the value of storeNoMergeFlg as $1 (1). <br>
     * $1: マージする
     */
    public void setStoreNoMergeFlg_$1() {
        setStoreNoMergeFlgAsStoreNoMergeFlg(CDef.StoreNoMergeFlg.$1);
    }

    /**
     * Set the value of allShippingFlg as $0 (0). <br>
     * $0: 部分出庫
     */
    public void setAllShippingFlg_$0() {
        setAllShippingFlgAsAllShippingFlg(CDef.AllShippingFlg.$0);
    }

    /**
     * Set the value of allShippingFlg as $1 (1). <br>
     * $1: 全数出庫
     */
    public void setAllShippingFlg_$1() {
        setAllShippingFlgAsAllShippingFlg(CDef.AllShippingFlg.$1);
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
     * Is the value of storeNoMergeFlg $0? <br>
     * $0: マージしない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStoreNoMergeFlg$0() {
        CDef.StoreNoMergeFlg cdef = getStoreNoMergeFlgAsStoreNoMergeFlg();
        return cdef != null ? cdef.equals(CDef.StoreNoMergeFlg.$0) : false;
    }

    /**
     * Is the value of storeNoMergeFlg $1? <br>
     * $1: マージする
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStoreNoMergeFlg$1() {
        CDef.StoreNoMergeFlg cdef = getStoreNoMergeFlgAsStoreNoMergeFlg();
        return cdef != null ? cdef.equals(CDef.StoreNoMergeFlg.$1) : false;
    }

    /**
     * Is the value of allShippingFlg $0? <br>
     * $0: 部分出庫
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAllShippingFlg$0() {
        CDef.AllShippingFlg cdef = getAllShippingFlgAsAllShippingFlg();
        return cdef != null ? cdef.equals(CDef.AllShippingFlg.$0) : false;
    }

    /**
     * Is the value of allShippingFlg $1? <br>
     * $1: 全数出庫
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAllShippingFlg$1() {
        CDef.AllShippingFlg cdef = getAllShippingFlgAsAllShippingFlg();
        return cdef != null ? cdef.equals(CDef.AllShippingFlg.$1) : false;
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
     * Get the value of the column 'storeNoMergeFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getStoreNoMergeFlgName() {
        CDef.StoreNoMergeFlg cdef = getStoreNoMergeFlgAsStoreNoMergeFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'allShippingFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getAllShippingFlgName() {
        CDef.AllShippingFlg cdef = getAllShippingFlgAsAllShippingFlg();
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
    /** b_user by my USER_ID, named 'BUser'. */
    protected BUser _bUser;

    /**
     * [get] b_user by my USER_ID, named 'BUser'. <br>
     * @return The entity of foreign property 'BUser'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUser() {
        return _bUser;
    }

    /**
     * [set] b_user by my USER_ID, named 'BUser'.
     * @param bUser The entity of foreign property 'BUser'. (NullAllowed)
     */
    public void setBUser(BUser bUser) {
        _bUser = bUser;
    }

    /** m_location by my LOCATION_ID, named 'MLocation'. */
    protected MLocation _mLocation;

    /**
     * [get] m_location by my LOCATION_ID, named 'MLocation'. <br>
     * @return The entity of foreign property 'MLocation'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MLocation getMLocation() {
        return _mLocation;
    }

    /**
     * [set] m_location by my LOCATION_ID, named 'MLocation'.
     * @param mLocation The entity of foreign property 'MLocation'. (NullAllowed)
     */
    public void setMLocation(MLocation mLocation) {
        _mLocation = mLocation;
    }

    /** t_move_inst_b by my MOVE_INST_B_ID, named 'TMoveInstB'. */
    protected TMoveInstB _tMoveInstB;

    /**
     * [get] t_move_inst_b by my MOVE_INST_B_ID, named 'TMoveInstB'. <br>
     * @return The entity of foreign property 'TMoveInstB'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TMoveInstB getTMoveInstB() {
        return _tMoveInstB;
    }

    /**
     * [set] t_move_inst_b by my MOVE_INST_B_ID, named 'TMoveInstB'.
     * @param tMoveInstB The entity of foreign property 'TMoveInstB'. (NullAllowed)
     */
    public void setTMoveInstB(TMoveInstB tMoveInstB) {
        _tMoveInstB = tMoveInstB;
    }

    /** t_move_inst_h by my MOVE_INST_H_ID, named 'TMoveInstH'. */
    protected TMoveInstH _tMoveInstH;

    /**
     * [get] t_move_inst_h by my MOVE_INST_H_ID, named 'TMoveInstH'. <br>
     * @return The entity of foreign property 'TMoveInstH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TMoveInstH getTMoveInstH() {
        return _tMoveInstH;
    }

    /**
     * [set] t_move_inst_h by my MOVE_INST_H_ID, named 'TMoveInstH'.
     * @param tMoveInstH The entity of foreign property 'TMoveInstH'. (NullAllowed)
     */
    public void setTMoveInstH(TMoveInstH tMoveInstH) {
        _tMoveInstH = tMoveInstH;
    }

    /** b_class_dtl by my ALL_SHIPPING_FLG, named 'BClassDtlByAllShippingFlg'. */
    protected BClassDtl _bClassDtlByAllShippingFlg;

    /**
     * [get] b_class_dtl by my ALL_SHIPPING_FLG, named 'BClassDtlByAllShippingFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByAllShippingFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByAllShippingFlg() {
        return _bClassDtlByAllShippingFlg;
    }

    /**
     * [set] b_class_dtl by my ALL_SHIPPING_FLG, named 'BClassDtlByAllShippingFlg'.
     * @param bClassDtlByAllShippingFlg The entity of foreign property 'BClassDtlByAllShippingFlg'. (NullAllowed)
     */
    public void setBClassDtlByAllShippingFlg(BClassDtl bClassDtlByAllShippingFlg) {
        _bClassDtlByAllShippingFlg = bClassDtlByAllShippingFlg;
    }

    /** b_class_dtl by my STORE_NO_MERGE_FLG, named 'BClassDtlByStoreNoMergeFlg'. */
    protected BClassDtl _bClassDtlByStoreNoMergeFlg;

    /**
     * [get] b_class_dtl by my STORE_NO_MERGE_FLG, named 'BClassDtlByStoreNoMergeFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByStoreNoMergeFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByStoreNoMergeFlg() {
        return _bClassDtlByStoreNoMergeFlg;
    }

    /**
     * [set] b_class_dtl by my STORE_NO_MERGE_FLG, named 'BClassDtlByStoreNoMergeFlg'.
     * @param bClassDtlByStoreNoMergeFlg The entity of foreign property 'BClassDtlByStoreNoMergeFlg'. (NullAllowed)
     */
    public void setBClassDtlByStoreNoMergeFlg(BClassDtl bClassDtlByStoreNoMergeFlg) {
        _bClassDtlByStoreNoMergeFlg = bClassDtlByStoreNoMergeFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** t_stock_inout by MOVE_RECORD_B_ID, named 'TStockInoutList'. */
    protected List<TStockInout> _tStockInoutList;

    /**
     * [get] t_stock_inout by MOVE_RECORD_B_ID, named 'TStockInoutList'.
     * @return The entity list of referrer property 'TStockInoutList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStockInout> getTStockInoutList() {
        if (_tStockInoutList == null) { _tStockInoutList = newReferrerList(); }
        return _tStockInoutList;
    }

    /**
     * [set] t_stock_inout by MOVE_RECORD_B_ID, named 'TStockInoutList'.
     * @param tStockInoutList The entity list of referrer property 'TStockInoutList'. (NullAllowed)
     */
    public void setTStockInoutList(List<TStockInout> tStockInoutList) {
        _tStockInoutList = tStockInoutList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTMoveRecordB) {
            BsTMoveRecordB other = (BsTMoveRecordB)obj;
            if (!xSV(_moveRecordBId, other._moveRecordBId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _moveRecordBId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bUser != null)
        { sb.append(li).append(xbRDS(_bUser, "bUser")); }
        if (_mLocation != null)
        { sb.append(li).append(xbRDS(_mLocation, "mLocation")); }
        if (_tMoveInstB != null)
        { sb.append(li).append(xbRDS(_tMoveInstB, "tMoveInstB")); }
        if (_tMoveInstH != null)
        { sb.append(li).append(xbRDS(_tMoveInstH, "tMoveInstH")); }
        if (_bClassDtlByAllShippingFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByAllShippingFlg, "bClassDtlByAllShippingFlg")); }
        if (_bClassDtlByStoreNoMergeFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByStoreNoMergeFlg, "bClassDtlByStoreNoMergeFlg")); }
        if (_tStockInoutList != null) { for (TStockInout et : _tStockInoutList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStockInoutList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_moveRecordBId));
        sb.append(dm).append(xfND(_moveInstHId));
        sb.append(dm).append(xfND(_moveInstBId));
        sb.append(dm).append(xfND(_processNo));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_moveDt));
        sb.append(dm).append(xfND(_moveNum));
        sb.append(dm).append(xfND(_storeNoMergeFlg));
        sb.append(dm).append(xfND(_allShippingFlg));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_cmSendFlg));
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
        if (_bUser != null)
        { sb.append(dm).append("bUser"); }
        if (_mLocation != null)
        { sb.append(dm).append("mLocation"); }
        if (_tMoveInstB != null)
        { sb.append(dm).append("tMoveInstB"); }
        if (_tMoveInstH != null)
        { sb.append(dm).append("tMoveInstH"); }
        if (_bClassDtlByAllShippingFlg != null)
        { sb.append(dm).append("bClassDtlByAllShippingFlg"); }
        if (_bClassDtlByStoreNoMergeFlg != null)
        { sb.append(dm).append("bClassDtlByStoreNoMergeFlg"); }
        if (_tStockInoutList != null && !_tStockInoutList.isEmpty())
        { sb.append(dm).append("tStockInoutList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TMoveRecordB clone() {
        return (TMoveRecordB)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MOVE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 在庫移動実績ボディID
     * @return The value of the column 'MOVE_RECORD_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMoveRecordBId() {
        checkSpecifiedProperty("moveRecordBId");
        return _moveRecordBId;
    }

    /**
     * [set] MOVE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 在庫移動実績ボディID
     * @param moveRecordBId The value of the column 'MOVE_RECORD_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMoveRecordBId(Long moveRecordBId) {
        registerModifiedProperty("moveRecordBId");
        _moveRecordBId = moveRecordBId;
    }

    /**
     * [get] MOVE_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_move_inst_h} <br>
     * 在庫移動指示ヘッダID
     * @return The value of the column 'MOVE_INST_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMoveInstHId() {
        checkSpecifiedProperty("moveInstHId");
        return _moveInstHId;
    }

    /**
     * [set] MOVE_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_move_inst_h} <br>
     * 在庫移動指示ヘッダID
     * @param moveInstHId The value of the column 'MOVE_INST_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMoveInstHId(Long moveInstHId) {
        registerModifiedProperty("moveInstHId");
        _moveInstHId = moveInstHId;
    }

    /**
     * [get] MOVE_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_move_inst_b} <br>
     * 在庫移動指示ボディID
     * @return The value of the column 'MOVE_INST_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMoveInstBId() {
        checkSpecifiedProperty("moveInstBId");
        return _moveInstBId;
    }

    /**
     * [set] MOVE_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_move_inst_b} <br>
     * 在庫移動指示ボディID
     * @param moveInstBId The value of the column 'MOVE_INST_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMoveInstBId(Long moveInstBId) {
        registerModifiedProperty("moveInstBId");
        _moveInstBId = moveInstBId;
    }

    /**
     * [get] PROCESS_NO: {NotNull, VARCHAR(30)} <br>
     * 処理No.
     * @return The value of the column 'PROCESS_NO'. (basically NotNull if selected: for the constraint)
     */
    public String getProcessNo() {
        checkSpecifiedProperty("processNo");
        return convertEmptyToNull(_processNo);
    }

    /**
     * [set] PROCESS_NO: {NotNull, VARCHAR(30)} <br>
     * 処理No.
     * @param processNo The value of the column 'PROCESS_NO'. (basically NotNull if update: for the constraint)
     */
    public void setProcessNo(String processNo) {
        registerModifiedProperty("processNo");
        _processNo = processNo;
    }

    /**
     * [get] LOCATION_ID: {IX, BIGINT(19), FK to m_location} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {IX, BIGINT(19), FK to m_location} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] MOVE_DT: {NotNull, VARCHAR(8)} <br>
     * 移動日
     * @return The value of the column 'MOVE_DT'. (basically NotNull if selected: for the constraint)
     */
    public String getMoveDt() {
        checkSpecifiedProperty("moveDt");
        return convertEmptyToNull(_moveDt);
    }

    /**
     * [set] MOVE_DT: {NotNull, VARCHAR(8)} <br>
     * 移動日
     * @param moveDt The value of the column 'MOVE_DT'. (basically NotNull if update: for the constraint)
     */
    public void setMoveDt(String moveDt) {
        registerModifiedProperty("moveDt");
        _moveDt = moveDt;
    }

    /**
     * [get] MOVE_NUM: {DECIMAL(14, 4)} <br>
     * 在庫移動実績数
     * @return The value of the column 'MOVE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMoveNum() {
        checkSpecifiedProperty("moveNum");
        return _moveNum;
    }

    /**
     * [set] MOVE_NUM: {DECIMAL(14, 4)} <br>
     * 在庫移動実績数
     * @param moveNum The value of the column 'MOVE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoveNum(java.math.BigDecimal moveNum) {
        registerModifiedProperty("moveNum");
        _moveNum = moveNum;
    }

    /**
     * [get] STORE_NO_MERGE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg} <br>
     * 入庫No.マージフラグ
     * @return The value of the column 'STORE_NO_MERGE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreNoMergeFlg() {
        checkSpecifiedProperty("storeNoMergeFlg");
        return convertEmptyToNull(_storeNoMergeFlg);
    }

    /**
     * [set] STORE_NO_MERGE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg} <br>
     * 入庫No.マージフラグ
     * @param storeNoMergeFlg The value of the column 'STORE_NO_MERGE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreNoMergeFlg(String storeNoMergeFlg) {
        registerModifiedProperty("storeNoMergeFlg");
        _storeNoMergeFlg = storeNoMergeFlg;
    }

    /**
     * [get] ALL_SHIPPING_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=AllShippingFlg} <br>
     * 全数出庫フラグ
     * @return The value of the column 'ALL_SHIPPING_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getAllShippingFlg() {
        checkSpecifiedProperty("allShippingFlg");
        return convertEmptyToNull(_allShippingFlg);
    }

    /**
     * [set] ALL_SHIPPING_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=AllShippingFlg} <br>
     * 全数出庫フラグ
     * @param allShippingFlg The value of the column 'ALL_SHIPPING_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllShippingFlg(String allShippingFlg) {
        registerModifiedProperty("allShippingFlg");
        _allShippingFlg = allShippingFlg;
    }

    /**
     * [get] USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 担当者ID
     * @return The value of the column 'USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 担当者ID
     * @param userId The value of the column 'USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserId(Long userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] CM_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 共通管理送信済フラグ
     * @return The value of the column 'CM_SEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCmSendFlg() {
        checkSpecifiedProperty("cmSendFlg");
        return convertEmptyToNull(_cmSendFlg);
    }

    /**
     * [set] CM_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 共通管理送信済フラグ
     * @param cmSendFlg The value of the column 'CM_SEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCmSendFlg(String cmSendFlg) {
        registerModifiedProperty("cmSendFlg");
        _cmSendFlg = cmSendFlg;
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
