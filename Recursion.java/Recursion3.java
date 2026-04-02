// print sum of first n natural number
public class Recursion3 {
    public static void printsum (int i,int n, int sum) { // i ki value har ek number se hOkar gujar rHI HAI 
        //sum me hum vha tak ki jha tak number gaye hyue hai uska sum store kra rhe hai  // n hmara lasat number hAI
     if (i == n ) {     
           sum+=i;       
           System.out.println(sum);     // last condition
           return;
        }
        sum = sum + i;
      printsum(i+1 , n , sum );
      System.out.println(i);

    }
    public static void main(String[] args) {
        int sum = 0;
        printsum(1, 3, sum);
     // get input from here 
        
    }
    
}
