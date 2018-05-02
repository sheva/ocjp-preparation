package interviewQuestions;

import java.math.BigInteger;
import java.util.HashMap;

public class Factorial {

    private static HashMap<Integer, BigInteger> cashedFactorial = new HashMap<>();

    public static void main(String... args) {
//        System.out.println(factorialRecursiveBig(-5));
//        System.out.println(factorialRecursive(5));
//        System.out.println(factorial(5));
        System.out.println(factorialBigWithStorage(5));
    }

    private static long factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n-1);
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 1; i < n; i++) {
            result *= i;
        }
        return result;
    }

    private static BigInteger factorialRecursiveBig(int n){
        if (n == 0) {
            return BigInteger.ONE;
        }
        return factorialRecursiveBig(n - 1).multiply(BigInteger.valueOf(n));
    }

    private static BigInteger factorialRecursiveBigWithStorage(int n){
        BigInteger val = cashedFactorial.get(n);
        if (val != null) {
            return val;
        } else {
            if (n == 0) {
                return BigInteger.ONE;
            }
            BigInteger result = factorialRecursiveBigWithStorage(n - 1).multiply(BigInteger.valueOf(n));
            cashedFactorial.put(n, result);
            return result;
        }
    }

    private static BigInteger factorialBigWithStorage(int n) {
        BigInteger val = cashedFactorial.get(n);
        if (val != null) {
            return val;
        } else {
            BigInteger result = BigInteger.ONE;
            for (long i = 0; i < n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            cashedFactorial.put(n, result);
            return result;
        }
    }
}
