import java.util.*;
public class HomeWorkArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        
        String names[] = new String[size];
        // inputs
        for (int i = 0; i <= size; i++) {
            names[i] = scanner.next();
        }
        // outputs
         for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
         }
        scanner.close();
    }
}
