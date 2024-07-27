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
 * The DTO mapper of t_shipping_plan_h as TABLE. <br>
 * 出荷予定ヘッダ
 * <pre>
 * [primary-key]
 *     SHIPPING_PLAN_H_ID
 *
 * [column]
 *     SHIPPING_PLAN_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, INPUT_TYPE, SHIPPING_DT, WORK_DT, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, CLIENT_SHIPPING_NO, SHIPPING_SLIP_NO, SHIPPING_STATUS, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_ID, DELIV_CUSTOMER_CD, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_ADDRESS_SUPPLY, DELIV_TEL_NO, DELIVERY_COURSE_ID, DELIVERY_COURSE_CD, EMERGENCY_FLG, PICKING_WORK_MESSAGE, ERROR_FLG, ERROR_MESSAGE_CD, PICKING_BATCH_NO, STOCK_OUT_FLG, ALLOC_INST_H_ID, COD, COD_TAX, TOTAL_PRICE, TOTAL_TAX, SLIP_TYPE_CD, SALES_ORDER_SLIP_TYPE_CD, DIRECT_DELIVERY_TYPE_CD, SHIPPING_TYPE_ID, SHIPPING_TYPE_CD, SALES_ORG_CD, KOGUCHI_DELIVERY_FLG, KOHAI_CONTRACTOR_CD, KOHAI_CONTRACTOR_NM, SHIPPING_REASON_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, TENHANSHA_CD, TENHANSHA_ORDER_NO, DESTINATION_CD, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_NM_KANA, DESTINATION_FAX, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_PLAN_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     t_shipping_plan_b
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     tShippingPlanBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTShippingPlanHDtoMapper implements DtoMapper<TShippingPlanH, TShippingPlanHDto>, Serializable {

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
    protected boolean _suppressTShippingPlanBList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTShippingPlanHDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTShippingPlanHDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TShippingPlanHDto mappingToDto(TShippingPlanH entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TShippingPlanHDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TShippingPlanHDto dto = new TShippingPlanHDto();
        dto.setShippingPlanHId(entity.getShippingPlanHId());
        dto.setClientId(entity.getClientId());
        dto.setCenterId(entity.getCenterId());
        dto.setProcessTypeId(entity.getProcessTypeId());
        dto.setInputType(entity.getInputType());
        dto.setShippingDt(entity.getShippingDt());
        dto.setWorkDt(entity.getWorkDt());
        dto.setDelivPlanDt(entity.getDelivPlanDt());
        dto.setDelivDt(entity.getDelivDt());
        dto.setDelivTz(entity.getDelivTz());
        dto.setClientShippingNo(entity.getClientShippingNo());
        dto.setShippingSlipNo(entity.getShippingSlipNo());
        dto.setShippingStatus(entity.getShippingStatus());
        dto.setSupplyCustomerId(entity.getSupplyCustomerId());
        dto.setSupplyCustomerCd(entity.getSupplyCustomerCd());
        dto.setSupplyCustomerNm(entity.getSupplyCustomerNm());
        dto.setDelivCustomerId(entity.getDelivCustomerId());
        dto.setDelivCustomerCd(entity.getDelivCustomerCd());
        dto.setDelivZipCd(entity.getDelivZipCd());
        dto.setDelivAddress1(entity.getDelivAddress1());
        dto.setDelivAddress2(entity.getDelivAddress2());
        dto.setDelivAddress3(entity.getDelivAddress3());
        dto.setDelivAddressSupply(entity.getDelivAddressSupply());
        dto.setDelivTelNo(entity.getDelivTelNo());
        dto.setDeliveryCourseId(entity.getDeliveryCourseId());
        dto.setDeliveryCourseCd(entity.getDeliveryCourseCd());
        dto.setEmergencyFlg(entity.getEmergencyFlg());
        dto.setPickingWorkMessage(entity.getPickingWorkMessage());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setPickingBatchNo(entity.getPickingBatchNo());
        dto.setStockOutFlg(entity.getStockOutFlg());
        dto.setAllocInstHId(entity.getAllocInstHId());
        dto.setCod(entity.getCod());
        dto.setCodTax(entity.getCodTax());
        dto.setTotalPrice(entity.getTotalPrice());
        dto.setTotalTax(entity.getTotalTax());
        dto.setSlipTypeCd(entity.getSlipTypeCd());
        dto.setSalesOrderSlipTypeCd(entity.getSalesOrderSlipTypeCd());
        dto.setDirectDeliveryTypeCd(entity.getDirectDeliveryTypeCd());
        dto.setShippingTypeId(entity.getShippingTypeId());
        dto.setShippingTypeCd(entity.getShippingTypeCd());
        dto.setSalesOrgCd(entity.getSalesOrgCd());
        dto.setKoguchiDeliveryFlg(entity.getKoguchiDeliveryFlg());
        dto.setKohaiContractorCd(entity.getKohaiContractorCd());
        dto.setKohaiContractorNm(entity.getKohaiContractorNm());
        dto.setShippingReasonCd(entity.getShippingReasonCd());
        dto.setShippingPlantCd(entity.getShippingPlantCd());
        dto.setShippingStorageSpaceCd(entity.getShippingStorageSpaceCd());
        dto.setTenhanshaCd(entity.getTenhanshaCd());
        dto.setTenhanshaOrderNo(entity.getTenhanshaOrderNo());
        dto.setDestinationCd(entity.getDestinationCd());
        dto.setDestinationNm1(entity.getDestinationNm1());
        dto.setDestinationNm2(entity.getDestinationNm2());
        dto.setDestinationNmKana(entity.getDestinationNmKana());
        dto.setDestinationFax(entity.getDestinationFax());
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
        if (!_suppressTShippingPlanBList && !entity.getTShippingPlanBList().isEmpty()) {
            TShippingPlanBDtoMapper mapper = new TShippingPlanBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTShippingPlanH();
            List<TShippingPlanBDto> relationDtoList = mapper.mappingToDtoList(entity.getTShippingPlanBList());
            dto.setTShippingPlanBList(relationDtoList);
            if (reverseReference) {
                for (TShippingPlanBDto relationDto : relationDtoList) {
                    relationDto.setTShippingPlanH(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TShippingPlanHDto> mappingToDtoList(List<TShippingPlanH> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TShippingPlanHDto> dtoList = new ArrayList<TShippingPlanHDto>();
        for (TShippingPlanH entity : entityList) {
            TShippingPlanHDto dto = mappingToDto(entity);
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
    public TShippingPlanH mappingToEntity(TShippingPlanHDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TShippingPlanH)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TShippingPlanH entity = new TShippingPlanH();
        if (needsMapping(dto, dto.getShippingPlanHId(), "shippingPlanHId")) {
            entity.setShippingPlanHId(dto.getShippingPlanHId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getProcessTypeId(), "processTypeId")) {
            entity.setProcessTypeId(dto.getProcessTypeId());
        }
        if (needsMapping(dto, dto.getInputType(), "inputType")) {
            entity.setInputType(dto.getInputType());
        }
        if (needsMapping(dto, dto.getShippingDt(), "shippingDt")) {
            entity.setShippingDt(dto.getShippingDt());
        }
        if (needsMapping(dto, dto.getWorkDt(), "workDt")) {
            entity.setWorkDt(dto.getWorkDt());
        }
        if (needsMapping(dto, dto.getDelivPlanDt(), "delivPlanDt")) {
            entity.setDelivPlanDt(dto.getDelivPlanDt());
        }
        if (needsMapping(dto, dto.getDelivDt(), "delivDt")) {
            entity.setDelivDt(dto.getDelivDt());
        }
        if (needsMapping(dto, dto.getDelivTz(), "delivTz")) {
            entity.setDelivTz(dto.getDelivTz());
        }
        if (needsMapping(dto, dto.getClientShippingNo(), "clientShippingNo")) {
            entity.setClientShippingNo(dto.getClientShippingNo());
        }
        if (needsMapping(dto, dto.getShippingSlipNo(), "shippingSlipNo")) {
            entity.setShippingSlipNo(dto.getShippingSlipNo());
        }
        if (needsMapping(dto, dto.getShippingStatus(), "shippingStatus")) {
            entity.setShippingStatus(dto.getShippingStatus());
        }
        if (needsMapping(dto, dto.getSupplyCustomerId(), "supplyCustomerId")) {
            entity.setSupplyCustomerId(dto.getSupplyCustomerId());
        }
        if (needsMapping(dto, dto.getSupplyCustomerCd(), "supplyCustomerCd")) {
            entity.setSupplyCustomerCd(dto.getSupplyCustomerCd());
        }
        if (needsMapping(dto, dto.getSupplyCustomerNm(), "supplyCustomerNm")) {
            entity.setSupplyCustomerNm(dto.getSupplyCustomerNm());
        }
        if (needsMapping(dto, dto.getDelivCustomerId(), "delivCustomerId")) {
            entity.setDelivCustomerId(dto.getDelivCustomerId());
        }
        if (needsMapping(dto, dto.getDelivCustomerCd(), "delivCustomerCd")) {
            entity.setDelivCustomerCd(dto.getDelivCustomerCd());
        }
        if (needsMapping(dto, dto.getDelivZipCd(), "delivZipCd")) {
            entity.setDelivZipCd(dto.getDelivZipCd());
        }
        if (needsMapping(dto, dto.getDelivAddress1(), "delivAddress1")) {
            entity.setDelivAddress1(dto.getDelivAddress1());
        }
        if (needsMapping(dto, dto.getDelivAddress2(), "delivAddress2")) {
            entity.setDelivAddress2(dto.getDelivAddress2());
        }
        if (needsMapping(dto, dto.getDelivAddress3(), "delivAddress3")) {
            entity.setDelivAddress3(dto.getDelivAddress3());
        }
        if (needsMapping(dto, dto.getDelivAddressSupply(), "delivAddressSupply")) {
            entity.setDelivAddressSupply(dto.getDelivAddressSupply());
        }
        if (needsMapping(dto, dto.getDelivTelNo(), "delivTelNo")) {
            entity.setDelivTelNo(dto.getDelivTelNo());
        }
        if (needsMapping(dto, dto.getDeliveryCourseId(), "deliveryCourseId")) {
            entity.setDeliveryCourseId(dto.getDeliveryCourseId());
        }
        if (needsMapping(dto, dto.getDeliveryCourseCd(), "deliveryCourseCd")) {
            entity.setDeliveryCourseCd(dto.getDeliveryCourseCd());
        }
        if (needsMapping(dto, dto.getEmergencyFlg(), "emergencyFlg")) {
            entity.setEmergencyFlg(dto.getEmergencyFlg());
        }
        if (needsMapping(dto, dto.getPickingWorkMessage(), "pickingWorkMessage")) {
            entity.setPickingWorkMessage(dto.getPickingWorkMessage());
        }
        if (needsMapping(dto, dto.getErrorFlg(), "errorFlg")) {
            entity.setErrorFlg(dto.getErrorFlg());
        }
        if (needsMapping(dto, dto.getErrorMessageCd(), "errorMessageCd")) {
            entity.setErrorMessageCd(dto.getErrorMessageCd());
        }
        if (needsMapping(dto, dto.getPickingBatchNo(), "pickingBatchNo")) {
            entity.setPickingBatchNo(dto.getPickingBatchNo());
        }
        if (needsMapping(dto, dto.getStockOutFlg(), "stockOutFlg")) {
            entity.setStockOutFlg(dto.getStockOutFlg());
        }
        if (needsMapping(dto, dto.getAllocInstHId(), "allocInstHId")) {
            entity.setAllocInstHId(dto.getAllocInstHId());
        }
        if (needsMapping(dto, dto.getCod(), "cod")) {
            entity.setCod(dto.getCod());
        }
        if (needsMapping(dto, dto.getCodTax(), "codTax")) {
            entity.setCodTax(dto.getCodTax());
        }
        if (needsMapping(dto, dto.getTotalPrice(), "totalPrice")) {
            entity.setTotalPrice(dto.getTotalPrice());
        }
        if (needsMapping(dto, dto.getTotalTax(), "totalTax")) {
            entity.setTotalTax(dto.getTotalTax());
        }
        if (needsMapping(dto, dto.getSlipTypeCd(), "slipTypeCd")) {
            entity.setSlipTypeCd(dto.getSlipTypeCd());
        }
        if (needsMapping(dto, dto.getSalesOrderSlipTypeCd(), "salesOrderSlipTypeCd")) {
            entity.setSalesOrderSlipTypeCd(dto.getSalesOrderSlipTypeCd());
        }
        if (needsMapping(dto, dto.getDirectDeliveryTypeCd(), "directDeliveryTypeCd")) {
            entity.setDirectDeliveryTypeCd(dto.getDirectDeliveryTypeCd());
        }
        if (needsMapping(dto, dto.getShippingTypeId(), "shippingTypeId")) {
            entity.setShippingTypeId(dto.getShippingTypeId());
        }
        if (needsMapping(dto, dto.getShippingTypeCd(), "shippingTypeCd")) {
            entity.setShippingTypeCd(dto.getShippingTypeCd());
        }
        if (needsMapping(dto, dto.getSalesOrgCd(), "salesOrgCd")) {
            entity.setSalesOrgCd(dto.getSalesOrgCd());
        }
        if (needsMapping(dto, dto.getKoguchiDeliveryFlg(), "koguchiDeliveryFlg")) {
            entity.setKoguchiDeliveryFlg(dto.getKoguchiDeliveryFlg());
        }
        if (needsMapping(dto, dto.getKohaiContractorCd(), "kohaiContractorCd")) {
            entity.setKohaiContractorCd(dto.getKohaiContractorCd());
        }
        if (needsMapping(dto, dto.getKohaiContractorNm(), "kohaiContractorNm")) {
            entity.setKohaiContractorNm(dto.getKohaiContractorNm());
        }
        if (needsMapping(dto, dto.getShippingReasonCd(), "shippingReasonCd")) {
            entity.setShippingReasonCd(dto.getShippingReasonCd());
        }
        if (needsMapping(dto, dto.getShippingPlantCd(), "shippingPlantCd")) {
            entity.setShippingPlantCd(dto.getShippingPlantCd());
        }
        if (needsMapping(dto, dto.getShippingStorageSpaceCd(), "shippingStorageSpaceCd")) {
            entity.setShippingStorageSpaceCd(dto.getShippingStorageSpaceCd());
        }
        if (needsMapping(dto, dto.getTenhanshaCd(), "tenhanshaCd")) {
            entity.setTenhanshaCd(dto.getTenhanshaCd());
        }
        if (needsMapping(dto, dto.getTenhanshaOrderNo(), "tenhanshaOrderNo")) {
            entity.setTenhanshaOrderNo(dto.getTenhanshaOrderNo());
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
        if (needsMapping(dto, dto.getDestinationNmKana(), "destinationNmKana")) {
            entity.setDestinationNmKana(dto.getDestinationNmKana());
        }
        if (needsMapping(dto, dto.getDestinationFax(), "destinationFax")) {
            entity.setDestinationFax(dto.getDestinationFax());
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
        if (!_suppressTShippingPlanBList && !dto.getTShippingPlanBList().isEmpty()) {
            TShippingPlanBDtoMapper mapper = new TShippingPlanBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTShippingPlanH();
            List<TShippingPlanB> relationEntityList = mapper.mappingToEntityList(dto.getTShippingPlanBList());
            entity.setTShippingPlanBList(relationEntityList);
            if (reverseReference) {
                for (TShippingPlanB relationEntity : relationEntityList) {
                    relationEntity.setTShippingPlanH(entity);
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
    protected boolean needsMapping(TShippingPlanHDto dto, Object value, String propName) {
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
    public List<TShippingPlanH> mappingToEntityList(List<TShippingPlanHDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TShippingPlanH> entityList = new ArrayList<TShippingPlanH>();
        for (TShippingPlanHDto dto : dtoList) {
            TShippingPlanH entity = mappingToEntity(dto);
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
    public void suppressTShippingPlanBList() {
        _suppressTShippingPlanBList = true;
    }
    protected void doSuppressAll() { // internal
        suppressTShippingPlanBList();
    }
    protected void doSuppressClear() { // internal
        _suppressTShippingPlanBList = false;
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
    public TShippingPlanHDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TShippingPlanHDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TShippingPlanHDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TShippingPlanHDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TShippingPlanHDtoMapper reverseReference() {
        setReverseReference(true);
        return (TShippingPlanHDtoMapper)this;
    }
}
