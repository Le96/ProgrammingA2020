package lec04.med;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ICPCScoreTotalizerSoftware {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            List<Integer> s = new ArrayList<>(n);
            for (int i = 0; i < n; i++)
                s.add(sc.nextInt());
            Collections.sort(s);
            List<Integer> trimmed = new ArrayList<>(s.subList(1, s.size() - 1));
            int sum = 0;
            for (int i = 0; i < trimmed.size(); i++)
                sum += trimmed.get(i);
            System.out.println(sum / (n - 2));
        }
        sc.close();
    }
}