import java.util.*;

public class calculatSum {
    public static int calculatSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = calculatSum(a, b);
        System.out.println("sum of tow number : " + sum);
        scanner.close();
    }
}
