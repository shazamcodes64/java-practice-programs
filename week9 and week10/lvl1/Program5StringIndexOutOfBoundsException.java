import java.util.Scanner;

public class Program5StringIndexOutOfBoundsException {
    
    public static void generateStringIndexOutOfBoundsException(String text) {
        System.out.println("Attempting to access index beyond string length...");
        int index = text.length() + 5;
        char ch = text.charAt(index);
        System.out.println("Character at index " + index + ": " + ch);
    }
    
    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            System.out.println("Attempting to access index beyond string length with exception handling...");
            int index = text.length() + 5;
            char ch = text.charAt(index);
            System.out.println("Character at index " + index + ": " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("The index is out of bounds for the string.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        System.out.println("\n--- Demonstrating StringIndexOutOfBoundsException ---\n");
        
        System.out.println("1. Generating StringIndexOutOfBoundsException:");
        try {
            generateStringIndexOutOfBoundsException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateStringIndexOutOfBoundsException()");
        }
        
        System.out.println("\n2. Handling StringIndexOutOfBoundsException:");
        handleStringIndexOutOfBoundsException(text);
        
        System.out.println("\nProgram completed successfully!");
        
        scanner.close();
    }
}
