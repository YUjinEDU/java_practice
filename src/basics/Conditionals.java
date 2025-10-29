package basics;

/**
 * Demonstrates control flow with if-else statements.
 */
public class Conditionals {
    public static void main(String[] args) {
        int number = 42;
        
        // Simple if-else
        System.out.println("Testing number: " + number);
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
        
        // Check even or odd
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        
        // Grade evaluation
        int score = 85;
        System.out.println("\nScore: " + score);
        
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("Grade: " + grade);
    }
}
