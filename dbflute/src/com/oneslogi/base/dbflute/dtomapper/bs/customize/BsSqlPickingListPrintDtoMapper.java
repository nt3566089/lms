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
 * The DTO mapper of SqlPickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     NIZOROE_NO2, DAIHYO_NIZOROE_NO2, SUPPLY_CUSTOMER_NM, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, KOHAI_CONTRACTOR_CD, KOHAI_CONTRACTOR_NM, SHIPPING_DT, WORK_DT, SHIPPING_FIXED_DT, CLIENT_SHIPPING_NO, PROCESS_TYPE_CD, PROCESS_TYPE_NM, SHIPPING_TYPE_CD, SHIPPING_TYPE_NM, SLIP_CNT, LINE_CNT, ITEM_CNT, INST_NUM, PACKING_NUM, NIZOROE_OUT_FLG, NIZOROE_OUT_NM, NIZOROE_OUT_DT, TAG_OUT_FLG, TAG_OUT_NM, TAG_OUT_DT, DELIV_OUT_FLG, DELIV_OUT_NM, DELIV_OUT_DT, PLL_OUT_FLG, PLL_OUT_NM, PLL_OUT_DT, INDV_SUPPLY_OUT_FLG, INDV_SUPPLY_OUT_NM, INDV_SUPPLY_OUT_DT, INDV_LABEL_OUT_FLG, INDV_LABEL_OUT_NM, INDV_LABEL_OUT_DT, CENTER_CD, CENTER_NM, EMERGENCY_FLG, PICKING_STATUS_CD, ID_MANAG_PRINT_TYPE_CD
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
public abstract class BsSqlPickingListPrintDtoMapper implements DtoMapper<SqlPickingListPrint, SqlPickingListPrintDto>, Serializable {

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
    public BsSqlPickingListPrintDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlPickingListPrintDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlPickingListPrintDto mappingToDto(SqlPickingListPrint entity) {
        if (entity == null) {
            return null;
        }
        SqlPickingListPrintDto dto = new SqlPickingListPrintDto();
        dto.setNizoroeNo2(entity.getNizoroeNo2());
        dto.setDaihyoNizoroeNo2(entity.getDaihyoNizoroeNo2());
        dto.setSupplyCustomerNm(entity.getSupplyCustomerNm());
        dto.setDeliveryCourseCd(entity.getDeliveryCourseCd());
        dto.setDeliveryCourseNm(entity.getDeliveryCourseNm());
        dto.setCarrierCd(entity.getCarrierCd());
        dto.setCarrierNm(entity.getCarrierNm());
        dto.setKohaiContractorCd(entity.getKohaiContractorCd());
        dto.setKohaiContractorNm(entity.getKohaiContractorNm());
        dto.setShippingDt(entity.getShippingDt());
        dto.setWorkDt(entity.getWorkDt());
        dto.setShippingFixedDt(entity.getShippingFixedDt());
        dto.setClientShippingNo(entity.getClientShippingNo());
        dto.setProcessTypeCd(entity.getProcessTypeCd());
        dto.setProcessTypeNm(entity.getProcessTypeNm());
        dto.setShippingTypeCd(entity.getShippingTypeCd());
        dto.setShippingTypeNm(entity.getShippingTypeNm());
        dto.setSlipCnt(entity.getSlipCnt());
        dto.setLineCnt(entity.getLineCnt());
        dto.setItemCnt(entity.getItemCnt());
        dto.setInstNum(entity.getInstNum());
        dto.setPackingNum(entity.getPackingNum());
        dto.setNizoroeOutFlg(entity.getNizoroeOutFlg());
        dto.setNizoroeOutNm(entity.getNizoroeOutNm());
        dto.setNizoroeOutDt(entity.getNizoroeOutDt());
        dto.setTagOutFlg(entity.getTagOutFlg());
        dto.setTagOutNm(entity.getTagOutNm());
        dto.setTagOutDt(entity.getTagOutDt());
        dto.setDelivOutFlg(entity.getDelivOutFlg());
        dto.setDelivOutNm(entity.getDelivOutNm());
        dto.setDelivOutDt(entity.getDelivOutDt());
        dto.setPllOutFlg(entity.getPllOutFlg());
        dto.setPllOutNm(entity.getPllOutNm());
        dto.setPllOutDt(entity.getPllOutDt());
        dto.setIndvSupplyOutFlg(entity.getIndvSupplyOutFlg());
        dto.setIndvSupplyOutNm(entity.getIndvSupplyOutNm());
        dto.setIndvSupplyOutDt(entity.getIndvSupplyOutDt());
        dto.setIndvLabelOutFlg(entity.getIndvLabelOutFlg());
        dto.setIndvLabelOutNm(entity.getIndvLabelOutNm());
        dto.setIndvLabelOutDt(entity.getIndvLabelOutDt());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterNm(entity.getCenterNm());
        dto.setEmergencyFlg(entity.getEmergencyFlg());
        dto.setPickingStatusCd(entity.getPickingStatusCd());
        dto.setIdManagPrintTypeCd(entity.getIdManagPrintTypeCd());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlPickingListPrintDto> mappingToDtoList(List<SqlPickingListPrint> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlPickingListPrintDto> dtoList = new ArrayList<SqlPickingListPrintDto>();
        for (SqlPickingListPrint entity : entityList) {
            SqlPickingListPrintDto dto = mappingToDto(entity);
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
    public SqlPickingListPrint mappingToEntity(SqlPickingListPrintDto dto) {
        if (dto == null) {
            return null;
        }
        SqlPickingListPrint entity = new SqlPickingListPrint();
        if (needsMapping(dto, dto.getNizoroeNo2(), "nizoroeNo2")) {
            entity.setNizoroeNo2(dto.getNizoroeNo2());
        }
        if (needsMapping(dto, dto.getDaihyoNizoroeNo2(), "daihyoNizoroeNo2")) {
            entity.setDaihyoNizoroeNo2(dto.getDaihyoNizoroeNo2());
        }
        if (needsMapping(dto, dto.getSupplyCustomerNm(), "supplyCustomerNm")) {
            entity.setSupplyCustomerNm(dto.getSupplyCustomerNm());
        }
        if (needsMapping(dto, dto.getDeliveryCourseCd(), "deliveryCourseCd")) {
            entity.setDeliveryCourseCd(dto.getDeliveryCourseCd());
        }
        if (needsMapping(dto, dto.getDeliveryCourseNm(), "deliveryCourseNm")) {
            entity.setDeliveryCourseNm(dto.getDeliveryCourseNm());
        }
        if (needsMapping(dto, dto.getCarrierCd(), "carrierCd")) {
            entity.setCarrierCd(dto.getCarrierCd());
        }
        if (needsMapping(dto, dto.getCarrierNm(), "carrierNm")) {
            entity.setCarrierNm(dto.getCarrierNm());
        }
        if (needsMapping(dto, dto.getKohaiContractorCd(), "kohaiContractorCd")) {
            entity.setKohaiContractorCd(dto.getKohaiContractorCd());
        }
        if (needsMapping(dto, dto.getKohaiContractorNm(), "kohaiContractorNm")) {
            entity.setKohaiContractorNm(dto.getKohaiContractorNm());
        }
        if (needsMapping(dto, dto.getShippingDt(), "shippingDt")) {
            entity.setShippingDt(dto.getShippingDt());
        }
        if (needsMapping(dto, dto.getWorkDt(), "workDt")) {
            entity.setWorkDt(dto.getWorkDt());
        }
        if (needsMapping(dto, dto.getShippingFixedDt(), "shippingFixedDt")) {
            entity.setShippingFixedDt(dto.getShippingFixedDt());
        }
        if (needsMapping(dto, dto.getClientShippingNo(), "clientShippingNo")) {
            entity.setClientShippingNo(dto.getClientShippingNo());
        }
        if (needsMapping(dto, dto.getProcessTypeCd(), "processTypeCd")) {
            entity.setProcessTypeCd(dto.getProcessTypeCd());
        }
        if (needsMapping(dto, dto.getProcessTypeNm(), "processTypeNm")) {
            entity.setProcessTypeNm(dto.getProcessTypeNm());
        }
        if (needsMapping(dto, dto.getShippingTypeCd(), "shippingTypeCd")) {
            entity.setShippingTypeCd(dto.getShippingTypeCd());
        }
        if (needsMapping(dto, dto.getShippingTypeNm(), "shippingTypeNm")) {
            entity.setShippingTypeNm(dto.getShippingTypeNm());
        }
        if (needsMapping(dto, dto.getSlipCnt(), "slipCnt")) {
            entity.setSlipCnt(dto.getSlipCnt());
        }
        if (needsMapping(dto, dto.getLineCnt(), "lineCnt")) {
            entity.setLineCnt(dto.getLineCnt());
        }
        if (needsMapping(dto, dto.getItemCnt(), "itemCnt")) {
            entity.setItemCnt(dto.getItemCnt());
        }
        if (needsMapping(dto, dto.getInstNum(), "instNum")) {
            entity.setInstNum(dto.getInstNum());
        }
        if (needsMapping(dto, dto.getPackingNum(), "packingNum")) {
            entity.setPackingNum(dto.getPackingNum());
        }
        if (needsMapping(dto, dto.getNizoroeOutFlg(), "nizoroeOutFlg")) {
            entity.setNizoroeOutFlg(dto.getNizoroeOutFlg());
        }
        if (needsMapping(dto, dto.getNizoroeOutNm(), "nizoroeOutNm")) {
            entity.setNizoroeOutNm(dto.getNizoroeOutNm());
        }
        if (needsMapping(dto, dto.getNizoroeOutDt(), "nizoroeOutDt")) {
            entity.setNizoroeOutDt(dto.getNizoroeOutDt());
        }
        if (needsMapping(dto, dto.getTagOutFlg(), "tagOutFlg")) {
            entity.setTagOutFlg(dto.getTagOutFlg());
        }
        if (needsMapping(dto, dto.getTagOutNm(), "tagOutNm")) {
            entity.setTagOutNm(dto.getTagOutNm());
        }
        if (needsMapping(dto, dto.getTagOutDt(), "tagOutDt")) {
            entity.setTagOutDt(dto.getTagOutDt());
        }
        if (needsMapping(dto, dto.getDelivOutFlg(), "delivOutFlg")) {
            entity.setDelivOutFlg(dto.getDelivOutFlg());
        }
        if (needsMapping(dto, dto.getDelivOutNm(), "delivOutNm")) {
            entity.setDelivOutNm(dto.getDelivOutNm());
        }
        if (needsMapping(dto, dto.getDelivOutDt(), "delivOutDt")) {
            entity.setDelivOutDt(dto.getDelivOutDt());
        }
        if (needsMapping(dto, dto.getPllOutFlg(), "pllOutFlg")) {
            entity.setPllOutFlg(dto.getPllOutFlg());
        }
        if (needsMapping(dto, dto.getPllOutNm(), "pllOutNm")) {
            entity.setPllOutNm(dto.getPllOutNm());
        }
        if (needsMapping(dto, dto.getPllOutDt(), "pllOutDt")) {
            entity.setPllOutDt(dto.getPllOutDt());
        }
        if (needsMapping(dto, dto.getIndvSupplyOutFlg(), "indvSupplyOutFlg")) {
            entity.setIndvSupplyOutFlg(dto.getIndvSupplyOutFlg());
        }
        if (needsMapping(dto, dto.getIndvSupplyOutNm(), "indvSupplyOutNm")) {
            entity.setIndvSupplyOutNm(dto.getIndvSupplyOutNm());
        }
        if (needsMapping(dto, dto.getIndvSupplyOutDt(), "indvSupplyOutDt")) {
            entity.setIndvSupplyOutDt(dto.getIndvSupplyOutDt());
        }
        if (needsMapping(dto, dto.getIndvLabelOutFlg(), "indvLabelOutFlg")) {
            entity.setIndvLabelOutFlg(dto.getIndvLabelOutFlg());
        }
        if (needsMapping(dto, dto.getIndvLabelOutNm(), "indvLabelOutNm")) {
            entity.setIndvLabelOutNm(dto.getIndvLabelOutNm());
        }
        if (needsMapping(dto, dto.getIndvLabelOutDt(), "indvLabelOutDt")) {
            entity.setIndvLabelOutDt(dto.getIndvLabelOutDt());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getCenterNm(), "centerNm")) {
            entity.setCenterNm(dto.getCenterNm());
        }
        if (needsMapping(dto, dto.getEmergencyFlg(), "emergencyFlg")) {
            entity.setEmergencyFlg(dto.getEmergencyFlg());
        }
        if (needsMapping(dto, dto.getPickingStatusCd(), "pickingStatusCd")) {
            entity.setPickingStatusCd(dto.getPickingStatusCd());
        }
        if (needsMapping(dto, dto.getIdManagPrintTypeCd(), "idManagPrintTypeCd")) {
            entity.setIdManagPrintTypeCd(dto.getIdManagPrintTypeCd());
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
    protected boolean needsMapping(SqlPickingListPrintDto dto, Object value, String propName) {
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
    public List<SqlPickingListPrint> mappingToEntityList(List<SqlPickingListPrintDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlPickingListPrint> entityList = new ArrayList<SqlPickingListPrint>();
        for (SqlPickingListPrintDto dto : dtoList) {
            SqlPickingListPrint entity = mappingToEntity(dto);
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
    public SqlPickingListPrintDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlPickingListPrintDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlPickingListPrintDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlPickingListPrintDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlPickingListPrintDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlPickingListPrintDtoMapper)this;
    }
}
