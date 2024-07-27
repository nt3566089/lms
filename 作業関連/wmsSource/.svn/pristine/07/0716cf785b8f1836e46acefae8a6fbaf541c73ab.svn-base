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
 * The DTO mapper of t_shipping_inst_data_transfer as TABLE. <br>
 * 出荷IFデータ転送テーブル
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_DATA_TRANSFER_ID, SHIPPING_INST_B_ID
 *
 * [column]
 *     SHIPPING_INST_DATA_TRANSFER_ID, SHIPPING_INST_B_ID, DATA_TRANSFER_ONLY_STR01, DATA_TRANSFER_ONLY_STR02, DATA_TRANSFER_ONLY_STR03, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_DATA_TRANSFER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     t_shipping_inst_b
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tShippingInstB
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTShippingInstDataTransferDtoMapper implements DtoMapper<TShippingInstDataTransfer, TShippingInstDataTransferDto>, Serializable {

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
    protected boolean _suppressTShippingInstB;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTShippingInstDataTransferDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTShippingInstDataTransferDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TShippingInstDataTransferDto mappingToDto(TShippingInstDataTransfer entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TShippingInstDataTransferDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TShippingInstDataTransferDto dto = new TShippingInstDataTransferDto();
        dto.setShippingInstDataTransferId(entity.getShippingInstDataTransferId());
        dto.setShippingInstBId(entity.getShippingInstBId());
        dto.setDataTransferOnlyStr01(entity.getDataTransferOnlyStr01());
        dto.setDataTransferOnlyStr02(entity.getDataTransferOnlyStr02());
        dto.setDataTransferOnlyStr03(entity.getDataTransferOnlyStr03());
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
        if (!_suppressTShippingInstB && entity.getTShippingInstB() != null) {
            TShippingInstB relationEntity = entity.getTShippingInstB();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TShippingInstBDto relationDto = (TShippingInstBDto)cachedDto;
                dto.setTShippingInstB(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstDataTransferList().add(dto);
                }
            } else {
                TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstDataTransferList();
                TShippingInstBDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTShippingInstB(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstDataTransferList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTShippingInstB());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TShippingInstDataTransferDto> mappingToDtoList(List<TShippingInstDataTransfer> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TShippingInstDataTransferDto> dtoList = new ArrayList<TShippingInstDataTransferDto>();
        for (TShippingInstDataTransfer entity : entityList) {
            TShippingInstDataTransferDto dto = mappingToDto(entity);
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
    public TShippingInstDataTransfer mappingToEntity(TShippingInstDataTransferDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TShippingInstDataTransfer)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TShippingInstDataTransfer entity = new TShippingInstDataTransfer();
        if (needsMapping(dto, dto.getShippingInstDataTransferId(), "shippingInstDataTransferId")) {
            entity.setShippingInstDataTransferId(dto.getShippingInstDataTransferId());
        }
        if (needsMapping(dto, dto.getShippingInstBId(), "shippingInstBId")) {
            entity.setShippingInstBId(dto.getShippingInstBId());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr01(), "dataTransferOnlyStr01")) {
            entity.setDataTransferOnlyStr01(dto.getDataTransferOnlyStr01());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr02(), "dataTransferOnlyStr02")) {
            entity.setDataTransferOnlyStr02(dto.getDataTransferOnlyStr02());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr03(), "dataTransferOnlyStr03")) {
            entity.setDataTransferOnlyStr03(dto.getDataTransferOnlyStr03());
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
        if (!_suppressTShippingInstB && dto.getTShippingInstB() != null) {
            TShippingInstBDto relationDto = dto.getTShippingInstB();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TShippingInstB relationEntity = (TShippingInstB)cachedEntity;
                entity.setTShippingInstB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstDataTransferList().add(entity);
                }
            } else {
                TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstDataTransferList();
                TShippingInstB relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTShippingInstB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstDataTransferList().add(entity);
                }
                if (instanceCache && entity.getTShippingInstB().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTShippingInstB());
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
    protected boolean needsMapping(TShippingInstDataTransferDto dto, Object value, String propName) {
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
    public List<TShippingInstDataTransfer> mappingToEntityList(List<TShippingInstDataTransferDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TShippingInstDataTransfer> entityList = new ArrayList<TShippingInstDataTransfer>();
        for (TShippingInstDataTransferDto dto : dtoList) {
            TShippingInstDataTransfer entity = mappingToEntity(dto);
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
    public void suppressTShippingInstB() {
        _suppressTShippingInstB = true;
    }
    protected void doSuppressAll() { // internal
        suppressTShippingInstB();
    }
    protected void doSuppressClear() { // internal
        _suppressTShippingInstB = false;
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
    public TShippingInstDataTransferDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TShippingInstDataTransferDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TShippingInstDataTransferDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TShippingInstDataTransferDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TShippingInstDataTransferDtoMapper reverseReference() {
        setReverseReference(true);
        return (TShippingInstDataTransferDtoMapper)this;
    }
}
