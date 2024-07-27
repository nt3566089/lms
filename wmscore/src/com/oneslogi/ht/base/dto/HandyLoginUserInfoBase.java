package com.oneslogi.ht.base.dto;

import com.oneslogi.base.cookie.SessionData;
import com.oneslogi.base.cookie.SessionDataImpl;

/**
 * ログイン情報を保持します。
 * @author hi.watanabe.mp
 *
 */
public abstract class HandyLoginUserInfoBase {

	protected SessionData sessionData = new SessionDataImpl();

	/**
	 * SessionDataを取得します。
	 * @return SessionData
	 */
	public SessionData getSessionData() {
		return sessionData;
	}

	public void setSessionData(SessionData sessionData) {
		this.sessionData = sessionData;
	}

}
