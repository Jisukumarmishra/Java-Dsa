import java.util.*; //print the subset of a set of first n natural number n = "3"
public class AdvancedRecursion5 {
    public static void printSubset ( ArrayList<Integer> subset ) {
        for ( int i = 0 ; i<subset.size(); i ++  ) {
        System.out.print ( subset.get(i) + " ") ; // get(i) this is function ArraList
        }
          System.out.println(); // using for next line 
    }
   
    public static void findSubset ( int n, ArrayList<Integer> subset ) {
        // har element pe elementy ko choice hai kii vo add hoga ki nhi 
        // add hoga
        if ( n == 0 ) {
        printSubset ( subset );
         return;
        } 
        subset.add(n);
        findSubset(n-1, subset) ;
        // add nhi hoga
        subset.remove(subset.size() -1);// for deleting element
        findSubset( n-1, subset) ;
    }
    public static void main ( String [] args ) {
     int n = 3;
     ArrayList<Integer> subset  = new ArrayList<>(); // subset ke element ko array list mo store krayange
     findSubset(n, subset);
    }
}