package Function_ques;
import java.util.Scanner;

public class quest2 {



    // Function to calculate x raised to the power n
    public static int power(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers x and n
        System.out.print("Enter the base number x: ");
        int x = scanner.nextInt();

        System.out.print("Enter the exponent n: ");
        int n = scanner.nextInt();

        int powerResult = power(x, n);

        System.out.println(x + " raised to the power " + n + " is: " + powerResult);

        scanner.close();
    }
}
