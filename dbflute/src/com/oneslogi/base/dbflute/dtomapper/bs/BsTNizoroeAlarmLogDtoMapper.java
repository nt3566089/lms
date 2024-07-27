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
 * The DTO mapper of t_nizoroe_alarm_log as TABLE. <br>
 * 荷揃処理アラームログ
 * <pre>
 * [primary-key]
 *     NIZOROE_ALARM_LOG_ID
 *
 * [column]
 *     NIZOROE_ALARM_LOG_ID, NIZOROE_TYPE_CD, NIZOROE_PROC_UNIT, PROC_DT, PRINT_FLG, BASE_CD, BASE_NM, TYPE_CD, ALARM_TYPE_CD, NIZOROE_NO, SALES_ORDER_SLIP_NO, SHIPPING_SLIP_NO, SHIPPING_SLIP_ROW_NO, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, SALES_ORG_ID, SALES_ORG_CD, SALES_ORG_NM1, SALES_ORG_NM2, DESTINATION_NM1, DESTINATION_NM2, STOCK_OUT_NUM, OUT_USER_ID, OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     NIZOROE_ALARM_LOG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_product, b_user
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mProduct, bUser
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTNizoroeAlarmLogDtoMapper implements DtoMapper<TNizoroeAlarmLog, TNizoroeAlarmLogDto>, Serializable {

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
    protected boolean _suppressBUser;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTNizoroeAlarmLogDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTNizoroeAlarmLogDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TNizoroeAlarmLogDto mappingToDto(TNizoroeAlarmLog entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TNizoroeAlarmLogDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TNizoroeAlarmLogDto dto = new TNizoroeAlarmLogDto();
        dto.setNizoroeAlarmLogId(entity.getNizoroeAlarmLogId());
        dto.setNizoroeTypeCd(entity.getNizoroeTypeCd());
        dto.setNizoroeProcUnit(entity.getNizoroeProcUnit());
        dto.setProcDt(entity.getProcDt());
        dto.setPrintFlg(entity.getPrintFlg());
        dto.setBaseCd(entity.getBaseCd());
        dto.setBaseNm(entity.getBaseNm());
        dto.setTypeCd(entity.getTypeCd());
        dto.setAlarmTypeCd(entity.getAlarmTypeCd());
        dto.setNizoroeNo(entity.getNizoroeNo());
        dto.setSalesOrderSlipNo(entity.getSalesOrderSlipNo());
        dto.setShippingSlipNo(entity.getShippingSlipNo());
        dto.setShippingSlipRowNo(entity.getShippingSlipRowNo());
        dto.setProductId(entity.getProductId());
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setSalesOrgId(entity.getSalesOrgId());
        dto.setSalesOrgCd(entity.getSalesOrgCd());
        dto.setSalesOrgNm1(entity.getSalesOrgNm1());
        dto.setSalesOrgNm2(entity.getSalesOrgNm2());
        dto.setDestinationNm1(entity.getDestinationNm1());
        dto.setDestinationNm2(entity.getDestinationNm2());
        dto.setStockOutNum(entity.getStockOutNum());
        dto.setOutUserId(entity.getOutUserId());
        dto.setOutDt(entity.getOutDt());
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
                    relationDto.getTNizoroeAlarmLogList().add(dto);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTNizoroeAlarmLogList();
                MProductDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProduct(relationDto);
                if (reverseReference) {
                    relationDto.getTNizoroeAlarmLogList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProduct());
                }
            }
        };
        if (!_suppressBUser && entity.getBUser() != null) {
            BUser relationEntity = entity.getBUser();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUser(relationDto);
                if (reverseReference) {
                    relationDto.getTNizoroeAlarmLogList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTNizoroeAlarmLogList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUser(relationDto);
                if (reverseReference) {
                    relationDto.getTNizoroeAlarmLogList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUser());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TNizoroeAlarmLogDto> mappingToDtoList(List<TNizoroeAlarmLog> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TNizoroeAlarmLogDto> dtoList = new ArrayList<TNizoroeAlarmLogDto>();
        for (TNizoroeAlarmLog entity : entityList) {
            TNizoroeAlarmLogDto dto = mappingToDto(entity);
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
    public TNizoroeAlarmLog mappingToEntity(TNizoroeAlarmLogDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TNizoroeAlarmLog)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TNizoroeAlarmLog entity = new TNizoroeAlarmLog();
        if (needsMapping(dto, dto.getNizoroeAlarmLogId(), "nizoroeAlarmLogId")) {
            entity.setNizoroeAlarmLogId(dto.getNizoroeAlarmLogId());
        }
        if (needsMapping(dto, dto.getNizoroeTypeCd(), "nizoroeTypeCd")) {
            entity.setNizoroeTypeCd(dto.getNizoroeTypeCd());
        }
        if (needsMapping(dto, dto.getNizoroeProcUnit(), "nizoroeProcUnit")) {
            entity.setNizoroeProcUnit(dto.getNizoroeProcUnit());
        }
        if (needsMapping(dto, dto.getProcDt(), "procDt")) {
            entity.setProcDt(dto.getProcDt());
        }
        if (needsMapping(dto, dto.getPrintFlg(), "printFlg")) {
            entity.setPrintFlg(dto.getPrintFlg());
        }
        if (needsMapping(dto, dto.getBaseCd(), "baseCd")) {
            entity.setBaseCd(dto.getBaseCd());
        }
        if (needsMapping(dto, dto.getBaseNm(), "baseNm")) {
            entity.setBaseNm(dto.getBaseNm());
        }
        if (needsMapping(dto, dto.getTypeCd(), "typeCd")) {
            entity.setTypeCd(dto.getTypeCd());
        }
        if (needsMapping(dto, dto.getAlarmTypeCd(), "alarmTypeCd")) {
            entity.setAlarmTypeCd(dto.getAlarmTypeCd());
        }
        if (needsMapping(dto, dto.getNizoroeNo(), "nizoroeNo")) {
            entity.setNizoroeNo(dto.getNizoroeNo());
        }
        if (needsMapping(dto, dto.getSalesOrderSlipNo(), "salesOrderSlipNo")) {
            entity.setSalesOrderSlipNo(dto.getSalesOrderSlipNo());
        }
        if (needsMapping(dto, dto.getShippingSlipNo(), "shippingSlipNo")) {
            entity.setShippingSlipNo(dto.getShippingSlipNo());
        }
        if (needsMapping(dto, dto.getShippingSlipRowNo(), "shippingSlipRowNo")) {
            entity.setShippingSlipRowNo(dto.getShippingSlipRowNo());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getSalesOrgId(), "salesOrgId")) {
            entity.setSalesOrgId(dto.getSalesOrgId());
        }
        if (needsMapping(dto, dto.getSalesOrgCd(), "salesOrgCd")) {
            entity.setSalesOrgCd(dto.getSalesOrgCd());
        }
        if (needsMapping(dto, dto.getSalesOrgNm1(), "salesOrgNm1")) {
            entity.setSalesOrgNm1(dto.getSalesOrgNm1());
        }
        if (needsMapping(dto, dto.getSalesOrgNm2(), "salesOrgNm2")) {
            entity.setSalesOrgNm2(dto.getSalesOrgNm2());
        }
        if (needsMapping(dto, dto.getDestinationNm1(), "destinationNm1")) {
            entity.setDestinationNm1(dto.getDestinationNm1());
        }
        if (needsMapping(dto, dto.getDestinationNm2(), "destinationNm2")) {
            entity.setDestinationNm2(dto.getDestinationNm2());
        }
        if (needsMapping(dto, dto.getStockOutNum(), "stockOutNum")) {
            entity.setStockOutNum(dto.getStockOutNum());
        }
        if (needsMapping(dto, dto.getOutUserId(), "outUserId")) {
            entity.setOutUserId(dto.getOutUserId());
        }
        if (needsMapping(dto, dto.getOutDt(), "outDt")) {
            entity.setOutDt(dto.getOutDt());
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
                    relationEntity.getTNizoroeAlarmLogList().add(entity);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTNizoroeAlarmLogList();
                MProduct relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProduct(relationEntity);
                if (reverseReference) {
                    relationEntity.getTNizoroeAlarmLogList().add(entity);
                }
                if (instanceCache && entity.getMProduct().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProduct());
                }
            }
        };
        if (!_suppressBUser && dto.getBUser() != null) {
            BUserDto relationDto = dto.getBUser();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUser(relationEntity);
                if (reverseReference) {
                    relationEntity.getTNizoroeAlarmLogList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTNizoroeAlarmLogList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUser(relationEntity);
                if (reverseReference) {
                    relationEntity.getTNizoroeAlarmLogList().add(entity);
                }
                if (instanceCache && entity.getBUser().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUser());
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
    protected boolean needsMapping(TNizoroeAlarmLogDto dto, Object value, String propName) {
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
    public List<TNizoroeAlarmLog> mappingToEntityList(List<TNizoroeAlarmLogDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TNizoroeAlarmLog> entityList = new ArrayList<TNizoroeAlarmLog>();
        for (TNizoroeAlarmLogDto dto : dtoList) {
            TNizoroeAlarmLog entity = mappingToEntity(dto);
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
    public void suppressBUser() {
        _suppressBUser = true;
    }
    protected void doSuppressAll() { // internal
        suppressMProduct();
        suppressBUser();
    }
    protected void doSuppressClear() { // internal
        _suppressMProduct = false;
        _suppressBUser = false;
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
    public TNizoroeAlarmLogDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TNizoroeAlarmLogDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TNizoroeAlarmLogDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TNizoroeAlarmLogDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TNizoroeAlarmLogDtoMapper reverseReference() {
        setReverseReference(true);
        return (TNizoroeAlarmLogDtoMapper)this;
    }
}
