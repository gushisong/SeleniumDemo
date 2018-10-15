package com.peoplesoft.pe.automation.definition.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebBase {
	protected WebDriver webDriver;
	protected WebDriverWait webDriverWait;
	private String currentFrame;
	public WebDriver getWebDriver() {
		return webDriver;
	}
	public void setWebDriver(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	public WebDriverWait getWebDriverWait() {
		return webDriverWait;
	}
	public void setWebDriverWait(WebDriver driver) {
		if(webDriverWait ==null) {
			webDriverWait=new WebDriverWait(driver, 30);
		}
	}
	public String getCurrentFrame() {
		return currentFrame;
	}
	public void setCurrentFrame(String currentFrame) {
		this.currentFrame = currentFrame;
	}
	
	
	public void waitElementExists(WebDriver driver,final WebElement element) {
		setWebDriver(driver);
		this.webDriverWait.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver input) {
				// TODO Auto-generated method stub
				return element.isDisplayed();
			}
			
			
		});
			

		
	}
	

}
