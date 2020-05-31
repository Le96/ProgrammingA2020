package lec03.xtr;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Rummy
 */
public class Rummy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int n = 0; n < N; n++) {
            int num[] = new int[9];
            String type[] = new String[9];
            for (int i = 0; i < 9; i++)
                num[i] = sc.nextInt();
            for (int i = 0; i < 9; i++)
                type[i] = sc.next();
            List<Integer> cards = new LinkedList<>();
            for (int i = 0; i < 9; i++) {
                cards.add(num[i]);
                switch (type[i]) {
                    case "R":
                        break;
                    case "G":
                        cards.set(i, cards.get(i) + 10);
                        break;
                    case "B":
                        cards.set(i, cards.get(i) + 20);
                        break;
                }
            }
            Collections.sort(cards);
            System.out.println(dfs(cards) ? 1 : 0);
        }
        sc.close();
    }

    public static Boolean dfs(List<Integer> cards) {
        if (cards.size() == 0)
            return true;
        int target = cards.get(0);
        // Run
        if (cards.contains(target + 1) && cards.contains(target + 2)) {
            List<Integer> newCards = new LinkedList<>(cards);
            newCards.remove(0);
            newCards.remove(newCards.indexOf(target + 1));
            newCards.remove(newCards.indexOf(target + 2));
            if (dfs(newCards))
                return true;
        }
        // Triple
        if (target == cards.get(1) && target == cards.get(2)) {
            List<Integer> newCards = new LinkedList<>(cards);
            newCards.remove(0);
            newCards.remove(0);
            newCards.remove(0);
            if (dfs(newCards))
                return true;
        }
        return false;
    }
}