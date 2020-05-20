package lec02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            list.add(sc.nextInt());
        sc.close();
        Collections.sort(list);
        System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
    }
}