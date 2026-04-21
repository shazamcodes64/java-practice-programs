import java.util.Scanner;

public class Program4NumberCheckerPalindrome {
    
    public static int countDigits(int number) {
        int count = 0;
        int temp = Math.abs(number);
        if (temp == 0) return 1;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        return count;
    }
    
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int temp = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }
    
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigitsArray(digits);
        return compareArrays(digits, reversed);
    }
    
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int[] digits = storeDigits(number);
        int[] reversed = reverseDigitsArray(digits);
        
        System.out.println("\n--- Number Checker Palindrome Results ---");
        System.out.println("Number of digits: " + countDigits(number));
        System.out.println("Is Palindrome: " + isPalindrome(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Arrays are equal: " + compareArrays(digits, reversed));
        
        scanner.close();
    }
}
