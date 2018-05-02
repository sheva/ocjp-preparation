package collections;

import javaBasics.ArrayList;

import java.util.Arrays;
import java.util.List;

public class SortingOrders {

    public static void main(String[] args) {
        String[] atr = {"ff ","f f", " ", "AA", "%", "f", "F"};
        Arrays.sort(atr);
        for (String s : atr){
            System.out.println(s);
        }
    }
}
