package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of v_ht_dict as VIEW. <br>
 * VIEW
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     DICT_ID, DICT_NM, CULTURE_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
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
 * Long dictId = entity.getDictId();
 * String dictNm = entity.getDictNm();
 * Long cultureId = entity.getCultureId();
 * entity.setDictId(dictId);
 * entity.setDictNm(dictNm);
 * entity.setCultureId(cultureId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVHtDict extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DICT_ID: {NotNull, BIGINT(19), default=[0]} */
    protected Long _dictId;

    /** DICT_NM: {NotNull, VARCHAR(100)} */
    protected String _dictNm;

    /** CULTURE_ID: {NotNull, BIGINT(19), default=[0]} */
    protected Long _cultureId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "v_ht_dict";
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
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
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
        if (obj instanceof BsVHtDict) {
            BsVHtDict other = (BsVHtDict)obj;
            if (!xSV(_dictId, other._dictId)) { return false; }
            if (!xSV(_dictNm, other._dictNm)) { return false; }
            if (!xSV(_cultureId, other._cultureId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _dictId);
        hs = xCH(hs, _dictNm);
        hs = xCH(hs, _cultureId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_dictId));
        sb.append(dm).append(xfND(_dictNm));
        sb.append(dm).append(xfND(_cultureId));
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
    public VHtDict clone() {
        return (VHtDict)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DICT_ID: {NotNull, BIGINT(19), default=[0]} <br>
     * 辞書ID
     * @return The value of the column 'DICT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDictId() {
        checkSpecifiedProperty("dictId");
        return _dictId;
    }

    /**
     * [set] DICT_ID: {NotNull, BIGINT(19), default=[0]} <br>
     * 辞書ID
     * @param dictId The value of the column 'DICT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDictId(Long dictId) {
        registerModifiedProperty("dictId");
        _dictId = dictId;
    }

    /**
     * [get] DICT_NM: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'DICT_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getDictNm() {
        checkSpecifiedProperty("dictNm");
        return convertEmptyToNull(_dictNm);
    }

    /**
     * [set] DICT_NM: {NotNull, VARCHAR(100)} <br>
     * @param dictNm The value of the column 'DICT_NM'. (basically NotNull if update: for the constraint)
     */
    public void setDictNm(String dictNm) {
        registerModifiedProperty("dictNm");
        _dictNm = dictNm;
    }

    /**
     * [get] CULTURE_ID: {NotNull, BIGINT(19), default=[0]} <br>
     * カルチャID
     * @return The value of the column 'CULTURE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCultureId() {
        checkSpecifiedProperty("cultureId");
        return _cultureId;
    }

    /**
     * [set] CULTURE_ID: {NotNull, BIGINT(19), default=[0]} <br>
     * カルチャID
     * @param cultureId The value of the column 'CULTURE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCultureId(Long cultureId) {
        registerModifiedProperty("cultureId");
        _cultureId = cultureId;
    }
}
