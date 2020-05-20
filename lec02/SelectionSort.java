package lec02;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int min_j = i;
            for (int j = i; j < n; j++) {
                if (list[j] < list[min_j])
                    min_j = j;
            }
            if (min_j != i) {
                count++;
                int swap = list[min_j];
                list[min_j] = list[i];
                list[i] = swap;
            }
        }
        for (int i = 0; i < n - 1; i++)
            System.out.print(list[i] + " ");
        System.out.println(list[n - 1]);
        System.out.println(count);
    }
}