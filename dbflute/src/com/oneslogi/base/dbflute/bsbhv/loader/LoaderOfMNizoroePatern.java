package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of m_nizoroe_patern as TABLE. <br>
 * <pre>
 * [primary key]
 *     NIZOROE_PATERN_ID
 *
 * [column]
 *     NIZOROE_PATERN_ID, NIZOROE_TYPE_CD, NIZOROE_PROC_ID, NIZOROE_PROC_NM, PROGRAM_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     NIZOROE_PATERN_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     m_nizoroe
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     mNizoroeList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMNizoroePatern {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MNizoroePatern> _selectedList;
    protected BehaviorSelector _selector;
    protected MNizoroePaternBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMNizoroePatern ready(List<MNizoroePatern> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MNizoroePaternBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MNizoroePaternBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MNizoroe> _referrerMNizoroeList;

    /**
     * Load referrer of MNizoroeList by the set-upper of referrer. <br>
     * m_nizoroe by NIZOROE_PATERN_ID, named 'MNizoroeList'.
     * <pre>
     * <span style="color: #0000C0">mNizoroePaternBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mNizoroePaternList</span>, <span style="color: #553000">paternLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">paternLoader</span>.<span style="color: #CC4747">loadMNizoroeList</span>(<span style="color: #553000">nizoroeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">nizoroeCB</span>.setupSelect...
     *         <span style="color: #553000">nizoroeCB</span>.query().set...
     *         <span style="color: #553000">nizoroeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">nizoroeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    nizoroeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MNizoroePatern mNizoroePatern : <span style="color: #553000">mNizoroePaternList</span>) {
     *     ... = mNizoroePatern.<span style="color: #CC4747">getMNizoroeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNizoroePaternId_InScope(pkList);
     * cb.query().addOrderBy_NizoroePaternId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMNizoroe> loadMNizoroeList(ConditionBeanSetupper<MNizoroeCB> refCBLambda) {
        myBhv().loadMNizoroeList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMNizoroeList = refLs);
        return hd -> hd.handle(new LoaderOfMNizoroe().ready(_referrerMNizoroeList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MNizoroePatern> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
