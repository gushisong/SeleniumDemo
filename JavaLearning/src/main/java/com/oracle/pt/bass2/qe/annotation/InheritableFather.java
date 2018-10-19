package com.oracle.pt.bass2.qe.annotation;

@Inheritable
public class InheritableFather {

	public InheritableFather() {
		// TODO Auto-generated constructor stub
		System.out.println("InheritableFather : "+InheritableFather.class.isAnnotationPresent(Inheritable.class));
	}

}
