package javaBasics;

interface Flyer {}

class Bird implements Flyer {}
class Eagle extends Bird {}
class Bat {}
final class Batman{}

public class CoolInterface {

    public static void main(String[] args) {
        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b = new Bat();
        Batman bat = new Batman();

        if (f instanceof Bird) System.out.println("f is Bird");
        if (e instanceof Flyer) System.out.println("e is Flyer");

        if (b instanceof Flyer) System.out.println("b is Flyer");   // is OK. Compiles ok!

        // if (b instanceof Eagle) System.out.println("b is Eagle");   // Compilation error. Incompatible types
        //  if (bat instanceof Flyer) System.out.println("bat is Flyer"); //  Compilation error. it is not possible to point on sub class that extends Batman and implement Flyer

    }
}
