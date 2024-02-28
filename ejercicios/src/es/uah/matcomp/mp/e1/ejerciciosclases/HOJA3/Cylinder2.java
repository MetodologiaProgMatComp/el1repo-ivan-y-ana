package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

public class Cylinder2 {
    private Circle base;
    private double height;
    public Cylinder2(){
        base=new Circle();
        height=1.0;
    }
    public Cylinder2(double radius,double height){
        base=new Circle(radius);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }
    public double getBaseRadius(){
        return base.getRadius();
    }
    public double getBaseArea(){
        return base.getArea();
    }
    public double getVolume(){
        return base.getArea()*height;
    }
    @Override
    public String toString(){
        return "Cylinder: base radius="+getBaseRadius()+", height="+height+")";
    }
}
