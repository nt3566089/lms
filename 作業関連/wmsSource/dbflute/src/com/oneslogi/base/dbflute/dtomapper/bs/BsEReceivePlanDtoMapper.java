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
 * The DTO mapper of e_receive_plan as TABLE. <br>
 * 入荷予定受信テーブル
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_ID
 *
 * [column]
 *     RECEIVE_PLAN_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, STORE_SLIP_NO, STORE_SLIP_ROW_NO, SLIP_TYPE_CD, IF_ID, IF_NO, HINMOKU_CD, HINMOKU_GROUP, SANSHA_TYPE_CD, RECEIVE_REASON_CD, RECEIVE_REASON_NM, CUSTOMER_CD, CUSTOMER_NM, ORDER_DATE, ORDER_TIME, CONFIRMED_DELIVERY_DATE, HINMOKU_TEXT, JAN_CD, UNIT_NM, RECEIVE_PLAN_NUM, RECEIVE_REMAINING_NUM, STORE_PLANT_CD, STORE_STORAGE_SPACE_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, LOT_MANAG_TYPE_CD, TENHANSHA_CD, SALES_ORG_CD, TENHANSHA_NM1, TENHANSHA_NM2, SAP_USER_CD, SAP_USER_NM, MOD_TYPE_CD, DEPOSIT_JAN_CD, TIMES_NUM, ACCOUNT_ORDER_NO, SAP_SUPPLIER_CD, SAP_VENDER_CD, TODAY_FLG, SANSHA_DELIVERY_SLIP_NO1, DATA_TYPE_CD, WMS_SEND_FLG, LP_SEND_FLG, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, DATA_TRANSFER_ONLY_STR01, DATA_TRANSFER_ONLY_STR02, DATA_TRANSFER_ONLY_STR03, DATA_TRANSFER_ONLY_STR04, DATA_TRANSFER_ONLY_STR05, DATA_TRANSFER_ONLY_STR06, DATA_TRANSFER_ONLY_STR07, DATA_TRANSFER_ONLY_STR08, DATA_TRANSFER_ONLY_STR09, DATA_TRANSFER_ONLY_STR10, DATA_TRANSFER_ONLY_STR11, DATA_TRANSFER_ONLY_STR12, DATA_TRANSFER_ONLY_STR13, DATA_TRANSFER_ONLY_STR14, DATA_TRANSFER_ONLY_STR15, DATA_TRANSFER_ONLY_STR16, DATA_TRANSFER_ONLY_STR17, DATA_TRANSFER_ONLY_STR18, DATA_TRANSFER_ONLY_STR19, DATA_TRANSFER_ONLY_STR20, DATA_TRANSFER_ONLY_STR21, DATA_TRANSFER_ONLY_STR22, DATA_TRANSFER_ONLY_STR23, DATA_TRANSFER_ONLY_STR24, DATA_TRANSFER_ONLY_STR25, DATA_TRANSFER_ONLY_STR26, DATA_TRANSFER_ONLY_STR27, DATA_TRANSFER_ONLY_STR28, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_ID
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
public abstract class BsEReceivePlanDtoMapper implements DtoMapper<EReceivePlan, EReceivePlanDto>, Serializable {

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
    public BsEReceivePlanDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEReceivePlanDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EReceivePlanDto mappingToDto(EReceivePlan entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EReceivePlanDto dto = new EReceivePlanDto();
        dto.setReceivePlanId(entity.getReceivePlanId());
        dto.setReceiveCd(entity.getReceiveCd());
        dto.setReceiveRowId(entity.getReceiveRowId());
        dto.setImportFlg(entity.getImportFlg());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setStoreSlipNo(entity.getStoreSlipNo());
        dto.setStoreSlipRowNo(entity.getStoreSlipRowNo());
        dto.setSlipTypeCd(entity.getSlipTypeCd());
        dto.setIfId(entity.getIfId());
        dto.setIfNo(entity.getIfNo());
        dto.setHinmokuCd(entity.getHinmokuCd());
        dto.setHinmokuGroup(entity.getHinmokuGroup());
        dto.setSanshaTypeCd(entity.getSanshaTypeCd());
        dto.setReceiveReasonCd(entity.getReceiveReasonCd());
        dto.setReceiveReasonNm(entity.getReceiveReasonNm());
        dto.setCustomerCd(entity.getCustomerCd());
        dto.setCustomerNm(entity.getCustomerNm());
        dto.setOrderDate(entity.getOrderDate());
        dto.setOrderTime(entity.getOrderTime());
        dto.setConfirmedDeliveryDate(entity.getConfirmedDeliveryDate());
        dto.setHinmokuText(entity.getHinmokuText());
        dto.setJanCd(entity.getJanCd());
        dto.setUnitNm(entity.getUnitNm());
        dto.setReceivePlanNum(entity.getReceivePlanNum());
        dto.setReceiveRemainingNum(entity.getReceiveRemainingNum());
        dto.setStorePlantCd(entity.getStorePlantCd());
        dto.setStoreStorageSpaceCd(entity.getStoreStorageSpaceCd());
        dto.setShippingPlantCd(entity.getShippingPlantCd());
        dto.setShippingStorageSpaceCd(entity.getShippingStorageSpaceCd());
        dto.setLotManagTypeCd(entity.getLotManagTypeCd());
        dto.setTenhanshaCd(entity.getTenhanshaCd());
        dto.setSalesOrgCd(entity.getSalesOrgCd());
        dto.setTenhanshaNm1(entity.getTenhanshaNm1());
        dto.setTenhanshaNm2(entity.getTenhanshaNm2());
        dto.setSapUserCd(entity.getSapUserCd());
        dto.setSapUserNm(entity.getSapUserNm());
        dto.setModTypeCd(entity.getModTypeCd());
        dto.setDepositJanCd(entity.getDepositJanCd());
        dto.setTimesNum(entity.getTimesNum());
        dto.setAccountOrderNo(entity.getAccountOrderNo());
        dto.setSapSupplierCd(entity.getSapSupplierCd());
        dto.setSapVenderCd(entity.getSapVenderCd());
        dto.setTodayFlg(entity.getTodayFlg());
        dto.setSanshaDeliverySlipNo1(entity.getSanshaDeliverySlipNo1());
        dto.setDataTypeCd(entity.getDataTypeCd());
        dto.setWmsSendFlg(entity.getWmsSendFlg());
        dto.setLpSendFlg(entity.getLpSendFlg());
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
        dto.setDataTransferOnlyStr01(entity.getDataTransferOnlyStr01());
        dto.setDataTransferOnlyStr02(entity.getDataTransferOnlyStr02());
        dto.setDataTransferOnlyStr03(entity.getDataTransferOnlyStr03());
        dto.setDataTransferOnlyStr04(entity.getDataTransferOnlyStr04());
        dto.setDataTransferOnlyStr05(entity.getDataTransferOnlyStr05());
        dto.setDataTransferOnlyStr06(entity.getDataTransferOnlyStr06());
        dto.setDataTransferOnlyStr07(entity.getDataTransferOnlyStr07());
        dto.setDataTransferOnlyStr08(entity.getDataTransferOnlyStr08());
        dto.setDataTransferOnlyStr09(entity.getDataTransferOnlyStr09());
        dto.setDataTransferOnlyStr10(entity.getDataTransferOnlyStr10());
        dto.setDataTransferOnlyStr11(entity.getDataTransferOnlyStr11());
        dto.setDataTransferOnlyStr12(entity.getDataTransferOnlyStr12());
        dto.setDataTransferOnlyStr13(entity.getDataTransferOnlyStr13());
        dto.setDataTransferOnlyStr14(entity.getDataTransferOnlyStr14());
        dto.setDataTransferOnlyStr15(entity.getDataTransferOnlyStr15());
        dto.setDataTransferOnlyStr16(entity.getDataTransferOnlyStr16());
        dto.setDataTransferOnlyStr17(entity.getDataTransferOnlyStr17());
        dto.setDataTransferOnlyStr18(entity.getDataTransferOnlyStr18());
        dto.setDataTransferOnlyStr19(entity.getDataTransferOnlyStr19());
        dto.setDataTransferOnlyStr20(entity.getDataTransferOnlyStr20());
        dto.setDataTransferOnlyStr21(entity.getDataTransferOnlyStr21());
        dto.setDataTransferOnlyStr22(entity.getDataTransferOnlyStr22());
        dto.setDataTransferOnlyStr23(entity.getDataTransferOnlyStr23());
        dto.setDataTransferOnlyStr24(entity.getDataTransferOnlyStr24());
        dto.setDataTransferOnlyStr25(entity.getDataTransferOnlyStr25());
        dto.setDataTransferOnlyStr26(entity.getDataTransferOnlyStr26());
        dto.setDataTransferOnlyStr27(entity.getDataTransferOnlyStr27());
        dto.setDataTransferOnlyStr28(entity.getDataTransferOnlyStr28());
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
    public List<EReceivePlanDto> mappingToDtoList(List<EReceivePlan> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EReceivePlanDto> dtoList = new ArrayList<EReceivePlanDto>();
        for (EReceivePlan entity : entityList) {
            EReceivePlanDto dto = mappingToDto(entity);
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
    public EReceivePlan mappingToEntity(EReceivePlanDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EReceivePlan entity = new EReceivePlan();
        if (needsMapping(dto, dto.getReceivePlanId(), "receivePlanId")) {
            entity.setReceivePlanId(dto.getReceivePlanId());
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
        if (needsMapping(dto, dto.getStoreSlipNo(), "storeSlipNo")) {
            entity.setStoreSlipNo(dto.getStoreSlipNo());
        }
        if (needsMapping(dto, dto.getStoreSlipRowNo(), "storeSlipRowNo")) {
            entity.setStoreSlipRowNo(dto.getStoreSlipRowNo());
        }
        if (needsMapping(dto, dto.getSlipTypeCd(), "slipTypeCd")) {
            entity.setSlipTypeCd(dto.getSlipTypeCd());
        }
        if (needsMapping(dto, dto.getIfId(), "ifId")) {
            entity.setIfId(dto.getIfId());
        }
        if (needsMapping(dto, dto.getIfNo(), "ifNo")) {
            entity.setIfNo(dto.getIfNo());
        }
        if (needsMapping(dto, dto.getHinmokuCd(), "hinmokuCd")) {
            entity.setHinmokuCd(dto.getHinmokuCd());
        }
        if (needsMapping(dto, dto.getHinmokuGroup(), "hinmokuGroup")) {
            entity.setHinmokuGroup(dto.getHinmokuGroup());
        }
        if (needsMapping(dto, dto.getSanshaTypeCd(), "sanshaTypeCd")) {
            entity.setSanshaTypeCd(dto.getSanshaTypeCd());
        }
        if (needsMapping(dto, dto.getReceiveReasonCd(), "receiveReasonCd")) {
            entity.setReceiveReasonCd(dto.getReceiveReasonCd());
        }
        if (needsMapping(dto, dto.getReceiveReasonNm(), "receiveReasonNm")) {
            entity.setReceiveReasonNm(dto.getReceiveReasonNm());
        }
        if (needsMapping(dto, dto.getCustomerCd(), "customerCd")) {
            entity.setCustomerCd(dto.getCustomerCd());
        }
        if (needsMapping(dto, dto.getCustomerNm(), "customerNm")) {
            entity.setCustomerNm(dto.getCustomerNm());
        }
        if (needsMapping(dto, dto.getOrderDate(), "orderDate")) {
            entity.setOrderDate(dto.getOrderDate());
        }
        if (needsMapping(dto, dto.getOrderTime(), "orderTime")) {
            entity.setOrderTime(dto.getOrderTime());
        }
        if (needsMapping(dto, dto.getConfirmedDeliveryDate(), "confirmedDeliveryDate")) {
            entity.setConfirmedDeliveryDate(dto.getConfirmedDeliveryDate());
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
        if (needsMapping(dto, dto.getReceivePlanNum(), "receivePlanNum")) {
            entity.setReceivePlanNum(dto.getReceivePlanNum());
        }
        if (needsMapping(dto, dto.getReceiveRemainingNum(), "receiveRemainingNum")) {
            entity.setReceiveRemainingNum(dto.getReceiveRemainingNum());
        }
        if (needsMapping(dto, dto.getStorePlantCd(), "storePlantCd")) {
            entity.setStorePlantCd(dto.getStorePlantCd());
        }
        if (needsMapping(dto, dto.getStoreStorageSpaceCd(), "storeStorageSpaceCd")) {
            entity.setStoreStorageSpaceCd(dto.getStoreStorageSpaceCd());
        }
        if (needsMapping(dto, dto.getShippingPlantCd(), "shippingPlantCd")) {
            entity.setShippingPlantCd(dto.getShippingPlantCd());
        }
        if (needsMapping(dto, dto.getShippingStorageSpaceCd(), "shippingStorageSpaceCd")) {
            entity.setShippingStorageSpaceCd(dto.getShippingStorageSpaceCd());
        }
        if (needsMapping(dto, dto.getLotManagTypeCd(), "lotManagTypeCd")) {
            entity.setLotManagTypeCd(dto.getLotManagTypeCd());
        }
        if (needsMapping(dto, dto.getTenhanshaCd(), "tenhanshaCd")) {
            entity.setTenhanshaCd(dto.getTenhanshaCd());
        }
        if (needsMapping(dto, dto.getSalesOrgCd(), "salesOrgCd")) {
            entity.setSalesOrgCd(dto.getSalesOrgCd());
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
        if (needsMapping(dto, dto.getModTypeCd(), "modTypeCd")) {
            entity.setModTypeCd(dto.getModTypeCd());
        }
        if (needsMapping(dto, dto.getDepositJanCd(), "depositJanCd")) {
            entity.setDepositJanCd(dto.getDepositJanCd());
        }
        if (needsMapping(dto, dto.getTimesNum(), "timesNum")) {
            entity.setTimesNum(dto.getTimesNum());
        }
        if (needsMapping(dto, dto.getAccountOrderNo(), "accountOrderNo")) {
            entity.setAccountOrderNo(dto.getAccountOrderNo());
        }
        if (needsMapping(dto, dto.getSapSupplierCd(), "sapSupplierCd")) {
            entity.setSapSupplierCd(dto.getSapSupplierCd());
        }
        if (needsMapping(dto, dto.getSapVenderCd(), "sapVenderCd")) {
            entity.setSapVenderCd(dto.getSapVenderCd());
        }
        if (needsMapping(dto, dto.getTodayFlg(), "todayFlg")) {
            entity.setTodayFlg(dto.getTodayFlg());
        }
        if (needsMapping(dto, dto.getSanshaDeliverySlipNo1(), "sanshaDeliverySlipNo1")) {
            entity.setSanshaDeliverySlipNo1(dto.getSanshaDeliverySlipNo1());
        }
        if (needsMapping(dto, dto.getDataTypeCd(), "dataTypeCd")) {
            entity.setDataTypeCd(dto.getDataTypeCd());
        }
        if (needsMapping(dto, dto.getWmsSendFlg(), "wmsSendFlg")) {
            entity.setWmsSendFlg(dto.getWmsSendFlg());
        }
        if (needsMapping(dto, dto.getLpSendFlg(), "lpSendFlg")) {
            entity.setLpSendFlg(dto.getLpSendFlg());
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
        if (needsMapping(dto, dto.getDataTransferOnlyStr01(), "dataTransferOnlyStr01")) {
            entity.setDataTransferOnlyStr01(dto.getDataTransferOnlyStr01());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr02(), "dataTransferOnlyStr02")) {
            entity.setDataTransferOnlyStr02(dto.getDataTransferOnlyStr02());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr03(), "dataTransferOnlyStr03")) {
            entity.setDataTransferOnlyStr03(dto.getDataTransferOnlyStr03());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr04(), "dataTransferOnlyStr04")) {
            entity.setDataTransferOnlyStr04(dto.getDataTransferOnlyStr04());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr05(), "dataTransferOnlyStr05")) {
            entity.setDataTransferOnlyStr05(dto.getDataTransferOnlyStr05());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr06(), "dataTransferOnlyStr06")) {
            entity.setDataTransferOnlyStr06(dto.getDataTransferOnlyStr06());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr07(), "dataTransferOnlyStr07")) {
            entity.setDataTransferOnlyStr07(dto.getDataTransferOnlyStr07());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr08(), "dataTransferOnlyStr08")) {
            entity.setDataTransferOnlyStr08(dto.getDataTransferOnlyStr08());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr09(), "dataTransferOnlyStr09")) {
            entity.setDataTransferOnlyStr09(dto.getDataTransferOnlyStr09());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr10(), "dataTransferOnlyStr10")) {
            entity.setDataTransferOnlyStr10(dto.getDataTransferOnlyStr10());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr11(), "dataTransferOnlyStr11")) {
            entity.setDataTransferOnlyStr11(dto.getDataTransferOnlyStr11());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr12(), "dataTransferOnlyStr12")) {
            entity.setDataTransferOnlyStr12(dto.getDataTransferOnlyStr12());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr13(), "dataTransferOnlyStr13")) {
            entity.setDataTransferOnlyStr13(dto.getDataTransferOnlyStr13());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr14(), "dataTransferOnlyStr14")) {
            entity.setDataTransferOnlyStr14(dto.getDataTransferOnlyStr14());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr15(), "dataTransferOnlyStr15")) {
            entity.setDataTransferOnlyStr15(dto.getDataTransferOnlyStr15());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr16(), "dataTransferOnlyStr16")) {
            entity.setDataTransferOnlyStr16(dto.getDataTransferOnlyStr16());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr17(), "dataTransferOnlyStr17")) {
            entity.setDataTransferOnlyStr17(dto.getDataTransferOnlyStr17());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr18(), "dataTransferOnlyStr18")) {
            entity.setDataTransferOnlyStr18(dto.getDataTransferOnlyStr18());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr19(), "dataTransferOnlyStr19")) {
            entity.setDataTransferOnlyStr19(dto.getDataTransferOnlyStr19());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr20(), "dataTransferOnlyStr20")) {
            entity.setDataTransferOnlyStr20(dto.getDataTransferOnlyStr20());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr21(), "dataTransferOnlyStr21")) {
            entity.setDataTransferOnlyStr21(dto.getDataTransferOnlyStr21());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr22(), "dataTransferOnlyStr22")) {
            entity.setDataTransferOnlyStr22(dto.getDataTransferOnlyStr22());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr23(), "dataTransferOnlyStr23")) {
            entity.setDataTransferOnlyStr23(dto.getDataTransferOnlyStr23());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr24(), "dataTransferOnlyStr24")) {
            entity.setDataTransferOnlyStr24(dto.getDataTransferOnlyStr24());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr25(), "dataTransferOnlyStr25")) {
            entity.setDataTransferOnlyStr25(dto.getDataTransferOnlyStr25());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr26(), "dataTransferOnlyStr26")) {
            entity.setDataTransferOnlyStr26(dto.getDataTransferOnlyStr26());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr27(), "dataTransferOnlyStr27")) {
            entity.setDataTransferOnlyStr27(dto.getDataTransferOnlyStr27());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr28(), "dataTransferOnlyStr28")) {
            entity.setDataTransferOnlyStr28(dto.getDataTransferOnlyStr28());
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
    protected boolean needsMapping(EReceivePlanDto dto, Object value, String propName) {
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
    public List<EReceivePlan> mappingToEntityList(List<EReceivePlanDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EReceivePlan> entityList = new ArrayList<EReceivePlan>();
        for (EReceivePlanDto dto : dtoList) {
            EReceivePlan entity = mappingToEntity(dto);
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
    public EReceivePlanDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EReceivePlanDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EReceivePlanDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EReceivePlanDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EReceivePlanDtoMapper reverseReference() {
        setReverseReference(true);
        return (EReceivePlanDtoMapper)this;
    }
}
