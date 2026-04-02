import java.util.*;
 // Take an array of names as input from the user and print them on the screen.
public class homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume the leftover newline

        String[] names = new String[n];

        System.out.println("Enter " + n + " names:");
        // ye val for loop use se name input leta hai aur array mein store karta hai 
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        System.out.println("The names you entered are:");
        // stored names ko ek ek karke screen pe print karta hai
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}
