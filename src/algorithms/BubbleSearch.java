package algorithms;

import java.util.Arrays;

public class BubbleSearch {

    public static int[] bubbleSearch(int[] items) {
        int sorted = 0;
        while (sorted < items.length - 1) {
            sorted = 0;
            for (int i = 0; i < items.length - 1; i++) {
                if (items[i] > items[i + 1]) {
                    int temp = items[i + 1];
                    items[i + 1] = items[i];
                    items[i] = temp;
                } else {
                    sorted++;
                }
            }
        }
        return items;
    }

    public static void main(String... args) {
        int[] items = {5,1,4,2,8};
        System.out.println(Arrays.toString(bubbleSearch(items)));
    }
}
