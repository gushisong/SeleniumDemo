package com.selenium.demo.utility;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

	public static WebDriver driver = null;

	/**
	 * Lunch browser
	 * 
	 * @param browserName
	 * @return
	 */

	public static WebDriver openBrowser(String browserName) {

		if (browserName.equals("Chrome")) {
			try {
				System.setProperty("webdriver.chrome.driver", "F:\\java_lib\\BrowserDrivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get(Constants.URL);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		return driver;
	}

	public static void takeScreenshot(WebDriver driver, String sTestCaseName) {

		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(Constants.Path_ScreenShot + sTestCaseName + ".jpg"));
		} catch (Exception e) {
			// TODO: handle exception
			Log.error("Class Utils | Method taksScreenshot | Expection occured while capturing Screenshot:"+e.getMessage());
			try {
				throw new Exception();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}
}
