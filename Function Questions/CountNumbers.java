import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        while (true) {
            String input = sc.nextLine();
            System.out.print("Enter a number (or Type exit to Finish: )");
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

            } catch (Exception e) {
                System.out.print("Invalid input, please enter a number.");
            }
        }
        // Display the counts
        System.out.println("Total Positive Numbers: " + positiveCount);
        System.out.println("Total Negative Numbers: " + negativeCount);
        System.out.println("Total Zeros: " + zeroCount);
        sc.close();
    }
}