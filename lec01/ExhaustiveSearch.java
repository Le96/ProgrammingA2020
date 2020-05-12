package lec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ExhaustiveSearch
 */
public class ExhaustiveSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int n = 0; n < N; n++)
            A.add(sc.nextInt());
        int M = sc.nextInt();
        for (int m = 0; m < M; m++) {
            System.out.println(dfs(A, sc.nextInt()) ? "yes" : "no");
        }
        sc.close();
    }

    private static boolean dfs(List<Integer> A, int q) {
        int trial = q - A.get(0);
        if (trial == 0)
            return true;
        else if (trial < 0)
            return false;
        else {
            for (int start = 1; start < A.size(); start++) {
                List<Integer> subA = A.subList(start, A.size());
                if (dfs(subA, q))
                    return true;
                else if (dfs(subA, trial))
                    return true;
            }
        }
        return false;
    }
}