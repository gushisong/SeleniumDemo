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
		System.out.println("***************��ȡ���еġ����С�����*******************");
		
		Method[] methodArray=stuClass.getMethods();
		for(Method m:methodArray) {
			System.out.println(m);
		}

		System.out.println("***************��ȡ�������ķ���*******************");
		methodArray=stuClass.getDeclaredMethods();
		for(Method m:methodArray) {
			System.out.println(m);
		}
		System.out.println("***************��ȡ���е�show1()����*******************");
		
		Method method=stuClass.getMethod("show1", String.class);
		System.out.println(method);
		
		Object object=stuClass.getConstructor(String.class,int.class).newInstance("������",10);
		method.invoke(object, "���»�");
		Object obj=stuClass.newInstance();
		method.invoke(obj, "���»�");
		System.out.println("����main����==========================================");
		
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
