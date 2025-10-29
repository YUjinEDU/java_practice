package exercises;

/**
 * Practice Exercise: Calculator
 * Implement basic arithmetic operations.
 */
public class Calculator {
    
    /**
     * Adds two numbers.
     */
    public static int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Subtracts two numbers.
     */
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    /**
     * Multiplies two numbers.
     */
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    /**
     * Divides two numbers.
     */
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return (double) a / b;
    }
    
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        
        System.out.println("Calculator Operations:");
        System.out.println(x + " + " + y + " = " + add(x, y));
        System.out.println(x + " - " + y + " = " + subtract(x, y));
        System.out.println(x + " * " + y + " = " + multiply(x, y));
        System.out.println(x + " / " + y + " = " + divide(x, y));
        
        // Test division by zero
        System.out.println("\nTesting division by zero:");
        System.out.println(x + " / 0 = " + divide(x, 0));
    }
}
