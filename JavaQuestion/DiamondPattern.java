public class DiamondPattern {
    public static void main(String[] args) {
        int n=5;
        for (int i=1; i<=n; i++ ) {// row print karayange
            //spaces print karayange
            for(int j=1;j<=n-i;j++ ) {
                System.out.print(" ");
            }
          //kitne star print krane hai ek row me uske liye code
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
          System.out.println( );

            }
            //lower part
            for (int i=n;i>=1;i--) {
                //spaces in lower part
                for(int j=1;j<=n-i;j++){
              System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++) {
                System.out.print("*");
             }
             System.out.println();
            }
        }
    }
