package practice;

public class Test8 {
	static int i = 10;

	public static int addNum() {
		i += 10;
		return i;
	}

	public static void main(String[] args) {
		Test8 obj1 = new Test8();
		Test8 obj2 = new Test8();
		System.out.println("origin: " + obj1.i);
		System.out.println("origin: " + obj2.i);
		obj1.addNum();
		System.out.println("after add 10: " + obj1.i);
		System.out.println("after add 10: " + obj2.i);
	}
}