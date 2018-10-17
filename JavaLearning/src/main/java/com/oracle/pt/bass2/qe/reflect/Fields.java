package com.oracle.pt.bass2.qe.reflect;

import java.lang.reflect.Field;

public class Fields {

	public Fields() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class stuClass=Class.forName("com.oracle.pt.bass2.qe.reflect.Student");
		
		System.out.println("=======================获取所有公有字段================");
		
		Field[] fieldArry=stuClass.getFields();
		
		for(Field f:fieldArry) {
			System.out.println(f.getName());
					
		}
		
		System.out.println("\"************获取所有的字段(包括私有、受保护、默认的)********************\"");
		fieldArry=stuClass.getDeclaredFields();
		for(Field f:fieldArry) {
			System.out.println(f);
					
		}
		System.out.println("*************获取公有字段**并调用***********************************");
		
		Field f=stuClass.getField("name");
		System.out.println(f);
		
		Object object=stuClass.getConstructor().newInstance();
		
		f.set(object, "zhang san");
		
		Student student=(Student)object;
		System.out.println("Name = "+student.name);
		
		
		System.out.println("**************获取私有字段****并调用********************************");
		f = stuClass.getDeclaredField("phoneNum");
		System.out.println(f);
		f.setAccessible(true);//暴力反射，解除私有限定
		f.set(object, "18888889999");
		System.out.println("验证电话：" + student);


		
		
	}

}
