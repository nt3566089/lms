package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsBScreenRole;

/**
 * The entity of B_SCREEN_ROLE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BScreenRole extends BsBScreenRole {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

   	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

    public BScreen chaseBScreen() {
        return _bScreen != null ? _bScreen : new BScreen();
    }

   	// ======================================================

}
