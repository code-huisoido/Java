package com.dinghui.practice.chapter3;

import static net.mindview.util.Print.*;

public class StringOperators {
	public static void main(String[] args) {
		int x = 0, y = 1, z = 2;
		String s = "x, y, z ";
		print(s + x + y + z);
		print(x + " " + s);
		s += "(summed) = ";
		print(s + (x + y + z));
		print("" + x);
	}
}