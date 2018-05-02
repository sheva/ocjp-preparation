package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetSpec {

    public static void main(String[] args) {
        Set<Object> objects = new HashSet<>();
        objects.add(1);
        objects.add(new Integer(1));
        objects.add(new Integer(2));
        objects.add("some");
        objects.add(new NoHashcodeAndEquals(1));
        System.out.println("Size : " + objects.size()); // -> 4
        System.out.println(objects.contains(new NoHashcodeAndEquals(1))); // -> false

        objects.add(new HashcodeAndEquals(1));
        System.out.println("Size : " + objects.size()); // -> 5
        System.out.println(objects.contains(new HashcodeAndEquals(1))); // ->true
    }
}

class NoHashcodeAndEquals {
    int a;

    NoHashcodeAndEquals(int a ){
        this.a = a;
    }
}

class HashcodeAndEquals {
    int a;

    HashcodeAndEquals(int a ){
        this.a = a;
    }

    public int hashCode() {
        return a;
    }

    public boolean equals(Object o) {
        if (!(o instanceof HashcodeAndEquals)) {
            return false;
        }

        return ((HashcodeAndEquals)o).a == a;
    }
}
