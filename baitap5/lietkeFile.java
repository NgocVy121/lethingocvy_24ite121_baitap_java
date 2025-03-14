package btFile.baitap5;

import java.io.File;

public class lietkeFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\VY\\IdeaProjects\\iostream\\src\\btFile\\baitap1");

        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                System.out.println("Danh sách các file trong thư mục:");
                for (File fileDirectory : files) {
                    System.out.println(fileDirectory.getName());
                }
            } else {
                System.out.println("Thư mục rỗng hoặc không thể truy cập.");
            }
        } else {
            System.out.println("Đường dẫn không phải là thư mục hợp lệ.");
        }
    }
}