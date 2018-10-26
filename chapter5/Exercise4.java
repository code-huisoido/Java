class Test {
	Test() {
		System.out.println("Making a new object");
	}
	Test(String s) {
		System.out.println("Making a new object" + s);	
	}
}

class Exercise4 {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test("!");
	}
}	