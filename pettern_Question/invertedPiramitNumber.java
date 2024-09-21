import java.util.*;

public class invertedPiramitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for Your Rows : ");
        int n = scanner.nextInt();
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        scanner.close();
    }
}
