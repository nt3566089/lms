package com.oneslogi.base.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.paging.SimplePagingBean;
import org.dbflute.outsidesql.typed.*;
import org.dbflute.jdbc.*;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The base class for typed parameter-bean of SqlPickingListPrint. <br>
 * This is related to "<span style="color: #AD4747">selectSqlPickingListPrint</span>" on TPickingHBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlPickingListPrintPmb extends SimplePagingBean implements EntityHandlingPmb<TPickingHBhv, SqlPickingListPrint>, AutoPagingHandlingPmb<TPickingHBhv, SqlPickingListPrint>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of cultureId. */
    protected Long _cultureId;

    /** The parameter of centerCd. */
    protected String _centerCd;

    /** The parameter of shippingSlipType. */
    protected String _shippingSlipType;

    /** The parameter of printStatus. */
    protected String _printStatus;

    /** The parameter of deliveryCourseCd. */
    protected String _deliveryCourseCd;

    /** The parameter of carrierCd. */
    protected String _carrierCd;

    /** The parameter of clientShippingNo:likePrefix. */
    protected String _clientShippingNo;

    /** The option of like-search for clientShippingNo. */
    protected LikeSearchOption _clientShippingNoInternalLikeSearchOption;

    /** The parameter of dtFrom. */
    protected String _dtFrom;

    /** The parameter of searchReferenceDt. */
    protected String _searchReferenceDt;

    /** The parameter of dtTo. */
    protected String _dtTo;

    /** The parameter of nizoroeNo2From. */
    protected String _nizoroeNo2From;

    /** The parameter of nizoroeNo2To. */
    protected String _nizoroeNo2To;

    /** The parameter of daihyoNizoroeNo2From. */
    protected String _daihyoNizoroeNo2From;

    /** The parameter of daihyoNizoroeNo2To. */
    protected String _daihyoNizoroeNo2To;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlPickingListPrint. <br>
     * This is related to "<span style="color: #AD4747">selectSqlPickingListPrint</span>" on TPickingHBhv.
     */
    public BsSqlPickingListPrintPmb() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectSqlPickingListPrint"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlPickingListPrint> getEntityType() { return SqlPickingListPrint.class; }

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
        sb.append(dm).append(_cultureId);
        sb.append(dm).append(_centerCd);
        sb.append(dm).append(_shippingSlipType);
        sb.append(dm).append(_printStatus);
        sb.append(dm).append(_deliveryCourseCd);
        sb.append(dm).append(_carrierCd);
        sb.append(dm).append(_clientShippingNo);
        sb.append(dm).append(_dtFrom);
        sb.append(dm).append(_searchReferenceDt);
        sb.append(dm).append(_dtTo);
        sb.append(dm).append(_nizoroeNo2From);
        sb.append(dm).append(_nizoroeNo2To);
        sb.append(dm).append(_daihyoNizoroeNo2From);
        sb.append(dm).append(_daihyoNizoroeNo2To);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] cultureId <br>
     * @return The value of cultureId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getCultureId() {
        return _cultureId;
    }

    /**
     * [set] cultureId <br>
     * @param cultureId The value of cultureId. (NullAllowed)
     */
    public void setCultureId(Long cultureId) {
        _cultureId = cultureId;
    }

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
     * [get] shippingSlipType <br>
     * @return The value of shippingSlipType. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getShippingSlipType() {
        return filterStringParameter(_shippingSlipType);
    }

    /**
     * [set] shippingSlipType <br>
     * @param shippingSlipType The value of shippingSlipType. (NullAllowed)
     */
    public void setShippingSlipType(String shippingSlipType) {
        _shippingSlipType = shippingSlipType;
    }

    /**
     * [get] printStatus <br>
     * @return The value of printStatus. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPrintStatus() {
        return filterStringParameter(_printStatus);
    }

    /**
     * [set] printStatus <br>
     * @param printStatus The value of printStatus. (NullAllowed)
     */
    public void setPrintStatus(String printStatus) {
        _printStatus = printStatus;
    }

    /**
     * [get] deliveryCourseCd <br>
     * @return The value of deliveryCourseCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getDeliveryCourseCd() {
        return filterStringParameter(_deliveryCourseCd);
    }

    /**
     * [set] deliveryCourseCd <br>
     * @param deliveryCourseCd The value of deliveryCourseCd. (NullAllowed)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        _deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] carrierCd <br>
     * @return The value of carrierCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getCarrierCd() {
        return filterStringParameter(_carrierCd);
    }

    /**
     * [set] carrierCd <br>
     * @param carrierCd The value of carrierCd. (NullAllowed)
     */
    public void setCarrierCd(String carrierCd) {
        _carrierCd = carrierCd;
    }

    /**
     * [get] clientShippingNo:likePrefix <br>
     * @return The value of clientShippingNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getClientShippingNo() {
        return filterStringParameter(_clientShippingNo);
    }

    /**
     * [set as prefixSearch] clientShippingNo:likePrefix <br>
     * @param clientShippingNo The value of clientShippingNo. (NullAllowed)
     */
    public void setClientShippingNo_PrefixSearch(String clientShippingNo) {
        _clientShippingNo = clientShippingNo;
        _clientShippingNoInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for clientShippingNo. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for clientShippingNo. (NullAllowed)
     */
    public LikeSearchOption getClientShippingNoInternalLikeSearchOption() {
        return _clientShippingNoInternalLikeSearchOption;
    }

    /**
     * [get] dtFrom <br>
     * @return The value of dtFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getDtFrom() {
        return filterStringParameter(_dtFrom);
    }

    /**
     * [set] dtFrom <br>
     * @param dtFrom The value of dtFrom. (NullAllowed)
     */
    public void setDtFrom(String dtFrom) {
        _dtFrom = dtFrom;
    }

    /**
     * [get] searchReferenceDt <br>
     * @return The value of searchReferenceDt. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getSearchReferenceDt() {
        return filterStringParameter(_searchReferenceDt);
    }

    /**
     * [set] searchReferenceDt <br>
     * @param searchReferenceDt The value of searchReferenceDt. (NullAllowed)
     */
    public void setSearchReferenceDt(String searchReferenceDt) {
        _searchReferenceDt = searchReferenceDt;
    }

    /**
     * [get] dtTo <br>
     * @return The value of dtTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getDtTo() {
        return filterStringParameter(_dtTo);
    }

    /**
     * [set] dtTo <br>
     * @param dtTo The value of dtTo. (NullAllowed)
     */
    public void setDtTo(String dtTo) {
        _dtTo = dtTo;
    }

    /**
     * [get] nizoroeNo2From <br>
     * @return The value of nizoroeNo2From. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getNizoroeNo2From() {
        return filterStringParameter(_nizoroeNo2From);
    }

    /**
     * [set] nizoroeNo2From <br>
     * @param nizoroeNo2From The value of nizoroeNo2From. (NullAllowed)
     */
    public void setNizoroeNo2From(String nizoroeNo2From) {
        _nizoroeNo2From = nizoroeNo2From;
    }

    /**
     * [get] nizoroeNo2To <br>
     * @return The value of nizoroeNo2To. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getNizoroeNo2To() {
        return filterStringParameter(_nizoroeNo2To);
    }

    /**
     * [set] nizoroeNo2To <br>
     * @param nizoroeNo2To The value of nizoroeNo2To. (NullAllowed)
     */
    public void setNizoroeNo2To(String nizoroeNo2To) {
        _nizoroeNo2To = nizoroeNo2To;
    }

    /**
     * [get] daihyoNizoroeNo2From <br>
     * @return The value of daihyoNizoroeNo2From. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getDaihyoNizoroeNo2From() {
        return filterStringParameter(_daihyoNizoroeNo2From);
    }

    /**
     * [set] daihyoNizoroeNo2From <br>
     * @param daihyoNizoroeNo2From The value of daihyoNizoroeNo2From. (NullAllowed)
     */
    public void setDaihyoNizoroeNo2From(String daihyoNizoroeNo2From) {
        _daihyoNizoroeNo2From = daihyoNizoroeNo2From;
    }

    /**
     * [get] daihyoNizoroeNo2To <br>
     * @return The value of daihyoNizoroeNo2To. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getDaihyoNizoroeNo2To() {
        return filterStringParameter(_daihyoNizoroeNo2To);
    }

    /**
     * [set] daihyoNizoroeNo2To <br>
     * @param daihyoNizoroeNo2To The value of daihyoNizoroeNo2To. (NullAllowed)
     */
    public void setDaihyoNizoroeNo2To(String daihyoNizoroeNo2To) {
        _daihyoNizoroeNo2To = daihyoNizoroeNo2To;
    }
}
