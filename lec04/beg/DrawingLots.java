package lec04.beg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DrawingLots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> a = new ArrayList<>(n);
        List<Integer> b = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parsed = line.split(",");
            a.add(Integer.parseInt(parsed[0]));
            b.add(Integer.parseInt(parsed[1]));
        }
        sc.close();
        List<Integer> order = new LinkedList<>();
        for (int i = 1; i <= w; i++)
            order.add(i);
        for (int i = 0; i < a.size(); i++)
            Collections.swap(order, a.get(i) - 1, b.get(i) - 1);
        for (int i = 0; i < order.size(); i++)
            System.out.println(order.get(i));
    }
}
