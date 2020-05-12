package lec01;

import java.util.BitSet;
import java.util.Scanner;

/**
 * BinarySearch
 */
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BitSet S = new BitSet();
        for (int n = 0; n < N; n++)
            S.set(sc.nextInt());
        int Q = sc.nextInt();
        BitSet T = new BitSet();
        for (int q = 0; q < Q; q++)
            T.set(sc.nextInt());
        sc.close();
        T.and(S);
        System.out.println(T.cardinality());
    }
}