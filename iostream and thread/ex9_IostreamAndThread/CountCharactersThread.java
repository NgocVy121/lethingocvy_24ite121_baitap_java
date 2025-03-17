package ex9_IostreamAndThread;

import java.io.*;

public class CountCharactersThread {
    public static void main(String[] args) {
        File fileCountCharacters = new File("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\ex9_IostreamAndThread\\FileDem.txt");
        File fileWrite = new File("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\ex9_IostreamAndThread\\FileGhi.txt");

        Thread countThread = new Thread(() -> countCharacters(fileCountCharacters, fileWrite));
        countThread.start();
    }

    private static void countCharacters(File inputFile, File outputFile) {
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            while (reader.read() != -1) {
                charCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ghi kết quả vào file output
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("Số ký tự trong file: " + charCount);
            System.out.println("Kết quả đã được ghi vào " + outputFile.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
