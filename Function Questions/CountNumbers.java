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
            
            if (input.equalsIgnoreCase("exit")) {
                break; 
            }
            
            try {
                int number = Integer.parseInt(input);
                
                if (number > 0) {
                    positiveCount++;
                } else if (number < 0) {
                    negativeCount++; 
                } else {
                    zeroCount++; 
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        // Display the counts
        System.out.println("Total Positive Numbers: " + positiveCount);
        System.out.println("Total Negative Numbers: " + negativeCount);
        System.out.println("Total Zeros: " + zeroCount);

        sc.close();
    }
}