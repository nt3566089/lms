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
 * The DTO mapper of t_bldl5060 as TABLE. <br>
 * BLDL5060
 * <pre>
 * [primary-key]
 *     BLDL5060_ID
 *
 * [column]
 *     BLDL5060_ID, YEARMONTH, BASE_NM, MONTH, ROW_NO, RETURN_DT, FW_RETURN_CNT, FW_RETURN_NUM, UN_RETURN_CNT, UN_RETURN_NUM, SH_RETURN_CNT, SH_RETURN_NUM, HM_RETURN_CNT, HM_RETURN_NUM, TOTAL_RETURN_CNT, TOTAL_RETURN_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5060_ID
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
public abstract class BsTBldl5060DtoMapper implements DtoMapper<TBldl5060, TBldl5060Dto>, Serializable {

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
    public BsTBldl5060DtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTBldl5060DtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TBldl5060Dto mappingToDto(TBldl5060 entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TBldl5060Dto dto = new TBldl5060Dto();
        dto.setBldl5060Id(entity.getBldl5060Id());
        dto.setYearmonth(entity.getYearmonth());
        dto.setBaseNm(entity.getBaseNm());
        dto.setMonth(entity.getMonth());
        dto.setRowNo(entity.getRowNo());
        dto.setReturnDt(entity.getReturnDt());
        dto.setFwReturnCnt(entity.getFwReturnCnt());
        dto.setFwReturnNum(entity.getFwReturnNum());
        dto.setUnReturnCnt(entity.getUnReturnCnt());
        dto.setUnReturnNum(entity.getUnReturnNum());
        dto.setShReturnCnt(entity.getShReturnCnt());
        dto.setShReturnNum(entity.getShReturnNum());
        dto.setHmReturnCnt(entity.getHmReturnCnt());
        dto.setHmReturnNum(entity.getHmReturnNum());
        dto.setTotalReturnCnt(entity.getTotalReturnCnt());
        dto.setTotalReturnNum(entity.getTotalReturnNum());
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
    public List<TBldl5060Dto> mappingToDtoList(List<TBldl5060> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TBldl5060Dto> dtoList = new ArrayList<TBldl5060Dto>();
        for (TBldl5060 entity : entityList) {
            TBldl5060Dto dto = mappingToDto(entity);
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
    public TBldl5060 mappingToEntity(TBldl5060Dto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TBldl5060 entity = new TBldl5060();
        if (needsMapping(dto, dto.getBldl5060Id(), "bldl5060Id")) {
            entity.setBldl5060Id(dto.getBldl5060Id());
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
        if (needsMapping(dto, dto.getReturnDt(), "returnDt")) {
            entity.setReturnDt(dto.getReturnDt());
        }
        if (needsMapping(dto, dto.getFwReturnCnt(), "fwReturnCnt")) {
            entity.setFwReturnCnt(dto.getFwReturnCnt());
        }
        if (needsMapping(dto, dto.getFwReturnNum(), "fwReturnNum")) {
            entity.setFwReturnNum(dto.getFwReturnNum());
        }
        if (needsMapping(dto, dto.getUnReturnCnt(), "unReturnCnt")) {
            entity.setUnReturnCnt(dto.getUnReturnCnt());
        }
        if (needsMapping(dto, dto.getUnReturnNum(), "unReturnNum")) {
            entity.setUnReturnNum(dto.getUnReturnNum());
        }
        if (needsMapping(dto, dto.getShReturnCnt(), "shReturnCnt")) {
            entity.setShReturnCnt(dto.getShReturnCnt());
        }
        if (needsMapping(dto, dto.getShReturnNum(), "shReturnNum")) {
            entity.setShReturnNum(dto.getShReturnNum());
        }
        if (needsMapping(dto, dto.getHmReturnCnt(), "hmReturnCnt")) {
            entity.setHmReturnCnt(dto.getHmReturnCnt());
        }
        if (needsMapping(dto, dto.getHmReturnNum(), "hmReturnNum")) {
            entity.setHmReturnNum(dto.getHmReturnNum());
        }
        if (needsMapping(dto, dto.getTotalReturnCnt(), "totalReturnCnt")) {
            entity.setTotalReturnCnt(dto.getTotalReturnCnt());
        }
        if (needsMapping(dto, dto.getTotalReturnNum(), "totalReturnNum")) {
            entity.setTotalReturnNum(dto.getTotalReturnNum());
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
    protected boolean needsMapping(TBldl5060Dto dto, Object value, String propName) {
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
    public List<TBldl5060> mappingToEntityList(List<TBldl5060Dto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TBldl5060> entityList = new ArrayList<TBldl5060>();
        for (TBldl5060Dto dto : dtoList) {
            TBldl5060 entity = mappingToEntity(dto);
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
    public TBldl5060DtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TBldl5060DtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TBldl5060DtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TBldl5060DtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TBldl5060DtoMapper reverseReference() {
        setReverseReference(true);
        return (TBldl5060DtoMapper)this;
    }
}
