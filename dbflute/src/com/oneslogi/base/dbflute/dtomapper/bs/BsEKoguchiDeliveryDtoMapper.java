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
 * The DTO mapper of e_koguchi_delivery as TABLE. <br>
 * 戸口配送マスタ受信テーブル
 * <pre>
 * [primary-key]
 *     KOGUCHI_DELIVERY_ID
 *
 * [column]
 *     KOGUCHI_DELIVERY_ID, RECEIVE_CD, RECEIVE_ROW_ID, RECEIVE_FLG, ERROR_FLG, ERROR_MESSAGE_CD, BASE_CD, SERV_SALES_ORG_CD, SERV_SALES_ORG_NM, DIRECT_FLG, URGENT_FLG, DELIVERY_FLG, KOGUCHI_DELIVERY_CD, KOGUCHI_DELIVERY_NM, UNI_DELIVERY_CD, UNI_DELIVERY_NM, FW_TYPE_CD, MCA_TYPE_CD, YOUHIN_TYPE_CD, REQ_SALES_ORG_CD, REQ_SALES_ORG_NM, REQ_SALES_ORG_BRANCH_NM, REQ_SALES_ORG_ADDRESS1, REQ_SALES_ORG_ADDRESS2, REQ_SALES_ORG_ZIP_CD, REQ_SALES_ORG_TEL_NO, REQ_SALES_ORG_FAX_NO, REMARK1, REMARK2, REMARK3, REMARK4, INDV_OUT, INVOICE_SUMMARY, PSAM, ABOLISH_DT, FLOOR_COMP_FLG, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsEKoguchiDeliveryDtoMapper implements DtoMapper<EKoguchiDelivery, EKoguchiDeliveryDto>, Serializable {

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
    public BsEKoguchiDeliveryDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEKoguchiDeliveryDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EKoguchiDeliveryDto mappingToDto(EKoguchiDelivery entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EKoguchiDeliveryDto dto = new EKoguchiDeliveryDto();
        dto.setKoguchiDeliveryId(entity.getKoguchiDeliveryId());
        dto.setReceiveCd(entity.getReceiveCd());
        dto.setReceiveRowId(entity.getReceiveRowId());
        dto.setReceiveFlg(entity.getReceiveFlg());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setBaseCd(entity.getBaseCd());
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
    public List<EKoguchiDeliveryDto> mappingToDtoList(List<EKoguchiDelivery> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EKoguchiDeliveryDto> dtoList = new ArrayList<EKoguchiDeliveryDto>();
        for (EKoguchiDelivery entity : entityList) {
            EKoguchiDeliveryDto dto = mappingToDto(entity);
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
    public EKoguchiDelivery mappingToEntity(EKoguchiDeliveryDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EKoguchiDelivery entity = new EKoguchiDelivery();
        if (needsMapping(dto, dto.getKoguchiDeliveryId(), "koguchiDeliveryId")) {
            entity.setKoguchiDeliveryId(dto.getKoguchiDeliveryId());
        }
        if (needsMapping(dto, dto.getReceiveCd(), "receiveCd")) {
            entity.setReceiveCd(dto.getReceiveCd());
        }
        if (needsMapping(dto, dto.getReceiveRowId(), "receiveRowId")) {
            entity.setReceiveRowId(dto.getReceiveRowId());
        }
        if (needsMapping(dto, dto.getReceiveFlg(), "receiveFlg")) {
            entity.setReceiveFlg(dto.getReceiveFlg());
        }
        if (needsMapping(dto, dto.getErrorFlg(), "errorFlg")) {
            entity.setErrorFlg(dto.getErrorFlg());
        }
        if (needsMapping(dto, dto.getErrorMessageCd(), "errorMessageCd")) {
            entity.setErrorMessageCd(dto.getErrorMessageCd());
        }
        if (needsMapping(dto, dto.getBaseCd(), "baseCd")) {
            entity.setBaseCd(dto.getBaseCd());
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
    protected boolean needsMapping(EKoguchiDeliveryDto dto, Object value, String propName) {
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
    public List<EKoguchiDelivery> mappingToEntityList(List<EKoguchiDeliveryDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EKoguchiDelivery> entityList = new ArrayList<EKoguchiDelivery>();
        for (EKoguchiDeliveryDto dto : dtoList) {
            EKoguchiDelivery entity = mappingToEntity(dto);
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
    public EKoguchiDeliveryDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EKoguchiDeliveryDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EKoguchiDeliveryDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EKoguchiDeliveryDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EKoguchiDeliveryDtoMapper reverseReference() {
        setReverseReference(true);
        return (EKoguchiDeliveryDtoMapper)this;
    }
}
