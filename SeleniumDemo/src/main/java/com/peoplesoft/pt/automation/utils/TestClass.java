package com.peoplesoft.pt.automation.utils;

import java.io.File;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path="F:\\Temp\\fghr015.sqr";
		
		System.out.println(new FileUtil().getCreateDate(path));
		
		String imageFileA="F:\\Temp\\pic1.PNG";
		String imageFileB="F:\\Temp\\pic2.PNG";
		
		System.out.println(new FileUtil().compareImage(new File(imageFileA),new File(imageFileB)));
		System.out.println(System.getProperty("line.separator"));
		System.out.println(System.getProperty("user.dir"));

		System.out.println(new FileUtil().getContent(new File(path)));
		System.out.println(new FileUtil().getFIleMD5(path));
	}



}
