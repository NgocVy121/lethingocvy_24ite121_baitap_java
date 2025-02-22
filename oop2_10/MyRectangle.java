package oop2_10;
/*  1.class MyRectangle
    - topLeft: MyPoint
    - bottomRight: MyPoint
    + MyRectangle(topLeft: MyPoint, bottomRight: MyPoint)
    + MyRectangle(x1: int, y1: int, x2: int, y2: int)
    + getTopLeft(): MyPoint
    + setTopLeft(topLeft: MyPoint): void
    + getBottomRight(): MyPoint
    + setBottomRight(bottomRight: MyPoint): void
    + getWidth(): int
    + getHeight(): int
    + getArea(): int
    + getPerimeter(): int
    + toString(): String

  2.class MyPoint
    - x: int
    - y: int
    + MyPoint(x: int, y: int)
    + getX(): int
    + getY(): int
    + toString(): String

  **MyRectangle "2" -- "1" MyPoint : contains  */

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    public int getArea() {
        return getWidth() * getHeight();
    }

    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
