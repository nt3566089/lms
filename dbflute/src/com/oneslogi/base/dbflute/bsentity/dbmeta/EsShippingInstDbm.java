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
 * The DB meta of es_shipping_inst. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EsShippingInstDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EsShippingInstDbm _instance = new EsShippingInstDbm();
    private EsShippingInstDbm() {}
    public static EsShippingInstDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getShippingInstId(), (et, vl) -> ((EsShippingInst)et).setShippingInstId(ctl(vl)), "shippingInstId");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSendFlg(), (et, vl) -> ((EsShippingInst)et).setSendFlg((String)vl), "sendFlg");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getShippingSlipNo(), (et, vl) -> ((EsShippingInst)et).setShippingSlipNo((String)vl), "shippingSlipNo");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getShippingSlipRowNo(), (et, vl) -> ((EsShippingInst)et).setShippingSlipRowNo((String)vl), "shippingSlipRowNo");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSalesOrderNo(), (et, vl) -> ((EsShippingInst)et).setSalesOrderNo((String)vl), "salesOrderNo");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getHinmokuCd(), (et, vl) -> ((EsShippingInst)et).setHinmokuCd((String)vl), "hinmokuCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSalesOrderSlipTypeCd(), (et, vl) -> ((EsShippingInst)et).setSalesOrderSlipTypeCd((String)vl), "salesOrderSlipTypeCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSalesOrderSlipNo(), (et, vl) -> ((EsShippingInst)et).setSalesOrderSlipNo((String)vl), "salesOrderSlipNo");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getNizoroeNo(), (et, vl) -> ((EsShippingInst)et).setNizoroeNo((String)vl), "nizoroeNo");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getShippingTypeCd(), (et, vl) -> ((EsShippingInst)et).setShippingTypeCd((String)vl), "shippingTypeCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getShippingReasonCd(), (et, vl) -> ((EsShippingInst)et).setShippingReasonCd((String)vl), "shippingReasonCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getHinmokuGroup(), (et, vl) -> ((EsShippingInst)et).setHinmokuGroup((String)vl), "hinmokuGroup");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getShippingNum(), (et, vl) -> ((EsShippingInst)et).setShippingNum((String)vl), "shippingNum");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSalesOrderNum(), (et, vl) -> ((EsShippingInst)et).setSalesOrderNum((String)vl), "salesOrderNum");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getHinmokuText(), (et, vl) -> ((EsShippingInst)et).setHinmokuText((String)vl), "hinmokuText");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getJanCd(), (et, vl) -> ((EsShippingInst)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getUnitNm(), (et, vl) -> ((EsShippingInst)et).setUnitNm((String)vl), "unitNm");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getEcUnitNm(), (et, vl) -> ((EsShippingInst)et).setEcUnitNm((String)vl), "ecUnitNm");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSampleTypeCd(), (et, vl) -> ((EsShippingInst)et).setSampleTypeCd((String)vl), "sampleTypeCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getLogiWeightFlg(), (et, vl) -> ((EsShippingInst)et).setLogiWeightFlg((String)vl), "logiWeightFlg");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getLogiAttentionTypeCd(), (et, vl) -> ((EsShippingInst)et).setLogiAttentionTypeCd((String)vl), "logiAttentionTypeCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getLogiSpecialTypeCd(), (et, vl) -> ((EsShippingInst)et).setLogiSpecialTypeCd((String)vl), "logiSpecialTypeCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getDirectDeliveryTypeCd(), (et, vl) -> ((EsShippingInst)et).setDirectDeliveryTypeCd((String)vl), "directDeliveryTypeCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKoguchiDeliveryFlg(), (et, vl) -> ((EsShippingInst)et).setKoguchiDeliveryFlg((String)vl), "koguchiDeliveryFlg");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSplitDeliveryTypeCd(), (et, vl) -> ((EsShippingInst)et).setSplitDeliveryTypeCd((String)vl), "splitDeliveryTypeCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getCarrierTypeCd(), (et, vl) -> ((EsShippingInst)et).setCarrierTypeCd((String)vl), "carrierTypeCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getCarrierCd(), (et, vl) -> ((EsShippingInst)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getExpressCd(), (et, vl) -> ((EsShippingInst)et).setExpressCd((String)vl), "expressCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getShippingDt(), (et, vl) -> ((EsShippingInst)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSpecifyDeliveryDt(), (et, vl) -> ((EsShippingInst)et).setSpecifyDeliveryDt((String)vl), "specifyDeliveryDt");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSpecifyDeliveryTime(), (et, vl) -> ((EsShippingInst)et).setSpecifyDeliveryTime((String)vl), "specifyDeliveryTime");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getTenhanshaCd(), (et, vl) -> ((EsShippingInst)et).setTenhanshaCd((String)vl), "tenhanshaCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSalesOrgCd(), (et, vl) -> ((EsShippingInst)et).setSalesOrgCd((String)vl), "salesOrgCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getTenhanshaOrderNo(), (et, vl) -> ((EsShippingInst)et).setTenhanshaOrderNo((String)vl), "tenhanshaOrderNo");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKohaiContractorCd(), (et, vl) -> ((EsShippingInst)et).setKohaiContractorCd((String)vl), "kohaiContractorCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKohaiContractorNm(), (et, vl) -> ((EsShippingInst)et).setKohaiContractorNm((String)vl), "kohaiContractorNm");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getDestinationCd(), (et, vl) -> ((EsShippingInst)et).setDestinationCd((String)vl), "destinationCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getDestinationNm1(), (et, vl) -> ((EsShippingInst)et).setDestinationNm1((String)vl), "destinationNm1");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getDestinationNm2(), (et, vl) -> ((EsShippingInst)et).setDestinationNm2((String)vl), "destinationNm2");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getDestinationNmKana(), (et, vl) -> ((EsShippingInst)et).setDestinationNmKana((String)vl), "destinationNmKana");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getDestinationZipCd(), (et, vl) -> ((EsShippingInst)et).setDestinationZipCd((String)vl), "destinationZipCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getDestinationAddress1(), (et, vl) -> ((EsShippingInst)et).setDestinationAddress1((String)vl), "destinationAddress1");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getDestinationAddress2(), (et, vl) -> ((EsShippingInst)et).setDestinationAddress2((String)vl), "destinationAddress2");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getDestinationTel(), (et, vl) -> ((EsShippingInst)et).setDestinationTel((String)vl), "destinationTel");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getDestinationFax(), (et, vl) -> ((EsShippingInst)et).setDestinationFax((String)vl), "destinationFax");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanjiMessage1(), (et, vl) -> ((EsShippingInst)et).setKanjiMessage1((String)vl), "kanjiMessage1");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanjiMessage2(), (et, vl) -> ((EsShippingInst)et).setKanjiMessage2((String)vl), "kanjiMessage2");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanjiMessage3(), (et, vl) -> ((EsShippingInst)et).setKanjiMessage3((String)vl), "kanjiMessage3");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanjiMessage4(), (et, vl) -> ((EsShippingInst)et).setKanjiMessage4((String)vl), "kanjiMessage4");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanjiMessage5(), (et, vl) -> ((EsShippingInst)et).setKanjiMessage5((String)vl), "kanjiMessage5");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanjiMessage6(), (et, vl) -> ((EsShippingInst)et).setKanjiMessage6((String)vl), "kanjiMessage6");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanjiMessage7(), (et, vl) -> ((EsShippingInst)et).setKanjiMessage7((String)vl), "kanjiMessage7");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanjiMessage8(), (et, vl) -> ((EsShippingInst)et).setKanjiMessage8((String)vl), "kanjiMessage8");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanjiMessage9(), (et, vl) -> ((EsShippingInst)et).setKanjiMessage9((String)vl), "kanjiMessage9");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanjiMessage10(), (et, vl) -> ((EsShippingInst)et).setKanjiMessage10((String)vl), "kanjiMessage10");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanaMessage1(), (et, vl) -> ((EsShippingInst)et).setKanaMessage1((String)vl), "kanaMessage1");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanaMessage2(), (et, vl) -> ((EsShippingInst)et).setKanaMessage2((String)vl), "kanaMessage2");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanaMessage3(), (et, vl) -> ((EsShippingInst)et).setKanaMessage3((String)vl), "kanaMessage3");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanaMessage4(), (et, vl) -> ((EsShippingInst)et).setKanaMessage4((String)vl), "kanaMessage4");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanaMessage5(), (et, vl) -> ((EsShippingInst)et).setKanaMessage5((String)vl), "kanaMessage5");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanaMessage6(), (et, vl) -> ((EsShippingInst)et).setKanaMessage6((String)vl), "kanaMessage6");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanaMessage7(), (et, vl) -> ((EsShippingInst)et).setKanaMessage7((String)vl), "kanaMessage7");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanaMessage8(), (et, vl) -> ((EsShippingInst)et).setKanaMessage8((String)vl), "kanaMessage8");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanaMessage9(), (et, vl) -> ((EsShippingInst)et).setKanaMessage9((String)vl), "kanaMessage9");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKanaMessage10(), (et, vl) -> ((EsShippingInst)et).setKanaMessage10((String)vl), "kanaMessage10");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getDeliveryNoteSummary(), (et, vl) -> ((EsShippingInst)et).setDeliveryNoteSummary((String)vl), "deliveryNoteSummary");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getInvoiceSummary(), (et, vl) -> ((EsShippingInst)et).setInvoiceSummary((String)vl), "invoiceSummary");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getUnitPrice(), (et, vl) -> ((EsShippingInst)et).setUnitPrice((String)vl), "unitPrice");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getEcOrderNo(), (et, vl) -> ((EsShippingInst)et).setEcOrderNo((String)vl), "ecOrderNo");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getEcOrderBranchNo(), (et, vl) -> ((EsShippingInst)et).setEcOrderBranchNo((String)vl), "ecOrderBranchNo");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getEcProductNmKanji(), (et, vl) -> ((EsShippingInst)et).setEcProductNmKanji((String)vl), "ecProductNmKanji");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getOrderDt(), (et, vl) -> ((EsShippingInst)et).setOrderDt((String)vl), "orderDt");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getKokyakuCd(), (et, vl) -> ((EsShippingInst)et).setKokyakuCd((String)vl), "kokyakuCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getPaymentTypeCd(), (et, vl) -> ((EsShippingInst)et).setPaymentTypeCd((String)vl), "paymentTypeCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getTotalPrice(), (et, vl) -> ((EsShippingInst)et).setTotalPrice((String)vl), "totalPrice");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getShippingFee(), (et, vl) -> ((EsShippingInst)et).setShippingFee((String)vl), "shippingFee");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSeparateShippingFee(), (et, vl) -> ((EsShippingInst)et).setSeparateShippingFee((String)vl), "separateShippingFee");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getCodFee(), (et, vl) -> ((EsShippingInst)et).setCodFee((String)vl), "codFee");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSalesTaxRate(), (et, vl) -> ((EsShippingInst)et).setSalesTaxRate((String)vl), "salesTaxRate");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getPriceHiddenFlg(), (et, vl) -> ((EsShippingInst)et).setPriceHiddenFlg((String)vl), "priceHiddenFlg");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getPaymentHiddenFlg(), (et, vl) -> ((EsShippingInst)et).setPaymentHiddenFlg((String)vl), "paymentHiddenFlg");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getOrderNoDeliveryNote(), (et, vl) -> ((EsShippingInst)et).setOrderNoDeliveryNote((String)vl), "orderNoDeliveryNote");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getPoint(), (et, vl) -> ((EsShippingInst)et).setPoint((String)vl), "point");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getStorePlantCd(), (et, vl) -> ((EsShippingInst)et).setStorePlantCd((String)vl), "storePlantCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getStoreStorageSpaceCd(), (et, vl) -> ((EsShippingInst)et).setStoreStorageSpaceCd((String)vl), "storeStorageSpaceCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getShippingPlantCd(), (et, vl) -> ((EsShippingInst)et).setShippingPlantCd((String)vl), "shippingPlantCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getShippingStorageSpaceCd(), (et, vl) -> ((EsShippingInst)et).setShippingStorageSpaceCd((String)vl), "shippingStorageSpaceCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getLotManagTypeCd(), (et, vl) -> ((EsShippingInst)et).setLotManagTypeCd((String)vl), "lotManagTypeCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getDealTypeCd(), (et, vl) -> ((EsShippingInst)et).setDealTypeCd((String)vl), "dealTypeCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getCustomerCd(), (et, vl) -> ((EsShippingInst)et).setCustomerCd((String)vl), "customerCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getCustomerNm(), (et, vl) -> ((EsShippingInst)et).setCustomerNm((String)vl), "customerNm");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getDelivCd(), (et, vl) -> ((EsShippingInst)et).setDelivCd((String)vl), "delivCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getEmpIdCd(), (et, vl) -> ((EsShippingInst)et).setEmpIdCd((String)vl), "empIdCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getEmpNm(), (et, vl) -> ((EsShippingInst)et).setEmpNm((String)vl), "empNm");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSapAddYyyy(), (et, vl) -> ((EsShippingInst)et).setSapAddYyyy((String)vl), "sapAddYyyy");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSapAddMm(), (et, vl) -> ((EsShippingInst)et).setSapAddMm((String)vl), "sapAddMm");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSapAddDd(), (et, vl) -> ((EsShippingInst)et).setSapAddDd((String)vl), "sapAddDd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSapAddHh(), (et, vl) -> ((EsShippingInst)et).setSapAddHh((String)vl), "sapAddHh");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSapAddMi(), (et, vl) -> ((EsShippingInst)et).setSapAddMi((String)vl), "sapAddMi");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSapAddSs(), (et, vl) -> ((EsShippingInst)et).setSapAddSs((String)vl), "sapAddSs");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSapAddUserCd(), (et, vl) -> ((EsShippingInst)et).setSapAddUserCd((String)vl), "sapAddUserCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSapUpdYyyy(), (et, vl) -> ((EsShippingInst)et).setSapUpdYyyy((String)vl), "sapUpdYyyy");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSapUpdMm(), (et, vl) -> ((EsShippingInst)et).setSapUpdMm((String)vl), "sapUpdMm");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSapUpdDd(), (et, vl) -> ((EsShippingInst)et).setSapUpdDd((String)vl), "sapUpdDd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSapUpdHh(), (et, vl) -> ((EsShippingInst)et).setSapUpdHh((String)vl), "sapUpdHh");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSapUpdMi(), (et, vl) -> ((EsShippingInst)et).setSapUpdMi((String)vl), "sapUpdMi");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSapUpdSs(), (et, vl) -> ((EsShippingInst)et).setSapUpdSs((String)vl), "sapUpdSs");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSapUpdUserCd(), (et, vl) -> ((EsShippingInst)et).setSapUpdUserCd((String)vl), "sapUpdUserCd");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getDataTransferOnlyStr01(), (et, vl) -> ((EsShippingInst)et).setDataTransferOnlyStr01((String)vl), "dataTransferOnlyStr01");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getDataTransferOnlyStr02(), (et, vl) -> ((EsShippingInst)et).setDataTransferOnlyStr02((String)vl), "dataTransferOnlyStr02");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getDataTransferOnlyStr03(), (et, vl) -> ((EsShippingInst)et).setDataTransferOnlyStr03((String)vl), "dataTransferOnlyStr03");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getSpareStr(), (et, vl) -> ((EsShippingInst)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getDelFlg(), (et, vl) -> ((EsShippingInst)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getVersionNo(), (et, vl) -> ((EsShippingInst)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getControlNo(), (et, vl) -> ((EsShippingInst)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getAddDt(), (et, vl) -> ((EsShippingInst)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getAddUser(), (et, vl) -> ((EsShippingInst)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getAddProcess(), (et, vl) -> ((EsShippingInst)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getUpdDt(), (et, vl) -> ((EsShippingInst)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getUpdUser(), (et, vl) -> ((EsShippingInst)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EsShippingInst)et).getUpdProcess(), (et, vl) -> ((EsShippingInst)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "es_shipping_inst";
    protected final String _tableDispName = "es_shipping_inst";
    protected final String _tablePropertyName = "esShippingInst";
    protected final TableSqlName _tableSqlName = new TableSqlName("es_shipping_inst", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShippingInstId = cci("SHIPPING_INST_ID", "SHIPPING_INST_ID", null, null, Long.class, "shippingInstId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendFlg = cci("SEND_FLG", "SEND_FLG", null, null, String.class, "sendFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnSalesOrderNum = cci("SALES_ORDER_NUM", "SALES_ORDER_NUM", null, null, String.class, "salesOrderNum", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * SHIPPING_INST_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstId() { return _columnShippingInstId; }
    /**
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendFlg() { return _columnSendFlg; }
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
     * SALES_ORDER_NUM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrderNum() { return _columnSalesOrderNum; }
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
        ls.add(columnSendFlg());
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
        ls.add(columnSalesOrderNum());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EsShippingInst"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EsShippingInstCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EsShippingInstBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EsShippingInst> getEntityType() { return EsShippingInst.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EsShippingInst newEntity() { return new EsShippingInst(); }
    public EsShippingInst newMyEntity() { return new EsShippingInst(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EsShippingInst)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EsShippingInst)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
