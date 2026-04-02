package Function_ques;

import java.util.Scanner;

public class Factorial {
    public static void calcyFact (int n ) {
        if (n<0 ){
            System.out.println("Invaile Number");
           return;
        }
        int factorial=1;
        for (int i=n; i>=1; i-- ) {
             factorial= factorial*i;
            }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ener the number");
        int n= sc.nextInt();
        calcyFact(n);
        
    }
}

