package com.oneslogi.base.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.typed.*;
import org.dbflute.jdbc.*;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The base class for typed parameter-bean of SqlInventoryListPrintReportData01. <br>
 * This is related to "<span style="color: #AD4747">selectSqlInventoryListPrintReportData01</span>" on TInventoryBBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlInventoryListPrintReportData01Pmb implements ListHandlingPmb<TInventoryBBhv, SqlInventoryListPrintReportData01>, EntityHandlingPmb<TInventoryBBhv, SqlInventoryListPrintReportData01>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of centerCd. */
    protected String _centerCd;

    /** The parameter of depCustomerCd. */
    protected String _depCustomerCd;

    /** The parameter of inventoryDt. */
    protected String _inventoryDt;

    /** The parameter of locationFrom. */
    protected String _locationFrom;

    /** The parameter of locationTo. */
    protected String _locationTo;

    /** The parameter of areaCd. */
    protected String _areaCd;

    /** The parameter of inventoryUserCd:likePrefix. */
    protected String _inventoryUserCd;

    /** The option of like-search for inventoryUserCd. */
    protected LikeSearchOption _inventoryUserCdInternalLikeSearchOption;

    /** The parameter of isPrintType. */
    protected boolean _isPrintType;

    /** The parameter of isInventoryDiff. */
    protected boolean _isInventoryDiff;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlInventoryListPrintReportData01. <br>
     * This is related to "<span style="color: #AD4747">selectSqlInventoryListPrintReportData01</span>" on TInventoryBBhv.
     */
    public BsSqlInventoryListPrintReportData01Pmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectSqlInventoryListPrintReportData01"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlInventoryListPrintReportData01> getEntityType() { return SqlInventoryListPrintReportData01.class; }

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        _safetyMaxResultSize = safetyMaxResultSize;
    }

    /**
     * {@inheritDoc}
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    // -----------------------------------------------------
    //                                                String
    //                                                ------
    protected String filterStringParameter(String value) { return isEmptyStringParameterAllowed() ? value : convertEmptyToNull(value); }
    protected boolean isEmptyStringParameterAllowed() { return DBFluteConfig.getInstance().isEmptyStringParameterAllowed(); }
    protected String convertEmptyToNull(String value) { return PmbCustodial.convertEmptyToNull(value); }

    protected void assertLikeSearchOptionValid(String name, LikeSearchOption option) { PmbCustodial.assertLikeSearchOptionValid(name, option); }

    // -----------------------------------------------------
    //                                                  Date
    //                                                  ----
    protected Date toUtilDate(Object date) { return PmbCustodial.toUtilDate(date, _timeZone); }

    // -----------------------------------------------------
    //                                    by Option Handling
    //                                    ------------------
    // might be called by option handling
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) { return PmbCustodial.toNumber(obj, type); }
    protected Boolean toBoolean(Object obj) { return PmbCustodial.toBoolean(obj); }
    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) { return PmbCustodial.newArrayList(elements); }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    protected String xbuildColumnString() {
        final String dm = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_centerCd);
        sb.append(dm).append(_depCustomerCd);
        sb.append(dm).append(_inventoryDt);
        sb.append(dm).append(_locationFrom);
        sb.append(dm).append(_locationTo);
        sb.append(dm).append(_areaCd);
        sb.append(dm).append(_inventoryUserCd);
        sb.append(dm).append(_isPrintType);
        sb.append(dm).append(_isInventoryDiff);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] centerCd <br>
     * @return The value of centerCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getCenterCd() {
        return filterStringParameter(_centerCd);
    }

    /**
     * [set] centerCd <br>
     * @param centerCd The value of centerCd. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        _centerCd = centerCd;
    }

    /**
     * [get] depCustomerCd <br>
     * @return The value of depCustomerCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getDepCustomerCd() {
        return filterStringParameter(_depCustomerCd);
    }

    /**
     * [set] depCustomerCd <br>
     * @param depCustomerCd The value of depCustomerCd. (NullAllowed)
     */
    public void setDepCustomerCd(String depCustomerCd) {
        _depCustomerCd = depCustomerCd;
    }

    /**
     * [get] inventoryDt <br>
     * @return The value of inventoryDt. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getInventoryDt() {
        return filterStringParameter(_inventoryDt);
    }

    /**
     * [set] inventoryDt <br>
     * @param inventoryDt The value of inventoryDt. (NullAllowed)
     */
    public void setInventoryDt(String inventoryDt) {
        _inventoryDt = inventoryDt;
    }

    /**
     * [get] locationFrom <br>
     * @return The value of locationFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getLocationFrom() {
        return filterStringParameter(_locationFrom);
    }

    /**
     * [set] locationFrom <br>
     * @param locationFrom The value of locationFrom. (NullAllowed)
     */
    public void setLocationFrom(String locationFrom) {
        _locationFrom = locationFrom;
    }

    /**
     * [get] locationTo <br>
     * @return The value of locationTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getLocationTo() {
        return filterStringParameter(_locationTo);
    }

    /**
     * [set] locationTo <br>
     * @param locationTo The value of locationTo. (NullAllowed)
     */
    public void setLocationTo(String locationTo) {
        _locationTo = locationTo;
    }

    /**
     * [get] areaCd <br>
     * @return The value of areaCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getAreaCd() {
        return filterStringParameter(_areaCd);
    }

    /**
     * [set] areaCd <br>
     * @param areaCd The value of areaCd. (NullAllowed)
     */
    public void setAreaCd(String areaCd) {
        _areaCd = areaCd;
    }

    /**
     * [get] inventoryUserCd:likePrefix <br>
     * @return The value of inventoryUserCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getInventoryUserCd() {
        return filterStringParameter(_inventoryUserCd);
    }

    /**
     * [set as prefixSearch] inventoryUserCd:likePrefix <br>
     * @param inventoryUserCd The value of inventoryUserCd. (NullAllowed)
     */
    public void setInventoryUserCd_PrefixSearch(String inventoryUserCd) {
        _inventoryUserCd = inventoryUserCd;
        _inventoryUserCdInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for inventoryUserCd. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for inventoryUserCd. (NullAllowed)
     */
    public LikeSearchOption getInventoryUserCdInternalLikeSearchOption() {
        return _inventoryUserCdInternalLikeSearchOption;
    }

    /**
     * [get] isPrintType <br>
     * @return The value of isPrintType. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public boolean getIsPrintType() {
        return _isPrintType;
    }

    /**
     * [set] isPrintType <br>
     * @param isPrintType The value of isPrintType. (NullAllowed)
     */
    public void setIsPrintType(boolean isPrintType) {
        _isPrintType = isPrintType;
    }

    /**
     * [get] isInventoryDiff <br>
     * @return The value of isInventoryDiff. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public boolean getIsInventoryDiff() {
        return _isInventoryDiff;
    }

    /**
     * [set] isInventoryDiff <br>
     * @param isInventoryDiff The value of isInventoryDiff. (NullAllowed)
     */
    public void setIsInventoryDiff(boolean isInventoryDiff) {
        _isInventoryDiff = isInventoryDiff;
    }
}
