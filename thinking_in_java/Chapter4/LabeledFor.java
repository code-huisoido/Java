package com.dinghui.practice.Chapter4;

import static net.mindview.util.Print.*;

public class LabeledFor {
	public static void main(String[] args) {
		int i = 0;
		outer:
		for (; true ;) {
			inner:
			for(; i < 10; i++) {
				print("i = " + i);
				if (i == 2) {
					print("continue");
					continue;
				}
				if (i == 3) {
					print("break");
					i++;
					break;
				}
				if (i == 7) {
					print("continue outer");
					i++;
					continue outer;
				}
				if (i == 8) {
					print("break inner");
					continue inner;
				}
			}
		}
	}
}