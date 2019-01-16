package com.dinghui.practice.chapter5;

class Dog {
	void bark(int i, String s) {
		System.out.println("barking");
	}

	void bark(String s, int i) {
		System.out.println("howling");
	}
}

public class Exercise6 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.bark(1, "1");
		d1.bark("2", 2);
	}
}