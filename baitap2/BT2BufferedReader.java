package btFile.baitap2;

import java.io.*;

public class BT2BufferedReader {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\baitap2\\File2.txt");

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\baitap2\\File2.txt"))){

            System.out.println("Nhập dữ liệu từ bàn phím (nhập 'exit' để kết thúc):");

            String line;
            while (!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            System.out.println("Dữ liệu đã được ghi vào tệp File2.txt");

        } catch (IOException e) {
            System.err.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
}
