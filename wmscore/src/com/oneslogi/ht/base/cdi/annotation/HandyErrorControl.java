package com.oneslogi.ht.base.cdi.annotation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.interceptor.InterceptorBinding;

/**
 * エラー時の挙動を制御する為のアノテーション。
 * @author ko-yamamoto
 */
@InterceptorBinding
@Inherited
@Target({TYPE, METHOD })
@Retention(RUNTIME)
public @interface HandyErrorControl {
//	String value();
}
