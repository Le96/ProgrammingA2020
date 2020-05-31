package lec03.xtr;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * HowManyIslands
 */
public class HowManyIslands {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int W = sc.nextInt();
            int H = sc.nextInt();
            if (W == 0 && H == 0)
                break;
            boolean map[][] = new boolean[H + 2][W + 2];
            for (int h = 1; h <= H; h++)
                for (int w = 1; w <= W; w++)
                    map[h][w] = (sc.nextInt() == 1);
            int connect[][] = new int[H + 2][W + 2];
            int count = 0;
            Queue<List<Integer>> queue = new ArrayDeque<>();
            for (int h = 1; h <= H; h++)
                for (int w = 1; w <= W; w++) {
                    if (!map[h][w] || connect[h][w] != 0)
                        continue;
                    List<Integer> list = new ArrayList<>();
                    list.add(h);
                    list.add(w);
                    queue.add(list);
                    while (!queue.isEmpty()) {
                        List<Integer> target = queue.remove();
                        int height = target.get(0);
                        int width = target.get(1);
                        int here = connect[height][width];
                        if (here == 0)
                            here = ++count;
                        for (int h_ = height - 1; h_ <= height + 1; h_++)
                            for (int w_ = width - 1; w_ <= width + 1; w_++) {
                                if (map[h_][w_] && connect[h_][w_] == 0) {
                                    connect[h_][w_] = here;
                                    List<Integer> newList = new ArrayList<>();
                                    newList.add(h_);
                                    newList.add(w_);
                                    queue.add(newList);
                                }
                            }
                    }
                }
            System.out.println(count);
        }
        sc.close();
    }
}