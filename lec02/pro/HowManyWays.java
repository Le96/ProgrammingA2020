package lec02.pro;

import java.util.Scanner;

public class HowManyWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int cand = 0;
            if (n == 0 && x == 0)
                break;
            for (int a = 1; a <= n - 2; a++)
                for (int b = a + 1; b <= n - 1; b++) {
                    int c = x - a - b;
                    if (0 < c && c <= n && b < c)
                        cand++;
                }
            System.out.println(cand);
        }
        sc.close();
    }
}