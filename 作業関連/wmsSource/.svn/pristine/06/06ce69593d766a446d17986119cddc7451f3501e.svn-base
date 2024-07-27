package com.oneslogi.ht.base.cdi.annotation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.interceptor.InterceptorBinding;

/**
 * Handy向け認証インタセプタ用アノテーション
 * @author at.inoue.hx
 *
 */
@InterceptorBinding
@Inherited
@Target({TYPE, METHOD })
@Retention(RUNTIME)
public @interface AuthenticationHandy {
	public enum Mode {
		OFF,
		ON
	}
	Mode value() default Mode.ON;
}
