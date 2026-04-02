package Function_ques;
import java.util.Scanner;

public class gcdCalculator {

    // Function to calculate GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        int result = gcd(a, b);

        System.out.println("GCD of " + a + " and " + b + " is: " + result);

        scanner.close();
    }
}
