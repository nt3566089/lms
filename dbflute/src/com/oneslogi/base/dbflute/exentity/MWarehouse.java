package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsMWarehouse;

/**
 * The entity of M_WAREHOUSE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MWarehouse extends BsMWarehouse {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MCenter chaseMCenter() {
		return _mCenter != null ? _mCenter : new MCenter();
	}

	// ======================================================
}
