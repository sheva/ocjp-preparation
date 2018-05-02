package interviewQuestions;

import java.math.BigInteger;

public class FibonacciNumber {

    static void fibonacci(int index) {
        int n0 = 0, n1 = 1, count = 0;
        while(count <= index) {
            int fib = n0 + n1;
            System.out.print(n0 + " ");
            n0 = n1;
            n1 = fib;
            count++;
        }
    }








































    public static void main(String[] args) {
//        System.out.println("Fibonacci number "+ fibonacciNumber(2));
        fibonacci(10);
/*        System.out.println("Fibonacci number "+ fibonacciNumberRecursive(20));
        System.out.println("counter = " + counter);*/
    }

    private static BigInteger fibonacciNumber(int n) {
        if (n == 0) {
            return BigInteger.ZERO;
        } else if (n == 1) {
            return BigInteger.ONE;
        } else {

/*
            Long[] numbers = new Long[n+1];
            numbers[0] = 0L;
            numbers[1] = 1L;
            for (int i = 2; i <= n; i++) {
                numbers[i] = numbers[i - 2] + numbers[i - 1];
            }

            return numbers[n];
*/

            BigInteger prev2 = BigInteger.ZERO;
            BigInteger prev1 = BigInteger.ONE;
            BigInteger result = BigInteger.ZERO;

            for (int i = 1; i < n; i++) {
                result = prev2.add(prev1);
                prev2 = prev1;
                prev1 = result;
            }

            return result;
        }
    }

    private static long counter;
    private static long fibonacciNumberRecursive(int n) {
        if (n < 2) {
            return n;
        } else {
            counter ++;
            return fibonacciNumberRecursive(n - 1) + fibonacciNumberRecursive(n - 2);
        }
    }

}
