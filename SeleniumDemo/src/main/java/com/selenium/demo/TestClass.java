package com.selenium.demo;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.math3.genetics.ChromosomePair;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.peoplesoft.pe.automation.definition.testcase.WebBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass  {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.sina.com.cn");
		driver.quit();
		
		FirefoxProfile profile=new FirefoxProfile();
		
		Map<String, Object> options=new HashMap<String,Object>();
		options.put("proxy", "myhttpproxy:80");
		
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.setCapability(key, value);
		
		
		
	}

}
