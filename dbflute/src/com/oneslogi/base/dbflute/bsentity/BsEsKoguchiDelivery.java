package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of es_koguchi_delivery as TABLE. <br>
 * 戸口配送マスタ送信テーブル
 * <pre>
 * [primary-key]
 *     KOGUCHI_DELIVERY_ID
 *
 * [column]
 *     KOGUCHI_DELIVERY_ID, SEND_FLG, BASE_CD, SERV_SALES_ORG_CD, SERV_SALES_ORG_NM, DIRECT_FLG, URGENT_FLG, DELIVERY_FLG, KOGUCHI_DELIVERY_CD, KOGUCHI_DELIVERY_NM, UNI_DELIVERY_CD, UNI_DELIVERY_NM, FW_TYPE_CD, MCA_TYPE_CD, YOUHIN_TYPE_CD, REQ_SALES_ORG_CD, REQ_SALES_ORG_NM, REQ_SALES_ORG_BRANCH_NM, REQ_SALES_ORG_ADDRESS1, REQ_SALES_ORG_ADDRESS2, REQ_SALES_ORG_ZIP_CD, REQ_SALES_ORG_TEL_NO, REQ_SALES_ORG_FAX_NO, REMARK1, REMARK2, REMARK3, REMARK4, INDV_OUT, INVOICE_SUMMARY, PSAM, ABOLISH_DT, FLOOR_COMP_FLG, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long koguchiDeliveryId = entity.getKoguchiDeliveryId();
 * String sendFlg = entity.getSendFlg();
 * String baseCd = entity.getBaseCd();
 * String servSalesOrgCd = entity.getServSalesOrgCd();
 * String servSalesOrgNm = entity.getServSalesOrgNm();
 * String directFlg = entity.getDirectFlg();
 * String urgentFlg = entity.getUrgentFlg();
 * String deliveryFlg = entity.getDeliveryFlg();
 * String koguchiDeliveryCd = entity.getKoguchiDeliveryCd();
 * String koguchiDeliveryNm = entity.getKoguchiDeliveryNm();
 * String uniDeliveryCd = entity.getUniDeliveryCd();
 * String uniDeliveryNm = entity.getUniDeliveryNm();
 * String fwTypeCd = entity.getFwTypeCd();
 * String mcaTypeCd = entity.getMcaTypeCd();
 * String youhinTypeCd = entity.getYouhinTypeCd();
 * String reqSalesOrgCd = entity.getReqSalesOrgCd();
 * String reqSalesOrgNm = entity.getReqSalesOrgNm();
 * String reqSalesOrgBranchNm = entity.getReqSalesOrgBranchNm();
 * String reqSalesOrgAddress1 = entity.getReqSalesOrgAddress1();
 * String reqSalesOrgAddress2 = entity.getReqSalesOrgAddress2();
 * String reqSalesOrgZipCd = entity.getReqSalesOrgZipCd();
 * String reqSalesOrgTelNo = entity.getReqSalesOrgTelNo();
 * String reqSalesOrgFaxNo = entity.getReqSalesOrgFaxNo();
 * String remark1 = entity.getRemark1();
 * String remark2 = entity.getRemark2();
 * String remark3 = entity.getRemark3();
 * String remark4 = entity.getRemark4();
 * String indvOut = entity.getIndvOut();
 * String invoiceSummary = entity.getInvoiceSummary();
 * String psam = entity.getPsam();
 * String abolishDt = entity.getAbolishDt();
 * String floorCompFlg = entity.getFloorCompFlg();
 * String sapAddYyyy = entity.getSapAddYyyy();
 * String sapAddMm = entity.getSapAddMm();
 * String sapAddDd = entity.getSapAddDd();
 * String sapAddHh = entity.getSapAddHh();
 * String sapAddMi = entity.getSapAddMi();
 * String sapAddSs = entity.getSapAddSs();
 * String sapAddUserCd = entity.getSapAddUserCd();
 * String sapUpdYyyy = entity.getSapUpdYyyy();
 * String sapUpdMm = entity.getSapUpdMm();
 * String sapUpdDd = entity.getSapUpdDd();
 * String sapUpdHh = entity.getSapUpdHh();
 * String sapUpdMi = entity.getSapUpdMi();
 * String sapUpdSs = entity.getSapUpdSs();
 * String sapUpdUserCd = entity.getSapUpdUserCd();
 * String spareStr = entity.getSpareStr();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setKoguchiDeliveryId(koguchiDeliveryId);
 * entity.setSendFlg(sendFlg);
 * entity.setBaseCd(baseCd);
 * entity.setServSalesOrgCd(servSalesOrgCd);
 * entity.setServSalesOrgNm(servSalesOrgNm);
 * entity.setDirectFlg(directFlg);
 * entity.setUrgentFlg(urgentFlg);
 * entity.setDeliveryFlg(deliveryFlg);
 * entity.setKoguchiDeliveryCd(koguchiDeliveryCd);
 * entity.setKoguchiDeliveryNm(koguchiDeliveryNm);
 * entity.setUniDeliveryCd(uniDeliveryCd);
 * entity.setUniDeliveryNm(uniDeliveryNm);
 * entity.setFwTypeCd(fwTypeCd);
 * entity.setMcaTypeCd(mcaTypeCd);
 * entity.setYouhinTypeCd(youhinTypeCd);
 * entity.setReqSalesOrgCd(reqSalesOrgCd);
 * entity.setReqSalesOrgNm(reqSalesOrgNm);
 * entity.setReqSalesOrgBranchNm(reqSalesOrgBranchNm);
 * entity.setReqSalesOrgAddress1(reqSalesOrgAddress1);
 * entity.setReqSalesOrgAddress2(reqSalesOrgAddress2);
 * entity.setReqSalesOrgZipCd(reqSalesOrgZipCd);
 * entity.setReqSalesOrgTelNo(reqSalesOrgTelNo);
 * entity.setReqSalesOrgFaxNo(reqSalesOrgFaxNo);
 * entity.setRemark1(remark1);
 * entity.setRemark2(remark2);
 * entity.setRemark3(remark3);
 * entity.setRemark4(remark4);
 * entity.setIndvOut(indvOut);
 * entity.setInvoiceSummary(invoiceSummary);
 * entity.setPsam(psam);
 * entity.setAbolishDt(abolishDt);
 * entity.setFloorCompFlg(floorCompFlg);
 * entity.setSapAddYyyy(sapAddYyyy);
 * entity.setSapAddMm(sapAddMm);
 * entity.setSapAddDd(sapAddDd);
 * entity.setSapAddHh(sapAddHh);
 * entity.setSapAddMi(sapAddMi);
 * entity.setSapAddSs(sapAddSs);
 * entity.setSapAddUserCd(sapAddUserCd);
 * entity.setSapUpdYyyy(sapUpdYyyy);
 * entity.setSapUpdMm(sapUpdMm);
 * entity.setSapUpdDd(sapUpdDd);
 * entity.setSapUpdHh(sapUpdHh);
 * entity.setSapUpdMi(sapUpdMi);
 * entity.setSapUpdSs(sapUpdSs);
 * entity.setSapUpdUserCd(sapUpdUserCd);
 * entity.setSpareStr(spareStr);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEsKoguchiDelivery extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** KOGUCHI_DELIVERY_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _koguchiDeliveryId;

    /** SEND_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _sendFlg;

    /** BASE_CD: {VARCHAR(30)} */
    protected String _baseCd;

    /** SERV_SALES_ORG_CD: {VARCHAR(100)} */
    protected String _servSalesOrgCd;

    /** SERV_SALES_ORG_NM: {VARCHAR(60)} */
    protected String _servSalesOrgNm;

    /** DIRECT_FLG: {CHAR(1)} */
    protected String _directFlg;

    /** URGENT_FLG: {CHAR(1)} */
    protected String _urgentFlg;

    /** DELIVERY_FLG: {CHAR(1)} */
    protected String _deliveryFlg;

    /** KOGUCHI_DELIVERY_CD: {VARCHAR(30)} */
    protected String _koguchiDeliveryCd;

    /** KOGUCHI_DELIVERY_NM: {VARCHAR(60)} */
    protected String _koguchiDeliveryNm;

    /** UNI_DELIVERY_CD: {VARCHAR(30)} */
    protected String _uniDeliveryCd;

    /** UNI_DELIVERY_NM: {VARCHAR(60)} */
    protected String _uniDeliveryNm;

    /** FW_TYPE_CD: {VARCHAR(30)} */
    protected String _fwTypeCd;

    /** MCA_TYPE_CD: {VARCHAR(30)} */
    protected String _mcaTypeCd;

    /** YOUHIN_TYPE_CD: {VARCHAR(30)} */
    protected String _youhinTypeCd;

    /** REQ_SALES_ORG_CD: {VARCHAR(30)} */
    protected String _reqSalesOrgCd;

    /** REQ_SALES_ORG_NM: {VARCHAR(60)} */
    protected String _reqSalesOrgNm;

    /** REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)} */
    protected String _reqSalesOrgBranchNm;

    /** REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)} */
    protected String _reqSalesOrgAddress1;

    /** REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)} */
    protected String _reqSalesOrgAddress2;

    /** REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)} */
    protected String _reqSalesOrgZipCd;

    /** REQ_SALES_ORG_TEL_NO: {VARCHAR(30)} */
    protected String _reqSalesOrgTelNo;

    /** REQ_SALES_ORG_FAX_NO: {VARCHAR(30)} */
    protected String _reqSalesOrgFaxNo;

    /** REMARK1: {VARCHAR(255)} */
    protected String _remark1;

    /** REMARK2: {VARCHAR(255)} */
    protected String _remark2;

    /** REMARK3: {VARCHAR(255)} */
    protected String _remark3;

    /** REMARK4: {VARCHAR(255)} */
    protected String _remark4;

    /** INDV_OUT: {VARCHAR(30)} */
    protected String _indvOut;

    /** INVOICE_SUMMARY: {VARCHAR(255)} */
    protected String _invoiceSummary;

    /** PSAM: {VARCHAR(30)} */
    protected String _psam;

    /** ABOLISH_DT: {VARCHAR(8)} */
    protected String _abolishDt;

    /** FLOOR_COMP_FLG: {CHAR(1)} */
    protected String _floorCompFlg;

    /** SAP_ADD_YYYY: {VARCHAR(30)} */
    protected String _sapAddYyyy;

    /** SAP_ADD_MM: {VARCHAR(30)} */
    protected String _sapAddMm;

    /** SAP_ADD_DD: {VARCHAR(30)} */
    protected String _sapAddDd;

    /** SAP_ADD_HH: {VARCHAR(30)} */
    protected String _sapAddHh;

    /** SAP_ADD_MI: {VARCHAR(30)} */
    protected String _sapAddMi;

    /** SAP_ADD_SS: {VARCHAR(30)} */
    protected String _sapAddSs;

    /** SAP_ADD_USER_CD: {VARCHAR(30)} */
    protected String _sapAddUserCd;

    /** SAP_UPD_YYYY: {VARCHAR(30)} */
    protected String _sapUpdYyyy;

    /** SAP_UPD_MM: {VARCHAR(30)} */
    protected String _sapUpdMm;

    /** SAP_UPD_DD: {VARCHAR(30)} */
    protected String _sapUpdDd;

    /** SAP_UPD_HH: {VARCHAR(30)} */
    protected String _sapUpdHh;

    /** SAP_UPD_MI: {VARCHAR(30)} */
    protected String _sapUpdMi;

    /** SAP_UPD_SS: {VARCHAR(30)} */
    protected String _sapUpdSs;

    /** SAP_UPD_USER_CD: {VARCHAR(30)} */
    protected String _sapUpdUserCd;

    /** SPARE_STR: {VARCHAR(255)} */
    protected String _spareStr;

    /** DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, BIGINT(19), default=[0]} */
    protected Long _versionNo;

    /** CONTROL_NO: {IX, BIGINT(19)} */
    protected Long _controlNo;

    /** ADD_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {VARCHAR(60)} */
    protected String _addUser;

    /** ADD_PROCESS: {VARCHAR(255)} */
    protected String _addProcess;

    /** UPD_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {VARCHAR(60)} */
    protected String _updUser;

    /** UPD_PROCESS: {VARCHAR(255)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "es_koguchi_delivery";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_koguchiDeliveryId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsEsKoguchiDelivery) {
            BsEsKoguchiDelivery other = (BsEsKoguchiDelivery)obj;
            if (!xSV(_koguchiDeliveryId, other._koguchiDeliveryId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _koguchiDeliveryId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_koguchiDeliveryId));
        sb.append(dm).append(xfND(_sendFlg));
        sb.append(dm).append(xfND(_baseCd));
        sb.append(dm).append(xfND(_servSalesOrgCd));
        sb.append(dm).append(xfND(_servSalesOrgNm));
        sb.append(dm).append(xfND(_directFlg));
        sb.append(dm).append(xfND(_urgentFlg));
        sb.append(dm).append(xfND(_deliveryFlg));
        sb.append(dm).append(xfND(_koguchiDeliveryCd));
        sb.append(dm).append(xfND(_koguchiDeliveryNm));
        sb.append(dm).append(xfND(_uniDeliveryCd));
        sb.append(dm).append(xfND(_uniDeliveryNm));
        sb.append(dm).append(xfND(_fwTypeCd));
        sb.append(dm).append(xfND(_mcaTypeCd));
        sb.append(dm).append(xfND(_youhinTypeCd));
        sb.append(dm).append(xfND(_reqSalesOrgCd));
        sb.append(dm).append(xfND(_reqSalesOrgNm));
        sb.append(dm).append(xfND(_reqSalesOrgBranchNm));
        sb.append(dm).append(xfND(_reqSalesOrgAddress1));
        sb.append(dm).append(xfND(_reqSalesOrgAddress2));
        sb.append(dm).append(xfND(_reqSalesOrgZipCd));
        sb.append(dm).append(xfND(_reqSalesOrgTelNo));
        sb.append(dm).append(xfND(_reqSalesOrgFaxNo));
        sb.append(dm).append(xfND(_remark1));
        sb.append(dm).append(xfND(_remark2));
        sb.append(dm).append(xfND(_remark3));
        sb.append(dm).append(xfND(_remark4));
        sb.append(dm).append(xfND(_indvOut));
        sb.append(dm).append(xfND(_invoiceSummary));
        sb.append(dm).append(xfND(_psam));
        sb.append(dm).append(xfND(_abolishDt));
        sb.append(dm).append(xfND(_floorCompFlg));
        sb.append(dm).append(xfND(_sapAddYyyy));
        sb.append(dm).append(xfND(_sapAddMm));
        sb.append(dm).append(xfND(_sapAddDd));
        sb.append(dm).append(xfND(_sapAddHh));
        sb.append(dm).append(xfND(_sapAddMi));
        sb.append(dm).append(xfND(_sapAddSs));
        sb.append(dm).append(xfND(_sapAddUserCd));
        sb.append(dm).append(xfND(_sapUpdYyyy));
        sb.append(dm).append(xfND(_sapUpdMm));
        sb.append(dm).append(xfND(_sapUpdDd));
        sb.append(dm).append(xfND(_sapUpdHh));
        sb.append(dm).append(xfND(_sapUpdMi));
        sb.append(dm).append(xfND(_sapUpdSs));
        sb.append(dm).append(xfND(_sapUpdUserCd));
        sb.append(dm).append(xfND(_spareStr));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public EsKoguchiDelivery clone() {
        return (EsKoguchiDelivery)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] KOGUCHI_DELIVERY_ID: {PK, NotNull, BIGINT(19)} <br>
     * 戸口配送マスタ送信ID
     * @return The value of the column 'KOGUCHI_DELIVERY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getKoguchiDeliveryId() {
        checkSpecifiedProperty("koguchiDeliveryId");
        return _koguchiDeliveryId;
    }

    /**
     * [set] KOGUCHI_DELIVERY_ID: {PK, NotNull, BIGINT(19)} <br>
     * 戸口配送マスタ送信ID
     * @param koguchiDeliveryId The value of the column 'KOGUCHI_DELIVERY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setKoguchiDeliveryId(Long koguchiDeliveryId) {
        registerModifiedProperty("koguchiDeliveryId");
        _koguchiDeliveryId = koguchiDeliveryId;
    }

    /**
     * [get] SEND_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 送信済フラグ
     * @return The value of the column 'SEND_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getSendFlg() {
        checkSpecifiedProperty("sendFlg");
        return convertEmptyToNull(_sendFlg);
    }

    /**
     * [set] SEND_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 送信済フラグ
     * @param sendFlg The value of the column 'SEND_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setSendFlg(String sendFlg) {
        registerModifiedProperty("sendFlg");
        _sendFlg = sendFlg;
    }

    /**
     * [get] BASE_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @return The value of the column 'BASE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBaseCd() {
        checkSpecifiedProperty("baseCd");
        return convertEmptyToNull(_baseCd);
    }

    /**
     * [set] BASE_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @param baseCd The value of the column 'BASE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBaseCd(String baseCd) {
        registerModifiedProperty("baseCd");
        _baseCd = baseCd;
    }

    /**
     * [get] SERV_SALES_ORG_CD: {VARCHAR(100)} <br>
     * 取扱販売組織CD
     * @return The value of the column 'SERV_SALES_ORG_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getServSalesOrgCd() {
        checkSpecifiedProperty("servSalesOrgCd");
        return convertEmptyToNull(_servSalesOrgCd);
    }

    /**
     * [set] SERV_SALES_ORG_CD: {VARCHAR(100)} <br>
     * 取扱販売組織CD
     * @param servSalesOrgCd The value of the column 'SERV_SALES_ORG_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setServSalesOrgCd(String servSalesOrgCd) {
        registerModifiedProperty("servSalesOrgCd");
        _servSalesOrgCd = servSalesOrgCd;
    }

    /**
     * [get] SERV_SALES_ORG_NM: {VARCHAR(60)} <br>
     * 取扱販売組織名称
     * @return The value of the column 'SERV_SALES_ORG_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getServSalesOrgNm() {
        checkSpecifiedProperty("servSalesOrgNm");
        return convertEmptyToNull(_servSalesOrgNm);
    }

    /**
     * [set] SERV_SALES_ORG_NM: {VARCHAR(60)} <br>
     * 取扱販売組織名称
     * @param servSalesOrgNm The value of the column 'SERV_SALES_ORG_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setServSalesOrgNm(String servSalesOrgNm) {
        registerModifiedProperty("servSalesOrgNm");
        _servSalesOrgNm = servSalesOrgNm;
    }

    /**
     * [get] DIRECT_FLG: {CHAR(1)} <br>
     * 直送フラグ
     * @return The value of the column 'DIRECT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectFlg() {
        checkSpecifiedProperty("directFlg");
        return convertEmptyToNull(_directFlg);
    }

    /**
     * [set] DIRECT_FLG: {CHAR(1)} <br>
     * 直送フラグ
     * @param directFlg The value of the column 'DIRECT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectFlg(String directFlg) {
        registerModifiedProperty("directFlg");
        _directFlg = directFlg;
    }

    /**
     * [get] URGENT_FLG: {CHAR(1)} <br>
     * 緊急フラグ
     * @return The value of the column 'URGENT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getUrgentFlg() {
        checkSpecifiedProperty("urgentFlg");
        return convertEmptyToNull(_urgentFlg);
    }

    /**
     * [set] URGENT_FLG: {CHAR(1)} <br>
     * 緊急フラグ
     * @param urgentFlg The value of the column 'URGENT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUrgentFlg(String urgentFlg) {
        registerModifiedProperty("urgentFlg");
        _urgentFlg = urgentFlg;
    }

    /**
     * [get] DELIVERY_FLG: {CHAR(1)} <br>
     * 納品フラグ
     * @return The value of the column 'DELIVERY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryFlg() {
        checkSpecifiedProperty("deliveryFlg");
        return convertEmptyToNull(_deliveryFlg);
    }

    /**
     * [set] DELIVERY_FLG: {CHAR(1)} <br>
     * 納品フラグ
     * @param deliveryFlg The value of the column 'DELIVERY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryFlg(String deliveryFlg) {
        registerModifiedProperty("deliveryFlg");
        _deliveryFlg = deliveryFlg;
    }

    /**
     * [get] KOGUCHI_DELIVERY_CD: {VARCHAR(30)} <br>
     * 戸口配送先CD
     * @return The value of the column 'KOGUCHI_DELIVERY_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getKoguchiDeliveryCd() {
        checkSpecifiedProperty("koguchiDeliveryCd");
        return convertEmptyToNull(_koguchiDeliveryCd);
    }

    /**
     * [set] KOGUCHI_DELIVERY_CD: {VARCHAR(30)} <br>
     * 戸口配送先CD
     * @param koguchiDeliveryCd The value of the column 'KOGUCHI_DELIVERY_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKoguchiDeliveryCd(String koguchiDeliveryCd) {
        registerModifiedProperty("koguchiDeliveryCd");
        _koguchiDeliveryCd = koguchiDeliveryCd;
    }

    /**
     * [get] KOGUCHI_DELIVERY_NM: {VARCHAR(60)} <br>
     * 戸口配送先名称
     * @return The value of the column 'KOGUCHI_DELIVERY_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getKoguchiDeliveryNm() {
        checkSpecifiedProperty("koguchiDeliveryNm");
        return convertEmptyToNull(_koguchiDeliveryNm);
    }

    /**
     * [set] KOGUCHI_DELIVERY_NM: {VARCHAR(60)} <br>
     * 戸口配送先名称
     * @param koguchiDeliveryNm The value of the column 'KOGUCHI_DELIVERY_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKoguchiDeliveryNm(String koguchiDeliveryNm) {
        registerModifiedProperty("koguchiDeliveryNm");
        _koguchiDeliveryNm = koguchiDeliveryNm;
    }

    /**
     * [get] UNI_DELIVERY_CD: {VARCHAR(30)} <br>
     * 統合配送先CD
     * @return The value of the column 'UNI_DELIVERY_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getUniDeliveryCd() {
        checkSpecifiedProperty("uniDeliveryCd");
        return convertEmptyToNull(_uniDeliveryCd);
    }

    /**
     * [set] UNI_DELIVERY_CD: {VARCHAR(30)} <br>
     * 統合配送先CD
     * @param uniDeliveryCd The value of the column 'UNI_DELIVERY_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUniDeliveryCd(String uniDeliveryCd) {
        registerModifiedProperty("uniDeliveryCd");
        _uniDeliveryCd = uniDeliveryCd;
    }

    /**
     * [get] UNI_DELIVERY_NM: {VARCHAR(60)} <br>
     * 統合配送先名称
     * @return The value of the column 'UNI_DELIVERY_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUniDeliveryNm() {
        checkSpecifiedProperty("uniDeliveryNm");
        return convertEmptyToNull(_uniDeliveryNm);
    }

    /**
     * [set] UNI_DELIVERY_NM: {VARCHAR(60)} <br>
     * 統合配送先名称
     * @param uniDeliveryNm The value of the column 'UNI_DELIVERY_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUniDeliveryNm(String uniDeliveryNm) {
        registerModifiedProperty("uniDeliveryNm");
        _uniDeliveryNm = uniDeliveryNm;
    }

    /**
     * [get] FW_TYPE_CD: {VARCHAR(30)} <br>
     * FW区分
     * @return The value of the column 'FW_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFwTypeCd() {
        checkSpecifiedProperty("fwTypeCd");
        return convertEmptyToNull(_fwTypeCd);
    }

    /**
     * [set] FW_TYPE_CD: {VARCHAR(30)} <br>
     * FW区分
     * @param fwTypeCd The value of the column 'FW_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFwTypeCd(String fwTypeCd) {
        registerModifiedProperty("fwTypeCd");
        _fwTypeCd = fwTypeCd;
    }

    /**
     * [get] MCA_TYPE_CD: {VARCHAR(30)} <br>
     * MCA区分
     * @return The value of the column 'MCA_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getMcaTypeCd() {
        checkSpecifiedProperty("mcaTypeCd");
        return convertEmptyToNull(_mcaTypeCd);
    }

    /**
     * [set] MCA_TYPE_CD: {VARCHAR(30)} <br>
     * MCA区分
     * @param mcaTypeCd The value of the column 'MCA_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMcaTypeCd(String mcaTypeCd) {
        registerModifiedProperty("mcaTypeCd");
        _mcaTypeCd = mcaTypeCd;
    }

    /**
     * [get] YOUHIN_TYPE_CD: {VARCHAR(30)} <br>
     * 用品区分
     * @return The value of the column 'YOUHIN_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getYouhinTypeCd() {
        checkSpecifiedProperty("youhinTypeCd");
        return convertEmptyToNull(_youhinTypeCd);
    }

    /**
     * [set] YOUHIN_TYPE_CD: {VARCHAR(30)} <br>
     * 用品区分
     * @param youhinTypeCd The value of the column 'YOUHIN_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setYouhinTypeCd(String youhinTypeCd) {
        registerModifiedProperty("youhinTypeCd");
        _youhinTypeCd = youhinTypeCd;
    }

    /**
     * [get] REQ_SALES_ORG_CD: {VARCHAR(30)} <br>
     * 依頼元販売組織CD
     * @return The value of the column 'REQ_SALES_ORG_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getReqSalesOrgCd() {
        checkSpecifiedProperty("reqSalesOrgCd");
        return convertEmptyToNull(_reqSalesOrgCd);
    }

    /**
     * [set] REQ_SALES_ORG_CD: {VARCHAR(30)} <br>
     * 依頼元販売組織CD
     * @param reqSalesOrgCd The value of the column 'REQ_SALES_ORG_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReqSalesOrgCd(String reqSalesOrgCd) {
        registerModifiedProperty("reqSalesOrgCd");
        _reqSalesOrgCd = reqSalesOrgCd;
    }

    /**
     * [get] REQ_SALES_ORG_NM: {VARCHAR(60)} <br>
     * 依頼元販売組織名称
     * @return The value of the column 'REQ_SALES_ORG_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getReqSalesOrgNm() {
        checkSpecifiedProperty("reqSalesOrgNm");
        return convertEmptyToNull(_reqSalesOrgNm);
    }

    /**
     * [set] REQ_SALES_ORG_NM: {VARCHAR(60)} <br>
     * 依頼元販売組織名称
     * @param reqSalesOrgNm The value of the column 'REQ_SALES_ORG_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReqSalesOrgNm(String reqSalesOrgNm) {
        registerModifiedProperty("reqSalesOrgNm");
        _reqSalesOrgNm = reqSalesOrgNm;
    }

    /**
     * [get] REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)} <br>
     * 依頼元販売組織支店名称
     * @return The value of the column 'REQ_SALES_ORG_BRANCH_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getReqSalesOrgBranchNm() {
        checkSpecifiedProperty("reqSalesOrgBranchNm");
        return convertEmptyToNull(_reqSalesOrgBranchNm);
    }

    /**
     * [set] REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)} <br>
     * 依頼元販売組織支店名称
     * @param reqSalesOrgBranchNm The value of the column 'REQ_SALES_ORG_BRANCH_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReqSalesOrgBranchNm(String reqSalesOrgBranchNm) {
        registerModifiedProperty("reqSalesOrgBranchNm");
        _reqSalesOrgBranchNm = reqSalesOrgBranchNm;
    }

    /**
     * [get] REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)} <br>
     * 依頼元販売組織住所１
     * @return The value of the column 'REQ_SALES_ORG_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getReqSalesOrgAddress1() {
        checkSpecifiedProperty("reqSalesOrgAddress1");
        return convertEmptyToNull(_reqSalesOrgAddress1);
    }

    /**
     * [set] REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)} <br>
     * 依頼元販売組織住所１
     * @param reqSalesOrgAddress1 The value of the column 'REQ_SALES_ORG_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReqSalesOrgAddress1(String reqSalesOrgAddress1) {
        registerModifiedProperty("reqSalesOrgAddress1");
        _reqSalesOrgAddress1 = reqSalesOrgAddress1;
    }

    /**
     * [get] REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)} <br>
     * 依頼元販売組織住所２
     * @return The value of the column 'REQ_SALES_ORG_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getReqSalesOrgAddress2() {
        checkSpecifiedProperty("reqSalesOrgAddress2");
        return convertEmptyToNull(_reqSalesOrgAddress2);
    }

    /**
     * [set] REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)} <br>
     * 依頼元販売組織住所２
     * @param reqSalesOrgAddress2 The value of the column 'REQ_SALES_ORG_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReqSalesOrgAddress2(String reqSalesOrgAddress2) {
        registerModifiedProperty("reqSalesOrgAddress2");
        _reqSalesOrgAddress2 = reqSalesOrgAddress2;
    }

    /**
     * [get] REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)} <br>
     * 依頼元販売組織郵便番号
     * @return The value of the column 'REQ_SALES_ORG_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getReqSalesOrgZipCd() {
        checkSpecifiedProperty("reqSalesOrgZipCd");
        return convertEmptyToNull(_reqSalesOrgZipCd);
    }

    /**
     * [set] REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)} <br>
     * 依頼元販売組織郵便番号
     * @param reqSalesOrgZipCd The value of the column 'REQ_SALES_ORG_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReqSalesOrgZipCd(String reqSalesOrgZipCd) {
        registerModifiedProperty("reqSalesOrgZipCd");
        _reqSalesOrgZipCd = reqSalesOrgZipCd;
    }

    /**
     * [get] REQ_SALES_ORG_TEL_NO: {VARCHAR(30)} <br>
     * 依頼元販売組織電話番号
     * @return The value of the column 'REQ_SALES_ORG_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getReqSalesOrgTelNo() {
        checkSpecifiedProperty("reqSalesOrgTelNo");
        return convertEmptyToNull(_reqSalesOrgTelNo);
    }

    /**
     * [set] REQ_SALES_ORG_TEL_NO: {VARCHAR(30)} <br>
     * 依頼元販売組織電話番号
     * @param reqSalesOrgTelNo The value of the column 'REQ_SALES_ORG_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReqSalesOrgTelNo(String reqSalesOrgTelNo) {
        registerModifiedProperty("reqSalesOrgTelNo");
        _reqSalesOrgTelNo = reqSalesOrgTelNo;
    }

    /**
     * [get] REQ_SALES_ORG_FAX_NO: {VARCHAR(30)} <br>
     * 依頼元販売組織FAX番号
     * @return The value of the column 'REQ_SALES_ORG_FAX_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getReqSalesOrgFaxNo() {
        checkSpecifiedProperty("reqSalesOrgFaxNo");
        return convertEmptyToNull(_reqSalesOrgFaxNo);
    }

    /**
     * [set] REQ_SALES_ORG_FAX_NO: {VARCHAR(30)} <br>
     * 依頼元販売組織FAX番号
     * @param reqSalesOrgFaxNo The value of the column 'REQ_SALES_ORG_FAX_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReqSalesOrgFaxNo(String reqSalesOrgFaxNo) {
        registerModifiedProperty("reqSalesOrgFaxNo");
        _reqSalesOrgFaxNo = reqSalesOrgFaxNo;
    }

    /**
     * [get] REMARK1: {VARCHAR(255)} <br>
     * 物品送付下部備考項目1
     * @return The value of the column 'REMARK1'. (NullAllowed even if selected: for no constraint)
     */
    public String getRemark1() {
        checkSpecifiedProperty("remark1");
        return convertEmptyToNull(_remark1);
    }

    /**
     * [set] REMARK1: {VARCHAR(255)} <br>
     * 物品送付下部備考項目1
     * @param remark1 The value of the column 'REMARK1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRemark1(String remark1) {
        registerModifiedProperty("remark1");
        _remark1 = remark1;
    }

    /**
     * [get] REMARK2: {VARCHAR(255)} <br>
     * 物品送付下部備考項目2
     * @return The value of the column 'REMARK2'. (NullAllowed even if selected: for no constraint)
     */
    public String getRemark2() {
        checkSpecifiedProperty("remark2");
        return convertEmptyToNull(_remark2);
    }

    /**
     * [set] REMARK2: {VARCHAR(255)} <br>
     * 物品送付下部備考項目2
     * @param remark2 The value of the column 'REMARK2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRemark2(String remark2) {
        registerModifiedProperty("remark2");
        _remark2 = remark2;
    }

    /**
     * [get] REMARK3: {VARCHAR(255)} <br>
     * 物品送付下部備考項目3
     * @return The value of the column 'REMARK3'. (NullAllowed even if selected: for no constraint)
     */
    public String getRemark3() {
        checkSpecifiedProperty("remark3");
        return convertEmptyToNull(_remark3);
    }

    /**
     * [set] REMARK3: {VARCHAR(255)} <br>
     * 物品送付下部備考項目3
     * @param remark3 The value of the column 'REMARK3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRemark3(String remark3) {
        registerModifiedProperty("remark3");
        _remark3 = remark3;
    }

    /**
     * [get] REMARK4: {VARCHAR(255)} <br>
     * 物品送付下部備考項目4
     * @return The value of the column 'REMARK4'. (NullAllowed even if selected: for no constraint)
     */
    public String getRemark4() {
        checkSpecifiedProperty("remark4");
        return convertEmptyToNull(_remark4);
    }

    /**
     * [set] REMARK4: {VARCHAR(255)} <br>
     * 物品送付下部備考項目4
     * @param remark4 The value of the column 'REMARK4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRemark4(String remark4) {
        registerModifiedProperty("remark4");
        _remark4 = remark4;
    }

    /**
     * [get] INDV_OUT: {VARCHAR(30)} <br>
     * 個別出力
     * @return The value of the column 'INDV_OUT'. (NullAllowed even if selected: for no constraint)
     */
    public String getIndvOut() {
        checkSpecifiedProperty("indvOut");
        return convertEmptyToNull(_indvOut);
    }

    /**
     * [set] INDV_OUT: {VARCHAR(30)} <br>
     * 個別出力
     * @param indvOut The value of the column 'INDV_OUT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIndvOut(String indvOut) {
        registerModifiedProperty("indvOut");
        _indvOut = indvOut;
    }

    /**
     * [get] INVOICE_SUMMARY: {VARCHAR(255)} <br>
     * 送り状摘要
     * @return The value of the column 'INVOICE_SUMMARY'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvoiceSummary() {
        checkSpecifiedProperty("invoiceSummary");
        return convertEmptyToNull(_invoiceSummary);
    }

    /**
     * [set] INVOICE_SUMMARY: {VARCHAR(255)} <br>
     * 送り状摘要
     * @param invoiceSummary The value of the column 'INVOICE_SUMMARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceSummary(String invoiceSummary) {
        registerModifiedProperty("invoiceSummary");
        _invoiceSummary = invoiceSummary;
    }

    /**
     * [get] PSAM: {VARCHAR(30)} <br>
     * PSAM
     * @return The value of the column 'PSAM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPsam() {
        checkSpecifiedProperty("psam");
        return convertEmptyToNull(_psam);
    }

    /**
     * [set] PSAM: {VARCHAR(30)} <br>
     * PSAM
     * @param psam The value of the column 'PSAM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPsam(String psam) {
        registerModifiedProperty("psam");
        _psam = psam;
    }

    /**
     * [get] ABOLISH_DT: {VARCHAR(8)} <br>
     * 廃止日
     * @return The value of the column 'ABOLISH_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getAbolishDt() {
        checkSpecifiedProperty("abolishDt");
        return convertEmptyToNull(_abolishDt);
    }

    /**
     * [set] ABOLISH_DT: {VARCHAR(8)} <br>
     * 廃止日
     * @param abolishDt The value of the column 'ABOLISH_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAbolishDt(String abolishDt) {
        registerModifiedProperty("abolishDt");
        _abolishDt = abolishDt;
    }

    /**
     * [get] FLOOR_COMP_FLG: {CHAR(1)} <br>
     * フロア完結フラグ
     * @return The value of the column 'FLOOR_COMP_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getFloorCompFlg() {
        checkSpecifiedProperty("floorCompFlg");
        return convertEmptyToNull(_floorCompFlg);
    }

    /**
     * [set] FLOOR_COMP_FLG: {CHAR(1)} <br>
     * フロア完結フラグ
     * @param floorCompFlg The value of the column 'FLOOR_COMP_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFloorCompFlg(String floorCompFlg) {
        registerModifiedProperty("floorCompFlg");
        _floorCompFlg = floorCompFlg;
    }

    /**
     * [get] SAP_ADD_YYYY: {VARCHAR(30)} <br>
     * SAP作成日_年
     * @return The value of the column 'SAP_ADD_YYYY'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddYyyy() {
        checkSpecifiedProperty("sapAddYyyy");
        return convertEmptyToNull(_sapAddYyyy);
    }

    /**
     * [set] SAP_ADD_YYYY: {VARCHAR(30)} <br>
     * SAP作成日_年
     * @param sapAddYyyy The value of the column 'SAP_ADD_YYYY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddYyyy(String sapAddYyyy) {
        registerModifiedProperty("sapAddYyyy");
        _sapAddYyyy = sapAddYyyy;
    }

    /**
     * [get] SAP_ADD_MM: {VARCHAR(30)} <br>
     * SAP作成日_月
     * @return The value of the column 'SAP_ADD_MM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddMm() {
        checkSpecifiedProperty("sapAddMm");
        return convertEmptyToNull(_sapAddMm);
    }

    /**
     * [set] SAP_ADD_MM: {VARCHAR(30)} <br>
     * SAP作成日_月
     * @param sapAddMm The value of the column 'SAP_ADD_MM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddMm(String sapAddMm) {
        registerModifiedProperty("sapAddMm");
        _sapAddMm = sapAddMm;
    }

    /**
     * [get] SAP_ADD_DD: {VARCHAR(30)} <br>
     * SAP作成日_日
     * @return The value of the column 'SAP_ADD_DD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddDd() {
        checkSpecifiedProperty("sapAddDd");
        return convertEmptyToNull(_sapAddDd);
    }

    /**
     * [set] SAP_ADD_DD: {VARCHAR(30)} <br>
     * SAP作成日_日
     * @param sapAddDd The value of the column 'SAP_ADD_DD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddDd(String sapAddDd) {
        registerModifiedProperty("sapAddDd");
        _sapAddDd = sapAddDd;
    }

    /**
     * [get] SAP_ADD_HH: {VARCHAR(30)} <br>
     * SAP作成時間_時
     * @return The value of the column 'SAP_ADD_HH'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddHh() {
        checkSpecifiedProperty("sapAddHh");
        return convertEmptyToNull(_sapAddHh);
    }

    /**
     * [set] SAP_ADD_HH: {VARCHAR(30)} <br>
     * SAP作成時間_時
     * @param sapAddHh The value of the column 'SAP_ADD_HH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddHh(String sapAddHh) {
        registerModifiedProperty("sapAddHh");
        _sapAddHh = sapAddHh;
    }

    /**
     * [get] SAP_ADD_MI: {VARCHAR(30)} <br>
     * SAP作成時間_分
     * @return The value of the column 'SAP_ADD_MI'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddMi() {
        checkSpecifiedProperty("sapAddMi");
        return convertEmptyToNull(_sapAddMi);
    }

    /**
     * [set] SAP_ADD_MI: {VARCHAR(30)} <br>
     * SAP作成時間_分
     * @param sapAddMi The value of the column 'SAP_ADD_MI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddMi(String sapAddMi) {
        registerModifiedProperty("sapAddMi");
        _sapAddMi = sapAddMi;
    }

    /**
     * [get] SAP_ADD_SS: {VARCHAR(30)} <br>
     * SAP作成時間_秒
     * @return The value of the column 'SAP_ADD_SS'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddSs() {
        checkSpecifiedProperty("sapAddSs");
        return convertEmptyToNull(_sapAddSs);
    }

    /**
     * [set] SAP_ADD_SS: {VARCHAR(30)} <br>
     * SAP作成時間_秒
     * @param sapAddSs The value of the column 'SAP_ADD_SS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddSs(String sapAddSs) {
        registerModifiedProperty("sapAddSs");
        _sapAddSs = sapAddSs;
    }

    /**
     * [get] SAP_ADD_USER_CD: {VARCHAR(30)} <br>
     * SAP作成者
     * @return The value of the column 'SAP_ADD_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddUserCd() {
        checkSpecifiedProperty("sapAddUserCd");
        return convertEmptyToNull(_sapAddUserCd);
    }

    /**
     * [set] SAP_ADD_USER_CD: {VARCHAR(30)} <br>
     * SAP作成者
     * @param sapAddUserCd The value of the column 'SAP_ADD_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddUserCd(String sapAddUserCd) {
        registerModifiedProperty("sapAddUserCd");
        _sapAddUserCd = sapAddUserCd;
    }

    /**
     * [get] SAP_UPD_YYYY: {VARCHAR(30)} <br>
     * SAP更新日_年
     * @return The value of the column 'SAP_UPD_YYYY'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdYyyy() {
        checkSpecifiedProperty("sapUpdYyyy");
        return convertEmptyToNull(_sapUpdYyyy);
    }

    /**
     * [set] SAP_UPD_YYYY: {VARCHAR(30)} <br>
     * SAP更新日_年
     * @param sapUpdYyyy The value of the column 'SAP_UPD_YYYY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdYyyy(String sapUpdYyyy) {
        registerModifiedProperty("sapUpdYyyy");
        _sapUpdYyyy = sapUpdYyyy;
    }

    /**
     * [get] SAP_UPD_MM: {VARCHAR(30)} <br>
     * SAP更新日_月
     * @return The value of the column 'SAP_UPD_MM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdMm() {
        checkSpecifiedProperty("sapUpdMm");
        return convertEmptyToNull(_sapUpdMm);
    }

    /**
     * [set] SAP_UPD_MM: {VARCHAR(30)} <br>
     * SAP更新日_月
     * @param sapUpdMm The value of the column 'SAP_UPD_MM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdMm(String sapUpdMm) {
        registerModifiedProperty("sapUpdMm");
        _sapUpdMm = sapUpdMm;
    }

    /**
     * [get] SAP_UPD_DD: {VARCHAR(30)} <br>
     * SAP更新日_日
     * @return The value of the column 'SAP_UPD_DD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdDd() {
        checkSpecifiedProperty("sapUpdDd");
        return convertEmptyToNull(_sapUpdDd);
    }

    /**
     * [set] SAP_UPD_DD: {VARCHAR(30)} <br>
     * SAP更新日_日
     * @param sapUpdDd The value of the column 'SAP_UPD_DD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdDd(String sapUpdDd) {
        registerModifiedProperty("sapUpdDd");
        _sapUpdDd = sapUpdDd;
    }

    /**
     * [get] SAP_UPD_HH: {VARCHAR(30)} <br>
     * SAP更新時間_時
     * @return The value of the column 'SAP_UPD_HH'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdHh() {
        checkSpecifiedProperty("sapUpdHh");
        return convertEmptyToNull(_sapUpdHh);
    }

    /**
     * [set] SAP_UPD_HH: {VARCHAR(30)} <br>
     * SAP更新時間_時
     * @param sapUpdHh The value of the column 'SAP_UPD_HH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdHh(String sapUpdHh) {
        registerModifiedProperty("sapUpdHh");
        _sapUpdHh = sapUpdHh;
    }

    /**
     * [get] SAP_UPD_MI: {VARCHAR(30)} <br>
     * SAP更新時間_分
     * @return The value of the column 'SAP_UPD_MI'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdMi() {
        checkSpecifiedProperty("sapUpdMi");
        return convertEmptyToNull(_sapUpdMi);
    }

    /**
     * [set] SAP_UPD_MI: {VARCHAR(30)} <br>
     * SAP更新時間_分
     * @param sapUpdMi The value of the column 'SAP_UPD_MI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdMi(String sapUpdMi) {
        registerModifiedProperty("sapUpdMi");
        _sapUpdMi = sapUpdMi;
    }

    /**
     * [get] SAP_UPD_SS: {VARCHAR(30)} <br>
     * SAP更新時間_秒
     * @return The value of the column 'SAP_UPD_SS'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdSs() {
        checkSpecifiedProperty("sapUpdSs");
        return convertEmptyToNull(_sapUpdSs);
    }

    /**
     * [set] SAP_UPD_SS: {VARCHAR(30)} <br>
     * SAP更新時間_秒
     * @param sapUpdSs The value of the column 'SAP_UPD_SS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdSs(String sapUpdSs) {
        registerModifiedProperty("sapUpdSs");
        _sapUpdSs = sapUpdSs;
    }

    /**
     * [get] SAP_UPD_USER_CD: {VARCHAR(30)} <br>
     * SAP更新者
     * @return The value of the column 'SAP_UPD_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdUserCd() {
        checkSpecifiedProperty("sapUpdUserCd");
        return convertEmptyToNull(_sapUpdUserCd);
    }

    /**
     * [set] SAP_UPD_USER_CD: {VARCHAR(30)} <br>
     * SAP更新者
     * @param sapUpdUserCd The value of the column 'SAP_UPD_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdUserCd(String sapUpdUserCd) {
        registerModifiedProperty("sapUpdUserCd");
        _sapUpdUserCd = sapUpdUserCd;
    }

    /**
     * [get] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @return The value of the column 'SPARE_STR'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr() {
        checkSpecifiedProperty("spareStr");
        return convertEmptyToNull(_spareStr);
    }

    /**
     * [set] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @param spareStr The value of the column 'SPARE_STR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr(String spareStr) {
        registerModifiedProperty("spareStr");
        _spareStr = spareStr;
    }

    /**
     * [get] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
