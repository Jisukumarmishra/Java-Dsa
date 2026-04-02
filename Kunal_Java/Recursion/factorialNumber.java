package Recursion;
public class factorialNumber {
  public static void main(String[] args) {
    System.out.println(printfactorial(3));
    
  }
  public static int printfactorial ( int n ) {
    if ( n == 0 || n == 1 ) {
      return 1;
    }
    return n * printfactorial(n - 1);
  }
}
