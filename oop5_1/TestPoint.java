package oop5_1;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        System.out.println(p1);

        p1.setXY(100, 10);
        System.out.println(p1);

        System.out.println("X: " + p1.getX());
        System.out.println("Y: " + p1.getY());
    }
}
