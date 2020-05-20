package lec02;

import java.util.Scanner;

public class PrintARectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int height = sc.nextInt();
            int width = sc.nextInt();
            if (height == 0 && width == 0)
                break;
            for (int h = 0; h < height; h++) {
                for (int w = 0; w < width; w++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}