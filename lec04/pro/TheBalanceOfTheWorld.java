package lec04.pro;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TheBalanceOfTheWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine();
            if (".".equals(line))
                break;
            Deque<Integer> stack = new ArrayDeque<>();
            boolean isBalanced = true;
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                switch (c) {
                    case '(':
                        stack.push(0);
                        break;
                    case ')':
                        if (stack.isEmpty() || stack.pop() != 0)
                            isBalanced = false;
                        break;
                    case '[':
                        stack.push(1);
                        break;
                    case ']':
                        if (stack.isEmpty() || stack.pop() != 1)
                            isBalanced = false;
                        break;
                    default:
                        break;
                }
                if (!isBalanced)
                    break;
            }
            if (!stack.isEmpty())
                isBalanced = false;
            System.out.println(isBalanced ? "yes" : "no");
        }
        sc.close();
    }
}