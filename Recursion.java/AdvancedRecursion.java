public class AdvancedRecursion {
     // count total path in a maje to move from (0,0) to (n,m)

    public static int countPaths (int i, int j, int n , int m ){ //return type int because ham total path ko return karne vale hai 
      if ( i == n || j == m) {
        return 0 ;
      }
        if ( i == n-1 && j ==m-1 ) {
        return 1;
      }
        // move downward;
      int downPath = countPaths(i+1, j, n, m);
      // move right;
     int rightPath =  countPaths(i, j+1, n, m);
     return downPath + rightPath ;
    } 
    public static void main(String[] args) {
        int n = 3, m= 3 ;
       int totalPath = countPaths(0, 0, n, m);
       System.out.println(totalPath); 

    }
}
