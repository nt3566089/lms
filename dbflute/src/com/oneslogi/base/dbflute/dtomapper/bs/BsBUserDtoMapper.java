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
 * The DTO mapper of b_user as TABLE. <br>
 * ユーザマスタ
 * <pre>
 * [primary-key]
 *     USER_ID
 *
 * [column]
 *     USER_ID, USER_CD, USER_NM, CULTURE_ID, ROLE_GRP_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     b_culture, b_role_grp, b_class_dtl(ByDelFlg), b_user_auth(AsOne), m_user_login(AsOne)
 *
 * [referrer-table]
 *     m_user_center, m_user_client, m_user_deposit, t_ec_order_r, t_inventory_b, t_inventory_r, t_move_inst_r, t_move_record_b, t_nizoroe_alarm_log, t_packing_r, t_picking_r, t_receive_label, t_receive_plan_r, t_store_no_r, t_store_record_r, w_sgl_row_ship_insp_b, t_packing_h, b_user_auth, m_user_login
 *
 * [foreign-property]
 *     bCulture, bRoleGrp, bClassDtlByDelFlg, bUserAuthAsOne, mUserLoginAsOne
 *
 * [referrer-property]
 *     mUserCenterList, mUserClientList, mUserDepositList, tEcOrderRList, tInventoryBByInventoryUpdUserIdList, tInventoryBByInventoryUserIdList, tInventoryRByInventoryRecordLocOutUserIdList, tInventoryRByStockDiffOutUserIdList, tInventoryRByTwlOutUserIdList, tInventoryRByInventoryRecordOutUserIdList, tInventoryRByInventoryDiffOutUserIdList, tMoveInstRList, tMoveRecordBList, tNizoroeAlarmLogList, tPackingRByStwOutUserIdList, tPackingRByInspectionOutUserIdList, tPackingRByTagOutUserIdList, tPickingRByCaseOutUserIdList, tPickingRByBolOutUserIdList, tPickingRByPl1OutUserIdList, tPickingRByTagOutUserIdList, tPickingRByShippingRecordOutUserIdList, tPickingRByDelivOutUserIdList, tPickingRByIndvSupplyOutUserIdList, tPickingRByPackingOutUserIdList, tPickingRByPlOutUserIdList, tPickingRByIndvLabelOutUserIdList, tPickingRByPl2OutUserIdList, tPickingRBySlipOutUserIdList, tPickingRByNizoroeOutUserIdList, tPickingRByPllOutUserIdList, tReceiveLabelList, tReceivePlanRList, tStoreNoRList, tStoreRecordRList, wSglRowShipInspBList, tPackingHByUpdUserList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBUserDtoMapper implements DtoMapper<BUser, BUserDto>, Serializable {

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
    protected boolean _suppressBCulture;
    protected boolean _suppressBRoleGrp;
    protected boolean _suppressBClassDtlByDelFlg;
    protected boolean _suppressBUserAuthAsOne;
    protected boolean _suppressMUserCenterList;
    protected boolean _suppressMUserClientList;
    protected boolean _suppressMUserDepositList;
    protected boolean _suppressMUserLoginAsOne;
    protected boolean _suppressTEcOrderRList;
    protected boolean _suppressTInventoryBByInventoryUpdUserIdList;
    protected boolean _suppressTInventoryBByInventoryUserIdList;
    protected boolean _suppressTInventoryRByInventoryRecordLocOutUserIdList;
    protected boolean _suppressTInventoryRByStockDiffOutUserIdList;
    protected boolean _suppressTInventoryRByTwlOutUserIdList;
    protected boolean _suppressTInventoryRByInventoryRecordOutUserIdList;
    protected boolean _suppressTInventoryRByInventoryDiffOutUserIdList;
    protected boolean _suppressTMoveInstRList;
    protected boolean _suppressTMoveRecordBList;
    protected boolean _suppressTNizoroeAlarmLogList;
    protected boolean _suppressTPackingRByStwOutUserIdList;
    protected boolean _suppressTPackingRByInspectionOutUserIdList;
    protected boolean _suppressTPackingRByTagOutUserIdList;
    protected boolean _suppressTPickingRByCaseOutUserIdList;
    protected boolean _suppressTPickingRByBolOutUserIdList;
    protected boolean _suppressTPickingRByPl1OutUserIdList;
    protected boolean _suppressTPickingRByTagOutUserIdList;
    protected boolean _suppressTPickingRByShippingRecordOutUserIdList;
    protected boolean _suppressTPickingRByDelivOutUserIdList;
    protected boolean _suppressTPickingRByIndvSupplyOutUserIdList;
    protected boolean _suppressTPickingRByPackingOutUserIdList;
    protected boolean _suppressTPickingRByPlOutUserIdList;
    protected boolean _suppressTPickingRByIndvLabelOutUserIdList;
    protected boolean _suppressTPickingRByPl2OutUserIdList;
    protected boolean _suppressTPickingRBySlipOutUserIdList;
    protected boolean _suppressTPickingRByNizoroeOutUserIdList;
    protected boolean _suppressTPickingRByPllOutUserIdList;
    protected boolean _suppressTReceiveLabelList;
    protected boolean _suppressTReceivePlanRList;
    protected boolean _suppressTStoreNoRList;
    protected boolean _suppressTStoreRecordRList;
    protected boolean _suppressWSglRowShipInspBList;
    protected boolean _suppressTPackingHByUpdUserList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBUserDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsBUserDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public BUserDto mappingToDto(BUser entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (BUserDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BUserDto dto = new BUserDto();
        dto.setUserId(entity.getUserId());
        dto.setUserCd(entity.getUserCd());
        dto.setUserNm(entity.getUserNm());
        dto.setCultureId(entity.getCultureId());
        dto.setRoleGrpId(entity.getRoleGrpId());
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
        if (!_suppressBCulture && entity.getBCulture() != null) {
            BCulture relationEntity = entity.getBCulture();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BCultureDto relationDto = (BCultureDto)cachedDto;
                dto.setBCulture(relationDto);
                if (reverseReference) {
                    relationDto.getBUserList().add(dto);
                }
            } else {
                BCultureDtoMapper mapper = new BCultureDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBUserList();
                BCultureDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBCulture(relationDto);
                if (reverseReference) {
                    relationDto.getBUserList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBCulture());
                }
            }
        };
        if (!_suppressBRoleGrp && entity.getBRoleGrp() != null) {
            BRoleGrp relationEntity = entity.getBRoleGrp();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BRoleGrpDto relationDto = (BRoleGrpDto)cachedDto;
                dto.setBRoleGrp(relationDto);
                if (reverseReference) {
                    relationDto.getBUserList().add(dto);
                }
            } else {
                BRoleGrpDtoMapper mapper = new BRoleGrpDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBUserList();
                BRoleGrpDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBRoleGrp(relationDto);
                if (reverseReference) {
                    relationDto.getBUserList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBRoleGrp());
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
        if (!_suppressBUserAuthAsOne && entity.getBUserAuthAsOne() != null) {
            BUserAuth relationEntity = entity.getBUserAuthAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserAuthDto relationDto = (BUserAuthDto)cachedDto;
                dto.setBUserAuthAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setBUser(dto);
                }
            } else {
                BUserAuthDtoMapper mapper = new BUserAuthDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBUser();
                BUserAuthDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserAuthAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setBUser(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserAuthAsOne());
                }
            }
        };
        if (!_suppressMUserCenterList && !entity.getMUserCenterList().isEmpty()) {
            MUserCenterDtoMapper mapper = new MUserCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<MUserCenterDto> relationDtoList = mapper.mappingToDtoList(entity.getMUserCenterList());
            dto.setMUserCenterList(relationDtoList);
            if (reverseReference) {
                for (MUserCenterDto relationDto : relationDtoList) {
                    relationDto.setBUser(dto);
                }
            }
        };
        if (!_suppressMUserClientList && !entity.getMUserClientList().isEmpty()) {
            MUserClientDtoMapper mapper = new MUserClientDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<MUserClientDto> relationDtoList = mapper.mappingToDtoList(entity.getMUserClientList());
            dto.setMUserClientList(relationDtoList);
            if (reverseReference) {
                for (MUserClientDto relationDto : relationDtoList) {
                    relationDto.setBUser(dto);
                }
            }
        };
        if (!_suppressMUserDepositList && !entity.getMUserDepositList().isEmpty()) {
            MUserDepositDtoMapper mapper = new MUserDepositDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<MUserDepositDto> relationDtoList = mapper.mappingToDtoList(entity.getMUserDepositList());
            dto.setMUserDepositList(relationDtoList);
            if (reverseReference) {
                for (MUserDepositDto relationDto : relationDtoList) {
                    relationDto.setBUser(dto);
                }
            }
        };
        if (!_suppressMUserLoginAsOne && entity.getMUserLoginAsOne() != null) {
            MUserLogin relationEntity = entity.getMUserLoginAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MUserLoginDto relationDto = (MUserLoginDto)cachedDto;
                dto.setMUserLoginAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setBUser(dto);
                }
            } else {
                MUserLoginDtoMapper mapper = new MUserLoginDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBUser();
                MUserLoginDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMUserLoginAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setBUser(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMUserLoginAsOne());
                }
            }
        };
        if (!_suppressTEcOrderRList && !entity.getTEcOrderRList().isEmpty()) {
            TEcOrderRDtoMapper mapper = new TEcOrderRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<TEcOrderRDto> relationDtoList = mapper.mappingToDtoList(entity.getTEcOrderRList());
            dto.setTEcOrderRList(relationDtoList);
            if (reverseReference) {
                for (TEcOrderRDto relationDto : relationDtoList) {
                    relationDto.setBUser(dto);
                }
            }
        };
        if (!_suppressTInventoryBByInventoryUpdUserIdList && !entity.getTInventoryBByInventoryUpdUserIdList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByInventoryUpdUserId();
            List<TInventoryBDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryBByInventoryUpdUserIdList());
            dto.setTInventoryBByInventoryUpdUserIdList(relationDtoList);
            if (reverseReference) {
                for (TInventoryBDto relationDto : relationDtoList) {
                    relationDto.setBUserByInventoryUpdUserId(dto);
                }
            }
        };
        if (!_suppressTInventoryBByInventoryUserIdList && !entity.getTInventoryBByInventoryUserIdList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByInventoryUserId();
            List<TInventoryBDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryBByInventoryUserIdList());
            dto.setTInventoryBByInventoryUserIdList(relationDtoList);
            if (reverseReference) {
                for (TInventoryBDto relationDto : relationDtoList) {
                    relationDto.setBUserByInventoryUserId(dto);
                }
            }
        };
        if (!_suppressTInventoryRByInventoryRecordLocOutUserIdList && !entity.getTInventoryRByInventoryRecordLocOutUserIdList().isEmpty()) {
            TInventoryRDtoMapper mapper = new TInventoryRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByInventoryRecordLocOutUserId();
            List<TInventoryRDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryRByInventoryRecordLocOutUserIdList());
            dto.setTInventoryRByInventoryRecordLocOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TInventoryRDto relationDto : relationDtoList) {
                    relationDto.setBUserByInventoryRecordLocOutUserId(dto);
                }
            }
        };
        if (!_suppressTInventoryRByStockDiffOutUserIdList && !entity.getTInventoryRByStockDiffOutUserIdList().isEmpty()) {
            TInventoryRDtoMapper mapper = new TInventoryRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByStockDiffOutUserId();
            List<TInventoryRDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryRByStockDiffOutUserIdList());
            dto.setTInventoryRByStockDiffOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TInventoryRDto relationDto : relationDtoList) {
                    relationDto.setBUserByStockDiffOutUserId(dto);
                }
            }
        };
        if (!_suppressTInventoryRByTwlOutUserIdList && !entity.getTInventoryRByTwlOutUserIdList().isEmpty()) {
            TInventoryRDtoMapper mapper = new TInventoryRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByTwlOutUserId();
            List<TInventoryRDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryRByTwlOutUserIdList());
            dto.setTInventoryRByTwlOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TInventoryRDto relationDto : relationDtoList) {
                    relationDto.setBUserByTwlOutUserId(dto);
                }
            }
        };
        if (!_suppressTInventoryRByInventoryRecordOutUserIdList && !entity.getTInventoryRByInventoryRecordOutUserIdList().isEmpty()) {
            TInventoryRDtoMapper mapper = new TInventoryRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByInventoryRecordOutUserId();
            List<TInventoryRDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryRByInventoryRecordOutUserIdList());
            dto.setTInventoryRByInventoryRecordOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TInventoryRDto relationDto : relationDtoList) {
                    relationDto.setBUserByInventoryRecordOutUserId(dto);
                }
            }
        };
        if (!_suppressTInventoryRByInventoryDiffOutUserIdList && !entity.getTInventoryRByInventoryDiffOutUserIdList().isEmpty()) {
            TInventoryRDtoMapper mapper = new TInventoryRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByInventoryDiffOutUserId();
            List<TInventoryRDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryRByInventoryDiffOutUserIdList());
            dto.setTInventoryRByInventoryDiffOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TInventoryRDto relationDto : relationDtoList) {
                    relationDto.setBUserByInventoryDiffOutUserId(dto);
                }
            }
        };
        if (!_suppressTMoveInstRList && !entity.getTMoveInstRList().isEmpty()) {
            TMoveInstRDtoMapper mapper = new TMoveInstRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<TMoveInstRDto> relationDtoList = mapper.mappingToDtoList(entity.getTMoveInstRList());
            dto.setTMoveInstRList(relationDtoList);
            if (reverseReference) {
                for (TMoveInstRDto relationDto : relationDtoList) {
                    relationDto.setBUser(dto);
                }
            }
        };
        if (!_suppressTMoveRecordBList && !entity.getTMoveRecordBList().isEmpty()) {
            TMoveRecordBDtoMapper mapper = new TMoveRecordBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<TMoveRecordBDto> relationDtoList = mapper.mappingToDtoList(entity.getTMoveRecordBList());
            dto.setTMoveRecordBList(relationDtoList);
            if (reverseReference) {
                for (TMoveRecordBDto relationDto : relationDtoList) {
                    relationDto.setBUser(dto);
                }
            }
        };
        if (!_suppressTNizoroeAlarmLogList && !entity.getTNizoroeAlarmLogList().isEmpty()) {
            TNizoroeAlarmLogDtoMapper mapper = new TNizoroeAlarmLogDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<TNizoroeAlarmLogDto> relationDtoList = mapper.mappingToDtoList(entity.getTNizoroeAlarmLogList());
            dto.setTNizoroeAlarmLogList(relationDtoList);
            if (reverseReference) {
                for (TNizoroeAlarmLogDto relationDto : relationDtoList) {
                    relationDto.setBUser(dto);
                }
            }
        };
        if (!_suppressTPackingRByStwOutUserIdList && !entity.getTPackingRByStwOutUserIdList().isEmpty()) {
            TPackingRDtoMapper mapper = new TPackingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByStwOutUserId();
            List<TPackingRDto> relationDtoList = mapper.mappingToDtoList(entity.getTPackingRByStwOutUserIdList());
            dto.setTPackingRByStwOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TPackingRDto relationDto : relationDtoList) {
                    relationDto.setBUserByStwOutUserId(dto);
                }
            }
        };
        if (!_suppressTPackingRByInspectionOutUserIdList && !entity.getTPackingRByInspectionOutUserIdList().isEmpty()) {
            TPackingRDtoMapper mapper = new TPackingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByInspectionOutUserId();
            List<TPackingRDto> relationDtoList = mapper.mappingToDtoList(entity.getTPackingRByInspectionOutUserIdList());
            dto.setTPackingRByInspectionOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TPackingRDto relationDto : relationDtoList) {
                    relationDto.setBUserByInspectionOutUserId(dto);
                }
            }
        };
        if (!_suppressTPackingRByTagOutUserIdList && !entity.getTPackingRByTagOutUserIdList().isEmpty()) {
            TPackingRDtoMapper mapper = new TPackingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByTagOutUserId();
            List<TPackingRDto> relationDtoList = mapper.mappingToDtoList(entity.getTPackingRByTagOutUserIdList());
            dto.setTPackingRByTagOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TPackingRDto relationDto : relationDtoList) {
                    relationDto.setBUserByTagOutUserId(dto);
                }
            }
        };
        if (!_suppressTPickingRByCaseOutUserIdList && !entity.getTPickingRByCaseOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByCaseOutUserId();
            List<TPickingRDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingRByCaseOutUserIdList());
            dto.setTPickingRByCaseOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TPickingRDto relationDto : relationDtoList) {
                    relationDto.setBUserByCaseOutUserId(dto);
                }
            }
        };
        if (!_suppressTPickingRByBolOutUserIdList && !entity.getTPickingRByBolOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByBolOutUserId();
            List<TPickingRDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingRByBolOutUserIdList());
            dto.setTPickingRByBolOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TPickingRDto relationDto : relationDtoList) {
                    relationDto.setBUserByBolOutUserId(dto);
                }
            }
        };
        if (!_suppressTPickingRByPl1OutUserIdList && !entity.getTPickingRByPl1OutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByPl1OutUserId();
            List<TPickingRDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingRByPl1OutUserIdList());
            dto.setTPickingRByPl1OutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TPickingRDto relationDto : relationDtoList) {
                    relationDto.setBUserByPl1OutUserId(dto);
                }
            }
        };
        if (!_suppressTPickingRByTagOutUserIdList && !entity.getTPickingRByTagOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByTagOutUserId();
            List<TPickingRDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingRByTagOutUserIdList());
            dto.setTPickingRByTagOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TPickingRDto relationDto : relationDtoList) {
                    relationDto.setBUserByTagOutUserId(dto);
                }
            }
        };
        if (!_suppressTPickingRByShippingRecordOutUserIdList && !entity.getTPickingRByShippingRecordOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByShippingRecordOutUserId();
            List<TPickingRDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingRByShippingRecordOutUserIdList());
            dto.setTPickingRByShippingRecordOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TPickingRDto relationDto : relationDtoList) {
                    relationDto.setBUserByShippingRecordOutUserId(dto);
                }
            }
        };
        if (!_suppressTPickingRByDelivOutUserIdList && !entity.getTPickingRByDelivOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByDelivOutUserId();
            List<TPickingRDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingRByDelivOutUserIdList());
            dto.setTPickingRByDelivOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TPickingRDto relationDto : relationDtoList) {
                    relationDto.setBUserByDelivOutUserId(dto);
                }
            }
        };
        if (!_suppressTPickingRByIndvSupplyOutUserIdList && !entity.getTPickingRByIndvSupplyOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByIndvSupplyOutUserId();
            List<TPickingRDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingRByIndvSupplyOutUserIdList());
            dto.setTPickingRByIndvSupplyOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TPickingRDto relationDto : relationDtoList) {
                    relationDto.setBUserByIndvSupplyOutUserId(dto);
                }
            }
        };
        if (!_suppressTPickingRByPackingOutUserIdList && !entity.getTPickingRByPackingOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByPackingOutUserId();
            List<TPickingRDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingRByPackingOutUserIdList());
            dto.setTPickingRByPackingOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TPickingRDto relationDto : relationDtoList) {
                    relationDto.setBUserByPackingOutUserId(dto);
                }
            }
        };
        if (!_suppressTPickingRByPlOutUserIdList && !entity.getTPickingRByPlOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByPlOutUserId();
            List<TPickingRDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingRByPlOutUserIdList());
            dto.setTPickingRByPlOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TPickingRDto relationDto : relationDtoList) {
                    relationDto.setBUserByPlOutUserId(dto);
                }
            }
        };
        if (!_suppressTPickingRByIndvLabelOutUserIdList && !entity.getTPickingRByIndvLabelOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByIndvLabelOutUserId();
            List<TPickingRDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingRByIndvLabelOutUserIdList());
            dto.setTPickingRByIndvLabelOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TPickingRDto relationDto : relationDtoList) {
                    relationDto.setBUserByIndvLabelOutUserId(dto);
                }
            }
        };
        if (!_suppressTPickingRByPl2OutUserIdList && !entity.getTPickingRByPl2OutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByPl2OutUserId();
            List<TPickingRDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingRByPl2OutUserIdList());
            dto.setTPickingRByPl2OutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TPickingRDto relationDto : relationDtoList) {
                    relationDto.setBUserByPl2OutUserId(dto);
                }
            }
        };
        if (!_suppressTPickingRBySlipOutUserIdList && !entity.getTPickingRBySlipOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserBySlipOutUserId();
            List<TPickingRDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingRBySlipOutUserIdList());
            dto.setTPickingRBySlipOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TPickingRDto relationDto : relationDtoList) {
                    relationDto.setBUserBySlipOutUserId(dto);
                }
            }
        };
        if (!_suppressTPickingRByNizoroeOutUserIdList && !entity.getTPickingRByNizoroeOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByNizoroeOutUserId();
            List<TPickingRDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingRByNizoroeOutUserIdList());
            dto.setTPickingRByNizoroeOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TPickingRDto relationDto : relationDtoList) {
                    relationDto.setBUserByNizoroeOutUserId(dto);
                }
            }
        };
        if (!_suppressTPickingRByPllOutUserIdList && !entity.getTPickingRByPllOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByPllOutUserId();
            List<TPickingRDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingRByPllOutUserIdList());
            dto.setTPickingRByPllOutUserIdList(relationDtoList);
            if (reverseReference) {
                for (TPickingRDto relationDto : relationDtoList) {
                    relationDto.setBUserByPllOutUserId(dto);
                }
            }
        };
        if (!_suppressTReceiveLabelList && !entity.getTReceiveLabelList().isEmpty()) {
            TReceiveLabelDtoMapper mapper = new TReceiveLabelDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<TReceiveLabelDto> relationDtoList = mapper.mappingToDtoList(entity.getTReceiveLabelList());
            dto.setTReceiveLabelList(relationDtoList);
            if (reverseReference) {
                for (TReceiveLabelDto relationDto : relationDtoList) {
                    relationDto.setBUser(dto);
                }
            }
        };
        if (!_suppressTReceivePlanRList && !entity.getTReceivePlanRList().isEmpty()) {
            TReceivePlanRDtoMapper mapper = new TReceivePlanRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<TReceivePlanRDto> relationDtoList = mapper.mappingToDtoList(entity.getTReceivePlanRList());
            dto.setTReceivePlanRList(relationDtoList);
            if (reverseReference) {
                for (TReceivePlanRDto relationDto : relationDtoList) {
                    relationDto.setBUser(dto);
                }
            }
        };
        if (!_suppressTStoreNoRList && !entity.getTStoreNoRList().isEmpty()) {
            TStoreNoRDtoMapper mapper = new TStoreNoRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<TStoreNoRDto> relationDtoList = mapper.mappingToDtoList(entity.getTStoreNoRList());
            dto.setTStoreNoRList(relationDtoList);
            if (reverseReference) {
                for (TStoreNoRDto relationDto : relationDtoList) {
                    relationDto.setBUser(dto);
                }
            }
        };
        if (!_suppressTStoreRecordRList && !entity.getTStoreRecordRList().isEmpty()) {
            TStoreRecordRDtoMapper mapper = new TStoreRecordRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<TStoreRecordRDto> relationDtoList = mapper.mappingToDtoList(entity.getTStoreRecordRList());
            dto.setTStoreRecordRList(relationDtoList);
            if (reverseReference) {
                for (TStoreRecordRDto relationDto : relationDtoList) {
                    relationDto.setBUser(dto);
                }
            }
        };
        if (!_suppressWSglRowShipInspBList && !entity.getWSglRowShipInspBList().isEmpty()) {
            WSglRowShipInspBDtoMapper mapper = new WSglRowShipInspBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<WSglRowShipInspBDto> relationDtoList = mapper.mappingToDtoList(entity.getWSglRowShipInspBList());
            dto.setWSglRowShipInspBList(relationDtoList);
            if (reverseReference) {
                for (WSglRowShipInspBDto relationDto : relationDtoList) {
                    relationDto.setBUser(dto);
                }
            }
        };
        if (!_suppressTPackingHByUpdUserList && !entity.getTPackingHByUpdUserList().isEmpty()) {
            TPackingHDtoMapper mapper = new TPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByUpdUser();
            List<TPackingHDto> relationDtoList = mapper.mappingToDtoList(entity.getTPackingHByUpdUserList());
            dto.setTPackingHByUpdUserList(relationDtoList);
            if (reverseReference) {
                for (TPackingHDto relationDto : relationDtoList) {
                    relationDto.setBUserByUpdUser(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<BUserDto> mappingToDtoList(List<BUser> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<BUserDto> dtoList = new ArrayList<BUserDto>();
        for (BUser entity : entityList) {
            BUserDto dto = mappingToDto(entity);
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
    public BUser mappingToEntity(BUserDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (BUser)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BUser entity = new BUser();
        if (needsMapping(dto, dto.getUserId(), "userId")) {
            entity.setUserId(dto.getUserId());
        }
        if (needsMapping(dto, dto.getUserCd(), "userCd")) {
            entity.setUserCd(dto.getUserCd());
        }
        if (needsMapping(dto, dto.getUserNm(), "userNm")) {
            entity.setUserNm(dto.getUserNm());
        }
        if (needsMapping(dto, dto.getCultureId(), "cultureId")) {
            entity.setCultureId(dto.getCultureId());
        }
        if (needsMapping(dto, dto.getRoleGrpId(), "roleGrpId")) {
            entity.setRoleGrpId(dto.getRoleGrpId());
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
        if (!_suppressBCulture && dto.getBCulture() != null) {
            BCultureDto relationDto = dto.getBCulture();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BCulture relationEntity = (BCulture)cachedEntity;
                entity.setBCulture(relationEntity);
                if (reverseReference) {
                    relationEntity.getBUserList().add(entity);
                }
            } else {
                BCultureDtoMapper mapper = new BCultureDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBUserList();
                BCulture relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBCulture(relationEntity);
                if (reverseReference) {
                    relationEntity.getBUserList().add(entity);
                }
                if (instanceCache && entity.getBCulture().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBCulture());
                }
            }
        };
        if (!_suppressBRoleGrp && dto.getBRoleGrp() != null) {
            BRoleGrpDto relationDto = dto.getBRoleGrp();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BRoleGrp relationEntity = (BRoleGrp)cachedEntity;
                entity.setBRoleGrp(relationEntity);
                if (reverseReference) {
                    relationEntity.getBUserList().add(entity);
                }
            } else {
                BRoleGrpDtoMapper mapper = new BRoleGrpDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBUserList();
                BRoleGrp relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBRoleGrp(relationEntity);
                if (reverseReference) {
                    relationEntity.getBUserList().add(entity);
                }
                if (instanceCache && entity.getBRoleGrp().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBRoleGrp());
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
        if (!_suppressBUserAuthAsOne && dto.getBUserAuthAsOne() != null) {
            BUserAuthDto relationDto = dto.getBUserAuthAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUserAuth relationEntity = (BUserAuth)cachedEntity;
                entity.setBUserAuthAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setBUser(entity);
                }
            } else {
                BUserAuthDtoMapper mapper = new BUserAuthDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBUser();
                BUserAuth relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserAuthAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setBUser(entity);
                }
                if (instanceCache && entity.getBUserAuthAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserAuthAsOne());
                }
            }
        };
        if (!_suppressMUserCenterList && !dto.getMUserCenterList().isEmpty()) {
            MUserCenterDtoMapper mapper = new MUserCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<MUserCenter> relationEntityList = mapper.mappingToEntityList(dto.getMUserCenterList());
            entity.setMUserCenterList(relationEntityList);
            if (reverseReference) {
                for (MUserCenter relationEntity : relationEntityList) {
                    relationEntity.setBUser(entity);
                }
            }
        };
        if (!_suppressMUserClientList && !dto.getMUserClientList().isEmpty()) {
            MUserClientDtoMapper mapper = new MUserClientDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<MUserClient> relationEntityList = mapper.mappingToEntityList(dto.getMUserClientList());
            entity.setMUserClientList(relationEntityList);
            if (reverseReference) {
                for (MUserClient relationEntity : relationEntityList) {
                    relationEntity.setBUser(entity);
                }
            }
        };
        if (!_suppressMUserDepositList && !dto.getMUserDepositList().isEmpty()) {
            MUserDepositDtoMapper mapper = new MUserDepositDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<MUserDeposit> relationEntityList = mapper.mappingToEntityList(dto.getMUserDepositList());
            entity.setMUserDepositList(relationEntityList);
            if (reverseReference) {
                for (MUserDeposit relationEntity : relationEntityList) {
                    relationEntity.setBUser(entity);
                }
            }
        };
        if (!_suppressMUserLoginAsOne && dto.getMUserLoginAsOne() != null) {
            MUserLoginDto relationDto = dto.getMUserLoginAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MUserLogin relationEntity = (MUserLogin)cachedEntity;
                entity.setMUserLoginAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setBUser(entity);
                }
            } else {
                MUserLoginDtoMapper mapper = new MUserLoginDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBUser();
                MUserLogin relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMUserLoginAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setBUser(entity);
                }
                if (instanceCache && entity.getMUserLoginAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMUserLoginAsOne());
                }
            }
        };
        if (!_suppressTEcOrderRList && !dto.getTEcOrderRList().isEmpty()) {
            TEcOrderRDtoMapper mapper = new TEcOrderRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<TEcOrderR> relationEntityList = mapper.mappingToEntityList(dto.getTEcOrderRList());
            entity.setTEcOrderRList(relationEntityList);
            if (reverseReference) {
                for (TEcOrderR relationEntity : relationEntityList) {
                    relationEntity.setBUser(entity);
                }
            }
        };
        if (!_suppressTInventoryBByInventoryUpdUserIdList && !dto.getTInventoryBByInventoryUpdUserIdList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByInventoryUpdUserId();
            List<TInventoryB> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryBByInventoryUpdUserIdList());
            entity.setTInventoryBByInventoryUpdUserIdList(relationEntityList);
            if (reverseReference) {
                for (TInventoryB relationEntity : relationEntityList) {
                    relationEntity.setBUserByInventoryUpdUserId(entity);
                }
            }
        };
        if (!_suppressTInventoryBByInventoryUserIdList && !dto.getTInventoryBByInventoryUserIdList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByInventoryUserId();
            List<TInventoryB> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryBByInventoryUserIdList());
            entity.setTInventoryBByInventoryUserIdList(relationEntityList);
            if (reverseReference) {
                for (TInventoryB relationEntity : relationEntityList) {
                    relationEntity.setBUserByInventoryUserId(entity);
                }
            }
        };
        if (!_suppressTInventoryRByInventoryRecordLocOutUserIdList && !dto.getTInventoryRByInventoryRecordLocOutUserIdList().isEmpty()) {
            TInventoryRDtoMapper mapper = new TInventoryRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByInventoryRecordLocOutUserId();
            List<TInventoryR> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryRByInventoryRecordLocOutUserIdList());
            entity.setTInventoryRByInventoryRecordLocOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TInventoryR relationEntity : relationEntityList) {
                    relationEntity.setBUserByInventoryRecordLocOutUserId(entity);
                }
            }
        };
        if (!_suppressTInventoryRByStockDiffOutUserIdList && !dto.getTInventoryRByStockDiffOutUserIdList().isEmpty()) {
            TInventoryRDtoMapper mapper = new TInventoryRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByStockDiffOutUserId();
            List<TInventoryR> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryRByStockDiffOutUserIdList());
            entity.setTInventoryRByStockDiffOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TInventoryR relationEntity : relationEntityList) {
                    relationEntity.setBUserByStockDiffOutUserId(entity);
                }
            }
        };
        if (!_suppressTInventoryRByTwlOutUserIdList && !dto.getTInventoryRByTwlOutUserIdList().isEmpty()) {
            TInventoryRDtoMapper mapper = new TInventoryRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByTwlOutUserId();
            List<TInventoryR> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryRByTwlOutUserIdList());
            entity.setTInventoryRByTwlOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TInventoryR relationEntity : relationEntityList) {
                    relationEntity.setBUserByTwlOutUserId(entity);
                }
            }
        };
        if (!_suppressTInventoryRByInventoryRecordOutUserIdList && !dto.getTInventoryRByInventoryRecordOutUserIdList().isEmpty()) {
            TInventoryRDtoMapper mapper = new TInventoryRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByInventoryRecordOutUserId();
            List<TInventoryR> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryRByInventoryRecordOutUserIdList());
            entity.setTInventoryRByInventoryRecordOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TInventoryR relationEntity : relationEntityList) {
                    relationEntity.setBUserByInventoryRecordOutUserId(entity);
                }
            }
        };
        if (!_suppressTInventoryRByInventoryDiffOutUserIdList && !dto.getTInventoryRByInventoryDiffOutUserIdList().isEmpty()) {
            TInventoryRDtoMapper mapper = new TInventoryRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByInventoryDiffOutUserId();
            List<TInventoryR> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryRByInventoryDiffOutUserIdList());
            entity.setTInventoryRByInventoryDiffOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TInventoryR relationEntity : relationEntityList) {
                    relationEntity.setBUserByInventoryDiffOutUserId(entity);
                }
            }
        };
        if (!_suppressTMoveInstRList && !dto.getTMoveInstRList().isEmpty()) {
            TMoveInstRDtoMapper mapper = new TMoveInstRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<TMoveInstR> relationEntityList = mapper.mappingToEntityList(dto.getTMoveInstRList());
            entity.setTMoveInstRList(relationEntityList);
            if (reverseReference) {
                for (TMoveInstR relationEntity : relationEntityList) {
                    relationEntity.setBUser(entity);
                }
            }
        };
        if (!_suppressTMoveRecordBList && !dto.getTMoveRecordBList().isEmpty()) {
            TMoveRecordBDtoMapper mapper = new TMoveRecordBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<TMoveRecordB> relationEntityList = mapper.mappingToEntityList(dto.getTMoveRecordBList());
            entity.setTMoveRecordBList(relationEntityList);
            if (reverseReference) {
                for (TMoveRecordB relationEntity : relationEntityList) {
                    relationEntity.setBUser(entity);
                }
            }
        };
        if (!_suppressTNizoroeAlarmLogList && !dto.getTNizoroeAlarmLogList().isEmpty()) {
            TNizoroeAlarmLogDtoMapper mapper = new TNizoroeAlarmLogDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<TNizoroeAlarmLog> relationEntityList = mapper.mappingToEntityList(dto.getTNizoroeAlarmLogList());
            entity.setTNizoroeAlarmLogList(relationEntityList);
            if (reverseReference) {
                for (TNizoroeAlarmLog relationEntity : relationEntityList) {
                    relationEntity.setBUser(entity);
                }
            }
        };
        if (!_suppressTPackingRByStwOutUserIdList && !dto.getTPackingRByStwOutUserIdList().isEmpty()) {
            TPackingRDtoMapper mapper = new TPackingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByStwOutUserId();
            List<TPackingR> relationEntityList = mapper.mappingToEntityList(dto.getTPackingRByStwOutUserIdList());
            entity.setTPackingRByStwOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TPackingR relationEntity : relationEntityList) {
                    relationEntity.setBUserByStwOutUserId(entity);
                }
            }
        };
        if (!_suppressTPackingRByInspectionOutUserIdList && !dto.getTPackingRByInspectionOutUserIdList().isEmpty()) {
            TPackingRDtoMapper mapper = new TPackingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByInspectionOutUserId();
            List<TPackingR> relationEntityList = mapper.mappingToEntityList(dto.getTPackingRByInspectionOutUserIdList());
            entity.setTPackingRByInspectionOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TPackingR relationEntity : relationEntityList) {
                    relationEntity.setBUserByInspectionOutUserId(entity);
                }
            }
        };
        if (!_suppressTPackingRByTagOutUserIdList && !dto.getTPackingRByTagOutUserIdList().isEmpty()) {
            TPackingRDtoMapper mapper = new TPackingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByTagOutUserId();
            List<TPackingR> relationEntityList = mapper.mappingToEntityList(dto.getTPackingRByTagOutUserIdList());
            entity.setTPackingRByTagOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TPackingR relationEntity : relationEntityList) {
                    relationEntity.setBUserByTagOutUserId(entity);
                }
            }
        };
        if (!_suppressTPickingRByCaseOutUserIdList && !dto.getTPickingRByCaseOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByCaseOutUserId();
            List<TPickingR> relationEntityList = mapper.mappingToEntityList(dto.getTPickingRByCaseOutUserIdList());
            entity.setTPickingRByCaseOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TPickingR relationEntity : relationEntityList) {
                    relationEntity.setBUserByCaseOutUserId(entity);
                }
            }
        };
        if (!_suppressTPickingRByBolOutUserIdList && !dto.getTPickingRByBolOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByBolOutUserId();
            List<TPickingR> relationEntityList = mapper.mappingToEntityList(dto.getTPickingRByBolOutUserIdList());
            entity.setTPickingRByBolOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TPickingR relationEntity : relationEntityList) {
                    relationEntity.setBUserByBolOutUserId(entity);
                }
            }
        };
        if (!_suppressTPickingRByPl1OutUserIdList && !dto.getTPickingRByPl1OutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByPl1OutUserId();
            List<TPickingR> relationEntityList = mapper.mappingToEntityList(dto.getTPickingRByPl1OutUserIdList());
            entity.setTPickingRByPl1OutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TPickingR relationEntity : relationEntityList) {
                    relationEntity.setBUserByPl1OutUserId(entity);
                }
            }
        };
        if (!_suppressTPickingRByTagOutUserIdList && !dto.getTPickingRByTagOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByTagOutUserId();
            List<TPickingR> relationEntityList = mapper.mappingToEntityList(dto.getTPickingRByTagOutUserIdList());
            entity.setTPickingRByTagOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TPickingR relationEntity : relationEntityList) {
                    relationEntity.setBUserByTagOutUserId(entity);
                }
            }
        };
        if (!_suppressTPickingRByShippingRecordOutUserIdList && !dto.getTPickingRByShippingRecordOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByShippingRecordOutUserId();
            List<TPickingR> relationEntityList = mapper.mappingToEntityList(dto.getTPickingRByShippingRecordOutUserIdList());
            entity.setTPickingRByShippingRecordOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TPickingR relationEntity : relationEntityList) {
                    relationEntity.setBUserByShippingRecordOutUserId(entity);
                }
            }
        };
        if (!_suppressTPickingRByDelivOutUserIdList && !dto.getTPickingRByDelivOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByDelivOutUserId();
            List<TPickingR> relationEntityList = mapper.mappingToEntityList(dto.getTPickingRByDelivOutUserIdList());
            entity.setTPickingRByDelivOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TPickingR relationEntity : relationEntityList) {
                    relationEntity.setBUserByDelivOutUserId(entity);
                }
            }
        };
        if (!_suppressTPickingRByIndvSupplyOutUserIdList && !dto.getTPickingRByIndvSupplyOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByIndvSupplyOutUserId();
            List<TPickingR> relationEntityList = mapper.mappingToEntityList(dto.getTPickingRByIndvSupplyOutUserIdList());
            entity.setTPickingRByIndvSupplyOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TPickingR relationEntity : relationEntityList) {
                    relationEntity.setBUserByIndvSupplyOutUserId(entity);
                }
            }
        };
        if (!_suppressTPickingRByPackingOutUserIdList && !dto.getTPickingRByPackingOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByPackingOutUserId();
            List<TPickingR> relationEntityList = mapper.mappingToEntityList(dto.getTPickingRByPackingOutUserIdList());
            entity.setTPickingRByPackingOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TPickingR relationEntity : relationEntityList) {
                    relationEntity.setBUserByPackingOutUserId(entity);
                }
            }
        };
        if (!_suppressTPickingRByPlOutUserIdList && !dto.getTPickingRByPlOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByPlOutUserId();
            List<TPickingR> relationEntityList = mapper.mappingToEntityList(dto.getTPickingRByPlOutUserIdList());
            entity.setTPickingRByPlOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TPickingR relationEntity : relationEntityList) {
                    relationEntity.setBUserByPlOutUserId(entity);
                }
            }
        };
        if (!_suppressTPickingRByIndvLabelOutUserIdList && !dto.getTPickingRByIndvLabelOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByIndvLabelOutUserId();
            List<TPickingR> relationEntityList = mapper.mappingToEntityList(dto.getTPickingRByIndvLabelOutUserIdList());
            entity.setTPickingRByIndvLabelOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TPickingR relationEntity : relationEntityList) {
                    relationEntity.setBUserByIndvLabelOutUserId(entity);
                }
            }
        };
        if (!_suppressTPickingRByPl2OutUserIdList && !dto.getTPickingRByPl2OutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByPl2OutUserId();
            List<TPickingR> relationEntityList = mapper.mappingToEntityList(dto.getTPickingRByPl2OutUserIdList());
            entity.setTPickingRByPl2OutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TPickingR relationEntity : relationEntityList) {
                    relationEntity.setBUserByPl2OutUserId(entity);
                }
            }
        };
        if (!_suppressTPickingRBySlipOutUserIdList && !dto.getTPickingRBySlipOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserBySlipOutUserId();
            List<TPickingR> relationEntityList = mapper.mappingToEntityList(dto.getTPickingRBySlipOutUserIdList());
            entity.setTPickingRBySlipOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TPickingR relationEntity : relationEntityList) {
                    relationEntity.setBUserBySlipOutUserId(entity);
                }
            }
        };
        if (!_suppressTPickingRByNizoroeOutUserIdList && !dto.getTPickingRByNizoroeOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByNizoroeOutUserId();
            List<TPickingR> relationEntityList = mapper.mappingToEntityList(dto.getTPickingRByNizoroeOutUserIdList());
            entity.setTPickingRByNizoroeOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TPickingR relationEntity : relationEntityList) {
                    relationEntity.setBUserByNizoroeOutUserId(entity);
                }
            }
        };
        if (!_suppressTPickingRByPllOutUserIdList && !dto.getTPickingRByPllOutUserIdList().isEmpty()) {
            TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByPllOutUserId();
            List<TPickingR> relationEntityList = mapper.mappingToEntityList(dto.getTPickingRByPllOutUserIdList());
            entity.setTPickingRByPllOutUserIdList(relationEntityList);
            if (reverseReference) {
                for (TPickingR relationEntity : relationEntityList) {
                    relationEntity.setBUserByPllOutUserId(entity);
                }
            }
        };
        if (!_suppressTReceiveLabelList && !dto.getTReceiveLabelList().isEmpty()) {
            TReceiveLabelDtoMapper mapper = new TReceiveLabelDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<TReceiveLabel> relationEntityList = mapper.mappingToEntityList(dto.getTReceiveLabelList());
            entity.setTReceiveLabelList(relationEntityList);
            if (reverseReference) {
                for (TReceiveLabel relationEntity : relationEntityList) {
                    relationEntity.setBUser(entity);
                }
            }
        };
        if (!_suppressTReceivePlanRList && !dto.getTReceivePlanRList().isEmpty()) {
            TReceivePlanRDtoMapper mapper = new TReceivePlanRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<TReceivePlanR> relationEntityList = mapper.mappingToEntityList(dto.getTReceivePlanRList());
            entity.setTReceivePlanRList(relationEntityList);
            if (reverseReference) {
                for (TReceivePlanR relationEntity : relationEntityList) {
                    relationEntity.setBUser(entity);
                }
            }
        };
        if (!_suppressTStoreNoRList && !dto.getTStoreNoRList().isEmpty()) {
            TStoreNoRDtoMapper mapper = new TStoreNoRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<TStoreNoR> relationEntityList = mapper.mappingToEntityList(dto.getTStoreNoRList());
            entity.setTStoreNoRList(relationEntityList);
            if (reverseReference) {
                for (TStoreNoR relationEntity : relationEntityList) {
                    relationEntity.setBUser(entity);
                }
            }
        };
        if (!_suppressTStoreRecordRList && !dto.getTStoreRecordRList().isEmpty()) {
            TStoreRecordRDtoMapper mapper = new TStoreRecordRDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<TStoreRecordR> relationEntityList = mapper.mappingToEntityList(dto.getTStoreRecordRList());
            entity.setTStoreRecordRList(relationEntityList);
            if (reverseReference) {
                for (TStoreRecordR relationEntity : relationEntityList) {
                    relationEntity.setBUser(entity);
                }
            }
        };
        if (!_suppressWSglRowShipInspBList && !dto.getWSglRowShipInspBList().isEmpty()) {
            WSglRowShipInspBDtoMapper mapper = new WSglRowShipInspBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUser();
            List<WSglRowShipInspB> relationEntityList = mapper.mappingToEntityList(dto.getWSglRowShipInspBList());
            entity.setWSglRowShipInspBList(relationEntityList);
            if (reverseReference) {
                for (WSglRowShipInspB relationEntity : relationEntityList) {
                    relationEntity.setBUser(entity);
                }
            }
        };
        if (!_suppressTPackingHByUpdUserList && !dto.getTPackingHByUpdUserList().isEmpty()) {
            TPackingHDtoMapper mapper = new TPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBUserByUpdUser();
            List<TPackingH> relationEntityList = mapper.mappingToEntityList(dto.getTPackingHByUpdUserList());
            entity.setTPackingHByUpdUserList(relationEntityList);
            if (reverseReference) {
                for (TPackingH relationEntity : relationEntityList) {
                    relationEntity.setBUserByUpdUser(entity);
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
    protected boolean needsMapping(BUserDto dto, Object value, String propName) {
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
    public List<BUser> mappingToEntityList(List<BUserDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<BUser> entityList = new ArrayList<BUser>();
        for (BUserDto dto : dtoList) {
            BUser entity = mappingToEntity(dto);
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
    public void suppressBCulture() {
        _suppressBCulture = true;
    }
    public void suppressBRoleGrp() {
        _suppressBRoleGrp = true;
    }
    public void suppressBClassDtlByDelFlg() {
        _suppressBClassDtlByDelFlg = true;
    }
    public void suppressBUserAuthAsOne() {
        _suppressBUserAuthAsOne = true;
    }
    public void suppressMUserCenterList() {
        _suppressMUserCenterList = true;
    }
    public void suppressMUserClientList() {
        _suppressMUserClientList = true;
    }
    public void suppressMUserDepositList() {
        _suppressMUserDepositList = true;
    }
    public void suppressMUserLoginAsOne() {
        _suppressMUserLoginAsOne = true;
    }
    public void suppressTEcOrderRList() {
        _suppressTEcOrderRList = true;
    }
    public void suppressTInventoryBByInventoryUpdUserIdList() {
        _suppressTInventoryBByInventoryUpdUserIdList = true;
    }
    public void suppressTInventoryBByInventoryUserIdList() {
        _suppressTInventoryBByInventoryUserIdList = true;
    }
    public void suppressTInventoryRByInventoryRecordLocOutUserIdList() {
        _suppressTInventoryRByInventoryRecordLocOutUserIdList = true;
    }
    public void suppressTInventoryRByStockDiffOutUserIdList() {
        _suppressTInventoryRByStockDiffOutUserIdList = true;
    }
    public void suppressTInventoryRByTwlOutUserIdList() {
        _suppressTInventoryRByTwlOutUserIdList = true;
    }
    public void suppressTInventoryRByInventoryRecordOutUserIdList() {
        _suppressTInventoryRByInventoryRecordOutUserIdList = true;
    }
    public void suppressTInventoryRByInventoryDiffOutUserIdList() {
        _suppressTInventoryRByInventoryDiffOutUserIdList = true;
    }
    public void suppressTMoveInstRList() {
        _suppressTMoveInstRList = true;
    }
    public void suppressTMoveRecordBList() {
        _suppressTMoveRecordBList = true;
    }
    public void suppressTNizoroeAlarmLogList() {
        _suppressTNizoroeAlarmLogList = true;
    }
    public void suppressTPackingRByStwOutUserIdList() {
        _suppressTPackingRByStwOutUserIdList = true;
    }
    public void suppressTPackingRByInspectionOutUserIdList() {
        _suppressTPackingRByInspectionOutUserIdList = true;
    }
    public void suppressTPackingRByTagOutUserIdList() {
        _suppressTPackingRByTagOutUserIdList = true;
    }
    public void suppressTPickingRByCaseOutUserIdList() {
        _suppressTPickingRByCaseOutUserIdList = true;
    }
    public void suppressTPickingRByBolOutUserIdList() {
        _suppressTPickingRByBolOutUserIdList = true;
    }
    public void suppressTPickingRByPl1OutUserIdList() {
        _suppressTPickingRByPl1OutUserIdList = true;
    }
    public void suppressTPickingRByTagOutUserIdList() {
        _suppressTPickingRByTagOutUserIdList = true;
    }
    public void suppressTPickingRByShippingRecordOutUserIdList() {
        _suppressTPickingRByShippingRecordOutUserIdList = true;
    }
    public void suppressTPickingRByDelivOutUserIdList() {
        _suppressTPickingRByDelivOutUserIdList = true;
    }
    public void suppressTPickingRByIndvSupplyOutUserIdList() {
        _suppressTPickingRByIndvSupplyOutUserIdList = true;
    }
    public void suppressTPickingRByPackingOutUserIdList() {
        _suppressTPickingRByPackingOutUserIdList = true;
    }
    public void suppressTPickingRByPlOutUserIdList() {
        _suppressTPickingRByPlOutUserIdList = true;
    }
    public void suppressTPickingRByIndvLabelOutUserIdList() {
        _suppressTPickingRByIndvLabelOutUserIdList = true;
    }
    public void suppressTPickingRByPl2OutUserIdList() {
        _suppressTPickingRByPl2OutUserIdList = true;
    }
    public void suppressTPickingRBySlipOutUserIdList() {
        _suppressTPickingRBySlipOutUserIdList = true;
    }
    public void suppressTPickingRByNizoroeOutUserIdList() {
        _suppressTPickingRByNizoroeOutUserIdList = true;
    }
    public void suppressTPickingRByPllOutUserIdList() {
        _suppressTPickingRByPllOutUserIdList = true;
    }
    public void suppressTReceiveLabelList() {
        _suppressTReceiveLabelList = true;
    }
    public void suppressTReceivePlanRList() {
        _suppressTReceivePlanRList = true;
    }
    public void suppressTStoreNoRList() {
        _suppressTStoreNoRList = true;
    }
    public void suppressTStoreRecordRList() {
        _suppressTStoreRecordRList = true;
    }
    public void suppressWSglRowShipInspBList() {
        _suppressWSglRowShipInspBList = true;
    }
    public void suppressTPackingHByUpdUserList() {
        _suppressTPackingHByUpdUserList = true;
    }
    protected void doSuppressAll() { // internal
        suppressBCulture();
        suppressBRoleGrp();
        suppressBClassDtlByDelFlg();
        suppressBUserAuthAsOne();
        suppressMUserCenterList();
        suppressMUserClientList();
        suppressMUserDepositList();
        suppressMUserLoginAsOne();
        suppressTEcOrderRList();
        suppressTInventoryBByInventoryUpdUserIdList();
        suppressTInventoryBByInventoryUserIdList();
        suppressTInventoryRByInventoryRecordLocOutUserIdList();
        suppressTInventoryRByStockDiffOutUserIdList();
        suppressTInventoryRByTwlOutUserIdList();
        suppressTInventoryRByInventoryRecordOutUserIdList();
        suppressTInventoryRByInventoryDiffOutUserIdList();
        suppressTMoveInstRList();
        suppressTMoveRecordBList();
        suppressTNizoroeAlarmLogList();
        suppressTPackingRByStwOutUserIdList();
        suppressTPackingRByInspectionOutUserIdList();
        suppressTPackingRByTagOutUserIdList();
        suppressTPickingRByCaseOutUserIdList();
        suppressTPickingRByBolOutUserIdList();
        suppressTPickingRByPl1OutUserIdList();
        suppressTPickingRByTagOutUserIdList();
        suppressTPickingRByShippingRecordOutUserIdList();
        suppressTPickingRByDelivOutUserIdList();
        suppressTPickingRByIndvSupplyOutUserIdList();
        suppressTPickingRByPackingOutUserIdList();
        suppressTPickingRByPlOutUserIdList();
        suppressTPickingRByIndvLabelOutUserIdList();
        suppressTPickingRByPl2OutUserIdList();
        suppressTPickingRBySlipOutUserIdList();
        suppressTPickingRByNizoroeOutUserIdList();
        suppressTPickingRByPllOutUserIdList();
        suppressTReceiveLabelList();
        suppressTReceivePlanRList();
        suppressTStoreNoRList();
        suppressTStoreRecordRList();
        suppressWSglRowShipInspBList();
        suppressTPackingHByUpdUserList();
    }
    protected void doSuppressClear() { // internal
        _suppressBCulture = false;
        _suppressBRoleGrp = false;
        _suppressBClassDtlByDelFlg = false;
        _suppressBUserAuthAsOne = false;
        _suppressMUserCenterList = false;
        _suppressMUserClientList = false;
        _suppressMUserDepositList = false;
        _suppressMUserLoginAsOne = false;
        _suppressTEcOrderRList = false;
        _suppressTInventoryBByInventoryUpdUserIdList = false;
        _suppressTInventoryBByInventoryUserIdList = false;
        _suppressTInventoryRByInventoryRecordLocOutUserIdList = false;
        _suppressTInventoryRByStockDiffOutUserIdList = false;
        _suppressTInventoryRByTwlOutUserIdList = false;
        _suppressTInventoryRByInventoryRecordOutUserIdList = false;
        _suppressTInventoryRByInventoryDiffOutUserIdList = false;
        _suppressTMoveInstRList = false;
        _suppressTMoveRecordBList = false;
        _suppressTNizoroeAlarmLogList = false;
        _suppressTPackingRByStwOutUserIdList = false;
        _suppressTPackingRByInspectionOutUserIdList = false;
        _suppressTPackingRByTagOutUserIdList = false;
        _suppressTPickingRByCaseOutUserIdList = false;
        _suppressTPickingRByBolOutUserIdList = false;
        _suppressTPickingRByPl1OutUserIdList = false;
        _suppressTPickingRByTagOutUserIdList = false;
        _suppressTPickingRByShippingRecordOutUserIdList = false;
        _suppressTPickingRByDelivOutUserIdList = false;
        _suppressTPickingRByIndvSupplyOutUserIdList = false;
        _suppressTPickingRByPackingOutUserIdList = false;
        _suppressTPickingRByPlOutUserIdList = false;
        _suppressTPickingRByIndvLabelOutUserIdList = false;
        _suppressTPickingRByPl2OutUserIdList = false;
        _suppressTPickingRBySlipOutUserIdList = false;
        _suppressTPickingRByNizoroeOutUserIdList = false;
        _suppressTPickingRByPllOutUserIdList = false;
        _suppressTReceiveLabelList = false;
        _suppressTReceivePlanRList = false;
        _suppressTStoreNoRList = false;
        _suppressTStoreRecordRList = false;
        _suppressWSglRowShipInspBList = false;
        _suppressTPackingHByUpdUserList = false;
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
    public BUserDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (BUserDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public BUserDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (BUserDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public BUserDtoMapper reverseReference() {
        setReverseReference(true);
        return (BUserDtoMapper)this;
    }
}
