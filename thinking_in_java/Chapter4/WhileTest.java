package com.dinghui.practice.Chapter4;

public class WhileTest {
	static boolean condition() {
		boolean result = Math.random() < 0.99;
		System.out.println(result + ", ");
		return result;
	}

	public static void main(String[] args) {
		while(condition())
			System.out.println("Inside 'While'");
		System.out.println("Exited 'While");
	}	
}