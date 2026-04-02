public class Breakcontinue {
public static void main(String[] args) {
        //brerak and continue statement
        int i = 0;
        while (true) {
            if(i == 3) { //this is use to not print a number 3 ;
                i =i+1;
                continue;

            }
            System.out.println(i);
            i = i+1;
            if(i > 5) {
                break;

            }
        }
        
            
    }
}

