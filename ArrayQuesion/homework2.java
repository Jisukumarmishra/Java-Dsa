
// Find the maximum & minimum number in an array of integers.
import java.util.*;

public class homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt(); // jo inpot le rhe hai usko array me store kar rhe hai
        }
        int Max = Integer.MIN_VALUE;// min value function java me sabse minimum intege store karyta hai
        int Min = Integer.MAX_VALUE; // store max value
        for (int i = 0; i < n; i++) {
            if (Max < num[i]) {
                Max = num[i];

            }
            if (num[i] < Min) {
                Min = num[i];

            }
        }
        System.out.println("Maximum number is:" + Max);
        System.out.println("Minimum number is :" + Min);
    }
}
