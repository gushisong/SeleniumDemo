package com.oracle.pt.bass2.qe.annotation.defination;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
public @interface FruitProvider {
	/**
	 * 
	 * @return
	 */
	public int id() default -1;
	
	public String name() default "";
	
	public String address() default "";
	

}
