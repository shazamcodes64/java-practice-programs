import java.util.Scanner;

public class Program5FrequencyNestedLoops {
    
    public static String[] findCharacterFrequencyNestedLoops(String text) {
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];
        
        // Find frequency using nested loops
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '0') {
                continue;
            }
            
            frequency[i] = 1;
            
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0'; // Mark as duplicate
                }
            }
        }
        
        // Count non-duplicate characters
        int uniqueCount = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }
        
        // Store characters and their frequencies
        String[] result = new String[uniqueCount * 2];
        int index = 0;
        
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index] = String.valueOf(characters[i]);
                result[index + 1] = String.valueOf(frequency[i]);
                index += 2;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        String[] charFrequency = findCharacterFrequencyNestedLoops(text);
        
        System.out.println("\n--- Character Frequency Using Nested Loops ---");
        System.out.println("Character\tFrequency");
        System.out.println("-------------------------");
        for (int i = 0; i < charFrequency.length; i += 2) {
            System.out.println(charFrequency[i] + "\t\t" + charFrequency[i + 1]);
        }
        
        scanner.close();
    }
}
