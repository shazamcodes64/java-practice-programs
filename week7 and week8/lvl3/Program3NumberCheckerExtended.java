import java.util.Scanner;

public class Program3NumberCheckerExtended {
    
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
    
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }
    
    public static int[][] findDigitFrequency(int[] digits) {
        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }
        
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) count++;
        }
        
        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i;
                result[index][1] = frequency[i];
                index++;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int[] digits = storeDigits(number);
        
        System.out.println("\n--- Number Checker Extended Results ---");
        System.out.println("Number of digits: " + countDigits(number));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));
        
        System.out.println("\nDigit Frequency:");
        int[][] frequency = findDigitFrequency(digits);
        for (int[] pair : frequency) {
            System.out.println("Digit " + pair[0] + ": " + pair[1] + " time(s)");
        }
        
        scanner.close();
    }
}
