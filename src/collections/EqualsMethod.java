package collections;

class A {

    // OK! valid overriding of 'equals' method
    public boolean equals(Object o) {
        return true;
//      default impl : return (this == o);
    }

    // WRONG: invalid override, just 'overload'
    public boolean equals(A a) {
        return true;
    }
     // WRONG!! Even will not compile ( 'attempt to assign weaker privileges')
//    boolean equals(Object o) {
//        return true;
//    }
}

public class EqualsMethod {

}
