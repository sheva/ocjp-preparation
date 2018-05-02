package arrays;

public class ArrayCopy {


    int [] [] a; // valid declaration
    int [] [] b = new int[2][];  // valid initialization

    // public static void main(String...args) {      // VALID!! String...args
   // public static void main(String[]... args) {  //  VALID!! String[]... args
  // public static void main(String[]...args) {     //  VALID!! String[]...args

    public static void main(String args []) {
        testArraycopy();
        testArraysCast();
    }

    private static void testArraycopy() {
        int [] arrFrom = {1,2,3,4,5};
        int []arrTo = null;
        int [][][] hey = new int[10][][];
        int [][][] hey2 = new int[10][2][];
        int [][][] hey3 = new int[10][2][23];
        int [][] kk = new int[][] {{1}, {2}};
        int [][] kk2 = {{1,4,5}, {2}};

        // System.arraycopy(arrFrom, 2, arrTo, 2, 4); Will throw NullPointerException

        arrTo = new int[5];

        System.arraycopy(arrFrom, 2, arrTo,1, 3); // --> arrTo == {0,3,4,5,0}
        for (int i = 0 ; i< arrTo.length ; i++) {
            System.out.print(arrTo[i] + " ");
        }
    }

    class A {}
    class B extends A {}

    public static void testArraysCast() {
        A[] a, a1;
        B[] b;

        a = new A[10]; a1 = a;
        b = new B[10];

        a = b;
        b = (B[]) a;   // Compilation ok! Runtime ok! actual B[]
        b = (B[]) a1;  // Fail at runtime, but not at compile time because of explicit cast
    }
}

