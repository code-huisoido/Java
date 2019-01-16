package com.dinghui.practice.Chapter4;

import static net.mindview.util.Print.*;
import java.lang.Math.*;
/*
 * find prime
 */
public class Exercise4 {
	public static void main(String[] args) {
		int max = 100;
		if (args.length != 0) {
			max = Integer.parseInt(args[0]);	
		}
		boolean[] allPrime = new boolean[(max + 1)]; 
		if (max >= 1) {
			printnb("prime: " + 1);
		}
		if (max >= 2) {
			printnb(" " + 2);
		}
		if (max >= 3) {
			int limit = (int)Math.floor(Math.sqrt(max));
			for (int i = 3; i < limit; i += 2) {
				for (int j = i; i * j <= max; j++) {
					allPrime[(i*j)] = true;
				}
			}
			for (int i = 3; i <= max; i += 2) {
				if (!allPrime[i]) {
					printnb(" " + i);
				}
			}
		}
		print(" ");
	}
}