import java.util.Scanner;

public class Program5UnitConverterExtended {
    
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
    
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Extended Unit Converter");
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");
        System.out.print("Choose conversion: ");
        int choice = scanner.nextInt();
        
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();
        
        double result = 0;
        switch (choice) {
            case 1:
                result = convertYardsToFeet(value);
                System.out.println(value + " yards = " + result + " feet");
                break;
            case 2:
                result = convertFeetToYards(value);
                System.out.println(value + " feet = " + result + " yards");
                break;
            case 3:
                result = convertMetersToInches(value);
                System.out.println(value + " meters = " + result + " inches");
                break;
            case 4:
                result = convertInchesToMeters(value);
                System.out.println(value + " inches = " + result + " meters");
                break;
            case 5:
                result = convertInchesToCm(value);
                System.out.println(value + " inches = " + result + " cm");
                break;
            default:
                System.out.println("Invalid choice");
        }
        
        scanner.close();
    }
}
