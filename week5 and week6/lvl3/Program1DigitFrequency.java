import java.util.Scanner;

public class Program1DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int temp = Math.abs(number);
        int count = 0;
        
        if (temp == 0) {
            count = 1;
        } else {
            int tempCount = temp;
            while (tempCount != 0) {
                tempCount = tempCount / 10;
                count++;
            }
        }
        
        int[] digits = new int[count];
        temp = Math.abs(number);
        
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        
        int[] frequency = new int[10];
        
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }
        
        System.out.println("\nFrequency of each digit in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }
        
        scanner.close();
    }
}
