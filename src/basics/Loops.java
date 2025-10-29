package basics;

/**
 * Demonstrates different types of loops in Java.
 */
public class Loops {
    public static void main(String[] args) {
        // For loop
        System.out.println("For Loop - Numbers 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        
        // While loop
        System.out.println("\nWhile Loop - Countdown from 5:");
        int count = 5;
        while (count > 0) {
            System.out.println(count);
            count--;
        }
        
        // Do-while loop
        System.out.println("\nDo-While Loop - Numbers 1 to 3:");
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 3);
        
        // For loop with array
        System.out.println("\nFor Loop - Array of numbers:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        
        // Enhanced for loop (for-each)
        System.out.println("\nEnhanced For Loop - Array of strings:");
        String[] fruits = {"Apple", "Banana", "Orange"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
