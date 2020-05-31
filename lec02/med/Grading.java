package lec02.med;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int mid = sc.nextInt();
            int fin = sc.nextInt();
            int re = sc.nextInt();
            if (mid == -1 && fin == -1 && re == -1)
                break;
            int merge = mid + fin;
            if (mid == -1 || fin == -1)
                System.out.println("F");
            else if (80 <= merge)
                System.out.println("A");
            else if (65 <= merge)
                System.out.println("B");
            else if (50 <= merge || 50 <= re)
                System.out.println("C");
            else if (30 <= merge)
                System.out.println("D");
            else
                System.out.println("F");
        }
        sc.close();
    }
}