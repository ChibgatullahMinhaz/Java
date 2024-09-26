import java.util.*;
public class calculateProduct {
    public static int calculateProduct(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of (a): ");
        int a = sc.nextInt();
        System.out.println("Ente number for (b): ");
        int b = sc.nextInt();
        System.out.println("Total 2 number of Products: " + calculateProduct(a, b));
        sc.close();
    }
}
