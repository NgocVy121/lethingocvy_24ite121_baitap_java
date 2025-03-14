package btFile.baitap6;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileThreadTest {

    public static void main(String[] args) {
        String[] fileNames = {"C:\\Users\\VY\\IdeaProjects\\iostream\\src\\btFile\\baitap6\\File\\File5.txt", "C:\\Users\\VY\\IdeaProjects\\iostream\\src\\btFile\\baitap6\\File\\File6.txt"}; // Danh sách các file đầu vào
        String outputFile = "C:\\Users\\VY\\IdeaProjects\\iostream\\src\\btFile\\baitap6\\FileOut.txt"; // File đầu ra tổng hợp

        List<String> fileContents = Collections.synchronizedList(new ArrayList<>()); // Danh sách chứa nội dung file (đồng bộ hóa)

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < fileNames.length; i++) {
            final int index = i;
            Thread thread = new Thread(() -> {
                String content = readFile(fileNames[index]);
                if (content != null) {
                    synchronized (fileContents) {
                        fileContents.add(content);
                    }
                }
            });
            threads.add(thread);
            thread.start();
        }

        // Đợi tất cả các thread hoàn thành
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Ghi nội dung vào file đầu ra
        if (writeFile(outputFile, fileContents)) {
            System.out.println("Ghi file thành công vào " + "FileOut.txt");
        }
    }

    // Đọc nội dung từ file
    private static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Lỗi đọc file " + fileName + ": " + e.getMessage());
            return null;
        }
        return content.toString();
    }

    // Ghi nội dung vào file
    private static boolean writeFile(String outputFile, List<String> contents) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String content : contents) {
                writer.write(content);
            }
            return true; //ghi thành công
        } catch (IOException e) {
            System.err.println("Lỗi ghi file " + outputFile + ": " + e.getMessage());
            return false;//ghi thất bại
        }
    }
}