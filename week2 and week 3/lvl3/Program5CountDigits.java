import java.util.Scanner;

public class Program5CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int count = 0;
        int temp = Math.abs(number);
        
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
        }
        
        System.out.println("Number of digits in " + number + " is " + count);
        
        scanner.close();
    }
}
