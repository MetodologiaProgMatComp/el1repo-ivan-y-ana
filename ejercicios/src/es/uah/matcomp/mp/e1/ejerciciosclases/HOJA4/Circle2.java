package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

public class Circle2 implements GeometricObject1 {
    private double radius;

    //Constructor
    public Circle2(double radius){
        this.radius = radius;
    }
    public String toString(){
        return "Circle[radius=" + radius + "]";
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}
