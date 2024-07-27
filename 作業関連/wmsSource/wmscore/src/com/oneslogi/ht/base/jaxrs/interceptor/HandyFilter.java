package com.oneslogi.ht.base.jaxrs.interceptor;

import javax.annotation.Priority;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.ext.Provider;

import org.jboss.resteasy.core.interception.jaxrs.ResponseContainerRequestContext;
import org.slf4j.Logger;

import com.oneslogi.base.BaseConst;
import com.oneslogi.base.jaxrs.interceptor.GeneralFilter;
import com.oneslogi.base.logger.CommonLogger;
import com.oneslogi.ht.base.cdi.annotation.AuthenticationHandy;
import com.oneslogi.ht.base.resources.HandyResourceBase;

/**
 * フィルタクラスです。
 * Handy固有のフィルタ処理が実行されます。
 * ※当クラスはシングルトンで実行されます。
 * 　原則Injectしたインスタンス変数は利用しないで下さい。
 */
@Priority(BaseConst.BASE_PRIORITY + 4)
@Provider
public class HandyFilter extends GeneralFilter {

	private final Logger logger = CommonLogger.getLogger(this.getClass());

	@Override
	public void filter(ContainerRequestContext arg0) {
		requestFilter(arg0);
	}

	@Override
	public void filter(ContainerRequestContext arg0, ContainerResponseContext arg1) {
		responseFilter(arg0, arg1);
	}

	@Override
	protected Class<?> getFilteringAnnotation() {
		return AuthenticationHandy.class;
	}

	@Override
	protected void setError(ContainerRequestContext arg0, ContainerResponseContext arg1, Exception e) {

		String error = null;

		if (e != null) {
			error = e.getMessage();
		} else if (arg1.getEntity() instanceof String) {
			error = (String) arg1.getEntity();
		}

		if (logger.isErrorEnabled() && error != null) {
			logger.error(error);
		}

		//エラー画面表示
		((ResponseContainerRequestContext) arg0).getHttpRequest().forward(HandyResourceBase.HT_URI_BASE + "/base/FatalError.jsp");
	}

	@Override
	protected void outputDownloadFile(ContainerRequestContext arg0, ContainerResponseContext arg1) throws Exception {
		return;
	}

}
