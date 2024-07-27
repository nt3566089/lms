package com.oneslogi.wms.core.logic.common;

import java.lang.reflect.Method;

import com.oneslogi.base.AbstractBase;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.wms.base.cdi.annotation.WorkLogData;
import com.oneslogi.wms.base.cdi.annotation.WorkLogEnd;
import com.oneslogi.wms.base.cdi.annotation.WorkLogMergeEnd;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStartEnd;
import com.oneslogi.wms.core.AbstractWmsBase;

/**
 * 作業実績関連チェックロジック
 */
public class WorkLogCheckLogic extends AbstractBase {

	/**
	 * <h2>アノテーションの有無チェック.</h2>
	 * <pre>
	 * 作業実績関連のアノテーションが付いている場合は何もしない。
	 * 付いていない場合は例外をスローする。
	 * </pre>
	 */
	public void checkAnnotation() {

		StackTraceElement[] StackTraceElements = Thread.currentThread().getStackTrace();
		for (StackTraceElement ste : StackTraceElements) {

			try {

				String className = ste.getClassName();

				if (0 <= className.indexOf("$Proxy$")) {
					continue;
				}

				if (className.indexOf("oneslogi") < 0) {
					continue;
				}

				Class<?> cls = Class.forName(className);

				if (cls.equals(AbstractWmsBase.class)) {
					continue;
				}

				if (cls.equals(HandyResourceBase.class)) {
					continue;
				}

				if (!AbstractWmsBase.class.isAssignableFrom(cls) && !HandyResourceBase.class.isAssignableFrom(cls)) {
					continue;
				}

				if (cls.isAnnotationPresent(WorkLogData.class)) {
					// クラスに作業実績関連のアノテーション有り

					return;
				}

				if (cls.isAnnotationPresent(WorkLogStart.class) ||
						cls.isAnnotationPresent(WorkLogEnd.class) ||
						cls.isAnnotationPresent(WorkLogStartEnd.class) ||
						cls.isAnnotationPresent(WorkLogMergeEnd.class)) {
					// クラスには付けてはいけない作業実績関連アノテーション有り

					getErrorManager().throwException(new IllegalStateException("Illegal class anotation related to [WorkLog]."));
				}

				String methodName = ste.getMethodName();
				Method[] methods = cls.getDeclaredMethods();

				for (Method method : methods) {
					if (!method.getName().equals(methodName)) {
						continue;
					}

					if (method.isAnnotationPresent(WorkLogData.class) ||
							method.isAnnotationPresent(WorkLogStart.class) ||
							method.isAnnotationPresent(WorkLogEnd.class) ||
							method.isAnnotationPresent(WorkLogStartEnd.class) ||
							method.isAnnotationPresent(WorkLogMergeEnd.class)) {
						// メソッドに作業実績関連のアノテーション有り

						return;
					} else {
						break;
					}
				}
			} catch (SecurityException | ClassNotFoundException e) {

				getErrorManager().throwException(new RuntimeException(e));
			}
		}

		// クラスにもメソッドにも作業実績関連のアノテーション無し
		getErrorManager().throwException(new IllegalAccessException("Not found anotation related to [WorkLog]."));
	}
}
