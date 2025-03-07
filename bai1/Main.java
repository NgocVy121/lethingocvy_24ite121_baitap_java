package bai1;

public class Main {
    public static void main(String[] args) {
        PrintNumbers printer = new PrintNumbers();

        Thread t1 = new Thread(printer::printOdd);
        Thread t2 = new Thread(printer::printEven);

        t1.start();
        t2.start();
    }
}
