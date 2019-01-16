package com.dinghui.practice.chapter3;

import static net.mindview.util.Print.*;

class Exercise2 {
	float f;

	public static void main(String[] args){
		Exercise2 e1 = new Exercise2();
		Exercise2 e2 = new Exercise2();
		e1.f = 1.1f;
		e2.f = 2.2f;
		print("1: e1.f: " + e1.f + ", e2.f: " + e2.f);
		e1 = e2;
		print("1: e1.f: " + e1.f + ", e2.f: " + e2.f);
		e1.f = 3.3f;
		print("1: e1.f: " + e1.f + ", e2.f: " + e2.f);
	}
}