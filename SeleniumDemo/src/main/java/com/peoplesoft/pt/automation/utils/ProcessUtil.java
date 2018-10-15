package com.peoplesoft.pt.automation.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class ProcessUtil {

	/**
	 * Check the process whether exists.
	 * @param processName
	 * @return if return ture. the process exist
	 * 			if return false. the process doesn't exit
	 */
	public static boolean isExists(String processName) {
		boolean isExists = false;

		String command = "tasklist /v /fi \"imagename eq " + processName + ".exe\"";
		Runtime runtime = null;
		Process process = null;

		try {
			runtime = Runtime.getRuntime();
			process = runtime.exec(command);
			BufferedReader bReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String str = "";
			StringBuffer buf = new StringBuffer();
			while ((str = bReader.readLine()) != null) {
				if (str != " " || str.length() != 0) {
					buf.append(str);
				}
			}
			bReader.close();
			System.out.println(buf.toString());
			isExists = buf.toString().contains(processName + ".exe");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return isExists;

	}

	public static void killProcess(String processName) {
		Runtime runtime=Runtime.getRuntime();
		Process process=null;
		String command="taskkill /f /im "+processName+".exe";
		try {
			process=runtime.exec(command);
			process.waitFor();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String process ="notepad";
		System.out.println(isExists(process));
		killProcess(process);

	}

}
