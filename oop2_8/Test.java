package oop2_8;

public class Test {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        System.out.println(c1);

        MyCircle c2 = new MyCircle(5, 6, 10);
        System.out.println(c2);

        MyPoint center = new MyPoint(1, 2);
        MyCircle c3 = new MyCircle(center, 5);
        System.out.println(c3);

        System.out.println("Radius: " + c3.getRadius());
        c3.setRadius(7);
        System.out.println("Updated Radius: " + c3.getRadius());

        System.out.println("Center: " + c3.getCenter());
        c3.setCenter(new MyPoint(3, 4));
        System.out.println("Updated Center: " + c3.getCenter());

        System.out.println("Center X: " + c3.getCenterX());
        System.out.println("Center Y: " + c3.getCenterY());
        c3.setCenterX(8);
        c3.setCenterY(9);
        System.out.println("Updated Center X: " + c3.getCenterX());
        System.out.println("Updated Center Y: " + c3.getCenterY());

        System.out.println("Center XY: " + c3.getCenterXY()[0] + ", " + c3.getCenterXY()[1]);
        c3.setCenterXY(10, 11);
        System.out.println("Updated Center XY: " + c3.getCenterXY()[0] + ", " + c3.getCenterXY()[1]);

        System.out.println("Area: " + c3.getArea());
        System.out.println("Circumference: " + c3.getCircumference());

        System.out.println("Distance to c2: " + c3.distance(c2));
    }
}
