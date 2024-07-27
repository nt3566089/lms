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
 * The entity of t_shipping_inst_b as TABLE. <br>
 * 出荷指示ボディ
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_B_ID
 *
 * [column]
 *     SHIPPING_INST_B_ID, SHIPPING_INST_H_ID, LINE_NO, WAREHOUSE_ID, WAREHOUSE_CD, PRODUCT_ID, PRODUCT_CD, STOCK_TYPE_ID, STOCK_TYPE_CD, LOCATION_ID, LOCATION_CD, DEPOSIT_ID, DEPOSIT_CD, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, SHAPE_ID, SHAPE_CD, UNIT_NUM, INST_NUM, ERROR_FLG, ERROR_MESSAGE_CD, ALLOC_INST_B_ID, ALLOC_NUM, STOCK_OUT_NUM, UNIT_PRICE, PRICE, TAX, CASE_PIECE_TYPE_ID, CASE_PIECE_TYPE_CD, PROD_DT, JAN_CD, TAX_RATE, LOGI_WEIGHT_FLG, LOGI_ATTENTION_TYPE_CD, LOGI_SPECIAL_TYPE_CD, HINMOKU_TEXT, UNIT_NM, EC_UNIT_NM, SAMPLE_TYPE_CD, EC_ORDER_BRANCH_NO, EC_PRODUCT_NM_KANJI, STORE_PLANT_CD, STORE_STORAGE_SPACE_CD, LOT_MANAG_TYPE_CD, DELIV_CD, TRANSACTION_TYPE_CD, WM_SEND_FLG, LP_SEND_FLG, CM_SEND_FLG, EMP_ID_CD, EMP_NM, US3F_TYPE_CD, HINMOKU_GROUP, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_stock_type, t_store_no, m_location, t_alloc_inst_b, m_shape, m_product, t_lot, m_customer, m_warehouse, t_shipping_inst_h, b_class_dtl(ByErrorFlg), t_shipping_inst_spare(AsOne)
 *
 * [referrer table]
 *     t_picking_b, t_shipping_inst_b_print, t_shipping_inst_data_transfer, t_shipping_inst_spare
 *
 * [foreign property]
 *     mStockType, tStoreNo, mLocation, tAllocInstB, mShape, mProduct, tLot, mCustomer, mWarehouse, tShippingInstH, bClassDtlByErrorFlg, tShippingInstSpareAsOne
 *
 * [referrer property]
 *     tPickingBList, tShippingInstBPrintList, tShippingInstDataTransferList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long shippingInstBId = entity.getShippingInstBId();
 * Long shippingInstHId = entity.getShippingInstHId();
 * Long lineNo = entity.getLineNo();
 * Long warehouseId = entity.getWarehouseId();
 * String warehouseCd = entity.getWarehouseCd();
 * Long productId = entity.getProductId();
 * String productCd = entity.getProductCd();
 * Long stockTypeId = entity.getStockTypeId();
 * String stockTypeCd = entity.getStockTypeCd();
 * Long locationId = entity.getLocationId();
 * String locationCd = entity.getLocationCd();
 * Long depositId = entity.getDepositId();
 * String depositCd = entity.getDepositCd();
 * Long lotId = entity.getLotId();
 * String lot = entity.getLot();
 * String limitDt = entity.getLimitDt();
 * Long storeNoId = entity.getStoreNoId();
 * String storeLabelNo = entity.getStoreLabelNo();
 * Long shapeId = entity.getShapeId();
 * String shapeCd = entity.getShapeCd();
 * Long unitNum = entity.getUnitNum();
 * java.math.BigDecimal instNum = entity.getInstNum();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * Long allocInstBId = entity.getAllocInstBId();
 * java.math.BigDecimal allocNum = entity.getAllocNum();
 * java.math.BigDecimal stockOutNum = entity.getStockOutNum();
 * java.math.BigDecimal unitPrice = entity.getUnitPrice();
 * java.math.BigDecimal price = entity.getPrice();
 * java.math.BigDecimal tax = entity.getTax();
 * Long casePieceTypeId = entity.getCasePieceTypeId();
 * String casePieceTypeCd = entity.getCasePieceTypeCd();
 * String prodDt = entity.getProdDt();
 * String janCd = entity.getJanCd();
 * java.math.BigDecimal taxRate = entity.getTaxRate();
 * String logiWeightFlg = entity.getLogiWeightFlg();
 * String logiAttentionTypeCd = entity.getLogiAttentionTypeCd();
 * String logiSpecialTypeCd = entity.getLogiSpecialTypeCd();
 * String hinmokuText = entity.getHinmokuText();
 * String unitNm = entity.getUnitNm();
 * String ecUnitNm = entity.getEcUnitNm();
 * String sampleTypeCd = entity.getSampleTypeCd();
 * String ecOrderBranchNo = entity.getEcOrderBranchNo();
 * String ecProductNmKanji = entity.getEcProductNmKanji();
 * String storePlantCd = entity.getStorePlantCd();
 * String storeStorageSpaceCd = entity.getStoreStorageSpaceCd();
 * String lotManagTypeCd = entity.getLotManagTypeCd();
 * String delivCd = entity.getDelivCd();
 * String transactionTypeCd = entity.getTransactionTypeCd();
 * String wmSendFlg = entity.getWmSendFlg();
 * String lpSendFlg = entity.getLpSendFlg();
 * String cmSendFlg = entity.getCmSendFlg();
 * String empIdCd = entity.getEmpIdCd();
 * String empNm = entity.getEmpNm();
 * String us3fTypeCd = entity.getUs3fTypeCd();
 * String hinmokuGroup = entity.getHinmokuGroup();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setShippingInstBId(shippingInstBId);
 * entity.setShippingInstHId(shippingInstHId);
 * entity.setLineNo(lineNo);
 * entity.setWarehouseId(warehouseId);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setProductId(productId);
 * entity.setProductCd(productCd);
 * entity.setStockTypeId(stockTypeId);
 * entity.setStockTypeCd(stockTypeCd);
 * entity.setLocationId(locationId);
 * entity.setLocationCd(locationCd);
 * entity.setDepositId(depositId);
 * entity.setDepositCd(depositCd);
 * entity.setLotId(lotId);
 * entity.setLot(lot);
 * entity.setLimitDt(limitDt);
 * entity.setStoreNoId(storeNoId);
 * entity.setStoreLabelNo(storeLabelNo);
 * entity.setShapeId(shapeId);
 * entity.setShapeCd(shapeCd);
 * entity.setUnitNum(unitNum);
 * entity.setInstNum(instNum);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setAllocInstBId(allocInstBId);
 * entity.setAllocNum(allocNum);
 * entity.setStockOutNum(stockOutNum);
 * entity.setUnitPrice(unitPrice);
 * entity.setPrice(price);
 * entity.setTax(tax);
 * entity.setCasePieceTypeId(casePieceTypeId);
 * entity.setCasePieceTypeCd(casePieceTypeCd);
 * entity.setProdDt(prodDt);
 * entity.setJanCd(janCd);
 * entity.setTaxRate(taxRate);
 * entity.setLogiWeightFlg(logiWeightFlg);
 * entity.setLogiAttentionTypeCd(logiAttentionTypeCd);
 * entity.setLogiSpecialTypeCd(logiSpecialTypeCd);
 * entity.setHinmokuText(hinmokuText);
 * entity.setUnitNm(unitNm);
 * entity.setEcUnitNm(ecUnitNm);
 * entity.setSampleTypeCd(sampleTypeCd);
 * entity.setEcOrderBranchNo(ecOrderBranchNo);
 * entity.setEcProductNmKanji(ecProductNmKanji);
 * entity.setStorePlantCd(storePlantCd);
 * entity.setStoreStorageSpaceCd(storeStorageSpaceCd);
 * entity.setLotManagTypeCd(lotManagTypeCd);
 * entity.setDelivCd(delivCd);
 * entity.setTransactionTypeCd(transactionTypeCd);
 * entity.setWmSendFlg(wmSendFlg);
 * entity.setLpSendFlg(lpSendFlg);
 * entity.setCmSendFlg(cmSendFlg);
 * entity.setEmpIdCd(empIdCd);
 * entity.setEmpNm(empNm);
 * entity.setUs3fTypeCd(us3fTypeCd);
 * entity.setHinmokuGroup(hinmokuGroup);
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
public abstract class BsTShippingInstB extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _shippingInstBId;

    /** SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h} */
    protected Long _shippingInstHId;

    /** LINE_NO: {NotNull, BIGINT(19)} */
    protected Long _lineNo;

    /** WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse} */
    protected Long _warehouseId;

    /** WAREHOUSE_CD: {VARCHAR(30)} */
    protected String _warehouseCd;

    /** PRODUCT_ID: {IX, BIGINT(19), FK to m_product} */
    protected Long _productId;

    /** PRODUCT_CD: {IX, NotNull, VARCHAR(100)} */
    protected String _productCd;

    /** STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} */
    protected Long _stockTypeId;

    /** STOCK_TYPE_CD: {NotNull, VARCHAR(30)} */
    protected String _stockTypeCd;

    /** LOCATION_ID: {IX, BIGINT(19), FK to m_location} */
    protected Long _locationId;

    /** LOCATION_CD: {VARCHAR(30)} */
    protected String _locationCd;

    /** DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} */
    protected Long _depositId;

    /** DEPOSIT_CD: {VARCHAR(30)} */
    protected String _depositCd;

    /** LOT_ID: {IX, BIGINT(19), FK to t_lot} */
    protected Long _lotId;

    /** LOT: {VARCHAR(30)} */
    protected String _lot;

    /** LIMIT_DT: {VARCHAR(8)} */
    protected String _limitDt;

    /** STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no} */
    protected Long _storeNoId;

    /** STORE_LABEL_NO: {VARCHAR(30)} */
    protected String _storeLabelNo;

    /** SHAPE_ID: {IX, BIGINT(19), FK to m_shape} */
    protected Long _shapeId;

    /** SHAPE_CD: {VARCHAR(30)} */
    protected String _shapeCd;

    /** UNIT_NUM: {BIGINT(19)} */
    protected Long _unitNum;

    /** INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _instNum;

    /** ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100)} */
    protected String _errorMessageCd;

    /** ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b} */
    protected Long _allocInstBId;

    /** ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _allocNum;

    /** STOCK_OUT_NUM: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _stockOutNum;

    /** UNIT_PRICE: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _unitPrice;

    /** PRICE: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _price;

    /** TAX: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _tax;

    /** CASE_PIECE_TYPE_ID: {BIGINT(19)} */
    protected Long _casePieceTypeId;

    /** CASE_PIECE_TYPE_CD: {VARCHAR(30)} */
    protected String _casePieceTypeCd;

    /** PROD_DT: {VARCHAR(8)} */
    protected String _prodDt;

    /** JAN_CD: {VARCHAR(30)} */
    protected String _janCd;

    /** TAX_RATE: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _taxRate;

    /** LOGI_WEIGHT_FLG: {CHAR(1)} */
    protected String _logiWeightFlg;

    /** LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} */
    protected String _logiAttentionTypeCd;

    /** LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} */
    protected String _logiSpecialTypeCd;

    /** HINMOKU_TEXT: {VARCHAR(60)} */
    protected String _hinmokuText;

    /** UNIT_NM: {VARCHAR(60)} */
    protected String _unitNm;

    /** EC_UNIT_NM: {VARCHAR(60)} */
    protected String _ecUnitNm;

    /** SAMPLE_TYPE_CD: {VARCHAR(30)} */
    protected String _sampleTypeCd;

    /** EC_ORDER_BRANCH_NO: {VARCHAR(30)} */
    protected String _ecOrderBranchNo;

    /** EC_PRODUCT_NM_KANJI: {VARCHAR(60)} */
    protected String _ecProductNmKanji;

    /** STORE_PLANT_CD: {VARCHAR(30)} */
    protected String _storePlantCd;

    /** STORE_STORAGE_SPACE_CD: {VARCHAR(30)} */
    protected String _storeStorageSpaceCd;

    /** LOT_MANAG_TYPE_CD: {VARCHAR(30)} */
    protected String _lotManagTypeCd;

    /** DELIV_CD: {VARCHAR(30)} */
    protected String _delivCd;

    /** TRANSACTION_TYPE_CD: {VARCHAR(30)} */
    protected String _transactionTypeCd;

    /** WM_SEND_FLG: {CHAR(1)} */
    protected String _wmSendFlg;

    /** LP_SEND_FLG: {CHAR(1)} */
    protected String _lpSendFlg;

    /** CM_SEND_FLG: {CHAR(1)} */
    protected String _cmSendFlg;

    /** EMP_ID_CD: {VARCHAR(30)} */
    protected String _empIdCd;

    /** EMP_NM: {VARCHAR(60)} */
    protected String _empNm;

    /** US3F_TYPE_CD: {VARCHAR(30)} */
    protected String _us3fTypeCd;

    /** HINMOKU_GROUP: {VARCHAR(30)} */
    protected String _hinmokuGroup;

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
        return "t_shipping_inst_b";
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
    /** m_stock_type by my STOCK_TYPE_ID, named 'MStockType'. */
    protected MStockType _mStockType;

    /**
     * [get] m_stock_type by my STOCK_TYPE_ID, named 'MStockType'. <br>
     * @return The entity of foreign property 'MStockType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MStockType getMStockType() {
        return _mStockType;
    }

    /**
     * [set] m_stock_type by my STOCK_TYPE_ID, named 'MStockType'.
     * @param mStockType The entity of foreign property 'MStockType'. (NullAllowed)
     */
    public void setMStockType(MStockType mStockType) {
        _mStockType = mStockType;
    }

    /** t_store_no by my STORE_NO_ID, named 'TStoreNo'. */
    protected TStoreNo _tStoreNo;

    /**
     * [get] t_store_no by my STORE_NO_ID, named 'TStoreNo'. <br>
     * @return The entity of foreign property 'TStoreNo'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TStoreNo getTStoreNo() {
        return _tStoreNo;
    }

    /**
     * [set] t_store_no by my STORE_NO_ID, named 'TStoreNo'.
     * @param tStoreNo The entity of foreign property 'TStoreNo'. (NullAllowed)
     */
    public void setTStoreNo(TStoreNo tStoreNo) {
        _tStoreNo = tStoreNo;
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

    /** t_alloc_inst_b by my ALLOC_INST_B_ID, named 'TAllocInstB'. */
    protected TAllocInstB _tAllocInstB;

    /**
     * [get] t_alloc_inst_b by my ALLOC_INST_B_ID, named 'TAllocInstB'. <br>
     * @return The entity of foreign property 'TAllocInstB'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TAllocInstB getTAllocInstB() {
        return _tAllocInstB;
    }

    /**
     * [set] t_alloc_inst_b by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @param tAllocInstB The entity of foreign property 'TAllocInstB'. (NullAllowed)
     */
    public void setTAllocInstB(TAllocInstB tAllocInstB) {
        _tAllocInstB = tAllocInstB;
    }

    /** m_shape by my SHAPE_ID, named 'MShape'. */
    protected MShape _mShape;

    /**
     * [get] m_shape by my SHAPE_ID, named 'MShape'. <br>
     * @return The entity of foreign property 'MShape'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MShape getMShape() {
        return _mShape;
    }

    /**
     * [set] m_shape by my SHAPE_ID, named 'MShape'.
     * @param mShape The entity of foreign property 'MShape'. (NullAllowed)
     */
    public void setMShape(MShape mShape) {
        _mShape = mShape;
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

    /** t_lot by my LOT_ID, named 'TLot'. */
    protected TLot _tLot;

    /**
     * [get] t_lot by my LOT_ID, named 'TLot'. <br>
     * @return The entity of foreign property 'TLot'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TLot getTLot() {
        return _tLot;
    }

    /**
     * [set] t_lot by my LOT_ID, named 'TLot'.
     * @param tLot The entity of foreign property 'TLot'. (NullAllowed)
     */
    public void setTLot(TLot tLot) {
        _tLot = tLot;
    }

    /** m_customer by my DEPOSIT_ID, named 'MCustomer'. */
    protected MCustomer _mCustomer;

    /**
     * [get] m_customer by my DEPOSIT_ID, named 'MCustomer'. <br>
     * @return The entity of foreign property 'MCustomer'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomer() {
        return _mCustomer;
    }

    /**
     * [set] m_customer by my DEPOSIT_ID, named 'MCustomer'.
     * @param mCustomer The entity of foreign property 'MCustomer'. (NullAllowed)
     */
    public void setMCustomer(MCustomer mCustomer) {
        _mCustomer = mCustomer;
    }

    /** m_warehouse by my WAREHOUSE_ID, named 'MWarehouse'. */
    protected MWarehouse _mWarehouse;

    /**
     * [get] m_warehouse by my WAREHOUSE_ID, named 'MWarehouse'. <br>
     * @return The entity of foreign property 'MWarehouse'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MWarehouse getMWarehouse() {
        return _mWarehouse;
    }

    /**
     * [set] m_warehouse by my WAREHOUSE_ID, named 'MWarehouse'.
     * @param mWarehouse The entity of foreign property 'MWarehouse'. (NullAllowed)
     */
    public void setMWarehouse(MWarehouse mWarehouse) {
        _mWarehouse = mWarehouse;
    }

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

    /** t_shipping_inst_spare by SHIPPING_INST_B_ID, named 'TShippingInstSpareAsOne'. */
    protected TShippingInstSpare _tShippingInstSpareAsOne;

    /**
     * [get] t_shipping_inst_spare by SHIPPING_INST_B_ID, named 'TShippingInstSpareAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'TShippingInstSpareAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public TShippingInstSpare getTShippingInstSpareAsOne() {
        return _tShippingInstSpareAsOne;
    }

    /**
     * [set] t_shipping_inst_spare by SHIPPING_INST_B_ID, named 'TShippingInstSpareAsOne'.
     * @param TShippingInstSpareAsOne The entity of foreign property(referrer-as-one) 'TShippingInstSpareAsOne'. (NullAllowed)
     */
    public void setTShippingInstSpareAsOne(TShippingInstSpare TShippingInstSpareAsOne) {
        _tShippingInstSpareAsOne = TShippingInstSpareAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** t_picking_b by SHIPPING_INST_B_ID, named 'TPickingBList'. */
    protected List<TPickingB> _tPickingBList;

    /**
     * [get] t_picking_b by SHIPPING_INST_B_ID, named 'TPickingBList'.
     * @return The entity list of referrer property 'TPickingBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPickingB> getTPickingBList() {
        if (_tPickingBList == null) { _tPickingBList = newReferrerList(); }
        return _tPickingBList;
    }

    /**
     * [set] t_picking_b by SHIPPING_INST_B_ID, named 'TPickingBList'.
     * @param tPickingBList The entity list of referrer property 'TPickingBList'. (NullAllowed)
     */
    public void setTPickingBList(List<TPickingB> tPickingBList) {
        _tPickingBList = tPickingBList;
    }

    /** t_shipping_inst_b_print by SHIPPING_INST_B_ID, named 'TShippingInstBPrintList'. */
    protected List<TShippingInstBPrint> _tShippingInstBPrintList;

    /**
     * [get] t_shipping_inst_b_print by SHIPPING_INST_B_ID, named 'TShippingInstBPrintList'.
     * @return The entity list of referrer property 'TShippingInstBPrintList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstBPrint> getTShippingInstBPrintList() {
        if (_tShippingInstBPrintList == null) { _tShippingInstBPrintList = newReferrerList(); }
        return _tShippingInstBPrintList;
    }

    /**
     * [set] t_shipping_inst_b_print by SHIPPING_INST_B_ID, named 'TShippingInstBPrintList'.
     * @param tShippingInstBPrintList The entity list of referrer property 'TShippingInstBPrintList'. (NullAllowed)
     */
    public void setTShippingInstBPrintList(List<TShippingInstBPrint> tShippingInstBPrintList) {
        _tShippingInstBPrintList = tShippingInstBPrintList;
    }

    /** t_shipping_inst_data_transfer by SHIPPING_INST_B_ID, named 'TShippingInstDataTransferList'. */
    protected List<TShippingInstDataTransfer> _tShippingInstDataTransferList;

    /**
     * [get] t_shipping_inst_data_transfer by SHIPPING_INST_B_ID, named 'TShippingInstDataTransferList'.
     * @return The entity list of referrer property 'TShippingInstDataTransferList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstDataTransfer> getTShippingInstDataTransferList() {
        if (_tShippingInstDataTransferList == null) { _tShippingInstDataTransferList = newReferrerList(); }
        return _tShippingInstDataTransferList;
    }

    /**
     * [set] t_shipping_inst_data_transfer by SHIPPING_INST_B_ID, named 'TShippingInstDataTransferList'.
     * @param tShippingInstDataTransferList The entity list of referrer property 'TShippingInstDataTransferList'. (NullAllowed)
     */
    public void setTShippingInstDataTransferList(List<TShippingInstDataTransfer> tShippingInstDataTransferList) {
        _tShippingInstDataTransferList = tShippingInstDataTransferList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTShippingInstB) {
            BsTShippingInstB other = (BsTShippingInstB)obj;
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
        hs = xCH(hs, _shippingInstBId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mStockType != null)
        { sb.append(li).append(xbRDS(_mStockType, "mStockType")); }
        if (_tStoreNo != null)
        { sb.append(li).append(xbRDS(_tStoreNo, "tStoreNo")); }
        if (_mLocation != null)
        { sb.append(li).append(xbRDS(_mLocation, "mLocation")); }
        if (_tAllocInstB != null)
        { sb.append(li).append(xbRDS(_tAllocInstB, "tAllocInstB")); }
        if (_mShape != null)
        { sb.append(li).append(xbRDS(_mShape, "mShape")); }
        if (_mProduct != null)
        { sb.append(li).append(xbRDS(_mProduct, "mProduct")); }
        if (_tLot != null)
        { sb.append(li).append(xbRDS(_tLot, "tLot")); }
        if (_mCustomer != null)
        { sb.append(li).append(xbRDS(_mCustomer, "mCustomer")); }
        if (_mWarehouse != null)
        { sb.append(li).append(xbRDS(_mWarehouse, "mWarehouse")); }
        if (_tShippingInstH != null)
        { sb.append(li).append(xbRDS(_tShippingInstH, "tShippingInstH")); }
        if (_bClassDtlByErrorFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByErrorFlg, "bClassDtlByErrorFlg")); }
        if (_tShippingInstSpareAsOne != null)
        { sb.append(li).append(xbRDS(_tShippingInstSpareAsOne, "tShippingInstSpareAsOne")); }
        if (_tPickingBList != null) { for (TPickingB et : _tPickingBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPickingBList")); } } }
        if (_tShippingInstBPrintList != null) { for (TShippingInstBPrint et : _tShippingInstBPrintList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstBPrintList")); } } }
        if (_tShippingInstDataTransferList != null) { for (TShippingInstDataTransfer et : _tShippingInstDataTransferList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstDataTransferList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shippingInstBId));
        sb.append(dm).append(xfND(_shippingInstHId));
        sb.append(dm).append(xfND(_lineNo));
        sb.append(dm).append(xfND(_warehouseId));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_stockTypeId));
        sb.append(dm).append(xfND(_stockTypeCd));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_depositId));
        sb.append(dm).append(xfND(_depositCd));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_limitDt));
        sb.append(dm).append(xfND(_storeNoId));
        sb.append(dm).append(xfND(_storeLabelNo));
        sb.append(dm).append(xfND(_shapeId));
        sb.append(dm).append(xfND(_shapeCd));
        sb.append(dm).append(xfND(_unitNum));
        sb.append(dm).append(xfND(_instNum));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_allocInstBId));
        sb.append(dm).append(xfND(_allocNum));
        sb.append(dm).append(xfND(_stockOutNum));
        sb.append(dm).append(xfND(_unitPrice));
        sb.append(dm).append(xfND(_price));
        sb.append(dm).append(xfND(_tax));
        sb.append(dm).append(xfND(_casePieceTypeId));
        sb.append(dm).append(xfND(_casePieceTypeCd));
        sb.append(dm).append(xfND(_prodDt));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_taxRate));
        sb.append(dm).append(xfND(_logiWeightFlg));
        sb.append(dm).append(xfND(_logiAttentionTypeCd));
        sb.append(dm).append(xfND(_logiSpecialTypeCd));
        sb.append(dm).append(xfND(_hinmokuText));
        sb.append(dm).append(xfND(_unitNm));
        sb.append(dm).append(xfND(_ecUnitNm));
        sb.append(dm).append(xfND(_sampleTypeCd));
        sb.append(dm).append(xfND(_ecOrderBranchNo));
        sb.append(dm).append(xfND(_ecProductNmKanji));
        sb.append(dm).append(xfND(_storePlantCd));
        sb.append(dm).append(xfND(_storeStorageSpaceCd));
        sb.append(dm).append(xfND(_lotManagTypeCd));
        sb.append(dm).append(xfND(_delivCd));
        sb.append(dm).append(xfND(_transactionTypeCd));
        sb.append(dm).append(xfND(_wmSendFlg));
        sb.append(dm).append(xfND(_lpSendFlg));
        sb.append(dm).append(xfND(_cmSendFlg));
        sb.append(dm).append(xfND(_empIdCd));
        sb.append(dm).append(xfND(_empNm));
        sb.append(dm).append(xfND(_us3fTypeCd));
        sb.append(dm).append(xfND(_hinmokuGroup));
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
        if (_mStockType != null)
        { sb.append(dm).append("mStockType"); }
        if (_tStoreNo != null)
        { sb.append(dm).append("tStoreNo"); }
        if (_mLocation != null)
        { sb.append(dm).append("mLocation"); }
        if (_tAllocInstB != null)
        { sb.append(dm).append("tAllocInstB"); }
        if (_mShape != null)
        { sb.append(dm).append("mShape"); }
        if (_mProduct != null)
        { sb.append(dm).append("mProduct"); }
        if (_tLot != null)
        { sb.append(dm).append("tLot"); }
        if (_mCustomer != null)
        { sb.append(dm).append("mCustomer"); }
        if (_mWarehouse != null)
        { sb.append(dm).append("mWarehouse"); }
        if (_tShippingInstH != null)
        { sb.append(dm).append("tShippingInstH"); }
        if (_bClassDtlByErrorFlg != null)
        { sb.append(dm).append("bClassDtlByErrorFlg"); }
        if (_tShippingInstSpareAsOne != null)
        { sb.append(dm).append("tShippingInstSpareAsOne"); }
        if (_tPickingBList != null && !_tPickingBList.isEmpty())
        { sb.append(dm).append("tPickingBList"); }
        if (_tShippingInstBPrintList != null && !_tShippingInstBPrintList.isEmpty())
        { sb.append(dm).append("tShippingInstBPrintList"); }
        if (_tShippingInstDataTransferList != null && !_tShippingInstDataTransferList.isEmpty())
        { sb.append(dm).append("tShippingInstDataTransferList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TShippingInstB clone() {
        return (TShippingInstB)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷指示ボディID
     * @return The value of the column 'SHIPPING_INST_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippingInstBId() {
        checkSpecifiedProperty("shippingInstBId");
        return _shippingInstBId;
    }

    /**
     * [set] SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷指示ボディID
     * @param shippingInstBId The value of the column 'SHIPPING_INST_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShippingInstBId(Long shippingInstBId) {
        registerModifiedProperty("shippingInstBId");
        _shippingInstBId = shippingInstBId;
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
     * [get] WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse} <br>
     * 指定倉庫ID
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWarehouseId() {
        checkSpecifiedProperty("warehouseId");
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse} <br>
     * 指定倉庫ID
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseId(Long warehouseId) {
        registerModifiedProperty("warehouseId");
        _warehouseId = warehouseId;
    }

    /**
     * [get] WAREHOUSE_CD: {VARCHAR(30)} <br>
     * 指定倉庫CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] WAREHOUSE_CD: {VARCHAR(30)} <br>
     * 指定倉庫CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseCd(String warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
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
     * [get] STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} <br>
     * 在庫区分ID
     * @return The value of the column 'STOCK_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStockTypeId() {
        checkSpecifiedProperty("stockTypeId");
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} <br>
     * 在庫区分ID
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeId(Long stockTypeId) {
        registerModifiedProperty("stockTypeId");
        _stockTypeId = stockTypeId;
    }

    /**
     * [get] STOCK_TYPE_CD: {NotNull, VARCHAR(30)} <br>
     * 在庫区分CD
     * @return The value of the column 'STOCK_TYPE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getStockTypeCd() {
        checkSpecifiedProperty("stockTypeCd");
        return convertEmptyToNull(_stockTypeCd);
    }

    /**
     * [set] STOCK_TYPE_CD: {NotNull, VARCHAR(30)} <br>
     * 在庫区分CD
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setStockTypeCd(String stockTypeCd) {
        registerModifiedProperty("stockTypeCd");
        _stockTypeCd = stockTypeCd;
    }

    /**
     * [get] LOCATION_ID: {IX, BIGINT(19), FK to m_location} <br>
     * 指定ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {IX, BIGINT(19), FK to m_location} <br>
     * 指定ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] LOCATION_CD: {VARCHAR(30)} <br>
     * 指定ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {VARCHAR(30)} <br>
     * 指定ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 預託ID
     * @return The value of the column 'DEPOSIT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDepositId() {
        checkSpecifiedProperty("depositId");
        return _depositId;
    }

    /**
     * [set] DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 預託ID
     * @param depositId The value of the column 'DEPOSIT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositId(Long depositId) {
        registerModifiedProperty("depositId");
        _depositId = depositId;
    }

    /**
     * [get] DEPOSIT_CD: {VARCHAR(30)} <br>
     * 預託CD
     * @return The value of the column 'DEPOSIT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositCd() {
        checkSpecifiedProperty("depositCd");
        return convertEmptyToNull(_depositCd);
    }

    /**
     * [set] DEPOSIT_CD: {VARCHAR(30)} <br>
     * 預託CD
     * @param depositCd The value of the column 'DEPOSIT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositCd(String depositCd) {
        registerModifiedProperty("depositCd");
        _depositCd = depositCd;
    }

    /**
     * [get] LOT_ID: {IX, BIGINT(19), FK to t_lot} <br>
     * 指定ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLotId() {
        checkSpecifiedProperty("lotId");
        return _lotId;
    }

    /**
     * [set] LOT_ID: {IX, BIGINT(19), FK to t_lot} <br>
     * 指定ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotId(Long lotId) {
        registerModifiedProperty("lotId");
        _lotId = lotId;
    }

    /**
     * [get] LOT: {VARCHAR(30)} <br>
     * 指定ロット
     * @return The value of the column 'LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot() {
        checkSpecifiedProperty("lot");
        return convertEmptyToNull(_lot);
    }

    /**
     * [set] LOT: {VARCHAR(30)} <br>
     * 指定ロット
     * @param lot The value of the column 'LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot(String lot) {
        registerModifiedProperty("lot");
        _lot = lot;
    }

    /**
     * [get] LIMIT_DT: {VARCHAR(8)} <br>
     * 指定期限日
     * @return The value of the column 'LIMIT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDt() {
        checkSpecifiedProperty("limitDt");
        return convertEmptyToNull(_limitDt);
    }

    /**
     * [set] LIMIT_DT: {VARCHAR(8)} <br>
     * 指定期限日
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDt(String limitDt) {
        registerModifiedProperty("limitDt");
        _limitDt = limitDt;
    }

    /**
     * [get] STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no} <br>
     * 指定入庫No.ID
     * @return The value of the column 'STORE_NO_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStoreNoId() {
        checkSpecifiedProperty("storeNoId");
        return _storeNoId;
    }

    /**
     * [set] STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no} <br>
     * 指定入庫No.ID
     * @param storeNoId The value of the column 'STORE_NO_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreNoId(Long storeNoId) {
        registerModifiedProperty("storeNoId");
        _storeNoId = storeNoId;
    }

    /**
     * [get] STORE_LABEL_NO: {VARCHAR(30)} <br>
     * 指定入庫ラベルNo.
     * @return The value of the column 'STORE_LABEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreLabelNo() {
        checkSpecifiedProperty("storeLabelNo");
        return convertEmptyToNull(_storeLabelNo);
    }

    /**
     * [set] STORE_LABEL_NO: {VARCHAR(30)} <br>
     * 指定入庫ラベルNo.
     * @param storeLabelNo The value of the column 'STORE_LABEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreLabelNo(String storeLabelNo) {
        registerModifiedProperty("storeLabelNo");
        _storeLabelNo = storeLabelNo;
    }

    /**
     * [get] SHAPE_ID: {IX, BIGINT(19), FK to m_shape} <br>
     * 指定荷姿ID
     * @return The value of the column 'SHAPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShapeId() {
        checkSpecifiedProperty("shapeId");
        return _shapeId;
    }

    /**
     * [set] SHAPE_ID: {IX, BIGINT(19), FK to m_shape} <br>
     * 指定荷姿ID
     * @param shapeId The value of the column 'SHAPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShapeId(Long shapeId) {
        registerModifiedProperty("shapeId");
        _shapeId = shapeId;
    }

    /**
     * [get] SHAPE_CD: {VARCHAR(30)} <br>
     * 指定荷姿CD
     * @return The value of the column 'SHAPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShapeCd() {
        checkSpecifiedProperty("shapeCd");
        return convertEmptyToNull(_shapeCd);
    }

    /**
     * [set] SHAPE_CD: {VARCHAR(30)} <br>
     * 指定荷姿CD
     * @param shapeCd The value of the column 'SHAPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShapeCd(String shapeCd) {
        registerModifiedProperty("shapeCd");
        _shapeCd = shapeCd;
    }

    /**
     * [get] UNIT_NUM: {BIGINT(19)} <br>
     * 指定入数
     * @return The value of the column 'UNIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnitNum() {
        checkSpecifiedProperty("unitNum");
        return _unitNum;
    }

    /**
     * [set] UNIT_NUM: {BIGINT(19)} <br>
     * 指定入数
     * @param unitNum The value of the column 'UNIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitNum(Long unitNum) {
        registerModifiedProperty("unitNum");
        _unitNum = unitNum;
    }

    /**
     * [get] INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 指示数
     * @return The value of the column 'INST_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getInstNum() {
        checkSpecifiedProperty("instNum");
        return _instNum;
    }

    /**
     * [set] INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 指示数
     * @param instNum The value of the column 'INST_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setInstNum(java.math.BigDecimal instNum) {
        registerModifiedProperty("instNum");
        _instNum = instNum;
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
     * [get] ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b} <br>
     * 引当指示ボディID
     * @return The value of the column 'ALLOC_INST_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAllocInstBId() {
        checkSpecifiedProperty("allocInstBId");
        return _allocInstBId;
    }

    /**
     * [set] ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b} <br>
     * 引当指示ボディID
     * @param allocInstBId The value of the column 'ALLOC_INST_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocInstBId(Long allocInstBId) {
        registerModifiedProperty("allocInstBId");
        _allocInstBId = allocInstBId;
    }

    /**
     * [get] ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 引当済数
     * @return The value of the column 'ALLOC_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getAllocNum() {
        checkSpecifiedProperty("allocNum");
        return _allocNum;
    }

    /**
     * [set] ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 引当済数
     * @param allocNum The value of the column 'ALLOC_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setAllocNum(java.math.BigDecimal allocNum) {
        registerModifiedProperty("allocNum");
        _allocNum = allocNum;
    }

    /**
     * [get] STOCK_OUT_NUM: {DECIMAL(14, 4)} <br>
     * 欠品数
     * @return The value of the column 'STOCK_OUT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getStockOutNum() {
        checkSpecifiedProperty("stockOutNum");
        return _stockOutNum;
    }

    /**
     * [set] STOCK_OUT_NUM: {DECIMAL(14, 4)} <br>
     * 欠品数
     * @param stockOutNum The value of the column 'STOCK_OUT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockOutNum(java.math.BigDecimal stockOutNum) {
        registerModifiedProperty("stockOutNum");
        _stockOutNum = stockOutNum;
    }

    /**
     * [get] UNIT_PRICE: {DECIMAL(14, 4)} <br>
     * 単価
     * @return The value of the column 'UNIT_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getUnitPrice() {
        checkSpecifiedProperty("unitPrice");
        return _unitPrice;
    }

    /**
     * [set] UNIT_PRICE: {DECIMAL(14, 4)} <br>
     * 単価
     * @param unitPrice The value of the column 'UNIT_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitPrice(java.math.BigDecimal unitPrice) {
        registerModifiedProperty("unitPrice");
        _unitPrice = unitPrice;
    }

    /**
     * [get] PRICE: {DECIMAL(14, 4)} <br>
     * 金額
     * @return The value of the column 'PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPrice() {
        checkSpecifiedProperty("price");
        return _price;
    }

    /**
     * [set] PRICE: {DECIMAL(14, 4)} <br>
     * 金額
     * @param price The value of the column 'PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrice(java.math.BigDecimal price) {
        registerModifiedProperty("price");
        _price = price;
    }

    /**
     * [get] TAX: {DECIMAL(14, 4)} <br>
     * 消費税
     * @return The value of the column 'TAX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTax() {
        checkSpecifiedProperty("tax");
        return _tax;
    }

    /**
     * [set] TAX: {DECIMAL(14, 4)} <br>
     * 消費税
     * @param tax The value of the column 'TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTax(java.math.BigDecimal tax) {
        registerModifiedProperty("tax");
        _tax = tax;
    }

    /**
     * [get] CASE_PIECE_TYPE_ID: {BIGINT(19)} <br>
     * ケースバラ指定区分ID
     * @return The value of the column 'CASE_PIECE_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCasePieceTypeId() {
        checkSpecifiedProperty("casePieceTypeId");
        return _casePieceTypeId;
    }

    /**
     * [set] CASE_PIECE_TYPE_ID: {BIGINT(19)} <br>
     * ケースバラ指定区分ID
     * @param casePieceTypeId The value of the column 'CASE_PIECE_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasePieceTypeId(Long casePieceTypeId) {
        registerModifiedProperty("casePieceTypeId");
        _casePieceTypeId = casePieceTypeId;
    }

    /**
     * [get] CASE_PIECE_TYPE_CD: {VARCHAR(30)} <br>
     * ケースバラ指定区分CD
     * @return The value of the column 'CASE_PIECE_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasePieceTypeCd() {
        checkSpecifiedProperty("casePieceTypeCd");
        return convertEmptyToNull(_casePieceTypeCd);
    }

    /**
     * [set] CASE_PIECE_TYPE_CD: {VARCHAR(30)} <br>
     * ケースバラ指定区分CD
     * @param casePieceTypeCd The value of the column 'CASE_PIECE_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasePieceTypeCd(String casePieceTypeCd) {
        registerModifiedProperty("casePieceTypeCd");
        _casePieceTypeCd = casePieceTypeCd;
    }

    /**
     * [get] PROD_DT: {VARCHAR(8)} <br>
     * 指定製造日
     * @return The value of the column 'PROD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getProdDt() {
        checkSpecifiedProperty("prodDt");
        return convertEmptyToNull(_prodDt);
    }

    /**
     * [set] PROD_DT: {VARCHAR(8)} <br>
     * 指定製造日
     * @param prodDt The value of the column 'PROD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProdDt(String prodDt) {
        registerModifiedProperty("prodDt");
        _prodDt = prodDt;
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
     * [get] TAX_RATE: {DECIMAL(14, 4)} <br>
     * 消費税率
     * @return The value of the column 'TAX_RATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTaxRate() {
        checkSpecifiedProperty("taxRate");
        return _taxRate;
    }

    /**
     * [set] TAX_RATE: {DECIMAL(14, 4)} <br>
     * 消費税率
     * @param taxRate The value of the column 'TAX_RATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTaxRate(java.math.BigDecimal taxRate) {
        registerModifiedProperty("taxRate");
        _taxRate = taxRate;
    }

    /**
     * [get] LOGI_WEIGHT_FLG: {CHAR(1)} <br>
     * 物流重量物フラグ
     * @return The value of the column 'LOGI_WEIGHT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogiWeightFlg() {
        checkSpecifiedProperty("logiWeightFlg");
        return convertEmptyToNull(_logiWeightFlg);
    }

    /**
     * [set] LOGI_WEIGHT_FLG: {CHAR(1)} <br>
     * 物流重量物フラグ
     * @param logiWeightFlg The value of the column 'LOGI_WEIGHT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogiWeightFlg(String logiWeightFlg) {
        registerModifiedProperty("logiWeightFlg");
        _logiWeightFlg = logiWeightFlg;
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
     * [get] EC_UNIT_NM: {VARCHAR(60)} <br>
     * EC単位名
     * @return The value of the column 'EC_UNIT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getEcUnitNm() {
        checkSpecifiedProperty("ecUnitNm");
        return convertEmptyToNull(_ecUnitNm);
    }

    /**
     * [set] EC_UNIT_NM: {VARCHAR(60)} <br>
     * EC単位名
     * @param ecUnitNm The value of the column 'EC_UNIT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEcUnitNm(String ecUnitNm) {
        registerModifiedProperty("ecUnitNm");
        _ecUnitNm = ecUnitNm;
    }

    /**
     * [get] SAMPLE_TYPE_CD: {VARCHAR(30)} <br>
     * サンプル区分
     * @return The value of the column 'SAMPLE_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSampleTypeCd() {
        checkSpecifiedProperty("sampleTypeCd");
        return convertEmptyToNull(_sampleTypeCd);
    }

    /**
     * [set] SAMPLE_TYPE_CD: {VARCHAR(30)} <br>
     * サンプル区分
     * @param sampleTypeCd The value of the column 'SAMPLE_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSampleTypeCd(String sampleTypeCd) {
        registerModifiedProperty("sampleTypeCd");
        _sampleTypeCd = sampleTypeCd;
    }

    /**
     * [get] EC_ORDER_BRANCH_NO: {VARCHAR(30)} <br>
     * ＥＣ発注番号_枝番
     * @return The value of the column 'EC_ORDER_BRANCH_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getEcOrderBranchNo() {
        checkSpecifiedProperty("ecOrderBranchNo");
        return convertEmptyToNull(_ecOrderBranchNo);
    }

    /**
     * [set] EC_ORDER_BRANCH_NO: {VARCHAR(30)} <br>
     * ＥＣ発注番号_枝番
     * @param ecOrderBranchNo The value of the column 'EC_ORDER_BRANCH_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEcOrderBranchNo(String ecOrderBranchNo) {
        registerModifiedProperty("ecOrderBranchNo");
        _ecOrderBranchNo = ecOrderBranchNo;
    }

    /**
     * [get] EC_PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * EC品名漢字
     * @return The value of the column 'EC_PRODUCT_NM_KANJI'. (NullAllowed even if selected: for no constraint)
     */
    public String getEcProductNmKanji() {
        checkSpecifiedProperty("ecProductNmKanji");
        return convertEmptyToNull(_ecProductNmKanji);
    }

    /**
     * [set] EC_PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * EC品名漢字
     * @param ecProductNmKanji The value of the column 'EC_PRODUCT_NM_KANJI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEcProductNmKanji(String ecProductNmKanji) {
        registerModifiedProperty("ecProductNmKanji");
        _ecProductNmKanji = ecProductNmKanji;
    }

    /**
     * [get] STORE_PLANT_CD: {VARCHAR(30)} <br>
     * 入庫プラント
     * @return The value of the column 'STORE_PLANT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStorePlantCd() {
        checkSpecifiedProperty("storePlantCd");
        return convertEmptyToNull(_storePlantCd);
    }

    /**
     * [set] STORE_PLANT_CD: {VARCHAR(30)} <br>
     * 入庫プラント
     * @param storePlantCd The value of the column 'STORE_PLANT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStorePlantCd(String storePlantCd) {
        registerModifiedProperty("storePlantCd");
        _storePlantCd = storePlantCd;
    }

    /**
     * [get] STORE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 入庫保管場所
     * @return The value of the column 'STORE_STORAGE_SPACE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreStorageSpaceCd() {
        checkSpecifiedProperty("storeStorageSpaceCd");
        return convertEmptyToNull(_storeStorageSpaceCd);
    }

    /**
     * [set] STORE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 入庫保管場所
     * @param storeStorageSpaceCd The value of the column 'STORE_STORAGE_SPACE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreStorageSpaceCd(String storeStorageSpaceCd) {
        registerModifiedProperty("storeStorageSpaceCd");
        _storeStorageSpaceCd = storeStorageSpaceCd;
    }

    /**
     * [get] LOT_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * ロット管理区分
     * @return The value of the column 'LOT_MANAG_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotManagTypeCd() {
        checkSpecifiedProperty("lotManagTypeCd");
        return convertEmptyToNull(_lotManagTypeCd);
    }

    /**
     * [set] LOT_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * ロット管理区分
     * @param lotManagTypeCd The value of the column 'LOT_MANAG_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotManagTypeCd(String lotManagTypeCd) {
        registerModifiedProperty("lotManagTypeCd");
        _lotManagTypeCd = lotManagTypeCd;
    }

    /**
     * [get] DELIV_CD: {VARCHAR(30)} <br>
     * 納入先CD
     * @return The value of the column 'DELIV_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCd() {
        checkSpecifiedProperty("delivCd");
        return convertEmptyToNull(_delivCd);
    }

    /**
     * [set] DELIV_CD: {VARCHAR(30)} <br>
     * 納入先CD
     * @param delivCd The value of the column 'DELIV_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCd(String delivCd) {
        registerModifiedProperty("delivCd");
        _delivCd = delivCd;
    }

    /**
     * [get] TRANSACTION_TYPE_CD: {VARCHAR(30)} <br>
     * 取引区分
     * @return The value of the column 'TRANSACTION_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransactionTypeCd() {
        checkSpecifiedProperty("transactionTypeCd");
        return convertEmptyToNull(_transactionTypeCd);
    }

    /**
     * [set] TRANSACTION_TYPE_CD: {VARCHAR(30)} <br>
     * 取引区分
     * @param transactionTypeCd The value of the column 'TRANSACTION_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransactionTypeCd(String transactionTypeCd) {
        registerModifiedProperty("transactionTypeCd");
        _transactionTypeCd = transactionTypeCd;
    }

    /**
     * [get] WM_SEND_FLG: {CHAR(1)} <br>
     * WMS送信済フラグ
     * @return The value of the column 'WM_SEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmSendFlg() {
        checkSpecifiedProperty("wmSendFlg");
        return convertEmptyToNull(_wmSendFlg);
    }

    /**
     * [set] WM_SEND_FLG: {CHAR(1)} <br>
     * WMS送信済フラグ
     * @param wmSendFlg The value of the column 'WM_SEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmSendFlg(String wmSendFlg) {
        registerModifiedProperty("wmSendFlg");
        _wmSendFlg = wmSendFlg;
    }

    /**
     * [get] LP_SEND_FLG: {CHAR(1)} <br>
     * 物流ポータル送信済フラグ
     * @return The value of the column 'LP_SEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLpSendFlg() {
        checkSpecifiedProperty("lpSendFlg");
        return convertEmptyToNull(_lpSendFlg);
    }

    /**
     * [set] LP_SEND_FLG: {CHAR(1)} <br>
     * 物流ポータル送信済フラグ
     * @param lpSendFlg The value of the column 'LP_SEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLpSendFlg(String lpSendFlg) {
        registerModifiedProperty("lpSendFlg");
        _lpSendFlg = lpSendFlg;
    }

    /**
     * [get] CM_SEND_FLG: {CHAR(1)} <br>
     * 共通管理送信済フラグ
     * @return The value of the column 'CM_SEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCmSendFlg() {
        checkSpecifiedProperty("cmSendFlg");
        return convertEmptyToNull(_cmSendFlg);
    }

    /**
     * [set] CM_SEND_FLG: {CHAR(1)} <br>
     * 共通管理送信済フラグ
     * @param cmSendFlg The value of the column 'CM_SEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCmSendFlg(String cmSendFlg) {
        registerModifiedProperty("cmSendFlg");
        _cmSendFlg = cmSendFlg;
    }

    /**
     * [get] EMP_ID_CD: {VARCHAR(30)} <br>
     * 社員識別CD
     * @return The value of the column 'EMP_ID_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmpIdCd() {
        checkSpecifiedProperty("empIdCd");
        return convertEmptyToNull(_empIdCd);
    }

    /**
     * [set] EMP_ID_CD: {VARCHAR(30)} <br>
     * 社員識別CD
     * @param empIdCd The value of the column 'EMP_ID_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmpIdCd(String empIdCd) {
        registerModifiedProperty("empIdCd");
        _empIdCd = empIdCd;
    }

    /**
     * [get] EMP_NM: {VARCHAR(60)} <br>
     * 社員氏名
     * @return The value of the column 'EMP_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmpNm() {
        checkSpecifiedProperty("empNm");
        return convertEmptyToNull(_empNm);
    }

    /**
     * [set] EMP_NM: {VARCHAR(60)} <br>
     * 社員氏名
     * @param empNm The value of the column 'EMP_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmpNm(String empNm) {
        registerModifiedProperty("empNm");
        _empNm = empNm;
    }

    /**
     * [get] US3F_TYPE_CD: {VARCHAR(30)} <br>
     * US3階区分
     * @return The value of the column 'US3F_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getUs3fTypeCd() {
        checkSpecifiedProperty("us3fTypeCd");
        return convertEmptyToNull(_us3fTypeCd);
    }

    /**
     * [set] US3F_TYPE_CD: {VARCHAR(30)} <br>
     * US3階区分
     * @param us3fTypeCd The value of the column 'US3F_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUs3fTypeCd(String us3fTypeCd) {
        registerModifiedProperty("us3fTypeCd");
        _us3fTypeCd = us3fTypeCd;
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
