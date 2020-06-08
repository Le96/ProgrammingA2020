package lec04.med;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HanafudaShuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            if (n == 0 && r == 0)
                break;
            List<Integer> deck = new LinkedList<>();
            for (int i = n; 0 < i; i--)
                deck.add(i);
            for (int i = 0; i < r; i++) {
                int p = sc.nextInt();
                int c = sc.nextInt();
                List<Integer> subdeck = new LinkedList<>(deck.subList(p - 1, p - 1 + c));
                for (int j = 0; j < c; j++)
                    deck.remove(p - 1);
                deck.addAll(0, subdeck);
            }
            System.out.println(deck.get(0));
        }
        sc.close();
    }
}