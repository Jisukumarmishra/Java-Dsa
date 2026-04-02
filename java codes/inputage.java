import java.util.Scanner;

public class inputage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: "); // optional but helpful
        int age = sc.nextInt();
        
        if (age <=18) {
            System.out.println("vote");
        } else {
            System.out.println("can't vote");
        }
        
        sc.close();
    }
}

