package StringQuestion;
import java.util.*; 

// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.

public class Question {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
            String Emails = sc.nextLine();
             String userName = " "; // create empty string;
             for (int i=0; i<Emails.length(); i++) {
                if (Emails.charAt(i) == '@') {// '@' at the rate  character hai 
                break;
            } else {
                userName +=Emails.charAt(i); 
            }
             }
             System.out.print(userName);

        
    }
}
