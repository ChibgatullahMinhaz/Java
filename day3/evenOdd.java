import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0 ) {
            System.err.println("Even Number");
        }else{
            System.out.println("odd number");
        }
        sc.close();
    }
}
