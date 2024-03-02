package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

public class Circle3 implements GeometricObject2 {
    // Private variable
    protected double radius;
    // Constructor
    public Circle3(double radius){
        this.radius = radius;
    }
    public String toString(){
        return "Circle[radius=" + radius + "]";
    }
    // Implement methods defined in the interface GeometricObject
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
