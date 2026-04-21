import java.util.Scanner;

public class Program2SplitText {
    
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
    
    public static String[] splitTextIntoWords(String text) {
        int length = findLengthWithoutBuiltIn(text);
        
        // Count number of words
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        
        // Store space indexes
        int[] spaceIndexes = new int[wordCount + 1];
        spaceIndexes[0] = -1;
        int spaceCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceCount] = i;
                spaceCount++;
            }
        }
        if (spaceCount < wordCount + 1) {
            spaceIndexes[spaceCount] = length;
        }
        
        // Extract words
        String[] words = new String[wordCount];
        int wordIndex = 0;
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            int start = spaceIndexes[i] + 1;
            int end = (i + 1 < spaceIndexes.length && spaceIndexes[i + 1] != 0) ? 
                      spaceIndexes[i + 1] : length;
            
            for (int j = start; j < end && j < length; j++) {
                if (text.charAt(j) != ' ') {
                    word += text.charAt(j);
                }
            }
            if (word.length() > 0) {
                words[wordIndex++] = word;
            }
        }
        
        return words;
    }
    
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        
        String[] userDefinedWords = splitTextIntoWords(text);
        String[] builtInWords = text.split(" ");
        
        boolean areEqual = compareStringArrays(userDefinedWords, builtInWords);
        
        System.out.println("\n--- Split Text Results ---");
        System.out.print("User-defined split: ");
        for (String word : userDefinedWords) {
            System.out.print(word + " | ");
        }
        System.out.println();
        
        System.out.print("Built-in split(): ");
        for (String word : builtInWords) {
            System.out.print(word + " | ");
        }
        System.out.println();
        
        System.out.println("Both results are same: " + areEqual);
        
        scanner.close();
    }
}
