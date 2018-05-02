package exceptions;

public class FinallyAfterSystemExit {

    public static void main(String[] args) {
        try {
            System.exit(0);
        } finally {
            System.out.println("I am here");
            System.identityHashCode(new Object());
        }
    }
}
