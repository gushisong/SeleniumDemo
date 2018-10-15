package com.selenium.demo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selenium.demo.utility.Log;

public class Home_Page extends BaseClass{
	
	public Home_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	static {
		PageFactory.initElements(driver, Home_Page.class);
	}
	
	/**
	 * 
	 */
	
	@FindBy(how=How.XPATH,using="//*[@id=\"account\"]/aa")
	private static WebElement lnk_MyAccount;
	//@FindBy(how=How.XPATH,xpath="//*[@id=\"menu-item-15\"]/a")
	
	@FindBy(how=How.LINK_TEXT,using="Home")
	private static WebElement lnk_Home;
	
	@FindBy(how=How.LINK_TEXT,using="Product Category")
	private static WebElement lnk_ProductCategory;
	
	@FindBy(how=How.LINK_TEXT,using="All Product")
	private static WebElement lnk_AllProduct;
	
	/**
	 * 
	 * @return My Account link element
	 */
	
	public static WebElement lnk_MyAccount() {
		System.out.println("driver = "+driver);
		System.out.println("lnk_MyAccount ="+lnk_MyAccount.toString());
		try {
			waitForElement(lnk_MyAccount);
			System.out.println(lnk_MyAccount);
			Log.info("My Account link is found on the Home Page");
		} catch (Exception e) {
			// TODO: handle exception
			Log.error("My Account link is not found on the Home Page");
		}
		return lnk_MyAccount;
	}
	
	
	
}
