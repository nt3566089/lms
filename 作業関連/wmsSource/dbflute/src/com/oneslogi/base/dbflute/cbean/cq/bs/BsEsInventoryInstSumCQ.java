package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.cq.ciq.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The base condition-query of es_inventory_inst_sum.
 * @author DBFlute(AutoGenerator)
 */
public class BsEsInventoryInstSumCQ extends AbstractBsEsInventoryInstSumCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EsInventoryInstSumCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEsInventoryInstSumCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from es_inventory_inst_sum) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EsInventoryInstSumCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EsInventoryInstSumCIQ xcreateCIQ() {
        EsInventoryInstSumCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EsInventoryInstSumCIQ xnewCIQ() {
        return new EsInventoryInstSumCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join es_inventory_inst_sum on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EsInventoryInstSumCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EsInventoryInstSumCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _inventoryInstId;
    public ConditionValue xdfgetInventoryInstId()
    { if (_inventoryInstId == null) { _inventoryInstId = nCV(); }
      return _inventoryInstId; }
    protected ConditionValue xgetCValueInventoryInstId() { return xdfgetInventoryInstId(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_INST_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_InventoryInstId_Asc() { regOBA("INVENTORY_INST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_INST_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_InventoryInstId_Desc() { regOBD("INVENTORY_INST_ID"); return this; }

    protected ConditionValue _sendFlg;
    public ConditionValue xdfgetSendFlg()
    { if (_sendFlg == null) { _sendFlg = nCV(); }
      return _sendFlg; }
    protected ConditionValue xgetCValueSendFlg() { return xdfgetSendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SendFlg_Asc() { regOBA("SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SendFlg_Desc() { regOBD("SEND_FLG"); return this; }

    protected ConditionValue _inventorySlipNo;
    public ConditionValue xdfgetInventorySlipNo()
    { if (_inventorySlipNo == null) { _inventorySlipNo = nCV(); }
      return _inventorySlipNo; }
    protected ConditionValue xgetCValueInventorySlipNo() { return xdfgetInventorySlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_InventorySlipNo_Asc() { regOBA("INVENTORY_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_InventorySlipNo_Desc() { regOBD("INVENTORY_SLIP_NO"); return this; }

    protected ConditionValue _fiscalYear;
    public ConditionValue xdfgetFiscalYear()
    { if (_fiscalYear == null) { _fiscalYear = nCV(); }
      return _fiscalYear; }
    protected ConditionValue xgetCValueFiscalYear() { return xdfgetFiscalYear(); }

    /**
     * Add order-by as ascend. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_FiscalYear_Asc() { regOBA("FISCAL_YEAR"); return this; }

    /**
     * Add order-by as descend. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_FiscalYear_Desc() { regOBD("FISCAL_YEAR"); return this; }

    protected ConditionValue _inventorySlipRowNo;
    public ConditionValue xdfgetInventorySlipRowNo()
    { if (_inventorySlipRowNo == null) { _inventorySlipRowNo = nCV(); }
      return _inventorySlipRowNo; }
    protected ConditionValue xgetCValueInventorySlipRowNo() { return xdfgetInventorySlipRowNo(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_InventorySlipRowNo_Asc() { regOBA("INVENTORY_SLIP_ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_InventorySlipRowNo_Desc() { regOBD("INVENTORY_SLIP_ROW_NO"); return this; }

    protected ConditionValue _plantCd;
    public ConditionValue xdfgetPlantCd()
    { if (_plantCd == null) { _plantCd = nCV(); }
      return _plantCd; }
    protected ConditionValue xgetCValuePlantCd() { return xdfgetPlantCd(); }

    /**
     * Add order-by as ascend. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_PlantCd_Asc() { regOBA("PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_PlantCd_Desc() { regOBD("PLANT_CD"); return this; }

    protected ConditionValue _storageSpaceCd;
    public ConditionValue xdfgetStorageSpaceCd()
    { if (_storageSpaceCd == null) { _storageSpaceCd = nCV(); }
      return _storageSpaceCd; }
    protected ConditionValue xgetCValueStorageSpaceCd() { return xdfgetStorageSpaceCd(); }

    /**
     * Add order-by as ascend. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_StorageSpaceCd_Asc() { regOBA("STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_StorageSpaceCd_Desc() { regOBD("STORAGE_SPACE_CD"); return this; }

    protected ConditionValue _referenceDt;
    public ConditionValue xdfgetReferenceDt()
    { if (_referenceDt == null) { _referenceDt = nCV(); }
      return _referenceDt; }
    protected ConditionValue xgetCValueReferenceDt() { return xdfgetReferenceDt(); }

    /**
     * Add order-by as ascend. <br>
     * REFERENCE_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_ReferenceDt_Asc() { regOBA("REFERENCE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFERENCE_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_ReferenceDt_Desc() { regOBD("REFERENCE_DT"); return this; }

    protected ConditionValue _unitNm;
    public ConditionValue xdfgetUnitNm()
    { if (_unitNm == null) { _unitNm = nCV(); }
      return _unitNm; }
    protected ConditionValue xgetCValueUnitNm() { return xdfgetUnitNm(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_UnitNm_Asc() { regOBA("UNIT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_UnitNm_Desc() { regOBD("UNIT_NM"); return this; }

    protected ConditionValue _sapAddYyyy;
    public ConditionValue xdfgetSapAddYyyy()
    { if (_sapAddYyyy == null) { _sapAddYyyy = nCV(); }
      return _sapAddYyyy; }
    protected ConditionValue xgetCValueSapAddYyyy() { return xdfgetSapAddYyyy(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapAddYyyy_Asc() { regOBA("SAP_ADD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapAddYyyy_Desc() { regOBD("SAP_ADD_YYYY"); return this; }

    protected ConditionValue _sapAddMm;
    public ConditionValue xdfgetSapAddMm()
    { if (_sapAddMm == null) { _sapAddMm = nCV(); }
      return _sapAddMm; }
    protected ConditionValue xgetCValueSapAddMm() { return xdfgetSapAddMm(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapAddMm_Asc() { regOBA("SAP_ADD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapAddMm_Desc() { regOBD("SAP_ADD_MM"); return this; }

    protected ConditionValue _sapAddDd;
    public ConditionValue xdfgetSapAddDd()
    { if (_sapAddDd == null) { _sapAddDd = nCV(); }
      return _sapAddDd; }
    protected ConditionValue xgetCValueSapAddDd() { return xdfgetSapAddDd(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapAddDd_Asc() { regOBA("SAP_ADD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapAddDd_Desc() { regOBD("SAP_ADD_DD"); return this; }

    protected ConditionValue _sapAddHh;
    public ConditionValue xdfgetSapAddHh()
    { if (_sapAddHh == null) { _sapAddHh = nCV(); }
      return _sapAddHh; }
    protected ConditionValue xgetCValueSapAddHh() { return xdfgetSapAddHh(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapAddHh_Asc() { regOBA("SAP_ADD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapAddHh_Desc() { regOBD("SAP_ADD_HH"); return this; }

    protected ConditionValue _sapAddMi;
    public ConditionValue xdfgetSapAddMi()
    { if (_sapAddMi == null) { _sapAddMi = nCV(); }
      return _sapAddMi; }
    protected ConditionValue xgetCValueSapAddMi() { return xdfgetSapAddMi(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapAddMi_Asc() { regOBA("SAP_ADD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapAddMi_Desc() { regOBD("SAP_ADD_MI"); return this; }

    protected ConditionValue _sapAddSs;
    public ConditionValue xdfgetSapAddSs()
    { if (_sapAddSs == null) { _sapAddSs = nCV(); }
      return _sapAddSs; }
    protected ConditionValue xgetCValueSapAddSs() { return xdfgetSapAddSs(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapAddSs_Asc() { regOBA("SAP_ADD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapAddSs_Desc() { regOBD("SAP_ADD_SS"); return this; }

    protected ConditionValue _sapAddUserCd;
    public ConditionValue xdfgetSapAddUserCd()
    { if (_sapAddUserCd == null) { _sapAddUserCd = nCV(); }
      return _sapAddUserCd; }
    protected ConditionValue xgetCValueSapAddUserCd() { return xdfgetSapAddUserCd(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapAddUserCd_Asc() { regOBA("SAP_ADD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapAddUserCd_Desc() { regOBD("SAP_ADD_USER_CD"); return this; }

    protected ConditionValue _sapUpdYyyy;
    public ConditionValue xdfgetSapUpdYyyy()
    { if (_sapUpdYyyy == null) { _sapUpdYyyy = nCV(); }
      return _sapUpdYyyy; }
    protected ConditionValue xgetCValueSapUpdYyyy() { return xdfgetSapUpdYyyy(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapUpdYyyy_Asc() { regOBA("SAP_UPD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapUpdYyyy_Desc() { regOBD("SAP_UPD_YYYY"); return this; }

    protected ConditionValue _sapUpdMm;
    public ConditionValue xdfgetSapUpdMm()
    { if (_sapUpdMm == null) { _sapUpdMm = nCV(); }
      return _sapUpdMm; }
    protected ConditionValue xgetCValueSapUpdMm() { return xdfgetSapUpdMm(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapUpdMm_Asc() { regOBA("SAP_UPD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapUpdMm_Desc() { regOBD("SAP_UPD_MM"); return this; }

    protected ConditionValue _sapUpdDd;
    public ConditionValue xdfgetSapUpdDd()
    { if (_sapUpdDd == null) { _sapUpdDd = nCV(); }
      return _sapUpdDd; }
    protected ConditionValue xgetCValueSapUpdDd() { return xdfgetSapUpdDd(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapUpdDd_Asc() { regOBA("SAP_UPD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapUpdDd_Desc() { regOBD("SAP_UPD_DD"); return this; }

    protected ConditionValue _sapUpdHh;
    public ConditionValue xdfgetSapUpdHh()
    { if (_sapUpdHh == null) { _sapUpdHh = nCV(); }
      return _sapUpdHh; }
    protected ConditionValue xgetCValueSapUpdHh() { return xdfgetSapUpdHh(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapUpdHh_Asc() { regOBA("SAP_UPD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapUpdHh_Desc() { regOBD("SAP_UPD_HH"); return this; }

    protected ConditionValue _sapUpdMi;
    public ConditionValue xdfgetSapUpdMi()
    { if (_sapUpdMi == null) { _sapUpdMi = nCV(); }
      return _sapUpdMi; }
    protected ConditionValue xgetCValueSapUpdMi() { return xdfgetSapUpdMi(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapUpdMi_Asc() { regOBA("SAP_UPD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapUpdMi_Desc() { regOBD("SAP_UPD_MI"); return this; }

    protected ConditionValue _sapUpdSs;
    public ConditionValue xdfgetSapUpdSs()
    { if (_sapUpdSs == null) { _sapUpdSs = nCV(); }
      return _sapUpdSs; }
    protected ConditionValue xgetCValueSapUpdSs() { return xdfgetSapUpdSs(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapUpdSs_Asc() { regOBA("SAP_UPD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapUpdSs_Desc() { regOBD("SAP_UPD_SS"); return this; }

    protected ConditionValue _sapUpdUserCd;
    public ConditionValue xdfgetSapUpdUserCd()
    { if (_sapUpdUserCd == null) { _sapUpdUserCd = nCV(); }
      return _sapUpdUserCd; }
    protected ConditionValue xgetCValueSapUpdUserCd() { return xdfgetSapUpdUserCd(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapUpdUserCd_Asc() { regOBA("SAP_UPD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SapUpdUserCd_Desc() { regOBD("SAP_UPD_USER_CD"); return this; }

    protected ConditionValue _spareStr;
    public ConditionValue xdfgetSpareStr()
    { if (_spareStr == null) { _spareStr = nCV(); }
      return _spareStr; }
    protected ConditionValue xgetCValueSpareStr() { return xdfgetSpareStr(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SpareStr_Asc() { regOBA("SPARE_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_SpareStr_Desc() { regOBD("SPARE_STR"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    protected ConditionValue _controlNo;
    public ConditionValue xdfgetControlNo()
    { if (_controlNo == null) { _controlNo = nCV(); }
      return _controlNo; }
    protected ConditionValue xgetCValueControlNo() { return xdfgetControlNo(); }

    /**
     * Add order-by as ascend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

    protected ConditionValue _addDt;
    public ConditionValue xdfgetAddDt()
    { if (_addDt == null) { _addDt = nCV(); }
      return _addDt; }
    protected ConditionValue xgetCValueAddDt() { return xdfgetAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

    protected ConditionValue _addUser;
    public ConditionValue xdfgetAddUser()
    { if (_addUser == null) { _addUser = nCV(); }
      return _addUser; }
    protected ConditionValue xgetCValueAddUser() { return xdfgetAddUser(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

    protected ConditionValue _addProcess;
    public ConditionValue xdfgetAddProcess()
    { if (_addProcess == null) { _addProcess = nCV(); }
      return _addProcess; }
    protected ConditionValue xgetCValueAddProcess() { return xdfgetAddProcess(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

    protected ConditionValue _updDt;
    public ConditionValue xdfgetUpdDt()
    { if (_updDt == null) { _updDt = nCV(); }
      return _updDt; }
    protected ConditionValue xgetCValueUpdDt() { return xdfgetUpdDt(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

    protected ConditionValue _updUser;
    public ConditionValue xdfgetUpdUser()
    { if (_updUser == null) { _updUser = nCV(); }
      return _updUser; }
    protected ConditionValue xgetCValueUpdUser() { return xdfgetUpdUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

    protected ConditionValue _updProcess;
    public ConditionValue xdfgetUpdProcess()
    { if (_updProcess == null) { _updProcess = nCV(); }
      return _updProcess; }
    protected ConditionValue xgetCValueUpdProcess() { return xdfgetUpdProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsEsInventoryInstSumCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, EsInventoryInstSumCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EsInventoryInstSumCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EsInventoryInstSumCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EsInventoryInstSumCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EsInventoryInstSumCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EsInventoryInstSumCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EsInventoryInstSumCQ> _myselfExistsMap;
    public Map<String, EsInventoryInstSumCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EsInventoryInstSumCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EsInventoryInstSumCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EsInventoryInstSumCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EsInventoryInstSumCB.class.getName(); }
    protected String xCQ() { return EsInventoryInstSumCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
