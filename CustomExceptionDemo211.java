public class CustomExceptionDemo211 {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            int c = a / b;
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Cleanup complete");
        }
    }
}