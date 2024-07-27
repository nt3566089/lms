package com.oneslogi.base.dbflute.dtomapper.bs.customize;

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
import com.oneslogi.base.dbflute.exentity.customize.*;
import com.oneslogi.base.dbflute.dto.customize.*;
import com.oneslogi.base.dbflute.dtomapper.customize.*;

/**
 * The DTO mapper of SqlTagLabelYamato. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     ARRIVAL_STORE_CD, DELIV_TEL_NO, DELIV_ZIP_CD, DELIV_ADDRESS, DELIV_CUSTOMER_NM, SLIP_CLIENT_TEL_NO, SLIP_CLIENT_ZIP_CD, SLIP_CLIENT_ADDRESS, SLIP_CLIENT_NM, CARRIER_TRACE_NUM, WORK_DT, DELIV_DT, DELIV_TZ, SLIP_ITEM_NM, BOX_NO, BOX_NO_SUM, ARTICLE, BOX_SIZE_CD, SEND_CD, NIZOROE_NO, TRACKING_NO, DELIV_TEL_NO_H, DELIV_ZIP_CD_H, DELIV_ADDRESS_H, DELIV_CUSTOMER_NM_H, SLIP_CLIENT_TEL_NO_H, SLIP_CLIENT_ZIP_CD_H, SLIP_CLIENT_ADDRESS_H, SLIP_CLIENT_NM_H, CARRIER_TRACE_NUM_H, WORK_DT_H, DELIV_DT_H, DELIV_TZ_H, SLIP_ITEM_NM_H, ARTICLE_H, SEND_CD_H, TRACKING_NO_H, BOX_NO_H, BOX_NO_H_SUM, DELIVERY_COURSE_NM
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
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
public abstract class BsSqlTagLabelYamatoDtoMapper implements DtoMapper<SqlTagLabelYamato, SqlTagLabelYamatoDto>, Serializable {

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
    public BsSqlTagLabelYamatoDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlTagLabelYamatoDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlTagLabelYamatoDto mappingToDto(SqlTagLabelYamato entity) {
        if (entity == null) {
            return null;
        }
        SqlTagLabelYamatoDto dto = new SqlTagLabelYamatoDto();
        dto.setArrivalStoreCd(entity.getArrivalStoreCd());
        dto.setDelivTelNo(entity.getDelivTelNo());
        dto.setDelivZipCd(entity.getDelivZipCd());
        dto.setDelivAddress(entity.getDelivAddress());
        dto.setDelivCustomerNm(entity.getDelivCustomerNm());
        dto.setSlipClientTelNo(entity.getSlipClientTelNo());
        dto.setSlipClientZipCd(entity.getSlipClientZipCd());
        dto.setSlipClientAddress(entity.getSlipClientAddress());
        dto.setSlipClientNm(entity.getSlipClientNm());
        dto.setCarrierTraceNum(entity.getCarrierTraceNum());
        dto.setWorkDt(entity.getWorkDt());
        dto.setDelivDt(entity.getDelivDt());
        dto.setDelivTz(entity.getDelivTz());
        dto.setSlipItemNm(entity.getSlipItemNm());
        dto.setBoxNo(entity.getBoxNo());
        dto.setBoxNoSum(entity.getBoxNoSum());
        dto.setArticle(entity.getArticle());
        dto.setBoxSizeCd(entity.getBoxSizeCd());
        dto.setSendCd(entity.getSendCd());
        dto.setNizoroeNo(entity.getNizoroeNo());
        dto.setTrackingNo(entity.getTrackingNo());
        dto.setDelivTelNoH(entity.getDelivTelNoH());
        dto.setDelivZipCdH(entity.getDelivZipCdH());
        dto.setDelivAddressH(entity.getDelivAddressH());
        dto.setDelivCustomerNmH(entity.getDelivCustomerNmH());
        dto.setSlipClientTelNoH(entity.getSlipClientTelNoH());
        dto.setSlipClientZipCdH(entity.getSlipClientZipCdH());
        dto.setSlipClientAddressH(entity.getSlipClientAddressH());
        dto.setSlipClientNmH(entity.getSlipClientNmH());
        dto.setCarrierTraceNumH(entity.getCarrierTraceNumH());
        dto.setWorkDtH(entity.getWorkDtH());
        dto.setDelivDtH(entity.getDelivDtH());
        dto.setDelivTzH(entity.getDelivTzH());
        dto.setSlipItemNmH(entity.getSlipItemNmH());
        dto.setArticleH(entity.getArticleH());
        dto.setSendCdH(entity.getSendCdH());
        dto.setTrackingNoH(entity.getTrackingNoH());
        dto.setBoxNoH(entity.getBoxNoH());
        dto.setBoxNoHSum(entity.getBoxNoHSum());
        dto.setDeliveryCourseNm(entity.getDeliveryCourseNm());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlTagLabelYamatoDto> mappingToDtoList(List<SqlTagLabelYamato> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlTagLabelYamatoDto> dtoList = new ArrayList<SqlTagLabelYamatoDto>();
        for (SqlTagLabelYamato entity : entityList) {
            SqlTagLabelYamatoDto dto = mappingToDto(entity);
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
    public SqlTagLabelYamato mappingToEntity(SqlTagLabelYamatoDto dto) {
        if (dto == null) {
            return null;
        }
        SqlTagLabelYamato entity = new SqlTagLabelYamato();
        if (needsMapping(dto, dto.getArrivalStoreCd(), "arrivalStoreCd")) {
            entity.setArrivalStoreCd(dto.getArrivalStoreCd());
        }
        if (needsMapping(dto, dto.getDelivTelNo(), "delivTelNo")) {
            entity.setDelivTelNo(dto.getDelivTelNo());
        }
        if (needsMapping(dto, dto.getDelivZipCd(), "delivZipCd")) {
            entity.setDelivZipCd(dto.getDelivZipCd());
        }
        if (needsMapping(dto, dto.getDelivAddress(), "delivAddress")) {
            entity.setDelivAddress(dto.getDelivAddress());
        }
        if (needsMapping(dto, dto.getDelivCustomerNm(), "delivCustomerNm")) {
            entity.setDelivCustomerNm(dto.getDelivCustomerNm());
        }
        if (needsMapping(dto, dto.getSlipClientTelNo(), "slipClientTelNo")) {
            entity.setSlipClientTelNo(dto.getSlipClientTelNo());
        }
        if (needsMapping(dto, dto.getSlipClientZipCd(), "slipClientZipCd")) {
            entity.setSlipClientZipCd(dto.getSlipClientZipCd());
        }
        if (needsMapping(dto, dto.getSlipClientAddress(), "slipClientAddress")) {
            entity.setSlipClientAddress(dto.getSlipClientAddress());
        }
        if (needsMapping(dto, dto.getSlipClientNm(), "slipClientNm")) {
            entity.setSlipClientNm(dto.getSlipClientNm());
        }
        if (needsMapping(dto, dto.getCarrierTraceNum(), "carrierTraceNum")) {
            entity.setCarrierTraceNum(dto.getCarrierTraceNum());
        }
        if (needsMapping(dto, dto.getWorkDt(), "workDt")) {
            entity.setWorkDt(dto.getWorkDt());
        }
        if (needsMapping(dto, dto.getDelivDt(), "delivDt")) {
            entity.setDelivDt(dto.getDelivDt());
        }
        if (needsMapping(dto, dto.getDelivTz(), "delivTz")) {
            entity.setDelivTz(dto.getDelivTz());
        }
        if (needsMapping(dto, dto.getSlipItemNm(), "slipItemNm")) {
            entity.setSlipItemNm(dto.getSlipItemNm());
        }
        if (needsMapping(dto, dto.getBoxNo(), "boxNo")) {
            entity.setBoxNo(dto.getBoxNo());
        }
        if (needsMapping(dto, dto.getBoxNoSum(), "boxNoSum")) {
            entity.setBoxNoSum(dto.getBoxNoSum());
        }
        if (needsMapping(dto, dto.getArticle(), "article")) {
            entity.setArticle(dto.getArticle());
        }
        if (needsMapping(dto, dto.getBoxSizeCd(), "boxSizeCd")) {
            entity.setBoxSizeCd(dto.getBoxSizeCd());
        }
        if (needsMapping(dto, dto.getSendCd(), "sendCd")) {
            entity.setSendCd(dto.getSendCd());
        }
        if (needsMapping(dto, dto.getNizoroeNo(), "nizoroeNo")) {
            entity.setNizoroeNo(dto.getNizoroeNo());
        }
        if (needsMapping(dto, dto.getTrackingNo(), "trackingNo")) {
            entity.setTrackingNo(dto.getTrackingNo());
        }
        if (needsMapping(dto, dto.getDelivTelNoH(), "delivTelNoH")) {
            entity.setDelivTelNoH(dto.getDelivTelNoH());
        }
        if (needsMapping(dto, dto.getDelivZipCdH(), "delivZipCdH")) {
            entity.setDelivZipCdH(dto.getDelivZipCdH());
        }
        if (needsMapping(dto, dto.getDelivAddressH(), "delivAddressH")) {
            entity.setDelivAddressH(dto.getDelivAddressH());
        }
        if (needsMapping(dto, dto.getDelivCustomerNmH(), "delivCustomerNmH")) {
            entity.setDelivCustomerNmH(dto.getDelivCustomerNmH());
        }
        if (needsMapping(dto, dto.getSlipClientTelNoH(), "slipClientTelNoH")) {
            entity.setSlipClientTelNoH(dto.getSlipClientTelNoH());
        }
        if (needsMapping(dto, dto.getSlipClientZipCdH(), "slipClientZipCdH")) {
            entity.setSlipClientZipCdH(dto.getSlipClientZipCdH());
        }
        if (needsMapping(dto, dto.getSlipClientAddressH(), "slipClientAddressH")) {
            entity.setSlipClientAddressH(dto.getSlipClientAddressH());
        }
        if (needsMapping(dto, dto.getSlipClientNmH(), "slipClientNmH")) {
            entity.setSlipClientNmH(dto.getSlipClientNmH());
        }
        if (needsMapping(dto, dto.getCarrierTraceNumH(), "carrierTraceNumH")) {
            entity.setCarrierTraceNumH(dto.getCarrierTraceNumH());
        }
        if (needsMapping(dto, dto.getWorkDtH(), "workDtH")) {
            entity.setWorkDtH(dto.getWorkDtH());
        }
        if (needsMapping(dto, dto.getDelivDtH(), "delivDtH")) {
            entity.setDelivDtH(dto.getDelivDtH());
        }
        if (needsMapping(dto, dto.getDelivTzH(), "delivTzH")) {
            entity.setDelivTzH(dto.getDelivTzH());
        }
        if (needsMapping(dto, dto.getSlipItemNmH(), "slipItemNmH")) {
            entity.setSlipItemNmH(dto.getSlipItemNmH());
        }
        if (needsMapping(dto, dto.getArticleH(), "articleH")) {
            entity.setArticleH(dto.getArticleH());
        }
        if (needsMapping(dto, dto.getSendCdH(), "sendCdH")) {
            entity.setSendCdH(dto.getSendCdH());
        }
        if (needsMapping(dto, dto.getTrackingNoH(), "trackingNoH")) {
            entity.setTrackingNoH(dto.getTrackingNoH());
        }
        if (needsMapping(dto, dto.getBoxNoH(), "boxNoH")) {
            entity.setBoxNoH(dto.getBoxNoH());
        }
        if (needsMapping(dto, dto.getBoxNoHSum(), "boxNoHSum")) {
            entity.setBoxNoHSum(dto.getBoxNoHSum());
        }
        if (needsMapping(dto, dto.getDeliveryCourseNm(), "deliveryCourseNm")) {
            entity.setDeliveryCourseNm(dto.getDeliveryCourseNm());
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
    protected boolean needsMapping(SqlTagLabelYamatoDto dto, Object value, String propName) {
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
    public List<SqlTagLabelYamato> mappingToEntityList(List<SqlTagLabelYamatoDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlTagLabelYamato> entityList = new ArrayList<SqlTagLabelYamato>();
        for (SqlTagLabelYamatoDto dto : dtoList) {
            SqlTagLabelYamato entity = mappingToEntity(dto);
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
    public SqlTagLabelYamatoDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlTagLabelYamatoDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlTagLabelYamatoDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlTagLabelYamatoDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlTagLabelYamatoDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlTagLabelYamatoDtoMapper)this;
    }
}
