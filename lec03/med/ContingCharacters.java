package lec03.med;

import java.util.Scanner;

/**
 * ContingCharacters
 */
public class ContingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] map = new int[26];
        while (sc.hasNext()) {
            String word = sc.next().toLowerCase();
            for (int i = 0; i < word.length(); i++) {
                char target = word.charAt(i);
                if (Character.isLowerCase(target)) {
                    map[(int) (target - 'a')] += 1;
                }
            }
        }
        sc.close();
        for (int i = 0; i < 26; i++)
            System.out.println((char) (i + 'a') + " : " + map[i]);
    }
}