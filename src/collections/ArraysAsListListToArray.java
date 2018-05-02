package collections;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListListToArray {

    public static void main(String[] args) {
        String[] strings = {"a", "b", "c"};

        List<String> list = Arrays.asList(strings); //Fixed size
        strings[1] = "k";
//        list.add(0, "z"); // -> result in UnsupportedOperationException
//        list.remove(0); // -> result in UnsupportedOperationException
        list.set(0, "z");

        System.out.println(list); // ---> "z" "k" "c"
        print(strings);


// Valid method       list.toArray(); --> returns the array of Object

        /*
        String[] backup = new String[1];
        list.toArray(backup);
        print(backup);

        ->result that backup is null
        */

//        String[] backup = new String[1]; !ok

        String [] backup = {"one", "two", "three"};
        String [] newArr = list.toArray(backup);
        System.out.println("backup == newArr: " +  (backup == newArr)); // If enough to allocate in current array then ok, else - at runtime new array will be created to be populated from this list
        print(backup);

        String [] backup2 = {"one", "two"};
        newArr = list.toArray(backup2);
        System.out.println("backup2 == newArr: " +  (backup2 == newArr)); // --> false
    }

    private static void print(String[] strings) {
        for (String s :strings) {
            System.out.print(s + " ");
        } // ---> "z" "k" "c"

        System.out.println();
    }
}
