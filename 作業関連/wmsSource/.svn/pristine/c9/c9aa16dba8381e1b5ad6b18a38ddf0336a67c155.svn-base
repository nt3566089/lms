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
 * The DTO mapper of t_operation_log as TABLE. <br>
 * 特殊操作履歴
 * <pre>
 * [primary-key]
 *     OPERATION_LOG_ID
 *
 * [column]
 *     OPERATION_LOG_ID, CLIENT_CD, CENTER_CD, WORK_CD, WORK_DT, MAC_ADDRESS, USER_CD, TRACE_ITEM, PRODUCT_ID, JAN_CD, PRODUCT_CD, PRODUCT_NM, LOCATION_CD, LOCATION_NM, LOT, LIMIT_DT, PROD_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     OPERATION_LOG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_product
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mProduct
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTOperationLogDtoMapper implements DtoMapper<TOperationLog, TOperationLogDto>, Serializable {

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
    protected boolean _suppressMProduct;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTOperationLogDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTOperationLogDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TOperationLogDto mappingToDto(TOperationLog entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TOperationLogDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TOperationLogDto dto = new TOperationLogDto();
        dto.setOperationLogId(entity.getOperationLogId());
        dto.setClientCd(entity.getClientCd());
        dto.setCenterCd(entity.getCenterCd());
        dto.setWorkCd(entity.getWorkCd());
        dto.setWorkDt(entity.getWorkDt());
        dto.setMacAddress(entity.getMacAddress());
        dto.setUserCd(entity.getUserCd());
        dto.setTraceItem(entity.getTraceItem());
        dto.setProductId(entity.getProductId());
        dto.setJanCd(entity.getJanCd());
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setLocationCd(entity.getLocationCd());
        dto.setLocationNm(entity.getLocationNm());
        dto.setLot(entity.getLot());
        dto.setLimitDt(entity.getLimitDt());
        dto.setProdDt(entity.getProdDt());
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
        if (!_suppressMProduct && entity.getMProduct() != null) {
            MProduct relationEntity = entity.getMProduct();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MProductDto relationDto = (MProductDto)cachedDto;
                dto.setMProduct(relationDto);
                if (reverseReference) {
                    relationDto.getTOperationLogList().add(dto);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTOperationLogList();
                MProductDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProduct(relationDto);
                if (reverseReference) {
                    relationDto.getTOperationLogList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProduct());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TOperationLogDto> mappingToDtoList(List<TOperationLog> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TOperationLogDto> dtoList = new ArrayList<TOperationLogDto>();
        for (TOperationLog entity : entityList) {
            TOperationLogDto dto = mappingToDto(entity);
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
    public TOperationLog mappingToEntity(TOperationLogDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TOperationLog)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TOperationLog entity = new TOperationLog();
        if (needsMapping(dto, dto.getOperationLogId(), "operationLogId")) {
            entity.setOperationLogId(dto.getOperationLogId());
        }
        if (needsMapping(dto, dto.getClientCd(), "clientCd")) {
            entity.setClientCd(dto.getClientCd());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getWorkCd(), "workCd")) {
            entity.setWorkCd(dto.getWorkCd());
        }
        if (needsMapping(dto, dto.getWorkDt(), "workDt")) {
            entity.setWorkDt(dto.getWorkDt());
        }
        if (needsMapping(dto, dto.getMacAddress(), "macAddress")) {
            entity.setMacAddress(dto.getMacAddress());
        }
        if (needsMapping(dto, dto.getUserCd(), "userCd")) {
            entity.setUserCd(dto.getUserCd());
        }
        if (needsMapping(dto, dto.getTraceItem(), "traceItem")) {
            entity.setTraceItem(dto.getTraceItem());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getJanCd(), "janCd")) {
            entity.setJanCd(dto.getJanCd());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
        }
        if (needsMapping(dto, dto.getLocationNm(), "locationNm")) {
            entity.setLocationNm(dto.getLocationNm());
        }
        if (needsMapping(dto, dto.getLot(), "lot")) {
            entity.setLot(dto.getLot());
        }
        if (needsMapping(dto, dto.getLimitDt(), "limitDt")) {
            entity.setLimitDt(dto.getLimitDt());
        }
        if (needsMapping(dto, dto.getProdDt(), "prodDt")) {
            entity.setProdDt(dto.getProdDt());
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
        if (!_suppressMProduct && dto.getMProduct() != null) {
            MProductDto relationDto = dto.getMProduct();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MProduct relationEntity = (MProduct)cachedEntity;
                entity.setMProduct(relationEntity);
                if (reverseReference) {
                    relationEntity.getTOperationLogList().add(entity);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTOperationLogList();
                MProduct relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProduct(relationEntity);
                if (reverseReference) {
                    relationEntity.getTOperationLogList().add(entity);
                }
                if (instanceCache && entity.getMProduct().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProduct());
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
    protected boolean needsMapping(TOperationLogDto dto, Object value, String propName) {
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
    public List<TOperationLog> mappingToEntityList(List<TOperationLogDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TOperationLog> entityList = new ArrayList<TOperationLog>();
        for (TOperationLogDto dto : dtoList) {
            TOperationLog entity = mappingToEntity(dto);
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
    public void suppressMProduct() {
        _suppressMProduct = true;
    }
    protected void doSuppressAll() { // internal
        suppressMProduct();
    }
    protected void doSuppressClear() { // internal
        _suppressMProduct = false;
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
    public TOperationLogDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TOperationLogDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TOperationLogDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TOperationLogDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TOperationLogDtoMapper reverseReference() {
        setReverseReference(true);
        return (TOperationLogDtoMapper)this;
    }
}
