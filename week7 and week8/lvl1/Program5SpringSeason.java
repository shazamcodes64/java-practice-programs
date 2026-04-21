public class Program5SpringSeason {
    
    public static boolean isSpring(int month, int day) {
        if (month < 3 || month > 6) {
            return false;
        }
        
        if (month == 3 && day < 20) {
            return false;
        }
        
        if (month == 6 && day > 20) {
            return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments");
            System.out.println("Usage: java Program5SpringSeason <month> <day>");
            return;
        }
        
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        
        if (isSpring(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
