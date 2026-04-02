package StringQuestion;
//Reverse a String (using StringBuilder class)
public class reveseStringusingStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hellow word");
        for (int i=0; i<sb.length()/2; i++ ){// divide bu 2 isliye kiye hai taagr nhi karenge to vhi number dubara print ho jayega
             int front = i;
             int back = sb.length()-i-1; //ytha pe minus i isliye kiy hai ensure kare ham dheere dheere sahi sahi character ki or badh rhe hai ki nhi   
             //Then subtracting i → Moves towards the front as the loop progresses.
        
            char frontChar = sb.charAt (front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front , backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
    
}
