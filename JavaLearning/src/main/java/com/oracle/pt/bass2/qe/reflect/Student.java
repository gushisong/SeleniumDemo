package com.oracle.pt.bass2.qe.reflect;

public class Student {
	
	public String name;
	protected int age;
	char sex;
	private String phoneNum;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", phoneNum=" + phoneNum + "]";

	}

	Student(String str){
		System.out.println("(Ĭ��)�Ĺ��췽�� s = " + str);
	}
	

	public Student(){
		System.out.println("====Constructor with no parmeter==");
	}
	

	public Student(char name){
		System.out.println("������" + name);
	}
	
	//
	public Student(String name ,int age){
		System.out.println("������"+name+"���䣺"+ age);//���ִ��Ч�������⣬�Ժ�����
	}
	
	//
	protected Student(boolean n){
		System.out.println("�ܱ����Ĺ��췽�� n = " + n);
	}
	
	//
	private Student(int age){
		System.out.println("˽�еĹ��췽��   ���䣺"+ age);
	}


	public String show1(String s){
		System.out.println("Input String for method show1(): s = " + s);
		return s;
	}
	protected void show2(){
		System.out.println("�����ˣ��ܱ����ģ��޲ε�show2()");
	}
	void show3(){
		System.out.println("�����ˣ�Ĭ�ϵģ��޲ε�show3()");
	}
	private String show4(int age){
		System.out.println("�����ˣ�˽�еģ������з���ֵ�ģ�int������show4(): age = " + age);
		return "abcd";
	}
	public static void main(String[] args) {
		System.out.println("main����ִ����.............................");
	}

}
