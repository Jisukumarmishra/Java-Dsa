// print 
// 5 to 1
public class Recursion1 {

    public static void printNumb (int n) {
        if ( n== 0 ) {  
            return ;      //base condition if base condition not add in recurssion ten out recurssion run infinite time or we said that stack overflow occur

        }
       System.out.println(n); // jo print karana hai 

        printNumb(n-1);  // recursion

    }
    public static void main(String[] args) {
        int n = 5;
        printNumb(n);


    }
}