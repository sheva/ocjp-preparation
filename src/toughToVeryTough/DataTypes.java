package toughToVeryTough;

public class DataTypes {

    public static void main(Object[] args) {
        double x = 0xb011_11; // Perfectly legal treated as hexadecimal digit ('b' is valid hex symbol)
        float x2 = 0b10_000;
        // float x3 = 0b102_00; // '2' is invalid for boolean digits
        //float x4 = 0b1_00_0f;   // float is only for decimal digits
        float x5 = 0x3_00_0f;  // 'f' interpreted as a 'f' hexadecimal digit;
        //double x6 = 0b001_001D; // it is a binary number and D,d,f,F is illegal
        long x7 = 0b0010110L; // Is legal binary long number
    }
}
