package ex3_IostreamAndThread;

import java.io.*;

public class CopyFileThread {
    public static void main(String[] args) {
        File fileNguonCopy = new File("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\ex3_IostreamAndThread\\FileNguonEx3.txt");
        File fileDichCopy = new File("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\ex3_IostreamAndThread\\FileDichEx3.txt");

        Thread copyThread = new Thread(() -> copyFile( fileNguonCopy, fileDichCopy ));
        copyThread.start();
    }

    private static void copyFile(File source,File destination) {
        try (BufferedReader reader = new BufferedReader(new FileReader(source.getPath()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destination.getPath()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }
            System.out.println("Copy completed!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
