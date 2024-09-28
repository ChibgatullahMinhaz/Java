import java.util.*;
public class LinearArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter Your Mark index of: " + i + " : ");
            marks[i] = sc.nextInt();
        }
        System.out.println("enter Your Any subject Mark: ");
        int mark = sc.nextInt();
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == mark) {
                System.out.print("Found it " + mark + "  and index of : " + i);
            }
        }
        sc.close();
    }
}
