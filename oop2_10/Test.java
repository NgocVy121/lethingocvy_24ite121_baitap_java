package oop2_10;

public class Test {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(1, 4);
        MyPoint bottomRight = new MyPoint(5, 1);

        MyRectangle rect1 = new MyRectangle(topLeft, bottomRight);
        System.out.println(rect1);
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        MyRectangle rect2 = new MyRectangle(2, 5, 6, 2);
        System.out.println(rect2);
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());

        rect2.setTopLeft(new MyPoint(3, 6));
        rect2.setBottomRight(new MyPoint(7, 3));
        System.out.println("Updated Rectangle: " + rect2);
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}
