package lec03.med;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String initial = sc.next();
            if ("-".equals(initial))
                break;
            int M = sc.nextInt();
            List<Integer> h = new ArrayList<>();
            for (int m = 0; m < M; m++)
                h.add(sc.nextInt());
            StringBuilder shuffle = new StringBuilder();
            shuffle.append(initial);
            for (int m = 0; m < M; m++)
                shuffle = shuffle.append(shuffle.substring(0, h.get(m))).delete(0, h.get(m));
            System.out.println(shuffle.toString());
        }
        sc.close();
    }
}