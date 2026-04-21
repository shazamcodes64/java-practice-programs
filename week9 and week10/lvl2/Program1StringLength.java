import java.util.Scanner;

public class Program1StringLength {
    
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
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        int userDefinedLength = findLengthWithoutBuiltIn(text);
        int builtInLength = text.length();
        
        System.out.println("\n--- String Length Results ---");
        System.out.println("Length using user-defined method: " + userDefinedLength);
        System.out.println("Length using built-in length(): " + builtInLength);
        System.out.println("Both results are same: " + (userDefinedLength == builtInLength));
        
        scanner.close();
    }
}
