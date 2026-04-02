import java.util.Scanner;

public class ApplicationConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        // pen price = 12; copy price = 20;

        if (money < 12) {
            System.out.println("Can't buy anything");
            System.out.println("Better luck next time");
        } else if (money >= 12 && money < 20) {
            System.out.println("Can get one thing");
        } else {
            System.out.println("Buy both things");
        }

        sc.close(); // Good practice to close Scanner
    }
}

