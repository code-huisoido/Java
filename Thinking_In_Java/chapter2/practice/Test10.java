package com.dinghui.practice.chapter2.practice;

public class Test10 {
	public static void main(String[] args) {
		if (args.length < 3) {
			System.err.println("Need 3 arguments");
			System.exit(1);
		}
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}
}