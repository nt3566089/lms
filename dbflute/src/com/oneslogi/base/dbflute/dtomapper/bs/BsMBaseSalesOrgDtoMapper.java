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
 * The DTO mapper of m_base_sales_org as TABLE. <br>
 * 拠点販売組織マスタ
 * <pre>
 * [primary-key]
 *     BASE_SALES_ORG_ID
 *
 * [column]
 *     BASE_SALES_ORG_ID, BASE_CD, SALES_ORG_ID, CARRIER_ID, CARRIER_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BASE_SALES_ORG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_carrier, m_sales_org
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCarrier, mSalesOrg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMBaseSalesOrgDtoMapper implements DtoMapper<MBaseSalesOrg, MBaseSalesOrgDto>, Serializable {

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
    protected boolean _suppressMCarrier;
    protected boolean _suppressMSalesOrg;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMBaseSalesOrgDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMBaseSalesOrgDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MBaseSalesOrgDto mappingToDto(MBaseSalesOrg entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MBaseSalesOrgDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MBaseSalesOrgDto dto = new MBaseSalesOrgDto();
        dto.setBaseSalesOrgId(entity.getBaseSalesOrgId());
        dto.setBaseCd(entity.getBaseCd());
        dto.setSalesOrgId(entity.getSalesOrgId());
        dto.setCarrierId(entity.getCarrierId());
        dto.setCarrierCd(entity.getCarrierCd());
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
        if (!_suppressMCarrier && entity.getMCarrier() != null) {
            MCarrier relationEntity = entity.getMCarrier();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCarrierDto relationDto = (MCarrierDto)cachedDto;
                dto.setMCarrier(relationDto);
                if (reverseReference) {
                    relationDto.getMBaseSalesOrgList().add(dto);
                }
            } else {
                MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMBaseSalesOrgList();
                MCarrierDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCarrier(relationDto);
                if (reverseReference) {
                    relationDto.getMBaseSalesOrgList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCarrier());
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
                    relationDto.getMBaseSalesOrgList().add(dto);
                }
            } else {
                MSalesOrgDtoMapper mapper = new MSalesOrgDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMBaseSalesOrgList();
                MSalesOrgDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMSalesOrg(relationDto);
                if (reverseReference) {
                    relationDto.getMBaseSalesOrgList().add(dto);
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
    public List<MBaseSalesOrgDto> mappingToDtoList(List<MBaseSalesOrg> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MBaseSalesOrgDto> dtoList = new ArrayList<MBaseSalesOrgDto>();
        for (MBaseSalesOrg entity : entityList) {
            MBaseSalesOrgDto dto = mappingToDto(entity);
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
    public MBaseSalesOrg mappingToEntity(MBaseSalesOrgDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MBaseSalesOrg)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MBaseSalesOrg entity = new MBaseSalesOrg();
        if (needsMapping(dto, dto.getBaseSalesOrgId(), "baseSalesOrgId")) {
            entity.setBaseSalesOrgId(dto.getBaseSalesOrgId());
        }
        if (needsMapping(dto, dto.getBaseCd(), "baseCd")) {
            entity.setBaseCd(dto.getBaseCd());
        }
        if (needsMapping(dto, dto.getSalesOrgId(), "salesOrgId")) {
            entity.setSalesOrgId(dto.getSalesOrgId());
        }
        if (needsMapping(dto, dto.getCarrierId(), "carrierId")) {
            entity.setCarrierId(dto.getCarrierId());
        }
        if (needsMapping(dto, dto.getCarrierCd(), "carrierCd")) {
            entity.setCarrierCd(dto.getCarrierCd());
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
        if (!_suppressMCarrier && dto.getMCarrier() != null) {
            MCarrierDto relationDto = dto.getMCarrier();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCarrier relationEntity = (MCarrier)cachedEntity;
                entity.setMCarrier(relationEntity);
                if (reverseReference) {
                    relationEntity.getMBaseSalesOrgList().add(entity);
                }
            } else {
                MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMBaseSalesOrgList();
                MCarrier relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCarrier(relationEntity);
                if (reverseReference) {
                    relationEntity.getMBaseSalesOrgList().add(entity);
                }
                if (instanceCache && entity.getMCarrier().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCarrier());
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
                    relationEntity.getMBaseSalesOrgList().add(entity);
                }
            } else {
                MSalesOrgDtoMapper mapper = new MSalesOrgDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMBaseSalesOrgList();
                MSalesOrg relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMSalesOrg(relationEntity);
                if (reverseReference) {
                    relationEntity.getMBaseSalesOrgList().add(entity);
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
    protected boolean needsMapping(MBaseSalesOrgDto dto, Object value, String propName) {
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
    public List<MBaseSalesOrg> mappingToEntityList(List<MBaseSalesOrgDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MBaseSalesOrg> entityList = new ArrayList<MBaseSalesOrg>();
        for (MBaseSalesOrgDto dto : dtoList) {
            MBaseSalesOrg entity = mappingToEntity(dto);
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
    public void suppressMCarrier() {
        _suppressMCarrier = true;
    }
    public void suppressMSalesOrg() {
        _suppressMSalesOrg = true;
    }
    protected void doSuppressAll() { // internal
        suppressMCarrier();
        suppressMSalesOrg();
    }
    protected void doSuppressClear() { // internal
        _suppressMCarrier = false;
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
    public MBaseSalesOrgDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MBaseSalesOrgDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MBaseSalesOrgDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MBaseSalesOrgDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MBaseSalesOrgDtoMapper reverseReference() {
        setReverseReference(true);
        return (MBaseSalesOrgDtoMapper)this;
    }
}
