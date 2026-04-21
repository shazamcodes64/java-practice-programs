import java.util.Random;

public class Program1FootballTeamHeights {
    
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    
    public static double findMeanHeight(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }
    
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }
    
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
    
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();
        
        System.out.println("Heights of 11 players (in cms):");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150;
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }
        
        System.out.println("\n--- Statistics ---");
        System.out.println("Mean height: " + findMeanHeight(heights) + " cm");
        System.out.println("Shortest height: " + findShortestHeight(heights) + " cm");
        System.out.println("Tallest height: " + findTallestHeight(heights) + " cm");
    }
}
