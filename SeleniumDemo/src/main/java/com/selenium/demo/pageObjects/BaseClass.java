package com.selenium.demo.pageObjects;

import org.junit.experimental.theories.Theories;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bsh.This;

public class BaseClass {
	
	public static WebDriver driver;
	public static boolean bResult;
	public static WebDriverWait webDriverWait;
	private String currentFrame;
	
		
	public String getCurrentFrame() {
		return currentFrame;
	}


	public void setCurrentFrame(String currentFrame) {
		this.currentFrame = currentFrame;
	}


	public static void setWebDriverWait(WebDriver driver) {
		if(webDriverWait==null) {
			webDriverWait=new WebDriverWait(driver, 30);
		}
	}

	public BaseClass(WebDriver driver) {
		BaseClass.driver=driver;
		BaseClass.bResult=true;
	}
	
	public void waitElementExist(WebDriver dirver,WebElement element) {

		setWebDriverWait(dirver);
		System.out.println(webDriverWait);
		this.webDriverWait.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver input) {
				// TODO Auto-generated method stub
				return element.isDisplayed();
			}
		});
		
	}
	public static void waitForElement(WebElement element) {
		System.out.println(driver);
		
		setWebDriverWait(driver);
		System.out.println(webDriverWait);
		webDriverWait.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver input) {
				// TODO Auto-generated method stub
				return element.isDisplayed();
			}
		});
	
		
		
	}
	
	
	

}
