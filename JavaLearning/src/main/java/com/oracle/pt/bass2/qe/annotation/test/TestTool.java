package com.oracle.pt.bass2.qe.annotation.test;

import java.lang.reflect.Method;

import com.oracle.pt.bass2.qe.annotation.defination.Jiecha;

public class TestTool {

	public TestTool() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		NoBug noBug = new NoBug();

		Class clazz = noBug.getClass();

		Method[] methods = clazz.getDeclaredMethods();

		StringBuilder log = new StringBuilder();

		int errorNum = 0;

		for (Method method : methods) {
			if (method.isAnnotationPresent(Jiecha.class)) {
				try {
					if (method.getName().equals("toString")) {
						System.out.println(method.invoke(noBug, new Object[] {"test"}).equals("test"));
					} else {
						method.setAccessible(true);
						method.invoke(noBug, null);
					}
				} catch (Exception e) {
					// TODO: handle exception
					errorNum++;
					log.append(method.getName());
					log.append(" ");
					log.append("has error ");
					log.append(e.getCause().getClass().getSimpleName());
					log.append("\n\r");
					log.append(e.getCause().getMessage());
					log.append("\n\r");
				}
			}

		}
		log.append(clazz.getSimpleName());
		log.append(" has ");
		log.append(errorNum);
		log.append(" error.");
		System.out.println(log.toString());

	}

}
