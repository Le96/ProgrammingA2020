package lec08;

public class Factorial {
    public static int factorial1(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++)
            factorial *= i;
        return factorial;
    }

    public static int factorial2(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial2(n - 1);
    }

    public static int factorial3(int n) {
        if (n == 0 || n == 1)
            return 1;
        int check = factorial3(n - 1);
        if (Integer.MAX_VALUE / check < n)
            throw new RuntimeException();
        return check * n;
    }

    public static void main(String[] args) {
        System.out.println(factorial1(0));
        System.out.println(factorial2(0));
        System.out.println(factorial1(10));
        System.out.println(factorial2(10));
        System.out.println(factorial3(13));
    }
}