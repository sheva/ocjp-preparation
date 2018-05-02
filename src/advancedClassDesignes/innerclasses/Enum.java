package advancedClassDesignes.innerclasses;

public class Enum {
    interface A {}
    enum Switch implements A { ON, OFF;

//    OK!
//      Switch() {} (but 'private' by default, so cannot be instantiated even in the same package
//      private Switch() {}

//    WRONG!!!
//      Cannot be 'public' || 'protected'
//      public Switch() { }
//      protected Switch(){}

        // WRONG clone() method is final in Enum.class
//        public Object clone() { return ON;}
    }

    private static boolean isOff(Switch s) {
        boolean result = false;

//      OK!
        if (s == Switch.OFF) {
            System.out.println("It is Off!");
            result = true;
        }

//      OK!
        if (s.equals(Switch.OFF)) {
            System.out.println("It is Off!");
            result = true;
        }

//      OK!
        switch (s) {
            case OFF: {
                System.out.println("It is Off!");
                result = true;
            } break;
        }

//      WRONG!!!
//
// An enum switch case label must be the unqualified name of an enumeration constant. So it should be: case OFF instead of case Switch.OFF.
//        switch (s) {
//            case Switch.OFF: {
//                System.out.println("It is Off!");
//                result = true;
//            } break;
//        }

//      WRONG!!!
//
//        while(s){
//            System.out.println("It is Off!");
//            result = true;
//        }

        return result;
    }

    public static void main(String... args) {
        System.out.println("True: "  + isOff(Switch.OFF));
        System.out.println("False: " + isOff(Switch.ON));

        // WRONG!!!
//        Some some = new Some("C");
    }
}

enum Some {
    A("A"), B("B");
    private String m;
    Some(String m){ // private by default
        this.m= m;
    }
}

enum PrintOut {
    A, B, C;

    public static void print() {
// OK!
        for (PrintOut p : values()) {
            System.out.println(p);
        }

// WRONG!!
//        while (PrintOut.hasNext()) {
//            System.out.println(PrintOut.next());
//        }


// WRONG!!
//        for (int i=0; i< 3; i++) {
//            System.out.println(PrintOut[i]);
//        }
    }
}


