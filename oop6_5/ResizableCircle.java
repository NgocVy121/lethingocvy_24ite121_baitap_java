package oop6_5;

public class ResizableCircle extends Circle implements Rasizable{


    ResizableCircle(double radius) {
        super(radius);
    }
    public String toString(){
        return "ResizableCircle["+super.toString()+"]";
    }

    @Override
    public void resize(int percent) {
        radius*=percent/100.0;
    }
}
