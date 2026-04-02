public class invertsedpyramid2 {
    public static void main(String[] args) {
      //yha pe 2 inne loop lagegi ek to column ke liye ( matlab star  print karane ke liye) dusri space print karne ke lye 
      int n = 4;
      for (int i =0; i<=n; i++ )  {
        //inner loop ->space print
        for (int j= 0; j<=n-i; j++ ) {
            System.out.print(" ");
        } 
        //inner loop -> star print
          for (int j=0; j<=i; j++) {
            System.out.print("*") ;
          }
          System.out.println();
      } 
    }
}
