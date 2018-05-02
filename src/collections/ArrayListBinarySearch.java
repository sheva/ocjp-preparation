package collections;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayListBinarySearch {

    public static void main(String... args) {
        String[] count = {"one", "two", "three", "four", "five"};
        print(count);

        Arrays.sort(count);
        print(count);

        System.out.println("Index of 'one': " + Arrays.binarySearch(count, "one")); //  -> 2
        System.out.println("Index of not existing: " + Arrays.binarySearch(count, "six")); // -> -6


/*        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };*/

        Comparator<String> comparator = (o1, o2) -> o2.compareTo(o1); // OR Comparator.reverseOrder()

        Arrays.sort(count, comparator);

        System.out.println("Index of 'four': " + Arrays.binarySearch(count, "four")); // Bad!!! result is unpredictable!!
        System.out.println("Index of 'four': " + Arrays.binarySearch(count, "four", comparator)); // -> 3
        System.out.println("Index of not existing: " + Arrays.binarySearch(count, "six", comparator)); // -> -6
    }

    private static void print(String[] count) {
        for (String s : count) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
