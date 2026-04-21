import java.util.Scanner;

public class Program2NumberChecker {
    
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
    
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == Math.abs(number);
    }
    
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }
    
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int[] digits = storeDigits(number);
        
        System.out.println("\n--- Number Checker Results ---");
        System.out.println("Number of digits: " + countDigits(number));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number, digits));
        
        int[] largestPair = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestPair[0]);
        System.out.println("Second largest digit: " + largestPair[1]);
        
        int[] smallestPair = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestPair[0]);
        System.out.println("Second smallest digit: " + smallestPair[1]);
        
        scanner.close();
    }
}
