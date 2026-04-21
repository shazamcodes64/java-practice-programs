import java.util.Scanner;

public class Program4FrequencyUsingUnique {
    
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
        
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempResult[i];
        }
        
        return uniqueChars;
    }
    
    public static String[][] findCharacterFrequencyUsingUnique(String text) {
        int length = findLengthWithoutBuiltIn(text);
        int[] frequency = new int[256];
        
        // Find frequency of each character
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }
        
        // Get unique characters
        char[] uniqueChars = findUniqueCharacters(text);
        
        // Store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        String[][] charFrequency = findCharacterFrequencyUsingUnique(text);
        
        System.out.println("\n--- Character Frequency Using Unique Characters ---");
        System.out.println("Character\tFrequency");
        System.out.println("-------------------------");
        for (String[] pair : charFrequency) {
            System.out.println(pair[0] + "\t\t" + pair[1]);
        }
        
        scanner.close();
    }
}
