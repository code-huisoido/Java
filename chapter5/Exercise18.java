public class Exercise17 {
    Exercise17(String s) {
        System.out.println("constructor s=" + s);
    }

    public static void main(String[] args) {
        Exercise17[] test = new Exercise17[5];
        for(int i = 0; i < test.length; i++) {
            test[i] = new Exercise17("i" + i);
        }
    }
}