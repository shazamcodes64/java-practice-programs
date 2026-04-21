import java.util.Scanner;

public class Program4ArraySumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        
        System.out.println("Enter up to 10 numbers (enter 0 or negative to stop):");
        
        while (true) {
            System.out.print("Number " + (index + 1) + ": ");
            double number = scanner.nextDouble();
            
            if (number <= 0 || index == 10) {
                break;
            }
            
            numbers[index] = number;
            index++;
        }
        
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        
        System.out.println("\nSum of all numbers: " + total);
        
        scanner.close();
    }
}
