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
 * The DTO mapper of m_koguchi_delivery as TABLE. <br>
 * 戸口配送マスタ
 * <pre>
 * [primary-key]
 *     KOGUCHI_DELIVERY_ID
 *
 * [column]
 *     KOGUCHI_DELIVERY_ID, BASE_CD, SERV_SALES_ORG_ID, SERV_SALES_ORG_CD, SERV_SALES_ORG_NM, DIRECT_FLG, URGENT_FLG, DELIVERY_FLG, KOGUCHI_DELIVERY_CD, KOGUCHI_DELIVERY_NM, UNI_DELIVERY_CD, UNI_DELIVERY_NM, FW_TYPE_CD, MCA_TYPE_CD, YOUHIN_TYPE_CD, CARRIER_ID, REQ_SALES_ORG_ID, REQ_SALES_ORG_CD, REQ_SALES_ORG_NM, REQ_SALES_ORG_BRANCH_NM, REQ_SALES_ORG_ADDRESS1, REQ_SALES_ORG_ADDRESS2, REQ_SALES_ORG_ZIP_CD, REQ_SALES_ORG_TEL_NO, REQ_SALES_ORG_FAX_NO, REMARK1, REMARK2, REMARK3, REMARK4, INDV_OUT, INVOICE_SUMMARY, PSAM, ABOLISH_DT, FLOOR_COMP_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     KOGUCHI_DELIVERY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_sales_org, m_carrier
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mSalesOrg, mCarrier
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMKoguchiDeliveryDtoMapper implements DtoMapper<MKoguchiDelivery, MKoguchiDeliveryDto>, Serializable {

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
    protected boolean _suppressMSalesOrg;
    protected boolean _suppressMCarrier;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMKoguchiDeliveryDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMKoguchiDeliveryDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MKoguchiDeliveryDto mappingToDto(MKoguchiDelivery entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MKoguchiDeliveryDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MKoguchiDeliveryDto dto = new MKoguchiDeliveryDto();
        dto.setKoguchiDeliveryId(entity.getKoguchiDeliveryId());
        dto.setBaseCd(entity.getBaseCd());
        dto.setServSalesOrgId(entity.getServSalesOrgId());
        dto.setServSalesOrgCd(entity.getServSalesOrgCd());
        dto.setServSalesOrgNm(entity.getServSalesOrgNm());
        dto.setDirectFlg(entity.getDirectFlg());
        dto.setUrgentFlg(entity.getUrgentFlg());
        dto.setDeliveryFlg(entity.getDeliveryFlg());
        dto.setKoguchiDeliveryCd(entity.getKoguchiDeliveryCd());
        dto.setKoguchiDeliveryNm(entity.getKoguchiDeliveryNm());
        dto.setUniDeliveryCd(entity.getUniDeliveryCd());
        dto.setUniDeliveryNm(entity.getUniDeliveryNm());
        dto.setFwTypeCd(entity.getFwTypeCd());
        dto.setMcaTypeCd(entity.getMcaTypeCd());
        dto.setYouhinTypeCd(entity.getYouhinTypeCd());
        dto.setCarrierId(entity.getCarrierId());
        dto.setReqSalesOrgId(entity.getReqSalesOrgId());
        dto.setReqSalesOrgCd(entity.getReqSalesOrgCd());
        dto.setReqSalesOrgNm(entity.getReqSalesOrgNm());
        dto.setReqSalesOrgBranchNm(entity.getReqSalesOrgBranchNm());
        dto.setReqSalesOrgAddress1(entity.getReqSalesOrgAddress1());
        dto.setReqSalesOrgAddress2(entity.getReqSalesOrgAddress2());
        dto.setReqSalesOrgZipCd(entity.getReqSalesOrgZipCd());
        dto.setReqSalesOrgTelNo(entity.getReqSalesOrgTelNo());
        dto.setReqSalesOrgFaxNo(entity.getReqSalesOrgFaxNo());
        dto.setRemark1(entity.getRemark1());
        dto.setRemark2(entity.getRemark2());
        dto.setRemark3(entity.getRemark3());
        dto.setRemark4(entity.getRemark4());
        dto.setIndvOut(entity.getIndvOut());
        dto.setInvoiceSummary(entity.getInvoiceSummary());
        dto.setPsam(entity.getPsam());
        dto.setAbolishDt(entity.getAbolishDt());
        dto.setFloorCompFlg(entity.getFloorCompFlg());
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
        if (!_suppressMSalesOrg && entity.getMSalesOrg() != null) {
            MSalesOrg relationEntity = entity.getMSalesOrg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MSalesOrgDto relationDto = (MSalesOrgDto)cachedDto;
                dto.setMSalesOrg(relationDto);
                if (reverseReference) {
                    relationDto.getMKoguchiDeliveryList().add(dto);
                }
            } else {
                MSalesOrgDtoMapper mapper = new MSalesOrgDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMKoguchiDeliveryList();
                MSalesOrgDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMSalesOrg(relationDto);
                if (reverseReference) {
                    relationDto.getMKoguchiDeliveryList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMSalesOrg());
                }
            }
        };
        if (!_suppressMCarrier && entity.getMCarrier() != null) {
            MCarrier relationEntity = entity.getMCarrier();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCarrierDto relationDto = (MCarrierDto)cachedDto;
                dto.setMCarrier(relationDto);
                if (reverseReference) {
                    relationDto.getMKoguchiDeliveryList().add(dto);
                }
            } else {
                MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMKoguchiDeliveryList();
                MCarrierDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCarrier(relationDto);
                if (reverseReference) {
                    relationDto.getMKoguchiDeliveryList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCarrier());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MKoguchiDeliveryDto> mappingToDtoList(List<MKoguchiDelivery> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MKoguchiDeliveryDto> dtoList = new ArrayList<MKoguchiDeliveryDto>();
        for (MKoguchiDelivery entity : entityList) {
            MKoguchiDeliveryDto dto = mappingToDto(entity);
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
    public MKoguchiDelivery mappingToEntity(MKoguchiDeliveryDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MKoguchiDelivery)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MKoguchiDelivery entity = new MKoguchiDelivery();
        if (needsMapping(dto, dto.getKoguchiDeliveryId(), "koguchiDeliveryId")) {
            entity.setKoguchiDeliveryId(dto.getKoguchiDeliveryId());
        }
        if (needsMapping(dto, dto.getBaseCd(), "baseCd")) {
            entity.setBaseCd(dto.getBaseCd());
        }
        if (needsMapping(dto, dto.getServSalesOrgId(), "servSalesOrgId")) {
            entity.setServSalesOrgId(dto.getServSalesOrgId());
        }
        if (needsMapping(dto, dto.getServSalesOrgCd(), "servSalesOrgCd")) {
            entity.setServSalesOrgCd(dto.getServSalesOrgCd());
        }
        if (needsMapping(dto, dto.getServSalesOrgNm(), "servSalesOrgNm")) {
            entity.setServSalesOrgNm(dto.getServSalesOrgNm());
        }
        if (needsMapping(dto, dto.getDirectFlg(), "directFlg")) {
            entity.setDirectFlg(dto.getDirectFlg());
        }
        if (needsMapping(dto, dto.getUrgentFlg(), "urgentFlg")) {
            entity.setUrgentFlg(dto.getUrgentFlg());
        }
        if (needsMapping(dto, dto.getDeliveryFlg(), "deliveryFlg")) {
            entity.setDeliveryFlg(dto.getDeliveryFlg());
        }
        if (needsMapping(dto, dto.getKoguchiDeliveryCd(), "koguchiDeliveryCd")) {
            entity.setKoguchiDeliveryCd(dto.getKoguchiDeliveryCd());
        }
        if (needsMapping(dto, dto.getKoguchiDeliveryNm(), "koguchiDeliveryNm")) {
            entity.setKoguchiDeliveryNm(dto.getKoguchiDeliveryNm());
        }
        if (needsMapping(dto, dto.getUniDeliveryCd(), "uniDeliveryCd")) {
            entity.setUniDeliveryCd(dto.getUniDeliveryCd());
        }
        if (needsMapping(dto, dto.getUniDeliveryNm(), "uniDeliveryNm")) {
            entity.setUniDeliveryNm(dto.getUniDeliveryNm());
        }
        if (needsMapping(dto, dto.getFwTypeCd(), "fwTypeCd")) {
            entity.setFwTypeCd(dto.getFwTypeCd());
        }
        if (needsMapping(dto, dto.getMcaTypeCd(), "mcaTypeCd")) {
            entity.setMcaTypeCd(dto.getMcaTypeCd());
        }
        if (needsMapping(dto, dto.getYouhinTypeCd(), "youhinTypeCd")) {
            entity.setYouhinTypeCd(dto.getYouhinTypeCd());
        }
        if (needsMapping(dto, dto.getCarrierId(), "carrierId")) {
            entity.setCarrierId(dto.getCarrierId());
        }
        if (needsMapping(dto, dto.getReqSalesOrgId(), "reqSalesOrgId")) {
            entity.setReqSalesOrgId(dto.getReqSalesOrgId());
        }
        if (needsMapping(dto, dto.getReqSalesOrgCd(), "reqSalesOrgCd")) {
            entity.setReqSalesOrgCd(dto.getReqSalesOrgCd());
        }
        if (needsMapping(dto, dto.getReqSalesOrgNm(), "reqSalesOrgNm")) {
            entity.setReqSalesOrgNm(dto.getReqSalesOrgNm());
        }
        if (needsMapping(dto, dto.getReqSalesOrgBranchNm(), "reqSalesOrgBranchNm")) {
            entity.setReqSalesOrgBranchNm(dto.getReqSalesOrgBranchNm());
        }
        if (needsMapping(dto, dto.getReqSalesOrgAddress1(), "reqSalesOrgAddress1")) {
            entity.setReqSalesOrgAddress1(dto.getReqSalesOrgAddress1());
        }
        if (needsMapping(dto, dto.getReqSalesOrgAddress2(), "reqSalesOrgAddress2")) {
            entity.setReqSalesOrgAddress2(dto.getReqSalesOrgAddress2());
        }
        if (needsMapping(dto, dto.getReqSalesOrgZipCd(), "reqSalesOrgZipCd")) {
            entity.setReqSalesOrgZipCd(dto.getReqSalesOrgZipCd());
        }
        if (needsMapping(dto, dto.getReqSalesOrgTelNo(), "reqSalesOrgTelNo")) {
            entity.setReqSalesOrgTelNo(dto.getReqSalesOrgTelNo());
        }
        if (needsMapping(dto, dto.getReqSalesOrgFaxNo(), "reqSalesOrgFaxNo")) {
            entity.setReqSalesOrgFaxNo(dto.getReqSalesOrgFaxNo());
        }
        if (needsMapping(dto, dto.getRemark1(), "remark1")) {
            entity.setRemark1(dto.getRemark1());
        }
        if (needsMapping(dto, dto.getRemark2(), "remark2")) {
            entity.setRemark2(dto.getRemark2());
        }
        if (needsMapping(dto, dto.getRemark3(), "remark3")) {
            entity.setRemark3(dto.getRemark3());
        }
        if (needsMapping(dto, dto.getRemark4(), "remark4")) {
            entity.setRemark4(dto.getRemark4());
        }
        if (needsMapping(dto, dto.getIndvOut(), "indvOut")) {
            entity.setIndvOut(dto.getIndvOut());
        }
        if (needsMapping(dto, dto.getInvoiceSummary(), "invoiceSummary")) {
            entity.setInvoiceSummary(dto.getInvoiceSummary());
        }
        if (needsMapping(dto, dto.getPsam(), "psam")) {
            entity.setPsam(dto.getPsam());
        }
        if (needsMapping(dto, dto.getAbolishDt(), "abolishDt")) {
            entity.setAbolishDt(dto.getAbolishDt());
        }
        if (needsMapping(dto, dto.getFloorCompFlg(), "floorCompFlg")) {
            entity.setFloorCompFlg(dto.getFloorCompFlg());
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
        if (!_suppressMSalesOrg && dto.getMSalesOrg() != null) {
            MSalesOrgDto relationDto = dto.getMSalesOrg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MSalesOrg relationEntity = (MSalesOrg)cachedEntity;
                entity.setMSalesOrg(relationEntity);
                if (reverseReference) {
                    relationEntity.getMKoguchiDeliveryList().add(entity);
                }
            } else {
                MSalesOrgDtoMapper mapper = new MSalesOrgDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMKoguchiDeliveryList();
                MSalesOrg relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMSalesOrg(relationEntity);
                if (reverseReference) {
                    relationEntity.getMKoguchiDeliveryList().add(entity);
                }
                if (instanceCache && entity.getMSalesOrg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMSalesOrg());
                }
            }
        };
        if (!_suppressMCarrier && dto.getMCarrier() != null) {
            MCarrierDto relationDto = dto.getMCarrier();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCarrier relationEntity = (MCarrier)cachedEntity;
                entity.setMCarrier(relationEntity);
                if (reverseReference) {
                    relationEntity.getMKoguchiDeliveryList().add(entity);
                }
            } else {
                MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMKoguchiDeliveryList();
                MCarrier relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCarrier(relationEntity);
                if (reverseReference) {
                    relationEntity.getMKoguchiDeliveryList().add(entity);
                }
                if (instanceCache && entity.getMCarrier().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCarrier());
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
    protected boolean needsMapping(MKoguchiDeliveryDto dto, Object value, String propName) {
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
    public List<MKoguchiDelivery> mappingToEntityList(List<MKoguchiDeliveryDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MKoguchiDelivery> entityList = new ArrayList<MKoguchiDelivery>();
        for (MKoguchiDeliveryDto dto : dtoList) {
            MKoguchiDelivery entity = mappingToEntity(dto);
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
    public void suppressMSalesOrg() {
        _suppressMSalesOrg = true;
    }
    public void suppressMCarrier() {
        _suppressMCarrier = true;
    }
    protected void doSuppressAll() { // internal
        suppressMSalesOrg();
        suppressMCarrier();
    }
    protected void doSuppressClear() { // internal
        _suppressMSalesOrg = false;
        _suppressMCarrier = false;
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
    public MKoguchiDeliveryDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MKoguchiDeliveryDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MKoguchiDeliveryDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MKoguchiDeliveryDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MKoguchiDeliveryDtoMapper reverseReference() {
        setReverseReference(true);
        return (MKoguchiDeliveryDtoMapper)this;
    }
}
