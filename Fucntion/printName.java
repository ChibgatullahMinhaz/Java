import java.util.*;
public class printName {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    printMyName("My name Is: " +name);
    scanner.close();
}
    
}