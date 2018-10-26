package practice;

public class Test6 {
	public int storage(String s) {
		return s.length() * 2;
	}

	public static void main(String[] args){
		String s1 = "hello";
        Test6 obj = new Test6();
        System.out.println(obj.storage(s1));
	}
}