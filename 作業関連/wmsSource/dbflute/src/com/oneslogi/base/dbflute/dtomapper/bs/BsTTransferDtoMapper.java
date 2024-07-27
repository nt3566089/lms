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
 * The DTO mapper of t_transfer as TABLE. <br>
 * 振替情報
 * <pre>
 * [primary-key]
 *     TRANSFER_ID
 *
 * [column]
 *     TRANSFER_ID, CLIENT_ID, PRODUCT_CD, STOCK_TRANSFER_DT, RECEIVE_PLANT_CD, RECEIVE_STORAGE_SPACE_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, TRANSFER_TYPE_CD, NUM, HINMOKU_GROUP, JAN_CD, PRODUCT_NM, S4_SEND_FLG, LOCATION_CD1, LOCATION_CD2, USER_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRANSFER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_client
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mClient
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTransferDtoMapper implements DtoMapper<TTransfer, TTransferDto>, Serializable {

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

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTransferDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTransferDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTransferDto mappingToDto(TTransfer entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TTransferDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTransferDto dto = new TTransferDto();
        dto.setTransferId(entity.getTransferId());
        dto.setClientId(entity.getClientId());
        dto.setProductCd(entity.getProductCd());
        dto.setStockTransferDt(entity.getStockTransferDt());
        dto.setReceivePlantCd(entity.getReceivePlantCd());
        dto.setReceiveStorageSpaceCd(entity.getReceiveStorageSpaceCd());
        dto.setShippingPlantCd(entity.getShippingPlantCd());
        dto.setShippingStorageSpaceCd(entity.getShippingStorageSpaceCd());
        dto.setTransferTypeCd(entity.getTransferTypeCd());
        dto.setNum(entity.getNum());
        dto.setHinmokuGroup(entity.getHinmokuGroup());
        dto.setJanCd(entity.getJanCd());
        dto.setProductNm(entity.getProductNm());
        dto.setS4SendFlg(entity.getS4SendFlg());
        dto.setLocationCd1(entity.getLocationCd1());
        dto.setLocationCd2(entity.getLocationCd2());
        dto.setUserCd(entity.getUserCd());
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
                    relationDto.getTTransferList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTransferList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTTransferList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TTransferDto> mappingToDtoList(List<TTransfer> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTransferDto> dtoList = new ArrayList<TTransferDto>();
        for (TTransfer entity : entityList) {
            TTransferDto dto = mappingToDto(entity);
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
    public TTransfer mappingToEntity(TTransferDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TTransfer)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTransfer entity = new TTransfer();
        if (needsMapping(dto, dto.getTransferId(), "transferId")) {
            entity.setTransferId(dto.getTransferId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getStockTransferDt(), "stockTransferDt")) {
            entity.setStockTransferDt(dto.getStockTransferDt());
        }
        if (needsMapping(dto, dto.getReceivePlantCd(), "receivePlantCd")) {
            entity.setReceivePlantCd(dto.getReceivePlantCd());
        }
        if (needsMapping(dto, dto.getReceiveStorageSpaceCd(), "receiveStorageSpaceCd")) {
            entity.setReceiveStorageSpaceCd(dto.getReceiveStorageSpaceCd());
        }
        if (needsMapping(dto, dto.getShippingPlantCd(), "shippingPlantCd")) {
            entity.setShippingPlantCd(dto.getShippingPlantCd());
        }
        if (needsMapping(dto, dto.getShippingStorageSpaceCd(), "shippingStorageSpaceCd")) {
            entity.setShippingStorageSpaceCd(dto.getShippingStorageSpaceCd());
        }
        if (needsMapping(dto, dto.getTransferTypeCd(), "transferTypeCd")) {
            entity.setTransferTypeCd(dto.getTransferTypeCd());
        }
        if (needsMapping(dto, dto.getNum(), "num")) {
            entity.setNum(dto.getNum());
        }
        if (needsMapping(dto, dto.getHinmokuGroup(), "hinmokuGroup")) {
            entity.setHinmokuGroup(dto.getHinmokuGroup());
        }
        if (needsMapping(dto, dto.getJanCd(), "janCd")) {
            entity.setJanCd(dto.getJanCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getS4SendFlg(), "s4SendFlg")) {
            entity.setS4SendFlg(dto.getS4SendFlg());
        }
        if (needsMapping(dto, dto.getLocationCd1(), "locationCd1")) {
            entity.setLocationCd1(dto.getLocationCd1());
        }
        if (needsMapping(dto, dto.getLocationCd2(), "locationCd2")) {
            entity.setLocationCd2(dto.getLocationCd2());
        }
        if (needsMapping(dto, dto.getUserCd(), "userCd")) {
            entity.setUserCd(dto.getUserCd());
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
                    relationEntity.getTTransferList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTransferList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTransferList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
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
    protected boolean needsMapping(TTransferDto dto, Object value, String propName) {
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
    public List<TTransfer> mappingToEntityList(List<TTransferDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTransfer> entityList = new ArrayList<TTransfer>();
        for (TTransferDto dto : dtoList) {
            TTransfer entity = mappingToEntity(dto);
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
    protected void doSuppressAll() { // internal
        suppressMClient();
    }
    protected void doSuppressClear() { // internal
        _suppressMClient = false;
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
    public TTransferDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTransferDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTransferDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTransferDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTransferDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTransferDtoMapper)this;
    }
}
