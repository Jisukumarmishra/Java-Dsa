public class pyramid {
    public static void main(String[] args) {
        int n= 4; // outer loop that means row print 
        for ( int i = 1; i<=n; i++ ) {
            for (int j= 1; j<=i; j++ ) { // i define karega upper limit ( kitne star ko print karna hai) ko
                System.out.print("*");
                 
            }
           
         System.out.println();
        }
    }
}

// class Main {
//     public static void main(String[] args) {
//        int n= 3;
//        int m= 3;
//      for (int i= 0; i<=n ;i++){
//          for ( int j=0; j<=i; j++) {
//              System.out.print ("*");
//          }
//      System.out.println();
//      }
//  }
// }
