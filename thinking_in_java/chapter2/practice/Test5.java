package com.dinghui.practice.chapter2.practice;

public class Test5 {
	int i;
	double d;
	boolean b;
	public void printAll(){
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Test5 obj = new Test5();
		obj.i = 10;
		obj.d = 10.10;
		obj.b = true;
		obj.printAll();
	}
}