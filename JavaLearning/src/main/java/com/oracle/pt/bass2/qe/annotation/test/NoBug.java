package com.oracle.pt.bass2.qe.annotation.test;

import com.oracle.pt.bass2.qe.annotation.defination.Jiecha;

public class NoBug {

	public NoBug() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Jiecha
	 public void suanShu(){
	        System.out.println("1234567890");
	    }
	@Jiecha
	 public void jiefa(){
	        System.out.println("1-1="+(1-1));
	    }
	@Jiecha
	 public void chengfa(){
	        System.out.println("3 x 5="+ 3*5);
	    }
	@Jiecha
	 public void chufa(){
	        System.out.println("6 / 0="+ 6 / 0);
	    }
	 
	@Jiecha
	 public void ziwojieshao(){
	        System.out.println("There is no bug for my code");
	    }
	@Jiecha
	public String toString(String str) {
		return str;
	}

}
