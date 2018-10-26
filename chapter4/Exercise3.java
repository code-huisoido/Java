import java.util.*;

public class Exercise3 {
	static Random rand = new Random();

	static void compare() {
		int r1 = rand.nextInt(10);
		int r2 = rand.nextInt(10);
		if (r1 > r2) {
			System.out.println(r1 + " > " + r2);
		} else if (r1 < r2) {
			System.out.println(r1 + " < " + r2);
		} else {
			System.out.println(r1 + " == " + r2);
		}
	}

	public static void main(String[] args) {
		while(true){
			compare();
		}
	}
}