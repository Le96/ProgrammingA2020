package lec04.xtr;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Curling2point0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int W = sc.nextInt();
            int H = sc.nextInt();
            if (W == 0 && H == 0)
                break;
            int[][] board = new int[H][W];
            int initH = -1;
            int initW = -1;
            for (int h = 0; h < H; h++)
                for (int w = 0; w < W; w++) {
                    int buffer = sc.nextInt();
                    if (buffer == 2) {
                        initH = h;
                        initW = w;
                    }
                    board[h][w] = buffer;
                }
            int leastCost = 11;
            Queue<State> queue = new ArrayDeque<>();
            queue.add(new State(1, initH, initW, board));
            while (!queue.isEmpty()) {
                State current = queue.remove();
                if (Math.min(10, leastCost) < current.cost)
                    continue;
                boolean isStopped = false;
                // up
                if (0 < current.initH && current.board[current.initH - 1][current.initW] != 1)
                    for (int h = current.initH; 0 <= h; h--) {
                        switch (current.board[h][current.initW]) {
                            case 0:
                                break;
                            case 1:
                                int[][] newBoard = deepcopy(current.board);
                                newBoard[h][current.initW] = 0;
                                queue.add(new State(current.cost + 1, h + 1, current.initW, newBoard));
                                isStopped = true;
                                break;
                            case 2:
                                break;
                            case 3:
                                leastCost = current.cost;
                                isStopped = true;
                                break;
                        }
                        if (isStopped)
                            break;
                    }
                if (leastCost <= current.cost)
                    break;
                // down
                isStopped = false;
                if (current.initH < H - 1 && current.board[current.initH + 1][current.initW] != 1)
                    for (int h = current.initH; h < H; h++) {
                        switch (current.board[h][current.initW]) {
                            case 0:
                                break;
                            case 1:
                                int[][] newBoard = deepcopy(current.board);
                                newBoard[h][current.initW] = 0;
                                queue.add(new State(current.cost + 1, h - 1, current.initW, newBoard));
                                isStopped = true;
                                break;
                            case 2:
                                break;
                            case 3:
                                leastCost = current.cost;
                                isStopped = true;
                                break;
                        }
                        if (isStopped)
                            break;
                    }
                if (leastCost <= current.cost)
                    break;
                // left
                isStopped = false;
                if (0 < current.initW && current.board[current.initH][current.initW - 1] != 1)
                    for (int w = current.initW; 0 <= w; w--) {
                        switch (current.board[current.initH][w]) {
                            case 0:
                                break;
                            case 1:
                                int[][] newBoard = deepcopy(current.board);
                                newBoard[current.initH][w] = 0;
                                queue.add(new State(current.cost + 1, current.initH, w + 1, newBoard));
                                isStopped = true;
                                break;
                            case 2:
                                break;
                            case 3:
                                leastCost = current.cost;
                                isStopped = true;
                                break;
                        }
                        if (isStopped)
                            break;
                    }
                if (leastCost <= current.cost)
                    break;
                // right
                isStopped = false;
                if (current.initW < W - 1 && current.board[current.initH][current.initW + 1] != 1)
                    for (int w = current.initW; w < W; w++) {
                        switch (current.board[current.initH][w]) {
                            case 0:
                                break;
                            case 1:
                                int[][] newBoard = deepcopy(current.board);
                                newBoard[current.initH][w] = 0;
                                queue.add(new State(current.cost + 1, current.initH, w - 1, newBoard));
                                isStopped = true;
                                break;
                            case 2:
                                break;
                            case 3:
                                leastCost = current.cost;
                                isStopped = true;
                                break;
                        }
                        if (isStopped)
                            break;
                    }
                if (leastCost <= current.cost)
                    break;
            }
            System.out.println(leastCost == 11 ? -1 : leastCost);
        }
        sc.close();
    }

    public static int[][] deepcopy(int[][] original) {
        int[][] copy = new int[original.length][];
        for (int i = 0; i < original.length; i++)
            copy[i] = original[i].clone();
        return copy;
    }
}

class State {
    public int cost;
    public int initH;
    public int initW;
    public int[][] board;

    State(int cost, int initH, int initW, int[][] board) {
        this.cost = cost;
        this.initH = initH;
        this.initW = initW;
        this.board = board;
    }
}