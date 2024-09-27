import java.util.Scanner;

public class circumference {
    public static double findCircumference(int radius) {
        return 2 * 3.1416 * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();

        System.out.println("The circumference of the circle is: " + findCircumference(radius));

        sc.close();
    }
}
