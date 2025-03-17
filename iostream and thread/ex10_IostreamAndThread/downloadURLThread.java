package ex10_IostreamAndThread;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class downloadURLThread {
    public static void main(String[] args) {
        String urlString = "https://vi.wikipedia.org/wiki/URL";
        File file = new File("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\ex10_IostreamAndThread\\URLsaveFile.txt");


        Thread downloadThread = new Thread(() -> downloadFromURL(urlString, file));
        downloadThread.start();
    }

    private static void downloadFromURL(String urlString, File outputFile) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0"); // Fix lỗi 403

            int responseCode = connection.getResponseCode();
            if (responseCode != 200) {
                System.out.println("Lỗi HTTP: " + responseCode);
                return;
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }

                System.out.println("Tải dữ liệu xong, lưu tại: " + outputFile.getName());

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
