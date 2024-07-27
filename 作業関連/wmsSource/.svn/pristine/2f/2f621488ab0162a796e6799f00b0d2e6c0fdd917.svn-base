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
 * The entity of m_product as TABLE. <br>
 * 商品マスタ
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, CLIENT_ID, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, JAN_CD, LOT_MANAG_FLG, LIMIT_DT_MANAG_FLG, RECEIVE_LIMIT_NUM, SHIPPING_LIMIT_NUM, MERGE_CLS, LOT_REVERSE_FLG, LIMIT_DT_REVERSE_FLG, SHIPPING_STOP_FLG, FIXED_POINT, SHAPE_GRP_ID, NMFC_CODE, FREIGHT_CLS, COUNNTRY_OF_ORIGIN, UNIT_VAL, HTS_CD, PRODUCT_CATEGORY_CLS, PROD_DT_MANAG_FLG, PROD_DT_LIMIT_DAYS_RCV, PROD_DT_LIMIT_DAYS_SHP, SERIAL_MANAG_FLG, OCR_DATE_FORMAT, INSURANCE_FLG, NO_OKINAWA_FLIGHT_FLG, HEAVY_ITEM_FLG, LARGE_ITEM_FLG, HINMOKU_GROUP_CD, CASE_TYPE_CD, EVALUATION_UNIT_PRICE, LOGI_SPECIAL_TYPE_CD, LOGI_ATTENTION_TYPE_CD, UNIT_NM, OLD_JAN_CD, RECOMEND_LOCATION_CD, RECOMEND_LOCATION_TYPE_CD, INNER_JAN_CD, CREATE_DATE, CREATE_TIME, FLOOR_REF_STOCK_NUM, WM_SEND_FLG, LP_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_shape_grp, m_client, b_class_dtl(ByDelFlg), m_set_parent(AsOne)
 *
 * [referrer table]
 *     h_stock_book, m_deposit_product, m_location, m_location_replenish_product, m_product_shape, m_set_structure, t_alloc_inst_b, t_alloc_lot, t_inventory_b, t_keeping_lot, t_last_lot, t_lot, t_move_inst_b, t_nizoroe_alarm_log, t_operation_log, t_receive_plan_b, t_serial_no, t_shipping_inst_b, t_stock, t_stock_book, w_ht_inventory_input_prod, w_ht_picking, w_ht_receive_inspection, w_ht_receive_no_plan_insp, w_ht_receive_store, w_ht_shipping, w_ht_shipping_picking, w_ht_total_picking, w_sgl_row_ship_insp_h, w_shipping_interrupt, m_set_parent
 *
 * [foreign property]
 *     mShapeGrp, mClient, bClassDtlByDelFlg, bClassDtlByLimitDtManagFlg, bClassDtlByLimitDtReverseFlg, bClassDtlByLotManagFlg, bClassDtlByLotReverseFlg, bClassDtlByMergeCls, bClassDtlByShippingStopFlg, bClassDtlByFreightCls, bClassDtlByProdDtManagFlg, bClassDtlByLogiSpecialTypeCd, bClassDtlByOcrDateFormat, bClassDtlByInsuranceFlg, bClassDtlByNoOkinawaFlightFlg, bClassDtlByLogiAttentionTypeCd, bClassDtlByHeavyItemFlg, bClassDtlByLargeItemFlg, mSetParentAsOne
 *
 * [referrer property]
 *     hStockBookList, mDepositProductList, mLocationList, mLocationReplenishProductList, mProductShapeList, mSetStructureList, tAllocInstBList, tAllocLotList, tInventoryBList, tKeepingLotList, tLastLotList, tLotList, tMoveInstBList, tNizoroeAlarmLogList, tOperationLogList, tReceivePlanBList, tSerialNoList, tShippingInstBList, tStockList, tStockBookList, wHtInventoryInputProdList, wHtPickingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtShippingList, wHtShippingPickingList, wHtTotalPickingList, wSglRowShipInspHList, wShippingInterruptList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long productId = entity.getProductId();
 * Long clientId = entity.getClientId();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String productAbbr = entity.getProductAbbr();
 * String janCd = entity.getJanCd();
 * String lotManagFlg = entity.getLotManagFlg();
 * String limitDtManagFlg = entity.getLimitDtManagFlg();
 * Long receiveLimitNum = entity.getReceiveLimitNum();
 * Long shippingLimitNum = entity.getShippingLimitNum();
 * String mergeCls = entity.getMergeCls();
 * String lotReverseFlg = entity.getLotReverseFlg();
 * String limitDtReverseFlg = entity.getLimitDtReverseFlg();
 * String shippingStopFlg = entity.getShippingStopFlg();
 * java.math.BigDecimal fixedPoint = entity.getFixedPoint();
 * Long shapeGrpId = entity.getShapeGrpId();
 * String nmfcCode = entity.getNmfcCode();
 * String freightCls = entity.getFreightCls();
 * String counntryOfOrigin = entity.getCounntryOfOrigin();
 * java.math.BigDecimal unitVal = entity.getUnitVal();
 * String htsCd = entity.getHtsCd();
 * String productCategoryCls = entity.getProductCategoryCls();
 * String prodDtManagFlg = entity.getProdDtManagFlg();
 * Long prodDtLimitDaysRcv = entity.getProdDtLimitDaysRcv();
 * Long prodDtLimitDaysShp = entity.getProdDtLimitDaysShp();
 * String serialManagFlg = entity.getSerialManagFlg();
 * String ocrDateFormat = entity.getOcrDateFormat();
 * String insuranceFlg = entity.getInsuranceFlg();
 * String noOkinawaFlightFlg = entity.getNoOkinawaFlightFlg();
 * String heavyItemFlg = entity.getHeavyItemFlg();
 * String largeItemFlg = entity.getLargeItemFlg();
 * String hinmokuGroupCd = entity.getHinmokuGroupCd();
 * String caseTypeCd = entity.getCaseTypeCd();
 * java.math.BigDecimal evaluationUnitPrice = entity.getEvaluationUnitPrice();
 * String logiSpecialTypeCd = entity.getLogiSpecialTypeCd();
 * String logiAttentionTypeCd = entity.getLogiAttentionTypeCd();
 * String unitNm = entity.getUnitNm();
 * String oldJanCd = entity.getOldJanCd();
 * String recomendLocationCd = entity.getRecomendLocationCd();
 * String recomendLocationTypeCd = entity.getRecomendLocationTypeCd();
 * String innerJanCd = entity.getInnerJanCd();
 * String createDate = entity.getCreateDate();
 * String createTime = entity.getCreateTime();
 * java.math.BigDecimal floorRefStockNum = entity.getFloorRefStockNum();
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
 * entity.setProductId(productId);
 * entity.setClientId(clientId);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setProductAbbr(productAbbr);
 * entity.setJanCd(janCd);
 * entity.setLotManagFlg(lotManagFlg);
 * entity.setLimitDtManagFlg(limitDtManagFlg);
 * entity.setReceiveLimitNum(receiveLimitNum);
 * entity.setShippingLimitNum(shippingLimitNum);
 * entity.setMergeCls(mergeCls);
 * entity.setLotReverseFlg(lotReverseFlg);
 * entity.setLimitDtReverseFlg(limitDtReverseFlg);
 * entity.setShippingStopFlg(shippingStopFlg);
 * entity.setFixedPoint(fixedPoint);
 * entity.setShapeGrpId(shapeGrpId);
 * entity.setNmfcCode(nmfcCode);
 * entity.setFreightCls(freightCls);
 * entity.setCounntryOfOrigin(counntryOfOrigin);
 * entity.setUnitVal(unitVal);
 * entity.setHtsCd(htsCd);
 * entity.setProductCategoryCls(productCategoryCls);
 * entity.setProdDtManagFlg(prodDtManagFlg);
 * entity.setProdDtLimitDaysRcv(prodDtLimitDaysRcv);
 * entity.setProdDtLimitDaysShp(prodDtLimitDaysShp);
 * entity.setSerialManagFlg(serialManagFlg);
 * entity.setOcrDateFormat(ocrDateFormat);
 * entity.setInsuranceFlg(insuranceFlg);
 * entity.setNoOkinawaFlightFlg(noOkinawaFlightFlg);
 * entity.setHeavyItemFlg(heavyItemFlg);
 * entity.setLargeItemFlg(largeItemFlg);
 * entity.setHinmokuGroupCd(hinmokuGroupCd);
 * entity.setCaseTypeCd(caseTypeCd);
 * entity.setEvaluationUnitPrice(evaluationUnitPrice);
 * entity.setLogiSpecialTypeCd(logiSpecialTypeCd);
 * entity.setLogiAttentionTypeCd(logiAttentionTypeCd);
 * entity.setUnitNm(unitNm);
 * entity.setOldJanCd(oldJanCd);
 * entity.setRecomendLocationCd(recomendLocationCd);
 * entity.setRecomendLocationTypeCd(recomendLocationTypeCd);
 * entity.setInnerJanCd(innerJanCd);
 * entity.setCreateDate(createDate);
 * entity.setCreateTime(createTime);
 * entity.setFloorRefStockNum(floorRefStockNum);
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
public abstract class BsMProduct extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _productId;

    /** CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client} */
    protected Long _clientId;

    /** PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {NotNull, VARCHAR(255)} */
    protected String _productNm;

    /** PRODUCT_ABBR: {VARCHAR(60)} */
    protected String _productAbbr;

    /** JAN_CD: {IX, VARCHAR(30)} */
    protected String _janCd;

    /** LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} */
    protected String _lotManagFlg;

    /** LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} */
    protected String _limitDtManagFlg;

    /** RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]} */
    protected Long _receiveLimitNum;

    /** SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]} */
    protected Long _shippingLimitNum;

    /** MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} */
    protected String _mergeCls;

    /** LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} */
    protected String _lotReverseFlg;

    /** LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} */
    protected String _limitDtReverseFlg;

    /** SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} */
    protected String _shippingStopFlg;

    /** FIXED_POINT: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _fixedPoint;

    /** SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp} */
    protected Long _shapeGrpId;

    /** NMFC_CODE: {VARCHAR(30)} */
    protected String _nmfcCode;

    /** FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls} */
    protected String _freightCls;

    /** COUNNTRY_OF_ORIGIN: {VARCHAR(30)} */
    protected String _counntryOfOrigin;

    /** UNIT_VAL: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _unitVal;

    /** HTS_CD: {VARCHAR(30)} */
    protected String _htsCd;

    /** PRODUCT_CATEGORY_CLS: {VARCHAR(30)} */
    protected String _productCategoryCls;

    /** PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg} */
    protected String _prodDtManagFlg;

    /** PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)} */
    protected Long _prodDtLimitDaysRcv;

    /** PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)} */
    protected Long _prodDtLimitDaysShp;

    /** SERIAL_MANAG_FLG: {CHAR(1)} */
    protected String _serialManagFlg;

    /** OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat} */
    protected String _ocrDateFormat;

    /** INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg} */
    protected String _insuranceFlg;

    /** NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg} */
    protected String _noOkinawaFlightFlg;

    /** HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg} */
    protected String _heavyItemFlg;

    /** LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg} */
    protected String _largeItemFlg;

    /** HINMOKU_GROUP_CD: {VARCHAR(30)} */
    protected String _hinmokuGroupCd;

    /** CASE_TYPE_CD: {VARCHAR(30)} */
    protected String _caseTypeCd;

    /** EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _evaluationUnitPrice;

    /** LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd} */
    protected String _logiSpecialTypeCd;

    /** LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd} */
    protected String _logiAttentionTypeCd;

    /** UNIT_NM: {VARCHAR(30)} */
    protected String _unitNm;

    /** OLD_JAN_CD: {VARCHAR(30)} */
    protected String _oldJanCd;

    /** RECOMEND_LOCATION_CD: {VARCHAR(30)} */
    protected String _recomendLocationCd;

    /** RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)} */
    protected String _recomendLocationTypeCd;

    /** INNER_JAN_CD: {VARCHAR(30)} */
    protected String _innerJanCd;

    /** CREATE_DATE: {VARCHAR(8)} */
    protected String _createDate;

    /** CREATE_TIME: {VARCHAR(6)} */
    protected String _createTime;

    /** FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _floorRefStockNum;

    /** WM_SEND_FLG: {CHAR(1), default=[0]} */
    protected String _wmSendFlg;

    /** LP_SEND_FLG: {CHAR(1), default=[0]} */
    protected String _lpSendFlg;

    /** DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
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
        return "m_product";
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
        if (_productId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param clientId : UQ+, NotNull, BIGINT(19), FK to m_client. (NotNull)
     * @param productCd : +UQ, IX, NotNull, VARCHAR(100). (NotNull)
     */
    public void uniqueBy(Long clientId, String productCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("clientId");
        __uniqueDrivenProperties.addPropertyName("productCd");
        setClientId(clientId);setProductCd(productCd);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of lotManagFlg as the classification of LotManagFlg. <br>
     * LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LotManagFlg getLotManagFlgAsLotManagFlg() {
        return CDef.LotManagFlg.codeOf(getLotManagFlg());
    }

    /**
     * Set the value of lotManagFlg as the classification of LotManagFlg. <br>
     * LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLotManagFlgAsLotManagFlg(CDef.LotManagFlg cdef) {
        setLotManagFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of limitDtManagFlg as the classification of LimitDtManagFlg. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LimitDtManagFlg getLimitDtManagFlgAsLimitDtManagFlg() {
        return CDef.LimitDtManagFlg.codeOf(getLimitDtManagFlg());
    }

    /**
     * Set the value of limitDtManagFlg as the classification of LimitDtManagFlg. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLimitDtManagFlgAsLimitDtManagFlg(CDef.LimitDtManagFlg cdef) {
        setLimitDtManagFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of mergeCls as the classification of MergeCls. <br>
     * MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MergeCls getMergeClsAsMergeCls() {
        return CDef.MergeCls.codeOf(getMergeCls());
    }

    /**
     * Set the value of mergeCls as the classification of MergeCls. <br>
     * MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMergeClsAsMergeCls(CDef.MergeCls cdef) {
        setMergeCls(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of lotReverseFlg as the classification of LotReverseFlg. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LotReverseFlg getLotReverseFlgAsLotReverseFlg() {
        return CDef.LotReverseFlg.codeOf(getLotReverseFlg());
    }

    /**
     * Set the value of lotReverseFlg as the classification of LotReverseFlg. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLotReverseFlgAsLotReverseFlg(CDef.LotReverseFlg cdef) {
        setLotReverseFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of limitDtReverseFlg as the classification of LimitDtReverseFlg. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LimitDtReverseFlg getLimitDtReverseFlgAsLimitDtReverseFlg() {
        return CDef.LimitDtReverseFlg.codeOf(getLimitDtReverseFlg());
    }

    /**
     * Set the value of limitDtReverseFlg as the classification of LimitDtReverseFlg. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLimitDtReverseFlgAsLimitDtReverseFlg(CDef.LimitDtReverseFlg cdef) {
        setLimitDtReverseFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of shippingStopFlg as the classification of ShippingStopFlg. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ShippingStopFlg getShippingStopFlgAsShippingStopFlg() {
        return CDef.ShippingStopFlg.codeOf(getShippingStopFlg());
    }

    /**
     * Set the value of shippingStopFlg as the classification of ShippingStopFlg. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setShippingStopFlgAsShippingStopFlg(CDef.ShippingStopFlg cdef) {
        setShippingStopFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of freightCls as the classification of FreightCls. <br>
     * FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.FreightCls getFreightClsAsFreightCls() {
        return CDef.FreightCls.codeOf(getFreightCls());
    }

    /**
     * Set the value of freightCls as the classification of FreightCls. <br>
     * FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setFreightClsAsFreightCls(CDef.FreightCls cdef) {
        setFreightCls(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of prodDtManagFlg as the classification of ProdDtManagFlg. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg} <br>
     * 製造日管理フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ProdDtManagFlg getProdDtManagFlgAsProdDtManagFlg() {
        return CDef.ProdDtManagFlg.codeOf(getProdDtManagFlg());
    }

    /**
     * Set the value of prodDtManagFlg as the classification of ProdDtManagFlg. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg} <br>
     * 製造日管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setProdDtManagFlgAsProdDtManagFlg(CDef.ProdDtManagFlg cdef) {
        setProdDtManagFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of ocrDateFormat as the classification of OcrDateFormat. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat} <br>
     * OCR日付形式
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.OcrDateFormat getOcrDateFormatAsOcrDateFormat() {
        return CDef.OcrDateFormat.codeOf(getOcrDateFormat());
    }

    /**
     * Set the value of ocrDateFormat as the classification of OcrDateFormat. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat} <br>
     * OCR日付形式
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setOcrDateFormatAsOcrDateFormat(CDef.OcrDateFormat cdef) {
        setOcrDateFormat(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of insuranceFlg as the classification of InsuranceFlg. <br>
     * INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg} <br>
     * 保険品フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.InsuranceFlg getInsuranceFlgAsInsuranceFlg() {
        return CDef.InsuranceFlg.codeOf(getInsuranceFlg());
    }

    /**
     * Set the value of insuranceFlg as the classification of InsuranceFlg. <br>
     * INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg} <br>
     * 保険品フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInsuranceFlgAsInsuranceFlg(CDef.InsuranceFlg cdef) {
        setInsuranceFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of noOkinawaFlightFlg as the classification of NoOkinawaFlightFlg. <br>
     * NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg} <br>
     * 沖縄航空便不可フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.NoOkinawaFlightFlg getNoOkinawaFlightFlgAsNoOkinawaFlightFlg() {
        return CDef.NoOkinawaFlightFlg.codeOf(getNoOkinawaFlightFlg());
    }

    /**
     * Set the value of noOkinawaFlightFlg as the classification of NoOkinawaFlightFlg. <br>
     * NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg} <br>
     * 沖縄航空便不可フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setNoOkinawaFlightFlgAsNoOkinawaFlightFlg(CDef.NoOkinawaFlightFlg cdef) {
        setNoOkinawaFlightFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of heavyItemFlg as the classification of HeavyItemFlg. <br>
     * HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg} <br>
     * 重量フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.HeavyItemFlg getHeavyItemFlgAsHeavyItemFlg() {
        return CDef.HeavyItemFlg.codeOf(getHeavyItemFlg());
    }

    /**
     * Set the value of heavyItemFlg as the classification of HeavyItemFlg. <br>
     * HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg} <br>
     * 重量フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setHeavyItemFlgAsHeavyItemFlg(CDef.HeavyItemFlg cdef) {
        setHeavyItemFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of largeItemFlg as the classification of LargeItemFlg. <br>
     * LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg} <br>
     * 大物フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LargeItemFlg getLargeItemFlgAsLargeItemFlg() {
        return CDef.LargeItemFlg.codeOf(getLargeItemFlg());
    }

    /**
     * Set the value of largeItemFlg as the classification of LargeItemFlg. <br>
     * LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg} <br>
     * 大物フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLargeItemFlgAsLargeItemFlg(CDef.LargeItemFlg cdef) {
        setLargeItemFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of logiSpecialTypeCd as the classification of LogiSpecialTypeCd. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd} <br>
     * 物流特殊区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LogiSpecialTypeCd getLogiSpecialTypeCdAsLogiSpecialTypeCd() {
        return CDef.LogiSpecialTypeCd.codeOf(getLogiSpecialTypeCd());
    }

    /**
     * Set the value of logiSpecialTypeCd as the classification of LogiSpecialTypeCd. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd} <br>
     * 物流特殊区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLogiSpecialTypeCdAsLogiSpecialTypeCd(CDef.LogiSpecialTypeCd cdef) {
        setLogiSpecialTypeCd(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of logiAttentionTypeCd as the classification of LogiAttentionTypeCd. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd} <br>
     * 物流注意区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LogiAttentionTypeCd getLogiAttentionTypeCdAsLogiAttentionTypeCd() {
        return CDef.LogiAttentionTypeCd.codeOf(getLogiAttentionTypeCd());
    }

    /**
     * Set the value of logiAttentionTypeCd as the classification of LogiAttentionTypeCd. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd} <br>
     * 物流注意区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLogiAttentionTypeCdAsLogiAttentionTypeCd(CDef.LogiAttentionTypeCd cdef) {
        setLogiAttentionTypeCd(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
     * Set the value of lotManagFlg as $1 (1). <br>
     * $1: 管理する
     */
    public void setLotManagFlg_$1() {
        setLotManagFlgAsLotManagFlg(CDef.LotManagFlg.$1);
    }

    /**
     * Set the value of lotManagFlg as $0 (0). <br>
     * $0: 管理しない
     */
    public void setLotManagFlg_$0() {
        setLotManagFlgAsLotManagFlg(CDef.LotManagFlg.$0);
    }

    /**
     * Set the value of limitDtManagFlg as $1 (1). <br>
     * $1: 管理する
     */
    public void setLimitDtManagFlg_$1() {
        setLimitDtManagFlgAsLimitDtManagFlg(CDef.LimitDtManagFlg.$1);
    }

    /**
     * Set the value of limitDtManagFlg as $0 (0). <br>
     * $0: 管理しない
     */
    public void setLimitDtManagFlg_$0() {
        setLimitDtManagFlgAsLimitDtManagFlg(CDef.LimitDtManagFlg.$0);
    }

    /**
     * Set the value of mergeCls as $00 (00). <br>
     * $00: マージしない
     */
    public void setMergeCls_$00() {
        setMergeClsAsMergeCls(CDef.MergeCls.$00);
    }

    /**
     * Set the value of mergeCls as $01 (01). <br>
     * $01: ピックロケのみ自動マージ
     */
    public void setMergeCls_$01() {
        setMergeClsAsMergeCls(CDef.MergeCls.$01);
    }

    /**
     * Set the value of mergeCls as $02 (02). <br>
     * $02: 自動マージ
     */
    public void setMergeCls_$02() {
        setMergeClsAsMergeCls(CDef.MergeCls.$02);
    }

    /**
     * Set the value of lotReverseFlg as $1 (1). <br>
     * $1: 管理する
     */
    public void setLotReverseFlg_$1() {
        setLotReverseFlgAsLotReverseFlg(CDef.LotReverseFlg.$1);
    }

    /**
     * Set the value of lotReverseFlg as $0 (0). <br>
     * $0: 管理しない
     */
    public void setLotReverseFlg_$0() {
        setLotReverseFlgAsLotReverseFlg(CDef.LotReverseFlg.$0);
    }

    /**
     * Set the value of limitDtReverseFlg as $1 (1). <br>
     * $1: 管理する
     */
    public void setLimitDtReverseFlg_$1() {
        setLimitDtReverseFlgAsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$1);
    }

    /**
     * Set the value of limitDtReverseFlg as $0 (0). <br>
     * $0: 管理しない
     */
    public void setLimitDtReverseFlg_$0() {
        setLimitDtReverseFlgAsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$0);
    }

    /**
     * Set the value of shippingStopFlg as $1 (1). <br>
     * $1: 出荷停止
     */
    public void setShippingStopFlg_$1() {
        setShippingStopFlgAsShippingStopFlg(CDef.ShippingStopFlg.$1);
    }

    /**
     * Set the value of shippingStopFlg as $0 (0). <br>
     * $0: 出荷可能
     */
    public void setShippingStopFlg_$0() {
        setShippingStopFlgAsShippingStopFlg(CDef.ShippingStopFlg.$0);
    }

    /**
     * Set the value of freightCls as $01 (01). <br>
     * $01: 50
     */
    public void setFreightCls_$01() {
        setFreightClsAsFreightCls(CDef.FreightCls.$01);
    }

    /**
     * Set the value of freightCls as $02 (02). <br>
     * $02: 55
     */
    public void setFreightCls_$02() {
        setFreightClsAsFreightCls(CDef.FreightCls.$02);
    }

    /**
     * Set the value of freightCls as $03 (03). <br>
     * $03: 60
     */
    public void setFreightCls_$03() {
        setFreightClsAsFreightCls(CDef.FreightCls.$03);
    }

    /**
     * Set the value of freightCls as $04 (04). <br>
     * $04: 65
     */
    public void setFreightCls_$04() {
        setFreightClsAsFreightCls(CDef.FreightCls.$04);
    }

    /**
     * Set the value of freightCls as $05 (05). <br>
     * $05: 70
     */
    public void setFreightCls_$05() {
        setFreightClsAsFreightCls(CDef.FreightCls.$05);
    }

    /**
     * Set the value of freightCls as $06 (06). <br>
     * $06: 77.5
     */
    public void setFreightCls_$06() {
        setFreightClsAsFreightCls(CDef.FreightCls.$06);
    }

    /**
     * Set the value of freightCls as $07 (07). <br>
     * $07: 85
     */
    public void setFreightCls_$07() {
        setFreightClsAsFreightCls(CDef.FreightCls.$07);
    }

    /**
     * Set the value of freightCls as $08 (08). <br>
     * $08: 92.5
     */
    public void setFreightCls_$08() {
        setFreightClsAsFreightCls(CDef.FreightCls.$08);
    }

    /**
     * Set the value of freightCls as $09 (09). <br>
     * $09: 100
     */
    public void setFreightCls_$09() {
        setFreightClsAsFreightCls(CDef.FreightCls.$09);
    }

    /**
     * Set the value of freightCls as $10 (10). <br>
     * $10: 110
     */
    public void setFreightCls_$10() {
        setFreightClsAsFreightCls(CDef.FreightCls.$10);
    }

    /**
     * Set the value of freightCls as $11 (11). <br>
     * $11: 125
     */
    public void setFreightCls_$11() {
        setFreightClsAsFreightCls(CDef.FreightCls.$11);
    }

    /**
     * Set the value of freightCls as $12 (12). <br>
     * $12: 150
     */
    public void setFreightCls_$12() {
        setFreightClsAsFreightCls(CDef.FreightCls.$12);
    }

    /**
     * Set the value of freightCls as $13 (13). <br>
     * $13: 175
     */
    public void setFreightCls_$13() {
        setFreightClsAsFreightCls(CDef.FreightCls.$13);
    }

    /**
     * Set the value of freightCls as $14 (14). <br>
     * $14: 200
     */
    public void setFreightCls_$14() {
        setFreightClsAsFreightCls(CDef.FreightCls.$14);
    }

    /**
     * Set the value of freightCls as $15 (15). <br>
     * $15: 250
     */
    public void setFreightCls_$15() {
        setFreightClsAsFreightCls(CDef.FreightCls.$15);
    }

    /**
     * Set the value of freightCls as $16 (16). <br>
     * $16: 300
     */
    public void setFreightCls_$16() {
        setFreightClsAsFreightCls(CDef.FreightCls.$16);
    }

    /**
     * Set the value of freightCls as $17 (17). <br>
     * $17: 400
     */
    public void setFreightCls_$17() {
        setFreightClsAsFreightCls(CDef.FreightCls.$17);
    }

    /**
     * Set the value of freightCls as $18 (18). <br>
     * $18: 500
     */
    public void setFreightCls_$18() {
        setFreightClsAsFreightCls(CDef.FreightCls.$18);
    }

    /**
     * Set the value of prodDtManagFlg as $0 (0). <br>
     * $0: 使用しない
     */
    public void setProdDtManagFlg_$0() {
        setProdDtManagFlgAsProdDtManagFlg(CDef.ProdDtManagFlg.$0);
    }

    /**
     * Set the value of prodDtManagFlg as $1 (1). <br>
     * $1: 使用する
     */
    public void setProdDtManagFlg_$1() {
        setProdDtManagFlgAsProdDtManagFlg(CDef.ProdDtManagFlg.$1);
    }

    /**
     * Set the value of ocrDateFormat as $1 (1). <br>
     * $1: YYYY/MM/DD
     */
    public void setOcrDateFormat_$1() {
        setOcrDateFormatAsOcrDateFormat(CDef.OcrDateFormat.$1);
    }

    /**
     * Set the value of ocrDateFormat as $2 (2). <br>
     * $2: YY.MM.DD
     */
    public void setOcrDateFormat_$2() {
        setOcrDateFormatAsOcrDateFormat(CDef.OcrDateFormat.$2);
    }

    /**
     * Set the value of insuranceFlg as $0 (0). <br>
     * $0: 使用しない
     */
    public void setInsuranceFlg_$0() {
        setInsuranceFlgAsInsuranceFlg(CDef.InsuranceFlg.$0);
    }

    /**
     * Set the value of insuranceFlg as $1 (1). <br>
     * $1: 使用する
     */
    public void setInsuranceFlg_$1() {
        setInsuranceFlgAsInsuranceFlg(CDef.InsuranceFlg.$1);
    }

    /**
     * Set the value of noOkinawaFlightFlg as $0 (0). <br>
     * $0: 使用しない
     */
    public void setNoOkinawaFlightFlg_$0() {
        setNoOkinawaFlightFlgAsNoOkinawaFlightFlg(CDef.NoOkinawaFlightFlg.$0);
    }

    /**
     * Set the value of noOkinawaFlightFlg as $1 (1). <br>
     * $1: 使用する
     */
    public void setNoOkinawaFlightFlg_$1() {
        setNoOkinawaFlightFlgAsNoOkinawaFlightFlg(CDef.NoOkinawaFlightFlg.$1);
    }

    /**
     * Set the value of heavyItemFlg as $0 (0). <br>
     * $0: 使用しない
     */
    public void setHeavyItemFlg_$0() {
        setHeavyItemFlgAsHeavyItemFlg(CDef.HeavyItemFlg.$0);
    }

    /**
     * Set the value of heavyItemFlg as $1 (1). <br>
     * $1: 使用する
     */
    public void setHeavyItemFlg_$1() {
        setHeavyItemFlgAsHeavyItemFlg(CDef.HeavyItemFlg.$1);
    }

    /**
     * Set the value of largeItemFlg as $0 (0). <br>
     * $0: 使用しない
     */
    public void setLargeItemFlg_$0() {
        setLargeItemFlgAsLargeItemFlg(CDef.LargeItemFlg.$0);
    }

    /**
     * Set the value of largeItemFlg as $1 (1). <br>
     * $1: 使用する
     */
    public void setLargeItemFlg_$1() {
        setLargeItemFlgAsLargeItemFlg(CDef.LargeItemFlg.$1);
    }

    /**
     * Set the value of logiSpecialTypeCd as $1 (1). <br>
     * $1: JAN1点読み対象
     */
    public void setLogiSpecialTypeCd_$1() {
        setLogiSpecialTypeCdAsLogiSpecialTypeCd(CDef.LogiSpecialTypeCd.$1);
    }

    /**
     * Set the value of logiAttentionTypeCd as $0 (0). <br>
     * $0: 使用しない
     */
    public void setLogiAttentionTypeCd_$0() {
        setLogiAttentionTypeCdAsLogiAttentionTypeCd(CDef.LogiAttentionTypeCd.$0);
    }

    /**
     * Set the value of logiAttentionTypeCd as $1 (1). <br>
     * $1: 使用する
     */
    public void setLogiAttentionTypeCd_$1() {
        setLogiAttentionTypeCdAsLogiAttentionTypeCd(CDef.LogiAttentionTypeCd.$1);
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
     * Is the value of lotManagFlg $1? <br>
     * $1: 管理する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLotManagFlg$1() {
        CDef.LotManagFlg cdef = getLotManagFlgAsLotManagFlg();
        return cdef != null ? cdef.equals(CDef.LotManagFlg.$1) : false;
    }

    /**
     * Is the value of lotManagFlg $0? <br>
     * $0: 管理しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLotManagFlg$0() {
        CDef.LotManagFlg cdef = getLotManagFlgAsLotManagFlg();
        return cdef != null ? cdef.equals(CDef.LotManagFlg.$0) : false;
    }

    /**
     * Is the value of limitDtManagFlg $1? <br>
     * $1: 管理する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLimitDtManagFlg$1() {
        CDef.LimitDtManagFlg cdef = getLimitDtManagFlgAsLimitDtManagFlg();
        return cdef != null ? cdef.equals(CDef.LimitDtManagFlg.$1) : false;
    }

    /**
     * Is the value of limitDtManagFlg $0? <br>
     * $0: 管理しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLimitDtManagFlg$0() {
        CDef.LimitDtManagFlg cdef = getLimitDtManagFlgAsLimitDtManagFlg();
        return cdef != null ? cdef.equals(CDef.LimitDtManagFlg.$0) : false;
    }

    /**
     * Is the value of mergeCls $00? <br>
     * $00: マージしない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMergeCls$00() {
        CDef.MergeCls cdef = getMergeClsAsMergeCls();
        return cdef != null ? cdef.equals(CDef.MergeCls.$00) : false;
    }

    /**
     * Is the value of mergeCls $01? <br>
     * $01: ピックロケのみ自動マージ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMergeCls$01() {
        CDef.MergeCls cdef = getMergeClsAsMergeCls();
        return cdef != null ? cdef.equals(CDef.MergeCls.$01) : false;
    }

    /**
     * Is the value of mergeCls $02? <br>
     * $02: 自動マージ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMergeCls$02() {
        CDef.MergeCls cdef = getMergeClsAsMergeCls();
        return cdef != null ? cdef.equals(CDef.MergeCls.$02) : false;
    }

    /**
     * Is the value of lotReverseFlg $1? <br>
     * $1: 管理する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLotReverseFlg$1() {
        CDef.LotReverseFlg cdef = getLotReverseFlgAsLotReverseFlg();
        return cdef != null ? cdef.equals(CDef.LotReverseFlg.$1) : false;
    }

    /**
     * Is the value of lotReverseFlg $0? <br>
     * $0: 管理しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLotReverseFlg$0() {
        CDef.LotReverseFlg cdef = getLotReverseFlgAsLotReverseFlg();
        return cdef != null ? cdef.equals(CDef.LotReverseFlg.$0) : false;
    }

    /**
     * Is the value of limitDtReverseFlg $1? <br>
     * $1: 管理する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLimitDtReverseFlg$1() {
        CDef.LimitDtReverseFlg cdef = getLimitDtReverseFlgAsLimitDtReverseFlg();
        return cdef != null ? cdef.equals(CDef.LimitDtReverseFlg.$1) : false;
    }

    /**
     * Is the value of limitDtReverseFlg $0? <br>
     * $0: 管理しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLimitDtReverseFlg$0() {
        CDef.LimitDtReverseFlg cdef = getLimitDtReverseFlgAsLimitDtReverseFlg();
        return cdef != null ? cdef.equals(CDef.LimitDtReverseFlg.$0) : false;
    }

    /**
     * Is the value of shippingStopFlg $1? <br>
     * $1: 出荷停止
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStopFlg$1() {
        CDef.ShippingStopFlg cdef = getShippingStopFlgAsShippingStopFlg();
        return cdef != null ? cdef.equals(CDef.ShippingStopFlg.$1) : false;
    }

    /**
     * Is the value of shippingStopFlg $0? <br>
     * $0: 出荷可能
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStopFlg$0() {
        CDef.ShippingStopFlg cdef = getShippingStopFlgAsShippingStopFlg();
        return cdef != null ? cdef.equals(CDef.ShippingStopFlg.$0) : false;
    }

    /**
     * Is the value of freightCls $01? <br>
     * $01: 50
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$01() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$01) : false;
    }

    /**
     * Is the value of freightCls $02? <br>
     * $02: 55
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$02() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$02) : false;
    }

    /**
     * Is the value of freightCls $03? <br>
     * $03: 60
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$03() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$03) : false;
    }

    /**
     * Is the value of freightCls $04? <br>
     * $04: 65
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$04() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$04) : false;
    }

    /**
     * Is the value of freightCls $05? <br>
     * $05: 70
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$05() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$05) : false;
    }

    /**
     * Is the value of freightCls $06? <br>
     * $06: 77.5
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$06() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$06) : false;
    }

    /**
     * Is the value of freightCls $07? <br>
     * $07: 85
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$07() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$07) : false;
    }

    /**
     * Is the value of freightCls $08? <br>
     * $08: 92.5
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$08() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$08) : false;
    }

    /**
     * Is the value of freightCls $09? <br>
     * $09: 100
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$09() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$09) : false;
    }

    /**
     * Is the value of freightCls $10? <br>
     * $10: 110
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$10() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$10) : false;
    }

    /**
     * Is the value of freightCls $11? <br>
     * $11: 125
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$11() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$11) : false;
    }

    /**
     * Is the value of freightCls $12? <br>
     * $12: 150
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$12() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$12) : false;
    }

    /**
     * Is the value of freightCls $13? <br>
     * $13: 175
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$13() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$13) : false;
    }

    /**
     * Is the value of freightCls $14? <br>
     * $14: 200
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$14() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$14) : false;
    }

    /**
     * Is the value of freightCls $15? <br>
     * $15: 250
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$15() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$15) : false;
    }

    /**
     * Is the value of freightCls $16? <br>
     * $16: 300
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$16() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$16) : false;
    }

    /**
     * Is the value of freightCls $17? <br>
     * $17: 400
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$17() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$17) : false;
    }

    /**
     * Is the value of freightCls $18? <br>
     * $18: 500
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreightCls$18() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.equals(CDef.FreightCls.$18) : false;
    }

    /**
     * Is the value of prodDtManagFlg $0? <br>
     * $0: 使用しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProdDtManagFlg$0() {
        CDef.ProdDtManagFlg cdef = getProdDtManagFlgAsProdDtManagFlg();
        return cdef != null ? cdef.equals(CDef.ProdDtManagFlg.$0) : false;
    }

    /**
     * Is the value of prodDtManagFlg $1? <br>
     * $1: 使用する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProdDtManagFlg$1() {
        CDef.ProdDtManagFlg cdef = getProdDtManagFlgAsProdDtManagFlg();
        return cdef != null ? cdef.equals(CDef.ProdDtManagFlg.$1) : false;
    }

    /**
     * Is the value of ocrDateFormat $1? <br>
     * $1: YYYY/MM/DD
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isOcrDateFormat$1() {
        CDef.OcrDateFormat cdef = getOcrDateFormatAsOcrDateFormat();
        return cdef != null ? cdef.equals(CDef.OcrDateFormat.$1) : false;
    }

    /**
     * Is the value of ocrDateFormat $2? <br>
     * $2: YY.MM.DD
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isOcrDateFormat$2() {
        CDef.OcrDateFormat cdef = getOcrDateFormatAsOcrDateFormat();
        return cdef != null ? cdef.equals(CDef.OcrDateFormat.$2) : false;
    }

    /**
     * Is the value of insuranceFlg $0? <br>
     * $0: 使用しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInsuranceFlg$0() {
        CDef.InsuranceFlg cdef = getInsuranceFlgAsInsuranceFlg();
        return cdef != null ? cdef.equals(CDef.InsuranceFlg.$0) : false;
    }

    /**
     * Is the value of insuranceFlg $1? <br>
     * $1: 使用する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInsuranceFlg$1() {
        CDef.InsuranceFlg cdef = getInsuranceFlgAsInsuranceFlg();
        return cdef != null ? cdef.equals(CDef.InsuranceFlg.$1) : false;
    }

    /**
     * Is the value of noOkinawaFlightFlg $0? <br>
     * $0: 使用しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNoOkinawaFlightFlg$0() {
        CDef.NoOkinawaFlightFlg cdef = getNoOkinawaFlightFlgAsNoOkinawaFlightFlg();
        return cdef != null ? cdef.equals(CDef.NoOkinawaFlightFlg.$0) : false;
    }

    /**
     * Is the value of noOkinawaFlightFlg $1? <br>
     * $1: 使用する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNoOkinawaFlightFlg$1() {
        CDef.NoOkinawaFlightFlg cdef = getNoOkinawaFlightFlgAsNoOkinawaFlightFlg();
        return cdef != null ? cdef.equals(CDef.NoOkinawaFlightFlg.$1) : false;
    }

    /**
     * Is the value of heavyItemFlg $0? <br>
     * $0: 使用しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isHeavyItemFlg$0() {
        CDef.HeavyItemFlg cdef = getHeavyItemFlgAsHeavyItemFlg();
        return cdef != null ? cdef.equals(CDef.HeavyItemFlg.$0) : false;
    }

    /**
     * Is the value of heavyItemFlg $1? <br>
     * $1: 使用する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isHeavyItemFlg$1() {
        CDef.HeavyItemFlg cdef = getHeavyItemFlgAsHeavyItemFlg();
        return cdef != null ? cdef.equals(CDef.HeavyItemFlg.$1) : false;
    }

    /**
     * Is the value of largeItemFlg $0? <br>
     * $0: 使用しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLargeItemFlg$0() {
        CDef.LargeItemFlg cdef = getLargeItemFlgAsLargeItemFlg();
        return cdef != null ? cdef.equals(CDef.LargeItemFlg.$0) : false;
    }

    /**
     * Is the value of largeItemFlg $1? <br>
     * $1: 使用する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLargeItemFlg$1() {
        CDef.LargeItemFlg cdef = getLargeItemFlgAsLargeItemFlg();
        return cdef != null ? cdef.equals(CDef.LargeItemFlg.$1) : false;
    }

    /**
     * Is the value of logiSpecialTypeCd $1? <br>
     * $1: JAN1点読み対象
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLogiSpecialTypeCd$1() {
        CDef.LogiSpecialTypeCd cdef = getLogiSpecialTypeCdAsLogiSpecialTypeCd();
        return cdef != null ? cdef.equals(CDef.LogiSpecialTypeCd.$1) : false;
    }

    /**
     * Is the value of logiAttentionTypeCd $0? <br>
     * $0: 使用しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLogiAttentionTypeCd$0() {
        CDef.LogiAttentionTypeCd cdef = getLogiAttentionTypeCdAsLogiAttentionTypeCd();
        return cdef != null ? cdef.equals(CDef.LogiAttentionTypeCd.$0) : false;
    }

    /**
     * Is the value of logiAttentionTypeCd $1? <br>
     * $1: 使用する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLogiAttentionTypeCd$1() {
        CDef.LogiAttentionTypeCd cdef = getLogiAttentionTypeCdAsLogiAttentionTypeCd();
        return cdef != null ? cdef.equals(CDef.LogiAttentionTypeCd.$1) : false;
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
     * Get the value of the column 'lotManagFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLotManagFlgName() {
        CDef.LotManagFlg cdef = getLotManagFlgAsLotManagFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'limitDtManagFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLimitDtManagFlgName() {
        CDef.LimitDtManagFlg cdef = getLimitDtManagFlgAsLimitDtManagFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'mergeCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMergeClsName() {
        CDef.MergeCls cdef = getMergeClsAsMergeCls();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'lotReverseFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLotReverseFlgName() {
        CDef.LotReverseFlg cdef = getLotReverseFlgAsLotReverseFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'limitDtReverseFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLimitDtReverseFlgName() {
        CDef.LimitDtReverseFlg cdef = getLimitDtReverseFlgAsLimitDtReverseFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'shippingStopFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getShippingStopFlgName() {
        CDef.ShippingStopFlg cdef = getShippingStopFlgAsShippingStopFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'freightCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getFreightClsName() {
        CDef.FreightCls cdef = getFreightClsAsFreightCls();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'prodDtManagFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getProdDtManagFlgName() {
        CDef.ProdDtManagFlg cdef = getProdDtManagFlgAsProdDtManagFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'ocrDateFormat' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getOcrDateFormatName() {
        CDef.OcrDateFormat cdef = getOcrDateFormatAsOcrDateFormat();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'insuranceFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInsuranceFlgName() {
        CDef.InsuranceFlg cdef = getInsuranceFlgAsInsuranceFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'noOkinawaFlightFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getNoOkinawaFlightFlgName() {
        CDef.NoOkinawaFlightFlg cdef = getNoOkinawaFlightFlgAsNoOkinawaFlightFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'heavyItemFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getHeavyItemFlgName() {
        CDef.HeavyItemFlg cdef = getHeavyItemFlgAsHeavyItemFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'largeItemFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLargeItemFlgName() {
        CDef.LargeItemFlg cdef = getLargeItemFlgAsLargeItemFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'logiSpecialTypeCd' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLogiSpecialTypeCdName() {
        CDef.LogiSpecialTypeCd cdef = getLogiSpecialTypeCdAsLogiSpecialTypeCd();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'logiAttentionTypeCd' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLogiAttentionTypeCdName() {
        CDef.LogiAttentionTypeCd cdef = getLogiAttentionTypeCdAsLogiAttentionTypeCd();
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
    /** m_shape_grp by my SHAPE_GRP_ID, named 'MShapeGrp'. */
    protected MShapeGrp _mShapeGrp;

    /**
     * [get] m_shape_grp by my SHAPE_GRP_ID, named 'MShapeGrp'. <br>
     * @return The entity of foreign property 'MShapeGrp'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MShapeGrp getMShapeGrp() {
        return _mShapeGrp;
    }

    /**
     * [set] m_shape_grp by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @param mShapeGrp The entity of foreign property 'MShapeGrp'. (NullAllowed)
     */
    public void setMShapeGrp(MShapeGrp mShapeGrp) {
        _mShapeGrp = mShapeGrp;
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

    /** b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'. */
    protected BClassDtl _bClassDtlByDelFlg;

    /**
     * [get] b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    /**
     * [set] b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @param bClassDtlByDelFlg The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed)
     */
    public void setBClassDtlByDelFlg(BClassDtl bClassDtlByDelFlg) {
        _bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    /** b_class_dtl by my LIMIT_DT_MANAG_FLG, named 'BClassDtlByLimitDtManagFlg'. */
    protected BClassDtl _bClassDtlByLimitDtManagFlg;

    /**
     * [get] b_class_dtl by my LIMIT_DT_MANAG_FLG, named 'BClassDtlByLimitDtManagFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLimitDtManagFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLimitDtManagFlg() {
        return _bClassDtlByLimitDtManagFlg;
    }

    /**
     * [set] b_class_dtl by my LIMIT_DT_MANAG_FLG, named 'BClassDtlByLimitDtManagFlg'.
     * @param bClassDtlByLimitDtManagFlg The entity of foreign property 'BClassDtlByLimitDtManagFlg'. (NullAllowed)
     */
    public void setBClassDtlByLimitDtManagFlg(BClassDtl bClassDtlByLimitDtManagFlg) {
        _bClassDtlByLimitDtManagFlg = bClassDtlByLimitDtManagFlg;
    }

    /** b_class_dtl by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'. */
    protected BClassDtl _bClassDtlByLimitDtReverseFlg;

    /**
     * [get] b_class_dtl by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLimitDtReverseFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLimitDtReverseFlg() {
        return _bClassDtlByLimitDtReverseFlg;
    }

    /**
     * [set] b_class_dtl by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'.
     * @param bClassDtlByLimitDtReverseFlg The entity of foreign property 'BClassDtlByLimitDtReverseFlg'. (NullAllowed)
     */
    public void setBClassDtlByLimitDtReverseFlg(BClassDtl bClassDtlByLimitDtReverseFlg) {
        _bClassDtlByLimitDtReverseFlg = bClassDtlByLimitDtReverseFlg;
    }

    /** b_class_dtl by my LOT_MANAG_FLG, named 'BClassDtlByLotManagFlg'. */
    protected BClassDtl _bClassDtlByLotManagFlg;

    /**
     * [get] b_class_dtl by my LOT_MANAG_FLG, named 'BClassDtlByLotManagFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLotManagFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLotManagFlg() {
        return _bClassDtlByLotManagFlg;
    }

    /**
     * [set] b_class_dtl by my LOT_MANAG_FLG, named 'BClassDtlByLotManagFlg'.
     * @param bClassDtlByLotManagFlg The entity of foreign property 'BClassDtlByLotManagFlg'. (NullAllowed)
     */
    public void setBClassDtlByLotManagFlg(BClassDtl bClassDtlByLotManagFlg) {
        _bClassDtlByLotManagFlg = bClassDtlByLotManagFlg;
    }

    /** b_class_dtl by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'. */
    protected BClassDtl _bClassDtlByLotReverseFlg;

    /**
     * [get] b_class_dtl by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLotReverseFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLotReverseFlg() {
        return _bClassDtlByLotReverseFlg;
    }

    /**
     * [set] b_class_dtl by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'.
     * @param bClassDtlByLotReverseFlg The entity of foreign property 'BClassDtlByLotReverseFlg'. (NullAllowed)
     */
    public void setBClassDtlByLotReverseFlg(BClassDtl bClassDtlByLotReverseFlg) {
        _bClassDtlByLotReverseFlg = bClassDtlByLotReverseFlg;
    }

    /** b_class_dtl by my MERGE_CLS, named 'BClassDtlByMergeCls'. */
    protected BClassDtl _bClassDtlByMergeCls;

    /**
     * [get] b_class_dtl by my MERGE_CLS, named 'BClassDtlByMergeCls'. <br>
     * @return The entity of foreign property 'BClassDtlByMergeCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByMergeCls() {
        return _bClassDtlByMergeCls;
    }

    /**
     * [set] b_class_dtl by my MERGE_CLS, named 'BClassDtlByMergeCls'.
     * @param bClassDtlByMergeCls The entity of foreign property 'BClassDtlByMergeCls'. (NullAllowed)
     */
    public void setBClassDtlByMergeCls(BClassDtl bClassDtlByMergeCls) {
        _bClassDtlByMergeCls = bClassDtlByMergeCls;
    }

    /** b_class_dtl by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'. */
    protected BClassDtl _bClassDtlByShippingStopFlg;

    /**
     * [get] b_class_dtl by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByShippingStopFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByShippingStopFlg() {
        return _bClassDtlByShippingStopFlg;
    }

    /**
     * [set] b_class_dtl by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'.
     * @param bClassDtlByShippingStopFlg The entity of foreign property 'BClassDtlByShippingStopFlg'. (NullAllowed)
     */
    public void setBClassDtlByShippingStopFlg(BClassDtl bClassDtlByShippingStopFlg) {
        _bClassDtlByShippingStopFlg = bClassDtlByShippingStopFlg;
    }

    /** b_class_dtl by my FREIGHT_CLS, named 'BClassDtlByFreightCls'. */
    protected BClassDtl _bClassDtlByFreightCls;

    /**
     * [get] b_class_dtl by my FREIGHT_CLS, named 'BClassDtlByFreightCls'. <br>
     * @return The entity of foreign property 'BClassDtlByFreightCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByFreightCls() {
        return _bClassDtlByFreightCls;
    }

    /**
     * [set] b_class_dtl by my FREIGHT_CLS, named 'BClassDtlByFreightCls'.
     * @param bClassDtlByFreightCls The entity of foreign property 'BClassDtlByFreightCls'. (NullAllowed)
     */
    public void setBClassDtlByFreightCls(BClassDtl bClassDtlByFreightCls) {
        _bClassDtlByFreightCls = bClassDtlByFreightCls;
    }

    /** b_class_dtl by my PROD_DT_MANAG_FLG, named 'BClassDtlByProdDtManagFlg'. */
    protected BClassDtl _bClassDtlByProdDtManagFlg;

    /**
     * [get] b_class_dtl by my PROD_DT_MANAG_FLG, named 'BClassDtlByProdDtManagFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByProdDtManagFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByProdDtManagFlg() {
        return _bClassDtlByProdDtManagFlg;
    }

    /**
     * [set] b_class_dtl by my PROD_DT_MANAG_FLG, named 'BClassDtlByProdDtManagFlg'.
     * @param bClassDtlByProdDtManagFlg The entity of foreign property 'BClassDtlByProdDtManagFlg'. (NullAllowed)
     */
    public void setBClassDtlByProdDtManagFlg(BClassDtl bClassDtlByProdDtManagFlg) {
        _bClassDtlByProdDtManagFlg = bClassDtlByProdDtManagFlg;
    }

    /** b_class_dtl by my LOGI_SPECIAL_TYPE_CD, named 'BClassDtlByLogiSpecialTypeCd'. */
    protected BClassDtl _bClassDtlByLogiSpecialTypeCd;

    /**
     * [get] b_class_dtl by my LOGI_SPECIAL_TYPE_CD, named 'BClassDtlByLogiSpecialTypeCd'. <br>
     * @return The entity of foreign property 'BClassDtlByLogiSpecialTypeCd'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLogiSpecialTypeCd() {
        return _bClassDtlByLogiSpecialTypeCd;
    }

    /**
     * [set] b_class_dtl by my LOGI_SPECIAL_TYPE_CD, named 'BClassDtlByLogiSpecialTypeCd'.
     * @param bClassDtlByLogiSpecialTypeCd The entity of foreign property 'BClassDtlByLogiSpecialTypeCd'. (NullAllowed)
     */
    public void setBClassDtlByLogiSpecialTypeCd(BClassDtl bClassDtlByLogiSpecialTypeCd) {
        _bClassDtlByLogiSpecialTypeCd = bClassDtlByLogiSpecialTypeCd;
    }

    /** b_class_dtl by my OCR_DATE_FORMAT, named 'BClassDtlByOcrDateFormat'. */
    protected BClassDtl _bClassDtlByOcrDateFormat;

    /**
     * [get] b_class_dtl by my OCR_DATE_FORMAT, named 'BClassDtlByOcrDateFormat'. <br>
     * @return The entity of foreign property 'BClassDtlByOcrDateFormat'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByOcrDateFormat() {
        return _bClassDtlByOcrDateFormat;
    }

    /**
     * [set] b_class_dtl by my OCR_DATE_FORMAT, named 'BClassDtlByOcrDateFormat'.
     * @param bClassDtlByOcrDateFormat The entity of foreign property 'BClassDtlByOcrDateFormat'. (NullAllowed)
     */
    public void setBClassDtlByOcrDateFormat(BClassDtl bClassDtlByOcrDateFormat) {
        _bClassDtlByOcrDateFormat = bClassDtlByOcrDateFormat;
    }

    /** b_class_dtl by my INSURANCE_FLG, named 'BClassDtlByInsuranceFlg'. */
    protected BClassDtl _bClassDtlByInsuranceFlg;

    /**
     * [get] b_class_dtl by my INSURANCE_FLG, named 'BClassDtlByInsuranceFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByInsuranceFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByInsuranceFlg() {
        return _bClassDtlByInsuranceFlg;
    }

    /**
     * [set] b_class_dtl by my INSURANCE_FLG, named 'BClassDtlByInsuranceFlg'.
     * @param bClassDtlByInsuranceFlg The entity of foreign property 'BClassDtlByInsuranceFlg'. (NullAllowed)
     */
    public void setBClassDtlByInsuranceFlg(BClassDtl bClassDtlByInsuranceFlg) {
        _bClassDtlByInsuranceFlg = bClassDtlByInsuranceFlg;
    }

    /** b_class_dtl by my NO_OKINAWA_FLIGHT_FLG, named 'BClassDtlByNoOkinawaFlightFlg'. */
    protected BClassDtl _bClassDtlByNoOkinawaFlightFlg;

    /**
     * [get] b_class_dtl by my NO_OKINAWA_FLIGHT_FLG, named 'BClassDtlByNoOkinawaFlightFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByNoOkinawaFlightFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByNoOkinawaFlightFlg() {
        return _bClassDtlByNoOkinawaFlightFlg;
    }

    /**
     * [set] b_class_dtl by my NO_OKINAWA_FLIGHT_FLG, named 'BClassDtlByNoOkinawaFlightFlg'.
     * @param bClassDtlByNoOkinawaFlightFlg The entity of foreign property 'BClassDtlByNoOkinawaFlightFlg'. (NullAllowed)
     */
    public void setBClassDtlByNoOkinawaFlightFlg(BClassDtl bClassDtlByNoOkinawaFlightFlg) {
        _bClassDtlByNoOkinawaFlightFlg = bClassDtlByNoOkinawaFlightFlg;
    }

    /** b_class_dtl by my LOGI_ATTENTION_TYPE_CD, named 'BClassDtlByLogiAttentionTypeCd'. */
    protected BClassDtl _bClassDtlByLogiAttentionTypeCd;

    /**
     * [get] b_class_dtl by my LOGI_ATTENTION_TYPE_CD, named 'BClassDtlByLogiAttentionTypeCd'. <br>
     * @return The entity of foreign property 'BClassDtlByLogiAttentionTypeCd'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLogiAttentionTypeCd() {
        return _bClassDtlByLogiAttentionTypeCd;
    }

    /**
     * [set] b_class_dtl by my LOGI_ATTENTION_TYPE_CD, named 'BClassDtlByLogiAttentionTypeCd'.
     * @param bClassDtlByLogiAttentionTypeCd The entity of foreign property 'BClassDtlByLogiAttentionTypeCd'. (NullAllowed)
     */
    public void setBClassDtlByLogiAttentionTypeCd(BClassDtl bClassDtlByLogiAttentionTypeCd) {
        _bClassDtlByLogiAttentionTypeCd = bClassDtlByLogiAttentionTypeCd;
    }

    /** b_class_dtl by my HEAVY_ITEM_FLG, named 'BClassDtlByHeavyItemFlg'. */
    protected BClassDtl _bClassDtlByHeavyItemFlg;

    /**
     * [get] b_class_dtl by my HEAVY_ITEM_FLG, named 'BClassDtlByHeavyItemFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByHeavyItemFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByHeavyItemFlg() {
        return _bClassDtlByHeavyItemFlg;
    }

    /**
     * [set] b_class_dtl by my HEAVY_ITEM_FLG, named 'BClassDtlByHeavyItemFlg'.
     * @param bClassDtlByHeavyItemFlg The entity of foreign property 'BClassDtlByHeavyItemFlg'. (NullAllowed)
     */
    public void setBClassDtlByHeavyItemFlg(BClassDtl bClassDtlByHeavyItemFlg) {
        _bClassDtlByHeavyItemFlg = bClassDtlByHeavyItemFlg;
    }

    /** b_class_dtl by my LARGE_ITEM_FLG, named 'BClassDtlByLargeItemFlg'. */
    protected BClassDtl _bClassDtlByLargeItemFlg;

    /**
     * [get] b_class_dtl by my LARGE_ITEM_FLG, named 'BClassDtlByLargeItemFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLargeItemFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLargeItemFlg() {
        return _bClassDtlByLargeItemFlg;
    }

    /**
     * [set] b_class_dtl by my LARGE_ITEM_FLG, named 'BClassDtlByLargeItemFlg'.
     * @param bClassDtlByLargeItemFlg The entity of foreign property 'BClassDtlByLargeItemFlg'. (NullAllowed)
     */
    public void setBClassDtlByLargeItemFlg(BClassDtl bClassDtlByLargeItemFlg) {
        _bClassDtlByLargeItemFlg = bClassDtlByLargeItemFlg;
    }

    /** m_set_parent by PRODUCT_ID, named 'MSetParentAsOne'. */
    protected MSetParent _mSetParentAsOne;

    /**
     * [get] m_set_parent by PRODUCT_ID, named 'MSetParentAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'MSetParentAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MSetParent getMSetParentAsOne() {
        return _mSetParentAsOne;
    }

    /**
     * [set] m_set_parent by PRODUCT_ID, named 'MSetParentAsOne'.
     * @param MSetParentAsOne The entity of foreign property(referrer-as-one) 'MSetParentAsOne'. (NullAllowed)
     */
    public void setMSetParentAsOne(MSetParent MSetParentAsOne) {
        _mSetParentAsOne = MSetParentAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** h_stock_book by PRODUCT_ID, named 'HStockBookList'. */
    protected List<HStockBook> _hStockBookList;

    /**
     * [get] h_stock_book by PRODUCT_ID, named 'HStockBookList'.
     * @return The entity list of referrer property 'HStockBookList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HStockBook> getHStockBookList() {
        if (_hStockBookList == null) { _hStockBookList = newReferrerList(); }
        return _hStockBookList;
    }

    /**
     * [set] h_stock_book by PRODUCT_ID, named 'HStockBookList'.
     * @param hStockBookList The entity list of referrer property 'HStockBookList'. (NullAllowed)
     */
    public void setHStockBookList(List<HStockBook> hStockBookList) {
        _hStockBookList = hStockBookList;
    }

    /** m_deposit_product by PRODUCT_ID, named 'MDepositProductList'. */
    protected List<MDepositProduct> _mDepositProductList;

    /**
     * [get] m_deposit_product by PRODUCT_ID, named 'MDepositProductList'.
     * @return The entity list of referrer property 'MDepositProductList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MDepositProduct> getMDepositProductList() {
        if (_mDepositProductList == null) { _mDepositProductList = newReferrerList(); }
        return _mDepositProductList;
    }

    /**
     * [set] m_deposit_product by PRODUCT_ID, named 'MDepositProductList'.
     * @param mDepositProductList The entity list of referrer property 'MDepositProductList'. (NullAllowed)
     */
    public void setMDepositProductList(List<MDepositProduct> mDepositProductList) {
        _mDepositProductList = mDepositProductList;
    }

    /** m_location by REPLENISH_PRODUCT_ID, named 'MLocationList'. */
    protected List<MLocation> _mLocationList;

    /**
     * [get] m_location by REPLENISH_PRODUCT_ID, named 'MLocationList'.
     * @return The entity list of referrer property 'MLocationList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MLocation> getMLocationList() {
        if (_mLocationList == null) { _mLocationList = newReferrerList(); }
        return _mLocationList;
    }

    /**
     * [set] m_location by REPLENISH_PRODUCT_ID, named 'MLocationList'.
     * @param mLocationList The entity list of referrer property 'MLocationList'. (NullAllowed)
     */
    public void setMLocationList(List<MLocation> mLocationList) {
        _mLocationList = mLocationList;
    }

    /** m_location_replenish_product by REPLENISH_PRODUCT_ID, named 'MLocationReplenishProductList'. */
    protected List<MLocationReplenishProduct> _mLocationReplenishProductList;

    /**
     * [get] m_location_replenish_product by REPLENISH_PRODUCT_ID, named 'MLocationReplenishProductList'.
     * @return The entity list of referrer property 'MLocationReplenishProductList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MLocationReplenishProduct> getMLocationReplenishProductList() {
        if (_mLocationReplenishProductList == null) { _mLocationReplenishProductList = newReferrerList(); }
        return _mLocationReplenishProductList;
    }

    /**
     * [set] m_location_replenish_product by REPLENISH_PRODUCT_ID, named 'MLocationReplenishProductList'.
     * @param mLocationReplenishProductList The entity list of referrer property 'MLocationReplenishProductList'. (NullAllowed)
     */
    public void setMLocationReplenishProductList(List<MLocationReplenishProduct> mLocationReplenishProductList) {
        _mLocationReplenishProductList = mLocationReplenishProductList;
    }

    /** m_product_shape by PRODUCT_ID, named 'MProductShapeList'. */
    protected List<MProductShape> _mProductShapeList;

    /**
     * [get] m_product_shape by PRODUCT_ID, named 'MProductShapeList'.
     * @return The entity list of referrer property 'MProductShapeList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MProductShape> getMProductShapeList() {
        if (_mProductShapeList == null) { _mProductShapeList = newReferrerList(); }
        return _mProductShapeList;
    }

    /**
     * [set] m_product_shape by PRODUCT_ID, named 'MProductShapeList'.
     * @param mProductShapeList The entity list of referrer property 'MProductShapeList'. (NullAllowed)
     */
    public void setMProductShapeList(List<MProductShape> mProductShapeList) {
        _mProductShapeList = mProductShapeList;
    }

    /** m_set_structure by PRODUCT_ID, named 'MSetStructureList'. */
    protected List<MSetStructure> _mSetStructureList;

    /**
     * [get] m_set_structure by PRODUCT_ID, named 'MSetStructureList'.
     * @return The entity list of referrer property 'MSetStructureList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MSetStructure> getMSetStructureList() {
        if (_mSetStructureList == null) { _mSetStructureList = newReferrerList(); }
        return _mSetStructureList;
    }

    /**
     * [set] m_set_structure by PRODUCT_ID, named 'MSetStructureList'.
     * @param mSetStructureList The entity list of referrer property 'MSetStructureList'. (NullAllowed)
     */
    public void setMSetStructureList(List<MSetStructure> mSetStructureList) {
        _mSetStructureList = mSetStructureList;
    }

    /** t_alloc_inst_b by PRODUCT_ID, named 'TAllocInstBList'. */
    protected List<TAllocInstB> _tAllocInstBList;

    /**
     * [get] t_alloc_inst_b by PRODUCT_ID, named 'TAllocInstBList'.
     * @return The entity list of referrer property 'TAllocInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocInstB> getTAllocInstBList() {
        if (_tAllocInstBList == null) { _tAllocInstBList = newReferrerList(); }
        return _tAllocInstBList;
    }

    /**
     * [set] t_alloc_inst_b by PRODUCT_ID, named 'TAllocInstBList'.
     * @param tAllocInstBList The entity list of referrer property 'TAllocInstBList'. (NullAllowed)
     */
    public void setTAllocInstBList(List<TAllocInstB> tAllocInstBList) {
        _tAllocInstBList = tAllocInstBList;
    }

    /** t_alloc_lot by PRODUCT_ID, named 'TAllocLotList'. */
    protected List<TAllocLot> _tAllocLotList;

    /**
     * [get] t_alloc_lot by PRODUCT_ID, named 'TAllocLotList'.
     * @return The entity list of referrer property 'TAllocLotList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocLot> getTAllocLotList() {
        if (_tAllocLotList == null) { _tAllocLotList = newReferrerList(); }
        return _tAllocLotList;
    }

    /**
     * [set] t_alloc_lot by PRODUCT_ID, named 'TAllocLotList'.
     * @param tAllocLotList The entity list of referrer property 'TAllocLotList'. (NullAllowed)
     */
    public void setTAllocLotList(List<TAllocLot> tAllocLotList) {
        _tAllocLotList = tAllocLotList;
    }

    /** t_inventory_b by PRODUCT_ID, named 'TInventoryBList'. */
    protected List<TInventoryB> _tInventoryBList;

    /**
     * [get] t_inventory_b by PRODUCT_ID, named 'TInventoryBList'.
     * @return The entity list of referrer property 'TInventoryBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryB> getTInventoryBList() {
        if (_tInventoryBList == null) { _tInventoryBList = newReferrerList(); }
        return _tInventoryBList;
    }

    /**
     * [set] t_inventory_b by PRODUCT_ID, named 'TInventoryBList'.
     * @param tInventoryBList The entity list of referrer property 'TInventoryBList'. (NullAllowed)
     */
    public void setTInventoryBList(List<TInventoryB> tInventoryBList) {
        _tInventoryBList = tInventoryBList;
    }

    /** t_keeping_lot by PRODUCT_ID, named 'TKeepingLotList'. */
    protected List<TKeepingLot> _tKeepingLotList;

    /**
     * [get] t_keeping_lot by PRODUCT_ID, named 'TKeepingLotList'.
     * @return The entity list of referrer property 'TKeepingLotList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TKeepingLot> getTKeepingLotList() {
        if (_tKeepingLotList == null) { _tKeepingLotList = newReferrerList(); }
        return _tKeepingLotList;
    }

    /**
     * [set] t_keeping_lot by PRODUCT_ID, named 'TKeepingLotList'.
     * @param tKeepingLotList The entity list of referrer property 'TKeepingLotList'. (NullAllowed)
     */
    public void setTKeepingLotList(List<TKeepingLot> tKeepingLotList) {
        _tKeepingLotList = tKeepingLotList;
    }

    /** t_last_lot by PRODUCT_ID, named 'TLastLotList'. */
    protected List<TLastLot> _tLastLotList;

    /**
     * [get] t_last_lot by PRODUCT_ID, named 'TLastLotList'.
     * @return The entity list of referrer property 'TLastLotList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TLastLot> getTLastLotList() {
        if (_tLastLotList == null) { _tLastLotList = newReferrerList(); }
        return _tLastLotList;
    }

    /**
     * [set] t_last_lot by PRODUCT_ID, named 'TLastLotList'.
     * @param tLastLotList The entity list of referrer property 'TLastLotList'. (NullAllowed)
     */
    public void setTLastLotList(List<TLastLot> tLastLotList) {
        _tLastLotList = tLastLotList;
    }

    /** t_lot by PRODUCT_ID, named 'TLotList'. */
    protected List<TLot> _tLotList;

    /**
     * [get] t_lot by PRODUCT_ID, named 'TLotList'.
     * @return The entity list of referrer property 'TLotList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TLot> getTLotList() {
        if (_tLotList == null) { _tLotList = newReferrerList(); }
        return _tLotList;
    }

    /**
     * [set] t_lot by PRODUCT_ID, named 'TLotList'.
     * @param tLotList The entity list of referrer property 'TLotList'. (NullAllowed)
     */
    public void setTLotList(List<TLot> tLotList) {
        _tLotList = tLotList;
    }

    /** t_move_inst_b by PRODUCT_ID, named 'TMoveInstBList'. */
    protected List<TMoveInstB> _tMoveInstBList;

    /**
     * [get] t_move_inst_b by PRODUCT_ID, named 'TMoveInstBList'.
     * @return The entity list of referrer property 'TMoveInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMoveInstB> getTMoveInstBList() {
        if (_tMoveInstBList == null) { _tMoveInstBList = newReferrerList(); }
        return _tMoveInstBList;
    }

    /**
     * [set] t_move_inst_b by PRODUCT_ID, named 'TMoveInstBList'.
     * @param tMoveInstBList The entity list of referrer property 'TMoveInstBList'. (NullAllowed)
     */
    public void setTMoveInstBList(List<TMoveInstB> tMoveInstBList) {
        _tMoveInstBList = tMoveInstBList;
    }

    /** t_nizoroe_alarm_log by PRODUCT_ID, named 'TNizoroeAlarmLogList'. */
    protected List<TNizoroeAlarmLog> _tNizoroeAlarmLogList;

    /**
     * [get] t_nizoroe_alarm_log by PRODUCT_ID, named 'TNizoroeAlarmLogList'.
     * @return The entity list of referrer property 'TNizoroeAlarmLogList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TNizoroeAlarmLog> getTNizoroeAlarmLogList() {
        if (_tNizoroeAlarmLogList == null) { _tNizoroeAlarmLogList = newReferrerList(); }
        return _tNizoroeAlarmLogList;
    }

    /**
     * [set] t_nizoroe_alarm_log by PRODUCT_ID, named 'TNizoroeAlarmLogList'.
     * @param tNizoroeAlarmLogList The entity list of referrer property 'TNizoroeAlarmLogList'. (NullAllowed)
     */
    public void setTNizoroeAlarmLogList(List<TNizoroeAlarmLog> tNizoroeAlarmLogList) {
        _tNizoroeAlarmLogList = tNizoroeAlarmLogList;
    }

    /** t_operation_log by PRODUCT_ID, named 'TOperationLogList'. */
    protected List<TOperationLog> _tOperationLogList;

    /**
     * [get] t_operation_log by PRODUCT_ID, named 'TOperationLogList'.
     * @return The entity list of referrer property 'TOperationLogList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TOperationLog> getTOperationLogList() {
        if (_tOperationLogList == null) { _tOperationLogList = newReferrerList(); }
        return _tOperationLogList;
    }

    /**
     * [set] t_operation_log by PRODUCT_ID, named 'TOperationLogList'.
     * @param tOperationLogList The entity list of referrer property 'TOperationLogList'. (NullAllowed)
     */
    public void setTOperationLogList(List<TOperationLog> tOperationLogList) {
        _tOperationLogList = tOperationLogList;
    }

    /** t_receive_plan_b by PRODUCT_ID, named 'TReceivePlanBList'. */
    protected List<TReceivePlanB> _tReceivePlanBList;

    /**
     * [get] t_receive_plan_b by PRODUCT_ID, named 'TReceivePlanBList'.
     * @return The entity list of referrer property 'TReceivePlanBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanB> getTReceivePlanBList() {
        if (_tReceivePlanBList == null) { _tReceivePlanBList = newReferrerList(); }
        return _tReceivePlanBList;
    }

    /**
     * [set] t_receive_plan_b by PRODUCT_ID, named 'TReceivePlanBList'.
     * @param tReceivePlanBList The entity list of referrer property 'TReceivePlanBList'. (NullAllowed)
     */
    public void setTReceivePlanBList(List<TReceivePlanB> tReceivePlanBList) {
        _tReceivePlanBList = tReceivePlanBList;
    }

    /** t_serial_no by PRODUCT_ID, named 'TSerialNoList'. */
    protected List<TSerialNo> _tSerialNoList;

    /**
     * [get] t_serial_no by PRODUCT_ID, named 'TSerialNoList'.
     * @return The entity list of referrer property 'TSerialNoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TSerialNo> getTSerialNoList() {
        if (_tSerialNoList == null) { _tSerialNoList = newReferrerList(); }
        return _tSerialNoList;
    }

    /**
     * [set] t_serial_no by PRODUCT_ID, named 'TSerialNoList'.
     * @param tSerialNoList The entity list of referrer property 'TSerialNoList'. (NullAllowed)
     */
    public void setTSerialNoList(List<TSerialNo> tSerialNoList) {
        _tSerialNoList = tSerialNoList;
    }

    /** t_shipping_inst_b by PRODUCT_ID, named 'TShippingInstBList'. */
    protected List<TShippingInstB> _tShippingInstBList;

    /**
     * [get] t_shipping_inst_b by PRODUCT_ID, named 'TShippingInstBList'.
     * @return The entity list of referrer property 'TShippingInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstB> getTShippingInstBList() {
        if (_tShippingInstBList == null) { _tShippingInstBList = newReferrerList(); }
        return _tShippingInstBList;
    }

    /**
     * [set] t_shipping_inst_b by PRODUCT_ID, named 'TShippingInstBList'.
     * @param tShippingInstBList The entity list of referrer property 'TShippingInstBList'. (NullAllowed)
     */
    public void setTShippingInstBList(List<TShippingInstB> tShippingInstBList) {
        _tShippingInstBList = tShippingInstBList;
    }

    /** t_stock by PRODUCT_ID, named 'TStockList'. */
    protected List<TStock> _tStockList;

    /**
     * [get] t_stock by PRODUCT_ID, named 'TStockList'.
     * @return The entity list of referrer property 'TStockList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStock> getTStockList() {
        if (_tStockList == null) { _tStockList = newReferrerList(); }
        return _tStockList;
    }

    /**
     * [set] t_stock by PRODUCT_ID, named 'TStockList'.
     * @param tStockList The entity list of referrer property 'TStockList'. (NullAllowed)
     */
    public void setTStockList(List<TStock> tStockList) {
        _tStockList = tStockList;
    }

    /** t_stock_book by PRODUCT_ID, named 'TStockBookList'. */
    protected List<TStockBook> _tStockBookList;

    /**
     * [get] t_stock_book by PRODUCT_ID, named 'TStockBookList'.
     * @return The entity list of referrer property 'TStockBookList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStockBook> getTStockBookList() {
        if (_tStockBookList == null) { _tStockBookList = newReferrerList(); }
        return _tStockBookList;
    }

    /**
     * [set] t_stock_book by PRODUCT_ID, named 'TStockBookList'.
     * @param tStockBookList The entity list of referrer property 'TStockBookList'. (NullAllowed)
     */
    public void setTStockBookList(List<TStockBook> tStockBookList) {
        _tStockBookList = tStockBookList;
    }

    /** w_ht_inventory_input_prod by PRODUCT_ID, named 'WHtInventoryInputProdList'. */
    protected List<WHtInventoryInputProd> _wHtInventoryInputProdList;

    /**
     * [get] w_ht_inventory_input_prod by PRODUCT_ID, named 'WHtInventoryInputProdList'.
     * @return The entity list of referrer property 'WHtInventoryInputProdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtInventoryInputProd> getWHtInventoryInputProdList() {
        if (_wHtInventoryInputProdList == null) { _wHtInventoryInputProdList = newReferrerList(); }
        return _wHtInventoryInputProdList;
    }

    /**
     * [set] w_ht_inventory_input_prod by PRODUCT_ID, named 'WHtInventoryInputProdList'.
     * @param wHtInventoryInputProdList The entity list of referrer property 'WHtInventoryInputProdList'. (NullAllowed)
     */
    public void setWHtInventoryInputProdList(List<WHtInventoryInputProd> wHtInventoryInputProdList) {
        _wHtInventoryInputProdList = wHtInventoryInputProdList;
    }

    /** w_ht_picking by PRODUCT_ID, named 'WHtPickingList'. */
    protected List<WHtPicking> _wHtPickingList;

    /**
     * [get] w_ht_picking by PRODUCT_ID, named 'WHtPickingList'.
     * @return The entity list of referrer property 'WHtPickingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtPicking> getWHtPickingList() {
        if (_wHtPickingList == null) { _wHtPickingList = newReferrerList(); }
        return _wHtPickingList;
    }

    /**
     * [set] w_ht_picking by PRODUCT_ID, named 'WHtPickingList'.
     * @param wHtPickingList The entity list of referrer property 'WHtPickingList'. (NullAllowed)
     */
    public void setWHtPickingList(List<WHtPicking> wHtPickingList) {
        _wHtPickingList = wHtPickingList;
    }

    /** w_ht_receive_inspection by PRODUCT_ID, named 'WHtReceiveInspectionList'. */
    protected List<WHtReceiveInspection> _wHtReceiveInspectionList;

    /**
     * [get] w_ht_receive_inspection by PRODUCT_ID, named 'WHtReceiveInspectionList'.
     * @return The entity list of referrer property 'WHtReceiveInspectionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveInspection> getWHtReceiveInspectionList() {
        if (_wHtReceiveInspectionList == null) { _wHtReceiveInspectionList = newReferrerList(); }
        return _wHtReceiveInspectionList;
    }

    /**
     * [set] w_ht_receive_inspection by PRODUCT_ID, named 'WHtReceiveInspectionList'.
     * @param wHtReceiveInspectionList The entity list of referrer property 'WHtReceiveInspectionList'. (NullAllowed)
     */
    public void setWHtReceiveInspectionList(List<WHtReceiveInspection> wHtReceiveInspectionList) {
        _wHtReceiveInspectionList = wHtReceiveInspectionList;
    }

    /** w_ht_receive_no_plan_insp by PRODUCT_ID, named 'WHtReceiveNoPlanInspList'. */
    protected List<WHtReceiveNoPlanInsp> _wHtReceiveNoPlanInspList;

    /**
     * [get] w_ht_receive_no_plan_insp by PRODUCT_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveNoPlanInsp> getWHtReceiveNoPlanInspList() {
        if (_wHtReceiveNoPlanInspList == null) { _wHtReceiveNoPlanInspList = newReferrerList(); }
        return _wHtReceiveNoPlanInspList;
    }

    /**
     * [set] w_ht_receive_no_plan_insp by PRODUCT_ID, named 'WHtReceiveNoPlanInspList'.
     * @param wHtReceiveNoPlanInspList The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NullAllowed)
     */
    public void setWHtReceiveNoPlanInspList(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList) {
        _wHtReceiveNoPlanInspList = wHtReceiveNoPlanInspList;
    }

    /** w_ht_receive_store by PRODUCT_ID, named 'WHtReceiveStoreList'. */
    protected List<WHtReceiveStore> _wHtReceiveStoreList;

    /**
     * [get] w_ht_receive_store by PRODUCT_ID, named 'WHtReceiveStoreList'.
     * @return The entity list of referrer property 'WHtReceiveStoreList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveStore> getWHtReceiveStoreList() {
        if (_wHtReceiveStoreList == null) { _wHtReceiveStoreList = newReferrerList(); }
        return _wHtReceiveStoreList;
    }

    /**
     * [set] w_ht_receive_store by PRODUCT_ID, named 'WHtReceiveStoreList'.
     * @param wHtReceiveStoreList The entity list of referrer property 'WHtReceiveStoreList'. (NullAllowed)
     */
    public void setWHtReceiveStoreList(List<WHtReceiveStore> wHtReceiveStoreList) {
        _wHtReceiveStoreList = wHtReceiveStoreList;
    }

    /** w_ht_shipping by PRODUCT_ID, named 'WHtShippingList'. */
    protected List<WHtShipping> _wHtShippingList;

    /**
     * [get] w_ht_shipping by PRODUCT_ID, named 'WHtShippingList'.
     * @return The entity list of referrer property 'WHtShippingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtShipping> getWHtShippingList() {
        if (_wHtShippingList == null) { _wHtShippingList = newReferrerList(); }
        return _wHtShippingList;
    }

    /**
     * [set] w_ht_shipping by PRODUCT_ID, named 'WHtShippingList'.
     * @param wHtShippingList The entity list of referrer property 'WHtShippingList'. (NullAllowed)
     */
    public void setWHtShippingList(List<WHtShipping> wHtShippingList) {
        _wHtShippingList = wHtShippingList;
    }

    /** w_ht_shipping_picking by PRODUCT_ID, named 'WHtShippingPickingList'. */
    protected List<WHtShippingPicking> _wHtShippingPickingList;

    /**
     * [get] w_ht_shipping_picking by PRODUCT_ID, named 'WHtShippingPickingList'.
     * @return The entity list of referrer property 'WHtShippingPickingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtShippingPicking> getWHtShippingPickingList() {
        if (_wHtShippingPickingList == null) { _wHtShippingPickingList = newReferrerList(); }
        return _wHtShippingPickingList;
    }

    /**
     * [set] w_ht_shipping_picking by PRODUCT_ID, named 'WHtShippingPickingList'.
     * @param wHtShippingPickingList The entity list of referrer property 'WHtShippingPickingList'. (NullAllowed)
     */
    public void setWHtShippingPickingList(List<WHtShippingPicking> wHtShippingPickingList) {
        _wHtShippingPickingList = wHtShippingPickingList;
    }

    /** w_ht_total_picking by PRODUCT_ID, named 'WHtTotalPickingList'. */
    protected List<WHtTotalPicking> _wHtTotalPickingList;

    /**
     * [get] w_ht_total_picking by PRODUCT_ID, named 'WHtTotalPickingList'.
     * @return The entity list of referrer property 'WHtTotalPickingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtTotalPicking> getWHtTotalPickingList() {
        if (_wHtTotalPickingList == null) { _wHtTotalPickingList = newReferrerList(); }
        return _wHtTotalPickingList;
    }

    /**
     * [set] w_ht_total_picking by PRODUCT_ID, named 'WHtTotalPickingList'.
     * @param wHtTotalPickingList The entity list of referrer property 'WHtTotalPickingList'. (NullAllowed)
     */
    public void setWHtTotalPickingList(List<WHtTotalPicking> wHtTotalPickingList) {
        _wHtTotalPickingList = wHtTotalPickingList;
    }

    /** w_sgl_row_ship_insp_h by PRODUCT_ID, named 'WSglRowShipInspHList'. */
    protected List<WSglRowShipInspH> _wSglRowShipInspHList;

    /**
     * [get] w_sgl_row_ship_insp_h by PRODUCT_ID, named 'WSglRowShipInspHList'.
     * @return The entity list of referrer property 'WSglRowShipInspHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WSglRowShipInspH> getWSglRowShipInspHList() {
        if (_wSglRowShipInspHList == null) { _wSglRowShipInspHList = newReferrerList(); }
        return _wSglRowShipInspHList;
    }

    /**
     * [set] w_sgl_row_ship_insp_h by PRODUCT_ID, named 'WSglRowShipInspHList'.
     * @param wSglRowShipInspHList The entity list of referrer property 'WSglRowShipInspHList'. (NullAllowed)
     */
    public void setWSglRowShipInspHList(List<WSglRowShipInspH> wSglRowShipInspHList) {
        _wSglRowShipInspHList = wSglRowShipInspHList;
    }

    /** w_shipping_interrupt by PRODUCT_ID, named 'WShippingInterruptList'. */
    protected List<WShippingInterrupt> _wShippingInterruptList;

    /**
     * [get] w_shipping_interrupt by PRODUCT_ID, named 'WShippingInterruptList'.
     * @return The entity list of referrer property 'WShippingInterruptList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WShippingInterrupt> getWShippingInterruptList() {
        if (_wShippingInterruptList == null) { _wShippingInterruptList = newReferrerList(); }
        return _wShippingInterruptList;
    }

    /**
     * [set] w_shipping_interrupt by PRODUCT_ID, named 'WShippingInterruptList'.
     * @param wShippingInterruptList The entity list of referrer property 'WShippingInterruptList'. (NullAllowed)
     */
    public void setWShippingInterruptList(List<WShippingInterrupt> wShippingInterruptList) {
        _wShippingInterruptList = wShippingInterruptList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMProduct) {
            BsMProduct other = (BsMProduct)obj;
            if (!xSV(_productId, other._productId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mShapeGrp != null)
        { sb.append(li).append(xbRDS(_mShapeGrp, "mShapeGrp")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_bClassDtlByLimitDtManagFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLimitDtManagFlg, "bClassDtlByLimitDtManagFlg")); }
        if (_bClassDtlByLimitDtReverseFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLimitDtReverseFlg, "bClassDtlByLimitDtReverseFlg")); }
        if (_bClassDtlByLotManagFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLotManagFlg, "bClassDtlByLotManagFlg")); }
        if (_bClassDtlByLotReverseFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLotReverseFlg, "bClassDtlByLotReverseFlg")); }
        if (_bClassDtlByMergeCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlByMergeCls, "bClassDtlByMergeCls")); }
        if (_bClassDtlByShippingStopFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByShippingStopFlg, "bClassDtlByShippingStopFlg")); }
        if (_bClassDtlByFreightCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlByFreightCls, "bClassDtlByFreightCls")); }
        if (_bClassDtlByProdDtManagFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByProdDtManagFlg, "bClassDtlByProdDtManagFlg")); }
        if (_bClassDtlByLogiSpecialTypeCd != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLogiSpecialTypeCd, "bClassDtlByLogiSpecialTypeCd")); }
        if (_bClassDtlByOcrDateFormat != null)
        { sb.append(li).append(xbRDS(_bClassDtlByOcrDateFormat, "bClassDtlByOcrDateFormat")); }
        if (_bClassDtlByInsuranceFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInsuranceFlg, "bClassDtlByInsuranceFlg")); }
        if (_bClassDtlByNoOkinawaFlightFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByNoOkinawaFlightFlg, "bClassDtlByNoOkinawaFlightFlg")); }
        if (_bClassDtlByLogiAttentionTypeCd != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLogiAttentionTypeCd, "bClassDtlByLogiAttentionTypeCd")); }
        if (_bClassDtlByHeavyItemFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByHeavyItemFlg, "bClassDtlByHeavyItemFlg")); }
        if (_bClassDtlByLargeItemFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLargeItemFlg, "bClassDtlByLargeItemFlg")); }
        if (_mSetParentAsOne != null)
        { sb.append(li).append(xbRDS(_mSetParentAsOne, "mSetParentAsOne")); }
        if (_hStockBookList != null) { for (HStockBook et : _hStockBookList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hStockBookList")); } } }
        if (_mDepositProductList != null) { for (MDepositProduct et : _mDepositProductList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mDepositProductList")); } } }
        if (_mLocationList != null) { for (MLocation et : _mLocationList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mLocationList")); } } }
        if (_mLocationReplenishProductList != null) { for (MLocationReplenishProduct et : _mLocationReplenishProductList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mLocationReplenishProductList")); } } }
        if (_mProductShapeList != null) { for (MProductShape et : _mProductShapeList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mProductShapeList")); } } }
        if (_mSetStructureList != null) { for (MSetStructure et : _mSetStructureList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mSetStructureList")); } } }
        if (_tAllocInstBList != null) { for (TAllocInstB et : _tAllocInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocInstBList")); } } }
        if (_tAllocLotList != null) { for (TAllocLot et : _tAllocLotList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocLotList")); } } }
        if (_tInventoryBList != null) { for (TInventoryB et : _tInventoryBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryBList")); } } }
        if (_tKeepingLotList != null) { for (TKeepingLot et : _tKeepingLotList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tKeepingLotList")); } } }
        if (_tLastLotList != null) { for (TLastLot et : _tLastLotList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tLastLotList")); } } }
        if (_tLotList != null) { for (TLot et : _tLotList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tLotList")); } } }
        if (_tMoveInstBList != null) { for (TMoveInstB et : _tMoveInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tMoveInstBList")); } } }
        if (_tNizoroeAlarmLogList != null) { for (TNizoroeAlarmLog et : _tNizoroeAlarmLogList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tNizoroeAlarmLogList")); } } }
        if (_tOperationLogList != null) { for (TOperationLog et : _tOperationLogList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tOperationLogList")); } } }
        if (_tReceivePlanBList != null) { for (TReceivePlanB et : _tReceivePlanBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReceivePlanBList")); } } }
        if (_tSerialNoList != null) { for (TSerialNo et : _tSerialNoList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tSerialNoList")); } } }
        if (_tShippingInstBList != null) { for (TShippingInstB et : _tShippingInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstBList")); } } }
        if (_tStockList != null) { for (TStock et : _tStockList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStockList")); } } }
        if (_tStockBookList != null) { for (TStockBook et : _tStockBookList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStockBookList")); } } }
        if (_wHtInventoryInputProdList != null) { for (WHtInventoryInputProd et : _wHtInventoryInputProdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtInventoryInputProdList")); } } }
        if (_wHtPickingList != null) { for (WHtPicking et : _wHtPickingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtPickingList")); } } }
        if (_wHtReceiveInspectionList != null) { for (WHtReceiveInspection et : _wHtReceiveInspectionList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveInspectionList")); } } }
        if (_wHtReceiveNoPlanInspList != null) { for (WHtReceiveNoPlanInsp et : _wHtReceiveNoPlanInspList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveNoPlanInspList")); } } }
        if (_wHtReceiveStoreList != null) { for (WHtReceiveStore et : _wHtReceiveStoreList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveStoreList")); } } }
        if (_wHtShippingList != null) { for (WHtShipping et : _wHtShippingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtShippingList")); } } }
        if (_wHtShippingPickingList != null) { for (WHtShippingPicking et : _wHtShippingPickingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtShippingPickingList")); } } }
        if (_wHtTotalPickingList != null) { for (WHtTotalPicking et : _wHtTotalPickingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtTotalPickingList")); } } }
        if (_wSglRowShipInspHList != null) { for (WSglRowShipInspH et : _wSglRowShipInspHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wSglRowShipInspHList")); } } }
        if (_wShippingInterruptList != null) { for (WShippingInterrupt et : _wShippingInterruptList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wShippingInterruptList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_lotManagFlg));
        sb.append(dm).append(xfND(_limitDtManagFlg));
        sb.append(dm).append(xfND(_receiveLimitNum));
        sb.append(dm).append(xfND(_shippingLimitNum));
        sb.append(dm).append(xfND(_mergeCls));
        sb.append(dm).append(xfND(_lotReverseFlg));
        sb.append(dm).append(xfND(_limitDtReverseFlg));
        sb.append(dm).append(xfND(_shippingStopFlg));
        sb.append(dm).append(xfND(_fixedPoint));
        sb.append(dm).append(xfND(_shapeGrpId));
        sb.append(dm).append(xfND(_nmfcCode));
        sb.append(dm).append(xfND(_freightCls));
        sb.append(dm).append(xfND(_counntryOfOrigin));
        sb.append(dm).append(xfND(_unitVal));
        sb.append(dm).append(xfND(_htsCd));
        sb.append(dm).append(xfND(_productCategoryCls));
        sb.append(dm).append(xfND(_prodDtManagFlg));
        sb.append(dm).append(xfND(_prodDtLimitDaysRcv));
        sb.append(dm).append(xfND(_prodDtLimitDaysShp));
        sb.append(dm).append(xfND(_serialManagFlg));
        sb.append(dm).append(xfND(_ocrDateFormat));
        sb.append(dm).append(xfND(_insuranceFlg));
        sb.append(dm).append(xfND(_noOkinawaFlightFlg));
        sb.append(dm).append(xfND(_heavyItemFlg));
        sb.append(dm).append(xfND(_largeItemFlg));
        sb.append(dm).append(xfND(_hinmokuGroupCd));
        sb.append(dm).append(xfND(_caseTypeCd));
        sb.append(dm).append(xfND(_evaluationUnitPrice));
        sb.append(dm).append(xfND(_logiSpecialTypeCd));
        sb.append(dm).append(xfND(_logiAttentionTypeCd));
        sb.append(dm).append(xfND(_unitNm));
        sb.append(dm).append(xfND(_oldJanCd));
        sb.append(dm).append(xfND(_recomendLocationCd));
        sb.append(dm).append(xfND(_recomendLocationTypeCd));
        sb.append(dm).append(xfND(_innerJanCd));
        sb.append(dm).append(xfND(_createDate));
        sb.append(dm).append(xfND(_createTime));
        sb.append(dm).append(xfND(_floorRefStockNum));
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
        if (_mShapeGrp != null)
        { sb.append(dm).append("mShapeGrp"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_bClassDtlByLimitDtManagFlg != null)
        { sb.append(dm).append("bClassDtlByLimitDtManagFlg"); }
        if (_bClassDtlByLimitDtReverseFlg != null)
        { sb.append(dm).append("bClassDtlByLimitDtReverseFlg"); }
        if (_bClassDtlByLotManagFlg != null)
        { sb.append(dm).append("bClassDtlByLotManagFlg"); }
        if (_bClassDtlByLotReverseFlg != null)
        { sb.append(dm).append("bClassDtlByLotReverseFlg"); }
        if (_bClassDtlByMergeCls != null)
        { sb.append(dm).append("bClassDtlByMergeCls"); }
        if (_bClassDtlByShippingStopFlg != null)
        { sb.append(dm).append("bClassDtlByShippingStopFlg"); }
        if (_bClassDtlByFreightCls != null)
        { sb.append(dm).append("bClassDtlByFreightCls"); }
        if (_bClassDtlByProdDtManagFlg != null)
        { sb.append(dm).append("bClassDtlByProdDtManagFlg"); }
        if (_bClassDtlByLogiSpecialTypeCd != null)
        { sb.append(dm).append("bClassDtlByLogiSpecialTypeCd"); }
        if (_bClassDtlByOcrDateFormat != null)
        { sb.append(dm).append("bClassDtlByOcrDateFormat"); }
        if (_bClassDtlByInsuranceFlg != null)
        { sb.append(dm).append("bClassDtlByInsuranceFlg"); }
        if (_bClassDtlByNoOkinawaFlightFlg != null)
        { sb.append(dm).append("bClassDtlByNoOkinawaFlightFlg"); }
        if (_bClassDtlByLogiAttentionTypeCd != null)
        { sb.append(dm).append("bClassDtlByLogiAttentionTypeCd"); }
        if (_bClassDtlByHeavyItemFlg != null)
        { sb.append(dm).append("bClassDtlByHeavyItemFlg"); }
        if (_bClassDtlByLargeItemFlg != null)
        { sb.append(dm).append("bClassDtlByLargeItemFlg"); }
        if (_mSetParentAsOne != null)
        { sb.append(dm).append("mSetParentAsOne"); }
        if (_hStockBookList != null && !_hStockBookList.isEmpty())
        { sb.append(dm).append("hStockBookList"); }
        if (_mDepositProductList != null && !_mDepositProductList.isEmpty())
        { sb.append(dm).append("mDepositProductList"); }
        if (_mLocationList != null && !_mLocationList.isEmpty())
        { sb.append(dm).append("mLocationList"); }
        if (_mLocationReplenishProductList != null && !_mLocationReplenishProductList.isEmpty())
        { sb.append(dm).append("mLocationReplenishProductList"); }
        if (_mProductShapeList != null && !_mProductShapeList.isEmpty())
        { sb.append(dm).append("mProductShapeList"); }
        if (_mSetStructureList != null && !_mSetStructureList.isEmpty())
        { sb.append(dm).append("mSetStructureList"); }
        if (_tAllocInstBList != null && !_tAllocInstBList.isEmpty())
        { sb.append(dm).append("tAllocInstBList"); }
        if (_tAllocLotList != null && !_tAllocLotList.isEmpty())
        { sb.append(dm).append("tAllocLotList"); }
        if (_tInventoryBList != null && !_tInventoryBList.isEmpty())
        { sb.append(dm).append("tInventoryBList"); }
        if (_tKeepingLotList != null && !_tKeepingLotList.isEmpty())
        { sb.append(dm).append("tKeepingLotList"); }
        if (_tLastLotList != null && !_tLastLotList.isEmpty())
        { sb.append(dm).append("tLastLotList"); }
        if (_tLotList != null && !_tLotList.isEmpty())
        { sb.append(dm).append("tLotList"); }
        if (_tMoveInstBList != null && !_tMoveInstBList.isEmpty())
        { sb.append(dm).append("tMoveInstBList"); }
        if (_tNizoroeAlarmLogList != null && !_tNizoroeAlarmLogList.isEmpty())
        { sb.append(dm).append("tNizoroeAlarmLogList"); }
        if (_tOperationLogList != null && !_tOperationLogList.isEmpty())
        { sb.append(dm).append("tOperationLogList"); }
        if (_tReceivePlanBList != null && !_tReceivePlanBList.isEmpty())
        { sb.append(dm).append("tReceivePlanBList"); }
        if (_tSerialNoList != null && !_tSerialNoList.isEmpty())
        { sb.append(dm).append("tSerialNoList"); }
        if (_tShippingInstBList != null && !_tShippingInstBList.isEmpty())
        { sb.append(dm).append("tShippingInstBList"); }
        if (_tStockList != null && !_tStockList.isEmpty())
        { sb.append(dm).append("tStockList"); }
        if (_tStockBookList != null && !_tStockBookList.isEmpty())
        { sb.append(dm).append("tStockBookList"); }
        if (_wHtInventoryInputProdList != null && !_wHtInventoryInputProdList.isEmpty())
        { sb.append(dm).append("wHtInventoryInputProdList"); }
        if (_wHtPickingList != null && !_wHtPickingList.isEmpty())
        { sb.append(dm).append("wHtPickingList"); }
        if (_wHtReceiveInspectionList != null && !_wHtReceiveInspectionList.isEmpty())
        { sb.append(dm).append("wHtReceiveInspectionList"); }
        if (_wHtReceiveNoPlanInspList != null && !_wHtReceiveNoPlanInspList.isEmpty())
        { sb.append(dm).append("wHtReceiveNoPlanInspList"); }
        if (_wHtReceiveStoreList != null && !_wHtReceiveStoreList.isEmpty())
        { sb.append(dm).append("wHtReceiveStoreList"); }
        if (_wHtShippingList != null && !_wHtShippingList.isEmpty())
        { sb.append(dm).append("wHtShippingList"); }
        if (_wHtShippingPickingList != null && !_wHtShippingPickingList.isEmpty())
        { sb.append(dm).append("wHtShippingPickingList"); }
        if (_wHtTotalPickingList != null && !_wHtTotalPickingList.isEmpty())
        { sb.append(dm).append("wHtTotalPickingList"); }
        if (_wSglRowShipInspHList != null && !_wSglRowShipInspHList.isEmpty())
        { sb.append(dm).append("wSglRowShipInspHList"); }
        if (_wShippingInterruptList != null && !_wShippingInterruptList.isEmpty())
        { sb.append(dm).append("wShippingInterruptList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MProduct clone() {
        return (MProduct)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {NotNull, VARCHAR(255)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {NotNull, VARCHAR(255)} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (basically NotNull if update: for the constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] PRODUCT_ABBR: {VARCHAR(60)} <br>
     * 商品略称
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductAbbr() {
        checkSpecifiedProperty("productAbbr");
        return convertEmptyToNull(_productAbbr);
    }

    /**
     * [set] PRODUCT_ABBR: {VARCHAR(60)} <br>
     * 商品略称
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductAbbr(String productAbbr) {
        registerModifiedProperty("productAbbr");
        _productAbbr = productAbbr;
    }

    /**
     * [get] JAN_CD: {IX, VARCHAR(30)} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {IX, VARCHAR(30)} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
    }

    /**
     * [get] LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @return The value of the column 'LOT_MANAG_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getLotManagFlg() {
        checkSpecifiedProperty("lotManagFlg");
        return convertEmptyToNull(_lotManagFlg);
    }

    /**
     * [set] LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @param lotManagFlg The value of the column 'LOT_MANAG_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setLotManagFlg(String lotManagFlg) {
        registerModifiedProperty("lotManagFlg");
        _lotManagFlg = lotManagFlg;
    }

    /**
     * [get] LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @return The value of the column 'LIMIT_DT_MANAG_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getLimitDtManagFlg() {
        checkSpecifiedProperty("limitDtManagFlg");
        return convertEmptyToNull(_limitDtManagFlg);
    }

    /**
     * [set] LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @param limitDtManagFlg The value of the column 'LIMIT_DT_MANAG_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setLimitDtManagFlg(String limitDtManagFlg) {
        registerModifiedProperty("limitDtManagFlg");
        _limitDtManagFlg = limitDtManagFlg;
    }

    /**
     * [get] RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]} <br>
     * 入荷期限日数
     * @return The value of the column 'RECEIVE_LIMIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceiveLimitNum() {
        checkSpecifiedProperty("receiveLimitNum");
        return _receiveLimitNum;
    }

    /**
     * [set] RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]} <br>
     * 入荷期限日数
     * @param receiveLimitNum The value of the column 'RECEIVE_LIMIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveLimitNum(Long receiveLimitNum) {
        registerModifiedProperty("receiveLimitNum");
        _receiveLimitNum = receiveLimitNum;
    }

    /**
     * [get] SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]} <br>
     * 出荷期限日数
     * @return The value of the column 'SHIPPING_LIMIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingLimitNum() {
        checkSpecifiedProperty("shippingLimitNum");
        return _shippingLimitNum;
    }

    /**
     * [set] SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]} <br>
     * 出荷期限日数
     * @param shippingLimitNum The value of the column 'SHIPPING_LIMIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingLimitNum(Long shippingLimitNum) {
        registerModifiedProperty("shippingLimitNum");
        _shippingLimitNum = shippingLimitNum;
    }

    /**
     * [get] MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @return The value of the column 'MERGE_CLS'. (basically NotNull if selected: for the constraint)
     */
    public String getMergeCls() {
        checkSpecifiedProperty("mergeCls");
        return convertEmptyToNull(_mergeCls);
    }

    /**
     * [set] MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param mergeCls The value of the column 'MERGE_CLS'. (basically NotNull if update: for the constraint)
     */
    public void setMergeCls(String mergeCls) {
        registerModifiedProperty("mergeCls");
        _mergeCls = mergeCls;
    }

    /**
     * [get] LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @return The value of the column 'LOT_REVERSE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotReverseFlg() {
        checkSpecifiedProperty("lotReverseFlg");
        return convertEmptyToNull(_lotReverseFlg);
    }

    /**
     * [set] LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param lotReverseFlg The value of the column 'LOT_REVERSE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotReverseFlg(String lotReverseFlg) {
        registerModifiedProperty("lotReverseFlg");
        _lotReverseFlg = lotReverseFlg;
    }

    /**
     * [get] LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @return The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDtReverseFlg() {
        checkSpecifiedProperty("limitDtReverseFlg");
        return convertEmptyToNull(_limitDtReverseFlg);
    }

    /**
     * [set] LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param limitDtReverseFlg The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDtReverseFlg(String limitDtReverseFlg) {
        registerModifiedProperty("limitDtReverseFlg");
        _limitDtReverseFlg = limitDtReverseFlg;
    }

    /**
     * [get] SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @return The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStopFlg() {
        checkSpecifiedProperty("shippingStopFlg");
        return convertEmptyToNull(_shippingStopFlg);
    }

    /**
     * [set] SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param shippingStopFlg The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStopFlg(String shippingStopFlg) {
        registerModifiedProperty("shippingStopFlg");
        _shippingStopFlg = shippingStopFlg;
    }

    /**
     * [get] FIXED_POINT: {DECIMAL(14, 4)} <br>
     * 定点
     * @return The value of the column 'FIXED_POINT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getFixedPoint() {
        checkSpecifiedProperty("fixedPoint");
        return _fixedPoint;
    }

    /**
     * [set] FIXED_POINT: {DECIMAL(14, 4)} <br>
     * 定点
     * @param fixedPoint The value of the column 'FIXED_POINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFixedPoint(java.math.BigDecimal fixedPoint) {
        registerModifiedProperty("fixedPoint");
        _fixedPoint = fixedPoint;
    }

    /**
     * [get] SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp} <br>
     * 荷姿グループID
     * @return The value of the column 'SHAPE_GRP_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShapeGrpId() {
        checkSpecifiedProperty("shapeGrpId");
        return _shapeGrpId;
    }

    /**
     * [set] SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp} <br>
     * 荷姿グループID
     * @param shapeGrpId The value of the column 'SHAPE_GRP_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShapeGrpId(Long shapeGrpId) {
        registerModifiedProperty("shapeGrpId");
        _shapeGrpId = shapeGrpId;
    }

    /**
     * [get] NMFC_CODE: {VARCHAR(30)} <br>
     * NMFC Code
     * @return The value of the column 'NMFC_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getNmfcCode() {
        checkSpecifiedProperty("nmfcCode");
        return convertEmptyToNull(_nmfcCode);
    }

    /**
     * [set] NMFC_CODE: {VARCHAR(30)} <br>
     * NMFC Code
     * @param nmfcCode The value of the column 'NMFC_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNmfcCode(String nmfcCode) {
        registerModifiedProperty("nmfcCode");
        _nmfcCode = nmfcCode;
    }

    /**
     * [get] FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * @return The value of the column 'FREIGHT_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getFreightCls() {
        checkSpecifiedProperty("freightCls");
        return convertEmptyToNull(_freightCls);
    }

    /**
     * [set] FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * @param freightCls The value of the column 'FREIGHT_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFreightCls(String freightCls) {
        registerModifiedProperty("freightCls");
        _freightCls = freightCls;
    }

    /**
     * [get] COUNNTRY_OF_ORIGIN: {VARCHAR(30)} <br>
     * Country of Origin
     * @return The value of the column 'COUNNTRY_OF_ORIGIN'. (NullAllowed even if selected: for no constraint)
     */
    public String getCounntryOfOrigin() {
        checkSpecifiedProperty("counntryOfOrigin");
        return convertEmptyToNull(_counntryOfOrigin);
    }

    /**
     * [set] COUNNTRY_OF_ORIGIN: {VARCHAR(30)} <br>
     * Country of Origin
     * @param counntryOfOrigin The value of the column 'COUNNTRY_OF_ORIGIN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCounntryOfOrigin(String counntryOfOrigin) {
        registerModifiedProperty("counntryOfOrigin");
        _counntryOfOrigin = counntryOfOrigin;
    }

    /**
     * [get] UNIT_VAL: {DECIMAL(14, 4)} <br>
     * Unit Value
     * @return The value of the column 'UNIT_VAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getUnitVal() {
        checkSpecifiedProperty("unitVal");
        return _unitVal;
    }

    /**
     * [set] UNIT_VAL: {DECIMAL(14, 4)} <br>
     * Unit Value
     * @param unitVal The value of the column 'UNIT_VAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitVal(java.math.BigDecimal unitVal) {
        registerModifiedProperty("unitVal");
        _unitVal = unitVal;
    }

    /**
     * [get] HTS_CD: {VARCHAR(30)} <br>
     * Harmonized Code
     * @return The value of the column 'HTS_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getHtsCd() {
        checkSpecifiedProperty("htsCd");
        return convertEmptyToNull(_htsCd);
    }

    /**
     * [set] HTS_CD: {VARCHAR(30)} <br>
     * Harmonized Code
     * @param htsCd The value of the column 'HTS_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHtsCd(String htsCd) {
        registerModifiedProperty("htsCd");
        _htsCd = htsCd;
    }

    /**
     * [get] PRODUCT_CATEGORY_CLS: {VARCHAR(30)} <br>
     * 品種区分
     * @return The value of the column 'PRODUCT_CATEGORY_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCategoryCls() {
        checkSpecifiedProperty("productCategoryCls");
        return convertEmptyToNull(_productCategoryCls);
    }

    /**
     * [set] PRODUCT_CATEGORY_CLS: {VARCHAR(30)} <br>
     * 品種区分
     * @param productCategoryCls The value of the column 'PRODUCT_CATEGORY_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCategoryCls(String productCategoryCls) {
        registerModifiedProperty("productCategoryCls");
        _productCategoryCls = productCategoryCls;
    }

    /**
     * [get] PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg} <br>
     * 製造日管理フラグ
     * @return The value of the column 'PROD_DT_MANAG_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getProdDtManagFlg() {
        checkSpecifiedProperty("prodDtManagFlg");
        return convertEmptyToNull(_prodDtManagFlg);
    }

    /**
     * [set] PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg} <br>
     * 製造日管理フラグ
     * @param prodDtManagFlg The value of the column 'PROD_DT_MANAG_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProdDtManagFlg(String prodDtManagFlg) {
        registerModifiedProperty("prodDtManagFlg");
        _prodDtManagFlg = prodDtManagFlg;
    }

    /**
     * [get] PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)} <br>
     * 入荷製造日限界日数
     * @return The value of the column 'PROD_DT_LIMIT_DAYS_RCV'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProdDtLimitDaysRcv() {
        checkSpecifiedProperty("prodDtLimitDaysRcv");
        return _prodDtLimitDaysRcv;
    }

    /**
     * [set] PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)} <br>
     * 入荷製造日限界日数
     * @param prodDtLimitDaysRcv The value of the column 'PROD_DT_LIMIT_DAYS_RCV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProdDtLimitDaysRcv(Long prodDtLimitDaysRcv) {
        registerModifiedProperty("prodDtLimitDaysRcv");
        _prodDtLimitDaysRcv = prodDtLimitDaysRcv;
    }

    /**
     * [get] PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)} <br>
     * 出荷製造日限界日数
     * @return The value of the column 'PROD_DT_LIMIT_DAYS_SHP'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProdDtLimitDaysShp() {
        checkSpecifiedProperty("prodDtLimitDaysShp");
        return _prodDtLimitDaysShp;
    }

    /**
     * [set] PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)} <br>
     * 出荷製造日限界日数
     * @param prodDtLimitDaysShp The value of the column 'PROD_DT_LIMIT_DAYS_SHP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProdDtLimitDaysShp(Long prodDtLimitDaysShp) {
        registerModifiedProperty("prodDtLimitDaysShp");
        _prodDtLimitDaysShp = prodDtLimitDaysShp;
    }

    /**
     * [get] SERIAL_MANAG_FLG: {CHAR(1)} <br>
     * シリアル管理フラグ
     * @return The value of the column 'SERIAL_MANAG_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSerialManagFlg() {
        checkSpecifiedProperty("serialManagFlg");
        return convertEmptyToNull(_serialManagFlg);
    }

    /**
     * [set] SERIAL_MANAG_FLG: {CHAR(1)} <br>
     * シリアル管理フラグ
     * @param serialManagFlg The value of the column 'SERIAL_MANAG_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSerialManagFlg(String serialManagFlg) {
        registerModifiedProperty("serialManagFlg");
        _serialManagFlg = serialManagFlg;
    }

    /**
     * [get] OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat} <br>
     * OCR日付形式
     * @return The value of the column 'OCR_DATE_FORMAT'. (NullAllowed even if selected: for no constraint)
     */
    public String getOcrDateFormat() {
        checkSpecifiedProperty("ocrDateFormat");
        return convertEmptyToNull(_ocrDateFormat);
    }

    /**
     * [set] OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat} <br>
     * OCR日付形式
     * @param ocrDateFormat The value of the column 'OCR_DATE_FORMAT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOcrDateFormat(String ocrDateFormat) {
        registerModifiedProperty("ocrDateFormat");
        _ocrDateFormat = ocrDateFormat;
    }

    /**
     * [get] INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg} <br>
     * 保険品フラグ
     * @return The value of the column 'INSURANCE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInsuranceFlg() {
        checkSpecifiedProperty("insuranceFlg");
        return convertEmptyToNull(_insuranceFlg);
    }

    /**
     * [set] INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg} <br>
     * 保険品フラグ
     * @param insuranceFlg The value of the column 'INSURANCE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInsuranceFlg(String insuranceFlg) {
        registerModifiedProperty("insuranceFlg");
        _insuranceFlg = insuranceFlg;
    }

    /**
     * [get] NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg} <br>
     * 沖縄航空便不可フラグ
     * @return The value of the column 'NO_OKINAWA_FLIGHT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getNoOkinawaFlightFlg() {
        checkSpecifiedProperty("noOkinawaFlightFlg");
        return convertEmptyToNull(_noOkinawaFlightFlg);
    }

    /**
     * [set] NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg} <br>
     * 沖縄航空便不可フラグ
     * @param noOkinawaFlightFlg The value of the column 'NO_OKINAWA_FLIGHT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNoOkinawaFlightFlg(String noOkinawaFlightFlg) {
        registerModifiedProperty("noOkinawaFlightFlg");
        _noOkinawaFlightFlg = noOkinawaFlightFlg;
    }

    /**
     * [get] HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg} <br>
     * 重量フラグ
     * @return The value of the column 'HEAVY_ITEM_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getHeavyItemFlg() {
        checkSpecifiedProperty("heavyItemFlg");
        return convertEmptyToNull(_heavyItemFlg);
    }

    /**
     * [set] HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg} <br>
     * 重量フラグ
     * @param heavyItemFlg The value of the column 'HEAVY_ITEM_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHeavyItemFlg(String heavyItemFlg) {
        registerModifiedProperty("heavyItemFlg");
        _heavyItemFlg = heavyItemFlg;
    }

    /**
     * [get] LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg} <br>
     * 大物フラグ
     * @return The value of the column 'LARGE_ITEM_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLargeItemFlg() {
        checkSpecifiedProperty("largeItemFlg");
        return convertEmptyToNull(_largeItemFlg);
    }

    /**
     * [set] LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg} <br>
     * 大物フラグ
     * @param largeItemFlg The value of the column 'LARGE_ITEM_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLargeItemFlg(String largeItemFlg) {
        registerModifiedProperty("largeItemFlg");
        _largeItemFlg = largeItemFlg;
    }

    /**
     * [get] HINMOKU_GROUP_CD: {VARCHAR(30)} <br>
     * 品目グループCD
     * @return The value of the column 'HINMOKU_GROUP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getHinmokuGroupCd() {
        checkSpecifiedProperty("hinmokuGroupCd");
        return convertEmptyToNull(_hinmokuGroupCd);
    }

    /**
     * [set] HINMOKU_GROUP_CD: {VARCHAR(30)} <br>
     * 品目グループCD
     * @param hinmokuGroupCd The value of the column 'HINMOKU_GROUP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHinmokuGroupCd(String hinmokuGroupCd) {
        registerModifiedProperty("hinmokuGroupCd");
        _hinmokuGroupCd = hinmokuGroupCd;
    }

    /**
     * [get] CASE_TYPE_CD: {VARCHAR(30)} <br>
     * ケース区分CD
     * @return The value of the column 'CASE_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseTypeCd() {
        checkSpecifiedProperty("caseTypeCd");
        return convertEmptyToNull(_caseTypeCd);
    }

    /**
     * [set] CASE_TYPE_CD: {VARCHAR(30)} <br>
     * ケース区分CD
     * @param caseTypeCd The value of the column 'CASE_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseTypeCd(String caseTypeCd) {
        registerModifiedProperty("caseTypeCd");
        _caseTypeCd = caseTypeCd;
    }

    /**
     * [get] EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)} <br>
     * 評価単価
     * @return The value of the column 'EVALUATION_UNIT_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getEvaluationUnitPrice() {
        checkSpecifiedProperty("evaluationUnitPrice");
        return _evaluationUnitPrice;
    }

    /**
     * [set] EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)} <br>
     * 評価単価
     * @param evaluationUnitPrice The value of the column 'EVALUATION_UNIT_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEvaluationUnitPrice(java.math.BigDecimal evaluationUnitPrice) {
        registerModifiedProperty("evaluationUnitPrice");
        _evaluationUnitPrice = evaluationUnitPrice;
    }

    /**
     * [get] LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd} <br>
     * 物流特殊区分CD
     * @return The value of the column 'LOGI_SPECIAL_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogiSpecialTypeCd() {
        checkSpecifiedProperty("logiSpecialTypeCd");
        return convertEmptyToNull(_logiSpecialTypeCd);
    }

    /**
     * [set] LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd} <br>
     * 物流特殊区分CD
     * @param logiSpecialTypeCd The value of the column 'LOGI_SPECIAL_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogiSpecialTypeCd(String logiSpecialTypeCd) {
        registerModifiedProperty("logiSpecialTypeCd");
        _logiSpecialTypeCd = logiSpecialTypeCd;
    }

    /**
     * [get] LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd} <br>
     * 物流注意区分CD
     * @return The value of the column 'LOGI_ATTENTION_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogiAttentionTypeCd() {
        checkSpecifiedProperty("logiAttentionTypeCd");
        return convertEmptyToNull(_logiAttentionTypeCd);
    }

    /**
     * [set] LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd} <br>
     * 物流注意区分CD
     * @param logiAttentionTypeCd The value of the column 'LOGI_ATTENTION_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogiAttentionTypeCd(String logiAttentionTypeCd) {
        registerModifiedProperty("logiAttentionTypeCd");
        _logiAttentionTypeCd = logiAttentionTypeCd;
    }

    /**
     * [get] UNIT_NM: {VARCHAR(30)} <br>
     * 単位名称
     * @return The value of the column 'UNIT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnitNm() {
        checkSpecifiedProperty("unitNm");
        return convertEmptyToNull(_unitNm);
    }

    /**
     * [set] UNIT_NM: {VARCHAR(30)} <br>
     * 単位名称
     * @param unitNm The value of the column 'UNIT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitNm(String unitNm) {
        registerModifiedProperty("unitNm");
        _unitNm = unitNm;
    }

    /**
     * [get] OLD_JAN_CD: {VARCHAR(30)} <br>
     * 旧JANCD
     * @return The value of the column 'OLD_JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOldJanCd() {
        checkSpecifiedProperty("oldJanCd");
        return convertEmptyToNull(_oldJanCd);
    }

    /**
     * [set] OLD_JAN_CD: {VARCHAR(30)} <br>
     * 旧JANCD
     * @param oldJanCd The value of the column 'OLD_JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOldJanCd(String oldJanCd) {
        registerModifiedProperty("oldJanCd");
        _oldJanCd = oldJanCd;
    }

    /**
     * [get] RECOMEND_LOCATION_CD: {VARCHAR(30)} <br>
     * 推奨ロケーションCD
     * @return The value of the column 'RECOMEND_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getRecomendLocationCd() {
        checkSpecifiedProperty("recomendLocationCd");
        return convertEmptyToNull(_recomendLocationCd);
    }

    /**
     * [set] RECOMEND_LOCATION_CD: {VARCHAR(30)} <br>
     * 推奨ロケーションCD
     * @param recomendLocationCd The value of the column 'RECOMEND_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRecomendLocationCd(String recomendLocationCd) {
        registerModifiedProperty("recomendLocationCd");
        _recomendLocationCd = recomendLocationCd;
    }

    /**
     * [get] RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)} <br>
     * 推奨ロケーション区分
     * @return The value of the column 'RECOMEND_LOCATION_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getRecomendLocationTypeCd() {
        checkSpecifiedProperty("recomendLocationTypeCd");
        return convertEmptyToNull(_recomendLocationTypeCd);
    }

    /**
     * [set] RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)} <br>
     * 推奨ロケーション区分
     * @param recomendLocationTypeCd The value of the column 'RECOMEND_LOCATION_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRecomendLocationTypeCd(String recomendLocationTypeCd) {
        registerModifiedProperty("recomendLocationTypeCd");
        _recomendLocationTypeCd = recomendLocationTypeCd;
    }

    /**
     * [get] INNER_JAN_CD: {VARCHAR(30)} <br>
     * インナーJANCD
     * @return The value of the column 'INNER_JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getInnerJanCd() {
        checkSpecifiedProperty("innerJanCd");
        return convertEmptyToNull(_innerJanCd);
    }

    /**
     * [set] INNER_JAN_CD: {VARCHAR(30)} <br>
     * インナーJANCD
     * @param innerJanCd The value of the column 'INNER_JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInnerJanCd(String innerJanCd) {
        registerModifiedProperty("innerJanCd");
        _innerJanCd = innerJanCd;
    }

    /**
     * [get] CREATE_DATE: {VARCHAR(8)} <br>
     * 作成日
     * @return The value of the column 'CREATE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCreateDate() {
        checkSpecifiedProperty("createDate");
        return convertEmptyToNull(_createDate);
    }

    /**
     * [set] CREATE_DATE: {VARCHAR(8)} <br>
     * 作成日
     * @param createDate The value of the column 'CREATE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreateDate(String createDate) {
        registerModifiedProperty("createDate");
        _createDate = createDate;
    }

    /**
     * [get] CREATE_TIME: {VARCHAR(6)} <br>
     * 作成時間
     * @return The value of the column 'CREATE_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCreateTime() {
        checkSpecifiedProperty("createTime");
        return convertEmptyToNull(_createTime);
    }

    /**
     * [set] CREATE_TIME: {VARCHAR(6)} <br>
     * 作成時間
     * @param createTime The value of the column 'CREATE_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreateTime(String createTime) {
        registerModifiedProperty("createTime");
        _createTime = createTime;
    }

    /**
     * [get] FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)} <br>
     * フロア基準在庫
     * @return The value of the column 'FLOOR_REF_STOCK_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getFloorRefStockNum() {
        checkSpecifiedProperty("floorRefStockNum");
        return _floorRefStockNum;
    }

    /**
     * [set] FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)} <br>
     * フロア基準在庫
     * @param floorRefStockNum The value of the column 'FLOOR_REF_STOCK_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFloorRefStockNum(java.math.BigDecimal floorRefStockNum) {
        registerModifiedProperty("floorRefStockNum");
        _floorRefStockNum = floorRefStockNum;
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
     * [get] DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
