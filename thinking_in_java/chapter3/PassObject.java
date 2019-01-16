package com.dinghui.practice.chapter3;

import static net.mindview.util.Print.*;

class Letter {
	char c;
}

public class PassObject {
	static void f(Letter y) {
		y.c = 'z';
	}

	public static void main(String[] args) {
		Letter X = new Letter();
		X.c = 'a';
		print("1: x.c: " + x.c);
		f(X);
		print("2: x.c: " + x.c);
	}
}