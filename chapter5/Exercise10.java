public class Exercise10 {
    protected void finalize() {
        System.out.println("finalize() called");
    }

    public static void main(String[] args) {
        new Exercise10();
    }
}