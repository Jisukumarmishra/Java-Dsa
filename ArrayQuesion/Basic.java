import java.util.Scanner;

public class Basic {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int numbers[] = new int[size];


       for(int i=0; i<size; i++) {
         System.out.println(numbers[i]);
       }
   }
} 
// java ke andar jab bhi ham varriable name ka array bnate hai to vo memeory me apne name se ek space le leta hai aur ish space ke andsar store kar kr leta ha nill value 
// if varriable is 
// object to - null store karega
// integer hai - 0 store karega
// float hai to -0.0 store karrega
// String hai - " " empty string store karega
// boolean hai - false store karega
