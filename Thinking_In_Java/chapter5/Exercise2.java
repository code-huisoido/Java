package com.dinghui.practice.chapter5;

class Test1 {
	String s1 = "hello";
	String s2;
	Test1(String arg1) {
		s2 = arg1;
	}
}

public class Exercise2 {
	public static void main(String[] args) {
		Test1 t1 = new Test1("Hello");
		System.out.println("t1.s1 = " + t1.s1);
		System.out.println("t1.s2 = " + t1.s2);
	}
}