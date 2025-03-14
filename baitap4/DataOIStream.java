package btFile.baitap4;

import java.io.*;

public class DataOIStream {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\baitap4\\File4.txt");

        // Ghi danh sách số nguyên vào file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            int[] numbers = {1,2,3,4,5};
            for (int num : numbers) {
                dos.writeInt(num);
            }
            System.out.println("Ghi dữ liệu vào file thành công!");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }

        // Đọc danh sách số nguyên từ file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            System.out.println("Các số trong file:");
            while (dis.available() > 0) {
                System.out.print(dis.readInt() + " ");
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
