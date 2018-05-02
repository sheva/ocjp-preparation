package dataTypes;

public class StringBuilderTest {

    public static void main (String[] args) {
        StringBuilder st = new StringBuilder("abcdef");
        st.setLength(3);
        System.out.println(st.toString());  // abc
        st.setLength(10);
        System.out.println(st.toString());  // "abc        "
        System.out.println(st.length()); // 10

        st = new StringBuilder("hello ");
        System.out.println(st.insert(3, "fff") + " " + st);
        System.out.println(st.append("world", 0, 3));
        System.out.println(st.replace(1,3,"ddfff"));



        st.delete(0, st.length()); // Empty         (not st.length() - 1 !!!  and not st.empty()

        System.out.println(st.length());

        for (int i=0;i<0;i++) System.out.print("here 0");
        for (int i=0;i<-1;i++) System.out.println("here -1");

        do {
            System.out.println("s");
        } while (false);

        if(false) System.out.println("ff"); //Exception. JLS (Java Language Specification) all ows this case

        //*** Unreachable statements
        /*
        1. for (int i=0;false;i++) System.out.println("s");

        2. while(false) System.out.println("ghh");

        */

        System.out.println(test(new NullPointerException()));

        testNullEqualsTricky();
        testSubstring();
    }


    public static String test(Exception e) {
        try {
            if (e == null) {
                return "a";
            } else {
                throw e;
            }
        } catch (Exception eg) {
            System.out.println("here");
            return "b";
        } finally {
            return "c";
        }
//        return "d";   // Unreachable statement
    }


    public static void testSubstring() {
        String i = "MINIMUM";
        System.out.println(i.substring(4,7));
        System.out.println(i.substring(5));
        System.out.println(i.substring(i.indexOf('I', 3)));
        //System.out.println(i.substring(i.indexOf('I', 4)));  // StringIndexOutOfBoundException is thrown

    }


    public static void testNullEqualsTricky() {
        String msg = "good";
        char[] arr = {'g', 'o', 'o', 'd'};
        String newMsg = null;
        for (char c : arr) {
            newMsg += c;
        }

        System.out.println((newMsg == msg) + " " + newMsg.equals(msg) + " " + newMsg);
        System.out.println(5+3 < 5 +6);
        int x =1;
        int y = 2;
        int z = x++;
        int a = --y;
        int b = z--;
        System.out.println(b);
        b += ++z;

        System.out.println(x + " " + y +" " +" " +z + " " + a + " " + b);

    }
}
