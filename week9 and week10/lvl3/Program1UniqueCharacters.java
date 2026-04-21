import java.util.Scanner;

public class Program1UniqueCharacters {
    
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
    
    public static char[] findUniqueCharacters(String text) {
        int length = findLengthWithoutBuiltIn(text);
        char[] tempResult = new char[length];
        int uniqueCount = 0;
        
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            
            // Check if character already exists in previous characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                tempResult[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        
        // Create new array with exact size
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempResult[i];
        }
        
        return uniqueChars;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        char[] uniqueChars = findUniqueCharacters(text);
        
        System.out.println("\n--- Unique Characters ---");
        System.out.print("Unique characters: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println("Total unique characters: " + uniqueChars.length);
        
        scanner.close();
    }
}
