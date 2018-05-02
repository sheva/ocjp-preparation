package javaBasics;

public class FinalVariables {
    final int instanceVar;
    final static int classVar;

    {
        instanceVar = 1;
        System.out.println("instanceVar = " + instanceVar + "; classVar = " + classVar);
    }

    static {
        classVar = 2;
        System.out.println(" classVar = " + classVar);
    }

    public static void main(String[] args) {
        new FinalVariables();
    }
}
