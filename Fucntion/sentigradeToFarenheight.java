import java.util.*;
public class sentigradeToFarenheight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double f = scanner.nextDouble();
        double c = ((f - 32) *5/9);
        System.out.print(c);
        scanner.close();
    }
}
