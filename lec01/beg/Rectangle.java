package lec01;

import java.util.Scanner;

/**
 * Rectangle
 */
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a * b) + " " + (2 * (a + b)));
        sc.close();
    }

}