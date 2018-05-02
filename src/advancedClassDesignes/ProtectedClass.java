package advancedClassDesignes;

import advancedClassDesignes.utils.ProtectedVar;

class A {
    protected int i = 0;
    private int j = 0;
    public int getI() {
        return i;
    }
}

public class ProtectedClass extends A {

    public void access(A a) {
        a.i = a.i * 2;
//        a.j won't compile is not accessible
    }

    public void access2(ProtectedVar protectedVar) {
//        protectedVar.i = protectedVar.i * 2; // 'i' has protected access. Won't compile. Can't access through a reference of ProtectedVar
//        protectedVar.getProtectedI() won't compile
    }

    public static void main(String[] args) {
        A a = new ProtectedClass();
        ProtectedClass b = new ProtectedClass();
        b.access(a);
        b.access(b);
        System.out.println(a.getI());
    }
}
