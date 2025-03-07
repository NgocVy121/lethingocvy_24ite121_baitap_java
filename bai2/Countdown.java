package bai2;

public class Countdown extends Thread{
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Dừng 1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

