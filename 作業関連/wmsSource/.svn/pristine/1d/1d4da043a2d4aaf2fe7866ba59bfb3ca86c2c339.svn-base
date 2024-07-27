package com.oneslogi.wms.base.cdi.interceptor;

import com.oneslogi.base.dbflute.exentity.TWorkLog;

public class WorkLogLocal {

	private static final ThreadLocal<TWorkLog> threadLocal = new ThreadLocal<TWorkLog>() {

		@Override
		protected TWorkLog initialValue() {
			return new TWorkLog();
		}

	};

	public static TWorkLog get() {
		return threadLocal.get();
	}

	public static void clear() {
		threadLocal.remove();
	}

}
