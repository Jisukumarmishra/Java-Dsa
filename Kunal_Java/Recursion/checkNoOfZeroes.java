public class checkNoOfZeroes {
  public static void main(String[] args) {
    System.out.println(totalZeroes(3021, 0));
  }
  // static int count (int n) {
  //   return helper (n,0);
  // }


  // special pattern , how to pass a value to above calls
  // private static int helper (int n, int c ) {
  //   if ( n ==0 ) {
  //     return c;
  //   }
  //   int rem = n % 10;
  //   if ( rem == 0 ) {
  //     return helper(n/10,c+1);
  //   }
  //   return helper (n/10, c);
  // }
  static int totalZeroes (int n, int count) {
  if ( n == 0 ) {
    return count;
  }

  int rem = n % 10 ;
  if ( rem == 0 ) {
    return totalZeroes(n/10,count +1);
  }
  return totalZeroes(n/10, count);
 

  }
}
