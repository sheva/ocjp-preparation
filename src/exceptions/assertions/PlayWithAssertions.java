package exceptions.assertions;

public class PlayWithAssertions {


    static {
        boolean assertionTurnOn = false;
        assert assertionTurnOn = true;     // Intentional side effect!
        System.out.println(assertionTurnOn);
    }

    private static void check(int value) {
        assert value >= 0 : "Could not be negative value";
//        assert value >= 0 : throw new RuntimeException();   Will not compile
    }

    public void testHoldsLock() {
        assert Thread.holdsLock(this);
    }

    public static void main(String... args) {
        check(1);
        new PlayWithAssertions().testHoldsLock();
    }
}
