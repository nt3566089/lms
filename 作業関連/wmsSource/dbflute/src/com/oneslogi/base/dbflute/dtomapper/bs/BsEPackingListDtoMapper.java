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
 * The DTO mapper of e_packing_list as TABLE. <br>
 * 梱包明細送信テーブル
 * <pre>
 * [primary-key]
 *     PACKING_LIST_ID
 *
 * [column]
 *     PACKING_LIST_ID, SEND_FLG, SHIPPING_SLIP_NO, PACKING_NO, PACKING_ROW_NO, SHIPPING_SLIP_ROW_NO, SHIPPING_SLIP_ROW_NO_SN, HINMOKU_CD, NUM, CARRIER_SLIP_NO, WMS_ADD_YYYY, WMS_ADD_MM, WMS_ADD_DD, WMS_ADD_HH, WMS_ADD_MI, WMS_ADD_SS, WMS_ADD_USER_CD, WMS_UPD_YYYY, WMS_UPD_MM, WMS_UPD_DD, WMS_UPD_HH, WMS_UPD_MI, WMS_UPD_SS, WMS_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_LIST_ID
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
public abstract class BsEPackingListDtoMapper implements DtoMapper<EPackingList, EPackingListDto>, Serializable {

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
    public BsEPackingListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEPackingListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EPackingListDto mappingToDto(EPackingList entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EPackingListDto dto = new EPackingListDto();
        dto.setPackingListId(entity.getPackingListId());
        dto.setSendFlg(entity.getSendFlg());
        dto.setShippingSlipNo(entity.getShippingSlipNo());
        dto.setPackingNo(entity.getPackingNo());
        dto.setPackingRowNo(entity.getPackingRowNo());
        dto.setShippingSlipRowNo(entity.getShippingSlipRowNo());
        dto.setShippingSlipRowNoSn(entity.getShippingSlipRowNoSn());
        dto.setHinmokuCd(entity.getHinmokuCd());
        dto.setNum(entity.getNum());
        dto.setCarrierSlipNo(entity.getCarrierSlipNo());
        dto.setWmsAddYyyy(entity.getWmsAddYyyy());
        dto.setWmsAddMm(entity.getWmsAddMm());
        dto.setWmsAddDd(entity.getWmsAddDd());
        dto.setWmsAddHh(entity.getWmsAddHh());
        dto.setWmsAddMi(entity.getWmsAddMi());
        dto.setWmsAddSs(entity.getWmsAddSs());
        dto.setWmsAddUserCd(entity.getWmsAddUserCd());
        dto.setWmsUpdYyyy(entity.getWmsUpdYyyy());
        dto.setWmsUpdMm(entity.getWmsUpdMm());
        dto.setWmsUpdDd(entity.getWmsUpdDd());
        dto.setWmsUpdHh(entity.getWmsUpdHh());
        dto.setWmsUpdMi(entity.getWmsUpdMi());
        dto.setWmsUpdSs(entity.getWmsUpdSs());
        dto.setWmsUpdUserCd(entity.getWmsUpdUserCd());
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
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<EPackingListDto> mappingToDtoList(List<EPackingList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EPackingListDto> dtoList = new ArrayList<EPackingListDto>();
        for (EPackingList entity : entityList) {
            EPackingListDto dto = mappingToDto(entity);
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
    public EPackingList mappingToEntity(EPackingListDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EPackingList entity = new EPackingList();
        if (needsMapping(dto, dto.getPackingListId(), "packingListId")) {
            entity.setPackingListId(dto.getPackingListId());
        }
        if (needsMapping(dto, dto.getSendFlg(), "sendFlg")) {
            entity.setSendFlg(dto.getSendFlg());
        }
        if (needsMapping(dto, dto.getShippingSlipNo(), "shippingSlipNo")) {
            entity.setShippingSlipNo(dto.getShippingSlipNo());
        }
        if (needsMapping(dto, dto.getPackingNo(), "packingNo")) {
            entity.setPackingNo(dto.getPackingNo());
        }
        if (needsMapping(dto, dto.getPackingRowNo(), "packingRowNo")) {
            entity.setPackingRowNo(dto.getPackingRowNo());
        }
        if (needsMapping(dto, dto.getShippingSlipRowNo(), "shippingSlipRowNo")) {
            entity.setShippingSlipRowNo(dto.getShippingSlipRowNo());
        }
        if (needsMapping(dto, dto.getShippingSlipRowNoSn(), "shippingSlipRowNoSn")) {
            entity.setShippingSlipRowNoSn(dto.getShippingSlipRowNoSn());
        }
        if (needsMapping(dto, dto.getHinmokuCd(), "hinmokuCd")) {
            entity.setHinmokuCd(dto.getHinmokuCd());
        }
        if (needsMapping(dto, dto.getNum(), "num")) {
            entity.setNum(dto.getNum());
        }
        if (needsMapping(dto, dto.getCarrierSlipNo(), "carrierSlipNo")) {
            entity.setCarrierSlipNo(dto.getCarrierSlipNo());
        }
        if (needsMapping(dto, dto.getWmsAddYyyy(), "wmsAddYyyy")) {
            entity.setWmsAddYyyy(dto.getWmsAddYyyy());
        }
        if (needsMapping(dto, dto.getWmsAddMm(), "wmsAddMm")) {
            entity.setWmsAddMm(dto.getWmsAddMm());
        }
        if (needsMapping(dto, dto.getWmsAddDd(), "wmsAddDd")) {
            entity.setWmsAddDd(dto.getWmsAddDd());
        }
        if (needsMapping(dto, dto.getWmsAddHh(), "wmsAddHh")) {
            entity.setWmsAddHh(dto.getWmsAddHh());
        }
        if (needsMapping(dto, dto.getWmsAddMi(), "wmsAddMi")) {
            entity.setWmsAddMi(dto.getWmsAddMi());
        }
        if (needsMapping(dto, dto.getWmsAddSs(), "wmsAddSs")) {
            entity.setWmsAddSs(dto.getWmsAddSs());
        }
        if (needsMapping(dto, dto.getWmsAddUserCd(), "wmsAddUserCd")) {
            entity.setWmsAddUserCd(dto.getWmsAddUserCd());
        }
        if (needsMapping(dto, dto.getWmsUpdYyyy(), "wmsUpdYyyy")) {
            entity.setWmsUpdYyyy(dto.getWmsUpdYyyy());
        }
        if (needsMapping(dto, dto.getWmsUpdMm(), "wmsUpdMm")) {
            entity.setWmsUpdMm(dto.getWmsUpdMm());
        }
        if (needsMapping(dto, dto.getWmsUpdDd(), "wmsUpdDd")) {
            entity.setWmsUpdDd(dto.getWmsUpdDd());
        }
        if (needsMapping(dto, dto.getWmsUpdHh(), "wmsUpdHh")) {
            entity.setWmsUpdHh(dto.getWmsUpdHh());
        }
        if (needsMapping(dto, dto.getWmsUpdMi(), "wmsUpdMi")) {
            entity.setWmsUpdMi(dto.getWmsUpdMi());
        }
        if (needsMapping(dto, dto.getWmsUpdSs(), "wmsUpdSs")) {
            entity.setWmsUpdSs(dto.getWmsUpdSs());
        }
        if (needsMapping(dto, dto.getWmsUpdUserCd(), "wmsUpdUserCd")) {
            entity.setWmsUpdUserCd(dto.getWmsUpdUserCd());
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
    protected boolean needsMapping(EPackingListDto dto, Object value, String propName) {
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
    public List<EPackingList> mappingToEntityList(List<EPackingListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EPackingList> entityList = new ArrayList<EPackingList>();
        for (EPackingListDto dto : dtoList) {
            EPackingList entity = mappingToEntity(dto);
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
    public EPackingListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EPackingListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EPackingListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EPackingListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EPackingListDtoMapper reverseReference() {
        setReverseReference(true);
        return (EPackingListDtoMapper)this;
    }
}
