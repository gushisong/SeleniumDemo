package com.selenium.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;

import com.selenium.demo.utility.Utils;



public class TestCase1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		String srcFile="C:\\Temp\\a.txt";
//		String destFile="C:\\Temp\\b.txt";
//		String srcDir="C:\\Temp";
//		String destDir="C:\\Temp1";
//		String commandline="tasklist";
//		
//		WebDriver driver=null;
////		
////		String browserName="Chrome";
////		driver=Utils.openBrowser(browserName);
//		
//		FileUtils.copyFile(new File(srcFile), new File(destFile));
//		//FileUtils.copyDirectory(new File(srcDir), new File(destDir));
//		System.out.println(FilenameUtils.equals(srcFile, destFile));
//		System.out.println(FilenameUtils.getBaseName(srcFile));
//		System.out.println(FilenameUtils.getExtension(srcFile));
//		
//		CommandLine comLine=CommandLine.parse(commandline);
//		DefaultExecutor executor=new DefaultExecutor();
//		//executor.setExitValue(0);
//		ExecuteWatchdog watchdog=new ExecuteWatchdog(60000);
//		executor.setWatchdog(watchdog);
//		int exitValue = executor.execute(comLine);
//		System.out.println(exitValue);
		PropertiesConfiguration propertiesConfiguration = new PropertiesConfiguration();
		DOMConfigurator.configure("log4j.xml");
		
		WebDriver driver=null;
		driver=Utils.openBrowser("Chrome");
		System.out.println(driver);
		
		Utils.takeScreenshot(driver, TestCase1.class.toString());
	}

}
