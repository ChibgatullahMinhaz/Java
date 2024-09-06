import java.util.Scanner;
public class Equalty {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b ) {
            System.out.println("Equal number");
        }else{
            if (a > b) {
                System.out.println("a is grater");
            }else{
                System.out.println("b is lower");
            }
        }
sc.close();
    }
}
