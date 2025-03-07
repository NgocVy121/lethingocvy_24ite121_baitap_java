package Bai2_Deadlock;

public class DeadlockExample {
    static final Object resourceA = new Object();
    static final Object resourceB = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (resourceA) {
                System.out.println("Thread 1: Locked resource 1");

                try { Thread.sleep(100); } catch (InterruptedException ignored) {}

                synchronized (resourceB) {
                    System.out.println("Thread 1: Locked resource 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resourceB) {
                System.out.println("Thread 2: Locked resource 2");

                try { Thread.sleep(100); } catch (InterruptedException ignored) {}

                synchronized (resourceA) {
                    System.out.println("Thread 2: Locked resource 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
