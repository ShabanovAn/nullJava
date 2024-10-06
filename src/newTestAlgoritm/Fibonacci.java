package newTestAlgoritm;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // number of Fibonacci numbers to generate
        long[] fib = new long[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
 class Fibonacci2 {
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0, b = 1, result = 1;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
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

    public static void main(String[] args) {
        int n = 10; // number to calculate Fibonacci of
        long result = fibonacci(n);
        System.out.println("Fibonacci of " + n + " is " + result);
    }
}