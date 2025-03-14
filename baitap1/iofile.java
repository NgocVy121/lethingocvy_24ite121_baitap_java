package btFile.baitap1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class iofile {
    public static void main(String[] args) throws IOException {
        File docFile = new File("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\baitap1\\test.txt");
        File ghiFile = new File("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\baitap1\\ghiFile.txt");

        try(
        FileInputStream fileInputStream = new FileInputStream(docFile);
        FileOutputStream fileOutputStream = new FileOutputStream(ghiFile)){

        byte[] buffer = new byte[1024];
        int c = fileInputStream.read();
        while (c != -1) {
            fileOutputStream.write((char) c);
            c = fileInputStream.read();
        }
        fileInputStream.close();
        fileOutputStream.close();

        System.out.println("Ghi vào ghiFile thành công!");

    }catch (IOException e){
        System.out.println("Lỗi ko thể ghi vào ghiFile: "+e.getMessage());
    }
    }
}
