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
 * The DTO mapper of t_bldl3350 as TABLE. <br>
 * BLDL3350
 * <pre>
 * [primary-key]
 *     BLDL3350_ID
 *
 * [column]
 *     BLDL3350_ID, YEARMONTH, BASE_NM, MONTH, SALES_ORG_NM, SHIPPING_DT, YAMATO_SHIPPING_NUM, YAMATO_EC_SHIPPING_NUM, SAGAWA_SHIPPING_NUM, SAGAWA_EC_SHIPPING_NUM, SAGAWA2_SHIPPING_NUM, SAGAWA2_EC_SHIPPING_NUM, OTHER_SHIPPING_NUM, OTHER_EC_SHIPPING_NUM, CANCEL_SHIPPING_NUM, CANCEL_EC_SHIPPING_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL3350_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTBldl3350DtoMapper implements DtoMapper<TBldl3350, TBldl3350Dto>, Serializable {

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

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTBldl3350DtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTBldl3350DtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TBldl3350Dto mappingToDto(TBldl3350 entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TBldl3350Dto dto = new TBldl3350Dto();
        dto.setBldl3350Id(entity.getBldl3350Id());
        dto.setYearmonth(entity.getYearmonth());
        dto.setBaseNm(entity.getBaseNm());
        dto.setMonth(entity.getMonth());
        dto.setSalesOrgNm(entity.getSalesOrgNm());
        dto.setShippingDt(entity.getShippingDt());
        dto.setYamatoShippingNum(entity.getYamatoShippingNum());
        dto.setYamatoEcShippingNum(entity.getYamatoEcShippingNum());
        dto.setSagawaShippingNum(entity.getSagawaShippingNum());
        dto.setSagawaEcShippingNum(entity.getSagawaEcShippingNum());
        dto.setSagawa2ShippingNum(entity.getSagawa2ShippingNum());
        dto.setSagawa2EcShippingNum(entity.getSagawa2EcShippingNum());
        dto.setOtherShippingNum(entity.getOtherShippingNum());
        dto.setOtherEcShippingNum(entity.getOtherEcShippingNum());
        dto.setCancelShippingNum(entity.getCancelShippingNum());
        dto.setCancelEcShippingNum(entity.getCancelEcShippingNum());
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
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TBldl3350Dto> mappingToDtoList(List<TBldl3350> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TBldl3350Dto> dtoList = new ArrayList<TBldl3350Dto>();
        for (TBldl3350 entity : entityList) {
            TBldl3350Dto dto = mappingToDto(entity);
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
    public TBldl3350 mappingToEntity(TBldl3350Dto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TBldl3350 entity = new TBldl3350();
        if (needsMapping(dto, dto.getBldl3350Id(), "bldl3350Id")) {
            entity.setBldl3350Id(dto.getBldl3350Id());
        }
        if (needsMapping(dto, dto.getYearmonth(), "yearmonth")) {
            entity.setYearmonth(dto.getYearmonth());
        }
        if (needsMapping(dto, dto.getBaseNm(), "baseNm")) {
            entity.setBaseNm(dto.getBaseNm());
        }
        if (needsMapping(dto, dto.getMonth(), "month")) {
            entity.setMonth(dto.getMonth());
        }
        if (needsMapping(dto, dto.getSalesOrgNm(), "salesOrgNm")) {
            entity.setSalesOrgNm(dto.getSalesOrgNm());
        }
        if (needsMapping(dto, dto.getShippingDt(), "shippingDt")) {
            entity.setShippingDt(dto.getShippingDt());
        }
        if (needsMapping(dto, dto.getYamatoShippingNum(), "yamatoShippingNum")) {
            entity.setYamatoShippingNum(dto.getYamatoShippingNum());
        }
        if (needsMapping(dto, dto.getYamatoEcShippingNum(), "yamatoEcShippingNum")) {
            entity.setYamatoEcShippingNum(dto.getYamatoEcShippingNum());
        }
        if (needsMapping(dto, dto.getSagawaShippingNum(), "sagawaShippingNum")) {
            entity.setSagawaShippingNum(dto.getSagawaShippingNum());
        }
        if (needsMapping(dto, dto.getSagawaEcShippingNum(), "sagawaEcShippingNum")) {
            entity.setSagawaEcShippingNum(dto.getSagawaEcShippingNum());
        }
        if (needsMapping(dto, dto.getSagawa2ShippingNum(), "sagawa2ShippingNum")) {
            entity.setSagawa2ShippingNum(dto.getSagawa2ShippingNum());
        }
        if (needsMapping(dto, dto.getSagawa2EcShippingNum(), "sagawa2EcShippingNum")) {
            entity.setSagawa2EcShippingNum(dto.getSagawa2EcShippingNum());
        }
        if (needsMapping(dto, dto.getOtherShippingNum(), "otherShippingNum")) {
            entity.setOtherShippingNum(dto.getOtherShippingNum());
        }
        if (needsMapping(dto, dto.getOtherEcShippingNum(), "otherEcShippingNum")) {
            entity.setOtherEcShippingNum(dto.getOtherEcShippingNum());
        }
        if (needsMapping(dto, dto.getCancelShippingNum(), "cancelShippingNum")) {
            entity.setCancelShippingNum(dto.getCancelShippingNum());
        }
        if (needsMapping(dto, dto.getCancelEcShippingNum(), "cancelEcShippingNum")) {
            entity.setCancelEcShippingNum(dto.getCancelEcShippingNum());
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
    protected boolean needsMapping(TBldl3350Dto dto, Object value, String propName) {
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
    public List<TBldl3350> mappingToEntityList(List<TBldl3350Dto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TBldl3350> entityList = new ArrayList<TBldl3350>();
        for (TBldl3350Dto dto : dtoList) {
            TBldl3350 entity = mappingToEntity(dto);
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
    protected void doSuppressAll() { // internal
    }
    protected void doSuppressClear() { // internal
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
    public TBldl3350DtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TBldl3350DtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TBldl3350DtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TBldl3350DtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TBldl3350DtoMapper reverseReference() {
        setReverseReference(true);
        return (TBldl3350DtoMapper)this;
    }
}
