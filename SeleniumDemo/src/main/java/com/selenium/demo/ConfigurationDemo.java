package com.selenium.demo;

import java.io.File;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.configuration2.tree.DefaultExpressionEngine;
import org.apache.commons.configuration2.tree.DefaultExpressionEngineSymbols;

import bsh.This;


public class ConfigurationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(ConfigUtils.getStringValue("name"));
		ConfigUtils.writeProperty("test", "test1");
		ConfigUtils.setProperty("testa", "teste11");
		System.out.println(XMLConfigUtils.getStringValue("root.level"));

	}

}

class ConfigUtils {
	public static final String fileName="config.properties";
	
	public static Configuration cfg =null;
	public static FileBasedConfigurationBuilder<FileBasedConfiguration> builder=null;
	static {
//		Parameters params=new Parameters();
//		FileBasedConfigurationBuilder<FileBasedConfiguration> builder=
//				new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
//				.configure(params.properties()
//						.setFileName(fileName));
//		try {
//			cfg=builder.getConfiguration();
//		} catch (ConfigurationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		

		builder=new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
				.configure(new Parameters().properties().setFileName(fileName));
		
	
		
		//Configurations configurations=new Configurations();
		
		try {
			cfg=builder.getConfiguration();
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static String getStringValue(String key) {
		
		return cfg.getString(key);
		
	}
	
	public static void writeProperty(String key,String value) {
		cfg.addProperty(key, value);
		try {
			builder.save();
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void setProperty(String key,String value)  {
		cfg.setProperty(key, value);
		try {
			builder.save();
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	
}


class XMLConfigUtils{
	
	public static final String fileName="log4j.xml";
	

	public static XMLConfiguration config=null;
	
	static {
		
		Configurations configs=new Configurations();
		try {
			config=configs.xml(XMLConfigUtils.class.getClassLoader().getResource(fileName));
			DefaultExpressionEngine engine=new DefaultExpressionEngine(DefaultExpressionEngineSymbols.DEFAULT_SYMBOLS);
			config.setExpressionEngine(engine);
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static String getStringValue(String key) {
		
		return config.getString(key);
		
	}
}
