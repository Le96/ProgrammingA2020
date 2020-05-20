package lec02;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String buf = sc.nextLine();
            if ("0".equals(buf))
                break;
            int sum = 0;
            for (int i = 0; i < buf.length(); i++) {
                sum += Integer.parseInt(buf.substring(i, i + 1));
            }
            System.out.println(sum);
        }
    }
}