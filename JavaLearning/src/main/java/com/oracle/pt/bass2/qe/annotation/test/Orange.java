package com.oracle.pt.bass2.qe.annotation.test;

import com.oracle.pt.bass2.qe.annotation.defination.Color;
import com.oracle.pt.bass2.qe.annotation.defination.FruitColor;
import com.oracle.pt.bass2.qe.annotation.defination.FruitProvider;
import com.oracle.pt.bass2.qe.annotation.defination.FruiteName;

public class Orange {

	public Orange() {
		// TODO Auto-generated constructor stub
	}
	@FruiteName("Orange")
	private String orangeName;
	@FruitColor(fruitColor=Color.Red)
	private String orangeColor;
	@FruitProvider(id=2,name="江西供应商",address="江西省")
	private String orangeProvider;

	public String getOrangeName() {
		return orangeName;
	}

	public void setOrangeName(String orangeName) {
		this.orangeName = orangeName;
	}

	public String getOrangeColor() {
		return orangeColor;
	}

	public void setOrangeColor(String orangeColor) {
		this.orangeColor = orangeColor;
	}

	public String getOrangeProvider() {
		return orangeProvider;
	}

	public void setOrangeProvider(String orangeProvider) {
		this.orangeProvider = orangeProvider;
	}
	

}
