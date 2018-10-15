package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.peoplesoft.pe.automation.definition.testcase.WebBase;

public class StepManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TestCase1 testCase1=new TestCase1();
//		Object o=new Object();
//		Object supperclass=o.getClass().getGenericInterfaces();
//		String name=supperclass.getClass().toString();
//		System.out.println(name);
		
		WebBase webBase=new WebBase();
		TestClass testClass=new TestClass();
		Object supperClass=testClass.getClass().getGenericSuperclass();
		System.out.println(supperClass.toString());
		
		WebDriver driver=new ChromeDriver();
		driver.switchTo().defaultContent();
		
		
		
		
		
	

	}

}
