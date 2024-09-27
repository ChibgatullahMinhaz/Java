import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int positiveCount = 0; 
        int negativeCount = 0; 
        int zeroCount = 0;
        
        while (true) {
            System.out.print("Enter a number (or type 'exit' to finish): ");
            String input = sc.nextLine(); 
            
            if (input.equalsIgnoreCase("exit")) { // Check for exit condition
                break; // Exit the loop if user types 'exit'
            }
            
            try {
                int number = Integer.parseInt(input); // Convert input to integer
                
                if (number > 0) {
                    positiveCount++; // Increment positive count
                } else if (number < 0) {
                    negativeCount++; // Increment negative count
                } else {
                    zeroCount++; // Increment zero count
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number."); // Handle invalid input
            }
        }
        
        // Display the counts
        System.out.println("Total Positive Numbers: " + positiveCount);
        System.out.println("Total Negative Numbers: " + negativeCount);
        System.out.println("Total Zeros: " + zeroCount);
        
        sc.close(); // Close the scanner
    }
}
