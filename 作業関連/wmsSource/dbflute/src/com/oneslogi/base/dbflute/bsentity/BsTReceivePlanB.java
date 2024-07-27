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
 * The entity of t_receive_plan_b as TABLE. <br>
 * 入荷予定ボディ
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_B_ID
 *
 * [column]
 *     RECEIVE_PLAN_B_ID, RECEIVE_PLAN_H_ID, LINE_NO, RECEIVE_STATUS, PLAN_CLIENT_ORDER_NO, PLAN_WAREHOUSE_ID, PLAN_WAREHOUSE_CD, PRODUCT_ID, PRODUCT_CD, PLAN_LOT, PLAN_LIMIT_DT, PLAN_LOCATION_ID, PLAN_LOCATION_CD, PLAN_STORE_LABEL_NO, PLAN_NUM, ERROR_FLG, ERROR_MESSAGE_CD, STORE_ROW_NO, PLAN_PROD_DT, HINMOKU_GROUP, HINMOKU_TEXT, JAN_CD, UNIT_NM, REMAINING_RECEIVE_NUM, LOT_MANAG_TYPE_ID, LOT_MANAG_TYPE_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, REMAIN_FLG, WM_SEND_FLG, LP_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_receive_plan_h, m_location, m_warehouse, m_product, b_class_dtl(ByErrorFlg), t_receive_plan_spare(AsOne)
 *
 * [referrer table]
 *     t_receive_label, t_receive_plan_data_transfer, t_store_record_b, t_receive_plan_spare
 *
 * [foreign property]
 *     tReceivePlanH, mLocation, mWarehouse, mProduct, bClassDtlByErrorFlg, bClassDtlByReceiveStatus, tReceivePlanSpareAsOne
 *
 * [referrer property]
 *     tReceiveLabelList, tReceivePlanDataTransferList, tStoreRecordBList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long receivePlanBId = entity.getReceivePlanBId();
 * Long receivePlanHId = entity.getReceivePlanHId();
 * Long lineNo = entity.getLineNo();
 * String receiveStatus = entity.getReceiveStatus();
 * String planClientOrderNo = entity.getPlanClientOrderNo();
 * Long planWarehouseId = entity.getPlanWarehouseId();
 * String planWarehouseCd = entity.getPlanWarehouseCd();
 * Long productId = entity.getProductId();
 * String productCd = entity.getProductCd();
 * String planLot = entity.getPlanLot();
 * String planLimitDt = entity.getPlanLimitDt();
 * Long planLocationId = entity.getPlanLocationId();
 * String planLocationCd = entity.getPlanLocationCd();
 * String planStoreLabelNo = entity.getPlanStoreLabelNo();
 * java.math.BigDecimal planNum = entity.getPlanNum();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String storeRowNo = entity.getStoreRowNo();
 * String planProdDt = entity.getPlanProdDt();
 * String hinmokuGroup = entity.getHinmokuGroup();
 * String hinmokuText = entity.getHinmokuText();
 * String janCd = entity.getJanCd();
 * String unitNm = entity.getUnitNm();
 * java.math.BigDecimal remainingReceiveNum = entity.getRemainingReceiveNum();
 * Long lotManagTypeId = entity.getLotManagTypeId();
 * String lotManagTypeCd = entity.getLotManagTypeCd();
 * String shippingPlantCd = entity.getShippingPlantCd();
 * String shippingStorageSpaceCd = entity.getShippingStorageSpaceCd();
 * String remainFlg = entity.getRemainFlg();
 * String wmSendFlg = entity.getWmSendFlg();
 * String lpSendFlg = entity.getLpSendFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setReceivePlanBId(receivePlanBId);
 * entity.setReceivePlanHId(receivePlanHId);
 * entity.setLineNo(lineNo);
 * entity.setReceiveStatus(receiveStatus);
 * entity.setPlanClientOrderNo(planClientOrderNo);
 * entity.setPlanWarehouseId(planWarehouseId);
 * entity.setPlanWarehouseCd(planWarehouseCd);
 * entity.setProductId(productId);
 * entity.setProductCd(productCd);
 * entity.setPlanLot(planLot);
 * entity.setPlanLimitDt(planLimitDt);
 * entity.setPlanLocationId(planLocationId);
 * entity.setPlanLocationCd(planLocationCd);
 * entity.setPlanStoreLabelNo(planStoreLabelNo);
 * entity.setPlanNum(planNum);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setStoreRowNo(storeRowNo);
 * entity.setPlanProdDt(planProdDt);
 * entity.setHinmokuGroup(hinmokuGroup);
 * entity.setHinmokuText(hinmokuText);
 * entity.setJanCd(janCd);
 * entity.setUnitNm(unitNm);
 * entity.setRemainingReceiveNum(remainingReceiveNum);
 * entity.setLotManagTypeId(lotManagTypeId);
 * entity.setLotManagTypeCd(lotManagTypeCd);
 * entity.setShippingPlantCd(shippingPlantCd);
 * entity.setShippingStorageSpaceCd(shippingStorageSpaceCd);
 * entity.setRemainFlg(remainFlg);
 * entity.setWmSendFlg(wmSendFlg);
 * entity.setLpSendFlg(lpSendFlg);
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
public abstract class BsTReceivePlanB extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RECEIVE_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _receivePlanBId;

    /** RECEIVE_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_h} */
    protected Long _receivePlanHId;

    /** LINE_NO: {NotNull, BIGINT(19)} */
    protected Long _lineNo;

    /** RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus} */
    protected String _receiveStatus;

    /** PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)} */
    protected String _planClientOrderNo;

    /** PLAN_WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse} */
    protected Long _planWarehouseId;

    /** PLAN_WAREHOUSE_CD: {VARCHAR(30)} */
    protected String _planWarehouseCd;

    /** PRODUCT_ID: {IX, BIGINT(19), FK to m_product} */
    protected Long _productId;

    /** PRODUCT_CD: {IX, NotNull, VARCHAR(100)} */
    protected String _productCd;

    /** PLAN_LOT: {VARCHAR(30)} */
    protected String _planLot;

    /** PLAN_LIMIT_DT: {VARCHAR(8)} */
    protected String _planLimitDt;

    /** PLAN_LOCATION_ID: {IX, BIGINT(19), FK to m_location} */
    protected Long _planLocationId;

    /** PLAN_LOCATION_CD: {VARCHAR(30)} */
    protected String _planLocationCd;

    /** PLAN_STORE_LABEL_NO: {VARCHAR(30)} */
    protected String _planStoreLabelNo;

    /** PLAN_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _planNum;

    /** ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100)} */
    protected String _errorMessageCd;

    /** STORE_ROW_NO: {VARCHAR(30)} */
    protected String _storeRowNo;

    /** PLAN_PROD_DT: {VARCHAR(8)} */
    protected String _planProdDt;

    /** HINMOKU_GROUP: {VARCHAR(30)} */
    protected String _hinmokuGroup;

    /** HINMOKU_TEXT: {VARCHAR(60)} */
    protected String _hinmokuText;

    /** JAN_CD: {VARCHAR(30)} */
    protected String _janCd;

    /** UNIT_NM: {VARCHAR(60)} */
    protected String _unitNm;

    /** REMAINING_RECEIVE_NUM: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _remainingReceiveNum;

    /** LOT_MANAG_TYPE_ID: {BIGINT(19)} */
    protected Long _lotManagTypeId;

    /** LOT_MANAG_TYPE_CD: {VARCHAR(30)} */
    protected String _lotManagTypeCd;

    /** SHIPPING_PLANT_CD: {VARCHAR(30)} */
    protected String _shippingPlantCd;

    /** SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} */
    protected String _shippingStorageSpaceCd;

    /** REMAIN_FLG: {NotNull, CHAR(1), default=[1]} */
    protected String _remainFlg;

    /** WM_SEND_FLG: {CHAR(1), default=[0]} */
    protected String _wmSendFlg;

    /** LP_SEND_FLG: {CHAR(1), default=[0]} */
    protected String _lpSendFlg;

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
        return "t_receive_plan_b";
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
     * Get the value of receiveStatus as the classification of ReceiveStatus. <br>
     * RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ReceiveStatus getReceiveStatusAsReceiveStatus() {
        return CDef.ReceiveStatus.codeOf(getReceiveStatus());
    }

    /**
     * Set the value of receiveStatus as the classification of ReceiveStatus. <br>
     * RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus cdef) {
        setReceiveStatus(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of errorFlg as the classification of ErrorFlg. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ErrorFlg getErrorFlgAsErrorFlg() {
        return CDef.ErrorFlg.codeOf(getErrorFlg());
    }

    /**
     * Set the value of errorFlg as the classification of ErrorFlg. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setErrorFlgAsErrorFlg(CDef.ErrorFlg cdef) {
        setErrorFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of receiveStatus as $01 (01). <br>
     * $01: 未入荷
     */
    public void setReceiveStatus_$01() {
        setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus.$01);
    }

    /**
     * Set the value of receiveStatus as $02 (02). <br>
     * $02: 入荷中
     */
    public void setReceiveStatus_$02() {
        setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus.$02);
    }

    /**
     * Set the value of receiveStatus as $03 (03). <br>
     * $03: 入荷済
     */
    public void setReceiveStatus_$03() {
        setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus.$03);
    }

    /**
     * Set the value of receiveStatus as $90 (90). <br>
     * $90: 入荷削除
     */
    public void setReceiveStatus_$90() {
        setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus.$90);
    }

    /**
     * Set the value of receiveStatus as $99 (99). <br>
     * $99: エラー有
     */
    public void setReceiveStatus_$99() {
        setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus.$99);
    }

    /**
     * Set the value of errorFlg as $0 (0). <br>
     * $0: エラー無
     */
    public void setErrorFlg_$0() {
        setErrorFlgAsErrorFlg(CDef.ErrorFlg.$0);
    }

    /**
     * Set the value of errorFlg as $1 (1). <br>
     * $1: エラー有
     */
    public void setErrorFlg_$1() {
        setErrorFlgAsErrorFlg(CDef.ErrorFlg.$1);
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
     * Is the value of receiveStatus $01? <br>
     * $01: 未入荷
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveStatus$01() {
        CDef.ReceiveStatus cdef = getReceiveStatusAsReceiveStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveStatus.$01) : false;
    }

    /**
     * Is the value of receiveStatus $02? <br>
     * $02: 入荷中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveStatus$02() {
        CDef.ReceiveStatus cdef = getReceiveStatusAsReceiveStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveStatus.$02) : false;
    }

    /**
     * Is the value of receiveStatus $03? <br>
     * $03: 入荷済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveStatus$03() {
        CDef.ReceiveStatus cdef = getReceiveStatusAsReceiveStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveStatus.$03) : false;
    }

    /**
     * Is the value of receiveStatus $90? <br>
     * $90: 入荷削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveStatus$90() {
        CDef.ReceiveStatus cdef = getReceiveStatusAsReceiveStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveStatus.$90) : false;
    }

    /**
     * Is the value of receiveStatus $99? <br>
     * $99: エラー有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveStatus$99() {
        CDef.ReceiveStatus cdef = getReceiveStatusAsReceiveStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveStatus.$99) : false;
    }

    /**
     * Is the value of errorFlg $0? <br>
     * $0: エラー無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isErrorFlg$0() {
        CDef.ErrorFlg cdef = getErrorFlgAsErrorFlg();
        return cdef != null ? cdef.equals(CDef.ErrorFlg.$0) : false;
    }

    /**
     * Is the value of errorFlg $1? <br>
     * $1: エラー有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isErrorFlg$1() {
        CDef.ErrorFlg cdef = getErrorFlgAsErrorFlg();
        return cdef != null ? cdef.equals(CDef.ErrorFlg.$1) : false;
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
     * Get the value of the column 'receiveStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getReceiveStatusName() {
        CDef.ReceiveStatus cdef = getReceiveStatusAsReceiveStatus();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'errorFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getErrorFlgName() {
        CDef.ErrorFlg cdef = getErrorFlgAsErrorFlg();
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
    /** t_receive_plan_h by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'. */
    protected TReceivePlanH _tReceivePlanH;

    /**
     * [get] t_receive_plan_h by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'. <br>
     * @return The entity of foreign property 'TReceivePlanH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TReceivePlanH getTReceivePlanH() {
        return _tReceivePlanH;
    }

    /**
     * [set] t_receive_plan_h by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'.
     * @param tReceivePlanH The entity of foreign property 'TReceivePlanH'. (NullAllowed)
     */
    public void setTReceivePlanH(TReceivePlanH tReceivePlanH) {
        _tReceivePlanH = tReceivePlanH;
    }

    /** m_location by my PLAN_LOCATION_ID, named 'MLocation'. */
    protected MLocation _mLocation;

    /**
     * [get] m_location by my PLAN_LOCATION_ID, named 'MLocation'. <br>
     * @return The entity of foreign property 'MLocation'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MLocation getMLocation() {
        return _mLocation;
    }

    /**
     * [set] m_location by my PLAN_LOCATION_ID, named 'MLocation'.
     * @param mLocation The entity of foreign property 'MLocation'. (NullAllowed)
     */
    public void setMLocation(MLocation mLocation) {
        _mLocation = mLocation;
    }

    /** m_warehouse by my PLAN_WAREHOUSE_ID, named 'MWarehouse'. */
    protected MWarehouse _mWarehouse;

    /**
     * [get] m_warehouse by my PLAN_WAREHOUSE_ID, named 'MWarehouse'. <br>
     * @return The entity of foreign property 'MWarehouse'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MWarehouse getMWarehouse() {
        return _mWarehouse;
    }

    /**
     * [set] m_warehouse by my PLAN_WAREHOUSE_ID, named 'MWarehouse'.
     * @param mWarehouse The entity of foreign property 'MWarehouse'. (NullAllowed)
     */
    public void setMWarehouse(MWarehouse mWarehouse) {
        _mWarehouse = mWarehouse;
    }

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

    /** b_class_dtl by my ERROR_FLG, named 'BClassDtlByErrorFlg'. */
    protected BClassDtl _bClassDtlByErrorFlg;

    /**
     * [get] b_class_dtl by my ERROR_FLG, named 'BClassDtlByErrorFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByErrorFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByErrorFlg() {
        return _bClassDtlByErrorFlg;
    }

    /**
     * [set] b_class_dtl by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @param bClassDtlByErrorFlg The entity of foreign property 'BClassDtlByErrorFlg'. (NullAllowed)
     */
    public void setBClassDtlByErrorFlg(BClassDtl bClassDtlByErrorFlg) {
        _bClassDtlByErrorFlg = bClassDtlByErrorFlg;
    }

    /** b_class_dtl by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'. */
    protected BClassDtl _bClassDtlByReceiveStatus;

    /**
     * [get] b_class_dtl by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'. <br>
     * @return The entity of foreign property 'BClassDtlByReceiveStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByReceiveStatus() {
        return _bClassDtlByReceiveStatus;
    }

    /**
     * [set] b_class_dtl by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'.
     * @param bClassDtlByReceiveStatus The entity of foreign property 'BClassDtlByReceiveStatus'. (NullAllowed)
     */
    public void setBClassDtlByReceiveStatus(BClassDtl bClassDtlByReceiveStatus) {
        _bClassDtlByReceiveStatus = bClassDtlByReceiveStatus;
    }

    /** t_receive_plan_spare by RECEIVE_PLAN_B_ID, named 'TReceivePlanSpareAsOne'. */
    protected TReceivePlanSpare _tReceivePlanSpareAsOne;

    /**
     * [get] t_receive_plan_spare by RECEIVE_PLAN_B_ID, named 'TReceivePlanSpareAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'TReceivePlanSpareAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public TReceivePlanSpare getTReceivePlanSpareAsOne() {
        return _tReceivePlanSpareAsOne;
    }

    /**
     * [set] t_receive_plan_spare by RECEIVE_PLAN_B_ID, named 'TReceivePlanSpareAsOne'.
     * @param TReceivePlanSpareAsOne The entity of foreign property(referrer-as-one) 'TReceivePlanSpareAsOne'. (NullAllowed)
     */
    public void setTReceivePlanSpareAsOne(TReceivePlanSpare TReceivePlanSpareAsOne) {
        _tReceivePlanSpareAsOne = TReceivePlanSpareAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** t_receive_label by RECEIVE_PLAN_B_ID, named 'TReceiveLabelList'. */
    protected List<TReceiveLabel> _tReceiveLabelList;

    /**
     * [get] t_receive_label by RECEIVE_PLAN_B_ID, named 'TReceiveLabelList'.
     * @return The entity list of referrer property 'TReceiveLabelList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceiveLabel> getTReceiveLabelList() {
        if (_tReceiveLabelList == null) { _tReceiveLabelList = newReferrerList(); }
        return _tReceiveLabelList;
    }

    /**
     * [set] t_receive_label by RECEIVE_PLAN_B_ID, named 'TReceiveLabelList'.
     * @param tReceiveLabelList The entity list of referrer property 'TReceiveLabelList'. (NullAllowed)
     */
    public void setTReceiveLabelList(List<TReceiveLabel> tReceiveLabelList) {
        _tReceiveLabelList = tReceiveLabelList;
    }

    /** t_receive_plan_data_transfer by RECEIVE_PLAN_B_ID, named 'TReceivePlanDataTransferList'. */
    protected List<TReceivePlanDataTransfer> _tReceivePlanDataTransferList;

    /**
     * [get] t_receive_plan_data_transfer by RECEIVE_PLAN_B_ID, named 'TReceivePlanDataTransferList'.
     * @return The entity list of referrer property 'TReceivePlanDataTransferList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanDataTransfer> getTReceivePlanDataTransferList() {
        if (_tReceivePlanDataTransferList == null) { _tReceivePlanDataTransferList = newReferrerList(); }
        return _tReceivePlanDataTransferList;
    }

    /**
     * [set] t_receive_plan_data_transfer by RECEIVE_PLAN_B_ID, named 'TReceivePlanDataTransferList'.
     * @param tReceivePlanDataTransferList The entity list of referrer property 'TReceivePlanDataTransferList'. (NullAllowed)
     */
    public void setTReceivePlanDataTransferList(List<TReceivePlanDataTransfer> tReceivePlanDataTransferList) {
        _tReceivePlanDataTransferList = tReceivePlanDataTransferList;
    }

    /** t_store_record_b by RECEIVE_PLAN_B_ID, named 'TStoreRecordBList'. */
    protected List<TStoreRecordB> _tStoreRecordBList;

    /**
     * [get] t_store_record_b by RECEIVE_PLAN_B_ID, named 'TStoreRecordBList'.
     * @return The entity list of referrer property 'TStoreRecordBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStoreRecordB> getTStoreRecordBList() {
        if (_tStoreRecordBList == null) { _tStoreRecordBList = newReferrerList(); }
        return _tStoreRecordBList;
    }

    /**
     * [set] t_store_record_b by RECEIVE_PLAN_B_ID, named 'TStoreRecordBList'.
     * @param tStoreRecordBList The entity list of referrer property 'TStoreRecordBList'. (NullAllowed)
     */
    public void setTStoreRecordBList(List<TStoreRecordB> tStoreRecordBList) {
        _tStoreRecordBList = tStoreRecordBList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTReceivePlanB) {
            BsTReceivePlanB other = (BsTReceivePlanB)obj;
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
        hs = xCH(hs, _receivePlanBId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tReceivePlanH != null)
        { sb.append(li).append(xbRDS(_tReceivePlanH, "tReceivePlanH")); }
        if (_mLocation != null)
        { sb.append(li).append(xbRDS(_mLocation, "mLocation")); }
        if (_mWarehouse != null)
        { sb.append(li).append(xbRDS(_mWarehouse, "mWarehouse")); }
        if (_mProduct != null)
        { sb.append(li).append(xbRDS(_mProduct, "mProduct")); }
        if (_bClassDtlByErrorFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByErrorFlg, "bClassDtlByErrorFlg")); }
        if (_bClassDtlByReceiveStatus != null)
        { sb.append(li).append(xbRDS(_bClassDtlByReceiveStatus, "bClassDtlByReceiveStatus")); }
        if (_tReceivePlanSpareAsOne != null)
        { sb.append(li).append(xbRDS(_tReceivePlanSpareAsOne, "tReceivePlanSpareAsOne")); }
        if (_tReceiveLabelList != null) { for (TReceiveLabel et : _tReceiveLabelList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReceiveLabelList")); } } }
        if (_tReceivePlanDataTransferList != null) { for (TReceivePlanDataTransfer et : _tReceivePlanDataTransferList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReceivePlanDataTransferList")); } } }
        if (_tStoreRecordBList != null) { for (TStoreRecordB et : _tStoreRecordBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStoreRecordBList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_receivePlanBId));
        sb.append(dm).append(xfND(_receivePlanHId));
        sb.append(dm).append(xfND(_lineNo));
        sb.append(dm).append(xfND(_receiveStatus));
        sb.append(dm).append(xfND(_planClientOrderNo));
        sb.append(dm).append(xfND(_planWarehouseId));
        sb.append(dm).append(xfND(_planWarehouseCd));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_planLot));
        sb.append(dm).append(xfND(_planLimitDt));
        sb.append(dm).append(xfND(_planLocationId));
        sb.append(dm).append(xfND(_planLocationCd));
        sb.append(dm).append(xfND(_planStoreLabelNo));
        sb.append(dm).append(xfND(_planNum));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_storeRowNo));
        sb.append(dm).append(xfND(_planProdDt));
        sb.append(dm).append(xfND(_hinmokuGroup));
        sb.append(dm).append(xfND(_hinmokuText));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_unitNm));
        sb.append(dm).append(xfND(_remainingReceiveNum));
        sb.append(dm).append(xfND(_lotManagTypeId));
        sb.append(dm).append(xfND(_lotManagTypeCd));
        sb.append(dm).append(xfND(_shippingPlantCd));
        sb.append(dm).append(xfND(_shippingStorageSpaceCd));
        sb.append(dm).append(xfND(_remainFlg));
        sb.append(dm).append(xfND(_wmSendFlg));
        sb.append(dm).append(xfND(_lpSendFlg));
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
        if (_tReceivePlanH != null)
        { sb.append(dm).append("tReceivePlanH"); }
        if (_mLocation != null)
        { sb.append(dm).append("mLocation"); }
        if (_mWarehouse != null)
        { sb.append(dm).append("mWarehouse"); }
        if (_mProduct != null)
        { sb.append(dm).append("mProduct"); }
        if (_bClassDtlByErrorFlg != null)
        { sb.append(dm).append("bClassDtlByErrorFlg"); }
        if (_bClassDtlByReceiveStatus != null)
        { sb.append(dm).append("bClassDtlByReceiveStatus"); }
        if (_tReceivePlanSpareAsOne != null)
        { sb.append(dm).append("tReceivePlanSpareAsOne"); }
        if (_tReceiveLabelList != null && !_tReceiveLabelList.isEmpty())
        { sb.append(dm).append("tReceiveLabelList"); }
        if (_tReceivePlanDataTransferList != null && !_tReceivePlanDataTransferList.isEmpty())
        { sb.append(dm).append("tReceivePlanDataTransferList"); }
        if (_tStoreRecordBList != null && !_tStoreRecordBList.isEmpty())
        { sb.append(dm).append("tStoreRecordBList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TReceivePlanB clone() {
        return (TReceivePlanB)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入荷予定ボディID
     * @return The value of the column 'RECEIVE_PLAN_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceivePlanBId() {
        checkSpecifiedProperty("receivePlanBId");
        return _receivePlanBId;
    }

    /**
     * [set] RECEIVE_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入荷予定ボディID
     * @param receivePlanBId The value of the column 'RECEIVE_PLAN_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceivePlanBId(Long receivePlanBId) {
        registerModifiedProperty("receivePlanBId");
        _receivePlanBId = receivePlanBId;
    }

    /**
     * [get] RECEIVE_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_h} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceivePlanHId() {
        checkSpecifiedProperty("receivePlanHId");
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_h} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        registerModifiedProperty("receivePlanHId");
        _receivePlanHId = receivePlanHId;
    }

    /**
     * [get] LINE_NO: {NotNull, BIGINT(19)} <br>
     * 行No.
     * @return The value of the column 'LINE_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getLineNo() {
        checkSpecifiedProperty("lineNo");
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {NotNull, BIGINT(19)} <br>
     * 行No.
     * @param lineNo The value of the column 'LINE_NO'. (basically NotNull if update: for the constraint)
     */
    public void setLineNo(Long lineNo) {
        registerModifiedProperty("lineNo");
        _lineNo = lineNo;
    }

    /**
     * [get] RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * @return The value of the column 'RECEIVE_STATUS'. (basically NotNull if selected: for the constraint)
     */
    public String getReceiveStatus() {
        checkSpecifiedProperty("receiveStatus");
        return convertEmptyToNull(_receiveStatus);
    }

    /**
     * [set] RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * @param receiveStatus The value of the column 'RECEIVE_STATUS'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveStatus(String receiveStatus) {
        registerModifiedProperty("receiveStatus");
        _receiveStatus = receiveStatus;
    }

    /**
     * [get] PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)} <br>
     * 予定顧客発注No.
     * @return The value of the column 'PLAN_CLIENT_ORDER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanClientOrderNo() {
        checkSpecifiedProperty("planClientOrderNo");
        return convertEmptyToNull(_planClientOrderNo);
    }

    /**
     * [set] PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)} <br>
     * 予定顧客発注No.
     * @param planClientOrderNo The value of the column 'PLAN_CLIENT_ORDER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanClientOrderNo(String planClientOrderNo) {
        registerModifiedProperty("planClientOrderNo");
        _planClientOrderNo = planClientOrderNo;
    }

    /**
     * [get] PLAN_WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse} <br>
     * 予定倉庫ID
     * @return The value of the column 'PLAN_WAREHOUSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPlanWarehouseId() {
        checkSpecifiedProperty("planWarehouseId");
        return _planWarehouseId;
    }

    /**
     * [set] PLAN_WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse} <br>
     * 予定倉庫ID
     * @param planWarehouseId The value of the column 'PLAN_WAREHOUSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanWarehouseId(Long planWarehouseId) {
        registerModifiedProperty("planWarehouseId");
        _planWarehouseId = planWarehouseId;
    }

    /**
     * [get] PLAN_WAREHOUSE_CD: {VARCHAR(30)} <br>
     * 予定倉庫CD
     * @return The value of the column 'PLAN_WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanWarehouseCd() {
        checkSpecifiedProperty("planWarehouseCd");
        return convertEmptyToNull(_planWarehouseCd);
    }

    /**
     * [set] PLAN_WAREHOUSE_CD: {VARCHAR(30)} <br>
     * 予定倉庫CD
     * @param planWarehouseCd The value of the column 'PLAN_WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanWarehouseCd(String planWarehouseCd) {
        registerModifiedProperty("planWarehouseCd");
        _planWarehouseCd = planWarehouseCd;
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
     * [get] PRODUCT_CD: {IX, NotNull, VARCHAR(100)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {IX, NotNull, VARCHAR(100)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PLAN_LOT: {VARCHAR(30)} <br>
     * 予定ロット
     * @return The value of the column 'PLAN_LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanLot() {
        checkSpecifiedProperty("planLot");
        return convertEmptyToNull(_planLot);
    }

    /**
     * [set] PLAN_LOT: {VARCHAR(30)} <br>
     * 予定ロット
     * @param planLot The value of the column 'PLAN_LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanLot(String planLot) {
        registerModifiedProperty("planLot");
        _planLot = planLot;
    }

    /**
     * [get] PLAN_LIMIT_DT: {VARCHAR(8)} <br>
     * 予定期限日
     * @return The value of the column 'PLAN_LIMIT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanLimitDt() {
        checkSpecifiedProperty("planLimitDt");
        return convertEmptyToNull(_planLimitDt);
    }

    /**
     * [set] PLAN_LIMIT_DT: {VARCHAR(8)} <br>
     * 予定期限日
     * @param planLimitDt The value of the column 'PLAN_LIMIT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanLimitDt(String planLimitDt) {
        registerModifiedProperty("planLimitDt");
        _planLimitDt = planLimitDt;
    }

    /**
     * [get] PLAN_LOCATION_ID: {IX, BIGINT(19), FK to m_location} <br>
     * 予定ロケーションID
     * @return The value of the column 'PLAN_LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPlanLocationId() {
        checkSpecifiedProperty("planLocationId");
        return _planLocationId;
    }

    /**
     * [set] PLAN_LOCATION_ID: {IX, BIGINT(19), FK to m_location} <br>
     * 予定ロケーションID
     * @param planLocationId The value of the column 'PLAN_LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanLocationId(Long planLocationId) {
        registerModifiedProperty("planLocationId");
        _planLocationId = planLocationId;
    }

    /**
     * [get] PLAN_LOCATION_CD: {VARCHAR(30)} <br>
     * 予定ロケーションCD
     * @return The value of the column 'PLAN_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanLocationCd() {
        checkSpecifiedProperty("planLocationCd");
        return convertEmptyToNull(_planLocationCd);
    }

    /**
     * [set] PLAN_LOCATION_CD: {VARCHAR(30)} <br>
     * 予定ロケーションCD
     * @param planLocationCd The value of the column 'PLAN_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanLocationCd(String planLocationCd) {
        registerModifiedProperty("planLocationCd");
        _planLocationCd = planLocationCd;
    }

    /**
     * [get] PLAN_STORE_LABEL_NO: {VARCHAR(30)} <br>
     * 予定入庫ラベルNo.
     * @return The value of the column 'PLAN_STORE_LABEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanStoreLabelNo() {
        checkSpecifiedProperty("planStoreLabelNo");
        return convertEmptyToNull(_planStoreLabelNo);
    }

    /**
     * [set] PLAN_STORE_LABEL_NO: {VARCHAR(30)} <br>
     * 予定入庫ラベルNo.
     * @param planStoreLabelNo The value of the column 'PLAN_STORE_LABEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanStoreLabelNo(String planStoreLabelNo) {
        registerModifiedProperty("planStoreLabelNo");
        _planStoreLabelNo = planStoreLabelNo;
    }

    /**
     * [get] PLAN_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 予定数
     * @return The value of the column 'PLAN_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPlanNum() {
        checkSpecifiedProperty("planNum");
        return _planNum;
    }

    /**
     * [set] PLAN_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 予定数
     * @param planNum The value of the column 'PLAN_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setPlanNum(java.math.BigDecimal planNum) {
        registerModifiedProperty("planNum");
        _planNum = planNum;
    }

    /**
     * [get] ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
    }

    /**
     * [get] STORE_ROW_NO: {VARCHAR(30)} <br>
     * 入庫明細番号
     * @return The value of the column 'STORE_ROW_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreRowNo() {
        checkSpecifiedProperty("storeRowNo");
        return convertEmptyToNull(_storeRowNo);
    }

    /**
     * [set] STORE_ROW_NO: {VARCHAR(30)} <br>
     * 入庫明細番号
     * @param storeRowNo The value of the column 'STORE_ROW_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreRowNo(String storeRowNo) {
        registerModifiedProperty("storeRowNo");
        _storeRowNo = storeRowNo;
    }

    /**
     * [get] PLAN_PROD_DT: {VARCHAR(8)} <br>
     * 予定製造日
     * @return The value of the column 'PLAN_PROD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanProdDt() {
        checkSpecifiedProperty("planProdDt");
        return convertEmptyToNull(_planProdDt);
    }

    /**
     * [set] PLAN_PROD_DT: {VARCHAR(8)} <br>
     * 予定製造日
     * @param planProdDt The value of the column 'PLAN_PROD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanProdDt(String planProdDt) {
        registerModifiedProperty("planProdDt");
        _planProdDt = planProdDt;
    }

    /**
     * [get] HINMOKU_GROUP: {VARCHAR(30)} <br>
     * 品目グループ
     * @return The value of the column 'HINMOKU_GROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getHinmokuGroup() {
        checkSpecifiedProperty("hinmokuGroup");
        return convertEmptyToNull(_hinmokuGroup);
    }

    /**
     * [set] HINMOKU_GROUP: {VARCHAR(30)} <br>
     * 品目グループ
     * @param hinmokuGroup The value of the column 'HINMOKU_GROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHinmokuGroup(String hinmokuGroup) {
        registerModifiedProperty("hinmokuGroup");
        _hinmokuGroup = hinmokuGroup;
    }

    /**
     * [get] HINMOKU_TEXT: {VARCHAR(60)} <br>
     * 品目テキスト
     * @return The value of the column 'HINMOKU_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getHinmokuText() {
        checkSpecifiedProperty("hinmokuText");
        return convertEmptyToNull(_hinmokuText);
    }

    /**
     * [set] HINMOKU_TEXT: {VARCHAR(60)} <br>
     * 品目テキスト
     * @param hinmokuText The value of the column 'HINMOKU_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHinmokuText(String hinmokuText) {
        registerModifiedProperty("hinmokuText");
        _hinmokuText = hinmokuText;
    }

    /**
     * [get] JAN_CD: {VARCHAR(30)} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
    }

    /**
     * [get] UNIT_NM: {VARCHAR(60)} <br>
     * 単位名称
     * @return The value of the column 'UNIT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnitNm() {
        checkSpecifiedProperty("unitNm");
        return convertEmptyToNull(_unitNm);
    }

    /**
     * [set] UNIT_NM: {VARCHAR(60)} <br>
     * 単位名称
     * @param unitNm The value of the column 'UNIT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitNm(String unitNm) {
        registerModifiedProperty("unitNm");
        _unitNm = unitNm;
    }

    /**
     * [get] REMAINING_RECEIVE_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 入荷予定残数
     * @return The value of the column 'REMAINING_RECEIVE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRemainingReceiveNum() {
        checkSpecifiedProperty("remainingReceiveNum");
        return _remainingReceiveNum;
    }

    /**
     * [set] REMAINING_RECEIVE_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 入荷予定残数
     * @param remainingReceiveNum The value of the column 'REMAINING_RECEIVE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRemainingReceiveNum(java.math.BigDecimal remainingReceiveNum) {
        registerModifiedProperty("remainingReceiveNum");
        _remainingReceiveNum = remainingReceiveNum;
    }

    /**
     * [get] LOT_MANAG_TYPE_ID: {BIGINT(19)} <br>
     * ロット管理区分ID
     * @return The value of the column 'LOT_MANAG_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLotManagTypeId() {
        checkSpecifiedProperty("lotManagTypeId");
        return _lotManagTypeId;
    }

    /**
     * [set] LOT_MANAG_TYPE_ID: {BIGINT(19)} <br>
     * ロット管理区分ID
     * @param lotManagTypeId The value of the column 'LOT_MANAG_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotManagTypeId(Long lotManagTypeId) {
        registerModifiedProperty("lotManagTypeId");
        _lotManagTypeId = lotManagTypeId;
    }

    /**
     * [get] LOT_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * ロット管理区分CD
     * @return The value of the column 'LOT_MANAG_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotManagTypeCd() {
        checkSpecifiedProperty("lotManagTypeCd");
        return convertEmptyToNull(_lotManagTypeCd);
    }

    /**
     * [set] LOT_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * ロット管理区分CD
     * @param lotManagTypeCd The value of the column 'LOT_MANAG_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotManagTypeCd(String lotManagTypeCd) {
        registerModifiedProperty("lotManagTypeCd");
        _lotManagTypeCd = lotManagTypeCd;
    }

    /**
     * [get] SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * 出庫プラントCD
     * @return The value of the column 'SHIPPING_PLANT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingPlantCd() {
        checkSpecifiedProperty("shippingPlantCd");
        return convertEmptyToNull(_shippingPlantCd);
    }

    /**
     * [set] SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * 出庫プラントCD
     * @param shippingPlantCd The value of the column 'SHIPPING_PLANT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingPlantCd(String shippingPlantCd) {
        registerModifiedProperty("shippingPlantCd");
        _shippingPlantCd = shippingPlantCd;
    }

    /**
     * [get] SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 出庫保管場所CD
     * @return The value of the column 'SHIPPING_STORAGE_SPACE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStorageSpaceCd() {
        checkSpecifiedProperty("shippingStorageSpaceCd");
        return convertEmptyToNull(_shippingStorageSpaceCd);
    }

    /**
     * [set] SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 出庫保管場所CD
     * @param shippingStorageSpaceCd The value of the column 'SHIPPING_STORAGE_SPACE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStorageSpaceCd(String shippingStorageSpaceCd) {
        registerModifiedProperty("shippingStorageSpaceCd");
        _shippingStorageSpaceCd = shippingStorageSpaceCd;
    }

    /**
     * [get] REMAIN_FLG: {NotNull, CHAR(1), default=[1]} <br>
     * 残数有フラグ
     * @return The value of the column 'REMAIN_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getRemainFlg() {
        checkSpecifiedProperty("remainFlg");
        return convertEmptyToNull(_remainFlg);
    }

    /**
     * [set] REMAIN_FLG: {NotNull, CHAR(1), default=[1]} <br>
     * 残数有フラグ
     * @param remainFlg The value of the column 'REMAIN_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setRemainFlg(String remainFlg) {
        registerModifiedProperty("remainFlg");
        _remainFlg = remainFlg;
    }

    /**
     * [get] WM_SEND_FLG: {CHAR(1), default=[0]} <br>
     * WMS送信済フラグ
     * @return The value of the column 'WM_SEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmSendFlg() {
        checkSpecifiedProperty("wmSendFlg");
        return convertEmptyToNull(_wmSendFlg);
    }

    /**
     * [set] WM_SEND_FLG: {CHAR(1), default=[0]} <br>
     * WMS送信済フラグ
     * @param wmSendFlg The value of the column 'WM_SEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmSendFlg(String wmSendFlg) {
        registerModifiedProperty("wmSendFlg");
        _wmSendFlg = wmSendFlg;
    }

    /**
     * [get] LP_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 物流ポータル送信済フラグ
     * @return The value of the column 'LP_SEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLpSendFlg() {
        checkSpecifiedProperty("lpSendFlg");
        return convertEmptyToNull(_lpSendFlg);
    }

    /**
     * [set] LP_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 物流ポータル送信済フラグ
     * @param lpSendFlg The value of the column 'LP_SEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLpSendFlg(String lpSendFlg) {
        registerModifiedProperty("lpSendFlg");
        _lpSendFlg = lpSendFlg;
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
