package lec02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = sc.nextInt();
        // bubblesort
        int count = 0;
        boolean rejected = true;
        while (rejected) {
            rejected = false;
            for (int i = n - 1; 0 < i; i--) {
                if (list[i] < list[i - 1]) {
                    rejected = true;
                    count++;
                    int swap = list[i - 1];
                    list[i - 1] = list[i];
                    list[i] = swap;
                }
                if (rejected)
                    break;
            }
        }
        for (int i = 0; i < n - 1; i++)
            System.out.print(list[i] + " ");
        System.out.println(list[n - 1]);
        System.out.println(count);
    }
}