
public class App {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("--- Arithmetic Operations ---");
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (Remainder) (a % b): " + (a % b));

        
    }

    public int add(int x, int y) { return x + y; }
    public int subtract(int x, int y) { return x - y; }
    public int multiply(int x, int y) { return x * y; }
    public int divide(int x, int y) { return x / y; }
}
