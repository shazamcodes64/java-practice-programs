import java.util.Scanner;

public class Program2FirstNonRepeating {
    
    @SuppressWarnings("unused")
    public static int findLengthWithoutBuiltIn(String text) {
        int count = 0;
        try {
            while (true) {
                char ch = text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    
    public static char findFirstNonRepeatingCharacter(String text) {
        int length = findLengthWithoutBuiltIn(text);
        int[] frequency = new int[256];
        
        // Find frequency of each character
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }
        
        // Find first non-repeating character
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }
        
        return '\0'; // Return null character if no non-repeating character found
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        char result = findFirstNonRepeatingCharacter(text);
        
        System.out.println("\n--- First Non-Repeating Character ---");
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
        
        scanner.close();
    }
}
