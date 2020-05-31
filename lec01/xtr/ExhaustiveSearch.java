package lec01.xtr;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

/**
 * ExhaustiveSearch
 */
public class ExhaustiveSearch {
    private static final int M_MAX = 2000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> A = new ArrayList<>(N);
        for (int n = 0; n < N; n++)
            A.add(sc.nextInt());
        int Q = sc.nextInt();
        List<Integer> M = new ArrayList<>(Q);
        for (int q = 0; q < Q; q++)
            M.add(sc.nextInt());
        sc.close();
        BitSet bs = new BitSet();
        bs.set(0); // initialize
        bs = dynamic_programming(bs, A);
        for (Integer m : M)
            System.out.println(bs.get(m) ? "yes" : "no");
    }

    private static BitSet dynamic_programming(BitSet bs, List<Integer> A) {
        for (Integer a : A) {
            BitSet newBS = (BitSet) bs.clone();
            bs.stream().forEach(index -> newBS.set(index + a));
            bs = newBS.get(0, M_MAX + 1);
        }
        return bs;
    }
}