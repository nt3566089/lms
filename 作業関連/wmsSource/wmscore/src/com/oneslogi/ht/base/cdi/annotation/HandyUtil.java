package com.oneslogi.ht.base.cdi.annotation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

/**
 * HandyBaseUtilを特定する為の限定子アノテーション。
 * @author ko-yamamoto
 */
@Qualifier
@Retention(RUNTIME)
@Target({METHOD, FIELD, PARAMETER, TYPE})
public @interface HandyUtil {
}
