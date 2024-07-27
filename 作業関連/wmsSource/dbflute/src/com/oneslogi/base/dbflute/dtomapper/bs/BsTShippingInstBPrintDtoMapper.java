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
 * The DTO mapper of t_shipping_inst_b_print as TABLE. <br>
 * 出荷指示ボディ印刷データ
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_B_PRINT_ID
 *
 * [column]
 *     SHIPPING_INST_B_PRINT_ID, SHIPPING_INST_B_ID, HINMOKU_CD, HINMOKU_GROUP_CD, SALES_ORDER_NUM, LOGI_WEIGHT_FLG, LOGI_ATTENTION_TYPE_CD, LOGI_SPECIAL_TYPE_CD, UNIT_PRICE, EC_ORDER_BRANCH_NO, EC_PRODUCT_NM_KANJI, DEAL_TYPE_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_B_PRINT_ID
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
public abstract class BsTShippingInstBPrintDtoMapper implements DtoMapper<TShippingInstBPrint, TShippingInstBPrintDto>, Serializable {

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
    public BsTShippingInstBPrintDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTShippingInstBPrintDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TShippingInstBPrintDto mappingToDto(TShippingInstBPrint entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TShippingInstBPrintDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TShippingInstBPrintDto dto = new TShippingInstBPrintDto();
        dto.setShippingInstBPrintId(entity.getShippingInstBPrintId());
        dto.setShippingInstBId(entity.getShippingInstBId());
        dto.setHinmokuCd(entity.getHinmokuCd());
        dto.setHinmokuGroupCd(entity.getHinmokuGroupCd());
        dto.setSalesOrderNum(entity.getSalesOrderNum());
        dto.setLogiWeightFlg(entity.getLogiWeightFlg());
        dto.setLogiAttentionTypeCd(entity.getLogiAttentionTypeCd());
        dto.setLogiSpecialTypeCd(entity.getLogiSpecialTypeCd());
        dto.setUnitPrice(entity.getUnitPrice());
        dto.setEcOrderBranchNo(entity.getEcOrderBranchNo());
        dto.setEcProductNmKanji(entity.getEcProductNmKanji());
        dto.setDealTypeCd(entity.getDealTypeCd());
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
        if (!_suppressTShippingInstB && entity.getTShippingInstB() != null) {
            TShippingInstB relationEntity = entity.getTShippingInstB();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TShippingInstBDto relationDto = (TShippingInstBDto)cachedDto;
                dto.setTShippingInstB(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstBPrintList().add(dto);
                }
            } else {
                TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBPrintList();
                TShippingInstBDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTShippingInstB(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstBPrintList().add(dto);
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
    public List<TShippingInstBPrintDto> mappingToDtoList(List<TShippingInstBPrint> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TShippingInstBPrintDto> dtoList = new ArrayList<TShippingInstBPrintDto>();
        for (TShippingInstBPrint entity : entityList) {
            TShippingInstBPrintDto dto = mappingToDto(entity);
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
    public TShippingInstBPrint mappingToEntity(TShippingInstBPrintDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TShippingInstBPrint)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TShippingInstBPrint entity = new TShippingInstBPrint();
        if (needsMapping(dto, dto.getShippingInstBPrintId(), "shippingInstBPrintId")) {
            entity.setShippingInstBPrintId(dto.getShippingInstBPrintId());
        }
        if (needsMapping(dto, dto.getShippingInstBId(), "shippingInstBId")) {
            entity.setShippingInstBId(dto.getShippingInstBId());
        }
        if (needsMapping(dto, dto.getHinmokuCd(), "hinmokuCd")) {
            entity.setHinmokuCd(dto.getHinmokuCd());
        }
        if (needsMapping(dto, dto.getHinmokuGroupCd(), "hinmokuGroupCd")) {
            entity.setHinmokuGroupCd(dto.getHinmokuGroupCd());
        }
        if (needsMapping(dto, dto.getSalesOrderNum(), "salesOrderNum")) {
            entity.setSalesOrderNum(dto.getSalesOrderNum());
        }
        if (needsMapping(dto, dto.getLogiWeightFlg(), "logiWeightFlg")) {
            entity.setLogiWeightFlg(dto.getLogiWeightFlg());
        }
        if (needsMapping(dto, dto.getLogiAttentionTypeCd(), "logiAttentionTypeCd")) {
            entity.setLogiAttentionTypeCd(dto.getLogiAttentionTypeCd());
        }
        if (needsMapping(dto, dto.getLogiSpecialTypeCd(), "logiSpecialTypeCd")) {
            entity.setLogiSpecialTypeCd(dto.getLogiSpecialTypeCd());
        }
        if (needsMapping(dto, dto.getUnitPrice(), "unitPrice")) {
            entity.setUnitPrice(dto.getUnitPrice());
        }
        if (needsMapping(dto, dto.getEcOrderBranchNo(), "ecOrderBranchNo")) {
            entity.setEcOrderBranchNo(dto.getEcOrderBranchNo());
        }
        if (needsMapping(dto, dto.getEcProductNmKanji(), "ecProductNmKanji")) {
            entity.setEcProductNmKanji(dto.getEcProductNmKanji());
        }
        if (needsMapping(dto, dto.getDealTypeCd(), "dealTypeCd")) {
            entity.setDealTypeCd(dto.getDealTypeCd());
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
        if (!_suppressTShippingInstB && dto.getTShippingInstB() != null) {
            TShippingInstBDto relationDto = dto.getTShippingInstB();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TShippingInstB relationEntity = (TShippingInstB)cachedEntity;
                entity.setTShippingInstB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstBPrintList().add(entity);
                }
            } else {
                TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBPrintList();
                TShippingInstB relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTShippingInstB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstBPrintList().add(entity);
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
    protected boolean needsMapping(TShippingInstBPrintDto dto, Object value, String propName) {
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
    public List<TShippingInstBPrint> mappingToEntityList(List<TShippingInstBPrintDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TShippingInstBPrint> entityList = new ArrayList<TShippingInstBPrint>();
        for (TShippingInstBPrintDto dto : dtoList) {
            TShippingInstBPrint entity = mappingToEntity(dto);
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
    public TShippingInstBPrintDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TShippingInstBPrintDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TShippingInstBPrintDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TShippingInstBPrintDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TShippingInstBPrintDtoMapper reverseReference() {
        setReverseReference(true);
        return (TShippingInstBPrintDtoMapper)this;
    }
}
