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
 * The DTO mapper of e_shipping_inst as TABLE. <br>
 * 出荷指示受信テーブル
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_ID
 *
 * [column]
 *     SHIPPING_INST_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, SHIPPING_SLIP_NO, SHIPPING_SLIP_ROW_NO, SALES_ORDER_NO, HINMOKU_CD, SALES_ORDER_SLIP_TYPE_CD, SALES_ORDER_SLIP_NO, NIZOROE_NO, SHIPPING_TYPE_CD, SHIPPING_REASON_CD, HINMOKU_GROUP, SHIPPING_NUM, HINMOKU_TEXT, JAN_CD, UNIT_NM, EC_UNIT_NM, SAMPLE_TYPE_CD, LOGI_WEIGHT_FLG, LOGI_ATTENTION_TYPE_CD, LOGI_SPECIAL_TYPE_CD, DIRECT_DELIVERY_TYPE_CD, KOGUCHI_DELIVERY_FLG, SPLIT_DELIVERY_TYPE_CD, CARRIER_TYPE_CD, CARRIER_CD, EXPRESS_CD, SHIPPING_DT, SPECIFY_DELIVERY_DT, SPECIFY_DELIVERY_TIME, TENHANSHA_CD, SALES_ORG_CD, TENHANSHA_ORDER_NO, KOHAI_CONTRACTOR_CD, KOHAI_CONTRACTOR_NM, DESTINATION_CD, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_NM_KANA, DESTINATION_ZIP_CD, DESTINATION_ADDRESS1, DESTINATION_ADDRESS2, DESTINATION_TEL, DESTINATION_FAX, KANJI_MESSAGE1, KANJI_MESSAGE2, KANJI_MESSAGE3, KANJI_MESSAGE4, KANJI_MESSAGE5, KANJI_MESSAGE6, KANJI_MESSAGE7, KANJI_MESSAGE8, KANJI_MESSAGE9, KANJI_MESSAGE10, KANA_MESSAGE1, KANA_MESSAGE2, KANA_MESSAGE3, KANA_MESSAGE4, KANA_MESSAGE5, KANA_MESSAGE6, KANA_MESSAGE7, KANA_MESSAGE8, KANA_MESSAGE9, KANA_MESSAGE10, DELIVERY_NOTE_SUMMARY, INVOICE_SUMMARY, UNIT_PRICE, EC_ORDER_NO, EC_ORDER_BRANCH_NO, EC_PRODUCT_NM_KANJI, ORDER_DT, KOKYAKU_CD, PAYMENT_TYPE_CD, TOTAL_PRICE, SHIPPING_FEE, SEPARATE_SHIPPING_FEE, COD_FEE, SALES_TAX_RATE, PRICE_HIDDEN_FLG, PAYMENT_HIDDEN_FLG, ORDER_NO_DELIVERY_NOTE, POINT, STORE_PLANT_CD, STORE_STORAGE_SPACE_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, LOT_MANAG_TYPE_CD, DEAL_TYPE_CD, CUSTOMER_CD, CUSTOMER_NM, DELIV_CD, EMP_ID_CD, EMP_NM, IF_ID, DESTINATION_PREFECTURE, PSAM, FLOOR_COMP_FLG, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, DATA_TRANSFER_ONLY_STR01, DATA_TRANSFER_ONLY_STR02, DATA_TRANSFER_ONLY_STR03, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_ID
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
public abstract class BsEShippingInstDtoMapper implements DtoMapper<EShippingInst, EShippingInstDto>, Serializable {

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
    public BsEShippingInstDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEShippingInstDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EShippingInstDto mappingToDto(EShippingInst entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EShippingInstDto dto = new EShippingInstDto();
        dto.setShippingInstId(entity.getShippingInstId());
        dto.setReceiveCd(entity.getReceiveCd());
        dto.setReceiveRowId(entity.getReceiveRowId());
        dto.setImportFlg(entity.getImportFlg());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setShippingSlipNo(entity.getShippingSlipNo());
        dto.setShippingSlipRowNo(entity.getShippingSlipRowNo());
        dto.setSalesOrderNo(entity.getSalesOrderNo());
        dto.setHinmokuCd(entity.getHinmokuCd());
        dto.setSalesOrderSlipTypeCd(entity.getSalesOrderSlipTypeCd());
        dto.setSalesOrderSlipNo(entity.getSalesOrderSlipNo());
        dto.setNizoroeNo(entity.getNizoroeNo());
        dto.setShippingTypeCd(entity.getShippingTypeCd());
        dto.setShippingReasonCd(entity.getShippingReasonCd());
        dto.setHinmokuGroup(entity.getHinmokuGroup());
        dto.setShippingNum(entity.getShippingNum());
        dto.setHinmokuText(entity.getHinmokuText());
        dto.setJanCd(entity.getJanCd());
        dto.setUnitNm(entity.getUnitNm());
        dto.setEcUnitNm(entity.getEcUnitNm());
        dto.setSampleTypeCd(entity.getSampleTypeCd());
        dto.setLogiWeightFlg(entity.getLogiWeightFlg());
        dto.setLogiAttentionTypeCd(entity.getLogiAttentionTypeCd());
        dto.setLogiSpecialTypeCd(entity.getLogiSpecialTypeCd());
        dto.setDirectDeliveryTypeCd(entity.getDirectDeliveryTypeCd());
        dto.setKoguchiDeliveryFlg(entity.getKoguchiDeliveryFlg());
        dto.setSplitDeliveryTypeCd(entity.getSplitDeliveryTypeCd());
        dto.setCarrierTypeCd(entity.getCarrierTypeCd());
        dto.setCarrierCd(entity.getCarrierCd());
        dto.setExpressCd(entity.getExpressCd());
        dto.setShippingDt(entity.getShippingDt());
        dto.setSpecifyDeliveryDt(entity.getSpecifyDeliveryDt());
        dto.setSpecifyDeliveryTime(entity.getSpecifyDeliveryTime());
        dto.setTenhanshaCd(entity.getTenhanshaCd());
        dto.setSalesOrgCd(entity.getSalesOrgCd());
        dto.setTenhanshaOrderNo(entity.getTenhanshaOrderNo());
        dto.setKohaiContractorCd(entity.getKohaiContractorCd());
        dto.setKohaiContractorNm(entity.getKohaiContractorNm());
        dto.setDestinationCd(entity.getDestinationCd());
        dto.setDestinationNm1(entity.getDestinationNm1());
        dto.setDestinationNm2(entity.getDestinationNm2());
        dto.setDestinationNmKana(entity.getDestinationNmKana());
        dto.setDestinationZipCd(entity.getDestinationZipCd());
        dto.setDestinationAddress1(entity.getDestinationAddress1());
        dto.setDestinationAddress2(entity.getDestinationAddress2());
        dto.setDestinationTel(entity.getDestinationTel());
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
        dto.setUnitPrice(entity.getUnitPrice());
        dto.setEcOrderNo(entity.getEcOrderNo());
        dto.setEcOrderBranchNo(entity.getEcOrderBranchNo());
        dto.setEcProductNmKanji(entity.getEcProductNmKanji());
        dto.setOrderDt(entity.getOrderDt());
        dto.setKokyakuCd(entity.getKokyakuCd());
        dto.setPaymentTypeCd(entity.getPaymentTypeCd());
        dto.setTotalPrice(entity.getTotalPrice());
        dto.setShippingFee(entity.getShippingFee());
        dto.setSeparateShippingFee(entity.getSeparateShippingFee());
        dto.setCodFee(entity.getCodFee());
        dto.setSalesTaxRate(entity.getSalesTaxRate());
        dto.setPriceHiddenFlg(entity.getPriceHiddenFlg());
        dto.setPaymentHiddenFlg(entity.getPaymentHiddenFlg());
        dto.setOrderNoDeliveryNote(entity.getOrderNoDeliveryNote());
        dto.setPoint(entity.getPoint());
        dto.setStorePlantCd(entity.getStorePlantCd());
        dto.setStoreStorageSpaceCd(entity.getStoreStorageSpaceCd());
        dto.setShippingPlantCd(entity.getShippingPlantCd());
        dto.setShippingStorageSpaceCd(entity.getShippingStorageSpaceCd());
        dto.setLotManagTypeCd(entity.getLotManagTypeCd());
        dto.setDealTypeCd(entity.getDealTypeCd());
        dto.setCustomerCd(entity.getCustomerCd());
        dto.setCustomerNm(entity.getCustomerNm());
        dto.setDelivCd(entity.getDelivCd());
        dto.setEmpIdCd(entity.getEmpIdCd());
        dto.setEmpNm(entity.getEmpNm());
        dto.setIfId(entity.getIfId());
        dto.setDestinationPrefecture(entity.getDestinationPrefecture());
        dto.setPsam(entity.getPsam());
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
        dto.setDataTransferOnlyStr01(entity.getDataTransferOnlyStr01());
        dto.setDataTransferOnlyStr02(entity.getDataTransferOnlyStr02());
        dto.setDataTransferOnlyStr03(entity.getDataTransferOnlyStr03());
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
    public List<EShippingInstDto> mappingToDtoList(List<EShippingInst> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EShippingInstDto> dtoList = new ArrayList<EShippingInstDto>();
        for (EShippingInst entity : entityList) {
            EShippingInstDto dto = mappingToDto(entity);
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
    public EShippingInst mappingToEntity(EShippingInstDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EShippingInst entity = new EShippingInst();
        if (needsMapping(dto, dto.getShippingInstId(), "shippingInstId")) {
            entity.setShippingInstId(dto.getShippingInstId());
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
        if (needsMapping(dto, dto.getShippingSlipNo(), "shippingSlipNo")) {
            entity.setShippingSlipNo(dto.getShippingSlipNo());
        }
        if (needsMapping(dto, dto.getShippingSlipRowNo(), "shippingSlipRowNo")) {
            entity.setShippingSlipRowNo(dto.getShippingSlipRowNo());
        }
        if (needsMapping(dto, dto.getSalesOrderNo(), "salesOrderNo")) {
            entity.setSalesOrderNo(dto.getSalesOrderNo());
        }
        if (needsMapping(dto, dto.getHinmokuCd(), "hinmokuCd")) {
            entity.setHinmokuCd(dto.getHinmokuCd());
        }
        if (needsMapping(dto, dto.getSalesOrderSlipTypeCd(), "salesOrderSlipTypeCd")) {
            entity.setSalesOrderSlipTypeCd(dto.getSalesOrderSlipTypeCd());
        }
        if (needsMapping(dto, dto.getSalesOrderSlipNo(), "salesOrderSlipNo")) {
            entity.setSalesOrderSlipNo(dto.getSalesOrderSlipNo());
        }
        if (needsMapping(dto, dto.getNizoroeNo(), "nizoroeNo")) {
            entity.setNizoroeNo(dto.getNizoroeNo());
        }
        if (needsMapping(dto, dto.getShippingTypeCd(), "shippingTypeCd")) {
            entity.setShippingTypeCd(dto.getShippingTypeCd());
        }
        if (needsMapping(dto, dto.getShippingReasonCd(), "shippingReasonCd")) {
            entity.setShippingReasonCd(dto.getShippingReasonCd());
        }
        if (needsMapping(dto, dto.getHinmokuGroup(), "hinmokuGroup")) {
            entity.setHinmokuGroup(dto.getHinmokuGroup());
        }
        if (needsMapping(dto, dto.getShippingNum(), "shippingNum")) {
            entity.setShippingNum(dto.getShippingNum());
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
        if (needsMapping(dto, dto.getEcUnitNm(), "ecUnitNm")) {
            entity.setEcUnitNm(dto.getEcUnitNm());
        }
        if (needsMapping(dto, dto.getSampleTypeCd(), "sampleTypeCd")) {
            entity.setSampleTypeCd(dto.getSampleTypeCd());
        }
        if (needsMapping(dto, dto.getLogiWeightFlg(), "logiWeightFlg")) {
            entity.setLogiWeightFlg(dto.getLogiWeightFlg());
        }
        if (needsMapping(dto, dto.getLogiAttentionTypeCd(), "logiAttentionTypeCd")) {
            entity.setLogiAttentionTypeCd(dto.getLogiAttentionTypeCd());
        }
        if (needsMapping(dto, dto.getLogiSpecialTypeCd(), "logiSpecialTypeCd")) {
            entity.setLogiSpecialTypeCd(dto.getLogiSpecialTypeCd());
        }
        if (needsMapping(dto, dto.getDirectDeliveryTypeCd(), "directDeliveryTypeCd")) {
            entity.setDirectDeliveryTypeCd(dto.getDirectDeliveryTypeCd());
        }
        if (needsMapping(dto, dto.getKoguchiDeliveryFlg(), "koguchiDeliveryFlg")) {
            entity.setKoguchiDeliveryFlg(dto.getKoguchiDeliveryFlg());
        }
        if (needsMapping(dto, dto.getSplitDeliveryTypeCd(), "splitDeliveryTypeCd")) {
            entity.setSplitDeliveryTypeCd(dto.getSplitDeliveryTypeCd());
        }
        if (needsMapping(dto, dto.getCarrierTypeCd(), "carrierTypeCd")) {
            entity.setCarrierTypeCd(dto.getCarrierTypeCd());
        }
        if (needsMapping(dto, dto.getCarrierCd(), "carrierCd")) {
            entity.setCarrierCd(dto.getCarrierCd());
        }
        if (needsMapping(dto, dto.getExpressCd(), "expressCd")) {
            entity.setExpressCd(dto.getExpressCd());
        }
        if (needsMapping(dto, dto.getShippingDt(), "shippingDt")) {
            entity.setShippingDt(dto.getShippingDt());
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
        if (needsMapping(dto, dto.getSalesOrgCd(), "salesOrgCd")) {
            entity.setSalesOrgCd(dto.getSalesOrgCd());
        }
        if (needsMapping(dto, dto.getTenhanshaOrderNo(), "tenhanshaOrderNo")) {
            entity.setTenhanshaOrderNo(dto.getTenhanshaOrderNo());
        }
        if (needsMapping(dto, dto.getKohaiContractorCd(), "kohaiContractorCd")) {
            entity.setKohaiContractorCd(dto.getKohaiContractorCd());
        }
        if (needsMapping(dto, dto.getKohaiContractorNm(), "kohaiContractorNm")) {
            entity.setKohaiContractorNm(dto.getKohaiContractorNm());
        }
        if (needsMapping(dto, dto.getDestinationCd(), "destinationCd")) {
            entity.setDestinationCd(dto.getDestinationCd());
        }
        if (needsMapping(dto, dto.getDestinationNm1(), "destinationNm1")) {
            entity.setDestinationNm1(dto.getDestinationNm1());
        }
        if (needsMapping(dto, dto.getDestinationNm2(), "destinationNm2")) {
            entity.setDestinationNm2(dto.getDestinationNm2());
        }
        if (needsMapping(dto, dto.getDestinationNmKana(), "destinationNmKana")) {
            entity.setDestinationNmKana(dto.getDestinationNmKana());
        }
        if (needsMapping(dto, dto.getDestinationZipCd(), "destinationZipCd")) {
            entity.setDestinationZipCd(dto.getDestinationZipCd());
        }
        if (needsMapping(dto, dto.getDestinationAddress1(), "destinationAddress1")) {
            entity.setDestinationAddress1(dto.getDestinationAddress1());
        }
        if (needsMapping(dto, dto.getDestinationAddress2(), "destinationAddress2")) {
            entity.setDestinationAddress2(dto.getDestinationAddress2());
        }
        if (needsMapping(dto, dto.getDestinationTel(), "destinationTel")) {
            entity.setDestinationTel(dto.getDestinationTel());
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
        if (needsMapping(dto, dto.getUnitPrice(), "unitPrice")) {
            entity.setUnitPrice(dto.getUnitPrice());
        }
        if (needsMapping(dto, dto.getEcOrderNo(), "ecOrderNo")) {
            entity.setEcOrderNo(dto.getEcOrderNo());
        }
        if (needsMapping(dto, dto.getEcOrderBranchNo(), "ecOrderBranchNo")) {
            entity.setEcOrderBranchNo(dto.getEcOrderBranchNo());
        }
        if (needsMapping(dto, dto.getEcProductNmKanji(), "ecProductNmKanji")) {
            entity.setEcProductNmKanji(dto.getEcProductNmKanji());
        }
        if (needsMapping(dto, dto.getOrderDt(), "orderDt")) {
            entity.setOrderDt(dto.getOrderDt());
        }
        if (needsMapping(dto, dto.getKokyakuCd(), "kokyakuCd")) {
            entity.setKokyakuCd(dto.getKokyakuCd());
        }
        if (needsMapping(dto, dto.getPaymentTypeCd(), "paymentTypeCd")) {
            entity.setPaymentTypeCd(dto.getPaymentTypeCd());
        }
        if (needsMapping(dto, dto.getTotalPrice(), "totalPrice")) {
            entity.setTotalPrice(dto.getTotalPrice());
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
        if (needsMapping(dto, dto.getSalesTaxRate(), "salesTaxRate")) {
            entity.setSalesTaxRate(dto.getSalesTaxRate());
        }
        if (needsMapping(dto, dto.getPriceHiddenFlg(), "priceHiddenFlg")) {
            entity.setPriceHiddenFlg(dto.getPriceHiddenFlg());
        }
        if (needsMapping(dto, dto.getPaymentHiddenFlg(), "paymentHiddenFlg")) {
            entity.setPaymentHiddenFlg(dto.getPaymentHiddenFlg());
        }
        if (needsMapping(dto, dto.getOrderNoDeliveryNote(), "orderNoDeliveryNote")) {
            entity.setOrderNoDeliveryNote(dto.getOrderNoDeliveryNote());
        }
        if (needsMapping(dto, dto.getPoint(), "point")) {
            entity.setPoint(dto.getPoint());
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
        if (needsMapping(dto, dto.getDealTypeCd(), "dealTypeCd")) {
            entity.setDealTypeCd(dto.getDealTypeCd());
        }
        if (needsMapping(dto, dto.getCustomerCd(), "customerCd")) {
            entity.setCustomerCd(dto.getCustomerCd());
        }
        if (needsMapping(dto, dto.getCustomerNm(), "customerNm")) {
            entity.setCustomerNm(dto.getCustomerNm());
        }
        if (needsMapping(dto, dto.getDelivCd(), "delivCd")) {
            entity.setDelivCd(dto.getDelivCd());
        }
        if (needsMapping(dto, dto.getEmpIdCd(), "empIdCd")) {
            entity.setEmpIdCd(dto.getEmpIdCd());
        }
        if (needsMapping(dto, dto.getEmpNm(), "empNm")) {
            entity.setEmpNm(dto.getEmpNm());
        }
        if (needsMapping(dto, dto.getIfId(), "ifId")) {
            entity.setIfId(dto.getIfId());
        }
        if (needsMapping(dto, dto.getDestinationPrefecture(), "destinationPrefecture")) {
            entity.setDestinationPrefecture(dto.getDestinationPrefecture());
        }
        if (needsMapping(dto, dto.getPsam(), "psam")) {
            entity.setPsam(dto.getPsam());
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
        if (needsMapping(dto, dto.getDataTransferOnlyStr01(), "dataTransferOnlyStr01")) {
            entity.setDataTransferOnlyStr01(dto.getDataTransferOnlyStr01());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr02(), "dataTransferOnlyStr02")) {
            entity.setDataTransferOnlyStr02(dto.getDataTransferOnlyStr02());
        }
        if (needsMapping(dto, dto.getDataTransferOnlyStr03(), "dataTransferOnlyStr03")) {
            entity.setDataTransferOnlyStr03(dto.getDataTransferOnlyStr03());
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
    protected boolean needsMapping(EShippingInstDto dto, Object value, String propName) {
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
    public List<EShippingInst> mappingToEntityList(List<EShippingInstDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EShippingInst> entityList = new ArrayList<EShippingInst>();
        for (EShippingInstDto dto : dtoList) {
            EShippingInst entity = mappingToEntity(dto);
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
    public EShippingInstDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EShippingInstDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EShippingInstDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EShippingInstDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EShippingInstDtoMapper reverseReference() {
        setReverseReference(true);
        return (EShippingInstDtoMapper)this;
    }
}
