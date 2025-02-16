package oop4_4;

public class Test4_4 {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println(p1);
        Point p2 = new Point(2.4f, 3.4f);
        System.out.println(p2);
        MovablePoint m1 = new MovablePoint();
        System.out.println(m1);
        MovablePoint m2 = new MovablePoint(3.3f, 4.4f);
        System.out.println(m2);
        MovablePoint m3 = new MovablePoint(5.5f, 6.6f, 2.1f, 1.2f);
        System.out.println(m3);
        m3.move();
        System.out.println(m3);
        m3.setSpeed(1.0f, 2.0f);
        System.out.println(m3);
        m3.move();
        System.out.println(m3);
    }
}
