package lec02;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SevenPuzzle {
    public static void main(String[] args) {
        Queue<List<Integer>> queue = new ArrayDeque<>();
        Map<String, Integer> map = new HashMap<>();
        List<Integer> init_status = new ArrayList<>();
        for (int i = 0; i < 8; i++)
            init_status.add(i);
        init_status.add(0); // score
        queue.add(init_status);
        while (!queue.isEmpty()) {
            List<Integer> status = queue.remove();
            String status_code = status.subList(0, 8).toString();
            if (map.containsKey(status_code))
                continue;
            else
                map.put(status_code, status.get(8));
            status.set(8, status.get(8) + 1);
            int zero_index = status.indexOf(0);
            if (3 < zero_index)
                queue.add(up(status, zero_index));
            else
                queue.add(down(status, zero_index));
            if (zero_index % 4 != 0)
                queue.add(left(status, zero_index));
            if (zero_index % 4 != 3)
                queue.add(right(status, zero_index));
        }
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            List<Integer> target = new ArrayList<>();
            for (int i = 0; i < 8; i++)
                target.add(sc.nextInt());
            System.out.println(map.get(target.toString()));
        }
    }

    private static List<Integer> up(List<Integer> status, int zero_index) {
        List<Integer> newStatus = new ArrayList<>(status);
        swap(newStatus, zero_index, zero_index - 4);
        return newStatus;
    }

    private static List<Integer> down(List<Integer> status, int zero_index) {
        List<Integer> newStatus = new ArrayList<>(status);
        swap(newStatus, zero_index, zero_index + 4);
        return newStatus;
    }

    private static List<Integer> left(List<Integer> status, int zero_index) {
        List<Integer> newStatus = new ArrayList<>(status);
        swap(newStatus, zero_index, zero_index - 1);
        return newStatus;
    }

    private static List<Integer> right(List<Integer> status, int zero_index) {
        List<Integer> newStatus = new ArrayList<>(status);
        swap(newStatus, zero_index, zero_index + 1);
        return newStatus;
    }

    private static void swap(List<Integer> status, int a, int b) {
        int val_a = status.get(a);
        int val_b = status.get(b);
        status.set(a, val_b);
        status.set(b, val_a);
    }
}