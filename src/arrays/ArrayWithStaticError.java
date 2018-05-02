package arrays;

public class ArrayWithStaticError {

    static int [] arr = new int[0];  // Array with 0 lenghth is possible!!!
    static {
        System.out.println(arr.length) ;  /// ---> print "0"
        arr[0] = 10;            // <-- ArrayIndexOfBoundException
    }

    public static void main(String[] args) {
        new ArrayWithStaticError();          // <-- causes ExceptionInInitializerError at Runtime
    }
}
