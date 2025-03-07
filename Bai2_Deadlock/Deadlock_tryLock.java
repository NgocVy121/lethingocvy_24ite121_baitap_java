package Bai2_Deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Deadlock_tryLock {
    static final Lock lockA = new ReentrantLock();
    static final Lock lockB = new ReentrantLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                if (lockA.tryLock()) { // Thử khóa lockA
                    try {
                        Thread.sleep(50); // Giả lập thời gian xử lý
                        if (lockB.tryLock()) { // Thử khóa lockB
                            try {
                                System.out.println("Thread 1: Locked both resources");
                                return; // Thoát sau khi hoàn thành
                            } finally {
                                lockB.unlock(); // Nhả lockB
                            }
                        }
                    } catch (InterruptedException ignored) {}
                    finally {
                        lockA.unlock(); // Nhả lockA nếu không lấy được lockB
                    }
                }
                try { Thread.sleep(50); } catch (InterruptedException ignored) {} // Đợi một chút rồi thử lại
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                if (lockB.tryLock()) { // Thử khóa lockB
                    try {
                        Thread.sleep(50);
                        if (lockA.tryLock()) { // Thử khóa lockA
                            try {
                                System.out.println("Thread 2: Locked both resources");
                                return;
                            } finally {
                                lockA.unlock(); // Nhả lockA
                            }
                        }
                    } catch (InterruptedException ignored) {}
                    finally {
                        lockB.unlock(); // Nhả lockB nếu không lấy được lockA
                    }
                }
                try { Thread.sleep(50); } catch (InterruptedException ignored) {} // Đợi một chút rồi thử lại
            }
        });

        t1.start();
        t2.start();
    }
}
