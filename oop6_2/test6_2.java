package oop6_2;

public class test6_2 {
    public static void main(String[] args) {
        GeometricObject g1 = new Circle(3.3);
        System.out.println(g1);
        g1.getArea();
        g1.getPerimeter();
        GeometricObject g2 = new Rectangle(2.0,3.0);
        System.out.println(g2);
        g2.getArea();
        g2.getPerimeter();
    }
}
