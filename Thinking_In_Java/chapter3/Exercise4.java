package com.dinghui.practice.chapter3;

import static net.mindview.util.Print.*;

class Exercise4 {
	public static void main(String[] args) {
		float speed, distance, wasteTime;
		distance = 100f;
		wasteTime = 2f;
		speed = distance / wasteTime;
		print("speed: " + speed + "km/h");
		distance = 33f;
		wasteTime = 2f;
		speed = distance / wasteTime;

		print("speed: " + speed + "km/h");
	}
}