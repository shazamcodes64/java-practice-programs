import java.util.Scanner;

public class Program5VowelsConsonants {
    
    public static String checkCharacter(char ch) {
        // Convert to lowercase if uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        
        // Check if it's a letter
        if ((ch >= 'a' && ch <= 'z')) {
            // Check if vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        
        return "Not a Letter";
    }
    
    @SuppressWarnings("unused")
    public static int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;
        
        int length = 0;
        try {
            while (true) {
                char ch = text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Length found
        }
        
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            String result = checkCharacter(ch);
            
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }
        
        return new int[]{vowelCount, consonantCount};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        int[] counts = countVowelsAndConsonants(text);
        
        System.out.println("\n--- Vowels and Consonants Count ---");
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
        
        scanner.close();
    }
}
