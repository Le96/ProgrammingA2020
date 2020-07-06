package lec08;

public class ThreadXX extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println("XX");
        }
    }
}