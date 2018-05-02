package javaBasics;

public class ClassCast {

    interface Foo {}
    class Alpha implements Foo {}
    class Beta extends Alpha {}
    class Gamma extends Beta {}

    public static void main(String[]...args) {
        ClassCast classCast = new ClassCast();
        Beta b = classCast.new Beta();

    }

}
