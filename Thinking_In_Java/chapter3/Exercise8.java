package com.dinghui.practice.chapter3;

import static net.mindview.util.Print.*;

public class Exercise8 {
	public static void main(String[] args) {
		Long l1 = 0x8fffL;
		Long l2 = 0x22L;
		Long l3 = 041L;
		Long l4 = 077L;
		print("l1:" + Long.toBinaryString(l1));
		print("l2:" + Long.toBinaryString(l2));
		print("l3:" + Long.toBinaryString(l3));
		print("l4:" + Long.toBinaryString(l4));
	}
}