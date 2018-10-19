package com.oracle.pt.bass2.qe.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;


public class ReflectDemo {
	
	public final static String className="com.oracle.pt.bass2.qe.reflect.Student";

	public ReflectDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws Exception {
		//getFields();
		getModifiers();
		
	}
	public static void getModifiers() throws Exception, SecurityException {
		Student stu=new Student();
		
		int flag=stu.getClass().getModifiers();
		System.out.println(flag);
		
		Method method=stu.getClass().getMethod("show1", String.class);
		int flagMethod=method.getModifiers();
		System.out.println(flagMethod);
		
		
	}
	public static void getMethods() throws Exception {
		Student stu=new Student();
		Class stuClass=Class.forName(className);
		Method[] methods=stuClass.getDeclaredMethods();
		for(Method method:methods) {
			System.out.println(method.getName());
		}
		
		
		Method m=stuClass.getDeclaredMethod("show1",String.class);
		Parameter[] parameters=m.getParameters();
		for(Parameter parameter:parameters) {
			System.out.println(parameter.toString());
		}
		
		
		Object result=m.invoke(stu, new Object[] {"liudehua"});
		
		System.out.println(result);
		
		
		
	}
	public static void getFields() throws Exception {
		
		Class stuClass=Class.forName("com.oracle.pt.bass2.qe.reflect.Student");
		Field[] fields=stuClass.getDeclaredFields();
		for(Field field:fields) {
			System.out.println(field.getType().toString());
			
			System.out.println(field.getName());
		}
		
		Field f=stuClass.getDeclaredField("name");
		System.out.println(f);
		
		Object object=stuClass.getConstructor().newInstance();
		
		f.set(object, "zhangsan");
		Student student=(Student) object;
		
		System.out.println("Name verfication : "+student.name);
		
				
		
		
	}

}
