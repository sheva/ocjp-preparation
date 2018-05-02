package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayListSpe extends ArrayList {   // !!! java.util.ArrayList is not final

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();

        list.add(0, 2.3);
        list.addAll(0, Arrays.asList(1.0, 1.5, 2.0));
        list.add(3.0);
        list.addAll(0, Arrays.asList(6.7));

        System.out.println(list);

        try {
            System.out.println(list.get(list.size()));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        List<Double> list2 = list.subList(1, 1);  // An empty list!!! from - to index

        System.out.println(list2);  // Result: Empty list

        list.addAll(list2);     // will add empty element

        // You can do it, even ArrayList is double!
        System.out.println(list.contains("fff"));
        System.out.println(list.indexOf("ddd"));
        System.out.println(list.remove("sss"));
        System.out.println(list.lastIndexOf("ggg"));
        System.out.println(list.get(3));
        int[] arr = new int[] {1,3};

        // list.add("ddd"); // Compilation error!


        List list4 = new ArrayList();
        list4.add(111);

    }
}

