package oop6_5;

public class TestResizableCircle {
    public static void main(String[] args) {
        Rasizable rasizable = new ResizableCircle(3.2);
        System.out.println(rasizable);
        rasizable.resize(360);
        System.out.println(rasizable);
    }
}
