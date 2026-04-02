package Recursion;
public class sum {
  public static void main(String[] args) {
    System.out.println(calculateSum(5));
    
  }
  public static int calculateSum ( int n ) {
    if (n == 0 || n == 1 ) {
      return n;
    }
    return n + calculateSum( n - 1);
  }
}
