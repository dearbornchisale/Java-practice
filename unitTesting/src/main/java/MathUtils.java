
public class MathUtils {

    /**
     * Returns the factorial of n (n!).
     * Throws IllegalArgumentException if n is negative.
     * Returns 1 for n = 0.
     */
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative");
        }
        if (n == 0 || n == 1)
            return 1;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Returns true if the number is prime, false otherwise.
     * Returns false for numbers less than 2.
     */

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    /**
     * Returns the greatest common divisor (GCD) of a and b.
     * Uses Euclidean algorithm. Works with negative numbers (returns positive GCD).
     */

    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Returns the nth Fibonacci number (0-indexed: fib(0)=0, fib(1)=1).
     * Throws IllegalArgumentException if n is negative.
     */

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative");
        }
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

}
