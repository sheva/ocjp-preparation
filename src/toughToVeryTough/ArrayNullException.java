package toughToVeryTough;

public class ArrayNullException {

    public static void main(String[] args) throws Exception {
        int[] arr = null;
        int i = arr[m1()];
        /* NPE will not be thrown, instead Exception("Some Exception") will be thrown.
           Indexing expression will be evaluated firstly and then, if completed successfully, array reference evaluation. */
    }

    public static int m1() throws Exception {
        throw new Exception("Some Exception");
    }
}


