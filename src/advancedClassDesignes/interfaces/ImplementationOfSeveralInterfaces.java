package advancedClassDesignes.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import advancedClassDesignes.innerclasses.*;


public class ImplementationOfSeveralInterfaces {

    interface A {
        void m() throws FileNotFoundException;
    }

    interface B {
        void m() throws IOException;
    }

    class Test implements A, B {
        // OK!
        public void m() throws FileNotFoundException {}

        // WRONG!
//        public String m() throws IOException {} // Throws clause must be compatible with all overridden declarations.
//        public void m() throws FileNotFoundException, IOException{}
    }

    interface C {
        void m() throws IOException;
    }

    interface D {
        void m() throws SQLException;
    }

    class Test2 implements C, D {
        // OK!
        public void m() { }

        // WRONG
//        public void m() throws IOException, SQLException {}
//        public void m() throws IOException {}
//        public void m() throws SQLException {}
    }
}

class Some extends advancedClassDesignes.innerclasses.AnonymousClasses{}
