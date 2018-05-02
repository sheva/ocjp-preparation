package javaBasics;

public interface LegalInterface {
// or
// interface LegalInterface {
// or
// public abstract interface LegalInterface
// or
// abstract interface LegalInterface

    int a = 10;
    // or
    // public int a = 10;
    // or
    // public static int a = 10;
    // or
    // public static final int a = 10;
    // !!! what compiler sees: public static final int a = 10;

    void m();
    // or
    // public void m();
    // or
    // public abstract void m();
    //!!! what compiler sees: public abstract void m();

}
