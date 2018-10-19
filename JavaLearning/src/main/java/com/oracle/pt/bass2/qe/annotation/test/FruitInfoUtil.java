package com.oracle.pt.bass2.qe.annotation.test;

import java.io.File;
import java.lang.reflect.Field;

import com.oracle.pt.bass2.qe.annotation.defination.FruitColor;
import com.oracle.pt.bass2.qe.annotation.defination.FruitProvider;
import com.oracle.pt.bass2.qe.annotation.defination.FruiteName;

public class FruitInfoUtil {

	public FruitInfoUtil() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void getFruitInfo(Class<?> clazz) {
		
		String strFruitName="水果名称：";
		String strFruitColor="水果颜色：";
		String strFruitProvider="供应商名称：";
		
		Field[] fields=clazz.getDeclaredFields();
		
		for(Field field:fields) {
			if(field.isAnnotationPresent(FruiteName.class)) {
				FruiteName fruiteName=(FruiteName) field.getAnnotation(FruiteName.class);
				strFruitName=strFruitName+fruiteName.value();
				System.out.println(strFruitName);
			}else if(field.isAnnotationPresent(FruitColor.class)) {
				FruitColor fruitColor=(FruitColor)field.getAnnotation(FruitColor.class);
				strFruitColor=strFruitColor+fruitColor.fruitColor();
				System.out.println(strFruitColor);
			}else if(field.isAnnotationPresent(FruitProvider.class)) {
				FruitProvider fruitProvider=(FruitProvider) field.getAnnotation(FruitProvider.class);
				strFruitProvider=strFruitProvider +" ��Ӧ�̱�ţ�"+fruitProvider.id()+" ��Ӧ�����ƣ�"+fruitProvider.name()+" ��Ӧ�̵�ַ��"+fruitProvider.address();
				System.out.println(strFruitProvider);
			}
		}
		
	}

}
