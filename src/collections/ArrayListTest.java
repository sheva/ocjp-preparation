package collections;

import java.util.*;

public class ArrayListTest {

    public static void main(String[] args) {

        testSortingByComparator();
        testSortingByComparableInterface();
    }

    private static void testSortingByComparableInterface() {
        List<BCol> colB = new ArrayList<>();
        colB.add(new BCol(06, "A"));
        colB.add(new BCol(1, "B"));
        colB.add(new BCol(1, "A"));

        Collections.sort(colB);
        System.out.println(colB);
    }

    private static void testSortingByComparator() {
        List<ACol> colA = new ArrayList<>();
        colA.add(new ACol(06, "A"));
        colA.add(new ACol(1, "B"));
        colA.add(new ACol(1, "A"));

/*        Collections.sort(colA, new Comparator<ACol>() {
            @Override
            public int compare(ACol o1, ACol o2) {
                if (o1.a == o2.a) {
                    return o1.b.compareTo(o2.b);
                }

                return Integer.compare(o1.a, o2.a);
            }
        });
        System.out.println(colA);*/


        // or since Java 8

/*        Collections.sort(colA, (o1, o2) -> {
            if (o1.a == o2.a) {
                return o1.b.compareTo(o2.b);
            }

            return Integer.compare(o1.a, o2.a);
        });
        System.out.println(colA);*/

        // or another variant since Java 8

        colA.sort((o1, o2) -> {
            if (o1.a == o2.a) {
                return o1.b.compareTo(o2.b);
            }

            return Integer.compare(o1.a, o2.a);
        });
        System.out.println(colA);
    }
}


class ACol {
    int a;
    String b;

    ACol(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return a + " " + b;
    }
}

class BCol extends ACol implements Comparable<BCol> {

    BCol(int a, String b) {
        super(a, b);
    }

    @Override
    public int compareTo(BCol o) {
       if (a == o.a) {
           return b.compareTo(o.b);
       }

       return Integer.compare(a, o.a);
    }
}
