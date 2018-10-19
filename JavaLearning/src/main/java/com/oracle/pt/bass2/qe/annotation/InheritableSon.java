package com.oracle.pt.bass2.qe.annotation;


public class InheritableSon extends InheritableFather{

	public InheritableSon() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("InheritableSon : "+InheritableSon.class.isAnnotationPresent(Inheritable.class));
	}
	public static void main(String[] args) {
		InheritableSon inheritableSon=new InheritableSon();
	}

	
}
