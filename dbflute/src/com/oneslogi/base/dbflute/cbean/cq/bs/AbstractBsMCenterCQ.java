package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of m_center.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCenterCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCenterCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "m_center";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param centerId The value of centerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_Equal(Long centerId) {
        doSetCenterId_Equal(centerId);
    }

    protected void doSetCenterId_Equal(Long centerId) {
        regCenterId(CK_EQ, centerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param centerId The value of centerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_NotEqual(Long centerId) {
        doSetCenterId_NotEqual(centerId);
    }

    protected void doSetCenterId_NotEqual(Long centerId) {
        regCenterId(CK_NES, centerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param centerIdList The collection of centerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_InScope(Collection<Long> centerIdList) {
        doSetCenterId_InScope(centerIdList);
    }

    protected void doSetCenterId_InScope(Collection<Long> centerIdList) {
        regINS(CK_INS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from h_location_attribute where ...)} <br>
     * h_location_attribute by CENTER_ID, named 'HLocationAttributeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsHLocationAttributeList</span>(attributeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     attributeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of HLocationAttributeList for 'exists'. (NotNull)
     */
    public void existsHLocationAttributeList(SubQuery<HLocationAttributeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HLocationAttributeCB cb = new HLocationAttributeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_HLocationAttributeList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "hLocationAttributeList");
    }
    public abstract String keepCenterId_ExistsReferrer_HLocationAttributeList(HLocationAttributeCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_box where ...)} <br>
     * m_box by CENTER_ID, named 'MBoxAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMBoxList</span>(boxCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     boxCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MBoxList for 'exists'. (NotNull)
     */
    public void existsMBoxList(SubQuery<MBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxCB cb = new MBoxCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MBoxList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mBoxList");
    }
    public abstract String keepCenterId_ExistsReferrer_MBoxList(MBoxCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_box_grp where ...)} <br>
     * m_box_grp by CENTER_ID, named 'MBoxGrpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMBoxGrpList</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MBoxGrpList for 'exists'. (NotNull)
     */
    public void existsMBoxGrpList(SubQuery<MBoxGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxGrpCB cb = new MBoxGrpCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MBoxGrpList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mBoxGrpList");
    }
    public abstract String keepCenterId_ExistsReferrer_MBoxGrpList(MBoxGrpCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_carrier where ...)} <br>
     * m_carrier by CENTER_ID, named 'MCarrierAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierList</span>(carrierCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     carrierCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierList for 'exists'. (NotNull)
     */
    public void existsMCarrierList(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCarrierList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCarrierList(MCarrierCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_carrier_slip_sgw where ...)} <br>
     * m_carrier_slip_sgw by CENTER_ID, named 'MCarrierSlipSgwAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierSlipSgwList</span>(sgwCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     sgwCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierSlipSgwList for 'exists'. (NotNull)
     */
    public void existsMCarrierSlipSgwList(SubQuery<MCarrierSlipSgwCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipSgwCB cb = new MCarrierSlipSgwCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCarrierSlipSgwList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierSlipSgwList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_carrier_slip_ymt where ...)} <br>
     * m_carrier_slip_ymt by CENTER_ID, named 'MCarrierSlipYmtAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierSlipYmtList</span>(ymtCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ymtCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierSlipYmtList for 'exists'. (NotNull)
     */
    public void existsMCarrierSlipYmtList(SubQuery<MCarrierSlipYmtCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipYmtCB cb = new MCarrierSlipYmtCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCarrierSlipYmtList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierSlipYmtList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_carrier_slip_yupk where ...)} <br>
     * m_carrier_slip_yupk by CENTER_ID, named 'MCarrierSlipYupkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierSlipYupkList</span>(yupkCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     yupkCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierSlipYupkList for 'exists'. (NotNull)
     */
    public void existsMCarrierSlipYupkList(SubQuery<MCarrierSlipYupkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipYupkCB cb = new MCarrierSlipYupkCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCarrierSlipYupkList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierSlipYupkList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_center_class where ...)} <br>
     * m_center_class by CENTER_ID, named 'MCenterClassAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterClassList</span>(classCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     classCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterClassList for 'exists'. (NotNull)
     */
    public void existsMCenterClassList(SubQuery<MCenterClassCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassCB cb = new MCenterClassCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCenterClassList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterClassList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCenterClassList(MCenterClassCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_center_col where ...)} <br>
     * m_center_col by CENTER_ID, named 'MCenterColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterColList</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterColList for 'exists'. (NotNull)
     */
    public void existsMCenterColList(SubQuery<MCenterColCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterColCB cb = new MCenterColCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCenterColList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterColList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCenterColList(MCenterColCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_center_customer where ...)} <br>
     * m_center_customer by CENTER_ID, named 'MCenterCustomerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterCustomerList</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterCustomerList for 'exists'. (NotNull)
     */
    public void existsMCenterCustomerList(SubQuery<MCenterCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCenterCustomerList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterCustomerList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_center_item where ...)} <br>
     * m_center_item by CENTER_ID, named 'MCenterItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterItemList for 'exists'. (NotNull)
     */
    public void existsMCenterItemList(SubQuery<MCenterItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterItemCB cb = new MCenterItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCenterItemList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterItemList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCenterItemList(MCenterItemCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_center_screen where ...)} <br>
     * m_center_screen by CENTER_ID, named 'MCenterScreenAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterScreenList</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     screenCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterScreenList for 'exists'. (NotNull)
     */
    public void existsMCenterScreenList(SubQuery<MCenterScreenCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterScreenCB cb = new MCenterScreenCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCenterScreenList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterScreenList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCenterScreenList(MCenterScreenCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_client_center where ...)} <br>
     * m_client_center by CENTER_ID, named 'MClientCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMClientCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MClientCenterList for 'exists'. (NotNull)
     */
    public void existsMClientCenterList(SubQuery<MClientCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MClientCenterList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mClientCenterList");
    }
    public abstract String keepCenterId_ExistsReferrer_MClientCenterList(MClientCenterCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_customer_picking where ...)} <br>
     * m_customer_picking by CENTER_ID, named 'MCustomerPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCustomerPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCustomerPickingList for 'exists'. (NotNull)
     */
    public void existsMCustomerPickingList(SubQuery<MCustomerPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerPickingCB cb = new MCustomerPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCustomerPickingList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCustomerPickingList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCustomerPickingList(MCustomerPickingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_delivery_course where ...)} <br>
     * m_delivery_course by CENTER_ID, named 'MDeliveryCourseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMDeliveryCourseList</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     courseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MDeliveryCourseList for 'exists'. (NotNull)
     */
    public void existsMDeliveryCourseList(SubQuery<MDeliveryCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MDeliveryCourseList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mDeliveryCourseList");
    }
    public abstract String keepCenterId_ExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_general where ...)} <br>
     * m_general by CENTER_ID, named 'MGeneralAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMGeneralList</span>(generalCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     generalCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MGeneralList for 'exists'. (NotNull)
     */
    public void existsMGeneralList(SubQuery<MGeneralCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MGeneralCB cb = new MGeneralCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MGeneralList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mGeneralList");
    }
    public abstract String keepCenterId_ExistsReferrer_MGeneralList(MGeneralCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_location where ...)} <br>
     * m_location by CENTER_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMLocationList</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MLocationList for 'exists'. (NotNull)
     */
    public void existsMLocationList(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MLocationList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mLocationList");
    }
    public abstract String keepCenterId_ExistsReferrer_MLocationList(MLocationCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_nizoroe where ...)} <br>
     * m_nizoroe by CENTER_ID, named 'MNizoroeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMNizoroeList</span>(nizoroeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     nizoroeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MNizoroeList for 'exists'. (NotNull)
     */
    public void existsMNizoroeList(SubQuery<MNizoroeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MNizoroeCB cb = new MNizoroeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MNizoroeList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mNizoroeList");
    }
    public abstract String keepCenterId_ExistsReferrer_MNizoroeList(MNizoroeCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_numbering_center where ...)} <br>
     * m_numbering_center by CENTER_ID, named 'MNumberingCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMNumberingCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MNumberingCenterList for 'exists'. (NotNull)
     */
    public void existsMNumberingCenterList(SubQuery<MNumberingCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MNumberingCenterCB cb = new MNumberingCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MNumberingCenterList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mNumberingCenterList");
    }
    public abstract String keepCenterId_ExistsReferrer_MNumberingCenterList(MNumberingCenterCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_user_center where ...)} <br>
     * m_user_center by CENTER_ID, named 'MUserCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMUserCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MUserCenterList for 'exists'. (NotNull)
     */
    public void existsMUserCenterList(SubQuery<MUserCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserCenterCB cb = new MUserCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MUserCenterList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mUserCenterList");
    }
    public abstract String keepCenterId_ExistsReferrer_MUserCenterList(MUserCenterCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_user_login where ...)} <br>
     * m_user_login by CENTER_ID, named 'MUserLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMUserLoginList</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MUserLoginList for 'exists'. (NotNull)
     */
    public void existsMUserLoginList(SubQuery<MUserLoginCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserLoginCB cb = new MUserLoginCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MUserLoginList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mUserLoginList");
    }
    public abstract String keepCenterId_ExistsReferrer_MUserLoginList(MUserLoginCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_warehouse where ...)} <br>
     * m_warehouse by CENTER_ID, named 'MWarehouseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMWarehouseList</span>(warehouseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     warehouseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MWarehouseList for 'exists'. (NotNull)
     */
    public void existsMWarehouseList(SubQuery<MWarehouseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWarehouseCB cb = new MWarehouseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MWarehouseList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mWarehouseList");
    }
    public abstract String keepCenterId_ExistsReferrer_MWarehouseList(MWarehouseCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from m_web_ht_info where ...)} <br>
     * m_web_ht_info by CENTER_ID, named 'MWebHtInfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMWebHtInfoList</span>(infoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     infoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MWebHtInfoList for 'exists'. (NotNull)
     */
    public void existsMWebHtInfoList(SubQuery<MWebHtInfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWebHtInfoCB cb = new MWebHtInfoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MWebHtInfoList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mWebHtInfoList");
    }
    public abstract String keepCenterId_ExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from t_alloc_inst_h where ...)} <br>
     * t_alloc_inst_h by CENTER_ID, named 'TAllocInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAllocInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAllocInstHList for 'exists'. (NotNull)
     */
    public void existsTAllocInstHList(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TAllocInstHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tAllocInstHList");
    }
    public abstract String keepCenterId_ExistsReferrer_TAllocInstHList(TAllocInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from t_ec_order_h where ...)} <br>
     * t_ec_order_h by CENTER_ID, named 'TEcOrderHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTEcOrderHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TEcOrderHList for 'exists'. (NotNull)
     */
    public void existsTEcOrderHList(SubQuery<TEcOrderHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TEcOrderHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tEcOrderHList");
    }
    public abstract String keepCenterId_ExistsReferrer_TEcOrderHList(TEcOrderHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from t_inventory_h where ...)} <br>
     * t_inventory_h by CENTER_ID, named 'TInventoryHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryHList for 'exists'. (NotNull)
     */
    public void existsTInventoryHList(SubQuery<TInventoryHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryHCB cb = new TInventoryHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TInventoryHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tInventoryHList");
    }
    public abstract String keepCenterId_ExistsReferrer_TInventoryHList(TInventoryHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from t_move_inst_h where ...)} <br>
     * t_move_inst_h by CENTER_ID, named 'TMoveInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTMoveInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TMoveInstHList for 'exists'. (NotNull)
     */
    public void existsTMoveInstHList(SubQuery<TMoveInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstHCB cb = new TMoveInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TMoveInstHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tMoveInstHList");
    }
    public abstract String keepCenterId_ExistsReferrer_TMoveInstHList(TMoveInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from t_packing_h where ...)} <br>
     * t_packing_h by CENTER_ID, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPackingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPackingHList for 'exists'. (NotNull)
     */
    public void existsTPackingHList(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TPackingHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPackingHList");
    }
    public abstract String keepCenterId_ExistsReferrer_TPackingHList(TPackingHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from t_pic_mthd_rcmd where ...)} <br>
     * t_pic_mthd_rcmd by CENTER_ID, named 'TPicMthdRcmdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPicMthdRcmdList</span>(rcmdCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rcmdCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPicMthdRcmdList for 'exists'. (NotNull)
     */
    public void existsTPicMthdRcmdList(SubQuery<TPicMthdRcmdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdCB cb = new TPicMthdRcmdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TPicMthdRcmdList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPicMthdRcmdList");
    }
    public abstract String keepCenterId_ExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from t_picking_h where ...)} <br>
     * t_picking_h by CENTER_ID, named 'TPickingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingHList for 'exists'. (NotNull)
     */
    public void existsTPickingHList(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TPickingHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPickingHList");
    }
    public abstract String keepCenterId_ExistsReferrer_TPickingHList(TPickingHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from t_receive_plan_h where ...)} <br>
     * t_receive_plan_h by CENTER_ID, named 'TReceivePlanHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReceivePlanHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReceivePlanHList for 'exists'. (NotNull)
     */
    public void existsTReceivePlanHList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TReceivePlanHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tReceivePlanHList");
    }
    public abstract String keepCenterId_ExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from t_serial_no where ...)} <br>
     * t_serial_no by CENTER_ID, named 'TSerialNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTSerialNoList</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TSerialNoList for 'exists'. (NotNull)
     */
    public void existsTSerialNoList(SubQuery<TSerialNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TSerialNoCB cb = new TSerialNoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TSerialNoList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tSerialNoList");
    }
    public abstract String keepCenterId_ExistsReferrer_TSerialNoList(TSerialNoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from t_shipping_inst_h where ...)} <br>
     * t_shipping_inst_h by CENTER_ID, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingInstHList for 'exists'. (NotNull)
     */
    public void existsTShippingInstHList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TShippingInstHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tShippingInstHList");
    }
    public abstract String keepCenterId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from t_store_record_h where ...)} <br>
     * t_store_record_h by CENTER_ID, named 'TStoreRecordHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStoreRecordHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStoreRecordHList for 'exists'. (NotNull)
     */
    public void existsTStoreRecordHList(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TStoreRecordHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tStoreRecordHList");
    }
    public abstract String keepCenterId_ExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from w_ht_inventory_input_prod where ...)} <br>
     * w_ht_inventory_input_prod by CENTER_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtInventoryInputProdList</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtInventoryInputProdList for 'exists'. (NotNull)
     */
    public void existsWHtInventoryInputProdList(SubQuery<WHtInventoryInputProdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtInventoryInputProdList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtInventoryInputProdList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from w_ht_loading where ...)} <br>
     * w_ht_loading by CENTER_ID, named 'WHtLoadingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtLoadingList</span>(loadingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loadingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtLoadingList for 'exists'. (NotNull)
     */
    public void existsWHtLoadingList(SubQuery<WHtLoadingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtLoadingCB cb = new WHtLoadingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtLoadingList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtLoadingList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtLoadingList(WHtLoadingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from w_ht_picking where ...)} <br>
     * w_ht_picking by CENTER_ID, named 'WHtPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtPickingList for 'exists'. (NotNull)
     */
    public void existsWHtPickingList(SubQuery<WHtPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtPickingCB cb = new WHtPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtPickingList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtPickingList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtPickingList(WHtPickingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from w_ht_receive_inspection where ...)} <br>
     * w_ht_receive_inspection by CENTER_ID, named 'WHtReceiveInspectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtReceiveInspectionList</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspectionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtReceiveInspectionList for 'exists'. (NotNull)
     */
    public void existsWHtReceiveInspectionList(SubQuery<WHtReceiveInspectionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtReceiveInspectionList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtReceiveInspectionList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from w_ht_receive_no_plan_insp where ...)} <br>
     * w_ht_receive_no_plan_insp by CENTER_ID, named 'WHtReceiveNoPlanInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtReceiveNoPlanInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtReceiveNoPlanInspList for 'exists'. (NotNull)
     */
    public void existsWHtReceiveNoPlanInspList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtReceiveNoPlanInspList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from w_ht_receive_store where ...)} <br>
     * w_ht_receive_store by CENTER_ID, named 'WHtReceiveStoreAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtReceiveStoreList</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     storeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtReceiveStoreList for 'exists'. (NotNull)
     */
    public void existsWHtReceiveStoreList(SubQuery<WHtReceiveStoreCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtReceiveStoreList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtReceiveStoreList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from w_ht_serial_receive_insp where ...)} <br>
     * w_ht_serial_receive_insp by CENTER_ID, named 'WHtSerialReceiveInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtSerialReceiveInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtSerialReceiveInspList for 'exists'. (NotNull)
     */
    public void existsWHtSerialReceiveInspList(SubQuery<WHtSerialReceiveInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtSerialReceiveInspCB cb = new WHtSerialReceiveInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtSerialReceiveInspList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtSerialReceiveInspList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from w_ht_serial_shipping_insp where ...)} <br>
     * w_ht_serial_shipping_insp by CENTER_ID, named 'WHtSerialShippingInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtSerialShippingInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtSerialShippingInspList for 'exists'. (NotNull)
     */
    public void existsWHtSerialShippingInspList(SubQuery<WHtSerialShippingInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtSerialShippingInspCB cb = new WHtSerialShippingInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtSerialShippingInspList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtSerialShippingInspList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from w_ht_shipping where ...)} <br>
     * w_ht_shipping by CENTER_ID, named 'WHtShippingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtShippingList</span>(shippingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shippingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtShippingList for 'exists'. (NotNull)
     */
    public void existsWHtShippingList(SubQuery<WHtShippingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtShippingList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtShippingList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from w_ht_shipping_picking where ...)} <br>
     * w_ht_shipping_picking by CENTER_ID, named 'WHtShippingPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtShippingPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtShippingPickingList for 'exists'. (NotNull)
     */
    public void existsWHtShippingPickingList(SubQuery<WHtShippingPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtShippingPickingList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtShippingPickingList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from w_ht_total_picking where ...)} <br>
     * w_ht_total_picking by CENTER_ID, named 'WHtTotalPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtTotalPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtTotalPickingList for 'exists'. (NotNull)
     */
    public void existsWHtTotalPickingList(SubQuery<WHtTotalPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtTotalPickingCB cb = new WHtTotalPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtTotalPickingList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtTotalPickingList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from w_sgl_row_ship_insp_h where ...)} <br>
     * w_sgl_row_ship_insp_h by CENTER_ID, named 'WSglRowShipInspHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWSglRowShipInspHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WSglRowShipInspHList for 'exists'. (NotNull)
     */
    public void existsWSglRowShipInspHList(SubQuery<WSglRowShipInspHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WSglRowShipInspHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wSglRowShipInspHList");
    }
    public abstract String keepCenterId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from w_shipping_interrupt where ...)} <br>
     * w_shipping_interrupt by CENTER_ID, named 'WShippingInterruptAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWShippingInterruptList</span>(interruptCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     interruptCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WShippingInterruptList for 'exists'. (NotNull)
     */
    public void existsWShippingInterruptList(SubQuery<WShippingInterruptCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WShippingInterruptList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wShippingInterruptList");
    }
    public abstract String keepCenterId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from h_location_attribute where ...)} <br>
     * h_location_attribute by CENTER_ID, named 'HLocationAttributeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsHLocationAttributeList</span>(attributeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     attributeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_HLocationAttributeList for 'not exists'. (NotNull)
     */
    public void notExistsHLocationAttributeList(SubQuery<HLocationAttributeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HLocationAttributeCB cb = new HLocationAttributeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_HLocationAttributeList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "hLocationAttributeList");
    }
    public abstract String keepCenterId_NotExistsReferrer_HLocationAttributeList(HLocationAttributeCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_box where ...)} <br>
     * m_box by CENTER_ID, named 'MBoxAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMBoxList</span>(boxCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     boxCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MBoxList for 'not exists'. (NotNull)
     */
    public void notExistsMBoxList(SubQuery<MBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxCB cb = new MBoxCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MBoxList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mBoxList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MBoxList(MBoxCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_box_grp where ...)} <br>
     * m_box_grp by CENTER_ID, named 'MBoxGrpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMBoxGrpList</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MBoxGrpList for 'not exists'. (NotNull)
     */
    public void notExistsMBoxGrpList(SubQuery<MBoxGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxGrpCB cb = new MBoxGrpCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MBoxGrpList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mBoxGrpList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MBoxGrpList(MBoxGrpCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_carrier where ...)} <br>
     * m_carrier by CENTER_ID, named 'MCarrierAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierList</span>(carrierCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     carrierCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCarrierList for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierList(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCarrierList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCarrierList(MCarrierCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_carrier_slip_sgw where ...)} <br>
     * m_carrier_slip_sgw by CENTER_ID, named 'MCarrierSlipSgwAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierSlipSgwList</span>(sgwCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     sgwCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCarrierSlipSgwList for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierSlipSgwList(SubQuery<MCarrierSlipSgwCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipSgwCB cb = new MCarrierSlipSgwCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCarrierSlipSgwList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierSlipSgwList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_carrier_slip_ymt where ...)} <br>
     * m_carrier_slip_ymt by CENTER_ID, named 'MCarrierSlipYmtAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierSlipYmtList</span>(ymtCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ymtCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCarrierSlipYmtList for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierSlipYmtList(SubQuery<MCarrierSlipYmtCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipYmtCB cb = new MCarrierSlipYmtCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCarrierSlipYmtList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierSlipYmtList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_carrier_slip_yupk where ...)} <br>
     * m_carrier_slip_yupk by CENTER_ID, named 'MCarrierSlipYupkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierSlipYupkList</span>(yupkCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     yupkCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCarrierSlipYupkList for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierSlipYupkList(SubQuery<MCarrierSlipYupkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipYupkCB cb = new MCarrierSlipYupkCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCarrierSlipYupkList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierSlipYupkList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_center_class where ...)} <br>
     * m_center_class by CENTER_ID, named 'MCenterClassAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterClassList</span>(classCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     classCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCenterClassList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterClassList(SubQuery<MCenterClassCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassCB cb = new MCenterClassCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCenterClassList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterClassList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCenterClassList(MCenterClassCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_center_col where ...)} <br>
     * m_center_col by CENTER_ID, named 'MCenterColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterColList</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCenterColList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterColList(SubQuery<MCenterColCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterColCB cb = new MCenterColCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCenterColList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterColList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCenterColList(MCenterColCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_center_customer where ...)} <br>
     * m_center_customer by CENTER_ID, named 'MCenterCustomerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterCustomerList</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCenterCustomerList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterCustomerList(SubQuery<MCenterCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCenterCustomerList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterCustomerList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_center_item where ...)} <br>
     * m_center_item by CENTER_ID, named 'MCenterItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCenterItemList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterItemList(SubQuery<MCenterItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterItemCB cb = new MCenterItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCenterItemList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterItemList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCenterItemList(MCenterItemCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_center_screen where ...)} <br>
     * m_center_screen by CENTER_ID, named 'MCenterScreenAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterScreenList</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     screenCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCenterScreenList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterScreenList(SubQuery<MCenterScreenCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterScreenCB cb = new MCenterScreenCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCenterScreenList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterScreenList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCenterScreenList(MCenterScreenCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_client_center where ...)} <br>
     * m_client_center by CENTER_ID, named 'MClientCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMClientCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MClientCenterList for 'not exists'. (NotNull)
     */
    public void notExistsMClientCenterList(SubQuery<MClientCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MClientCenterList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mClientCenterList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MClientCenterList(MClientCenterCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_customer_picking where ...)} <br>
     * m_customer_picking by CENTER_ID, named 'MCustomerPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCustomerPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCustomerPickingList for 'not exists'. (NotNull)
     */
    public void notExistsMCustomerPickingList(SubQuery<MCustomerPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerPickingCB cb = new MCustomerPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCustomerPickingList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCustomerPickingList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCustomerPickingList(MCustomerPickingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_delivery_course where ...)} <br>
     * m_delivery_course by CENTER_ID, named 'MDeliveryCourseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMDeliveryCourseList</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     courseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MDeliveryCourseList for 'not exists'. (NotNull)
     */
    public void notExistsMDeliveryCourseList(SubQuery<MDeliveryCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MDeliveryCourseList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mDeliveryCourseList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_general where ...)} <br>
     * m_general by CENTER_ID, named 'MGeneralAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMGeneralList</span>(generalCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     generalCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MGeneralList for 'not exists'. (NotNull)
     */
    public void notExistsMGeneralList(SubQuery<MGeneralCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MGeneralCB cb = new MGeneralCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MGeneralList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mGeneralList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MGeneralList(MGeneralCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_location where ...)} <br>
     * m_location by CENTER_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMLocationList</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MLocationList for 'not exists'. (NotNull)
     */
    public void notExistsMLocationList(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MLocationList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mLocationList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MLocationList(MLocationCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_nizoroe where ...)} <br>
     * m_nizoroe by CENTER_ID, named 'MNizoroeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMNizoroeList</span>(nizoroeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     nizoroeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MNizoroeList for 'not exists'. (NotNull)
     */
    public void notExistsMNizoroeList(SubQuery<MNizoroeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MNizoroeCB cb = new MNizoroeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MNizoroeList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mNizoroeList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MNizoroeList(MNizoroeCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_numbering_center where ...)} <br>
     * m_numbering_center by CENTER_ID, named 'MNumberingCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMNumberingCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MNumberingCenterList for 'not exists'. (NotNull)
     */
    public void notExistsMNumberingCenterList(SubQuery<MNumberingCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MNumberingCenterCB cb = new MNumberingCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MNumberingCenterList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mNumberingCenterList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MNumberingCenterList(MNumberingCenterCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_user_center where ...)} <br>
     * m_user_center by CENTER_ID, named 'MUserCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMUserCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MUserCenterList for 'not exists'. (NotNull)
     */
    public void notExistsMUserCenterList(SubQuery<MUserCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserCenterCB cb = new MUserCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MUserCenterList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mUserCenterList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MUserCenterList(MUserCenterCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_user_login where ...)} <br>
     * m_user_login by CENTER_ID, named 'MUserLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMUserLoginList</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MUserLoginList for 'not exists'. (NotNull)
     */
    public void notExistsMUserLoginList(SubQuery<MUserLoginCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserLoginCB cb = new MUserLoginCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MUserLoginList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mUserLoginList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MUserLoginList(MUserLoginCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_warehouse where ...)} <br>
     * m_warehouse by CENTER_ID, named 'MWarehouseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMWarehouseList</span>(warehouseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     warehouseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MWarehouseList for 'not exists'. (NotNull)
     */
    public void notExistsMWarehouseList(SubQuery<MWarehouseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWarehouseCB cb = new MWarehouseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MWarehouseList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mWarehouseList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MWarehouseList(MWarehouseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from m_web_ht_info where ...)} <br>
     * m_web_ht_info by CENTER_ID, named 'MWebHtInfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMWebHtInfoList</span>(infoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     infoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MWebHtInfoList for 'not exists'. (NotNull)
     */
    public void notExistsMWebHtInfoList(SubQuery<MWebHtInfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWebHtInfoCB cb = new MWebHtInfoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MWebHtInfoList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mWebHtInfoList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from t_alloc_inst_h where ...)} <br>
     * t_alloc_inst_h by CENTER_ID, named 'TAllocInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TAllocInstHList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocInstHList(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TAllocInstHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tAllocInstHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TAllocInstHList(TAllocInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from t_ec_order_h where ...)} <br>
     * t_ec_order_h by CENTER_ID, named 'TEcOrderHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTEcOrderHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TEcOrderHList for 'not exists'. (NotNull)
     */
    public void notExistsTEcOrderHList(SubQuery<TEcOrderHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TEcOrderHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tEcOrderHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TEcOrderHList(TEcOrderHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from t_inventory_h where ...)} <br>
     * t_inventory_h by CENTER_ID, named 'TInventoryHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TInventoryHList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryHList(SubQuery<TInventoryHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryHCB cb = new TInventoryHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TInventoryHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tInventoryHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TInventoryHList(TInventoryHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from t_move_inst_h where ...)} <br>
     * t_move_inst_h by CENTER_ID, named 'TMoveInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMoveInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TMoveInstHList for 'not exists'. (NotNull)
     */
    public void notExistsTMoveInstHList(SubQuery<TMoveInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstHCB cb = new TMoveInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TMoveInstHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tMoveInstHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TMoveInstHList(TMoveInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from t_packing_h where ...)} <br>
     * t_packing_h by CENTER_ID, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPackingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TPackingHList for 'not exists'. (NotNull)
     */
    public void notExistsTPackingHList(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TPackingHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPackingHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TPackingHList(TPackingHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from t_pic_mthd_rcmd where ...)} <br>
     * t_pic_mthd_rcmd by CENTER_ID, named 'TPicMthdRcmdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPicMthdRcmdList</span>(rcmdCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rcmdCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TPicMthdRcmdList for 'not exists'. (NotNull)
     */
    public void notExistsTPicMthdRcmdList(SubQuery<TPicMthdRcmdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdCB cb = new TPicMthdRcmdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TPicMthdRcmdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPicMthdRcmdList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from t_picking_h where ...)} <br>
     * t_picking_h by CENTER_ID, named 'TPickingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TPickingHList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingHList(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TPickingHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPickingHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TPickingHList(TPickingHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from t_receive_plan_h where ...)} <br>
     * t_receive_plan_h by CENTER_ID, named 'TReceivePlanHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceivePlanHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TReceivePlanHList for 'not exists'. (NotNull)
     */
    public void notExistsTReceivePlanHList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TReceivePlanHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tReceivePlanHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from t_serial_no where ...)} <br>
     * t_serial_no by CENTER_ID, named 'TSerialNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTSerialNoList</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TSerialNoList for 'not exists'. (NotNull)
     */
    public void notExistsTSerialNoList(SubQuery<TSerialNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TSerialNoCB cb = new TSerialNoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TSerialNoList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tSerialNoList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TSerialNoList(TSerialNoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from t_shipping_inst_h where ...)} <br>
     * t_shipping_inst_h by CENTER_ID, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TShippingInstHList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstHList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TShippingInstHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tShippingInstHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from t_store_record_h where ...)} <br>
     * t_store_record_h by CENTER_ID, named 'TStoreRecordHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStoreRecordHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TStoreRecordHList for 'not exists'. (NotNull)
     */
    public void notExistsTStoreRecordHList(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TStoreRecordHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tStoreRecordHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from w_ht_inventory_input_prod where ...)} <br>
     * w_ht_inventory_input_prod by CENTER_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtInventoryInputProdList</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtInventoryInputProdList for 'not exists'. (NotNull)
     */
    public void notExistsWHtInventoryInputProdList(SubQuery<WHtInventoryInputProdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtInventoryInputProdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtInventoryInputProdList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from w_ht_loading where ...)} <br>
     * w_ht_loading by CENTER_ID, named 'WHtLoadingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtLoadingList</span>(loadingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loadingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtLoadingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtLoadingList(SubQuery<WHtLoadingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtLoadingCB cb = new WHtLoadingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtLoadingList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtLoadingList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtLoadingList(WHtLoadingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from w_ht_picking where ...)} <br>
     * w_ht_picking by CENTER_ID, named 'WHtPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtPickingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtPickingList(SubQuery<WHtPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtPickingCB cb = new WHtPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtPickingList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtPickingList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtPickingList(WHtPickingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from w_ht_receive_inspection where ...)} <br>
     * w_ht_receive_inspection by CENTER_ID, named 'WHtReceiveInspectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveInspectionList</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspectionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtReceiveInspectionList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveInspectionList(SubQuery<WHtReceiveInspectionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtReceiveInspectionList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtReceiveInspectionList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from w_ht_receive_no_plan_insp where ...)} <br>
     * w_ht_receive_no_plan_insp by CENTER_ID, named 'WHtReceiveNoPlanInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveNoPlanInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtReceiveNoPlanInspList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveNoPlanInspList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtReceiveNoPlanInspList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from w_ht_receive_store where ...)} <br>
     * w_ht_receive_store by CENTER_ID, named 'WHtReceiveStoreAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveStoreList</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     storeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtReceiveStoreList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveStoreList(SubQuery<WHtReceiveStoreCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtReceiveStoreList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtReceiveStoreList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from w_ht_serial_receive_insp where ...)} <br>
     * w_ht_serial_receive_insp by CENTER_ID, named 'WHtSerialReceiveInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtSerialReceiveInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtSerialReceiveInspList for 'not exists'. (NotNull)
     */
    public void notExistsWHtSerialReceiveInspList(SubQuery<WHtSerialReceiveInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtSerialReceiveInspCB cb = new WHtSerialReceiveInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtSerialReceiveInspList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtSerialReceiveInspList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from w_ht_serial_shipping_insp where ...)} <br>
     * w_ht_serial_shipping_insp by CENTER_ID, named 'WHtSerialShippingInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtSerialShippingInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtSerialShippingInspList for 'not exists'. (NotNull)
     */
    public void notExistsWHtSerialShippingInspList(SubQuery<WHtSerialShippingInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtSerialShippingInspCB cb = new WHtSerialShippingInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtSerialShippingInspList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtSerialShippingInspList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from w_ht_shipping where ...)} <br>
     * w_ht_shipping by CENTER_ID, named 'WHtShippingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtShippingList</span>(shippingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shippingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtShippingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtShippingList(SubQuery<WHtShippingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtShippingList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtShippingList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from w_ht_shipping_picking where ...)} <br>
     * w_ht_shipping_picking by CENTER_ID, named 'WHtShippingPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtShippingPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtShippingPickingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtShippingPickingList(SubQuery<WHtShippingPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtShippingPickingList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtShippingPickingList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from w_ht_total_picking where ...)} <br>
     * w_ht_total_picking by CENTER_ID, named 'WHtTotalPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtTotalPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtTotalPickingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtTotalPickingList(SubQuery<WHtTotalPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtTotalPickingCB cb = new WHtTotalPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtTotalPickingList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtTotalPickingList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from w_sgl_row_ship_insp_h where ...)} <br>
     * w_sgl_row_ship_insp_h by CENTER_ID, named 'WSglRowShipInspHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWSglRowShipInspHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WSglRowShipInspHList for 'not exists'. (NotNull)
     */
    public void notExistsWSglRowShipInspHList(SubQuery<WSglRowShipInspHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WSglRowShipInspHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wSglRowShipInspHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from w_shipping_interrupt where ...)} <br>
     * w_shipping_interrupt by CENTER_ID, named 'WShippingInterruptAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWShippingInterruptList</span>(interruptCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     interruptCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WShippingInterruptList for 'not exists'. (NotNull)
     */
    public void notExistsWShippingInterruptList(SubQuery<WShippingInterruptCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WShippingInterruptList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wShippingInterruptList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq);

    public void xsderiveHLocationAttributeList(String fn, SubQuery<HLocationAttributeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HLocationAttributeCB cb = new HLocationAttributeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_HLocationAttributeList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "hLocationAttributeList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_HLocationAttributeList(HLocationAttributeCQ sq);

    public void xsderiveMBoxList(String fn, SubQuery<MBoxCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxCB cb = new MBoxCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MBoxList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mBoxList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MBoxList(MBoxCQ sq);

    public void xsderiveMBoxGrpList(String fn, SubQuery<MBoxGrpCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxGrpCB cb = new MBoxGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MBoxGrpList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mBoxGrpList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MBoxGrpList(MBoxGrpCQ sq);

    public void xsderiveMCarrierList(String fn, SubQuery<MCarrierCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCarrierList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCarrierList(MCarrierCQ sq);

    public void xsderiveMCarrierSlipSgwList(String fn, SubQuery<MCarrierSlipSgwCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipSgwCB cb = new MCarrierSlipSgwCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCarrierSlipSgwList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierSlipSgwList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq);

    public void xsderiveMCarrierSlipYmtList(String fn, SubQuery<MCarrierSlipYmtCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipYmtCB cb = new MCarrierSlipYmtCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCarrierSlipYmtList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierSlipYmtList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq);

    public void xsderiveMCarrierSlipYupkList(String fn, SubQuery<MCarrierSlipYupkCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipYupkCB cb = new MCarrierSlipYupkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCarrierSlipYupkList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierSlipYupkList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq);

    public void xsderiveMCenterClassList(String fn, SubQuery<MCenterClassCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterClassCB cb = new MCenterClassCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCenterClassList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterClassList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCenterClassList(MCenterClassCQ sq);

    public void xsderiveMCenterColList(String fn, SubQuery<MCenterColCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterColCB cb = new MCenterColCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCenterColList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterColList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCenterColList(MCenterColCQ sq);

    public void xsderiveMCenterCustomerList(String fn, SubQuery<MCenterCustomerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCenterCustomerList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterCustomerList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq);

    public void xsderiveMCenterItemList(String fn, SubQuery<MCenterItemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterItemCB cb = new MCenterItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCenterItemList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterItemList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCenterItemList(MCenterItemCQ sq);

    public void xsderiveMCenterScreenList(String fn, SubQuery<MCenterScreenCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterScreenCB cb = new MCenterScreenCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCenterScreenList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterScreenList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCenterScreenList(MCenterScreenCQ sq);

    public void xsderiveMClientCenterList(String fn, SubQuery<MClientCenterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MClientCenterList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mClientCenterList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MClientCenterList(MClientCenterCQ sq);

    public void xsderiveMCustomerPickingList(String fn, SubQuery<MCustomerPickingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCustomerPickingCB cb = new MCustomerPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCustomerPickingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCustomerPickingList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCustomerPickingList(MCustomerPickingCQ sq);

    public void xsderiveMDeliveryCourseList(String fn, SubQuery<MDeliveryCourseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MDeliveryCourseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mDeliveryCourseList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);

    public void xsderiveMGeneralList(String fn, SubQuery<MGeneralCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MGeneralCB cb = new MGeneralCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MGeneralList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mGeneralList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MGeneralList(MGeneralCQ sq);

    public void xsderiveMLocationList(String fn, SubQuery<MLocationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MLocationList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mLocationList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq);

    public void xsderiveMNizoroeList(String fn, SubQuery<MNizoroeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MNizoroeCB cb = new MNizoroeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MNizoroeList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mNizoroeList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MNizoroeList(MNizoroeCQ sq);

    public void xsderiveMNumberingCenterList(String fn, SubQuery<MNumberingCenterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MNumberingCenterCB cb = new MNumberingCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MNumberingCenterList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mNumberingCenterList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MNumberingCenterList(MNumberingCenterCQ sq);

    public void xsderiveMUserCenterList(String fn, SubQuery<MUserCenterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserCenterCB cb = new MUserCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MUserCenterList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mUserCenterList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MUserCenterList(MUserCenterCQ sq);

    public void xsderiveMUserLoginList(String fn, SubQuery<MUserLoginCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserLoginCB cb = new MUserLoginCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MUserLoginList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mUserLoginList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MUserLoginList(MUserLoginCQ sq);

    public void xsderiveMWarehouseList(String fn, SubQuery<MWarehouseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWarehouseCB cb = new MWarehouseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MWarehouseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mWarehouseList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MWarehouseList(MWarehouseCQ sq);

    public void xsderiveMWebHtInfoList(String fn, SubQuery<MWebHtInfoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWebHtInfoCB cb = new MWebHtInfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MWebHtInfoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mWebHtInfoList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq);

    public void xsderiveTAllocInstHList(String fn, SubQuery<TAllocInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TAllocInstHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tAllocInstHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq);

    public void xsderiveTEcOrderHList(String fn, SubQuery<TEcOrderHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TEcOrderHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tEcOrderHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq);

    public void xsderiveTInventoryHList(String fn, SubQuery<TInventoryHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryHCB cb = new TInventoryHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TInventoryHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tInventoryHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TInventoryHList(TInventoryHCQ sq);

    public void xsderiveTMoveInstHList(String fn, SubQuery<TMoveInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstHCB cb = new TMoveInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TMoveInstHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tMoveInstHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq);

    public void xsderiveTPackingHList(String fn, SubQuery<TPackingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TPackingHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPackingHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq);

    public void xsderiveTPicMthdRcmdList(String fn, SubQuery<TPicMthdRcmdCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdCB cb = new TPicMthdRcmdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TPicMthdRcmdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPicMthdRcmdList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq);

    public void xsderiveTPickingHList(String fn, SubQuery<TPickingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TPickingHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPickingHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TPickingHList(TPickingHCQ sq);

    public void xsderiveTReceivePlanHList(String fn, SubQuery<TReceivePlanHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TReceivePlanHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tReceivePlanHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq);

    public void xsderiveTSerialNoList(String fn, SubQuery<TSerialNoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TSerialNoCB cb = new TSerialNoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TSerialNoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tSerialNoList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TSerialNoList(TSerialNoCQ sq);

    public void xsderiveTShippingInstHList(String fn, SubQuery<TShippingInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TShippingInstHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tShippingInstHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq);

    public void xsderiveTStoreRecordHList(String fn, SubQuery<TStoreRecordHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TStoreRecordHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tStoreRecordHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq);

    public void xsderiveWHtInventoryInputProdList(String fn, SubQuery<WHtInventoryInputProdCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtInventoryInputProdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtInventoryInputProdList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    public void xsderiveWHtLoadingList(String fn, SubQuery<WHtLoadingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtLoadingCB cb = new WHtLoadingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtLoadingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtLoadingList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq);

    public void xsderiveWHtPickingList(String fn, SubQuery<WHtPickingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtPickingCB cb = new WHtPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtPickingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtPickingList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtPickingList(WHtPickingCQ sq);

    public void xsderiveWHtReceiveInspectionList(String fn, SubQuery<WHtReceiveInspectionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtReceiveInspectionList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtReceiveInspectionList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    public void xsderiveWHtReceiveNoPlanInspList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtReceiveNoPlanInspList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    public void xsderiveWHtReceiveStoreList(String fn, SubQuery<WHtReceiveStoreCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtReceiveStoreList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtReceiveStoreList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    public void xsderiveWHtSerialReceiveInspList(String fn, SubQuery<WHtSerialReceiveInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtSerialReceiveInspCB cb = new WHtSerialReceiveInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtSerialReceiveInspList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);

    public void xsderiveWHtSerialShippingInspList(String fn, SubQuery<WHtSerialShippingInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtSerialShippingInspCB cb = new WHtSerialShippingInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtSerialShippingInspList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtSerialShippingInspList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);

    public void xsderiveWHtShippingList(String fn, SubQuery<WHtShippingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtShippingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtShippingList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq);

    public void xsderiveWHtShippingPickingList(String fn, SubQuery<WHtShippingPickingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtShippingPickingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtShippingPickingList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    public void xsderiveWHtTotalPickingList(String fn, SubQuery<WHtTotalPickingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtTotalPickingCB cb = new WHtTotalPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtTotalPickingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtTotalPickingList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq);

    public void xsderiveWSglRowShipInspHList(String fn, SubQuery<WSglRowShipInspHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WSglRowShipInspHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wSglRowShipInspHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);

    public void xsderiveWShippingInterruptList(String fn, SubQuery<WShippingInterruptCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WShippingInterruptList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wShippingInterruptList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from h_location_attribute where ...)} <br>
     * h_location_attribute by CENTER_ID, named 'HLocationAttributeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedHLocationAttributeList()</span>.<span style="color: #CC4747">max</span>(attributeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     attributeCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     attributeCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<HLocationAttributeCB> derivedHLocationAttributeList() {
        return xcreateQDRFunctionHLocationAttributeList();
    }
    protected HpQDRFunction<HLocationAttributeCB> xcreateQDRFunctionHLocationAttributeList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveHLocationAttributeList(fn, sq, rd, vl, op));
    }
    public void xqderiveHLocationAttributeList(String fn, SubQuery<HLocationAttributeCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HLocationAttributeCB cb = new HLocationAttributeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_HLocationAttributeList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_HLocationAttributeListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "hLocationAttributeList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_HLocationAttributeList(HLocationAttributeCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_HLocationAttributeListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_box where ...)} <br>
     * m_box by CENTER_ID, named 'MBoxAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMBoxList()</span>.<span style="color: #CC4747">max</span>(boxCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     boxCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     boxCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MBoxCB> derivedMBoxList() {
        return xcreateQDRFunctionMBoxList();
    }
    protected HpQDRFunction<MBoxCB> xcreateQDRFunctionMBoxList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMBoxList(fn, sq, rd, vl, op));
    }
    public void xqderiveMBoxList(String fn, SubQuery<MBoxCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxCB cb = new MBoxCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MBoxList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MBoxListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mBoxList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MBoxList(MBoxCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MBoxListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_box_grp where ...)} <br>
     * m_box_grp by CENTER_ID, named 'MBoxGrpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMBoxGrpList()</span>.<span style="color: #CC4747">max</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     grpCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MBoxGrpCB> derivedMBoxGrpList() {
        return xcreateQDRFunctionMBoxGrpList();
    }
    protected HpQDRFunction<MBoxGrpCB> xcreateQDRFunctionMBoxGrpList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMBoxGrpList(fn, sq, rd, vl, op));
    }
    public void xqderiveMBoxGrpList(String fn, SubQuery<MBoxGrpCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxGrpCB cb = new MBoxGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MBoxGrpList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MBoxGrpListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mBoxGrpList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MBoxGrpList(MBoxGrpCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MBoxGrpListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_carrier where ...)} <br>
     * m_carrier by CENTER_ID, named 'MCarrierAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCarrierList()</span>.<span style="color: #CC4747">max</span>(carrierCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     carrierCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     carrierCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCarrierCB> derivedMCarrierList() {
        return xcreateQDRFunctionMCarrierList();
    }
    protected HpQDRFunction<MCarrierCB> xcreateQDRFunctionMCarrierList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCarrierList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCarrierList(String fn, SubQuery<MCarrierCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCarrierList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCarrierListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCarrierList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCarrierList(MCarrierCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCarrierListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_carrier_slip_sgw where ...)} <br>
     * m_carrier_slip_sgw by CENTER_ID, named 'MCarrierSlipSgwAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCarrierSlipSgwList()</span>.<span style="color: #CC4747">max</span>(sgwCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     sgwCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     sgwCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCarrierSlipSgwCB> derivedMCarrierSlipSgwList() {
        return xcreateQDRFunctionMCarrierSlipSgwList();
    }
    protected HpQDRFunction<MCarrierSlipSgwCB> xcreateQDRFunctionMCarrierSlipSgwList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCarrierSlipSgwList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCarrierSlipSgwList(String fn, SubQuery<MCarrierSlipSgwCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipSgwCB cb = new MCarrierSlipSgwCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCarrierSlipSgwList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCarrierSlipSgwListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCarrierSlipSgwList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCarrierSlipSgwListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_carrier_slip_ymt where ...)} <br>
     * m_carrier_slip_ymt by CENTER_ID, named 'MCarrierSlipYmtAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCarrierSlipYmtList()</span>.<span style="color: #CC4747">max</span>(ymtCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ymtCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     ymtCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCarrierSlipYmtCB> derivedMCarrierSlipYmtList() {
        return xcreateQDRFunctionMCarrierSlipYmtList();
    }
    protected HpQDRFunction<MCarrierSlipYmtCB> xcreateQDRFunctionMCarrierSlipYmtList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCarrierSlipYmtList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCarrierSlipYmtList(String fn, SubQuery<MCarrierSlipYmtCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipYmtCB cb = new MCarrierSlipYmtCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCarrierSlipYmtList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCarrierSlipYmtListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCarrierSlipYmtList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCarrierSlipYmtListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_carrier_slip_yupk where ...)} <br>
     * m_carrier_slip_yupk by CENTER_ID, named 'MCarrierSlipYupkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCarrierSlipYupkList()</span>.<span style="color: #CC4747">max</span>(yupkCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     yupkCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     yupkCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCarrierSlipYupkCB> derivedMCarrierSlipYupkList() {
        return xcreateQDRFunctionMCarrierSlipYupkList();
    }
    protected HpQDRFunction<MCarrierSlipYupkCB> xcreateQDRFunctionMCarrierSlipYupkList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCarrierSlipYupkList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCarrierSlipYupkList(String fn, SubQuery<MCarrierSlipYupkCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipYupkCB cb = new MCarrierSlipYupkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCarrierSlipYupkList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCarrierSlipYupkListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCarrierSlipYupkList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCarrierSlipYupkListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_center_class where ...)} <br>
     * m_center_class by CENTER_ID, named 'MCenterClassAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterClassList()</span>.<span style="color: #CC4747">max</span>(classCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     classCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     classCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterClassCB> derivedMCenterClassList() {
        return xcreateQDRFunctionMCenterClassList();
    }
    protected HpQDRFunction<MCenterClassCB> xcreateQDRFunctionMCenterClassList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterClassList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterClassList(String fn, SubQuery<MCenterClassCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterClassCB cb = new MCenterClassCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCenterClassList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCenterClassListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCenterClassList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterClassList(MCenterClassCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterClassListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_center_col where ...)} <br>
     * m_center_col by CENTER_ID, named 'MCenterColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterColList()</span>.<span style="color: #CC4747">max</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     colCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterColCB> derivedMCenterColList() {
        return xcreateQDRFunctionMCenterColList();
    }
    protected HpQDRFunction<MCenterColCB> xcreateQDRFunctionMCenterColList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterColList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterColList(String fn, SubQuery<MCenterColCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterColCB cb = new MCenterColCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCenterColList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCenterColListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCenterColList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterColList(MCenterColCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterColListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_center_customer where ...)} <br>
     * m_center_customer by CENTER_ID, named 'MCenterCustomerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterCustomerList()</span>.<span style="color: #CC4747">max</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     customerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterCustomerCB> derivedMCenterCustomerList() {
        return xcreateQDRFunctionMCenterCustomerList();
    }
    protected HpQDRFunction<MCenterCustomerCB> xcreateQDRFunctionMCenterCustomerList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterCustomerList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterCustomerList(String fn, SubQuery<MCenterCustomerCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCenterCustomerList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCenterCustomerListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCenterCustomerList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterCustomerListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_center_item where ...)} <br>
     * m_center_item by CENTER_ID, named 'MCenterItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterItemList()</span>.<span style="color: #CC4747">max</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     itemCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterItemCB> derivedMCenterItemList() {
        return xcreateQDRFunctionMCenterItemList();
    }
    protected HpQDRFunction<MCenterItemCB> xcreateQDRFunctionMCenterItemList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterItemList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterItemList(String fn, SubQuery<MCenterItemCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterItemCB cb = new MCenterItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCenterItemList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCenterItemListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCenterItemList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterItemList(MCenterItemCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterItemListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_center_screen where ...)} <br>
     * m_center_screen by CENTER_ID, named 'MCenterScreenAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterScreenList()</span>.<span style="color: #CC4747">max</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     screenCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     screenCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterScreenCB> derivedMCenterScreenList() {
        return xcreateQDRFunctionMCenterScreenList();
    }
    protected HpQDRFunction<MCenterScreenCB> xcreateQDRFunctionMCenterScreenList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterScreenList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterScreenList(String fn, SubQuery<MCenterScreenCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterScreenCB cb = new MCenterScreenCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCenterScreenList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCenterScreenListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCenterScreenList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterScreenList(MCenterScreenCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterScreenListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_client_center where ...)} <br>
     * m_client_center by CENTER_ID, named 'MClientCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMClientCenterList()</span>.<span style="color: #CC4747">max</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     centerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MClientCenterCB> derivedMClientCenterList() {
        return xcreateQDRFunctionMClientCenterList();
    }
    protected HpQDRFunction<MClientCenterCB> xcreateQDRFunctionMClientCenterList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMClientCenterList(fn, sq, rd, vl, op));
    }
    public void xqderiveMClientCenterList(String fn, SubQuery<MClientCenterCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MClientCenterList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MClientCenterListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mClientCenterList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MClientCenterList(MClientCenterCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MClientCenterListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_customer_picking where ...)} <br>
     * m_customer_picking by CENTER_ID, named 'MCustomerPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCustomerPickingList()</span>.<span style="color: #CC4747">max</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     pickingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCustomerPickingCB> derivedMCustomerPickingList() {
        return xcreateQDRFunctionMCustomerPickingList();
    }
    protected HpQDRFunction<MCustomerPickingCB> xcreateQDRFunctionMCustomerPickingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCustomerPickingList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCustomerPickingList(String fn, SubQuery<MCustomerPickingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCustomerPickingCB cb = new MCustomerPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCustomerPickingList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCustomerPickingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCustomerPickingList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCustomerPickingList(MCustomerPickingCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCustomerPickingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_delivery_course where ...)} <br>
     * m_delivery_course by CENTER_ID, named 'MDeliveryCourseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMDeliveryCourseList()</span>.<span style="color: #CC4747">max</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     courseCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     courseCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MDeliveryCourseCB> derivedMDeliveryCourseList() {
        return xcreateQDRFunctionMDeliveryCourseList();
    }
    protected HpQDRFunction<MDeliveryCourseCB> xcreateQDRFunctionMDeliveryCourseList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMDeliveryCourseList(fn, sq, rd, vl, op));
    }
    public void xqderiveMDeliveryCourseList(String fn, SubQuery<MDeliveryCourseCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MDeliveryCourseList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MDeliveryCourseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mDeliveryCourseList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MDeliveryCourseListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_general where ...)} <br>
     * m_general by CENTER_ID, named 'MGeneralAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMGeneralList()</span>.<span style="color: #CC4747">max</span>(generalCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     generalCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     generalCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MGeneralCB> derivedMGeneralList() {
        return xcreateQDRFunctionMGeneralList();
    }
    protected HpQDRFunction<MGeneralCB> xcreateQDRFunctionMGeneralList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMGeneralList(fn, sq, rd, vl, op));
    }
    public void xqderiveMGeneralList(String fn, SubQuery<MGeneralCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MGeneralCB cb = new MGeneralCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MGeneralList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MGeneralListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mGeneralList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MGeneralList(MGeneralCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MGeneralListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_location where ...)} <br>
     * m_location by CENTER_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMLocationList()</span>.<span style="color: #CC4747">max</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     locationCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MLocationCB> derivedMLocationList() {
        return xcreateQDRFunctionMLocationList();
    }
    protected HpQDRFunction<MLocationCB> xcreateQDRFunctionMLocationList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMLocationList(fn, sq, rd, vl, op));
    }
    public void xqderiveMLocationList(String fn, SubQuery<MLocationCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MLocationList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MLocationListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mLocationList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MLocationList(MLocationCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MLocationListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_nizoroe where ...)} <br>
     * m_nizoroe by CENTER_ID, named 'MNizoroeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMNizoroeList()</span>.<span style="color: #CC4747">max</span>(nizoroeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     nizoroeCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     nizoroeCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MNizoroeCB> derivedMNizoroeList() {
        return xcreateQDRFunctionMNizoroeList();
    }
    protected HpQDRFunction<MNizoroeCB> xcreateQDRFunctionMNizoroeList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMNizoroeList(fn, sq, rd, vl, op));
    }
    public void xqderiveMNizoroeList(String fn, SubQuery<MNizoroeCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MNizoroeCB cb = new MNizoroeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MNizoroeList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MNizoroeListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mNizoroeList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MNizoroeList(MNizoroeCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MNizoroeListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_numbering_center where ...)} <br>
     * m_numbering_center by CENTER_ID, named 'MNumberingCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMNumberingCenterList()</span>.<span style="color: #CC4747">max</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     centerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MNumberingCenterCB> derivedMNumberingCenterList() {
        return xcreateQDRFunctionMNumberingCenterList();
    }
    protected HpQDRFunction<MNumberingCenterCB> xcreateQDRFunctionMNumberingCenterList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMNumberingCenterList(fn, sq, rd, vl, op));
    }
    public void xqderiveMNumberingCenterList(String fn, SubQuery<MNumberingCenterCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MNumberingCenterCB cb = new MNumberingCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MNumberingCenterList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MNumberingCenterListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mNumberingCenterList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MNumberingCenterList(MNumberingCenterCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MNumberingCenterListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_user_center where ...)} <br>
     * m_user_center by CENTER_ID, named 'MUserCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMUserCenterList()</span>.<span style="color: #CC4747">max</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     centerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MUserCenterCB> derivedMUserCenterList() {
        return xcreateQDRFunctionMUserCenterList();
    }
    protected HpQDRFunction<MUserCenterCB> xcreateQDRFunctionMUserCenterList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMUserCenterList(fn, sq, rd, vl, op));
    }
    public void xqderiveMUserCenterList(String fn, SubQuery<MUserCenterCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserCenterCB cb = new MUserCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MUserCenterList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MUserCenterListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mUserCenterList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MUserCenterList(MUserCenterCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MUserCenterListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_user_login where ...)} <br>
     * m_user_login by CENTER_ID, named 'MUserLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMUserLoginList()</span>.<span style="color: #CC4747">max</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     loginCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MUserLoginCB> derivedMUserLoginList() {
        return xcreateQDRFunctionMUserLoginList();
    }
    protected HpQDRFunction<MUserLoginCB> xcreateQDRFunctionMUserLoginList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMUserLoginList(fn, sq, rd, vl, op));
    }
    public void xqderiveMUserLoginList(String fn, SubQuery<MUserLoginCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserLoginCB cb = new MUserLoginCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MUserLoginList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MUserLoginListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mUserLoginList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MUserLoginList(MUserLoginCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MUserLoginListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_warehouse where ...)} <br>
     * m_warehouse by CENTER_ID, named 'MWarehouseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMWarehouseList()</span>.<span style="color: #CC4747">max</span>(warehouseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     warehouseCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     warehouseCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MWarehouseCB> derivedMWarehouseList() {
        return xcreateQDRFunctionMWarehouseList();
    }
    protected HpQDRFunction<MWarehouseCB> xcreateQDRFunctionMWarehouseList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMWarehouseList(fn, sq, rd, vl, op));
    }
    public void xqderiveMWarehouseList(String fn, SubQuery<MWarehouseCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWarehouseCB cb = new MWarehouseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MWarehouseList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MWarehouseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mWarehouseList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MWarehouseList(MWarehouseCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MWarehouseListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_web_ht_info where ...)} <br>
     * m_web_ht_info by CENTER_ID, named 'MWebHtInfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMWebHtInfoList()</span>.<span style="color: #CC4747">max</span>(infoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     infoCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     infoCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MWebHtInfoCB> derivedMWebHtInfoList() {
        return xcreateQDRFunctionMWebHtInfoList();
    }
    protected HpQDRFunction<MWebHtInfoCB> xcreateQDRFunctionMWebHtInfoList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMWebHtInfoList(fn, sq, rd, vl, op));
    }
    public void xqderiveMWebHtInfoList(String fn, SubQuery<MWebHtInfoCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWebHtInfoCB cb = new MWebHtInfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MWebHtInfoList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MWebHtInfoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mWebHtInfoList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MWebHtInfoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_alloc_inst_h where ...)} <br>
     * t_alloc_inst_h by CENTER_ID, named 'TAllocInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocInstHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocInstHCB> derivedTAllocInstHList() {
        return xcreateQDRFunctionTAllocInstHList();
    }
    protected HpQDRFunction<TAllocInstHCB> xcreateQDRFunctionTAllocInstHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTAllocInstHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTAllocInstHList(String fn, SubQuery<TAllocInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TAllocInstHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TAllocInstHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tAllocInstHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TAllocInstHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_ec_order_h where ...)} <br>
     * t_ec_order_h by CENTER_ID, named 'TEcOrderHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTEcOrderHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TEcOrderHCB> derivedTEcOrderHList() {
        return xcreateQDRFunctionTEcOrderHList();
    }
    protected HpQDRFunction<TEcOrderHCB> xcreateQDRFunctionTEcOrderHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTEcOrderHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTEcOrderHList(String fn, SubQuery<TEcOrderHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TEcOrderHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TEcOrderHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tEcOrderHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TEcOrderHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_inventory_h where ...)} <br>
     * t_inventory_h by CENTER_ID, named 'TInventoryHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryHCB> derivedTInventoryHList() {
        return xcreateQDRFunctionTInventoryHList();
    }
    protected HpQDRFunction<TInventoryHCB> xcreateQDRFunctionTInventoryHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryHList(String fn, SubQuery<TInventoryHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryHCB cb = new TInventoryHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TInventoryHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TInventoryHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tInventoryHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TInventoryHList(TInventoryHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TInventoryHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_move_inst_h where ...)} <br>
     * t_move_inst_h by CENTER_ID, named 'TMoveInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTMoveInstHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TMoveInstHCB> derivedTMoveInstHList() {
        return xcreateQDRFunctionTMoveInstHList();
    }
    protected HpQDRFunction<TMoveInstHCB> xcreateQDRFunctionTMoveInstHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTMoveInstHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTMoveInstHList(String fn, SubQuery<TMoveInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstHCB cb = new TMoveInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TMoveInstHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TMoveInstHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tMoveInstHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TMoveInstHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_packing_h where ...)} <br>
     * t_packing_h by CENTER_ID, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPackingHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPackingHCB> derivedTPackingHList() {
        return xcreateQDRFunctionTPackingHList();
    }
    protected HpQDRFunction<TPackingHCB> xcreateQDRFunctionTPackingHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPackingHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPackingHList(String fn, SubQuery<TPackingHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TPackingHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TPackingHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tPackingHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TPackingHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_pic_mthd_rcmd where ...)} <br>
     * t_pic_mthd_rcmd by CENTER_ID, named 'TPicMthdRcmdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPicMthdRcmdList()</span>.<span style="color: #CC4747">max</span>(rcmdCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rcmdCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rcmdCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPicMthdRcmdCB> derivedTPicMthdRcmdList() {
        return xcreateQDRFunctionTPicMthdRcmdList();
    }
    protected HpQDRFunction<TPicMthdRcmdCB> xcreateQDRFunctionTPicMthdRcmdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPicMthdRcmdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPicMthdRcmdList(String fn, SubQuery<TPicMthdRcmdCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdCB cb = new TPicMthdRcmdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TPicMthdRcmdList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TPicMthdRcmdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tPicMthdRcmdList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TPicMthdRcmdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_h where ...)} <br>
     * t_picking_h by CENTER_ID, named 'TPickingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingHCB> derivedTPickingHList() {
        return xcreateQDRFunctionTPickingHList();
    }
    protected HpQDRFunction<TPickingHCB> xcreateQDRFunctionTPickingHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingHList(String fn, SubQuery<TPickingHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TPickingHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TPickingHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tPickingHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TPickingHList(TPickingHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TPickingHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_receive_plan_h where ...)} <br>
     * t_receive_plan_h by CENTER_ID, named 'TReceivePlanHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTReceivePlanHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TReceivePlanHCB> derivedTReceivePlanHList() {
        return xcreateQDRFunctionTReceivePlanHList();
    }
    protected HpQDRFunction<TReceivePlanHCB> xcreateQDRFunctionTReceivePlanHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTReceivePlanHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTReceivePlanHList(String fn, SubQuery<TReceivePlanHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TReceivePlanHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TReceivePlanHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tReceivePlanHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TReceivePlanHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_serial_no where ...)} <br>
     * t_serial_no by CENTER_ID, named 'TSerialNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTSerialNoList()</span>.<span style="color: #CC4747">max</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     noCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TSerialNoCB> derivedTSerialNoList() {
        return xcreateQDRFunctionTSerialNoList();
    }
    protected HpQDRFunction<TSerialNoCB> xcreateQDRFunctionTSerialNoList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTSerialNoList(fn, sq, rd, vl, op));
    }
    public void xqderiveTSerialNoList(String fn, SubQuery<TSerialNoCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TSerialNoCB cb = new TSerialNoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TSerialNoList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TSerialNoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tSerialNoList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TSerialNoList(TSerialNoCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TSerialNoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_shipping_inst_h where ...)} <br>
     * t_shipping_inst_h by CENTER_ID, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingInstHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingInstHCB> derivedTShippingInstHList() {
        return xcreateQDRFunctionTShippingInstHList();
    }
    protected HpQDRFunction<TShippingInstHCB> xcreateQDRFunctionTShippingInstHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingInstHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingInstHList(String fn, SubQuery<TShippingInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TShippingInstHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TShippingInstHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tShippingInstHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TShippingInstHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_store_record_h where ...)} <br>
     * t_store_record_h by CENTER_ID, named 'TStoreRecordHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStoreRecordHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStoreRecordHCB> derivedTStoreRecordHList() {
        return xcreateQDRFunctionTStoreRecordHList();
    }
    protected HpQDRFunction<TStoreRecordHCB> xcreateQDRFunctionTStoreRecordHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStoreRecordHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStoreRecordHList(String fn, SubQuery<TStoreRecordHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TStoreRecordHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TStoreRecordHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tStoreRecordHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TStoreRecordHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_inventory_input_prod where ...)} <br>
     * w_ht_inventory_input_prod by CENTER_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtInventoryInputProdList()</span>.<span style="color: #CC4747">max</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     prodCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtInventoryInputProdCB> derivedWHtInventoryInputProdList() {
        return xcreateQDRFunctionWHtInventoryInputProdList();
    }
    protected HpQDRFunction<WHtInventoryInputProdCB> xcreateQDRFunctionWHtInventoryInputProdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtInventoryInputProdList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtInventoryInputProdList(String fn, SubQuery<WHtInventoryInputProdCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtInventoryInputProdList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtInventoryInputProdList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_loading where ...)} <br>
     * w_ht_loading by CENTER_ID, named 'WHtLoadingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtLoadingList()</span>.<span style="color: #CC4747">max</span>(loadingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loadingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     loadingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtLoadingCB> derivedWHtLoadingList() {
        return xcreateQDRFunctionWHtLoadingList();
    }
    protected HpQDRFunction<WHtLoadingCB> xcreateQDRFunctionWHtLoadingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtLoadingList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtLoadingList(String fn, SubQuery<WHtLoadingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtLoadingCB cb = new WHtLoadingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtLoadingList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtLoadingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtLoadingList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtLoadingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_picking where ...)} <br>
     * w_ht_picking by CENTER_ID, named 'WHtPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtPickingList()</span>.<span style="color: #CC4747">max</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     pickingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtPickingCB> derivedWHtPickingList() {
        return xcreateQDRFunctionWHtPickingList();
    }
    protected HpQDRFunction<WHtPickingCB> xcreateQDRFunctionWHtPickingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtPickingList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtPickingList(String fn, SubQuery<WHtPickingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtPickingCB cb = new WHtPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtPickingList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtPickingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtPickingList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtPickingList(WHtPickingCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtPickingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_receive_inspection where ...)} <br>
     * w_ht_receive_inspection by CENTER_ID, named 'WHtReceiveInspectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtReceiveInspectionList()</span>.<span style="color: #CC4747">max</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspectionCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspectionCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtReceiveInspectionCB> derivedWHtReceiveInspectionList() {
        return xcreateQDRFunctionWHtReceiveInspectionList();
    }
    protected HpQDRFunction<WHtReceiveInspectionCB> xcreateQDRFunctionWHtReceiveInspectionList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtReceiveInspectionList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtReceiveInspectionList(String fn, SubQuery<WHtReceiveInspectionCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtReceiveInspectionList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtReceiveInspectionList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_receive_no_plan_insp where ...)} <br>
     * w_ht_receive_no_plan_insp by CENTER_ID, named 'WHtReceiveNoPlanInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtReceiveNoPlanInspList()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtReceiveNoPlanInspCB> derivedWHtReceiveNoPlanInspList() {
        return xcreateQDRFunctionWHtReceiveNoPlanInspList();
    }
    protected HpQDRFunction<WHtReceiveNoPlanInspCB> xcreateQDRFunctionWHtReceiveNoPlanInspList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtReceiveNoPlanInspList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtReceiveNoPlanInspList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtReceiveNoPlanInspList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_receive_store where ...)} <br>
     * w_ht_receive_store by CENTER_ID, named 'WHtReceiveStoreAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtReceiveStoreList()</span>.<span style="color: #CC4747">max</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     storeCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     storeCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtReceiveStoreCB> derivedWHtReceiveStoreList() {
        return xcreateQDRFunctionWHtReceiveStoreList();
    }
    protected HpQDRFunction<WHtReceiveStoreCB> xcreateQDRFunctionWHtReceiveStoreList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtReceiveStoreList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtReceiveStoreList(String fn, SubQuery<WHtReceiveStoreCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtReceiveStoreList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtReceiveStoreListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtReceiveStoreList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_serial_receive_insp where ...)} <br>
     * w_ht_serial_receive_insp by CENTER_ID, named 'WHtSerialReceiveInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtSerialReceiveInspList()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtSerialReceiveInspCB> derivedWHtSerialReceiveInspList() {
        return xcreateQDRFunctionWHtSerialReceiveInspList();
    }
    protected HpQDRFunction<WHtSerialReceiveInspCB> xcreateQDRFunctionWHtSerialReceiveInspList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtSerialReceiveInspList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtSerialReceiveInspList(String fn, SubQuery<WHtSerialReceiveInspCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtSerialReceiveInspCB cb = new WHtSerialReceiveInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtSerialReceiveInspList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtSerialReceiveInspList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_serial_shipping_insp where ...)} <br>
     * w_ht_serial_shipping_insp by CENTER_ID, named 'WHtSerialShippingInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtSerialShippingInspList()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtSerialShippingInspCB> derivedWHtSerialShippingInspList() {
        return xcreateQDRFunctionWHtSerialShippingInspList();
    }
    protected HpQDRFunction<WHtSerialShippingInspCB> xcreateQDRFunctionWHtSerialShippingInspList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtSerialShippingInspList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtSerialShippingInspList(String fn, SubQuery<WHtSerialShippingInspCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtSerialShippingInspCB cb = new WHtSerialShippingInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtSerialShippingInspList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtSerialShippingInspList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_shipping where ...)} <br>
     * w_ht_shipping by CENTER_ID, named 'WHtShippingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtShippingList()</span>.<span style="color: #CC4747">max</span>(shippingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shippingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     shippingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtShippingCB> derivedWHtShippingList() {
        return xcreateQDRFunctionWHtShippingList();
    }
    protected HpQDRFunction<WHtShippingCB> xcreateQDRFunctionWHtShippingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtShippingList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtShippingList(String fn, SubQuery<WHtShippingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtShippingList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtShippingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtShippingList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtShippingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_shipping_picking where ...)} <br>
     * w_ht_shipping_picking by CENTER_ID, named 'WHtShippingPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtShippingPickingList()</span>.<span style="color: #CC4747">max</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     pickingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtShippingPickingCB> derivedWHtShippingPickingList() {
        return xcreateQDRFunctionWHtShippingPickingList();
    }
    protected HpQDRFunction<WHtShippingPickingCB> xcreateQDRFunctionWHtShippingPickingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtShippingPickingList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtShippingPickingList(String fn, SubQuery<WHtShippingPickingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtShippingPickingList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtShippingPickingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtShippingPickingList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_total_picking where ...)} <br>
     * w_ht_total_picking by CENTER_ID, named 'WHtTotalPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtTotalPickingList()</span>.<span style="color: #CC4747">max</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     pickingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtTotalPickingCB> derivedWHtTotalPickingList() {
        return xcreateQDRFunctionWHtTotalPickingList();
    }
    protected HpQDRFunction<WHtTotalPickingCB> xcreateQDRFunctionWHtTotalPickingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtTotalPickingList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtTotalPickingList(String fn, SubQuery<WHtTotalPickingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtTotalPickingCB cb = new WHtTotalPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtTotalPickingList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtTotalPickingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtTotalPickingList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtTotalPickingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_sgl_row_ship_insp_h where ...)} <br>
     * w_sgl_row_ship_insp_h by CENTER_ID, named 'WSglRowShipInspHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWSglRowShipInspHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WSglRowShipInspHCB> derivedWSglRowShipInspHList() {
        return xcreateQDRFunctionWSglRowShipInspHList();
    }
    protected HpQDRFunction<WSglRowShipInspHCB> xcreateQDRFunctionWSglRowShipInspHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWSglRowShipInspHList(fn, sq, rd, vl, op));
    }
    public void xqderiveWSglRowShipInspHList(String fn, SubQuery<WSglRowShipInspHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WSglRowShipInspHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WSglRowShipInspHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wSglRowShipInspHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_shipping_interrupt where ...)} <br>
     * w_shipping_interrupt by CENTER_ID, named 'WShippingInterruptAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWShippingInterruptList()</span>.<span style="color: #CC4747">max</span>(interruptCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     interruptCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     interruptCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WShippingInterruptCB> derivedWShippingInterruptList() {
        return xcreateQDRFunctionWShippingInterruptList();
    }
    protected HpQDRFunction<WShippingInterruptCB> xcreateQDRFunctionWShippingInterruptList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWShippingInterruptList(fn, sq, rd, vl, op));
    }
    public void xqderiveWShippingInterruptList(String fn, SubQuery<WShippingInterruptCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WShippingInterruptList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WShippingInterruptListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wShippingInterruptList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WShippingInterruptListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setCenterId_IsNull() { regCenterId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setCenterId_IsNotNull() { regCenterId(CK_ISNN, DOBJ); }

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param centerCd The value of centerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_Equal(String centerCd) {
        doSetCenterCd_Equal(fRES(centerCd));
    }

    protected void doSetCenterCd_Equal(String centerCd) {
        regCenterCd(CK_EQ, centerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param centerCd The value of centerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_NotEqual(String centerCd) {
        doSetCenterCd_NotEqual(fRES(centerCd));
    }

    protected void doSetCenterCd_NotEqual(String centerCd) {
        regCenterCd(CK_NES, centerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param centerCd The value of centerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterThan(String centerCd) {
        regCenterCd(CK_GT, fRES(centerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param centerCd The value of centerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessThan(String centerCd) {
        regCenterCd(CK_LT, fRES(centerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param centerCd The value of centerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterEqual(String centerCd) {
        regCenterCd(CK_GE, fRES(centerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param centerCd The value of centerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessEqual(String centerCd) {
        regCenterCd(CK_LE, fRES(centerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param centerCdList The collection of centerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_InScope(Collection<String> centerCdList) {
        doSetCenterCd_InScope(centerCdList);
    }

    protected void doSetCenterCd_InScope(Collection<String> centerCdList) {
        regINS(CK_INS, cTL(centerCdList), xgetCValueCenterCd(), "CENTER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param centerCdList The collection of centerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_NotInScope(Collection<String> centerCdList) {
        doSetCenterCd_NotInScope(centerCdList);
    }

    protected void doSetCenterCd_NotInScope(Collection<String> centerCdList) {
        regINS(CK_NINS, cTL(centerCdList), xgetCValueCenterCd(), "CENTER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setCenterCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param centerCd The value of centerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCenterCd_LikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param centerCd The value of centerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterCd_NotLikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param centerCd The value of centerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_PrefixSearch(String centerCd) {
        setCenterCd_LikeSearch(centerCd, xcLSOPPre());
    }

    protected void regCenterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterCd(), "CENTER_CD"); }
    protected abstract ConditionValue xgetCValueCenterCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {NotNull, VARCHAR(60)}
     * @param centerNm The value of centerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_Equal(String centerNm) {
        doSetCenterNm_Equal(fRES(centerNm));
    }

    protected void doSetCenterNm_Equal(String centerNm) {
        regCenterNm(CK_EQ, centerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {NotNull, VARCHAR(60)}
     * @param centerNm The value of centerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_NotEqual(String centerNm) {
        doSetCenterNm_NotEqual(fRES(centerNm));
    }

    protected void doSetCenterNm_NotEqual(String centerNm) {
        regCenterNm(CK_NES, centerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {NotNull, VARCHAR(60)}
     * @param centerNm The value of centerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_GreaterThan(String centerNm) {
        regCenterNm(CK_GT, fRES(centerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {NotNull, VARCHAR(60)}
     * @param centerNm The value of centerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_LessThan(String centerNm) {
        regCenterNm(CK_LT, fRES(centerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {NotNull, VARCHAR(60)}
     * @param centerNm The value of centerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_GreaterEqual(String centerNm) {
        regCenterNm(CK_GE, fRES(centerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {NotNull, VARCHAR(60)}
     * @param centerNm The value of centerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_LessEqual(String centerNm) {
        regCenterNm(CK_LE, fRES(centerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_NM: {NotNull, VARCHAR(60)}
     * @param centerNmList The collection of centerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_InScope(Collection<String> centerNmList) {
        doSetCenterNm_InScope(centerNmList);
    }

    protected void doSetCenterNm_InScope(Collection<String> centerNmList) {
        regINS(CK_INS, cTL(centerNmList), xgetCValueCenterNm(), "CENTER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_NM: {NotNull, VARCHAR(60)}
     * @param centerNmList The collection of centerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_NotInScope(Collection<String> centerNmList) {
        doSetCenterNm_NotInScope(centerNmList);
    }

    protected void doSetCenterNm_NotInScope(Collection<String> centerNmList) {
        regINS(CK_NINS, cTL(centerNmList), xgetCValueCenterNm(), "CENTER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_NM: {NotNull, VARCHAR(60)} <br>
     * <pre>e.g. setCenterNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param centerNm The value of centerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCenterNm_LikeSearch(String centerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(centerNm), xgetCValueCenterNm(), "CENTER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_NM: {NotNull, VARCHAR(60)}
     * @param centerNm The value of centerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterNm_NotLikeSearch(String centerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerNm), xgetCValueCenterNm(), "CENTER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_NM: {NotNull, VARCHAR(60)}
     * @param centerNm The value of centerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_PrefixSearch(String centerNm) {
        setCenterNm_LikeSearch(centerNm, xcLSOPPre());
    }

    protected void regCenterNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterNm(), "CENTER_NM"); }
    protected abstract ConditionValue xgetCValueCenterNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_ABBR: {VARCHAR(60)}
     * @param centerAbbr The value of centerAbbr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterAbbr_Equal(String centerAbbr) {
        doSetCenterAbbr_Equal(fRES(centerAbbr));
    }

    protected void doSetCenterAbbr_Equal(String centerAbbr) {
        regCenterAbbr(CK_EQ, centerAbbr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_ABBR: {VARCHAR(60)}
     * @param centerAbbr The value of centerAbbr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterAbbr_NotEqual(String centerAbbr) {
        doSetCenterAbbr_NotEqual(fRES(centerAbbr));
    }

    protected void doSetCenterAbbr_NotEqual(String centerAbbr) {
        regCenterAbbr(CK_NES, centerAbbr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_ABBR: {VARCHAR(60)}
     * @param centerAbbr The value of centerAbbr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterAbbr_GreaterThan(String centerAbbr) {
        regCenterAbbr(CK_GT, fRES(centerAbbr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_ABBR: {VARCHAR(60)}
     * @param centerAbbr The value of centerAbbr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterAbbr_LessThan(String centerAbbr) {
        regCenterAbbr(CK_LT, fRES(centerAbbr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_ABBR: {VARCHAR(60)}
     * @param centerAbbr The value of centerAbbr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterAbbr_GreaterEqual(String centerAbbr) {
        regCenterAbbr(CK_GE, fRES(centerAbbr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_ABBR: {VARCHAR(60)}
     * @param centerAbbr The value of centerAbbr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterAbbr_LessEqual(String centerAbbr) {
        regCenterAbbr(CK_LE, fRES(centerAbbr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_ABBR: {VARCHAR(60)}
     * @param centerAbbrList The collection of centerAbbr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterAbbr_InScope(Collection<String> centerAbbrList) {
        doSetCenterAbbr_InScope(centerAbbrList);
    }

    protected void doSetCenterAbbr_InScope(Collection<String> centerAbbrList) {
        regINS(CK_INS, cTL(centerAbbrList), xgetCValueCenterAbbr(), "CENTER_ABBR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_ABBR: {VARCHAR(60)}
     * @param centerAbbrList The collection of centerAbbr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterAbbr_NotInScope(Collection<String> centerAbbrList) {
        doSetCenterAbbr_NotInScope(centerAbbrList);
    }

    protected void doSetCenterAbbr_NotInScope(Collection<String> centerAbbrList) {
        regINS(CK_NINS, cTL(centerAbbrList), xgetCValueCenterAbbr(), "CENTER_ABBR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_ABBR: {VARCHAR(60)} <br>
     * <pre>e.g. setCenterAbbr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param centerAbbr The value of centerAbbr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCenterAbbr_LikeSearch(String centerAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(centerAbbr), xgetCValueCenterAbbr(), "CENTER_ABBR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_ABBR: {VARCHAR(60)}
     * @param centerAbbr The value of centerAbbr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterAbbr_NotLikeSearch(String centerAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerAbbr), xgetCValueCenterAbbr(), "CENTER_ABBR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_ABBR: {VARCHAR(60)}
     * @param centerAbbr The value of centerAbbr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterAbbr_PrefixSearch(String centerAbbr) {
        setCenterAbbr_LikeSearch(centerAbbr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_ABBR: {VARCHAR(60)}
     */
    public void setCenterAbbr_IsNull() { regCenterAbbr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CENTER_ABBR: {VARCHAR(60)}
     */
    public void setCenterAbbr_IsNullOrEmpty() { regCenterAbbr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_ABBR: {VARCHAR(60)}
     */
    public void setCenterAbbr_IsNotNull() { regCenterAbbr(CK_ISNN, DOBJ); }

    protected void regCenterAbbr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterAbbr(), "CENTER_ABBR"); }
    protected abstract ConditionValue xgetCValueCenterAbbr();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, BIGINT(19), FK to b_culture}
     * @param cultureId The value of cultureId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_Equal(Long cultureId) {
        doSetCultureId_Equal(cultureId);
    }

    protected void doSetCultureId_Equal(Long cultureId) {
        regCultureId(CK_EQ, cultureId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, BIGINT(19), FK to b_culture}
     * @param cultureId The value of cultureId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_NotEqual(Long cultureId) {
        doSetCultureId_NotEqual(cultureId);
    }

    protected void doSetCultureId_NotEqual(Long cultureId) {
        regCultureId(CK_NES, cultureId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, BIGINT(19), FK to b_culture}
     * @param cultureId The value of cultureId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_GreaterThan(Long cultureId) {
        regCultureId(CK_GT, cultureId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, BIGINT(19), FK to b_culture}
     * @param cultureId The value of cultureId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_LessThan(Long cultureId) {
        regCultureId(CK_LT, cultureId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, BIGINT(19), FK to b_culture}
     * @param cultureId The value of cultureId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_GreaterEqual(Long cultureId) {
        regCultureId(CK_GE, cultureId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, BIGINT(19), FK to b_culture}
     * @param cultureId The value of cultureId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_LessEqual(Long cultureId) {
        regCultureId(CK_LE, cultureId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, BIGINT(19), FK to b_culture}
     * @param minNumber The min number of cultureId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cultureId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCultureId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCultureId(), "CULTURE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CULTURE_ID: {IX, BIGINT(19), FK to b_culture}
     * @param cultureIdList The collection of cultureId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureId_InScope(Collection<Long> cultureIdList) {
        doSetCultureId_InScope(cultureIdList);
    }

    protected void doSetCultureId_InScope(Collection<Long> cultureIdList) {
        regINS(CK_INS, cTL(cultureIdList), xgetCValueCultureId(), "CULTURE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CULTURE_ID: {IX, BIGINT(19), FK to b_culture}
     * @param cultureIdList The collection of cultureId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureId_NotInScope(Collection<Long> cultureIdList) {
        doSetCultureId_NotInScope(cultureIdList);
    }

    protected void doSetCultureId_NotInScope(Collection<Long> cultureIdList) {
        regINS(CK_NINS, cTL(cultureIdList), xgetCValueCultureId(), "CULTURE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CULTURE_ID from b_culture where ...)} <br />
     * b_culture by my CULTURE_ID, named 'BCulture'.
     * @param subCBLambda The callback for sub-query of BCulture for 'in-scope'. (NotNull)
     */
    public void inScopeBCulture(SubQuery<BCultureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BCultureCB cb = new BCultureCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCultureId_InScopeRelation_BCulture(cb.query());
        registerInScopeRelation(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bCulture", false);
    }
    public abstract String keepCultureId_InScopeRelation_BCulture(BCultureCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CULTURE_ID from b_culture where ...)} <br />
     * b_culture by my CULTURE_ID, named 'BCulture'.
     * @param subCBLambda The callback for sub-query of BCulture for 'not in-scope'. (NotNull)
     */
    public void notInScopeBCulture(SubQuery<BCultureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BCultureCB cb = new BCultureCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCultureId_NotInScopeRelation_BCulture(cb.query());
        registerInScopeRelation(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bCulture", true);
    }
    public abstract String keepCultureId_NotInScopeRelation_BCulture(BCultureCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, BIGINT(19), FK to b_culture}
     */
    public void setCultureId_IsNull() { regCultureId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, BIGINT(19), FK to b_culture}
     */
    public void setCultureId_IsNotNull() { regCultureId(CK_ISNN, DOBJ); }

    protected void regCultureId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCultureId(), "CULTURE_ID"); }
    protected abstract ConditionValue xgetCValueCultureId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone}
     * @param timeZoneId The value of timeZoneId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_Equal(Long timeZoneId) {
        doSetTimeZoneId_Equal(timeZoneId);
    }

    protected void doSetTimeZoneId_Equal(Long timeZoneId) {
        regTimeZoneId(CK_EQ, timeZoneId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone}
     * @param timeZoneId The value of timeZoneId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_NotEqual(Long timeZoneId) {
        doSetTimeZoneId_NotEqual(timeZoneId);
    }

    protected void doSetTimeZoneId_NotEqual(Long timeZoneId) {
        regTimeZoneId(CK_NES, timeZoneId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone}
     * @param timeZoneId The value of timeZoneId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_GreaterThan(Long timeZoneId) {
        regTimeZoneId(CK_GT, timeZoneId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone}
     * @param timeZoneId The value of timeZoneId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_LessThan(Long timeZoneId) {
        regTimeZoneId(CK_LT, timeZoneId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone}
     * @param timeZoneId The value of timeZoneId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_GreaterEqual(Long timeZoneId) {
        regTimeZoneId(CK_GE, timeZoneId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone}
     * @param timeZoneId The value of timeZoneId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_LessEqual(Long timeZoneId) {
        regTimeZoneId(CK_LE, timeZoneId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone}
     * @param minNumber The min number of timeZoneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of timeZoneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTimeZoneId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTimeZoneId(), "TIME_ZONE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone}
     * @param timeZoneIdList The collection of timeZoneId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneId_InScope(Collection<Long> timeZoneIdList) {
        doSetTimeZoneId_InScope(timeZoneIdList);
    }

    protected void doSetTimeZoneId_InScope(Collection<Long> timeZoneIdList) {
        regINS(CK_INS, cTL(timeZoneIdList), xgetCValueTimeZoneId(), "TIME_ZONE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone}
     * @param timeZoneIdList The collection of timeZoneId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneId_NotInScope(Collection<Long> timeZoneIdList) {
        doSetTimeZoneId_NotInScope(timeZoneIdList);
    }

    protected void doSetTimeZoneId_NotInScope(Collection<Long> timeZoneIdList) {
        regINS(CK_NINS, cTL(timeZoneIdList), xgetCValueTimeZoneId(), "TIME_ZONE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TIME_ZONE_ID from b_time_zone where ...)} <br />
     * b_time_zone by my TIME_ZONE_ID, named 'BTimeZone'.
     * @param subCBLambda The callback for sub-query of BTimeZone for 'in-scope'. (NotNull)
     */
    public void inScopeBTimeZone(SubQuery<BTimeZoneCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BTimeZoneCB cb = new BTimeZoneCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTimeZoneId_InScopeRelation_BTimeZone(cb.query());
        registerInScopeRelation(cb.query(), "TIME_ZONE_ID", "TIME_ZONE_ID", pp, "bTimeZone", false);
    }
    public abstract String keepTimeZoneId_InScopeRelation_BTimeZone(BTimeZoneCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TIME_ZONE_ID from b_time_zone where ...)} <br />
     * b_time_zone by my TIME_ZONE_ID, named 'BTimeZone'.
     * @param subCBLambda The callback for sub-query of BTimeZone for 'not in-scope'. (NotNull)
     */
    public void notInScopeBTimeZone(SubQuery<BTimeZoneCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BTimeZoneCB cb = new BTimeZoneCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTimeZoneId_NotInScopeRelation_BTimeZone(cb.query());
        registerInScopeRelation(cb.query(), "TIME_ZONE_ID", "TIME_ZONE_ID", pp, "bTimeZone", true);
    }
    public abstract String keepTimeZoneId_NotInScopeRelation_BTimeZone(BTimeZoneCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone}
     */
    public void setTimeZoneId_IsNull() { regTimeZoneId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone}
     */
    public void setTimeZoneId_IsNotNull() { regTimeZoneId(CK_ISNN, DOBJ); }

    protected void regTimeZoneId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTimeZoneId(), "TIME_ZONE_ID"); }
    protected abstract ConditionValue xgetCValueTimeZoneId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS: {VARCHAR(255)}
     * @param address The value of address as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_Equal(String address) {
        doSetAddress_Equal(fRES(address));
    }

    protected void doSetAddress_Equal(String address) {
        regAddress(CK_EQ, address);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS: {VARCHAR(255)}
     * @param address The value of address as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_NotEqual(String address) {
        doSetAddress_NotEqual(fRES(address));
    }

    protected void doSetAddress_NotEqual(String address) {
        regAddress(CK_NES, address);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS: {VARCHAR(255)}
     * @param address The value of address as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_GreaterThan(String address) {
        regAddress(CK_GT, fRES(address));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS: {VARCHAR(255)}
     * @param address The value of address as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_LessThan(String address) {
        regAddress(CK_LT, fRES(address));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS: {VARCHAR(255)}
     * @param address The value of address as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_GreaterEqual(String address) {
        regAddress(CK_GE, fRES(address));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS: {VARCHAR(255)}
     * @param address The value of address as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_LessEqual(String address) {
        regAddress(CK_LE, fRES(address));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS: {VARCHAR(255)}
     * @param addressList The collection of address as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_InScope(Collection<String> addressList) {
        doSetAddress_InScope(addressList);
    }

    protected void doSetAddress_InScope(Collection<String> addressList) {
        regINS(CK_INS, cTL(addressList), xgetCValueAddress(), "ADDRESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS: {VARCHAR(255)}
     * @param addressList The collection of address as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_NotInScope(Collection<String> addressList) {
        doSetAddress_NotInScope(addressList);
    }

    protected void doSetAddress_NotInScope(Collection<String> addressList) {
        regINS(CK_NINS, cTL(addressList), xgetCValueAddress(), "ADDRESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS: {VARCHAR(255)} <br>
     * <pre>e.g. setAddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address The value of address as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress_LikeSearch(String address, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address), xgetCValueAddress(), "ADDRESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS: {VARCHAR(255)}
     * @param address The value of address as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress_NotLikeSearch(String address, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address), xgetCValueAddress(), "ADDRESS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS: {VARCHAR(255)}
     * @param address The value of address as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_PrefixSearch(String address) {
        setAddress_LikeSearch(address, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS: {VARCHAR(255)}
     */
    public void setAddress_IsNull() { regAddress(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS: {VARCHAR(255)}
     */
    public void setAddress_IsNullOrEmpty() { regAddress(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS: {VARCHAR(255)}
     */
    public void setAddress_IsNotNull() { regAddress(CK_ISNN, DOBJ); }

    protected void regAddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress(), "ADDRESS"); }
    protected abstract ConditionValue xgetCValueAddress();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_Equal(String telNo) {
        doSetTelNo_Equal(fRES(telNo));
    }

    protected void doSetTelNo_Equal(String telNo) {
        regTelNo(CK_EQ, telNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_NotEqual(String telNo) {
        doSetTelNo_NotEqual(fRES(telNo));
    }

    protected void doSetTelNo_NotEqual(String telNo) {
        regTelNo(CK_NES, telNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_GreaterThan(String telNo) {
        regTelNo(CK_GT, fRES(telNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_LessThan(String telNo) {
        regTelNo(CK_LT, fRES(telNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_GreaterEqual(String telNo) {
        regTelNo(CK_GE, fRES(telNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_LessEqual(String telNo) {
        regTelNo(CK_LE, fRES(telNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNoList The collection of telNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_InScope(Collection<String> telNoList) {
        doSetTelNo_InScope(telNoList);
    }

    protected void doSetTelNo_InScope(Collection<String> telNoList) {
        regINS(CK_INS, cTL(telNoList), xgetCValueTelNo(), "TEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNoList The collection of telNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_NotInScope(Collection<String> telNoList) {
        doSetTelNo_NotInScope(telNoList);
    }

    protected void doSetTelNo_NotInScope(Collection<String> telNoList) {
        regINS(CK_NINS, cTL(telNoList), xgetCValueTelNo(), "TEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEL_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setTelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param telNo The value of telNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTelNo_LikeSearch(String telNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(telNo), xgetCValueTelNo(), "TEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTelNo_NotLikeSearch(String telNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(telNo), xgetCValueTelNo(), "TEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_PrefixSearch(String telNo) {
        setTelNo_LikeSearch(telNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     */
    public void setTelNo_IsNull() { regTelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     */
    public void setTelNo_IsNullOrEmpty() { regTelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     */
    public void setTelNo_IsNotNull() { regTelNo(CK_ISNN, DOBJ); }

    protected void regTelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTelNo(), "TEL_NO"); }
    protected abstract ConditionValue xgetCValueTelNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @param delFlg The value of delFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(String delFlg) {
        doSetDelFlg_Equal(fRES(delFlg));
    }

    /**
     * Equal(=). As DelFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_Equal_AsDelFlg(CDef.DelFlg cdef) {
        doSetDelFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未削除
     */
    public void setDelFlg_Equal_$0() {
        setDelFlg_Equal_AsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 削除済
     */
    public void setDelFlg_Equal_$1() {
        setDelFlg_Equal_AsDelFlg(CDef.DelFlg.$1);
    }

    protected void doSetDelFlg_Equal(String delFlg) {
        regDelFlg(CK_EQ, delFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @param delFlgList The collection of delFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope(Collection<String> delFlgList) {
        doSetDelFlg_InScope(delFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As DelFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope_AsDelFlg(Collection<CDef.DelFlg> cdefList) {
        doSetDelFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDelFlg_InScope(Collection<String> delFlgList) {
        regINS(CK_INS, cTL(delFlgList), xgetCValueDelFlg(), "DEL_FLG");
    }

    protected void regDelFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelFlg(), "DEL_FLG"); }
    protected abstract ConditionValue xgetCValueDelFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @param controlNo The value of controlNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setControlNo_Equal(Long controlNo) {
        doSetControlNo_Equal(controlNo);
    }

    protected void doSetControlNo_Equal(Long controlNo) {
        regControlNo(CK_EQ, controlNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @param controlNo The value of controlNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setControlNo_NotEqual(Long controlNo) {
        doSetControlNo_NotEqual(controlNo);
    }

    protected void doSetControlNo_NotEqual(Long controlNo) {
        regControlNo(CK_NES, controlNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @param minNumber The min number of controlNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of controlNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setControlNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueControlNo(), "CONTROL_NO", rangeOfOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     */
    public void setControlNo_IsNull() { regControlNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     */
    public void setControlNo_IsNotNull() { regControlNo(CK_ISNN, DOBJ); }

    protected void regControlNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueControlNo(), "CONTROL_NO"); }
    protected abstract ConditionValue xgetCValueControlNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADD_DT: {DATETIME(19)}
     * @param addDt The value of addDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddDt_Equal(java.sql.Timestamp addDt) {
        regAddDt(CK_EQ,  addDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADD_DT: {DATETIME(19)}
     * @param addDt The value of addDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddDt_LessEqual(java.sql.Timestamp addDt) {
        regAddDt(CK_LE, addDt);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_DT: {DATETIME(19)}
     */
    public void setAddDt_IsNull() { regAddDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_DT: {DATETIME(19)}
     */
    public void setAddDt_IsNotNull() { regAddDt(CK_ISNN, DOBJ); }

    protected void regAddDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddDt(), "ADD_DT"); }
    protected abstract ConditionValue xgetCValueAddDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_USER: {VARCHAR(60)}
     * @param addUser The value of addUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddUser_Equal(String addUser) {
        doSetAddUser_Equal(fRES(addUser));
    }

    protected void doSetAddUser_Equal(String addUser) {
        regAddUser(CK_EQ, addUser);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_USER: {VARCHAR(60)}
     */
    public void setAddUser_IsNull() { regAddUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADD_USER: {VARCHAR(60)}
     */
    public void setAddUser_IsNullOrEmpty() { regAddUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_USER: {VARCHAR(60)}
     */
    public void setAddUser_IsNotNull() { regAddUser(CK_ISNN, DOBJ); }

    protected void regAddUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddUser(), "ADD_USER"); }
    protected abstract ConditionValue xgetCValueAddUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @param addProcess The value of addProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddProcess_Equal(String addProcess) {
        doSetAddProcess_Equal(fRES(addProcess));
    }

    protected void doSetAddProcess_Equal(String addProcess) {
        regAddProcess(CK_EQ, addProcess);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     */
    public void setAddProcess_IsNull() { regAddProcess(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     */
    public void setAddProcess_IsNullOrEmpty() { regAddProcess(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     */
    public void setAddProcess_IsNotNull() { regAddProcess(CK_ISNN, DOBJ); }

    protected void regAddProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddProcess(), "ADD_PROCESS"); }
    protected abstract ConditionValue xgetCValueAddProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DT: {DATETIME(19)}
     * @param updDt The value of updDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDt_Equal(java.sql.Timestamp updDt) {
        regUpdDt(CK_EQ,  updDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DT: {DATETIME(19)}
     * @param updDt The value of updDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDt_LessEqual(java.sql.Timestamp updDt) {
        regUpdDt(CK_LE, updDt);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_DT: {DATETIME(19)}
     */
    public void setUpdDt_IsNull() { regUpdDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_DT: {DATETIME(19)}
     */
    public void setUpdDt_IsNotNull() { regUpdDt(CK_ISNN, DOBJ); }

    protected void regUpdDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdDt(), "UPD_DT"); }
    protected abstract ConditionValue xgetCValueUpdDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER: {VARCHAR(60)}
     * @param updUser The value of updUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdUser_Equal(String updUser) {
        doSetUpdUser_Equal(fRES(updUser));
    }

    protected void doSetUpdUser_Equal(String updUser) {
        regUpdUser(CK_EQ, updUser);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_USER: {VARCHAR(60)}
     */
    public void setUpdUser_IsNull() { regUpdUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPD_USER: {VARCHAR(60)}
     */
    public void setUpdUser_IsNullOrEmpty() { regUpdUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_USER: {VARCHAR(60)}
     */
    public void setUpdUser_IsNotNull() { regUpdUser(CK_ISNN, DOBJ); }

    protected void regUpdUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdUser(), "UPD_USER"); }
    protected abstract ConditionValue xgetCValueUpdUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @param updProcess The value of updProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdProcess_Equal(String updProcess) {
        doSetUpdProcess_Equal(fRES(updProcess));
    }

    protected void doSetUpdProcess_Equal(String updProcess) {
        regUpdProcess(CK_EQ, updProcess);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     */
    public void setUpdProcess_IsNull() { regUpdProcess(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     */
    public void setUpdProcess_IsNullOrEmpty() { regUpdProcess(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     */
    public void setUpdProcess_IsNotNull() { regUpdProcess(CK_ISNN, DOBJ); }

    protected void regUpdProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdProcess(), "UPD_PROCESS"); }
    protected abstract ConditionValue xgetCValueUpdProcess();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCenterCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCenterCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCenterCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCenterCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCenterCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCenterCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCenterCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCenterCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCenterCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCenterCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCenterCB&gt;() {
     *     public void query(MCenterCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCenterCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCenterCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCenterCQ sq);

    protected MCenterCB xcreateScalarConditionCB() {
        MCenterCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCenterCB xcreateScalarConditionPartitionByCB() {
        MCenterCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCenterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCB cb = new MCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CENTER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCenterCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCenterCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCenterCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCB cb = new MCenterCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CENTER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCenterCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCenterCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param option The option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOption option) { // is user public!
        xdoWithManualOrder(option);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    /**
     * Order along the list of manual values. #beforejava8 <br>
     * This function with Union is unsupported! <br>
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderOption option = new ManualOrderOption();
        option.acceptOrderValueList(orderValueList);
        withManualOrder(option);
    }

    @Override
    protected void filterFromToOption(String columnDbName, FromToOption option) {
        option.allowOneSide();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected MCenterCB newMyCB() {
        return new MCenterCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCenterCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
