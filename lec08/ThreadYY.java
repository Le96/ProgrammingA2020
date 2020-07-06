package lec08;

public class ThreadYY implements Runnable {
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            System.out.println("YY");
        }
    }
}