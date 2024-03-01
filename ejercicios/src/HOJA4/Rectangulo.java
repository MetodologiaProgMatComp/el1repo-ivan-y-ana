package HOJA4;

public class Rectangulo implements GeometricObject{
    private double width;
    private double length;
    public Rectangulo(double width,double length){
        this.width = width;
        this.length = length;
    }
    public String toString(){
        return "Rectangle[width=" + width + ",length=" + length + "]";
    }
}
