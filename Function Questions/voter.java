import java.util.*;
public class voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        voterCheck(age);
        sc.close();
    }
    public static void voterCheck(int age){
        if (age > 18) {
           System.out.print("Eligable for Vote");
        }else{
            System.out.print("Not Eligable for Vote");
        }

    }
}
