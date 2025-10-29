package exercises;

/**
 * Practice Exercise: Array Operations
 * Common array manipulations and algorithms.
 */
public class ArrayOperations {
    
    /**
     * Finds the maximum value in an array.
     */
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    /**
     * Finds the minimum value in an array.
     */
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    /**
     * Calculates the sum of all elements in an array.
     */
    public static int calculateSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    /**
     * Calculates the average of all elements in an array.
     */
    public static double calculateAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return (double) calculateSum(arr) / arr.length;
    }
    
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 34, 89, 23, 56};
        
        System.out.println("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("\nArray Operations:");
        System.out.println("Maximum value: " + findMax(numbers));
        System.out.println("Minimum value: " + findMin(numbers));
        System.out.println("Sum: " + calculateSum(numbers));
        System.out.println("Average: " + calculateAverage(numbers));
    }
}
