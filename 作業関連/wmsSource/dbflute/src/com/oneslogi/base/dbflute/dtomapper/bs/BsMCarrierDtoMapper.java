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
 * The DTO mapper of m_carrier as TABLE. <br>
 * センタ運送業者マスタ
 * <pre>
 * [primary-key]
 *     CARRIER_ID
 *
 * [column]
 *     CARRIER_ID, CENTER_ID, COMMON_CARRIER_ID, CARRIER_CD, CARRIER_NM, CARRIER_ABBR, LARGE_ITEM_HADLING_FLG, HEAVY_ITEM_HADLING_FLG, HOLIDAY_CARRIER_FLG, OKINAWA_FLIGHT_FLG, BASE_DEFAULT_CARRIER_FLG, INSURANCE_CARRIER_CD, SLIP_TYPE_CD, BASE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_center, m_common_carrier, b_class_dtl(ByDelFlg)
 *
 * [referrer-table]
 *     m_base_sales_org, m_carrier_box, m_carrier_decision, m_delivery_course, m_koguchi_delivery
 *
 * [foreign-property]
 *     mCenter, mCommonCarrier, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     mBaseSalesOrgList, mCarrierBoxList, mCarrierDecisionByCarrierId2List, mCarrierDecisionByCarrierId1List, mCarrierDecisionByCarrierId3List, mCarrierDecisionByCarrierIdList, mDeliveryCourseList, mKoguchiDeliveryList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCarrierDtoMapper implements DtoMapper<MCarrier, MCarrierDto>, Serializable {

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
    protected boolean _suppressMCenter;
    protected boolean _suppressMCommonCarrier;
    protected boolean _suppressBClassDtlByDelFlg;
    protected boolean _suppressMBaseSalesOrgList;
    protected boolean _suppressMCarrierBoxList;
    protected boolean _suppressMCarrierDecisionByCarrierId2List;
    protected boolean _suppressMCarrierDecisionByCarrierId1List;
    protected boolean _suppressMCarrierDecisionByCarrierId3List;
    protected boolean _suppressMCarrierDecisionByCarrierIdList;
    protected boolean _suppressMDeliveryCourseList;
    protected boolean _suppressMKoguchiDeliveryList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMCarrierDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MCarrierDto mappingToDto(MCarrier entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MCarrierDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCarrierDto dto = new MCarrierDto();
        dto.setCarrierId(entity.getCarrierId());
        dto.setCenterId(entity.getCenterId());
        dto.setCommonCarrierId(entity.getCommonCarrierId());
        dto.setCarrierCd(entity.getCarrierCd());
        dto.setCarrierNm(entity.getCarrierNm());
        dto.setCarrierAbbr(entity.getCarrierAbbr());
        dto.setLargeItemHadlingFlg(entity.getLargeItemHadlingFlg());
        dto.setHeavyItemHadlingFlg(entity.getHeavyItemHadlingFlg());
        dto.setHolidayCarrierFlg(entity.getHolidayCarrierFlg());
        dto.setOkinawaFlightFlg(entity.getOkinawaFlightFlg());
        dto.setBaseDefaultCarrierFlg(entity.getBaseDefaultCarrierFlg());
        dto.setInsuranceCarrierCd(entity.getInsuranceCarrierCd());
        dto.setSlipTypeCd(entity.getSlipTypeCd());
        dto.setBaseCd(entity.getBaseCd());
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
        if (!_suppressMCenter && entity.getMCenter() != null) {
            MCenter relationEntity = entity.getMCenter();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterDto relationDto = (MCenterDto)cachedDto;
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenter());
                }
            }
        };
        if (!_suppressMCommonCarrier && entity.getMCommonCarrier() != null) {
            MCommonCarrier relationEntity = entity.getMCommonCarrier();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCommonCarrierDto relationDto = (MCommonCarrierDto)cachedDto;
                dto.setMCommonCarrier(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierList().add(dto);
                }
            } else {
                MCommonCarrierDtoMapper mapper = new MCommonCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierList();
                MCommonCarrierDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCommonCarrier(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCommonCarrier());
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
        if (!_suppressMBaseSalesOrgList && !entity.getMBaseSalesOrgList().isEmpty()) {
            MBaseSalesOrgDtoMapper mapper = new MBaseSalesOrgDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrier();
            List<MBaseSalesOrgDto> relationDtoList = mapper.mappingToDtoList(entity.getMBaseSalesOrgList());
            dto.setMBaseSalesOrgList(relationDtoList);
            if (reverseReference) {
                for (MBaseSalesOrgDto relationDto : relationDtoList) {
                    relationDto.setMCarrier(dto);
                }
            }
        };
        if (!_suppressMCarrierBoxList && !entity.getMCarrierBoxList().isEmpty()) {
            MCarrierBoxDtoMapper mapper = new MCarrierBoxDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrier();
            List<MCarrierBoxDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierBoxList());
            dto.setMCarrierBoxList(relationDtoList);
            if (reverseReference) {
                for (MCarrierBoxDto relationDto : relationDtoList) {
                    relationDto.setMCarrier(dto);
                }
            }
        };
        if (!_suppressMCarrierDecisionByCarrierId2List && !entity.getMCarrierDecisionByCarrierId2List().isEmpty()) {
            MCarrierDecisionDtoMapper mapper = new MCarrierDecisionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrierByCarrierId2();
            List<MCarrierDecisionDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierDecisionByCarrierId2List());
            dto.setMCarrierDecisionByCarrierId2List(relationDtoList);
            if (reverseReference) {
                for (MCarrierDecisionDto relationDto : relationDtoList) {
                    relationDto.setMCarrierByCarrierId2(dto);
                }
            }
        };
        if (!_suppressMCarrierDecisionByCarrierId1List && !entity.getMCarrierDecisionByCarrierId1List().isEmpty()) {
            MCarrierDecisionDtoMapper mapper = new MCarrierDecisionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrierByCarrierId1();
            List<MCarrierDecisionDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierDecisionByCarrierId1List());
            dto.setMCarrierDecisionByCarrierId1List(relationDtoList);
            if (reverseReference) {
                for (MCarrierDecisionDto relationDto : relationDtoList) {
                    relationDto.setMCarrierByCarrierId1(dto);
                }
            }
        };
        if (!_suppressMCarrierDecisionByCarrierId3List && !entity.getMCarrierDecisionByCarrierId3List().isEmpty()) {
            MCarrierDecisionDtoMapper mapper = new MCarrierDecisionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrierByCarrierId3();
            List<MCarrierDecisionDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierDecisionByCarrierId3List());
            dto.setMCarrierDecisionByCarrierId3List(relationDtoList);
            if (reverseReference) {
                for (MCarrierDecisionDto relationDto : relationDtoList) {
                    relationDto.setMCarrierByCarrierId3(dto);
                }
            }
        };
        if (!_suppressMCarrierDecisionByCarrierIdList && !entity.getMCarrierDecisionByCarrierIdList().isEmpty()) {
            MCarrierDecisionDtoMapper mapper = new MCarrierDecisionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrierByCarrierId();
            List<MCarrierDecisionDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierDecisionByCarrierIdList());
            dto.setMCarrierDecisionByCarrierIdList(relationDtoList);
            if (reverseReference) {
                for (MCarrierDecisionDto relationDto : relationDtoList) {
                    relationDto.setMCarrierByCarrierId(dto);
                }
            }
        };
        if (!_suppressMDeliveryCourseList && !entity.getMDeliveryCourseList().isEmpty()) {
            MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrier();
            List<MDeliveryCourseDto> relationDtoList = mapper.mappingToDtoList(entity.getMDeliveryCourseList());
            dto.setMDeliveryCourseList(relationDtoList);
            if (reverseReference) {
                for (MDeliveryCourseDto relationDto : relationDtoList) {
                    relationDto.setMCarrier(dto);
                }
            }
        };
        if (!_suppressMKoguchiDeliveryList && !entity.getMKoguchiDeliveryList().isEmpty()) {
            MKoguchiDeliveryDtoMapper mapper = new MKoguchiDeliveryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrier();
            List<MKoguchiDeliveryDto> relationDtoList = mapper.mappingToDtoList(entity.getMKoguchiDeliveryList());
            dto.setMKoguchiDeliveryList(relationDtoList);
            if (reverseReference) {
                for (MKoguchiDeliveryDto relationDto : relationDtoList) {
                    relationDto.setMCarrier(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MCarrierDto> mappingToDtoList(List<MCarrier> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MCarrierDto> dtoList = new ArrayList<MCarrierDto>();
        for (MCarrier entity : entityList) {
            MCarrierDto dto = mappingToDto(entity);
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
    public MCarrier mappingToEntity(MCarrierDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MCarrier)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCarrier entity = new MCarrier();
        if (needsMapping(dto, dto.getCarrierId(), "carrierId")) {
            entity.setCarrierId(dto.getCarrierId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getCommonCarrierId(), "commonCarrierId")) {
            entity.setCommonCarrierId(dto.getCommonCarrierId());
        }
        if (needsMapping(dto, dto.getCarrierCd(), "carrierCd")) {
            entity.setCarrierCd(dto.getCarrierCd());
        }
        if (needsMapping(dto, dto.getCarrierNm(), "carrierNm")) {
            entity.setCarrierNm(dto.getCarrierNm());
        }
        if (needsMapping(dto, dto.getCarrierAbbr(), "carrierAbbr")) {
            entity.setCarrierAbbr(dto.getCarrierAbbr());
        }
        if (needsMapping(dto, dto.getLargeItemHadlingFlg(), "largeItemHadlingFlg")) {
            entity.setLargeItemHadlingFlg(dto.getLargeItemHadlingFlg());
        }
        if (needsMapping(dto, dto.getHeavyItemHadlingFlg(), "heavyItemHadlingFlg")) {
            entity.setHeavyItemHadlingFlg(dto.getHeavyItemHadlingFlg());
        }
        if (needsMapping(dto, dto.getHolidayCarrierFlg(), "holidayCarrierFlg")) {
            entity.setHolidayCarrierFlg(dto.getHolidayCarrierFlg());
        }
        if (needsMapping(dto, dto.getOkinawaFlightFlg(), "okinawaFlightFlg")) {
            entity.setOkinawaFlightFlg(dto.getOkinawaFlightFlg());
        }
        if (needsMapping(dto, dto.getBaseDefaultCarrierFlg(), "baseDefaultCarrierFlg")) {
            entity.setBaseDefaultCarrierFlg(dto.getBaseDefaultCarrierFlg());
        }
        if (needsMapping(dto, dto.getInsuranceCarrierCd(), "insuranceCarrierCd")) {
            entity.setInsuranceCarrierCd(dto.getInsuranceCarrierCd());
        }
        if (needsMapping(dto, dto.getSlipTypeCd(), "slipTypeCd")) {
            entity.setSlipTypeCd(dto.getSlipTypeCd());
        }
        if (needsMapping(dto, dto.getBaseCd(), "baseCd")) {
            entity.setBaseCd(dto.getBaseCd());
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
        if (!_suppressMCenter && dto.getMCenter() != null) {
            MCenterDto relationDto = dto.getMCenter();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenter relationEntity = (MCenter)cachedEntity;
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierList().add(entity);
                }
                if (instanceCache && entity.getMCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenter());
                }
            }
        };
        if (!_suppressMCommonCarrier && dto.getMCommonCarrier() != null) {
            MCommonCarrierDto relationDto = dto.getMCommonCarrier();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCommonCarrier relationEntity = (MCommonCarrier)cachedEntity;
                entity.setMCommonCarrier(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierList().add(entity);
                }
            } else {
                MCommonCarrierDtoMapper mapper = new MCommonCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierList();
                MCommonCarrier relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCommonCarrier(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierList().add(entity);
                }
                if (instanceCache && entity.getMCommonCarrier().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCommonCarrier());
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
        if (!_suppressMBaseSalesOrgList && !dto.getMBaseSalesOrgList().isEmpty()) {
            MBaseSalesOrgDtoMapper mapper = new MBaseSalesOrgDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrier();
            List<MBaseSalesOrg> relationEntityList = mapper.mappingToEntityList(dto.getMBaseSalesOrgList());
            entity.setMBaseSalesOrgList(relationEntityList);
            if (reverseReference) {
                for (MBaseSalesOrg relationEntity : relationEntityList) {
                    relationEntity.setMCarrier(entity);
                }
            }
        };
        if (!_suppressMCarrierBoxList && !dto.getMCarrierBoxList().isEmpty()) {
            MCarrierBoxDtoMapper mapper = new MCarrierBoxDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrier();
            List<MCarrierBox> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierBoxList());
            entity.setMCarrierBoxList(relationEntityList);
            if (reverseReference) {
                for (MCarrierBox relationEntity : relationEntityList) {
                    relationEntity.setMCarrier(entity);
                }
            }
        };
        if (!_suppressMCarrierDecisionByCarrierId2List && !dto.getMCarrierDecisionByCarrierId2List().isEmpty()) {
            MCarrierDecisionDtoMapper mapper = new MCarrierDecisionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrierByCarrierId2();
            List<MCarrierDecision> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierDecisionByCarrierId2List());
            entity.setMCarrierDecisionByCarrierId2List(relationEntityList);
            if (reverseReference) {
                for (MCarrierDecision relationEntity : relationEntityList) {
                    relationEntity.setMCarrierByCarrierId2(entity);
                }
            }
        };
        if (!_suppressMCarrierDecisionByCarrierId1List && !dto.getMCarrierDecisionByCarrierId1List().isEmpty()) {
            MCarrierDecisionDtoMapper mapper = new MCarrierDecisionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrierByCarrierId1();
            List<MCarrierDecision> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierDecisionByCarrierId1List());
            entity.setMCarrierDecisionByCarrierId1List(relationEntityList);
            if (reverseReference) {
                for (MCarrierDecision relationEntity : relationEntityList) {
                    relationEntity.setMCarrierByCarrierId1(entity);
                }
            }
        };
        if (!_suppressMCarrierDecisionByCarrierId3List && !dto.getMCarrierDecisionByCarrierId3List().isEmpty()) {
            MCarrierDecisionDtoMapper mapper = new MCarrierDecisionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrierByCarrierId3();
            List<MCarrierDecision> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierDecisionByCarrierId3List());
            entity.setMCarrierDecisionByCarrierId3List(relationEntityList);
            if (reverseReference) {
                for (MCarrierDecision relationEntity : relationEntityList) {
                    relationEntity.setMCarrierByCarrierId3(entity);
                }
            }
        };
        if (!_suppressMCarrierDecisionByCarrierIdList && !dto.getMCarrierDecisionByCarrierIdList().isEmpty()) {
            MCarrierDecisionDtoMapper mapper = new MCarrierDecisionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrierByCarrierId();
            List<MCarrierDecision> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierDecisionByCarrierIdList());
            entity.setMCarrierDecisionByCarrierIdList(relationEntityList);
            if (reverseReference) {
                for (MCarrierDecision relationEntity : relationEntityList) {
                    relationEntity.setMCarrierByCarrierId(entity);
                }
            }
        };
        if (!_suppressMDeliveryCourseList && !dto.getMDeliveryCourseList().isEmpty()) {
            MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrier();
            List<MDeliveryCourse> relationEntityList = mapper.mappingToEntityList(dto.getMDeliveryCourseList());
            entity.setMDeliveryCourseList(relationEntityList);
            if (reverseReference) {
                for (MDeliveryCourse relationEntity : relationEntityList) {
                    relationEntity.setMCarrier(entity);
                }
            }
        };
        if (!_suppressMKoguchiDeliveryList && !dto.getMKoguchiDeliveryList().isEmpty()) {
            MKoguchiDeliveryDtoMapper mapper = new MKoguchiDeliveryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrier();
            List<MKoguchiDelivery> relationEntityList = mapper.mappingToEntityList(dto.getMKoguchiDeliveryList());
            entity.setMKoguchiDeliveryList(relationEntityList);
            if (reverseReference) {
                for (MKoguchiDelivery relationEntity : relationEntityList) {
                    relationEntity.setMCarrier(entity);
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
    protected boolean needsMapping(MCarrierDto dto, Object value, String propName) {
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
    public List<MCarrier> mappingToEntityList(List<MCarrierDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MCarrier> entityList = new ArrayList<MCarrier>();
        for (MCarrierDto dto : dtoList) {
            MCarrier entity = mappingToEntity(dto);
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
    public void suppressMCenter() {
        _suppressMCenter = true;
    }
    public void suppressMCommonCarrier() {
        _suppressMCommonCarrier = true;
    }
    public void suppressBClassDtlByDelFlg() {
        _suppressBClassDtlByDelFlg = true;
    }
    public void suppressMBaseSalesOrgList() {
        _suppressMBaseSalesOrgList = true;
    }
    public void suppressMCarrierBoxList() {
        _suppressMCarrierBoxList = true;
    }
    public void suppressMCarrierDecisionByCarrierId2List() {
        _suppressMCarrierDecisionByCarrierId2List = true;
    }
    public void suppressMCarrierDecisionByCarrierId1List() {
        _suppressMCarrierDecisionByCarrierId1List = true;
    }
    public void suppressMCarrierDecisionByCarrierId3List() {
        _suppressMCarrierDecisionByCarrierId3List = true;
    }
    public void suppressMCarrierDecisionByCarrierIdList() {
        _suppressMCarrierDecisionByCarrierIdList = true;
    }
    public void suppressMDeliveryCourseList() {
        _suppressMDeliveryCourseList = true;
    }
    public void suppressMKoguchiDeliveryList() {
        _suppressMKoguchiDeliveryList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMCenter();
        suppressMCommonCarrier();
        suppressBClassDtlByDelFlg();
        suppressMBaseSalesOrgList();
        suppressMCarrierBoxList();
        suppressMCarrierDecisionByCarrierId2List();
        suppressMCarrierDecisionByCarrierId1List();
        suppressMCarrierDecisionByCarrierId3List();
        suppressMCarrierDecisionByCarrierIdList();
        suppressMDeliveryCourseList();
        suppressMKoguchiDeliveryList();
    }
    protected void doSuppressClear() { // internal
        _suppressMCenter = false;
        _suppressMCommonCarrier = false;
        _suppressBClassDtlByDelFlg = false;
        _suppressMBaseSalesOrgList = false;
        _suppressMCarrierBoxList = false;
        _suppressMCarrierDecisionByCarrierId2List = false;
        _suppressMCarrierDecisionByCarrierId1List = false;
        _suppressMCarrierDecisionByCarrierId3List = false;
        _suppressMCarrierDecisionByCarrierIdList = false;
        _suppressMDeliveryCourseList = false;
        _suppressMKoguchiDeliveryList = false;
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
    public MCarrierDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MCarrierDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MCarrierDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MCarrierDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MCarrierDtoMapper reverseReference() {
        setReverseReference(true);
        return (MCarrierDtoMapper)this;
    }
}
