import java.util.Scanner;

public class monthname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your month index number :  ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Month Name is January");
                break;
            case 2:
                System.out.println("Month Name is Feb");
                break;
            case 3:
                System.out.println("Month Name is march");
                break;
            case 4:
                System.out.println("Month Name is april");
                break;
            case 5:
                System.out.println("Month Name is may");
                break;
            case 6:
                System.out.println("Month Name is june");
                break;
            case 7:
                System.out.println("Month Name is july");
                break;
            case 8:
                System.out.println("Month Name is Augest");
                break;
            case 9:
                System.out.println("Month Name is September");
                break;
            case 10:
                System.out.println("Month Name is October");
                break;
            case 11:
                System.out.println("Month Name is november");
                break;
            case 12:
                System.out.println("Month Name is December");
                break;
            default:
                break;
        }
        sc.close();
    }
}