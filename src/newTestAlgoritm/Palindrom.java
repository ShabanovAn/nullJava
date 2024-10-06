package newTestAlgoritm;

public class Palindrom {
    public static void main(String[] args) {

    }

    public static long[] fibonacciArray(int n) {
        long[] fib = new long[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static boolean isPalindromeNumber(int n) {
        int reversed = 0;
        int original = n;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }
}
