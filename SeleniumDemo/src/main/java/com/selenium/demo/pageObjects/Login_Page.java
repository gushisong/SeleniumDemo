package com.selenium.demo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selenium.demo.utility.Log;
import com.selenium.demo.utility.Utils;

public class Login_Page extends BaseClass {



	public Login_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private static WebElement element = null;

	/* define element */
	@FindBy(how = How.ID, id = "log")
	private static WebElement txtbx_UserName;
	@FindBy(how = How.ID, id = "pwd")
	private static WebElement txtbx_Password;
	@FindBy(how = How.ID, id = "login")
	private static WebElement btn_Login;
	
	static {
		PageFactory.initElements(driver, Login_Page.class);
	}
	
	public static WebElement txtbx_UserName() {
		try {
			waitForElement(txtbx_UserName);
			Log.info("UserName input text box is found on the Login Page");

		} catch (Exception e) {
			// TODO: handle exception
			Log.error("UserName input text box is found on the Login Page");
		}

		return txtbx_UserName;

	}
	
	public static WebElement txtbx_Password() {
		try {
			waitForElement(txtbx_Password);
			Log.info("Password input text box is found on the Login Page");
		} catch (Exception e) {
			// TODO: handle exception
			Log.error("Password input text box is not found on the Login Page");
		}
		return txtbx_Password;
		
	}
	
	public static WebElement btn_Login() {
		try {
			waitForElement(btn_Login);
			Log.info("Login button text box is found on the Login Page");
		} catch (Exception e) {
			// TODO: handle exception
			Log.info("Login button text box is not found on the Login Page");
		}
		return btn_Login;
	}

}
