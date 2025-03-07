package Bai5_MemoryVisibilityIssue;

public class Visibility_volatile {
    private static volatile boolean flag = false; // Đảm bảo tất cả threads thấy thay đổi ngay lập tức

    public static void main(String[] args) {
        new Thread(() -> {
            while (!flag) {} // Giờ sẽ thấy sự thay đổi của flag
            System.out.println("Flag changed!");
        }).start();

        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        flag = true; // Sẽ được nhìn thấy ngay lập tức bởi các thread khác
    }
}
