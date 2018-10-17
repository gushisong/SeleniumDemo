package com.oracle.pt.bass2.qe.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Methods {

	public Methods() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class stuClass=Class.forName("com.oracle.pt.bass2.qe.reflect.Student");
		System.out.println("***************获取所有的”公有“方法*******************");
		
		Method[] methodArray=stuClass.getMethods();
		for(Method m:methodArray) {
			System.out.println(m);
		}

		System.out.println("***************获取所声明的方法*******************");
		methodArray=stuClass.getDeclaredMethods();
		for(Method m:methodArray) {
			System.out.println(m);
		}
		System.out.println("***************获取公有的show1()方法*******************");
		
		Method method=stuClass.getMethod("show1", String.class);
		System.out.println(method);
		
		Object object=stuClass.getConstructor(String.class,int.class).newInstance("张三丰",10);
		method.invoke(object, "刘德华");
		Object obj=stuClass.newInstance();
		method.invoke(obj, "刘德华");
		System.out.println("测试main方法==========================================");
		
		Method methodMain=stuClass.getMethod("main", String[].class);
		methodMain.invoke(null, (Object)new String[] {"a","b","c"});
		
		
		ArrayList<String> strList=new ArrayList<String>();
		
		strList.add("aaaaa");
		strList.add("bbbbb");
		Class listClass=strList.getClass();
		
		Method m=listClass.getMethod("add", Object.class);
		m.invoke(strList, 100);
		for(Object o:strList) {
			System.out.println(o);
		}
		
	}

}
