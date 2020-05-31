package lec03.beg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int n = 0; n < N; n++)
            list.add(sc.nextInt());
        sc.close();
        for (int n = N - 1; 0 < n; n--)
            System.out.print(list.get(n) + " ");
        System.out.println(list.get(0));
    }
}