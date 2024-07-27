package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BUserCQ;

/**
 * The nest select set-upper of b_user.
 * @author DBFlute(AutoGenerator)
 */
public class BUserNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BUserCQ _query;
    public BUserNss(BUserCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * b_culture by my CULTURE_ID, named 'BCulture'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BCultureNss withBCulture() {
        _query.xdoNss(() -> _query.queryBCulture());
        return new BCultureNss(_query.queryBCulture());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_role_grp by my ROLE_GRP_ID, named 'BRoleGrp'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BRoleGrpNss withBRoleGrp() {
        _query.xdoNss(() -> _query.queryBRoleGrp());
        return new BRoleGrpNss(_query.queryBRoleGrp());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDelFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByDelFlg());
        return new BClassDtlNss(_query.queryBClassDtlByDelFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user_auth by USER_ID, named 'BUserAuthAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserAuthNss withBUserAuthAsOne() {
        _query.xdoNss(() -> _query.queryBUserAuthAsOne());
        return new BUserAuthNss(_query.queryBUserAuthAsOne());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_user_login by USER_ID, named 'MUserLoginAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MUserLoginNss withMUserLoginAsOne() {
        _query.xdoNss(() -> _query.queryMUserLoginAsOne());
        return new MUserLoginNss(_query.queryMUserLoginAsOne());
    }
}
