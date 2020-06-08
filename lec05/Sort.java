package lec05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }

    static int binarySearch(int[] a, int k) {
        List<Integer> a_list = new ArrayList<>();
        for (int item : a)
            a_list.add(item);
        return Collections.binarySearch(a_list, k);
    }

    static void sortArray(int a[]) {
        List<Integer> a_list = new ArrayList<>();
        for (int item : a)
            a_list.add(item);
        Collections.sort(a_list);
        for (int i = 0; i < a.length; i++)
            a[i] = a_list.get(i);
    }

    public static void main(String[] args) {
        int[] array = { 100, 10, 1000, 50, 10000, 999, 5 };
        int key = 10000;
        printArray(array);
        System.out.println(key + " at " + binarySearch(array, key));
        sortArray(array);
        printArray(array);
        System.out.println(key + " at " + binarySearch(array, key));
    }
}
