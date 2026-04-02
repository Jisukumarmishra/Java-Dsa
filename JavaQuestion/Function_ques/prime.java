package Function_ques;

public class prime {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++) {  // Instead of i <= Math.sqrt(num)
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int number = 29;

        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is NOT a prime number");
        }
    }
}
 
    
