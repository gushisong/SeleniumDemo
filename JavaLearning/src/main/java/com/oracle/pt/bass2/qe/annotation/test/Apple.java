package com.oracle.pt.bass2.qe.annotation.test;

import com.oracle.pt.bass2.qe.annotation.defination.Color;
import com.oracle.pt.bass2.qe.annotation.defination.FruitColor;
import com.oracle.pt.bass2.qe.annotation.defination.FruitProvider;
import com.oracle.pt.bass2.qe.annotation.defination.FruiteName;

public class Apple {

	public Apple() {
		// TODO Auto-generated constructor stub
	}
	
	@FruiteName("Apple")
	private String appleName;
	@FruitColor(fruitColor=Color.Green)
	private String appleColor;
	@FruitProvider(id=1,name="陕西红富士集团",address="陕西省西安市延安路89号红富士大厦")
	private String appleProvider;

	public String getAppleName() {
		return appleName;
	}

	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}

	public String getAppleColor() {
		return appleColor;
	}

	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}

	public String getAppleProvider() {
		return appleProvider;
	}

	public void setAppleProvider(String appleProvider) {
		this.appleProvider = appleProvider;
	}
	
	

}
