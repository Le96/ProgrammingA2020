package lec02.med;

import java.util.Scanner;

public class PrintAFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int height = sc.nextInt();
            int width = sc.nextInt();
            if (height == 0 && width == 0)
                break;
            for (int w = 0; w < width; w++)
                System.out.print("#");
            System.out.println();
            for (int h = 1; h < height - 1; h++) {
                System.out.print("#");
                for (int w = 1; w < width - 1; w++)
                    System.out.print(".");
                System.out.println("#");
            }
            for (int w = 0; w < width; w++)
                System.out.print("#");
            System.out.println();
            System.out.println();
        }
        sc.close();
    }
}