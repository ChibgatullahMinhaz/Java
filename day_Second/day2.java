import java.util.Scanner;
// output in 3ways
class secondDay {
    public static void main(String[] args){
        System.out.print("hello World"); //1no way
        System.out.print("hello World\n"); // 2no way
        System.out.println("hello World"); //3no way
        System.out.print("hello World");

    }
}
// qs for outputs
class secClass {
    public static void main(String[] args){
        System.out.println("*");
        System.out.println("* *" );
        System.out.println("* * *");
        System.out.println("* * * *");


    }
}
// quize using variables
// how to get input in users
class ThirdClass {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int sum = a + b;
     System.out.println(sum);
     sc.close();
    }
}


