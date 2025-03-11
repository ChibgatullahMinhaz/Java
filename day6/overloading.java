class over   {
int cal(int a, int b){
    System.out.println("Addition of two numbers: " + (a+b));
    return a+b;
}
float cal(float a, float b){
    System.out.println("Addition of two numbers: " + (a+b));
    return a+b;
    
}
double cal(double a, double b){
    System.out.println("Addition of two numbers: " + (a+b));
    return a+b;
}
}
public class overloading {
 public static void main(String[] args) {
    over o = new over();
    o.cal(10, 20);
    o.cal(10.5f, 20.5f);
    o.cal(10.5, 20.5);
 }   
}

