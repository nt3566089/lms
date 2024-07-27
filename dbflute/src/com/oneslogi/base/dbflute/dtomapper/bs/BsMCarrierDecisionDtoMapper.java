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
 * The DTO mapper of m_carrier_decision as TABLE. <br>
 * 運送業者決定マスタ
 * <pre>
 * [primary-key]
 *     CARRIER_DECISION_ID
 *
 * [column]
 *     CARRIER_DECISION_ID, CENTER_CD, ZIP_CD, SALES_ORG_ID, SALES_ORG_CD, CUSTOMER_ID, CUSTOMER_CD, DIRECT_KOHAI_TYPE_CD, PREFECTURE, CARRIER_ID, CARRIER_CD, CARRIER_ID1, CARRIER_CD1, CARRIER_ID2, CARRIER_CD2, CARRIER_ID3, CARRIER_CD3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_DECISION_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_customer, m_carrier, m_sales_org
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCustomer, mCarrierByCarrierId2, mCarrierByCarrierId1, mCarrierByCarrierId3, mCarrierByCarrierId, mSalesOrg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCarrierDecisionDtoMapper implements DtoMapper<MCarrierDecision, MCarrierDecisionDto>, Serializable {

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
    protected boolean _suppressMCustomer;
    protected boolean _suppressMCarrierByCarrierId2;
    protected boolean _suppressMCarrierByCarrierId1;
    protected boolean _suppressMCarrierByCarrierId3;
    protected boolean _suppressMCarrierByCarrierId;
    protected boolean _suppressMSalesOrg;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierDecisionDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMCarrierDecisionDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MCarrierDecisionDto mappingToDto(MCarrierDecision entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MCarrierDecisionDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCarrierDecisionDto dto = new MCarrierDecisionDto();
        dto.setCarrierDecisionId(entity.getCarrierDecisionId());
        dto.setCenterCd(entity.getCenterCd());
        dto.setZipCd(entity.getZipCd());
        dto.setSalesOrgId(entity.getSalesOrgId());
        dto.setSalesOrgCd(entity.getSalesOrgCd());
        dto.setCustomerId(entity.getCustomerId());
        dto.setCustomerCd(entity.getCustomerCd());
        dto.setDirectKohaiTypeCd(entity.getDirectKohaiTypeCd());
        dto.setPrefecture(entity.getPrefecture());
        dto.setCarrierId(entity.getCarrierId());
        dto.setCarrierCd(entity.getCarrierCd());
        dto.setCarrierId1(entity.getCarrierId1());
        dto.setCarrierCd1(entity.getCarrierCd1());
        dto.setCarrierId2(entity.getCarrierId2());
        dto.setCarrierCd2(entity.getCarrierCd2());
        dto.setCarrierId3(entity.getCarrierId3());
        dto.setCarrierCd3(entity.getCarrierCd3());
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
        if (!_suppressMCustomer && entity.getMCustomer() != null) {
            MCustomer relationEntity = entity.getMCustomer();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCustomerDto relationDto = (MCustomerDto)cachedDto;
                dto.setMCustomer(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierDecisionList().add(dto);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierDecisionList();
                MCustomerDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCustomer(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierDecisionList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCustomer());
                }
            }
        };
        if (!_suppressMCarrierByCarrierId2 && entity.getMCarrierByCarrierId2() != null) {
            MCarrier relationEntity = entity.getMCarrierByCarrierId2();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCarrierDto relationDto = (MCarrierDto)cachedDto;
                dto.setMCarrierByCarrierId2(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierDecisionByCarrierId2List().add(dto);
                }
            } else {
                MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierDecisionByCarrierId2List();
                MCarrierDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCarrierByCarrierId2(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierDecisionByCarrierId2List().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCarrierByCarrierId2());
                }
            }
        };
        if (!_suppressMCarrierByCarrierId1 && entity.getMCarrierByCarrierId1() != null) {
            MCarrier relationEntity = entity.getMCarrierByCarrierId1();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCarrierDto relationDto = (MCarrierDto)cachedDto;
                dto.setMCarrierByCarrierId1(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierDecisionByCarrierId1List().add(dto);
                }
            } else {
                MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierDecisionByCarrierId1List();
                MCarrierDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCarrierByCarrierId1(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierDecisionByCarrierId1List().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCarrierByCarrierId1());
                }
            }
        };
        if (!_suppressMCarrierByCarrierId3 && entity.getMCarrierByCarrierId3() != null) {
            MCarrier relationEntity = entity.getMCarrierByCarrierId3();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCarrierDto relationDto = (MCarrierDto)cachedDto;
                dto.setMCarrierByCarrierId3(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierDecisionByCarrierId3List().add(dto);
                }
            } else {
                MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierDecisionByCarrierId3List();
                MCarrierDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCarrierByCarrierId3(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierDecisionByCarrierId3List().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCarrierByCarrierId3());
                }
            }
        };
        if (!_suppressMCarrierByCarrierId && entity.getMCarrierByCarrierId() != null) {
            MCarrier relationEntity = entity.getMCarrierByCarrierId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCarrierDto relationDto = (MCarrierDto)cachedDto;
                dto.setMCarrierByCarrierId(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierDecisionByCarrierIdList().add(dto);
                }
            } else {
                MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierDecisionByCarrierIdList();
                MCarrierDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCarrierByCarrierId(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierDecisionByCarrierIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCarrierByCarrierId());
                }
            }
        };
        if (!_suppressMSalesOrg && entity.getMSalesOrg() != null) {
            MSalesOrg relationEntity = entity.getMSalesOrg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MSalesOrgDto relationDto = (MSalesOrgDto)cachedDto;
                dto.setMSalesOrg(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierDecisionList().add(dto);
                }
            } else {
                MSalesOrgDtoMapper mapper = new MSalesOrgDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierDecisionList();
                MSalesOrgDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMSalesOrg(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierDecisionList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMSalesOrg());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MCarrierDecisionDto> mappingToDtoList(List<MCarrierDecision> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MCarrierDecisionDto> dtoList = new ArrayList<MCarrierDecisionDto>();
        for (MCarrierDecision entity : entityList) {
            MCarrierDecisionDto dto = mappingToDto(entity);
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
    public MCarrierDecision mappingToEntity(MCarrierDecisionDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MCarrierDecision)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCarrierDecision entity = new MCarrierDecision();
        if (needsMapping(dto, dto.getCarrierDecisionId(), "carrierDecisionId")) {
            entity.setCarrierDecisionId(dto.getCarrierDecisionId());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getZipCd(), "zipCd")) {
            entity.setZipCd(dto.getZipCd());
        }
        if (needsMapping(dto, dto.getSalesOrgId(), "salesOrgId")) {
            entity.setSalesOrgId(dto.getSalesOrgId());
        }
        if (needsMapping(dto, dto.getSalesOrgCd(), "salesOrgCd")) {
            entity.setSalesOrgCd(dto.getSalesOrgCd());
        }
        if (needsMapping(dto, dto.getCustomerId(), "customerId")) {
            entity.setCustomerId(dto.getCustomerId());
        }
        if (needsMapping(dto, dto.getCustomerCd(), "customerCd")) {
            entity.setCustomerCd(dto.getCustomerCd());
        }
        if (needsMapping(dto, dto.getDirectKohaiTypeCd(), "directKohaiTypeCd")) {
            entity.setDirectKohaiTypeCd(dto.getDirectKohaiTypeCd());
        }
        if (needsMapping(dto, dto.getPrefecture(), "prefecture")) {
            entity.setPrefecture(dto.getPrefecture());
        }
        if (needsMapping(dto, dto.getCarrierId(), "carrierId")) {
            entity.setCarrierId(dto.getCarrierId());
        }
        if (needsMapping(dto, dto.getCarrierCd(), "carrierCd")) {
            entity.setCarrierCd(dto.getCarrierCd());
        }
        if (needsMapping(dto, dto.getCarrierId1(), "carrierId1")) {
            entity.setCarrierId1(dto.getCarrierId1());
        }
        if (needsMapping(dto, dto.getCarrierCd1(), "carrierCd1")) {
            entity.setCarrierCd1(dto.getCarrierCd1());
        }
        if (needsMapping(dto, dto.getCarrierId2(), "carrierId2")) {
            entity.setCarrierId2(dto.getCarrierId2());
        }
        if (needsMapping(dto, dto.getCarrierCd2(), "carrierCd2")) {
            entity.setCarrierCd2(dto.getCarrierCd2());
        }
        if (needsMapping(dto, dto.getCarrierId3(), "carrierId3")) {
            entity.setCarrierId3(dto.getCarrierId3());
        }
        if (needsMapping(dto, dto.getCarrierCd3(), "carrierCd3")) {
            entity.setCarrierCd3(dto.getCarrierCd3());
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
        if (!_suppressMCustomer && dto.getMCustomer() != null) {
            MCustomerDto relationDto = dto.getMCustomer();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCustomer relationEntity = (MCustomer)cachedEntity;
                entity.setMCustomer(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierDecisionList().add(entity);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierDecisionList();
                MCustomer relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCustomer(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierDecisionList().add(entity);
                }
                if (instanceCache && entity.getMCustomer().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCustomer());
                }
            }
        };
        if (!_suppressMCarrierByCarrierId2 && dto.getMCarrierByCarrierId2() != null) {
            MCarrierDto relationDto = dto.getMCarrierByCarrierId2();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCarrier relationEntity = (MCarrier)cachedEntity;
                entity.setMCarrierByCarrierId2(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierDecisionByCarrierId2List().add(entity);
                }
            } else {
                MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierDecisionByCarrierId2List();
                MCarrier relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCarrierByCarrierId2(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierDecisionByCarrierId2List().add(entity);
                }
                if (instanceCache && entity.getMCarrierByCarrierId2().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCarrierByCarrierId2());
                }
            }
        };
        if (!_suppressMCarrierByCarrierId1 && dto.getMCarrierByCarrierId1() != null) {
            MCarrierDto relationDto = dto.getMCarrierByCarrierId1();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCarrier relationEntity = (MCarrier)cachedEntity;
                entity.setMCarrierByCarrierId1(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierDecisionByCarrierId1List().add(entity);
                }
            } else {
                MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierDecisionByCarrierId1List();
                MCarrier relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCarrierByCarrierId1(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierDecisionByCarrierId1List().add(entity);
                }
                if (instanceCache && entity.getMCarrierByCarrierId1().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCarrierByCarrierId1());
                }
            }
        };
        if (!_suppressMCarrierByCarrierId3 && dto.getMCarrierByCarrierId3() != null) {
            MCarrierDto relationDto = dto.getMCarrierByCarrierId3();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCarrier relationEntity = (MCarrier)cachedEntity;
                entity.setMCarrierByCarrierId3(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierDecisionByCarrierId3List().add(entity);
                }
            } else {
                MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierDecisionByCarrierId3List();
                MCarrier relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCarrierByCarrierId3(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierDecisionByCarrierId3List().add(entity);
                }
                if (instanceCache && entity.getMCarrierByCarrierId3().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCarrierByCarrierId3());
                }
            }
        };
        if (!_suppressMCarrierByCarrierId && dto.getMCarrierByCarrierId() != null) {
            MCarrierDto relationDto = dto.getMCarrierByCarrierId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCarrier relationEntity = (MCarrier)cachedEntity;
                entity.setMCarrierByCarrierId(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierDecisionByCarrierIdList().add(entity);
                }
            } else {
                MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierDecisionByCarrierIdList();
                MCarrier relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCarrierByCarrierId(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierDecisionByCarrierIdList().add(entity);
                }
                if (instanceCache && entity.getMCarrierByCarrierId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCarrierByCarrierId());
                }
            }
        };
        if (!_suppressMSalesOrg && dto.getMSalesOrg() != null) {
            MSalesOrgDto relationDto = dto.getMSalesOrg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MSalesOrg relationEntity = (MSalesOrg)cachedEntity;
                entity.setMSalesOrg(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierDecisionList().add(entity);
                }
            } else {
                MSalesOrgDtoMapper mapper = new MSalesOrgDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierDecisionList();
                MSalesOrg relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMSalesOrg(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierDecisionList().add(entity);
                }
                if (instanceCache && entity.getMSalesOrg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMSalesOrg());
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
    protected boolean needsMapping(MCarrierDecisionDto dto, Object value, String propName) {
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
    public List<MCarrierDecision> mappingToEntityList(List<MCarrierDecisionDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MCarrierDecision> entityList = new ArrayList<MCarrierDecision>();
        for (MCarrierDecisionDto dto : dtoList) {
            MCarrierDecision entity = mappingToEntity(dto);
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
    public void suppressMCustomer() {
        _suppressMCustomer = true;
    }
    public void suppressMCarrierByCarrierId2() {
        _suppressMCarrierByCarrierId2 = true;
    }
    public void suppressMCarrierByCarrierId1() {
        _suppressMCarrierByCarrierId1 = true;
    }
    public void suppressMCarrierByCarrierId3() {
        _suppressMCarrierByCarrierId3 = true;
    }
    public void suppressMCarrierByCarrierId() {
        _suppressMCarrierByCarrierId = true;
    }
    public void suppressMSalesOrg() {
        _suppressMSalesOrg = true;
    }
    protected void doSuppressAll() { // internal
        suppressMCustomer();
        suppressMCarrierByCarrierId2();
        suppressMCarrierByCarrierId1();
        suppressMCarrierByCarrierId3();
        suppressMCarrierByCarrierId();
        suppressMSalesOrg();
    }
    protected void doSuppressClear() { // internal
        _suppressMCustomer = false;
        _suppressMCarrierByCarrierId2 = false;
        _suppressMCarrierByCarrierId1 = false;
        _suppressMCarrierByCarrierId3 = false;
        _suppressMCarrierByCarrierId = false;
        _suppressMSalesOrg = false;
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
    public MCarrierDecisionDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MCarrierDecisionDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MCarrierDecisionDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MCarrierDecisionDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MCarrierDecisionDtoMapper reverseReference() {
        setReverseReference(true);
        return (MCarrierDecisionDtoMapper)this;
    }
}
