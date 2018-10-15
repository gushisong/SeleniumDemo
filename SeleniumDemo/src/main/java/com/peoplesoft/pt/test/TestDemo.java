package com.peoplesoft.pt.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverWait webDriverWait = null;
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello");
			}
		});
		thread.start();
		
		webDriverWait.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver input) {
				// TODO Auto-generated method stub
				return null;
			}
			
		});
	}

}
