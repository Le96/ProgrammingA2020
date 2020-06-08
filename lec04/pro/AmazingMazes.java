package lec04.pro;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class AmazingMazes {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        while (true) {
            final int w = sc.nextInt();
            final int h = sc.nextInt();
            if (w == 0 && h == 0)
                break;
            List<List<Boolean>> vertical = new ArrayList<>(h); // h * w-1
            List<List<Boolean>> horizontal = new ArrayList<>(h - 1); // h-1 * w
            List<Boolean> buffer = new ArrayList<>();
            for (int i = 0; i < w - 1; i++)
                buffer.add(sc.nextInt() == 1);
            vertical.add(buffer);
            for (int i = 0; i < h - 1; i++) {
                buffer = new ArrayList<>();
                for (int j = 0; j < w; j++)
                    buffer.add(sc.nextInt() == 1);
                horizontal.add(buffer);
                buffer = new ArrayList<>();
                for (int j = 0; j < w - 1; j++)
                    buffer.add(sc.nextInt() == 1);
                vertical.add(buffer);
            }
            int[][] maze = new int[h][w];
            Queue<List<Integer>> queue = new ArrayDeque<>();
            List<Integer> initial = new ArrayList<>();
            initial.add(0);
            initial.add(0);
            initial.add(1);
            queue.add(initial);
            while (!queue.isEmpty()) {
                List<Integer> current = queue.remove();
                int cur_h = current.get(0);
                int cur_w = current.get(1);
                int cur_cost = current.get(2);
                if (maze[cur_h][cur_w] != 0 && maze[cur_h][cur_w] <= cur_cost)
                    continue;
                maze[cur_h][cur_w] = cur_cost;
                // up
                if (0 < cur_h && !(horizontal.get(cur_h - 1)).get(cur_w)) {
                    List<Integer> newState = new ArrayList<>();
                    newState.add(cur_h - 1);
                    newState.add(cur_w);
                    newState.add(cur_cost + 1);
                    queue.add(newState);
                }
                // down
                if (cur_h < h - 1 && !(horizontal.get(cur_h)).get(cur_w)) {
                    List<Integer> newState = new ArrayList<>();
                    newState.add(cur_h + 1);
                    newState.add(cur_w);
                    newState.add(cur_cost + 1);
                    queue.add(newState);
                }
                // left
                if (0 < cur_w && !(vertical.get(cur_h)).get(cur_w - 1)) {
                    List<Integer> newState = new ArrayList<>();
                    newState.add(cur_h);
                    newState.add(cur_w - 1);
                    newState.add(cur_cost + 1);
                    queue.add(newState);
                }
                // right
                if (cur_w < w - 1 && !(vertical.get(cur_h)).get(cur_w)) {
                    List<Integer> newState = new ArrayList<>();
                    newState.add(cur_h);
                    newState.add(cur_w + 1);
                    newState.add(cur_cost + 1);
                    queue.add(newState);
                }
            }
            System.out.println(maze[h - 1][w - 1]);
        }
        sc.close();
    }
}
