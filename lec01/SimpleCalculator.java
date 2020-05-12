package lec01;

import java.util.Scanner;

/**
 * SimpleCalculator
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            switch (op) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println((int) (a / b));
                    break;
                default:
                    sc.close();
                    System.exit(0);
            }
        }
    }
}