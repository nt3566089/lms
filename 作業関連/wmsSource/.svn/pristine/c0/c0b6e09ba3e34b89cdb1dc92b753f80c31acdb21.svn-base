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
 * The DTO mapper of t_shipping_inst_h as TABLE. <br>
 * 出荷指示ヘッダ
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_H_ID
 *
 * [column]
 *     SHIPPING_INST_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, INPUT_TYPE, SHIPPING_DT, WORK_DT, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, CLIENT_SHIPPING_NO, SHIPPING_SLIP_NO, SHIPPING_STATUS, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_ID, DELIV_CUSTOMER_CD, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_ADDRESS_SUPPLY, DELIV_CUSTOMER_NM, DELIV_CUSTOMER_NM1, DELIV_CUSTOMER_NM2, DELIV_TEL_NO, DELIVERY_COURSE_ID, DELIVERY_COURSE_CD, EMERGENCY_FLG, PICKING_WORK_MESSAGE, ERROR_FLG, ERROR_MESSAGE_CD, PICKING_BATCH_NO, STOCK_OUT_FLG, ALLOC_INST_H_ID, COD, COD_TAX, TOTAL_PRICE, TOTAL_TAX, NIZOROE_NO, DAIHYO_NIZOROE_NO, NIZOROE_NO2, DAIHYO_NIZOROE_NO2, SHIPPING_TYPE_ID, SHIPPING_TYPE_CD, CARRIER_ID, CARRIER_CD, SALES_ORG_CD, SALES_ORDER_NO, SALES_ORDER_SLIP_TYPE_CD, SALES_ORDER_SLIP_NO, ORDER_DT, KOKYAKU_CD, SHIPPING_FEE, SEPARATE_SHIPPING_FEE, COD_FEE, ORDER_NO_DELIVERY_NOTE, POINT, KOGUCHI_DELIVERY_FLG, RECORD_SEND_FLG, CARRIER_DATA_OUT_FLG, KOHAI_CONTRACTOR_CD, KOHAI_CONTRACTOR_NM, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, NIZOROE_ID, NIZOROE_PROC_UNIT, ACCOUNT_ID, ACCOUNT_CD, SHIPPING_REASON_CD, TRANSFER_FLG, TENHANSHA_SALES_ORDER_NO, DELIV_CD, SALES_ORDER_NUM, DIRECT_DELIVERY_TYPE_CD, SPLIT_DELIVERY_TYPE_CD, CARRIER_TYPE_CD, SPECIFY_DELIVERY_DT, SPECIFY_DELIVERY_TIME, TENHANSHA_CD, DESTINATION_NM_KANA, DESTINATION_FAX, KANJI_MESSAGE1, KANJI_MESSAGE2, KANJI_MESSAGE3, KANJI_MESSAGE4, KANJI_MESSAGE5, KANJI_MESSAGE6, KANJI_MESSAGE7, KANJI_MESSAGE8, KANJI_MESSAGE9, KANJI_MESSAGE10, KANA_MESSAGE1, KANA_MESSAGE2, KANA_MESSAGE3, KANA_MESSAGE4, KANA_MESSAGE5, KANA_MESSAGE6, KANA_MESSAGE7, KANA_MESSAGE8, KANA_MESSAGE9, KANA_MESSAGE10, DELIVERY_NOTE_SUMMARY, INVOICE_SUMMARY, EC_ORDER_NO, PAYMENT_TYPE_CD, PRICE_HIDDEN_FLG, PAYMENT_HIDDEN_FLG, DIRECT_UPD_FLG, IF_ID, CUSTOMER_CD, CUSTOMER_NM, PSAM, FLOOR_COMP_FLG, DELIVERY_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_delivery_course, m_process_type, m_customer, m_client, t_alloc_inst_h, m_center, m_zip(ForDeliv), b_class_dtl(ByDelivTz)
 *
 * [referrer-table]
 *     t_ec_order_h, t_shipping_inst_b, t_shipping_inst_h_print
 *
 * [foreign-property]
 *     mDeliveryCourse, mProcessType, mCustomerByDelivCustomerId, mClient, mCustomerBySupplyCustomerId, tAllocInstH, mCenter, mZipForDeliv, bClassDtlByDelivTz, bClassDtlByEmergencyFlg, bClassDtlByErrorFlg, bClassDtlByInputType, bClassDtlByShippingStatus, bClassDtlByStockOutFlg
 *
 * [referrer-property]
 *     tEcOrderHList, tShippingInstBList, tShippingInstHPrintList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTShippingInstHDtoMapper implements DtoMapper<TShippingInstH, TShippingInstHDto>, Serializable {

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
    protected boolean _suppressMDeliveryCourse;
    protected boolean _suppressMProcessType;
    protected boolean _suppressMCustomerByDelivCustomerId;
    protected boolean _suppressMClient;
    protected boolean _suppressMCustomerBySupplyCustomerId;
    protected boolean _suppressTAllocInstH;
    protected boolean _suppressMCenter;
    protected boolean _suppressMZipForDeliv;
    protected boolean _suppressBClassDtlByDelivTz;
    protected boolean _suppressBClassDtlByEmergencyFlg;
    protected boolean _suppressBClassDtlByErrorFlg;
    protected boolean _suppressBClassDtlByInputType;
    protected boolean _suppressBClassDtlByShippingStatus;
    protected boolean _suppressBClassDtlByStockOutFlg;
    protected boolean _suppressTEcOrderHList;
    protected boolean _suppressTShippingInstBList;
    protected boolean _suppressTShippingInstHPrintList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTShippingInstHDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTShippingInstHDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TShippingInstHDto mappingToDto(TShippingInstH entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TShippingInstHDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TShippingInstHDto dto = new TShippingInstHDto();
        dto.setShippingInstHId(entity.getShippingInstHId());
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
        dto.setDelivCustomerNm(entity.getDelivCustomerNm());
        dto.setDelivCustomerNm1(entity.getDelivCustomerNm1());
        dto.setDelivCustomerNm2(entity.getDelivCustomerNm2());
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
        dto.setNizoroeNo(entity.getNizoroeNo());
        dto.setDaihyoNizoroeNo(entity.getDaihyoNizoroeNo());
        dto.setNizoroeNo2(entity.getNizoroeNo2());
        dto.setDaihyoNizoroeNo2(entity.getDaihyoNizoroeNo2());
        dto.setShippingTypeId(entity.getShippingTypeId());
        dto.setShippingTypeCd(entity.getShippingTypeCd());
        dto.setCarrierId(entity.getCarrierId());
        dto.setCarrierCd(entity.getCarrierCd());
        dto.setSalesOrgCd(entity.getSalesOrgCd());
        dto.setSalesOrderNo(entity.getSalesOrderNo());
        dto.setSalesOrderSlipTypeCd(entity.getSalesOrderSlipTypeCd());
        dto.setSalesOrderSlipNo(entity.getSalesOrderSlipNo());
        dto.setOrderDt(entity.getOrderDt());
        dto.setKokyakuCd(entity.getKokyakuCd());
        dto.setShippingFee(entity.getShippingFee());
        dto.setSeparateShippingFee(entity.getSeparateShippingFee());
        dto.setCodFee(entity.getCodFee());
        dto.setOrderNoDeliveryNote(entity.getOrderNoDeliveryNote());
        dto.setPoint(entity.getPoint());
        dto.setKoguchiDeliveryFlg(entity.getKoguchiDeliveryFlg());
        dto.setRecordSendFlg(entity.getRecordSendFlg());
        dto.setCarrierDataOutFlg(entity.getCarrierDataOutFlg());
        dto.setKohaiContractorCd(entity.getKohaiContractorCd());
        dto.setKohaiContractorNm(entity.getKohaiContractorNm());
        dto.setShippingPlantCd(entity.getShippingPlantCd());
        dto.setShippingStorageSpaceCd(entity.getShippingStorageSpaceCd());
        dto.setNizoroeId(entity.getNizoroeId());
        dto.setNizoroeProcUnit(entity.getNizoroeProcUnit());
        dto.setAccountId(entity.getAccountId());
        dto.setAccountCd(entity.getAccountCd());
        dto.setShippingReasonCd(entity.getShippingReasonCd());
        dto.setTransferFlg(entity.getTransferFlg());
        dto.setTenhanshaSalesOrderNo(entity.getTenhanshaSalesOrderNo());
        dto.setDelivCd(entity.getDelivCd());
        dto.setSalesOrderNum(entity.getSalesOrderNum());
        dto.setDirectDeliveryTypeCd(entity.getDirectDeliveryTypeCd());
        dto.setSplitDeliveryTypeCd(entity.getSplitDeliveryTypeCd());
        dto.setCarrierTypeCd(entity.getCarrierTypeCd());
        dto.setSpecifyDeliveryDt(entity.getSpecifyDeliveryDt());
        dto.setSpecifyDeliveryTime(entity.getSpecifyDeliveryTime());
        dto.setTenhanshaCd(entity.getTenhanshaCd());
        dto.setDestinationNmKana(entity.getDestinationNmKana());
        dto.setDestinationFax(entity.getDestinationFax());
        dto.setKanjiMessage1(entity.getKanjiMessage1());
        dto.setKanjiMessage2(entity.getKanjiMessage2());
        dto.setKanjiMessage3(entity.getKanjiMessage3());
        dto.setKanjiMessage4(entity.getKanjiMessage4());
        dto.setKanjiMessage5(entity.getKanjiMessage5());
        dto.setKanjiMessage6(entity.getKanjiMessage6());
        dto.setKanjiMessage7(entity.getKanjiMessage7());
        dto.setKanjiMessage8(entity.getKanjiMessage8());
        dto.setKanjiMessage9(entity.getKanjiMessage9());
        dto.setKanjiMessage10(entity.getKanjiMessage10());
        dto.setKanaMessage1(entity.getKanaMessage1());
        dto.setKanaMessage2(entity.getKanaMessage2());
        dto.setKanaMessage3(entity.getKanaMessage3());
        dto.setKanaMessage4(entity.getKanaMessage4());
        dto.setKanaMessage5(entity.getKanaMessage5());
        dto.setKanaMessage6(entity.getKanaMessage6());
        dto.setKanaMessage7(entity.getKanaMessage7());
        dto.setKanaMessage8(entity.getKanaMessage8());
        dto.setKanaMessage9(entity.getKanaMessage9());
        dto.setKanaMessage10(entity.getKanaMessage10());
        dto.setDeliveryNoteSummary(entity.getDeliveryNoteSummary());
        dto.setInvoiceSummary(entity.getInvoiceSummary());
        dto.setEcOrderNo(entity.getEcOrderNo());
        dto.setPaymentTypeCd(entity.getPaymentTypeCd());
        dto.setPriceHiddenFlg(entity.getPriceHiddenFlg());
        dto.setPaymentHiddenFlg(entity.getPaymentHiddenFlg());
        dto.setDirectUpdFlg(entity.getDirectUpdFlg());
        dto.setIfId(entity.getIfId());
        dto.setCustomerCd(entity.getCustomerCd());
        dto.setCustomerNm(entity.getCustomerNm());
        dto.setPsam(entity.getPsam());
        dto.setFloorCompFlg(entity.getFloorCompFlg());
        dto.setDeliveryType(entity.getDeliveryType());
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
        if (!_suppressMDeliveryCourse && entity.getMDeliveryCourse() != null) {
            MDeliveryCourse relationEntity = entity.getMDeliveryCourse();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MDeliveryCourseDto relationDto = (MDeliveryCourseDto)cachedDto;
                dto.setMDeliveryCourse(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstHList().add(dto);
                }
            } else {
                MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstHList();
                MDeliveryCourseDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMDeliveryCourse(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMDeliveryCourse());
                }
            }
        };
        if (!_suppressMProcessType && entity.getMProcessType() != null) {
            MProcessType relationEntity = entity.getMProcessType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MProcessTypeDto relationDto = (MProcessTypeDto)cachedDto;
                dto.setMProcessType(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstHList().add(dto);
                }
            } else {
                MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstHList();
                MProcessTypeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProcessType(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProcessType());
                }
            }
        };
        if (!_suppressMCustomerByDelivCustomerId && entity.getMCustomerByDelivCustomerId() != null) {
            MCustomer relationEntity = entity.getMCustomerByDelivCustomerId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCustomerDto relationDto = (MCustomerDto)cachedDto;
                dto.setMCustomerByDelivCustomerId(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstHByDelivCustomerIdList().add(dto);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstHByDelivCustomerIdList();
                MCustomerDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCustomerByDelivCustomerId(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstHByDelivCustomerIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCustomerByDelivCustomerId());
                }
            }
        };
        if (!_suppressMClient && entity.getMClient() != null) {
            MClient relationEntity = entity.getMClient();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MClientDto relationDto = (MClientDto)cachedDto;
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstHList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstHList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
                }
            }
        };
        if (!_suppressMCustomerBySupplyCustomerId && entity.getMCustomerBySupplyCustomerId() != null) {
            MCustomer relationEntity = entity.getMCustomerBySupplyCustomerId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCustomerDto relationDto = (MCustomerDto)cachedDto;
                dto.setMCustomerBySupplyCustomerId(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstHBySupplyCustomerIdList().add(dto);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstHBySupplyCustomerIdList();
                MCustomerDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCustomerBySupplyCustomerId(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstHBySupplyCustomerIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCustomerBySupplyCustomerId());
                }
            }
        };
        if (!_suppressTAllocInstH && entity.getTAllocInstH() != null) {
            TAllocInstH relationEntity = entity.getTAllocInstH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TAllocInstHDto relationDto = (TAllocInstHDto)cachedDto;
                dto.setTAllocInstH(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstHList().add(dto);
                }
            } else {
                TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstHList();
                TAllocInstHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTAllocInstH(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTAllocInstH());
                }
            }
        };
        if (!_suppressMCenter && entity.getMCenter() != null) {
            MCenter relationEntity = entity.getMCenter();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterDto relationDto = (MCenterDto)cachedDto;
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstHList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstHList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenter());
                }
            }
        };
        if (!_suppressMZipForDeliv && entity.getMZipForDeliv() != null) {
            MZip relationEntity = entity.getMZipForDeliv();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MZipDto relationDto = (MZipDto)cachedDto;
                dto.setMZipForDeliv(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstHForDelivList().add(dto);
                }
            } else {
                MZipDtoMapper mapper = new MZipDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstHForDelivList();
                MZipDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMZipForDeliv(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstHForDelivList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMZipForDeliv());
                }
            }
        };
        if (!_suppressBClassDtlByDelivTz && entity.getBClassDtlByDelivTz() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByDelivTz();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByDelivTz(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByDelivTz(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByDelivTz());
                }
            }
        };
        if (!_suppressBClassDtlByEmergencyFlg && entity.getBClassDtlByEmergencyFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByEmergencyFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByEmergencyFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByEmergencyFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByEmergencyFlg());
                }
            }
        };
        if (!_suppressBClassDtlByErrorFlg && entity.getBClassDtlByErrorFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByErrorFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByErrorFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByErrorFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByErrorFlg());
                }
            }
        };
        if (!_suppressBClassDtlByInputType && entity.getBClassDtlByInputType() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByInputType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByInputType(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByInputType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByInputType());
                }
            }
        };
        if (!_suppressBClassDtlByShippingStatus && entity.getBClassDtlByShippingStatus() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByShippingStatus();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByShippingStatus(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByShippingStatus(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByShippingStatus());
                }
            }
        };
        if (!_suppressBClassDtlByStockOutFlg && entity.getBClassDtlByStockOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByStockOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByStockOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByStockOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByStockOutFlg());
                }
            }
        };
        if (!_suppressTEcOrderHList && !entity.getTEcOrderHList().isEmpty()) {
            TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTShippingInstH();
            List<TEcOrderHDto> relationDtoList = mapper.mappingToDtoList(entity.getTEcOrderHList());
            dto.setTEcOrderHList(relationDtoList);
            if (reverseReference) {
                for (TEcOrderHDto relationDto : relationDtoList) {
                    relationDto.setTShippingInstH(dto);
                }
            }
        };
        if (!_suppressTShippingInstBList && !entity.getTShippingInstBList().isEmpty()) {
            TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTShippingInstH();
            List<TShippingInstBDto> relationDtoList = mapper.mappingToDtoList(entity.getTShippingInstBList());
            dto.setTShippingInstBList(relationDtoList);
            if (reverseReference) {
                for (TShippingInstBDto relationDto : relationDtoList) {
                    relationDto.setTShippingInstH(dto);
                }
            }
        };
        if (!_suppressTShippingInstHPrintList && !entity.getTShippingInstHPrintList().isEmpty()) {
            TShippingInstHPrintDtoMapper mapper = new TShippingInstHPrintDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTShippingInstH();
            List<TShippingInstHPrintDto> relationDtoList = mapper.mappingToDtoList(entity.getTShippingInstHPrintList());
            dto.setTShippingInstHPrintList(relationDtoList);
            if (reverseReference) {
                for (TShippingInstHPrintDto relationDto : relationDtoList) {
                    relationDto.setTShippingInstH(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TShippingInstHDto> mappingToDtoList(List<TShippingInstH> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TShippingInstHDto> dtoList = new ArrayList<TShippingInstHDto>();
        for (TShippingInstH entity : entityList) {
            TShippingInstHDto dto = mappingToDto(entity);
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
    public TShippingInstH mappingToEntity(TShippingInstHDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TShippingInstH)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TShippingInstH entity = new TShippingInstH();
        if (needsMapping(dto, dto.getShippingInstHId(), "shippingInstHId")) {
            entity.setShippingInstHId(dto.getShippingInstHId());
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
            entity.setInputTypeAsInputType(CDef.InputType.codeOf(dto.getInputType()));
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
            entity.setDelivTzAsDelivTz(CDef.DelivTz.codeOf(dto.getDelivTz()));
        }
        if (needsMapping(dto, dto.getClientShippingNo(), "clientShippingNo")) {
            entity.setClientShippingNo(dto.getClientShippingNo());
        }
        if (needsMapping(dto, dto.getShippingSlipNo(), "shippingSlipNo")) {
            entity.setShippingSlipNo(dto.getShippingSlipNo());
        }
        if (needsMapping(dto, dto.getShippingStatus(), "shippingStatus")) {
            entity.setShippingStatusAsShippingStatus(CDef.ShippingStatus.codeOf(dto.getShippingStatus()));
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
        if (needsMapping(dto, dto.getDelivCustomerNm(), "delivCustomerNm")) {
            entity.setDelivCustomerNm(dto.getDelivCustomerNm());
        }
        if (needsMapping(dto, dto.getDelivCustomerNm1(), "delivCustomerNm1")) {
            entity.setDelivCustomerNm1(dto.getDelivCustomerNm1());
        }
        if (needsMapping(dto, dto.getDelivCustomerNm2(), "delivCustomerNm2")) {
            entity.setDelivCustomerNm2(dto.getDelivCustomerNm2());
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
            entity.setEmergencyFlgAsEmergencyFlg(CDef.EmergencyFlg.codeOf(dto.getEmergencyFlg()));
        }
        if (needsMapping(dto, dto.getPickingWorkMessage(), "pickingWorkMessage")) {
            entity.setPickingWorkMessage(dto.getPickingWorkMessage());
        }
        if (needsMapping(dto, dto.getErrorFlg(), "errorFlg")) {
            entity.setErrorFlgAsErrorFlg(CDef.ErrorFlg.codeOf(dto.getErrorFlg()));
        }
        if (needsMapping(dto, dto.getErrorMessageCd(), "errorMessageCd")) {
            entity.setErrorMessageCd(dto.getErrorMessageCd());
        }
        if (needsMapping(dto, dto.getPickingBatchNo(), "pickingBatchNo")) {
            entity.setPickingBatchNo(dto.getPickingBatchNo());
        }
        if (needsMapping(dto, dto.getStockOutFlg(), "stockOutFlg")) {
            entity.setStockOutFlgAsStockOutFlg(CDef.StockOutFlg.codeOf(dto.getStockOutFlg()));
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
        if (needsMapping(dto, dto.getNizoroeNo(), "nizoroeNo")) {
            entity.setNizoroeNo(dto.getNizoroeNo());
        }
        if (needsMapping(dto, dto.getDaihyoNizoroeNo(), "daihyoNizoroeNo")) {
            entity.setDaihyoNizoroeNo(dto.getDaihyoNizoroeNo());
        }
        if (needsMapping(dto, dto.getNizoroeNo2(), "nizoroeNo2")) {
            entity.setNizoroeNo2(dto.getNizoroeNo2());
        }
        if (needsMapping(dto, dto.getDaihyoNizoroeNo2(), "daihyoNizoroeNo2")) {
            entity.setDaihyoNizoroeNo2(dto.getDaihyoNizoroeNo2());
        }
        if (needsMapping(dto, dto.getShippingTypeId(), "shippingTypeId")) {
            entity.setShippingTypeId(dto.getShippingTypeId());
        }
        if (needsMapping(dto, dto.getShippingTypeCd(), "shippingTypeCd")) {
            entity.setShippingTypeCd(dto.getShippingTypeCd());
        }
        if (needsMapping(dto, dto.getCarrierId(), "carrierId")) {
            entity.setCarrierId(dto.getCarrierId());
        }
        if (needsMapping(dto, dto.getCarrierCd(), "carrierCd")) {
            entity.setCarrierCd(dto.getCarrierCd());
        }
        if (needsMapping(dto, dto.getSalesOrgCd(), "salesOrgCd")) {
            entity.setSalesOrgCd(dto.getSalesOrgCd());
        }
        if (needsMapping(dto, dto.getSalesOrderNo(), "salesOrderNo")) {
            entity.setSalesOrderNo(dto.getSalesOrderNo());
        }
        if (needsMapping(dto, dto.getSalesOrderSlipTypeCd(), "salesOrderSlipTypeCd")) {
            entity.setSalesOrderSlipTypeCd(dto.getSalesOrderSlipTypeCd());
        }
        if (needsMapping(dto, dto.getSalesOrderSlipNo(), "salesOrderSlipNo")) {
            entity.setSalesOrderSlipNo(dto.getSalesOrderSlipNo());
        }
        if (needsMapping(dto, dto.getOrderDt(), "orderDt")) {
            entity.setOrderDt(dto.getOrderDt());
        }
        if (needsMapping(dto, dto.getKokyakuCd(), "kokyakuCd")) {
            entity.setKokyakuCd(dto.getKokyakuCd());
        }
        if (needsMapping(dto, dto.getShippingFee(), "shippingFee")) {
            entity.setShippingFee(dto.getShippingFee());
        }
        if (needsMapping(dto, dto.getSeparateShippingFee(), "separateShippingFee")) {
            entity.setSeparateShippingFee(dto.getSeparateShippingFee());
        }
        if (needsMapping(dto, dto.getCodFee(), "codFee")) {
            entity.setCodFee(dto.getCodFee());
        }
        if (needsMapping(dto, dto.getOrderNoDeliveryNote(), "orderNoDeliveryNote")) {
            entity.setOrderNoDeliveryNote(dto.getOrderNoDeliveryNote());
        }
        if (needsMapping(dto, dto.getPoint(), "point")) {
            entity.setPoint(dto.getPoint());
        }
        if (needsMapping(dto, dto.getKoguchiDeliveryFlg(), "koguchiDeliveryFlg")) {
            entity.setKoguchiDeliveryFlg(dto.getKoguchiDeliveryFlg());
        }
        if (needsMapping(dto, dto.getRecordSendFlg(), "recordSendFlg")) {
            entity.setRecordSendFlg(dto.getRecordSendFlg());
        }
        if (needsMapping(dto, dto.getCarrierDataOutFlg(), "carrierDataOutFlg")) {
            entity.setCarrierDataOutFlg(dto.getCarrierDataOutFlg());
        }
        if (needsMapping(dto, dto.getKohaiContractorCd(), "kohaiContractorCd")) {
            entity.setKohaiContractorCd(dto.getKohaiContractorCd());
        }
        if (needsMapping(dto, dto.getKohaiContractorNm(), "kohaiContractorNm")) {
            entity.setKohaiContractorNm(dto.getKohaiContractorNm());
        }
        if (needsMapping(dto, dto.getShippingPlantCd(), "shippingPlantCd")) {
            entity.setShippingPlantCd(dto.getShippingPlantCd());
        }
        if (needsMapping(dto, dto.getShippingStorageSpaceCd(), "shippingStorageSpaceCd")) {
            entity.setShippingStorageSpaceCd(dto.getShippingStorageSpaceCd());
        }
        if (needsMapping(dto, dto.getNizoroeId(), "nizoroeId")) {
            entity.setNizoroeId(dto.getNizoroeId());
        }
        if (needsMapping(dto, dto.getNizoroeProcUnit(), "nizoroeProcUnit")) {
            entity.setNizoroeProcUnit(dto.getNizoroeProcUnit());
        }
        if (needsMapping(dto, dto.getAccountId(), "accountId")) {
            entity.setAccountId(dto.getAccountId());
        }
        if (needsMapping(dto, dto.getAccountCd(), "accountCd")) {
            entity.setAccountCd(dto.getAccountCd());
        }
        if (needsMapping(dto, dto.getShippingReasonCd(), "shippingReasonCd")) {
            entity.setShippingReasonCd(dto.getShippingReasonCd());
        }
        if (needsMapping(dto, dto.getTransferFlg(), "transferFlg")) {
            entity.setTransferFlg(dto.getTransferFlg());
        }
        if (needsMapping(dto, dto.getTenhanshaSalesOrderNo(), "tenhanshaSalesOrderNo")) {
            entity.setTenhanshaSalesOrderNo(dto.getTenhanshaSalesOrderNo());
        }
        if (needsMapping(dto, dto.getDelivCd(), "delivCd")) {
            entity.setDelivCd(dto.getDelivCd());
        }
        if (needsMapping(dto, dto.getSalesOrderNum(), "salesOrderNum")) {
            entity.setSalesOrderNum(dto.getSalesOrderNum());
        }
        if (needsMapping(dto, dto.getDirectDeliveryTypeCd(), "directDeliveryTypeCd")) {
            entity.setDirectDeliveryTypeCd(dto.getDirectDeliveryTypeCd());
        }
        if (needsMapping(dto, dto.getSplitDeliveryTypeCd(), "splitDeliveryTypeCd")) {
            entity.setSplitDeliveryTypeCd(dto.getSplitDeliveryTypeCd());
        }
        if (needsMapping(dto, dto.getCarrierTypeCd(), "carrierTypeCd")) {
            entity.setCarrierTypeCd(dto.getCarrierTypeCd());
        }
        if (needsMapping(dto, dto.getSpecifyDeliveryDt(), "specifyDeliveryDt")) {
            entity.setSpecifyDeliveryDt(dto.getSpecifyDeliveryDt());
        }
        if (needsMapping(dto, dto.getSpecifyDeliveryTime(), "specifyDeliveryTime")) {
            entity.setSpecifyDeliveryTime(dto.getSpecifyDeliveryTime());
        }
        if (needsMapping(dto, dto.getTenhanshaCd(), "tenhanshaCd")) {
            entity.setTenhanshaCd(dto.getTenhanshaCd());
        }
        if (needsMapping(dto, dto.getDestinationNmKana(), "destinationNmKana")) {
            entity.setDestinationNmKana(dto.getDestinationNmKana());
        }
        if (needsMapping(dto, dto.getDestinationFax(), "destinationFax")) {
            entity.setDestinationFax(dto.getDestinationFax());
        }
        if (needsMapping(dto, dto.getKanjiMessage1(), "kanjiMessage1")) {
            entity.setKanjiMessage1(dto.getKanjiMessage1());
        }
        if (needsMapping(dto, dto.getKanjiMessage2(), "kanjiMessage2")) {
            entity.setKanjiMessage2(dto.getKanjiMessage2());
        }
        if (needsMapping(dto, dto.getKanjiMessage3(), "kanjiMessage3")) {
            entity.setKanjiMessage3(dto.getKanjiMessage3());
        }
        if (needsMapping(dto, dto.getKanjiMessage4(), "kanjiMessage4")) {
            entity.setKanjiMessage4(dto.getKanjiMessage4());
        }
        if (needsMapping(dto, dto.getKanjiMessage5(), "kanjiMessage5")) {
            entity.setKanjiMessage5(dto.getKanjiMessage5());
        }
        if (needsMapping(dto, dto.getKanjiMessage6(), "kanjiMessage6")) {
            entity.setKanjiMessage6(dto.getKanjiMessage6());
        }
        if (needsMapping(dto, dto.getKanjiMessage7(), "kanjiMessage7")) {
            entity.setKanjiMessage7(dto.getKanjiMessage7());
        }
        if (needsMapping(dto, dto.getKanjiMessage8(), "kanjiMessage8")) {
            entity.setKanjiMessage8(dto.getKanjiMessage8());
        }
        if (needsMapping(dto, dto.getKanjiMessage9(), "kanjiMessage9")) {
            entity.setKanjiMessage9(dto.getKanjiMessage9());
        }
        if (needsMapping(dto, dto.getKanjiMessage10(), "kanjiMessage10")) {
            entity.setKanjiMessage10(dto.getKanjiMessage10());
        }
        if (needsMapping(dto, dto.getKanaMessage1(), "kanaMessage1")) {
            entity.setKanaMessage1(dto.getKanaMessage1());
        }
        if (needsMapping(dto, dto.getKanaMessage2(), "kanaMessage2")) {
            entity.setKanaMessage2(dto.getKanaMessage2());
        }
        if (needsMapping(dto, dto.getKanaMessage3(), "kanaMessage3")) {
            entity.setKanaMessage3(dto.getKanaMessage3());
        }
        if (needsMapping(dto, dto.getKanaMessage4(), "kanaMessage4")) {
            entity.setKanaMessage4(dto.getKanaMessage4());
        }
        if (needsMapping(dto, dto.getKanaMessage5(), "kanaMessage5")) {
            entity.setKanaMessage5(dto.getKanaMessage5());
        }
        if (needsMapping(dto, dto.getKanaMessage6(), "kanaMessage6")) {
            entity.setKanaMessage6(dto.getKanaMessage6());
        }
        if (needsMapping(dto, dto.getKanaMessage7(), "kanaMessage7")) {
            entity.setKanaMessage7(dto.getKanaMessage7());
        }
        if (needsMapping(dto, dto.getKanaMessage8(), "kanaMessage8")) {
            entity.setKanaMessage8(dto.getKanaMessage8());
        }
        if (needsMapping(dto, dto.getKanaMessage9(), "kanaMessage9")) {
            entity.setKanaMessage9(dto.getKanaMessage9());
        }
        if (needsMapping(dto, dto.getKanaMessage10(), "kanaMessage10")) {
            entity.setKanaMessage10(dto.getKanaMessage10());
        }
        if (needsMapping(dto, dto.getDeliveryNoteSummary(), "deliveryNoteSummary")) {
            entity.setDeliveryNoteSummary(dto.getDeliveryNoteSummary());
        }
        if (needsMapping(dto, dto.getInvoiceSummary(), "invoiceSummary")) {
            entity.setInvoiceSummary(dto.getInvoiceSummary());
        }
        if (needsMapping(dto, dto.getEcOrderNo(), "ecOrderNo")) {
            entity.setEcOrderNo(dto.getEcOrderNo());
        }
        if (needsMapping(dto, dto.getPaymentTypeCd(), "paymentTypeCd")) {
            entity.setPaymentTypeCd(dto.getPaymentTypeCd());
        }
        if (needsMapping(dto, dto.getPriceHiddenFlg(), "priceHiddenFlg")) {
            entity.setPriceHiddenFlg(dto.getPriceHiddenFlg());
        }
        if (needsMapping(dto, dto.getPaymentHiddenFlg(), "paymentHiddenFlg")) {
            entity.setPaymentHiddenFlg(dto.getPaymentHiddenFlg());
        }
        if (needsMapping(dto, dto.getDirectUpdFlg(), "directUpdFlg")) {
            entity.setDirectUpdFlg(dto.getDirectUpdFlg());
        }
        if (needsMapping(dto, dto.getIfId(), "ifId")) {
            entity.setIfId(dto.getIfId());
        }
        if (needsMapping(dto, dto.getCustomerCd(), "customerCd")) {
            entity.setCustomerCd(dto.getCustomerCd());
        }
        if (needsMapping(dto, dto.getCustomerNm(), "customerNm")) {
            entity.setCustomerNm(dto.getCustomerNm());
        }
        if (needsMapping(dto, dto.getPsam(), "psam")) {
            entity.setPsam(dto.getPsam());
        }
        if (needsMapping(dto, dto.getFloorCompFlg(), "floorCompFlg")) {
            entity.setFloorCompFlg(dto.getFloorCompFlg());
        }
        if (needsMapping(dto, dto.getDeliveryType(), "deliveryType")) {
            entity.setDeliveryType(dto.getDeliveryType());
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
        if (!_suppressMDeliveryCourse && dto.getMDeliveryCourse() != null) {
            MDeliveryCourseDto relationDto = dto.getMDeliveryCourse();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MDeliveryCourse relationEntity = (MDeliveryCourse)cachedEntity;
                entity.setMDeliveryCourse(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstHList().add(entity);
                }
            } else {
                MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstHList();
                MDeliveryCourse relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMDeliveryCourse(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstHList().add(entity);
                }
                if (instanceCache && entity.getMDeliveryCourse().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMDeliveryCourse());
                }
            }
        };
        if (!_suppressMProcessType && dto.getMProcessType() != null) {
            MProcessTypeDto relationDto = dto.getMProcessType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MProcessType relationEntity = (MProcessType)cachedEntity;
                entity.setMProcessType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstHList().add(entity);
                }
            } else {
                MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstHList();
                MProcessType relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProcessType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstHList().add(entity);
                }
                if (instanceCache && entity.getMProcessType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProcessType());
                }
            }
        };
        if (!_suppressMCustomerByDelivCustomerId && dto.getMCustomerByDelivCustomerId() != null) {
            MCustomerDto relationDto = dto.getMCustomerByDelivCustomerId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCustomer relationEntity = (MCustomer)cachedEntity;
                entity.setMCustomerByDelivCustomerId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstHByDelivCustomerIdList().add(entity);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstHByDelivCustomerIdList();
                MCustomer relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCustomerByDelivCustomerId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstHByDelivCustomerIdList().add(entity);
                }
                if (instanceCache && entity.getMCustomerByDelivCustomerId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCustomerByDelivCustomerId());
                }
            }
        };
        if (!_suppressMClient && dto.getMClient() != null) {
            MClientDto relationDto = dto.getMClient();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MClient relationEntity = (MClient)cachedEntity;
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstHList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstHList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstHList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
                }
            }
        };
        if (!_suppressMCustomerBySupplyCustomerId && dto.getMCustomerBySupplyCustomerId() != null) {
            MCustomerDto relationDto = dto.getMCustomerBySupplyCustomerId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCustomer relationEntity = (MCustomer)cachedEntity;
                entity.setMCustomerBySupplyCustomerId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstHBySupplyCustomerIdList().add(entity);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstHBySupplyCustomerIdList();
                MCustomer relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCustomerBySupplyCustomerId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstHBySupplyCustomerIdList().add(entity);
                }
                if (instanceCache && entity.getMCustomerBySupplyCustomerId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCustomerBySupplyCustomerId());
                }
            }
        };
        if (!_suppressTAllocInstH && dto.getTAllocInstH() != null) {
            TAllocInstHDto relationDto = dto.getTAllocInstH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TAllocInstH relationEntity = (TAllocInstH)cachedEntity;
                entity.setTAllocInstH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstHList().add(entity);
                }
            } else {
                TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstHList();
                TAllocInstH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTAllocInstH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstHList().add(entity);
                }
                if (instanceCache && entity.getTAllocInstH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTAllocInstH());
                }
            }
        };
        if (!_suppressMCenter && dto.getMCenter() != null) {
            MCenterDto relationDto = dto.getMCenter();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenter relationEntity = (MCenter)cachedEntity;
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstHList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstHList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstHList().add(entity);
                }
                if (instanceCache && entity.getMCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenter());
                }
            }
        };
        if (!_suppressMZipForDeliv && dto.getMZipForDeliv() != null) {
            MZipDto relationDto = dto.getMZipForDeliv();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MZip relationEntity = (MZip)cachedEntity;
                entity.setMZipForDeliv(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstHForDelivList().add(entity);
                }
            } else {
                MZipDtoMapper mapper = new MZipDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstHForDelivList();
                MZip relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMZipForDeliv(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstHForDelivList().add(entity);
                }
                if (instanceCache && entity.getMZipForDeliv().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMZipForDeliv());
                }
            }
        };
        if (!_suppressBClassDtlByDelivTz && dto.getBClassDtlByDelivTz() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByDelivTz();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByDelivTz(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByDelivTz(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByDelivTz().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByDelivTz());
                }
            }
        };
        if (!_suppressBClassDtlByEmergencyFlg && dto.getBClassDtlByEmergencyFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByEmergencyFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByEmergencyFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByEmergencyFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByEmergencyFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByEmergencyFlg());
                }
            }
        };
        if (!_suppressBClassDtlByErrorFlg && dto.getBClassDtlByErrorFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByErrorFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByErrorFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByErrorFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByErrorFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByErrorFlg());
                }
            }
        };
        if (!_suppressBClassDtlByInputType && dto.getBClassDtlByInputType() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByInputType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByInputType(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByInputType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByInputType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByInputType());
                }
            }
        };
        if (!_suppressBClassDtlByShippingStatus && dto.getBClassDtlByShippingStatus() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByShippingStatus();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByShippingStatus(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByShippingStatus(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByShippingStatus().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByShippingStatus());
                }
            }
        };
        if (!_suppressBClassDtlByStockOutFlg && dto.getBClassDtlByStockOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByStockOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByStockOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByStockOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByStockOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByStockOutFlg());
                }
            }
        };
        if (!_suppressTEcOrderHList && !dto.getTEcOrderHList().isEmpty()) {
            TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTShippingInstH();
            List<TEcOrderH> relationEntityList = mapper.mappingToEntityList(dto.getTEcOrderHList());
            entity.setTEcOrderHList(relationEntityList);
            if (reverseReference) {
                for (TEcOrderH relationEntity : relationEntityList) {
                    relationEntity.setTShippingInstH(entity);
                }
            }
        };
        if (!_suppressTShippingInstBList && !dto.getTShippingInstBList().isEmpty()) {
            TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTShippingInstH();
            List<TShippingInstB> relationEntityList = mapper.mappingToEntityList(dto.getTShippingInstBList());
            entity.setTShippingInstBList(relationEntityList);
            if (reverseReference) {
                for (TShippingInstB relationEntity : relationEntityList) {
                    relationEntity.setTShippingInstH(entity);
                }
            }
        };
        if (!_suppressTShippingInstHPrintList && !dto.getTShippingInstHPrintList().isEmpty()) {
            TShippingInstHPrintDtoMapper mapper = new TShippingInstHPrintDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTShippingInstH();
            List<TShippingInstHPrint> relationEntityList = mapper.mappingToEntityList(dto.getTShippingInstHPrintList());
            entity.setTShippingInstHPrintList(relationEntityList);
            if (reverseReference) {
                for (TShippingInstHPrint relationEntity : relationEntityList) {
                    relationEntity.setTShippingInstH(entity);
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
    protected boolean needsMapping(TShippingInstHDto dto, Object value, String propName) {
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
    public List<TShippingInstH> mappingToEntityList(List<TShippingInstHDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TShippingInstH> entityList = new ArrayList<TShippingInstH>();
        for (TShippingInstHDto dto : dtoList) {
            TShippingInstH entity = mappingToEntity(dto);
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
    public void suppressMDeliveryCourse() {
        _suppressMDeliveryCourse = true;
    }
    public void suppressMProcessType() {
        _suppressMProcessType = true;
    }
    public void suppressMCustomerByDelivCustomerId() {
        _suppressMCustomerByDelivCustomerId = true;
    }
    public void suppressMClient() {
        _suppressMClient = true;
    }
    public void suppressMCustomerBySupplyCustomerId() {
        _suppressMCustomerBySupplyCustomerId = true;
    }
    public void suppressTAllocInstH() {
        _suppressTAllocInstH = true;
    }
    public void suppressMCenter() {
        _suppressMCenter = true;
    }
    public void suppressMZipForDeliv() {
        _suppressMZipForDeliv = true;
    }
    public void suppressBClassDtlByDelivTz() {
        _suppressBClassDtlByDelivTz = true;
    }
    public void suppressBClassDtlByEmergencyFlg() {
        _suppressBClassDtlByEmergencyFlg = true;
    }
    public void suppressBClassDtlByErrorFlg() {
        _suppressBClassDtlByErrorFlg = true;
    }
    public void suppressBClassDtlByInputType() {
        _suppressBClassDtlByInputType = true;
    }
    public void suppressBClassDtlByShippingStatus() {
        _suppressBClassDtlByShippingStatus = true;
    }
    public void suppressBClassDtlByStockOutFlg() {
        _suppressBClassDtlByStockOutFlg = true;
    }
    public void suppressTEcOrderHList() {
        _suppressTEcOrderHList = true;
    }
    public void suppressTShippingInstBList() {
        _suppressTShippingInstBList = true;
    }
    public void suppressTShippingInstHPrintList() {
        _suppressTShippingInstHPrintList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMDeliveryCourse();
        suppressMProcessType();
        suppressMCustomerByDelivCustomerId();
        suppressMClient();
        suppressMCustomerBySupplyCustomerId();
        suppressTAllocInstH();
        suppressMCenter();
        suppressMZipForDeliv();
        suppressBClassDtlByDelivTz();
        suppressBClassDtlByEmergencyFlg();
        suppressBClassDtlByErrorFlg();
        suppressBClassDtlByInputType();
        suppressBClassDtlByShippingStatus();
        suppressBClassDtlByStockOutFlg();
        suppressTEcOrderHList();
        suppressTShippingInstBList();
        suppressTShippingInstHPrintList();
    }
    protected void doSuppressClear() { // internal
        _suppressMDeliveryCourse = false;
        _suppressMProcessType = false;
        _suppressMCustomerByDelivCustomerId = false;
        _suppressMClient = false;
        _suppressMCustomerBySupplyCustomerId = false;
        _suppressTAllocInstH = false;
        _suppressMCenter = false;
        _suppressMZipForDeliv = false;
        _suppressBClassDtlByDelivTz = false;
        _suppressBClassDtlByEmergencyFlg = false;
        _suppressBClassDtlByErrorFlg = false;
        _suppressBClassDtlByInputType = false;
        _suppressBClassDtlByShippingStatus = false;
        _suppressBClassDtlByStockOutFlg = false;
        _suppressTEcOrderHList = false;
        _suppressTShippingInstBList = false;
        _suppressTShippingInstHPrintList = false;
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
    public TShippingInstHDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TShippingInstHDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TShippingInstHDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TShippingInstHDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TShippingInstHDtoMapper reverseReference() {
        setReverseReference(true);
        return (TShippingInstHDtoMapper)this;
    }
}
