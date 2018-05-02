package javaBasics;

public class MethodParams {
    int a = 1;
    String s = "s";

    void method(final int a, String s){
        this.a = a;
        this.s = s;
        System.out.println("#1 a =  " +  a  + " s = " + s);
        System.out.println("#2 a =  " +  this.a  + " s = " + this.s);
    }

    public static void main(String[] args) {
        MethodParams me=new MethodParams();
        String s2 = "fff";
        me.method(2, s2);
        System.out.println("#3 a =  " +  me.a  + " s = " + me.s);
    }
}
