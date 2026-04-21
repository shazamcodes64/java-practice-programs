import java.util.Scanner;

public class Program3CharacterFrequency {
    
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
    
    public static String[][] findCharacterFrequency(String text) {
        int length = findLengthWithoutBuiltIn(text);
        int[] frequency = new int[256];
        
        // Find frequency of each character
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }
        
        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (frequency[ch] > 0) {
                uniqueCount++;
                frequency[ch] = -frequency[ch]; // Mark as counted
            }
        }
        
        // Reset frequency array
        for (int i = 0; i < 256; i++) {
            if (frequency[i] < 0) {
                frequency[i] = -frequency[i];
            }
        }
        
        // Store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (frequency[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);
                frequency[ch] = 0; // Mark as stored
                index++;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        String[][] charFrequency = findCharacterFrequency(text);
        
        System.out.println("\n--- Character Frequency ---");
        System.out.println("Character\tFrequency");
        System.out.println("-------------------------");
        for (String[] pair : charFrequency) {
            System.out.println(pair[0] + "\t\t" + pair[1]);
        }
        
        scanner.close();
    }
}
