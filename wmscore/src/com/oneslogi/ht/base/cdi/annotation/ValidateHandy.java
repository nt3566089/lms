package com.oneslogi.ht.base.cdi.annotation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.interceptor.InterceptorBinding;

/**
 * Handy向けValidate制御用アノテーション
 */
@InterceptorBinding
@Inherited
@Target({ TYPE, METHOD })
@Retention(RUNTIME)
public @interface ValidateHandy {
	public enum Mode {
		OFF,
		ON
	}

	Mode value() default Mode.ON;
}
