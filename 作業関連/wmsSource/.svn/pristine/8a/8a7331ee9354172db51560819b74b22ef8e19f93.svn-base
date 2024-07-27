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
 * The DTO mapper of t_stock as TABLE. <br>
 * 在庫
 * <pre>
 * [primary-key]
 *     STOCK_ID
 *
 * [column]
 *     STOCK_ID, CLIENT_ID, WAREHOUSE_ID, PRODUCT_ID, STOCK_TYPE_ID, LOCATION_ID, DEPOSIT_ID, LOT_ID, SHAPE_ID, STORE_NO_ID, UNIT_NUM, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, TRANSIT_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_location, m_stock_type, m_shape, t_lot, m_warehouse, t_store_no, m_product, m_customer, m_client, t_stock_report(AsOne)
 *
 * [referrer-table]
 *     t_inventory_b, t_picking_b, t_picking_record_stock, t_receive_label, t_scm_label, t_stock_inout, t_stock_report
 *
 * [foreign-property]
 *     mLocation, mStockType, mShape, tLot, mWarehouse, tStoreNo, mProduct, mCustomer, mClient, tStockReportAsOne
 *
 * [referrer-property]
 *     tInventoryBList, tPickingBList, tPickingRecordStockList, tReceiveLabelList, tScmLabelList, tStockInoutList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTStockDtoMapper implements DtoMapper<TStock, TStockDto>, Serializable {

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
    protected boolean _suppressMLocation;
    protected boolean _suppressMStockType;
    protected boolean _suppressMShape;
    protected boolean _suppressTLot;
    protected boolean _suppressMWarehouse;
    protected boolean _suppressTStoreNo;
    protected boolean _suppressMProduct;
    protected boolean _suppressMCustomer;
    protected boolean _suppressMClient;
    protected boolean _suppressTInventoryBList;
    protected boolean _suppressTPickingBList;
    protected boolean _suppressTPickingRecordStockList;
    protected boolean _suppressTReceiveLabelList;
    protected boolean _suppressTScmLabelList;
    protected boolean _suppressTStockInoutList;
    protected boolean _suppressTStockReportAsOne;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStockDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTStockDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TStockDto mappingToDto(TStock entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TStockDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TStockDto dto = new TStockDto();
        dto.setStockId(entity.getStockId());
        dto.setClientId(entity.getClientId());
        dto.setWarehouseId(entity.getWarehouseId());
        dto.setProductId(entity.getProductId());
        dto.setStockTypeId(entity.getStockTypeId());
        dto.setLocationId(entity.getLocationId());
        dto.setDepositId(entity.getDepositId());
        dto.setLotId(entity.getLotId());
        dto.setShapeId(entity.getShapeId());
        dto.setStoreNoId(entity.getStoreNoId());
        dto.setUnitNum(entity.getUnitNum());
        dto.setChargeNum(entity.getChargeNum());
        dto.setAllocNum(entity.getAllocNum());
        dto.setMoveNum(entity.getMoveNum());
        dto.setTransitNum(entity.getTransitNum());
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
        if (!_suppressMLocation && entity.getMLocation() != null) {
            MLocation relationEntity = entity.getMLocation();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MLocationDto relationDto = (MLocationDto)cachedDto;
                dto.setMLocation(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
            } else {
                MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MLocationDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMLocation(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMLocation());
                }
            }
        };
        if (!_suppressMStockType && entity.getMStockType() != null) {
            MStockType relationEntity = entity.getMStockType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MStockTypeDto relationDto = (MStockTypeDto)cachedDto;
                dto.setMStockType(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
            } else {
                MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MStockTypeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMStockType(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMStockType());
                }
            }
        };
        if (!_suppressMShape && entity.getMShape() != null) {
            MShape relationEntity = entity.getMShape();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MShapeDto relationDto = (MShapeDto)cachedDto;
                dto.setMShape(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
            } else {
                MShapeDtoMapper mapper = new MShapeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MShapeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMShape(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMShape());
                }
            }
        };
        if (!_suppressTLot && entity.getTLot() != null) {
            TLot relationEntity = entity.getTLot();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TLotDto relationDto = (TLotDto)cachedDto;
                dto.setTLot(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
            } else {
                TLotDtoMapper mapper = new TLotDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                TLotDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTLot(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTLot());
                }
            }
        };
        if (!_suppressMWarehouse && entity.getMWarehouse() != null) {
            MWarehouse relationEntity = entity.getMWarehouse();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MWarehouseDto relationDto = (MWarehouseDto)cachedDto;
                dto.setMWarehouse(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
            } else {
                MWarehouseDtoMapper mapper = new MWarehouseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MWarehouseDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMWarehouse(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMWarehouse());
                }
            }
        };
        if (!_suppressTStoreNo && entity.getTStoreNo() != null) {
            TStoreNo relationEntity = entity.getTStoreNo();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TStoreNoDto relationDto = (TStoreNoDto)cachedDto;
                dto.setTStoreNo(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
            } else {
                TStoreNoDtoMapper mapper = new TStoreNoDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                TStoreNoDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTStoreNo(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTStoreNo());
                }
            }
        };
        if (!_suppressMProduct && entity.getMProduct() != null) {
            MProduct relationEntity = entity.getMProduct();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MProductDto relationDto = (MProductDto)cachedDto;
                dto.setMProduct(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MProductDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProduct(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProduct());
                }
            }
        };
        if (!_suppressMCustomer && entity.getMCustomer() != null) {
            MCustomer relationEntity = entity.getMCustomer();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCustomerDto relationDto = (MCustomerDto)cachedDto;
                dto.setMCustomer(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MCustomerDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCustomer(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCustomer());
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
                    relationDto.getTStockList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
                }
            }
        };
        if (!_suppressTInventoryBList && !entity.getTInventoryBList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TInventoryBDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryBList());
            dto.setTInventoryBList(relationDtoList);
            if (reverseReference) {
                for (TInventoryBDto relationDto : relationDtoList) {
                    relationDto.setTStock(dto);
                }
            }
        };
        if (!_suppressTPickingBList && !entity.getTPickingBList().isEmpty()) {
            TPickingBDtoMapper mapper = new TPickingBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TPickingBDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingBList());
            dto.setTPickingBList(relationDtoList);
            if (reverseReference) {
                for (TPickingBDto relationDto : relationDtoList) {
                    relationDto.setTStock(dto);
                }
            }
        };
        if (!_suppressTPickingRecordStockList && !entity.getTPickingRecordStockList().isEmpty()) {
            TPickingRecordStockDtoMapper mapper = new TPickingRecordStockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TPickingRecordStockDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingRecordStockList());
            dto.setTPickingRecordStockList(relationDtoList);
            if (reverseReference) {
                for (TPickingRecordStockDto relationDto : relationDtoList) {
                    relationDto.setTStock(dto);
                }
            }
        };
        if (!_suppressTReceiveLabelList && !entity.getTReceiveLabelList().isEmpty()) {
            TReceiveLabelDtoMapper mapper = new TReceiveLabelDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TReceiveLabelDto> relationDtoList = mapper.mappingToDtoList(entity.getTReceiveLabelList());
            dto.setTReceiveLabelList(relationDtoList);
            if (reverseReference) {
                for (TReceiveLabelDto relationDto : relationDtoList) {
                    relationDto.setTStock(dto);
                }
            }
        };
        if (!_suppressTScmLabelList && !entity.getTScmLabelList().isEmpty()) {
            TScmLabelDtoMapper mapper = new TScmLabelDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TScmLabelDto> relationDtoList = mapper.mappingToDtoList(entity.getTScmLabelList());
            dto.setTScmLabelList(relationDtoList);
            if (reverseReference) {
                for (TScmLabelDto relationDto : relationDtoList) {
                    relationDto.setTStock(dto);
                }
            }
        };
        if (!_suppressTStockInoutList && !entity.getTStockInoutList().isEmpty()) {
            TStockInoutDtoMapper mapper = new TStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TStockInoutDto> relationDtoList = mapper.mappingToDtoList(entity.getTStockInoutList());
            dto.setTStockInoutList(relationDtoList);
            if (reverseReference) {
                for (TStockInoutDto relationDto : relationDtoList) {
                    relationDto.setTStock(dto);
                }
            }
        };
        if (!_suppressTStockReportAsOne && entity.getTStockReportAsOne() != null) {
            TStockReport relationEntity = entity.getTStockReportAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TStockReportDto relationDto = (TStockReportDto)cachedDto;
                dto.setTStockReportAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTStock(dto);
                }
            } else {
                TStockReportDtoMapper mapper = new TStockReportDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStock();
                TStockReportDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTStockReportAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTStock(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTStockReportAsOne());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TStockDto> mappingToDtoList(List<TStock> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TStockDto> dtoList = new ArrayList<TStockDto>();
        for (TStock entity : entityList) {
            TStockDto dto = mappingToDto(entity);
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
    public TStock mappingToEntity(TStockDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TStock)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TStock entity = new TStock();
        if (needsMapping(dto, dto.getStockId(), "stockId")) {
            entity.setStockId(dto.getStockId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getWarehouseId(), "warehouseId")) {
            entity.setWarehouseId(dto.getWarehouseId());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getStockTypeId(), "stockTypeId")) {
            entity.setStockTypeId(dto.getStockTypeId());
        }
        if (needsMapping(dto, dto.getLocationId(), "locationId")) {
            entity.setLocationId(dto.getLocationId());
        }
        if (needsMapping(dto, dto.getDepositId(), "depositId")) {
            entity.setDepositId(dto.getDepositId());
        }
        if (needsMapping(dto, dto.getLotId(), "lotId")) {
            entity.setLotId(dto.getLotId());
        }
        if (needsMapping(dto, dto.getShapeId(), "shapeId")) {
            entity.setShapeId(dto.getShapeId());
        }
        if (needsMapping(dto, dto.getStoreNoId(), "storeNoId")) {
            entity.setStoreNoId(dto.getStoreNoId());
        }
        if (needsMapping(dto, dto.getUnitNum(), "unitNum")) {
            entity.setUnitNum(dto.getUnitNum());
        }
        if (needsMapping(dto, dto.getChargeNum(), "chargeNum")) {
            entity.setChargeNum(dto.getChargeNum());
        }
        if (needsMapping(dto, dto.getAllocNum(), "allocNum")) {
            entity.setAllocNum(dto.getAllocNum());
        }
        if (needsMapping(dto, dto.getMoveNum(), "moveNum")) {
            entity.setMoveNum(dto.getMoveNum());
        }
        if (needsMapping(dto, dto.getTransitNum(), "transitNum")) {
            entity.setTransitNum(dto.getTransitNum());
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
        if (!_suppressMLocation && dto.getMLocation() != null) {
            MLocationDto relationDto = dto.getMLocation();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MLocation relationEntity = (MLocation)cachedEntity;
                entity.setMLocation(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
            } else {
                MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MLocation relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMLocation(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
                if (instanceCache && entity.getMLocation().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMLocation());
                }
            }
        };
        if (!_suppressMStockType && dto.getMStockType() != null) {
            MStockTypeDto relationDto = dto.getMStockType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MStockType relationEntity = (MStockType)cachedEntity;
                entity.setMStockType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
            } else {
                MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MStockType relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMStockType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
                if (instanceCache && entity.getMStockType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMStockType());
                }
            }
        };
        if (!_suppressMShape && dto.getMShape() != null) {
            MShapeDto relationDto = dto.getMShape();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MShape relationEntity = (MShape)cachedEntity;
                entity.setMShape(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
            } else {
                MShapeDtoMapper mapper = new MShapeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MShape relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMShape(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
                if (instanceCache && entity.getMShape().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMShape());
                }
            }
        };
        if (!_suppressTLot && dto.getTLot() != null) {
            TLotDto relationDto = dto.getTLot();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TLot relationEntity = (TLot)cachedEntity;
                entity.setTLot(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
            } else {
                TLotDtoMapper mapper = new TLotDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                TLot relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTLot(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
                if (instanceCache && entity.getTLot().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTLot());
                }
            }
        };
        if (!_suppressMWarehouse && dto.getMWarehouse() != null) {
            MWarehouseDto relationDto = dto.getMWarehouse();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MWarehouse relationEntity = (MWarehouse)cachedEntity;
                entity.setMWarehouse(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
            } else {
                MWarehouseDtoMapper mapper = new MWarehouseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MWarehouse relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMWarehouse(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
                if (instanceCache && entity.getMWarehouse().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMWarehouse());
                }
            }
        };
        if (!_suppressTStoreNo && dto.getTStoreNo() != null) {
            TStoreNoDto relationDto = dto.getTStoreNo();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TStoreNo relationEntity = (TStoreNo)cachedEntity;
                entity.setTStoreNo(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
            } else {
                TStoreNoDtoMapper mapper = new TStoreNoDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                TStoreNo relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTStoreNo(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
                if (instanceCache && entity.getTStoreNo().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTStoreNo());
                }
            }
        };
        if (!_suppressMProduct && dto.getMProduct() != null) {
            MProductDto relationDto = dto.getMProduct();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MProduct relationEntity = (MProduct)cachedEntity;
                entity.setMProduct(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MProduct relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProduct(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
                if (instanceCache && entity.getMProduct().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProduct());
                }
            }
        };
        if (!_suppressMCustomer && dto.getMCustomer() != null) {
            MCustomerDto relationDto = dto.getMCustomer();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCustomer relationEntity = (MCustomer)cachedEntity;
                entity.setMCustomer(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MCustomer relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCustomer(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
                if (instanceCache && entity.getMCustomer().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCustomer());
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
                    relationEntity.getTStockList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
                }
            }
        };
        if (!_suppressTInventoryBList && !dto.getTInventoryBList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TInventoryB> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryBList());
            entity.setTInventoryBList(relationEntityList);
            if (reverseReference) {
                for (TInventoryB relationEntity : relationEntityList) {
                    relationEntity.setTStock(entity);
                }
            }
        };
        if (!_suppressTPickingBList && !dto.getTPickingBList().isEmpty()) {
            TPickingBDtoMapper mapper = new TPickingBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TPickingB> relationEntityList = mapper.mappingToEntityList(dto.getTPickingBList());
            entity.setTPickingBList(relationEntityList);
            if (reverseReference) {
                for (TPickingB relationEntity : relationEntityList) {
                    relationEntity.setTStock(entity);
                }
            }
        };
        if (!_suppressTPickingRecordStockList && !dto.getTPickingRecordStockList().isEmpty()) {
            TPickingRecordStockDtoMapper mapper = new TPickingRecordStockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TPickingRecordStock> relationEntityList = mapper.mappingToEntityList(dto.getTPickingRecordStockList());
            entity.setTPickingRecordStockList(relationEntityList);
            if (reverseReference) {
                for (TPickingRecordStock relationEntity : relationEntityList) {
                    relationEntity.setTStock(entity);
                }
            }
        };
        if (!_suppressTReceiveLabelList && !dto.getTReceiveLabelList().isEmpty()) {
            TReceiveLabelDtoMapper mapper = new TReceiveLabelDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TReceiveLabel> relationEntityList = mapper.mappingToEntityList(dto.getTReceiveLabelList());
            entity.setTReceiveLabelList(relationEntityList);
            if (reverseReference) {
                for (TReceiveLabel relationEntity : relationEntityList) {
                    relationEntity.setTStock(entity);
                }
            }
        };
        if (!_suppressTScmLabelList && !dto.getTScmLabelList().isEmpty()) {
            TScmLabelDtoMapper mapper = new TScmLabelDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TScmLabel> relationEntityList = mapper.mappingToEntityList(dto.getTScmLabelList());
            entity.setTScmLabelList(relationEntityList);
            if (reverseReference) {
                for (TScmLabel relationEntity : relationEntityList) {
                    relationEntity.setTStock(entity);
                }
            }
        };
        if (!_suppressTStockInoutList && !dto.getTStockInoutList().isEmpty()) {
            TStockInoutDtoMapper mapper = new TStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TStockInout> relationEntityList = mapper.mappingToEntityList(dto.getTStockInoutList());
            entity.setTStockInoutList(relationEntityList);
            if (reverseReference) {
                for (TStockInout relationEntity : relationEntityList) {
                    relationEntity.setTStock(entity);
                }
            }
        };
        if (!_suppressTStockReportAsOne && dto.getTStockReportAsOne() != null) {
            TStockReportDto relationDto = dto.getTStockReportAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TStockReport relationEntity = (TStockReport)cachedEntity;
                entity.setTStockReportAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTStock(entity);
                }
            } else {
                TStockReportDtoMapper mapper = new TStockReportDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStock();
                TStockReport relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTStockReportAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTStock(entity);
                }
                if (instanceCache && entity.getTStockReportAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTStockReportAsOne());
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
    protected boolean needsMapping(TStockDto dto, Object value, String propName) {
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
    public List<TStock> mappingToEntityList(List<TStockDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TStock> entityList = new ArrayList<TStock>();
        for (TStockDto dto : dtoList) {
            TStock entity = mappingToEntity(dto);
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
    public void suppressMLocation() {
        _suppressMLocation = true;
    }
    public void suppressMStockType() {
        _suppressMStockType = true;
    }
    public void suppressMShape() {
        _suppressMShape = true;
    }
    public void suppressTLot() {
        _suppressTLot = true;
    }
    public void suppressMWarehouse() {
        _suppressMWarehouse = true;
    }
    public void suppressTStoreNo() {
        _suppressTStoreNo = true;
    }
    public void suppressMProduct() {
        _suppressMProduct = true;
    }
    public void suppressMCustomer() {
        _suppressMCustomer = true;
    }
    public void suppressMClient() {
        _suppressMClient = true;
    }
    public void suppressTInventoryBList() {
        _suppressTInventoryBList = true;
    }
    public void suppressTPickingBList() {
        _suppressTPickingBList = true;
    }
    public void suppressTPickingRecordStockList() {
        _suppressTPickingRecordStockList = true;
    }
    public void suppressTReceiveLabelList() {
        _suppressTReceiveLabelList = true;
    }
    public void suppressTScmLabelList() {
        _suppressTScmLabelList = true;
    }
    public void suppressTStockInoutList() {
        _suppressTStockInoutList = true;
    }
    public void suppressTStockReportAsOne() {
        _suppressTStockReportAsOne = true;
    }
    protected void doSuppressAll() { // internal
        suppressMLocation();
        suppressMStockType();
        suppressMShape();
        suppressTLot();
        suppressMWarehouse();
        suppressTStoreNo();
        suppressMProduct();
        suppressMCustomer();
        suppressMClient();
        suppressTInventoryBList();
        suppressTPickingBList();
        suppressTPickingRecordStockList();
        suppressTReceiveLabelList();
        suppressTScmLabelList();
        suppressTStockInoutList();
        suppressTStockReportAsOne();
    }
    protected void doSuppressClear() { // internal
        _suppressMLocation = false;
        _suppressMStockType = false;
        _suppressMShape = false;
        _suppressTLot = false;
        _suppressMWarehouse = false;
        _suppressTStoreNo = false;
        _suppressMProduct = false;
        _suppressMCustomer = false;
        _suppressMClient = false;
        _suppressTInventoryBList = false;
        _suppressTPickingBList = false;
        _suppressTPickingRecordStockList = false;
        _suppressTReceiveLabelList = false;
        _suppressTScmLabelList = false;
        _suppressTStockInoutList = false;
        _suppressTStockReportAsOne = false;
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
    public TStockDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TStockDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TStockDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TStockDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TStockDtoMapper reverseReference() {
        setReverseReference(true);
        return (TStockDtoMapper)this;
    }
}
