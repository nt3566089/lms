package com.oneslogi.ht.base;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.oneslogi.base.AbstractBase;
import com.oneslogi.base.cookie.SessionDataImpl;
import com.oneslogi.base.resources.AuthenticationBaseResource;
import com.oneslogi.ht.base.dto.HandyLoginUserInfoBase;

/**
 * HTベースとなるクラスです。
 */
public abstract class AbstractWmsHtBase extends AbstractBase {

	private static long defaultCultureId = 1L;

	static {
		Properties properties = new Properties();
		InputStream is = AuthenticationBaseResource.class.getClassLoader().getResourceAsStream("handy.properties");

		try {
			properties.load(is);
			is.close();

			defaultCultureId = Long.valueOf(properties.getProperty("defaultCultureId", "1"));

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Override
	public Long getCultureId() {

		Long cultureId = super.getCultureId();

		if (cultureId == null) {

			HttpServletRequest req = getHttpServletRequest();
			HttpSession ses = req.getSession();

			HandyLoginUserInfoBase loginInfo = (HandyLoginUserInfoBase) ses.getAttribute("loginInfo");
			if (loginInfo != null) {
				cultureId = ((SessionDataImpl) loginInfo.getSessionData()).getCultureId();
			}

			if (cultureId == null) {
				return defaultCultureId;
			}
		}

		return cultureId;
	}
}
