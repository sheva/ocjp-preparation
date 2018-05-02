package toughToVeryTough;

import sun.plugin.BeansApplet;

class Baap {
    int h = 4;
    public int m1() {
        System.out.println("BAAP  = " + h);
        return h;
    }
}

public class BaapBeta extends Baap {
    int h = 44;
    public int m1() {
        System.out.println("Beta =  " + h);
        return h;
    }

    public static void main(String[] args) {
        Baap b = new BaapBeta();
        System.out.println(b.h + " " + b.m1());
        BaapBeta bb = (BaapBeta)b;
        System.out.println(bb.h + " " + bb.m1());
    }
}
