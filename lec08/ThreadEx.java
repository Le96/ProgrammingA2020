package lec08;

public class ThreadEx {
    public static void main(String[] args) {
        new ThreadXX().start();
        new Thread(new ThreadYY()).start();
    }
}