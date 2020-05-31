package lec02.beg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintTestCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true) {
            int buf = sc.nextInt();
            if (buf == 0)
                break;
            else
                list.add(buf);
        }
        sc.close();
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Case " + (i + 1) + ": " + list.get(i));
        }
    }
}