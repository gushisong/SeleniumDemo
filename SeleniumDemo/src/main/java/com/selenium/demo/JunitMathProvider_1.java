package com.selenium.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitMathProvider_1 {
	
	MathProvider mathProvider;
	
	public JunitMathProvider_1()
	{
		mathProvider=new MathProvider();
	}
	
	@Test
	public void add() {
		System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
		int firstNumber = 10;
		int secondNumber = 20;
		assertEquals(firstNumber+secondNumber, mathProvider.Add(firstNumber, secondNumber));
		System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	

	}

}
