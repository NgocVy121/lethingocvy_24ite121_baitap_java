package bai1;

public class PrintNumbers {
    private int number = 1;
    private final int MAX = 10;

    public synchronized void printOdd() {
        while (number <= MAX) {
            while (number % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (number > MAX) break;
            System.out.println(number);
            number++;
            notify();
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            while (number % 2 == 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (number > MAX) break;
            System.out.println(number);
            number++;
            notify();
        }
    }
}


