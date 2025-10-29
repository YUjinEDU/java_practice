package basics;

/**
 * Demonstrates basic variable types and operations in Java.
 */
public class Variables {
    public static void main(String[] args) {
        // Integer variables
        int age = 25;
        int year = 2025;
        
        // Floating point variables
        double price = 19.99;
        double temperature = 36.5;
        
        // Character and String variables
        char grade = 'A';
        String name = "Java Practice";
        
        // Boolean variables
        boolean isJavaFun = true;
        
        // Print all variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Grade: " + grade);
        System.out.println("Is Java fun? " + isJavaFun);
        
        // Basic arithmetic operations
        int sum = age + 5;
        int difference = year - age;
        double total = price * 2;
        
        System.out.println("\nArithmetic Operations:");
        System.out.println("Age + 5 = " + sum);
        System.out.println("Year - Age = " + difference);
        System.out.println("Price * 2 = $" + total);
    }
}
