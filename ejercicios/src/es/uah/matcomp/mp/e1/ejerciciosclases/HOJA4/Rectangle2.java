package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

public class Rectangle2 implements GeometricObject1 {
    private double width;
    private double length;

    //Constructor
    public Rectangle2(double width, double length){
        this.width = width;
        this.length = length;
    }
    public String toString(){
        return "Rectangle[width=" + width + ",length=" + length + "]";
    }
    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return 2+(width+length);
    }
}
