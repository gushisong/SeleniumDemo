package com.peoplesoft.pt.automation.utils;


import org.snipecode.reg.RegUtil;

public class Registry {
	
	public static final String UNINSTALL_64BIT="HKEY_LOCAL_MACHINE\\SOFTWARE\\Wow6432Node\\Microsoft\\Windows\\CurrentVersion\\Uninstall\\";;
	public static final String UNINSTALL_32BIT="HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Uninstall\\";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
	}
	
	public static String readFromFile(String file,String regFol,String regVal) {
		return "";
	}
	
	public static String getUnInstallPath() {
		
		if(OS.is64bit()) {
			return UNINSTALL_64BIT;
		}else {
			return UNINSTALL_32BIT;
		}
		
		
	}
	
	public static String getValue(int rootKey,String parentKey,String subKey) {
		int[] ret;
		ret=RegUtil.RegOpenKey(rootKey, parentKey, RegUtil.KEY_QUERY_VALUE);
		int handle=ret[RegUtil.NATIVE_HANDLE];
		
		byte[] values=RegUtil.RegQueryValueEx(handle, subKey);
		RegUtil.RegCloseKey(handle);
		String value="";
		
		if(values!=null) {
			value =new String(values).trim();
		}
		return value;
		
	}

}
