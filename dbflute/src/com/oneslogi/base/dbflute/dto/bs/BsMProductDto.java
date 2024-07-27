package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of m_product as TABLE. <br>
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
 * [foreign-table]
 *     m_shape_grp, m_client, b_class_dtl(ByDelFlg), m_set_parent(AsOne)
 *
 * [referrer-table]
 *     h_stock_book, m_deposit_product, m_location, m_location_replenish_product, m_product_shape, m_set_structure, t_alloc_inst_b, t_alloc_lot, t_inventory_b, t_keeping_lot, t_last_lot, t_lot, t_move_inst_b, t_nizoroe_alarm_log, t_operation_log, t_receive_plan_b, t_serial_no, t_shipping_inst_b, t_stock, t_stock_book, w_ht_inventory_input_prod, w_ht_picking, w_ht_receive_inspection, w_ht_receive_no_plan_insp, w_ht_receive_store, w_ht_shipping, w_ht_shipping_picking, w_ht_total_picking, w_sgl_row_ship_insp_h, w_shipping_interrupt, m_set_parent
 *
 * [foreign-property]
 *     mShapeGrp, mClient, bClassDtlByDelFlg, bClassDtlByLimitDtManagFlg, bClassDtlByLimitDtReverseFlg, bClassDtlByLotManagFlg, bClassDtlByLotReverseFlg, bClassDtlByMergeCls, bClassDtlByShippingStopFlg, bClassDtlByFreightCls, bClassDtlByProdDtManagFlg, bClassDtlByLogiSpecialTypeCd, bClassDtlByOcrDateFormat, bClassDtlByInsuranceFlg, bClassDtlByNoOkinawaFlightFlg, bClassDtlByLogiAttentionTypeCd, bClassDtlByHeavyItemFlg, bClassDtlByLargeItemFlg, mSetParentAsOne
 *
 * [referrer-property]
 *     hStockBookList, mDepositProductList, mLocationList, mLocationReplenishProductList, mProductShapeList, mSetStructureList, tAllocInstBList, tAllocLotList, tInventoryBList, tKeepingLotList, tLastLotList, tLotList, tMoveInstBList, tNizoroeAlarmLogList, tOperationLogList, tReceivePlanBList, tSerialNoList, tShippingInstBList, tStockList, tStockBookList, wHtInventoryInputProdList, wHtPickingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtShippingList, wHtShippingPickingList, wHtTotalPickingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMProductDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _productId;

    /** CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client} */
    @JsonKey
    protected Long _clientId;

    /** PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {NotNull, VARCHAR(255)} */
    @JsonKey
    protected String _productNm;

    /** PRODUCT_ABBR: {VARCHAR(60)} */
    @JsonKey
    protected String _productAbbr;

    /** JAN_CD: {IX, VARCHAR(30)} */
    @JsonKey
    protected String _janCd;

    /** LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} */
    @JsonKey
    protected String _lotManagFlg;

    /** LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} */
    @JsonKey
    protected String _limitDtManagFlg;

    /** RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]} */
    @JsonKey
    protected Long _receiveLimitNum;

    /** SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]} */
    @JsonKey
    protected Long _shippingLimitNum;

    /** MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} */
    @JsonKey
    protected String _mergeCls;

    /** LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} */
    @JsonKey
    protected String _lotReverseFlg;

    /** LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} */
    @JsonKey
    protected String _limitDtReverseFlg;

    /** SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} */
    @JsonKey
    protected String _shippingStopFlg;

    /** FIXED_POINT: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _fixedPoint;

    /** SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp} */
    @JsonKey
    protected Long _shapeGrpId;

    /** NMFC_CODE: {VARCHAR(30)} */
    @JsonKey
    protected String _nmfcCode;

    /** FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls} */
    @JsonKey
    protected String _freightCls;

    /** COUNNTRY_OF_ORIGIN: {VARCHAR(30)} */
    @JsonKey
    protected String _counntryOfOrigin;

    /** UNIT_VAL: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _unitVal;

    /** HTS_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _htsCd;

    /** PRODUCT_CATEGORY_CLS: {VARCHAR(30)} */
    @JsonKey
    protected String _productCategoryCls;

    /** PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg} */
    @JsonKey
    protected String _prodDtManagFlg;

    /** PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)} */
    @JsonKey
    protected Long _prodDtLimitDaysRcv;

    /** PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)} */
    @JsonKey
    protected Long _prodDtLimitDaysShp;

    /** SERIAL_MANAG_FLG: {CHAR(1)} */
    @JsonKey
    protected String _serialManagFlg;

    /** OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat} */
    @JsonKey
    protected String _ocrDateFormat;

    /** INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg} */
    @JsonKey
    protected String _insuranceFlg;

    /** NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg} */
    @JsonKey
    protected String _noOkinawaFlightFlg;

    /** HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg} */
    @JsonKey
    protected String _heavyItemFlg;

    /** LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg} */
    @JsonKey
    protected String _largeItemFlg;

    /** HINMOKU_GROUP_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _hinmokuGroupCd;

    /** CASE_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _caseTypeCd;

    /** EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _evaluationUnitPrice;

    /** LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd} */
    @JsonKey
    protected String _logiSpecialTypeCd;

    /** LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd} */
    @JsonKey
    protected String _logiAttentionTypeCd;

    /** UNIT_NM: {VARCHAR(30)} */
    @JsonKey
    protected String _unitNm;

    /** OLD_JAN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _oldJanCd;

    /** RECOMEND_LOCATION_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _recomendLocationCd;

    /** RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _recomendLocationTypeCd;

    /** INNER_JAN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _innerJanCd;

    /** CREATE_DATE: {VARCHAR(8)} */
    @JsonKey
    protected String _createDate;

    /** CREATE_TIME: {VARCHAR(6)} */
    @JsonKey
    protected String _createTime;

    /** FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _floorRefStockNum;

    /** WM_SEND_FLG: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _wmSendFlg;

    /** LP_SEND_FLG: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _lpSendFlg;

    /** DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, BIGINT(19), default=[0]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {IX, BIGINT(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {VARCHAR(60)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {VARCHAR(255)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {VARCHAR(60)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {VARCHAR(255)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMProductDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected MShapeGrpDto _mShapeGrp;

    public MShapeGrpDto getMShapeGrp() {
        return _mShapeGrp;
    }

    public void setMShapeGrp(MShapeGrpDto mShapeGrp) {
        this._mShapeGrp = mShapeGrp;
    }

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected BClassDtlDto _bClassDtlByDelFlg;

    public BClassDtlDto getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    public void setBClassDtlByDelFlg(BClassDtlDto bClassDtlByDelFlg) {
        this._bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    protected BClassDtlDto _bClassDtlByLimitDtManagFlg;

    public BClassDtlDto getBClassDtlByLimitDtManagFlg() {
        return _bClassDtlByLimitDtManagFlg;
    }

    public void setBClassDtlByLimitDtManagFlg(BClassDtlDto bClassDtlByLimitDtManagFlg) {
        this._bClassDtlByLimitDtManagFlg = bClassDtlByLimitDtManagFlg;
    }

    protected BClassDtlDto _bClassDtlByLimitDtReverseFlg;

    public BClassDtlDto getBClassDtlByLimitDtReverseFlg() {
        return _bClassDtlByLimitDtReverseFlg;
    }

    public void setBClassDtlByLimitDtReverseFlg(BClassDtlDto bClassDtlByLimitDtReverseFlg) {
        this._bClassDtlByLimitDtReverseFlg = bClassDtlByLimitDtReverseFlg;
    }

    protected BClassDtlDto _bClassDtlByLotManagFlg;

    public BClassDtlDto getBClassDtlByLotManagFlg() {
        return _bClassDtlByLotManagFlg;
    }

    public void setBClassDtlByLotManagFlg(BClassDtlDto bClassDtlByLotManagFlg) {
        this._bClassDtlByLotManagFlg = bClassDtlByLotManagFlg;
    }

    protected BClassDtlDto _bClassDtlByLotReverseFlg;

    public BClassDtlDto getBClassDtlByLotReverseFlg() {
        return _bClassDtlByLotReverseFlg;
    }

    public void setBClassDtlByLotReverseFlg(BClassDtlDto bClassDtlByLotReverseFlg) {
        this._bClassDtlByLotReverseFlg = bClassDtlByLotReverseFlg;
    }

    protected BClassDtlDto _bClassDtlByMergeCls;

    public BClassDtlDto getBClassDtlByMergeCls() {
        return _bClassDtlByMergeCls;
    }

    public void setBClassDtlByMergeCls(BClassDtlDto bClassDtlByMergeCls) {
        this._bClassDtlByMergeCls = bClassDtlByMergeCls;
    }

    protected BClassDtlDto _bClassDtlByShippingStopFlg;

    public BClassDtlDto getBClassDtlByShippingStopFlg() {
        return _bClassDtlByShippingStopFlg;
    }

    public void setBClassDtlByShippingStopFlg(BClassDtlDto bClassDtlByShippingStopFlg) {
        this._bClassDtlByShippingStopFlg = bClassDtlByShippingStopFlg;
    }

    protected BClassDtlDto _bClassDtlByFreightCls;

    public BClassDtlDto getBClassDtlByFreightCls() {
        return _bClassDtlByFreightCls;
    }

    public void setBClassDtlByFreightCls(BClassDtlDto bClassDtlByFreightCls) {
        this._bClassDtlByFreightCls = bClassDtlByFreightCls;
    }

    protected BClassDtlDto _bClassDtlByProdDtManagFlg;

    public BClassDtlDto getBClassDtlByProdDtManagFlg() {
        return _bClassDtlByProdDtManagFlg;
    }

    public void setBClassDtlByProdDtManagFlg(BClassDtlDto bClassDtlByProdDtManagFlg) {
        this._bClassDtlByProdDtManagFlg = bClassDtlByProdDtManagFlg;
    }

    protected BClassDtlDto _bClassDtlByLogiSpecialTypeCd;

    public BClassDtlDto getBClassDtlByLogiSpecialTypeCd() {
        return _bClassDtlByLogiSpecialTypeCd;
    }

    public void setBClassDtlByLogiSpecialTypeCd(BClassDtlDto bClassDtlByLogiSpecialTypeCd) {
        this._bClassDtlByLogiSpecialTypeCd = bClassDtlByLogiSpecialTypeCd;
    }

    protected BClassDtlDto _bClassDtlByOcrDateFormat;

    public BClassDtlDto getBClassDtlByOcrDateFormat() {
        return _bClassDtlByOcrDateFormat;
    }

    public void setBClassDtlByOcrDateFormat(BClassDtlDto bClassDtlByOcrDateFormat) {
        this._bClassDtlByOcrDateFormat = bClassDtlByOcrDateFormat;
    }

    protected BClassDtlDto _bClassDtlByInsuranceFlg;

    public BClassDtlDto getBClassDtlByInsuranceFlg() {
        return _bClassDtlByInsuranceFlg;
    }

    public void setBClassDtlByInsuranceFlg(BClassDtlDto bClassDtlByInsuranceFlg) {
        this._bClassDtlByInsuranceFlg = bClassDtlByInsuranceFlg;
    }

    protected BClassDtlDto _bClassDtlByNoOkinawaFlightFlg;

    public BClassDtlDto getBClassDtlByNoOkinawaFlightFlg() {
        return _bClassDtlByNoOkinawaFlightFlg;
    }

    public void setBClassDtlByNoOkinawaFlightFlg(BClassDtlDto bClassDtlByNoOkinawaFlightFlg) {
        this._bClassDtlByNoOkinawaFlightFlg = bClassDtlByNoOkinawaFlightFlg;
    }

    protected BClassDtlDto _bClassDtlByLogiAttentionTypeCd;

    public BClassDtlDto getBClassDtlByLogiAttentionTypeCd() {
        return _bClassDtlByLogiAttentionTypeCd;
    }

    public void setBClassDtlByLogiAttentionTypeCd(BClassDtlDto bClassDtlByLogiAttentionTypeCd) {
        this._bClassDtlByLogiAttentionTypeCd = bClassDtlByLogiAttentionTypeCd;
    }

    protected BClassDtlDto _bClassDtlByHeavyItemFlg;

    public BClassDtlDto getBClassDtlByHeavyItemFlg() {
        return _bClassDtlByHeavyItemFlg;
    }

    public void setBClassDtlByHeavyItemFlg(BClassDtlDto bClassDtlByHeavyItemFlg) {
        this._bClassDtlByHeavyItemFlg = bClassDtlByHeavyItemFlg;
    }

    protected BClassDtlDto _bClassDtlByLargeItemFlg;

    public BClassDtlDto getBClassDtlByLargeItemFlg() {
        return _bClassDtlByLargeItemFlg;
    }

    public void setBClassDtlByLargeItemFlg(BClassDtlDto bClassDtlByLargeItemFlg) {
        this._bClassDtlByLargeItemFlg = bClassDtlByLargeItemFlg;
    }

    protected MSetParentDto _mSetParentAsOne;

    public MSetParentDto getMSetParentAsOne() {
        return _mSetParentAsOne;
    }

    public void setMSetParentAsOne(MSetParentDto MSetParentAsOne) {
        this._mSetParentAsOne = MSetParentAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<HStockBookDto> _hStockBookList;

    public List<HStockBookDto> getHStockBookList() {
        if (_hStockBookList == null) { _hStockBookList = new ArrayList<HStockBookDto>(); }
        return _hStockBookList;
    }

    public void setHStockBookList(List<HStockBookDto> hStockBookList) {
        this._hStockBookList = hStockBookList;
    }

    protected List<MDepositProductDto> _mDepositProductList;

    public List<MDepositProductDto> getMDepositProductList() {
        if (_mDepositProductList == null) { _mDepositProductList = new ArrayList<MDepositProductDto>(); }
        return _mDepositProductList;
    }

    public void setMDepositProductList(List<MDepositProductDto> mDepositProductList) {
        this._mDepositProductList = mDepositProductList;
    }

    protected List<MLocationDto> _mLocationList;

    public List<MLocationDto> getMLocationList() {
        if (_mLocationList == null) { _mLocationList = new ArrayList<MLocationDto>(); }
        return _mLocationList;
    }

    public void setMLocationList(List<MLocationDto> mLocationList) {
        this._mLocationList = mLocationList;
    }

    protected List<MLocationReplenishProductDto> _mLocationReplenishProductList;

    public List<MLocationReplenishProductDto> getMLocationReplenishProductList() {
        if (_mLocationReplenishProductList == null) { _mLocationReplenishProductList = new ArrayList<MLocationReplenishProductDto>(); }
        return _mLocationReplenishProductList;
    }

    public void setMLocationReplenishProductList(List<MLocationReplenishProductDto> mLocationReplenishProductList) {
        this._mLocationReplenishProductList = mLocationReplenishProductList;
    }

    protected List<MProductShapeDto> _mProductShapeList;

    public List<MProductShapeDto> getMProductShapeList() {
        if (_mProductShapeList == null) { _mProductShapeList = new ArrayList<MProductShapeDto>(); }
        return _mProductShapeList;
    }

    public void setMProductShapeList(List<MProductShapeDto> mProductShapeList) {
        this._mProductShapeList = mProductShapeList;
    }

    protected List<MSetStructureDto> _mSetStructureList;

    public List<MSetStructureDto> getMSetStructureList() {
        if (_mSetStructureList == null) { _mSetStructureList = new ArrayList<MSetStructureDto>(); }
        return _mSetStructureList;
    }

    public void setMSetStructureList(List<MSetStructureDto> mSetStructureList) {
        this._mSetStructureList = mSetStructureList;
    }

    protected List<TAllocInstBDto> _tAllocInstBList;

    public List<TAllocInstBDto> getTAllocInstBList() {
        if (_tAllocInstBList == null) { _tAllocInstBList = new ArrayList<TAllocInstBDto>(); }
        return _tAllocInstBList;
    }

    public void setTAllocInstBList(List<TAllocInstBDto> tAllocInstBList) {
        this._tAllocInstBList = tAllocInstBList;
    }

    protected List<TAllocLotDto> _tAllocLotList;

    public List<TAllocLotDto> getTAllocLotList() {
        if (_tAllocLotList == null) { _tAllocLotList = new ArrayList<TAllocLotDto>(); }
        return _tAllocLotList;
    }

    public void setTAllocLotList(List<TAllocLotDto> tAllocLotList) {
        this._tAllocLotList = tAllocLotList;
    }

    protected List<TInventoryBDto> _tInventoryBList;

    public List<TInventoryBDto> getTInventoryBList() {
        if (_tInventoryBList == null) { _tInventoryBList = new ArrayList<TInventoryBDto>(); }
        return _tInventoryBList;
    }

    public void setTInventoryBList(List<TInventoryBDto> tInventoryBList) {
        this._tInventoryBList = tInventoryBList;
    }

    protected List<TKeepingLotDto> _tKeepingLotList;

    public List<TKeepingLotDto> getTKeepingLotList() {
        if (_tKeepingLotList == null) { _tKeepingLotList = new ArrayList<TKeepingLotDto>(); }
        return _tKeepingLotList;
    }

    public void setTKeepingLotList(List<TKeepingLotDto> tKeepingLotList) {
        this._tKeepingLotList = tKeepingLotList;
    }

    protected List<TLastLotDto> _tLastLotList;

    public List<TLastLotDto> getTLastLotList() {
        if (_tLastLotList == null) { _tLastLotList = new ArrayList<TLastLotDto>(); }
        return _tLastLotList;
    }

    public void setTLastLotList(List<TLastLotDto> tLastLotList) {
        this._tLastLotList = tLastLotList;
    }

    protected List<TLotDto> _tLotList;

    public List<TLotDto> getTLotList() {
        if (_tLotList == null) { _tLotList = new ArrayList<TLotDto>(); }
        return _tLotList;
    }

    public void setTLotList(List<TLotDto> tLotList) {
        this._tLotList = tLotList;
    }

    protected List<TMoveInstBDto> _tMoveInstBList;

    public List<TMoveInstBDto> getTMoveInstBList() {
        if (_tMoveInstBList == null) { _tMoveInstBList = new ArrayList<TMoveInstBDto>(); }
        return _tMoveInstBList;
    }

    public void setTMoveInstBList(List<TMoveInstBDto> tMoveInstBList) {
        this._tMoveInstBList = tMoveInstBList;
    }

    protected List<TNizoroeAlarmLogDto> _tNizoroeAlarmLogList;

    public List<TNizoroeAlarmLogDto> getTNizoroeAlarmLogList() {
        if (_tNizoroeAlarmLogList == null) { _tNizoroeAlarmLogList = new ArrayList<TNizoroeAlarmLogDto>(); }
        return _tNizoroeAlarmLogList;
    }

    public void setTNizoroeAlarmLogList(List<TNizoroeAlarmLogDto> tNizoroeAlarmLogList) {
        this._tNizoroeAlarmLogList = tNizoroeAlarmLogList;
    }

    protected List<TOperationLogDto> _tOperationLogList;

    public List<TOperationLogDto> getTOperationLogList() {
        if (_tOperationLogList == null) { _tOperationLogList = new ArrayList<TOperationLogDto>(); }
        return _tOperationLogList;
    }

    public void setTOperationLogList(List<TOperationLogDto> tOperationLogList) {
        this._tOperationLogList = tOperationLogList;
    }

    protected List<TReceivePlanBDto> _tReceivePlanBList;

    public List<TReceivePlanBDto> getTReceivePlanBList() {
        if (_tReceivePlanBList == null) { _tReceivePlanBList = new ArrayList<TReceivePlanBDto>(); }
        return _tReceivePlanBList;
    }

    public void setTReceivePlanBList(List<TReceivePlanBDto> tReceivePlanBList) {
        this._tReceivePlanBList = tReceivePlanBList;
    }

    protected List<TSerialNoDto> _tSerialNoList;

    public List<TSerialNoDto> getTSerialNoList() {
        if (_tSerialNoList == null) { _tSerialNoList = new ArrayList<TSerialNoDto>(); }
        return _tSerialNoList;
    }

    public void setTSerialNoList(List<TSerialNoDto> tSerialNoList) {
        this._tSerialNoList = tSerialNoList;
    }

    protected List<TShippingInstBDto> _tShippingInstBList;

    public List<TShippingInstBDto> getTShippingInstBList() {
        if (_tShippingInstBList == null) { _tShippingInstBList = new ArrayList<TShippingInstBDto>(); }
        return _tShippingInstBList;
    }

    public void setTShippingInstBList(List<TShippingInstBDto> tShippingInstBList) {
        this._tShippingInstBList = tShippingInstBList;
    }

    protected List<TStockDto> _tStockList;

    public List<TStockDto> getTStockList() {
        if (_tStockList == null) { _tStockList = new ArrayList<TStockDto>(); }
        return _tStockList;
    }

    public void setTStockList(List<TStockDto> tStockList) {
        this._tStockList = tStockList;
    }

    protected List<TStockBookDto> _tStockBookList;

    public List<TStockBookDto> getTStockBookList() {
        if (_tStockBookList == null) { _tStockBookList = new ArrayList<TStockBookDto>(); }
        return _tStockBookList;
    }

    public void setTStockBookList(List<TStockBookDto> tStockBookList) {
        this._tStockBookList = tStockBookList;
    }

    protected List<WHtInventoryInputProdDto> _wHtInventoryInputProdList;

    public List<WHtInventoryInputProdDto> getWHtInventoryInputProdList() {
        if (_wHtInventoryInputProdList == null) { _wHtInventoryInputProdList = new ArrayList<WHtInventoryInputProdDto>(); }
        return _wHtInventoryInputProdList;
    }

    public void setWHtInventoryInputProdList(List<WHtInventoryInputProdDto> wHtInventoryInputProdList) {
        this._wHtInventoryInputProdList = wHtInventoryInputProdList;
    }

    protected List<WHtPickingDto> _wHtPickingList;

    public List<WHtPickingDto> getWHtPickingList() {
        if (_wHtPickingList == null) { _wHtPickingList = new ArrayList<WHtPickingDto>(); }
        return _wHtPickingList;
    }

    public void setWHtPickingList(List<WHtPickingDto> wHtPickingList) {
        this._wHtPickingList = wHtPickingList;
    }

    protected List<WHtReceiveInspectionDto> _wHtReceiveInspectionList;

    public List<WHtReceiveInspectionDto> getWHtReceiveInspectionList() {
        if (_wHtReceiveInspectionList == null) { _wHtReceiveInspectionList = new ArrayList<WHtReceiveInspectionDto>(); }
        return _wHtReceiveInspectionList;
    }

    public void setWHtReceiveInspectionList(List<WHtReceiveInspectionDto> wHtReceiveInspectionList) {
        this._wHtReceiveInspectionList = wHtReceiveInspectionList;
    }

    protected List<WHtReceiveNoPlanInspDto> _wHtReceiveNoPlanInspList;

    public List<WHtReceiveNoPlanInspDto> getWHtReceiveNoPlanInspList() {
        if (_wHtReceiveNoPlanInspList == null) { _wHtReceiveNoPlanInspList = new ArrayList<WHtReceiveNoPlanInspDto>(); }
        return _wHtReceiveNoPlanInspList;
    }

    public void setWHtReceiveNoPlanInspList(List<WHtReceiveNoPlanInspDto> wHtReceiveNoPlanInspList) {
        this._wHtReceiveNoPlanInspList = wHtReceiveNoPlanInspList;
    }

    protected List<WHtReceiveStoreDto> _wHtReceiveStoreList;

    public List<WHtReceiveStoreDto> getWHtReceiveStoreList() {
        if (_wHtReceiveStoreList == null) { _wHtReceiveStoreList = new ArrayList<WHtReceiveStoreDto>(); }
        return _wHtReceiveStoreList;
    }

    public void setWHtReceiveStoreList(List<WHtReceiveStoreDto> wHtReceiveStoreList) {
        this._wHtReceiveStoreList = wHtReceiveStoreList;
    }

    protected List<WHtShippingDto> _wHtShippingList;

    public List<WHtShippingDto> getWHtShippingList() {
        if (_wHtShippingList == null) { _wHtShippingList = new ArrayList<WHtShippingDto>(); }
        return _wHtShippingList;
    }

    public void setWHtShippingList(List<WHtShippingDto> wHtShippingList) {
        this._wHtShippingList = wHtShippingList;
    }

    protected List<WHtShippingPickingDto> _wHtShippingPickingList;

    public List<WHtShippingPickingDto> getWHtShippingPickingList() {
        if (_wHtShippingPickingList == null) { _wHtShippingPickingList = new ArrayList<WHtShippingPickingDto>(); }
        return _wHtShippingPickingList;
    }

    public void setWHtShippingPickingList(List<WHtShippingPickingDto> wHtShippingPickingList) {
        this._wHtShippingPickingList = wHtShippingPickingList;
    }

    protected List<WHtTotalPickingDto> _wHtTotalPickingList;

    public List<WHtTotalPickingDto> getWHtTotalPickingList() {
        if (_wHtTotalPickingList == null) { _wHtTotalPickingList = new ArrayList<WHtTotalPickingDto>(); }
        return _wHtTotalPickingList;
    }

    public void setWHtTotalPickingList(List<WHtTotalPickingDto> wHtTotalPickingList) {
        this._wHtTotalPickingList = wHtTotalPickingList;
    }

    protected List<WSglRowShipInspHDto> _wSglRowShipInspHList;

    public List<WSglRowShipInspHDto> getWSglRowShipInspHList() {
        if (_wSglRowShipInspHList == null) { _wSglRowShipInspHList = new ArrayList<WSglRowShipInspHDto>(); }
        return _wSglRowShipInspHList;
    }

    public void setWSglRowShipInspHList(List<WSglRowShipInspHDto> wSglRowShipInspHList) {
        this._wSglRowShipInspHList = wSglRowShipInspHList;
    }

    protected List<WShippingInterruptDto> _wShippingInterruptList;

    public List<WShippingInterruptDto> getWShippingInterruptList() {
        if (_wShippingInterruptList == null) { _wShippingInterruptList = new ArrayList<WShippingInterruptDto>(); }
        return _wShippingInterruptList;
    }

    public void setWShippingInterruptList(List<WShippingInterruptDto> wShippingInterruptList) {
        this._wShippingInterruptList = wShippingInterruptList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMProductDto)) { return false; }
        final BsMProductDto otherEntity = (BsMProductDto)other;
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "m_product");
        result = xCH(result, getProductId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getProductId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getProductAbbr());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getLotManagFlg());
        sb.append(c).append(getLimitDtManagFlg());
        sb.append(c).append(getReceiveLimitNum());
        sb.append(c).append(getShippingLimitNum());
        sb.append(c).append(getMergeCls());
        sb.append(c).append(getLotReverseFlg());
        sb.append(c).append(getLimitDtReverseFlg());
        sb.append(c).append(getShippingStopFlg());
        sb.append(c).append(getFixedPoint());
        sb.append(c).append(getShapeGrpId());
        sb.append(c).append(getNmfcCode());
        sb.append(c).append(getFreightCls());
        sb.append(c).append(getCounntryOfOrigin());
        sb.append(c).append(getUnitVal());
        sb.append(c).append(getHtsCd());
        sb.append(c).append(getProductCategoryCls());
        sb.append(c).append(getProdDtManagFlg());
        sb.append(c).append(getProdDtLimitDaysRcv());
        sb.append(c).append(getProdDtLimitDaysShp());
        sb.append(c).append(getSerialManagFlg());
        sb.append(c).append(getOcrDateFormat());
        sb.append(c).append(getInsuranceFlg());
        sb.append(c).append(getNoOkinawaFlightFlg());
        sb.append(c).append(getHeavyItemFlg());
        sb.append(c).append(getLargeItemFlg());
        sb.append(c).append(getHinmokuGroupCd());
        sb.append(c).append(getCaseTypeCd());
        sb.append(c).append(getEvaluationUnitPrice());
        sb.append(c).append(getLogiSpecialTypeCd());
        sb.append(c).append(getLogiAttentionTypeCd());
        sb.append(c).append(getUnitNm());
        sb.append(c).append(getOldJanCd());
        sb.append(c).append(getRecomendLocationCd());
        sb.append(c).append(getRecomendLocationTypeCd());
        sb.append(c).append(getInnerJanCd());
        sb.append(c).append(getCreateDate());
        sb.append(c).append(getCreateTime());
        sb.append(c).append(getFloorRefStockNum());
        sb.append(c).append(getWmSendFlg());
        sb.append(c).append(getLpSendFlg());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {NotNull, VARCHAR(255)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {NotNull, VARCHAR(255)} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] PRODUCT_ABBR: {VARCHAR(60)} <br>
     * 商品略称
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public String getProductAbbr() {
        return _productAbbr;
    }

    /**
     * [set] PRODUCT_ABBR: {VARCHAR(60)} <br>
     * 商品略称
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public void setProductAbbr(String productAbbr) {
        __modifiedProperties.add("productAbbr");
        this._productAbbr = productAbbr;
    }

    /**
     * [get] JAN_CD: {IX, VARCHAR(30)} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {IX, VARCHAR(30)} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
    }

    /**
     * [get] LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @return The value of the column 'LOT_MANAG_FLG'. (NullAllowed)
     */
    public String getLotManagFlg() {
        return _lotManagFlg;
    }

    /**
     * [set] LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @param lotManagFlg The value of the column 'LOT_MANAG_FLG'. (NullAllowed)
     */
    public void setLotManagFlg(String lotManagFlg) {
        __modifiedProperties.add("lotManagFlg");
        this._lotManagFlg = lotManagFlg;
    }

    /**
     * [get] LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @return The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed)
     */
    public String getLimitDtManagFlg() {
        return _limitDtManagFlg;
    }

    /**
     * [set] LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @param limitDtManagFlg The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed)
     */
    public void setLimitDtManagFlg(String limitDtManagFlg) {
        __modifiedProperties.add("limitDtManagFlg");
        this._limitDtManagFlg = limitDtManagFlg;
    }

    /**
     * [get] RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]} <br>
     * 入荷期限日数
     * @return The value of the column 'RECEIVE_LIMIT_NUM'. (NullAllowed)
     */
    public Long getReceiveLimitNum() {
        return _receiveLimitNum;
    }

    /**
     * [set] RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]} <br>
     * 入荷期限日数
     * @param receiveLimitNum The value of the column 'RECEIVE_LIMIT_NUM'. (NullAllowed)
     */
    public void setReceiveLimitNum(Long receiveLimitNum) {
        __modifiedProperties.add("receiveLimitNum");
        this._receiveLimitNum = receiveLimitNum;
    }

    /**
     * [get] SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]} <br>
     * 出荷期限日数
     * @return The value of the column 'SHIPPING_LIMIT_NUM'. (NullAllowed)
     */
    public Long getShippingLimitNum() {
        return _shippingLimitNum;
    }

    /**
     * [set] SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]} <br>
     * 出荷期限日数
     * @param shippingLimitNum The value of the column 'SHIPPING_LIMIT_NUM'. (NullAllowed)
     */
    public void setShippingLimitNum(Long shippingLimitNum) {
        __modifiedProperties.add("shippingLimitNum");
        this._shippingLimitNum = shippingLimitNum;
    }

    /**
     * [get] MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @return The value of the column 'MERGE_CLS'. (NullAllowed)
     */
    public String getMergeCls() {
        return _mergeCls;
    }

    /**
     * [set] MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param mergeCls The value of the column 'MERGE_CLS'. (NullAllowed)
     */
    public void setMergeCls(String mergeCls) {
        __modifiedProperties.add("mergeCls");
        this._mergeCls = mergeCls;
    }

    /**
     * [get] LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @return The value of the column 'LOT_REVERSE_FLG'. (NullAllowed)
     */
    public String getLotReverseFlg() {
        return _lotReverseFlg;
    }

    /**
     * [set] LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param lotReverseFlg The value of the column 'LOT_REVERSE_FLG'. (NullAllowed)
     */
    public void setLotReverseFlg(String lotReverseFlg) {
        __modifiedProperties.add("lotReverseFlg");
        this._lotReverseFlg = lotReverseFlg;
    }

    /**
     * [get] LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @return The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed)
     */
    public String getLimitDtReverseFlg() {
        return _limitDtReverseFlg;
    }

    /**
     * [set] LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param limitDtReverseFlg The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed)
     */
    public void setLimitDtReverseFlg(String limitDtReverseFlg) {
        __modifiedProperties.add("limitDtReverseFlg");
        this._limitDtReverseFlg = limitDtReverseFlg;
    }

    /**
     * [get] SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @return The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed)
     */
    public String getShippingStopFlg() {
        return _shippingStopFlg;
    }

    /**
     * [set] SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param shippingStopFlg The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed)
     */
    public void setShippingStopFlg(String shippingStopFlg) {
        __modifiedProperties.add("shippingStopFlg");
        this._shippingStopFlg = shippingStopFlg;
    }

    /**
     * [get] FIXED_POINT: {DECIMAL(14, 4)} <br>
     * 定点
     * @return The value of the column 'FIXED_POINT'. (NullAllowed)
     */
    public java.math.BigDecimal getFixedPoint() {
        return _fixedPoint;
    }

    /**
     * [set] FIXED_POINT: {DECIMAL(14, 4)} <br>
     * 定点
     * @param fixedPoint The value of the column 'FIXED_POINT'. (NullAllowed)
     */
    public void setFixedPoint(java.math.BigDecimal fixedPoint) {
        __modifiedProperties.add("fixedPoint");
        this._fixedPoint = fixedPoint;
    }

    /**
     * [get] SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp} <br>
     * 荷姿グループID
     * @return The value of the column 'SHAPE_GRP_ID'. (NullAllowed)
     */
    public Long getShapeGrpId() {
        return _shapeGrpId;
    }

    /**
     * [set] SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp} <br>
     * 荷姿グループID
     * @param shapeGrpId The value of the column 'SHAPE_GRP_ID'. (NullAllowed)
     */
    public void setShapeGrpId(Long shapeGrpId) {
        __modifiedProperties.add("shapeGrpId");
        this._shapeGrpId = shapeGrpId;
    }

    /**
     * [get] NMFC_CODE: {VARCHAR(30)} <br>
     * NMFC Code
     * @return The value of the column 'NMFC_CODE'. (NullAllowed)
     */
    public String getNmfcCode() {
        return _nmfcCode;
    }

    /**
     * [set] NMFC_CODE: {VARCHAR(30)} <br>
     * NMFC Code
     * @param nmfcCode The value of the column 'NMFC_CODE'. (NullAllowed)
     */
    public void setNmfcCode(String nmfcCode) {
        __modifiedProperties.add("nmfcCode");
        this._nmfcCode = nmfcCode;
    }

    /**
     * [get] FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * @return The value of the column 'FREIGHT_CLS'. (NullAllowed)
     */
    public String getFreightCls() {
        return _freightCls;
    }

    /**
     * [set] FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * @param freightCls The value of the column 'FREIGHT_CLS'. (NullAllowed)
     */
    public void setFreightCls(String freightCls) {
        __modifiedProperties.add("freightCls");
        this._freightCls = freightCls;
    }

    /**
     * [get] COUNNTRY_OF_ORIGIN: {VARCHAR(30)} <br>
     * Country of Origin
     * @return The value of the column 'COUNNTRY_OF_ORIGIN'. (NullAllowed)
     */
    public String getCounntryOfOrigin() {
        return _counntryOfOrigin;
    }

    /**
     * [set] COUNNTRY_OF_ORIGIN: {VARCHAR(30)} <br>
     * Country of Origin
     * @param counntryOfOrigin The value of the column 'COUNNTRY_OF_ORIGIN'. (NullAllowed)
     */
    public void setCounntryOfOrigin(String counntryOfOrigin) {
        __modifiedProperties.add("counntryOfOrigin");
        this._counntryOfOrigin = counntryOfOrigin;
    }

    /**
     * [get] UNIT_VAL: {DECIMAL(14, 4)} <br>
     * Unit Value
     * @return The value of the column 'UNIT_VAL'. (NullAllowed)
     */
    public java.math.BigDecimal getUnitVal() {
        return _unitVal;
    }

    /**
     * [set] UNIT_VAL: {DECIMAL(14, 4)} <br>
     * Unit Value
     * @param unitVal The value of the column 'UNIT_VAL'. (NullAllowed)
     */
    public void setUnitVal(java.math.BigDecimal unitVal) {
        __modifiedProperties.add("unitVal");
        this._unitVal = unitVal;
    }

    /**
     * [get] HTS_CD: {VARCHAR(30)} <br>
     * Harmonized Code
     * @return The value of the column 'HTS_CD'. (NullAllowed)
     */
    public String getHtsCd() {
        return _htsCd;
    }

    /**
     * [set] HTS_CD: {VARCHAR(30)} <br>
     * Harmonized Code
     * @param htsCd The value of the column 'HTS_CD'. (NullAllowed)
     */
    public void setHtsCd(String htsCd) {
        __modifiedProperties.add("htsCd");
        this._htsCd = htsCd;
    }

    /**
     * [get] PRODUCT_CATEGORY_CLS: {VARCHAR(30)} <br>
     * 品種区分
     * @return The value of the column 'PRODUCT_CATEGORY_CLS'. (NullAllowed)
     */
    public String getProductCategoryCls() {
        return _productCategoryCls;
    }

    /**
     * [set] PRODUCT_CATEGORY_CLS: {VARCHAR(30)} <br>
     * 品種区分
     * @param productCategoryCls The value of the column 'PRODUCT_CATEGORY_CLS'. (NullAllowed)
     */
    public void setProductCategoryCls(String productCategoryCls) {
        __modifiedProperties.add("productCategoryCls");
        this._productCategoryCls = productCategoryCls;
    }

    /**
     * [get] PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg} <br>
     * 製造日管理フラグ
     * @return The value of the column 'PROD_DT_MANAG_FLG'. (NullAllowed)
     */
    public String getProdDtManagFlg() {
        return _prodDtManagFlg;
    }

    /**
     * [set] PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg} <br>
     * 製造日管理フラグ
     * @param prodDtManagFlg The value of the column 'PROD_DT_MANAG_FLG'. (NullAllowed)
     */
    public void setProdDtManagFlg(String prodDtManagFlg) {
        __modifiedProperties.add("prodDtManagFlg");
        this._prodDtManagFlg = prodDtManagFlg;
    }

    /**
     * [get] PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)} <br>
     * 入荷製造日限界日数
     * @return The value of the column 'PROD_DT_LIMIT_DAYS_RCV'. (NullAllowed)
     */
    public Long getProdDtLimitDaysRcv() {
        return _prodDtLimitDaysRcv;
    }

    /**
     * [set] PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)} <br>
     * 入荷製造日限界日数
     * @param prodDtLimitDaysRcv The value of the column 'PROD_DT_LIMIT_DAYS_RCV'. (NullAllowed)
     */
    public void setProdDtLimitDaysRcv(Long prodDtLimitDaysRcv) {
        __modifiedProperties.add("prodDtLimitDaysRcv");
        this._prodDtLimitDaysRcv = prodDtLimitDaysRcv;
    }

    /**
     * [get] PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)} <br>
     * 出荷製造日限界日数
     * @return The value of the column 'PROD_DT_LIMIT_DAYS_SHP'. (NullAllowed)
     */
    public Long getProdDtLimitDaysShp() {
        return _prodDtLimitDaysShp;
    }

    /**
     * [set] PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)} <br>
     * 出荷製造日限界日数
     * @param prodDtLimitDaysShp The value of the column 'PROD_DT_LIMIT_DAYS_SHP'. (NullAllowed)
     */
    public void setProdDtLimitDaysShp(Long prodDtLimitDaysShp) {
        __modifiedProperties.add("prodDtLimitDaysShp");
        this._prodDtLimitDaysShp = prodDtLimitDaysShp;
    }

    /**
     * [get] SERIAL_MANAG_FLG: {CHAR(1)} <br>
     * シリアル管理フラグ
     * @return The value of the column 'SERIAL_MANAG_FLG'. (NullAllowed)
     */
    public String getSerialManagFlg() {
        return _serialManagFlg;
    }

    /**
     * [set] SERIAL_MANAG_FLG: {CHAR(1)} <br>
     * シリアル管理フラグ
     * @param serialManagFlg The value of the column 'SERIAL_MANAG_FLG'. (NullAllowed)
     */
    public void setSerialManagFlg(String serialManagFlg) {
        __modifiedProperties.add("serialManagFlg");
        this._serialManagFlg = serialManagFlg;
    }

    /**
     * [get] OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat} <br>
     * OCR日付形式
     * @return The value of the column 'OCR_DATE_FORMAT'. (NullAllowed)
     */
    public String getOcrDateFormat() {
        return _ocrDateFormat;
    }

    /**
     * [set] OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat} <br>
     * OCR日付形式
     * @param ocrDateFormat The value of the column 'OCR_DATE_FORMAT'. (NullAllowed)
     */
    public void setOcrDateFormat(String ocrDateFormat) {
        __modifiedProperties.add("ocrDateFormat");
        this._ocrDateFormat = ocrDateFormat;
    }

    /**
     * [get] INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg} <br>
     * 保険品フラグ
     * @return The value of the column 'INSURANCE_FLG'. (NullAllowed)
     */
    public String getInsuranceFlg() {
        return _insuranceFlg;
    }

    /**
     * [set] INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg} <br>
     * 保険品フラグ
     * @param insuranceFlg The value of the column 'INSURANCE_FLG'. (NullAllowed)
     */
    public void setInsuranceFlg(String insuranceFlg) {
        __modifiedProperties.add("insuranceFlg");
        this._insuranceFlg = insuranceFlg;
    }

    /**
     * [get] NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg} <br>
     * 沖縄航空便不可フラグ
     * @return The value of the column 'NO_OKINAWA_FLIGHT_FLG'. (NullAllowed)
     */
    public String getNoOkinawaFlightFlg() {
        return _noOkinawaFlightFlg;
    }

    /**
     * [set] NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg} <br>
     * 沖縄航空便不可フラグ
     * @param noOkinawaFlightFlg The value of the column 'NO_OKINAWA_FLIGHT_FLG'. (NullAllowed)
     */
    public void setNoOkinawaFlightFlg(String noOkinawaFlightFlg) {
        __modifiedProperties.add("noOkinawaFlightFlg");
        this._noOkinawaFlightFlg = noOkinawaFlightFlg;
    }

    /**
     * [get] HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg} <br>
     * 重量フラグ
     * @return The value of the column 'HEAVY_ITEM_FLG'. (NullAllowed)
     */
    public String getHeavyItemFlg() {
        return _heavyItemFlg;
    }

    /**
     * [set] HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg} <br>
     * 重量フラグ
     * @param heavyItemFlg The value of the column 'HEAVY_ITEM_FLG'. (NullAllowed)
     */
    public void setHeavyItemFlg(String heavyItemFlg) {
        __modifiedProperties.add("heavyItemFlg");
        this._heavyItemFlg = heavyItemFlg;
    }

    /**
     * [get] LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg} <br>
     * 大物フラグ
     * @return The value of the column 'LARGE_ITEM_FLG'. (NullAllowed)
     */
    public String getLargeItemFlg() {
        return _largeItemFlg;
    }

    /**
     * [set] LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg} <br>
     * 大物フラグ
     * @param largeItemFlg The value of the column 'LARGE_ITEM_FLG'. (NullAllowed)
     */
    public void setLargeItemFlg(String largeItemFlg) {
        __modifiedProperties.add("largeItemFlg");
        this._largeItemFlg = largeItemFlg;
    }

    /**
     * [get] HINMOKU_GROUP_CD: {VARCHAR(30)} <br>
     * 品目グループCD
     * @return The value of the column 'HINMOKU_GROUP_CD'. (NullAllowed)
     */
    public String getHinmokuGroupCd() {
        return _hinmokuGroupCd;
    }

    /**
     * [set] HINMOKU_GROUP_CD: {VARCHAR(30)} <br>
     * 品目グループCD
     * @param hinmokuGroupCd The value of the column 'HINMOKU_GROUP_CD'. (NullAllowed)
     */
    public void setHinmokuGroupCd(String hinmokuGroupCd) {
        __modifiedProperties.add("hinmokuGroupCd");
        this._hinmokuGroupCd = hinmokuGroupCd;
    }

    /**
     * [get] CASE_TYPE_CD: {VARCHAR(30)} <br>
     * ケース区分CD
     * @return The value of the column 'CASE_TYPE_CD'. (NullAllowed)
     */
    public String getCaseTypeCd() {
        return _caseTypeCd;
    }

    /**
     * [set] CASE_TYPE_CD: {VARCHAR(30)} <br>
     * ケース区分CD
     * @param caseTypeCd The value of the column 'CASE_TYPE_CD'. (NullAllowed)
     */
    public void setCaseTypeCd(String caseTypeCd) {
        __modifiedProperties.add("caseTypeCd");
        this._caseTypeCd = caseTypeCd;
    }

    /**
     * [get] EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)} <br>
     * 評価単価
     * @return The value of the column 'EVALUATION_UNIT_PRICE'. (NullAllowed)
     */
    public java.math.BigDecimal getEvaluationUnitPrice() {
        return _evaluationUnitPrice;
    }

    /**
     * [set] EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)} <br>
     * 評価単価
     * @param evaluationUnitPrice The value of the column 'EVALUATION_UNIT_PRICE'. (NullAllowed)
     */
    public void setEvaluationUnitPrice(java.math.BigDecimal evaluationUnitPrice) {
        __modifiedProperties.add("evaluationUnitPrice");
        this._evaluationUnitPrice = evaluationUnitPrice;
    }

    /**
     * [get] LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd} <br>
     * 物流特殊区分CD
     * @return The value of the column 'LOGI_SPECIAL_TYPE_CD'. (NullAllowed)
     */
    public String getLogiSpecialTypeCd() {
        return _logiSpecialTypeCd;
    }

    /**
     * [set] LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd} <br>
     * 物流特殊区分CD
     * @param logiSpecialTypeCd The value of the column 'LOGI_SPECIAL_TYPE_CD'. (NullAllowed)
     */
    public void setLogiSpecialTypeCd(String logiSpecialTypeCd) {
        __modifiedProperties.add("logiSpecialTypeCd");
        this._logiSpecialTypeCd = logiSpecialTypeCd;
    }

    /**
     * [get] LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd} <br>
     * 物流注意区分CD
     * @return The value of the column 'LOGI_ATTENTION_TYPE_CD'. (NullAllowed)
     */
    public String getLogiAttentionTypeCd() {
        return _logiAttentionTypeCd;
    }

    /**
     * [set] LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd} <br>
     * 物流注意区分CD
     * @param logiAttentionTypeCd The value of the column 'LOGI_ATTENTION_TYPE_CD'. (NullAllowed)
     */
    public void setLogiAttentionTypeCd(String logiAttentionTypeCd) {
        __modifiedProperties.add("logiAttentionTypeCd");
        this._logiAttentionTypeCd = logiAttentionTypeCd;
    }

    /**
     * [get] UNIT_NM: {VARCHAR(30)} <br>
     * 単位名称
     * @return The value of the column 'UNIT_NM'. (NullAllowed)
     */
    public String getUnitNm() {
        return _unitNm;
    }

    /**
     * [set] UNIT_NM: {VARCHAR(30)} <br>
     * 単位名称
     * @param unitNm The value of the column 'UNIT_NM'. (NullAllowed)
     */
    public void setUnitNm(String unitNm) {
        __modifiedProperties.add("unitNm");
        this._unitNm = unitNm;
    }

    /**
     * [get] OLD_JAN_CD: {VARCHAR(30)} <br>
     * 旧JANCD
     * @return The value of the column 'OLD_JAN_CD'. (NullAllowed)
     */
    public String getOldJanCd() {
        return _oldJanCd;
    }

    /**
     * [set] OLD_JAN_CD: {VARCHAR(30)} <br>
     * 旧JANCD
     * @param oldJanCd The value of the column 'OLD_JAN_CD'. (NullAllowed)
     */
    public void setOldJanCd(String oldJanCd) {
        __modifiedProperties.add("oldJanCd");
        this._oldJanCd = oldJanCd;
    }

    /**
     * [get] RECOMEND_LOCATION_CD: {VARCHAR(30)} <br>
     * 推奨ロケーションCD
     * @return The value of the column 'RECOMEND_LOCATION_CD'. (NullAllowed)
     */
    public String getRecomendLocationCd() {
        return _recomendLocationCd;
    }

    /**
     * [set] RECOMEND_LOCATION_CD: {VARCHAR(30)} <br>
     * 推奨ロケーションCD
     * @param recomendLocationCd The value of the column 'RECOMEND_LOCATION_CD'. (NullAllowed)
     */
    public void setRecomendLocationCd(String recomendLocationCd) {
        __modifiedProperties.add("recomendLocationCd");
        this._recomendLocationCd = recomendLocationCd;
    }

    /**
     * [get] RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)} <br>
     * 推奨ロケーション区分
     * @return The value of the column 'RECOMEND_LOCATION_TYPE_CD'. (NullAllowed)
     */
    public String getRecomendLocationTypeCd() {
        return _recomendLocationTypeCd;
    }

    /**
     * [set] RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)} <br>
     * 推奨ロケーション区分
     * @param recomendLocationTypeCd The value of the column 'RECOMEND_LOCATION_TYPE_CD'. (NullAllowed)
     */
    public void setRecomendLocationTypeCd(String recomendLocationTypeCd) {
        __modifiedProperties.add("recomendLocationTypeCd");
        this._recomendLocationTypeCd = recomendLocationTypeCd;
    }

    /**
     * [get] INNER_JAN_CD: {VARCHAR(30)} <br>
     * インナーJANCD
     * @return The value of the column 'INNER_JAN_CD'. (NullAllowed)
     */
    public String getInnerJanCd() {
        return _innerJanCd;
    }

    /**
     * [set] INNER_JAN_CD: {VARCHAR(30)} <br>
     * インナーJANCD
     * @param innerJanCd The value of the column 'INNER_JAN_CD'. (NullAllowed)
     */
    public void setInnerJanCd(String innerJanCd) {
        __modifiedProperties.add("innerJanCd");
        this._innerJanCd = innerJanCd;
    }

    /**
     * [get] CREATE_DATE: {VARCHAR(8)} <br>
     * 作成日
     * @return The value of the column 'CREATE_DATE'. (NullAllowed)
     */
    public String getCreateDate() {
        return _createDate;
    }

    /**
     * [set] CREATE_DATE: {VARCHAR(8)} <br>
     * 作成日
     * @param createDate The value of the column 'CREATE_DATE'. (NullAllowed)
     */
    public void setCreateDate(String createDate) {
        __modifiedProperties.add("createDate");
        this._createDate = createDate;
    }

    /**
     * [get] CREATE_TIME: {VARCHAR(6)} <br>
     * 作成時間
     * @return The value of the column 'CREATE_TIME'. (NullAllowed)
     */
    public String getCreateTime() {
        return _createTime;
    }

    /**
     * [set] CREATE_TIME: {VARCHAR(6)} <br>
     * 作成時間
     * @param createTime The value of the column 'CREATE_TIME'. (NullAllowed)
     */
    public void setCreateTime(String createTime) {
        __modifiedProperties.add("createTime");
        this._createTime = createTime;
    }

    /**
     * [get] FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)} <br>
     * フロア基準在庫
     * @return The value of the column 'FLOOR_REF_STOCK_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getFloorRefStockNum() {
        return _floorRefStockNum;
    }

    /**
     * [set] FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)} <br>
     * フロア基準在庫
     * @param floorRefStockNum The value of the column 'FLOOR_REF_STOCK_NUM'. (NullAllowed)
     */
    public void setFloorRefStockNum(java.math.BigDecimal floorRefStockNum) {
        __modifiedProperties.add("floorRefStockNum");
        this._floorRefStockNum = floorRefStockNum;
    }

    /**
     * [get] WM_SEND_FLG: {CHAR(1), default=[0]} <br>
     * WMS送信済フラグ
     * @return The value of the column 'WM_SEND_FLG'. (NullAllowed)
     */
    public String getWmSendFlg() {
        return _wmSendFlg;
    }

    /**
     * [set] WM_SEND_FLG: {CHAR(1), default=[0]} <br>
     * WMS送信済フラグ
     * @param wmSendFlg The value of the column 'WM_SEND_FLG'. (NullAllowed)
     */
    public void setWmSendFlg(String wmSendFlg) {
        __modifiedProperties.add("wmSendFlg");
        this._wmSendFlg = wmSendFlg;
    }

    /**
     * [get] LP_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 物流ポータル送信済フラグ
     * @return The value of the column 'LP_SEND_FLG'. (NullAllowed)
     */
    public String getLpSendFlg() {
        return _lpSendFlg;
    }

    /**
     * [set] LP_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 物流ポータル送信済フラグ
     * @param lpSendFlg The value of the column 'LP_SEND_FLG'. (NullAllowed)
     */
    public void setLpSendFlg(String lpSendFlg) {
        __modifiedProperties.add("lpSendFlg");
        this._lpSendFlg = lpSendFlg;
    }

    /**
     * [get] DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
