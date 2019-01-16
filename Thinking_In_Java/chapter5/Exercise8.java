package com.dinghui.practice.chapter5;

public class Exercise8 {
	void test1() {
		System.out.println("test1");
		test2();
		this.test2();
	}

	void test2() {
		System.out.println("test2");
	}

	public static void main(String[] args) {
		Exercise8 e1 = new Exercise8();
		e1.test1();
	}
}