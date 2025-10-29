package exercises;

/**
 * Practice Exercise: String Manipulation
 * Various string operations and methods.
 */
public class StringManipulation {
    
    public static void main(String[] args) {
        String text = "Java Programming";
        
        // String length
        System.out.println("Original String: " + text);
        System.out.println("Length: " + text.length());
        
        // Case conversion
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        
        // Substring
        System.out.println("Substring (0, 4): " + text.substring(0, 4));
        
        // Character at position
        System.out.println("Character at position 5: " + text.charAt(5));
        
        // Contains
        System.out.println("Contains 'Java': " + text.contains("Java"));
        System.out.println("Contains 'Python': " + text.contains("Python"));
        
        // Replace
        System.out.println("Replace 'Java' with 'Python': " + text.replace("Java", "Python"));
        
        // Split
        String[] words = text.split(" ");
        System.out.println("\nWords in the string:");
        for (String word : words) {
            System.out.println("- " + word);
        }
        
        // Concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("\nFull Name: " + fullName);
        
        // String comparison
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";
        
        System.out.println("\nString Comparison:");
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equals str3: " + str1.equals(str3));
    }
}
