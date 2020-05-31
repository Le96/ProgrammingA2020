package lec01.beg;

import java.util.Scanner;

/**
 * XCubic
 */
public class XCubic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        System.out.println((int) Math.pow(X, 3));
        sc.close();
    }
}