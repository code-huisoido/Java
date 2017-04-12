import static net.mindview.util.Print.*;

class FloatNum {
	float f;
}

public class Exercise3 {
	static void changeNum(FloatNum obj){
		obj.f = 3.3f;
	}

	public static void main(String[] args) {
		FloatNum f1 = new FloatNum();
		f1.f = 2.2f;
		print("1. f1.f: " + f1.f);
		changeNum(f1);
		print("2. f1.f: " + f1.f);
	}
}