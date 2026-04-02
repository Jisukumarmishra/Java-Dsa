package Towerofhenoi;

public class Towerofhenoi {
    public static void towerOfhanoi (int n, String src, String helper, String dest ) {
        if ( n== 1) {
            System.out.println("Transfer disk " + n + " From " + src + " to " + dest);
            return;

        }
     towerOfhanoi(n-1, src, dest, helper);
     System.out.println("Transfer disk" + n + " From "+ src +"to"+ dest);
     towerOfhanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 3; // now we put the value of n and gettinf disk move where to where in all condition 
        towerOfhanoi(n, "S", "H", "D");
        
    }
    
}
