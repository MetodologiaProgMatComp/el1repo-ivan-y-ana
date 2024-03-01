package HOJA4;

public class Circulo implements GeometricObject{
    private double radius;
    public Circulo(double radius){
        this.radius = radius;
    }
    public String toString(){
        return "Circle[radius=" + radius + "]";
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}
