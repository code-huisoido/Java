package com.dinghui.practice.Chapter4;

public class Exercise6 {
	static boolean test(int testval, int begin, int end) {
		boolean result = false;
		if (testval >= begin && testval <= end) {
			result = true;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(test(5, 2, 10));
		System.out.println(test(5, 6, 10));
		System.out.println(test(5, 3, 4));
	}
}