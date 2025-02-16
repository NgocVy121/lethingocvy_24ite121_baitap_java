package oop6_8;

public class MovableCircle  implements Movable {
    MovablePoint center;
    int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint( x , y , xSpeed , ySpeed );
        this.radius=radius;
    }
    public String toString(){
        return super.toString()+", radius="+radius;
    }

    @Override
    public void moveUp() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }
}
