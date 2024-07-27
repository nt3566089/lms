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
 * The DTO mapper of t_id_manag_data as TABLE. <br>
 * 個体管理情報
 * <pre>
 * [primary-key]
 *     ID_MANAG_DATA_ID
 *
 * [column]
 *     ID_MANAG_DATA_ID, ID_MANAG_NO, TENHANSHA_CD, SALES_ORG_CD, CUSTOMER_CD, PRODUCT_CD, HINMOKU_TEXT, JAN_CD, UNIT_NM, SHARED_PRODUCT_TYPE_CD, CUSTOMER_ORDER_NO, DELIV_CD, DESTINATION_ZIP_CD, DESTINATION_ADDRESS1, DESTINATION_ADDRESS2, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_TEL, EMP_ID_CD, EMP_NM, STORE_DT, INVENTORY_DT, PICKING_DT, PRODUCT_RETURN_DT, WASTE_RETURN_DT, ID_MANAG_ABOLITION_TYPE_CD, SPARE_TYPE_CD, DATA_EXT_FLG_PICKING, DATA_ADD_DT_PICKING, DATA_EXT_FLG_RETURN, DATA_ADD_DT_RETURN, DATA_EXT_FLG_WASTE, DATA_ADD_DT_WASTE, CM_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ID_MANAG_DATA_ID
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
public abstract class BsTIdManagDataDtoMapper implements DtoMapper<TIdManagData, TIdManagDataDto>, Serializable {

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
    public BsTIdManagDataDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTIdManagDataDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TIdManagDataDto mappingToDto(TIdManagData entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TIdManagDataDto dto = new TIdManagDataDto();
        dto.setIdManagDataId(entity.getIdManagDataId());
        dto.setIdManagNo(entity.getIdManagNo());
        dto.setTenhanshaCd(entity.getTenhanshaCd());
        dto.setSalesOrgCd(entity.getSalesOrgCd());
        dto.setCustomerCd(entity.getCustomerCd());
        dto.setProductCd(entity.getProductCd());
        dto.setHinmokuText(entity.getHinmokuText());
        dto.setJanCd(entity.getJanCd());
        dto.setUnitNm(entity.getUnitNm());
        dto.setSharedProductTypeCd(entity.getSharedProductTypeCd());
        dto.setCustomerOrderNo(entity.getCustomerOrderNo());
        dto.setDelivCd(entity.getDelivCd());
        dto.setDestinationZipCd(entity.getDestinationZipCd());
        dto.setDestinationAddress1(entity.getDestinationAddress1());
        dto.setDestinationAddress2(entity.getDestinationAddress2());
        dto.setDestinationNm1(entity.getDestinationNm1());
        dto.setDestinationNm2(entity.getDestinationNm2());
        dto.setDestinationTel(entity.getDestinationTel());
        dto.setEmpIdCd(entity.getEmpIdCd());
        dto.setEmpNm(entity.getEmpNm());
        dto.setStoreDt(entity.getStoreDt());
        dto.setInventoryDt(entity.getInventoryDt());
        dto.setPickingDt(entity.getPickingDt());
        dto.setProductReturnDt(entity.getProductReturnDt());
        dto.setWasteReturnDt(entity.getWasteReturnDt());
        dto.setIdManagAbolitionTypeCd(entity.getIdManagAbolitionTypeCd());
        dto.setSpareTypeCd(entity.getSpareTypeCd());
        dto.setDataExtFlgPicking(entity.getDataExtFlgPicking());
        dto.setDataAddDtPicking(entity.getDataAddDtPicking());
        dto.setDataExtFlgReturn(entity.getDataExtFlgReturn());
        dto.setDataAddDtReturn(entity.getDataAddDtReturn());
        dto.setDataExtFlgWaste(entity.getDataExtFlgWaste());
        dto.setDataAddDtWaste(entity.getDataAddDtWaste());
        dto.setCmSendFlg(entity.getCmSendFlg());
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
    public List<TIdManagDataDto> mappingToDtoList(List<TIdManagData> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TIdManagDataDto> dtoList = new ArrayList<TIdManagDataDto>();
        for (TIdManagData entity : entityList) {
            TIdManagDataDto dto = mappingToDto(entity);
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
    public TIdManagData mappingToEntity(TIdManagDataDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TIdManagData entity = new TIdManagData();
        if (needsMapping(dto, dto.getIdManagDataId(), "idManagDataId")) {
            entity.setIdManagDataId(dto.getIdManagDataId());
        }
        if (needsMapping(dto, dto.getIdManagNo(), "idManagNo")) {
            entity.setIdManagNo(dto.getIdManagNo());
        }
        if (needsMapping(dto, dto.getTenhanshaCd(), "tenhanshaCd")) {
            entity.setTenhanshaCd(dto.getTenhanshaCd());
        }
        if (needsMapping(dto, dto.getSalesOrgCd(), "salesOrgCd")) {
            entity.setSalesOrgCd(dto.getSalesOrgCd());
        }
        if (needsMapping(dto, dto.getCustomerCd(), "customerCd")) {
            entity.setCustomerCd(dto.getCustomerCd());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getHinmokuText(), "hinmokuText")) {
            entity.setHinmokuText(dto.getHinmokuText());
        }
        if (needsMapping(dto, dto.getJanCd(), "janCd")) {
            entity.setJanCd(dto.getJanCd());
        }
        if (needsMapping(dto, dto.getUnitNm(), "unitNm")) {
            entity.setUnitNm(dto.getUnitNm());
        }
        if (needsMapping(dto, dto.getSharedProductTypeCd(), "sharedProductTypeCd")) {
            entity.setSharedProductTypeCd(dto.getSharedProductTypeCd());
        }
        if (needsMapping(dto, dto.getCustomerOrderNo(), "customerOrderNo")) {
            entity.setCustomerOrderNo(dto.getCustomerOrderNo());
        }
        if (needsMapping(dto, dto.getDelivCd(), "delivCd")) {
            entity.setDelivCd(dto.getDelivCd());
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
        if (needsMapping(dto, dto.getDestinationNm1(), "destinationNm1")) {
            entity.setDestinationNm1(dto.getDestinationNm1());
        }
        if (needsMapping(dto, dto.getDestinationNm2(), "destinationNm2")) {
            entity.setDestinationNm2(dto.getDestinationNm2());
        }
        if (needsMapping(dto, dto.getDestinationTel(), "destinationTel")) {
            entity.setDestinationTel(dto.getDestinationTel());
        }
        if (needsMapping(dto, dto.getEmpIdCd(), "empIdCd")) {
            entity.setEmpIdCd(dto.getEmpIdCd());
        }
        if (needsMapping(dto, dto.getEmpNm(), "empNm")) {
            entity.setEmpNm(dto.getEmpNm());
        }
        if (needsMapping(dto, dto.getStoreDt(), "storeDt")) {
            entity.setStoreDt(dto.getStoreDt());
        }
        if (needsMapping(dto, dto.getInventoryDt(), "inventoryDt")) {
            entity.setInventoryDt(dto.getInventoryDt());
        }
        if (needsMapping(dto, dto.getPickingDt(), "pickingDt")) {
            entity.setPickingDt(dto.getPickingDt());
        }
        if (needsMapping(dto, dto.getProductReturnDt(), "productReturnDt")) {
            entity.setProductReturnDt(dto.getProductReturnDt());
        }
        if (needsMapping(dto, dto.getWasteReturnDt(), "wasteReturnDt")) {
            entity.setWasteReturnDt(dto.getWasteReturnDt());
        }
        if (needsMapping(dto, dto.getIdManagAbolitionTypeCd(), "idManagAbolitionTypeCd")) {
            entity.setIdManagAbolitionTypeCd(dto.getIdManagAbolitionTypeCd());
        }
        if (needsMapping(dto, dto.getSpareTypeCd(), "spareTypeCd")) {
            entity.setSpareTypeCd(dto.getSpareTypeCd());
        }
        if (needsMapping(dto, dto.getDataExtFlgPicking(), "dataExtFlgPicking")) {
            entity.setDataExtFlgPicking(dto.getDataExtFlgPicking());
        }
        if (needsMapping(dto, dto.getDataAddDtPicking(), "dataAddDtPicking")) {
            entity.setDataAddDtPicking(dto.getDataAddDtPicking());
        }
        if (needsMapping(dto, dto.getDataExtFlgReturn(), "dataExtFlgReturn")) {
            entity.setDataExtFlgReturn(dto.getDataExtFlgReturn());
        }
        if (needsMapping(dto, dto.getDataAddDtReturn(), "dataAddDtReturn")) {
            entity.setDataAddDtReturn(dto.getDataAddDtReturn());
        }
        if (needsMapping(dto, dto.getDataExtFlgWaste(), "dataExtFlgWaste")) {
            entity.setDataExtFlgWaste(dto.getDataExtFlgWaste());
        }
        if (needsMapping(dto, dto.getDataAddDtWaste(), "dataAddDtWaste")) {
            entity.setDataAddDtWaste(dto.getDataAddDtWaste());
        }
        if (needsMapping(dto, dto.getCmSendFlg(), "cmSendFlg")) {
            entity.setCmSendFlg(dto.getCmSendFlg());
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
    protected boolean needsMapping(TIdManagDataDto dto, Object value, String propName) {
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
    public List<TIdManagData> mappingToEntityList(List<TIdManagDataDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TIdManagData> entityList = new ArrayList<TIdManagData>();
        for (TIdManagDataDto dto : dtoList) {
            TIdManagData entity = mappingToEntity(dto);
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
    public TIdManagDataDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TIdManagDataDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TIdManagDataDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TIdManagDataDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TIdManagDataDtoMapper reverseReference() {
        setReverseReference(true);
        return (TIdManagDataDtoMapper)this;
    }
}
