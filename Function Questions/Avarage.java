import java.util.*;
public class Avarage {
public static int AvarageNumber(int a, int b, int c){
     return (a + b + c) / 3;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(AvarageNumber(a,b,c));
        sc.close();
    }
}