package lec08;

public class CalcClient extends Thread {
    Calc calc = null;

    public CalcClient(Calc c) {
        calc = c;
    }

    public void run() {
        while (true) {
            synchronized (calc) {
                calc.increment();
                calc.decrement();
            }
        }
    }

    public static void main(String[] args) {
        Calc c = new Calc();
        new CalcClient(c).start();
        new CalcClient(c).start();
    }
}
