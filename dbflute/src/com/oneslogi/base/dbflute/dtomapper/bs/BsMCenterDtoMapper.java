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
 * The DTO mapper of m_center as TABLE. <br>
 * センタマスタ
 * <pre>
 * [primary-key]
 *     CENTER_ID
 *
 * [column]
 *     CENTER_ID, CENTER_CD, CENTER_NM, CENTER_ABBR, CULTURE_ID, TIME_ZONE_ID, ADDRESS, TEL_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     b_time_zone, b_culture, b_class_dtl(ByDelFlg)
 *
 * [referrer-table]
 *     h_location_attribute, m_box, m_box_grp, m_carrier, m_carrier_slip_sgw, m_carrier_slip_ymt, m_carrier_slip_yupk, m_center_class, m_center_col, m_center_customer, m_center_item, m_center_screen, m_client_center, m_customer_picking, m_delivery_course, m_general, m_location, m_nizoroe, m_numbering_center, m_user_center, m_user_login, m_warehouse, m_web_ht_info, t_alloc_inst_h, t_ec_order_h, t_inventory_h, t_move_inst_h, t_packing_h, t_pic_mthd_rcmd, t_picking_h, t_receive_plan_h, t_serial_no, t_shipping_inst_h, t_store_record_h, w_ht_inventory_input_prod, w_ht_loading, w_ht_picking, w_ht_receive_inspection, w_ht_receive_no_plan_insp, w_ht_receive_store, w_ht_serial_receive_insp, w_ht_serial_shipping_insp, w_ht_shipping, w_ht_shipping_picking, w_ht_total_picking, w_sgl_row_ship_insp_h, w_shipping_interrupt
 *
 * [foreign-property]
 *     bTimeZone, bCulture, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     hLocationAttributeList, mBoxList, mBoxGrpList, mCarrierList, mCarrierSlipSgwList, mCarrierSlipYmtList, mCarrierSlipYupkList, mCenterClassList, mCenterColList, mCenterCustomerList, mCenterItemList, mCenterScreenList, mClientCenterList, mCustomerPickingList, mDeliveryCourseList, mGeneralList, mLocationList, mNizoroeList, mNumberingCenterList, mUserCenterList, mUserLoginList, mWarehouseList, mWebHtInfoList, tAllocInstHList, tEcOrderHList, tInventoryHList, tMoveInstHList, tPackingHList, tPicMthdRcmdList, tPickingHList, tReceivePlanHList, tSerialNoList, tShippingInstHList, tStoreRecordHList, wHtInventoryInputProdList, wHtLoadingList, wHtPickingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtSerialReceiveInspList, wHtSerialShippingInspList, wHtShippingList, wHtShippingPickingList, wHtTotalPickingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCenterDtoMapper implements DtoMapper<MCenter, MCenterDto>, Serializable {

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
    protected boolean _suppressBTimeZone;
    protected boolean _suppressBCulture;
    protected boolean _suppressBClassDtlByDelFlg;
    protected boolean _suppressHLocationAttributeList;
    protected boolean _suppressMBoxList;
    protected boolean _suppressMBoxGrpList;
    protected boolean _suppressMCarrierList;
    protected boolean _suppressMCarrierSlipSgwList;
    protected boolean _suppressMCarrierSlipYmtList;
    protected boolean _suppressMCarrierSlipYupkList;
    protected boolean _suppressMCenterClassList;
    protected boolean _suppressMCenterColList;
    protected boolean _suppressMCenterCustomerList;
    protected boolean _suppressMCenterItemList;
    protected boolean _suppressMCenterScreenList;
    protected boolean _suppressMClientCenterList;
    protected boolean _suppressMCustomerPickingList;
    protected boolean _suppressMDeliveryCourseList;
    protected boolean _suppressMGeneralList;
    protected boolean _suppressMLocationList;
    protected boolean _suppressMNizoroeList;
    protected boolean _suppressMNumberingCenterList;
    protected boolean _suppressMUserCenterList;
    protected boolean _suppressMUserLoginList;
    protected boolean _suppressMWarehouseList;
    protected boolean _suppressMWebHtInfoList;
    protected boolean _suppressTAllocInstHList;
    protected boolean _suppressTEcOrderHList;
    protected boolean _suppressTInventoryHList;
    protected boolean _suppressTMoveInstHList;
    protected boolean _suppressTPackingHList;
    protected boolean _suppressTPicMthdRcmdList;
    protected boolean _suppressTPickingHList;
    protected boolean _suppressTReceivePlanHList;
    protected boolean _suppressTSerialNoList;
    protected boolean _suppressTShippingInstHList;
    protected boolean _suppressTStoreRecordHList;
    protected boolean _suppressWHtInventoryInputProdList;
    protected boolean _suppressWHtLoadingList;
    protected boolean _suppressWHtPickingList;
    protected boolean _suppressWHtReceiveInspectionList;
    protected boolean _suppressWHtReceiveNoPlanInspList;
    protected boolean _suppressWHtReceiveStoreList;
    protected boolean _suppressWHtSerialReceiveInspList;
    protected boolean _suppressWHtSerialShippingInspList;
    protected boolean _suppressWHtShippingList;
    protected boolean _suppressWHtShippingPickingList;
    protected boolean _suppressWHtTotalPickingList;
    protected boolean _suppressWSglRowShipInspHList;
    protected boolean _suppressWShippingInterruptList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCenterDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMCenterDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MCenterDto mappingToDto(MCenter entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MCenterDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCenterDto dto = new MCenterDto();
        dto.setCenterId(entity.getCenterId());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterNm(entity.getCenterNm());
        dto.setCenterAbbr(entity.getCenterAbbr());
        dto.setCultureId(entity.getCultureId());
        dto.setTimeZoneId(entity.getTimeZoneId());
        dto.setAddress(entity.getAddress());
        dto.setTelNo(entity.getTelNo());
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
        if (!_suppressBTimeZone && entity.getBTimeZone() != null) {
            BTimeZone relationEntity = entity.getBTimeZone();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BTimeZoneDto relationDto = (BTimeZoneDto)cachedDto;
                dto.setBTimeZone(relationDto);
                if (reverseReference) {
                    relationDto.getMCenterList().add(dto);
                }
            } else {
                BTimeZoneDtoMapper mapper = new BTimeZoneDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCenterList();
                BTimeZoneDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBTimeZone(relationDto);
                if (reverseReference) {
                    relationDto.getMCenterList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBTimeZone());
                }
            }
        };
        if (!_suppressBCulture && entity.getBCulture() != null) {
            BCulture relationEntity = entity.getBCulture();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BCultureDto relationDto = (BCultureDto)cachedDto;
                dto.setBCulture(relationDto);
                if (reverseReference) {
                    relationDto.getMCenterList().add(dto);
                }
            } else {
                BCultureDtoMapper mapper = new BCultureDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCenterList();
                BCultureDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBCulture(relationDto);
                if (reverseReference) {
                    relationDto.getMCenterList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBCulture());
                }
            }
        };
        if (!_suppressBClassDtlByDelFlg && entity.getBClassDtlByDelFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByDelFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByDelFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByDelFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByDelFlg());
                }
            }
        };
        if (!_suppressHLocationAttributeList && !entity.getHLocationAttributeList().isEmpty()) {
            HLocationAttributeDtoMapper mapper = new HLocationAttributeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<HLocationAttributeDto> relationDtoList = mapper.mappingToDtoList(entity.getHLocationAttributeList());
            dto.setHLocationAttributeList(relationDtoList);
            if (reverseReference) {
                for (HLocationAttributeDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMBoxList && !entity.getMBoxList().isEmpty()) {
            MBoxDtoMapper mapper = new MBoxDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MBoxDto> relationDtoList = mapper.mappingToDtoList(entity.getMBoxList());
            dto.setMBoxList(relationDtoList);
            if (reverseReference) {
                for (MBoxDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMBoxGrpList && !entity.getMBoxGrpList().isEmpty()) {
            MBoxGrpDtoMapper mapper = new MBoxGrpDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MBoxGrpDto> relationDtoList = mapper.mappingToDtoList(entity.getMBoxGrpList());
            dto.setMBoxGrpList(relationDtoList);
            if (reverseReference) {
                for (MBoxGrpDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCarrierList && !entity.getMCarrierList().isEmpty()) {
            MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCarrierDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierList());
            dto.setMCarrierList(relationDtoList);
            if (reverseReference) {
                for (MCarrierDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCarrierSlipSgwList && !entity.getMCarrierSlipSgwList().isEmpty()) {
            MCarrierSlipSgwDtoMapper mapper = new MCarrierSlipSgwDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCarrierSlipSgwDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierSlipSgwList());
            dto.setMCarrierSlipSgwList(relationDtoList);
            if (reverseReference) {
                for (MCarrierSlipSgwDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCarrierSlipYmtList && !entity.getMCarrierSlipYmtList().isEmpty()) {
            MCarrierSlipYmtDtoMapper mapper = new MCarrierSlipYmtDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCarrierSlipYmtDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierSlipYmtList());
            dto.setMCarrierSlipYmtList(relationDtoList);
            if (reverseReference) {
                for (MCarrierSlipYmtDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCarrierSlipYupkList && !entity.getMCarrierSlipYupkList().isEmpty()) {
            MCarrierSlipYupkDtoMapper mapper = new MCarrierSlipYupkDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCarrierSlipYupkDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierSlipYupkList());
            dto.setMCarrierSlipYupkList(relationDtoList);
            if (reverseReference) {
                for (MCarrierSlipYupkDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCenterClassList && !entity.getMCenterClassList().isEmpty()) {
            MCenterClassDtoMapper mapper = new MCenterClassDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterClassDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterClassList());
            dto.setMCenterClassList(relationDtoList);
            if (reverseReference) {
                for (MCenterClassDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCenterColList && !entity.getMCenterColList().isEmpty()) {
            MCenterColDtoMapper mapper = new MCenterColDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterColDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterColList());
            dto.setMCenterColList(relationDtoList);
            if (reverseReference) {
                for (MCenterColDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCenterCustomerList && !entity.getMCenterCustomerList().isEmpty()) {
            MCenterCustomerDtoMapper mapper = new MCenterCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterCustomerDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterCustomerList());
            dto.setMCenterCustomerList(relationDtoList);
            if (reverseReference) {
                for (MCenterCustomerDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCenterItemList && !entity.getMCenterItemList().isEmpty()) {
            MCenterItemDtoMapper mapper = new MCenterItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterItemDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterItemList());
            dto.setMCenterItemList(relationDtoList);
            if (reverseReference) {
                for (MCenterItemDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCenterScreenList && !entity.getMCenterScreenList().isEmpty()) {
            MCenterScreenDtoMapper mapper = new MCenterScreenDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterScreenDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterScreenList());
            dto.setMCenterScreenList(relationDtoList);
            if (reverseReference) {
                for (MCenterScreenDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMClientCenterList && !entity.getMClientCenterList().isEmpty()) {
            MClientCenterDtoMapper mapper = new MClientCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MClientCenterDto> relationDtoList = mapper.mappingToDtoList(entity.getMClientCenterList());
            dto.setMClientCenterList(relationDtoList);
            if (reverseReference) {
                for (MClientCenterDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMCustomerPickingList && !entity.getMCustomerPickingList().isEmpty()) {
            MCustomerPickingDtoMapper mapper = new MCustomerPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCustomerPickingDto> relationDtoList = mapper.mappingToDtoList(entity.getMCustomerPickingList());
            dto.setMCustomerPickingList(relationDtoList);
            if (reverseReference) {
                for (MCustomerPickingDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMDeliveryCourseList && !entity.getMDeliveryCourseList().isEmpty()) {
            MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MDeliveryCourseDto> relationDtoList = mapper.mappingToDtoList(entity.getMDeliveryCourseList());
            dto.setMDeliveryCourseList(relationDtoList);
            if (reverseReference) {
                for (MDeliveryCourseDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMGeneralList && !entity.getMGeneralList().isEmpty()) {
            MGeneralDtoMapper mapper = new MGeneralDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MGeneralDto> relationDtoList = mapper.mappingToDtoList(entity.getMGeneralList());
            dto.setMGeneralList(relationDtoList);
            if (reverseReference) {
                for (MGeneralDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMLocationList && !entity.getMLocationList().isEmpty()) {
            MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MLocationDto> relationDtoList = mapper.mappingToDtoList(entity.getMLocationList());
            dto.setMLocationList(relationDtoList);
            if (reverseReference) {
                for (MLocationDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMNizoroeList && !entity.getMNizoroeList().isEmpty()) {
            MNizoroeDtoMapper mapper = new MNizoroeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MNizoroeDto> relationDtoList = mapper.mappingToDtoList(entity.getMNizoroeList());
            dto.setMNizoroeList(relationDtoList);
            if (reverseReference) {
                for (MNizoroeDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMNumberingCenterList && !entity.getMNumberingCenterList().isEmpty()) {
            MNumberingCenterDtoMapper mapper = new MNumberingCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MNumberingCenterDto> relationDtoList = mapper.mappingToDtoList(entity.getMNumberingCenterList());
            dto.setMNumberingCenterList(relationDtoList);
            if (reverseReference) {
                for (MNumberingCenterDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMUserCenterList && !entity.getMUserCenterList().isEmpty()) {
            MUserCenterDtoMapper mapper = new MUserCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MUserCenterDto> relationDtoList = mapper.mappingToDtoList(entity.getMUserCenterList());
            dto.setMUserCenterList(relationDtoList);
            if (reverseReference) {
                for (MUserCenterDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMUserLoginList && !entity.getMUserLoginList().isEmpty()) {
            MUserLoginDtoMapper mapper = new MUserLoginDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MUserLoginDto> relationDtoList = mapper.mappingToDtoList(entity.getMUserLoginList());
            dto.setMUserLoginList(relationDtoList);
            if (reverseReference) {
                for (MUserLoginDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMWarehouseList && !entity.getMWarehouseList().isEmpty()) {
            MWarehouseDtoMapper mapper = new MWarehouseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MWarehouseDto> relationDtoList = mapper.mappingToDtoList(entity.getMWarehouseList());
            dto.setMWarehouseList(relationDtoList);
            if (reverseReference) {
                for (MWarehouseDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressMWebHtInfoList && !entity.getMWebHtInfoList().isEmpty()) {
            MWebHtInfoDtoMapper mapper = new MWebHtInfoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MWebHtInfoDto> relationDtoList = mapper.mappingToDtoList(entity.getMWebHtInfoList());
            dto.setMWebHtInfoList(relationDtoList);
            if (reverseReference) {
                for (MWebHtInfoDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTAllocInstHList && !entity.getTAllocInstHList().isEmpty()) {
            TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TAllocInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTAllocInstHList());
            dto.setTAllocInstHList(relationDtoList);
            if (reverseReference) {
                for (TAllocInstHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTEcOrderHList && !entity.getTEcOrderHList().isEmpty()) {
            TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TEcOrderHDto> relationDtoList = mapper.mappingToDtoList(entity.getTEcOrderHList());
            dto.setTEcOrderHList(relationDtoList);
            if (reverseReference) {
                for (TEcOrderHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTInventoryHList && !entity.getTInventoryHList().isEmpty()) {
            TInventoryHDtoMapper mapper = new TInventoryHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TInventoryHDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryHList());
            dto.setTInventoryHList(relationDtoList);
            if (reverseReference) {
                for (TInventoryHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTMoveInstHList && !entity.getTMoveInstHList().isEmpty()) {
            TMoveInstHDtoMapper mapper = new TMoveInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TMoveInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTMoveInstHList());
            dto.setTMoveInstHList(relationDtoList);
            if (reverseReference) {
                for (TMoveInstHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTPackingHList && !entity.getTPackingHList().isEmpty()) {
            TPackingHDtoMapper mapper = new TPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TPackingHDto> relationDtoList = mapper.mappingToDtoList(entity.getTPackingHList());
            dto.setTPackingHList(relationDtoList);
            if (reverseReference) {
                for (TPackingHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTPicMthdRcmdList && !entity.getTPicMthdRcmdList().isEmpty()) {
            TPicMthdRcmdDtoMapper mapper = new TPicMthdRcmdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TPicMthdRcmdDto> relationDtoList = mapper.mappingToDtoList(entity.getTPicMthdRcmdList());
            dto.setTPicMthdRcmdList(relationDtoList);
            if (reverseReference) {
                for (TPicMthdRcmdDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTPickingHList && !entity.getTPickingHList().isEmpty()) {
            TPickingHDtoMapper mapper = new TPickingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TPickingHDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingHList());
            dto.setTPickingHList(relationDtoList);
            if (reverseReference) {
                for (TPickingHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTReceivePlanHList && !entity.getTReceivePlanHList().isEmpty()) {
            TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TReceivePlanHDto> relationDtoList = mapper.mappingToDtoList(entity.getTReceivePlanHList());
            dto.setTReceivePlanHList(relationDtoList);
            if (reverseReference) {
                for (TReceivePlanHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTSerialNoList && !entity.getTSerialNoList().isEmpty()) {
            TSerialNoDtoMapper mapper = new TSerialNoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TSerialNoDto> relationDtoList = mapper.mappingToDtoList(entity.getTSerialNoList());
            dto.setTSerialNoList(relationDtoList);
            if (reverseReference) {
                for (TSerialNoDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTShippingInstHList && !entity.getTShippingInstHList().isEmpty()) {
            TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TShippingInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTShippingInstHList());
            dto.setTShippingInstHList(relationDtoList);
            if (reverseReference) {
                for (TShippingInstHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressTStoreRecordHList && !entity.getTStoreRecordHList().isEmpty()) {
            TStoreRecordHDtoMapper mapper = new TStoreRecordHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TStoreRecordHDto> relationDtoList = mapper.mappingToDtoList(entity.getTStoreRecordHList());
            dto.setTStoreRecordHList(relationDtoList);
            if (reverseReference) {
                for (TStoreRecordHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtInventoryInputProdList && !entity.getWHtInventoryInputProdList().isEmpty()) {
            WHtInventoryInputProdDtoMapper mapper = new WHtInventoryInputProdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtInventoryInputProdDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtInventoryInputProdList());
            dto.setWHtInventoryInputProdList(relationDtoList);
            if (reverseReference) {
                for (WHtInventoryInputProdDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtLoadingList && !entity.getWHtLoadingList().isEmpty()) {
            WHtLoadingDtoMapper mapper = new WHtLoadingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtLoadingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtLoadingList());
            dto.setWHtLoadingList(relationDtoList);
            if (reverseReference) {
                for (WHtLoadingDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtPickingList && !entity.getWHtPickingList().isEmpty()) {
            WHtPickingDtoMapper mapper = new WHtPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtPickingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtPickingList());
            dto.setWHtPickingList(relationDtoList);
            if (reverseReference) {
                for (WHtPickingDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtReceiveInspectionList && !entity.getWHtReceiveInspectionList().isEmpty()) {
            WHtReceiveInspectionDtoMapper mapper = new WHtReceiveInspectionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtReceiveInspectionDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveInspectionList());
            dto.setWHtReceiveInspectionList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveInspectionDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtReceiveNoPlanInspList && !entity.getWHtReceiveNoPlanInspList().isEmpty()) {
            WHtReceiveNoPlanInspDtoMapper mapper = new WHtReceiveNoPlanInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtReceiveNoPlanInspDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveNoPlanInspList());
            dto.setWHtReceiveNoPlanInspList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveNoPlanInspDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtReceiveStoreList && !entity.getWHtReceiveStoreList().isEmpty()) {
            WHtReceiveStoreDtoMapper mapper = new WHtReceiveStoreDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtReceiveStoreDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveStoreList());
            dto.setWHtReceiveStoreList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveStoreDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtSerialReceiveInspList && !entity.getWHtSerialReceiveInspList().isEmpty()) {
            WHtSerialReceiveInspDtoMapper mapper = new WHtSerialReceiveInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtSerialReceiveInspDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtSerialReceiveInspList());
            dto.setWHtSerialReceiveInspList(relationDtoList);
            if (reverseReference) {
                for (WHtSerialReceiveInspDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtSerialShippingInspList && !entity.getWHtSerialShippingInspList().isEmpty()) {
            WHtSerialShippingInspDtoMapper mapper = new WHtSerialShippingInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtSerialShippingInspDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtSerialShippingInspList());
            dto.setWHtSerialShippingInspList(relationDtoList);
            if (reverseReference) {
                for (WHtSerialShippingInspDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtShippingList && !entity.getWHtShippingList().isEmpty()) {
            WHtShippingDtoMapper mapper = new WHtShippingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtShippingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtShippingList());
            dto.setWHtShippingList(relationDtoList);
            if (reverseReference) {
                for (WHtShippingDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtShippingPickingList && !entity.getWHtShippingPickingList().isEmpty()) {
            WHtShippingPickingDtoMapper mapper = new WHtShippingPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtShippingPickingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtShippingPickingList());
            dto.setWHtShippingPickingList(relationDtoList);
            if (reverseReference) {
                for (WHtShippingPickingDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWHtTotalPickingList && !entity.getWHtTotalPickingList().isEmpty()) {
            WHtTotalPickingDtoMapper mapper = new WHtTotalPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtTotalPickingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtTotalPickingList());
            dto.setWHtTotalPickingList(relationDtoList);
            if (reverseReference) {
                for (WHtTotalPickingDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWSglRowShipInspHList && !entity.getWSglRowShipInspHList().isEmpty()) {
            WSglRowShipInspHDtoMapper mapper = new WSglRowShipInspHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WSglRowShipInspHDto> relationDtoList = mapper.mappingToDtoList(entity.getWSglRowShipInspHList());
            dto.setWSglRowShipInspHList(relationDtoList);
            if (reverseReference) {
                for (WSglRowShipInspHDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        if (!_suppressWShippingInterruptList && !entity.getWShippingInterruptList().isEmpty()) {
            WShippingInterruptDtoMapper mapper = new WShippingInterruptDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WShippingInterruptDto> relationDtoList = mapper.mappingToDtoList(entity.getWShippingInterruptList());
            dto.setWShippingInterruptList(relationDtoList);
            if (reverseReference) {
                for (WShippingInterruptDto relationDto : relationDtoList) {
                    relationDto.setMCenter(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MCenterDto> mappingToDtoList(List<MCenter> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MCenterDto> dtoList = new ArrayList<MCenterDto>();
        for (MCenter entity : entityList) {
            MCenterDto dto = mappingToDto(entity);
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
    public MCenter mappingToEntity(MCenterDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MCenter)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCenter entity = new MCenter();
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getCenterNm(), "centerNm")) {
            entity.setCenterNm(dto.getCenterNm());
        }
        if (needsMapping(dto, dto.getCenterAbbr(), "centerAbbr")) {
            entity.setCenterAbbr(dto.getCenterAbbr());
        }
        if (needsMapping(dto, dto.getCultureId(), "cultureId")) {
            entity.setCultureId(dto.getCultureId());
        }
        if (needsMapping(dto, dto.getTimeZoneId(), "timeZoneId")) {
            entity.setTimeZoneId(dto.getTimeZoneId());
        }
        if (needsMapping(dto, dto.getAddress(), "address")) {
            entity.setAddress(dto.getAddress());
        }
        if (needsMapping(dto, dto.getTelNo(), "telNo")) {
            entity.setTelNo(dto.getTelNo());
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
        if (!_suppressBTimeZone && dto.getBTimeZone() != null) {
            BTimeZoneDto relationDto = dto.getBTimeZone();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BTimeZone relationEntity = (BTimeZone)cachedEntity;
                entity.setBTimeZone(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCenterList().add(entity);
                }
            } else {
                BTimeZoneDtoMapper mapper = new BTimeZoneDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCenterList();
                BTimeZone relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBTimeZone(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCenterList().add(entity);
                }
                if (instanceCache && entity.getBTimeZone().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBTimeZone());
                }
            }
        };
        if (!_suppressBCulture && dto.getBCulture() != null) {
            BCultureDto relationDto = dto.getBCulture();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BCulture relationEntity = (BCulture)cachedEntity;
                entity.setBCulture(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCenterList().add(entity);
                }
            } else {
                BCultureDtoMapper mapper = new BCultureDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCenterList();
                BCulture relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBCulture(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCenterList().add(entity);
                }
                if (instanceCache && entity.getBCulture().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBCulture());
                }
            }
        };
        if (!_suppressBClassDtlByDelFlg && dto.getBClassDtlByDelFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByDelFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByDelFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByDelFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByDelFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByDelFlg());
                }
            }
        };
        if (!_suppressHLocationAttributeList && !dto.getHLocationAttributeList().isEmpty()) {
            HLocationAttributeDtoMapper mapper = new HLocationAttributeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<HLocationAttribute> relationEntityList = mapper.mappingToEntityList(dto.getHLocationAttributeList());
            entity.setHLocationAttributeList(relationEntityList);
            if (reverseReference) {
                for (HLocationAttribute relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMBoxList && !dto.getMBoxList().isEmpty()) {
            MBoxDtoMapper mapper = new MBoxDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MBox> relationEntityList = mapper.mappingToEntityList(dto.getMBoxList());
            entity.setMBoxList(relationEntityList);
            if (reverseReference) {
                for (MBox relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMBoxGrpList && !dto.getMBoxGrpList().isEmpty()) {
            MBoxGrpDtoMapper mapper = new MBoxGrpDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MBoxGrp> relationEntityList = mapper.mappingToEntityList(dto.getMBoxGrpList());
            entity.setMBoxGrpList(relationEntityList);
            if (reverseReference) {
                for (MBoxGrp relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCarrierList && !dto.getMCarrierList().isEmpty()) {
            MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCarrier> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierList());
            entity.setMCarrierList(relationEntityList);
            if (reverseReference) {
                for (MCarrier relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCarrierSlipSgwList && !dto.getMCarrierSlipSgwList().isEmpty()) {
            MCarrierSlipSgwDtoMapper mapper = new MCarrierSlipSgwDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCarrierSlipSgw> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierSlipSgwList());
            entity.setMCarrierSlipSgwList(relationEntityList);
            if (reverseReference) {
                for (MCarrierSlipSgw relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCarrierSlipYmtList && !dto.getMCarrierSlipYmtList().isEmpty()) {
            MCarrierSlipYmtDtoMapper mapper = new MCarrierSlipYmtDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCarrierSlipYmt> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierSlipYmtList());
            entity.setMCarrierSlipYmtList(relationEntityList);
            if (reverseReference) {
                for (MCarrierSlipYmt relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCarrierSlipYupkList && !dto.getMCarrierSlipYupkList().isEmpty()) {
            MCarrierSlipYupkDtoMapper mapper = new MCarrierSlipYupkDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCarrierSlipYupk> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierSlipYupkList());
            entity.setMCarrierSlipYupkList(relationEntityList);
            if (reverseReference) {
                for (MCarrierSlipYupk relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCenterClassList && !dto.getMCenterClassList().isEmpty()) {
            MCenterClassDtoMapper mapper = new MCenterClassDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterClass> relationEntityList = mapper.mappingToEntityList(dto.getMCenterClassList());
            entity.setMCenterClassList(relationEntityList);
            if (reverseReference) {
                for (MCenterClass relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCenterColList && !dto.getMCenterColList().isEmpty()) {
            MCenterColDtoMapper mapper = new MCenterColDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterCol> relationEntityList = mapper.mappingToEntityList(dto.getMCenterColList());
            entity.setMCenterColList(relationEntityList);
            if (reverseReference) {
                for (MCenterCol relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCenterCustomerList && !dto.getMCenterCustomerList().isEmpty()) {
            MCenterCustomerDtoMapper mapper = new MCenterCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterCustomer> relationEntityList = mapper.mappingToEntityList(dto.getMCenterCustomerList());
            entity.setMCenterCustomerList(relationEntityList);
            if (reverseReference) {
                for (MCenterCustomer relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCenterItemList && !dto.getMCenterItemList().isEmpty()) {
            MCenterItemDtoMapper mapper = new MCenterItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterItem> relationEntityList = mapper.mappingToEntityList(dto.getMCenterItemList());
            entity.setMCenterItemList(relationEntityList);
            if (reverseReference) {
                for (MCenterItem relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCenterScreenList && !dto.getMCenterScreenList().isEmpty()) {
            MCenterScreenDtoMapper mapper = new MCenterScreenDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCenterScreen> relationEntityList = mapper.mappingToEntityList(dto.getMCenterScreenList());
            entity.setMCenterScreenList(relationEntityList);
            if (reverseReference) {
                for (MCenterScreen relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMClientCenterList && !dto.getMClientCenterList().isEmpty()) {
            MClientCenterDtoMapper mapper = new MClientCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MClientCenter> relationEntityList = mapper.mappingToEntityList(dto.getMClientCenterList());
            entity.setMClientCenterList(relationEntityList);
            if (reverseReference) {
                for (MClientCenter relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMCustomerPickingList && !dto.getMCustomerPickingList().isEmpty()) {
            MCustomerPickingDtoMapper mapper = new MCustomerPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MCustomerPicking> relationEntityList = mapper.mappingToEntityList(dto.getMCustomerPickingList());
            entity.setMCustomerPickingList(relationEntityList);
            if (reverseReference) {
                for (MCustomerPicking relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMDeliveryCourseList && !dto.getMDeliveryCourseList().isEmpty()) {
            MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MDeliveryCourse> relationEntityList = mapper.mappingToEntityList(dto.getMDeliveryCourseList());
            entity.setMDeliveryCourseList(relationEntityList);
            if (reverseReference) {
                for (MDeliveryCourse relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMGeneralList && !dto.getMGeneralList().isEmpty()) {
            MGeneralDtoMapper mapper = new MGeneralDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MGeneral> relationEntityList = mapper.mappingToEntityList(dto.getMGeneralList());
            entity.setMGeneralList(relationEntityList);
            if (reverseReference) {
                for (MGeneral relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMLocationList && !dto.getMLocationList().isEmpty()) {
            MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MLocation> relationEntityList = mapper.mappingToEntityList(dto.getMLocationList());
            entity.setMLocationList(relationEntityList);
            if (reverseReference) {
                for (MLocation relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMNizoroeList && !dto.getMNizoroeList().isEmpty()) {
            MNizoroeDtoMapper mapper = new MNizoroeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MNizoroe> relationEntityList = mapper.mappingToEntityList(dto.getMNizoroeList());
            entity.setMNizoroeList(relationEntityList);
            if (reverseReference) {
                for (MNizoroe relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMNumberingCenterList && !dto.getMNumberingCenterList().isEmpty()) {
            MNumberingCenterDtoMapper mapper = new MNumberingCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MNumberingCenter> relationEntityList = mapper.mappingToEntityList(dto.getMNumberingCenterList());
            entity.setMNumberingCenterList(relationEntityList);
            if (reverseReference) {
                for (MNumberingCenter relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMUserCenterList && !dto.getMUserCenterList().isEmpty()) {
            MUserCenterDtoMapper mapper = new MUserCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MUserCenter> relationEntityList = mapper.mappingToEntityList(dto.getMUserCenterList());
            entity.setMUserCenterList(relationEntityList);
            if (reverseReference) {
                for (MUserCenter relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMUserLoginList && !dto.getMUserLoginList().isEmpty()) {
            MUserLoginDtoMapper mapper = new MUserLoginDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MUserLogin> relationEntityList = mapper.mappingToEntityList(dto.getMUserLoginList());
            entity.setMUserLoginList(relationEntityList);
            if (reverseReference) {
                for (MUserLogin relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMWarehouseList && !dto.getMWarehouseList().isEmpty()) {
            MWarehouseDtoMapper mapper = new MWarehouseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MWarehouse> relationEntityList = mapper.mappingToEntityList(dto.getMWarehouseList());
            entity.setMWarehouseList(relationEntityList);
            if (reverseReference) {
                for (MWarehouse relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressMWebHtInfoList && !dto.getMWebHtInfoList().isEmpty()) {
            MWebHtInfoDtoMapper mapper = new MWebHtInfoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<MWebHtInfo> relationEntityList = mapper.mappingToEntityList(dto.getMWebHtInfoList());
            entity.setMWebHtInfoList(relationEntityList);
            if (reverseReference) {
                for (MWebHtInfo relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTAllocInstHList && !dto.getTAllocInstHList().isEmpty()) {
            TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TAllocInstH> relationEntityList = mapper.mappingToEntityList(dto.getTAllocInstHList());
            entity.setTAllocInstHList(relationEntityList);
            if (reverseReference) {
                for (TAllocInstH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTEcOrderHList && !dto.getTEcOrderHList().isEmpty()) {
            TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TEcOrderH> relationEntityList = mapper.mappingToEntityList(dto.getTEcOrderHList());
            entity.setTEcOrderHList(relationEntityList);
            if (reverseReference) {
                for (TEcOrderH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTInventoryHList && !dto.getTInventoryHList().isEmpty()) {
            TInventoryHDtoMapper mapper = new TInventoryHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TInventoryH> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryHList());
            entity.setTInventoryHList(relationEntityList);
            if (reverseReference) {
                for (TInventoryH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTMoveInstHList && !dto.getTMoveInstHList().isEmpty()) {
            TMoveInstHDtoMapper mapper = new TMoveInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TMoveInstH> relationEntityList = mapper.mappingToEntityList(dto.getTMoveInstHList());
            entity.setTMoveInstHList(relationEntityList);
            if (reverseReference) {
                for (TMoveInstH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTPackingHList && !dto.getTPackingHList().isEmpty()) {
            TPackingHDtoMapper mapper = new TPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TPackingH> relationEntityList = mapper.mappingToEntityList(dto.getTPackingHList());
            entity.setTPackingHList(relationEntityList);
            if (reverseReference) {
                for (TPackingH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTPicMthdRcmdList && !dto.getTPicMthdRcmdList().isEmpty()) {
            TPicMthdRcmdDtoMapper mapper = new TPicMthdRcmdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TPicMthdRcmd> relationEntityList = mapper.mappingToEntityList(dto.getTPicMthdRcmdList());
            entity.setTPicMthdRcmdList(relationEntityList);
            if (reverseReference) {
                for (TPicMthdRcmd relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTPickingHList && !dto.getTPickingHList().isEmpty()) {
            TPickingHDtoMapper mapper = new TPickingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TPickingH> relationEntityList = mapper.mappingToEntityList(dto.getTPickingHList());
            entity.setTPickingHList(relationEntityList);
            if (reverseReference) {
                for (TPickingH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTReceivePlanHList && !dto.getTReceivePlanHList().isEmpty()) {
            TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TReceivePlanH> relationEntityList = mapper.mappingToEntityList(dto.getTReceivePlanHList());
            entity.setTReceivePlanHList(relationEntityList);
            if (reverseReference) {
                for (TReceivePlanH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTSerialNoList && !dto.getTSerialNoList().isEmpty()) {
            TSerialNoDtoMapper mapper = new TSerialNoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TSerialNo> relationEntityList = mapper.mappingToEntityList(dto.getTSerialNoList());
            entity.setTSerialNoList(relationEntityList);
            if (reverseReference) {
                for (TSerialNo relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTShippingInstHList && !dto.getTShippingInstHList().isEmpty()) {
            TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TShippingInstH> relationEntityList = mapper.mappingToEntityList(dto.getTShippingInstHList());
            entity.setTShippingInstHList(relationEntityList);
            if (reverseReference) {
                for (TShippingInstH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressTStoreRecordHList && !dto.getTStoreRecordHList().isEmpty()) {
            TStoreRecordHDtoMapper mapper = new TStoreRecordHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<TStoreRecordH> relationEntityList = mapper.mappingToEntityList(dto.getTStoreRecordHList());
            entity.setTStoreRecordHList(relationEntityList);
            if (reverseReference) {
                for (TStoreRecordH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtInventoryInputProdList && !dto.getWHtInventoryInputProdList().isEmpty()) {
            WHtInventoryInputProdDtoMapper mapper = new WHtInventoryInputProdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtInventoryInputProd> relationEntityList = mapper.mappingToEntityList(dto.getWHtInventoryInputProdList());
            entity.setWHtInventoryInputProdList(relationEntityList);
            if (reverseReference) {
                for (WHtInventoryInputProd relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtLoadingList && !dto.getWHtLoadingList().isEmpty()) {
            WHtLoadingDtoMapper mapper = new WHtLoadingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtLoading> relationEntityList = mapper.mappingToEntityList(dto.getWHtLoadingList());
            entity.setWHtLoadingList(relationEntityList);
            if (reverseReference) {
                for (WHtLoading relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtPickingList && !dto.getWHtPickingList().isEmpty()) {
            WHtPickingDtoMapper mapper = new WHtPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtPicking> relationEntityList = mapper.mappingToEntityList(dto.getWHtPickingList());
            entity.setWHtPickingList(relationEntityList);
            if (reverseReference) {
                for (WHtPicking relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtReceiveInspectionList && !dto.getWHtReceiveInspectionList().isEmpty()) {
            WHtReceiveInspectionDtoMapper mapper = new WHtReceiveInspectionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtReceiveInspection> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveInspectionList());
            entity.setWHtReceiveInspectionList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveInspection relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtReceiveNoPlanInspList && !dto.getWHtReceiveNoPlanInspList().isEmpty()) {
            WHtReceiveNoPlanInspDtoMapper mapper = new WHtReceiveNoPlanInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtReceiveNoPlanInsp> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveNoPlanInspList());
            entity.setWHtReceiveNoPlanInspList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveNoPlanInsp relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtReceiveStoreList && !dto.getWHtReceiveStoreList().isEmpty()) {
            WHtReceiveStoreDtoMapper mapper = new WHtReceiveStoreDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtReceiveStore> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveStoreList());
            entity.setWHtReceiveStoreList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveStore relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtSerialReceiveInspList && !dto.getWHtSerialReceiveInspList().isEmpty()) {
            WHtSerialReceiveInspDtoMapper mapper = new WHtSerialReceiveInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtSerialReceiveInsp> relationEntityList = mapper.mappingToEntityList(dto.getWHtSerialReceiveInspList());
            entity.setWHtSerialReceiveInspList(relationEntityList);
            if (reverseReference) {
                for (WHtSerialReceiveInsp relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtSerialShippingInspList && !dto.getWHtSerialShippingInspList().isEmpty()) {
            WHtSerialShippingInspDtoMapper mapper = new WHtSerialShippingInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtSerialShippingInsp> relationEntityList = mapper.mappingToEntityList(dto.getWHtSerialShippingInspList());
            entity.setWHtSerialShippingInspList(relationEntityList);
            if (reverseReference) {
                for (WHtSerialShippingInsp relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtShippingList && !dto.getWHtShippingList().isEmpty()) {
            WHtShippingDtoMapper mapper = new WHtShippingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtShipping> relationEntityList = mapper.mappingToEntityList(dto.getWHtShippingList());
            entity.setWHtShippingList(relationEntityList);
            if (reverseReference) {
                for (WHtShipping relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtShippingPickingList && !dto.getWHtShippingPickingList().isEmpty()) {
            WHtShippingPickingDtoMapper mapper = new WHtShippingPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtShippingPicking> relationEntityList = mapper.mappingToEntityList(dto.getWHtShippingPickingList());
            entity.setWHtShippingPickingList(relationEntityList);
            if (reverseReference) {
                for (WHtShippingPicking relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWHtTotalPickingList && !dto.getWHtTotalPickingList().isEmpty()) {
            WHtTotalPickingDtoMapper mapper = new WHtTotalPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WHtTotalPicking> relationEntityList = mapper.mappingToEntityList(dto.getWHtTotalPickingList());
            entity.setWHtTotalPickingList(relationEntityList);
            if (reverseReference) {
                for (WHtTotalPicking relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWSglRowShipInspHList && !dto.getWSglRowShipInspHList().isEmpty()) {
            WSglRowShipInspHDtoMapper mapper = new WSglRowShipInspHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WSglRowShipInspH> relationEntityList = mapper.mappingToEntityList(dto.getWSglRowShipInspHList());
            entity.setWSglRowShipInspHList(relationEntityList);
            if (reverseReference) {
                for (WSglRowShipInspH relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
                }
            }
        };
        if (!_suppressWShippingInterruptList && !dto.getWShippingInterruptList().isEmpty()) {
            WShippingInterruptDtoMapper mapper = new WShippingInterruptDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenter();
            List<WShippingInterrupt> relationEntityList = mapper.mappingToEntityList(dto.getWShippingInterruptList());
            entity.setWShippingInterruptList(relationEntityList);
            if (reverseReference) {
                for (WShippingInterrupt relationEntity : relationEntityList) {
                    relationEntity.setMCenter(entity);
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
    protected boolean needsMapping(MCenterDto dto, Object value, String propName) {
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
    public List<MCenter> mappingToEntityList(List<MCenterDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MCenter> entityList = new ArrayList<MCenter>();
        for (MCenterDto dto : dtoList) {
            MCenter entity = mappingToEntity(dto);
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
    public void suppressBTimeZone() {
        _suppressBTimeZone = true;
    }
    public void suppressBCulture() {
        _suppressBCulture = true;
    }
    public void suppressBClassDtlByDelFlg() {
        _suppressBClassDtlByDelFlg = true;
    }
    public void suppressHLocationAttributeList() {
        _suppressHLocationAttributeList = true;
    }
    public void suppressMBoxList() {
        _suppressMBoxList = true;
    }
    public void suppressMBoxGrpList() {
        _suppressMBoxGrpList = true;
    }
    public void suppressMCarrierList() {
        _suppressMCarrierList = true;
    }
    public void suppressMCarrierSlipSgwList() {
        _suppressMCarrierSlipSgwList = true;
    }
    public void suppressMCarrierSlipYmtList() {
        _suppressMCarrierSlipYmtList = true;
    }
    public void suppressMCarrierSlipYupkList() {
        _suppressMCarrierSlipYupkList = true;
    }
    public void suppressMCenterClassList() {
        _suppressMCenterClassList = true;
    }
    public void suppressMCenterColList() {
        _suppressMCenterColList = true;
    }
    public void suppressMCenterCustomerList() {
        _suppressMCenterCustomerList = true;
    }
    public void suppressMCenterItemList() {
        _suppressMCenterItemList = true;
    }
    public void suppressMCenterScreenList() {
        _suppressMCenterScreenList = true;
    }
    public void suppressMClientCenterList() {
        _suppressMClientCenterList = true;
    }
    public void suppressMCustomerPickingList() {
        _suppressMCustomerPickingList = true;
    }
    public void suppressMDeliveryCourseList() {
        _suppressMDeliveryCourseList = true;
    }
    public void suppressMGeneralList() {
        _suppressMGeneralList = true;
    }
    public void suppressMLocationList() {
        _suppressMLocationList = true;
    }
    public void suppressMNizoroeList() {
        _suppressMNizoroeList = true;
    }
    public void suppressMNumberingCenterList() {
        _suppressMNumberingCenterList = true;
    }
    public void suppressMUserCenterList() {
        _suppressMUserCenterList = true;
    }
    public void suppressMUserLoginList() {
        _suppressMUserLoginList = true;
    }
    public void suppressMWarehouseList() {
        _suppressMWarehouseList = true;
    }
    public void suppressMWebHtInfoList() {
        _suppressMWebHtInfoList = true;
    }
    public void suppressTAllocInstHList() {
        _suppressTAllocInstHList = true;
    }
    public void suppressTEcOrderHList() {
        _suppressTEcOrderHList = true;
    }
    public void suppressTInventoryHList() {
        _suppressTInventoryHList = true;
    }
    public void suppressTMoveInstHList() {
        _suppressTMoveInstHList = true;
    }
    public void suppressTPackingHList() {
        _suppressTPackingHList = true;
    }
    public void suppressTPicMthdRcmdList() {
        _suppressTPicMthdRcmdList = true;
    }
    public void suppressTPickingHList() {
        _suppressTPickingHList = true;
    }
    public void suppressTReceivePlanHList() {
        _suppressTReceivePlanHList = true;
    }
    public void suppressTSerialNoList() {
        _suppressTSerialNoList = true;
    }
    public void suppressTShippingInstHList() {
        _suppressTShippingInstHList = true;
    }
    public void suppressTStoreRecordHList() {
        _suppressTStoreRecordHList = true;
    }
    public void suppressWHtInventoryInputProdList() {
        _suppressWHtInventoryInputProdList = true;
    }
    public void suppressWHtLoadingList() {
        _suppressWHtLoadingList = true;
    }
    public void suppressWHtPickingList() {
        _suppressWHtPickingList = true;
    }
    public void suppressWHtReceiveInspectionList() {
        _suppressWHtReceiveInspectionList = true;
    }
    public void suppressWHtReceiveNoPlanInspList() {
        _suppressWHtReceiveNoPlanInspList = true;
    }
    public void suppressWHtReceiveStoreList() {
        _suppressWHtReceiveStoreList = true;
    }
    public void suppressWHtSerialReceiveInspList() {
        _suppressWHtSerialReceiveInspList = true;
    }
    public void suppressWHtSerialShippingInspList() {
        _suppressWHtSerialShippingInspList = true;
    }
    public void suppressWHtShippingList() {
        _suppressWHtShippingList = true;
    }
    public void suppressWHtShippingPickingList() {
        _suppressWHtShippingPickingList = true;
    }
    public void suppressWHtTotalPickingList() {
        _suppressWHtTotalPickingList = true;
    }
    public void suppressWSglRowShipInspHList() {
        _suppressWSglRowShipInspHList = true;
    }
    public void suppressWShippingInterruptList() {
        _suppressWShippingInterruptList = true;
    }
    protected void doSuppressAll() { // internal
        suppressBTimeZone();
        suppressBCulture();
        suppressBClassDtlByDelFlg();
        suppressHLocationAttributeList();
        suppressMBoxList();
        suppressMBoxGrpList();
        suppressMCarrierList();
        suppressMCarrierSlipSgwList();
        suppressMCarrierSlipYmtList();
        suppressMCarrierSlipYupkList();
        suppressMCenterClassList();
        suppressMCenterColList();
        suppressMCenterCustomerList();
        suppressMCenterItemList();
        suppressMCenterScreenList();
        suppressMClientCenterList();
        suppressMCustomerPickingList();
        suppressMDeliveryCourseList();
        suppressMGeneralList();
        suppressMLocationList();
        suppressMNizoroeList();
        suppressMNumberingCenterList();
        suppressMUserCenterList();
        suppressMUserLoginList();
        suppressMWarehouseList();
        suppressMWebHtInfoList();
        suppressTAllocInstHList();
        suppressTEcOrderHList();
        suppressTInventoryHList();
        suppressTMoveInstHList();
        suppressTPackingHList();
        suppressTPicMthdRcmdList();
        suppressTPickingHList();
        suppressTReceivePlanHList();
        suppressTSerialNoList();
        suppressTShippingInstHList();
        suppressTStoreRecordHList();
        suppressWHtInventoryInputProdList();
        suppressWHtLoadingList();
        suppressWHtPickingList();
        suppressWHtReceiveInspectionList();
        suppressWHtReceiveNoPlanInspList();
        suppressWHtReceiveStoreList();
        suppressWHtSerialReceiveInspList();
        suppressWHtSerialShippingInspList();
        suppressWHtShippingList();
        suppressWHtShippingPickingList();
        suppressWHtTotalPickingList();
        suppressWSglRowShipInspHList();
        suppressWShippingInterruptList();
    }
    protected void doSuppressClear() { // internal
        _suppressBTimeZone = false;
        _suppressBCulture = false;
        _suppressBClassDtlByDelFlg = false;
        _suppressHLocationAttributeList = false;
        _suppressMBoxList = false;
        _suppressMBoxGrpList = false;
        _suppressMCarrierList = false;
        _suppressMCarrierSlipSgwList = false;
        _suppressMCarrierSlipYmtList = false;
        _suppressMCarrierSlipYupkList = false;
        _suppressMCenterClassList = false;
        _suppressMCenterColList = false;
        _suppressMCenterCustomerList = false;
        _suppressMCenterItemList = false;
        _suppressMCenterScreenList = false;
        _suppressMClientCenterList = false;
        _suppressMCustomerPickingList = false;
        _suppressMDeliveryCourseList = false;
        _suppressMGeneralList = false;
        _suppressMLocationList = false;
        _suppressMNizoroeList = false;
        _suppressMNumberingCenterList = false;
        _suppressMUserCenterList = false;
        _suppressMUserLoginList = false;
        _suppressMWarehouseList = false;
        _suppressMWebHtInfoList = false;
        _suppressTAllocInstHList = false;
        _suppressTEcOrderHList = false;
        _suppressTInventoryHList = false;
        _suppressTMoveInstHList = false;
        _suppressTPackingHList = false;
        _suppressTPicMthdRcmdList = false;
        _suppressTPickingHList = false;
        _suppressTReceivePlanHList = false;
        _suppressTSerialNoList = false;
        _suppressTShippingInstHList = false;
        _suppressTStoreRecordHList = false;
        _suppressWHtInventoryInputProdList = false;
        _suppressWHtLoadingList = false;
        _suppressWHtPickingList = false;
        _suppressWHtReceiveInspectionList = false;
        _suppressWHtReceiveNoPlanInspList = false;
        _suppressWHtReceiveStoreList = false;
        _suppressWHtSerialReceiveInspList = false;
        _suppressWHtSerialShippingInspList = false;
        _suppressWHtShippingList = false;
        _suppressWHtShippingPickingList = false;
        _suppressWHtTotalPickingList = false;
        _suppressWSglRowShipInspHList = false;
        _suppressWShippingInterruptList = false;
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
    public MCenterDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MCenterDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MCenterDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MCenterDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MCenterDtoMapper reverseReference() {
        setReverseReference(true);
        return (MCenterDtoMapper)this;
    }
}
