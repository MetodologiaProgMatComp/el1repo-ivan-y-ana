package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

public class Square extends Rectangle {
    private double side;
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
        this.side=side;
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
        this.side=width;
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
        this.side=length;
    }
    @Override
    public String toString(){
        return "Square["+super.toString()+"]";
    }
}
