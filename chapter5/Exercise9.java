public class Exercise9 {
	Exercise9(String s) {
		this(1);
		System.out.println("s = " + s);
	}

	Exercise9(int i) {
		System.out.println("i = " + i);
	}

	public static void main(String[] args) {
		Exercise9 obj = new Exercise9("hi");
	}
}