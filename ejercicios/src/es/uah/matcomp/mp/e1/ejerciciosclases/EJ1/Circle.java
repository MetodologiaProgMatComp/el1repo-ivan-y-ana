package es.uah.matcomp.mp.e1.ejerciciosclases.EJ1;

public class Circle {
    private double radius = 1.0;
    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public String toString(){
        return "Circle[radius=" + radius + "]";
        return "radius is: " + radius + "]";

    }
}
