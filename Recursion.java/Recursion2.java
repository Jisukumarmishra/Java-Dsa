// print 1 to 5

public class Recursion2 {
    public static void printNumb (int n) {
        if ( n== 6) {  // n ki value 5 tak print karani hai isliye n == 6;
            return;
        }
        System.out.println(n);                  // recursion me jo data call hta hai vo memory me as a stack structure layer store hota hasi 
        printNumb(n+1); // increasing order me print karna hai so n+1;

    }
    public static void main(String[] args) {
        int n = 1; // intialize n with one
        printNumb(n);
    }
    
}
