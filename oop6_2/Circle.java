package oop6_2;

public class Circle implements GeometricObject{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public String toString(){
        return "Cirle[radius="+radius+"]";
    }


    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
