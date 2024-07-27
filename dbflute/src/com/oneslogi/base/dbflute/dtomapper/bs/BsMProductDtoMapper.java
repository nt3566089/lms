package com.oneslogi.base.dbflute.dtomapper.bs;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.InstanceKeyEntity;
import org.dbflute.dbmeta.dtomap.DtoMapper;
import org.dbflute.dbmeta.dtomap.InstanceKeyDto;
import org.dbflute.helper.beans.DfBeanDesc;
import org.dbflute.helper.beans.DfPropertyDesc;
import org.dbflute.helper.beans.factory.DfBeanDescFactory;
import org.dbflute.jdbc.Classification;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.dto.*;
import com.oneslogi.base.dbflute.dtomapper.*;

/**
 * The DTO mapper of m_product as TABLE. <br>
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
public abstract class BsMProductDtoMapper implements DtoMapper<MProduct, MProductDto>, Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final Map<Entity, Object> _relationDtoMap;
    protected final Map<Object, Entity> _relationEntityMap;
    protected boolean _exceptCommonColumn;
    protected boolean _reverseReference; // default: one-way reference
    protected boolean _instanceCache = true; // default: cached
    protected boolean _suppressMShapeGrp;
    protected boolean _suppressMClient;
    protected boolean _suppressBClassDtlByDelFlg;
    protected boolean _suppressBClassDtlByLimitDtManagFlg;
    protected boolean _suppressBClassDtlByLimitDtReverseFlg;
    protected boolean _suppressBClassDtlByLotManagFlg;
    protected boolean _suppressBClassDtlByLotReverseFlg;
    protected boolean _suppressBClassDtlByMergeCls;
    protected boolean _suppressBClassDtlByShippingStopFlg;
    protected boolean _suppressBClassDtlByFreightCls;
    protected boolean _suppressBClassDtlByProdDtManagFlg;
    protected boolean _suppressBClassDtlByLogiSpecialTypeCd;
    protected boolean _suppressBClassDtlByOcrDateFormat;
    protected boolean _suppressBClassDtlByInsuranceFlg;
    protected boolean _suppressBClassDtlByNoOkinawaFlightFlg;
    protected boolean _suppressBClassDtlByLogiAttentionTypeCd;
    protected boolean _suppressBClassDtlByHeavyItemFlg;
    protected boolean _suppressBClassDtlByLargeItemFlg;
    protected boolean _suppressHStockBookList;
    protected boolean _suppressMDepositProductList;
    protected boolean _suppressMLocationList;
    protected boolean _suppressMLocationReplenishProductList;
    protected boolean _suppressMProductShapeList;
    protected boolean _suppressMSetParentAsOne;
    protected boolean _suppressMSetStructureList;
    protected boolean _suppressTAllocInstBList;
    protected boolean _suppressTAllocLotList;
    protected boolean _suppressTInventoryBList;
    protected boolean _suppressTKeepingLotList;
    protected boolean _suppressTLastLotList;
    protected boolean _suppressTLotList;
    protected boolean _suppressTMoveInstBList;
    protected boolean _suppressTNizoroeAlarmLogList;
    protected boolean _suppressTOperationLogList;
    protected boolean _suppressTReceivePlanBList;
    protected boolean _suppressTSerialNoList;
    protected boolean _suppressTShippingInstBList;
    protected boolean _suppressTStockList;
    protected boolean _suppressTStockBookList;
    protected boolean _suppressWHtInventoryInputProdList;
    protected boolean _suppressWHtPickingList;
    protected boolean _suppressWHtReceiveInspectionList;
    protected boolean _suppressWHtReceiveNoPlanInspList;
    protected boolean _suppressWHtReceiveStoreList;
    protected boolean _suppressWHtShippingList;
    protected boolean _suppressWHtShippingPickingList;
    protected boolean _suppressWHtTotalPickingList;
    protected boolean _suppressWSglRowShipInspHList;
    protected boolean _suppressWShippingInterruptList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMProductDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMProductDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        _relationDtoMap = relationDtoMap;
        _relationEntityMap = relationEntityMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    // -----------------------------------------------------
    //                                                to DTO
    //                                                ------
    /**
     * {@inheritDoc}
     */
    public MProductDto mappingToDto(MProduct entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MProductDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MProductDto dto = new MProductDto();
        dto.setProductId(entity.getProductId());
        dto.setClientId(entity.getClientId());
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setProductAbbr(entity.getProductAbbr());
        dto.setJanCd(entity.getJanCd());
        dto.setLotManagFlg(entity.getLotManagFlg());
        dto.setLimitDtManagFlg(entity.getLimitDtManagFlg());
        dto.setReceiveLimitNum(entity.getReceiveLimitNum());
        dto.setShippingLimitNum(entity.getShippingLimitNum());
        dto.setMergeCls(entity.getMergeCls());
        dto.setLotReverseFlg(entity.getLotReverseFlg());
        dto.setLimitDtReverseFlg(entity.getLimitDtReverseFlg());
        dto.setShippingStopFlg(entity.getShippingStopFlg());
        dto.setFixedPoint(entity.getFixedPoint());
        dto.setShapeGrpId(entity.getShapeGrpId());
        dto.setNmfcCode(entity.getNmfcCode());
        dto.setFreightCls(entity.getFreightCls());
        dto.setCounntryOfOrigin(entity.getCounntryOfOrigin());
        dto.setUnitVal(entity.getUnitVal());
        dto.setHtsCd(entity.getHtsCd());
        dto.setProductCategoryCls(entity.getProductCategoryCls());
        dto.setProdDtManagFlg(entity.getProdDtManagFlg());
        dto.setProdDtLimitDaysRcv(entity.getProdDtLimitDaysRcv());
        dto.setProdDtLimitDaysShp(entity.getProdDtLimitDaysShp());
        dto.setSerialManagFlg(entity.getSerialManagFlg());
        dto.setOcrDateFormat(entity.getOcrDateFormat());
        dto.setInsuranceFlg(entity.getInsuranceFlg());
        dto.setNoOkinawaFlightFlg(entity.getNoOkinawaFlightFlg());
        dto.setHeavyItemFlg(entity.getHeavyItemFlg());
        dto.setLargeItemFlg(entity.getLargeItemFlg());
        dto.setHinmokuGroupCd(entity.getHinmokuGroupCd());
        dto.setCaseTypeCd(entity.getCaseTypeCd());
        dto.setEvaluationUnitPrice(entity.getEvaluationUnitPrice());
        dto.setLogiSpecialTypeCd(entity.getLogiSpecialTypeCd());
        dto.setLogiAttentionTypeCd(entity.getLogiAttentionTypeCd());
        dto.setUnitNm(entity.getUnitNm());
        dto.setOldJanCd(entity.getOldJanCd());
        dto.setRecomendLocationCd(entity.getRecomendLocationCd());
        dto.setRecomendLocationTypeCd(entity.getRecomendLocationTypeCd());
        dto.setInnerJanCd(entity.getInnerJanCd());
        dto.setCreateDate(entity.getCreateDate());
        dto.setCreateTime(entity.getCreateTime());
        dto.setFloorRefStockNum(entity.getFloorRefStockNum());
        dto.setWmSendFlg(entity.getWmSendFlg());
        dto.setLpSendFlg(entity.getLpSendFlg());
        if (!exceptCommonColumn) {
            dto.setDelFlg(entity.getDelFlg());
        }
        if (!exceptCommonColumn) {
            dto.setVersionNo(entity.getVersionNo());
        }
        if (!exceptCommonColumn) {
            dto.setControlNo(entity.getControlNo());
        }
        if (!exceptCommonColumn) {
            dto.setAddDt(entity.getAddDt());
        }
        if (!exceptCommonColumn) {
            dto.setAddUser(entity.getAddUser());
        }
        if (!exceptCommonColumn) {
            dto.setAddProcess(entity.getAddProcess());
        }
        if (!exceptCommonColumn) {
            dto.setUpdDt(entity.getUpdDt());
        }
        if (!exceptCommonColumn) {
            dto.setUpdUser(entity.getUpdUser());
        }
        if (!exceptCommonColumn) {
            dto.setUpdProcess(entity.getUpdProcess());
        }
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressMShapeGrp && entity.getMShapeGrp() != null) {
            MShapeGrp relationEntity = entity.getMShapeGrp();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MShapeGrpDto relationDto = (MShapeGrpDto)cachedDto;
                dto.setMShapeGrp(relationDto);
                if (reverseReference) {
                    relationDto.getMProductList().add(dto);
                }
            } else {
                MShapeGrpDtoMapper mapper = new MShapeGrpDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProductList();
                MShapeGrpDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMShapeGrp(relationDto);
                if (reverseReference) {
                    relationDto.getMProductList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMShapeGrp());
                }
            }
        };
        if (!_suppressMClient && entity.getMClient() != null) {
            MClient relationEntity = entity.getMClient();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MClientDto relationDto = (MClientDto)cachedDto;
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getMProductList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProductList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getMProductList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
                }
            }
        };
        if (!_suppressBClassDtlByDelFlg && entity.getBClassDtlByDelFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByDelFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByDelFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByDelFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByDelFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLimitDtManagFlg && entity.getBClassDtlByLimitDtManagFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLimitDtManagFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLimitDtManagFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLimitDtManagFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLimitDtManagFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLimitDtReverseFlg && entity.getBClassDtlByLimitDtReverseFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLimitDtReverseFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLimitDtReverseFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLimitDtReverseFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLimitDtReverseFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLotManagFlg && entity.getBClassDtlByLotManagFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLotManagFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLotManagFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLotManagFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLotManagFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLotReverseFlg && entity.getBClassDtlByLotReverseFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLotReverseFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLotReverseFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLotReverseFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLotReverseFlg());
                }
            }
        };
        if (!_suppressBClassDtlByMergeCls && entity.getBClassDtlByMergeCls() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByMergeCls();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByMergeCls(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByMergeCls(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByMergeCls());
                }
            }
        };
        if (!_suppressBClassDtlByShippingStopFlg && entity.getBClassDtlByShippingStopFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByShippingStopFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByShippingStopFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByShippingStopFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByShippingStopFlg());
                }
            }
        };
        if (!_suppressBClassDtlByFreightCls && entity.getBClassDtlByFreightCls() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByFreightCls();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByFreightCls(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByFreightCls(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByFreightCls());
                }
            }
        };
        if (!_suppressBClassDtlByProdDtManagFlg && entity.getBClassDtlByProdDtManagFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByProdDtManagFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByProdDtManagFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByProdDtManagFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByProdDtManagFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLogiSpecialTypeCd && entity.getBClassDtlByLogiSpecialTypeCd() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLogiSpecialTypeCd();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLogiSpecialTypeCd(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLogiSpecialTypeCd(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLogiSpecialTypeCd());
                }
            }
        };
        if (!_suppressBClassDtlByOcrDateFormat && entity.getBClassDtlByOcrDateFormat() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByOcrDateFormat();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByOcrDateFormat(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByOcrDateFormat(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByOcrDateFormat());
                }
            }
        };
        if (!_suppressBClassDtlByInsuranceFlg && entity.getBClassDtlByInsuranceFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByInsuranceFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByInsuranceFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByInsuranceFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByInsuranceFlg());
                }
            }
        };
        if (!_suppressBClassDtlByNoOkinawaFlightFlg && entity.getBClassDtlByNoOkinawaFlightFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByNoOkinawaFlightFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByNoOkinawaFlightFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByNoOkinawaFlightFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByNoOkinawaFlightFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLogiAttentionTypeCd && entity.getBClassDtlByLogiAttentionTypeCd() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLogiAttentionTypeCd();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLogiAttentionTypeCd(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLogiAttentionTypeCd(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLogiAttentionTypeCd());
                }
            }
        };
        if (!_suppressBClassDtlByHeavyItemFlg && entity.getBClassDtlByHeavyItemFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByHeavyItemFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByHeavyItemFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByHeavyItemFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByHeavyItemFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLargeItemFlg && entity.getBClassDtlByLargeItemFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLargeItemFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLargeItemFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLargeItemFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLargeItemFlg());
                }
            }
        };
        if (!_suppressHStockBookList && !entity.getHStockBookList().isEmpty()) {
            HStockBookDtoMapper mapper = new HStockBookDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<HStockBookDto> relationDtoList = mapper.mappingToDtoList(entity.getHStockBookList());
            dto.setHStockBookList(relationDtoList);
            if (reverseReference) {
                for (HStockBookDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressMDepositProductList && !entity.getMDepositProductList().isEmpty()) {
            MDepositProductDtoMapper mapper = new MDepositProductDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<MDepositProductDto> relationDtoList = mapper.mappingToDtoList(entity.getMDepositProductList());
            dto.setMDepositProductList(relationDtoList);
            if (reverseReference) {
                for (MDepositProductDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressMLocationList && !entity.getMLocationList().isEmpty()) {
            MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<MLocationDto> relationDtoList = mapper.mappingToDtoList(entity.getMLocationList());
            dto.setMLocationList(relationDtoList);
            if (reverseReference) {
                for (MLocationDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressMLocationReplenishProductList && !entity.getMLocationReplenishProductList().isEmpty()) {
            MLocationReplenishProductDtoMapper mapper = new MLocationReplenishProductDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<MLocationReplenishProductDto> relationDtoList = mapper.mappingToDtoList(entity.getMLocationReplenishProductList());
            dto.setMLocationReplenishProductList(relationDtoList);
            if (reverseReference) {
                for (MLocationReplenishProductDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressMProductShapeList && !entity.getMProductShapeList().isEmpty()) {
            MProductShapeDtoMapper mapper = new MProductShapeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<MProductShapeDto> relationDtoList = mapper.mappingToDtoList(entity.getMProductShapeList());
            dto.setMProductShapeList(relationDtoList);
            if (reverseReference) {
                for (MProductShapeDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressMSetParentAsOne && entity.getMSetParentAsOne() != null) {
            MSetParent relationEntity = entity.getMSetParentAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MSetParentDto relationDto = (MSetParentDto)cachedDto;
                dto.setMSetParentAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setMProduct(dto);
                }
            } else {
                MSetParentDtoMapper mapper = new MSetParentDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProduct();
                MSetParentDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMSetParentAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setMProduct(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMSetParentAsOne());
                }
            }
        };
        if (!_suppressMSetStructureList && !entity.getMSetStructureList().isEmpty()) {
            MSetStructureDtoMapper mapper = new MSetStructureDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<MSetStructureDto> relationDtoList = mapper.mappingToDtoList(entity.getMSetStructureList());
            dto.setMSetStructureList(relationDtoList);
            if (reverseReference) {
                for (MSetStructureDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTAllocInstBList && !entity.getTAllocInstBList().isEmpty()) {
            TAllocInstBDtoMapper mapper = new TAllocInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TAllocInstBDto> relationDtoList = mapper.mappingToDtoList(entity.getTAllocInstBList());
            dto.setTAllocInstBList(relationDtoList);
            if (reverseReference) {
                for (TAllocInstBDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTAllocLotList && !entity.getTAllocLotList().isEmpty()) {
            TAllocLotDtoMapper mapper = new TAllocLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TAllocLotDto> relationDtoList = mapper.mappingToDtoList(entity.getTAllocLotList());
            dto.setTAllocLotList(relationDtoList);
            if (reverseReference) {
                for (TAllocLotDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTInventoryBList && !entity.getTInventoryBList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TInventoryBDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryBList());
            dto.setTInventoryBList(relationDtoList);
            if (reverseReference) {
                for (TInventoryBDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTKeepingLotList && !entity.getTKeepingLotList().isEmpty()) {
            TKeepingLotDtoMapper mapper = new TKeepingLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TKeepingLotDto> relationDtoList = mapper.mappingToDtoList(entity.getTKeepingLotList());
            dto.setTKeepingLotList(relationDtoList);
            if (reverseReference) {
                for (TKeepingLotDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTLastLotList && !entity.getTLastLotList().isEmpty()) {
            TLastLotDtoMapper mapper = new TLastLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TLastLotDto> relationDtoList = mapper.mappingToDtoList(entity.getTLastLotList());
            dto.setTLastLotList(relationDtoList);
            if (reverseReference) {
                for (TLastLotDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTLotList && !entity.getTLotList().isEmpty()) {
            TLotDtoMapper mapper = new TLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TLotDto> relationDtoList = mapper.mappingToDtoList(entity.getTLotList());
            dto.setTLotList(relationDtoList);
            if (reverseReference) {
                for (TLotDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTMoveInstBList && !entity.getTMoveInstBList().isEmpty()) {
            TMoveInstBDtoMapper mapper = new TMoveInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TMoveInstBDto> relationDtoList = mapper.mappingToDtoList(entity.getTMoveInstBList());
            dto.setTMoveInstBList(relationDtoList);
            if (reverseReference) {
                for (TMoveInstBDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTNizoroeAlarmLogList && !entity.getTNizoroeAlarmLogList().isEmpty()) {
            TNizoroeAlarmLogDtoMapper mapper = new TNizoroeAlarmLogDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TNizoroeAlarmLogDto> relationDtoList = mapper.mappingToDtoList(entity.getTNizoroeAlarmLogList());
            dto.setTNizoroeAlarmLogList(relationDtoList);
            if (reverseReference) {
                for (TNizoroeAlarmLogDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTOperationLogList && !entity.getTOperationLogList().isEmpty()) {
            TOperationLogDtoMapper mapper = new TOperationLogDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TOperationLogDto> relationDtoList = mapper.mappingToDtoList(entity.getTOperationLogList());
            dto.setTOperationLogList(relationDtoList);
            if (reverseReference) {
                for (TOperationLogDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTReceivePlanBList && !entity.getTReceivePlanBList().isEmpty()) {
            TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TReceivePlanBDto> relationDtoList = mapper.mappingToDtoList(entity.getTReceivePlanBList());
            dto.setTReceivePlanBList(relationDtoList);
            if (reverseReference) {
                for (TReceivePlanBDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTSerialNoList && !entity.getTSerialNoList().isEmpty()) {
            TSerialNoDtoMapper mapper = new TSerialNoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TSerialNoDto> relationDtoList = mapper.mappingToDtoList(entity.getTSerialNoList());
            dto.setTSerialNoList(relationDtoList);
            if (reverseReference) {
                for (TSerialNoDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTShippingInstBList && !entity.getTShippingInstBList().isEmpty()) {
            TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TShippingInstBDto> relationDtoList = mapper.mappingToDtoList(entity.getTShippingInstBList());
            dto.setTShippingInstBList(relationDtoList);
            if (reverseReference) {
                for (TShippingInstBDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTStockList && !entity.getTStockList().isEmpty()) {
            TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TStockDto> relationDtoList = mapper.mappingToDtoList(entity.getTStockList());
            dto.setTStockList(relationDtoList);
            if (reverseReference) {
                for (TStockDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressTStockBookList && !entity.getTStockBookList().isEmpty()) {
            TStockBookDtoMapper mapper = new TStockBookDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TStockBookDto> relationDtoList = mapper.mappingToDtoList(entity.getTStockBookList());
            dto.setTStockBookList(relationDtoList);
            if (reverseReference) {
                for (TStockBookDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressWHtInventoryInputProdList && !entity.getWHtInventoryInputProdList().isEmpty()) {
            WHtInventoryInputProdDtoMapper mapper = new WHtInventoryInputProdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtInventoryInputProdDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtInventoryInputProdList());
            dto.setWHtInventoryInputProdList(relationDtoList);
            if (reverseReference) {
                for (WHtInventoryInputProdDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressWHtPickingList && !entity.getWHtPickingList().isEmpty()) {
            WHtPickingDtoMapper mapper = new WHtPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtPickingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtPickingList());
            dto.setWHtPickingList(relationDtoList);
            if (reverseReference) {
                for (WHtPickingDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressWHtReceiveInspectionList && !entity.getWHtReceiveInspectionList().isEmpty()) {
            WHtReceiveInspectionDtoMapper mapper = new WHtReceiveInspectionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtReceiveInspectionDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveInspectionList());
            dto.setWHtReceiveInspectionList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveInspectionDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressWHtReceiveNoPlanInspList && !entity.getWHtReceiveNoPlanInspList().isEmpty()) {
            WHtReceiveNoPlanInspDtoMapper mapper = new WHtReceiveNoPlanInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtReceiveNoPlanInspDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveNoPlanInspList());
            dto.setWHtReceiveNoPlanInspList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveNoPlanInspDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressWHtReceiveStoreList && !entity.getWHtReceiveStoreList().isEmpty()) {
            WHtReceiveStoreDtoMapper mapper = new WHtReceiveStoreDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtReceiveStoreDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveStoreList());
            dto.setWHtReceiveStoreList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveStoreDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressWHtShippingList && !entity.getWHtShippingList().isEmpty()) {
            WHtShippingDtoMapper mapper = new WHtShippingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtShippingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtShippingList());
            dto.setWHtShippingList(relationDtoList);
            if (reverseReference) {
                for (WHtShippingDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressWHtShippingPickingList && !entity.getWHtShippingPickingList().isEmpty()) {
            WHtShippingPickingDtoMapper mapper = new WHtShippingPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtShippingPickingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtShippingPickingList());
            dto.setWHtShippingPickingList(relationDtoList);
            if (reverseReference) {
                for (WHtShippingPickingDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressWHtTotalPickingList && !entity.getWHtTotalPickingList().isEmpty()) {
            WHtTotalPickingDtoMapper mapper = new WHtTotalPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtTotalPickingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtTotalPickingList());
            dto.setWHtTotalPickingList(relationDtoList);
            if (reverseReference) {
                for (WHtTotalPickingDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressWSglRowShipInspHList && !entity.getWSglRowShipInspHList().isEmpty()) {
            WSglRowShipInspHDtoMapper mapper = new WSglRowShipInspHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WSglRowShipInspHDto> relationDtoList = mapper.mappingToDtoList(entity.getWSglRowShipInspHList());
            dto.setWSglRowShipInspHList(relationDtoList);
            if (reverseReference) {
                for (WSglRowShipInspHDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        if (!_suppressWShippingInterruptList && !entity.getWShippingInterruptList().isEmpty()) {
            WShippingInterruptDtoMapper mapper = new WShippingInterruptDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WShippingInterruptDto> relationDtoList = mapper.mappingToDtoList(entity.getWShippingInterruptList());
            dto.setWShippingInterruptList(relationDtoList);
            if (reverseReference) {
                for (WShippingInterruptDto relationDto : relationDtoList) {
                    relationDto.setMProduct(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MProductDto> mappingToDtoList(List<MProduct> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MProductDto> dtoList = new ArrayList<MProductDto>();
        for (MProduct entity : entityList) {
            MProductDto dto = mappingToDto(entity);
            if (dto != null) {
                dtoList.add(dto);
            } else {
                if (isAcceptNullElementOnList()) {
                    dtoList.add(null);
                }
            }
        }
        return dtoList;
    }

    // -----------------------------------------------------
    //                                             to Entity
    //                                             ---------
    /**
     * {@inheritDoc}
     */
    public MProduct mappingToEntity(MProductDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MProduct)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MProduct entity = new MProduct();
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getProductAbbr(), "productAbbr")) {
            entity.setProductAbbr(dto.getProductAbbr());
        }
        if (needsMapping(dto, dto.getJanCd(), "janCd")) {
            entity.setJanCd(dto.getJanCd());
        }
        if (needsMapping(dto, dto.getLotManagFlg(), "lotManagFlg")) {
            entity.setLotManagFlgAsLotManagFlg(CDef.LotManagFlg.codeOf(dto.getLotManagFlg()));
        }
        if (needsMapping(dto, dto.getLimitDtManagFlg(), "limitDtManagFlg")) {
            entity.setLimitDtManagFlgAsLimitDtManagFlg(CDef.LimitDtManagFlg.codeOf(dto.getLimitDtManagFlg()));
        }
        if (needsMapping(dto, dto.getReceiveLimitNum(), "receiveLimitNum")) {
            entity.setReceiveLimitNum(dto.getReceiveLimitNum());
        }
        if (needsMapping(dto, dto.getShippingLimitNum(), "shippingLimitNum")) {
            entity.setShippingLimitNum(dto.getShippingLimitNum());
        }
        if (needsMapping(dto, dto.getMergeCls(), "mergeCls")) {
            entity.setMergeClsAsMergeCls(CDef.MergeCls.codeOf(dto.getMergeCls()));
        }
        if (needsMapping(dto, dto.getLotReverseFlg(), "lotReverseFlg")) {
            entity.setLotReverseFlgAsLotReverseFlg(CDef.LotReverseFlg.codeOf(dto.getLotReverseFlg()));
        }
        if (needsMapping(dto, dto.getLimitDtReverseFlg(), "limitDtReverseFlg")) {
            entity.setLimitDtReverseFlgAsLimitDtReverseFlg(CDef.LimitDtReverseFlg.codeOf(dto.getLimitDtReverseFlg()));
        }
        if (needsMapping(dto, dto.getShippingStopFlg(), "shippingStopFlg")) {
            entity.setShippingStopFlgAsShippingStopFlg(CDef.ShippingStopFlg.codeOf(dto.getShippingStopFlg()));
        }
        if (needsMapping(dto, dto.getFixedPoint(), "fixedPoint")) {
            entity.setFixedPoint(dto.getFixedPoint());
        }
        if (needsMapping(dto, dto.getShapeGrpId(), "shapeGrpId")) {
            entity.setShapeGrpId(dto.getShapeGrpId());
        }
        if (needsMapping(dto, dto.getNmfcCode(), "nmfcCode")) {
            entity.setNmfcCode(dto.getNmfcCode());
        }
        if (needsMapping(dto, dto.getFreightCls(), "freightCls")) {
            entity.setFreightClsAsFreightCls(CDef.FreightCls.codeOf(dto.getFreightCls()));
        }
        if (needsMapping(dto, dto.getCounntryOfOrigin(), "counntryOfOrigin")) {
            entity.setCounntryOfOrigin(dto.getCounntryOfOrigin());
        }
        if (needsMapping(dto, dto.getUnitVal(), "unitVal")) {
            entity.setUnitVal(dto.getUnitVal());
        }
        if (needsMapping(dto, dto.getHtsCd(), "htsCd")) {
            entity.setHtsCd(dto.getHtsCd());
        }
        if (needsMapping(dto, dto.getProductCategoryCls(), "productCategoryCls")) {
            entity.setProductCategoryCls(dto.getProductCategoryCls());
        }
        if (needsMapping(dto, dto.getProdDtManagFlg(), "prodDtManagFlg")) {
            entity.setProdDtManagFlgAsProdDtManagFlg(CDef.ProdDtManagFlg.codeOf(dto.getProdDtManagFlg()));
        }
        if (needsMapping(dto, dto.getProdDtLimitDaysRcv(), "prodDtLimitDaysRcv")) {
            entity.setProdDtLimitDaysRcv(dto.getProdDtLimitDaysRcv());
        }
        if (needsMapping(dto, dto.getProdDtLimitDaysShp(), "prodDtLimitDaysShp")) {
            entity.setProdDtLimitDaysShp(dto.getProdDtLimitDaysShp());
        }
        if (needsMapping(dto, dto.getSerialManagFlg(), "serialManagFlg")) {
            entity.setSerialManagFlg(dto.getSerialManagFlg());
        }
        if (needsMapping(dto, dto.getOcrDateFormat(), "ocrDateFormat")) {
            entity.setOcrDateFormatAsOcrDateFormat(CDef.OcrDateFormat.codeOf(dto.getOcrDateFormat()));
        }
        if (needsMapping(dto, dto.getInsuranceFlg(), "insuranceFlg")) {
            entity.setInsuranceFlgAsInsuranceFlg(CDef.InsuranceFlg.codeOf(dto.getInsuranceFlg()));
        }
        if (needsMapping(dto, dto.getNoOkinawaFlightFlg(), "noOkinawaFlightFlg")) {
            entity.setNoOkinawaFlightFlgAsNoOkinawaFlightFlg(CDef.NoOkinawaFlightFlg.codeOf(dto.getNoOkinawaFlightFlg()));
        }
        if (needsMapping(dto, dto.getHeavyItemFlg(), "heavyItemFlg")) {
            entity.setHeavyItemFlgAsHeavyItemFlg(CDef.HeavyItemFlg.codeOf(dto.getHeavyItemFlg()));
        }
        if (needsMapping(dto, dto.getLargeItemFlg(), "largeItemFlg")) {
            entity.setLargeItemFlgAsLargeItemFlg(CDef.LargeItemFlg.codeOf(dto.getLargeItemFlg()));
        }
        if (needsMapping(dto, dto.getHinmokuGroupCd(), "hinmokuGroupCd")) {
            entity.setHinmokuGroupCd(dto.getHinmokuGroupCd());
        }
        if (needsMapping(dto, dto.getCaseTypeCd(), "caseTypeCd")) {
            entity.setCaseTypeCd(dto.getCaseTypeCd());
        }
        if (needsMapping(dto, dto.getEvaluationUnitPrice(), "evaluationUnitPrice")) {
            entity.setEvaluationUnitPrice(dto.getEvaluationUnitPrice());
        }
        if (needsMapping(dto, dto.getLogiSpecialTypeCd(), "logiSpecialTypeCd")) {
            entity.setLogiSpecialTypeCdAsLogiSpecialTypeCd(CDef.LogiSpecialTypeCd.codeOf(dto.getLogiSpecialTypeCd()));
        }
        if (needsMapping(dto, dto.getLogiAttentionTypeCd(), "logiAttentionTypeCd")) {
            entity.setLogiAttentionTypeCdAsLogiAttentionTypeCd(CDef.LogiAttentionTypeCd.codeOf(dto.getLogiAttentionTypeCd()));
        }
        if (needsMapping(dto, dto.getUnitNm(), "unitNm")) {
            entity.setUnitNm(dto.getUnitNm());
        }
        if (needsMapping(dto, dto.getOldJanCd(), "oldJanCd")) {
            entity.setOldJanCd(dto.getOldJanCd());
        }
        if (needsMapping(dto, dto.getRecomendLocationCd(), "recomendLocationCd")) {
            entity.setRecomendLocationCd(dto.getRecomendLocationCd());
        }
        if (needsMapping(dto, dto.getRecomendLocationTypeCd(), "recomendLocationTypeCd")) {
            entity.setRecomendLocationTypeCd(dto.getRecomendLocationTypeCd());
        }
        if (needsMapping(dto, dto.getInnerJanCd(), "innerJanCd")) {
            entity.setInnerJanCd(dto.getInnerJanCd());
        }
        if (needsMapping(dto, dto.getCreateDate(), "createDate")) {
            entity.setCreateDate(dto.getCreateDate());
        }
        if (needsMapping(dto, dto.getCreateTime(), "createTime")) {
            entity.setCreateTime(dto.getCreateTime());
        }
        if (needsMapping(dto, dto.getFloorRefStockNum(), "floorRefStockNum")) {
            entity.setFloorRefStockNum(dto.getFloorRefStockNum());
        }
        if (needsMapping(dto, dto.getWmSendFlg(), "wmSendFlg")) {
            entity.setWmSendFlg(dto.getWmSendFlg());
        }
        if (needsMapping(dto, dto.getLpSendFlg(), "lpSendFlg")) {
            entity.setLpSendFlg(dto.getLpSendFlg());
        }
        if (needsMapping(dto, dto.getDelFlg(), "delFlg") && !exceptCommonColumn) {
            entity.setDelFlgAsDelFlg(CDef.DelFlg.codeOf(dto.getDelFlg()));
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo") && !exceptCommonColumn) {
            entity.setVersionNo(dto.getVersionNo());
        }
        if (needsMapping(dto, dto.getControlNo(), "controlNo") && !exceptCommonColumn) {
            entity.setControlNo(dto.getControlNo());
        }
        if (needsMapping(dto, dto.getAddDt(), "addDt") && !exceptCommonColumn) {
            entity.setAddDt(dto.getAddDt());
        }
        if (needsMapping(dto, dto.getAddUser(), "addUser") && !exceptCommonColumn) {
            entity.setAddUser(dto.getAddUser());
        }
        if (needsMapping(dto, dto.getAddProcess(), "addProcess") && !exceptCommonColumn) {
            entity.setAddProcess(dto.getAddProcess());
        }
        if (needsMapping(dto, dto.getUpdDt(), "updDt") && !exceptCommonColumn) {
            entity.setUpdDt(dto.getUpdDt());
        }
        if (needsMapping(dto, dto.getUpdUser(), "updUser") && !exceptCommonColumn) {
            entity.setUpdUser(dto.getUpdUser());
        }
        if (needsMapping(dto, dto.getUpdProcess(), "updProcess") && !exceptCommonColumn) {
            entity.setUpdProcess(dto.getUpdProcess());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressMShapeGrp && dto.getMShapeGrp() != null) {
            MShapeGrpDto relationDto = dto.getMShapeGrp();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MShapeGrp relationEntity = (MShapeGrp)cachedEntity;
                entity.setMShapeGrp(relationEntity);
                if (reverseReference) {
                    relationEntity.getMProductList().add(entity);
                }
            } else {
                MShapeGrpDtoMapper mapper = new MShapeGrpDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProductList();
                MShapeGrp relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMShapeGrp(relationEntity);
                if (reverseReference) {
                    relationEntity.getMProductList().add(entity);
                }
                if (instanceCache && entity.getMShapeGrp().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMShapeGrp());
                }
            }
        };
        if (!_suppressMClient && dto.getMClient() != null) {
            MClientDto relationDto = dto.getMClient();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MClient relationEntity = (MClient)cachedEntity;
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getMProductList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProductList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getMProductList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
                }
            }
        };
        if (!_suppressBClassDtlByDelFlg && dto.getBClassDtlByDelFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByDelFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByDelFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByDelFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByDelFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByDelFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLimitDtManagFlg && dto.getBClassDtlByLimitDtManagFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLimitDtManagFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLimitDtManagFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLimitDtManagFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLimitDtManagFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLimitDtManagFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLimitDtReverseFlg && dto.getBClassDtlByLimitDtReverseFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLimitDtReverseFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLimitDtReverseFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLimitDtReverseFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLimitDtReverseFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLimitDtReverseFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLotManagFlg && dto.getBClassDtlByLotManagFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLotManagFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLotManagFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLotManagFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLotManagFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLotManagFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLotReverseFlg && dto.getBClassDtlByLotReverseFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLotReverseFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLotReverseFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLotReverseFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLotReverseFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLotReverseFlg());
                }
            }
        };
        if (!_suppressBClassDtlByMergeCls && dto.getBClassDtlByMergeCls() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByMergeCls();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByMergeCls(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByMergeCls(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByMergeCls().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByMergeCls());
                }
            }
        };
        if (!_suppressBClassDtlByShippingStopFlg && dto.getBClassDtlByShippingStopFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByShippingStopFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByShippingStopFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByShippingStopFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByShippingStopFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByShippingStopFlg());
                }
            }
        };
        if (!_suppressBClassDtlByFreightCls && dto.getBClassDtlByFreightCls() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByFreightCls();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByFreightCls(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByFreightCls(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByFreightCls().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByFreightCls());
                }
            }
        };
        if (!_suppressBClassDtlByProdDtManagFlg && dto.getBClassDtlByProdDtManagFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByProdDtManagFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByProdDtManagFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByProdDtManagFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByProdDtManagFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByProdDtManagFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLogiSpecialTypeCd && dto.getBClassDtlByLogiSpecialTypeCd() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLogiSpecialTypeCd();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLogiSpecialTypeCd(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLogiSpecialTypeCd(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLogiSpecialTypeCd().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLogiSpecialTypeCd());
                }
            }
        };
        if (!_suppressBClassDtlByOcrDateFormat && dto.getBClassDtlByOcrDateFormat() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByOcrDateFormat();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByOcrDateFormat(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByOcrDateFormat(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByOcrDateFormat().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByOcrDateFormat());
                }
            }
        };
        if (!_suppressBClassDtlByInsuranceFlg && dto.getBClassDtlByInsuranceFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByInsuranceFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByInsuranceFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByInsuranceFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByInsuranceFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByInsuranceFlg());
                }
            }
        };
        if (!_suppressBClassDtlByNoOkinawaFlightFlg && dto.getBClassDtlByNoOkinawaFlightFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByNoOkinawaFlightFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByNoOkinawaFlightFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByNoOkinawaFlightFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByNoOkinawaFlightFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByNoOkinawaFlightFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLogiAttentionTypeCd && dto.getBClassDtlByLogiAttentionTypeCd() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLogiAttentionTypeCd();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLogiAttentionTypeCd(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLogiAttentionTypeCd(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLogiAttentionTypeCd().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLogiAttentionTypeCd());
                }
            }
        };
        if (!_suppressBClassDtlByHeavyItemFlg && dto.getBClassDtlByHeavyItemFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByHeavyItemFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByHeavyItemFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByHeavyItemFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByHeavyItemFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByHeavyItemFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLargeItemFlg && dto.getBClassDtlByLargeItemFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLargeItemFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLargeItemFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLargeItemFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLargeItemFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLargeItemFlg());
                }
            }
        };
        if (!_suppressHStockBookList && !dto.getHStockBookList().isEmpty()) {
            HStockBookDtoMapper mapper = new HStockBookDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<HStockBook> relationEntityList = mapper.mappingToEntityList(dto.getHStockBookList());
            entity.setHStockBookList(relationEntityList);
            if (reverseReference) {
                for (HStockBook relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressMDepositProductList && !dto.getMDepositProductList().isEmpty()) {
            MDepositProductDtoMapper mapper = new MDepositProductDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<MDepositProduct> relationEntityList = mapper.mappingToEntityList(dto.getMDepositProductList());
            entity.setMDepositProductList(relationEntityList);
            if (reverseReference) {
                for (MDepositProduct relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressMLocationList && !dto.getMLocationList().isEmpty()) {
            MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<MLocation> relationEntityList = mapper.mappingToEntityList(dto.getMLocationList());
            entity.setMLocationList(relationEntityList);
            if (reverseReference) {
                for (MLocation relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressMLocationReplenishProductList && !dto.getMLocationReplenishProductList().isEmpty()) {
            MLocationReplenishProductDtoMapper mapper = new MLocationReplenishProductDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<MLocationReplenishProduct> relationEntityList = mapper.mappingToEntityList(dto.getMLocationReplenishProductList());
            entity.setMLocationReplenishProductList(relationEntityList);
            if (reverseReference) {
                for (MLocationReplenishProduct relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressMProductShapeList && !dto.getMProductShapeList().isEmpty()) {
            MProductShapeDtoMapper mapper = new MProductShapeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<MProductShape> relationEntityList = mapper.mappingToEntityList(dto.getMProductShapeList());
            entity.setMProductShapeList(relationEntityList);
            if (reverseReference) {
                for (MProductShape relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressMSetParentAsOne && dto.getMSetParentAsOne() != null) {
            MSetParentDto relationDto = dto.getMSetParentAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MSetParent relationEntity = (MSetParent)cachedEntity;
                entity.setMSetParentAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setMProduct(entity);
                }
            } else {
                MSetParentDtoMapper mapper = new MSetParentDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProduct();
                MSetParent relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMSetParentAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setMProduct(entity);
                }
                if (instanceCache && entity.getMSetParentAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMSetParentAsOne());
                }
            }
        };
        if (!_suppressMSetStructureList && !dto.getMSetStructureList().isEmpty()) {
            MSetStructureDtoMapper mapper = new MSetStructureDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<MSetStructure> relationEntityList = mapper.mappingToEntityList(dto.getMSetStructureList());
            entity.setMSetStructureList(relationEntityList);
            if (reverseReference) {
                for (MSetStructure relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTAllocInstBList && !dto.getTAllocInstBList().isEmpty()) {
            TAllocInstBDtoMapper mapper = new TAllocInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TAllocInstB> relationEntityList = mapper.mappingToEntityList(dto.getTAllocInstBList());
            entity.setTAllocInstBList(relationEntityList);
            if (reverseReference) {
                for (TAllocInstB relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTAllocLotList && !dto.getTAllocLotList().isEmpty()) {
            TAllocLotDtoMapper mapper = new TAllocLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TAllocLot> relationEntityList = mapper.mappingToEntityList(dto.getTAllocLotList());
            entity.setTAllocLotList(relationEntityList);
            if (reverseReference) {
                for (TAllocLot relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTInventoryBList && !dto.getTInventoryBList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TInventoryB> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryBList());
            entity.setTInventoryBList(relationEntityList);
            if (reverseReference) {
                for (TInventoryB relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTKeepingLotList && !dto.getTKeepingLotList().isEmpty()) {
            TKeepingLotDtoMapper mapper = new TKeepingLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TKeepingLot> relationEntityList = mapper.mappingToEntityList(dto.getTKeepingLotList());
            entity.setTKeepingLotList(relationEntityList);
            if (reverseReference) {
                for (TKeepingLot relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTLastLotList && !dto.getTLastLotList().isEmpty()) {
            TLastLotDtoMapper mapper = new TLastLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TLastLot> relationEntityList = mapper.mappingToEntityList(dto.getTLastLotList());
            entity.setTLastLotList(relationEntityList);
            if (reverseReference) {
                for (TLastLot relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTLotList && !dto.getTLotList().isEmpty()) {
            TLotDtoMapper mapper = new TLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TLot> relationEntityList = mapper.mappingToEntityList(dto.getTLotList());
            entity.setTLotList(relationEntityList);
            if (reverseReference) {
                for (TLot relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTMoveInstBList && !dto.getTMoveInstBList().isEmpty()) {
            TMoveInstBDtoMapper mapper = new TMoveInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TMoveInstB> relationEntityList = mapper.mappingToEntityList(dto.getTMoveInstBList());
            entity.setTMoveInstBList(relationEntityList);
            if (reverseReference) {
                for (TMoveInstB relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTNizoroeAlarmLogList && !dto.getTNizoroeAlarmLogList().isEmpty()) {
            TNizoroeAlarmLogDtoMapper mapper = new TNizoroeAlarmLogDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TNizoroeAlarmLog> relationEntityList = mapper.mappingToEntityList(dto.getTNizoroeAlarmLogList());
            entity.setTNizoroeAlarmLogList(relationEntityList);
            if (reverseReference) {
                for (TNizoroeAlarmLog relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTOperationLogList && !dto.getTOperationLogList().isEmpty()) {
            TOperationLogDtoMapper mapper = new TOperationLogDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TOperationLog> relationEntityList = mapper.mappingToEntityList(dto.getTOperationLogList());
            entity.setTOperationLogList(relationEntityList);
            if (reverseReference) {
                for (TOperationLog relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTReceivePlanBList && !dto.getTReceivePlanBList().isEmpty()) {
            TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TReceivePlanB> relationEntityList = mapper.mappingToEntityList(dto.getTReceivePlanBList());
            entity.setTReceivePlanBList(relationEntityList);
            if (reverseReference) {
                for (TReceivePlanB relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTSerialNoList && !dto.getTSerialNoList().isEmpty()) {
            TSerialNoDtoMapper mapper = new TSerialNoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TSerialNo> relationEntityList = mapper.mappingToEntityList(dto.getTSerialNoList());
            entity.setTSerialNoList(relationEntityList);
            if (reverseReference) {
                for (TSerialNo relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTShippingInstBList && !dto.getTShippingInstBList().isEmpty()) {
            TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TShippingInstB> relationEntityList = mapper.mappingToEntityList(dto.getTShippingInstBList());
            entity.setTShippingInstBList(relationEntityList);
            if (reverseReference) {
                for (TShippingInstB relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTStockList && !dto.getTStockList().isEmpty()) {
            TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TStock> relationEntityList = mapper.mappingToEntityList(dto.getTStockList());
            entity.setTStockList(relationEntityList);
            if (reverseReference) {
                for (TStock relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressTStockBookList && !dto.getTStockBookList().isEmpty()) {
            TStockBookDtoMapper mapper = new TStockBookDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<TStockBook> relationEntityList = mapper.mappingToEntityList(dto.getTStockBookList());
            entity.setTStockBookList(relationEntityList);
            if (reverseReference) {
                for (TStockBook relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressWHtInventoryInputProdList && !dto.getWHtInventoryInputProdList().isEmpty()) {
            WHtInventoryInputProdDtoMapper mapper = new WHtInventoryInputProdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtInventoryInputProd> relationEntityList = mapper.mappingToEntityList(dto.getWHtInventoryInputProdList());
            entity.setWHtInventoryInputProdList(relationEntityList);
            if (reverseReference) {
                for (WHtInventoryInputProd relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressWHtPickingList && !dto.getWHtPickingList().isEmpty()) {
            WHtPickingDtoMapper mapper = new WHtPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtPicking> relationEntityList = mapper.mappingToEntityList(dto.getWHtPickingList());
            entity.setWHtPickingList(relationEntityList);
            if (reverseReference) {
                for (WHtPicking relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressWHtReceiveInspectionList && !dto.getWHtReceiveInspectionList().isEmpty()) {
            WHtReceiveInspectionDtoMapper mapper = new WHtReceiveInspectionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtReceiveInspection> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveInspectionList());
            entity.setWHtReceiveInspectionList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveInspection relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressWHtReceiveNoPlanInspList && !dto.getWHtReceiveNoPlanInspList().isEmpty()) {
            WHtReceiveNoPlanInspDtoMapper mapper = new WHtReceiveNoPlanInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtReceiveNoPlanInsp> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveNoPlanInspList());
            entity.setWHtReceiveNoPlanInspList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveNoPlanInsp relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressWHtReceiveStoreList && !dto.getWHtReceiveStoreList().isEmpty()) {
            WHtReceiveStoreDtoMapper mapper = new WHtReceiveStoreDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtReceiveStore> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveStoreList());
            entity.setWHtReceiveStoreList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveStore relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressWHtShippingList && !dto.getWHtShippingList().isEmpty()) {
            WHtShippingDtoMapper mapper = new WHtShippingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtShipping> relationEntityList = mapper.mappingToEntityList(dto.getWHtShippingList());
            entity.setWHtShippingList(relationEntityList);
            if (reverseReference) {
                for (WHtShipping relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressWHtShippingPickingList && !dto.getWHtShippingPickingList().isEmpty()) {
            WHtShippingPickingDtoMapper mapper = new WHtShippingPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtShippingPicking> relationEntityList = mapper.mappingToEntityList(dto.getWHtShippingPickingList());
            entity.setWHtShippingPickingList(relationEntityList);
            if (reverseReference) {
                for (WHtShippingPicking relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressWHtTotalPickingList && !dto.getWHtTotalPickingList().isEmpty()) {
            WHtTotalPickingDtoMapper mapper = new WHtTotalPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WHtTotalPicking> relationEntityList = mapper.mappingToEntityList(dto.getWHtTotalPickingList());
            entity.setWHtTotalPickingList(relationEntityList);
            if (reverseReference) {
                for (WHtTotalPicking relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressWSglRowShipInspHList && !dto.getWSglRowShipInspHList().isEmpty()) {
            WSglRowShipInspHDtoMapper mapper = new WSglRowShipInspHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WSglRowShipInspH> relationEntityList = mapper.mappingToEntityList(dto.getWSglRowShipInspHList());
            entity.setWSglRowShipInspHList(relationEntityList);
            if (reverseReference) {
                for (WSglRowShipInspH relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        if (!_suppressWShippingInterruptList && !dto.getWShippingInterruptList().isEmpty()) {
            WShippingInterruptDtoMapper mapper = new WShippingInterruptDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProduct();
            List<WShippingInterrupt> relationEntityList = mapper.mappingToEntityList(dto.getWShippingInterruptList());
            entity.setWShippingInterruptList(relationEntityList);
            if (reverseReference) {
                for (WShippingInterrupt relationEntity : relationEntityList) {
                    relationEntity.setMProduct(entity);
                }
            }
        };
        return entity;
    }

    /**
     * Does the property need to be mapped to an entity? <br>
     * If modified info of DTO has at least one property, only modified properties are mapped.
     * And if no property is modified, all properties are mapped (but the other option exists).
     * @param dto The instance of DTO. (NotNull)
     * @param value The value of DTO's property. (NotNull)
     * @param propName The property name of DTO. (NotNull)
     * @return The determination, true or false.
     */
    protected boolean needsMapping(MProductDto dto, Object value, String propName) {
        Set<String> modifiedProperties = dto.mymodifiedProperties();
        if (modifiedProperties.isEmpty()) {
            return isMappingToEntityContainsNull() || value != null;
        }
        return modifiedProperties.contains(propName);
    }

    /**
     * Does the mapping to an entity contain null values? (when no property is modified) <br>
     * Default is true that means a setter is called if the value is null.
     * But this method is valid only when no property is modified.
     * @return The determination, true or false.
     */
    protected boolean isMappingToEntityContainsNull() { // for extension
        return true; // as default
    }

    /**
     * {@inheritDoc}
     */
    public List<MProduct> mappingToEntityList(List<MProductDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MProduct> entityList = new ArrayList<MProduct>();
        for (MProductDto dto : dtoList) {
            MProduct entity = mappingToEntity(dto);
            if (entity != null) {
                entityList.add(entity);
            } else {
                if (isAcceptNullElementOnList()) {
                    entityList.add(null);
                }
            }
        }
        return entityList;
    }

    protected boolean isAcceptNullElementOnList() {
        return true; // as default
    }

    // -----------------------------------------------------
    //                                          Instance Key
    //                                          ------------
    protected Object createInstanceKeyDto(final Object dto, final int instanceHash) {
        return new InstanceKeyDto(dto, instanceHash);
    }

    protected InstanceKeyEntity createInstanceKeyEntity(Entity entity) {
        return new InstanceKeyEntity(entity);
    }

    public void disableInstanceCache() { // internal option
        _instanceCache = false;
    }

    // -----------------------------------------------------
    //                                      Derived Property
    //                                      ----------------
    protected void reflectDerivedProperty(Entity entity, Object dto, boolean toDto) {
        DfBeanDesc entityDesc = DfBeanDescFactory.getBeanDesc(entity.getClass());
        DfBeanDesc dtoDesc = DfBeanDescFactory.getBeanDesc(dto.getClass());
        DBMeta dbmeta = entity.asDBMeta();
        for (String propertyName : entityDesc.getProppertyNameList()) {
            if (isOutOfDerivedPropertyName(entity, dto, toDto, dbmeta, entityDesc, dtoDesc, propertyName)) {
                continue;
            }
            DfPropertyDesc entityProp = entityDesc.getPropertyDesc(propertyName);
            Class<?> propertyType = entityProp.getPropertyType();
            if (isOutOfDerivedPropertyType(entity, dto, toDto, propertyName, propertyType)) {
                continue;
            }
            if (entityProp.isReadable() && entityProp.isWritable()) {
                DfPropertyDesc dtoProp = dtoDesc.getPropertyDesc(propertyName);
                if (dtoProp.isReadable() && dtoProp.isWritable()) {
                    if (toDto) {
                        dtoProp.setValue(dto, entityProp.getValue(entity));
                    } else {
                        entityProp.setValue(entity, dtoProp.getValue(dto));
                    }
                }
            }
        }
    }

    protected boolean isOutOfDerivedPropertyName(Entity entity, Object dto, boolean toDto
                                               , DBMeta dbmeta, DfBeanDesc entityDesc, DfBeanDesc dtoDesc
                                               , String propertyName) {
        return dbmeta.hasColumn(propertyName)
                    || dbmeta.hasForeign(propertyName) || dbmeta.hasReferrer(propertyName)
                    || !dtoDesc.hasPropertyDesc(propertyName);
    }

    protected boolean isOutOfDerivedPropertyType(Entity entity, Object dto, boolean toDto
                                               , String propertyName, Class<?> propertyType) {
        return List.class.isAssignableFrom(propertyType)
                || Entity.class.isAssignableFrom(propertyType)
                || Classification.class.isAssignableFrom(propertyType);
    }

    // ===================================================================================
    //                                                                   Suppress Relation
    //                                                                   =================
    // (basically) to suppress infinity loop
    public void suppressMShapeGrp() {
        _suppressMShapeGrp = true;
    }
    public void suppressMClient() {
        _suppressMClient = true;
    }
    public void suppressBClassDtlByDelFlg() {
        _suppressBClassDtlByDelFlg = true;
    }
    public void suppressBClassDtlByLimitDtManagFlg() {
        _suppressBClassDtlByLimitDtManagFlg = true;
    }
    public void suppressBClassDtlByLimitDtReverseFlg() {
        _suppressBClassDtlByLimitDtReverseFlg = true;
    }
    public void suppressBClassDtlByLotManagFlg() {
        _suppressBClassDtlByLotManagFlg = true;
    }
    public void suppressBClassDtlByLotReverseFlg() {
        _suppressBClassDtlByLotReverseFlg = true;
    }
    public void suppressBClassDtlByMergeCls() {
        _suppressBClassDtlByMergeCls = true;
    }
    public void suppressBClassDtlByShippingStopFlg() {
        _suppressBClassDtlByShippingStopFlg = true;
    }
    public void suppressBClassDtlByFreightCls() {
        _suppressBClassDtlByFreightCls = true;
    }
    public void suppressBClassDtlByProdDtManagFlg() {
        _suppressBClassDtlByProdDtManagFlg = true;
    }
    public void suppressBClassDtlByLogiSpecialTypeCd() {
        _suppressBClassDtlByLogiSpecialTypeCd = true;
    }
    public void suppressBClassDtlByOcrDateFormat() {
        _suppressBClassDtlByOcrDateFormat = true;
    }
    public void suppressBClassDtlByInsuranceFlg() {
        _suppressBClassDtlByInsuranceFlg = true;
    }
    public void suppressBClassDtlByNoOkinawaFlightFlg() {
        _suppressBClassDtlByNoOkinawaFlightFlg = true;
    }
    public void suppressBClassDtlByLogiAttentionTypeCd() {
        _suppressBClassDtlByLogiAttentionTypeCd = true;
    }
    public void suppressBClassDtlByHeavyItemFlg() {
        _suppressBClassDtlByHeavyItemFlg = true;
    }
    public void suppressBClassDtlByLargeItemFlg() {
        _suppressBClassDtlByLargeItemFlg = true;
    }
    public void suppressHStockBookList() {
        _suppressHStockBookList = true;
    }
    public void suppressMDepositProductList() {
        _suppressMDepositProductList = true;
    }
    public void suppressMLocationList() {
        _suppressMLocationList = true;
    }
    public void suppressMLocationReplenishProductList() {
        _suppressMLocationReplenishProductList = true;
    }
    public void suppressMProductShapeList() {
        _suppressMProductShapeList = true;
    }
    public void suppressMSetParentAsOne() {
        _suppressMSetParentAsOne = true;
    }
    public void suppressMSetStructureList() {
        _suppressMSetStructureList = true;
    }
    public void suppressTAllocInstBList() {
        _suppressTAllocInstBList = true;
    }
    public void suppressTAllocLotList() {
        _suppressTAllocLotList = true;
    }
    public void suppressTInventoryBList() {
        _suppressTInventoryBList = true;
    }
    public void suppressTKeepingLotList() {
        _suppressTKeepingLotList = true;
    }
    public void suppressTLastLotList() {
        _suppressTLastLotList = true;
    }
    public void suppressTLotList() {
        _suppressTLotList = true;
    }
    public void suppressTMoveInstBList() {
        _suppressTMoveInstBList = true;
    }
    public void suppressTNizoroeAlarmLogList() {
        _suppressTNizoroeAlarmLogList = true;
    }
    public void suppressTOperationLogList() {
        _suppressTOperationLogList = true;
    }
    public void suppressTReceivePlanBList() {
        _suppressTReceivePlanBList = true;
    }
    public void suppressTSerialNoList() {
        _suppressTSerialNoList = true;
    }
    public void suppressTShippingInstBList() {
        _suppressTShippingInstBList = true;
    }
    public void suppressTStockList() {
        _suppressTStockList = true;
    }
    public void suppressTStockBookList() {
        _suppressTStockBookList = true;
    }
    public void suppressWHtInventoryInputProdList() {
        _suppressWHtInventoryInputProdList = true;
    }
    public void suppressWHtPickingList() {
        _suppressWHtPickingList = true;
    }
    public void suppressWHtReceiveInspectionList() {
        _suppressWHtReceiveInspectionList = true;
    }
    public void suppressWHtReceiveNoPlanInspList() {
        _suppressWHtReceiveNoPlanInspList = true;
    }
    public void suppressWHtReceiveStoreList() {
        _suppressWHtReceiveStoreList = true;
    }
    public void suppressWHtShippingList() {
        _suppressWHtShippingList = true;
    }
    public void suppressWHtShippingPickingList() {
        _suppressWHtShippingPickingList = true;
    }
    public void suppressWHtTotalPickingList() {
        _suppressWHtTotalPickingList = true;
    }
    public void suppressWSglRowShipInspHList() {
        _suppressWSglRowShipInspHList = true;
    }
    public void suppressWShippingInterruptList() {
        _suppressWShippingInterruptList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMShapeGrp();
        suppressMClient();
        suppressBClassDtlByDelFlg();
        suppressBClassDtlByLimitDtManagFlg();
        suppressBClassDtlByLimitDtReverseFlg();
        suppressBClassDtlByLotManagFlg();
        suppressBClassDtlByLotReverseFlg();
        suppressBClassDtlByMergeCls();
        suppressBClassDtlByShippingStopFlg();
        suppressBClassDtlByFreightCls();
        suppressBClassDtlByProdDtManagFlg();
        suppressBClassDtlByLogiSpecialTypeCd();
        suppressBClassDtlByOcrDateFormat();
        suppressBClassDtlByInsuranceFlg();
        suppressBClassDtlByNoOkinawaFlightFlg();
        suppressBClassDtlByLogiAttentionTypeCd();
        suppressBClassDtlByHeavyItemFlg();
        suppressBClassDtlByLargeItemFlg();
        suppressHStockBookList();
        suppressMDepositProductList();
        suppressMLocationList();
        suppressMLocationReplenishProductList();
        suppressMProductShapeList();
        suppressMSetParentAsOne();
        suppressMSetStructureList();
        suppressTAllocInstBList();
        suppressTAllocLotList();
        suppressTInventoryBList();
        suppressTKeepingLotList();
        suppressTLastLotList();
        suppressTLotList();
        suppressTMoveInstBList();
        suppressTNizoroeAlarmLogList();
        suppressTOperationLogList();
        suppressTReceivePlanBList();
        suppressTSerialNoList();
        suppressTShippingInstBList();
        suppressTStockList();
        suppressTStockBookList();
        suppressWHtInventoryInputProdList();
        suppressWHtPickingList();
        suppressWHtReceiveInspectionList();
        suppressWHtReceiveNoPlanInspList();
        suppressWHtReceiveStoreList();
        suppressWHtShippingList();
        suppressWHtShippingPickingList();
        suppressWHtTotalPickingList();
        suppressWSglRowShipInspHList();
        suppressWShippingInterruptList();
    }
    protected void doSuppressClear() { // internal
        _suppressMShapeGrp = false;
        _suppressMClient = false;
        _suppressBClassDtlByDelFlg = false;
        _suppressBClassDtlByLimitDtManagFlg = false;
        _suppressBClassDtlByLimitDtReverseFlg = false;
        _suppressBClassDtlByLotManagFlg = false;
        _suppressBClassDtlByLotReverseFlg = false;
        _suppressBClassDtlByMergeCls = false;
        _suppressBClassDtlByShippingStopFlg = false;
        _suppressBClassDtlByFreightCls = false;
        _suppressBClassDtlByProdDtManagFlg = false;
        _suppressBClassDtlByLogiSpecialTypeCd = false;
        _suppressBClassDtlByOcrDateFormat = false;
        _suppressBClassDtlByInsuranceFlg = false;
        _suppressBClassDtlByNoOkinawaFlightFlg = false;
        _suppressBClassDtlByLogiAttentionTypeCd = false;
        _suppressBClassDtlByHeavyItemFlg = false;
        _suppressBClassDtlByLargeItemFlg = false;
        _suppressHStockBookList = false;
        _suppressMDepositProductList = false;
        _suppressMLocationList = false;
        _suppressMLocationReplenishProductList = false;
        _suppressMProductShapeList = false;
        _suppressMSetParentAsOne = false;
        _suppressMSetStructureList = false;
        _suppressTAllocInstBList = false;
        _suppressTAllocLotList = false;
        _suppressTInventoryBList = false;
        _suppressTKeepingLotList = false;
        _suppressTLastLotList = false;
        _suppressTLotList = false;
        _suppressTMoveInstBList = false;
        _suppressTNizoroeAlarmLogList = false;
        _suppressTOperationLogList = false;
        _suppressTReceivePlanBList = false;
        _suppressTSerialNoList = false;
        _suppressTShippingInstBList = false;
        _suppressTStockList = false;
        _suppressTStockBookList = false;
        _suppressWHtInventoryInputProdList = false;
        _suppressWHtPickingList = false;
        _suppressWHtReceiveInspectionList = false;
        _suppressWHtReceiveNoPlanInspList = false;
        _suppressWHtReceiveStoreList = false;
        _suppressWHtShippingList = false;
        _suppressWHtShippingPickingList = false;
        _suppressWHtTotalPickingList = false;
        _suppressWSglRowShipInspHList = false;
        _suppressWShippingInterruptList = false;
    }

    // ===================================================================================
    //                                                                      Mapping Option
    //                                                                      ==============
    /**
     * {@inheritDoc}
     */
    public void setBaseOnlyMapping(boolean baseOnlyMapping) {
        if (baseOnlyMapping) {
            doSuppressAll();
        } else {
            doSuppressClear();
        }
    }

    protected boolean isExceptCommonColumn() {
        return _exceptCommonColumn;
    }

    /**
     * {@inheritDoc}
     */
    public void setExceptCommonColumn(boolean exceptCommonColumn) {
        _exceptCommonColumn = exceptCommonColumn;
    }

    protected boolean isReverseReference() {
        return _reverseReference;
    }

    /**
     * {@inheritDoc}
     */
    public void setReverseReference(boolean reverseReference) {
        _reverseReference = reverseReference;
    }

    // -----------------------------------------------------
    //                                           Easy-to-Use
    //                                           -----------
    /**
     * Enable base-only mapping that means the mapping ignores all references.
     * @return this. (NotNull)
     */
    public MProductDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MProductDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MProductDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MProductDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MProductDtoMapper reverseReference() {
        setReverseReference(true);
        return (MProductDtoMapper)this;
    }
}
