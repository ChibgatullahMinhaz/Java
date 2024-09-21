import java.util.*;;
public class Patterns {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number for Row :");
    int n = sc.nextInt();
    System.out.print("Enter a number for collum:");
    int m = sc.nextInt();
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=m; j++) {
            System.out.print("*");
        }
        System.out.println("*");
    }
    sc.close();
}
    
}