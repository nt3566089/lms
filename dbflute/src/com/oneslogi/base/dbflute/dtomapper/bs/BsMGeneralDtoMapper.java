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
 * The DTO mapper of m_general as TABLE. <br>
 * 汎用マスタ
 * <pre>
 * [primary-key]
 *     GENERAL_ID
 *
 * [column]
 *     GENERAL_ID, CENTER_ID, CENTER_CD, GENERAL_MASTER_TYPE, GENERAL_MASTER_TYPE_NM, GENERAL_CD, GENERAL_NM, GENERAL_ABBR, CHARACTER1, CHARACTER2, CHARACTER3, CHARACTER4, CHARACTER5, CHARACTER6, CHARACTER7, CHARACTER8, CHARACTER9, CHARACTER10, NUM1, NUM2, NUM3, NUM4, NUM5, NUM6, NUM7, NUM8, NUM9, NUM10, COMMENT1, COMMENT2, DEFAULT_TYPE, SYSTEM_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     GENERAL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_center
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMGeneralDtoMapper implements DtoMapper<MGeneral, MGeneralDto>, Serializable {

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

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMGeneralDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMGeneralDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MGeneralDto mappingToDto(MGeneral entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MGeneralDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MGeneralDto dto = new MGeneralDto();
        dto.setGeneralId(entity.getGeneralId());
        dto.setCenterId(entity.getCenterId());
        dto.setCenterCd(entity.getCenterCd());
        dto.setGeneralMasterType(entity.getGeneralMasterType());
        dto.setGeneralMasterTypeNm(entity.getGeneralMasterTypeNm());
        dto.setGeneralCd(entity.getGeneralCd());
        dto.setGeneralNm(entity.getGeneralNm());
        dto.setGeneralAbbr(entity.getGeneralAbbr());
        dto.setCharacter1(entity.getCharacter1());
        dto.setCharacter2(entity.getCharacter2());
        dto.setCharacter3(entity.getCharacter3());
        dto.setCharacter4(entity.getCharacter4());
        dto.setCharacter5(entity.getCharacter5());
        dto.setCharacter6(entity.getCharacter6());
        dto.setCharacter7(entity.getCharacter7());
        dto.setCharacter8(entity.getCharacter8());
        dto.setCharacter9(entity.getCharacter9());
        dto.setCharacter10(entity.getCharacter10());
        dto.setNum1(entity.getNum1());
        dto.setNum2(entity.getNum2());
        dto.setNum3(entity.getNum3());
        dto.setNum4(entity.getNum4());
        dto.setNum5(entity.getNum5());
        dto.setNum6(entity.getNum6());
        dto.setNum7(entity.getNum7());
        dto.setNum8(entity.getNum8());
        dto.setNum9(entity.getNum9());
        dto.setNum10(entity.getNum10());
        dto.setComment1(entity.getComment1());
        dto.setComment2(entity.getComment2());
        dto.setDefaultType(entity.getDefaultType());
        dto.setSystemType(entity.getSystemType());
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
                    relationDto.getMGeneralList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMGeneralList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getMGeneralList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenter());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MGeneralDto> mappingToDtoList(List<MGeneral> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MGeneralDto> dtoList = new ArrayList<MGeneralDto>();
        for (MGeneral entity : entityList) {
            MGeneralDto dto = mappingToDto(entity);
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
    public MGeneral mappingToEntity(MGeneralDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MGeneral)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MGeneral entity = new MGeneral();
        if (needsMapping(dto, dto.getGeneralId(), "generalId")) {
            entity.setGeneralId(dto.getGeneralId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getGeneralMasterType(), "generalMasterType")) {
            entity.setGeneralMasterType(dto.getGeneralMasterType());
        }
        if (needsMapping(dto, dto.getGeneralMasterTypeNm(), "generalMasterTypeNm")) {
            entity.setGeneralMasterTypeNm(dto.getGeneralMasterTypeNm());
        }
        if (needsMapping(dto, dto.getGeneralCd(), "generalCd")) {
            entity.setGeneralCd(dto.getGeneralCd());
        }
        if (needsMapping(dto, dto.getGeneralNm(), "generalNm")) {
            entity.setGeneralNm(dto.getGeneralNm());
        }
        if (needsMapping(dto, dto.getGeneralAbbr(), "generalAbbr")) {
            entity.setGeneralAbbr(dto.getGeneralAbbr());
        }
        if (needsMapping(dto, dto.getCharacter1(), "character1")) {
            entity.setCharacter1(dto.getCharacter1());
        }
        if (needsMapping(dto, dto.getCharacter2(), "character2")) {
            entity.setCharacter2(dto.getCharacter2());
        }
        if (needsMapping(dto, dto.getCharacter3(), "character3")) {
            entity.setCharacter3(dto.getCharacter3());
        }
        if (needsMapping(dto, dto.getCharacter4(), "character4")) {
            entity.setCharacter4(dto.getCharacter4());
        }
        if (needsMapping(dto, dto.getCharacter5(), "character5")) {
            entity.setCharacter5(dto.getCharacter5());
        }
        if (needsMapping(dto, dto.getCharacter6(), "character6")) {
            entity.setCharacter6(dto.getCharacter6());
        }
        if (needsMapping(dto, dto.getCharacter7(), "character7")) {
            entity.setCharacter7(dto.getCharacter7());
        }
        if (needsMapping(dto, dto.getCharacter8(), "character8")) {
            entity.setCharacter8(dto.getCharacter8());
        }
        if (needsMapping(dto, dto.getCharacter9(), "character9")) {
            entity.setCharacter9(dto.getCharacter9());
        }
        if (needsMapping(dto, dto.getCharacter10(), "character10")) {
            entity.setCharacter10(dto.getCharacter10());
        }
        if (needsMapping(dto, dto.getNum1(), "num1")) {
            entity.setNum1(dto.getNum1());
        }
        if (needsMapping(dto, dto.getNum2(), "num2")) {
            entity.setNum2(dto.getNum2());
        }
        if (needsMapping(dto, dto.getNum3(), "num3")) {
            entity.setNum3(dto.getNum3());
        }
        if (needsMapping(dto, dto.getNum4(), "num4")) {
            entity.setNum4(dto.getNum4());
        }
        if (needsMapping(dto, dto.getNum5(), "num5")) {
            entity.setNum5(dto.getNum5());
        }
        if (needsMapping(dto, dto.getNum6(), "num6")) {
            entity.setNum6(dto.getNum6());
        }
        if (needsMapping(dto, dto.getNum7(), "num7")) {
            entity.setNum7(dto.getNum7());
        }
        if (needsMapping(dto, dto.getNum8(), "num8")) {
            entity.setNum8(dto.getNum8());
        }
        if (needsMapping(dto, dto.getNum9(), "num9")) {
            entity.setNum9(dto.getNum9());
        }
        if (needsMapping(dto, dto.getNum10(), "num10")) {
            entity.setNum10(dto.getNum10());
        }
        if (needsMapping(dto, dto.getComment1(), "comment1")) {
            entity.setComment1(dto.getComment1());
        }
        if (needsMapping(dto, dto.getComment2(), "comment2")) {
            entity.setComment2(dto.getComment2());
        }
        if (needsMapping(dto, dto.getDefaultType(), "defaultType")) {
            entity.setDefaultType(dto.getDefaultType());
        }
        if (needsMapping(dto, dto.getSystemType(), "systemType")) {
            entity.setSystemType(dto.getSystemType());
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
                    relationEntity.getMGeneralList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMGeneralList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getMGeneralList().add(entity);
                }
                if (instanceCache && entity.getMCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenter());
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
    protected boolean needsMapping(MGeneralDto dto, Object value, String propName) {
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
    public List<MGeneral> mappingToEntityList(List<MGeneralDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MGeneral> entityList = new ArrayList<MGeneral>();
        for (MGeneralDto dto : dtoList) {
            MGeneral entity = mappingToEntity(dto);
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
    protected void doSuppressAll() { // internal
        suppressMCenter();
    }
    protected void doSuppressClear() { // internal
        _suppressMCenter = false;
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
    public MGeneralDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MGeneralDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MGeneralDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MGeneralDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MGeneralDtoMapper reverseReference() {
        setReverseReference(true);
        return (MGeneralDtoMapper)this;
    }
}
