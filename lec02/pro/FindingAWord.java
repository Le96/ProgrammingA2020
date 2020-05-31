package lec02.pro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindingAWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next().toUpperCase();
        List<String> T = new ArrayList<>();
        while (true) {
            String word = sc.next();
            if ("END_OF_TEXT".equals(word))
                break;
            T.add(word.toUpperCase());
        }
        sc.close();
        int count = 0;
        for (String t : T) {
            if (w.equals(t))
                count++;
        }
        System.out.println(count);
    }
}