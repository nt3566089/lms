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
 * The DTO mapper of er_inventory_inst_dtl as TABLE. <br>
 * 棚卸指示(明細)受信テーブル
 * <pre>
 * [primary-key]
 *     INVENTORY_INST_DTL_ID
 *
 * [column]
 *     INVENTORY_INST_DTL_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, INVENTORY_SLIP_NO, FISCAL_YEAR, INVENTORY_SLIP_ROW_NO, PLANT_CD, STORAGE_SPACE_CD, REFERENCE_DT, HINMOKU_CD, STOCK_NUM, UNIT_NM, PRODUCT_NM_KANJI, BARCODE, DEPOSIT_JAN_CD, SALES_ORG_CD, TENHANSHA_CD, TENHANSHA_NM1, TENHANSHA_NM2, SAP_USER_CD, SAP_USER_NM, ALLOC_TYPE_CD, LP_SEND_FLG, PRODUCT_TYPE, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public abstract class BsErInventoryInstDtlDtoMapper implements DtoMapper<ErInventoryInstDtl, ErInventoryInstDtlDto>, Serializable {

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
    public BsErInventoryInstDtlDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsErInventoryInstDtlDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public ErInventoryInstDtlDto mappingToDto(ErInventoryInstDtl entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ErInventoryInstDtlDto dto = new ErInventoryInstDtlDto();
        dto.setInventoryInstDtlId(entity.getInventoryInstDtlId());
        dto.setReceiveCd(entity.getReceiveCd());
        dto.setReceiveRowId(entity.getReceiveRowId());
        dto.setImportFlg(entity.getImportFlg());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setInventorySlipNo(entity.getInventorySlipNo());
        dto.setFiscalYear(entity.getFiscalYear());
        dto.setInventorySlipRowNo(entity.getInventorySlipRowNo());
        dto.setPlantCd(entity.getPlantCd());
        dto.setStorageSpaceCd(entity.getStorageSpaceCd());
        dto.setReferenceDt(entity.getReferenceDt());
        dto.setHinmokuCd(entity.getHinmokuCd());
        dto.setStockNum(entity.getStockNum());
        dto.setUnitNm(entity.getUnitNm());
        dto.setProductNmKanji(entity.getProductNmKanji());
        dto.setBarcode(entity.getBarcode());
        dto.setDepositJanCd(entity.getDepositJanCd());
        dto.setSalesOrgCd(entity.getSalesOrgCd());
        dto.setTenhanshaCd(entity.getTenhanshaCd());
        dto.setTenhanshaNm1(entity.getTenhanshaNm1());
        dto.setTenhanshaNm2(entity.getTenhanshaNm2());
        dto.setSapUserCd(entity.getSapUserCd());
        dto.setSapUserNm(entity.getSapUserNm());
        dto.setAllocTypeCd(entity.getAllocTypeCd());
        dto.setLpSendFlg(entity.getLpSendFlg());
        dto.setProductType(entity.getProductType());
        dto.setSapAddYyyy(entity.getSapAddYyyy());
        dto.setSapAddMm(entity.getSapAddMm());
        dto.setSapAddDd(entity.getSapAddDd());
        dto.setSapAddHh(entity.getSapAddHh());
        dto.setSapAddMi(entity.getSapAddMi());
        dto.setSapAddSs(entity.getSapAddSs());
        dto.setSapAddUserCd(entity.getSapAddUserCd());
        dto.setSapUpdYyyy(entity.getSapUpdYyyy());
        dto.setSapUpdMm(entity.getSapUpdMm());
        dto.setSapUpdDd(entity.getSapUpdDd());
        dto.setSapUpdHh(entity.getSapUpdHh());
        dto.setSapUpdMi(entity.getSapUpdMi());
        dto.setSapUpdSs(entity.getSapUpdSs());
        dto.setSapUpdUserCd(entity.getSapUpdUserCd());
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
    public List<ErInventoryInstDtlDto> mappingToDtoList(List<ErInventoryInstDtl> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<ErInventoryInstDtlDto> dtoList = new ArrayList<ErInventoryInstDtlDto>();
        for (ErInventoryInstDtl entity : entityList) {
            ErInventoryInstDtlDto dto = mappingToDto(entity);
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
    public ErInventoryInstDtl mappingToEntity(ErInventoryInstDtlDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ErInventoryInstDtl entity = new ErInventoryInstDtl();
        if (needsMapping(dto, dto.getInventoryInstDtlId(), "inventoryInstDtlId")) {
            entity.setInventoryInstDtlId(dto.getInventoryInstDtlId());
        }
        if (needsMapping(dto, dto.getReceiveCd(), "receiveCd")) {
            entity.setReceiveCd(dto.getReceiveCd());
        }
        if (needsMapping(dto, dto.getReceiveRowId(), "receiveRowId")) {
            entity.setReceiveRowId(dto.getReceiveRowId());
        }
        if (needsMapping(dto, dto.getImportFlg(), "importFlg")) {
            entity.setImportFlg(dto.getImportFlg());
        }
        if (needsMapping(dto, dto.getErrorFlg(), "errorFlg")) {
            entity.setErrorFlg(dto.getErrorFlg());
        }
        if (needsMapping(dto, dto.getErrorMessageCd(), "errorMessageCd")) {
            entity.setErrorMessageCd(dto.getErrorMessageCd());
        }
        if (needsMapping(dto, dto.getInventorySlipNo(), "inventorySlipNo")) {
            entity.setInventorySlipNo(dto.getInventorySlipNo());
        }
        if (needsMapping(dto, dto.getFiscalYear(), "fiscalYear")) {
            entity.setFiscalYear(dto.getFiscalYear());
        }
        if (needsMapping(dto, dto.getInventorySlipRowNo(), "inventorySlipRowNo")) {
            entity.setInventorySlipRowNo(dto.getInventorySlipRowNo());
        }
        if (needsMapping(dto, dto.getPlantCd(), "plantCd")) {
            entity.setPlantCd(dto.getPlantCd());
        }
        if (needsMapping(dto, dto.getStorageSpaceCd(), "storageSpaceCd")) {
            entity.setStorageSpaceCd(dto.getStorageSpaceCd());
        }
        if (needsMapping(dto, dto.getReferenceDt(), "referenceDt")) {
            entity.setReferenceDt(dto.getReferenceDt());
        }
        if (needsMapping(dto, dto.getHinmokuCd(), "hinmokuCd")) {
            entity.setHinmokuCd(dto.getHinmokuCd());
        }
        if (needsMapping(dto, dto.getStockNum(), "stockNum")) {
            entity.setStockNum(dto.getStockNum());
        }
        if (needsMapping(dto, dto.getUnitNm(), "unitNm")) {
            entity.setUnitNm(dto.getUnitNm());
        }
        if (needsMapping(dto, dto.getProductNmKanji(), "productNmKanji")) {
            entity.setProductNmKanji(dto.getProductNmKanji());
        }
        if (needsMapping(dto, dto.getBarcode(), "barcode")) {
            entity.setBarcode(dto.getBarcode());
        }
        if (needsMapping(dto, dto.getDepositJanCd(), "depositJanCd")) {
            entity.setDepositJanCd(dto.getDepositJanCd());
        }
        if (needsMapping(dto, dto.getSalesOrgCd(), "salesOrgCd")) {
            entity.setSalesOrgCd(dto.getSalesOrgCd());
        }
        if (needsMapping(dto, dto.getTenhanshaCd(), "tenhanshaCd")) {
            entity.setTenhanshaCd(dto.getTenhanshaCd());
        }
        if (needsMapping(dto, dto.getTenhanshaNm1(), "tenhanshaNm1")) {
            entity.setTenhanshaNm1(dto.getTenhanshaNm1());
        }
        if (needsMapping(dto, dto.getTenhanshaNm2(), "tenhanshaNm2")) {
            entity.setTenhanshaNm2(dto.getTenhanshaNm2());
        }
        if (needsMapping(dto, dto.getSapUserCd(), "sapUserCd")) {
            entity.setSapUserCd(dto.getSapUserCd());
        }
        if (needsMapping(dto, dto.getSapUserNm(), "sapUserNm")) {
            entity.setSapUserNm(dto.getSapUserNm());
        }
        if (needsMapping(dto, dto.getAllocTypeCd(), "allocTypeCd")) {
            entity.setAllocTypeCd(dto.getAllocTypeCd());
        }
        if (needsMapping(dto, dto.getLpSendFlg(), "lpSendFlg")) {
            entity.setLpSendFlg(dto.getLpSendFlg());
        }
        if (needsMapping(dto, dto.getProductType(), "productType")) {
            entity.setProductType(dto.getProductType());
        }
        if (needsMapping(dto, dto.getSapAddYyyy(), "sapAddYyyy")) {
            entity.setSapAddYyyy(dto.getSapAddYyyy());
        }
        if (needsMapping(dto, dto.getSapAddMm(), "sapAddMm")) {
            entity.setSapAddMm(dto.getSapAddMm());
        }
        if (needsMapping(dto, dto.getSapAddDd(), "sapAddDd")) {
            entity.setSapAddDd(dto.getSapAddDd());
        }
        if (needsMapping(dto, dto.getSapAddHh(), "sapAddHh")) {
            entity.setSapAddHh(dto.getSapAddHh());
        }
        if (needsMapping(dto, dto.getSapAddMi(), "sapAddMi")) {
            entity.setSapAddMi(dto.getSapAddMi());
        }
        if (needsMapping(dto, dto.getSapAddSs(), "sapAddSs")) {
            entity.setSapAddSs(dto.getSapAddSs());
        }
        if (needsMapping(dto, dto.getSapAddUserCd(), "sapAddUserCd")) {
            entity.setSapAddUserCd(dto.getSapAddUserCd());
        }
        if (needsMapping(dto, dto.getSapUpdYyyy(), "sapUpdYyyy")) {
            entity.setSapUpdYyyy(dto.getSapUpdYyyy());
        }
        if (needsMapping(dto, dto.getSapUpdMm(), "sapUpdMm")) {
            entity.setSapUpdMm(dto.getSapUpdMm());
        }
        if (needsMapping(dto, dto.getSapUpdDd(), "sapUpdDd")) {
            entity.setSapUpdDd(dto.getSapUpdDd());
        }
        if (needsMapping(dto, dto.getSapUpdHh(), "sapUpdHh")) {
            entity.setSapUpdHh(dto.getSapUpdHh());
        }
        if (needsMapping(dto, dto.getSapUpdMi(), "sapUpdMi")) {
            entity.setSapUpdMi(dto.getSapUpdMi());
        }
        if (needsMapping(dto, dto.getSapUpdSs(), "sapUpdSs")) {
            entity.setSapUpdSs(dto.getSapUpdSs());
        }
        if (needsMapping(dto, dto.getSapUpdUserCd(), "sapUpdUserCd")) {
            entity.setSapUpdUserCd(dto.getSapUpdUserCd());
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
    protected boolean needsMapping(ErInventoryInstDtlDto dto, Object value, String propName) {
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
    public List<ErInventoryInstDtl> mappingToEntityList(List<ErInventoryInstDtlDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<ErInventoryInstDtl> entityList = new ArrayList<ErInventoryInstDtl>();
        for (ErInventoryInstDtlDto dto : dtoList) {
            ErInventoryInstDtl entity = mappingToEntity(dto);
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
    public ErInventoryInstDtlDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (ErInventoryInstDtlDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public ErInventoryInstDtlDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (ErInventoryInstDtlDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public ErInventoryInstDtlDtoMapper reverseReference() {
        setReverseReference(true);
        return (ErInventoryInstDtlDtoMapper)this;
    }
}
