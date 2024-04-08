package huh.projects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        System.out.println("Unsorted array: " + Arrays.toString(array));
//        BubbleSort.sort(array);
//        InsertionSort.sort(array);
        SelectionSort.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}