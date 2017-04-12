class Dog {
	void bark(int i) {
		System.out.println("barking");
	}

	void bark(String s) {
		System.out.println("howling");
	}
}

public class Exercise5 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.bark(1);
		d1.bark("2");
	}
}