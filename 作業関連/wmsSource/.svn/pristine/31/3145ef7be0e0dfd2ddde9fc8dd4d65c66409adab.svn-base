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
 * The DTO mapper of t_bldl5052 as TABLE. <br>
 * BLDL5052
 * <pre>
 * [primary-key]
 *     BLDL5052_ID
 *
 * [column]
 *     BLDL5052_ID, YEARMONTH, BASE_NM, MONTH, ROW_NO, SHIPPING_DT, FW_CASE_NUM, FW_PICK_NUM, FW_RATE, UN_CASE_NUM, UN_PICK_NUM, UN_RATE, SH_CASE_NUM, SH_PICK_NUM, SH_RATE, HM_CASE_NUM, HM_PICK_NUM, HM_RATE, TOTAL_CASE_NUM, TOTAL_PICK_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5052_ID
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
public abstract class BsTBldl5052DtoMapper implements DtoMapper<TBldl5052, TBldl5052Dto>, Serializable {

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
    public BsTBldl5052DtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTBldl5052DtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TBldl5052Dto mappingToDto(TBldl5052 entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TBldl5052Dto dto = new TBldl5052Dto();
        dto.setBldl5052Id(entity.getBldl5052Id());
        dto.setYearmonth(entity.getYearmonth());
        dto.setBaseNm(entity.getBaseNm());
        dto.setMonth(entity.getMonth());
        dto.setRowNo(entity.getRowNo());
        dto.setShippingDt(entity.getShippingDt());
        dto.setFwCaseNum(entity.getFwCaseNum());
        dto.setFwPickNum(entity.getFwPickNum());
        dto.setFwRate(entity.getFwRate());
        dto.setUnCaseNum(entity.getUnCaseNum());
        dto.setUnPickNum(entity.getUnPickNum());
        dto.setUnRate(entity.getUnRate());
        dto.setShCaseNum(entity.getShCaseNum());
        dto.setShPickNum(entity.getShPickNum());
        dto.setShRate(entity.getShRate());
        dto.setHmCaseNum(entity.getHmCaseNum());
        dto.setHmPickNum(entity.getHmPickNum());
        dto.setHmRate(entity.getHmRate());
        dto.setTotalCaseNum(entity.getTotalCaseNum());
        dto.setTotalPickNum(entity.getTotalPickNum());
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
    public List<TBldl5052Dto> mappingToDtoList(List<TBldl5052> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TBldl5052Dto> dtoList = new ArrayList<TBldl5052Dto>();
        for (TBldl5052 entity : entityList) {
            TBldl5052Dto dto = mappingToDto(entity);
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
    public TBldl5052 mappingToEntity(TBldl5052Dto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TBldl5052 entity = new TBldl5052();
        if (needsMapping(dto, dto.getBldl5052Id(), "bldl5052Id")) {
            entity.setBldl5052Id(dto.getBldl5052Id());
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
        if (needsMapping(dto, dto.getRowNo(), "rowNo")) {
            entity.setRowNo(dto.getRowNo());
        }
        if (needsMapping(dto, dto.getShippingDt(), "shippingDt")) {
            entity.setShippingDt(dto.getShippingDt());
        }
        if (needsMapping(dto, dto.getFwCaseNum(), "fwCaseNum")) {
            entity.setFwCaseNum(dto.getFwCaseNum());
        }
        if (needsMapping(dto, dto.getFwPickNum(), "fwPickNum")) {
            entity.setFwPickNum(dto.getFwPickNum());
        }
        if (needsMapping(dto, dto.getFwRate(), "fwRate")) {
            entity.setFwRate(dto.getFwRate());
        }
        if (needsMapping(dto, dto.getUnCaseNum(), "unCaseNum")) {
            entity.setUnCaseNum(dto.getUnCaseNum());
        }
        if (needsMapping(dto, dto.getUnPickNum(), "unPickNum")) {
            entity.setUnPickNum(dto.getUnPickNum());
        }
        if (needsMapping(dto, dto.getUnRate(), "unRate")) {
            entity.setUnRate(dto.getUnRate());
        }
        if (needsMapping(dto, dto.getShCaseNum(), "shCaseNum")) {
            entity.setShCaseNum(dto.getShCaseNum());
        }
        if (needsMapping(dto, dto.getShPickNum(), "shPickNum")) {
            entity.setShPickNum(dto.getShPickNum());
        }
        if (needsMapping(dto, dto.getShRate(), "shRate")) {
            entity.setShRate(dto.getShRate());
        }
        if (needsMapping(dto, dto.getHmCaseNum(), "hmCaseNum")) {
            entity.setHmCaseNum(dto.getHmCaseNum());
        }
        if (needsMapping(dto, dto.getHmPickNum(), "hmPickNum")) {
            entity.setHmPickNum(dto.getHmPickNum());
        }
        if (needsMapping(dto, dto.getHmRate(), "hmRate")) {
            entity.setHmRate(dto.getHmRate());
        }
        if (needsMapping(dto, dto.getTotalCaseNum(), "totalCaseNum")) {
            entity.setTotalCaseNum(dto.getTotalCaseNum());
        }
        if (needsMapping(dto, dto.getTotalPickNum(), "totalPickNum")) {
            entity.setTotalPickNum(dto.getTotalPickNum());
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
    protected boolean needsMapping(TBldl5052Dto dto, Object value, String propName) {
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
    public List<TBldl5052> mappingToEntityList(List<TBldl5052Dto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TBldl5052> entityList = new ArrayList<TBldl5052>();
        for (TBldl5052Dto dto : dtoList) {
            TBldl5052 entity = mappingToEntity(dto);
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
    public TBldl5052DtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TBldl5052DtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TBldl5052DtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TBldl5052DtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TBldl5052DtoMapper reverseReference() {
        setReverseReference(true);
        return (TBldl5052DtoMapper)this;
    }
}
