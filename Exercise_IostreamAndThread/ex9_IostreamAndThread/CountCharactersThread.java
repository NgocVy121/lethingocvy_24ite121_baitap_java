package ex9_IostreamAndThread;

import java.io.*;

public class CountCharactersThread {
    public static void main(String[] args) {
        File fileCountCharacters = new File("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\ex9_IostreamAndThread\\FileDem.txt");
        File fileWrite = new File("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\ex9_IostreamAndThread\\FileGhi.txt");

        Thread countThread = new Thread(() -> countCharacters(fileCountCharacters, fileCountCharacters));
        countThread.start();
    }

    private static void countCharacters(File inputFile, File outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            int charCount = 0;
            int c;
            while ((c = reader.read()) != -1) {
                charCount++;
            }

            String result = "Số ký tự trong file: " + charCount;
            writer.write(result);
            System.out.println("Ghi kết quả số kí tự vào file FileWrite thành công!");
            System.out.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
