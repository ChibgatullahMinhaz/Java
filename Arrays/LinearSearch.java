import java.util.*;
public class LinearSearch {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of Array size: ");
    int size = sc.nextInt();
    int numbers[] = new int[size];
    for (int i = 0; i < numbers.length; i++) {
        System.out.print("Enter number for  " + i +  "index : ");
        numbers[i] = sc.nextInt();
    }
    System.out.println("Enter Searching Value : ");
    int x = sc.nextInt();
    boolean found = false;
     for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == x) {
            System.out.println("x found index of : " + i);
            found = true;
            break;
        }
     }
     if (!found) {
        System.out.println("not found");
     }
    sc.close();
}
}