package oop6_3;

public class test6_3 {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(3,4,5,6);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
    }
}
