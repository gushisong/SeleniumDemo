package com.oracle.pt.bass2.qe.annotation.test;

public class FruitRun {

	public FruitRun() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws Exception {
		
		Class class1=Class.forName(args[0]);

		FruitInfoUtil.getFruitInfo(class1);
	}

}
