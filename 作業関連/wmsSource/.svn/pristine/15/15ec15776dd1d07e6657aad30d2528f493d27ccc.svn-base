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
 * The DTO mapper of t_receive_plan_data_transfer as TABLE. <br>
 * 入庫IFデータ転送テーブル
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_DATA_TRANSFER_ID, RECEIVE_PLAN_B_ID
 *
 * [column]
 *     RECEIVE_PLAN_DATA_TRANSFER_ID, RECEIVE_PLAN_B_ID, DATA_TRANSFER_ONLY_STR01, DATA_TRANSFER_ONLY_STR02, DATA_TRANSFER_ONLY_STR03, DATA_TRANSFER_ONLY_STR04, DATA_TRANSFER_ONLY_STR05, DATA_TRANSFER_ONLY_STR06, DATA_TRANSFER_ONLY_STR07, DATA_TRANSFER_ONLY_STR08, DATA_TRANSFER_ONLY_STR09, DATA_TRANSFER_ONLY_STR10, DATA_TRANSFER_ONLY_STR11, DATA_TRANSFER_ONLY_STR12, DATA_TRANSFER_ONLY_STR13, DATA_TRANSFER_ONLY_STR14, DATA_TRANSFER_ONLY_STR15, DATA_TRANSFER_ONLY_STR16, DATA_TRANSFER_ONLY_STR17, DATA_TRANSFER_ONLY_STR18, DATA_TRANSFER_ONLY_STR19, DATA_TRANSFER_ONLY_STR20, DATA_TRANSFER_ONLY_STR21, DATA_TRANSFER_ONLY_STR22, DATA_TRANSFER_ONLY_STR23, DATA_TRANSFER_ONLY_STR24, DATA_TRANSFER_ONLY_STR25, DATA_TRANSFER_ONLY_STR26, DATA_TRANSFER_ONLY_STR27, DATA_TRANSFER_ONLY_STR28, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_DATA_TRANSFER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     t_receive_plan_b
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tReceivePlanB
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTReceivePlanDataTransferDtoMapper implements DtoMapper<TReceivePlanDataTransfer, TReceivePlanDataTransferDto>, Serializable {

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
    protected boolean _suppressTReceivePlanB;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTReceivePlanDataTransferDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTReceivePlanDataTransferDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TReceivePlanDataTransferDto mappingToDto(TReceivePlanDataTransfer entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TReceivePlanDataTransferDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TReceivePlanDataTransferDto dto = new TReceivePlanDataTransferDto();
        dto.setReceivePlanDataTransferId(entity.getReceivePlanDataTransferId());
        dto.setReceivePlanBId(entity.getReceivePlanBId());
        dto.setDataTransferOnlyStr01(entity.getDataTransferOnlyStr01());
        dto.setDataTransferOnlyStr02(entity.getDataTransferOnlyStr02());
        dto.setDataTransferOnlyStr03(entity.getDataTransferOnlyStr03());
        dto.setDataTransferOnlyStr04(entity.getDataTransferOnlyStr04());
        dto.setDataTransferOnlyStr05(entity.getDataTransferOnlyStr05());
        dto.setDataTransferOnlyStr06(entity.getDataTransferOnlyStr06());
        dto.setDataTransferOnlyStr07(entity.getDataTransferOnlyStr07());
        dto.setDataTransferOnlyStr08(entity.getDataTransferOnlyStr08());
        dto.setDataTransferOnlyStr09(entity.getDataTransferOnlyStr09());
        dto.setDataTransferOnlyStr10(entity.getDataTransferOnlyStr10());
        dto.setDataTransferOnlyStr11(entity.getDataTransferOnlyStr11());
        dto.setDataTransferOnlyStr12(entity.getDataTransferOnlyStr12());
        dto.setDataTransferOnlyStr13(entity.getDataTransferOnlyStr13());
        dto.setDataTransferOnlyStr14(entity.getDataTransferOnlyStr14());
        dto.setDataTransferOnlyStr15(entity.getDataTransferOnlyStr15());
        dto.setDataTransferOnlyStr16(entity.getDataTransferOnlyStr16());
        dto.setDataTransferOnlyStr17(entity.getDataTransferOnlyStr17());
        dto.setDataTransferOnlyStr18(entity.getDataTransferOnlyStr18());
        dto.setDataTransferOnlyStr19(entity.getDataTransferOnlyStr19());
        dto.setDataTransferOnlyStr20(entity.getDataTransferOnlyStr20());
        dto.setDataTransferOnlyStr21(entity.getDataTransferOnlyStr21());
        dto.setDataTransferOnlyStr22(entity.getDataTransferOnlyStr22());
        dto.setDataTransferOnlyStr23(entity.getDataTransferOnlyStr23());
        dto.setDataTransferOnlyStr24(entity.getDataTransferOnlyStr24());
        dto.setDataTransferOnlyStr25(entity.getDataTransferOnlyStr25());
        dto.setDataTransferOnlyStr26(entity.getDataTransferOnlyStr26());
        dto.setDataTransferOnlyStr27(entity.getDataTransferOnlyStr27());
        dto.setDataTransferOnlyStr28(entity.getDataTransferOnlyStr28());
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
        if (!_suppressTReceivePlanB && entity.getTReceivePlanB() != null) {
            TReceivePlanB relationEntity = entity.getTReceivePlanB();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TReceivePlanBDto relationDto = (TReceivePlanBDto)cachedDto;
                dto.setTReceivePlanB(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanDataTransferList().add(dto);
                }
            } else {
                TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanDataTransferList();
                TReceivePlanBDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTReceivePlanB(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanDataTransferList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTReceivePlanB());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TReceivePlanDataTransferDto> mappingToDtoList(List<TReceivePlanDataTransfer> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TReceivePlanDataTransferDto> dtoList = new ArrayList<TReceivePlanDataTransferDto>();
        for (TReceivePlanDataTransfer entity : entityList) {
            TReceivePlanDataTransferDto dto = mappingToDto(entity);
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
    public TReceivePlanDataTransfer mappingToEntity(TReceivePlanDataTransferDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TReceivePlanDataTransfer)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TReceivePlanDataTransfer entity = new TReceivePlanDataTransfer();
        if (needsMapping(dto, dto.getReceivePlanDataTransferId(), "receivePlanDataTransferId")) {
            entity.setReceivePlanDataTransferId(dto.getReceivePlanDataTransferId());
        }
        if (needsMapping(dto, dto.getReceivePlanBId(), "receivePlanBId")) {
            entity.setReceivePlanBId(dto.getReceivePlanBId());
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
        if (needsMapping(dto, dto.getDataTransferOnlyStr04(), "dataTransferOnlyStr04")) {
            entity.setDataTransferOnlyStr04(dto.getDataTransferOnlyStr04());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr05(), "dataTransferOnlyStr05")) {
            entity.setDataTransferOnlyStr05(dto.getDataTransferOnlyStr05());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr06(), "dataTransferOnlyStr06")) {
            entity.setDataTransferOnlyStr06(dto.getDataTransferOnlyStr06());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr07(), "dataTransferOnlyStr07")) {
            entity.setDataTransferOnlyStr07(dto.getDataTransferOnlyStr07());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr08(), "dataTransferOnlyStr08")) {
            entity.setDataTransferOnlyStr08(dto.getDataTransferOnlyStr08());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr09(), "dataTransferOnlyStr09")) {
            entity.setDataTransferOnlyStr09(dto.getDataTransferOnlyStr09());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr10(), "dataTransferOnlyStr10")) {
            entity.setDataTransferOnlyStr10(dto.getDataTransferOnlyStr10());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr11(), "dataTransferOnlyStr11")) {
            entity.setDataTransferOnlyStr11(dto.getDataTransferOnlyStr11());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr12(), "dataTransferOnlyStr12")) {
            entity.setDataTransferOnlyStr12(dto.getDataTransferOnlyStr12());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr13(), "dataTransferOnlyStr13")) {
            entity.setDataTransferOnlyStr13(dto.getDataTransferOnlyStr13());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr14(), "dataTransferOnlyStr14")) {
            entity.setDataTransferOnlyStr14(dto.getDataTransferOnlyStr14());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr15(), "dataTransferOnlyStr15")) {
            entity.setDataTransferOnlyStr15(dto.getDataTransferOnlyStr15());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr16(), "dataTransferOnlyStr16")) {
            entity.setDataTransferOnlyStr16(dto.getDataTransferOnlyStr16());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr17(), "dataTransferOnlyStr17")) {
            entity.setDataTransferOnlyStr17(dto.getDataTransferOnlyStr17());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr18(), "dataTransferOnlyStr18")) {
            entity.setDataTransferOnlyStr18(dto.getDataTransferOnlyStr18());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr19(), "dataTransferOnlyStr19")) {
            entity.setDataTransferOnlyStr19(dto.getDataTransferOnlyStr19());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr20(), "dataTransferOnlyStr20")) {
            entity.setDataTransferOnlyStr20(dto.getDataTransferOnlyStr20());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr21(), "dataTransferOnlyStr21")) {
            entity.setDataTransferOnlyStr21(dto.getDataTransferOnlyStr21());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr22(), "dataTransferOnlyStr22")) {
            entity.setDataTransferOnlyStr22(dto.getDataTransferOnlyStr22());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr23(), "dataTransferOnlyStr23")) {
            entity.setDataTransferOnlyStr23(dto.getDataTransferOnlyStr23());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr24(), "dataTransferOnlyStr24")) {
            entity.setDataTransferOnlyStr24(dto.getDataTransferOnlyStr24());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr25(), "dataTransferOnlyStr25")) {
            entity.setDataTransferOnlyStr25(dto.getDataTransferOnlyStr25());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr26(), "dataTransferOnlyStr26")) {
            entity.setDataTransferOnlyStr26(dto.getDataTransferOnlyStr26());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr27(), "dataTransferOnlyStr27")) {
            entity.setDataTransferOnlyStr27(dto.getDataTransferOnlyStr27());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr28(), "dataTransferOnlyStr28")) {
            entity.setDataTransferOnlyStr28(dto.getDataTransferOnlyStr28());
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
        if (!_suppressTReceivePlanB && dto.getTReceivePlanB() != null) {
            TReceivePlanBDto relationDto = dto.getTReceivePlanB();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TReceivePlanB relationEntity = (TReceivePlanB)cachedEntity;
                entity.setTReceivePlanB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanDataTransferList().add(entity);
                }
            } else {
                TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanDataTransferList();
                TReceivePlanB relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTReceivePlanB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanDataTransferList().add(entity);
                }
                if (instanceCache && entity.getTReceivePlanB().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTReceivePlanB());
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
    protected boolean needsMapping(TReceivePlanDataTransferDto dto, Object value, String propName) {
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
    public List<TReceivePlanDataTransfer> mappingToEntityList(List<TReceivePlanDataTransferDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TReceivePlanDataTransfer> entityList = new ArrayList<TReceivePlanDataTransfer>();
        for (TReceivePlanDataTransferDto dto : dtoList) {
            TReceivePlanDataTransfer entity = mappingToEntity(dto);
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
    public void suppressTReceivePlanB() {
        _suppressTReceivePlanB = true;
    }
    protected void doSuppressAll() { // internal
        suppressTReceivePlanB();
    }
    protected void doSuppressClear() { // internal
        _suppressTReceivePlanB = false;
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
    public TReceivePlanDataTransferDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TReceivePlanDataTransferDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TReceivePlanDataTransferDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TReceivePlanDataTransferDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TReceivePlanDataTransferDtoMapper reverseReference() {
        setReverseReference(true);
        return (TReceivePlanDataTransferDtoMapper)this;
    }
}
