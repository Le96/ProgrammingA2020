package lec04.beg;

import java.util.Scanner;

public class TogglingCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (Character.isLowerCase(c))
                    sb.append(Character.toUpperCase(c));
                else
                    sb.append(Character.toLowerCase(c));
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}