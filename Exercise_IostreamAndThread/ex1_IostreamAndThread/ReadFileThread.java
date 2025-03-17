package ex1_IostreamAndThread;

import java.io.*;

public class ReadFileThread {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\ex1_IostreamAndThread\\Read.txt");

        Thread readThread = new Thread(()->{
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("Read: " + line);
                    Thread.sleep(500);
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        });

        readThread.start();
    }
}
