package com.dinghui.practice.chapter3;

import static net.mindview.util.Print.*;

class Exercise10 {
	public static void main(String[] args) {
		int num1 = 0x01;
		int num2 = 0x10;
		print("num1: " + Integer.toBinaryString(num1));
		print("num2: " + Integer.toBinaryString(num2));
		print("num1&num2: " + Integer.toBinaryString(num1&num2));
		print("num1|num2: " + Integer.toBinaryString(num1|num2));
		print("num1^num2: " + Integer.toBinaryString(num1^num2));
		print("num1&=num2: " + Integer.toBinaryString(num1&=num2));
		print("num1|=num2: " + Integer.toBinaryString(num1|=num2));
		print("num1^=num2: " + Integer.toBinaryString(num1^=num2));
		print("~num1: " + Integer.toBinaryString(~num1));
		print("~num2: " + Integer.toBinaryString(~num2));
	}
}