package com.oneslogi.wms.base.cdi.annotation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.util.Nonbinding;
import javax.interceptor.InterceptorBinding;

/**
 * 作業実績ログを制御する為のアノテーション。
 */
@InterceptorBinding
@Inherited
@Target({TYPE, METHOD })
@Retention(RUNTIME)
public @interface WorkLogData {
	@Nonbinding
	String value();
}
