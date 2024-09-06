import java.util.Scanner;

/**
 * calculator
 */
public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input a & b from users
        System.out.println("Enter Your Number (a): ");
        double a = sc.nextDouble();
        System.out.println("Enter Your Number (b): ");
        double b = sc.nextDouble();
        

        // Prompt user to choose an operation
        System.out.println("Choose an operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo or remainder)");
        System.out.print("Enter the operation number (1-5): ");
        int operation = sc.nextInt();

        double result;

        switch (operation) {
            case 1:
                result = a + b;
                System.out.println("Result" + ": " + a + "+" + b + "= " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Result"  + ": "  + a + "-" + b + "= " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result"  + ": "  + a + "*" + b + "= " + result);
                break;

            case 4:
                result = a / b;
                System.out.println("Result"  + ": "  + a + "/" + b + "= " + result);
                break;

            case 5:
                result = a % b;
                System.out.println("Result"  + ": "  + a + "%" + b + "= " + result);
                break;

            default:
                System.out.println("not valid number");
                break;
        }
        sc.close();
    }
}