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
 * The DTO mapper of m_customer as TABLE. <br>
 * 取引先マスタ
 * <pre>
 * [primary-key]
 *     CUSTOMER_ID
 *
 * [column]
 *     CUSTOMER_ID, CLIENT_ID, CUSTOMER_CD, CUSTOMER_NM, CUSTOMER_ABBR, ZIP_CD, TEL_NO, ADDRESS1, ADDRESS2, ADDRESS3, VENDOR_FLG, DELIVERY_FLG, ONETIME_FLG, DEPOSIT_FLG, ALLOC_ORDER, LOT_REVERSE_FLG, LIMIT_DT_REVERSE_FLG, SHIPPING_STOP_FLG, DELIV_CUSTOMER_ID, ACCOUNT_FLG, CENTER_ID, SALES_ORG_ID, LOT_SPLIT_TYPE_CD, LIMIT_DT_SPLIT_TYPE_CD, PROD_DT_SPLIT_TYPE_CD, LOT_UNMATCH_TYPE_CD, LIMIT_DT_UNMATCH_TYPE_CD, PROD_DT_UNMATCH_TYPE_CD, UNI_CUSTOMER_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CUSTOMER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_client, m_customer, m_client_center(ByClientId), b_class_dtl(ByDelFlg), m_carrier_slip_ces(AsOne)
 *
 * [referrer-table]
 *     m_carrier_decision, m_center_customer, m_client, m_client_center, m_customer, m_customer_picking, m_deposit_product, m_location, m_location_replenish_product, m_user_deposit, t_alloc_inst_b, t_alloc_inst_h, t_alloc_lot, t_inventory_b, t_inventory_inst, t_keeping_lot, t_last_lot, t_move_inst_b, t_receive_plan_h, t_shipping_inst_b, t_shipping_inst_h, t_stock, t_store_no, t_store_record_h, w_ht_inventory_input_prod, w_ht_receive_no_plan_insp, w_ht_serial_receive_insp, w_ht_serial_shipping_insp, m_carrier_slip_ces
 *
 * [foreign-property]
 *     mClient, mCustomerSelf, mClientCenterByClientId, bClassDtlByDelFlg, bClassDtlByDeliveryFlg, bClassDtlByDepositFlg, bClassDtlByLimitDtReverseFlg, bClassDtlByLotReverseFlg, bClassDtlByOnetimeFlg, bClassDtlByShippingStopFlg, bClassDtlByVendorFlg, mCarrierSlipCesAsOne
 *
 * [referrer-property]
 *     mCarrierDecisionList, mCenterCustomerList, mClientList, mClientCenterList, mCustomerSelfList, mCustomerPickingList, mDepositProductList, mLocationList, mLocationReplenishProductList, mUserDepositList, tAllocInstBList, tAllocInstHBySupplyCustomerIdList, tAllocInstHByDelivCustomerIdList, tAllocLotList, tInventoryBByAccountIdList, tInventoryBByDepositIdList, tInventoryBBySupplierIdList, tInventoryInstList, tKeepingLotList, tLastLotList, tMoveInstBByDepositIdList, tMoveInstBBySupplierIdList, tMoveInstBByAccountIdList, tReceivePlanHByPlanSupplierIdList, tReceivePlanHByPlanDepositIdList, tShippingInstBList, tShippingInstHByDelivCustomerIdList, tShippingInstHBySupplyCustomerIdList, tStockList, tStoreNoList, tStoreRecordHBySupplierIdList, tStoreRecordHByDepositIdList, wHtInventoryInputProdList, wHtReceiveNoPlanInspBySupplierIdList, wHtReceiveNoPlanInspByDepositIdList, wHtSerialReceiveInspList, wHtSerialShippingInspList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCustomerDtoMapper implements DtoMapper<MCustomer, MCustomerDto>, Serializable {

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
    protected boolean _suppressMClient;
    protected boolean _suppressMCustomerSelf;
    protected boolean _suppressMClientCenterByClientId;
    protected boolean _suppressBClassDtlByDelFlg;
    protected boolean _suppressBClassDtlByDeliveryFlg;
    protected boolean _suppressBClassDtlByDepositFlg;
    protected boolean _suppressBClassDtlByLimitDtReverseFlg;
    protected boolean _suppressBClassDtlByLotReverseFlg;
    protected boolean _suppressBClassDtlByOnetimeFlg;
    protected boolean _suppressBClassDtlByShippingStopFlg;
    protected boolean _suppressBClassDtlByVendorFlg;
    protected boolean _suppressMCarrierDecisionList;
    protected boolean _suppressMCarrierSlipCesAsOne;
    protected boolean _suppressMCenterCustomerList;
    protected boolean _suppressMClientList;
    protected boolean _suppressMClientCenterList;
    protected boolean _suppressMCustomerSelfList;
    protected boolean _suppressMCustomerPickingList;
    protected boolean _suppressMDepositProductList;
    protected boolean _suppressMLocationList;
    protected boolean _suppressMLocationReplenishProductList;
    protected boolean _suppressMUserDepositList;
    protected boolean _suppressTAllocInstBList;
    protected boolean _suppressTAllocInstHBySupplyCustomerIdList;
    protected boolean _suppressTAllocInstHByDelivCustomerIdList;
    protected boolean _suppressTAllocLotList;
    protected boolean _suppressTInventoryBByAccountIdList;
    protected boolean _suppressTInventoryBByDepositIdList;
    protected boolean _suppressTInventoryBBySupplierIdList;
    protected boolean _suppressTInventoryInstList;
    protected boolean _suppressTKeepingLotList;
    protected boolean _suppressTLastLotList;
    protected boolean _suppressTMoveInstBByDepositIdList;
    protected boolean _suppressTMoveInstBBySupplierIdList;
    protected boolean _suppressTMoveInstBByAccountIdList;
    protected boolean _suppressTReceivePlanHByPlanSupplierIdList;
    protected boolean _suppressTReceivePlanHByPlanDepositIdList;
    protected boolean _suppressTShippingInstBList;
    protected boolean _suppressTShippingInstHByDelivCustomerIdList;
    protected boolean _suppressTShippingInstHBySupplyCustomerIdList;
    protected boolean _suppressTStockList;
    protected boolean _suppressTStoreNoList;
    protected boolean _suppressTStoreRecordHBySupplierIdList;
    protected boolean _suppressTStoreRecordHByDepositIdList;
    protected boolean _suppressWHtInventoryInputProdList;
    protected boolean _suppressWHtReceiveNoPlanInspBySupplierIdList;
    protected boolean _suppressWHtReceiveNoPlanInspByDepositIdList;
    protected boolean _suppressWHtSerialReceiveInspList;
    protected boolean _suppressWHtSerialShippingInspList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCustomerDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMCustomerDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MCustomerDto mappingToDto(MCustomer entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MCustomerDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCustomerDto dto = new MCustomerDto();
        dto.setCustomerId(entity.getCustomerId());
        dto.setClientId(entity.getClientId());
        dto.setCustomerCd(entity.getCustomerCd());
        dto.setCustomerNm(entity.getCustomerNm());
        dto.setCustomerAbbr(entity.getCustomerAbbr());
        dto.setZipCd(entity.getZipCd());
        dto.setTelNo(entity.getTelNo());
        dto.setAddress1(entity.getAddress1());
        dto.setAddress2(entity.getAddress2());
        dto.setAddress3(entity.getAddress3());
        dto.setVendorFlg(entity.getVendorFlg());
        dto.setDeliveryFlg(entity.getDeliveryFlg());
        dto.setOnetimeFlg(entity.getOnetimeFlg());
        dto.setDepositFlg(entity.getDepositFlg());
        dto.setAllocOrder(entity.getAllocOrder());
        dto.setLotReverseFlg(entity.getLotReverseFlg());
        dto.setLimitDtReverseFlg(entity.getLimitDtReverseFlg());
        dto.setShippingStopFlg(entity.getShippingStopFlg());
        dto.setDelivCustomerId(entity.getDelivCustomerId());
        dto.setAccountFlg(entity.getAccountFlg());
        dto.setCenterId(entity.getCenterId());
        dto.setSalesOrgId(entity.getSalesOrgId());
        dto.setLotSplitTypeCd(entity.getLotSplitTypeCd());
        dto.setLimitDtSplitTypeCd(entity.getLimitDtSplitTypeCd());
        dto.setProdDtSplitTypeCd(entity.getProdDtSplitTypeCd());
        dto.setLotUnmatchTypeCd(entity.getLotUnmatchTypeCd());
        dto.setLimitDtUnmatchTypeCd(entity.getLimitDtUnmatchTypeCd());
        dto.setProdDtUnmatchTypeCd(entity.getProdDtUnmatchTypeCd());
        dto.setUniCustomerCd(entity.getUniCustomerCd());
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
        if (!_suppressMClient && entity.getMClient() != null) {
            MClient relationEntity = entity.getMClient();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MClientDto relationDto = (MClientDto)cachedDto;
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getMCustomerList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCustomerList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getMCustomerList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
                }
            }
        };
        if (!_suppressMCustomerSelf && entity.getMCustomerSelf() != null) {
            MCustomer relationEntity = entity.getMCustomerSelf();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCustomerDto relationDto = (MCustomerDto)cachedDto;
                dto.setMCustomerSelf(relationDto);
                if (reverseReference) {
                    relationDto.getMCustomerSelfList().add(dto);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCustomerSelfList();
                MCustomerDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCustomerSelf(relationDto);
                if (reverseReference) {
                    relationDto.getMCustomerSelfList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCustomerSelf());
                }
            }
        };
        if (!_suppressMClientCenterByClientId && entity.getMClientCenterByClientId() != null) {
            MClientCenter relationEntity = entity.getMClientCenterByClientId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MClientCenterDto relationDto = (MClientCenterDto)cachedDto;
                dto.setMClientCenterByClientId(relationDto);
                if (reverseReference) {
                }
            } else {
                MClientCenterDtoMapper mapper = new MClientCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MClientCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClientCenterByClientId(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClientCenterByClientId());
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
        if (!_suppressBClassDtlByDeliveryFlg && entity.getBClassDtlByDeliveryFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByDeliveryFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByDeliveryFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByDeliveryFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByDeliveryFlg());
                }
            }
        };
        if (!_suppressBClassDtlByDepositFlg && entity.getBClassDtlByDepositFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByDepositFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByDepositFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByDepositFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByDepositFlg());
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
        if (!_suppressBClassDtlByOnetimeFlg && entity.getBClassDtlByOnetimeFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByOnetimeFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByOnetimeFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByOnetimeFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByOnetimeFlg());
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
        if (!_suppressBClassDtlByVendorFlg && entity.getBClassDtlByVendorFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByVendorFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByVendorFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByVendorFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByVendorFlg());
                }
            }
        };
        if (!_suppressMCarrierDecisionList && !entity.getMCarrierDecisionList().isEmpty()) {
            MCarrierDecisionDtoMapper mapper = new MCarrierDecisionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<MCarrierDecisionDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierDecisionList());
            dto.setMCarrierDecisionList(relationDtoList);
            if (reverseReference) {
                for (MCarrierDecisionDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressMCarrierSlipCesAsOne && entity.getMCarrierSlipCesAsOne() != null) {
            MCarrierSlipCes relationEntity = entity.getMCarrierSlipCesAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCarrierSlipCesDto relationDto = (MCarrierSlipCesDto)cachedDto;
                dto.setMCarrierSlipCesAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setMCustomer(dto);
                }
            } else {
                MCarrierSlipCesDtoMapper mapper = new MCarrierSlipCesDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCustomer();
                MCarrierSlipCesDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCarrierSlipCesAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setMCustomer(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCarrierSlipCesAsOne());
                }
            }
        };
        if (!_suppressMCenterCustomerList && !entity.getMCenterCustomerList().isEmpty()) {
            MCenterCustomerDtoMapper mapper = new MCenterCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<MCenterCustomerDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterCustomerList());
            dto.setMCenterCustomerList(relationDtoList);
            if (reverseReference) {
                for (MCenterCustomerDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressMClientList && !entity.getMClientList().isEmpty()) {
            MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<MClientDto> relationDtoList = mapper.mappingToDtoList(entity.getMClientList());
            dto.setMClientList(relationDtoList);
            if (reverseReference) {
                for (MClientDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressMClientCenterList && !entity.getMClientCenterList().isEmpty()) {
            MClientCenterDtoMapper mapper = new MClientCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<MClientCenterDto> relationDtoList = mapper.mappingToDtoList(entity.getMClientCenterList());
            dto.setMClientCenterList(relationDtoList);
            if (reverseReference) {
                for (MClientCenterDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressMCustomerSelfList && !entity.getMCustomerSelfList().isEmpty()) {
            MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerSelf();
            List<MCustomerDto> relationDtoList = mapper.mappingToDtoList(entity.getMCustomerSelfList());
            dto.setMCustomerSelfList(relationDtoList);
            if (reverseReference) {
                for (MCustomerDto relationDto : relationDtoList) {
                    relationDto.setMCustomerSelf(dto);
                }
            }
        };
        if (!_suppressMCustomerPickingList && !entity.getMCustomerPickingList().isEmpty()) {
            MCustomerPickingDtoMapper mapper = new MCustomerPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<MCustomerPickingDto> relationDtoList = mapper.mappingToDtoList(entity.getMCustomerPickingList());
            dto.setMCustomerPickingList(relationDtoList);
            if (reverseReference) {
                for (MCustomerPickingDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressMDepositProductList && !entity.getMDepositProductList().isEmpty()) {
            MDepositProductDtoMapper mapper = new MDepositProductDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<MDepositProductDto> relationDtoList = mapper.mappingToDtoList(entity.getMDepositProductList());
            dto.setMDepositProductList(relationDtoList);
            if (reverseReference) {
                for (MDepositProductDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressMLocationList && !entity.getMLocationList().isEmpty()) {
            MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<MLocationDto> relationDtoList = mapper.mappingToDtoList(entity.getMLocationList());
            dto.setMLocationList(relationDtoList);
            if (reverseReference) {
                for (MLocationDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressMLocationReplenishProductList && !entity.getMLocationReplenishProductList().isEmpty()) {
            MLocationReplenishProductDtoMapper mapper = new MLocationReplenishProductDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<MLocationReplenishProductDto> relationDtoList = mapper.mappingToDtoList(entity.getMLocationReplenishProductList());
            dto.setMLocationReplenishProductList(relationDtoList);
            if (reverseReference) {
                for (MLocationReplenishProductDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressMUserDepositList && !entity.getMUserDepositList().isEmpty()) {
            MUserDepositDtoMapper mapper = new MUserDepositDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<MUserDepositDto> relationDtoList = mapper.mappingToDtoList(entity.getMUserDepositList());
            dto.setMUserDepositList(relationDtoList);
            if (reverseReference) {
                for (MUserDepositDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressTAllocInstBList && !entity.getTAllocInstBList().isEmpty()) {
            TAllocInstBDtoMapper mapper = new TAllocInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<TAllocInstBDto> relationDtoList = mapper.mappingToDtoList(entity.getTAllocInstBList());
            dto.setTAllocInstBList(relationDtoList);
            if (reverseReference) {
                for (TAllocInstBDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressTAllocInstHBySupplyCustomerIdList && !entity.getTAllocInstHBySupplyCustomerIdList().isEmpty()) {
            TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerBySupplyCustomerId();
            List<TAllocInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTAllocInstHBySupplyCustomerIdList());
            dto.setTAllocInstHBySupplyCustomerIdList(relationDtoList);
            if (reverseReference) {
                for (TAllocInstHDto relationDto : relationDtoList) {
                    relationDto.setMCustomerBySupplyCustomerId(dto);
                }
            }
        };
        if (!_suppressTAllocInstHByDelivCustomerIdList && !entity.getTAllocInstHByDelivCustomerIdList().isEmpty()) {
            TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByDelivCustomerId();
            List<TAllocInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTAllocInstHByDelivCustomerIdList());
            dto.setTAllocInstHByDelivCustomerIdList(relationDtoList);
            if (reverseReference) {
                for (TAllocInstHDto relationDto : relationDtoList) {
                    relationDto.setMCustomerByDelivCustomerId(dto);
                }
            }
        };
        if (!_suppressTAllocLotList && !entity.getTAllocLotList().isEmpty()) {
            TAllocLotDtoMapper mapper = new TAllocLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<TAllocLotDto> relationDtoList = mapper.mappingToDtoList(entity.getTAllocLotList());
            dto.setTAllocLotList(relationDtoList);
            if (reverseReference) {
                for (TAllocLotDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressTInventoryBByAccountIdList && !entity.getTInventoryBByAccountIdList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByAccountId();
            List<TInventoryBDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryBByAccountIdList());
            dto.setTInventoryBByAccountIdList(relationDtoList);
            if (reverseReference) {
                for (TInventoryBDto relationDto : relationDtoList) {
                    relationDto.setMCustomerByAccountId(dto);
                }
            }
        };
        if (!_suppressTInventoryBByDepositIdList && !entity.getTInventoryBByDepositIdList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByDepositId();
            List<TInventoryBDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryBByDepositIdList());
            dto.setTInventoryBByDepositIdList(relationDtoList);
            if (reverseReference) {
                for (TInventoryBDto relationDto : relationDtoList) {
                    relationDto.setMCustomerByDepositId(dto);
                }
            }
        };
        if (!_suppressTInventoryBBySupplierIdList && !entity.getTInventoryBBySupplierIdList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerBySupplierId();
            List<TInventoryBDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryBBySupplierIdList());
            dto.setTInventoryBBySupplierIdList(relationDtoList);
            if (reverseReference) {
                for (TInventoryBDto relationDto : relationDtoList) {
                    relationDto.setMCustomerBySupplierId(dto);
                }
            }
        };
        if (!_suppressTInventoryInstList && !entity.getTInventoryInstList().isEmpty()) {
            TInventoryInstDtoMapper mapper = new TInventoryInstDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<TInventoryInstDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryInstList());
            dto.setTInventoryInstList(relationDtoList);
            if (reverseReference) {
                for (TInventoryInstDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressTKeepingLotList && !entity.getTKeepingLotList().isEmpty()) {
            TKeepingLotDtoMapper mapper = new TKeepingLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<TKeepingLotDto> relationDtoList = mapper.mappingToDtoList(entity.getTKeepingLotList());
            dto.setTKeepingLotList(relationDtoList);
            if (reverseReference) {
                for (TKeepingLotDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressTLastLotList && !entity.getTLastLotList().isEmpty()) {
            TLastLotDtoMapper mapper = new TLastLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<TLastLotDto> relationDtoList = mapper.mappingToDtoList(entity.getTLastLotList());
            dto.setTLastLotList(relationDtoList);
            if (reverseReference) {
                for (TLastLotDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressTMoveInstBByDepositIdList && !entity.getTMoveInstBByDepositIdList().isEmpty()) {
            TMoveInstBDtoMapper mapper = new TMoveInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByDepositId();
            List<TMoveInstBDto> relationDtoList = mapper.mappingToDtoList(entity.getTMoveInstBByDepositIdList());
            dto.setTMoveInstBByDepositIdList(relationDtoList);
            if (reverseReference) {
                for (TMoveInstBDto relationDto : relationDtoList) {
                    relationDto.setMCustomerByDepositId(dto);
                }
            }
        };
        if (!_suppressTMoveInstBBySupplierIdList && !entity.getTMoveInstBBySupplierIdList().isEmpty()) {
            TMoveInstBDtoMapper mapper = new TMoveInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerBySupplierId();
            List<TMoveInstBDto> relationDtoList = mapper.mappingToDtoList(entity.getTMoveInstBBySupplierIdList());
            dto.setTMoveInstBBySupplierIdList(relationDtoList);
            if (reverseReference) {
                for (TMoveInstBDto relationDto : relationDtoList) {
                    relationDto.setMCustomerBySupplierId(dto);
                }
            }
        };
        if (!_suppressTMoveInstBByAccountIdList && !entity.getTMoveInstBByAccountIdList().isEmpty()) {
            TMoveInstBDtoMapper mapper = new TMoveInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByAccountId();
            List<TMoveInstBDto> relationDtoList = mapper.mappingToDtoList(entity.getTMoveInstBByAccountIdList());
            dto.setTMoveInstBByAccountIdList(relationDtoList);
            if (reverseReference) {
                for (TMoveInstBDto relationDto : relationDtoList) {
                    relationDto.setMCustomerByAccountId(dto);
                }
            }
        };
        if (!_suppressTReceivePlanHByPlanSupplierIdList && !entity.getTReceivePlanHByPlanSupplierIdList().isEmpty()) {
            TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByPlanSupplierId();
            List<TReceivePlanHDto> relationDtoList = mapper.mappingToDtoList(entity.getTReceivePlanHByPlanSupplierIdList());
            dto.setTReceivePlanHByPlanSupplierIdList(relationDtoList);
            if (reverseReference) {
                for (TReceivePlanHDto relationDto : relationDtoList) {
                    relationDto.setMCustomerByPlanSupplierId(dto);
                }
            }
        };
        if (!_suppressTReceivePlanHByPlanDepositIdList && !entity.getTReceivePlanHByPlanDepositIdList().isEmpty()) {
            TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByPlanDepositId();
            List<TReceivePlanHDto> relationDtoList = mapper.mappingToDtoList(entity.getTReceivePlanHByPlanDepositIdList());
            dto.setTReceivePlanHByPlanDepositIdList(relationDtoList);
            if (reverseReference) {
                for (TReceivePlanHDto relationDto : relationDtoList) {
                    relationDto.setMCustomerByPlanDepositId(dto);
                }
            }
        };
        if (!_suppressTShippingInstBList && !entity.getTShippingInstBList().isEmpty()) {
            TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<TShippingInstBDto> relationDtoList = mapper.mappingToDtoList(entity.getTShippingInstBList());
            dto.setTShippingInstBList(relationDtoList);
            if (reverseReference) {
                for (TShippingInstBDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressTShippingInstHByDelivCustomerIdList && !entity.getTShippingInstHByDelivCustomerIdList().isEmpty()) {
            TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByDelivCustomerId();
            List<TShippingInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTShippingInstHByDelivCustomerIdList());
            dto.setTShippingInstHByDelivCustomerIdList(relationDtoList);
            if (reverseReference) {
                for (TShippingInstHDto relationDto : relationDtoList) {
                    relationDto.setMCustomerByDelivCustomerId(dto);
                }
            }
        };
        if (!_suppressTShippingInstHBySupplyCustomerIdList && !entity.getTShippingInstHBySupplyCustomerIdList().isEmpty()) {
            TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerBySupplyCustomerId();
            List<TShippingInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTShippingInstHBySupplyCustomerIdList());
            dto.setTShippingInstHBySupplyCustomerIdList(relationDtoList);
            if (reverseReference) {
                for (TShippingInstHDto relationDto : relationDtoList) {
                    relationDto.setMCustomerBySupplyCustomerId(dto);
                }
            }
        };
        if (!_suppressTStockList && !entity.getTStockList().isEmpty()) {
            TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<TStockDto> relationDtoList = mapper.mappingToDtoList(entity.getTStockList());
            dto.setTStockList(relationDtoList);
            if (reverseReference) {
                for (TStockDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressTStoreNoList && !entity.getTStoreNoList().isEmpty()) {
            TStoreNoDtoMapper mapper = new TStoreNoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<TStoreNoDto> relationDtoList = mapper.mappingToDtoList(entity.getTStoreNoList());
            dto.setTStoreNoList(relationDtoList);
            if (reverseReference) {
                for (TStoreNoDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressTStoreRecordHBySupplierIdList && !entity.getTStoreRecordHBySupplierIdList().isEmpty()) {
            TStoreRecordHDtoMapper mapper = new TStoreRecordHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerBySupplierId();
            List<TStoreRecordHDto> relationDtoList = mapper.mappingToDtoList(entity.getTStoreRecordHBySupplierIdList());
            dto.setTStoreRecordHBySupplierIdList(relationDtoList);
            if (reverseReference) {
                for (TStoreRecordHDto relationDto : relationDtoList) {
                    relationDto.setMCustomerBySupplierId(dto);
                }
            }
        };
        if (!_suppressTStoreRecordHByDepositIdList && !entity.getTStoreRecordHByDepositIdList().isEmpty()) {
            TStoreRecordHDtoMapper mapper = new TStoreRecordHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByDepositId();
            List<TStoreRecordHDto> relationDtoList = mapper.mappingToDtoList(entity.getTStoreRecordHByDepositIdList());
            dto.setTStoreRecordHByDepositIdList(relationDtoList);
            if (reverseReference) {
                for (TStoreRecordHDto relationDto : relationDtoList) {
                    relationDto.setMCustomerByDepositId(dto);
                }
            }
        };
        if (!_suppressWHtInventoryInputProdList && !entity.getWHtInventoryInputProdList().isEmpty()) {
            WHtInventoryInputProdDtoMapper mapper = new WHtInventoryInputProdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<WHtInventoryInputProdDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtInventoryInputProdList());
            dto.setWHtInventoryInputProdList(relationDtoList);
            if (reverseReference) {
                for (WHtInventoryInputProdDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressWHtReceiveNoPlanInspBySupplierIdList && !entity.getWHtReceiveNoPlanInspBySupplierIdList().isEmpty()) {
            WHtReceiveNoPlanInspDtoMapper mapper = new WHtReceiveNoPlanInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerBySupplierId();
            List<WHtReceiveNoPlanInspDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveNoPlanInspBySupplierIdList());
            dto.setWHtReceiveNoPlanInspBySupplierIdList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveNoPlanInspDto relationDto : relationDtoList) {
                    relationDto.setMCustomerBySupplierId(dto);
                }
            }
        };
        if (!_suppressWHtReceiveNoPlanInspByDepositIdList && !entity.getWHtReceiveNoPlanInspByDepositIdList().isEmpty()) {
            WHtReceiveNoPlanInspDtoMapper mapper = new WHtReceiveNoPlanInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByDepositId();
            List<WHtReceiveNoPlanInspDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveNoPlanInspByDepositIdList());
            dto.setWHtReceiveNoPlanInspByDepositIdList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveNoPlanInspDto relationDto : relationDtoList) {
                    relationDto.setMCustomerByDepositId(dto);
                }
            }
        };
        if (!_suppressWHtSerialReceiveInspList && !entity.getWHtSerialReceiveInspList().isEmpty()) {
            WHtSerialReceiveInspDtoMapper mapper = new WHtSerialReceiveInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<WHtSerialReceiveInspDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtSerialReceiveInspList());
            dto.setWHtSerialReceiveInspList(relationDtoList);
            if (reverseReference) {
                for (WHtSerialReceiveInspDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        if (!_suppressWHtSerialShippingInspList && !entity.getWHtSerialShippingInspList().isEmpty()) {
            WHtSerialShippingInspDtoMapper mapper = new WHtSerialShippingInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<WHtSerialShippingInspDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtSerialShippingInspList());
            dto.setWHtSerialShippingInspList(relationDtoList);
            if (reverseReference) {
                for (WHtSerialShippingInspDto relationDto : relationDtoList) {
                    relationDto.setMCustomer(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MCustomerDto> mappingToDtoList(List<MCustomer> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MCustomerDto> dtoList = new ArrayList<MCustomerDto>();
        for (MCustomer entity : entityList) {
            MCustomerDto dto = mappingToDto(entity);
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
    public MCustomer mappingToEntity(MCustomerDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MCustomer)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCustomer entity = new MCustomer();
        if (needsMapping(dto, dto.getCustomerId(), "customerId")) {
            entity.setCustomerId(dto.getCustomerId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getCustomerCd(), "customerCd")) {
            entity.setCustomerCd(dto.getCustomerCd());
        }
        if (needsMapping(dto, dto.getCustomerNm(), "customerNm")) {
            entity.setCustomerNm(dto.getCustomerNm());
        }
        if (needsMapping(dto, dto.getCustomerAbbr(), "customerAbbr")) {
            entity.setCustomerAbbr(dto.getCustomerAbbr());
        }
        if (needsMapping(dto, dto.getZipCd(), "zipCd")) {
            entity.setZipCd(dto.getZipCd());
        }
        if (needsMapping(dto, dto.getTelNo(), "telNo")) {
            entity.setTelNo(dto.getTelNo());
        }
        if (needsMapping(dto, dto.getAddress1(), "address1")) {
            entity.setAddress1(dto.getAddress1());
        }
        if (needsMapping(dto, dto.getAddress2(), "address2")) {
            entity.setAddress2(dto.getAddress2());
        }
        if (needsMapping(dto, dto.getAddress3(), "address3")) {
            entity.setAddress3(dto.getAddress3());
        }
        if (needsMapping(dto, dto.getVendorFlg(), "vendorFlg")) {
            entity.setVendorFlgAsVendorFlg(CDef.VendorFlg.codeOf(dto.getVendorFlg()));
        }
        if (needsMapping(dto, dto.getDeliveryFlg(), "deliveryFlg")) {
            entity.setDeliveryFlgAsDeliveryFlg(CDef.DeliveryFlg.codeOf(dto.getDeliveryFlg()));
        }
        if (needsMapping(dto, dto.getOnetimeFlg(), "onetimeFlg")) {
            entity.setOnetimeFlgAsOnetimeFlg(CDef.OnetimeFlg.codeOf(dto.getOnetimeFlg()));
        }
        if (needsMapping(dto, dto.getDepositFlg(), "depositFlg")) {
            entity.setDepositFlgAsDepositFlg(CDef.DepositFlg.codeOf(dto.getDepositFlg()));
        }
        if (needsMapping(dto, dto.getAllocOrder(), "allocOrder")) {
            entity.setAllocOrder(dto.getAllocOrder());
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
        if (needsMapping(dto, dto.getDelivCustomerId(), "delivCustomerId")) {
            entity.setDelivCustomerId(dto.getDelivCustomerId());
        }
        if (needsMapping(dto, dto.getAccountFlg(), "accountFlg")) {
            entity.setAccountFlg(dto.getAccountFlg());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getSalesOrgId(), "salesOrgId")) {
            entity.setSalesOrgId(dto.getSalesOrgId());
        }
        if (needsMapping(dto, dto.getLotSplitTypeCd(), "lotSplitTypeCd")) {
            entity.setLotSplitTypeCd(dto.getLotSplitTypeCd());
        }
        if (needsMapping(dto, dto.getLimitDtSplitTypeCd(), "limitDtSplitTypeCd")) {
            entity.setLimitDtSplitTypeCd(dto.getLimitDtSplitTypeCd());
        }
        if (needsMapping(dto, dto.getProdDtSplitTypeCd(), "prodDtSplitTypeCd")) {
            entity.setProdDtSplitTypeCd(dto.getProdDtSplitTypeCd());
        }
        if (needsMapping(dto, dto.getLotUnmatchTypeCd(), "lotUnmatchTypeCd")) {
            entity.setLotUnmatchTypeCd(dto.getLotUnmatchTypeCd());
        }
        if (needsMapping(dto, dto.getLimitDtUnmatchTypeCd(), "limitDtUnmatchTypeCd")) {
            entity.setLimitDtUnmatchTypeCd(dto.getLimitDtUnmatchTypeCd());
        }
        if (needsMapping(dto, dto.getProdDtUnmatchTypeCd(), "prodDtUnmatchTypeCd")) {
            entity.setProdDtUnmatchTypeCd(dto.getProdDtUnmatchTypeCd());
        }
        if (needsMapping(dto, dto.getUniCustomerCd(), "uniCustomerCd")) {
            entity.setUniCustomerCd(dto.getUniCustomerCd());
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
        if (!_suppressMClient && dto.getMClient() != null) {
            MClientDto relationDto = dto.getMClient();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MClient relationEntity = (MClient)cachedEntity;
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCustomerList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCustomerList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCustomerList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
                }
            }
        };
        if (!_suppressMCustomerSelf && dto.getMCustomerSelf() != null) {
            MCustomerDto relationDto = dto.getMCustomerSelf();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCustomer relationEntity = (MCustomer)cachedEntity;
                entity.setMCustomerSelf(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCustomerSelfList().add(entity);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCustomerSelfList();
                MCustomer relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCustomerSelf(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCustomerSelfList().add(entity);
                }
                if (instanceCache && entity.getMCustomerSelf().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCustomerSelf());
                }
            }
        };
        if (!_suppressMClientCenterByClientId && dto.getMClientCenterByClientId() != null) {
            MClientCenterDto relationDto = dto.getMClientCenterByClientId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MClientCenter relationEntity = (MClientCenter)cachedEntity;
                entity.setMClientCenterByClientId(relationEntity);
                if (reverseReference) {
                }
            } else {
                MClientCenterDtoMapper mapper = new MClientCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MClientCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClientCenterByClientId(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getMClientCenterByClientId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClientCenterByClientId());
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
        if (!_suppressBClassDtlByDeliveryFlg && dto.getBClassDtlByDeliveryFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByDeliveryFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByDeliveryFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByDeliveryFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByDeliveryFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByDeliveryFlg());
                }
            }
        };
        if (!_suppressBClassDtlByDepositFlg && dto.getBClassDtlByDepositFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByDepositFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByDepositFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByDepositFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByDepositFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByDepositFlg());
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
        if (!_suppressBClassDtlByOnetimeFlg && dto.getBClassDtlByOnetimeFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByOnetimeFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByOnetimeFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByOnetimeFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByOnetimeFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByOnetimeFlg());
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
        if (!_suppressBClassDtlByVendorFlg && dto.getBClassDtlByVendorFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByVendorFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByVendorFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByVendorFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByVendorFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByVendorFlg());
                }
            }
        };
        if (!_suppressMCarrierDecisionList && !dto.getMCarrierDecisionList().isEmpty()) {
            MCarrierDecisionDtoMapper mapper = new MCarrierDecisionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<MCarrierDecision> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierDecisionList());
            entity.setMCarrierDecisionList(relationEntityList);
            if (reverseReference) {
                for (MCarrierDecision relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressMCarrierSlipCesAsOne && dto.getMCarrierSlipCesAsOne() != null) {
            MCarrierSlipCesDto relationDto = dto.getMCarrierSlipCesAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCarrierSlipCes relationEntity = (MCarrierSlipCes)cachedEntity;
                entity.setMCarrierSlipCesAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setMCustomer(entity);
                }
            } else {
                MCarrierSlipCesDtoMapper mapper = new MCarrierSlipCesDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCustomer();
                MCarrierSlipCes relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCarrierSlipCesAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setMCustomer(entity);
                }
                if (instanceCache && entity.getMCarrierSlipCesAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCarrierSlipCesAsOne());
                }
            }
        };
        if (!_suppressMCenterCustomerList && !dto.getMCenterCustomerList().isEmpty()) {
            MCenterCustomerDtoMapper mapper = new MCenterCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<MCenterCustomer> relationEntityList = mapper.mappingToEntityList(dto.getMCenterCustomerList());
            entity.setMCenterCustomerList(relationEntityList);
            if (reverseReference) {
                for (MCenterCustomer relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressMClientList && !dto.getMClientList().isEmpty()) {
            MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<MClient> relationEntityList = mapper.mappingToEntityList(dto.getMClientList());
            entity.setMClientList(relationEntityList);
            if (reverseReference) {
                for (MClient relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressMClientCenterList && !dto.getMClientCenterList().isEmpty()) {
            MClientCenterDtoMapper mapper = new MClientCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<MClientCenter> relationEntityList = mapper.mappingToEntityList(dto.getMClientCenterList());
            entity.setMClientCenterList(relationEntityList);
            if (reverseReference) {
                for (MClientCenter relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressMCustomerSelfList && !dto.getMCustomerSelfList().isEmpty()) {
            MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerSelf();
            List<MCustomer> relationEntityList = mapper.mappingToEntityList(dto.getMCustomerSelfList());
            entity.setMCustomerSelfList(relationEntityList);
            if (reverseReference) {
                for (MCustomer relationEntity : relationEntityList) {
                    relationEntity.setMCustomerSelf(entity);
                }
            }
        };
        if (!_suppressMCustomerPickingList && !dto.getMCustomerPickingList().isEmpty()) {
            MCustomerPickingDtoMapper mapper = new MCustomerPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<MCustomerPicking> relationEntityList = mapper.mappingToEntityList(dto.getMCustomerPickingList());
            entity.setMCustomerPickingList(relationEntityList);
            if (reverseReference) {
                for (MCustomerPicking relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressMDepositProductList && !dto.getMDepositProductList().isEmpty()) {
            MDepositProductDtoMapper mapper = new MDepositProductDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<MDepositProduct> relationEntityList = mapper.mappingToEntityList(dto.getMDepositProductList());
            entity.setMDepositProductList(relationEntityList);
            if (reverseReference) {
                for (MDepositProduct relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressMLocationList && !dto.getMLocationList().isEmpty()) {
            MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<MLocation> relationEntityList = mapper.mappingToEntityList(dto.getMLocationList());
            entity.setMLocationList(relationEntityList);
            if (reverseReference) {
                for (MLocation relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressMLocationReplenishProductList && !dto.getMLocationReplenishProductList().isEmpty()) {
            MLocationReplenishProductDtoMapper mapper = new MLocationReplenishProductDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<MLocationReplenishProduct> relationEntityList = mapper.mappingToEntityList(dto.getMLocationReplenishProductList());
            entity.setMLocationReplenishProductList(relationEntityList);
            if (reverseReference) {
                for (MLocationReplenishProduct relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressMUserDepositList && !dto.getMUserDepositList().isEmpty()) {
            MUserDepositDtoMapper mapper = new MUserDepositDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<MUserDeposit> relationEntityList = mapper.mappingToEntityList(dto.getMUserDepositList());
            entity.setMUserDepositList(relationEntityList);
            if (reverseReference) {
                for (MUserDeposit relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressTAllocInstBList && !dto.getTAllocInstBList().isEmpty()) {
            TAllocInstBDtoMapper mapper = new TAllocInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<TAllocInstB> relationEntityList = mapper.mappingToEntityList(dto.getTAllocInstBList());
            entity.setTAllocInstBList(relationEntityList);
            if (reverseReference) {
                for (TAllocInstB relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressTAllocInstHBySupplyCustomerIdList && !dto.getTAllocInstHBySupplyCustomerIdList().isEmpty()) {
            TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerBySupplyCustomerId();
            List<TAllocInstH> relationEntityList = mapper.mappingToEntityList(dto.getTAllocInstHBySupplyCustomerIdList());
            entity.setTAllocInstHBySupplyCustomerIdList(relationEntityList);
            if (reverseReference) {
                for (TAllocInstH relationEntity : relationEntityList) {
                    relationEntity.setMCustomerBySupplyCustomerId(entity);
                }
            }
        };
        if (!_suppressTAllocInstHByDelivCustomerIdList && !dto.getTAllocInstHByDelivCustomerIdList().isEmpty()) {
            TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByDelivCustomerId();
            List<TAllocInstH> relationEntityList = mapper.mappingToEntityList(dto.getTAllocInstHByDelivCustomerIdList());
            entity.setTAllocInstHByDelivCustomerIdList(relationEntityList);
            if (reverseReference) {
                for (TAllocInstH relationEntity : relationEntityList) {
                    relationEntity.setMCustomerByDelivCustomerId(entity);
                }
            }
        };
        if (!_suppressTAllocLotList && !dto.getTAllocLotList().isEmpty()) {
            TAllocLotDtoMapper mapper = new TAllocLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<TAllocLot> relationEntityList = mapper.mappingToEntityList(dto.getTAllocLotList());
            entity.setTAllocLotList(relationEntityList);
            if (reverseReference) {
                for (TAllocLot relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressTInventoryBByAccountIdList && !dto.getTInventoryBByAccountIdList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByAccountId();
            List<TInventoryB> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryBByAccountIdList());
            entity.setTInventoryBByAccountIdList(relationEntityList);
            if (reverseReference) {
                for (TInventoryB relationEntity : relationEntityList) {
                    relationEntity.setMCustomerByAccountId(entity);
                }
            }
        };
        if (!_suppressTInventoryBByDepositIdList && !dto.getTInventoryBByDepositIdList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByDepositId();
            List<TInventoryB> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryBByDepositIdList());
            entity.setTInventoryBByDepositIdList(relationEntityList);
            if (reverseReference) {
                for (TInventoryB relationEntity : relationEntityList) {
                    relationEntity.setMCustomerByDepositId(entity);
                }
            }
        };
        if (!_suppressTInventoryBBySupplierIdList && !dto.getTInventoryBBySupplierIdList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerBySupplierId();
            List<TInventoryB> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryBBySupplierIdList());
            entity.setTInventoryBBySupplierIdList(relationEntityList);
            if (reverseReference) {
                for (TInventoryB relationEntity : relationEntityList) {
                    relationEntity.setMCustomerBySupplierId(entity);
                }
            }
        };
        if (!_suppressTInventoryInstList && !dto.getTInventoryInstList().isEmpty()) {
            TInventoryInstDtoMapper mapper = new TInventoryInstDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<TInventoryInst> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryInstList());
            entity.setTInventoryInstList(relationEntityList);
            if (reverseReference) {
                for (TInventoryInst relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressTKeepingLotList && !dto.getTKeepingLotList().isEmpty()) {
            TKeepingLotDtoMapper mapper = new TKeepingLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<TKeepingLot> relationEntityList = mapper.mappingToEntityList(dto.getTKeepingLotList());
            entity.setTKeepingLotList(relationEntityList);
            if (reverseReference) {
                for (TKeepingLot relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressTLastLotList && !dto.getTLastLotList().isEmpty()) {
            TLastLotDtoMapper mapper = new TLastLotDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<TLastLot> relationEntityList = mapper.mappingToEntityList(dto.getTLastLotList());
            entity.setTLastLotList(relationEntityList);
            if (reverseReference) {
                for (TLastLot relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressTMoveInstBByDepositIdList && !dto.getTMoveInstBByDepositIdList().isEmpty()) {
            TMoveInstBDtoMapper mapper = new TMoveInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByDepositId();
            List<TMoveInstB> relationEntityList = mapper.mappingToEntityList(dto.getTMoveInstBByDepositIdList());
            entity.setTMoveInstBByDepositIdList(relationEntityList);
            if (reverseReference) {
                for (TMoveInstB relationEntity : relationEntityList) {
                    relationEntity.setMCustomerByDepositId(entity);
                }
            }
        };
        if (!_suppressTMoveInstBBySupplierIdList && !dto.getTMoveInstBBySupplierIdList().isEmpty()) {
            TMoveInstBDtoMapper mapper = new TMoveInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerBySupplierId();
            List<TMoveInstB> relationEntityList = mapper.mappingToEntityList(dto.getTMoveInstBBySupplierIdList());
            entity.setTMoveInstBBySupplierIdList(relationEntityList);
            if (reverseReference) {
                for (TMoveInstB relationEntity : relationEntityList) {
                    relationEntity.setMCustomerBySupplierId(entity);
                }
            }
        };
        if (!_suppressTMoveInstBByAccountIdList && !dto.getTMoveInstBByAccountIdList().isEmpty()) {
            TMoveInstBDtoMapper mapper = new TMoveInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByAccountId();
            List<TMoveInstB> relationEntityList = mapper.mappingToEntityList(dto.getTMoveInstBByAccountIdList());
            entity.setTMoveInstBByAccountIdList(relationEntityList);
            if (reverseReference) {
                for (TMoveInstB relationEntity : relationEntityList) {
                    relationEntity.setMCustomerByAccountId(entity);
                }
            }
        };
        if (!_suppressTReceivePlanHByPlanSupplierIdList && !dto.getTReceivePlanHByPlanSupplierIdList().isEmpty()) {
            TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByPlanSupplierId();
            List<TReceivePlanH> relationEntityList = mapper.mappingToEntityList(dto.getTReceivePlanHByPlanSupplierIdList());
            entity.setTReceivePlanHByPlanSupplierIdList(relationEntityList);
            if (reverseReference) {
                for (TReceivePlanH relationEntity : relationEntityList) {
                    relationEntity.setMCustomerByPlanSupplierId(entity);
                }
            }
        };
        if (!_suppressTReceivePlanHByPlanDepositIdList && !dto.getTReceivePlanHByPlanDepositIdList().isEmpty()) {
            TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByPlanDepositId();
            List<TReceivePlanH> relationEntityList = mapper.mappingToEntityList(dto.getTReceivePlanHByPlanDepositIdList());
            entity.setTReceivePlanHByPlanDepositIdList(relationEntityList);
            if (reverseReference) {
                for (TReceivePlanH relationEntity : relationEntityList) {
                    relationEntity.setMCustomerByPlanDepositId(entity);
                }
            }
        };
        if (!_suppressTShippingInstBList && !dto.getTShippingInstBList().isEmpty()) {
            TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<TShippingInstB> relationEntityList = mapper.mappingToEntityList(dto.getTShippingInstBList());
            entity.setTShippingInstBList(relationEntityList);
            if (reverseReference) {
                for (TShippingInstB relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressTShippingInstHByDelivCustomerIdList && !dto.getTShippingInstHByDelivCustomerIdList().isEmpty()) {
            TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByDelivCustomerId();
            List<TShippingInstH> relationEntityList = mapper.mappingToEntityList(dto.getTShippingInstHByDelivCustomerIdList());
            entity.setTShippingInstHByDelivCustomerIdList(relationEntityList);
            if (reverseReference) {
                for (TShippingInstH relationEntity : relationEntityList) {
                    relationEntity.setMCustomerByDelivCustomerId(entity);
                }
            }
        };
        if (!_suppressTShippingInstHBySupplyCustomerIdList && !dto.getTShippingInstHBySupplyCustomerIdList().isEmpty()) {
            TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerBySupplyCustomerId();
            List<TShippingInstH> relationEntityList = mapper.mappingToEntityList(dto.getTShippingInstHBySupplyCustomerIdList());
            entity.setTShippingInstHBySupplyCustomerIdList(relationEntityList);
            if (reverseReference) {
                for (TShippingInstH relationEntity : relationEntityList) {
                    relationEntity.setMCustomerBySupplyCustomerId(entity);
                }
            }
        };
        if (!_suppressTStockList && !dto.getTStockList().isEmpty()) {
            TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<TStock> relationEntityList = mapper.mappingToEntityList(dto.getTStockList());
            entity.setTStockList(relationEntityList);
            if (reverseReference) {
                for (TStock relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressTStoreNoList && !dto.getTStoreNoList().isEmpty()) {
            TStoreNoDtoMapper mapper = new TStoreNoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<TStoreNo> relationEntityList = mapper.mappingToEntityList(dto.getTStoreNoList());
            entity.setTStoreNoList(relationEntityList);
            if (reverseReference) {
                for (TStoreNo relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressTStoreRecordHBySupplierIdList && !dto.getTStoreRecordHBySupplierIdList().isEmpty()) {
            TStoreRecordHDtoMapper mapper = new TStoreRecordHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerBySupplierId();
            List<TStoreRecordH> relationEntityList = mapper.mappingToEntityList(dto.getTStoreRecordHBySupplierIdList());
            entity.setTStoreRecordHBySupplierIdList(relationEntityList);
            if (reverseReference) {
                for (TStoreRecordH relationEntity : relationEntityList) {
                    relationEntity.setMCustomerBySupplierId(entity);
                }
            }
        };
        if (!_suppressTStoreRecordHByDepositIdList && !dto.getTStoreRecordHByDepositIdList().isEmpty()) {
            TStoreRecordHDtoMapper mapper = new TStoreRecordHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByDepositId();
            List<TStoreRecordH> relationEntityList = mapper.mappingToEntityList(dto.getTStoreRecordHByDepositIdList());
            entity.setTStoreRecordHByDepositIdList(relationEntityList);
            if (reverseReference) {
                for (TStoreRecordH relationEntity : relationEntityList) {
                    relationEntity.setMCustomerByDepositId(entity);
                }
            }
        };
        if (!_suppressWHtInventoryInputProdList && !dto.getWHtInventoryInputProdList().isEmpty()) {
            WHtInventoryInputProdDtoMapper mapper = new WHtInventoryInputProdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<WHtInventoryInputProd> relationEntityList = mapper.mappingToEntityList(dto.getWHtInventoryInputProdList());
            entity.setWHtInventoryInputProdList(relationEntityList);
            if (reverseReference) {
                for (WHtInventoryInputProd relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressWHtReceiveNoPlanInspBySupplierIdList && !dto.getWHtReceiveNoPlanInspBySupplierIdList().isEmpty()) {
            WHtReceiveNoPlanInspDtoMapper mapper = new WHtReceiveNoPlanInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerBySupplierId();
            List<WHtReceiveNoPlanInsp> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveNoPlanInspBySupplierIdList());
            entity.setWHtReceiveNoPlanInspBySupplierIdList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveNoPlanInsp relationEntity : relationEntityList) {
                    relationEntity.setMCustomerBySupplierId(entity);
                }
            }
        };
        if (!_suppressWHtReceiveNoPlanInspByDepositIdList && !dto.getWHtReceiveNoPlanInspByDepositIdList().isEmpty()) {
            WHtReceiveNoPlanInspDtoMapper mapper = new WHtReceiveNoPlanInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomerByDepositId();
            List<WHtReceiveNoPlanInsp> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveNoPlanInspByDepositIdList());
            entity.setWHtReceiveNoPlanInspByDepositIdList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveNoPlanInsp relationEntity : relationEntityList) {
                    relationEntity.setMCustomerByDepositId(entity);
                }
            }
        };
        if (!_suppressWHtSerialReceiveInspList && !dto.getWHtSerialReceiveInspList().isEmpty()) {
            WHtSerialReceiveInspDtoMapper mapper = new WHtSerialReceiveInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<WHtSerialReceiveInsp> relationEntityList = mapper.mappingToEntityList(dto.getWHtSerialReceiveInspList());
            entity.setWHtSerialReceiveInspList(relationEntityList);
            if (reverseReference) {
                for (WHtSerialReceiveInsp relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
                }
            }
        };
        if (!_suppressWHtSerialShippingInspList && !dto.getWHtSerialShippingInspList().isEmpty()) {
            WHtSerialShippingInspDtoMapper mapper = new WHtSerialShippingInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCustomer();
            List<WHtSerialShippingInsp> relationEntityList = mapper.mappingToEntityList(dto.getWHtSerialShippingInspList());
            entity.setWHtSerialShippingInspList(relationEntityList);
            if (reverseReference) {
                for (WHtSerialShippingInsp relationEntity : relationEntityList) {
                    relationEntity.setMCustomer(entity);
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
    protected boolean needsMapping(MCustomerDto dto, Object value, String propName) {
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
    public List<MCustomer> mappingToEntityList(List<MCustomerDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MCustomer> entityList = new ArrayList<MCustomer>();
        for (MCustomerDto dto : dtoList) {
            MCustomer entity = mappingToEntity(dto);
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
    public void suppressMClient() {
        _suppressMClient = true;
    }
    public void suppressMCustomerSelf() {
        _suppressMCustomerSelf = true;
    }
    public void suppressMClientCenterByClientId() {
        _suppressMClientCenterByClientId = true;
    }
    public void suppressBClassDtlByDelFlg() {
        _suppressBClassDtlByDelFlg = true;
    }
    public void suppressBClassDtlByDeliveryFlg() {
        _suppressBClassDtlByDeliveryFlg = true;
    }
    public void suppressBClassDtlByDepositFlg() {
        _suppressBClassDtlByDepositFlg = true;
    }
    public void suppressBClassDtlByLimitDtReverseFlg() {
        _suppressBClassDtlByLimitDtReverseFlg = true;
    }
    public void suppressBClassDtlByLotReverseFlg() {
        _suppressBClassDtlByLotReverseFlg = true;
    }
    public void suppressBClassDtlByOnetimeFlg() {
        _suppressBClassDtlByOnetimeFlg = true;
    }
    public void suppressBClassDtlByShippingStopFlg() {
        _suppressBClassDtlByShippingStopFlg = true;
    }
    public void suppressBClassDtlByVendorFlg() {
        _suppressBClassDtlByVendorFlg = true;
    }
    public void suppressMCarrierDecisionList() {
        _suppressMCarrierDecisionList = true;
    }
    public void suppressMCarrierSlipCesAsOne() {
        _suppressMCarrierSlipCesAsOne = true;
    }
    public void suppressMCenterCustomerList() {
        _suppressMCenterCustomerList = true;
    }
    public void suppressMClientList() {
        _suppressMClientList = true;
    }
    public void suppressMClientCenterList() {
        _suppressMClientCenterList = true;
    }
    public void suppressMCustomerSelfList() {
        _suppressMCustomerSelfList = true;
    }
    public void suppressMCustomerPickingList() {
        _suppressMCustomerPickingList = true;
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
    public void suppressMUserDepositList() {
        _suppressMUserDepositList = true;
    }
    public void suppressTAllocInstBList() {
        _suppressTAllocInstBList = true;
    }
    public void suppressTAllocInstHBySupplyCustomerIdList() {
        _suppressTAllocInstHBySupplyCustomerIdList = true;
    }
    public void suppressTAllocInstHByDelivCustomerIdList() {
        _suppressTAllocInstHByDelivCustomerIdList = true;
    }
    public void suppressTAllocLotList() {
        _suppressTAllocLotList = true;
    }
    public void suppressTInventoryBByAccountIdList() {
        _suppressTInventoryBByAccountIdList = true;
    }
    public void suppressTInventoryBByDepositIdList() {
        _suppressTInventoryBByDepositIdList = true;
    }
    public void suppressTInventoryBBySupplierIdList() {
        _suppressTInventoryBBySupplierIdList = true;
    }
    public void suppressTInventoryInstList() {
        _suppressTInventoryInstList = true;
    }
    public void suppressTKeepingLotList() {
        _suppressTKeepingLotList = true;
    }
    public void suppressTLastLotList() {
        _suppressTLastLotList = true;
    }
    public void suppressTMoveInstBByDepositIdList() {
        _suppressTMoveInstBByDepositIdList = true;
    }
    public void suppressTMoveInstBBySupplierIdList() {
        _suppressTMoveInstBBySupplierIdList = true;
    }
    public void suppressTMoveInstBByAccountIdList() {
        _suppressTMoveInstBByAccountIdList = true;
    }
    public void suppressTReceivePlanHByPlanSupplierIdList() {
        _suppressTReceivePlanHByPlanSupplierIdList = true;
    }
    public void suppressTReceivePlanHByPlanDepositIdList() {
        _suppressTReceivePlanHByPlanDepositIdList = true;
    }
    public void suppressTShippingInstBList() {
        _suppressTShippingInstBList = true;
    }
    public void suppressTShippingInstHByDelivCustomerIdList() {
        _suppressTShippingInstHByDelivCustomerIdList = true;
    }
    public void suppressTShippingInstHBySupplyCustomerIdList() {
        _suppressTShippingInstHBySupplyCustomerIdList = true;
    }
    public void suppressTStockList() {
        _suppressTStockList = true;
    }
    public void suppressTStoreNoList() {
        _suppressTStoreNoList = true;
    }
    public void suppressTStoreRecordHBySupplierIdList() {
        _suppressTStoreRecordHBySupplierIdList = true;
    }
    public void suppressTStoreRecordHByDepositIdList() {
        _suppressTStoreRecordHByDepositIdList = true;
    }
    public void suppressWHtInventoryInputProdList() {
        _suppressWHtInventoryInputProdList = true;
    }
    public void suppressWHtReceiveNoPlanInspBySupplierIdList() {
        _suppressWHtReceiveNoPlanInspBySupplierIdList = true;
    }
    public void suppressWHtReceiveNoPlanInspByDepositIdList() {
        _suppressWHtReceiveNoPlanInspByDepositIdList = true;
    }
    public void suppressWHtSerialReceiveInspList() {
        _suppressWHtSerialReceiveInspList = true;
    }
    public void suppressWHtSerialShippingInspList() {
        _suppressWHtSerialShippingInspList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMClient();
        suppressMCustomerSelf();
        suppressMClientCenterByClientId();
        suppressBClassDtlByDelFlg();
        suppressBClassDtlByDeliveryFlg();
        suppressBClassDtlByDepositFlg();
        suppressBClassDtlByLimitDtReverseFlg();
        suppressBClassDtlByLotReverseFlg();
        suppressBClassDtlByOnetimeFlg();
        suppressBClassDtlByShippingStopFlg();
        suppressBClassDtlByVendorFlg();
        suppressMCarrierDecisionList();
        suppressMCarrierSlipCesAsOne();
        suppressMCenterCustomerList();
        suppressMClientList();
        suppressMClientCenterList();
        suppressMCustomerSelfList();
        suppressMCustomerPickingList();
        suppressMDepositProductList();
        suppressMLocationList();
        suppressMLocationReplenishProductList();
        suppressMUserDepositList();
        suppressTAllocInstBList();
        suppressTAllocInstHBySupplyCustomerIdList();
        suppressTAllocInstHByDelivCustomerIdList();
        suppressTAllocLotList();
        suppressTInventoryBByAccountIdList();
        suppressTInventoryBByDepositIdList();
        suppressTInventoryBBySupplierIdList();
        suppressTInventoryInstList();
        suppressTKeepingLotList();
        suppressTLastLotList();
        suppressTMoveInstBByDepositIdList();
        suppressTMoveInstBBySupplierIdList();
        suppressTMoveInstBByAccountIdList();
        suppressTReceivePlanHByPlanSupplierIdList();
        suppressTReceivePlanHByPlanDepositIdList();
        suppressTShippingInstBList();
        suppressTShippingInstHByDelivCustomerIdList();
        suppressTShippingInstHBySupplyCustomerIdList();
        suppressTStockList();
        suppressTStoreNoList();
        suppressTStoreRecordHBySupplierIdList();
        suppressTStoreRecordHByDepositIdList();
        suppressWHtInventoryInputProdList();
        suppressWHtReceiveNoPlanInspBySupplierIdList();
        suppressWHtReceiveNoPlanInspByDepositIdList();
        suppressWHtSerialReceiveInspList();
        suppressWHtSerialShippingInspList();
    }
    protected void doSuppressClear() { // internal
        _suppressMClient = false;
        _suppressMCustomerSelf = false;
        _suppressMClientCenterByClientId = false;
        _suppressBClassDtlByDelFlg = false;
        _suppressBClassDtlByDeliveryFlg = false;
        _suppressBClassDtlByDepositFlg = false;
        _suppressBClassDtlByLimitDtReverseFlg = false;
        _suppressBClassDtlByLotReverseFlg = false;
        _suppressBClassDtlByOnetimeFlg = false;
        _suppressBClassDtlByShippingStopFlg = false;
        _suppressBClassDtlByVendorFlg = false;
        _suppressMCarrierDecisionList = false;
        _suppressMCarrierSlipCesAsOne = false;
        _suppressMCenterCustomerList = false;
        _suppressMClientList = false;
        _suppressMClientCenterList = false;
        _suppressMCustomerSelfList = false;
        _suppressMCustomerPickingList = false;
        _suppressMDepositProductList = false;
        _suppressMLocationList = false;
        _suppressMLocationReplenishProductList = false;
        _suppressMUserDepositList = false;
        _suppressTAllocInstBList = false;
        _suppressTAllocInstHBySupplyCustomerIdList = false;
        _suppressTAllocInstHByDelivCustomerIdList = false;
        _suppressTAllocLotList = false;
        _suppressTInventoryBByAccountIdList = false;
        _suppressTInventoryBByDepositIdList = false;
        _suppressTInventoryBBySupplierIdList = false;
        _suppressTInventoryInstList = false;
        _suppressTKeepingLotList = false;
        _suppressTLastLotList = false;
        _suppressTMoveInstBByDepositIdList = false;
        _suppressTMoveInstBBySupplierIdList = false;
        _suppressTMoveInstBByAccountIdList = false;
        _suppressTReceivePlanHByPlanSupplierIdList = false;
        _suppressTReceivePlanHByPlanDepositIdList = false;
        _suppressTShippingInstBList = false;
        _suppressTShippingInstHByDelivCustomerIdList = false;
        _suppressTShippingInstHBySupplyCustomerIdList = false;
        _suppressTStockList = false;
        _suppressTStoreNoList = false;
        _suppressTStoreRecordHBySupplierIdList = false;
        _suppressTStoreRecordHByDepositIdList = false;
        _suppressWHtInventoryInputProdList = false;
        _suppressWHtReceiveNoPlanInspBySupplierIdList = false;
        _suppressWHtReceiveNoPlanInspByDepositIdList = false;
        _suppressWHtSerialReceiveInspList = false;
        _suppressWHtSerialShippingInspList = false;
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
    public MCustomerDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MCustomerDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MCustomerDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MCustomerDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MCustomerDtoMapper reverseReference() {
        setReverseReference(true);
        return (MCustomerDtoMapper)this;
    }
}
