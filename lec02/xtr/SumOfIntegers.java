package lec02.xtr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        while (true) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            if (n == 0 && s == 0)
                break;
            int count = 0;
            Stack<List<Integer>> stack = new Stack<>();
            for (int i = 0; i < 10; i++) {
                List<Integer> item = new ArrayList<>();
                item.add(i);
                stack.push(item);
            }
            while (!stack.isEmpty()) {
                List<Integer> item = stack.pop();
                int sum = 0;
                for (int i = 0; i < item.size(); i++)
                    sum += item.get(i);
                if (s <= sum) {
                    count++;
                    continue;
                }
                for (int i = item.get(item.size() - 1) + 1; i < 10; i++) {
                    List<Integer> newItem = new ArrayList<>(item);
                    newItem.add(i);
                    stack.push(newItem);
                }
            }
            result.add(count);
        }
        sc.close();
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
