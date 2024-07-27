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
 * The DTO mapper of t_shipping_inst_h_print as TABLE. <br>
 * 出荷指示ヘッダ印刷データ
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_H_PRINT_ID
 *
 * [column]
 *     SHIPPING_INST_H_PRINT_ID, SHIPPING_INST_H_ID, SALES_ORDER_NO, SALES_ORDER_SLIP_TYPE_CD, SALES_ORDER_SLIP_NO, SHIPPING_REASON, LOGI_ATTENTION_TYPE_CD, LOGI_SPECIAL_TYPE_CD, KOGUCHI_DELIVERY_FLG, SHIPPING_DT, SPECIFY_DELIVERY_DT, SPECIFY_DELIVERY_TIME, TENHANSHA_ID, TENHANSHA_ORDER_NO, CONTRACTOR_NM, DESTINATION_CD, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_ZIP_CD, DESTINATION_ADDRESS1, DESTINATION_ADDRESS2, DESTINATION_TEL, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, DEAL_TYPE_CD, CUSTOMER_CD, CUSTOMER_NM, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_H_PRINT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     t_shipping_inst_h
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tShippingInstH
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTShippingInstHPrintDtoMapper implements DtoMapper<TShippingInstHPrint, TShippingInstHPrintDto>, Serializable {

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
    protected boolean _suppressTShippingInstH;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTShippingInstHPrintDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTShippingInstHPrintDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TShippingInstHPrintDto mappingToDto(TShippingInstHPrint entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TShippingInstHPrintDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TShippingInstHPrintDto dto = new TShippingInstHPrintDto();
        dto.setShippingInstHPrintId(entity.getShippingInstHPrintId());
        dto.setShippingInstHId(entity.getShippingInstHId());
        dto.setSalesOrderNo(entity.getSalesOrderNo());
        dto.setSalesOrderSlipTypeCd(entity.getSalesOrderSlipTypeCd());
        dto.setSalesOrderSlipNo(entity.getSalesOrderSlipNo());
        dto.setShippingReason(entity.getShippingReason());
        dto.setLogiAttentionTypeCd(entity.getLogiAttentionTypeCd());
        dto.setLogiSpecialTypeCd(entity.getLogiSpecialTypeCd());
        dto.setKoguchiDeliveryFlg(entity.getKoguchiDeliveryFlg());
        dto.setShippingDt(entity.getShippingDt());
        dto.setSpecifyDeliveryDt(entity.getSpecifyDeliveryDt());
        dto.setSpecifyDeliveryTime(entity.getSpecifyDeliveryTime());
        dto.setTenhanshaId(entity.getTenhanshaId());
        dto.setTenhanshaOrderNo(entity.getTenhanshaOrderNo());
        dto.setContractorNm(entity.getContractorNm());
        dto.setDestinationCd(entity.getDestinationCd());
        dto.setDestinationNm1(entity.getDestinationNm1());
        dto.setDestinationNm2(entity.getDestinationNm2());
        dto.setDestinationZipCd(entity.getDestinationZipCd());
        dto.setDestinationAddress1(entity.getDestinationAddress1());
        dto.setDestinationAddress2(entity.getDestinationAddress2());
        dto.setDestinationTel(entity.getDestinationTel());
        dto.setShippingPlantCd(entity.getShippingPlantCd());
        dto.setShippingStorageSpaceCd(entity.getShippingStorageSpaceCd());
        dto.setDealTypeCd(entity.getDealTypeCd());
        dto.setCustomerCd(entity.getCustomerCd());
        dto.setCustomerNm(entity.getCustomerNm());
        dto.setSpareStr(entity.getSpareStr());
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
        if (!_suppressTShippingInstH && entity.getTShippingInstH() != null) {
            TShippingInstH relationEntity = entity.getTShippingInstH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TShippingInstHDto relationDto = (TShippingInstHDto)cachedDto;
                dto.setTShippingInstH(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstHPrintList().add(dto);
                }
            } else {
                TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstHPrintList();
                TShippingInstHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTShippingInstH(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstHPrintList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTShippingInstH());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TShippingInstHPrintDto> mappingToDtoList(List<TShippingInstHPrint> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TShippingInstHPrintDto> dtoList = new ArrayList<TShippingInstHPrintDto>();
        for (TShippingInstHPrint entity : entityList) {
            TShippingInstHPrintDto dto = mappingToDto(entity);
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
    public TShippingInstHPrint mappingToEntity(TShippingInstHPrintDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TShippingInstHPrint)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TShippingInstHPrint entity = new TShippingInstHPrint();
        if (needsMapping(dto, dto.getShippingInstHPrintId(), "shippingInstHPrintId")) {
            entity.setShippingInstHPrintId(dto.getShippingInstHPrintId());
        }
        if (needsMapping(dto, dto.getShippingInstHId(), "shippingInstHId")) {
            entity.setShippingInstHId(dto.getShippingInstHId());
        }
        if (needsMapping(dto, dto.getSalesOrderNo(), "salesOrderNo")) {
            entity.setSalesOrderNo(dto.getSalesOrderNo());
        }
        if (needsMapping(dto, dto.getSalesOrderSlipTypeCd(), "salesOrderSlipTypeCd")) {
            entity.setSalesOrderSlipTypeCd(dto.getSalesOrderSlipTypeCd());
        }
        if (needsMapping(dto, dto.getSalesOrderSlipNo(), "salesOrderSlipNo")) {
            entity.setSalesOrderSlipNo(dto.getSalesOrderSlipNo());
        }
        if (needsMapping(dto, dto.getShippingReason(), "shippingReason")) {
            entity.setShippingReason(dto.getShippingReason());
        }
        if (needsMapping(dto, dto.getLogiAttentionTypeCd(), "logiAttentionTypeCd")) {
            entity.setLogiAttentionTypeCd(dto.getLogiAttentionTypeCd());
        }
        if (needsMapping(dto, dto.getLogiSpecialTypeCd(), "logiSpecialTypeCd")) {
            entity.setLogiSpecialTypeCd(dto.getLogiSpecialTypeCd());
        }
        if (needsMapping(dto, dto.getKoguchiDeliveryFlg(), "koguchiDeliveryFlg")) {
            entity.setKoguchiDeliveryFlg(dto.getKoguchiDeliveryFlg());
        }
        if (needsMapping(dto, dto.getShippingDt(), "shippingDt")) {
            entity.setShippingDt(dto.getShippingDt());
        }
        if (needsMapping(dto, dto.getSpecifyDeliveryDt(), "specifyDeliveryDt")) {
            entity.setSpecifyDeliveryDt(dto.getSpecifyDeliveryDt());
        }
        if (needsMapping(dto, dto.getSpecifyDeliveryTime(), "specifyDeliveryTime")) {
            entity.setSpecifyDeliveryTime(dto.getSpecifyDeliveryTime());
        }
        if (needsMapping(dto, dto.getTenhanshaId(), "tenhanshaId")) {
            entity.setTenhanshaId(dto.getTenhanshaId());
        }
        if (needsMapping(dto, dto.getTenhanshaOrderNo(), "tenhanshaOrderNo")) {
            entity.setTenhanshaOrderNo(dto.getTenhanshaOrderNo());
        }
        if (needsMapping(dto, dto.getContractorNm(), "contractorNm")) {
            entity.setContractorNm(dto.getContractorNm());
        }
        if (needsMapping(dto, dto.getDestinationCd(), "destinationCd")) {
            entity.setDestinationCd(dto.getDestinationCd());
        }
        if (needsMapping(dto, dto.getDestinationNm1(), "destinationNm1")) {
            entity.setDestinationNm1(dto.getDestinationNm1());
        }
        if (needsMapping(dto, dto.getDestinationNm2(), "destinationNm2")) {
            entity.setDestinationNm2(dto.getDestinationNm2());
        }
        if (needsMapping(dto, dto.getDestinationZipCd(), "destinationZipCd")) {
            entity.setDestinationZipCd(dto.getDestinationZipCd());
        }
        if (needsMapping(dto, dto.getDestinationAddress1(), "destinationAddress1")) {
            entity.setDestinationAddress1(dto.getDestinationAddress1());
        }
        if (needsMapping(dto, dto.getDestinationAddress2(), "destinationAddress2")) {
            entity.setDestinationAddress2(dto.getDestinationAddress2());
        }
        if (needsMapping(dto, dto.getDestinationTel(), "destinationTel")) {
            entity.setDestinationTel(dto.getDestinationTel());
        }
        if (needsMapping(dto, dto.getShippingPlantCd(), "shippingPlantCd")) {
            entity.setShippingPlantCd(dto.getShippingPlantCd());
        }
        if (needsMapping(dto, dto.getShippingStorageSpaceCd(), "shippingStorageSpaceCd")) {
            entity.setShippingStorageSpaceCd(dto.getShippingStorageSpaceCd());
        }
        if (needsMapping(dto, dto.getDealTypeCd(), "dealTypeCd")) {
            entity.setDealTypeCd(dto.getDealTypeCd());
        }
        if (needsMapping(dto, dto.getCustomerCd(), "customerCd")) {
            entity.setCustomerCd(dto.getCustomerCd());
        }
        if (needsMapping(dto, dto.getCustomerNm(), "customerNm")) {
            entity.setCustomerNm(dto.getCustomerNm());
        }
        if (needsMapping(dto, dto.getSpareStr(), "spareStr")) {
            entity.setSpareStr(dto.getSpareStr());
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
        if (!_suppressTShippingInstH && dto.getTShippingInstH() != null) {
            TShippingInstHDto relationDto = dto.getTShippingInstH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TShippingInstH relationEntity = (TShippingInstH)cachedEntity;
                entity.setTShippingInstH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstHPrintList().add(entity);
                }
            } else {
                TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstHPrintList();
                TShippingInstH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTShippingInstH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstHPrintList().add(entity);
                }
                if (instanceCache && entity.getTShippingInstH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTShippingInstH());
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
    protected boolean needsMapping(TShippingInstHPrintDto dto, Object value, String propName) {
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
    public List<TShippingInstHPrint> mappingToEntityList(List<TShippingInstHPrintDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TShippingInstHPrint> entityList = new ArrayList<TShippingInstHPrint>();
        for (TShippingInstHPrintDto dto : dtoList) {
            TShippingInstHPrint entity = mappingToEntity(dto);
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
    public void suppressTShippingInstH() {
        _suppressTShippingInstH = true;
    }
    protected void doSuppressAll() { // internal
        suppressTShippingInstH();
    }
    protected void doSuppressClear() { // internal
        _suppressTShippingInstH = false;
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
    public TShippingInstHPrintDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TShippingInstHPrintDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TShippingInstHPrintDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TShippingInstHPrintDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TShippingInstHPrintDtoMapper reverseReference() {
        setReverseReference(true);
        return (TShippingInstHPrintDtoMapper)this;
    }
}
