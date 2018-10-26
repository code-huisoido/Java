package practice;

class StaticTest {
	static int i = 47;
}

class Test7 {
	static int increment() {
		return ++StaticTest.i;
	}

	public static void main(String[] args) {
		Test7 obj = new Test7();
		System.out.println(obj.increment());
		Test7.increment();
	}
}