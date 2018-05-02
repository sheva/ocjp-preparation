package javaBasics;
/// Package javaBasics; declaration is absent in this code
/**
 * Q: Given code.
 * Which packages are automatically imported? (choose 2 options)
 *
 * A) java.util
 * B) System
 * C) java.lang
 * D) java.io
 * E) String
 * F) Package with no name
 *
 *  A: C) + F) There is no package declaration so all classes from this default package are assumed as imported.
 */
public class PackageImportByDefault {

    public static final void main(String... args) {
        System.out.println("Some class");
    }
}
