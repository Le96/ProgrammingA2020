package lec05;

public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public static void main(String[] args) {
        Point a = new Point(100, 10), b = new Point(-5, 20), c = new Point(0, 0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int x_sum = a.x + b.x + c.x;
        int y_sum = a.y + b.y + c.y;
        System.out.println("Sum of x: " + x_sum);
        System.out.println("Sum of y: " + y_sum);
    }
}