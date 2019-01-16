package com.dinghui.practice.Chapter4;

public class ForEachString {
	public static void main(String[] args) {
		String test = "A good heart is better than all the brains in the world.";
		for (char c : test.toCharArray()) {
			System.out.print(c + " ");
		}
	}
}