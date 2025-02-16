package oop4_4;

public class MovablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    MovablePoint(float x,float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    MovablePoint( float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    MovablePoint(){
    }
    public float getxSpeed(){
        return xSpeed;
    }
    public void setxSpeed(float xSpeed){
        this.xSpeed=xSpeed;
    }
    public float getySpeed(){
        return ySpeed;
    }
    public void setySpeed(float ySpeed){
        this.ySpeed=ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] result = new float[2];
        result[1]=xSpeed;
        result[2]=ySpeed;
        return result;
    }
    public String toString(){
        return "("+super.toString()+" ,speed="+"("+xSpeed+" ,"+ySpeed+")";
    }
    public MovablePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
}
