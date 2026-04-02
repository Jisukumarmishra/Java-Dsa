import java.util.*;
// Taking an array as an input and printing its elements.
public class basics2 {
    public static void main(String[] args) {
         Scanner sc= new Scanner (System.in);
           int size = sc.nextInt();
         int numbers []= new int[size];

        //input
         for(int i=0;i<size;i++){
            numbers[i] =sc.nextInt();
         }
         //o/p
         for(int i=0;i<size;i++) {
            System.out.println(numbers[i]);
         }
    }
}
