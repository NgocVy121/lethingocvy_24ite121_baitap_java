package oop6_2;

public class Rectangle implements GeometricObject{
    double width;
    double length;
    Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public String toString(){
        return "Rectangle[width="+width+", length="+length+"]";
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }
}
