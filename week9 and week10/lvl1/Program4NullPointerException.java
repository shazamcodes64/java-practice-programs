public class Program4NullPointerException {
    
    @SuppressWarnings("null")
    public static void generateNullPointerException() {
        String text = null;
        System.out.println("Attempting to call length() on null string...");
        int length = text.length();
        System.out.println("Length: " + length);
    }
    
    @SuppressWarnings("null")
    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println("Attempting to call length() on null string with exception handling...");
            int length = text.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("The string is null, cannot perform operations on it.");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("--- Demonstrating NullPointerException ---\n");
        
        System.out.println("1. Generating NullPointerException:");
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateNullPointerException()");
        }
        
        System.out.println("\n2. Handling NullPointerException:");
        handleNullPointerException();
        
        System.out.println("\nProgram completed successfully!");
    }
}
