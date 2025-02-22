package oop2_7;

public class Test {
    public static void main(String[] args) {
        MyLine l1 = new MyLine(0, 0, 3, 4);
        System.out.println(l1);

        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(5, 6);
        MyLine l2 = new MyLine(p1, p2);
        System.out.println(l2);

        System.out.println("Begin: " + l2.getBegin());
        System.out.println("End: " + l2.getEnd());

        l2.setBegin(new MyPoint(7, 8));
        l2.setEnd(new MyPoint(9, 10));
        System.out.println("Updated line: " + l2);

        System.out.println("Begin X: " + l2.getBeginX());
        System.out.println("Begin Y: " + l2.getBeginY());
        System.out.println("End X: " + l2.getEndX());
        System.out.println("End Y: " + l2.getEndY());

        l2.setBeginX(11);
        l2.setBeginY(12);
        l2.setEndX(13);
        l2.setEndY(14);
        System.out.println("Updated line: " + l2);

        System.out.println("Begin XY: " + l2.getBeginXY()[0] + ", " + l2.getBeginXY()[1]);
        System.out.println("End XY: " + l2.getEndXY()[0] + ", " + l2.getEndXY()[1]);

        l2.setBeginXY(15, 16);
        l2.setEndXY(17, 18);
        System.out.println("Updated line: " + l2);

        System.out.println("Length: " + l2.getLength());
        System.out.println("Gradient: " + l2.getGradient());
    }
}
