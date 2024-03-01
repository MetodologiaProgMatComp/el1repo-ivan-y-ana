package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

public class Rectangulo implements GeometricObject1 {
    private double width;
    private double length;
    public Rectangulo(double width,double length){
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
