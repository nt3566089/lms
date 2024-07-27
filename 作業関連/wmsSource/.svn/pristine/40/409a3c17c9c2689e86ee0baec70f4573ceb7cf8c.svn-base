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
 * The DTO mapper of es_product as TABLE. <br>
 * 商品マスタ連携送信テーブル
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, SEND_FLG, HINMOKU_CD, HINMOKU_GROUP_CD, HINMOKU_TEXT, JAN_CD, SIZE_NM, CASE_TYPE_CD, UNIT_NUM, LOGI_WEIGHT_FLG, LOGI_SPECIAL_TYPE_CD, LOGI_ATTENTION_TYPE_CD, UNIT_NM, OLD_JAN_CD, SAP_ADD_DT, SAP_ADD_TIME, STORAGE_LOCATION_TYPE_CD, MEDICAL_MANAG_FLG, PROD_DT_MANAG_FLG, PROD_DT_LIMIT_DAYS_RCV, PROD_DT_LIMIT_DAYS_SHP, NIZOROE_10_NUM, SERIAL_MANAG_FLG, OCR_DATE_FORMAT, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_NM, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_NM, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsEsProductDtoMapper implements DtoMapper<EsProduct, EsProductDto>, Serializable {

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
    public BsEsProductDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEsProductDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EsProductDto mappingToDto(EsProduct entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EsProductDto dto = new EsProductDto();
        dto.setProductId(entity.getProductId());
        dto.setSendFlg(entity.getSendFlg());
        dto.setHinmokuCd(entity.getHinmokuCd());
        dto.setHinmokuGroupCd(entity.getHinmokuGroupCd());
        dto.setHinmokuText(entity.getHinmokuText());
        dto.setJanCd(entity.getJanCd());
        dto.setSizeNm(entity.getSizeNm());
        dto.setCaseTypeCd(entity.getCaseTypeCd());
        dto.setUnitNum(entity.getUnitNum());
        dto.setLogiWeightFlg(entity.getLogiWeightFlg());
        dto.setLogiSpecialTypeCd(entity.getLogiSpecialTypeCd());
        dto.setLogiAttentionTypeCd(entity.getLogiAttentionTypeCd());
        dto.setUnitNm(entity.getUnitNm());
        dto.setOldJanCd(entity.getOldJanCd());
        dto.setSapAddDt(entity.getSapAddDt());
        dto.setSapAddTime(entity.getSapAddTime());
        dto.setStorageLocationTypeCd(entity.getStorageLocationTypeCd());
        dto.setMedicalManagFlg(entity.getMedicalManagFlg());
        dto.setProdDtManagFlg(entity.getProdDtManagFlg());
        dto.setProdDtLimitDaysRcv(entity.getProdDtLimitDaysRcv());
        dto.setProdDtLimitDaysShp(entity.getProdDtLimitDaysShp());
        dto.setNizoroe10Num(entity.getNizoroe10Num());
        dto.setSerialManagFlg(entity.getSerialManagFlg());
        dto.setOcrDateFormat(entity.getOcrDateFormat());
        dto.setSapAddYyyy(entity.getSapAddYyyy());
        dto.setSapAddMm(entity.getSapAddMm());
        dto.setSapAddDd(entity.getSapAddDd());
        dto.setSapAddHh(entity.getSapAddHh());
        dto.setSapAddMi(entity.getSapAddMi());
        dto.setSapAddSs(entity.getSapAddSs());
        dto.setSapAddUserNm(entity.getSapAddUserNm());
        dto.setSapUpdYyyy(entity.getSapUpdYyyy());
        dto.setSapUpdMm(entity.getSapUpdMm());
        dto.setSapUpdDd(entity.getSapUpdDd());
        dto.setSapUpdHh(entity.getSapUpdHh());
        dto.setSapUpdMi(entity.getSapUpdMi());
        dto.setSapUpdSs(entity.getSapUpdSs());
        dto.setSapUpdUserNm(entity.getSapUpdUserNm());
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
    public List<EsProductDto> mappingToDtoList(List<EsProduct> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EsProductDto> dtoList = new ArrayList<EsProductDto>();
        for (EsProduct entity : entityList) {
            EsProductDto dto = mappingToDto(entity);
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
    public EsProduct mappingToEntity(EsProductDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EsProduct entity = new EsProduct();
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getSendFlg(), "sendFlg")) {
            entity.setSendFlg(dto.getSendFlg());
        }
        if (needsMapping(dto, dto.getHinmokuCd(), "hinmokuCd")) {
            entity.setHinmokuCd(dto.getHinmokuCd());
        }
        if (needsMapping(dto, dto.getHinmokuGroupCd(), "hinmokuGroupCd")) {
            entity.setHinmokuGroupCd(dto.getHinmokuGroupCd());
        }
        if (needsMapping(dto, dto.getHinmokuText(), "hinmokuText")) {
            entity.setHinmokuText(dto.getHinmokuText());
        }
        if (needsMapping(dto, dto.getJanCd(), "janCd")) {
            entity.setJanCd(dto.getJanCd());
        }
        if (needsMapping(dto, dto.getSizeNm(), "sizeNm")) {
            entity.setSizeNm(dto.getSizeNm());
        }
        if (needsMapping(dto, dto.getCaseTypeCd(), "caseTypeCd")) {
            entity.setCaseTypeCd(dto.getCaseTypeCd());
        }
        if (needsMapping(dto, dto.getUnitNum(), "unitNum")) {
            entity.setUnitNum(dto.getUnitNum());
        }
        if (needsMapping(dto, dto.getLogiWeightFlg(), "logiWeightFlg")) {
            entity.setLogiWeightFlg(dto.getLogiWeightFlg());
        }
        if (needsMapping(dto, dto.getLogiSpecialTypeCd(), "logiSpecialTypeCd")) {
            entity.setLogiSpecialTypeCd(dto.getLogiSpecialTypeCd());
        }
        if (needsMapping(dto, dto.getLogiAttentionTypeCd(), "logiAttentionTypeCd")) {
            entity.setLogiAttentionTypeCd(dto.getLogiAttentionTypeCd());
        }
        if (needsMapping(dto, dto.getUnitNm(), "unitNm")) {
            entity.setUnitNm(dto.getUnitNm());
        }
        if (needsMapping(dto, dto.getOldJanCd(), "oldJanCd")) {
            entity.setOldJanCd(dto.getOldJanCd());
        }
        if (needsMapping(dto, dto.getSapAddDt(), "sapAddDt")) {
            entity.setSapAddDt(dto.getSapAddDt());
        }
        if (needsMapping(dto, dto.getSapAddTime(), "sapAddTime")) {
            entity.setSapAddTime(dto.getSapAddTime());
        }
        if (needsMapping(dto, dto.getStorageLocationTypeCd(), "storageLocationTypeCd")) {
            entity.setStorageLocationTypeCd(dto.getStorageLocationTypeCd());
        }
        if (needsMapping(dto, dto.getMedicalManagFlg(), "medicalManagFlg")) {
            entity.setMedicalManagFlg(dto.getMedicalManagFlg());
        }
        if (needsMapping(dto, dto.getProdDtManagFlg(), "prodDtManagFlg")) {
            entity.setProdDtManagFlg(dto.getProdDtManagFlg());
        }
        if (needsMapping(dto, dto.getProdDtLimitDaysRcv(), "prodDtLimitDaysRcv")) {
            entity.setProdDtLimitDaysRcv(dto.getProdDtLimitDaysRcv());
        }
        if (needsMapping(dto, dto.getProdDtLimitDaysShp(), "prodDtLimitDaysShp")) {
            entity.setProdDtLimitDaysShp(dto.getProdDtLimitDaysShp());
        }
        if (needsMapping(dto, dto.getNizoroe10Num(), "nizoroe10Num")) {
            entity.setNizoroe10Num(dto.getNizoroe10Num());
        }
        if (needsMapping(dto, dto.getSerialManagFlg(), "serialManagFlg")) {
            entity.setSerialManagFlg(dto.getSerialManagFlg());
        }
        if (needsMapping(dto, dto.getOcrDateFormat(), "ocrDateFormat")) {
            entity.setOcrDateFormat(dto.getOcrDateFormat());
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
        if (needsMapping(dto, dto.getSapAddUserNm(), "sapAddUserNm")) {
            entity.setSapAddUserNm(dto.getSapAddUserNm());
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
        if (needsMapping(dto, dto.getSapUpdUserNm(), "sapUpdUserNm")) {
            entity.setSapUpdUserNm(dto.getSapUpdUserNm());
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
    protected boolean needsMapping(EsProductDto dto, Object value, String propName) {
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
    public List<EsProduct> mappingToEntityList(List<EsProductDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EsProduct> entityList = new ArrayList<EsProduct>();
        for (EsProductDto dto : dtoList) {
            EsProduct entity = mappingToEntity(dto);
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
    public EsProductDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EsProductDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EsProductDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EsProductDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EsProductDtoMapper reverseReference() {
        setReverseReference(true);
        return (EsProductDtoMapper)this;
    }
}
