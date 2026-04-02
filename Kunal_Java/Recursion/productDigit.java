package Recursion;
public class productDigit {
  public static void main(String[] args) {
    System.out.println(prdt(12345));
    
  }
  public static int prdt ( int n ) {
    if ( n%10 == n ) {
      return n ;
    }
    return  ( n % 10 ) * prdt(n / 10);
  }
  
}
