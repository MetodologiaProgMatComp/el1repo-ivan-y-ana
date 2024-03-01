package HOJA4;

import java.util.concurrent.SynchronousQueue;

public class Square extends Rectangle{
    protected double side; //no pone que haga esto
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
        this.side = side;
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
        this.side=side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    @Override
    public String toString(){
        return "Square[" + super.toString() + ",width=" + width + ",length=" + length + "]";
    }
}
