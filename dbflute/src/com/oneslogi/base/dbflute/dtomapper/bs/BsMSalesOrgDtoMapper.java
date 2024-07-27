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
 * The DTO mapper of m_sales_org as TABLE. <br>
 * 販売組織マスタ
 * <pre>
 * [primary-key]
 *     SALES_ORG_ID
 *
 * [column]
 *     SALES_ORG_ID, SALES_ORG_CD, PURCHASE_ORG_CD, TENHANSHA_CD, TENHANSHA_NM1, TENHANSHA_NM2, TENHANSHA_ZIP_CD, TENHANSHA_PREFECTURE, TENHANSHA_ADDRESS1, TENHANSHA_ADDRESS2, TENHANSHA_TEL_NO, TENHANSHA_FAX_NO, PLANT_NORMAL, PLANT_DEPOSIT, LP_SEND_FLG, WMS_SEND_FLG, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SALES_ORG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     m_base_sales_org, m_carrier_decision, m_customer_picking, m_deposit_product, m_koguchi_delivery, t_inventory_b, t_shipping_inst_h
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     mBaseSalesOrgList, mCarrierDecisionList, mCustomerPickingList, mDepositProductList, mKoguchiDeliveryList, tInventoryBList, tShippingInstHBySalesOrgList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMSalesOrgDtoMapper implements DtoMapper<MSalesOrg, MSalesOrgDto>, Serializable {

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
    protected boolean _suppressMBaseSalesOrgList;
    protected boolean _suppressMCarrierDecisionList;
    protected boolean _suppressMCustomerPickingList;
    protected boolean _suppressMDepositProductList;
    protected boolean _suppressMKoguchiDeliveryList;
    protected boolean _suppressTInventoryBList;
    protected boolean _suppressTShippingInstHBySalesOrgList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMSalesOrgDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMSalesOrgDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MSalesOrgDto mappingToDto(MSalesOrg entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MSalesOrgDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MSalesOrgDto dto = new MSalesOrgDto();
        dto.setSalesOrgId(entity.getSalesOrgId());
        dto.setSalesOrgCd(entity.getSalesOrgCd());
        dto.setPurchaseOrgCd(entity.getPurchaseOrgCd());
        dto.setTenhanshaCd(entity.getTenhanshaCd());
        dto.setTenhanshaNm1(entity.getTenhanshaNm1());
        dto.setTenhanshaNm2(entity.getTenhanshaNm2());
        dto.setTenhanshaZipCd(entity.getTenhanshaZipCd());
        dto.setTenhanshaPrefecture(entity.getTenhanshaPrefecture());
        dto.setTenhanshaAddress1(entity.getTenhanshaAddress1());
        dto.setTenhanshaAddress2(entity.getTenhanshaAddress2());
        dto.setTenhanshaTelNo(entity.getTenhanshaTelNo());
        dto.setTenhanshaFaxNo(entity.getTenhanshaFaxNo());
        dto.setPlantNormal(entity.getPlantNormal());
        dto.setPlantDeposit(entity.getPlantDeposit());
        dto.setLpSendFlg(entity.getLpSendFlg());
        dto.setWmsSendFlg(entity.getWmsSendFlg());
        dto.setSpareStr(entity.getSpareStr());
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
        if (!_suppressMBaseSalesOrgList && !entity.getMBaseSalesOrgList().isEmpty()) {
            MBaseSalesOrgDtoMapper mapper = new MBaseSalesOrgDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMSalesOrg();
            List<MBaseSalesOrgDto> relationDtoList = mapper.mappingToDtoList(entity.getMBaseSalesOrgList());
            dto.setMBaseSalesOrgList(relationDtoList);
            if (reverseReference) {
                for (MBaseSalesOrgDto relationDto : relationDtoList) {
                    relationDto.setMSalesOrg(dto);
                }
            }
        };
        if (!_suppressMCarrierDecisionList && !entity.getMCarrierDecisionList().isEmpty()) {
            MCarrierDecisionDtoMapper mapper = new MCarrierDecisionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMSalesOrg();
            List<MCarrierDecisionDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierDecisionList());
            dto.setMCarrierDecisionList(relationDtoList);
            if (reverseReference) {
                for (MCarrierDecisionDto relationDto : relationDtoList) {
                    relationDto.setMSalesOrg(dto);
                }
            }
        };
        if (!_suppressMCustomerPickingList && !entity.getMCustomerPickingList().isEmpty()) {
            MCustomerPickingDtoMapper mapper = new MCustomerPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMSalesOrg();
            List<MCustomerPickingDto> relationDtoList = mapper.mappingToDtoList(entity.getMCustomerPickingList());
            dto.setMCustomerPickingList(relationDtoList);
            if (reverseReference) {
                for (MCustomerPickingDto relationDto : relationDtoList) {
                    relationDto.setMSalesOrg(dto);
                }
            }
        };
        if (!_suppressMDepositProductList && !entity.getMDepositProductList().isEmpty()) {
            MDepositProductDtoMapper mapper = new MDepositProductDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMSalesOrg();
            List<MDepositProductDto> relationDtoList = mapper.mappingToDtoList(entity.getMDepositProductList());
            dto.setMDepositProductList(relationDtoList);
            if (reverseReference) {
                for (MDepositProductDto relationDto : relationDtoList) {
                    relationDto.setMSalesOrg(dto);
                }
            }
        };
        if (!_suppressMKoguchiDeliveryList && !entity.getMKoguchiDeliveryList().isEmpty()) {
            MKoguchiDeliveryDtoMapper mapper = new MKoguchiDeliveryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMSalesOrg();
            List<MKoguchiDeliveryDto> relationDtoList = mapper.mappingToDtoList(entity.getMKoguchiDeliveryList());
            dto.setMKoguchiDeliveryList(relationDtoList);
            if (reverseReference) {
                for (MKoguchiDeliveryDto relationDto : relationDtoList) {
                    relationDto.setMSalesOrg(dto);
                }
            }
        };
        if (!_suppressTInventoryBList && !entity.getTInventoryBList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMSalesOrg();
            List<TInventoryBDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryBList());
            dto.setTInventoryBList(relationDtoList);
            if (reverseReference) {
                for (TInventoryBDto relationDto : relationDtoList) {
                    relationDto.setMSalesOrg(dto);
                }
            }
        };
        if (!_suppressTShippingInstHBySalesOrgList && !entity.getTShippingInstHBySalesOrgList().isEmpty()) {
            TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMSalesOrgBySalesOrg();
            List<TShippingInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTShippingInstHBySalesOrgList());
            dto.setTShippingInstHBySalesOrgList(relationDtoList);
            if (reverseReference) {
                for (TShippingInstHDto relationDto : relationDtoList) {
                    relationDto.setMSalesOrgBySalesOrg(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MSalesOrgDto> mappingToDtoList(List<MSalesOrg> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MSalesOrgDto> dtoList = new ArrayList<MSalesOrgDto>();
        for (MSalesOrg entity : entityList) {
            MSalesOrgDto dto = mappingToDto(entity);
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
    public MSalesOrg mappingToEntity(MSalesOrgDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MSalesOrg)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MSalesOrg entity = new MSalesOrg();
        if (needsMapping(dto, dto.getSalesOrgId(), "salesOrgId")) {
            entity.setSalesOrgId(dto.getSalesOrgId());
        }
        if (needsMapping(dto, dto.getSalesOrgCd(), "salesOrgCd")) {
            entity.setSalesOrgCd(dto.getSalesOrgCd());
        }
        if (needsMapping(dto, dto.getPurchaseOrgCd(), "purchaseOrgCd")) {
            entity.setPurchaseOrgCd(dto.getPurchaseOrgCd());
        }
        if (needsMapping(dto, dto.getTenhanshaCd(), "tenhanshaCd")) {
            entity.setTenhanshaCd(dto.getTenhanshaCd());
        }
        if (needsMapping(dto, dto.getTenhanshaNm1(), "tenhanshaNm1")) {
            entity.setTenhanshaNm1(dto.getTenhanshaNm1());
        }
        if (needsMapping(dto, dto.getTenhanshaNm2(), "tenhanshaNm2")) {
            entity.setTenhanshaNm2(dto.getTenhanshaNm2());
        }
        if (needsMapping(dto, dto.getTenhanshaZipCd(), "tenhanshaZipCd")) {
            entity.setTenhanshaZipCd(dto.getTenhanshaZipCd());
        }
        if (needsMapping(dto, dto.getTenhanshaPrefecture(), "tenhanshaPrefecture")) {
            entity.setTenhanshaPrefecture(dto.getTenhanshaPrefecture());
        }
        if (needsMapping(dto, dto.getTenhanshaAddress1(), "tenhanshaAddress1")) {
            entity.setTenhanshaAddress1(dto.getTenhanshaAddress1());
        }
        if (needsMapping(dto, dto.getTenhanshaAddress2(), "tenhanshaAddress2")) {
            entity.setTenhanshaAddress2(dto.getTenhanshaAddress2());
        }
        if (needsMapping(dto, dto.getTenhanshaTelNo(), "tenhanshaTelNo")) {
            entity.setTenhanshaTelNo(dto.getTenhanshaTelNo());
        }
        if (needsMapping(dto, dto.getTenhanshaFaxNo(), "tenhanshaFaxNo")) {
            entity.setTenhanshaFaxNo(dto.getTenhanshaFaxNo());
        }
        if (needsMapping(dto, dto.getPlantNormal(), "plantNormal")) {
            entity.setPlantNormal(dto.getPlantNormal());
        }
        if (needsMapping(dto, dto.getPlantDeposit(), "plantDeposit")) {
            entity.setPlantDeposit(dto.getPlantDeposit());
        }
        if (needsMapping(dto, dto.getLpSendFlg(), "lpSendFlg")) {
            entity.setLpSendFlg(dto.getLpSendFlg());
        }
        if (needsMapping(dto, dto.getWmsSendFlg(), "wmsSendFlg")) {
            entity.setWmsSendFlg(dto.getWmsSendFlg());
        }
        if (needsMapping(dto, dto.getSpareStr(), "spareStr")) {
            entity.setSpareStr(dto.getSpareStr());
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
        if (!_suppressMBaseSalesOrgList && !dto.getMBaseSalesOrgList().isEmpty()) {
            MBaseSalesOrgDtoMapper mapper = new MBaseSalesOrgDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMSalesOrg();
            List<MBaseSalesOrg> relationEntityList = mapper.mappingToEntityList(dto.getMBaseSalesOrgList());
            entity.setMBaseSalesOrgList(relationEntityList);
            if (reverseReference) {
                for (MBaseSalesOrg relationEntity : relationEntityList) {
                    relationEntity.setMSalesOrg(entity);
                }
            }
        };
        if (!_suppressMCarrierDecisionList && !dto.getMCarrierDecisionList().isEmpty()) {
            MCarrierDecisionDtoMapper mapper = new MCarrierDecisionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMSalesOrg();
            List<MCarrierDecision> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierDecisionList());
            entity.setMCarrierDecisionList(relationEntityList);
            if (reverseReference) {
                for (MCarrierDecision relationEntity : relationEntityList) {
                    relationEntity.setMSalesOrg(entity);
                }
            }
        };
        if (!_suppressMCustomerPickingList && !dto.getMCustomerPickingList().isEmpty()) {
            MCustomerPickingDtoMapper mapper = new MCustomerPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMSalesOrg();
            List<MCustomerPicking> relationEntityList = mapper.mappingToEntityList(dto.getMCustomerPickingList());
            entity.setMCustomerPickingList(relationEntityList);
            if (reverseReference) {
                for (MCustomerPicking relationEntity : relationEntityList) {
                    relationEntity.setMSalesOrg(entity);
                }
            }
        };
        if (!_suppressMDepositProductList && !dto.getMDepositProductList().isEmpty()) {
            MDepositProductDtoMapper mapper = new MDepositProductDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMSalesOrg();
            List<MDepositProduct> relationEntityList = mapper.mappingToEntityList(dto.getMDepositProductList());
            entity.setMDepositProductList(relationEntityList);
            if (reverseReference) {
                for (MDepositProduct relationEntity : relationEntityList) {
                    relationEntity.setMSalesOrg(entity);
                }
            }
        };
        if (!_suppressMKoguchiDeliveryList && !dto.getMKoguchiDeliveryList().isEmpty()) {
            MKoguchiDeliveryDtoMapper mapper = new MKoguchiDeliveryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMSalesOrg();
            List<MKoguchiDelivery> relationEntityList = mapper.mappingToEntityList(dto.getMKoguchiDeliveryList());
            entity.setMKoguchiDeliveryList(relationEntityList);
            if (reverseReference) {
                for (MKoguchiDelivery relationEntity : relationEntityList) {
                    relationEntity.setMSalesOrg(entity);
                }
            }
        };
        if (!_suppressTInventoryBList && !dto.getTInventoryBList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMSalesOrg();
            List<TInventoryB> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryBList());
            entity.setTInventoryBList(relationEntityList);
            if (reverseReference) {
                for (TInventoryB relationEntity : relationEntityList) {
                    relationEntity.setMSalesOrg(entity);
                }
            }
        };
        if (!_suppressTShippingInstHBySalesOrgList && !dto.getTShippingInstHBySalesOrgList().isEmpty()) {
            TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMSalesOrgBySalesOrg();
            List<TShippingInstH> relationEntityList = mapper.mappingToEntityList(dto.getTShippingInstHBySalesOrgList());
            entity.setTShippingInstHBySalesOrgList(relationEntityList);
            if (reverseReference) {
                for (TShippingInstH relationEntity : relationEntityList) {
                    relationEntity.setMSalesOrgBySalesOrg(entity);
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
    protected boolean needsMapping(MSalesOrgDto dto, Object value, String propName) {
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
    public List<MSalesOrg> mappingToEntityList(List<MSalesOrgDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MSalesOrg> entityList = new ArrayList<MSalesOrg>();
        for (MSalesOrgDto dto : dtoList) {
            MSalesOrg entity = mappingToEntity(dto);
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
    public void suppressMBaseSalesOrgList() {
        _suppressMBaseSalesOrgList = true;
    }
    public void suppressMCarrierDecisionList() {
        _suppressMCarrierDecisionList = true;
    }
    public void suppressMCustomerPickingList() {
        _suppressMCustomerPickingList = true;
    }
    public void suppressMDepositProductList() {
        _suppressMDepositProductList = true;
    }
    public void suppressMKoguchiDeliveryList() {
        _suppressMKoguchiDeliveryList = true;
    }
    public void suppressTInventoryBList() {
        _suppressTInventoryBList = true;
    }
    public void suppressTShippingInstHBySalesOrgList() {
        _suppressTShippingInstHBySalesOrgList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMBaseSalesOrgList();
        suppressMCarrierDecisionList();
        suppressMCustomerPickingList();
        suppressMDepositProductList();
        suppressMKoguchiDeliveryList();
        suppressTInventoryBList();
        suppressTShippingInstHBySalesOrgList();
    }
    protected void doSuppressClear() { // internal
        _suppressMBaseSalesOrgList = false;
        _suppressMCarrierDecisionList = false;
        _suppressMCustomerPickingList = false;
        _suppressMDepositProductList = false;
        _suppressMKoguchiDeliveryList = false;
        _suppressTInventoryBList = false;
        _suppressTShippingInstHBySalesOrgList = false;
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
    public MSalesOrgDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MSalesOrgDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MSalesOrgDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MSalesOrgDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MSalesOrgDtoMapper reverseReference() {
        setReverseReference(true);
        return (MSalesOrgDtoMapper)this;
    }
}
