package generics;

import java.util.ArrayList;
import java.util.List;

public class LegacyCode {

    public static void main(String... args) {
        List<Integer> ints = new ArrayList<>();
        addTo(ints);
        System.out.println(ints);
    }

    private static void addTo(List list) {
        list.add("sheva");
    }
}
