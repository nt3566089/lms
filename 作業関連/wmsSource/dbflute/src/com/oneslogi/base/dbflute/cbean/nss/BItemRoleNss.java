package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BItemRoleCQ;

/**
 * The nest select set-upper of b_item_role.
 * @author DBFlute(AutoGenerator)
 */
public class BItemRoleNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BItemRoleCQ _query;
    public BItemRoleNss(BItemRoleCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * b_role by my ROLE_ID, named 'BRole'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BRoleNss withBRole() {
        _query.xdoNss(() -> _query.queryBRole());
        return new BRoleNss(_query.queryBRole());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_item by my ITEM_ID, named 'BItem'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BItemNss withBItem() {
        _query.xdoNss(() -> _query.queryBItem());
        return new BItemNss(_query.queryBItem());
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
}
