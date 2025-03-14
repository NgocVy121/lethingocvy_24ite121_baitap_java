package btFile.baitap3;

import java.io.*;

public class BT3BufferedReader {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\baitap3\\File3.txt");

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

            int lineCount = 0;

            while (bufferedReader.readLine() != null) {
                lineCount++;
            }

            System.out.println("Số dòng trong file: " + lineCount);
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
