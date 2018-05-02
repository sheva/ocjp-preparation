package enums;

/*

1. You can not extend from enum, because it is final
and
2. You can not extend any class, because by default it already extends java.land.Enum with ordinal(), values() or valueOf()
and
3. You can implement as many interfaces as you want
public enum Enum extends EmptyEnum {
}

*/

public enum Enum {
    ;
//    public Enum(){} // no modifiers allowed
    Enum() { // but 'private' is ok, but redundant
        System.out.println("Here");
    }

}


