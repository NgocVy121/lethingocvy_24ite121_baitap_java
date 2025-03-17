package ex2_IostreamAndThread;

import java.io.*;

public class WriteFileThread {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\ex2_IostreamAndThread\\Write.txt");

        // Xóa nội dung cũ trước khi ghi mới
        clearFile(file);

        Runnable writeTask1 = () -> writeToFile(file, "Thread 1 is writing hi!\n");
        Runnable writeTask2 = () -> writeToFile(file, "Thread 2 is writing hello!\n");

        Thread writeThread1 = new Thread(writeTask1);
        Thread writeThread2 = new Thread(writeTask2);

        writeThread1.start();
        writeThread2.start();

        try {
            writeThread1.join();
            writeThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ghi File xong");
    }

    private static synchronized void writeToFile(File file, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(data);
            System.out.println("Written: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void clearFile(File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(""); // Ghi chuỗi rỗng để xóa file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
