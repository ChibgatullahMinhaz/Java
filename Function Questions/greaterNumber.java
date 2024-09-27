import java.util.*;
public class greaterNumber {
    public static int FindgreaterNumber(int a, int b){
        if (a > b) {
            return  a;
        }else{
           return b;
        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Greater Number is : " + FindgreaterNumber(a, b));
        sc.close();
    }
}
