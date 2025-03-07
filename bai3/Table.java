package bai3;

import java.util.LinkedList;
import java.util.Queue;

public class Table {
    private final int CAPACITY = 5;
    private final Queue<Integer> table = new LinkedList<>();
    private int foodId = 1;

    public synchronized void cook() {
        while (true) {
            try {
                while (table.size() == CAPACITY) { // Bàn đầy -> dừng nấu
                    wait();
                }
                Thread.sleep(2000); // Mất 2s để nấu
                table.add(foodId);
                System.out.println("Đầu bếp nấu xong món " + foodId);
                foodId++;
                notify(); // Đánh thức khách hàng
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void eat() {
        while (true) {
            try {
                while (table.isEmpty()) { // Bàn trống -> đợi
                    wait();
                }
                Thread.sleep(3000); // Mất 3s để ăn
                int food = table.poll();
                System.out.println("Khách hàng ăn xong món " + food);
                notify(); // Đánh thức đầu bếp
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
