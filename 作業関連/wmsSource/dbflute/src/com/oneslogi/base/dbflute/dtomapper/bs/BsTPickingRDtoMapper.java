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
 * The DTO mapper of t_picking_r as TABLE. <br>
 * 出庫帳票
 * <pre>
 * [primary-key]
 *     PICKING_H_ID
 *
 * [column]
 *     PICKING_H_ID, OPL_OUT_FLG, TPL_OUT_FLG, MLT_OUT_FLG, SPL_OUT_FLG, PL1_OUT_FLG, PL1_OUT_USER_ID, PL1_OUT_DT, PL_OUT_FLG, PL_OUT_USER_ID, PL_OUT_DT, SL_OUT_FLG, PL2_OUT_FLG, PL2_OUT_USER_ID, PL2_OUT_DT, CASE_OUT_FLG, CASE_OUT_USER_ID, CASE_OUT_DT, PACKING_OUT_FLG, PACKING_OUT_USER_ID, PACKING_OUT_DT, SLIP_OUT_FLG, SLIP_OUT_USER_ID, SLIP_OUT_DT, INVOICE_CREATE_FLG, INVOICE_CREATE_DT, INVOICE_ISSUE_NUM, SHIPPING_RECORD_OUT_FLG, SHIPPING_RECORD_OUT_USER_ID, SHIPPING_RECORD_OUT_DT, BOL_OUT_FLG, BOL_OUT_USER_ID, BOL_OUT_DT, TAG_OUT_FLG, TAG_OUT_USER_ID, TAG_OUT_DT, DELIV_OUT_FLG, DELIV_OUT_USER_ID, DELIV_OUT_DT, PLL_OUT_FLG, PLL_OUT_USER_ID, PLL_OUT_DT, NIZOROE_OUT_FLG, NIZOROE_OUT_USER_ID, NIZOROE_OUT_DT, INDV_SUPPLY_OUT_FLG, INDV_SUPPLY_OUT_USER_ID, INDV_SUPPLY_OUT_DT, INDV_LABEL_OUT_FLG, INDV_LABEL_OUT_USER_ID, INDV_LABEL_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     t_picking_h, b_user, b_class_dtl(ByInvoiceCreateFlg)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tPickingH, bUserByCaseOutUserId, bUserByBolOutUserId, bUserByPl1OutUserId, bUserByTagOutUserId, bUserByShippingRecordOutUserId, bUserByDelivOutUserId, bUserByIndvSupplyOutUserId, bUserByPackingOutUserId, bUserByPlOutUserId, bUserByIndvLabelOutUserId, bUserByPl2OutUserId, bUserBySlipOutUserId, bUserByNizoroeOutUserId, bUserByPllOutUserId, bClassDtlByInvoiceCreateFlg, bClassDtlByOplOutFlg, bClassDtlByTplOutFlg, bClassDtlByCaseOutFlg, bClassDtlByMltOutFlg, bClassDtlBySplOutFlg, bClassDtlByPlOutFlg, bClassDtlBySlOutFlg, bClassDtlByPl1OutFlg, bClassDtlByPl2OutFlg, bClassDtlByPackingOutFlg, bClassDtlBySlipOutFlg, bClassDtlByShippingRecordOutFlg, bClassDtlByBolOutFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTPickingRDtoMapper implements DtoMapper<TPickingR, TPickingRDto>, Serializable {

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
    protected boolean _suppressTPickingH;
    protected boolean _suppressBUserByCaseOutUserId;
    protected boolean _suppressBUserByBolOutUserId;
    protected boolean _suppressBUserByPl1OutUserId;
    protected boolean _suppressBUserByTagOutUserId;
    protected boolean _suppressBUserByShippingRecordOutUserId;
    protected boolean _suppressBUserByDelivOutUserId;
    protected boolean _suppressBUserByIndvSupplyOutUserId;
    protected boolean _suppressBUserByPackingOutUserId;
    protected boolean _suppressBUserByPlOutUserId;
    protected boolean _suppressBUserByIndvLabelOutUserId;
    protected boolean _suppressBUserByPl2OutUserId;
    protected boolean _suppressBUserBySlipOutUserId;
    protected boolean _suppressBUserByNizoroeOutUserId;
    protected boolean _suppressBUserByPllOutUserId;
    protected boolean _suppressBClassDtlByInvoiceCreateFlg;
    protected boolean _suppressBClassDtlByOplOutFlg;
    protected boolean _suppressBClassDtlByTplOutFlg;
    protected boolean _suppressBClassDtlByCaseOutFlg;
    protected boolean _suppressBClassDtlByMltOutFlg;
    protected boolean _suppressBClassDtlBySplOutFlg;
    protected boolean _suppressBClassDtlByPlOutFlg;
    protected boolean _suppressBClassDtlBySlOutFlg;
    protected boolean _suppressBClassDtlByPl1OutFlg;
    protected boolean _suppressBClassDtlByPl2OutFlg;
    protected boolean _suppressBClassDtlByPackingOutFlg;
    protected boolean _suppressBClassDtlBySlipOutFlg;
    protected boolean _suppressBClassDtlByShippingRecordOutFlg;
    protected boolean _suppressBClassDtlByBolOutFlg;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPickingRDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTPickingRDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TPickingRDto mappingToDto(TPickingR entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TPickingRDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TPickingRDto dto = new TPickingRDto();
        dto.setPickingHId(entity.getPickingHId());
        dto.setOplOutFlg(entity.getOplOutFlg());
        dto.setTplOutFlg(entity.getTplOutFlg());
        dto.setMltOutFlg(entity.getMltOutFlg());
        dto.setSplOutFlg(entity.getSplOutFlg());
        dto.setPl1OutFlg(entity.getPl1OutFlg());
        dto.setPl1OutUserId(entity.getPl1OutUserId());
        dto.setPl1OutDt(entity.getPl1OutDt());
        dto.setPlOutFlg(entity.getPlOutFlg());
        dto.setPlOutUserId(entity.getPlOutUserId());
        dto.setPlOutDt(entity.getPlOutDt());
        dto.setSlOutFlg(entity.getSlOutFlg());
        dto.setPl2OutFlg(entity.getPl2OutFlg());
        dto.setPl2OutUserId(entity.getPl2OutUserId());
        dto.setPl2OutDt(entity.getPl2OutDt());
        dto.setCaseOutFlg(entity.getCaseOutFlg());
        dto.setCaseOutUserId(entity.getCaseOutUserId());
        dto.setCaseOutDt(entity.getCaseOutDt());
        dto.setPackingOutFlg(entity.getPackingOutFlg());
        dto.setPackingOutUserId(entity.getPackingOutUserId());
        dto.setPackingOutDt(entity.getPackingOutDt());
        dto.setSlipOutFlg(entity.getSlipOutFlg());
        dto.setSlipOutUserId(entity.getSlipOutUserId());
        dto.setSlipOutDt(entity.getSlipOutDt());
        dto.setInvoiceCreateFlg(entity.getInvoiceCreateFlg());
        dto.setInvoiceCreateDt(entity.getInvoiceCreateDt());
        dto.setInvoiceIssueNum(entity.getInvoiceIssueNum());
        dto.setShippingRecordOutFlg(entity.getShippingRecordOutFlg());
        dto.setShippingRecordOutUserId(entity.getShippingRecordOutUserId());
        dto.setShippingRecordOutDt(entity.getShippingRecordOutDt());
        dto.setBolOutFlg(entity.getBolOutFlg());
        dto.setBolOutUserId(entity.getBolOutUserId());
        dto.setBolOutDt(entity.getBolOutDt());
        dto.setTagOutFlg(entity.getTagOutFlg());
        dto.setTagOutUserId(entity.getTagOutUserId());
        dto.setTagOutDt(entity.getTagOutDt());
        dto.setDelivOutFlg(entity.getDelivOutFlg());
        dto.setDelivOutUserId(entity.getDelivOutUserId());
        dto.setDelivOutDt(entity.getDelivOutDt());
        dto.setPllOutFlg(entity.getPllOutFlg());
        dto.setPllOutUserId(entity.getPllOutUserId());
        dto.setPllOutDt(entity.getPllOutDt());
        dto.setNizoroeOutFlg(entity.getNizoroeOutFlg());
        dto.setNizoroeOutUserId(entity.getNizoroeOutUserId());
        dto.setNizoroeOutDt(entity.getNizoroeOutDt());
        dto.setIndvSupplyOutFlg(entity.getIndvSupplyOutFlg());
        dto.setIndvSupplyOutUserId(entity.getIndvSupplyOutUserId());
        dto.setIndvSupplyOutDt(entity.getIndvSupplyOutDt());
        dto.setIndvLabelOutFlg(entity.getIndvLabelOutFlg());
        dto.setIndvLabelOutUserId(entity.getIndvLabelOutUserId());
        dto.setIndvLabelOutDt(entity.getIndvLabelOutDt());
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
        if (!_suppressTPickingH && entity.getTPickingH() != null) {
            TPickingH relationEntity = entity.getTPickingH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TPickingHDto relationDto = (TPickingHDto)cachedDto;
                dto.setTPickingH(relationDto);
                if (reverseReference) {
                    relationDto.setTPickingRAsOne(dto);
                }
            } else {
                TPickingHDtoMapper mapper = new TPickingHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRAsOne();
                TPickingHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTPickingH(relationDto);
                if (reverseReference) {
                    relationDto.setTPickingRAsOne(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTPickingH());
                }
            }
        };
        if (!_suppressBUserByCaseOutUserId && entity.getBUserByCaseOutUserId() != null) {
            BUser relationEntity = entity.getBUserByCaseOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByCaseOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByCaseOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByCaseOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByCaseOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByCaseOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByCaseOutUserId());
                }
            }
        };
        if (!_suppressBUserByBolOutUserId && entity.getBUserByBolOutUserId() != null) {
            BUser relationEntity = entity.getBUserByBolOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByBolOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByBolOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByBolOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByBolOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByBolOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByBolOutUserId());
                }
            }
        };
        if (!_suppressBUserByPl1OutUserId && entity.getBUserByPl1OutUserId() != null) {
            BUser relationEntity = entity.getBUserByPl1OutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByPl1OutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByPl1OutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByPl1OutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByPl1OutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByPl1OutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByPl1OutUserId());
                }
            }
        };
        if (!_suppressBUserByTagOutUserId && entity.getBUserByTagOutUserId() != null) {
            BUser relationEntity = entity.getBUserByTagOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByTagOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByTagOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByTagOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByTagOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByTagOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByTagOutUserId());
                }
            }
        };
        if (!_suppressBUserByShippingRecordOutUserId && entity.getBUserByShippingRecordOutUserId() != null) {
            BUser relationEntity = entity.getBUserByShippingRecordOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByShippingRecordOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByShippingRecordOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByShippingRecordOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByShippingRecordOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByShippingRecordOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByShippingRecordOutUserId());
                }
            }
        };
        if (!_suppressBUserByDelivOutUserId && entity.getBUserByDelivOutUserId() != null) {
            BUser relationEntity = entity.getBUserByDelivOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByDelivOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByDelivOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByDelivOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByDelivOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByDelivOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByDelivOutUserId());
                }
            }
        };
        if (!_suppressBUserByIndvSupplyOutUserId && entity.getBUserByIndvSupplyOutUserId() != null) {
            BUser relationEntity = entity.getBUserByIndvSupplyOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByIndvSupplyOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByIndvSupplyOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByIndvSupplyOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByIndvSupplyOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByIndvSupplyOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByIndvSupplyOutUserId());
                }
            }
        };
        if (!_suppressBUserByPackingOutUserId && entity.getBUserByPackingOutUserId() != null) {
            BUser relationEntity = entity.getBUserByPackingOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByPackingOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByPackingOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByPackingOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByPackingOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByPackingOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByPackingOutUserId());
                }
            }
        };
        if (!_suppressBUserByPlOutUserId && entity.getBUserByPlOutUserId() != null) {
            BUser relationEntity = entity.getBUserByPlOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByPlOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByPlOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByPlOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByPlOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByPlOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByPlOutUserId());
                }
            }
        };
        if (!_suppressBUserByIndvLabelOutUserId && entity.getBUserByIndvLabelOutUserId() != null) {
            BUser relationEntity = entity.getBUserByIndvLabelOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByIndvLabelOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByIndvLabelOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByIndvLabelOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByIndvLabelOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByIndvLabelOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByIndvLabelOutUserId());
                }
            }
        };
        if (!_suppressBUserByPl2OutUserId && entity.getBUserByPl2OutUserId() != null) {
            BUser relationEntity = entity.getBUserByPl2OutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByPl2OutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByPl2OutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByPl2OutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByPl2OutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByPl2OutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByPl2OutUserId());
                }
            }
        };
        if (!_suppressBUserBySlipOutUserId && entity.getBUserBySlipOutUserId() != null) {
            BUser relationEntity = entity.getBUserBySlipOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserBySlipOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRBySlipOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRBySlipOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserBySlipOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRBySlipOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserBySlipOutUserId());
                }
            }
        };
        if (!_suppressBUserByNizoroeOutUserId && entity.getBUserByNizoroeOutUserId() != null) {
            BUser relationEntity = entity.getBUserByNizoroeOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByNizoroeOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByNizoroeOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByNizoroeOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByNizoroeOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByNizoroeOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByNizoroeOutUserId());
                }
            }
        };
        if (!_suppressBUserByPllOutUserId && entity.getBUserByPllOutUserId() != null) {
            BUser relationEntity = entity.getBUserByPllOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByPllOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByPllOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByPllOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByPllOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingRByPllOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByPllOutUserId());
                }
            }
        };
        if (!_suppressBClassDtlByInvoiceCreateFlg && entity.getBClassDtlByInvoiceCreateFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByInvoiceCreateFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByInvoiceCreateFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByInvoiceCreateFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByInvoiceCreateFlg());
                }
            }
        };
        if (!_suppressBClassDtlByOplOutFlg && entity.getBClassDtlByOplOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByOplOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByOplOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByOplOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByOplOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByTplOutFlg && entity.getBClassDtlByTplOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByTplOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByTplOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByTplOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByTplOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByCaseOutFlg && entity.getBClassDtlByCaseOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByCaseOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByCaseOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByCaseOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByCaseOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByMltOutFlg && entity.getBClassDtlByMltOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByMltOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByMltOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByMltOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByMltOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlBySplOutFlg && entity.getBClassDtlBySplOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlBySplOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlBySplOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlBySplOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlBySplOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPlOutFlg && entity.getBClassDtlByPlOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPlOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPlOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPlOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPlOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlBySlOutFlg && entity.getBClassDtlBySlOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlBySlOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlBySlOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlBySlOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlBySlOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPl1OutFlg && entity.getBClassDtlByPl1OutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPl1OutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPl1OutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPl1OutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPl1OutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPl2OutFlg && entity.getBClassDtlByPl2OutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPl2OutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPl2OutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPl2OutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPl2OutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPackingOutFlg && entity.getBClassDtlByPackingOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPackingOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPackingOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPackingOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPackingOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlBySlipOutFlg && entity.getBClassDtlBySlipOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlBySlipOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlBySlipOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlBySlipOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlBySlipOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByShippingRecordOutFlg && entity.getBClassDtlByShippingRecordOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByShippingRecordOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByShippingRecordOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByShippingRecordOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByShippingRecordOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByBolOutFlg && entity.getBClassDtlByBolOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByBolOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByBolOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByBolOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByBolOutFlg());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TPickingRDto> mappingToDtoList(List<TPickingR> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TPickingRDto> dtoList = new ArrayList<TPickingRDto>();
        for (TPickingR entity : entityList) {
            TPickingRDto dto = mappingToDto(entity);
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
    public TPickingR mappingToEntity(TPickingRDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TPickingR)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TPickingR entity = new TPickingR();
        if (needsMapping(dto, dto.getPickingHId(), "pickingHId")) {
            entity.setPickingHId(dto.getPickingHId());
        }
        if (needsMapping(dto, dto.getOplOutFlg(), "oplOutFlg")) {
            entity.setOplOutFlgAsListOutFlg(CDef.ListOutFlg.codeOf(dto.getOplOutFlg()));
        }
        if (needsMapping(dto, dto.getTplOutFlg(), "tplOutFlg")) {
            entity.setTplOutFlgAsListOutFlg(CDef.ListOutFlg.codeOf(dto.getTplOutFlg()));
        }
        if (needsMapping(dto, dto.getMltOutFlg(), "mltOutFlg")) {
            entity.setMltOutFlgAsListOutFlg(CDef.ListOutFlg.codeOf(dto.getMltOutFlg()));
        }
        if (needsMapping(dto, dto.getSplOutFlg(), "splOutFlg")) {
            entity.setSplOutFlgAsListOutFlg(CDef.ListOutFlg.codeOf(dto.getSplOutFlg()));
        }
        if (needsMapping(dto, dto.getPl1OutFlg(), "pl1OutFlg")) {
            entity.setPl1OutFlgAsListOutFlg(CDef.ListOutFlg.codeOf(dto.getPl1OutFlg()));
        }
        if (needsMapping(dto, dto.getPl1OutUserId(), "pl1OutUserId")) {
            entity.setPl1OutUserId(dto.getPl1OutUserId());
        }
        if (needsMapping(dto, dto.getPl1OutDt(), "pl1OutDt")) {
            entity.setPl1OutDt(dto.getPl1OutDt());
        }
        if (needsMapping(dto, dto.getPlOutFlg(), "plOutFlg")) {
            entity.setPlOutFlgAsListOutFlg(CDef.ListOutFlg.codeOf(dto.getPlOutFlg()));
        }
        if (needsMapping(dto, dto.getPlOutUserId(), "plOutUserId")) {
            entity.setPlOutUserId(dto.getPlOutUserId());
        }
        if (needsMapping(dto, dto.getPlOutDt(), "plOutDt")) {
            entity.setPlOutDt(dto.getPlOutDt());
        }
        if (needsMapping(dto, dto.getSlOutFlg(), "slOutFlg")) {
            entity.setSlOutFlgAsListOutFlg(CDef.ListOutFlg.codeOf(dto.getSlOutFlg()));
        }
        if (needsMapping(dto, dto.getPl2OutFlg(), "pl2OutFlg")) {
            entity.setPl2OutFlgAsListOutFlg(CDef.ListOutFlg.codeOf(dto.getPl2OutFlg()));
        }
        if (needsMapping(dto, dto.getPl2OutUserId(), "pl2OutUserId")) {
            entity.setPl2OutUserId(dto.getPl2OutUserId());
        }
        if (needsMapping(dto, dto.getPl2OutDt(), "pl2OutDt")) {
            entity.setPl2OutDt(dto.getPl2OutDt());
        }
        if (needsMapping(dto, dto.getCaseOutFlg(), "caseOutFlg")) {
            entity.setCaseOutFlgAsListOutFlg(CDef.ListOutFlg.codeOf(dto.getCaseOutFlg()));
        }
        if (needsMapping(dto, dto.getCaseOutUserId(), "caseOutUserId")) {
            entity.setCaseOutUserId(dto.getCaseOutUserId());
        }
        if (needsMapping(dto, dto.getCaseOutDt(), "caseOutDt")) {
            entity.setCaseOutDt(dto.getCaseOutDt());
        }
        if (needsMapping(dto, dto.getPackingOutFlg(), "packingOutFlg")) {
            entity.setPackingOutFlgAsListOutFlg(CDef.ListOutFlg.codeOf(dto.getPackingOutFlg()));
        }
        if (needsMapping(dto, dto.getPackingOutUserId(), "packingOutUserId")) {
            entity.setPackingOutUserId(dto.getPackingOutUserId());
        }
        if (needsMapping(dto, dto.getPackingOutDt(), "packingOutDt")) {
            entity.setPackingOutDt(dto.getPackingOutDt());
        }
        if (needsMapping(dto, dto.getSlipOutFlg(), "slipOutFlg")) {
            entity.setSlipOutFlgAsListOutFlg(CDef.ListOutFlg.codeOf(dto.getSlipOutFlg()));
        }
        if (needsMapping(dto, dto.getSlipOutUserId(), "slipOutUserId")) {
            entity.setSlipOutUserId(dto.getSlipOutUserId());
        }
        if (needsMapping(dto, dto.getSlipOutDt(), "slipOutDt")) {
            entity.setSlipOutDt(dto.getSlipOutDt());
        }
        if (needsMapping(dto, dto.getInvoiceCreateFlg(), "invoiceCreateFlg")) {
            entity.setInvoiceCreateFlgAsInvoiceCreateFlg(CDef.InvoiceCreateFlg.codeOf(dto.getInvoiceCreateFlg()));
        }
        if (needsMapping(dto, dto.getInvoiceCreateDt(), "invoiceCreateDt")) {
            entity.setInvoiceCreateDt(dto.getInvoiceCreateDt());
        }
        if (needsMapping(dto, dto.getInvoiceIssueNum(), "invoiceIssueNum")) {
            entity.setInvoiceIssueNum(dto.getInvoiceIssueNum());
        }
        if (needsMapping(dto, dto.getShippingRecordOutFlg(), "shippingRecordOutFlg")) {
            entity.setShippingRecordOutFlgAsListOutFlg(CDef.ListOutFlg.codeOf(dto.getShippingRecordOutFlg()));
        }
        if (needsMapping(dto, dto.getShippingRecordOutUserId(), "shippingRecordOutUserId")) {
            entity.setShippingRecordOutUserId(dto.getShippingRecordOutUserId());
        }
        if (needsMapping(dto, dto.getShippingRecordOutDt(), "shippingRecordOutDt")) {
            entity.setShippingRecordOutDt(dto.getShippingRecordOutDt());
        }
        if (needsMapping(dto, dto.getBolOutFlg(), "bolOutFlg")) {
            entity.setBolOutFlgAsBolOutFlg(CDef.BolOutFlg.codeOf(dto.getBolOutFlg()));
        }
        if (needsMapping(dto, dto.getBolOutUserId(), "bolOutUserId")) {
            entity.setBolOutUserId(dto.getBolOutUserId());
        }
        if (needsMapping(dto, dto.getBolOutDt(), "bolOutDt")) {
            entity.setBolOutDt(dto.getBolOutDt());
        }
        if (needsMapping(dto, dto.getTagOutFlg(), "tagOutFlg")) {
            entity.setTagOutFlg(dto.getTagOutFlg());
        }
        if (needsMapping(dto, dto.getTagOutUserId(), "tagOutUserId")) {
            entity.setTagOutUserId(dto.getTagOutUserId());
        }
        if (needsMapping(dto, dto.getTagOutDt(), "tagOutDt")) {
            entity.setTagOutDt(dto.getTagOutDt());
        }
        if (needsMapping(dto, dto.getDelivOutFlg(), "delivOutFlg")) {
            entity.setDelivOutFlg(dto.getDelivOutFlg());
        }
        if (needsMapping(dto, dto.getDelivOutUserId(), "delivOutUserId")) {
            entity.setDelivOutUserId(dto.getDelivOutUserId());
        }
        if (needsMapping(dto, dto.getDelivOutDt(), "delivOutDt")) {
            entity.setDelivOutDt(dto.getDelivOutDt());
        }
        if (needsMapping(dto, dto.getPllOutFlg(), "pllOutFlg")) {
            entity.setPllOutFlg(dto.getPllOutFlg());
        }
        if (needsMapping(dto, dto.getPllOutUserId(), "pllOutUserId")) {
            entity.setPllOutUserId(dto.getPllOutUserId());
        }
        if (needsMapping(dto, dto.getPllOutDt(), "pllOutDt")) {
            entity.setPllOutDt(dto.getPllOutDt());
        }
        if (needsMapping(dto, dto.getNizoroeOutFlg(), "nizoroeOutFlg")) {
            entity.setNizoroeOutFlg(dto.getNizoroeOutFlg());
        }
        if (needsMapping(dto, dto.getNizoroeOutUserId(), "nizoroeOutUserId")) {
            entity.setNizoroeOutUserId(dto.getNizoroeOutUserId());
        }
        if (needsMapping(dto, dto.getNizoroeOutDt(), "nizoroeOutDt")) {
            entity.setNizoroeOutDt(dto.getNizoroeOutDt());
        }
        if (needsMapping(dto, dto.getIndvSupplyOutFlg(), "indvSupplyOutFlg")) {
            entity.setIndvSupplyOutFlg(dto.getIndvSupplyOutFlg());
        }
        if (needsMapping(dto, dto.getIndvSupplyOutUserId(), "indvSupplyOutUserId")) {
            entity.setIndvSupplyOutUserId(dto.getIndvSupplyOutUserId());
        }
        if (needsMapping(dto, dto.getIndvSupplyOutDt(), "indvSupplyOutDt")) {
            entity.setIndvSupplyOutDt(dto.getIndvSupplyOutDt());
        }
        if (needsMapping(dto, dto.getIndvLabelOutFlg(), "indvLabelOutFlg")) {
            entity.setIndvLabelOutFlg(dto.getIndvLabelOutFlg());
        }
        if (needsMapping(dto, dto.getIndvLabelOutUserId(), "indvLabelOutUserId")) {
            entity.setIndvLabelOutUserId(dto.getIndvLabelOutUserId());
        }
        if (needsMapping(dto, dto.getIndvLabelOutDt(), "indvLabelOutDt")) {
            entity.setIndvLabelOutDt(dto.getIndvLabelOutDt());
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
        if (!_suppressTPickingH && dto.getTPickingH() != null) {
            TPickingHDto relationDto = dto.getTPickingH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TPickingH relationEntity = (TPickingH)cachedEntity;
                entity.setTPickingH(relationEntity);
                if (reverseReference) {
                    relationEntity.setTPickingRAsOne(entity);
                }
            } else {
                TPickingHDtoMapper mapper = new TPickingHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRAsOne();
                TPickingH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTPickingH(relationEntity);
                if (reverseReference) {
                    relationEntity.setTPickingRAsOne(entity);
                }
                if (instanceCache && entity.getTPickingH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTPickingH());
                }
            }
        };
        if (!_suppressBUserByCaseOutUserId && dto.getBUserByCaseOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByCaseOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByCaseOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByCaseOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByCaseOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByCaseOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByCaseOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByCaseOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByCaseOutUserId());
                }
            }
        };
        if (!_suppressBUserByBolOutUserId && dto.getBUserByBolOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByBolOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByBolOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByBolOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByBolOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByBolOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByBolOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByBolOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByBolOutUserId());
                }
            }
        };
        if (!_suppressBUserByPl1OutUserId && dto.getBUserByPl1OutUserId() != null) {
            BUserDto relationDto = dto.getBUserByPl1OutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByPl1OutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByPl1OutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByPl1OutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByPl1OutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByPl1OutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByPl1OutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByPl1OutUserId());
                }
            }
        };
        if (!_suppressBUserByTagOutUserId && dto.getBUserByTagOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByTagOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByTagOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByTagOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByTagOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByTagOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByTagOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByTagOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByTagOutUserId());
                }
            }
        };
        if (!_suppressBUserByShippingRecordOutUserId && dto.getBUserByShippingRecordOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByShippingRecordOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByShippingRecordOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByShippingRecordOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByShippingRecordOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByShippingRecordOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByShippingRecordOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByShippingRecordOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByShippingRecordOutUserId());
                }
            }
        };
        if (!_suppressBUserByDelivOutUserId && dto.getBUserByDelivOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByDelivOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByDelivOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByDelivOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByDelivOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByDelivOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByDelivOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByDelivOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByDelivOutUserId());
                }
            }
        };
        if (!_suppressBUserByIndvSupplyOutUserId && dto.getBUserByIndvSupplyOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByIndvSupplyOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByIndvSupplyOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByIndvSupplyOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByIndvSupplyOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByIndvSupplyOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByIndvSupplyOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByIndvSupplyOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByIndvSupplyOutUserId());
                }
            }
        };
        if (!_suppressBUserByPackingOutUserId && dto.getBUserByPackingOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByPackingOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByPackingOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByPackingOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByPackingOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByPackingOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByPackingOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByPackingOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByPackingOutUserId());
                }
            }
        };
        if (!_suppressBUserByPlOutUserId && dto.getBUserByPlOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByPlOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByPlOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByPlOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByPlOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByPlOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByPlOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByPlOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByPlOutUserId());
                }
            }
        };
        if (!_suppressBUserByIndvLabelOutUserId && dto.getBUserByIndvLabelOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByIndvLabelOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByIndvLabelOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByIndvLabelOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByIndvLabelOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByIndvLabelOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByIndvLabelOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByIndvLabelOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByIndvLabelOutUserId());
                }
            }
        };
        if (!_suppressBUserByPl2OutUserId && dto.getBUserByPl2OutUserId() != null) {
            BUserDto relationDto = dto.getBUserByPl2OutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByPl2OutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByPl2OutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByPl2OutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByPl2OutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByPl2OutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByPl2OutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByPl2OutUserId());
                }
            }
        };
        if (!_suppressBUserBySlipOutUserId && dto.getBUserBySlipOutUserId() != null) {
            BUserDto relationDto = dto.getBUserBySlipOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserBySlipOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRBySlipOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRBySlipOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserBySlipOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRBySlipOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserBySlipOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserBySlipOutUserId());
                }
            }
        };
        if (!_suppressBUserByNizoroeOutUserId && dto.getBUserByNizoroeOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByNizoroeOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByNizoroeOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByNizoroeOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByNizoroeOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByNizoroeOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByNizoroeOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByNizoroeOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByNizoroeOutUserId());
                }
            }
        };
        if (!_suppressBUserByPllOutUserId && dto.getBUserByPllOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByPllOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByPllOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByPllOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingRByPllOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByPllOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingRByPllOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByPllOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByPllOutUserId());
                }
            }
        };
        if (!_suppressBClassDtlByInvoiceCreateFlg && dto.getBClassDtlByInvoiceCreateFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByInvoiceCreateFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByInvoiceCreateFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByInvoiceCreateFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByInvoiceCreateFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByInvoiceCreateFlg());
                }
            }
        };
        if (!_suppressBClassDtlByOplOutFlg && dto.getBClassDtlByOplOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByOplOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByOplOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByOplOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByOplOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByOplOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByTplOutFlg && dto.getBClassDtlByTplOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByTplOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByTplOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByTplOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByTplOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByTplOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByCaseOutFlg && dto.getBClassDtlByCaseOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByCaseOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByCaseOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByCaseOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByCaseOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByCaseOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByMltOutFlg && dto.getBClassDtlByMltOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByMltOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByMltOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByMltOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByMltOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByMltOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlBySplOutFlg && dto.getBClassDtlBySplOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlBySplOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlBySplOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlBySplOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlBySplOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlBySplOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPlOutFlg && dto.getBClassDtlByPlOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPlOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPlOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPlOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPlOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPlOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlBySlOutFlg && dto.getBClassDtlBySlOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlBySlOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlBySlOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlBySlOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlBySlOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlBySlOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPl1OutFlg && dto.getBClassDtlByPl1OutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPl1OutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPl1OutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPl1OutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPl1OutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPl1OutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPl2OutFlg && dto.getBClassDtlByPl2OutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPl2OutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPl2OutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPl2OutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPl2OutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPl2OutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPackingOutFlg && dto.getBClassDtlByPackingOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPackingOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPackingOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPackingOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPackingOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPackingOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlBySlipOutFlg && dto.getBClassDtlBySlipOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlBySlipOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlBySlipOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlBySlipOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlBySlipOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlBySlipOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByShippingRecordOutFlg && dto.getBClassDtlByShippingRecordOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByShippingRecordOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByShippingRecordOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByShippingRecordOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByShippingRecordOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByShippingRecordOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByBolOutFlg && dto.getBClassDtlByBolOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByBolOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByBolOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByBolOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByBolOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByBolOutFlg());
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
    protected boolean needsMapping(TPickingRDto dto, Object value, String propName) {
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
    public List<TPickingR> mappingToEntityList(List<TPickingRDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TPickingR> entityList = new ArrayList<TPickingR>();
        for (TPickingRDto dto : dtoList) {
            TPickingR entity = mappingToEntity(dto);
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
    public void suppressTPickingH() {
        _suppressTPickingH = true;
    }
    public void suppressBUserByCaseOutUserId() {
        _suppressBUserByCaseOutUserId = true;
    }
    public void suppressBUserByBolOutUserId() {
        _suppressBUserByBolOutUserId = true;
    }
    public void suppressBUserByPl1OutUserId() {
        _suppressBUserByPl1OutUserId = true;
    }
    public void suppressBUserByTagOutUserId() {
        _suppressBUserByTagOutUserId = true;
    }
    public void suppressBUserByShippingRecordOutUserId() {
        _suppressBUserByShippingRecordOutUserId = true;
    }
    public void suppressBUserByDelivOutUserId() {
        _suppressBUserByDelivOutUserId = true;
    }
    public void suppressBUserByIndvSupplyOutUserId() {
        _suppressBUserByIndvSupplyOutUserId = true;
    }
    public void suppressBUserByPackingOutUserId() {
        _suppressBUserByPackingOutUserId = true;
    }
    public void suppressBUserByPlOutUserId() {
        _suppressBUserByPlOutUserId = true;
    }
    public void suppressBUserByIndvLabelOutUserId() {
        _suppressBUserByIndvLabelOutUserId = true;
    }
    public void suppressBUserByPl2OutUserId() {
        _suppressBUserByPl2OutUserId = true;
    }
    public void suppressBUserBySlipOutUserId() {
        _suppressBUserBySlipOutUserId = true;
    }
    public void suppressBUserByNizoroeOutUserId() {
        _suppressBUserByNizoroeOutUserId = true;
    }
    public void suppressBUserByPllOutUserId() {
        _suppressBUserByPllOutUserId = true;
    }
    public void suppressBClassDtlByInvoiceCreateFlg() {
        _suppressBClassDtlByInvoiceCreateFlg = true;
    }
    public void suppressBClassDtlByOplOutFlg() {
        _suppressBClassDtlByOplOutFlg = true;
    }
    public void suppressBClassDtlByTplOutFlg() {
        _suppressBClassDtlByTplOutFlg = true;
    }
    public void suppressBClassDtlByCaseOutFlg() {
        _suppressBClassDtlByCaseOutFlg = true;
    }
    public void suppressBClassDtlByMltOutFlg() {
        _suppressBClassDtlByMltOutFlg = true;
    }
    public void suppressBClassDtlBySplOutFlg() {
        _suppressBClassDtlBySplOutFlg = true;
    }
    public void suppressBClassDtlByPlOutFlg() {
        _suppressBClassDtlByPlOutFlg = true;
    }
    public void suppressBClassDtlBySlOutFlg() {
        _suppressBClassDtlBySlOutFlg = true;
    }
    public void suppressBClassDtlByPl1OutFlg() {
        _suppressBClassDtlByPl1OutFlg = true;
    }
    public void suppressBClassDtlByPl2OutFlg() {
        _suppressBClassDtlByPl2OutFlg = true;
    }
    public void suppressBClassDtlByPackingOutFlg() {
        _suppressBClassDtlByPackingOutFlg = true;
    }
    public void suppressBClassDtlBySlipOutFlg() {
        _suppressBClassDtlBySlipOutFlg = true;
    }
    public void suppressBClassDtlByShippingRecordOutFlg() {
        _suppressBClassDtlByShippingRecordOutFlg = true;
    }
    public void suppressBClassDtlByBolOutFlg() {
        _suppressBClassDtlByBolOutFlg = true;
    }
    protected void doSuppressAll() { // internal
        suppressTPickingH();
        suppressBUserByCaseOutUserId();
        suppressBUserByBolOutUserId();
        suppressBUserByPl1OutUserId();
        suppressBUserByTagOutUserId();
        suppressBUserByShippingRecordOutUserId();
        suppressBUserByDelivOutUserId();
        suppressBUserByIndvSupplyOutUserId();
        suppressBUserByPackingOutUserId();
        suppressBUserByPlOutUserId();
        suppressBUserByIndvLabelOutUserId();
        suppressBUserByPl2OutUserId();
        suppressBUserBySlipOutUserId();
        suppressBUserByNizoroeOutUserId();
        suppressBUserByPllOutUserId();
        suppressBClassDtlByInvoiceCreateFlg();
        suppressBClassDtlByOplOutFlg();
        suppressBClassDtlByTplOutFlg();
        suppressBClassDtlByCaseOutFlg();
        suppressBClassDtlByMltOutFlg();
        suppressBClassDtlBySplOutFlg();
        suppressBClassDtlByPlOutFlg();
        suppressBClassDtlBySlOutFlg();
        suppressBClassDtlByPl1OutFlg();
        suppressBClassDtlByPl2OutFlg();
        suppressBClassDtlByPackingOutFlg();
        suppressBClassDtlBySlipOutFlg();
        suppressBClassDtlByShippingRecordOutFlg();
        suppressBClassDtlByBolOutFlg();
    }
    protected void doSuppressClear() { // internal
        _suppressTPickingH = false;
        _suppressBUserByCaseOutUserId = false;
        _suppressBUserByBolOutUserId = false;
        _suppressBUserByPl1OutUserId = false;
        _suppressBUserByTagOutUserId = false;
        _suppressBUserByShippingRecordOutUserId = false;
        _suppressBUserByDelivOutUserId = false;
        _suppressBUserByIndvSupplyOutUserId = false;
        _suppressBUserByPackingOutUserId = false;
        _suppressBUserByPlOutUserId = false;
        _suppressBUserByIndvLabelOutUserId = false;
        _suppressBUserByPl2OutUserId = false;
        _suppressBUserBySlipOutUserId = false;
        _suppressBUserByNizoroeOutUserId = false;
        _suppressBUserByPllOutUserId = false;
        _suppressBClassDtlByInvoiceCreateFlg = false;
        _suppressBClassDtlByOplOutFlg = false;
        _suppressBClassDtlByTplOutFlg = false;
        _suppressBClassDtlByCaseOutFlg = false;
        _suppressBClassDtlByMltOutFlg = false;
        _suppressBClassDtlBySplOutFlg = false;
        _suppressBClassDtlByPlOutFlg = false;
        _suppressBClassDtlBySlOutFlg = false;
        _suppressBClassDtlByPl1OutFlg = false;
        _suppressBClassDtlByPl2OutFlg = false;
        _suppressBClassDtlByPackingOutFlg = false;
        _suppressBClassDtlBySlipOutFlg = false;
        _suppressBClassDtlByShippingRecordOutFlg = false;
        _suppressBClassDtlByBolOutFlg = false;
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
    public TPickingRDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TPickingRDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TPickingRDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TPickingRDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TPickingRDtoMapper reverseReference() {
        setReverseReference(true);
        return (TPickingRDtoMapper)this;
    }
}
