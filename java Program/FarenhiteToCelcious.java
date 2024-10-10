import java.util.*;
public class FarenhiteToCelcious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = ((f - 32) * 5 / 9);
        System.out.println("Celcious is : " +c);
        sc.close();
    }
}
