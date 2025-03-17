package ex7_IostreamAndThread;

import java.io.*;
import java.util.Scanner;

public class InputFileThread {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\ex7_IostreamAndThread\\InputFile.txt");

        Thread inputThread = new Thread(() -> writeFromKeyboard(file));
        inputThread.start();
    }

    private static void writeFromKeyboard(File file) {
        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {

            System.out.println("Nhập dữ liệu (gõ 'exit' để dừng):");

            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) break;

                writer.write(input);
                writer.newLine();
                writer.flush(); // Đảm bảo ghi ngay vào file
            }

            System.out.println("Ghi dữ liệu hoàn tất!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
