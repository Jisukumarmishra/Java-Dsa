public class Xpowern {  // calculate x the powen n with staak height n
    public static int xPowern (int x, int n) {
        if ( n == 0 ){  // base con^n 1
            return 1;
         } if ( x == 0 ) {  // base cond^n 2
                return 0;
            }
    
        int xPownm1 = xPowern (x, n-1);  // call the function
        int xpown = x * xPownm1;    // kam 
        return xpown;   
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = xPowern(x,n);
        System.err.println(ans);


    }
}
