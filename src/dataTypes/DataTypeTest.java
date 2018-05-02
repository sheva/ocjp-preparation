package dataTypes;

public class DataTypeTest {
    static byte b = -128;     // Perfectly legal byte value (-128 \ 127)
    static int i;

    static char charNull;


    public static void main(String[] args) {

        i = b;
        b = (byte) i;
        System.out.println(i + " " + b);

        System.out.println(Byte.MAX_VALUE); // 127
        System.out.println(Byte.MIN_VALUE); // -128


        System.out.println(-129);       //  -129 (by default us int)
        System.out.println((byte) -159);  // 127
        System.out.println((byte) (Byte.MAX_VALUE + 1));  // -128
        System.out.println((byte) (Byte.MAX_VALUE + 2));  // -127
        System.out.println((byte) (Byte.MIN_VALUE - 1));  // 127
        System.out.println((byte) (Byte.MIN_VALUE - 2));  // 126
        System.out.println((byte)-256);                   // 0
        System.out.println((byte) (Byte.MIN_VALUE*2-1));  // -1

        System.out.println(Short.MAX_VALUE); // 32767
        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println((byte)Short.MIN_VALUE);        // 0
        System.out.println((byte)Short.MIN_VALUE - 128);        // -128
        System.out.println((byte)Short.MAX_VALUE);        // -1
        System.out.println((byte)(Short.MAX_VALUE + 128));// 127

        System.out.println("jhjhjh"+~Integer.MAX_VALUE);        //  -2147483648
        System.out.println(Integer.MAX_VALUE + 2);        //  -2147483647
        System.out.println((long)(Integer.MAX_VALUE + 1));//  -2147483648
        System.out.println((long)Integer.MAX_VALUE + 1);  //   2147483648

        System.out.println(Integer.MIN_VALUE -1);         //   2147483647
        System.out.println(Integer.MIN_VALUE -2);         //   2147483646
        System.out.println((long)(Integer.MIN_VALUE -1) );//   2147483647
        System.out.println((long)Integer.MIN_VALUE - 1 ); //  -2147483649


        System.out.println(charNull);

        float fl = 123.56f;
        float fF = 123.56F;
        double d1 = 123.56;
        double d2 = 123.56D;
        double d3 = 123.56d;
        double d4 = 123e3;

        System.out.println(d4);  // 123000.0
        d4 = 12.3e3;
        System.out.println(d4);  // 12300.0

        byte hex = 0x3A, dec = 123, bol = 0b010100, oct = 034;
        System.out.println(hex + " " + dec + " " + bol);    // 58 123 20

        hex = 0x3_A;
        dec = 12_3;
        bol = 0b010_100;
        oct = 023;
        System.out.println(hex + " " + dec + " " + bol + " " + oct);   // 58 123 20


        /* Illegal underscore*/
        // bol = _0b010100;
        // bol = 0b_010100;
        // bol = 0b010100_;

        // OK (decimal literal)
        int x3 = 5_______2;
        float f1 = 32; // 32 is int
        //float f2 = 32.0; // 32.0 is a double, should be explicitly cast to float

       // byte b444 = 320; // out of range, should be cast
       float ff = 13.4f/23.4f; // It is ok, 2 numbers are float, so the result will be float

        int a1,a2,a3; a1=a2=a3=3;
        // int  a1=a2=a3=3; ILLEGAL!!!


        // new Short(4);// Compile error
        new Short((short) 4); // OK!

        new Long(5);
        new Byte((byte)5);
        new Character((char)5);
        new Long(2);
        new Float(2);
        new Double(2);

        short s = new Short((short) 3);
        // (s instanceof Short) --> Inconvertible types


        Short s2 = s;
        System.out.println(s2 instanceof Short); // ok!
        // System.out.println(s2 instanceof Exception);  // Compilation error: inconvertible types!

        Integer i = 45;
        System.out.println(i == s);    // ok!


        int i1 =1, i2, i3=3, i4;
        i4 = i1 + (i2 = i3);
        int hjhj = 1/0;
        int[] nmn = new int[]{3,5};
        int[] dffg = new int[3];
        int[][] mmm = {{384}};
        int[][] msss = new int[2][];
        int[][]fdgdfgd = new int[2][];

        boolean dffgrt = true, ggg;
        ggg = dffgrt == false;

    }
}
