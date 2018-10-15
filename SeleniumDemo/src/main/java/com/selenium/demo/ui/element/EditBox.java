package com.selenium.demo.ui.element;

public interface EditBox extends Element{
	int setFocus();
	
	int appendText(String data);
	
	int copyText(int start);
	
	int copyText(int start,int end);
	
	int deleteText(int start);
	
	int deleteText(int start,int end);
	
	int setText(String data);
	
	int len();
	
	int getCursorPosition();
	
	String getText();

}
