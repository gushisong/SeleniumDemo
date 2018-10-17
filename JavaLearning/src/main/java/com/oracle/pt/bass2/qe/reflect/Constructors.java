package com.oracle.pt.bass2.qe.reflect;

import java.lang.reflect.Constructor;

public class Constructors {

	public Constructors() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class class1=Class.forName("com.oracle.pt.bass2.qe.reflect.Student");
		
		System.out.println("============================All public constructors method+++++++++++++++");
		Constructor[] conArry=class1.getConstructors();
		
		System.out.println(conArry.length);
		for(Constructor c:conArry) {
			System.out.println(c.toString());
		}
		
		System.out.println("============================All  constructors method+++++++++++++++");
		conArry=class1.getDeclaredConstructors();
		System.out.println(conArry.length);
		for(Constructor c:conArry) {
			System.out.println(c);
		}
		
		System.out.println("****************获取公有、无参的构造方法*******************************");
		Constructor con=class1.getDeclaredConstructor(null);
		System.out.println("con = "+con);
		Object object=con.newInstance();
		
		System.out.println("******************获取私有构造方法，并调用*******************************");
		
		con=class1.getDeclaredConstructor(char.class);
		System.out.println(con);
		con.setAccessible(true);
		object=con.newInstance('男');
		
		
		
	}

}
