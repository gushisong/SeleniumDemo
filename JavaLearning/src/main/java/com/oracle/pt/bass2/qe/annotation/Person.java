package com.oracle.pt.bass2.qe.annotation;

import java.lang.annotation.Documented;

public class Person {

	public Person() {
		// TODO Auto-generated constructor stub
	}
	@Deprecated
	@MyAnnotation
	/**
	 * This is a test
	 */
	public void empty() {
		System.out.println("\nempty");
	}
	/**
	 * print the name and age
	 * @param name
	 * @param age
	 * @author xiaolson 
	 */
	@MyAnnotation(value= {"gril","boy"})
	public void someBody(String name,int age) {
		System.out.println("\nsomeBody : name "+name+" age "+age);
	}

}
