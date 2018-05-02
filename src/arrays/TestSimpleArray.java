package arrays;

public class TestSimpleArray {

    public static final void main(String [] args) {
        int i, n = 10;
        int[] array = new int[n];
        for (i=0; i< n; i++) {
            System.out.println("some i " + i + " some " + array[i]);
        }
        System.out.println("i = " + i);
    }
}
