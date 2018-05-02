package collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetN {

    public static void main(String[] args) {
        Collection<Byte> s = new HashSet<>();
        Set<Byte> bytes = new HashSet<>();
        byte value = 1;
        bytes.add(new Byte("1"));
        bytes.add(value);
        System.out.println("Size of bytes set is : " + bytes.size());

        Set<Character> chars = new HashSet<>();
        chars.add('0');
        chars.add('-');
        chars.add(new Character('0'));
        System.out.println("Size of chars set is : " + chars.size());
    }
}
