package com.selenium.demo.appModules;

import com.selenium.demo.pageObjects.Home_Page;
import com.selenium.demo.pageObjects.Login_Page;
import com.selenium.demo.utility.Constants;

public class SignIn_Action {
	
	public static void Execute() {
		
		System.out.println("Home_Page.lnk_MyAccount()");
		Home_Page.lnk_MyAccount().click();
		
		Login_Page.txtbx_UserName().sendKeys(Constants.UserName);
		
		Login_Page.txtbx_Password().sendKeys(Constants.Pssword);
		
		Login_Page.btn_Login().click();
		
		
	}
	

}
