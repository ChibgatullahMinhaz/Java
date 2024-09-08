class firstClass{
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            System.out.println("hello world");
        }
    }
}
// This example will only print even values between 0 and 10:
class secondClasss{
    public static void main(String[] args){
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
          }
    }
}

// This example will only print even values between 0 and 10:
class thirdClass{
    public static void main(String[] args){
        // Outer loop
for (int i = 1; i <= 2; i++) {
    System.out.println("Outer: " + i); // Executes 2 times
    
    // Inner loop
    for (int j = 1; j <= 3; j++) {
      System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
    }
  } 
    }
}