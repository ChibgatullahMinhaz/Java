import java.util.*;
class FactorialNumber {
    public static void getFactorialNumber(int n){
        if (n < 0 ) {
            System.out.println("invalid Number");
            return;
        }
        int Factorial = 1;
        for (int i = n; i >=1; i--) {
            Factorial = Factorial * i;
        }
        System.out.println(Factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter number: ");
        int n = sc.nextInt();
        getFactorialNumber(n);
        sc.close();
    }
}