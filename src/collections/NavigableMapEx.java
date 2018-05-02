package collections;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableMapEx {

    public static void main(String... args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        map.put("aa", "aa");
        map.put("bb", "bb");
        map.put("cc", "cc");

        System.out.println(map);

        map.pollFirstEntry();
        map.pollLastEntry();

        SortedMap<String, String> tail = map.tailMap("b");
        System.out.println(tail); // -> b, bb, c
        tail.put("bbb", "bbb");
        map.put("bbbb", "bbbb");

        System.out.println(map); // aa=aa, b=b, bb=bb, bbb=bbb, c=c
        System.out.println(tail); // b=b, bb=bb, bbb=bbb, c=c

        System.out.println(map.ceilingEntry("b")); //' -> "b"
        System.out.println(map.lowerEntry("b")); //' -> "aa"
        System.out.println(map.lowerEntry("aa")); //' -> null
        System.out.println(map.ceilingEntry("e")); //' -> null
        System.out.println(map.subMap("aa", "c")); //' -> "b"
    }
}
