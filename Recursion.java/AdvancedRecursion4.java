public class AdvancedRecursion4 { //find number of ways  on which you can invite n people to your
    // party single or in pairs
    public static int callGuest ( int n ) { // return type int because here we calculate total number of ways to call a guest
    if ( n <= 1 ) { // n ki value agr 0 hai taht means koi guest nhi hai to unko lane ka bhi 1 ways hoga
        return 1;
    } 
    // single bulaynge
   int ways1 = callGuest(n-1);
   // pair me bulaynge 
    int ways2 = (n-1) * callGuest(n-2);
    return ways1 + ways2;
    }
    public static void main ( String [] args ){
  int n= 4;
  System.out.println(callGuest(n));
    }
}
