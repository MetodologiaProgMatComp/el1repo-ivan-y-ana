package es.uah.matcomp.mp.e1.ejerciciosclases;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Shape;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Circle;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Rectangle;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Square;
public class MainShapeCircleRectangleSquare {
    public static void main(String[] args){
        Shape sh= new Shape("red",true);
        Circle c= new Circle(10, "verde",true);
        Rectangle r= new Rectangle(6,9,"pink",false);
        Square sq= new Square(9, "green", true);
        System.out.println(sh);
        System.out.println(c);
        System.out.println(r);
        System.out.println(sq);
        System.out.println("el color de Shape es:"+sh.getColor());
        System.out.println("Shape is filled?"+sh.isFilled());
        System.out.println("el radio del círculo es:"+c.getRadius());
        System.out.println("el color del radio es:"+c.getColor());
        System.out.println("Circle is filled?"+c.isFilled());
        System.out.println("el área del círculo es:"+c.getArea());
        System.out.println("el perímetro del círculo es:"+c.getPerimeter());
        System.out.println("el ancho del rectángulo es:"+r.getWidth());
        System.out.println("el largo del rectángulo es:"+r.getLength());
        System.out.println("el color del rectángulo es:"+r.getColor());
        System.out.println("Rectangle is filled?"+r.isFilled());
        System.out.println("el área del rectángulo es:"+r.getArea());
        System.out.println("el perímetro del rectángulo es:"+r.getPerimeter());
        System.out.println("el lado del cuadrado es:"+sq.getSide());
        System.out.println("el color del cuadrado es:"+sq.getColor());
        System.out.println("Square is filled?"+sq.isFilled());


    }
}
