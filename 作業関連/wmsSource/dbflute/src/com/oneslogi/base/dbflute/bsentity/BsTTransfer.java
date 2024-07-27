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
 * The entity of t_transfer as TABLE. <br>
 * 振替情報
 * <pre>
 * [primary-key]
 *     TRANSFER_ID
 *
 * [column]
 *     TRANSFER_ID, CLIENT_ID, PRODUCT_CD, STOCK_TRANSFER_DT, RECEIVE_PLANT_CD, RECEIVE_STORAGE_SPACE_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, TRANSFER_TYPE_CD, NUM, HINMOKU_GROUP, JAN_CD, PRODUCT_NM, S4_SEND_FLG, LOCATION_CD1, LOCATION_CD2, USER_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRANSFER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_client
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClient
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long transferId = entity.getTransferId();
 * Long clientId = entity.getClientId();
 * String productCd = entity.getProductCd();
 * String stockTransferDt = entity.getStockTransferDt();
 * String receivePlantCd = entity.getReceivePlantCd();
 * String receiveStorageSpaceCd = entity.getReceiveStorageSpaceCd();
 * String shippingPlantCd = entity.getShippingPlantCd();
 * String shippingStorageSpaceCd = entity.getShippingStorageSpaceCd();
 * String transferTypeCd = entity.getTransferTypeCd();
 * java.math.BigDecimal num = entity.getNum();
 * String hinmokuGroup = entity.getHinmokuGroup();
 * String janCd = entity.getJanCd();
 * String productNm = entity.getProductNm();
 * String s4SendFlg = entity.getS4SendFlg();
 * String locationCd1 = entity.getLocationCd1();
 * String locationCd2 = entity.getLocationCd2();
 * String userCd = entity.getUserCd();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTransferId(transferId);
 * entity.setClientId(clientId);
 * entity.setProductCd(productCd);
 * entity.setStockTransferDt(stockTransferDt);
 * entity.setReceivePlantCd(receivePlantCd);
 * entity.setReceiveStorageSpaceCd(receiveStorageSpaceCd);
 * entity.setShippingPlantCd(shippingPlantCd);
 * entity.setShippingStorageSpaceCd(shippingStorageSpaceCd);
 * entity.setTransferTypeCd(transferTypeCd);
 * entity.setNum(num);
 * entity.setHinmokuGroup(hinmokuGroup);
 * entity.setJanCd(janCd);
 * entity.setProductNm(productNm);
 * entity.setS4SendFlg(s4SendFlg);
 * entity.setLocationCd1(locationCd1);
 * entity.setLocationCd2(locationCd2);
 * entity.setUserCd(userCd);
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
public abstract class BsTTransfer extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _transferId;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    protected Long _clientId;

    /** PRODUCT_CD: {VARCHAR(100)} */
    protected String _productCd;

    /** STOCK_TRANSFER_DT: {VARCHAR(30)} */
    protected String _stockTransferDt;

    /** RECEIVE_PLANT_CD: {VARCHAR(30)} */
    protected String _receivePlantCd;

    /** RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)} */
    protected String _receiveStorageSpaceCd;

    /** SHIPPING_PLANT_CD: {VARCHAR(30)} */
    protected String _shippingPlantCd;

    /** SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} */
    protected String _shippingStorageSpaceCd;

    /** TRANSFER_TYPE_CD: {VARCHAR(30)} */
    protected String _transferTypeCd;

    /** NUM: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _num;

    /** HINMOKU_GROUP: {VARCHAR(30)} */
    protected String _hinmokuGroup;

    /** JAN_CD: {VARCHAR(30)} */
    protected String _janCd;

    /** PRODUCT_NM: {VARCHAR(60)} */
    protected String _productNm;

    /** S4_SEND_FLG: {CHAR(1), default=[0]} */
    protected String _s4SendFlg;

    /** LOCATION_CD1: {VARCHAR(30)} */
    protected String _locationCd1;

    /** LOCATION_CD2: {VARCHAR(30)} */
    protected String _locationCd2;

    /** USER_CD: {VARCHAR(30)} */
    protected String _userCd;

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
        return "t_transfer";
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
        if (_transferId == null) { return false; }
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
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTTransfer) {
            BsTTransfer other = (BsTTransfer)obj;
            if (!xSV(_transferId, other._transferId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _transferId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_transferId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_stockTransferDt));
        sb.append(dm).append(xfND(_receivePlantCd));
        sb.append(dm).append(xfND(_receiveStorageSpaceCd));
        sb.append(dm).append(xfND(_shippingPlantCd));
        sb.append(dm).append(xfND(_shippingStorageSpaceCd));
        sb.append(dm).append(xfND(_transferTypeCd));
        sb.append(dm).append(xfND(_num));
        sb.append(dm).append(xfND(_hinmokuGroup));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_s4SendFlg));
        sb.append(dm).append(xfND(_locationCd1));
        sb.append(dm).append(xfND(_locationCd2));
        sb.append(dm).append(xfND(_userCd));
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
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTransfer clone() {
        return (TTransfer)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 振替ID
     * @return The value of the column 'TRANSFER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTransferId() {
        checkSpecifiedProperty("transferId");
        return _transferId;
    }

    /**
     * [set] TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 振替ID
     * @param transferId The value of the column 'TRANSFER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTransferId(Long transferId) {
        registerModifiedProperty("transferId");
        _transferId = transferId;
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
     * [get] PRODUCT_CD: {VARCHAR(100)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(100)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] STOCK_TRANSFER_DT: {VARCHAR(30)} <br>
     * 在庫移動日
     * @return The value of the column 'STOCK_TRANSFER_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTransferDt() {
        checkSpecifiedProperty("stockTransferDt");
        return convertEmptyToNull(_stockTransferDt);
    }

    /**
     * [set] STOCK_TRANSFER_DT: {VARCHAR(30)} <br>
     * 在庫移動日
     * @param stockTransferDt The value of the column 'STOCK_TRANSFER_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTransferDt(String stockTransferDt) {
        registerModifiedProperty("stockTransferDt");
        _stockTransferDt = stockTransferDt;
    }

    /**
     * [get] RECEIVE_PLANT_CD: {VARCHAR(30)} <br>
     * 入庫プラント
     * @return The value of the column 'RECEIVE_PLANT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivePlantCd() {
        checkSpecifiedProperty("receivePlantCd");
        return convertEmptyToNull(_receivePlantCd);
    }

    /**
     * [set] RECEIVE_PLANT_CD: {VARCHAR(30)} <br>
     * 入庫プラント
     * @param receivePlantCd The value of the column 'RECEIVE_PLANT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlantCd(String receivePlantCd) {
        registerModifiedProperty("receivePlantCd");
        _receivePlantCd = receivePlantCd;
    }

    /**
     * [get] RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 入庫保管場所
     * @return The value of the column 'RECEIVE_STORAGE_SPACE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveStorageSpaceCd() {
        checkSpecifiedProperty("receiveStorageSpaceCd");
        return convertEmptyToNull(_receiveStorageSpaceCd);
    }

    /**
     * [set] RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 入庫保管場所
     * @param receiveStorageSpaceCd The value of the column 'RECEIVE_STORAGE_SPACE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveStorageSpaceCd(String receiveStorageSpaceCd) {
        registerModifiedProperty("receiveStorageSpaceCd");
        _receiveStorageSpaceCd = receiveStorageSpaceCd;
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
     * [get] TRANSFER_TYPE_CD: {VARCHAR(30)} <br>
     * 移動タイプ
     * @return The value of the column 'TRANSFER_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransferTypeCd() {
        checkSpecifiedProperty("transferTypeCd");
        return convertEmptyToNull(_transferTypeCd);
    }

    /**
     * [set] TRANSFER_TYPE_CD: {VARCHAR(30)} <br>
     * 移動タイプ
     * @param transferTypeCd The value of the column 'TRANSFER_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransferTypeCd(String transferTypeCd) {
        registerModifiedProperty("transferTypeCd");
        _transferTypeCd = transferTypeCd;
    }

    /**
     * [get] NUM: {DECIMAL(14, 4)} <br>
     * 数量
     * @return The value of the column 'NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNum() {
        checkSpecifiedProperty("num");
        return _num;
    }

    /**
     * [set] NUM: {DECIMAL(14, 4)} <br>
     * 数量
     * @param num The value of the column 'NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNum(java.math.BigDecimal num) {
        registerModifiedProperty("num");
        _num = num;
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
     * [get] JAN_CD: {VARCHAR(30)} <br>
     * JANコード
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br>
     * JANコード
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
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
     * [get] S4_SEND_FLG: {CHAR(1), default=[0]} <br>
     * S4送信済フラグ
     * @return The value of the column 'S4_SEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getS4SendFlg() {
        checkSpecifiedProperty("s4SendFlg");
        return convertEmptyToNull(_s4SendFlg);
    }

    /**
     * [set] S4_SEND_FLG: {CHAR(1), default=[0]} <br>
     * S4送信済フラグ
     * @param s4SendFlg The value of the column 'S4_SEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setS4SendFlg(String s4SendFlg) {
        registerModifiedProperty("s4SendFlg");
        _s4SendFlg = s4SendFlg;
    }

    /**
     * [get] LOCATION_CD1: {VARCHAR(30)} <br>
     * 移動前ロケーション
     * @return The value of the column 'LOCATION_CD1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd1() {
        checkSpecifiedProperty("locationCd1");
        return convertEmptyToNull(_locationCd1);
    }

    /**
     * [set] LOCATION_CD1: {VARCHAR(30)} <br>
     * 移動前ロケーション
     * @param locationCd1 The value of the column 'LOCATION_CD1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd1(String locationCd1) {
        registerModifiedProperty("locationCd1");
        _locationCd1 = locationCd1;
    }

    /**
     * [get] LOCATION_CD2: {VARCHAR(30)} <br>
     * 移動後ロケーション
     * @return The value of the column 'LOCATION_CD2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd2() {
        checkSpecifiedProperty("locationCd2");
        return convertEmptyToNull(_locationCd2);
    }

    /**
     * [set] LOCATION_CD2: {VARCHAR(30)} <br>
     * 移動後ロケーション
     * @param locationCd2 The value of the column 'LOCATION_CD2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd2(String locationCd2) {
        registerModifiedProperty("locationCd2");
        _locationCd2 = locationCd2;
    }

    /**
     * [get] USER_CD: {VARCHAR(30)} <br>
     * 担当者
     * @return The value of the column 'USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserCd() {
        checkSpecifiedProperty("userCd");
        return convertEmptyToNull(_userCd);
    }

    /**
     * [set] USER_CD: {VARCHAR(30)} <br>
     * 担当者
     * @param userCd The value of the column 'USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserCd(String userCd) {
        registerModifiedProperty("userCd");
        _userCd = userCd;
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
