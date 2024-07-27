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
 * The DTO mapper of SqlTagLabelCommon. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     DELIVERY_COURSE_NM, ARRIVAL_STORE_CD, TRACKING_NO, SLIP_CLIENT_ADDRESS, SLIP_CLIENT_NM, SLIP_CLIENT_TEL_NO, SALES_ORG_CD, SALES_ORG_TEL, WORK_DT, DELIV_ADDRESS, DELIV_CUSTOMER_NM, SHIPPING_TYPE_CD, DEPARTMENT, DELIV_TEL_NO, INVOICE_SUMMARY, TSIH_NIZOROE_NO, BOX_NO, BOX_NO_SUM, TPIH_NIZOROE_NO, DELIV_DT, DELIV_TZ, COD_FEE, TAG_OUT_FLG, LANE_CD
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
public abstract class BsSqlTagLabelCommonDtoMapper implements DtoMapper<SqlTagLabelCommon, SqlTagLabelCommonDto>, Serializable {

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
    public BsSqlTagLabelCommonDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlTagLabelCommonDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlTagLabelCommonDto mappingToDto(SqlTagLabelCommon entity) {
        if (entity == null) {
            return null;
        }
        SqlTagLabelCommonDto dto = new SqlTagLabelCommonDto();
        dto.setDeliveryCourseNm(entity.getDeliveryCourseNm());
        dto.setArrivalStoreCd(entity.getArrivalStoreCd());
        dto.setTrackingNo(entity.getTrackingNo());
        dto.setSlipClientAddress(entity.getSlipClientAddress());
        dto.setSlipClientNm(entity.getSlipClientNm());
        dto.setSlipClientTelNo(entity.getSlipClientTelNo());
        dto.setSalesOrgCd(entity.getSalesOrgCd());
        dto.setSalesOrgTel(entity.getSalesOrgTel());
        dto.setWorkDt(entity.getWorkDt());
        dto.setDelivAddress(entity.getDelivAddress());
        dto.setDelivCustomerNm(entity.getDelivCustomerNm());
        dto.setShippingTypeCd(entity.getShippingTypeCd());
        dto.setDepartment(entity.getDepartment());
        dto.setDelivTelNo(entity.getDelivTelNo());
        dto.setInvoiceSummary(entity.getInvoiceSummary());
        dto.setTsihNizoroeNo(entity.getTsihNizoroeNo());
        dto.setBoxNo(entity.getBoxNo());
        dto.setBoxNoSum(entity.getBoxNoSum());
        dto.setTpihNizoroeNo(entity.getTpihNizoroeNo());
        dto.setDelivDt(entity.getDelivDt());
        dto.setDelivTz(entity.getDelivTz());
        dto.setCodFee(entity.getCodFee());
        dto.setTagOutFlg(entity.getTagOutFlg());
        dto.setLaneCd(entity.getLaneCd());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlTagLabelCommonDto> mappingToDtoList(List<SqlTagLabelCommon> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlTagLabelCommonDto> dtoList = new ArrayList<SqlTagLabelCommonDto>();
        for (SqlTagLabelCommon entity : entityList) {
            SqlTagLabelCommonDto dto = mappingToDto(entity);
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
    public SqlTagLabelCommon mappingToEntity(SqlTagLabelCommonDto dto) {
        if (dto == null) {
            return null;
        }
        SqlTagLabelCommon entity = new SqlTagLabelCommon();
        if (needsMapping(dto, dto.getDeliveryCourseNm(), "deliveryCourseNm")) {
            entity.setDeliveryCourseNm(dto.getDeliveryCourseNm());
        }
        if (needsMapping(dto, dto.getArrivalStoreCd(), "arrivalStoreCd")) {
            entity.setArrivalStoreCd(dto.getArrivalStoreCd());
        }
        if (needsMapping(dto, dto.getTrackingNo(), "trackingNo")) {
            entity.setTrackingNo(dto.getTrackingNo());
        }
        if (needsMapping(dto, dto.getSlipClientAddress(), "slipClientAddress")) {
            entity.setSlipClientAddress(dto.getSlipClientAddress());
        }
        if (needsMapping(dto, dto.getSlipClientNm(), "slipClientNm")) {
            entity.setSlipClientNm(dto.getSlipClientNm());
        }
        if (needsMapping(dto, dto.getSlipClientTelNo(), "slipClientTelNo")) {
            entity.setSlipClientTelNo(dto.getSlipClientTelNo());
        }
        if (needsMapping(dto, dto.getSalesOrgCd(), "salesOrgCd")) {
            entity.setSalesOrgCd(dto.getSalesOrgCd());
        }
        if (needsMapping(dto, dto.getSalesOrgTel(), "salesOrgTel")) {
            entity.setSalesOrgTel(dto.getSalesOrgTel());
        }
        if (needsMapping(dto, dto.getWorkDt(), "workDt")) {
            entity.setWorkDt(dto.getWorkDt());
        }
        if (needsMapping(dto, dto.getDelivAddress(), "delivAddress")) {
            entity.setDelivAddress(dto.getDelivAddress());
        }
        if (needsMapping(dto, dto.getDelivCustomerNm(), "delivCustomerNm")) {
            entity.setDelivCustomerNm(dto.getDelivCustomerNm());
        }
        if (needsMapping(dto, dto.getShippingTypeCd(), "shippingTypeCd")) {
            entity.setShippingTypeCd(dto.getShippingTypeCd());
        }
        if (needsMapping(dto, dto.getDepartment(), "department")) {
            entity.setDepartment(dto.getDepartment());
        }
        if (needsMapping(dto, dto.getDelivTelNo(), "delivTelNo")) {
            entity.setDelivTelNo(dto.getDelivTelNo());
        }
        if (needsMapping(dto, dto.getInvoiceSummary(), "invoiceSummary")) {
            entity.setInvoiceSummary(dto.getInvoiceSummary());
        }
        if (needsMapping(dto, dto.getTsihNizoroeNo(), "tsihNizoroeNo")) {
            entity.setTsihNizoroeNo(dto.getTsihNizoroeNo());
        }
        if (needsMapping(dto, dto.getBoxNo(), "boxNo")) {
            entity.setBoxNo(dto.getBoxNo());
        }
        if (needsMapping(dto, dto.getBoxNoSum(), "boxNoSum")) {
            entity.setBoxNoSum(dto.getBoxNoSum());
        }
        if (needsMapping(dto, dto.getTpihNizoroeNo(), "tpihNizoroeNo")) {
            entity.setTpihNizoroeNo(dto.getTpihNizoroeNo());
        }
        if (needsMapping(dto, dto.getDelivDt(), "delivDt")) {
            entity.setDelivDt(dto.getDelivDt());
        }
        if (needsMapping(dto, dto.getDelivTz(), "delivTz")) {
            entity.setDelivTz(dto.getDelivTz());
        }
        if (needsMapping(dto, dto.getCodFee(), "codFee")) {
            entity.setCodFee(dto.getCodFee());
        }
        if (needsMapping(dto, dto.getTagOutFlg(), "tagOutFlg")) {
            entity.setTagOutFlg(dto.getTagOutFlg());
        }
        if (needsMapping(dto, dto.getLaneCd(), "laneCd")) {
            entity.setLaneCd(dto.getLaneCd());
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
    protected boolean needsMapping(SqlTagLabelCommonDto dto, Object value, String propName) {
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
    public List<SqlTagLabelCommon> mappingToEntityList(List<SqlTagLabelCommonDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlTagLabelCommon> entityList = new ArrayList<SqlTagLabelCommon>();
        for (SqlTagLabelCommonDto dto : dtoList) {
            SqlTagLabelCommon entity = mappingToEntity(dto);
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
    public SqlTagLabelCommonDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlTagLabelCommonDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlTagLabelCommonDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlTagLabelCommonDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlTagLabelCommonDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlTagLabelCommonDtoMapper)this;
    }
}
