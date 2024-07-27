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
 * The entity of h_id_manag_data as TABLE. <br>
 * 個体管理情報履歴
 * <pre>
 * [primary-key]
 *     ID_MANAG_DATA_ID
 *
 * [column]
 *     ID_MANAG_DATA_ID, ID_MANAG_NO, TENHANSHA_CD, SALES_ORG_CD, CUSTOMER_CD, PRODUCT_CD, HINMOKU_TEXT, JAN_CD, UNIT_NM, SHARED_PRODUCT_TYPE_CD, CUSTOMER_ORDER_NO, DELIV_CD, DESTINATION_ZIP_CD, DESTINATION_ADDRESS1, DESTINATION_ADDRESS2, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_TEL, EMP_ID_CD, EMP_NM, STORE_DT, INVENTORY_DT, PICKING_DT, PRODUCT_RETURN_DT, WASTE_RETURN_DT, ID_MANAG_ABOLITION_TYPE_CD, SPARE_TYPE_CD, DATA_EXT_FLG_PICKING, DATA_ADD_DT_PICKING, DATA_EXT_FLG_RETURN, DATA_ADD_DT_RETURN, DATA_EXT_FLG_WASTE, DATA_ADD_DT_WASTE, WORK_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ID_MANAG_DATA_ID
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
 * Long idManagDataId = entity.getIdManagDataId();
 * String idManagNo = entity.getIdManagNo();
 * String tenhanshaCd = entity.getTenhanshaCd();
 * String salesOrgCd = entity.getSalesOrgCd();
 * String customerCd = entity.getCustomerCd();
 * String productCd = entity.getProductCd();
 * String hinmokuText = entity.getHinmokuText();
 * String janCd = entity.getJanCd();
 * String unitNm = entity.getUnitNm();
 * String sharedProductTypeCd = entity.getSharedProductTypeCd();
 * String customerOrderNo = entity.getCustomerOrderNo();
 * String delivCd = entity.getDelivCd();
 * String destinationZipCd = entity.getDestinationZipCd();
 * String destinationAddress1 = entity.getDestinationAddress1();
 * String destinationAddress2 = entity.getDestinationAddress2();
 * String destinationNm1 = entity.getDestinationNm1();
 * String destinationNm2 = entity.getDestinationNm2();
 * String destinationTel = entity.getDestinationTel();
 * String empIdCd = entity.getEmpIdCd();
 * String empNm = entity.getEmpNm();
 * String storeDt = entity.getStoreDt();
 * String inventoryDt = entity.getInventoryDt();
 * String pickingDt = entity.getPickingDt();
 * String productReturnDt = entity.getProductReturnDt();
 * String wasteReturnDt = entity.getWasteReturnDt();
 * String idManagAbolitionTypeCd = entity.getIdManagAbolitionTypeCd();
 * String spareTypeCd = entity.getSpareTypeCd();
 * String dataExtFlgPicking = entity.getDataExtFlgPicking();
 * String dataAddDtPicking = entity.getDataAddDtPicking();
 * String dataExtFlgReturn = entity.getDataExtFlgReturn();
 * String dataAddDtReturn = entity.getDataAddDtReturn();
 * String dataExtFlgWaste = entity.getDataExtFlgWaste();
 * String dataAddDtWaste = entity.getDataAddDtWaste();
 * String workDt = entity.getWorkDt();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setIdManagDataId(idManagDataId);
 * entity.setIdManagNo(idManagNo);
 * entity.setTenhanshaCd(tenhanshaCd);
 * entity.setSalesOrgCd(salesOrgCd);
 * entity.setCustomerCd(customerCd);
 * entity.setProductCd(productCd);
 * entity.setHinmokuText(hinmokuText);
 * entity.setJanCd(janCd);
 * entity.setUnitNm(unitNm);
 * entity.setSharedProductTypeCd(sharedProductTypeCd);
 * entity.setCustomerOrderNo(customerOrderNo);
 * entity.setDelivCd(delivCd);
 * entity.setDestinationZipCd(destinationZipCd);
 * entity.setDestinationAddress1(destinationAddress1);
 * entity.setDestinationAddress2(destinationAddress2);
 * entity.setDestinationNm1(destinationNm1);
 * entity.setDestinationNm2(destinationNm2);
 * entity.setDestinationTel(destinationTel);
 * entity.setEmpIdCd(empIdCd);
 * entity.setEmpNm(empNm);
 * entity.setStoreDt(storeDt);
 * entity.setInventoryDt(inventoryDt);
 * entity.setPickingDt(pickingDt);
 * entity.setProductReturnDt(productReturnDt);
 * entity.setWasteReturnDt(wasteReturnDt);
 * entity.setIdManagAbolitionTypeCd(idManagAbolitionTypeCd);
 * entity.setSpareTypeCd(spareTypeCd);
 * entity.setDataExtFlgPicking(dataExtFlgPicking);
 * entity.setDataAddDtPicking(dataAddDtPicking);
 * entity.setDataExtFlgReturn(dataExtFlgReturn);
 * entity.setDataAddDtReturn(dataAddDtReturn);
 * entity.setDataExtFlgWaste(dataExtFlgWaste);
 * entity.setDataAddDtWaste(dataAddDtWaste);
 * entity.setWorkDt(workDt);
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
public abstract class BsHIdManagData extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ID_MANAG_DATA_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _idManagDataId;

    /** ID_MANAG_NO: {VARCHAR(30)} */
    protected String _idManagNo;

    /** TENHANSHA_CD: {VARCHAR(30)} */
    protected String _tenhanshaCd;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    protected String _salesOrgCd;

    /** CUSTOMER_CD: {VARCHAR(30)} */
    protected String _customerCd;

    /** PRODUCT_CD: {VARCHAR(30)} */
    protected String _productCd;

    /** HINMOKU_TEXT: {VARCHAR(60)} */
    protected String _hinmokuText;

    /** JAN_CD: {VARCHAR(30)} */
    protected String _janCd;

    /** UNIT_NM: {VARCHAR(30)} */
    protected String _unitNm;

    /** SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)} */
    protected String _sharedProductTypeCd;

    /** CUSTOMER_ORDER_NO: {VARCHAR(30)} */
    protected String _customerOrderNo;

    /** DELIV_CD: {VARCHAR(30)} */
    protected String _delivCd;

    /** DESTINATION_ZIP_CD: {VARCHAR(30)} */
    protected String _destinationZipCd;

    /** DESTINATION_ADDRESS1: {VARCHAR(255)} */
    protected String _destinationAddress1;

    /** DESTINATION_ADDRESS2: {VARCHAR(255)} */
    protected String _destinationAddress2;

    /** DESTINATION_NM1: {VARCHAR(60)} */
    protected String _destinationNm1;

    /** DESTINATION_NM2: {VARCHAR(60)} */
    protected String _destinationNm2;

    /** DESTINATION_TEL: {VARCHAR(30)} */
    protected String _destinationTel;

    /** EMP_ID_CD: {VARCHAR(30)} */
    protected String _empIdCd;

    /** EMP_NM: {VARCHAR(60)} */
    protected String _empNm;

    /** STORE_DT: {VARCHAR(8)} */
    protected String _storeDt;

    /** INVENTORY_DT: {VARCHAR(8)} */
    protected String _inventoryDt;

    /** PICKING_DT: {VARCHAR(8)} */
    protected String _pickingDt;

    /** PRODUCT_RETURN_DT: {VARCHAR(8)} */
    protected String _productReturnDt;

    /** WASTE_RETURN_DT: {VARCHAR(8)} */
    protected String _wasteReturnDt;

    /** ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)} */
    protected String _idManagAbolitionTypeCd;

    /** SPARE_TYPE_CD: {VARCHAR(30)} */
    protected String _spareTypeCd;

    /** DATA_EXT_FLG_PICKING: {CHAR(1)} */
    protected String _dataExtFlgPicking;

    /** DATA_ADD_DT_PICKING: {VARCHAR(8)} */
    protected String _dataAddDtPicking;

    /** DATA_EXT_FLG_RETURN: {CHAR(1)} */
    protected String _dataExtFlgReturn;

    /** DATA_ADD_DT_RETURN: {VARCHAR(8)} */
    protected String _dataAddDtReturn;

    /** DATA_EXT_FLG_WASTE: {CHAR(1)} */
    protected String _dataExtFlgWaste;

    /** DATA_ADD_DT_WASTE: {VARCHAR(8)} */
    protected String _dataAddDtWaste;

    /** WORK_DT: {VARCHAR(8)} */
    protected String _workDt;

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
        return "h_id_manag_data";
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
        if (_idManagDataId == null) { return false; }
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
        if (obj instanceof BsHIdManagData) {
            BsHIdManagData other = (BsHIdManagData)obj;
            if (!xSV(_idManagDataId, other._idManagDataId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _idManagDataId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_idManagDataId));
        sb.append(dm).append(xfND(_idManagNo));
        sb.append(dm).append(xfND(_tenhanshaCd));
        sb.append(dm).append(xfND(_salesOrgCd));
        sb.append(dm).append(xfND(_customerCd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_hinmokuText));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_unitNm));
        sb.append(dm).append(xfND(_sharedProductTypeCd));
        sb.append(dm).append(xfND(_customerOrderNo));
        sb.append(dm).append(xfND(_delivCd));
        sb.append(dm).append(xfND(_destinationZipCd));
        sb.append(dm).append(xfND(_destinationAddress1));
        sb.append(dm).append(xfND(_destinationAddress2));
        sb.append(dm).append(xfND(_destinationNm1));
        sb.append(dm).append(xfND(_destinationNm2));
        sb.append(dm).append(xfND(_destinationTel));
        sb.append(dm).append(xfND(_empIdCd));
        sb.append(dm).append(xfND(_empNm));
        sb.append(dm).append(xfND(_storeDt));
        sb.append(dm).append(xfND(_inventoryDt));
        sb.append(dm).append(xfND(_pickingDt));
        sb.append(dm).append(xfND(_productReturnDt));
        sb.append(dm).append(xfND(_wasteReturnDt));
        sb.append(dm).append(xfND(_idManagAbolitionTypeCd));
        sb.append(dm).append(xfND(_spareTypeCd));
        sb.append(dm).append(xfND(_dataExtFlgPicking));
        sb.append(dm).append(xfND(_dataAddDtPicking));
        sb.append(dm).append(xfND(_dataExtFlgReturn));
        sb.append(dm).append(xfND(_dataAddDtReturn));
        sb.append(dm).append(xfND(_dataExtFlgWaste));
        sb.append(dm).append(xfND(_dataAddDtWaste));
        sb.append(dm).append(xfND(_workDt));
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
    public HIdManagData clone() {
        return (HIdManagData)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ID_MANAG_DATA_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 個体管理情報ID
     * @return The value of the column 'ID_MANAG_DATA_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getIdManagDataId() {
        checkSpecifiedProperty("idManagDataId");
        return _idManagDataId;
    }

    /**
     * [set] ID_MANAG_DATA_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 個体管理情報ID
     * @param idManagDataId The value of the column 'ID_MANAG_DATA_ID'. (basically NotNull if update: for the constraint)
     */
    public void setIdManagDataId(Long idManagDataId) {
        registerModifiedProperty("idManagDataId");
        _idManagDataId = idManagDataId;
    }

    /**
     * [get] ID_MANAG_NO: {VARCHAR(30)} <br>
     * 個体管理番号
     * @return The value of the column 'ID_MANAG_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getIdManagNo() {
        checkSpecifiedProperty("idManagNo");
        return convertEmptyToNull(_idManagNo);
    }

    /**
     * [set] ID_MANAG_NO: {VARCHAR(30)} <br>
     * 個体管理番号
     * @param idManagNo The value of the column 'ID_MANAG_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIdManagNo(String idManagNo) {
        registerModifiedProperty("idManagNo");
        _idManagNo = idManagNo;
    }

    /**
     * [get] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @return The value of the column 'TENHANSHA_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaCd() {
        checkSpecifiedProperty("tenhanshaCd");
        return convertEmptyToNull(_tenhanshaCd);
    }

    /**
     * [set] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @param tenhanshaCd The value of the column 'TENHANSHA_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaCd(String tenhanshaCd) {
        registerModifiedProperty("tenhanshaCd");
        _tenhanshaCd = tenhanshaCd;
    }

    /**
     * [get] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @return The value of the column 'SALES_ORG_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrgCd() {
        checkSpecifiedProperty("salesOrgCd");
        return convertEmptyToNull(_salesOrgCd);
    }

    /**
     * [set] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @param salesOrgCd The value of the column 'SALES_ORG_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgCd(String salesOrgCd) {
        registerModifiedProperty("salesOrgCd");
        _salesOrgCd = salesOrgCd;
    }

    /**
     * [get] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerCd() {
        checkSpecifiedProperty("customerCd");
        return convertEmptyToNull(_customerCd);
    }

    /**
     * [set] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerCd(String customerCd) {
        registerModifiedProperty("customerCd");
        _customerCd = customerCd;
    }

    /**
     * [get] PRODUCT_CD: {VARCHAR(30)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(30)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] HINMOKU_TEXT: {VARCHAR(60)} <br>
     * 品目テキスト
     * @return The value of the column 'HINMOKU_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getHinmokuText() {
        checkSpecifiedProperty("hinmokuText");
        return convertEmptyToNull(_hinmokuText);
    }

    /**
     * [set] HINMOKU_TEXT: {VARCHAR(60)} <br>
     * 品目テキスト
     * @param hinmokuText The value of the column 'HINMOKU_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHinmokuText(String hinmokuText) {
        registerModifiedProperty("hinmokuText");
        _hinmokuText = hinmokuText;
    }

    /**
     * [get] JAN_CD: {VARCHAR(30)} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
    }

    /**
     * [get] UNIT_NM: {VARCHAR(30)} <br>
     * 単位名称
     * @return The value of the column 'UNIT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnitNm() {
        checkSpecifiedProperty("unitNm");
        return convertEmptyToNull(_unitNm);
    }

    /**
     * [set] UNIT_NM: {VARCHAR(30)} <br>
     * 単位名称
     * @param unitNm The value of the column 'UNIT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitNm(String unitNm) {
        registerModifiedProperty("unitNm");
        _unitNm = unitNm;
    }

    /**
     * [get] SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)} <br>
     * 共有商品区分
     * @return The value of the column 'SHARED_PRODUCT_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSharedProductTypeCd() {
        checkSpecifiedProperty("sharedProductTypeCd");
        return convertEmptyToNull(_sharedProductTypeCd);
    }

    /**
     * [set] SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)} <br>
     * 共有商品区分
     * @param sharedProductTypeCd The value of the column 'SHARED_PRODUCT_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSharedProductTypeCd(String sharedProductTypeCd) {
        registerModifiedProperty("sharedProductTypeCd");
        _sharedProductTypeCd = sharedProductTypeCd;
    }

    /**
     * [get] CUSTOMER_ORDER_NO: {VARCHAR(30)} <br>
     * 取引先注文番号
     * @return The value of the column 'CUSTOMER_ORDER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerOrderNo() {
        checkSpecifiedProperty("customerOrderNo");
        return convertEmptyToNull(_customerOrderNo);
    }

    /**
     * [set] CUSTOMER_ORDER_NO: {VARCHAR(30)} <br>
     * 取引先注文番号
     * @param customerOrderNo The value of the column 'CUSTOMER_ORDER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerOrderNo(String customerOrderNo) {
        registerModifiedProperty("customerOrderNo");
        _customerOrderNo = customerOrderNo;
    }

    /**
     * [get] DELIV_CD: {VARCHAR(30)} <br>
     * 納入先CD
     * @return The value of the column 'DELIV_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCd() {
        checkSpecifiedProperty("delivCd");
        return convertEmptyToNull(_delivCd);
    }

    /**
     * [set] DELIV_CD: {VARCHAR(30)} <br>
     * 納入先CD
     * @param delivCd The value of the column 'DELIV_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCd(String delivCd) {
        registerModifiedProperty("delivCd");
        _delivCd = delivCd;
    }

    /**
     * [get] DESTINATION_ZIP_CD: {VARCHAR(30)} <br>
     * 送り先郵便番号
     * @return The value of the column 'DESTINATION_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationZipCd() {
        checkSpecifiedProperty("destinationZipCd");
        return convertEmptyToNull(_destinationZipCd);
    }

    /**
     * [set] DESTINATION_ZIP_CD: {VARCHAR(30)} <br>
     * 送り先郵便番号
     * @param destinationZipCd The value of the column 'DESTINATION_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationZipCd(String destinationZipCd) {
        registerModifiedProperty("destinationZipCd");
        _destinationZipCd = destinationZipCd;
    }

    /**
     * [get] DESTINATION_ADDRESS1: {VARCHAR(255)} <br>
     * 送り先住所１
     * @return The value of the column 'DESTINATION_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationAddress1() {
        checkSpecifiedProperty("destinationAddress1");
        return convertEmptyToNull(_destinationAddress1);
    }

    /**
     * [set] DESTINATION_ADDRESS1: {VARCHAR(255)} <br>
     * 送り先住所１
     * @param destinationAddress1 The value of the column 'DESTINATION_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationAddress1(String destinationAddress1) {
        registerModifiedProperty("destinationAddress1");
        _destinationAddress1 = destinationAddress1;
    }

    /**
     * [get] DESTINATION_ADDRESS2: {VARCHAR(255)} <br>
     * 送り先住所２
     * @return The value of the column 'DESTINATION_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationAddress2() {
        checkSpecifiedProperty("destinationAddress2");
        return convertEmptyToNull(_destinationAddress2);
    }

    /**
     * [set] DESTINATION_ADDRESS2: {VARCHAR(255)} <br>
     * 送り先住所２
     * @param destinationAddress2 The value of the column 'DESTINATION_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationAddress2(String destinationAddress2) {
        registerModifiedProperty("destinationAddress2");
        _destinationAddress2 = destinationAddress2;
    }

    /**
     * [get] DESTINATION_NM1: {VARCHAR(60)} <br>
     * 送り先名称１
     * @return The value of the column 'DESTINATION_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationNm1() {
        checkSpecifiedProperty("destinationNm1");
        return convertEmptyToNull(_destinationNm1);
    }

    /**
     * [set] DESTINATION_NM1: {VARCHAR(60)} <br>
     * 送り先名称１
     * @param destinationNm1 The value of the column 'DESTINATION_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationNm1(String destinationNm1) {
        registerModifiedProperty("destinationNm1");
        _destinationNm1 = destinationNm1;
    }

    /**
     * [get] DESTINATION_NM2: {VARCHAR(60)} <br>
     * 送り先名称２
     * @return The value of the column 'DESTINATION_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationNm2() {
        checkSpecifiedProperty("destinationNm2");
        return convertEmptyToNull(_destinationNm2);
    }

    /**
     * [set] DESTINATION_NM2: {VARCHAR(60)} <br>
     * 送り先名称２
     * @param destinationNm2 The value of the column 'DESTINATION_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationNm2(String destinationNm2) {
        registerModifiedProperty("destinationNm2");
        _destinationNm2 = destinationNm2;
    }

    /**
     * [get] DESTINATION_TEL: {VARCHAR(30)} <br>
     * 送り先電話番号
     * @return The value of the column 'DESTINATION_TEL'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationTel() {
        checkSpecifiedProperty("destinationTel");
        return convertEmptyToNull(_destinationTel);
    }

    /**
     * [set] DESTINATION_TEL: {VARCHAR(30)} <br>
     * 送り先電話番号
     * @param destinationTel The value of the column 'DESTINATION_TEL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationTel(String destinationTel) {
        registerModifiedProperty("destinationTel");
        _destinationTel = destinationTel;
    }

    /**
     * [get] EMP_ID_CD: {VARCHAR(30)} <br>
     * 社員識別コード
     * @return The value of the column 'EMP_ID_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmpIdCd() {
        checkSpecifiedProperty("empIdCd");
        return convertEmptyToNull(_empIdCd);
    }

    /**
     * [set] EMP_ID_CD: {VARCHAR(30)} <br>
     * 社員識別コード
     * @param empIdCd The value of the column 'EMP_ID_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmpIdCd(String empIdCd) {
        registerModifiedProperty("empIdCd");
        _empIdCd = empIdCd;
    }

    /**
     * [get] EMP_NM: {VARCHAR(60)} <br>
     * 氏名
     * @return The value of the column 'EMP_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmpNm() {
        checkSpecifiedProperty("empNm");
        return convertEmptyToNull(_empNm);
    }

    /**
     * [set] EMP_NM: {VARCHAR(60)} <br>
     * 氏名
     * @param empNm The value of the column 'EMP_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmpNm(String empNm) {
        registerModifiedProperty("empNm");
        _empNm = empNm;
    }

    /**
     * [get] STORE_DT: {VARCHAR(8)} <br>
     * 入庫日
     * @return The value of the column 'STORE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreDt() {
        checkSpecifiedProperty("storeDt");
        return convertEmptyToNull(_storeDt);
    }

    /**
     * [set] STORE_DT: {VARCHAR(8)} <br>
     * 入庫日
     * @param storeDt The value of the column 'STORE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreDt(String storeDt) {
        registerModifiedProperty("storeDt");
        _storeDt = storeDt;
    }

    /**
     * [get] INVENTORY_DT: {VARCHAR(8)} <br>
     * 棚卸日
     * @return The value of the column 'INVENTORY_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryDt() {
        checkSpecifiedProperty("inventoryDt");
        return convertEmptyToNull(_inventoryDt);
    }

    /**
     * [set] INVENTORY_DT: {VARCHAR(8)} <br>
     * 棚卸日
     * @param inventoryDt The value of the column 'INVENTORY_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryDt(String inventoryDt) {
        registerModifiedProperty("inventoryDt");
        _inventoryDt = inventoryDt;
    }

    /**
     * [get] PICKING_DT: {VARCHAR(8)} <br>
     * 出庫日
     * @return The value of the column 'PICKING_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingDt() {
        checkSpecifiedProperty("pickingDt");
        return convertEmptyToNull(_pickingDt);
    }

    /**
     * [set] PICKING_DT: {VARCHAR(8)} <br>
     * 出庫日
     * @param pickingDt The value of the column 'PICKING_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingDt(String pickingDt) {
        registerModifiedProperty("pickingDt");
        _pickingDt = pickingDt;
    }

    /**
     * [get] PRODUCT_RETURN_DT: {VARCHAR(8)} <br>
     * 良品返却日
     * @return The value of the column 'PRODUCT_RETURN_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductReturnDt() {
        checkSpecifiedProperty("productReturnDt");
        return convertEmptyToNull(_productReturnDt);
    }

    /**
     * [set] PRODUCT_RETURN_DT: {VARCHAR(8)} <br>
     * 良品返却日
     * @param productReturnDt The value of the column 'PRODUCT_RETURN_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductReturnDt(String productReturnDt) {
        registerModifiedProperty("productReturnDt");
        _productReturnDt = productReturnDt;
    }

    /**
     * [get] WASTE_RETURN_DT: {VARCHAR(8)} <br>
     * 廃棄返却日
     * @return The value of the column 'WASTE_RETURN_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWasteReturnDt() {
        checkSpecifiedProperty("wasteReturnDt");
        return convertEmptyToNull(_wasteReturnDt);
    }

    /**
     * [set] WASTE_RETURN_DT: {VARCHAR(8)} <br>
     * 廃棄返却日
     * @param wasteReturnDt The value of the column 'WASTE_RETURN_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWasteReturnDt(String wasteReturnDt) {
        registerModifiedProperty("wasteReturnDt");
        _wasteReturnDt = wasteReturnDt;
    }

    /**
     * [get] ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)} <br>
     * 個体管理廃止区分
     * @return The value of the column 'ID_MANAG_ABOLITION_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getIdManagAbolitionTypeCd() {
        checkSpecifiedProperty("idManagAbolitionTypeCd");
        return convertEmptyToNull(_idManagAbolitionTypeCd);
    }

    /**
     * [set] ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)} <br>
     * 個体管理廃止区分
     * @param idManagAbolitionTypeCd The value of the column 'ID_MANAG_ABOLITION_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIdManagAbolitionTypeCd(String idManagAbolitionTypeCd) {
        registerModifiedProperty("idManagAbolitionTypeCd");
        _idManagAbolitionTypeCd = idManagAbolitionTypeCd;
    }

    /**
     * [get] SPARE_TYPE_CD: {VARCHAR(30)} <br>
     * 予備区分
     * @return The value of the column 'SPARE_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareTypeCd() {
        checkSpecifiedProperty("spareTypeCd");
        return convertEmptyToNull(_spareTypeCd);
    }

    /**
     * [set] SPARE_TYPE_CD: {VARCHAR(30)} <br>
     * 予備区分
     * @param spareTypeCd The value of the column 'SPARE_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareTypeCd(String spareTypeCd) {
        registerModifiedProperty("spareTypeCd");
        _spareTypeCd = spareTypeCd;
    }

    /**
     * [get] DATA_EXT_FLG_PICKING: {CHAR(1)} <br>
     * 提供データ抽出済_出庫
     * @return The value of the column 'DATA_EXT_FLG_PICKING'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataExtFlgPicking() {
        checkSpecifiedProperty("dataExtFlgPicking");
        return convertEmptyToNull(_dataExtFlgPicking);
    }

    /**
     * [set] DATA_EXT_FLG_PICKING: {CHAR(1)} <br>
     * 提供データ抽出済_出庫
     * @param dataExtFlgPicking The value of the column 'DATA_EXT_FLG_PICKING'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataExtFlgPicking(String dataExtFlgPicking) {
        registerModifiedProperty("dataExtFlgPicking");
        _dataExtFlgPicking = dataExtFlgPicking;
    }

    /**
     * [get] DATA_ADD_DT_PICKING: {VARCHAR(8)} <br>
     * 提供データ作成日_出庫
     * @return The value of the column 'DATA_ADD_DT_PICKING'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataAddDtPicking() {
        checkSpecifiedProperty("dataAddDtPicking");
        return convertEmptyToNull(_dataAddDtPicking);
    }

    /**
     * [set] DATA_ADD_DT_PICKING: {VARCHAR(8)} <br>
     * 提供データ作成日_出庫
     * @param dataAddDtPicking The value of the column 'DATA_ADD_DT_PICKING'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataAddDtPicking(String dataAddDtPicking) {
        registerModifiedProperty("dataAddDtPicking");
        _dataAddDtPicking = dataAddDtPicking;
    }

    /**
     * [get] DATA_EXT_FLG_RETURN: {CHAR(1)} <br>
     * 提供データ抽出済_良返
     * @return The value of the column 'DATA_EXT_FLG_RETURN'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataExtFlgReturn() {
        checkSpecifiedProperty("dataExtFlgReturn");
        return convertEmptyToNull(_dataExtFlgReturn);
    }

    /**
     * [set] DATA_EXT_FLG_RETURN: {CHAR(1)} <br>
     * 提供データ抽出済_良返
     * @param dataExtFlgReturn The value of the column 'DATA_EXT_FLG_RETURN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataExtFlgReturn(String dataExtFlgReturn) {
        registerModifiedProperty("dataExtFlgReturn");
        _dataExtFlgReturn = dataExtFlgReturn;
    }

    /**
     * [get] DATA_ADD_DT_RETURN: {VARCHAR(8)} <br>
     * 提供データ作成日_良返
     * @return The value of the column 'DATA_ADD_DT_RETURN'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataAddDtReturn() {
        checkSpecifiedProperty("dataAddDtReturn");
        return convertEmptyToNull(_dataAddDtReturn);
    }

    /**
     * [set] DATA_ADD_DT_RETURN: {VARCHAR(8)} <br>
     * 提供データ作成日_良返
     * @param dataAddDtReturn The value of the column 'DATA_ADD_DT_RETURN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataAddDtReturn(String dataAddDtReturn) {
        registerModifiedProperty("dataAddDtReturn");
        _dataAddDtReturn = dataAddDtReturn;
    }

    /**
     * [get] DATA_EXT_FLG_WASTE: {CHAR(1)} <br>
     * 提供データ抽出済_廃棄
     * @return The value of the column 'DATA_EXT_FLG_WASTE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataExtFlgWaste() {
        checkSpecifiedProperty("dataExtFlgWaste");
        return convertEmptyToNull(_dataExtFlgWaste);
    }

    /**
     * [set] DATA_EXT_FLG_WASTE: {CHAR(1)} <br>
     * 提供データ抽出済_廃棄
     * @param dataExtFlgWaste The value of the column 'DATA_EXT_FLG_WASTE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataExtFlgWaste(String dataExtFlgWaste) {
        registerModifiedProperty("dataExtFlgWaste");
        _dataExtFlgWaste = dataExtFlgWaste;
    }

    /**
     * [get] DATA_ADD_DT_WASTE: {VARCHAR(8)} <br>
     * 提供データ作成日_廃棄
     * @return The value of the column 'DATA_ADD_DT_WASTE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataAddDtWaste() {
        checkSpecifiedProperty("dataAddDtWaste");
        return convertEmptyToNull(_dataAddDtWaste);
    }

    /**
     * [set] DATA_ADD_DT_WASTE: {VARCHAR(8)} <br>
     * 提供データ作成日_廃棄
     * @param dataAddDtWaste The value of the column 'DATA_ADD_DT_WASTE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataAddDtWaste(String dataAddDtWaste) {
        registerModifiedProperty("dataAddDtWaste");
        _dataAddDtWaste = dataAddDtWaste;
    }

    /**
     * [get] WORK_DT: {VARCHAR(8)} <br>
     * 作業日
     * @return The value of the column 'WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] WORK_DT: {VARCHAR(8)} <br>
     * 作業日
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
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