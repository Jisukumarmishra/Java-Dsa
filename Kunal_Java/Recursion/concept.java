package Recursion;
public class concept {
  public static void main(String[] args) {
    concept(5);
    
  }
  static void concept ( int n ) {
    if ( n == 0 ) {
      return;
    } 
    System.out.println(n);
    // concept(n--); this pass the value of n first and then sustract
    concept(--n); // this substract the valuye first and then pass in the function
  }
}
