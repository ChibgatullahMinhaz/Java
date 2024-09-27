import java.util.*;
public class raisePower {
    public static int raiseOfPower(int x, int n){
        return (int) Math.pow(x, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(raiseOfPower(x, n));
        sc.close();
    }
}
