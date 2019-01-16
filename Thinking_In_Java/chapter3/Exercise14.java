package com.dinghui.practice.chapter3;

import static net.mindview.util.Print.*;

public class Exercise14 {
	static void compare(String s1, String s2){
		print(s1 + " == " + s2 + ": " + (s1 == s2));
		print(s1 + " != " + s2 + ": " + (s1 !=s2));
		print(s1 + " equals " + s2 + ": " + (s1.equals(s2)));
	}

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		compare(s1, s2);
		s1 = "1";
		s2 = "2";
		compare(s1, s2);
		s1 = "same";
		s2 = "same";
		compare(s1, s2);
	}
}