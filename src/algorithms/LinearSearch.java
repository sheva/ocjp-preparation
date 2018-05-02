package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearSearch {

    public static int search(int[] arr, int key) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] arr, int key) {

        int minIndex = 0;
        int maxIndex = arr.length - 1;
        int currentIndex;
        int position = -1;

        while (minIndex <= maxIndex) {
            currentIndex = (minIndex + maxIndex) / 2;
            if (arr[currentIndex] < key) {
                minIndex = currentIndex + 1;
            } else if (arr[currentIndex] > key) {
                maxIndex = currentIndex - 1;
            } else {
                position = currentIndex;
                break;
            }

        }

        return position;
    }

    public static void bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                int temp;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return;
    }


    static class Tree {
        int key;
        Tree left;
        Tree right;

        Tree(int key) {
            this.key = key;
        }

        Tree(int key, Tree left, Tree right) {
            this.key = key;
            this.left = left;
            this.right = right;
        }

        void setLeft(Tree left) {
            this.left = left;
        }

        void setRight(Tree right) {
            this.right = right;
        }

        void visitNode(List placeToStore) {

            if (left != null) {
                left.visitNode(placeToStore);
            }

            placeToStore.add(key);

            if(right != null) {
                right.visitNode(placeToStore);
            }
        }
    }

    private static void insert(Tree tree, int cur) {
        if (tree.key <= cur) {
            if (tree.right != null) {
                insert(tree.right, cur);
            } else {
                Tree rightTree = new Tree(cur);
                tree.right = rightTree;
            }
        } else {
            if (tree.left != null) {
                insert(tree.left, cur);
            } else {
                Tree leftTree = new Tree(cur);
                tree.left = leftTree;
            }
        }
    }

    private static Tree createTree(int [] arr){
        Tree result = new Tree(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            insert(result, arr[i]);
        }

        return result;
    }

    public static List sortWithBinaryTree(int[] arr) {
        Tree sortedTree = createTree(arr);

        Tree node = sortedTree;

        List list = new ArrayList();
        node.visitNode(list);

        return list;
    }

//    public static Tree searchInTheTree() {
//
//    }

    private static void sortQuickHelp(int[] arr) {
        int minIndex = 0;
        int maxIndex = arr.length - 1;
        int pivot = arr[minIndex];

        for (int i = minIndex; i < maxIndex; i++) {
            if (pivot > arr[maxIndex]) {

                int temp = arr[maxIndex];
                arr[minIndex] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }
    }

    public static void quickSortAsc(int[] arr) {

        int minIndex = 0;
        int maxIndex = arr.length - 1;
        int pivot = 0;

        while (minIndex <= maxIndex) {
            if (arr[pivot] > arr[maxIndex]) {

            }
        }

        return;
    }


    public static void main(String... args) {
//        int [] arr = {78, 5666, 445, 3, 2, 878, 8, 3, 47, 0, -234, -56};
//        int position = search(arr, 8);
//        System.out.println("Search  " + ((position > 0) ? position : " not found"));
//
//        int []arr2 = {1,5,9,10,56,88};
//        position = binarySearch(arr2, 56);
//        System.out.println("Search  " + ((position > 0) ? position : " not found"));
//
//        int [] arr3 = {78, 5666, 445, 3, 2, 878, 8, 3, 47, 0, -234, -56};
//        bubbleSort(arr3);

        int [] arr4 = {4, 2, 5, 1, 3, 6};

        sortWithBinaryTree(arr4);
       // quickSortAsc(arr4);
    }
}
