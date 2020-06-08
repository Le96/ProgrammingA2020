package lec05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorter {
    int[] values;

    Sorter(int[] values) {
        this.values = values;
    }

    void printArray() {
        for (int i = 0; i < this.values.length; i++) {
            System.out.print(this.values[i] + ", ");
        }
        System.out.println();
    }

    int binarySearch(int k) {
        List<Integer> list = new ArrayList<>();
        for (int item : this.values)
            list.add(item);
        return Collections.binarySearch(list, k);
    }

    void sortArray() {
        List<Integer> list = new ArrayList<>();
        for (int item : this.values)
            list.add(item);
        Collections.sort(list);
        for (int i = 0; i < this.values.length; i++)
            this.values[i] = list.get(i);
    }

    public static void main(String[] args) {
        int[] array = { 100, 10, 1000, 50, 10000, 999, 5 };
        int key = 10000;
        Sorter instance = new Sorter(array);
        instance.printArray();
        System.out.println(key + " at " + instance.binarySearch(key));
        instance.sortArray();
        instance.printArray();
        System.out.println(key + " at " + instance.binarySearch(key));

    }

}
