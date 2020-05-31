package lec03.pro;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Dictionary
 */
public class Dictionary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> dict = new HashSet<>();
        for (int n = 0; n < N; n++) {
            String instruction = sc.next();
            String word = sc.next();
            if ("insert".equals(instruction))
                dict.add(word);
            else
                System.out.println(dict.contains(word) ? "yes" : "no");
        }
        sc.close();
    }
}