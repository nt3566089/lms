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
 * The DTO mapper of t_shipping_plan_b as TABLE. <br>
 * 出荷予定ボディ
 * <pre>
 * [primary-key]
 *     SHIPPING_PLAN_B_ID
 *
 * [column]
 *     SHIPPING_PLAN_B_ID, SHIPPING_PLAN_H_ID, LINE_NO, WAREHOUSE_ID, WAREHOUSE_CD, PRODUCT_ID, PRODUCT_CD, LOCATION_ID, LOCATION_CD, DEPOSIT_ID, DEPOSIT_CD, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, SHAPE_ID, SHAPE_CD, UNIT_NUM, INST_NUM, ERROR_FLG, ERROR_MESSAGE_CD, ALLOC_INST_B_ID, ALLOC_NUM, STOCK_OUT_NUM, UNIT_PRICE, PRICE, TAX, CASE_PIECE_TYPE_ID, CASE_PIECE_TYPE_CD, PROD_DT, JAN_CD, HINMOKU_GROUP, HINMOKU_TEXT, UNIT_NM, STORE_STORAGE_SPACE_CD, STORE_PLANT_CD, TRANSACTION_TYPE_CD, CM_SEND_FLG, LP_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_PLAN_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     t_shipping_plan_h
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tShippingPlanH
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTShippingPlanBDtoMapper implements DtoMapper<TShippingPlanB, TShippingPlanBDto>, Serializable {

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
    protected boolean _suppressTShippingPlanH;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTShippingPlanBDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTShippingPlanBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TShippingPlanBDto mappingToDto(TShippingPlanB entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TShippingPlanBDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TShippingPlanBDto dto = new TShippingPlanBDto();
        dto.setShippingPlanBId(entity.getShippingPlanBId());
        dto.setShippingPlanHId(entity.getShippingPlanHId());
        dto.setLineNo(entity.getLineNo());
        dto.setWarehouseId(entity.getWarehouseId());
        dto.setWarehouseCd(entity.getWarehouseCd());
        dto.setProductId(entity.getProductId());
        dto.setProductCd(entity.getProductCd());
        dto.setLocationId(entity.getLocationId());
        dto.setLocationCd(entity.getLocationCd());
        dto.setDepositId(entity.getDepositId());
        dto.setDepositCd(entity.getDepositCd());
        dto.setLotId(entity.getLotId());
        dto.setLot(entity.getLot());
        dto.setLimitDt(entity.getLimitDt());
        dto.setStoreNoId(entity.getStoreNoId());
        dto.setStoreLabelNo(entity.getStoreLabelNo());
        dto.setShapeId(entity.getShapeId());
        dto.setShapeCd(entity.getShapeCd());
        dto.setUnitNum(entity.getUnitNum());
        dto.setInstNum(entity.getInstNum());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setAllocInstBId(entity.getAllocInstBId());
        dto.setAllocNum(entity.getAllocNum());
        dto.setStockOutNum(entity.getStockOutNum());
        dto.setUnitPrice(entity.getUnitPrice());
        dto.setPrice(entity.getPrice());
        dto.setTax(entity.getTax());
        dto.setCasePieceTypeId(entity.getCasePieceTypeId());
        dto.setCasePieceTypeCd(entity.getCasePieceTypeCd());
        dto.setProdDt(entity.getProdDt());
        dto.setJanCd(entity.getJanCd());
        dto.setHinmokuGroup(entity.getHinmokuGroup());
        dto.setHinmokuText(entity.getHinmokuText());
        dto.setUnitNm(entity.getUnitNm());
        dto.setStoreStorageSpaceCd(entity.getStoreStorageSpaceCd());
        dto.setStorePlantCd(entity.getStorePlantCd());
        dto.setTransactionTypeCd(entity.getTransactionTypeCd());
        dto.setCmSendFlg(entity.getCmSendFlg());
        dto.setLpSendFlg(entity.getLpSendFlg());
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
        if (!_suppressTShippingPlanH && entity.getTShippingPlanH() != null) {
            TShippingPlanH relationEntity = entity.getTShippingPlanH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TShippingPlanHDto relationDto = (TShippingPlanHDto)cachedDto;
                dto.setTShippingPlanH(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingPlanBList().add(dto);
                }
            } else {
                TShippingPlanHDtoMapper mapper = new TShippingPlanHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingPlanBList();
                TShippingPlanHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTShippingPlanH(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingPlanBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTShippingPlanH());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TShippingPlanBDto> mappingToDtoList(List<TShippingPlanB> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TShippingPlanBDto> dtoList = new ArrayList<TShippingPlanBDto>();
        for (TShippingPlanB entity : entityList) {
            TShippingPlanBDto dto = mappingToDto(entity);
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
    public TShippingPlanB mappingToEntity(TShippingPlanBDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TShippingPlanB)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TShippingPlanB entity = new TShippingPlanB();
        if (needsMapping(dto, dto.getShippingPlanBId(), "shippingPlanBId")) {
            entity.setShippingPlanBId(dto.getShippingPlanBId());
        }
        if (needsMapping(dto, dto.getShippingPlanHId(), "shippingPlanHId")) {
            entity.setShippingPlanHId(dto.getShippingPlanHId());
        }
        if (needsMapping(dto, dto.getLineNo(), "lineNo")) {
            entity.setLineNo(dto.getLineNo());
        }
        if (needsMapping(dto, dto.getWarehouseId(), "warehouseId")) {
            entity.setWarehouseId(dto.getWarehouseId());
        }
        if (needsMapping(dto, dto.getWarehouseCd(), "warehouseCd")) {
            entity.setWarehouseCd(dto.getWarehouseCd());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getLocationId(), "locationId")) {
            entity.setLocationId(dto.getLocationId());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
        }
        if (needsMapping(dto, dto.getDepositId(), "depositId")) {
            entity.setDepositId(dto.getDepositId());
        }
        if (needsMapping(dto, dto.getDepositCd(), "depositCd")) {
            entity.setDepositCd(dto.getDepositCd());
        }
        if (needsMapping(dto, dto.getLotId(), "lotId")) {
            entity.setLotId(dto.getLotId());
        }
        if (needsMapping(dto, dto.getLot(), "lot")) {
            entity.setLot(dto.getLot());
        }
        if (needsMapping(dto, dto.getLimitDt(), "limitDt")) {
            entity.setLimitDt(dto.getLimitDt());
        }
        if (needsMapping(dto, dto.getStoreNoId(), "storeNoId")) {
            entity.setStoreNoId(dto.getStoreNoId());
        }
        if (needsMapping(dto, dto.getStoreLabelNo(), "storeLabelNo")) {
            entity.setStoreLabelNo(dto.getStoreLabelNo());
        }
        if (needsMapping(dto, dto.getShapeId(), "shapeId")) {
            entity.setShapeId(dto.getShapeId());
        }
        if (needsMapping(dto, dto.getShapeCd(), "shapeCd")) {
            entity.setShapeCd(dto.getShapeCd());
        }
        if (needsMapping(dto, dto.getUnitNum(), "unitNum")) {
            entity.setUnitNum(dto.getUnitNum());
        }
        if (needsMapping(dto, dto.getInstNum(), "instNum")) {
            entity.setInstNum(dto.getInstNum());
        }
        if (needsMapping(dto, dto.getErrorFlg(), "errorFlg")) {
            entity.setErrorFlg(dto.getErrorFlg());
        }
        if (needsMapping(dto, dto.getErrorMessageCd(), "errorMessageCd")) {
            entity.setErrorMessageCd(dto.getErrorMessageCd());
        }
        if (needsMapping(dto, dto.getAllocInstBId(), "allocInstBId")) {
            entity.setAllocInstBId(dto.getAllocInstBId());
        }
        if (needsMapping(dto, dto.getAllocNum(), "allocNum")) {
            entity.setAllocNum(dto.getAllocNum());
        }
        if (needsMapping(dto, dto.getStockOutNum(), "stockOutNum")) {
            entity.setStockOutNum(dto.getStockOutNum());
        }
        if (needsMapping(dto, dto.getUnitPrice(), "unitPrice")) {
            entity.setUnitPrice(dto.getUnitPrice());
        }
        if (needsMapping(dto, dto.getPrice(), "price")) {
            entity.setPrice(dto.getPrice());
        }
        if (needsMapping(dto, dto.getTax(), "tax")) {
            entity.setTax(dto.getTax());
        }
        if (needsMapping(dto, dto.getCasePieceTypeId(), "casePieceTypeId")) {
            entity.setCasePieceTypeId(dto.getCasePieceTypeId());
        }
        if (needsMapping(dto, dto.getCasePieceTypeCd(), "casePieceTypeCd")) {
            entity.setCasePieceTypeCd(dto.getCasePieceTypeCd());
        }
        if (needsMapping(dto, dto.getProdDt(), "prodDt")) {
            entity.setProdDt(dto.getProdDt());
        }
        if (needsMapping(dto, dto.getJanCd(), "janCd")) {
            entity.setJanCd(dto.getJanCd());
        }
        if (needsMapping(dto, dto.getHinmokuGroup(), "hinmokuGroup")) {
            entity.setHinmokuGroup(dto.getHinmokuGroup());
        }
        if (needsMapping(dto, dto.getHinmokuText(), "hinmokuText")) {
            entity.setHinmokuText(dto.getHinmokuText());
        }
        if (needsMapping(dto, dto.getUnitNm(), "unitNm")) {
            entity.setUnitNm(dto.getUnitNm());
        }
        if (needsMapping(dto, dto.getStoreStorageSpaceCd(), "storeStorageSpaceCd")) {
            entity.setStoreStorageSpaceCd(dto.getStoreStorageSpaceCd());
        }
        if (needsMapping(dto, dto.getStorePlantCd(), "storePlantCd")) {
            entity.setStorePlantCd(dto.getStorePlantCd());
        }
        if (needsMapping(dto, dto.getTransactionTypeCd(), "transactionTypeCd")) {
            entity.setTransactionTypeCd(dto.getTransactionTypeCd());
        }
        if (needsMapping(dto, dto.getCmSendFlg(), "cmSendFlg")) {
            entity.setCmSendFlg(dto.getCmSendFlg());
        }
        if (needsMapping(dto, dto.getLpSendFlg(), "lpSendFlg")) {
            entity.setLpSendFlg(dto.getLpSendFlg());
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
        if (!_suppressTShippingPlanH && dto.getTShippingPlanH() != null) {
            TShippingPlanHDto relationDto = dto.getTShippingPlanH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TShippingPlanH relationEntity = (TShippingPlanH)cachedEntity;
                entity.setTShippingPlanH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingPlanBList().add(entity);
                }
            } else {
                TShippingPlanHDtoMapper mapper = new TShippingPlanHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingPlanBList();
                TShippingPlanH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTShippingPlanH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingPlanBList().add(entity);
                }
                if (instanceCache && entity.getTShippingPlanH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTShippingPlanH());
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
    protected boolean needsMapping(TShippingPlanBDto dto, Object value, String propName) {
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
    public List<TShippingPlanB> mappingToEntityList(List<TShippingPlanBDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TShippingPlanB> entityList = new ArrayList<TShippingPlanB>();
        for (TShippingPlanBDto dto : dtoList) {
            TShippingPlanB entity = mappingToEntity(dto);
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
    public void suppressTShippingPlanH() {
        _suppressTShippingPlanH = true;
    }
    protected void doSuppressAll() { // internal
        suppressTShippingPlanH();
    }
    protected void doSuppressClear() { // internal
        _suppressTShippingPlanH = false;
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
    public TShippingPlanBDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TShippingPlanBDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TShippingPlanBDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TShippingPlanBDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TShippingPlanBDtoMapper reverseReference() {
        setReverseReference(true);
        return (TShippingPlanBDtoMapper)this;
    }
}
