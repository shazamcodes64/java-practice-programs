import java.util.Scanner;

public class Program4ShortestLongest {
    
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
    
    public static int[] findShortestAndLongest(String[][] wordsWithLengths) {
        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLength = Integer.parseInt(wordsWithLengths[0][1]);
        int longestLength = Integer.parseInt(wordsWithLengths[0][1]);
        
        for (int i = 1; i < wordsWithLengths.length; i++) {
            int currentLength = Integer.parseInt(wordsWithLengths[i][1]);
            
            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }
            
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }
        
        return new int[]{shortestIndex, longestIndex};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        
        String[] words = splitTextIntoWords(text);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        int[] indexes = findShortestAndLongest(wordsWithLengths);
        
        System.out.println("\n--- Shortest and Longest Words ---");
        System.out.println("Shortest word: " + wordsWithLengths[indexes[0]][0] + 
                         " (Length: " + wordsWithLengths[indexes[0]][1] + ")");
        System.out.println("Longest word: " + wordsWithLengths[indexes[1]][0] + 
                         " (Length: " + wordsWithLengths[indexes[1]][1] + ")");
        
        scanner.close();
    }
}
