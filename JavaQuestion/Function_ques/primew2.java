package Function_ques;

class Main {

    // Returns 1 if prime, 0 if not prime
    public static int isPrime(int num) {
        if (num <= 1) return 0;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return 0;  // Not prime
            }
        }

        return 1;  // Prime
    }

    public static void main(String[] args) {
        int number = 37;
        int result = isPrime(number);

        if (result == 1) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is NOT a prime number");
        }
    }
}

