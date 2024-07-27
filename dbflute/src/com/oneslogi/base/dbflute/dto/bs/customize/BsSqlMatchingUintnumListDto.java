package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlMatchingUintnumList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MATCHING_KEYWORD, UNIT_NUM, GROSS_WEIGHT, SHAPE_SORT
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
@JsonModel(decamelize = false)
public abstract class BsSqlMatchingUintnumListDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** MATCHING_KEYWORD: {VARCHAR(100), refers to m_matching.MATCHING_KEYWORD} */
    @JsonKey
    protected String _matchingKeyword;

    /** UNIT_NUM: {BIGINT(20), refers to m_product_shape.UNIT_NUM} */
    @JsonKey
    protected Long _unitNum;

    /** GROSS_WEIGHT: {DECIMAL(14, 4), refers to m_product_shape.GROSS_WEIGHT} */
    @JsonKey
    protected java.math.BigDecimal _grossWeight;

    /** SHAPE_SORT: {BIGINT(20), refers to m_shape_grp_dtl.SHAPE_SORT} */
    @JsonKey
    protected Long _shapeSort;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlMatchingUintnumListDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsSqlMatchingUintnumListDto)) { return false; }
        final BsSqlMatchingUintnumListDto otherEntity = (BsSqlMatchingUintnumListDto)other;
        if (!helpComparingValue(getMatchingKeyword(), otherEntity.getMatchingKeyword())) { return false; }
        if (!helpComparingValue(getUnitNum(), otherEntity.getUnitNum())) { return false; }
        if (!helpComparingValue(getGrossWeight(), otherEntity.getGrossWeight())) { return false; }
        if (!helpComparingValue(getShapeSort(), otherEntity.getShapeSort())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlMatchingUintnumList");
        result = xCH(result, getMatchingKeyword());
        result = xCH(result, getUnitNum());
        result = xCH(result, getGrossWeight());
        result = xCH(result, getShapeSort());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getMatchingKeyword());
        sb.append(c).append(getUnitNum());
        sb.append(c).append(getGrossWeight());
        sb.append(c).append(getShapeSort());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MATCHING_KEYWORD: {VARCHAR(100), refers to m_matching.MATCHING_KEYWORD} <br>
     * マッチングキーワード
     * @return The value of the column 'MATCHING_KEYWORD'. (NullAllowed)
     */
    public String getMatchingKeyword() {
        return _matchingKeyword;
    }

    /**
     * [set] MATCHING_KEYWORD: {VARCHAR(100), refers to m_matching.MATCHING_KEYWORD} <br>
     * マッチングキーワード
     * @param matchingKeyword The value of the column 'MATCHING_KEYWORD'. (NullAllowed)
     */
    public void setMatchingKeyword(String matchingKeyword) {
        __modifiedProperties.add("matchingKeyword");
        this._matchingKeyword = matchingKeyword;
    }

    /**
     * [get] UNIT_NUM: {BIGINT(20), refers to m_product_shape.UNIT_NUM} <br>
     * 入数
     * @return The value of the column 'UNIT_NUM'. (NullAllowed)
     */
    public Long getUnitNum() {
        return _unitNum;
    }

    /**
     * [set] UNIT_NUM: {BIGINT(20), refers to m_product_shape.UNIT_NUM} <br>
     * 入数
     * @param unitNum The value of the column 'UNIT_NUM'. (NullAllowed)
     */
    public void setUnitNum(Long unitNum) {
        __modifiedProperties.add("unitNum");
        this._unitNum = unitNum;
    }

    /**
     * [get] GROSS_WEIGHT: {DECIMAL(14, 4), refers to m_product_shape.GROSS_WEIGHT} <br>
     * 総重量(g)
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getGrossWeight() {
        return _grossWeight;
    }

    /**
     * [set] GROSS_WEIGHT: {DECIMAL(14, 4), refers to m_product_shape.GROSS_WEIGHT} <br>
     * 総重量(g)
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public void setGrossWeight(java.math.BigDecimal grossWeight) {
        __modifiedProperties.add("grossWeight");
        this._grossWeight = grossWeight;
    }

    /**
     * [get] SHAPE_SORT: {BIGINT(20), refers to m_shape_grp_dtl.SHAPE_SORT} <br>
     * 荷姿ソート順
     * @return The value of the column 'SHAPE_SORT'. (NullAllowed)
     */
    public Long getShapeSort() {
        return _shapeSort;
    }

    /**
     * [set] SHAPE_SORT: {BIGINT(20), refers to m_shape_grp_dtl.SHAPE_SORT} <br>
     * 荷姿ソート順
     * @param shapeSort The value of the column 'SHAPE_SORT'. (NullAllowed)
     */
    public void setShapeSort(Long shapeSort) {
        __modifiedProperties.add("shapeSort");
        this._shapeSort = shapeSort;
    }

}
