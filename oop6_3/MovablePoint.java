package oop6_3;

public class MovablePoint implements Movable{
    int x , y;
    int xSpeed , ySpeed;
    MovablePoint(int x, int y ,int ySpeed, int xSpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString(){
        return "("+x+", "+y+") speed=("+xSpeed+", "+ySpeed+")";
    }
    @Override
    public void moveUp() {
        y-=ySpeed;
    }

    @Override
    public void moveDown() {
        y+=ySpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
    }
}
