import java.util.*;
public class minmax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Array Size : ");
        int size = scanner.nextInt();
        int numbers[] = new int[size];
        // input
        for (int i = 0; i <size; i++) {
            System.out.println("Enter value for " + i + " index : ");
            numbers[i] = scanner.nextInt();
        }

        // Initialize min and max correctly
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        scanner.close();
        System.out.println(" minmum number is : "+min);
        System.out.println(" maximum number is : "+max);

    }

}