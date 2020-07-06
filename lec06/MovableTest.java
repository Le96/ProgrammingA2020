package lec06;

/**
 * MovableTest
 */
public class MovableTest {
    public static void main(String[] args) {
        Movable m1 = new Animal();
        Movable m2 = new Robot();
        m2.move();
        m1.move();
        m2.move();
    }
}