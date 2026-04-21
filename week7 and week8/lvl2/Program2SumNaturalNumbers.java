import java.util.Scanner;

public class Program2SumNaturalNumbers {
    
    public static int sumUsingRecursion(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }
    
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number");
        } else {
            int sumRecursion = sumUsingRecursion(number);
            int sumFormula = sumUsingFormula(number);
            
            System.out.println("Sum using recursion: " + sumRecursion);
            System.out.println("Sum using formula: " + sumFormula);
            
            if (sumRecursion == sumFormula) {
                System.out.println("Both results are correct and equal!");
            }
        }
        
        scanner.close();
    }
}
