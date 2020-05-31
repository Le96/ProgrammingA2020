package lec01;

import java.util.Scanner;

/**
 * GreatestCommonDivisor
 */
public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        System.out.println(gcd(x, y));
    }

    private static int gcd(int x, int y) {
        if (x < y)
            return gcd(y, x);
        else if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }
}