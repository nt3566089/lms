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
 * The DTO mapper of t_inventory_b as TABLE. <br>
 * 棚卸ボディ
 * <pre>
 * [primary-key]
 *     INVENTORY_B_ID
 *
 * [column]
 *     INVENTORY_B_ID, INVENTORY_H_ID, STOCK_ID, WAREHOUSE_ID, PRODUCT_ID, STOCK_TYPE_ID, LOCATION_ID, DEPOSIT_ID, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, STORE_DT, SUPPLIER_ID, SUPPLIER_CD, SHAPE_ID, UNIT_NUM, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, INVENTORY_NUM, INPUT_TYPE, STOCK_ADJUST_FLG, MOVE_INST_H_ID, HT_INPUT_INVENTORY_NUM, WEB_INPUT_INVENTORY_NUM, AJIS_INPUT_INVENTORY_NUM, PROD_DT, AREA_CD, SALES_ORG_ID, ACCOUNT_ID, ALLOC_TYPE_CD, S4_SEND_FLG, CM_SEND_FLG, INVENTORY_USER_ID, INVENTORY_UPD_USER_ID, RECEIVE_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_stock_type, t_lot, m_warehouse, m_shape, b_user, t_move_inst_h, m_sales_org, m_customer, m_location, m_product, t_stock, t_inventory_h, t_store_no, b_class_dtl(ByInputType), t_inventory_r(AsOne)
 *
 * [referrer-table]
 *     t_inventory_inp_hist, t_inventory_receive_label, t_inventory_r
 *
 * [foreign-property]
 *     mStockType, tLot, mWarehouse, mShape, bUserByInventoryUpdUserId, tMoveInstH, mSalesOrg, mCustomerByAccountId, mLocation, mProduct, bUserByInventoryUserId, tStock, tInventoryH, tStoreNo, mCustomerByDepositId, mCustomerBySupplierId, bClassDtlByInputType, bClassDtlByStockAdjustFlg, tInventoryRAsOne
 *
 * [referrer-property]
 *     tInventoryInpHistList, tInventoryReceiveLabelList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTInventoryBDtoMapper implements DtoMapper<TInventoryB, TInventoryBDto>, Serializable {

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
    protected boolean _suppressMStockType;
    protected boolean _suppressTLot;
    protected boolean _suppressMWarehouse;
    protected boolean _suppressMShape;
    protected boolean _suppressBUserByInventoryUpdUserId;
    protected boolean _suppressTMoveInstH;
    protected boolean _suppressMSalesOrg;
    protected boolean _suppressMCustomerByAccountId;
    protected boolean _suppressMLocation;
    protected boolean _suppressMProduct;
    protected boolean _suppressBUserByInventoryUserId;
    protected boolean _suppressTStock;
    protected boolean _suppressTInventoryH;
    protected boolean _suppressTStoreNo;
    protected boolean _suppressMCustomerByDepositId;
    protected boolean _suppressMCustomerBySupplierId;
    protected boolean _suppressBClassDtlByInputType;
    protected boolean _suppressBClassDtlByStockAdjustFlg;
    protected boolean _suppressTInventoryInpHistList;
    protected boolean _suppressTInventoryRAsOne;
    protected boolean _suppressTInventoryReceiveLabelList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTInventoryBDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTInventoryBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TInventoryBDto mappingToDto(TInventoryB entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TInventoryBDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TInventoryBDto dto = new TInventoryBDto();
        dto.setInventoryBId(entity.getInventoryBId());
        dto.setInventoryHId(entity.getInventoryHId());
        dto.setStockId(entity.getStockId());
        dto.setWarehouseId(entity.getWarehouseId());
        dto.setProductId(entity.getProductId());
        dto.setStockTypeId(entity.getStockTypeId());
        dto.setLocationId(entity.getLocationId());
        dto.setDepositId(entity.getDepositId());
        dto.setLotId(entity.getLotId());
        dto.setLot(entity.getLot());
        dto.setLimitDt(entity.getLimitDt());
        dto.setStoreNoId(entity.getStoreNoId());
        dto.setStoreLabelNo(entity.getStoreLabelNo());
        dto.setStoreDt(entity.getStoreDt());
        dto.setSupplierId(entity.getSupplierId());
        dto.setSupplierCd(entity.getSupplierCd());
        dto.setShapeId(entity.getShapeId());
        dto.setUnitNum(entity.getUnitNum());
        dto.setChargeNum(entity.getChargeNum());
        dto.setAllocNum(entity.getAllocNum());
        dto.setMoveNum(entity.getMoveNum());
        dto.setInventoryNum(entity.getInventoryNum());
        dto.setInputType(entity.getInputType());
        dto.setStockAdjustFlg(entity.getStockAdjustFlg());
        dto.setMoveInstHId(entity.getMoveInstHId());
        dto.setHtInputInventoryNum(entity.getHtInputInventoryNum());
        dto.setWebInputInventoryNum(entity.getWebInputInventoryNum());
        dto.setAjisInputInventoryNum(entity.getAjisInputInventoryNum());
        dto.setProdDt(entity.getProdDt());
        dto.setAreaCd(entity.getAreaCd());
        dto.setSalesOrgId(entity.getSalesOrgId());
        dto.setAccountId(entity.getAccountId());
        dto.setAllocTypeCd(entity.getAllocTypeCd());
        dto.setS4SendFlg(entity.getS4SendFlg());
        dto.setCmSendFlg(entity.getCmSendFlg());
        dto.setInventoryUserId(entity.getInventoryUserId());
        dto.setInventoryUpdUserId(entity.getInventoryUpdUserId());
        dto.setReceiveDt(entity.getReceiveDt());
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
        if (!_suppressMStockType && entity.getMStockType() != null) {
            MStockType relationEntity = entity.getMStockType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MStockTypeDto relationDto = (MStockTypeDto)cachedDto;
                dto.setMStockType(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBList().add(dto);
                }
            } else {
                MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                MStockTypeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMStockType(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMStockType());
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
                    relationDto.getTInventoryBList().add(dto);
                }
            } else {
                TLotDtoMapper mapper = new TLotDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                TLotDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTLot(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBList().add(dto);
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
                    relationDto.getTInventoryBList().add(dto);
                }
            } else {
                MWarehouseDtoMapper mapper = new MWarehouseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                MWarehouseDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMWarehouse(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMWarehouse());
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
                    relationDto.getTInventoryBList().add(dto);
                }
            } else {
                MShapeDtoMapper mapper = new MShapeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                MShapeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMShape(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMShape());
                }
            }
        };
        if (!_suppressBUserByInventoryUpdUserId && entity.getBUserByInventoryUpdUserId() != null) {
            BUser relationEntity = entity.getBUserByInventoryUpdUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByInventoryUpdUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBByInventoryUpdUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBByInventoryUpdUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByInventoryUpdUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBByInventoryUpdUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByInventoryUpdUserId());
                }
            }
        };
        if (!_suppressTMoveInstH && entity.getTMoveInstH() != null) {
            TMoveInstH relationEntity = entity.getTMoveInstH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TMoveInstHDto relationDto = (TMoveInstHDto)cachedDto;
                dto.setTMoveInstH(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBList().add(dto);
                }
            } else {
                TMoveInstHDtoMapper mapper = new TMoveInstHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                TMoveInstHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTMoveInstH(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTMoveInstH());
                }
            }
        };
        if (!_suppressMSalesOrg && entity.getMSalesOrg() != null) {
            MSalesOrg relationEntity = entity.getMSalesOrg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MSalesOrgDto relationDto = (MSalesOrgDto)cachedDto;
                dto.setMSalesOrg(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBList().add(dto);
                }
            } else {
                MSalesOrgDtoMapper mapper = new MSalesOrgDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                MSalesOrgDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMSalesOrg(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMSalesOrg());
                }
            }
        };
        if (!_suppressMCustomerByAccountId && entity.getMCustomerByAccountId() != null) {
            MCustomer relationEntity = entity.getMCustomerByAccountId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCustomerDto relationDto = (MCustomerDto)cachedDto;
                dto.setMCustomerByAccountId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBByAccountIdList().add(dto);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBByAccountIdList();
                MCustomerDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCustomerByAccountId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBByAccountIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCustomerByAccountId());
                }
            }
        };
        if (!_suppressMLocation && entity.getMLocation() != null) {
            MLocation relationEntity = entity.getMLocation();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MLocationDto relationDto = (MLocationDto)cachedDto;
                dto.setMLocation(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBList().add(dto);
                }
            } else {
                MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                MLocationDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMLocation(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMLocation());
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
                    relationDto.getTInventoryBList().add(dto);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                MProductDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProduct(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProduct());
                }
            }
        };
        if (!_suppressBUserByInventoryUserId && entity.getBUserByInventoryUserId() != null) {
            BUser relationEntity = entity.getBUserByInventoryUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByInventoryUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBByInventoryUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBByInventoryUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByInventoryUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBByInventoryUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByInventoryUserId());
                }
            }
        };
        if (!_suppressTStock && entity.getTStock() != null) {
            TStock relationEntity = entity.getTStock();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TStockDto relationDto = (TStockDto)cachedDto;
                dto.setTStock(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBList().add(dto);
                }
            } else {
                TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                TStockDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTStock(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTStock());
                }
            }
        };
        if (!_suppressTInventoryH && entity.getTInventoryH() != null) {
            TInventoryH relationEntity = entity.getTInventoryH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TInventoryHDto relationDto = (TInventoryHDto)cachedDto;
                dto.setTInventoryH(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBList().add(dto);
                }
            } else {
                TInventoryHDtoMapper mapper = new TInventoryHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                TInventoryHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTInventoryH(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTInventoryH());
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
                    relationDto.getTInventoryBList().add(dto);
                }
            } else {
                TStoreNoDtoMapper mapper = new TStoreNoDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                TStoreNoDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTStoreNo(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTStoreNo());
                }
            }
        };
        if (!_suppressMCustomerByDepositId && entity.getMCustomerByDepositId() != null) {
            MCustomer relationEntity = entity.getMCustomerByDepositId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCustomerDto relationDto = (MCustomerDto)cachedDto;
                dto.setMCustomerByDepositId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBByDepositIdList().add(dto);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBByDepositIdList();
                MCustomerDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCustomerByDepositId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBByDepositIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCustomerByDepositId());
                }
            }
        };
        if (!_suppressMCustomerBySupplierId && entity.getMCustomerBySupplierId() != null) {
            MCustomer relationEntity = entity.getMCustomerBySupplierId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCustomerDto relationDto = (MCustomerDto)cachedDto;
                dto.setMCustomerBySupplierId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBBySupplierIdList().add(dto);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBBySupplierIdList();
                MCustomerDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCustomerBySupplierId(relationDto);
                if (reverseReference) {
                    relationDto.getTInventoryBBySupplierIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCustomerBySupplierId());
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
        if (!_suppressBClassDtlByStockAdjustFlg && entity.getBClassDtlByStockAdjustFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByStockAdjustFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByStockAdjustFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByStockAdjustFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByStockAdjustFlg());
                }
            }
        };
        if (!_suppressTInventoryInpHistList && !entity.getTInventoryInpHistList().isEmpty()) {
            TInventoryInpHistDtoMapper mapper = new TInventoryInpHistDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTInventoryB();
            List<TInventoryInpHistDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryInpHistList());
            dto.setTInventoryInpHistList(relationDtoList);
            if (reverseReference) {
                for (TInventoryInpHistDto relationDto : relationDtoList) {
                    relationDto.setTInventoryB(dto);
                }
            }
        };
        if (!_suppressTInventoryRAsOne && entity.getTInventoryRAsOne() != null) {
            TInventoryR relationEntity = entity.getTInventoryRAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TInventoryRDto relationDto = (TInventoryRDto)cachedDto;
                dto.setTInventoryRAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTInventoryB(dto);
                }
            } else {
                TInventoryRDtoMapper mapper = new TInventoryRDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryB();
                TInventoryRDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTInventoryRAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTInventoryB(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTInventoryRAsOne());
                }
            }
        };
        if (!_suppressTInventoryReceiveLabelList && !entity.getTInventoryReceiveLabelList().isEmpty()) {
            TInventoryReceiveLabelDtoMapper mapper = new TInventoryReceiveLabelDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTInventoryB();
            List<TInventoryReceiveLabelDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryReceiveLabelList());
            dto.setTInventoryReceiveLabelList(relationDtoList);
            if (reverseReference) {
                for (TInventoryReceiveLabelDto relationDto : relationDtoList) {
                    relationDto.setTInventoryB(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TInventoryBDto> mappingToDtoList(List<TInventoryB> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TInventoryBDto> dtoList = new ArrayList<TInventoryBDto>();
        for (TInventoryB entity : entityList) {
            TInventoryBDto dto = mappingToDto(entity);
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
    public TInventoryB mappingToEntity(TInventoryBDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TInventoryB)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TInventoryB entity = new TInventoryB();
        if (needsMapping(dto, dto.getInventoryBId(), "inventoryBId")) {
            entity.setInventoryBId(dto.getInventoryBId());
        }
        if (needsMapping(dto, dto.getInventoryHId(), "inventoryHId")) {
            entity.setInventoryHId(dto.getInventoryHId());
        }
        if (needsMapping(dto, dto.getStockId(), "stockId")) {
            entity.setStockId(dto.getStockId());
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
        if (needsMapping(dto, dto.getLot(), "lot")) {
            entity.setLot(dto.getLot());
        }
        if (needsMapping(dto, dto.getLimitDt(), "limitDt")) {
            entity.setLimitDt(dto.getLimitDt());
        }
        if (needsMapping(dto, dto.getStoreNoId(), "storeNoId")) {
            entity.setStoreNoId(dto.getStoreNoId());
        }
        if (needsMapping(dto, dto.getStoreLabelNo(), "storeLabelNo")) {
            entity.setStoreLabelNo(dto.getStoreLabelNo());
        }
        if (needsMapping(dto, dto.getStoreDt(), "storeDt")) {
            entity.setStoreDt(dto.getStoreDt());
        }
        if (needsMapping(dto, dto.getSupplierId(), "supplierId")) {
            entity.setSupplierId(dto.getSupplierId());
        }
        if (needsMapping(dto, dto.getSupplierCd(), "supplierCd")) {
            entity.setSupplierCd(dto.getSupplierCd());
        }
        if (needsMapping(dto, dto.getShapeId(), "shapeId")) {
            entity.setShapeId(dto.getShapeId());
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
        if (needsMapping(dto, dto.getInventoryNum(), "inventoryNum")) {
            entity.setInventoryNum(dto.getInventoryNum());
        }
        if (needsMapping(dto, dto.getInputType(), "inputType")) {
            entity.setInputTypeAsInputType(CDef.InputType.codeOf(dto.getInputType()));
        }
        if (needsMapping(dto, dto.getStockAdjustFlg(), "stockAdjustFlg")) {
            entity.setStockAdjustFlgAsStockMoveFlg(CDef.StockMoveFlg.codeOf(dto.getStockAdjustFlg()));
        }
        if (needsMapping(dto, dto.getMoveInstHId(), "moveInstHId")) {
            entity.setMoveInstHId(dto.getMoveInstHId());
        }
        if (needsMapping(dto, dto.getHtInputInventoryNum(), "htInputInventoryNum")) {
            entity.setHtInputInventoryNum(dto.getHtInputInventoryNum());
        }
        if (needsMapping(dto, dto.getWebInputInventoryNum(), "webInputInventoryNum")) {
            entity.setWebInputInventoryNum(dto.getWebInputInventoryNum());
        }
        if (needsMapping(dto, dto.getAjisInputInventoryNum(), "ajisInputInventoryNum")) {
            entity.setAjisInputInventoryNum(dto.getAjisInputInventoryNum());
        }
        if (needsMapping(dto, dto.getProdDt(), "prodDt")) {
            entity.setProdDt(dto.getProdDt());
        }
        if (needsMapping(dto, dto.getAreaCd(), "areaCd")) {
            entity.setAreaCd(dto.getAreaCd());
        }
        if (needsMapping(dto, dto.getSalesOrgId(), "salesOrgId")) {
            entity.setSalesOrgId(dto.getSalesOrgId());
        }
        if (needsMapping(dto, dto.getAccountId(), "accountId")) {
            entity.setAccountId(dto.getAccountId());
        }
        if (needsMapping(dto, dto.getAllocTypeCd(), "allocTypeCd")) {
            entity.setAllocTypeCd(dto.getAllocTypeCd());
        }
        if (needsMapping(dto, dto.getS4SendFlg(), "s4SendFlg")) {
            entity.setS4SendFlg(dto.getS4SendFlg());
        }
        if (needsMapping(dto, dto.getCmSendFlg(), "cmSendFlg")) {
            entity.setCmSendFlg(dto.getCmSendFlg());
        }
        if (needsMapping(dto, dto.getInventoryUserId(), "inventoryUserId")) {
            entity.setInventoryUserId(dto.getInventoryUserId());
        }
        if (needsMapping(dto, dto.getInventoryUpdUserId(), "inventoryUpdUserId")) {
            entity.setInventoryUpdUserId(dto.getInventoryUpdUserId());
        }
        if (needsMapping(dto, dto.getReceiveDt(), "receiveDt")) {
            entity.setReceiveDt(dto.getReceiveDt());
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
        if (!_suppressMStockType && dto.getMStockType() != null) {
            MStockTypeDto relationDto = dto.getMStockType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MStockType relationEntity = (MStockType)cachedEntity;
                entity.setMStockType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBList().add(entity);
                }
            } else {
                MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                MStockType relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMStockType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBList().add(entity);
                }
                if (instanceCache && entity.getMStockType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMStockType());
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
                    relationEntity.getTInventoryBList().add(entity);
                }
            } else {
                TLotDtoMapper mapper = new TLotDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                TLot relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTLot(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBList().add(entity);
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
                    relationEntity.getTInventoryBList().add(entity);
                }
            } else {
                MWarehouseDtoMapper mapper = new MWarehouseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                MWarehouse relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMWarehouse(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBList().add(entity);
                }
                if (instanceCache && entity.getMWarehouse().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMWarehouse());
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
                    relationEntity.getTInventoryBList().add(entity);
                }
            } else {
                MShapeDtoMapper mapper = new MShapeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                MShape relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMShape(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBList().add(entity);
                }
                if (instanceCache && entity.getMShape().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMShape());
                }
            }
        };
        if (!_suppressBUserByInventoryUpdUserId && dto.getBUserByInventoryUpdUserId() != null) {
            BUserDto relationDto = dto.getBUserByInventoryUpdUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByInventoryUpdUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBByInventoryUpdUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBByInventoryUpdUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByInventoryUpdUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBByInventoryUpdUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByInventoryUpdUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByInventoryUpdUserId());
                }
            }
        };
        if (!_suppressTMoveInstH && dto.getTMoveInstH() != null) {
            TMoveInstHDto relationDto = dto.getTMoveInstH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TMoveInstH relationEntity = (TMoveInstH)cachedEntity;
                entity.setTMoveInstH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBList().add(entity);
                }
            } else {
                TMoveInstHDtoMapper mapper = new TMoveInstHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                TMoveInstH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTMoveInstH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBList().add(entity);
                }
                if (instanceCache && entity.getTMoveInstH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTMoveInstH());
                }
            }
        };
        if (!_suppressMSalesOrg && dto.getMSalesOrg() != null) {
            MSalesOrgDto relationDto = dto.getMSalesOrg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MSalesOrg relationEntity = (MSalesOrg)cachedEntity;
                entity.setMSalesOrg(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBList().add(entity);
                }
            } else {
                MSalesOrgDtoMapper mapper = new MSalesOrgDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                MSalesOrg relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMSalesOrg(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBList().add(entity);
                }
                if (instanceCache && entity.getMSalesOrg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMSalesOrg());
                }
            }
        };
        if (!_suppressMCustomerByAccountId && dto.getMCustomerByAccountId() != null) {
            MCustomerDto relationDto = dto.getMCustomerByAccountId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCustomer relationEntity = (MCustomer)cachedEntity;
                entity.setMCustomerByAccountId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBByAccountIdList().add(entity);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBByAccountIdList();
                MCustomer relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCustomerByAccountId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBByAccountIdList().add(entity);
                }
                if (instanceCache && entity.getMCustomerByAccountId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCustomerByAccountId());
                }
            }
        };
        if (!_suppressMLocation && dto.getMLocation() != null) {
            MLocationDto relationDto = dto.getMLocation();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MLocation relationEntity = (MLocation)cachedEntity;
                entity.setMLocation(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBList().add(entity);
                }
            } else {
                MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                MLocation relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMLocation(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBList().add(entity);
                }
                if (instanceCache && entity.getMLocation().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMLocation());
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
                    relationEntity.getTInventoryBList().add(entity);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                MProduct relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProduct(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBList().add(entity);
                }
                if (instanceCache && entity.getMProduct().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProduct());
                }
            }
        };
        if (!_suppressBUserByInventoryUserId && dto.getBUserByInventoryUserId() != null) {
            BUserDto relationDto = dto.getBUserByInventoryUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByInventoryUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBByInventoryUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBByInventoryUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByInventoryUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBByInventoryUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByInventoryUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByInventoryUserId());
                }
            }
        };
        if (!_suppressTStock && dto.getTStock() != null) {
            TStockDto relationDto = dto.getTStock();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TStock relationEntity = (TStock)cachedEntity;
                entity.setTStock(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBList().add(entity);
                }
            } else {
                TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                TStock relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTStock(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBList().add(entity);
                }
                if (instanceCache && entity.getTStock().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTStock());
                }
            }
        };
        if (!_suppressTInventoryH && dto.getTInventoryH() != null) {
            TInventoryHDto relationDto = dto.getTInventoryH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TInventoryH relationEntity = (TInventoryH)cachedEntity;
                entity.setTInventoryH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBList().add(entity);
                }
            } else {
                TInventoryHDtoMapper mapper = new TInventoryHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                TInventoryH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTInventoryH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBList().add(entity);
                }
                if (instanceCache && entity.getTInventoryH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTInventoryH());
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
                    relationEntity.getTInventoryBList().add(entity);
                }
            } else {
                TStoreNoDtoMapper mapper = new TStoreNoDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBList();
                TStoreNo relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTStoreNo(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBList().add(entity);
                }
                if (instanceCache && entity.getTStoreNo().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTStoreNo());
                }
            }
        };
        if (!_suppressMCustomerByDepositId && dto.getMCustomerByDepositId() != null) {
            MCustomerDto relationDto = dto.getMCustomerByDepositId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCustomer relationEntity = (MCustomer)cachedEntity;
                entity.setMCustomerByDepositId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBByDepositIdList().add(entity);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBByDepositIdList();
                MCustomer relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCustomerByDepositId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBByDepositIdList().add(entity);
                }
                if (instanceCache && entity.getMCustomerByDepositId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCustomerByDepositId());
                }
            }
        };
        if (!_suppressMCustomerBySupplierId && dto.getMCustomerBySupplierId() != null) {
            MCustomerDto relationDto = dto.getMCustomerBySupplierId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCustomer relationEntity = (MCustomer)cachedEntity;
                entity.setMCustomerBySupplierId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBBySupplierIdList().add(entity);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryBBySupplierIdList();
                MCustomer relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCustomerBySupplierId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTInventoryBBySupplierIdList().add(entity);
                }
                if (instanceCache && entity.getMCustomerBySupplierId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCustomerBySupplierId());
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
        if (!_suppressBClassDtlByStockAdjustFlg && dto.getBClassDtlByStockAdjustFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByStockAdjustFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByStockAdjustFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByStockAdjustFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByStockAdjustFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByStockAdjustFlg());
                }
            }
        };
        if (!_suppressTInventoryInpHistList && !dto.getTInventoryInpHistList().isEmpty()) {
            TInventoryInpHistDtoMapper mapper = new TInventoryInpHistDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTInventoryB();
            List<TInventoryInpHist> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryInpHistList());
            entity.setTInventoryInpHistList(relationEntityList);
            if (reverseReference) {
                for (TInventoryInpHist relationEntity : relationEntityList) {
                    relationEntity.setTInventoryB(entity);
                }
            }
        };
        if (!_suppressTInventoryRAsOne && dto.getTInventoryRAsOne() != null) {
            TInventoryRDto relationDto = dto.getTInventoryRAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TInventoryR relationEntity = (TInventoryR)cachedEntity;
                entity.setTInventoryRAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTInventoryB(entity);
                }
            } else {
                TInventoryRDtoMapper mapper = new TInventoryRDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTInventoryB();
                TInventoryR relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTInventoryRAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTInventoryB(entity);
                }
                if (instanceCache && entity.getTInventoryRAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTInventoryRAsOne());
                }
            }
        };
        if (!_suppressTInventoryReceiveLabelList && !dto.getTInventoryReceiveLabelList().isEmpty()) {
            TInventoryReceiveLabelDtoMapper mapper = new TInventoryReceiveLabelDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTInventoryB();
            List<TInventoryReceiveLabel> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryReceiveLabelList());
            entity.setTInventoryReceiveLabelList(relationEntityList);
            if (reverseReference) {
                for (TInventoryReceiveLabel relationEntity : relationEntityList) {
                    relationEntity.setTInventoryB(entity);
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
    protected boolean needsMapping(TInventoryBDto dto, Object value, String propName) {
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
    public List<TInventoryB> mappingToEntityList(List<TInventoryBDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TInventoryB> entityList = new ArrayList<TInventoryB>();
        for (TInventoryBDto dto : dtoList) {
            TInventoryB entity = mappingToEntity(dto);
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
    public void suppressMStockType() {
        _suppressMStockType = true;
    }
    public void suppressTLot() {
        _suppressTLot = true;
    }
    public void suppressMWarehouse() {
        _suppressMWarehouse = true;
    }
    public void suppressMShape() {
        _suppressMShape = true;
    }
    public void suppressBUserByInventoryUpdUserId() {
        _suppressBUserByInventoryUpdUserId = true;
    }
    public void suppressTMoveInstH() {
        _suppressTMoveInstH = true;
    }
    public void suppressMSalesOrg() {
        _suppressMSalesOrg = true;
    }
    public void suppressMCustomerByAccountId() {
        _suppressMCustomerByAccountId = true;
    }
    public void suppressMLocation() {
        _suppressMLocation = true;
    }
    public void suppressMProduct() {
        _suppressMProduct = true;
    }
    public void suppressBUserByInventoryUserId() {
        _suppressBUserByInventoryUserId = true;
    }
    public void suppressTStock() {
        _suppressTStock = true;
    }
    public void suppressTInventoryH() {
        _suppressTInventoryH = true;
    }
    public void suppressTStoreNo() {
        _suppressTStoreNo = true;
    }
    public void suppressMCustomerByDepositId() {
        _suppressMCustomerByDepositId = true;
    }
    public void suppressMCustomerBySupplierId() {
        _suppressMCustomerBySupplierId = true;
    }
    public void suppressBClassDtlByInputType() {
        _suppressBClassDtlByInputType = true;
    }
    public void suppressBClassDtlByStockAdjustFlg() {
        _suppressBClassDtlByStockAdjustFlg = true;
    }
    public void suppressTInventoryInpHistList() {
        _suppressTInventoryInpHistList = true;
    }
    public void suppressTInventoryRAsOne() {
        _suppressTInventoryRAsOne = true;
    }
    public void suppressTInventoryReceiveLabelList() {
        _suppressTInventoryReceiveLabelList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMStockType();
        suppressTLot();
        suppressMWarehouse();
        suppressMShape();
        suppressBUserByInventoryUpdUserId();
        suppressTMoveInstH();
        suppressMSalesOrg();
        suppressMCustomerByAccountId();
        suppressMLocation();
        suppressMProduct();
        suppressBUserByInventoryUserId();
        suppressTStock();
        suppressTInventoryH();
        suppressTStoreNo();
        suppressMCustomerByDepositId();
        suppressMCustomerBySupplierId();
        suppressBClassDtlByInputType();
        suppressBClassDtlByStockAdjustFlg();
        suppressTInventoryInpHistList();
        suppressTInventoryRAsOne();
        suppressTInventoryReceiveLabelList();
    }
    protected void doSuppressClear() { // internal
        _suppressMStockType = false;
        _suppressTLot = false;
        _suppressMWarehouse = false;
        _suppressMShape = false;
        _suppressBUserByInventoryUpdUserId = false;
        _suppressTMoveInstH = false;
        _suppressMSalesOrg = false;
        _suppressMCustomerByAccountId = false;
        _suppressMLocation = false;
        _suppressMProduct = false;
        _suppressBUserByInventoryUserId = false;
        _suppressTStock = false;
        _suppressTInventoryH = false;
        _suppressTStoreNo = false;
        _suppressMCustomerByDepositId = false;
        _suppressMCustomerBySupplierId = false;
        _suppressBClassDtlByInputType = false;
        _suppressBClassDtlByStockAdjustFlg = false;
        _suppressTInventoryInpHistList = false;
        _suppressTInventoryRAsOne = false;
        _suppressTInventoryReceiveLabelList = false;
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
    public TInventoryBDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TInventoryBDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TInventoryBDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TInventoryBDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TInventoryBDtoMapper reverseReference() {
        setReverseReference(true);
        return (TInventoryBDtoMapper)this;
    }
}
