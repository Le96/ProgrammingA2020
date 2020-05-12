package lec01;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Circle
 */
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = Double.parseDouble(sc.next());
        System.out.println(BigDecimal.valueOf(r * r * Math.PI).toPlainString() + " "
                + BigDecimal.valueOf(2 * r * Math.PI).toPlainString());
        sc.close();
    }
}