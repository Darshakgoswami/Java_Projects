package Multithreading;

// Multiplication table of a number
class Table {
    synchronized void multiply(int n) {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(n * i);
        }
    }
}

// Thread_5 extending Thread class
class Thread_5 extends Thread {
    // Call by reference
    Table t;

    public Thread_5(Table t) {
        this.t = t;
    }

    public void run() {
        t.multiply(2);
    }
}

// Thread_6 extending Thread class
class Thread_6 extends Thread {
    // Call by reference
    Table t;

    public Thread_6(Table t) {
        this.t = t;
    }

    public void run() {
        t.multiply(5);
    }
}

// Main class
public class Multithread_Program {
    public static void main(String[] args) {
        Table t = new Table();

        Thread_5 t1 = new Thread_5(t);
        Thread_6 t2 = new Thread_6(t);

        t1.start();
        t2.start();
    }
}