package com.oneslogi.base.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The DB meta of e_shipping_inst. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EShippingInstDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EShippingInstDbm _instance = new EShippingInstDbm();
    private EShippingInstDbm() {}
    public static EShippingInstDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((EShippingInst)et).getShippingInstId(), (et, vl) -> ((EShippingInst)et).setShippingInstId(ctl(vl)), "shippingInstId");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getReceiveCd(), (et, vl) -> ((EShippingInst)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getReceiveRowId(), (et, vl) -> ((EShippingInst)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getImportFlg(), (et, vl) -> ((EShippingInst)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getErrorFlg(), (et, vl) -> ((EShippingInst)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getErrorMessageCd(), (et, vl) -> ((EShippingInst)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getShippingSlipNo(), (et, vl) -> ((EShippingInst)et).setShippingSlipNo((String)vl), "shippingSlipNo");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getShippingSlipRowNo(), (et, vl) -> ((EShippingInst)et).setShippingSlipRowNo((String)vl), "shippingSlipRowNo");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSalesOrderNo(), (et, vl) -> ((EShippingInst)et).setSalesOrderNo((String)vl), "salesOrderNo");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getHinmokuCd(), (et, vl) -> ((EShippingInst)et).setHinmokuCd((String)vl), "hinmokuCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSalesOrderSlipTypeCd(), (et, vl) -> ((EShippingInst)et).setSalesOrderSlipTypeCd((String)vl), "salesOrderSlipTypeCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSalesOrderSlipNo(), (et, vl) -> ((EShippingInst)et).setSalesOrderSlipNo((String)vl), "salesOrderSlipNo");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getNizoroeNo(), (et, vl) -> ((EShippingInst)et).setNizoroeNo((String)vl), "nizoroeNo");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getShippingTypeCd(), (et, vl) -> ((EShippingInst)et).setShippingTypeCd((String)vl), "shippingTypeCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getShippingReasonCd(), (et, vl) -> ((EShippingInst)et).setShippingReasonCd((String)vl), "shippingReasonCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getHinmokuGroup(), (et, vl) -> ((EShippingInst)et).setHinmokuGroup((String)vl), "hinmokuGroup");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getShippingNum(), (et, vl) -> ((EShippingInst)et).setShippingNum((String)vl), "shippingNum");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getHinmokuText(), (et, vl) -> ((EShippingInst)et).setHinmokuText((String)vl), "hinmokuText");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getJanCd(), (et, vl) -> ((EShippingInst)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getUnitNm(), (et, vl) -> ((EShippingInst)et).setUnitNm((String)vl), "unitNm");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getEcUnitNm(), (et, vl) -> ((EShippingInst)et).setEcUnitNm((String)vl), "ecUnitNm");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSampleTypeCd(), (et, vl) -> ((EShippingInst)et).setSampleTypeCd((String)vl), "sampleTypeCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getLogiWeightFlg(), (et, vl) -> ((EShippingInst)et).setLogiWeightFlg((String)vl), "logiWeightFlg");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getLogiAttentionTypeCd(), (et, vl) -> ((EShippingInst)et).setLogiAttentionTypeCd((String)vl), "logiAttentionTypeCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getLogiSpecialTypeCd(), (et, vl) -> ((EShippingInst)et).setLogiSpecialTypeCd((String)vl), "logiSpecialTypeCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDirectDeliveryTypeCd(), (et, vl) -> ((EShippingInst)et).setDirectDeliveryTypeCd((String)vl), "directDeliveryTypeCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKoguchiDeliveryFlg(), (et, vl) -> ((EShippingInst)et).setKoguchiDeliveryFlg((String)vl), "koguchiDeliveryFlg");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSplitDeliveryTypeCd(), (et, vl) -> ((EShippingInst)et).setSplitDeliveryTypeCd((String)vl), "splitDeliveryTypeCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getCarrierTypeCd(), (et, vl) -> ((EShippingInst)et).setCarrierTypeCd((String)vl), "carrierTypeCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getCarrierCd(), (et, vl) -> ((EShippingInst)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getExpressCd(), (et, vl) -> ((EShippingInst)et).setExpressCd((String)vl), "expressCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getShippingDt(), (et, vl) -> ((EShippingInst)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSpecifyDeliveryDt(), (et, vl) -> ((EShippingInst)et).setSpecifyDeliveryDt((String)vl), "specifyDeliveryDt");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSpecifyDeliveryTime(), (et, vl) -> ((EShippingInst)et).setSpecifyDeliveryTime((String)vl), "specifyDeliveryTime");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getTenhanshaCd(), (et, vl) -> ((EShippingInst)et).setTenhanshaCd((String)vl), "tenhanshaCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSalesOrgCd(), (et, vl) -> ((EShippingInst)et).setSalesOrgCd((String)vl), "salesOrgCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getTenhanshaOrderNo(), (et, vl) -> ((EShippingInst)et).setTenhanshaOrderNo((String)vl), "tenhanshaOrderNo");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKohaiContractorCd(), (et, vl) -> ((EShippingInst)et).setKohaiContractorCd((String)vl), "kohaiContractorCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKohaiContractorNm(), (et, vl) -> ((EShippingInst)et).setKohaiContractorNm((String)vl), "kohaiContractorNm");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDestinationCd(), (et, vl) -> ((EShippingInst)et).setDestinationCd((String)vl), "destinationCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDestinationNm1(), (et, vl) -> ((EShippingInst)et).setDestinationNm1((String)vl), "destinationNm1");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDestinationNm2(), (et, vl) -> ((EShippingInst)et).setDestinationNm2((String)vl), "destinationNm2");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDestinationNmKana(), (et, vl) -> ((EShippingInst)et).setDestinationNmKana((String)vl), "destinationNmKana");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDestinationZipCd(), (et, vl) -> ((EShippingInst)et).setDestinationZipCd((String)vl), "destinationZipCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDestinationAddress1(), (et, vl) -> ((EShippingInst)et).setDestinationAddress1((String)vl), "destinationAddress1");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDestinationAddress2(), (et, vl) -> ((EShippingInst)et).setDestinationAddress2((String)vl), "destinationAddress2");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDestinationTel(), (et, vl) -> ((EShippingInst)et).setDestinationTel((String)vl), "destinationTel");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDestinationFax(), (et, vl) -> ((EShippingInst)et).setDestinationFax((String)vl), "destinationFax");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanjiMessage1(), (et, vl) -> ((EShippingInst)et).setKanjiMessage1((String)vl), "kanjiMessage1");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanjiMessage2(), (et, vl) -> ((EShippingInst)et).setKanjiMessage2((String)vl), "kanjiMessage2");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanjiMessage3(), (et, vl) -> ((EShippingInst)et).setKanjiMessage3((String)vl), "kanjiMessage3");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanjiMessage4(), (et, vl) -> ((EShippingInst)et).setKanjiMessage4((String)vl), "kanjiMessage4");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanjiMessage5(), (et, vl) -> ((EShippingInst)et).setKanjiMessage5((String)vl), "kanjiMessage5");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanjiMessage6(), (et, vl) -> ((EShippingInst)et).setKanjiMessage6((String)vl), "kanjiMessage6");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanjiMessage7(), (et, vl) -> ((EShippingInst)et).setKanjiMessage7((String)vl), "kanjiMessage7");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanjiMessage8(), (et, vl) -> ((EShippingInst)et).setKanjiMessage8((String)vl), "kanjiMessage8");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanjiMessage9(), (et, vl) -> ((EShippingInst)et).setKanjiMessage9((String)vl), "kanjiMessage9");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanjiMessage10(), (et, vl) -> ((EShippingInst)et).setKanjiMessage10((String)vl), "kanjiMessage10");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanaMessage1(), (et, vl) -> ((EShippingInst)et).setKanaMessage1((String)vl), "kanaMessage1");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanaMessage2(), (et, vl) -> ((EShippingInst)et).setKanaMessage2((String)vl), "kanaMessage2");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanaMessage3(), (et, vl) -> ((EShippingInst)et).setKanaMessage3((String)vl), "kanaMessage3");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanaMessage4(), (et, vl) -> ((EShippingInst)et).setKanaMessage4((String)vl), "kanaMessage4");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanaMessage5(), (et, vl) -> ((EShippingInst)et).setKanaMessage5((String)vl), "kanaMessage5");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanaMessage6(), (et, vl) -> ((EShippingInst)et).setKanaMessage6((String)vl), "kanaMessage6");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanaMessage7(), (et, vl) -> ((EShippingInst)et).setKanaMessage7((String)vl), "kanaMessage7");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanaMessage8(), (et, vl) -> ((EShippingInst)et).setKanaMessage8((String)vl), "kanaMessage8");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanaMessage9(), (et, vl) -> ((EShippingInst)et).setKanaMessage9((String)vl), "kanaMessage9");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKanaMessage10(), (et, vl) -> ((EShippingInst)et).setKanaMessage10((String)vl), "kanaMessage10");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDeliveryNoteSummary(), (et, vl) -> ((EShippingInst)et).setDeliveryNoteSummary((String)vl), "deliveryNoteSummary");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getInvoiceSummary(), (et, vl) -> ((EShippingInst)et).setInvoiceSummary((String)vl), "invoiceSummary");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getUnitPrice(), (et, vl) -> ((EShippingInst)et).setUnitPrice((String)vl), "unitPrice");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getEcOrderNo(), (et, vl) -> ((EShippingInst)et).setEcOrderNo((String)vl), "ecOrderNo");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getEcOrderBranchNo(), (et, vl) -> ((EShippingInst)et).setEcOrderBranchNo((String)vl), "ecOrderBranchNo");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getEcProductNmKanji(), (et, vl) -> ((EShippingInst)et).setEcProductNmKanji((String)vl), "ecProductNmKanji");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getOrderDt(), (et, vl) -> ((EShippingInst)et).setOrderDt((String)vl), "orderDt");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getKokyakuCd(), (et, vl) -> ((EShippingInst)et).setKokyakuCd((String)vl), "kokyakuCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getPaymentTypeCd(), (et, vl) -> ((EShippingInst)et).setPaymentTypeCd((String)vl), "paymentTypeCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getTotalPrice(), (et, vl) -> ((EShippingInst)et).setTotalPrice((String)vl), "totalPrice");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getShippingFee(), (et, vl) -> ((EShippingInst)et).setShippingFee((String)vl), "shippingFee");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSeparateShippingFee(), (et, vl) -> ((EShippingInst)et).setSeparateShippingFee((String)vl), "separateShippingFee");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getCodFee(), (et, vl) -> ((EShippingInst)et).setCodFee((String)vl), "codFee");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSalesTaxRate(), (et, vl) -> ((EShippingInst)et).setSalesTaxRate((String)vl), "salesTaxRate");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getPriceHiddenFlg(), (et, vl) -> ((EShippingInst)et).setPriceHiddenFlg((String)vl), "priceHiddenFlg");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getPaymentHiddenFlg(), (et, vl) -> ((EShippingInst)et).setPaymentHiddenFlg((String)vl), "paymentHiddenFlg");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getOrderNoDeliveryNote(), (et, vl) -> ((EShippingInst)et).setOrderNoDeliveryNote((String)vl), "orderNoDeliveryNote");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getPoint(), (et, vl) -> ((EShippingInst)et).setPoint((String)vl), "point");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getStorePlantCd(), (et, vl) -> ((EShippingInst)et).setStorePlantCd((String)vl), "storePlantCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getStoreStorageSpaceCd(), (et, vl) -> ((EShippingInst)et).setStoreStorageSpaceCd((String)vl), "storeStorageSpaceCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getShippingPlantCd(), (et, vl) -> ((EShippingInst)et).setShippingPlantCd((String)vl), "shippingPlantCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getShippingStorageSpaceCd(), (et, vl) -> ((EShippingInst)et).setShippingStorageSpaceCd((String)vl), "shippingStorageSpaceCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getLotManagTypeCd(), (et, vl) -> ((EShippingInst)et).setLotManagTypeCd((String)vl), "lotManagTypeCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDealTypeCd(), (et, vl) -> ((EShippingInst)et).setDealTypeCd((String)vl), "dealTypeCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getCustomerCd(), (et, vl) -> ((EShippingInst)et).setCustomerCd((String)vl), "customerCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getCustomerNm(), (et, vl) -> ((EShippingInst)et).setCustomerNm((String)vl), "customerNm");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDelivCd(), (et, vl) -> ((EShippingInst)et).setDelivCd((String)vl), "delivCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getEmpIdCd(), (et, vl) -> ((EShippingInst)et).setEmpIdCd((String)vl), "empIdCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getEmpNm(), (et, vl) -> ((EShippingInst)et).setEmpNm((String)vl), "empNm");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getIfId(), (et, vl) -> ((EShippingInst)et).setIfId((String)vl), "ifId");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDestinationPrefecture(), (et, vl) -> ((EShippingInst)et).setDestinationPrefecture((String)vl), "destinationPrefecture");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getPsam(), (et, vl) -> ((EShippingInst)et).setPsam((String)vl), "psam");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getFloorCompFlg(), (et, vl) -> ((EShippingInst)et).setFloorCompFlg((String)vl), "floorCompFlg");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSapAddYyyy(), (et, vl) -> ((EShippingInst)et).setSapAddYyyy((String)vl), "sapAddYyyy");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSapAddMm(), (et, vl) -> ((EShippingInst)et).setSapAddMm((String)vl), "sapAddMm");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSapAddDd(), (et, vl) -> ((EShippingInst)et).setSapAddDd((String)vl), "sapAddDd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSapAddHh(), (et, vl) -> ((EShippingInst)et).setSapAddHh((String)vl), "sapAddHh");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSapAddMi(), (et, vl) -> ((EShippingInst)et).setSapAddMi((String)vl), "sapAddMi");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSapAddSs(), (et, vl) -> ((EShippingInst)et).setSapAddSs((String)vl), "sapAddSs");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSapAddUserCd(), (et, vl) -> ((EShippingInst)et).setSapAddUserCd((String)vl), "sapAddUserCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSapUpdYyyy(), (et, vl) -> ((EShippingInst)et).setSapUpdYyyy((String)vl), "sapUpdYyyy");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSapUpdMm(), (et, vl) -> ((EShippingInst)et).setSapUpdMm((String)vl), "sapUpdMm");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSapUpdDd(), (et, vl) -> ((EShippingInst)et).setSapUpdDd((String)vl), "sapUpdDd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSapUpdHh(), (et, vl) -> ((EShippingInst)et).setSapUpdHh((String)vl), "sapUpdHh");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSapUpdMi(), (et, vl) -> ((EShippingInst)et).setSapUpdMi((String)vl), "sapUpdMi");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSapUpdSs(), (et, vl) -> ((EShippingInst)et).setSapUpdSs((String)vl), "sapUpdSs");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSapUpdUserCd(), (et, vl) -> ((EShippingInst)et).setSapUpdUserCd((String)vl), "sapUpdUserCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDataTransferOnlyStr01(), (et, vl) -> ((EShippingInst)et).setDataTransferOnlyStr01((String)vl), "dataTransferOnlyStr01");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDataTransferOnlyStr02(), (et, vl) -> ((EShippingInst)et).setDataTransferOnlyStr02((String)vl), "dataTransferOnlyStr02");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDataTransferOnlyStr03(), (et, vl) -> ((EShippingInst)et).setDataTransferOnlyStr03((String)vl), "dataTransferOnlyStr03");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSpareStr(), (et, vl) -> ((EShippingInst)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDelFlg(), (et, vl) -> ((EShippingInst)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getVersionNo(), (et, vl) -> ((EShippingInst)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getControlNo(), (et, vl) -> ((EShippingInst)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getAddDt(), (et, vl) -> ((EShippingInst)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getAddUser(), (et, vl) -> ((EShippingInst)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getAddProcess(), (et, vl) -> ((EShippingInst)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getUpdDt(), (et, vl) -> ((EShippingInst)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getUpdUser(), (et, vl) -> ((EShippingInst)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getUpdProcess(), (et, vl) -> ((EShippingInst)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "e_shipping_inst";
    protected final String _tableDispName = "e_shipping_inst";
    protected final String _tablePropertyName = "EShippingInst";
    protected final TableSqlName _tableSqlName = new TableSqlName("e_shipping_inst", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShippingInstId = cci("SHIPPING_INST_ID", "SHIPPING_INST_ID", null, null, Long.class, "shippingInstId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingSlipNo = cci("SHIPPING_SLIP_NO", "SHIPPING_SLIP_NO", null, null, String.class, "shippingSlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingSlipRowNo = cci("SHIPPING_SLIP_ROW_NO", "SHIPPING_SLIP_ROW_NO", null, null, String.class, "shippingSlipRowNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrderNo = cci("SALES_ORDER_NO", "SALES_ORDER_NO", null, null, String.class, "salesOrderNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuCd = cci("HINMOKU_CD", "HINMOKU_CD", null, null, String.class, "hinmokuCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrderSlipTypeCd = cci("SALES_ORDER_SLIP_TYPE_CD", "SALES_ORDER_SLIP_TYPE_CD", null, null, String.class, "salesOrderSlipTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrderSlipNo = cci("SALES_ORDER_SLIP_NO", "SALES_ORDER_SLIP_NO", null, null, String.class, "salesOrderSlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeNo = cci("NIZOROE_NO", "NIZOROE_NO", null, null, String.class, "nizoroeNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingTypeCd = cci("SHIPPING_TYPE_CD", "SHIPPING_TYPE_CD", null, null, String.class, "shippingTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingReasonCd = cci("SHIPPING_REASON_CD", "SHIPPING_REASON_CD", null, null, String.class, "shippingReasonCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuGroup = cci("HINMOKU_GROUP", "HINMOKU_GROUP", null, null, String.class, "hinmokuGroup", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingNum = cci("SHIPPING_NUM", "SHIPPING_NUM", null, null, String.class, "shippingNum", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuText = cci("HINMOKU_TEXT", "HINMOKU_TEXT", null, null, String.class, "hinmokuText", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNm = cci("UNIT_NM", "UNIT_NM", null, null, String.class, "unitNm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEcUnitNm = cci("EC_UNIT_NM", "EC_UNIT_NM", null, null, String.class, "ecUnitNm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSampleTypeCd = cci("SAMPLE_TYPE_CD", "SAMPLE_TYPE_CD", null, null, String.class, "sampleTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogiWeightFlg = cci("LOGI_WEIGHT_FLG", "LOGI_WEIGHT_FLG", null, null, String.class, "logiWeightFlg", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogiAttentionTypeCd = cci("LOGI_ATTENTION_TYPE_CD", "LOGI_ATTENTION_TYPE_CD", null, null, String.class, "logiAttentionTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogiSpecialTypeCd = cci("LOGI_SPECIAL_TYPE_CD", "LOGI_SPECIAL_TYPE_CD", null, null, String.class, "logiSpecialTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectDeliveryTypeCd = cci("DIRECT_DELIVERY_TYPE_CD", "DIRECT_DELIVERY_TYPE_CD", null, null, String.class, "directDeliveryTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKoguchiDeliveryFlg = cci("KOGUCHI_DELIVERY_FLG", "KOGUCHI_DELIVERY_FLG", null, null, String.class, "koguchiDeliveryFlg", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSplitDeliveryTypeCd = cci("SPLIT_DELIVERY_TYPE_CD", "SPLIT_DELIVERY_TYPE_CD", null, null, String.class, "splitDeliveryTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierTypeCd = cci("CARRIER_TYPE_CD", "CARRIER_TYPE_CD", null, null, String.class, "carrierTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpressCd = cci("EXPRESS_CD", "EXPRESS_CD", null, null, String.class, "expressCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpecifyDeliveryDt = cci("SPECIFY_DELIVERY_DT", "SPECIFY_DELIVERY_DT", null, null, String.class, "specifyDeliveryDt", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpecifyDeliveryTime = cci("SPECIFY_DELIVERY_TIME", "SPECIFY_DELIVERY_TIME", null, null, String.class, "specifyDeliveryTime", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaCd = cci("TENHANSHA_CD", "TENHANSHA_CD", null, null, String.class, "tenhanshaCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgCd = cci("SALES_ORG_CD", "SALES_ORG_CD", null, null, String.class, "salesOrgCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaOrderNo = cci("TENHANSHA_ORDER_NO", "TENHANSHA_ORDER_NO", null, null, String.class, "tenhanshaOrderNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKohaiContractorCd = cci("KOHAI_CONTRACTOR_CD", "KOHAI_CONTRACTOR_CD", null, null, String.class, "kohaiContractorCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKohaiContractorNm = cci("KOHAI_CONTRACTOR_NM", "KOHAI_CONTRACTOR_NM", null, null, String.class, "kohaiContractorNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationCd = cci("DESTINATION_CD", "DESTINATION_CD", null, null, String.class, "destinationCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationNm1 = cci("DESTINATION_NM1", "DESTINATION_NM1", null, null, String.class, "destinationNm1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationNm2 = cci("DESTINATION_NM2", "DESTINATION_NM2", null, null, String.class, "destinationNm2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationNmKana = cci("DESTINATION_NM_KANA", "DESTINATION_NM_KANA", null, null, String.class, "destinationNmKana", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationZipCd = cci("DESTINATION_ZIP_CD", "DESTINATION_ZIP_CD", null, null, String.class, "destinationZipCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationAddress1 = cci("DESTINATION_ADDRESS1", "DESTINATION_ADDRESS1", null, null, String.class, "destinationAddress1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationAddress2 = cci("DESTINATION_ADDRESS2", "DESTINATION_ADDRESS2", null, null, String.class, "destinationAddress2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationTel = cci("DESTINATION_TEL", "DESTINATION_TEL", null, null, String.class, "destinationTel", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationFax = cci("DESTINATION_FAX", "DESTINATION_FAX", null, null, String.class, "destinationFax", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanjiMessage1 = cci("KANJI_MESSAGE1", "KANJI_MESSAGE1", null, null, String.class, "kanjiMessage1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanjiMessage2 = cci("KANJI_MESSAGE2", "KANJI_MESSAGE2", null, null, String.class, "kanjiMessage2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanjiMessage3 = cci("KANJI_MESSAGE3", "KANJI_MESSAGE3", null, null, String.class, "kanjiMessage3", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanjiMessage4 = cci("KANJI_MESSAGE4", "KANJI_MESSAGE4", null, null, String.class, "kanjiMessage4", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanjiMessage5 = cci("KANJI_MESSAGE5", "KANJI_MESSAGE5", null, null, String.class, "kanjiMessage5", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanjiMessage6 = cci("KANJI_MESSAGE6", "KANJI_MESSAGE6", null, null, String.class, "kanjiMessage6", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanjiMessage7 = cci("KANJI_MESSAGE7", "KANJI_MESSAGE7", null, null, String.class, "kanjiMessage7", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanjiMessage8 = cci("KANJI_MESSAGE8", "KANJI_MESSAGE8", null, null, String.class, "kanjiMessage8", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanjiMessage9 = cci("KANJI_MESSAGE9", "KANJI_MESSAGE9", null, null, String.class, "kanjiMessage9", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanjiMessage10 = cci("KANJI_MESSAGE10", "KANJI_MESSAGE10", null, null, String.class, "kanjiMessage10", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanaMessage1 = cci("KANA_MESSAGE1", "KANA_MESSAGE1", null, null, String.class, "kanaMessage1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanaMessage2 = cci("KANA_MESSAGE2", "KANA_MESSAGE2", null, null, String.class, "kanaMessage2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanaMessage3 = cci("KANA_MESSAGE3", "KANA_MESSAGE3", null, null, String.class, "kanaMessage3", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanaMessage4 = cci("KANA_MESSAGE4", "KANA_MESSAGE4", null, null, String.class, "kanaMessage4", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanaMessage5 = cci("KANA_MESSAGE5", "KANA_MESSAGE5", null, null, String.class, "kanaMessage5", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanaMessage6 = cci("KANA_MESSAGE6", "KANA_MESSAGE6", null, null, String.class, "kanaMessage6", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanaMessage7 = cci("KANA_MESSAGE7", "KANA_MESSAGE7", null, null, String.class, "kanaMessage7", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanaMessage8 = cci("KANA_MESSAGE8", "KANA_MESSAGE8", null, null, String.class, "kanaMessage8", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanaMessage9 = cci("KANA_MESSAGE9", "KANA_MESSAGE9", null, null, String.class, "kanaMessage9", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKanaMessage10 = cci("KANA_MESSAGE10", "KANA_MESSAGE10", null, null, String.class, "kanaMessage10", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryNoteSummary = cci("DELIVERY_NOTE_SUMMARY", "DELIVERY_NOTE_SUMMARY", null, null, String.class, "deliveryNoteSummary", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceSummary = cci("INVOICE_SUMMARY", "INVOICE_SUMMARY", null, null, String.class, "invoiceSummary", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitPrice = cci("UNIT_PRICE", "UNIT_PRICE", null, null, String.class, "unitPrice", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEcOrderNo = cci("EC_ORDER_NO", "EC_ORDER_NO", null, null, String.class, "ecOrderNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEcOrderBranchNo = cci("EC_ORDER_BRANCH_NO", "EC_ORDER_BRANCH_NO", null, null, String.class, "ecOrderBranchNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEcProductNmKanji = cci("EC_PRODUCT_NM_KANJI", "EC_PRODUCT_NM_KANJI", null, null, String.class, "ecProductNmKanji", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderDt = cci("ORDER_DT", "ORDER_DT", null, null, String.class, "orderDt", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKokyakuCd = cci("KOKYAKU_CD", "KOKYAKU_CD", null, null, String.class, "kokyakuCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentTypeCd = cci("PAYMENT_TYPE_CD", "PAYMENT_TYPE_CD", null, null, String.class, "paymentTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalPrice = cci("TOTAL_PRICE", "TOTAL_PRICE", null, null, String.class, "totalPrice", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingFee = cci("SHIPPING_FEE", "SHIPPING_FEE", null, null, String.class, "shippingFee", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeparateShippingFee = cci("SEPARATE_SHIPPING_FEE", "SEPARATE_SHIPPING_FEE", null, null, String.class, "separateShippingFee", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCodFee = cci("COD_FEE", "COD_FEE", null, null, String.class, "codFee", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesTaxRate = cci("SALES_TAX_RATE", "SALES_TAX_RATE", null, null, String.class, "salesTaxRate", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriceHiddenFlg = cci("PRICE_HIDDEN_FLG", "PRICE_HIDDEN_FLG", null, null, String.class, "priceHiddenFlg", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentHiddenFlg = cci("PAYMENT_HIDDEN_FLG", "PAYMENT_HIDDEN_FLG", null, null, String.class, "paymentHiddenFlg", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderNoDeliveryNote = cci("ORDER_NO_DELIVERY_NOTE", "ORDER_NO_DELIVERY_NOTE", null, null, String.class, "orderNoDeliveryNote", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPoint = cci("POINT", "POINT", null, null, String.class, "point", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStorePlantCd = cci("STORE_PLANT_CD", "STORE_PLANT_CD", null, null, String.class, "storePlantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreStorageSpaceCd = cci("STORE_STORAGE_SPACE_CD", "STORE_STORAGE_SPACE_CD", null, null, String.class, "storeStorageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingPlantCd = cci("SHIPPING_PLANT_CD", "SHIPPING_PLANT_CD", null, null, String.class, "shippingPlantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStorageSpaceCd = cci("SHIPPING_STORAGE_SPACE_CD", "SHIPPING_STORAGE_SPACE_CD", null, null, String.class, "shippingStorageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotManagTypeCd = cci("LOT_MANAG_TYPE_CD", "LOT_MANAG_TYPE_CD", null, null, String.class, "lotManagTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDealTypeCd = cci("DEAL_TYPE_CD", "DEAL_TYPE_CD", null, null, String.class, "dealTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerCd = cci("CUSTOMER_CD", "CUSTOMER_CD", null, null, String.class, "customerCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerNm = cci("CUSTOMER_NM", "CUSTOMER_NM", null, null, String.class, "customerNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCd = cci("DELIV_CD", "DELIV_CD", null, null, String.class, "delivCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmpIdCd = cci("EMP_ID_CD", "EMP_ID_CD", null, null, String.class, "empIdCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmpNm = cci("EMP_NM", "EMP_NM", null, null, String.class, "empNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIfId = cci("IF_ID", "IF_ID", null, null, String.class, "ifId", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationPrefecture = cci("DESTINATION_PREFECTURE", "DESTINATION_PREFECTURE", null, null, String.class, "destinationPrefecture", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPsam = cci("PSAM", "PSAM", null, null, String.class, "psam", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFloorCompFlg = cci("FLOOR_COMP_FLG", "FLOOR_COMP_FLG", null, null, String.class, "floorCompFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddYyyy = cci("SAP_ADD_YYYY", "SAP_ADD_YYYY", null, null, String.class, "sapAddYyyy", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddMm = cci("SAP_ADD_MM", "SAP_ADD_MM", null, null, String.class, "sapAddMm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddDd = cci("SAP_ADD_DD", "SAP_ADD_DD", null, null, String.class, "sapAddDd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddHh = cci("SAP_ADD_HH", "SAP_ADD_HH", null, null, String.class, "sapAddHh", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddMi = cci("SAP_ADD_MI", "SAP_ADD_MI", null, null, String.class, "sapAddMi", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddSs = cci("SAP_ADD_SS", "SAP_ADD_SS", null, null, String.class, "sapAddSs", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddUserCd = cci("SAP_ADD_USER_CD", "SAP_ADD_USER_CD", null, null, String.class, "sapAddUserCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdYyyy = cci("SAP_UPD_YYYY", "SAP_UPD_YYYY", null, null, String.class, "sapUpdYyyy", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdMm = cci("SAP_UPD_MM", "SAP_UPD_MM", null, null, String.class, "sapUpdMm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdDd = cci("SAP_UPD_DD", "SAP_UPD_DD", null, null, String.class, "sapUpdDd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdHh = cci("SAP_UPD_HH", "SAP_UPD_HH", null, null, String.class, "sapUpdHh", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdMi = cci("SAP_UPD_MI", "SAP_UPD_MI", null, null, String.class, "sapUpdMi", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdSs = cci("SAP_UPD_SS", "SAP_UPD_SS", null, null, String.class, "sapUpdSs", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdUserCd = cci("SAP_UPD_USER_CD", "SAP_UPD_USER_CD", null, null, String.class, "sapUpdUserCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr01 = cci("DATA_TRANSFER_ONLY_STR01", "DATA_TRANSFER_ONLY_STR01", null, null, String.class, "dataTransferOnlyStr01", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr02 = cci("DATA_TRANSFER_ONLY_STR02", "DATA_TRANSFER_ONLY_STR02", null, null, String.class, "dataTransferOnlyStr02", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr03 = cci("DATA_TRANSFER_ONLY_STR03", "DATA_TRANSFER_ONLY_STR03", null, null, String.class, "dataTransferOnlyStr03", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareStr = cci("SPARE_STR", "SPARE_STR", null, null, String.class, "spareStr", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "CHAR", 1, 0, null, "0", true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "BIGINT", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "DATETIME", 19, 0, 3, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "VARCHAR", 60, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "VARCHAR", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "DATETIME", 19, 0, 3, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "VARCHAR", 60, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "VARCHAR", 255, 0, null, null, true, null, null, null, null, null, false);

    /**
     * SHIPPING_INST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstId() { return _columnShippingInstId; }
    /**
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingSlipNo() { return _columnShippingSlipNo; }
    /**
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingSlipRowNo() { return _columnShippingSlipRowNo; }
    /**
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrderNo() { return _columnSalesOrderNo; }
    /**
     * HINMOKU_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuCd() { return _columnHinmokuCd; }
    /**
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrderSlipTypeCd() { return _columnSalesOrderSlipTypeCd; }
    /**
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrderSlipNo() { return _columnSalesOrderSlipNo; }
    /**
     * NIZOROE_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeNo() { return _columnNizoroeNo; }
    /**
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingTypeCd() { return _columnShippingTypeCd; }
    /**
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingReasonCd() { return _columnShippingReasonCd; }
    /**
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuGroup() { return _columnHinmokuGroup; }
    /**
     * SHIPPING_NUM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingNum() { return _columnShippingNum; }
    /**
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuText() { return _columnHinmokuText; }
    /**
     * JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * UNIT_NM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNm() { return _columnUnitNm; }
    /**
     * EC_UNIT_NM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEcUnitNm() { return _columnEcUnitNm; }
    /**
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSampleTypeCd() { return _columnSampleTypeCd; }
    /**
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogiWeightFlg() { return _columnLogiWeightFlg; }
    /**
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogiAttentionTypeCd() { return _columnLogiAttentionTypeCd; }
    /**
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogiSpecialTypeCd() { return _columnLogiSpecialTypeCd; }
    /**
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectDeliveryTypeCd() { return _columnDirectDeliveryTypeCd; }
    /**
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKoguchiDeliveryFlg() { return _columnKoguchiDeliveryFlg; }
    /**
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplitDeliveryTypeCd() { return _columnSplitDeliveryTypeCd; }
    /**
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierTypeCd() { return _columnCarrierTypeCd; }
    /**
     * CARRIER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierCd() { return _columnCarrierCd; }
    /**
     * EXPRESS_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpressCd() { return _columnExpressCd; }
    /**
     * SHIPPING_DT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingDt() { return _columnShippingDt; }
    /**
     * SPECIFY_DELIVERY_DT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpecifyDeliveryDt() { return _columnSpecifyDeliveryDt; }
    /**
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpecifyDeliveryTime() { return _columnSpecifyDeliveryTime; }
    /**
     * TENHANSHA_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaCd() { return _columnTenhanshaCd; }
    /**
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgCd() { return _columnSalesOrgCd; }
    /**
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaOrderNo() { return _columnTenhanshaOrderNo; }
    /**
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKohaiContractorCd() { return _columnKohaiContractorCd; }
    /**
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKohaiContractorNm() { return _columnKohaiContractorNm; }
    /**
     * DESTINATION_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationCd() { return _columnDestinationCd; }
    /**
     * DESTINATION_NM1: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationNm1() { return _columnDestinationNm1; }
    /**
     * DESTINATION_NM2: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationNm2() { return _columnDestinationNm2; }
    /**
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationNmKana() { return _columnDestinationNmKana; }
    /**
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationZipCd() { return _columnDestinationZipCd; }
    /**
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationAddress1() { return _columnDestinationAddress1; }
    /**
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationAddress2() { return _columnDestinationAddress2; }
    /**
     * DESTINATION_TEL: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationTel() { return _columnDestinationTel; }
    /**
     * DESTINATION_FAX: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationFax() { return _columnDestinationFax; }
    /**
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanjiMessage1() { return _columnKanjiMessage1; }
    /**
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanjiMessage2() { return _columnKanjiMessage2; }
    /**
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanjiMessage3() { return _columnKanjiMessage3; }
    /**
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanjiMessage4() { return _columnKanjiMessage4; }
    /**
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanjiMessage5() { return _columnKanjiMessage5; }
    /**
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanjiMessage6() { return _columnKanjiMessage6; }
    /**
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanjiMessage7() { return _columnKanjiMessage7; }
    /**
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanjiMessage8() { return _columnKanjiMessage8; }
    /**
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanjiMessage9() { return _columnKanjiMessage9; }
    /**
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanjiMessage10() { return _columnKanjiMessage10; }
    /**
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanaMessage1() { return _columnKanaMessage1; }
    /**
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanaMessage2() { return _columnKanaMessage2; }
    /**
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanaMessage3() { return _columnKanaMessage3; }
    /**
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanaMessage4() { return _columnKanaMessage4; }
    /**
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanaMessage5() { return _columnKanaMessage5; }
    /**
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanaMessage6() { return _columnKanaMessage6; }
    /**
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanaMessage7() { return _columnKanaMessage7; }
    /**
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanaMessage8() { return _columnKanaMessage8; }
    /**
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanaMessage9() { return _columnKanaMessage9; }
    /**
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKanaMessage10() { return _columnKanaMessage10; }
    /**
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryNoteSummary() { return _columnDeliveryNoteSummary; }
    /**
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceSummary() { return _columnInvoiceSummary; }
    /**
     * UNIT_PRICE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitPrice() { return _columnUnitPrice; }
    /**
     * EC_ORDER_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEcOrderNo() { return _columnEcOrderNo; }
    /**
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEcOrderBranchNo() { return _columnEcOrderBranchNo; }
    /**
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEcProductNmKanji() { return _columnEcProductNmKanji; }
    /**
     * ORDER_DT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderDt() { return _columnOrderDt; }
    /**
     * KOKYAKU_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKokyakuCd() { return _columnKokyakuCd; }
    /**
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentTypeCd() { return _columnPaymentTypeCd; }
    /**
     * TOTAL_PRICE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalPrice() { return _columnTotalPrice; }
    /**
     * SHIPPING_FEE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingFee() { return _columnShippingFee; }
    /**
     * SEPARATE_SHIPPING_FEE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeparateShippingFee() { return _columnSeparateShippingFee; }
    /**
     * COD_FEE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCodFee() { return _columnCodFee; }
    /**
     * SALES_TAX_RATE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesTaxRate() { return _columnSalesTaxRate; }
    /**
     * PRICE_HIDDEN_FLG: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriceHiddenFlg() { return _columnPriceHiddenFlg; }
    /**
     * PAYMENT_HIDDEN_FLG: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentHiddenFlg() { return _columnPaymentHiddenFlg; }
    /**
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderNoDeliveryNote() { return _columnOrderNoDeliveryNote; }
    /**
     * POINT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPoint() { return _columnPoint; }
    /**
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStorePlantCd() { return _columnStorePlantCd; }
    /**
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreStorageSpaceCd() { return _columnStoreStorageSpaceCd; }
    /**
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingPlantCd() { return _columnShippingPlantCd; }
    /**
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStorageSpaceCd() { return _columnShippingStorageSpaceCd; }
    /**
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotManagTypeCd() { return _columnLotManagTypeCd; }
    /**
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDealTypeCd() { return _columnDealTypeCd; }
    /**
     * CUSTOMER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerCd() { return _columnCustomerCd; }
    /**
     * CUSTOMER_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerNm() { return _columnCustomerNm; }
    /**
     * DELIV_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCd() { return _columnDelivCd; }
    /**
     * EMP_ID_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmpIdCd() { return _columnEmpIdCd; }
    /**
     * EMP_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmpNm() { return _columnEmpNm; }
    /**
     * IF_ID: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIfId() { return _columnIfId; }
    /**
     * DESTINATION_PREFECTURE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationPrefecture() { return _columnDestinationPrefecture; }
    /**
     * PSAM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPsam() { return _columnPsam; }
    /**
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFloorCompFlg() { return _columnFloorCompFlg; }
    /**
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddYyyy() { return _columnSapAddYyyy; }
    /**
     * SAP_ADD_MM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddMm() { return _columnSapAddMm; }
    /**
     * SAP_ADD_DD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddDd() { return _columnSapAddDd; }
    /**
     * SAP_ADD_HH: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddHh() { return _columnSapAddHh; }
    /**
     * SAP_ADD_MI: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddMi() { return _columnSapAddMi; }
    /**
     * SAP_ADD_SS: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddSs() { return _columnSapAddSs; }
    /**
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddUserCd() { return _columnSapAddUserCd; }
    /**
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdYyyy() { return _columnSapUpdYyyy; }
    /**
     * SAP_UPD_MM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdMm() { return _columnSapUpdMm; }
    /**
     * SAP_UPD_DD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdDd() { return _columnSapUpdDd; }
    /**
     * SAP_UPD_HH: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdHh() { return _columnSapUpdHh; }
    /**
     * SAP_UPD_MI: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdMi() { return _columnSapUpdMi; }
    /**
     * SAP_UPD_SS: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdSs() { return _columnSapUpdSs; }
    /**
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdUserCd() { return _columnSapUpdUserCd; }
    /**
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr01() { return _columnDataTransferOnlyStr01; }
    /**
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr02() { return _columnDataTransferOnlyStr02; }
    /**
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr03() { return _columnDataTransferOnlyStr03; }
    /**
     * SPARE_STR: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareStr() { return _columnSpareStr; }
    /**
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }
    /**
     * ADD_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
    /**
     * ADD_USER: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddUser() { return _columnAddUser; }
    /**
     * ADD_PROCESS: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddProcess() { return _columnAddProcess; }
    /**
     * UPD_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * UPD_USER: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdUser() { return _columnUpdUser; }
    /**
     * UPD_PROCESS: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdProcess() { return _columnUpdProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnShippingInstId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnShippingSlipNo());
        ls.add(columnShippingSlipRowNo());
        ls.add(columnSalesOrderNo());
        ls.add(columnHinmokuCd());
        ls.add(columnSalesOrderSlipTypeCd());
        ls.add(columnSalesOrderSlipNo());
        ls.add(columnNizoroeNo());
        ls.add(columnShippingTypeCd());
        ls.add(columnShippingReasonCd());
        ls.add(columnHinmokuGroup());
        ls.add(columnShippingNum());
        ls.add(columnHinmokuText());
        ls.add(columnJanCd());
        ls.add(columnUnitNm());
        ls.add(columnEcUnitNm());
        ls.add(columnSampleTypeCd());
        ls.add(columnLogiWeightFlg());
        ls.add(columnLogiAttentionTypeCd());
        ls.add(columnLogiSpecialTypeCd());
        ls.add(columnDirectDeliveryTypeCd());
        ls.add(columnKoguchiDeliveryFlg());
        ls.add(columnSplitDeliveryTypeCd());
        ls.add(columnCarrierTypeCd());
        ls.add(columnCarrierCd());
        ls.add(columnExpressCd());
        ls.add(columnShippingDt());
        ls.add(columnSpecifyDeliveryDt());
        ls.add(columnSpecifyDeliveryTime());
        ls.add(columnTenhanshaCd());
        ls.add(columnSalesOrgCd());
        ls.add(columnTenhanshaOrderNo());
        ls.add(columnKohaiContractorCd());
        ls.add(columnKohaiContractorNm());
        ls.add(columnDestinationCd());
        ls.add(columnDestinationNm1());
        ls.add(columnDestinationNm2());
        ls.add(columnDestinationNmKana());
        ls.add(columnDestinationZipCd());
        ls.add(columnDestinationAddress1());
        ls.add(columnDestinationAddress2());
        ls.add(columnDestinationTel());
        ls.add(columnDestinationFax());
        ls.add(columnKanjiMessage1());
        ls.add(columnKanjiMessage2());
        ls.add(columnKanjiMessage3());
        ls.add(columnKanjiMessage4());
        ls.add(columnKanjiMessage5());
        ls.add(columnKanjiMessage6());
        ls.add(columnKanjiMessage7());
        ls.add(columnKanjiMessage8());
        ls.add(columnKanjiMessage9());
        ls.add(columnKanjiMessage10());
        ls.add(columnKanaMessage1());
        ls.add(columnKanaMessage2());
        ls.add(columnKanaMessage3());
        ls.add(columnKanaMessage4());
        ls.add(columnKanaMessage5());
        ls.add(columnKanaMessage6());
        ls.add(columnKanaMessage7());
        ls.add(columnKanaMessage8());
        ls.add(columnKanaMessage9());
        ls.add(columnKanaMessage10());
        ls.add(columnDeliveryNoteSummary());
        ls.add(columnInvoiceSummary());
        ls.add(columnUnitPrice());
        ls.add(columnEcOrderNo());
        ls.add(columnEcOrderBranchNo());
        ls.add(columnEcProductNmKanji());
        ls.add(columnOrderDt());
        ls.add(columnKokyakuCd());
        ls.add(columnPaymentTypeCd());
        ls.add(columnTotalPrice());
        ls.add(columnShippingFee());
        ls.add(columnSeparateShippingFee());
        ls.add(columnCodFee());
        ls.add(columnSalesTaxRate());
        ls.add(columnPriceHiddenFlg());
        ls.add(columnPaymentHiddenFlg());
        ls.add(columnOrderNoDeliveryNote());
        ls.add(columnPoint());
        ls.add(columnStorePlantCd());
        ls.add(columnStoreStorageSpaceCd());
        ls.add(columnShippingPlantCd());
        ls.add(columnShippingStorageSpaceCd());
        ls.add(columnLotManagTypeCd());
        ls.add(columnDealTypeCd());
        ls.add(columnCustomerCd());
        ls.add(columnCustomerNm());
        ls.add(columnDelivCd());
        ls.add(columnEmpIdCd());
        ls.add(columnEmpNm());
        ls.add(columnIfId());
        ls.add(columnDestinationPrefecture());
        ls.add(columnPsam());
        ls.add(columnFloorCompFlg());
        ls.add(columnSapAddYyyy());
        ls.add(columnSapAddMm());
        ls.add(columnSapAddDd());
        ls.add(columnSapAddHh());
        ls.add(columnSapAddMi());
        ls.add(columnSapAddSs());
        ls.add(columnSapAddUserCd());
        ls.add(columnSapUpdYyyy());
        ls.add(columnSapUpdMm());
        ls.add(columnSapUpdDd());
        ls.add(columnSapUpdHh());
        ls.add(columnSapUpdMi());
        ls.add(columnSapUpdSs());
        ls.add(columnSapUpdUserCd());
        ls.add(columnDataTransferOnlyStr01());
        ls.add(columnDataTransferOnlyStr02());
        ls.add(columnDataTransferOnlyStr03());
        ls.add(columnSpareStr());
        ls.add(columnDelFlg());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnAddProcess());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUpdProcess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnShippingInstId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnDelFlg(), columnVersionNo(), columnControlNo(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnDelFlg(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdDt(), columnUpdUser(), columnUpdProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EShippingInst"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EShippingInstCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EShippingInstBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EShippingInst> getEntityType() { return EShippingInst.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EShippingInst newEntity() { return new EShippingInst(); }
    public EShippingInst newMyEntity() { return new EShippingInst(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EShippingInst)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EShippingInst)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
