package com.selenium.demo;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selenium.demo.pageObjects.BaseClass;
import com.selenium.demo.utility.Utils;

public class TestCase_001 extends BaseClass {
	
	public static WebDriver driver=Utils.openBrowser("Chrome");
	
	@FindBy(how=How.XPATH,using="//*[@id=\"account\"]/a")
	static WebElement lnk_MyAccount;
	
	public TestCase_001(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//WebElement element=driver.findElement(By.xpath("//*[@id=\"account\"]/a"));
		//element.click();
		PageFactory.initElements(driver, TestCase_001.class);
		lnk_MyAccount.click();
		new BaseClass(driver);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
		
	}

}
