package oop4_5;

public class Test4_5 {
    public static void main(String[] args) {
        Shape s1 = new Shape("red",true);
        System.out.println(s1);
        Rectangle r1 = new Rectangle(3.0, 4.0);
        System.out.println(r1);
        Square q1 = new Square(3.0, "red",true);
        System.out.println(q1);
    }
}
