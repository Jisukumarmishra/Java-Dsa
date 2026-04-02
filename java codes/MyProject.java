import java.util.Scanner;
public class MyProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int mynumber = (int)(Math.random()*100);
        int userNumber = 0;

        do {
            System.out.println("guess my number (1 to 100) :");
           userNumber = sc.nextInt();
           
             if ( userNumber == mynumber) {
                System.out.println("wow... correct number");
            break;
            } 
             else if (userNumber > mynumber) {
                System.out.println("your number too large");
             }
             else {
                System.out.println("your number is too small");
               }
             } while(userNumber >= 0 );
             System.out.println("my number was : ");
             System.out.println(mynumber);
             sc.close();


  }
}
