package oop7_2;
import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points;

    public PolyLine() {
        points = new ArrayList<>();
    }

    public PolyLine(List<Point> points) {
        this.points = new ArrayList<>(points); // Create a copy to avoid external modification
    }

    public void appendPoint(int x, int y) {
        Point newPoint = new Point(x, y);
        points.add(newPoint);
    }

    public void appendPoint(Point point) {
        points.add(point);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Point aPoint : points) {
            sb.append(aPoint.toString());
        }
        sb.append("}");
        return sb.toString();
    }

    public double getLength() {
        double length = 0;
        for (int i = 1; i < points.size(); i++) {
            length += points.get(i - 1).distance(points.get(i));
        }
        return length;
    }
}
