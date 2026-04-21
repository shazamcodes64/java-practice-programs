import java.util.Scanner;

public class Program3WordsWithLengths {
    
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
        
        String[] words = new String[wordCount];
        int wordIndex = 0;
        String currentWord = "";
        
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (currentWord.length() > 0) {
                    words[wordIndex++] = currentWord;
                    currentWord = "";
                }
            }
        }
        if (currentWord.length() > 0) {
            words[wordIndex] = currentWord;
        }
        
        return words;
    }
    
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLengthWithoutBuiltIn(words[i]));
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        
        String[] words = splitTextIntoWords(text);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        
        System.out.println("\n--- Words with Lengths ---");
        System.out.println("Word\t\tLength");
        System.out.println("------------------------");
        for (String[] wordData : wordsWithLengths) {
            System.out.println(wordData[0] + "\t\t" + Integer.parseInt(wordData[1]));
        }
        
        scanner.close();
    }
}
