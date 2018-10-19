package com.oracle.pt.bass2.qe.annotation;

import java.util.Date;

public class SuppressWarningTest {

	public SuppressWarningTest() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings(value= {"deprecation"})
	public static void doSomething() {
		
		Date date=new Date(113, 8, 26);
		System.out.println(date);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		doSomething();
	}

}
