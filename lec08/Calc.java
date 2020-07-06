package lec08;

class Calc {
    int value = 0;

    void increment() {
        value++;
        System.out.println(Thread.currentThread() + ": " + value);
    }

    void decrement() {
        value--;
        System.out.println(Thread.currentThread() + ": " + value);
    }
}