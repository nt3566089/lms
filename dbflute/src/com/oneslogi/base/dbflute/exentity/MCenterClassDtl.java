package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsMCenterClassDtl;

/**
 * The entity of m_center_class_dtl.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MCenterClassDtl extends BsMCenterClassDtl {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public VDict chaseVDict() {
		return _vDict != null ? _vDict : new VDict();
	}

	// ======================================================
}