package lec03.med;

import java.util.Scanner;

public class OfficialHouse {
    public static void main(String[] args) {
        String delim = "####################";
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int house[][][] = new int[4][3][10];
        for (int n = 0; n < N; n++) {
            int b = sc.nextInt() - 1;
            int f = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            int v = sc.nextInt();
            house[b][f][r] += v;
        }
        sc.close();
        for (int b = 0; b < 4; b++) {
            for (int f = 0; f < 3; f++) {
                for (int r = 0; r < 10; r++)
                    System.out.print(" " + house[b][f][r]);
                System.out.println();
            }
            if (b != 3)
                System.out.println(delim);
        }
    }
}