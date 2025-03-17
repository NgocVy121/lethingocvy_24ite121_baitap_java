package ex5_IostreamAndThread;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogFileThread {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\ex5_IostreamAndThread\\Log.txt");

        Thread logThread = new Thread(() -> {
            writeLog(file, "Server started...");
            try {
                Thread.sleep(2000);
                writeLog(file, "Đời này có hai loại người. Người này và người kia.");
                Thread.sleep(2000);
                writeLog(file, "Kiếp sau nguyện làm người giàu, quyết không hối tiếc.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        logThread.start();
    }

    private static synchronized void writeLog(File file, String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            writer.write("(" + "[" + timestamp + "] " + message + ")");
            writer.newLine();
            System.out.println("Logged: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
