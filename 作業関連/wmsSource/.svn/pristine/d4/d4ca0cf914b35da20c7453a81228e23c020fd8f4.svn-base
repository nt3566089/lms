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
 * The entity of w_ht_shipping as TABLE. <br>
 * 出荷検品ワーク
 * <pre>
 * [primary-key]
 *     HT_SHIPPING_ID
 *
 * [column]
 *     HT_SHIPPING_ID, MAC_ADDRESS, ALLOC_INST_H_ID, CLIENT_ID, CENTER_ID, NIZOROE_NO, PRODUCT_ID, JAN_CD, PRODUCT_CD, PRODUCT_NM, INST_NUM, SPG_QTY_ONS, SPG_QTY_REMAIN, PIECE_NO, SPG_WORK_COMMENT, BOX_ID, BOX_CD, BOX_NM, PICKING_WORK_NO, LOT, CONSUME_DT, PROD_DT, INDV_LABEL_NO, EXPECTED_SHIPMENT_NO, FORCE_COPLETE_FLG, SUSPEND_FLG, RECEIVE_LABEL_NO, NIZOROE_NO2, DAIHYO_NIZOROE_NO, DAIHYO_NIZOROE_NO2, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HT_SHIPPING_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_center, m_box, m_product, m_client
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mBox, mProduct, mClient
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long htShippingId = entity.getHtShippingId();
 * String macAddress = entity.getMacAddress();
 * Long allocInstHId = entity.getAllocInstHId();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * String nizoroeNo = entity.getNizoroeNo();
 * Long productId = entity.getProductId();
 * String janCd = entity.getJanCd();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * java.math.BigDecimal instNum = entity.getInstNum();
 * java.math.BigDecimal spgQtyOns = entity.getSpgQtyOns();
 * java.math.BigDecimal spgQtyRemain = entity.getSpgQtyRemain();
 * Long pieceNo = entity.getPieceNo();
 * String spgWorkComment = entity.getSpgWorkComment();
 * Long boxId = entity.getBoxId();
 * String boxCd = entity.getBoxCd();
 * String boxNm = entity.getBoxNm();
 * String pickingWorkNo = entity.getPickingWorkNo();
 * String lot = entity.getLot();
 * String consumeDt = entity.getConsumeDt();
 * String prodDt = entity.getProdDt();
 * String indvLabelNo = entity.getIndvLabelNo();
 * String expectedShipmentNo = entity.getExpectedShipmentNo();
 * String forceCopleteFlg = entity.getForceCopleteFlg();
 * String suspendFlg = entity.getSuspendFlg();
 * String receiveLabelNo = entity.getReceiveLabelNo();
 * String nizoroeNo2 = entity.getNizoroeNo2();
 * String daihyoNizoroeNo = entity.getDaihyoNizoroeNo();
 * String daihyoNizoroeNo2 = entity.getDaihyoNizoroeNo2();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setHtShippingId(htShippingId);
 * entity.setMacAddress(macAddress);
 * entity.setAllocInstHId(allocInstHId);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setNizoroeNo(nizoroeNo);
 * entity.setProductId(productId);
 * entity.setJanCd(janCd);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setInstNum(instNum);
 * entity.setSpgQtyOns(spgQtyOns);
 * entity.setSpgQtyRemain(spgQtyRemain);
 * entity.setPieceNo(pieceNo);
 * entity.setSpgWorkComment(spgWorkComment);
 * entity.setBoxId(boxId);
 * entity.setBoxCd(boxCd);
 * entity.setBoxNm(boxNm);
 * entity.setPickingWorkNo(pickingWorkNo);
 * entity.setLot(lot);
 * entity.setConsumeDt(consumeDt);
 * entity.setProdDt(prodDt);
 * entity.setIndvLabelNo(indvLabelNo);
 * entity.setExpectedShipmentNo(expectedShipmentNo);
 * entity.setForceCopleteFlg(forceCopleteFlg);
 * entity.setSuspendFlg(suspendFlg);
 * entity.setReceiveLabelNo(receiveLabelNo);
 * entity.setNizoroeNo2(nizoroeNo2);
 * entity.setDaihyoNizoroeNo(daihyoNizoroeNo);
 * entity.setDaihyoNizoroeNo2(daihyoNizoroeNo2);
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
public abstract class BsWHtShipping extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** HT_SHIPPING_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _htShippingId;

    /** MAC_ADDRESS: {IX, NotNull, VARCHAR(30)} */
    protected String _macAddress;

    /** ALLOC_INST_H_ID: {NotNull, BIGINT(19)} */
    protected Long _allocInstHId;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    protected Long _clientId;

    /** CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} */
    protected Long _centerId;

    /** NIZOROE_NO: {NotNull, VARCHAR(30)} */
    protected String _nizoroeNo;

    /** PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} */
    protected Long _productId;

    /** JAN_CD: {VARCHAR(30)} */
    protected String _janCd;

    /** PRODUCT_CD: {VARCHAR(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {VARCHAR(255)} */
    protected String _productNm;

    /** INST_NUM: {NotNull, DECIMAL(14, 4)} */
    protected java.math.BigDecimal _instNum;

    /** SPG_QTY_ONS: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _spgQtyOns;

    /** SPG_QTY_REMAIN: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _spgQtyRemain;

    /** PIECE_NO: {BIGINT(19)} */
    protected Long _pieceNo;

    /** SPG_WORK_COMMENT: {VARCHAR(255)} */
    protected String _spgWorkComment;

    /** BOX_ID: {IX, BIGINT(19), FK to m_box} */
    protected Long _boxId;

    /** BOX_CD: {VARCHAR(30)} */
    protected String _boxCd;

    /** BOX_NM: {VARCHAR(60)} */
    protected String _boxNm;

    /** PICKING_WORK_NO: {VARCHAR(30)} */
    protected String _pickingWorkNo;

    /** LOT: {VARCHAR(30)} */
    protected String _lot;

    /** CONSUME_DT: {VARCHAR(8)} */
    protected String _consumeDt;

    /** PROD_DT: {VARCHAR(8)} */
    protected String _prodDt;

    /** INDV_LABEL_NO: {VARCHAR(30)} */
    protected String _indvLabelNo;

    /** EXPECTED_SHIPMENT_NO: {VARCHAR(30)} */
    protected String _expectedShipmentNo;

    /** FORCE_COPLETE_FLG: {CHAR(1)} */
    protected String _forceCopleteFlg;

    /** SUSPEND_FLG: {CHAR(1)} */
    protected String _suspendFlg;

    /** RECEIVE_LABEL_NO: {VARCHAR(30)} */
    protected String _receiveLabelNo;

    /** NIZOROE_NO2: {VARCHAR(30)} */
    protected String _nizoroeNo2;

    /** DAIHYO_NIZOROE_NO: {VARCHAR(30)} */
    protected String _daihyoNizoroeNo;

    /** DAIHYO_NIZOROE_NO2: {VARCHAR(30)} */
    protected String _daihyoNizoroeNo2;

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
        return "w_ht_shipping";
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
        if (_htShippingId == null) { return false; }
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

    /** m_box by my BOX_ID, named 'MBox'. */
    protected MBox _mBox;

    /**
     * [get] m_box by my BOX_ID, named 'MBox'. <br>
     * @return The entity of foreign property 'MBox'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MBox getMBox() {
        return _mBox;
    }

    /**
     * [set] m_box by my BOX_ID, named 'MBox'.
     * @param mBox The entity of foreign property 'MBox'. (NullAllowed)
     */
    public void setMBox(MBox mBox) {
        _mBox = mBox;
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
        if (obj instanceof BsWHtShipping) {
            BsWHtShipping other = (BsWHtShipping)obj;
            if (!xSV(_htShippingId, other._htShippingId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _htShippingId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mBox != null)
        { sb.append(li).append(xbRDS(_mBox, "mBox")); }
        if (_mProduct != null)
        { sb.append(li).append(xbRDS(_mProduct, "mProduct")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_htShippingId));
        sb.append(dm).append(xfND(_macAddress));
        sb.append(dm).append(xfND(_allocInstHId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_nizoroeNo));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_instNum));
        sb.append(dm).append(xfND(_spgQtyOns));
        sb.append(dm).append(xfND(_spgQtyRemain));
        sb.append(dm).append(xfND(_pieceNo));
        sb.append(dm).append(xfND(_spgWorkComment));
        sb.append(dm).append(xfND(_boxId));
        sb.append(dm).append(xfND(_boxCd));
        sb.append(dm).append(xfND(_boxNm));
        sb.append(dm).append(xfND(_pickingWorkNo));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_consumeDt));
        sb.append(dm).append(xfND(_prodDt));
        sb.append(dm).append(xfND(_indvLabelNo));
        sb.append(dm).append(xfND(_expectedShipmentNo));
        sb.append(dm).append(xfND(_forceCopleteFlg));
        sb.append(dm).append(xfND(_suspendFlg));
        sb.append(dm).append(xfND(_receiveLabelNo));
        sb.append(dm).append(xfND(_nizoroeNo2));
        sb.append(dm).append(xfND(_daihyoNizoroeNo));
        sb.append(dm).append(xfND(_daihyoNizoroeNo2));
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
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mBox != null)
        { sb.append(dm).append("mBox"); }
        if (_mProduct != null)
        { sb.append(dm).append("mProduct"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WHtShipping clone() {
        return (WHtShipping)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] HT_SHIPPING_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷検品ワークID
     * @return The value of the column 'HT_SHIPPING_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getHtShippingId() {
        checkSpecifiedProperty("htShippingId");
        return _htShippingId;
    }

    /**
     * [set] HT_SHIPPING_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷検品ワークID
     * @param htShippingId The value of the column 'HT_SHIPPING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setHtShippingId(Long htShippingId) {
        registerModifiedProperty("htShippingId");
        _htShippingId = htShippingId;
    }

    /**
     * [get] MAC_ADDRESS: {IX, NotNull, VARCHAR(30)} <br>
     * MACアドレス
     * @return The value of the column 'MAC_ADDRESS'. (basically NotNull if selected: for the constraint)
     */
    public String getMacAddress() {
        checkSpecifiedProperty("macAddress");
        return convertEmptyToNull(_macAddress);
    }

    /**
     * [set] MAC_ADDRESS: {IX, NotNull, VARCHAR(30)} <br>
     * MACアドレス
     * @param macAddress The value of the column 'MAC_ADDRESS'. (basically NotNull if update: for the constraint)
     */
    public void setMacAddress(String macAddress) {
        registerModifiedProperty("macAddress");
        _macAddress = macAddress;
    }

    /**
     * [get] ALLOC_INST_H_ID: {NotNull, BIGINT(19)} <br>
     * 引当指示ヘッダID
     * @return The value of the column 'ALLOC_INST_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getAllocInstHId() {
        checkSpecifiedProperty("allocInstHId");
        return _allocInstHId;
    }

    /**
     * [set] ALLOC_INST_H_ID: {NotNull, BIGINT(19)} <br>
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
     * [get] NIZOROE_NO: {NotNull, VARCHAR(30)} <br>
     * 荷揃番号
     * @return The value of the column 'NIZOROE_NO'. (basically NotNull if selected: for the constraint)
     */
    public String getNizoroeNo() {
        checkSpecifiedProperty("nizoroeNo");
        return convertEmptyToNull(_nizoroeNo);
    }

    /**
     * [set] NIZOROE_NO: {NotNull, VARCHAR(30)} <br>
     * 荷揃番号
     * @param nizoroeNo The value of the column 'NIZOROE_NO'. (basically NotNull if update: for the constraint)
     */
    public void setNizoroeNo(String nizoroeNo) {
        registerModifiedProperty("nizoroeNo");
        _nizoroeNo = nizoroeNo;
    }

    /**
     * [get] PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
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
     * [get] PRODUCT_NM: {VARCHAR(255)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {VARCHAR(255)} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] INST_NUM: {NotNull, DECIMAL(14, 4)} <br>
     * 指示数
     * @return The value of the column 'INST_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getInstNum() {
        checkSpecifiedProperty("instNum");
        return _instNum;
    }

    /**
     * [set] INST_NUM: {NotNull, DECIMAL(14, 4)} <br>
     * 指示数
     * @param instNum The value of the column 'INST_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setInstNum(java.math.BigDecimal instNum) {
        registerModifiedProperty("instNum");
        _instNum = instNum;
    }

    /**
     * [get] SPG_QTY_ONS: {DECIMAL(14, 4)} <br>
     * 検品済数
     * @return The value of the column 'SPG_QTY_ONS'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSpgQtyOns() {
        checkSpecifiedProperty("spgQtyOns");
        return _spgQtyOns;
    }

    /**
     * [set] SPG_QTY_ONS: {DECIMAL(14, 4)} <br>
     * 検品済数
     * @param spgQtyOns The value of the column 'SPG_QTY_ONS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpgQtyOns(java.math.BigDecimal spgQtyOns) {
        registerModifiedProperty("spgQtyOns");
        _spgQtyOns = spgQtyOns;
    }

    /**
     * [get] SPG_QTY_REMAIN: {DECIMAL(14, 4)} <br>
     * 検品残数
     * @return The value of the column 'SPG_QTY_REMAIN'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSpgQtyRemain() {
        checkSpecifiedProperty("spgQtyRemain");
        return _spgQtyRemain;
    }

    /**
     * [set] SPG_QTY_REMAIN: {DECIMAL(14, 4)} <br>
     * 検品残数
     * @param spgQtyRemain The value of the column 'SPG_QTY_REMAIN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpgQtyRemain(java.math.BigDecimal spgQtyRemain) {
        registerModifiedProperty("spgQtyRemain");
        _spgQtyRemain = spgQtyRemain;
    }

    /**
     * [get] PIECE_NO: {BIGINT(19)} <br>
     * 個口番号
     * @return The value of the column 'PIECE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPieceNo() {
        checkSpecifiedProperty("pieceNo");
        return _pieceNo;
    }

    /**
     * [set] PIECE_NO: {BIGINT(19)} <br>
     * 個口番号
     * @param pieceNo The value of the column 'PIECE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPieceNo(Long pieceNo) {
        registerModifiedProperty("pieceNo");
        _pieceNo = pieceNo;
    }

    /**
     * [get] SPG_WORK_COMMENT: {VARCHAR(255)} <br>
     * 出荷作業備考
     * @return The value of the column 'SPG_WORK_COMMENT'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpgWorkComment() {
        checkSpecifiedProperty("spgWorkComment");
        return convertEmptyToNull(_spgWorkComment);
    }

    /**
     * [set] SPG_WORK_COMMENT: {VARCHAR(255)} <br>
     * 出荷作業備考
     * @param spgWorkComment The value of the column 'SPG_WORK_COMMENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpgWorkComment(String spgWorkComment) {
        registerModifiedProperty("spgWorkComment");
        _spgWorkComment = spgWorkComment;
    }

    /**
     * [get] BOX_ID: {IX, BIGINT(19), FK to m_box} <br>
     * 荷材ID
     * @return The value of the column 'BOX_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBoxId() {
        checkSpecifiedProperty("boxId");
        return _boxId;
    }

    /**
     * [set] BOX_ID: {IX, BIGINT(19), FK to m_box} <br>
     * 荷材ID
     * @param boxId The value of the column 'BOX_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxId(Long boxId) {
        registerModifiedProperty("boxId");
        _boxId = boxId;
    }

    /**
     * [get] BOX_CD: {VARCHAR(30)} <br>
     * 荷材CD
     * @return The value of the column 'BOX_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxCd() {
        checkSpecifiedProperty("boxCd");
        return convertEmptyToNull(_boxCd);
    }

    /**
     * [set] BOX_CD: {VARCHAR(30)} <br>
     * 荷材CD
     * @param boxCd The value of the column 'BOX_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxCd(String boxCd) {
        registerModifiedProperty("boxCd");
        _boxCd = boxCd;
    }

    /**
     * [get] BOX_NM: {VARCHAR(60)} <br>
     * 荷材名称
     * @return The value of the column 'BOX_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxNm() {
        checkSpecifiedProperty("boxNm");
        return convertEmptyToNull(_boxNm);
    }

    /**
     * [set] BOX_NM: {VARCHAR(60)} <br>
     * 荷材名称
     * @param boxNm The value of the column 'BOX_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxNm(String boxNm) {
        registerModifiedProperty("boxNm");
        _boxNm = boxNm;
    }

    /**
     * [get] PICKING_WORK_NO: {VARCHAR(30)} <br>
     * 出庫作業No.
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkNo() {
        checkSpecifiedProperty("pickingWorkNo");
        return convertEmptyToNull(_pickingWorkNo);
    }

    /**
     * [set] PICKING_WORK_NO: {VARCHAR(30)} <br>
     * 出庫作業No.
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        registerModifiedProperty("pickingWorkNo");
        _pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] LOT: {VARCHAR(30)} <br>
     * ロット
     * @return The value of the column 'LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot() {
        checkSpecifiedProperty("lot");
        return convertEmptyToNull(_lot);
    }

    /**
     * [set] LOT: {VARCHAR(30)} <br>
     * ロット
     * @param lot The value of the column 'LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot(String lot) {
        registerModifiedProperty("lot");
        _lot = lot;
    }

    /**
     * [get] CONSUME_DT: {VARCHAR(8)} <br>
     * 期限日
     * @return The value of the column 'CONSUME_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getConsumeDt() {
        checkSpecifiedProperty("consumeDt");
        return convertEmptyToNull(_consumeDt);
    }

    /**
     * [set] CONSUME_DT: {VARCHAR(8)} <br>
     * 期限日
     * @param consumeDt The value of the column 'CONSUME_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setConsumeDt(String consumeDt) {
        registerModifiedProperty("consumeDt");
        _consumeDt = consumeDt;
    }

    /**
     * [get] PROD_DT: {VARCHAR(8)} <br>
     * 製造日
     * @return The value of the column 'PROD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getProdDt() {
        checkSpecifiedProperty("prodDt");
        return convertEmptyToNull(_prodDt);
    }

    /**
     * [set] PROD_DT: {VARCHAR(8)} <br>
     * 製造日
     * @param prodDt The value of the column 'PROD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProdDt(String prodDt) {
        registerModifiedProperty("prodDt");
        _prodDt = prodDt;
    }

    /**
     * [get] INDV_LABEL_NO: {VARCHAR(30)} <br>
     * 個別貼付ラベルNo
     * @return The value of the column 'INDV_LABEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getIndvLabelNo() {
        checkSpecifiedProperty("indvLabelNo");
        return convertEmptyToNull(_indvLabelNo);
    }

    /**
     * [set] INDV_LABEL_NO: {VARCHAR(30)} <br>
     * 個別貼付ラベルNo
     * @param indvLabelNo The value of the column 'INDV_LABEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIndvLabelNo(String indvLabelNo) {
        registerModifiedProperty("indvLabelNo");
        _indvLabelNo = indvLabelNo;
    }

    /**
     * [get] EXPECTED_SHIPMENT_NO: {VARCHAR(30)} <br>
     * 個体管理番号
     * @return The value of the column 'EXPECTED_SHIPMENT_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getExpectedShipmentNo() {
        checkSpecifiedProperty("expectedShipmentNo");
        return convertEmptyToNull(_expectedShipmentNo);
    }

    /**
     * [set] EXPECTED_SHIPMENT_NO: {VARCHAR(30)} <br>
     * 個体管理番号
     * @param expectedShipmentNo The value of the column 'EXPECTED_SHIPMENT_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpectedShipmentNo(String expectedShipmentNo) {
        registerModifiedProperty("expectedShipmentNo");
        _expectedShipmentNo = expectedShipmentNo;
    }

    /**
     * [get] FORCE_COPLETE_FLG: {CHAR(1)} <br>
     * 強制完了フラグ
     * @return The value of the column 'FORCE_COPLETE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getForceCopleteFlg() {
        checkSpecifiedProperty("forceCopleteFlg");
        return convertEmptyToNull(_forceCopleteFlg);
    }

    /**
     * [set] FORCE_COPLETE_FLG: {CHAR(1)} <br>
     * 強制完了フラグ
     * @param forceCopleteFlg The value of the column 'FORCE_COPLETE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setForceCopleteFlg(String forceCopleteFlg) {
        registerModifiedProperty("forceCopleteFlg");
        _forceCopleteFlg = forceCopleteFlg;
    }

    /**
     * [get] SUSPEND_FLG: {CHAR(1)} <br>
     * 中断フラグ
     * @return The value of the column 'SUSPEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSuspendFlg() {
        checkSpecifiedProperty("suspendFlg");
        return convertEmptyToNull(_suspendFlg);
    }

    /**
     * [set] SUSPEND_FLG: {CHAR(1)} <br>
     * 中断フラグ
     * @param suspendFlg The value of the column 'SUSPEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSuspendFlg(String suspendFlg) {
        registerModifiedProperty("suspendFlg");
        _suspendFlg = suspendFlg;
    }

    /**
     * [get] RECEIVE_LABEL_NO: {VARCHAR(30)} <br>
     * 入荷ラベルNo
     * @return The value of the column 'RECEIVE_LABEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveLabelNo() {
        checkSpecifiedProperty("receiveLabelNo");
        return convertEmptyToNull(_receiveLabelNo);
    }

    /**
     * [set] RECEIVE_LABEL_NO: {VARCHAR(30)} <br>
     * 入荷ラベルNo
     * @param receiveLabelNo The value of the column 'RECEIVE_LABEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveLabelNo(String receiveLabelNo) {
        registerModifiedProperty("receiveLabelNo");
        _receiveLabelNo = receiveLabelNo;
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
     * [get] DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * 表荷揃番号_ハイフンあり
     * @return The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDaihyoNizoroeNo2() {
        checkSpecifiedProperty("daihyoNizoroeNo2");
        return convertEmptyToNull(_daihyoNizoroeNo2);
    }

    /**
     * [set] DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * 表荷揃番号_ハイフンあり
     * @param daihyoNizoroeNo2 The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDaihyoNizoroeNo2(String daihyoNizoroeNo2) {
        registerModifiedProperty("daihyoNizoroeNo2");
        _daihyoNizoroeNo2 = daihyoNizoroeNo2;
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
