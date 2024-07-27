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
 * The DTO mapper of t_inventory_r as TABLE. <br>
 * 棚卸帳票
 * <pre>
 * [primary-key]
 *     INVENTORY_B_ID
 *
 * [column]
 *     INVENTORY_B_ID, TWL_OUT_FLG, TWL_OUT_USER_ID, TWL_OUT_DT, INVENTORY_DIFF_OUT_FLG, INVENTORY_DIFF_OUT_USER_ID, INVENTORY_DIFF_OUT_DT, INVENTORY_RECORD_OUT_FLG, INVENTORY_RECORD_OUT_USER_ID, INVENTORY_RECORD_OUT_DT, INVENTORY_RECORD_LOC_OUT_FLG, INVENTORY_RECORD_LOC_OUT_USER_ID, INVENTORY_RECORD_LOC_OUT_DT, STOCK_DIFF_OUT_FLG, STOCK_DIFF_OUT_USER_ID, STOCK_DIFF_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     b_user, t_inventory_b, b_class_dtl(ByTwlOutFlg)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bUserByInventoryRecordLocOutUserId, bUserByStockDiffOutUserId, bUserByTwlOutUserId, bUserByInventoryRecordOutUserId, tInventoryB, bUserByInventoryDiffOutUserId, bClassDtlByTwlOutFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTInventoryRDtoMapper implements DtoMapper<TInventoryR, TInventoryRDto>, Serializable {

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
    protected boolean _suppressBUserByInventoryRecordLocOutUserId;
    protected boolean _suppressBUserByStockDiffOutUserId;
    protected boolean _suppressBUserByTwlOutUserId;
    protected boolean _suppressBUserByInventoryRecordOutUserId;
    protected boolean _suppressTInventoryB;
    protected boolean _suppressBUserByInventoryDiffOutUserId;
    protected boolean _suppressBClassDtlByTwlOutFlg;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTInventoryRDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTInventoryRDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TInventoryRDto mappingToDto(TInventoryR entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TInventoryRDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TInventoryRDto dto = new TInventoryRDto();
        dto.setInventoryBId(entity.getInventoryBId());
        dto.setTwlOutFlg(entity.getTwlOutFlg());
        dto.setTwlOutUserId(entity.getTwlOutUserId());
        dto.setTwlOutDt(entity.getTwlOutDt());
        dto.setInventoryDiffOutFlg(entity.getInventoryDiffOutFlg());
        dto.setInventoryDiffOutUserId(entity.getInventoryDiffOutUserId());
        dto.setInventoryDiffOutDt(entity.getInventoryDiffOutDt());
        dto.setInventoryRecordOutFlg(entity.getInventoryRecordOutFlg());
        dto.setInventoryRecordOutUserId(entity.getInventoryRecordOutUserId());
        dto.setInventoryRecordOutDt(entity.getInventoryRecordOutDt());
        dto.setInventoryRecordLocOutFlg(entity.getInventoryRecordLocOutFlg());
        dto.setInventoryRecordLocOutUserId(entity.getInventoryRecordLocOutUserId());
        dto.setInventoryRecordLocOutDt(entity.getInventoryRecordLocOutDt());
        dto.setStockDiffOutFlg(entity.getStockDiffOutFlg());
        dto.setStockDiffOutUserId(entity.getStockDiffOutUserId());
        dto.setStockDiffOutDt(entity.getStockDiffOutDt());
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
        if (!_suppressBUserByInventoryRecordLocOutUserId && entity.getBUserByInventoryRecordLocOutUserId() != null) {
            BUser relationEntity = entity.getBUserByInventoryRecordLocOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByInventoryRecordLocOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryRByInventoryRecordLocOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryRByInventoryRecordLocOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByInventoryRecordLocOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryRByInventoryRecordLocOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByInventoryRecordLocOutUserId());
                }
            }
        };
        if (!_suppressBUserByStockDiffOutUserId && entity.getBUserByStockDiffOutUserId() != null) {
            BUser relationEntity = entity.getBUserByStockDiffOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByStockDiffOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryRByStockDiffOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryRByStockDiffOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByStockDiffOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryRByStockDiffOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByStockDiffOutUserId());
                }
            }
        };
        if (!_suppressBUserByTwlOutUserId && entity.getBUserByTwlOutUserId() != null) {
            BUser relationEntity = entity.getBUserByTwlOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByTwlOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryRByTwlOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryRByTwlOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByTwlOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryRByTwlOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByTwlOutUserId());
                }
            }
        };
        if (!_suppressBUserByInventoryRecordOutUserId && entity.getBUserByInventoryRecordOutUserId() != null) {
            BUser relationEntity = entity.getBUserByInventoryRecordOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByInventoryRecordOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryRByInventoryRecordOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryRByInventoryRecordOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByInventoryRecordOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryRByInventoryRecordOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByInventoryRecordOutUserId());
                }
            }
        };
        if (!_suppressTInventoryB && entity.getTInventoryB() != null) {
            TInventoryB relationEntity = entity.getTInventoryB();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TInventoryBDto relationDto = (TInventoryBDto)cachedDto;
                dto.setTInventoryB(relationDto);
                if (reverseReference) {
                    relationDto.setTInventoryRAsOne(dto);
                }
            } else {
                TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryRAsOne();
                TInventoryBDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTInventoryB(relationDto);
                if (reverseReference) {
                    relationDto.setTInventoryRAsOne(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTInventoryB());
                }
            }
        };
        if (!_suppressBUserByInventoryDiffOutUserId && entity.getBUserByInventoryDiffOutUserId() != null) {
            BUser relationEntity = entity.getBUserByInventoryDiffOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByInventoryDiffOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryRByInventoryDiffOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryRByInventoryDiffOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByInventoryDiffOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryRByInventoryDiffOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByInventoryDiffOutUserId());
                }
            }
        };
        if (!_suppressBClassDtlByTwlOutFlg && entity.getBClassDtlByTwlOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByTwlOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByTwlOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByTwlOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByTwlOutFlg());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TInventoryRDto> mappingToDtoList(List<TInventoryR> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TInventoryRDto> dtoList = new ArrayList<TInventoryRDto>();
        for (TInventoryR entity : entityList) {
            TInventoryRDto dto = mappingToDto(entity);
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
    public TInventoryR mappingToEntity(TInventoryRDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TInventoryR)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TInventoryR entity = new TInventoryR();
        if (needsMapping(dto, dto.getInventoryBId(), "inventoryBId")) {
            entity.setInventoryBId(dto.getInventoryBId());
        }
        if (needsMapping(dto, dto.getTwlOutFlg(), "twlOutFlg")) {
            entity.setTwlOutFlgAsListOutFlg(CDef.ListOutFlg.codeOf(dto.getTwlOutFlg()));
        }
        if (needsMapping(dto, dto.getTwlOutUserId(), "twlOutUserId")) {
            entity.setTwlOutUserId(dto.getTwlOutUserId());
        }
        if (needsMapping(dto, dto.getTwlOutDt(), "twlOutDt")) {
            entity.setTwlOutDt(dto.getTwlOutDt());
        }
        if (needsMapping(dto, dto.getInventoryDiffOutFlg(), "inventoryDiffOutFlg")) {
            entity.setInventoryDiffOutFlg(dto.getInventoryDiffOutFlg());
        }
        if (needsMapping(dto, dto.getInventoryDiffOutUserId(), "inventoryDiffOutUserId")) {
            entity.setInventoryDiffOutUserId(dto.getInventoryDiffOutUserId());
        }
        if (needsMapping(dto, dto.getInventoryDiffOutDt(), "inventoryDiffOutDt")) {
            entity.setInventoryDiffOutDt(dto.getInventoryDiffOutDt());
        }
        if (needsMapping(dto, dto.getInventoryRecordOutFlg(), "inventoryRecordOutFlg")) {
            entity.setInventoryRecordOutFlg(dto.getInventoryRecordOutFlg());
        }
        if (needsMapping(dto, dto.getInventoryRecordOutUserId(), "inventoryRecordOutUserId")) {
            entity.setInventoryRecordOutUserId(dto.getInventoryRecordOutUserId());
        }
        if (needsMapping(dto, dto.getInventoryRecordOutDt(), "inventoryRecordOutDt")) {
            entity.setInventoryRecordOutDt(dto.getInventoryRecordOutDt());
        }
        if (needsMapping(dto, dto.getInventoryRecordLocOutFlg(), "inventoryRecordLocOutFlg")) {
            entity.setInventoryRecordLocOutFlg(dto.getInventoryRecordLocOutFlg());
        }
        if (needsMapping(dto, dto.getInventoryRecordLocOutUserId(), "inventoryRecordLocOutUserId")) {
            entity.setInventoryRecordLocOutUserId(dto.getInventoryRecordLocOutUserId());
        }
        if (needsMapping(dto, dto.getInventoryRecordLocOutDt(), "inventoryRecordLocOutDt")) {
            entity.setInventoryRecordLocOutDt(dto.getInventoryRecordLocOutDt());
        }
        if (needsMapping(dto, dto.getStockDiffOutFlg(), "stockDiffOutFlg")) {
            entity.setStockDiffOutFlg(dto.getStockDiffOutFlg());
        }
        if (needsMapping(dto, dto.getStockDiffOutUserId(), "stockDiffOutUserId")) {
            entity.setStockDiffOutUserId(dto.getStockDiffOutUserId());
        }
        if (needsMapping(dto, dto.getStockDiffOutDt(), "stockDiffOutDt")) {
            entity.setStockDiffOutDt(dto.getStockDiffOutDt());
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
        if (!_suppressBUserByInventoryRecordLocOutUserId && dto.getBUserByInventoryRecordLocOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByInventoryRecordLocOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByInventoryRecordLocOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryRByInventoryRecordLocOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryRByInventoryRecordLocOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByInventoryRecordLocOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryRByInventoryRecordLocOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByInventoryRecordLocOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByInventoryRecordLocOutUserId());
                }
            }
        };
        if (!_suppressBUserByStockDiffOutUserId && dto.getBUserByStockDiffOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByStockDiffOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByStockDiffOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryRByStockDiffOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryRByStockDiffOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByStockDiffOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryRByStockDiffOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByStockDiffOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByStockDiffOutUserId());
                }
            }
        };
        if (!_suppressBUserByTwlOutUserId && dto.getBUserByTwlOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByTwlOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByTwlOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryRByTwlOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryRByTwlOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByTwlOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryRByTwlOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByTwlOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByTwlOutUserId());
                }
            }
        };
        if (!_suppressBUserByInventoryRecordOutUserId && dto.getBUserByInventoryRecordOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByInventoryRecordOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByInventoryRecordOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryRByInventoryRecordOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryRByInventoryRecordOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByInventoryRecordOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryRByInventoryRecordOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByInventoryRecordOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByInventoryRecordOutUserId());
                }
            }
        };
        if (!_suppressTInventoryB && dto.getTInventoryB() != null) {
            TInventoryBDto relationDto = dto.getTInventoryB();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TInventoryB relationEntity = (TInventoryB)cachedEntity;
                entity.setTInventoryB(relationEntity);
                if (reverseReference) {
                    relationEntity.setTInventoryRAsOne(entity);
                }
            } else {
                TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryRAsOne();
                TInventoryB relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTInventoryB(relationEntity);
                if (reverseReference) {
                    relationEntity.setTInventoryRAsOne(entity);
                }
                if (instanceCache && entity.getTInventoryB().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTInventoryB());
                }
            }
        };
        if (!_suppressBUserByInventoryDiffOutUserId && dto.getBUserByInventoryDiffOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByInventoryDiffOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByInventoryDiffOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryRByInventoryDiffOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryRByInventoryDiffOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByInventoryDiffOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryRByInventoryDiffOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByInventoryDiffOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByInventoryDiffOutUserId());
                }
            }
        };
        if (!_suppressBClassDtlByTwlOutFlg && dto.getBClassDtlByTwlOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByTwlOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByTwlOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByTwlOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByTwlOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByTwlOutFlg());
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
    protected boolean needsMapping(TInventoryRDto dto, Object value, String propName) {
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
    public List<TInventoryR> mappingToEntityList(List<TInventoryRDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TInventoryR> entityList = new ArrayList<TInventoryR>();
        for (TInventoryRDto dto : dtoList) {
            TInventoryR entity = mappingToEntity(dto);
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
    public void suppressBUserByInventoryRecordLocOutUserId() {
        _suppressBUserByInventoryRecordLocOutUserId = true;
    }
    public void suppressBUserByStockDiffOutUserId() {
        _suppressBUserByStockDiffOutUserId = true;
    }
    public void suppressBUserByTwlOutUserId() {
        _suppressBUserByTwlOutUserId = true;
    }
    public void suppressBUserByInventoryRecordOutUserId() {
        _suppressBUserByInventoryRecordOutUserId = true;
    }
    public void suppressTInventoryB() {
        _suppressTInventoryB = true;
    }
    public void suppressBUserByInventoryDiffOutUserId() {
        _suppressBUserByInventoryDiffOutUserId = true;
    }
    public void suppressBClassDtlByTwlOutFlg() {
        _suppressBClassDtlByTwlOutFlg = true;
    }
    protected void doSuppressAll() { // internal
        suppressBUserByInventoryRecordLocOutUserId();
        suppressBUserByStockDiffOutUserId();
        suppressBUserByTwlOutUserId();
        suppressBUserByInventoryRecordOutUserId();
        suppressTInventoryB();
        suppressBUserByInventoryDiffOutUserId();
        suppressBClassDtlByTwlOutFlg();
    }
    protected void doSuppressClear() { // internal
        _suppressBUserByInventoryRecordLocOutUserId = false;
        _suppressBUserByStockDiffOutUserId = false;
        _suppressBUserByTwlOutUserId = false;
        _suppressBUserByInventoryRecordOutUserId = false;
        _suppressTInventoryB = false;
        _suppressBUserByInventoryDiffOutUserId = false;
        _suppressBClassDtlByTwlOutFlg = false;
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
    public TInventoryRDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TInventoryRDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TInventoryRDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TInventoryRDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TInventoryRDtoMapper reverseReference() {
        setReverseReference(true);
        return (TInventoryRDtoMapper)this;
    }
}
