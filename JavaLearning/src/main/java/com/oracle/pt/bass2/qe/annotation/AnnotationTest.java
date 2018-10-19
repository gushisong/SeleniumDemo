package com.oracle.pt.bass2.qe.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationTest {

	public AnnotationTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception, SecurityException {
		// TODO Auto-generated method stub
		
		Person person=new Person();
		
		Class<Person> class1=Person.class;
		
		Method mSomeBody=class1.getDeclaredMethod("someBody", new Class[] {String.class,int.class});
		
		mSomeBody.invoke(person, new Object[] {"lili",20});
		
		Method mEmpty=class1.getDeclaredMethod("empty", new Class[] {});
		mEmpty.invoke(person);
		
		iteratorAnnotation(mSomeBody);
		

	}
	
	public static void iteratorAnnotation(Method method) {
		if(method.isAnnotationPresent(MyAnnotation.class)) {
			MyAnnotation myAnnotation=method.getAnnotation(MyAnnotation.class);
			String[] values=myAnnotation.value();
			for(String value:values ) {
				System.out.println(value+" , ");
			}
		}
		
		Annotation[] annotations=method.getAnnotations();
		for(Annotation annotation:annotations) {
			System.out.println(annotation);
		}
		
	}

}
