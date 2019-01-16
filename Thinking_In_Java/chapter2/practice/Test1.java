package com.dinghui.practice.chapter2.practice;

public class Test1 {
	int i;
	char c;

	//构造函数，与类同名
    public Test1() {
    	System.out.println("i = " + i);
		System.out.println("c= [" + c + ']');
    }

	public static void main(String[] args) {	
		new Test1();
	}
}