package lec04.beg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            int sum = 0;
            List<Integer> s = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                int buf = sc.nextInt();
                s.add(buf);
                sum += buf;
            }
            double avg = (double) sum / n;
            double sd = 0;
            for (int i = 0; i < n; i++)
                sd += Math.pow((s.get(i) - avg), 2);
            sd = Math.sqrt(sd / n);
            System.out.println(sd);
        }
        sc.close();
    }
}