import java.util.Scanner;

public class Program3TriangularParkRounds {
    
    public static int calculateRounds(double side1, double side2, double side3, double distance) {
        double perimeter = side1 + side2 + side3;
        int rounds = (int) Math.ceil(distance / perimeter);
        return rounds;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the three sides of the triangular park (in meters):");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();
        
        double distance = 5000;
        
        int rounds = calculateRounds(side1, side2, side3, distance);
        
        System.out.println("The athlete must complete " + rounds + " rounds to finish 5 km run.");
        
        scanner.close();
    }
}
