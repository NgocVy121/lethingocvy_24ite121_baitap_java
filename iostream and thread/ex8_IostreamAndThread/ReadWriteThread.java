package ex8_IostreamAndThread;

import java.io.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ReadWriteThread {
    static BlockingQueue<String> queue = new LinkedBlockingQueue<>();

    static class Reader extends Thread {
        private String source;

        public Reader(String source) {
            this.source = source;
        }

        @Override
        public void run() {
            try (BufferedReader br = new BufferedReader(new FileReader(source))) {
                String line;
                while ((line = br.readLine()) != null) {
                    queue.put(line);
                }
                queue.put("END");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static class Writer extends Thread {
        private String destination;

        public Writer(String destination) {
            this.destination = destination;
        }

        @Override
        public void run() {
            try (FileWriter fw = new FileWriter(destination)) {
                while (true) {
                    String line = queue.take();
                    if (line.equals("END")) break;
                    fw.write(line + "\n");
                }
                System.out.println("Ghi vào FileDich thành công!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Reader reader = new Reader("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\ex8_IostreamAndThread\\FileNguon.txt");
        Writer writer = new Writer("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\ex8_IostreamAndThread\\FileDich.txt");
        reader.start();
        writer.start();
    }
}

