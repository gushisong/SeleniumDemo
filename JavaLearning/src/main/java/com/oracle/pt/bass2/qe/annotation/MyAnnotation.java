package com.oracle.pt.bass2.qe.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface MyAnnotation {
	
	String[] value() default "unknow";

}
