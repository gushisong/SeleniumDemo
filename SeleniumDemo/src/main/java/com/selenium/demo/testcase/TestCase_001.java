package com.selenium.demo.testcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.selenium.demo.appModules.SignIn_Action;
import com.selenium.demo.pageObjects.BaseClass;
import com.selenium.demo.utility.Utils;

public class TestCase_001 {
	
	private static WebDriver driver=null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver=Utils.openBrowser("Chrome");
		new BaseClass(driver);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		SignIn_Action.Execute();
	}

}
