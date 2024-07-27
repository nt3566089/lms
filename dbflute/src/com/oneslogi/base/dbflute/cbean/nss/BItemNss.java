package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BItemCQ;

/**
 * The nest select set-upper of b_item.
 * @author DBFlute(AutoGenerator)
 */
public class BItemNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BItemCQ _query;
    public BItemNss(BItemCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * b_dict by my DICT_ID, named 'BDict'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BDictNss withBDict() {
        _query.xdoNss(() -> _query.queryBDict());
        return new BDictNss(_query.queryBDict());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_screen by my SCREEN_ID, named 'BScreen'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BScreenNss withBScreen() {
        _query.xdoNss(() -> _query.queryBScreen());
        return new BScreenNss(_query.queryBScreen());
    }
    /**
     * With nested relation columns to select clause. <br>
     * v_dict by my DICT_ID, named 'VDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void withVDict(final Long cultureId) {
        _query.xdoNss(() -> _query.queryVDict(cultureId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * v_ht_dict by my DICT_ID, named 'VHtDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void withVHtDict(final Long cultureId) {
        _query.xdoNss(() -> _query.queryVHtDict(cultureId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my ITEM_TYPE, named 'BClassDtlByItemType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByItemType() {
        _query.xdoNss(() -> _query.queryBClassDtlByItemType());
        return new BClassDtlNss(_query.queryBClassDtlByItemType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my VISIBLE, named 'BClassDtlByVisible'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByVisible() {
        _query.xdoNss(() -> _query.queryBClassDtlByVisible());
        return new BClassDtlNss(_query.queryBClassDtlByVisible());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my EDITABLE, named 'BClassDtlByEditable'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByEditable() {
        _query.xdoNss(() -> _query.queryBClassDtlByEditable());
        return new BClassDtlNss(_query.queryBClassDtlByEditable());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my TEXT_ALIGN, named 'BClassDtlByTextAlign'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByTextAlign() {
        _query.xdoNss(() -> _query.queryBClassDtlByTextAlign());
        return new BClassDtlNss(_query.queryBClassDtlByTextAlign());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my NECESSARY, named 'BClassDtlByNecessary'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByNecessary() {
        _query.xdoNss(() -> _query.queryBClassDtlByNecessary());
        return new BClassDtlNss(_query.queryBClassDtlByNecessary());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my DISPLAY_REQUIRED, named 'BClassDtlByDisplayRequired'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDisplayRequired() {
        _query.xdoNss(() -> _query.queryBClassDtlByDisplayRequired());
        return new BClassDtlNss(_query.queryBClassDtlByDisplayRequired());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_item_valid by ITEM_ID, named 'BItemValidAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BItemValidNss withBItemValidAsOne() {
        _query.xdoNss(() -> _query.queryBItemValidAsOne());
        return new BItemValidNss(_query.queryBItemValidAsOne());
    }
}
