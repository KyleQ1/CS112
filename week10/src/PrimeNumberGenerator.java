import java.util.LinkedList;

public class PrimeNumberGenerator {

    // returns desired list of prime numbers
    public static LinkedList<Long> generate(int numberOfPrimes) {
        LinkedList<Long> primeNumbers = new LinkedList<>();

        long num = 2;
        for  (int totalPrimes = 0; totalPrimes != numberOfPrimes;) {
            if (isPrime(num)) {
                primeNumbers.add(num);
                totalPrimes++;
            }
            num++;
        }

        return primeNumbers;
    }

    private static boolean isPrime(long n) {
        // truncation is ok
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
