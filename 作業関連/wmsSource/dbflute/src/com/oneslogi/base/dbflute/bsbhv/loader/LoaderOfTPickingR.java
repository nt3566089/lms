package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_picking_r as TABLE. <br>
 * <pre>
 * [primary key]
 *     PICKING_H_ID
 *
 * [column]
 *     PICKING_H_ID, OPL_OUT_FLG, TPL_OUT_FLG, MLT_OUT_FLG, SPL_OUT_FLG, PL1_OUT_FLG, PL1_OUT_USER_ID, PL1_OUT_DT, PL_OUT_FLG, PL_OUT_USER_ID, PL_OUT_DT, SL_OUT_FLG, PL2_OUT_FLG, PL2_OUT_USER_ID, PL2_OUT_DT, CASE_OUT_FLG, CASE_OUT_USER_ID, CASE_OUT_DT, PACKING_OUT_FLG, PACKING_OUT_USER_ID, PACKING_OUT_DT, SLIP_OUT_FLG, SLIP_OUT_USER_ID, SLIP_OUT_DT, INVOICE_CREATE_FLG, INVOICE_CREATE_DT, INVOICE_ISSUE_NUM, SHIPPING_RECORD_OUT_FLG, SHIPPING_RECORD_OUT_USER_ID, SHIPPING_RECORD_OUT_DT, BOL_OUT_FLG, BOL_OUT_USER_ID, BOL_OUT_DT, TAG_OUT_FLG, TAG_OUT_USER_ID, TAG_OUT_DT, DELIV_OUT_FLG, DELIV_OUT_USER_ID, DELIV_OUT_DT, PLL_OUT_FLG, PLL_OUT_USER_ID, PLL_OUT_DT, NIZOROE_OUT_FLG, NIZOROE_OUT_USER_ID, NIZOROE_OUT_DT, INDV_SUPPLY_OUT_FLG, INDV_SUPPLY_OUT_USER_ID, INDV_SUPPLY_OUT_DT, INDV_LABEL_OUT_FLG, INDV_LABEL_OUT_USER_ID, INDV_LABEL_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     t_picking_h, b_user, b_class_dtl(ByInvoiceCreateFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tPickingH, bUserByCaseOutUserId, bUserByBolOutUserId, bUserByPl1OutUserId, bUserByTagOutUserId, bUserByShippingRecordOutUserId, bUserByDelivOutUserId, bUserByIndvSupplyOutUserId, bUserByPackingOutUserId, bUserByPlOutUserId, bUserByIndvLabelOutUserId, bUserByPl2OutUserId, bUserBySlipOutUserId, bUserByNizoroeOutUserId, bUserByPllOutUserId, bClassDtlByInvoiceCreateFlg, bClassDtlByOplOutFlg, bClassDtlByTplOutFlg, bClassDtlByCaseOutFlg, bClassDtlByMltOutFlg, bClassDtlBySplOutFlg, bClassDtlByPlOutFlg, bClassDtlBySlOutFlg, bClassDtlByPl1OutFlg, bClassDtlByPl2OutFlg, bClassDtlByPackingOutFlg, bClassDtlBySlipOutFlg, bClassDtlByShippingRecordOutFlg, bClassDtlByBolOutFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTPickingR {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TPickingR> _selectedList;
    protected BehaviorSelector _selector;
    protected TPickingRBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTPickingR ready(List<TPickingR> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TPickingRBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TPickingRBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTPickingH _foreignTPickingHLoader;
    public LoaderOfTPickingH pulloutTPickingH() {
        if (_foreignTPickingHLoader == null)
        { _foreignTPickingHLoader = new LoaderOfTPickingH().ready(myBhv().pulloutTPickingH(_selectedList), _selector); }
        return _foreignTPickingHLoader;
    }

    protected LoaderOfBUser _foreignBUserByCaseOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByCaseOutUserId() {
        if (_foreignBUserByCaseOutUserIdLoader == null)
        { _foreignBUserByCaseOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByCaseOutUserId(_selectedList), _selector); }
        return _foreignBUserByCaseOutUserIdLoader;
    }

    protected LoaderOfBUser _foreignBUserByBolOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByBolOutUserId() {
        if (_foreignBUserByBolOutUserIdLoader == null)
        { _foreignBUserByBolOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByBolOutUserId(_selectedList), _selector); }
        return _foreignBUserByBolOutUserIdLoader;
    }

    protected LoaderOfBUser _foreignBUserByPl1OutUserIdLoader;
    public LoaderOfBUser pulloutBUserByPl1OutUserId() {
        if (_foreignBUserByPl1OutUserIdLoader == null)
        { _foreignBUserByPl1OutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByPl1OutUserId(_selectedList), _selector); }
        return _foreignBUserByPl1OutUserIdLoader;
    }

    protected LoaderOfBUser _foreignBUserByTagOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByTagOutUserId() {
        if (_foreignBUserByTagOutUserIdLoader == null)
        { _foreignBUserByTagOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByTagOutUserId(_selectedList), _selector); }
        return _foreignBUserByTagOutUserIdLoader;
    }

    protected LoaderOfBUser _foreignBUserByShippingRecordOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByShippingRecordOutUserId() {
        if (_foreignBUserByShippingRecordOutUserIdLoader == null)
        { _foreignBUserByShippingRecordOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByShippingRecordOutUserId(_selectedList), _selector); }
        return _foreignBUserByShippingRecordOutUserIdLoader;
    }

    protected LoaderOfBUser _foreignBUserByDelivOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByDelivOutUserId() {
        if (_foreignBUserByDelivOutUserIdLoader == null)
        { _foreignBUserByDelivOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByDelivOutUserId(_selectedList), _selector); }
        return _foreignBUserByDelivOutUserIdLoader;
    }

    protected LoaderOfBUser _foreignBUserByIndvSupplyOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByIndvSupplyOutUserId() {
        if (_foreignBUserByIndvSupplyOutUserIdLoader == null)
        { _foreignBUserByIndvSupplyOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByIndvSupplyOutUserId(_selectedList), _selector); }
        return _foreignBUserByIndvSupplyOutUserIdLoader;
    }

    protected LoaderOfBUser _foreignBUserByPackingOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByPackingOutUserId() {
        if (_foreignBUserByPackingOutUserIdLoader == null)
        { _foreignBUserByPackingOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByPackingOutUserId(_selectedList), _selector); }
        return _foreignBUserByPackingOutUserIdLoader;
    }

    protected LoaderOfBUser _foreignBUserByPlOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByPlOutUserId() {
        if (_foreignBUserByPlOutUserIdLoader == null)
        { _foreignBUserByPlOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByPlOutUserId(_selectedList), _selector); }
        return _foreignBUserByPlOutUserIdLoader;
    }

    protected LoaderOfBUser _foreignBUserByIndvLabelOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByIndvLabelOutUserId() {
        if (_foreignBUserByIndvLabelOutUserIdLoader == null)
        { _foreignBUserByIndvLabelOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByIndvLabelOutUserId(_selectedList), _selector); }
        return _foreignBUserByIndvLabelOutUserIdLoader;
    }

    protected LoaderOfBUser _foreignBUserByPl2OutUserIdLoader;
    public LoaderOfBUser pulloutBUserByPl2OutUserId() {
        if (_foreignBUserByPl2OutUserIdLoader == null)
        { _foreignBUserByPl2OutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByPl2OutUserId(_selectedList), _selector); }
        return _foreignBUserByPl2OutUserIdLoader;
    }

    protected LoaderOfBUser _foreignBUserBySlipOutUserIdLoader;
    public LoaderOfBUser pulloutBUserBySlipOutUserId() {
        if (_foreignBUserBySlipOutUserIdLoader == null)
        { _foreignBUserBySlipOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserBySlipOutUserId(_selectedList), _selector); }
        return _foreignBUserBySlipOutUserIdLoader;
    }

    protected LoaderOfBUser _foreignBUserByNizoroeOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByNizoroeOutUserId() {
        if (_foreignBUserByNizoroeOutUserIdLoader == null)
        { _foreignBUserByNizoroeOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByNizoroeOutUserId(_selectedList), _selector); }
        return _foreignBUserByNizoroeOutUserIdLoader;
    }

    protected LoaderOfBUser _foreignBUserByPllOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByPllOutUserId() {
        if (_foreignBUserByPllOutUserIdLoader == null)
        { _foreignBUserByPllOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByPllOutUserId(_selectedList), _selector); }
        return _foreignBUserByPllOutUserIdLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInvoiceCreateFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInvoiceCreateFlg() {
        if (_foreignBClassDtlByInvoiceCreateFlgLoader == null)
        { _foreignBClassDtlByInvoiceCreateFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInvoiceCreateFlg(_selectedList), _selector); }
        return _foreignBClassDtlByInvoiceCreateFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByOplOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByOplOutFlg() {
        if (_foreignBClassDtlByOplOutFlgLoader == null)
        { _foreignBClassDtlByOplOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByOplOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByOplOutFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByTplOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByTplOutFlg() {
        if (_foreignBClassDtlByTplOutFlgLoader == null)
        { _foreignBClassDtlByTplOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByTplOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByTplOutFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByCaseOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCaseOutFlg() {
        if (_foreignBClassDtlByCaseOutFlgLoader == null)
        { _foreignBClassDtlByCaseOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCaseOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByCaseOutFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByMltOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByMltOutFlg() {
        if (_foreignBClassDtlByMltOutFlgLoader == null)
        { _foreignBClassDtlByMltOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByMltOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByMltOutFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlBySplOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySplOutFlg() {
        if (_foreignBClassDtlBySplOutFlgLoader == null)
        { _foreignBClassDtlBySplOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySplOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlBySplOutFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPlOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPlOutFlg() {
        if (_foreignBClassDtlByPlOutFlgLoader == null)
        { _foreignBClassDtlByPlOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPlOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByPlOutFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlBySlOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySlOutFlg() {
        if (_foreignBClassDtlBySlOutFlgLoader == null)
        { _foreignBClassDtlBySlOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySlOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlBySlOutFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPl1OutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPl1OutFlg() {
        if (_foreignBClassDtlByPl1OutFlgLoader == null)
        { _foreignBClassDtlByPl1OutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPl1OutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByPl1OutFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPl2OutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPl2OutFlg() {
        if (_foreignBClassDtlByPl2OutFlgLoader == null)
        { _foreignBClassDtlByPl2OutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPl2OutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByPl2OutFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPackingOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPackingOutFlg() {
        if (_foreignBClassDtlByPackingOutFlgLoader == null)
        { _foreignBClassDtlByPackingOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPackingOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByPackingOutFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlBySlipOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySlipOutFlg() {
        if (_foreignBClassDtlBySlipOutFlgLoader == null)
        { _foreignBClassDtlBySlipOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySlipOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlBySlipOutFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByShippingRecordOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByShippingRecordOutFlg() {
        if (_foreignBClassDtlByShippingRecordOutFlgLoader == null)
        { _foreignBClassDtlByShippingRecordOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByShippingRecordOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByShippingRecordOutFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByBolOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByBolOutFlg() {
        if (_foreignBClassDtlByBolOutFlgLoader == null)
        { _foreignBClassDtlByBolOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByBolOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByBolOutFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TPickingR> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
