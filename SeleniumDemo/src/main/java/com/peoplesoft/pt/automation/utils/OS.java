package com.peoplesoft.pt.automation.utils;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.InputStream;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.net.InetAddress;

import org.snipecode.reg.RegUtil;

public class OS {
	static OperatingSystemMXBean operatingSystemMXBean=(OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
	public static String sysinfo;
	
	public static boolean is64bit() {
		boolean is64bit=false;
		
		if(System.getProperty("os.name").contains("Windows")) {
			
			is64bit = System.getenv("ProgramFiles(x86)") != null;
		}else {
			is64bit = System.getProperty("os.arch").indexOf("64") != -1; 
		}
		
		return is64bit;
	}
	
	public static String getMachineName() {
		try {
			InetAddress sAddress=InetAddress.getLocalHost();
			return sAddress.getHostName();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "";
		}
	}
	
	public static String getScreenResolution() {
		Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
		int width=dimension.width;
		int height=dimension.height;
		String screenresolution=width+" X "+height+ " pixels";
		return screenresolution;
	}
	
	public static String getIEVersion() {
		
		return Registry.getValue(RegUtil.HKEY_LOCAL_MACHINE, "SOFTWARE\\Microsoft\\Internet Explorer", "Version");
		
	}
	
	public static String getOSFullName() {
		return System.getProperty("os.name");
	}
	
	public static String getOSLanguageCode() {
		return System.getProperty("user.language");
	}
	
	public static String getOSVersion() {
		return System.getProperty("os.version");
		
	}
	
	public static String getCommandResult(String strCommand) {

		try {
			Process process=Runtime.getRuntime().exec(strCommand);
			InputStream inputStream=process.getInputStream();
			StringBuilder stringBuilder=new StringBuilder();
			int cByte;
			while((cByte=inputStream.read())!=-1) {
				stringBuilder.append((char)cByte);
			}
			return stringBuilder.toString();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "";
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(operatingSystemMXBean);;
		
		System.out.println(System.getenv("ProgramFiles"));
		System.out.println(System.getProperty("os.arch"));
		System.out.println(getScreenResolution());
		System.out.println(getIEVersion());
		System.out.println(getCommandResult("wmic cpu get ProcessorType,Revision"));
//		System.out.println(System.get);
	}
	

}
	